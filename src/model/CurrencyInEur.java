package model;

import controller.APIHandler;
import java.math.BigDecimal;


public class CurrencyInEur extends Currency {

    public CurrencyInEur(String name){
        this.name = name;
        this.baseCurrency = "EUR";
        this.rate = getRate(this.baseCurrency, name);
    }

    private BigDecimal getRate(String baseCurrency, String name){
        APIHandler newRate = new APIHandler();
        return newRate.apiHandler(baseCurrency, name);
    }

}