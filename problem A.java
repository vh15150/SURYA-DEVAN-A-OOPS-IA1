
class Plan {
    String planName;
    double dataLimitGB;

    // Constructor
    Plan(String planName, double dataLimitGB) {
        this.planName = planName;
        this.dataLimitGB = dataLimitGB;
    }

    // Display method
    void display() {
        System.out.println("Plan Name: " + planName);
        System.out.println("Data Limit: " + dataLimitGB + " GB");
    }
}

// Subclass
class PostpaidPlan extends Plan {
    String billingCycle;

    // Constructor
    PostpaidPlan(String planName, double dataLimitGB, String billingCycle) {
        super(planName, dataLimitGB);
        this.billingCycle = billingCycle;
    }

    // Override display()
    @Override
    void display() {
        System.out.println("Plan Name: " + planName);
        System.out.println("Data Limit: " + dataLimitGB + " GB");
        System.out.println("Billing Cycle: " + billingCycle);
    }
}

public class Main {
    public static void main(String[] args) {

        PostpaidPlan plan = new PostpaidPlan(
            "5G Premium", 50.0, "Monthly"
        );

        plan.display();
    }
}
