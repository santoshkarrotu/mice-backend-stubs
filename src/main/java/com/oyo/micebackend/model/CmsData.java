package com.oyo.micebackend.model;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.util.List;

@Repository
public class CmsData {

    public JSONObject getCMSdata(String keyId) {
        JSONParser parser = new JSONParser();
        try {
            System.out.println("This is in getCMSData");
//            ClassLoader classLoader = getClass().getClassLoader();
            File file = getResourceAsFile("/data/cmsData.json");

            JSONArray a = (JSONArray) parser.parse(new FileReader(file));

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

    public JSONObject getStandardDetails(List<String> catalogIds) {
        JSONParser parser = new JSONParser();
        try {
            System.out.println("This is in getStandardDetails method");
            File file = getResourceAsFile("/data/standardDetailsCms.json");
            JSONObject a = (JSONObject) parser.parse(new FileReader(file));
            System.out.println(a.keySet());
            return a;
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new JSONObject();
    }

    private File getResourceAsFile(String resourcePath) {
        try {
            InputStream in = getClass().getResourceAsStream(resourcePath);
            if (in == null) {
                return null;
            }

            File tempFile = File.createTempFile(String.valueOf(in.hashCode()), ".json");
            tempFile.deleteOnExit();

            try (FileOutputStream out = new FileOutputStream(tempFile)) {
//copy stream
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = in.read(buffer)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }
            }
            return tempFile;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
