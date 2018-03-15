namespace java com.oyo.metadata

enum TStatus {
	SUCCESS,
	FAILURE
}

struct TPackageDestination {
	1: string id,
	2: string name
}

struct TPackageCity {
	1: string id,
	2: string name
}

struct TPackageDuration {
	1: string id,
	2: string name
}

struct TMonth {
	1: string id,
	2: string name
}

struct TBlog {
	1: string id,
	2: string cmsId
}

struct TUserStory {
	1: string id,
	2: string cmsId
}

struct TPackageInclusion {
	1: string id,
	2: string name
}

struct TPackageExclusion {
	1: string id,
	2: string name
}

struct TRestriction {
	1: string id,
	2: string name
}

struct TAmenity {
	1: string id,
	2: string name
}

struct TPackageTag {
	1: string id,
	2: string name
}

struct THotelCategory {
	1: string id,
	2: string name
}

struct TRoomCategory {
	1: string id,
	2: string name
}

struct TMiceTag {
	1: string id,
	2: string name
}

struct TMiceEvent {
	1: string id,
	2: string name
}

struct TMiceCity {
	1: string id,
	2: string name
}

struct TPropertyLevel {
	1: string id,
	2: string name
}

struct TToiletConfiguration {
	1: string id,
	2: string name
}

struct TPaymentPolicy {
	1: string id,
	2: string description,
	3: map<string,string> policyRule
}

struct TCancellationPolicy {
	1: string id,
	2: string description,
	3: map<string,string> policyRule
}

struct THotSellingPackage {
	1: string id;
	2: string catalogId;
}

struct TPopularPackage {
	1: string id;
	2: string catalogId;
}

struct TOtherRecommendedPackage {
	1: string id;
	2: string catalogId;
}

struct TOtherDestinationToExplore {
	1: string id;
	2: string catalogId;
}


// GET Package Destination response
struct TPackageDestinationResponse {
	1: TPackageDestination packageDestination,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TPackageDestinationCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}

// GET Package City response
struct TPackageCityResponse {
	1: TPackageCity packageCity,
	2: TStatus status,
	3: map<string, string> errorList
}

struct TPackageDurationResponse {
	1: TPackageDuration packageDuration,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TPackageDurationCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}

struct TMonthResponse {
	1: TMonth month,
	2: TStatus status,
	3: map<string, string> errorList
}

struct TBlogResponse {
	1: TBlog blog,
	2: TStatus status,
	3: map<string, string> errorList
}

struct TUserStoryResponse {
	1: TUserStory userStory,
	2: TStatus status,
	3: map<string, string> errorList
}

// GET Package Inclusion response
struct TPackageInclusionResponse {
	1: TPackageInclusion packageInclusion,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TPackageInclusionCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}

// GET Package Exclusion response
struct TPackageExclusionResponse {
	1: TPackageExclusion packageExclusion,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TPackageExclusionCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}

// GET Restriction response
struct TRestrictionResponse {
	1: TRestriction restriction,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TRestrictionCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}

// GET Amenity response
struct TAmenityResponse {
	1: TAmenity amenity,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TAmenityCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}

// GET Hotel Category response
struct THotelCategoryResponse {
	1: THotelCategory hotelCategory,
	2: TStatus status,
	3: map<string, string> errorList
}
struct THotelCategoryCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}

// GET Room Category response
struct TRoomCategoryResponse {
	1: TRoomCategory roomCategory,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TRoomCategoryCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}

// GET Tags response
struct TPackageTagResponse {
	1: TPackageTag packageTag,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TPackageTagCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}

struct TMiceTagResponse {
	1: TMiceTag miceTag,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TMiceTagCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}

// GET Mice Event response
struct TMiceEventResponse {
	1: TMiceEvent eventType,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TMiceEventCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}
// GET Mice City response
struct TMiceCityResponse {
	1: TMiceCity miceCity,
	2: TStatus status,
	3: map<string, string> errorList
}

struct TMiceCityCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}

// GET Level response
struct TPropertyLevelResponse {
	1: TPropertyLevel propertyLevel,
	2: TStatus status,
	3: map<string, string> errorList
}

// GET Toilet Configuration response
struct TToiletConfigurationResponse {
	1: TToiletConfiguration toilet,
	2: TStatus status,
	3: map<string, string> errorList
}

// GET policy response
struct TPaymentPolicyResponse {
	1: TPaymentPolicy paymentPolicy,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TPaymentPolicyCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}

struct TCancellationPolicyResponse {
	1: TCancellationPolicy cancellationPolicy,
	2: TStatus status,
	3: map<string, string> errorList
}
struct TCancellationPolicyCUDResponse {
	1: string metadataId,
	2: TStatus status,
	3: map<string, string> errorList
}

struct THotSellingPackageResponse {
	1: THotSellingPackage hotSellingPacakge,
	2: TStatus status,
	3: map<string, string> errorList
}

struct TPopularPackageResponse {
	1: TPopularPackage popularPackage,
	2: TStatus status,
	3: map<string, string> errorList
}

struct TOtherRecommendedPackageResponse {
	1: TOtherRecommendedPackage otherPackage,
	2: TStatus status,
	3: map<string, string> errorList
}

struct TOtherDestinationToExploreResponse {
	1: TOtherDestinationToExplore otherDestination,
	2: TStatus status,
	3: map<string, string> errorList
}

