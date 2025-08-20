package com.worms.stockSimulation.stock.repository;

import com.worms.stockSimulation.stock.aggregate.Stock;

import java.io.*;
import java.util.ArrayList;

public class StockRepository {
    private final ArrayList<Stock> stockList = new ArrayList<>();
    private File file = new File("stock/src/main/java/com/worms/stockSimulation/stock/db/stock.txt");

    public StockRepository() {
        if (!file.exists()) {
            ArrayList<Stock> defaultStockList = new ArrayList<>();
            defaultStockList.add(new Stock("NVDA", 240000, 240000, 240000 ));
            defaultStockList.add(new Stock("LCID", 3000, 3000, 3000 ));
            defaultStockList.add(new Stock("TQQQ", 120000, 120000, 120000 ));
            defaultStockList.add(new Stock("TSLA", 450000, 450000, 450000 ));
            saveStock(defaultStockList);
        }
        loadStocks();
    }

    private void saveStock(ArrayList<Stock> stocks) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));

            for (Stock stock : stocks) {
                oos.writeObject(stock);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (oos != null) oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void loadStocks() {
        try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            while(true){
                stockList.add((Stock) ois.readObject());
            }
        } catch (EOFException e){
            System.out.println("주식 정보 읽어오기 완료");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
