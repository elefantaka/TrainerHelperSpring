package systemmodel;

import java.util.Date;

public class SingleEntry extends Subscription {

    public static int price = 25;

    public SingleEntry(Client client, Date paymentDate) {
        super(client, paymentDate);
    }
}
