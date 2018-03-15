//package com.example.cms.model;
//
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.springframework.stereotype.Repository;
//
//import java.io.FileReader;
//
//@Repository
//public class PackageDetailsData {
//    public JSONObject getCMSdata(String keyId) {
//        JSONParser parser = new JSONParser();
//        try {
//            ClassLoader classLoader = getClass().getClassLoader();
//            JSONArray a = (JSONArray) parser.parse(new FileReader(classLoader.getResource("data/package_data.json").getFile()));
//            for (Object o : a)
//            {
//                JSONObject package_data = (JSONObject) o;
//
//                JSONObject data = (JSONObject) package_data.get("data");
////                String cmsId = (String)data.get("cmsId");
////                if (cmsId.equals(keyId)) {
////                    System.out.println("Found cmsId: " + cmsId);
////                    return data;
////                }
//            }
//            System.out.println("No data found for given cmsId");
//
//        } catch(Exception e) {
//            System.out.println(e.getMessage());
//        }
//        return new JSONObject();
//    }
//
//}
