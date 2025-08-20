package com.worms.stockSimulation.stock.aggregate;

public class Stock {
    private String stockName;
    private int stockPrice;
    private int minStockPrice;
    private int maxStockPrice;

    public Stock(){
    }

    public Stock(String stockName, int stockPrice, int minStockPrice, int maxStockPrice) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        this.minStockPrice = minStockPrice;
        this.maxStockPrice = maxStockPrice;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(int stockPrice) {
        this.stockPrice = stockPrice;
    }

    public int getMinStockPrice() {
        return minStockPrice;
    }

    public void setMinStockPrice(int minStockPrice) {
        this.minStockPrice = minStockPrice;
    }

    public int getMaxStockPrice() {
        return maxStockPrice;
    }

    public void setMaxStockPrice(int maxStockPrice) {
        this.maxStockPrice = maxStockPrice;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stockName='" + stockName + '\'' +
                ", stockPrice=" + stockPrice +
                ", minStockPrice=" + minStockPrice +
                ", maxStockPrice=" + maxStockPrice +
                '}';
    }
}
