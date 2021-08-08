public class employee {
    String type;
    Integer salary;

    Integer getSalary() {
        return salary;
    }
    Integer timeOffBalance() {
        if (this.type.equals("NORMAL")) {
            return 200;
            // ....
        } else if (this.type.equals("CUSTOM")) {
            return 300;
            // ....
        }
        // .....
        return 400;
    }
    void printBalance() {
        System.out.println(timeOffBalance());
    }
}
