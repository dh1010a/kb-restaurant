package domain;

public class Order {
    private long id;
    private long memberId;
    private Map<Menu, Integer> list;

    public Order(long id, long memberId, Map<Menu, Integer> list) {
        this.id = id;
        this.memberId = memberId;
        this.list = list;
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

    public Map<Menu, Integer> getList() {
        return list;
    }

    public void setList(Map<Menu, Integer> list) {
        this.list = list;
    }
}
