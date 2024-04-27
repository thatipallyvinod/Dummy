public class Test {
    interface FuncInter1 {
        int operation(int a, int b);
    }

    public static void main(String[] args) {
        FuncInter1 add = (int x, int y) -> x + y;
        FuncInter1 multiply = (int x, int y) -> x * y;

        System.out.println("Addition is " + add.operation(6, 3));
        System.out.println("Multiplication is " + multiply.operation(6, 3));
    }
}
