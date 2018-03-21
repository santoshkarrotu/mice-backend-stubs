package com.oyo.micebackend.controller;


import com.oyo.micebackend.model.CmsData;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CmsController {

    @Autowired
    private CmsData cmsData;

    @RequestMapping(value={"/cmsservice/instances/{cmsId}"}, method= RequestMethod.GET)
    public JSONObject welcome(@PathVariable(value="cmsId") String cmsId) {
        System.out.println("In CMS Controller for key_id:" + cmsId);
        return cmsData.getCMSdata(cmsId);
    }
}