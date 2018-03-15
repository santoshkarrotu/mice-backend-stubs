//package com.example.cms.service;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.oyo.metadata.*;
//import org.apache.thrift.TException;
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;
//import org.springframework.stereotype.Service;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//@Service
//public class MetadataService implements TMetaDataService.Iface {
//    @Override
//    public TPackageDestinationResponse getPackageDestination(String metadataId, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public List<TPackageDestinationResponse> listPackageDestinations(String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public TPackageDestinationCUDResponse createPackageDestination(String packageDestinationName, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public TPackageDurationResponse getPackageDuration(String metadataId, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public List<TPackageDurationResponse> listPackageDurations(String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public TPackageDurationCUDResponse createPackageDuration(String packageDuration, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public TMonthResponse getMonth(String metadataId, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public List<TMonthResponse> listMonths(String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public List<TBlogResponse> listBlogs(String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public List<TUserStoryResponse> listUserStories(String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public TPackageInclusionResponse getPackageInclusion(String metadataId, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public List<TPackageInclusionResponse> listPackageInclusions(String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public TPackageInclusionCUDResponse createPackageInclusion(String inclusion, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public TPackageExclusionResponse getPackageExclusion(String metadataId, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public List<TPackageExclusionResponse> listPackageExclusions(String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public TPackageExclusionCUDResponse createPackageExclusion(String exclusion, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public TRestrictionResponse getRestriction(String metadataId, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public List<TRestrictionResponse> listRestrictions(String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public TRestrictionCUDResponse createRestriction(String restriction, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public TAmenityResponse getAmenity(String metadataId, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public List<TAmenityResponse> listAmenity(String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public TAmenityCUDResponse createAmenity(String amenity, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public TPackageTagResponse getPackageTag(String metadataId, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public List<TPackageTagResponse> listPackageTags(String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public TPackageTagCUDResponse createPackageTag(String packageTag, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public THotelCategoryResponse getHotelCategory(String metadataId, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public List<THotelCategoryResponse> listHotelCategories(String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public THotelCategoryCUDResponse createHotelCategory(String hotelCategory, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public TRoomCategoryResponse getRoomCategory(String metadataId, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public List<TRoomCategoryResponse> listRoomCategories(String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public TRoomCategoryCUDResponse createRoomCategory(String roomCategory, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public TMiceTagResponse getMiceTag(String metadataId, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public List<TMiceTagResponse> listMiceTags(String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public TMiceTagCUDResponse createMiceTag(String miceTag, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public TMiceEventResponse getMiceEvent(String metadataId, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public List<TMiceEventResponse> listMiceEvents(String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public TMiceEventCUDResponse createMiceEvent(String miceEventName, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public TMiceCityResponse getMiceCity(String metadataId, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public ArrayList<TMiceCityResponse> listMiceCities(String locale) throws TException {
//        ArrayList<TMiceCityResponse> tMiceCityResponses = new ArrayList<TMiceCityResponse>();
//        JSONParser parser = new JSONParser();
//        try {
//            System.out.println("This is in listMiceCities");
//            ClassLoader classLoader = getClass().getClassLoader();
//            JSONArray a = (JSONArray) parser.parse(new FileReader(classLoader.getResource("/Users/santosh/oyo/backend-stubs/src/main/resources/data/mice_cities.json").getFile()));
//            for(Object obj : a) {
//                tMiceCityResponses.add((TMiceCityResponse) obj);
//                System.out.println("Added "+obj);
//            }
//            System.out.println(tMiceCityResponses);
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//        return tMiceCityResponses;
//
////        JSONParser parser = new JSONParser();
////        try {
////            System.out.println("This is in listMiceCities");
////            ClassLoader classLoader = getClass().getClassLoader();
////            JSONArray a = (JSONArray) parser.parse(new FileReader(classLoader.getResource("/data/mice_cities.json").getFile()));
////            for(Object obj : a) {
////                tMiceCityResponses.add((TMiceCityResponse)obj);
////                System.out.println("Added "+ obj + " to tMiceCityResponses");
////            }
////            System.out.println(tMiceCityResponses);
////        }
////        catch (ParseException e) {
////            e.printStackTrace();
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////        return tMiceCityResponses;
//    }
//
//    @Override
//    public TMiceCityCUDResponse createMiceCity(String miceCityName, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public TPropertyLevelResponse getPropertyLevel(String metadataId, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public List<TPropertyLevelResponse> listPropertyLevel(String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public TPropertyLevelResponse createPropertyLevel(TPropertyLevel propertyLevelData, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public TToiletConfigurationResponse getToiletConfiguration(String metadataId, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public List<TToiletConfigurationResponse> listToiletConfiguration(String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public TToiletConfigurationResponse createToilet(TToiletConfigurationResponse toiletData, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public TPaymentPolicyResponse getPaymentPolicy(String metadataId, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public List<TPaymentPolicyResponse> listPaymentPolicies(String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public TPaymentPolicyCUDResponse createPaymentPolicy(String description, Map<String, String> rule, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public TCancellationPolicyResponse getCancellationPolicy(String metadataId, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public List<TCancellationPolicyResponse> listCancellationPolicies(String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public TCancellationPolicyCUDResponse createCancellationPolicy(String description, Map<String, String> rule, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public List<THotSellingPackageResponse> listHotSellingPackage(String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public THotSellingPackageResponse createHotSellingPackage(String catalogId, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public List<TPopularPackageResponse> listPopularPackages(String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public TPopularPackageResponse createPopularPackage(String catalogId, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public List<TOtherRecommendedPackageResponse> listOtherRecommendedPackages(String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public TOtherRecommendedPackageResponse createOtherRecommendedPackage(String catalogId, String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public List<TOtherDestinationToExploreResponse> listOtherDestinationsToExplore(String locale) throws TException {
//        return null;
//    }
//
//    @Override
//    public TOtherDestinationToExploreResponse createOtherDestinationToExplore(String catalogId, String locale) throws TException {
//        return null;
//    }
//}
