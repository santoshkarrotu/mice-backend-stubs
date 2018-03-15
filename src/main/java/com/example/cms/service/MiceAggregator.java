package com.example.cms.service;

import com.example.cms.model.MiceDetailedData;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oyo.aggregation.mice.*;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class MiceAggregator implements TMiceAggregationService.Iface {

    @Autowired
    MiceDetailedData miceDetailedData;

    @Override
    public TPropertyDetailedResponse getPropertyDetails(String catalogId, TPropertySearchAndFilterAttributes userSelectedAttributes) throws TException {
        // Call MiceDetailsData to get detailed data
//        TPropertyDetailedResponse tPropertyDetailedResponse = new TPropertyDetailedResponse();
        TPropertyDetailedResponse tPropertyDetailedResponse = null;
        try {
            tPropertyDetailedResponse = new ObjectMapper().readValue(new File("/Users/santosh/oyo/backend-stubs/src/main/resources/data/mice_property_details.json"), TPropertyDetailedResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tPropertyDetailedResponse;
    }

    @Override
    public List<TPropertySmallResponse> getPropertyListingWithFewDetails(List<String> catalogIds, TPropertySearchAndFilterAttributes userSelectedAttributes) throws TException {
        return null;
    }

    @Override
    public List<TPropertyStandardResponse> getPropertyListingWithStandardDetails(List<String> catalogIds, TPropertySearchAndFilterAttributes userSelectedAttributes) throws TException {
        return null;
    }

//    public JSONObject getDetails(){
////        MiceDetailsData miceDetailsData = new MiceDetailsData();
////        JSONObject jsonObject = miceDetailsData.getMiceDetails("1234");
//        JSONObject thisObject = new JSONObject();
//        thisObject.put("Hello", "This is hello!!!!!!!!!");
//        return thisObject;
//    }
}