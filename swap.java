
public class swap {
    public static void main(String[] args) {
        int a=20;
        int b=10;

        System.out.println("a :"+a+" b "+b);
        swap(a, b);
        System.out.println("a :"+a+" b "+b);
    }
    public static void swap(int x,int y){
        int temp=x;
        x=y;
        y=temp;
        System.out.println("x :"+x+ " y "+y);
    }
}
