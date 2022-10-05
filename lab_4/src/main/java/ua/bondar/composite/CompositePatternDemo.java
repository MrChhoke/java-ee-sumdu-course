package ua.bondar.composite;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee boss = new Employee("Vlad", "Directors", 10000, 1);

        Employee deputyBoss1 = new Employee("Petro", "Sales", 1000, boss.getId());
        Employee deputyBoss2 = new Employee("Anna", "Аdvertising ", 1000, boss.getId());

        boss.add(deputyBoss1, deputyBoss2);

        Employee employeeSales1 = new Employee("Franko", "Sales", 800, deputyBoss1.getId());
        Employee employeeSales2 = new Employee("Sasha", "Sales", 200, deputyBoss1.getId());
        Employee employeeSales3 = new Employee("Anatoliy", "Sales", 300, deputyBoss1.getId());
        Employee employeeSales4 = new Employee("Mark", "Sales", 400, deputyBoss1.getId());

        deputyBoss1.add(employeeSales1, employeeSales2, employeeSales3, employeeSales4);

        Employee employeeAdvertising1 = new Employee("Zak", "Advertising", 780, deputyBoss2.getId());
        Employee employeeAdvertising2 = new Employee("Petro", "Advertising", 700, deputyBoss2.getId());
        Employee employeeAdvertising3 = new Employee("Vlad", "Advertising", 60, deputyBoss2.getId());
        Employee employeeAdvertising4 = new Employee("Billy", "Advertising", 700, deputyBoss2.getId());

        deputyBoss2.add(employeeAdvertising1, employeeAdvertising2, employeeAdvertising3, employeeAdvertising4);

        boss.printHierarchicalTree();

        System.out.println("\n\n\n");

        deputyBoss1.printHierarchicalTree();
        boss.remove(deputyBoss1);

        System.out.println("\n\n\n");

        boss.printHierarchicalTree();
    }
}