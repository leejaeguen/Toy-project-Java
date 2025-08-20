package com.worms.stockSimulation.stock.service;

import com.worms.stockSimulation.stock.repository.stockRepository;

public class stockService {
    private final stockRepository sr;
    public stockService() { sr = new stockRepository(); }
}
