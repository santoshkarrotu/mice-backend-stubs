package com.oyo.micebackend.service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oyo.aggregation.mice.TFoodTypeResponse;
import com.oyo.aggregation.mice.TMiceEventResponse;
import com.oyo.aggregation.mice.TMiceMetadataService;
import com.oyo.aggregation.mice.TPaxRangeResponse;
import org.apache.thrift.TException;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Component
public class MetaDataFromAggregationService implements TMiceMetadataService.Iface {
    @Override
    public List<TMiceEventResponse> listMiceEvents(String locale) throws TException {
        List<TMiceEventResponse> tMiceEventResponses = null;
        try {
            File file = getResourceAsFile("/data/miceEventTypes.json");
            tMiceEventResponses = new ObjectMapper().readValue(file, new TypeReference<List<TMiceEventResponse>>(){});
            return tMiceEventResponses;
        }catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<TPaxRangeResponse> listPaxRanges(String locale) throws TException {
        List<TPaxRangeResponse> paxRangeResponses = new ArrayList<>();
        try {
            File file = getResourceAsFile("/data/paxRanges.json");
            paxRangeResponses = new ObjectMapper().readValue(file, new TypeReference<List<TPaxRangeResponse>>(){});
            return paxRangeResponses;
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<TFoodTypeResponse> listFoodTypes(String locale) throws TException {
        List<TFoodTypeResponse> tFoodTypeResponses = new ArrayList<>();
        try {
            File file = getResourceAsFile("/data/foodTypes.json");
            tFoodTypeResponses = new ObjectMapper().readValue(file, new TypeReference<List<TFoodTypeResponse>>(){});
            return tFoodTypeResponses;
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
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
