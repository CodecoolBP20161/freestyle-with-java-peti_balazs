package model;

import controller.APIHandler;
import java.math.BigDecimal;


public class CurrencyInUsd extends Currency {

    public CurrencyInUsd(String name){
        this.name = name;
        this.baseCurrency = "USD";
        this.rate = getRate(this.baseCurrency, name);
    }

    private BigDecimal getRate(String baseCurrency, String name){
        APIHandler newRate = new APIHandler();
        return newRate.apiHandler(baseCurrency, name);
    }

}
