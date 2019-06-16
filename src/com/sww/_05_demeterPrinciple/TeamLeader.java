package com.sww._05_demeterPrinciple;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {

    public void checkoutTeamNumber(){
        List<String> list = new ArrayList<>();
        for (int index = 0;index<20;index++){
            list.add("张三"+index);
        }
        System.out.println(list.size());
    }

}
