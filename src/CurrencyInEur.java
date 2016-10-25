import java.math.BigDecimal;

/**
 * Created by csyk on 2016.10.24..
 */
public class CurrencyInEur extends Currency {

    public CurrencyInEur (String name, String baseCurrency, BigDecimal rate){
        this.name = name;
        this.baseCurrency = baseCurrency;
        this.rate = rate;
    }
}
