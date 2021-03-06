//namespace java com.oyo.aggregation.mice
//
//enum TStatus {
//	SUCCESS,
//	FAILURE
//}
//
//enum TFoodType {
//	Veg,
//	NonVeg,
//	Jain,
//	Vegan
//}
//
//struct TCity {
//	1: string id;
//	2: string name;
//}
//
//struct TService{
//	1: string id;
//  2: string name;
//  3: TPrice price;
//}
//
//struct TPrice {
//  1: double originalPrice;
//  2: bool valueDeal;
//  3: double discountPercentage;		// should be zero if no discount
//  4: double afterDiscountPrice;		// should be assigned the originalPrice if Zero discount
//}
//struct TMapLocation {
//	1: double latitude;
//	2: double longitude;
//}
//
//struct TDate {
//	1: string date; // standard date time with UTC
//}
//
//struct TTime {
//	1: string time; // standard time with UTC
//}
//
//struct TInventory {
//  1: double inventory;	// 0 - not available, 1+  Available with that quantity, Infinity - Available Infinitly.
//}
//
//struct TAmenity {
//	1: string id;
//	2: string name;
//}
//
//struct TRestriction {
//	1: string id;
//	2: string title;
//	3: string description;
//}
//
//struct TTag {
//	1: string id;
//	2: string name;
//}
//struct TFoodCategory {
//	1: string name;
//}
//
//struct TFoodCategoryWithQuantity {
//	1: TFoodCategory foodCategory; // (soup/starter/salads/mains/dal/Rice/Bread/Desert/onionSalad)
//	2: i32 quantityAllowed;			// (2,1,3,..
//}
//
//struct TPricePerPlate {
//	1: string paxRangeID;   // ">=70 PAX"		// note: maintain min max values of ranges .. get from meta data
//	2: TPrice price;			// 399/- per plate
//}
//
//struct TFoodPackage {
//	1: string catalogId;
//	2: string	name; 							// "Standard - veg" either it comes from cms or catalog(having a string service id)
//	3: TFoodType foodType; 					// true/false
//	4: list<TFoodCategoryWithQuantity> foodCategoryWithQuantity;
//	5: list<TPricePerPlate> pricePerPlate;
//}
//
//struct TCommonValues {
//  1: string id;
//  2: string name;
//  3: string type;
//  4: string activationDate;
//  5: string expiryDate;
//  6: TInventory inventory;
//}
//
///** Home page cards */
//struct TPropertyWithFewDetails {
//	1: TCommonValues commonValues;
//	2: TPrice rentalOnlyPrice;
//  3: TPrice rentalPlusFoodPrice;
//}
//
///**  Listing Page  **/
//struct TPropertyWithStandardDetails {
//	1: TCommonValues commonValues;
// 	2: list<TTag> tags;
//	3: TMapLocation mapPoints;
//	4: list<string> availableMonths;
//	5: bool isRentalOnlyAllowed;
//	6: TPrice rentalOnlyPrice;
//  7: TPrice rentalPlusFoodPrice;
//  8: list<TFoodPackage> foodPackageList;
//}
//
//// Details page
//struct TPropertyWithCompleteDetails {
//	1: TCommonValues commonValues;
//	2: string propertyCode;
//	3: string locality;
//	4: string city;
//	5: i32 standingCapacity;
//	6: i32 theatreSeatingCapacity;
//	7: i32 clusterSeatingCapacity;
//	8: TMapLocation mapPoints;
//  9: list<TFoodPackage> foodPackageList;
//  10: string paymentPolicy;
//  11: string cancellationPolicy;
//  12: list<TAmenity> amenities;
//  13: list<TTag> tags;
//  14: bool isRentalOnlyAllowed;
//  15: list<TService> services;
//  16: list<TRestriction> restrictions;
//  17: TPrice rentalOnlyPrice;
//  18: TPrice rentalPlusFoodPrice;
//}
//
//struct TPropertySmallResponse {
//	1: TPropertyWithFewDetails propertyDetails;
//	2: TStatus status;
//	3: map<string, string> errorList;
//}
//
//struct TPropertyStandardResponse {
//	1: TPropertyWithStandardDetails propertyDetails;
// 	2: TStatus status;
//	3: map<string, string> errorList;
//}
//
//struct TPropertyDetailedResponse {
//	1: TPropertyWithCompleteDetails propertyDetails;
//	2: TStatus status;
//	3: map<string, string> errorList;
//}
//
//struct TPropertySearchAndFilterAttributes {
//	1: string cityId;
//	2: list<string> priceRanges;	// need to be discussed
//	3: i32 numberOfPax;
//	4: TDate dateOfEvent;
//	5: bool rentalOnly; // if true, don't consider food choice
//	6: TFoodType foodType; //veg or non-veg
//	7: string foodPackageId; // catalogid of standard-veg, or deluxe-non-veg
//}
//
//service TMiceAggregationService {
//
//  TPropertyDetailedResponse getPropertyDetails(1:string catalogId, 2:TPropertySearchAndFilterAttributes userSelectedAttributes, 3: string locale);
//
//  list<TPropertySmallResponse> getPropertyListingWithFewDetails(1: list<string> catalogIds, 2:TPropertySearchAndFilterAttributes userSelectedAttributes, 3: string locale);
//
//  list<TPropertyStandardResponse> getPropertyListingWithStandardDetails(1: list<string> catalogIds, 2:TPropertySearchAndFilterAttributes userSelectedAttributes, 3: string locale);
//
//}
//
//struct TFoodItem {
//	1: TCommonValues commonValues;	// "sweet corn soup"
//	2: TFoodCategory type; // (soup/starter/salads/mains/dal/Rice/Bread/Desert/onionSalad)
//	3: TFoodType foodType; 				// enum veg , non-veg , jain , vegan
//}
//
///**  Food selection Page  **/
//struct TFoodDetailedResponse {
//	1: TFoodItem foodItemDetails;
//	2: TStatus status;
//	3: map<string, string> errorList;
//}
//
///** Food attributes  **/
//struct TFoodSearchAndFilterAttributes {
//	1: string propertyCatalogId;
//}
//
//// Expose separate api for foodPackage details page
//service TFoodAggregationService {
//
//  TFoodDetailedResponse getFoodDetails(1:string catalogId, 2: TFoodSearchAndFilterAttributes foodAttributes, 3: string locale);
//  list<TFoodDetailedResponse> listFoodDetails(1: list<string> catalogIds, 2: TFoodSearchAndFilterAttributes foodAttributes, 3: string locale);
//
//  list<TFoodPackage> listFoodPackages(1: list<string> catalogIds, 2: string locale);
//
//}
//
//struct TMiceEvent {
//	1: string id,
//	2: string name
//}
//struct TMiceEventResponse {
//	1: TMiceEvent eventType,
//	2: TStatus status,
//	3: map<string, string> errorList
//}
//
//struct TMiceCityResponse {
//	1: TCity miceCity,
//	2: TStatus status,
//	3: map<string, string> errorList
//}
//service TMiceMetadataService {
//
//	list<TMiceEventResponse> listMiceEvents(1: string locale);
//	list<TMiceCityResponse> listMiceCities(1: string locale);
//
//}

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
	2: string propertyCode;
	3: common.TPrice rentalOnlyPrice;
  4: common.TPrice rentalPlusFoodPrice;
}

struct TBanquetPrice {
	// foodpackageId, parRangeId price
	1: map<string, map<string, common.TPrice>> price;
}

/**  Listing Page  **/
struct TPropertyWithStandardDetails {
	1: TCommonValues commonValues;
	2: string propertyCode;
 	3: list<common.TTag> tags;
	4: common.TMapLocation mapPoints;
	5: bool isRentalOnlyAllowed;
  6: TBanquetPrice pricePerPax;
  7: list<string> supportedFoodPackagesCatalogIds;
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
  17: TBanquetPrice pricePerPax;
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

struct TPriceAttributes {
	1: optional string paxRangeId;
}
service TMiceAggregationService {

  TPropertyDetailedResponse getPropertyDetails(1:string catalogId, 2: string locale, 3: TPriceAttributes priceAttributes);

  list<TPropertySmallResponse> getPropertyListingWithFewDetails(1: list<string> catalogIds, 2: string locale);

  list<TPropertyStandardResponse> getPropertyListingWithStandardDetails(1: list<string> catalogIds, 2: string locale, 3: TPriceAttributes priceAttributes);

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
