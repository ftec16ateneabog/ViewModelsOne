package com.atenea.firstviewmodel;

import androidx.lifecycle.ViewModel;

import java.util.HashMap;

public class MyViewModelHash extends ViewModel {
    private HashMap<String,String> hashMap;

    public MyViewModelHash()
    {
        hashMap = new HashMap<>();
    }
    public void addItem(String key,String value)
    {
        hashMap.put(key,value);
    }
    public String getValue(String key)
    {
        return hashMap.get(key);
    }

}
