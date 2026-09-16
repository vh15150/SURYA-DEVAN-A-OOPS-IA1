abstract class Recharge {

    abstract void processRecharge();
}

class PrepaidRecharge extends Recharge {

    @Override
    void processRecharge() {
        System.out.println("Prepaid recharge is processed successfully.");
    }

    public static void main(String[] args) {
        PrepaidRecharge recharge = new PrepaidRecharge();
        recharge.processRecharge();
    }
}
