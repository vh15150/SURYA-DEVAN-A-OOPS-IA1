abstract class Recharge {
    abstract void processRecharge();
}

class PrepaidRecharge extends Recharge {

    void processRecharge() {
        System.out.println("Prepaid recharge successful.");
    }
}

public class Main {
    public static void main(String[] args) {

        PrepaidRecharge p = new PrepaidRecharge();
        p.processRecharge();
    }
}
