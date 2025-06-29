package ex_067_Ternery_Operator;

public class Lab067_NestedTernery{

    public static void main(String[]args)
    {
        int x=100;
        int y=21;
        int z=10;

        int max = x>y?(x>z?x:z):y>z?y:z;
        System.out.print(max);
    }
}
