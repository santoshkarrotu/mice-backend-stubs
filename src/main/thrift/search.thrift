namespace java com.oyo.search
//
//typedef string catalogId
typedef string dateTime //DateTime format to be defined


enum TStatus{
    SUCCESS = 1,
    PARTIAL = 2,
    FAILURE = 3
}

enum month{
    JAN=1,
    FEB=2,
    MAR=3,
    APR=4,
    MAY=5,
    JUNE=6,
    JULY=7,
    AUGUST=8,
    SEPT=9,
    OCT=10,
    NOV=11,
    DEC=12
}

struct TSearchResponse{
    1: required list<string> catalogIds;
    2: required TStatus status;
    3: required list<string> errors;
}

struct TPackagesListRequest{
    1: required string location;
    2: optional month startMonth;
    3: optional month endMonth;
    4: optional i32 minNoOfGuests;
    5: optional i32 maxNoOfGuests;
}
struct TBanquetListRequest{
    1: required string location;
    2: optional string typeOfEvent;
    3: optional string noOfGuests;
    4: optional dateTime dateTime;
    5: optional bool rentalOnly;
}

service TSearchService{

    TSearchResponse getBanquetsList(1: TBanquetListRequest banquetListRequest);

    TSearchResponse getPackagesList(1: TPackagesListRequest packagesListRequest);

    TSearchResponse getFoodPackagesList();

}