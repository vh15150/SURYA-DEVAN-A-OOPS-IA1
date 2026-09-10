abstract class Recharge {
    abstract void processRecharge();
}

class PrepaidRecharge extends Recharge {
    @Override
    void processRecharge() {
        System.out.println("Prepaid recharge processed successfully.");
    }
}

public class ProblemB {
    public static void main(String[] args) {
        PrepaidRecharge p = new PrepaidRecharge();
        p.processRecharge();
    }
}
