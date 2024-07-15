package Tasca2.n1exercici1.observable;

import Tasca2.n1exercici1.observer.StockAgencyObserver;

import java.util.Map;

public interface StockAgentObservable {
    void attach(StockAgencyObserver o);
    void detach(StockAgencyObserver o);
    void notifyObservers(Map<String, Double> stockInfo);
}
