public class Main {
    public static void main(String[] args) {
        bodyIndex();
        taxCalculator();
        getName("John",20);
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
        System.out.println(salaryNet);
    }
}