package ex_02_Java_Basic_Part2;

public class Lab014_Variable {

    public static void main(String[]args)
    {
        int x=100;
        int y=21;
        int z=10;

        int max = x>y?(x>z?x:z):y>z?y:z;
        System.out.print(max);

    }
}
