package controller;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.HashMap;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.CurrencyAPI;


public class APIHandler {

    public BigDecimal apiHandler(String baseCurrency, String currency) {

                // Protected code
                CurrencyAPI rawData = new CurrencyAPI();
                String json = rawData.currencyAPI(baseCurrency);
                Map<String, HashMap<String, Double>> outerMap =
                        new Gson().fromJson(json, new TypeToken<HashMap<String, Object>>() {
                }.getType());
                Map<String, Double> map = outerMap.get("rates");
                Double rateDouble = map.get(currency);
                return new BigDecimal(rateDouble, MathContext.DECIMAL32);
    }
}