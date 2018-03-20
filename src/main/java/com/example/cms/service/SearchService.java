//package com.example.cms.service;
//
//import com.fasterxml.jackson.core.JsonParseException;
//import com.fasterxml.jackson.databind.JsonMappingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.oyo.search.TBanquetListRequest;
//import com.oyo.search.TPackagesListRequest;
//import com.oyo.search.TSearchResponse;
//import com.oyo.search.TSearchService;
//import org.apache.thrift.TException;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//import java.io.File;
//import java.io.IOException;
//
//@Service
//public class SearchService implements TSearchService.Iface {
//    @Override
//    public TSearchResponse getBanquetsList(TBanquetListRequest tBanquetListRequest) throws TException {
//        TSearchResponse tSearchResponse = null;
//        try {
//            tSearchResponse = new ObjectMapper().readValue(new File("/Users/santosh/oyo/mice-backend-stubs/src/main/resources/data/searchResponse.json"), TSearchResponse.class);
//        } catch (JsonParseException e) {
//            e.printStackTrace();
//        } catch (JsonMappingException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return tSearchResponse;
//    }
//
//    @Override
//    public TSearchResponse getPackagesList(TPackagesListRequest packagesListRequest) throws TException {
//        return null;
//    }
//
//    @Override
//    public TSearchResponse getFoodPackagesList() throws TException {
//        return null;
//    }
//}
