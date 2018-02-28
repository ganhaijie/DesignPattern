package com.ghj.example.factory.factoryMethod;

import com.ghj.example.factory.RoujiaMo;
import com.ghj.example.factory.ZLaRoujiaMo;
import com.ghj.example.factory.ZSuanRoujiaMo;
import com.ghj.example.factory.ZTianRoujiaMo;

public class XianRouJiaMoStore extends RoujiaMoStore {

    @Override
    public RoujiaMo createRouJiaMo(String type) {
        RoujiaMo roujiaMo = null;

        if(type.equals("Suan")){
            roujiaMo = new ZSuanRoujiaMo();
        } else if (type.equals("Tian"))
        {
            roujiaMo = new ZTianRoujiaMo();
        } else if (type.equals("La"))
        {
            roujiaMo = new ZLaRoujiaMo();
        }
        return roujiaMo;
    }
}
