class Plan {
    String planName;
    double dataLimitGB;

    Plan(String planName, double dataLimitGB) {
        this.planName = planName;
        this.dataLimitGB = dataLimitGB;
    }

    void display() {
        System.out.println("Plan Name: " + planName);
        System.out.println("Data Limit: " + dataLimitGB + " GB");
    }
}

class PostpaidPlan extends Plan {
    String billingCycle;

    PostpaidPlan(String planName, double dataLimitGB, String billingCycle) {
        super(planName, dataLimitGB);
        this.billingCycle = billingCycle;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Billing Cycle: " + billingCycle);
    }
}

public class ProblemA {
    public static void main(String[] args) {
        PostpaidPlan p = new PostpaidPlan(
            "5G Premium", 50.0, "Monthly"
        );
        p.display();
    }
}
