package demo09;

import java.io.File;

public class Demo8 {
    public static void main(String[] args) throws Exception {
        String string = "E:\\易浩宇";
        File file = new File(string);
        if(file.exists()){
            System.out.println("文件存在");
            if(file.isDirectory()){
                String[] list = file.list();
                for (int i = 0; i < list.length; i++) {
                    String string1 = string + File.separator + list[i];
                    File file2 = new File(string1);
                    if(file2.isDirectory()){
                        System.out.println(list[i] + "  文件夹");
                    }else{
                        if(file2.isFile()){
                            System.out.println(list[i] + "  文件");
                        }
                    }

                }
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
