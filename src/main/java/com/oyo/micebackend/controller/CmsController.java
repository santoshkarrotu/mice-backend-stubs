package com.oyo.micebackend.controller;


import com.oyo.micebackend.model.CmsData;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CmsController {

    @Autowired
    private CmsData cmsData;

    @RequestMapping(value={"/cmsservice/instances/{cmsId}"}, method= RequestMethod.GET)
    public JSONObject welcome(@PathVariable(value="cmsId") String cmsId) {
        System.out.println("In CMS Controller for key_id:" + cmsId);
        return cmsData.getCMSdata(cmsId);
    }
    @RequestMapping(value = {"/cmsservice/instances/getStandardDetails/{catalogIds}"}, method = RequestMethod.GET)
    public JSONObject getdetails(@PathVariable(value = "catalogIds") List<String> catalogIds) {
        return cmsData.getStandardDetails(catalogIds);
    }
    @RequestMapping(value = {"/cmsservice/instances/getVenueDetails/{catalogId}"}, method = RequestMethod.GET)
    public JSONObject getVenueDetails(@PathVariable(value = "catalogId") String catalogId) {
        System.out.println("This is in getvenuedetails");
        return cmsData.getVenueDetails(catalogId);
    }
    @RequestMapping(value = {"/cmsservice/instances/getMultipleCatalogData/{catalogIds}"}, method = RequestMethod.GET)
    public JSONObject getMultipleCatalogData(@PathVariable(value = "catalogIds") List<String> catalogIds) {
        System.out.println("getting food package details from cms");
        return cmsData.getMultipleCatalogData(catalogIds);
    }
}