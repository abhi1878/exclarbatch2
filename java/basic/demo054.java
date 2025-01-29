class Class1 {
    float add(float a, float b) {
        return a + b;
    }
    float add(float a, float b, float c) {
        return a + b + c;
    }
}

public class demo054 {
    public static void main(String[] args) {
        Class1 cla = new Class1();
        System.out.println("Sum of two numbers: " + cla.add(4.5f, 10f));
        System.out.println("Sum of three numbers: " + cla.add(1.2f, 2f, 5.5f));
    }
}