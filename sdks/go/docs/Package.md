# Package

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **string** | The name of the item being purchased. This should be user-friendly as it is shown to the customer on checkout and receipts. | [optional] 
**Price** | Pointer to **float32** | A float (decimal describing the price of the package in your account currency) | [optional] 
**ExpiryPeriod** | Pointer to **string** | The renewal period of this item | [optional] 
**ExpiryLength** | Pointer to **int32** | An integer representing the number of &#x60;expiry_periods&#x60; that make up the renewal period. | [optional] 
**MetaData** | Pointer to [**PackageMetaData**](PackageMetaData.md) |  | [optional] 

## Methods

### NewPackage

`func NewPackage() *Package`

NewPackage instantiates a new Package object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPackageWithDefaults

`func NewPackageWithDefaults() *Package`

NewPackageWithDefaults instantiates a new Package object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *Package) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *Package) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *Package) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *Package) HasName() bool`

HasName returns a boolean if a field has been set.

### GetPrice

`func (o *Package) GetPrice() float32`

GetPrice returns the Price field if non-nil, zero value otherwise.

### GetPriceOk

`func (o *Package) GetPriceOk() (*float32, bool)`

GetPriceOk returns a tuple with the Price field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice

`func (o *Package) SetPrice(v float32)`

SetPrice sets Price field to given value.

### HasPrice

`func (o *Package) HasPrice() bool`

HasPrice returns a boolean if a field has been set.

### GetExpiryPeriod

`func (o *Package) GetExpiryPeriod() string`

GetExpiryPeriod returns the ExpiryPeriod field if non-nil, zero value otherwise.

### GetExpiryPeriodOk

`func (o *Package) GetExpiryPeriodOk() (*string, bool)`

GetExpiryPeriodOk returns a tuple with the ExpiryPeriod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiryPeriod

`func (o *Package) SetExpiryPeriod(v string)`

SetExpiryPeriod sets ExpiryPeriod field to given value.

### HasExpiryPeriod

`func (o *Package) HasExpiryPeriod() bool`

HasExpiryPeriod returns a boolean if a field has been set.

### GetExpiryLength

`func (o *Package) GetExpiryLength() int32`

GetExpiryLength returns the ExpiryLength field if non-nil, zero value otherwise.

### GetExpiryLengthOk

`func (o *Package) GetExpiryLengthOk() (*int32, bool)`

GetExpiryLengthOk returns a tuple with the ExpiryLength field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiryLength

`func (o *Package) SetExpiryLength(v int32)`

SetExpiryLength sets ExpiryLength field to given value.

### HasExpiryLength

`func (o *Package) HasExpiryLength() bool`

HasExpiryLength returns a boolean if a field has been set.

### GetMetaData

`func (o *Package) GetMetaData() PackageMetaData`

GetMetaData returns the MetaData field if non-nil, zero value otherwise.

### GetMetaDataOk

`func (o *Package) GetMetaDataOk() (*PackageMetaData, bool)`

GetMetaDataOk returns a tuple with the MetaData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetaData

`func (o *Package) SetMetaData(v PackageMetaData)`

SetMetaData sets MetaData field to given value.

### HasMetaData

`func (o *Package) HasMetaData() bool`

HasMetaData returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


