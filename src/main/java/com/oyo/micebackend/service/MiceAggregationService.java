package com.oyo.micebackend.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.oyo.micebackend.model.MiceDetailedData;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oyo.aggregation.mice.*;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Component
public class MiceAggregationService implements TMiceAggregationService.Iface {

    @Autowired
    MiceDetailedData miceDetailedData;

    @Override
    public TPropertyDetailedResponse getPropertyDetails(String catalogId, TPropertySearchAndFilterAttributes userSelectedAttributes, String locale) throws TException {
        TPropertyDetailedResponse tPropertyDetailedResponse = null;
        try {
            File file = getResourceAsFile("/data/micePropertyDetails.json");
            tPropertyDetailedResponse = new ObjectMapper().readValue(file, TPropertyDetailedResponse.class);
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
    public List<TPropertyStandardResponse> getPropertyListingWithStandardDetails(List<String> catalogIds, TPropertySearchAndFilterAttributes userSelectedAttributes, String locale) throws TException{
        List<TPropertyStandardResponse> tPropertyStandardResponses = new ArrayList<>();
        try
        {
            File file = getResourceAsFile("/data/standardDetails.json");
            TPropertyStandardResponse tPropertyStandardResponse = new TPropertyStandardResponse(null,TStatus.SUCCESS, null);
            tPropertyStandardResponses.add(tPropertyStandardResponse);
            List<TPropertyStandardResponse> tPropertyStandardResponses1  = new ObjectMapper().readValue(file, new TypeReference<List<TPropertyStandardResponse>>(){});
            return tPropertyStandardResponses1;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return tPropertyStandardResponses;
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