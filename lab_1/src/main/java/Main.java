import exception.FieldLengthLimitException;
import exception.IncorrectSalaryException;

public class Main {
    public static void main(String[] args) throws Exception {
        Employee vlad_employee = new Employee("Vlad", "Bonda", 1000);
        System.out.println(vlad_employee);
        Employee vlad2_employee = new Employee("Vlad2", "Bonda", 1000);
        System.out.println(vlad2_employee);
        Employee vlad3_employee = new Employee("Vlad3", "Bonda", 1000);
        System.out.println(vlad3_employee);

        try {
            Employee vladyslav_employee = new Employee("Vladyslav", "Bondar", 2000);
        }catch (FieldLengthLimitException exp){
            exp.printStackTrace();
        }

        try{
            Employee petro_employee = new Employee("Petro", "Bonda", -10);
        }catch (IncorrectSalaryException exp){
            exp.printStackTrace();
        }
    }
}
