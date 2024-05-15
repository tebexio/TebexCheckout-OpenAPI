# PaymentProductsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **NullableString** |  | [optional] 
**Name** | Pointer to **string** |  | [optional] 
**Quantity** | Pointer to **int32** |  | [optional] 
**BasePrice** | Pointer to [**PaymentProductsInnerBasePrice**](PaymentProductsInnerBasePrice.md) |  | [optional] 
**PaidPrice** | Pointer to [**PaymentProductsInnerBasePrice**](PaymentProductsInnerBasePrice.md) |  | [optional] 
**Variables** | Pointer to **[]string** |  | [optional] 
**ExpiresAt** | Pointer to **NullableTime** |  | [optional] 
**Custom** | Pointer to **string** |  | [optional] 
**Username** | Pointer to **NullableString** |  | [optional] 

## Methods

### NewPaymentProductsInner

`func NewPaymentProductsInner() *PaymentProductsInner`

NewPaymentProductsInner instantiates a new PaymentProductsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPaymentProductsInnerWithDefaults

`func NewPaymentProductsInnerWithDefaults() *PaymentProductsInner`

NewPaymentProductsInnerWithDefaults instantiates a new PaymentProductsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *PaymentProductsInner) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *PaymentProductsInner) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *PaymentProductsInner) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *PaymentProductsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### SetIdNil

`func (o *PaymentProductsInner) SetIdNil(b bool)`

 SetIdNil sets the value for Id to be an explicit nil

### UnsetId
`func (o *PaymentProductsInner) UnsetId()`

UnsetId ensures that no value is present for Id, not even an explicit nil
### GetName

`func (o *PaymentProductsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *PaymentProductsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *PaymentProductsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *PaymentProductsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetQuantity

`func (o *PaymentProductsInner) GetQuantity() int32`

GetQuantity returns the Quantity field if non-nil, zero value otherwise.

### GetQuantityOk

`func (o *PaymentProductsInner) GetQuantityOk() (*int32, bool)`

GetQuantityOk returns a tuple with the Quantity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuantity

`func (o *PaymentProductsInner) SetQuantity(v int32)`

SetQuantity sets Quantity field to given value.

### HasQuantity

`func (o *PaymentProductsInner) HasQuantity() bool`

HasQuantity returns a boolean if a field has been set.

### GetBasePrice

`func (o *PaymentProductsInner) GetBasePrice() PaymentProductsInnerBasePrice`

GetBasePrice returns the BasePrice field if non-nil, zero value otherwise.

### GetBasePriceOk

`func (o *PaymentProductsInner) GetBasePriceOk() (*PaymentProductsInnerBasePrice, bool)`

GetBasePriceOk returns a tuple with the BasePrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBasePrice

`func (o *PaymentProductsInner) SetBasePrice(v PaymentProductsInnerBasePrice)`

SetBasePrice sets BasePrice field to given value.

### HasBasePrice

`func (o *PaymentProductsInner) HasBasePrice() bool`

HasBasePrice returns a boolean if a field has been set.

### GetPaidPrice

`func (o *PaymentProductsInner) GetPaidPrice() PaymentProductsInnerBasePrice`

GetPaidPrice returns the PaidPrice field if non-nil, zero value otherwise.

### GetPaidPriceOk

`func (o *PaymentProductsInner) GetPaidPriceOk() (*PaymentProductsInnerBasePrice, bool)`

GetPaidPriceOk returns a tuple with the PaidPrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaidPrice

`func (o *PaymentProductsInner) SetPaidPrice(v PaymentProductsInnerBasePrice)`

SetPaidPrice sets PaidPrice field to given value.

### HasPaidPrice

`func (o *PaymentProductsInner) HasPaidPrice() bool`

HasPaidPrice returns a boolean if a field has been set.

### GetVariables

`func (o *PaymentProductsInner) GetVariables() []string`

GetVariables returns the Variables field if non-nil, zero value otherwise.

### GetVariablesOk

`func (o *PaymentProductsInner) GetVariablesOk() (*[]string, bool)`

GetVariablesOk returns a tuple with the Variables field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVariables

`func (o *PaymentProductsInner) SetVariables(v []string)`

SetVariables sets Variables field to given value.

### HasVariables

`func (o *PaymentProductsInner) HasVariables() bool`

HasVariables returns a boolean if a field has been set.

### GetExpiresAt

`func (o *PaymentProductsInner) GetExpiresAt() time.Time`

GetExpiresAt returns the ExpiresAt field if non-nil, zero value otherwise.

### GetExpiresAtOk

`func (o *PaymentProductsInner) GetExpiresAtOk() (*time.Time, bool)`

GetExpiresAtOk returns a tuple with the ExpiresAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiresAt

`func (o *PaymentProductsInner) SetExpiresAt(v time.Time)`

SetExpiresAt sets ExpiresAt field to given value.

### HasExpiresAt

`func (o *PaymentProductsInner) HasExpiresAt() bool`

HasExpiresAt returns a boolean if a field has been set.

### SetExpiresAtNil

`func (o *PaymentProductsInner) SetExpiresAtNil(b bool)`

 SetExpiresAtNil sets the value for ExpiresAt to be an explicit nil

### UnsetExpiresAt
`func (o *PaymentProductsInner) UnsetExpiresAt()`

UnsetExpiresAt ensures that no value is present for ExpiresAt, not even an explicit nil
### GetCustom

`func (o *PaymentProductsInner) GetCustom() string`

GetCustom returns the Custom field if non-nil, zero value otherwise.

### GetCustomOk

`func (o *PaymentProductsInner) GetCustomOk() (*string, bool)`

GetCustomOk returns a tuple with the Custom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustom

`func (o *PaymentProductsInner) SetCustom(v string)`

SetCustom sets Custom field to given value.

### HasCustom

`func (o *PaymentProductsInner) HasCustom() bool`

HasCustom returns a boolean if a field has been set.

### GetUsername

`func (o *PaymentProductsInner) GetUsername() string`

GetUsername returns the Username field if non-nil, zero value otherwise.

### GetUsernameOk

`func (o *PaymentProductsInner) GetUsernameOk() (*string, bool)`

GetUsernameOk returns a tuple with the Username field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsername

`func (o *PaymentProductsInner) SetUsername(v string)`

SetUsername sets Username field to given value.

### HasUsername

`func (o *PaymentProductsInner) HasUsername() bool`

HasUsername returns a boolean if a field has been set.

### SetUsernameNil

`func (o *PaymentProductsInner) SetUsernameNil(b bool)`

 SetUsernameNil sets the value for Username to be an explicit nil

### UnsetUsername
`func (o *PaymentProductsInner) UnsetUsername()`

UnsetUsername ensures that no value is present for Username, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


