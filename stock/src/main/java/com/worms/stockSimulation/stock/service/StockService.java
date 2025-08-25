package com.worms.stockSimulation.stock.service;

import com.worms.stockSimulation.stock.aggregate.Stock;
import com.worms.stockSimulation.stock.repository.StockRepository;

import java.util.ArrayList;

public class StockService {
    private final StockRepository sr;
    public StockService() { sr = new StockRepository(); }

    public void findAllStocks() {
        ArrayList<Stock> result = new ArrayList<>();
        result = sr.findAllStocks();
        if (!result.isEmpty()) {
            for (Stock stock : result) {
                System.out.println(stock);
            }
        } else{
            System.out.println("등록된 주식을 찾을 수 없습니다.");
        }
    }

    public Stock findStockForTrading(String stockName) {
        Stock selectedStock = sr.findStockBy(stockName);

        Stock copyStock = null;
        if (selectedStock != null) {
            copyStock = new Stock();
            copyStock.setStockName(selectedStock.getStockName());
            copyStock.setStockPrice(selectedStock.getStockPrice());
            copyStock.setMaxStockPrice(selectedStock.getMaxStockPrice());
            copyStock.setMinStockPrice(selectedStock.getMinStockPrice());
        } else {
            System.out.println("해당 이름의 주식을 찾을 수 없습니다.");
        }
        return copyStock;
    }
}
