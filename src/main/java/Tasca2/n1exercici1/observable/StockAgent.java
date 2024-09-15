package Tasca2.n1exercici1.observable;

import Tasca2.n1exercici1.observer.StockAgencyObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StockAgent implements StockAgentObservable {

    private final List<StockAgencyObserver> observers;
    private Map<String, Double> stockInfo;

    public StockAgent() {
        this.observers = new ArrayList<>();
    }

    public void setStockInfo(Map<String, Double> stockInfo) {
        this.stockInfo = stockInfo;
        notifyObservers();
    }

    @Override
    public void attach(StockAgencyObserver o) {
        observers.add(o);
    }

    @Override
    public void detach(StockAgencyObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (StockAgencyObserver o : observers) {
            o.update(stockInfo);
        }
    }
}
