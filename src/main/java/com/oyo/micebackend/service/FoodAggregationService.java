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
import java.io.IOException;
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
            tFoodPackages = new ObjectMapper().readValue(new File("/Users/santosh/oyo/mice-backend-stubs/src/main/resources/data/foodPackageList.json"), new TypeReference<List<TFoodPackage>>(){});
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
}
