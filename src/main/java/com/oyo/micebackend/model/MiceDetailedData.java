package com.oyo.micebackend.model;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Repository;

import java.io.FileReader;

@Repository
public class MiceDetailedData {
    public JSONObject getMiceDetails(String miceId) {
        JSONParser parser = new JSONParser();
        JSONObject data = null;
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            JSONObject a = (JSONObject) parser.parse(new FileReader(classLoader.getResource("data/micePropertyDetails.json").getFile()));
            data = (JSONObject) a.get("data");
            System.out.println(a.size());
            System.out.println(a);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
        return data;
    }
}
