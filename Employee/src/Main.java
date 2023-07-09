
public class Main {
    public static void main(String[] args) {

        Employee main= new Employee("melih üstün",10000,42,1998);
        main.tax();
        main.bonus();
        main.raiseSalary();

        System.out.println(main.toString());


    }
}