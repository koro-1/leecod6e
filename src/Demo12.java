public class Demo12 {
    static void throwProcess() {
        try {
            throw new NullPointerException("空指针异常");
        } catch (NullPointerException e) {
            System.out.println("\n 在 throwProcess 方法中捕获一个" +
                    e.getMessage());
            throw e;
        }
    }
    public static void main(String args[]) {
        try {
            throwProcess();
        } catch (NullPointerException e) {
            System.out.println("再次捕获：" + e);
        }
    }
}
