package systemmodel;

import java.util.Date;

public class MonthlySubscription extends Subscription {

    public static int price = 125;

    private int year;
    private int month;

    public MonthlySubscription(Client client, Date paymentDate, int year, int month) {
        super(client, paymentDate);
        this.year = year;
        this.month = month;
    }

    @Override
    public String toString() {
        return "MonthlySubscription{" + super.toString() +
                "year=" + year +
                ", month=" + month +
                '}';
    }
}
