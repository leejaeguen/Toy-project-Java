package com.worms.stockSimulation.stock.aggregate;

import java.io.Serializable;

public class Stock implements Serializable {
    private static final long serialVersionUID = 1L;

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
        return
                "주식이름='" + stockName + '\'' +
                ", 주식가격=" + stockPrice +
                ", 최소매도가격=" + minStockPrice +
                ", 최대매수가격=" + maxStockPrice;
    }
}
