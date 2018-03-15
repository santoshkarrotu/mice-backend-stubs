namespace java com.oyo.aggregation.mice

/*
enum values start at 1 if not supplied. SUCCESS = 1, FAILURE = 2
 */
enum TStatus {
	SUCCESS,
	FAILURE
}

enum TFoodType {
	Veg,
	NonVeg,
	Jain,
	Vegan
}

struct TCity {
	1: string id;
	2: string name;
}

struct TPrice {
  1: double originalPrice;
  2: bool valueDeal;
  3: double discountPercentage;		// should be zero if no discount
  4: double afterDiscountPrice;		// should be assigned the originalPrice if Zero discount
}
struct TMapLocation {
	1: double latitude;
	2: double longitude;
}

struct TDate {
	1: string date; // standard date time with UTC
}

struct TTime {
	1: string time; // standard time with UTC
}

struct TInventory {
  1: i32 available;	// 0 - not available, 1+  Available with that quantity, Infinity - Available Infinitly.
  // check for double
}


/*
Isn't this TAmenity{} ? Anyways bool included is there to check if the amenity is available or not.
 */
struct TAmenitiesAvailable {
	1: string id;
	2: string name;
	3: bool included;
}

struct TServicesAvailable {
    1: string id;
    2: string name;
    3: double price;
}
struct TFoodCategory {
	1: string name;
}

struct TFoodCategoryWithQuantity {
	1: TFoodCategory foodCategory; // (soup/starter/salads/mains/dal/Rice/Bread/Desert/onionSalad)
	2: i32 quantityAllowed;			// (2,1,3,..
}

struct TPricePerPlate {
	1: string paxRange;   // ">=70 PAX"		// note: maintain min max values of ranges
	2: TPrice price;			// 399/- per plate
}

struct TFoodPackage {
	1: string catalogId;
	2: string name; 							// "Standard - veg" either it comes from cms or catalog(having a string service id)
	3: TFoodType foodType; 					// enum
	4: list<TFoodCategoryWithQuantity> foodCategoryWithQuantity;
	5: list<TPricePerPlate> pricePerPlate;
}

struct TCommonValues {
  1: string id;
  2: string name;
  3: string type;
  4: string activationDate;
  5: string expiryDate;
  6: TPrice price;
  7: TInventory inventory;
}

/** Home page cards */
struct TPropertyWithFewDetails {
	1: TCommonValues commonValues;
}

/**  Listing Page  **/
struct TPropertyWithStandardDetails {
	1: TCommonValues commonValues;
 	2: list<string> tags;
  3: list<string> inclusions;
	4: TMapLocation mapPoints;
	5: list<string> availableMonths;
}

// Details page
struct TPropertyWithCompleteDetails {
	1: TCommonValues commonValues;
	2: string propertyCode;
	3: string locality;
	4: string city;
	5: i32 standingCapacity;
	6: i32 theatreSeatingCapacity;
	7: i32 clusterSeatingCapacity;
	8: TMapLocation mapPoints;
  9: list<TFoodPackage> foodPackageList;
  10: string paymentPolicy;
  11: string cancellationPolicy;
  12: list<TAmenitiesAvailable> amenities;
  13: list<TServicesAvailable> services;
  14: list<string> tags;
}

struct TPropertySmallResponse {
   1: TPropertyWithFewDetails propertyDetails;
   2: TStatus status;
   3: map<string, string> errorList;
}

struct TPropertyStandardResponse {
   1: TPropertyWithStandardDetails propertyDetails;
   2: TStatus status;
   3: map<string, string> errorList;
}

struct TPropertyDetailedResponse {
   1: TPropertyWithCompleteDetails propertyDetails;
   2: TStatus status;
   3: map<string, string> errorList;
}

struct TPropertySearchAndFilterAttributes {
	1: string cityId;
	2: list<string> priceRanges;	// need to be discussed
	3: i32 numberOfPax;
	4: TDate dateOfEvent;
	5: bool rentalOnly; // if true, don't consider food choice
	6: TFoodType foodType; //veg or non-veg
	7: string foodPackageId; // catalogid of standard-veg, or deluxe-non-veg
}

service TMiceAggregationService {

  TPropertyDetailedResponse getPropertyDetails(1:string catalogId, 2:TPropertySearchAndFilterAttributes userSelectedAttributes);

  list<TPropertySmallResponse> getPropertyListingWithFewDetails(1: list<string> catalogIds, 2:TPropertySearchAndFilterAttributes userSelectedAttributes);

  list<TPropertyStandardResponse> getPropertyListingWithStandardDetails(1: list<string> catalogIds, 2:TPropertySearchAndFilterAttributes userSelectedAttributes);

}

struct TFoodItem {
	1: TCommonValues commonValues;	// "sweet corn soup"
	2: TFoodCategory type; // (soup/starter/salads/mains/dal/Rice/Bread/Desert/onionSalad)
	3: TFoodType foodType; 				// enum veg , non-veg , jain , vegan
}

/**  Food selection Page  **/
struct TFoodDetailedResponse {
   1: TFoodItem foodItemDetails;
   2: TStatus status;
   3: map<string, string> errorList;
}

/** Food attributes  **/
struct TFoodSearchAndFilterAttributes {
	1: string propertyCatalogId;        // banquet catalogId
    /*
    numberOfPax and foodPackageId are not required
     */
	2: i32 numberOfPax;
	3: string foodPackageId;
}

// Expose separate api for foodPackage details page
service TFoodAggregationService {

  TFoodDetailedResponse getFoodDetails(1:string catalogId, 2: TFoodSearchAndFilterAttributes foodAttributes);
  list<TFoodPackage> listFoodPackages(1: list<string> catalogIds);

}
