class Plan {
    String planName;
    double dataLimitGB;

    Plan(String planName, double dataLimitGB) {
        this.planName = planName;
        this.dataLimitGB = dataLimitGB;
    }

    public static void main(String[] args) {
        Plan p = new Plan("5G Premium", 50.0);

        System.out.println("Plan Name: " + p.planName);
        System.out.println("Data Limit: " + p.dataLimitGB + " GB");
    }
}
