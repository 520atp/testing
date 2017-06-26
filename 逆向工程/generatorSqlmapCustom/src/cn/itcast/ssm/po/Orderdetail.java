package cn.itcast.ssm.po;

public class Orderdetail {
    private Integer id;

    private Integer ordersId;

    private Integer iteamId;

    private Integer iteamNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public Integer getIteamId() {
        return iteamId;
    }

    public void setIteamId(Integer iteamId) {
        this.iteamId = iteamId;
    }

    public Integer getIteamNum() {
        return iteamNum;
    }

    public void setIteamNum(Integer iteamNum) {
        this.iteamNum = iteamNum;
    }
}