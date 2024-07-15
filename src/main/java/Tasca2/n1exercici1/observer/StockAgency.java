package Tasca2.n1exercici1.observer;

import java.util.Map;

public class StockAgency implements StockAgencyObserver {

    private String agencyName;

    public StockAgency(String agencyName) {
        this.agencyName = agencyName;
    }

    @Override
    public void update(Map<String, Double> stockInfo) {
        System.out.println("Agency " + agencyName + " has been notified.");

        stockInfo.forEach((key, value) -> System.out.println(key + " " + value));
    }
}