include "common.thrift"
namespace java com.oyo.aggregation.mice


struct TFoodCategoryWithQuantity {
	1: TFoodCategory foodCategory; // (soup/starter/salads/mains/dal/Rice/Bread/Desert/onionSalad)
	2: i32 quantityAllowed;			// (2,1,3,..
}

struct TPricePerPlate {
	1: string paxRange;   // ">=70 PAX"		// note: maintain min max values of ranges .. get from meta data
	2: common.TPrice price;			// 399/- per plate
}

struct TPropertyCapacity {
    1: i32 minCapacity;
    2: i32 maxCapacity;
}

struct TDimensions {
    1: double length;
    2: double breadth;
    3: double height;
}

struct TCommonValues {
  1: string id;
  2: string name;
  3: string type;
  4: string activationDate;
  5: string expiryDate;
  6: common.TInventory inventory;
}

struct TVenuePolicy {
	1: string id;
	2: string name;
	3: string description;
}

struct TPaxRange {
	1: string id,
	2: string displayName,
	3: i32 minNumberOfPax,
	4: i32 maxNumberOfPax
}
struct TPaxRangeResponse {
	1: TPaxRange paxRange,
	2: common.TStatus status,
	3: map<string, string> errorList
}

// Veg,NonVeg,Jain,Vegan
struct TFoodType {
	1: string id,
	2: string name;
}
struct TFoodTypeResponse {
	1: TFoodType foodType,
	2: common.TStatus status,
	3: map<string, string> errorList
}

struct TFoodCategory {
	1: string id,
	2: string name;
}

struct TService {
	1: TCommonValues commonValues;
}

struct TServiceResponse {
	1: TService miceService,
	2: common.TStatus status,
	3: map<string, string> errorList
}

/** Home page cards */
struct TPropertyWithFewDetails {
	1: TCommonValues commonValues;
	2: common.TPrice rentalOnlyPrice;
  3: common.TPrice rentalPlusFoodPrice;
  4: string propertyCode;
}

/**  Listing Page  **/
struct TPropertyWithStandardDetails {
	1: TCommonValues commonValues;
 	2: list<common.TTag> tags;
	3: common.TMapLocation mapPoints;
	4: list<string> availableMonths;
	5: bool isRentalOnlyAllowed;
	6: common.TPrice rentalOnlyPrice;
  7: common.TPrice rentalPlusFoodPrice;
  8: list<string> supportedFoodPackagesCatalogIds;
  9: string propertyCode;
}
// Details page
struct TPropertyWithCompleteDetails {
	1: TCommonValues commonValues;
	2: string propertyCode;
	3: string locality;
	4: string city;
	5: TPropertyCapacity standingCapacity;
	6: TPropertyCapacity theatreSeatingCapacity;
	7: TPropertyCapacity clusterSeatingCapacity;
	8: common.TMapLocation mapPoints;
    9: list<TFoodPackage> foodPackageList;
   10: string paymentPolicy;
   11: string cancellationPolicy;
   12: list<common.TAmenity> amenities;
   13: list<common.TTag> tags;
   14: bool isRentalOnlyAllowed;
   15: list<TService> services;		// not yet done
   16: list<TVenuePolicy> venuePolicies;
   17: common.TPrice rentalOnlyPrice;
   18: common.TPrice rentalPlusFoodPrice;
   19: TDimensions dimensions;
   20: common.TLevel level; // eg: Ground, First floor
   21: common.TTimeSlot operatingTime;
}

struct TPropertySmallResponse {
	1: TPropertyWithFewDetails propertyDetails;
	2: common.TStatus status;
	3: map<string, string> errorList;
}

struct TPropertyStandardResponse {
	1: TPropertyWithStandardDetails propertyDetails;
 	2: common.TStatus status;
	3: map<string, string> errorList;
}

struct TPropertyDetailedResponse {
	1: TPropertyWithCompleteDetails propertyDetails;
	2: common.TStatus status;
	3: map<string, string> errorList;
}

/**
struct TPropertySearchAndFilterAttributes {
	1: string cityId;
	2: list<string> priceRanges;	// need to be discussed
	3: i32 numberOfPax;
	4: string dateOfEvent;
	5: bool rentalOnly; // if true, don't consider food choice
	6: TFoodType foodType; //veg or non-veg
	7: string foodPackageId; // catalogid of standard-veg, or deluxe-non-veg
}
**/

service TMiceAggregationService {

  TPropertyDetailedResponse getPropertyDetails(1:string catalogId, 2: string locale);

  list<TPropertySmallResponse> getPropertyListingWithFewDetails(1: list<string> catalogIds, 2: string locale);

  list<TPropertyStandardResponse> getPropertyListingWithStandardDetails(1: list<string> catalogIds, 2: string locale);

}

/**
struct TFoodItem {
	1: TCommonValues commonValues;	// "sweet corn soup"
	2: common.TTFoodCategorytegory foodCategory; // (soup/starter/salads/mains/dal/Rice/Bread/Desert/onionSalad)
	3: TFoodType foodType; 				// enum veg , non-veg , jain , vegan
}
**/

/**  Food selection Page  **/
/**
struct TFoodDetailedResponse {
	1: TFoodItem foodItemDetails;
	2: common.TStatus status;
	3: map<string, string> errorList;
}
**/

struct TFoodPackage {
	1: TCommonValues commonValues;	// "Standard - veg" either it comes from cms or catalog(having a string service id)
	2: TFoodType foodType; 					// true/false
	3: list<TFoodCategoryWithQuantity> foodCategoryWithQuantity;
	4: list<TPricePerPlate> pricePerPlate;
}

struct TFoodPackageResponse {
	1: TFoodPackage foodPackage;
	2: common.TStatus status;
	3: map<string, string> errorList;
}

/** Food attributes  **/
//struct TFoodSearchAndFilterAttributes {
//	1: string propertyCatalogId;
//}

// Expose separate api for foodPackage details page
service TFoodAggregationService {

//  TFoodDetailedResponse getFoodDetails(1:string catalogId, 2: string locale);
//  list<TFoodDetailedResponse> listFoodDetails(1: list<string> catalogIds, 2: string locale);

  list<TFoodPackageResponse> listFoodPackages(1: list<string> catalogIds, 2: string locale);

}

struct TMiceEvent {
	1: string id,
	2: string name
}
struct TMiceEventResponse {
	1: TMiceEvent eventType,
	2: common.TStatus status,
	3: map<string, string> errorList
}

service TMiceMetadataService {
	list<TMiceEventResponse> listMiceEvents(1: string locale),
	list<TPaxRangeResponse> listPaxRanges(1: string locale),
	list<TFoodTypeResponse> listFoodTypes(1: string locale)
}
