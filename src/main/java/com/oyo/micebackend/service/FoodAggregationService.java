package com.oyo.micebackend.service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oyo.aggregation.mice.TFoodAggregationService;
import com.oyo.aggregation.mice.TFoodDetailedResponse;
import com.oyo.aggregation.mice.TFoodPackage;
import com.oyo.aggregation.mice.TFoodSearchAndFilterAttributes;
import org.apache.thrift.TException;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Component
public class FoodAggregationService implements TFoodAggregationService.Iface {
    @Override
    public TFoodDetailedResponse getFoodDetails(String catalogId, TFoodSearchAndFilterAttributes foodAttributes, String locale) throws TException {
        return null;
    }

    @Override
    public List<TFoodDetailedResponse> listFoodDetails(List<String> catalogIds, TFoodSearchAndFilterAttributes foodAttributes, String locale) throws TException {
        return null;
    }

    @Override
    public List<TFoodPackage> listFoodPackages(List<String> catalogIds, String locale) throws TException {
        List<TFoodPackage> tFoodPackages = null;
        try {
            File file = getResourceAsFile("/data/foodPackageList.json");
            tFoodPackages = new ObjectMapper().readValue(file, new TypeReference<List<TFoodPackage>>(){});
//            tFoodPackages = new ObjectMapper().readValue(new File("/Users/santosh/oyo/mice-backend-stubs/src/main/resources/data/foodPackageList.json"), new TypeReference<List<TFoodPackage>>(){});
            return tFoodPackages;
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tFoodPackages;
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
