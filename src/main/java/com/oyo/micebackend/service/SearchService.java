package com.oyo.micebackend.service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oyo.search.TBanquetListRequest;
import com.oyo.search.TPackagesListRequest;
import com.oyo.search.TSearchResponse;
import com.oyo.search.TSearchService;
import org.apache.thrift.TException;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

@Component
public class SearchService implements TSearchService.Iface {
    @Override
    public TSearchResponse getBanquetsList(TBanquetListRequest tBanquetListRequest) throws TException {
        TSearchResponse tSearchResponse = null;
        try {
            File file = getResourceAsFile("/data/searchBanquets.json");
            System.out.println("This is in saerch banquets");
            tSearchResponse = new ObjectMapper().readValue(file, TSearchResponse.class);
            System.out.println(tSearchResponse);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tSearchResponse;
    }

    @Override
    public TSearchResponse getPackagesList(TPackagesListRequest packagesListRequest) throws TException {
        return null;
    }

    @Override
    public TSearchResponse getFoodPackagesList() throws TException {
        TSearchResponse tSearchResponse = null;
        try {
            File file = getResourceAsFile("/data/searchFood.json");
            System.out.println("This is in search Food");
            tSearchResponse = new ObjectMapper().readValue(file, TSearchResponse.class);
            System.out.println(tSearchResponse);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tSearchResponse;
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
