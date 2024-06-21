package domain;

import java.util.ArrayList;
import java.util.List;

public class Member {

    private final String memberId;
    private final String password;
    private final String name;

    private List<Order> orders;
    private List<Receipt> receipts;

    public Member(String memberId, String password, String name) {
        this.memberId = memberId;
        this.password = password;
        this.name = name;
        orders = new ArrayList<>();
        receipts = new ArrayList<>();
    }

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public List<Receipt> getReceipts() {
        return receipts;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void addReceipt(Receipt receipt) {
        receipts.add(receipt);
    }
}
