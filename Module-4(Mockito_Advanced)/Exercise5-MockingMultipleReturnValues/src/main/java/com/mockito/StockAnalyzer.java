package com.mockito;

public class StockAnalyzer {

    private StockService stockService;

    public StockAnalyzer(StockService stockService) {
        this.stockService = stockService;
    }

    public int getLatestPrice() {
        return stockService.getStockPrice();
    }

}