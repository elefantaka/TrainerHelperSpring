package systemmodel;

import java.util.Date;

public class Subscription {

    protected Client client;
    protected Date paymentDate;

    public Subscription(Client client, Date paymentDate) {
        this.client = client;
        this.paymentDate = paymentDate;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "client=" + client +
                ", paymentDate=" + paymentDate +
                '}';
    }
}
