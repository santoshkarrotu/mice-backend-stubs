package com.oyo.micebackend.model;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Repository;

import java.io.FileReader;

@Repository
public class CmsData {

    public JSONObject getCMSdata(String keyId) {
        JSONParser parser = new JSONParser();
        try {
            System.out.println("This is in getCMSData");
//            ClassLoader classLoader = getClass().getClassLoader();

            JSONArray a = (JSONArray) parser.parse(new FileReader("/Users/santosh/oyo/mice-backend-stubs/src/main/resources/data/cmsData.json"));

            System.out.println("Array Size "+ a.size());
            for (Object o : a)
            {
                JSONObject cms_data = (JSONObject) o;
                JSONObject data = (JSONObject) cms_data.get("data");
                String cmsId = (String)data.get("cmsId");
                if (cmsId.equals(keyId)) {
                    System.out.println("Found cmsId: " + cmsId);
                    return data;
                }
            }
            System.out.println("No data found for given cmsId");
        }
        catch(Exception e) {
            e.printStackTrace();
//            System.out.println(e.getMessage());
        }
        return new JSONObject();
    }
}
