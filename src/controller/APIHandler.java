package controller;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.CurrencyAPI;

public class APIHandler {

    public static void main(String[] args) {

        CurrencyAPI rawData = new CurrencyAPI();
        String json = rawData.currencyAPI("USD");
        Map<String, String> map = new Gson().fromJson(json, new TypeToken<HashMap<String, Object>>() {}.getType());
        System.out.println(map.get("base"));
    }
}