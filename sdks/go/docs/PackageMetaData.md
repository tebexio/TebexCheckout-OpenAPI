# PackageMetaData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Custom** | Pointer to **string** | A free-text string field that is passed back to you via the webhook (for example, a tracking ID) | [optional] 

## Methods

### NewPackageMetaData

`func NewPackageMetaData() *PackageMetaData`

NewPackageMetaData instantiates a new PackageMetaData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPackageMetaDataWithDefaults

`func NewPackageMetaDataWithDefaults() *PackageMetaData`

NewPackageMetaDataWithDefaults instantiates a new PackageMetaData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCustom

`func (o *PackageMetaData) GetCustom() string`

GetCustom returns the Custom field if non-nil, zero value otherwise.

### GetCustomOk

`func (o *PackageMetaData) GetCustomOk() (*string, bool)`

GetCustomOk returns a tuple with the Custom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustom

`func (o *PackageMetaData) SetCustom(v string)`

SetCustom sets Custom field to given value.

### HasCustom

`func (o *PackageMetaData) HasCustom() bool`

HasCustom returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


