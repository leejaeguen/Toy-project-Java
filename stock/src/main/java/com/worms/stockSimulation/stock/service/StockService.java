package com.worms.stockSimulation.stock.service;

import com.worms.stockSimulation.stock.repository.StockRepository;

public class StockService {
    private final StockRepository sr;
    public StockService() { sr = new StockRepository(); }
}
