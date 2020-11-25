package sample;

import java.util.ArrayList;

public class CurrencyConverter {
    public ArrayList<Currency> getCurrencies() {
        return currencies;
    }

    private ArrayList<Currency> currencies = new ArrayList<Currency>();

    public CurrencyConverter(){
        currencies.add(new Currency("Yen", 124.15));
        currencies.add(new Currency("USD", 1.19));
        currencies.add(new Currency("Pfund", 0.8925));
    }
}
