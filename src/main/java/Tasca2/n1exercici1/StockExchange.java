package Tasca2.n1exercici1;

import Tasca2.n1exercici1.observable.StockAgent;
import Tasca2.n1exercici1.observer.StockAgency;

import java.util.HashMap;
import java.util.Map;

public class StockExchange  {

    public void operateStock() {
        StockAgent agent = new StockAgent();

        Map<String, Double> stock = new HashMap<>(Map.of(
                "BBVA", 9.796d,
                "Endesa", 18.165d,
                "Indra", 19.170d,
                "Repsol", 13.635d));

        StockAgency agencyRed = new StockAgency("Red");
        StockAgency agencyBlue = new StockAgency("Blue");
        StockAgency agencyWhite = new StockAgency("White");

        agent.attach(agencyRed);
        agent.attach(agencyBlue);

        // update stock
        agent.setStockInfo(stock);

        agent.attach(agencyWhite);
        agent.detach(agencyRed);

        agent.setStockInfo(stock);
    }


}
