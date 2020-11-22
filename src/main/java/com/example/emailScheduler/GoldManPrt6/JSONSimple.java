package com.example.emailScheduler.GoldManPrt6;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.List;

public class JSONSimple {
    public JSONSimple() throws ParseException {

    }
    public static void main(String[] args) throws ParseException {
//        String jsonString = "[{\"name\" : \"Ronaldo\",\"sport\" : \"soccer\" ,\"age\" : 25,\"id\" : 121,\"lastScores\": [ 2, 1, 3, 5, 0, 0, 1, 1 ] }]";
        List<String> list = new ArrayList<>();
        int i=1;
        String str = "";
        String jsonString="[{\"name\":\"mkyong\", \"age\":38},{\"name\":\"laplap\", \"age\":5}]";
        while (i<jsonString.length()-1){
            while (jsonString.charAt(i) =='}' && jsonString.charAt(i+1) == ','){
                str = str + jsonString.charAt(i);
                list.add(str);
                i = i+2;
                str = "";
            }
            str = str + jsonString.charAt(i);
            i++;
        }
        list.add(str);
        System.out.println(list);
        for (int j= 0;j<list.size();j++){

            JSONParser parser = new JSONParser();
            JSONObject json = (JSONObject) parser.parse(list.get(j));
            System.out.println(list.get(j));
        }
    }
}
