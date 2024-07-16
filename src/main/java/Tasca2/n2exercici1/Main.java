package Tasca2.n2exercici1;

import Tasca2.n2exercici1.shoeStore.Shoe;
import Tasca2.n2exercici1.shoeStore.ShoeStore;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shoe> shoesToBuy
                = Stream.of(new Shoe(17.30d), new Shoe(29.95d), new Shoe(84.95d))
                .collect(Collectors.toCollection(
                        ArrayList::new));

        ShoeStore store = new ShoeStore();
        store.makePurchase(shoesToBuy);
    }
}
