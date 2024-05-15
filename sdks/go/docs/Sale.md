# Sale

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **string** | The name of the sale (displayed to the customer) | [optional] 
**DiscountType** | Pointer to **string** | The type of discount, either &#x60;percentage&#x60; for deducting a percentage of each item, or &#x60;amount&#x60; to deduct a fixed amount from each item. | [optional] 
**Amount** | Pointer to **float32** | The amount or percentage to deduct | [optional] 

## Methods

### NewSale

`func NewSale() *Sale`

NewSale instantiates a new Sale object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSaleWithDefaults

`func NewSaleWithDefaults() *Sale`

NewSaleWithDefaults instantiates a new Sale object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *Sale) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *Sale) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *Sale) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *Sale) HasName() bool`

HasName returns a boolean if a field has been set.

### GetDiscountType

`func (o *Sale) GetDiscountType() string`

GetDiscountType returns the DiscountType field if non-nil, zero value otherwise.

### GetDiscountTypeOk

`func (o *Sale) GetDiscountTypeOk() (*string, bool)`

GetDiscountTypeOk returns a tuple with the DiscountType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDiscountType

`func (o *Sale) SetDiscountType(v string)`

SetDiscountType sets DiscountType field to given value.

### HasDiscountType

`func (o *Sale) HasDiscountType() bool`

HasDiscountType returns a boolean if a field has been set.

### GetAmount

`func (o *Sale) GetAmount() float32`

GetAmount returns the Amount field if non-nil, zero value otherwise.

### GetAmountOk

`func (o *Sale) GetAmountOk() (*float32, bool)`

GetAmountOk returns a tuple with the Amount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmount

`func (o *Sale) SetAmount(v float32)`

SetAmount sets Amount field to given value.

### HasAmount

`func (o *Sale) HasAmount() bool`

HasAmount returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


