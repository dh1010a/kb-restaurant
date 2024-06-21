package domain;

public class Order {
    private long id;
    private long memberId;
    private long[] menuId;
    private int[] amount;

    public Order(long id, long memberId, long[] menuId, int[] amount) {
        this.id = id;
        this.memberId = memberId;
        this.menuId = menuId;
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    public long[] getMenuId() {
        return menuId;
    }

    public void setMenuId(long[] menuId) {
        this.menuId = menuId;
    }

    public int[] getAmount() {
        return amount;
    }

    public void setAmount(int[] amount) {
        this.amount = amount;
    }
}
