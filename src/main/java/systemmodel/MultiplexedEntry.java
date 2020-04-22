package systemmodel;

import java.util.Date;

public class MultiplexedEntry extends Subscription {

    public static int price = 15;

    private int numberOfEntries;
    private int remainedEntries;


    public MultiplexedEntry(Client client, Date paymentDate, int numberOfEntries) {
        super(client, paymentDate);
        this.numberOfEntries = numberOfEntries;
        this.remainedEntries = numberOfEntries;
    }

    public int howManyToPay(){
        int payment = numberOfEntries*price;
        return payment;
    }

    public void decreaseEntry(){
        remainedEntries--;
    }

    public boolean isActive(){
        if(remainedEntries == 0){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public String toString() {
        return "MultiplexedEntry{" +
                "numberOfEntries=" + numberOfEntries + "remainEntries" + remainedEntries +
                '}';
    }
}
