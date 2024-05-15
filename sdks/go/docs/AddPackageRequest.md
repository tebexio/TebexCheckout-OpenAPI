# AddPackageRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Package** | Pointer to [**Package**](Package.md) |  | [optional] 
**Qty** | Pointer to **int32** | The quantity of &#x60;package&#x60; in this basket. This is not the total quantity of overall items in the basket. | [optional] 
**Type** | Pointer to **string** | The type of payment, either &#x60;single&#x60; for one-time payments or &#x60;subscription&#x60;. | [optional] 
**RevenueShare** | Pointer to [**[]RevenueShare**](RevenueShare.md) | An array of payment destination objects describing how the purchase should be split between multiple wallets. **Only available with pre-agreement from Tebex.** | [optional] 

## Methods

### NewAddPackageRequest

`func NewAddPackageRequest() *AddPackageRequest`

NewAddPackageRequest instantiates a new AddPackageRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAddPackageRequestWithDefaults

`func NewAddPackageRequestWithDefaults() *AddPackageRequest`

NewAddPackageRequestWithDefaults instantiates a new AddPackageRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPackage

`func (o *AddPackageRequest) GetPackage() Package`

GetPackage returns the Package field if non-nil, zero value otherwise.

### GetPackageOk

`func (o *AddPackageRequest) GetPackageOk() (*Package, bool)`

GetPackageOk returns a tuple with the Package field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPackage

`func (o *AddPackageRequest) SetPackage(v Package)`

SetPackage sets Package field to given value.

### HasPackage

`func (o *AddPackageRequest) HasPackage() bool`

HasPackage returns a boolean if a field has been set.

### GetQty

`func (o *AddPackageRequest) GetQty() int32`

GetQty returns the Qty field if non-nil, zero value otherwise.

### GetQtyOk

`func (o *AddPackageRequest) GetQtyOk() (*int32, bool)`

GetQtyOk returns a tuple with the Qty field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQty

`func (o *AddPackageRequest) SetQty(v int32)`

SetQty sets Qty field to given value.

### HasQty

`func (o *AddPackageRequest) HasQty() bool`

HasQty returns a boolean if a field has been set.

### GetType

`func (o *AddPackageRequest) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *AddPackageRequest) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *AddPackageRequest) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *AddPackageRequest) HasType() bool`

HasType returns a boolean if a field has been set.

### GetRevenueShare

`func (o *AddPackageRequest) GetRevenueShare() []RevenueShare`

GetRevenueShare returns the RevenueShare field if non-nil, zero value otherwise.

### GetRevenueShareOk

`func (o *AddPackageRequest) GetRevenueShareOk() (*[]RevenueShare, bool)`

GetRevenueShareOk returns a tuple with the RevenueShare field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRevenueShare

`func (o *AddPackageRequest) SetRevenueShare(v []RevenueShare)`

SetRevenueShare sets RevenueShare field to given value.

### HasRevenueShare

`func (o *AddPackageRequest) HasRevenueShare() bool`

HasRevenueShare returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


