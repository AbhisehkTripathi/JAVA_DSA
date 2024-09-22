public class TypeCasting {
    public static void main(String[] args) {
        // Type casting
        int num = (int)(67.56f);
        System.out.println(num);

        // automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a); // 257 % 256 = 1
        System.out.println(b);
        

        byte x = 50;
        byte y = 30;
        byte z = 100;
        int d = x * y / z;
        System.out.println(d);

        int number = 'A';
        System.out.println("नमस्ते");


        byte t = 32;
        char c = 'A';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double result = (f * t) + (i / c) - (d * s);
        System.out.println((f * t) + " " + (i / c) + " " + (d * s));
        System.out.println(result);
    }
}
