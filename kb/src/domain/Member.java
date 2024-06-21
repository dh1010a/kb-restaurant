package domain;

import java.util.List;

public class Member {

    private String memberId;
    private String password;
    private String name;

    private List<Order> orders;
    private List<Receipt> receipts;
}