service TMetaDataService{

	// GET operation
	TPackageDestinationResponse getPackageDestination(1: string metadataId, 2: string locale);
	// LIST operation
	list<TPackageDestinationResponse> listPackageDestinations(1: string locale);

	// 	CREATE operation
	TPackageDestinationCUDResponse createPackageDestination(1: string packageDestinationName, 2: string locale);


//	TPackageCityResponse getPackageCity(1: string metadataId, 2: string locale);
//	list<TPackageCityResponse> listPackageCity(1: string locale);
//	TPackageCityResponse createPackageCity(1: string city, 2: string locale);


	TPackageDurationResponse getPackageDuration(1: string metadataId, 2: string locale);
	list<TPackageDurationResponse> listPackageDurations(1: string locale);
	TPackageDurationCUDResponse createPackageDuration(1: string packageDuration, 2: string locale);

	TMonthResponse getMonth(1: string metadataId, 2: string locale);
	list<TMonthResponse> listMonths(1: string locale);
	// Update month with locale

	list<TBlogResponse> listBlogs(1: string locale);

	list<TUserStoryResponse> listUserStories(1: string locale);

	TPackageInclusionResponse getPackageInclusion(1: string metadataId, 2: string locale);
	list<TPackageInclusionResponse> listPackageInclusions(1: string locale);
	TPackageInclusionCUDResponse createPackageInclusion(1: string inclusion, 2: string locale);


	TPackageExclusionResponse getPackageExclusion(1: string metadataId, 2: string locale);
	list<TPackageExclusionResponse> listPackageExclusions(1: string locale);
	TPackageExclusionCUDResponse createPackageExclusion(1: string exclusion, 2: string locale);


	TRestrictionResponse getRestriction(1: string metadataId, 2: string locale);
	list<TRestrictionResponse> listRestrictions(1: string locale);
	TRestrictionCUDResponse createRestriction(1: string restriction, 2: string locale);


	TAmenityResponse getAmenity(1: string metadataId, 2: string locale);
	list<TAmenityResponse> listAmenity(1: string locale);
	TAmenityCUDResponse createAmenity(1: string amenity, 2: string locale);


	TPackageTagResponse getPackageTag(1: string metadataId, 2: string locale);
	list<TPackageTagResponse> listPackageTags(1: string locale);
	TPackageTagCUDResponse createPackageTag(1: string packageTag, 2: string locale);


	THotelCategoryResponse getHotelCategory(1: string metadataId, 2: string locale);
	list<THotelCategoryResponse> listHotelCategories(1: string locale);
	THotelCategoryCUDResponse createHotelCategory(1: string hotelCategory, 2: string locale);


	TRoomCategoryResponse getRoomCategory(1: string metadataId, 2: string locale);
	list<TRoomCategoryResponse> listRoomCategories(1: string locale);
	TRoomCategoryCUDResponse createRoomCategory(1: string roomCategory, 2: string locale);


	TMiceTagResponse getMiceTag(1: string metadataId, 2: string locale);
	list<TMiceTagResponse> listMiceTags(1: string locale);
	TMiceTagCUDResponse createMiceTag(1: string miceTag, 2: string locale);


	TMiceEventResponse getMiceEvent(1: string metadataId, 2: string locale);
	list<TMiceEventResponse> listMiceEvents(1: string locale);
	TMiceEventCUDResponse createMiceEvent(1: string miceEventName, 2: string locale);


	TMiceCityResponse getMiceCity(1: string metadataId, 2: string locale);
	list<TMiceCityResponse> listMiceCities(1: string locale);
	TMiceCityCUDResponse createMiceCity(1: string miceCityName, 2: string locale);


	TPropertyLevelResponse getPropertyLevel(1: string metadataId, 2: string locale);
	list<TPropertyLevelResponse> listPropertyLevel(1: string locale);
	TPropertyLevelResponse createPropertyLevel(1: TPropertyLevel propertyLevelData, 2: string locale);


	TToiletConfigurationResponse getToiletConfiguration(1: string metadataId, 2: string locale);
	list<TToiletConfigurationResponse> listToiletConfiguration(1: string locale);
	TToiletConfigurationResponse createToilet(1: TToiletConfigurationResponse toiletData, 2: string locale);

	// Policy APIs

	TPaymentPolicyResponse getPaymentPolicy(1: string metadataId, 2: string locale);
	list<TPaymentPolicyResponse> listPaymentPolicies(1: string locale);
	TPaymentPolicyCUDResponse createPaymentPolicy(1: string description, 2: map<string,string> rule, 3: string locale);

	TCancellationPolicyResponse getCancellationPolicy(1: string metadataId, 2: string locale);
	list<TCancellationPolicyResponse> listCancellationPolicies(1: string locale);
	TCancellationPolicyCUDResponse createCancellationPolicy(1: string description, 2: map<string,string> rule, 3: string locale);

 	// Catalog collection APIs

	list<THotSellingPackageResponse> listHotSellingPackage(1: string locale);
	THotSellingPackageResponse createHotSellingPackage(1: string catalogId, 2: string locale);


	list<TPopularPackageResponse> listPopularPackages(1: string locale);
	TPopularPackageResponse createPopularPackage(1: string catalogId, 2: string locale);

	list<TOtherRecommendedPackageResponse> listOtherRecommendedPackages(1: string locale);
	TOtherRecommendedPackageResponse createOtherRecommendedPackage(1: string catalogId, 2: string locale);

	list<TOtherDestinationToExploreResponse> listOtherDestinationsToExplore(1: string locale);
	TOtherDestinationToExploreResponse createOtherDestinationToExplore(1: string catalogId, 2: string locale);

}