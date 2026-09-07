class Employee {

    private String name;
    private double basicSalary;

    Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        return basicSalary;
    }

    double calculateSalary(double bonus) {
        return basicSalary + bonus;
    }

    double calculateSalary(double bonus, double allowance) {
        return basicSalary + bonus + allowance;
    }

    double calculateSalary(double bonus, double allowance, double tax) {
        return basicSalary + bonus + allowance - tax;
    }

    String getName() {
        return name;
    }

    double getBasicSalary() {
        return basicSalary;
    }

    public static void main(String[] args) {

        Employee e = new Employee("Navya Verma", 50000);

        System.out.println("Name : " + e.getName());
        System.out.println("Basic Salary : " + e.getBasicSalary());

        System.out.println();
        System.out.println("Salary (Basic)                : " + e.calculateSalary());
        System.out.println("Salary (Basic + Bonus)        : " + e.calculateSalary(5000));
        System.out.println("Salary (+ Bonus + Allowance)  : " + e.calculateSalary(5000, 5000));
        System.out.println("Final Salary (- Tax)          : " + e.calculateSalary(5000, 5000, 3000));
    }
}
