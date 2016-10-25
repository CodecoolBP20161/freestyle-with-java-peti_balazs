package model;

import java.math.BigDecimal;

/**
 * Created by csyk on 2016.10.24..
 */
public class CurrencyInUsd extends Currency {

    public CurrencyInUsd(String name, String baseCurrency, BigDecimal rate){
        this.name = name;
        this.baseCurrency = baseCurrency;
        this.rate = rate;
    }
}