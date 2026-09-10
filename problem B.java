abstract class Recharge {
    abstract void processRecharge();
}

class PrepaidRecharge extends Recharge {

    @Override
    void processRecharge() {
        System.out.println("Prepaid recharge processed successfully.");
    }

    public static void main(String[] args) {
        PrepaidRecharge obj = new PrepaidRecharge();
        obj.processRecharge();
    }
}
