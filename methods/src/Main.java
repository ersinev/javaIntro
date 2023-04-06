public class Main {
    public static void main(String[] args) {
        bodyIndex();
        taxCalculator();
        getName("John");
    }

    public static void getName(String name){
        System.out.println("Welcome " + name);
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