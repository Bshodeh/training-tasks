public class employee {
    EmployeeType type;
    Integer salary;

    Integer getSalary() {
        return salary;
    }

    Integer timeOffBalance() {
        return this.type.getBalance();
    }

    void printBalance() {
        System.out.println(timeOffBalance());
    }
}

