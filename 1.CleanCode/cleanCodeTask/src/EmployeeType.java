enum EmployeeType {
    NORMAL{
        @Override
        public String calculate() {
            return null;
        }
    }, CUSTOM{
        @Override
        public String calculate() {
            return null;
        }
    };
    Integer balance;

    public Integer getBalance() {
        return balance;
    }
    public abstract String calculate();
}
