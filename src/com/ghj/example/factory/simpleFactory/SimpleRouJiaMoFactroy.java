package com.ghj.example.factory.simpleFactory;

import com.ghj.example.factory.RoujiaMo;
import com.ghj.example.factory.ZLaRoujiaMo;
import com.ghj.example.factory.ZSuanRoujiaMo;
import com.ghj.example.factory.ZTianRoujiaMo;

public class SimpleRouJiaMoFactroy {

    public RoujiaMo createRouJiaMo(String type)
    {
        RoujiaMo rouJiaMo = null;
        if (type.equals("Suan"))
        {
            rouJiaMo = new ZSuanRoujiaMo();

        } else if (type.equals("Tian"))
        {
            rouJiaMo = new ZTianRoujiaMo();
        } else if (type.equals("La"))
        {
            rouJiaMo = new ZLaRoujiaMo();
        }
        return rouJiaMo;
    }
}
