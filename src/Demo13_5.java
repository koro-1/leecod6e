public class Demo13_5 { public static void main(String args[])
{
    int i; int f[] = new int[10]; f[0] = 1; f[1] = 1;
    for (i = 2; i < f.length; i++)
        { f[i] = f[i - 1] + f[i - 2]; }
    for (i = 1; i <= f.length; i++)
        { System.out.println(" F[" + i + "]=" + f[i - 1]); } }
}