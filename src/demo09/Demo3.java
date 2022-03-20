package demo09;

public class Demo3 implements Runnable {
    @Override
    public void run() {
        System.out.println("线程启动");
    }
    public static void main(String[] args) {
        System.out.println("主函数开始执行");
        Demo3 test = new Demo3();
        Thread thread = new Thread(test);
        thread.start();
        System.out.println("主函数结束执行");
    }
}

