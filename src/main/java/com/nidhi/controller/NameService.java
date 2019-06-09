package com.nidhi.controller;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service

public class NameService {

    private static List<Names> namesList = new ArrayList<Names>();

    static{
        namesList.add(new Names("1", "Nidhi", "Mule"));
        namesList.add(new Names("2", "Vivek", "Java"));
        namesList.add(new Names("3", "Vivaan", "Maths"));
        namesList.add(new Names("4", "Nividh", "English"));
    }

    public List<Names> getAllNames() {
        return namesList;
    }

    public void addNames(Names names) {
        System.out.println("Size of list before add = "+namesList.size());
        namesList.add(names);
        System.out.println("Size of list after add = "+namesList.size());
    }

    public String deleteNames(String s){
        Names names = null;
        for(int i=0;i<namesList.size();i++){
            if(namesList.get(i).getName().equals(s)){
                namesList.remove(namesList.get(i));
                break;
            }
        }
        return "deleted";
    }

    public List<Names> updateNames(String s, String id){
        Names names = null;
        for(int i=0;i<namesList.size();i++){
            if(namesList.get(i).getName().equals(s)){
                namesList.get(i).setId(id);
                break;
            }
        }
        return namesList;
    }

    public Names getSingleName(String s) {
        Names names1= null;
        for (int i = 0; i < namesList.size(); i++) {

            if (namesList.get(i).getName().equals(s)) {
               names1 = namesList.get(i);
                break;
            }


        }
        return names1;
    }


}
