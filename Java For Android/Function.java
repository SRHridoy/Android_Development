public class Function {
    public static double average(int a, int b, int c){
        return (a+b+c)/3.0;
    }
    public static void main(String[] args) {
        System.out.println(average(44, 44, 44));
        ClassEx1 c = new ClassEx1();
        c.method1();
        ClassEx2 c1 = new ClassEx2();
        c1.method1();
        c1.method2();  
    }
}
