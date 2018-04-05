namespace java com.oyo.aggregation.common

enum TStatus {
	SUCCESS,
	FAILURE
}

struct TAddress {
  1: string city;
  2: string state;
  3: string country;
  4: string pincode;
}

struct TDestination {
	1: string id;
	2: string name;
}

struct TCity {
	1: string id;
	2: string name;
}

struct TCityResponse {
	1: TCity city,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TState {
	1: string id;
	2: string name;
}

struct TTag {
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
	1: double latitude,
	2: double longitude
}

struct TInventory {
  1: double inventory;	// 0 - not available, 1+  Available with that quantity, Infinity - Available Infinitly.
}

struct TAmenity {
	1: string id;
	2: string name;
}

struct TRestriction {
	1: string id;
	2: string name;
}

// meta
struct TMonth {
	1: string id,
	2: string name
}
struct TMonthResponse {
	1: TMonth month,
	2: TStatus status,
	3: map<string, string> errorList
}
/* Time stamp format HH:mm:ss */
struct TTimeSlot {
    1: string startTime;
    2: string endTime;
}

struct TLevel {
	1: string id,
	2: string name
}


service TCommonMetadataService {
	list<TCityResponse> listCities(1: string locale, 2: bool getPakageCity, 3: bool getMiceCity);
}