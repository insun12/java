package a6_array;

public class MyClass {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2,3);
        double area = r.getArea();
        System.out.println("면적은" + area); // 6
        double Perimeter = r.getPerimeter();
        System.out.println("둘레는" + Perimeter); // 10

        // 크기 재설정
//        double [] array = new double[2];
//        array[0] = 4;
//        array[1] = 5;
//        r.resize(array);
//        double[] array2 = new double[] {4,5};  이렇게도 가능!

        r.resize(new double[] {4,5});
        area = r.getArea();
        System.out.println("면적은" + area); // 20
        Perimeter = r.getPerimeter();
        System.out.println("둘레는" + Perimeter); // 18
    }
}
