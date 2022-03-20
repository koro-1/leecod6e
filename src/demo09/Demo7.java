package demo09;

import java.io.File;

public class Demo7 {
    public static void main(String[] args) throws Exception {
        String string = "E:\\易浩宇" ;
        File file = new File(string);
        if(file.exists()){
            System.out.println("文件存在");
            if(file.isDirectory()){
                System.out.println("是文件夹");
            }else{
                if (file.isFile()) {
                    System.out.println("是文件");
                }
            }
        }else{
            System.out.println("文件不存在");
            file.mkdir();
        }
    }
}

