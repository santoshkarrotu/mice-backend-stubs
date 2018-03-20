package com.example.cms.service;

import com.example.cms.model.MiceDetailedData;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oyo.aggregation.mice.*;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class MiceAggregator implements TMiceAggregationService.Iface {

    @Autowired
    MiceDetailedData miceDetailedData;

    @Override
    public TPropertyDetailedResponse getPropertyDetails(String catalogId, TPropertySearchAndFilterAttributes userSelectedAttributes, String locale) throws TException {
        // Call MiceDetailsData to get detailed data
//        TPropertyDetailedResponse tPropertyDetailedResponse = new TPropertyDetailedResponse();
        TPropertyDetailedResponse tPropertyDetailedResponse = null;
        try {
            tPropertyDetailedResponse = new ObjectMapper().readValue(new File("/Users/santosh/oyo/mice-backend-stubs/src/main/resources/data/mice_property_details.json"), TPropertyDetailedResponse.class);
            System.out.println(tPropertyDetailedResponse);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tPropertyDetailedResponse;
    }

    @Override
    public List<TPropertySmallResponse> getPropertyListingWithFewDetails(List<String> catalogIds, TPropertySearchAndFilterAttributes userSelectedAttributes, String locale) throws TException {
        return null;
    }

    @Override
    public List<TPropertyStandardResponse> getPropertyListingWithStandardDetails(List<String> catalogIds, TPropertySearchAndFilterAttributes userSelectedAttributes, String locale) throws TException {
        List<TPropertyStandardResponse> tPropertyStandardResponses = new ArrayList<>();
        TPropertyStandardResponse tPropertyStandardResponse = new TPropertyStandardResponse(null,TStatus.SUCCESS, null);
        tPropertyStandardResponses.add(tPropertyStandardResponse);
        return tPropertyStandardResponses;
    }

//    public JSONObject getDetails(){
////        MiceDetailsData miceDetailsData = new MiceDetailsData();
////        JSONObject jsonObject = miceDetailsData.getMiceDetails("1234");
//        JSONObject thisObject = new JSONObject();
//        thisObject.put("Hello", "This is hello!!!!!!!!!");
//        return thisObject;
//    }
}