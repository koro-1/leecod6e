package shiyan.yhy;


import java.util.Scanner;


public class Main {
    static String[] bin = {"0000", "0001", "0010", "0011", "0100", "0101",
            "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101",
            "1110", "1111"};
    static String[] oct = {"0", "1", "2", "3", "4", "5", "6", "7"};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  //输入n个16进制的数
        String[] st = new String[n];  //用一个字符串数组储存16进制数
        for (int i = 0; i < n; i++) {
            st[i] = in.next();
        }
        in.close();  //输入完后关闭

        //用一个循环将n个十六进制转变成八进制
        for (int i = 0; i < n; i++) {
            String BinResult = hexToBin(st[i]).toString();//十六转二
            String OctResult = BinToOtc(BinResult).toString();//二转八
            if(OctResult.startsWith("0")){
                OctResult = OctResult.substring(1,OctResult.length());
            }
            if(OctResult.startsWith("0")) {
                OctResult = OctResult.substring(1);
            }
            //substring(int beginIndex)返回一个新的字符串，它是此字符串的一个子字符串。
            //该子字符串从指定索引处的字符开始，直到此字符串末尾。
            System.out.println(OctResult);
        }

    }


    /*
    将十六进制转变成二进制
     */
    public static StringBuilder hexToBin(String string) {
        int start = 0;
        int end = 1;
        int len = string.length();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < len; i++) {
            String str = string.substring(start, end);
            start++;
            end++;
            String s = ""; //  用一个字符串接受转变的二进制
            switch (str) {
                case "0":
                    s = bin[0];
                    break;
                case "1":
                    s = bin[1];
                    break;
                case "2":
                    s = bin[2];
                    break;
                case "3":
                    s = bin[3];
                    break;
                case "4":
                    s = bin[4];
                    break;
                case "5":
                    s = bin[5];
                    break;
                case "6":
                    s = bin[6];
                    break;
                case "7":
                    s = bin[7];
                    break;
                case "8":
                    s = bin[8];
                    break;
                case "9":
                    s = bin[9];
                    break;
                case "A":
                    s = bin[10];
                    break;
                case "B":
                    s = bin[11];
                    break;
                case "C":
                    s = bin[12];
                    break;
                case "D":
                    s = bin[13];
                    break;
                case "E":
                    s = bin[14];
                    break;
                case "F":
                    s = bin[15];
                    break;
                default:
                    break;
            }
            result.append(s);
        }
        return result;
    }

    /*
    将二进制转变成八进制
     */
    public static StringBuilder BinToOtc(String string) {
        int len = string.length();
        int start = 0;
        int end = 3;
        /*
        注意二进制转八进制是三位转
         */
        if (len % 3 == 1) {   //
            string = "00" + string;
        } else if (len % 3 == 2) {
            string = "0" + string;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < len / 3; i++) {
            String sub = string.substring(start, end); //提出一个二进制数来
            start += 3;
            end += 3;
            String s = "";
            switch (sub) {
                case "000":
                    s = oct[0];
                    break;
                case "001":
                    s = oct[1];
                    break;
                case "010":
                    s = oct[2];
                    break;
                case "011":
                    s = oct[3];
                    break;
                case "100":
                    s = oct[4];
                    break;
                case "101":
                    s = oct[5];
                    break;
                case "110":
                    s = oct[6];
                    break;
                case "111":
                    s = oct[7];
                    break;
                default:break;
            } //一一对应转换
            result.append(s);
        }
        return result;
    }
}

