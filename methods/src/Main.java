public class Main {
    public static void main(String[] args) {
        bodyIndex();
        taxCalculator();
        getName("John",20);
        int myNum = plusMethodInt(8, 5);
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        double myNum3 = plusMethodDouble(5.3, 6.66);
    }

    public static void getName(String name, int age){
        System.out.println("Welcome " + name + " age: "+ age);
    }
    public static void bodyIndex(){
        int weight = 60;
        double height = 1.8;
        double Index = weight/(height*height);
        System.out.println(Index);

    }

    public static void taxCalculator(){
        double salaryBrut = 2500;
        double tax = 18;
        double salaryNet = salaryBrut-(salaryBrut*tax)/100;
//        System.out.println(salaryNet);
    }
    static int plusMethodInt(int x, int y) {
        return x + y;
    }
    static double plusMethodDouble(double x, double y) {
        return x + y;
    }



}