# RecurringPaymentAmount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Amount** | Pointer to **float32** |  | [optional] 
**Tax** | Pointer to **float32** |  | [optional] 
**Period** | Pointer to **string** |  | [optional] 

## Methods

### NewRecurringPaymentAmount

`func NewRecurringPaymentAmount() *RecurringPaymentAmount`

NewRecurringPaymentAmount instantiates a new RecurringPaymentAmount object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRecurringPaymentAmountWithDefaults

`func NewRecurringPaymentAmountWithDefaults() *RecurringPaymentAmount`

NewRecurringPaymentAmountWithDefaults instantiates a new RecurringPaymentAmount object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAmount

`func (o *RecurringPaymentAmount) GetAmount() float32`

GetAmount returns the Amount field if non-nil, zero value otherwise.

### GetAmountOk

`func (o *RecurringPaymentAmount) GetAmountOk() (*float32, bool)`

GetAmountOk returns a tuple with the Amount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmount

`func (o *RecurringPaymentAmount) SetAmount(v float32)`

SetAmount sets Amount field to given value.

### HasAmount

`func (o *RecurringPaymentAmount) HasAmount() bool`

HasAmount returns a boolean if a field has been set.

### GetTax

`func (o *RecurringPaymentAmount) GetTax() float32`

GetTax returns the Tax field if non-nil, zero value otherwise.

### GetTaxOk

`func (o *RecurringPaymentAmount) GetTaxOk() (*float32, bool)`

GetTaxOk returns a tuple with the Tax field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTax

`func (o *RecurringPaymentAmount) SetTax(v float32)`

SetTax sets Tax field to given value.

### HasTax

`func (o *RecurringPaymentAmount) HasTax() bool`

HasTax returns a boolean if a field has been set.

### GetPeriod

`func (o *RecurringPaymentAmount) GetPeriod() string`

GetPeriod returns the Period field if non-nil, zero value otherwise.

### GetPeriodOk

`func (o *RecurringPaymentAmount) GetPeriodOk() (*string, bool)`

GetPeriodOk returns a tuple with the Period field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPeriod

`func (o *RecurringPaymentAmount) SetPeriod(v string)`

SetPeriod sets Period field to given value.

### HasPeriod

`func (o *RecurringPaymentAmount) HasPeriod() bool`

HasPeriod returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


