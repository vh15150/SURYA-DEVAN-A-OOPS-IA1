class Plan {
    String name;
    double data;

    Plan(String name, double data) {
        this.name = name;
        this.data = data;
    }

    void show() {
        System.out.println("Plan: " + name);
        System.out.println("Data: " + data + " GB");
    }
}

class PostpaidPlan extends Plan {

    PostpaidPlan(String name, double data) {
        super(name, data);
    }

    void show() {
        super.show();
        System.out.println("Billing: Monthly");
    }
}

public class Main {
    public static void main(String[] args) {

        PostpaidPlan p = new PostpaidPlan("5G Premium", 50);
        p.show();
    }
}
