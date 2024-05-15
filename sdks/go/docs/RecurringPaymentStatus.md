# RecurringPaymentStatus

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int32** |  | [optional] 
**Class** | Pointer to **string** |  | [optional] 
**Description** | Pointer to **string** |  | [optional] 
**Active** | Pointer to **int32** |  | [optional] 

## Methods

### NewRecurringPaymentStatus

`func NewRecurringPaymentStatus() *RecurringPaymentStatus`

NewRecurringPaymentStatus instantiates a new RecurringPaymentStatus object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRecurringPaymentStatusWithDefaults

`func NewRecurringPaymentStatusWithDefaults() *RecurringPaymentStatus`

NewRecurringPaymentStatusWithDefaults instantiates a new RecurringPaymentStatus object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *RecurringPaymentStatus) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *RecurringPaymentStatus) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *RecurringPaymentStatus) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *RecurringPaymentStatus) HasId() bool`

HasId returns a boolean if a field has been set.

### GetClass

`func (o *RecurringPaymentStatus) GetClass() string`

GetClass returns the Class field if non-nil, zero value otherwise.

### GetClassOk

`func (o *RecurringPaymentStatus) GetClassOk() (*string, bool)`

GetClassOk returns a tuple with the Class field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClass

`func (o *RecurringPaymentStatus) SetClass(v string)`

SetClass sets Class field to given value.

### HasClass

`func (o *RecurringPaymentStatus) HasClass() bool`

HasClass returns a boolean if a field has been set.

### GetDescription

`func (o *RecurringPaymentStatus) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *RecurringPaymentStatus) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *RecurringPaymentStatus) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *RecurringPaymentStatus) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetActive

`func (o *RecurringPaymentStatus) GetActive() int32`

GetActive returns the Active field if non-nil, zero value otherwise.

### GetActiveOk

`func (o *RecurringPaymentStatus) GetActiveOk() (*int32, bool)`

GetActiveOk returns a tuple with the Active field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActive

`func (o *RecurringPaymentStatus) SetActive(v int32)`

SetActive sets Active field to given value.

### HasActive

`func (o *RecurringPaymentStatus) HasActive() bool`

HasActive returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


