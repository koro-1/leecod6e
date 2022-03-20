import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

public abstract class TCPClient {

    private String ip;
    private int port;

    private Socket mSocket;
    private SocketAddress mSocketAddress;
    private OutputStream mOutputStream;
    private InputStream mInputStream;
    private ReadThread mReadThread;
    private boolean _isConnected = false;


    public TCPClient(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }


    public void connect() {

        try {
            this.mSocket = new Socket();
            this.mSocket.setKeepAlive(true);
            this.mSocketAddress = new InetSocketAddress(ip, port);
            this.mSocket.connect( mSocketAddress, 3000);// 设置连接超时时间为3秒

            this.mOutputStream = mSocket.getOutputStream();
            this.mInputStream = mSocket.getInputStream();

            this.mReadThread = new TCPClient.ReadThread();
            this.mReadThread.start();
            this._isConnected = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close() {

        if (this.mReadThread != null) {
            this.mReadThread.interrupt();
        }
        if (this.mSocket != null) {
            try {
                this.mSocket.close();
                this.mSocket = null;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        this._isConnected = false;
    }

    public boolean isConnected() {
        return this._isConnected;
    }


    public void send(byte[] bOutArray) {
        try {
            this.mOutputStream.write(bOutArray);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected abstract void onDataReceive(byte[] bytes, int size);

    private class ReadThread extends Thread {
        @Override
        public void run() {
            super.run();
            while (!isInterrupted()) {
                try {
                    if (TCPClient.this.mInputStream == null) {
                        return;
                    }
                    int available = TCPClient.this.mInputStream.available();
                    if (available > 0) {
                        byte[] buffer = new byte[available];
                        int size = TCPClient.this.mInputStream.read(buffer);
                        if (size > 0) {
                            onDataReceive(buffer, size);
                        }
                    } else {
                        Thread.sleep(50);
                    }


                } catch (Throwable e) {
                    System.out.println(e.getMessage());
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        TCPClient tcpClient;
        tcpClient = new TCPClient("192.168.1.105", 8080) {
            @Override
            protected void onDataReceive(byte[] bytes, int size) {
                String content = "TCPServer say :" + new String(bytes, 0, size);
                System.out.println(content);
            }
        };
        tcpClient.connect();//连接TCPServer
        if (tcpClient.isConnected()) {
            //发送数据
            String outContent = "TCPClient say hello";
            tcpClient.send(outContent.getBytes());
        }


        //关闭连接
        tcpClient.close();

    }
}

