package stock.aggregate;

import java.util.Arrays;

public class User {
    private String id;
    private int holdingMoney;
    private String[] holdingStock;
    private String[] stockInTrading;

    public User(){
    }

    public User(String id, int holdingMoney, String[] holdingStock, String[] stockInTrading) {
        this.id = id;
        this.holdingMoney = holdingMoney;
        this.holdingStock = holdingStock;
        this.stockInTrading = stockInTrading;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getHoldingMoney() {
        return holdingMoney;
    }

    public void setHoldingMoney(int holdingMoney) {
        this.holdingMoney = holdingMoney;
    }

    public String[] getHoldingStock() {
        return holdingStock;
    }

    public void setHoldingStock(String[] holdingStock) {
        this.holdingStock = holdingStock;
    }

    public String[] getStockInTrading() {
        return stockInTrading;
    }

    public void setStockInTrading(String[] stockInTrading) {
        this.stockInTrading = stockInTrading;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", holdingMoney=" + holdingMoney +
                ", holdingStock=" + Arrays.toString(holdingStock) +
                ", stockInTrading=" + Arrays.toString(stockInTrading) +
                '}';
    }
}
