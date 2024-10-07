package TinkoffTest;

public class PhoneService {
    private int internetTraffic;
    private int subscriptionFee;
    private int overpayment;
    private int costPlan;

    public PhoneService(int internetTraffic, int subscriptionFee, int overpayment, int costPlan) {
        this.internetTraffic = internetTraffic;
        this.subscriptionFee = subscriptionFee;
        this.overpayment = overpayment;
        this.costPlan = costPlan;
    }

    public void totalCost(){
        if (costPlan > internetTraffic){
            System.out.println(subscriptionFee + ((costPlan - internetTraffic) * overpayment));
        }else {
            System.out.println(subscriptionFee);
        };
    }

    public int getInternetTraffic() {
        return internetTraffic;
    }

    public void setInternetTraffic(int internetTraffic) {
        this.internetTraffic = internetTraffic;
    }

    public int getSubscriptionFee() {
        return subscriptionFee;
    }

    public void setSubscriptionFee(int subscriptionFee) {
        this.subscriptionFee = subscriptionFee;
    }

    public int getOverpayment() {
        return overpayment;
    }

    public void setOverpayment(int overpayment) {
        this.overpayment = overpayment;
    }

    public int getCostPlan() {
        return costPlan;
    }

    public void setCostPlan(int costPlan) {
        this.costPlan = costPlan;
    }
}
