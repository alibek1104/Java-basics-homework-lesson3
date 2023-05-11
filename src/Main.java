public class Main {
    public static void main(String[] args) {

        /* Создайте переменную с именем flowersName и присвойте ей значение Roses.
        Создайте переменную с именем flowersNumber и присвойте ей значение 101.
        Выведите значения переменных flowersName и flowersNumber в консоль. */
        String flowersName = "Roses";
        int flowersNumber = 101;
        System.out.println(flowersName);
        System.out.println(flowersNumber);

        /* Выведите на экран сумму 15 + 10, используя две переменные: a и b.
        Создайте переменную c, присвойте ей a + b и выведите результат. */

        int a = 15;
        int b = 10;
        System.out.println(a + b);

        int c = a + b;
        System.out.println(a + b + c);

        /* Создайте три переменные одного типа, используя список, разделенный запятыми,
        и присвойте им разными значения. Выведите сумму трех переменных в консоль. */

        int d = 1, e = 2, f = 3;
        System.out.println(d + e + f);

        /* Создайте четыре переменных одного типа, используя список, разделенный запятыми,
        и присвойте им одно значение. Выведите сумму четырех переменных в консоль. */

        double d1 = 1.2, d2 = 23.4, d3 = 12.4, d4 = 33.4543;
        System.out.println(d1 + d2 + d3 + d4);

        /* Объявите переменную типа double, но не инициализируйте ее. Присвойте ей значение позже.
        Перезапишите существующее значение переменной. */

        double myDoubleNum;
        myDoubleNum = 23.21;
        System.out.println(myDoubleNum);
        myDoubleNum = 23.22;
        System.out.println(myDoubleNum);

        /* Создайте константы со значениями числа PI, ускорения свободного падения,
        наименования родного города. */

        //не уверен по поводу этого задания
        final double PI = 3.14;
        final double freeFall = 9.81;
        final String nameHomecity = "Almaty";
        System.out.println(PI);
        System.out.println(freeFall);
        System.out.println(nameHomecity);

        /*Приведите пример расширяющего приведения  */

        byte B = 127;
        int I = B;

        System.out.println(I);

        /* Приведите пример сужающего приведения */

        double D = 2.44;
        int D1 = (int)D;

        System.out.println(D1);









    }
}