package com.ghj.example.factory.simpleFactory;

import com.ghj.example.factory.RoujiaMo;
import com.ghj.example.factory.ZLaRoujiaMo;
import com.ghj.example.factory.ZSuanRoujiaMo;
import com.ghj.example.factory.ZTianRoujiaMo;

import java.text.SimpleDateFormat;

/**
 * 简单工厂模式
 */
public class RouJiaMoStore {

  /*  public RoujiaMo sellRouJiaMo(String type){
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

        roujiaMo.prepare();
        roujiaMo.fire();
        roujiaMo.pack();
        return roujiaMo;
    }
    //存在的问题  生产馍得种类和RouJiaMoStore耦合度太高了 增加和删除 都得修改sellRouJiaMo
    */


  private SimpleRouJiaMoFactroy factroy;

  public RouJiaMoStore(SimpleRouJiaMoFactroy factroy){
      this.factroy=factroy;
  }
    public RoujiaMo sellRouJiaMo(String type)
    {
        RoujiaMo RoujiaMo = factroy.createRouJiaMo(type);
        RoujiaMo.prepare();
        RoujiaMo.fire();
        RoujiaMo.pack();
        return RoujiaMo;
    }


}


