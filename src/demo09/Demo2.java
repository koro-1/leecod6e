package demo09;

public class Demo2 extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("线程启动");
    }
    public static void main(String[] args) {
        System.out.println("主函数开始执行");
        Demo2 test = new Demo2();
        test.start();
        System.out.println("主函数结束执行");
    }
}

