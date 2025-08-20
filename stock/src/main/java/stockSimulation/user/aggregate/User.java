package stockSimulation.user.aggregate;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String id;
    private int holdingMoney;
    private List<String> holdingStock = new ArrayList<>();
    private List<String> stockInTrading = new ArrayList<>();

    public User(){
    }
    public User(String id, int holdingMoney, List<String> holdingStock, List<String> stockInTrading){
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

    public List<String> getStockInTrading() {
        return stockInTrading;
    }

    public void setStockInTrading(List<String> stockInTrading) {
        this.stockInTrading = stockInTrading;
    }

    public List<String> getHoldingStock() {
        return holdingStock;
    }

    public void setHoldingStock(List<String> holdingStock) {
        this.holdingStock = holdingStock;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", holdingMoney=" + holdingMoney +
                ", holdingStock=" + holdingStock +
                ", stockInTrading=" + stockInTrading +
                '}';
    }
}
