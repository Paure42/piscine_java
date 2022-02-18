package transaction;
import java.util.UUID;

import user.User;
public class Transaction {

    public Transaction(UUID identifier,
                       User recipient,
                       User sender,
                       int transfer_amount) {
        _identifier = identifier;
        _recipient = recipient;
        _sender = sender;
        _transfer_amount = transfer_amount;
    }


    public void do_tranfer() {
        if ((_sender.get_balance() - _transfer_amount) >= 0)
            {
                _recipient.set_balance(_recipient.get_balance() + _transfer_amount);
                _sender.set_balance(_sender.get_balance() - _transfer_amount);
                System.out.println("Transfer done");
            }
        else
            System.err.println("Transfer invalid");
    }

    private UUID _identifier;
    private User _recipient;
    private User _sender;
    private int _transfer_amount;
    public enum TRANSFER_CATEGORY {
        DEBITS, CREDITS
    }
}
