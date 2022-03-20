package demo09;

import java.io.File;
import java.io.FileOutputStream;

public class Demo9 {
    public static void main(String[] args) throws Exception {
        String string = "D:\\百度网盘\\BaiduNetdisk\\1.txt";
        FileOutputStream fileOutputStream = new FileOutputStream(string);
        fileOutputStream.write('a');

    }
}

