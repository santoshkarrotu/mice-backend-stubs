package com.oyo.micebackend.service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oyo.aggregation.mice.TMiceCityResponse;
import com.oyo.aggregation.mice.TMiceEventResponse;
import com.oyo.aggregation.mice.TMiceMetadataService;
import org.apache.thrift.TException;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Component
public class MetaDataFromAggregationService implements TMiceMetadataService.Iface {
    @Override
    public List<TMiceEventResponse> listMiceEvents(String locale) throws TException {
        List<TMiceEventResponse> tMiceEventResponses = null;
        try {
            tMiceEventResponses = new ObjectMapper().readValue(new File("/Users/santosh/oyo/mice-backend-stubs/src/main/resources/data/miceEventTypes.json"), new TypeReference<List<TMiceEventResponse>>(){});
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
    public List<TMiceCityResponse> listMiceCities(String locale) throws TException {
        List<TMiceCityResponse> tMiceCityResponses = null;
        try {
            tMiceCityResponses = new ObjectMapper().readValue(new File("/Users/santosh/oyo/mice-backend-stubs/src/main/resources/data/miceCities.json"), new TypeReference<List<TMiceCityResponse>>(){});
            return tMiceCityResponses;
        }catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
