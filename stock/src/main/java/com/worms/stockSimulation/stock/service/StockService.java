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
}
