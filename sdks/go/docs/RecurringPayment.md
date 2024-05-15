# RecurringPayment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int32** |  | [optional] 
**CreatedAt** | Pointer to **time.Time** |  | [optional] 
**UpdatedAt** | Pointer to **time.Time** |  | [optional] 
**PausedAt** | Pointer to **NullableTime** |  | [optional] 
**PausedUntil** | Pointer to **NullableTime** |  | [optional] 
**NextPaymentDate** | Pointer to **string** |  | [optional] 
**Reference** | Pointer to **string** |  | [optional] 
**AccountId** | Pointer to **int32** |  | [optional] 
**Interval** | Pointer to **string** |  | [optional] 
**CancelledAt** | Pointer to **NullableTime** |  | [optional] 
**Status** | Pointer to [**RecurringPaymentStatus**](RecurringPaymentStatus.md) |  | [optional] 
**Amount** | Pointer to [**RecurringPaymentAmount**](RecurringPaymentAmount.md) |  | [optional] 
**CancelReason** | Pointer to **NullableString** |  | [optional] 
**Links** | Pointer to [**RecurringPaymentLinks**](RecurringPaymentLinks.md) |  | [optional] 

## Methods

### NewRecurringPayment

`func NewRecurringPayment() *RecurringPayment`

NewRecurringPayment instantiates a new RecurringPayment object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRecurringPaymentWithDefaults

`func NewRecurringPaymentWithDefaults() *RecurringPayment`

NewRecurringPaymentWithDefaults instantiates a new RecurringPayment object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *RecurringPayment) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *RecurringPayment) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *RecurringPayment) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *RecurringPayment) HasId() bool`

HasId returns a boolean if a field has been set.

### GetCreatedAt

`func (o *RecurringPayment) GetCreatedAt() time.Time`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *RecurringPayment) GetCreatedAtOk() (*time.Time, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *RecurringPayment) SetCreatedAt(v time.Time)`

SetCreatedAt sets CreatedAt field to given value.

### HasCreatedAt

`func (o *RecurringPayment) HasCreatedAt() bool`

HasCreatedAt returns a boolean if a field has been set.

### GetUpdatedAt

`func (o *RecurringPayment) GetUpdatedAt() time.Time`

GetUpdatedAt returns the UpdatedAt field if non-nil, zero value otherwise.

### GetUpdatedAtOk

`func (o *RecurringPayment) GetUpdatedAtOk() (*time.Time, bool)`

GetUpdatedAtOk returns a tuple with the UpdatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedAt

`func (o *RecurringPayment) SetUpdatedAt(v time.Time)`

SetUpdatedAt sets UpdatedAt field to given value.

### HasUpdatedAt

`func (o *RecurringPayment) HasUpdatedAt() bool`

HasUpdatedAt returns a boolean if a field has been set.

### GetPausedAt

`func (o *RecurringPayment) GetPausedAt() time.Time`

GetPausedAt returns the PausedAt field if non-nil, zero value otherwise.

### GetPausedAtOk

`func (o *RecurringPayment) GetPausedAtOk() (*time.Time, bool)`

GetPausedAtOk returns a tuple with the PausedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPausedAt

`func (o *RecurringPayment) SetPausedAt(v time.Time)`

SetPausedAt sets PausedAt field to given value.

### HasPausedAt

`func (o *RecurringPayment) HasPausedAt() bool`

HasPausedAt returns a boolean if a field has been set.

### SetPausedAtNil

`func (o *RecurringPayment) SetPausedAtNil(b bool)`

 SetPausedAtNil sets the value for PausedAt to be an explicit nil

### UnsetPausedAt
`func (o *RecurringPayment) UnsetPausedAt()`

UnsetPausedAt ensures that no value is present for PausedAt, not even an explicit nil
### GetPausedUntil

`func (o *RecurringPayment) GetPausedUntil() time.Time`

GetPausedUntil returns the PausedUntil field if non-nil, zero value otherwise.

### GetPausedUntilOk

`func (o *RecurringPayment) GetPausedUntilOk() (*time.Time, bool)`

GetPausedUntilOk returns a tuple with the PausedUntil field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPausedUntil

`func (o *RecurringPayment) SetPausedUntil(v time.Time)`

SetPausedUntil sets PausedUntil field to given value.

### HasPausedUntil

`func (o *RecurringPayment) HasPausedUntil() bool`

HasPausedUntil returns a boolean if a field has been set.

### SetPausedUntilNil

`func (o *RecurringPayment) SetPausedUntilNil(b bool)`

 SetPausedUntilNil sets the value for PausedUntil to be an explicit nil

### UnsetPausedUntil
`func (o *RecurringPayment) UnsetPausedUntil()`

UnsetPausedUntil ensures that no value is present for PausedUntil, not even an explicit nil
### GetNextPaymentDate

`func (o *RecurringPayment) GetNextPaymentDate() string`

GetNextPaymentDate returns the NextPaymentDate field if non-nil, zero value otherwise.

### GetNextPaymentDateOk

`func (o *RecurringPayment) GetNextPaymentDateOk() (*string, bool)`

GetNextPaymentDateOk returns a tuple with the NextPaymentDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextPaymentDate

`func (o *RecurringPayment) SetNextPaymentDate(v string)`

SetNextPaymentDate sets NextPaymentDate field to given value.

### HasNextPaymentDate

`func (o *RecurringPayment) HasNextPaymentDate() bool`

HasNextPaymentDate returns a boolean if a field has been set.

### GetReference

`func (o *RecurringPayment) GetReference() string`

GetReference returns the Reference field if non-nil, zero value otherwise.

### GetReferenceOk

`func (o *RecurringPayment) GetReferenceOk() (*string, bool)`

GetReferenceOk returns a tuple with the Reference field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReference

`func (o *RecurringPayment) SetReference(v string)`

SetReference sets Reference field to given value.

### HasReference

`func (o *RecurringPayment) HasReference() bool`

HasReference returns a boolean if a field has been set.

### GetAccountId

`func (o *RecurringPayment) GetAccountId() int32`

GetAccountId returns the AccountId field if non-nil, zero value otherwise.

### GetAccountIdOk

`func (o *RecurringPayment) GetAccountIdOk() (*int32, bool)`

GetAccountIdOk returns a tuple with the AccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAccountId

`func (o *RecurringPayment) SetAccountId(v int32)`

SetAccountId sets AccountId field to given value.

### HasAccountId

`func (o *RecurringPayment) HasAccountId() bool`

HasAccountId returns a boolean if a field has been set.

### GetInterval

`func (o *RecurringPayment) GetInterval() string`

GetInterval returns the Interval field if non-nil, zero value otherwise.

### GetIntervalOk

`func (o *RecurringPayment) GetIntervalOk() (*string, bool)`

GetIntervalOk returns a tuple with the Interval field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInterval

`func (o *RecurringPayment) SetInterval(v string)`

SetInterval sets Interval field to given value.

### HasInterval

`func (o *RecurringPayment) HasInterval() bool`

HasInterval returns a boolean if a field has been set.

### GetCancelledAt

`func (o *RecurringPayment) GetCancelledAt() time.Time`

GetCancelledAt returns the CancelledAt field if non-nil, zero value otherwise.

### GetCancelledAtOk

`func (o *RecurringPayment) GetCancelledAtOk() (*time.Time, bool)`

GetCancelledAtOk returns a tuple with the CancelledAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCancelledAt

`func (o *RecurringPayment) SetCancelledAt(v time.Time)`

SetCancelledAt sets CancelledAt field to given value.

### HasCancelledAt

`func (o *RecurringPayment) HasCancelledAt() bool`

HasCancelledAt returns a boolean if a field has been set.

### SetCancelledAtNil

`func (o *RecurringPayment) SetCancelledAtNil(b bool)`

 SetCancelledAtNil sets the value for CancelledAt to be an explicit nil

### UnsetCancelledAt
`func (o *RecurringPayment) UnsetCancelledAt()`

UnsetCancelledAt ensures that no value is present for CancelledAt, not even an explicit nil
### GetStatus

`func (o *RecurringPayment) GetStatus() RecurringPaymentStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *RecurringPayment) GetStatusOk() (*RecurringPaymentStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *RecurringPayment) SetStatus(v RecurringPaymentStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *RecurringPayment) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetAmount

`func (o *RecurringPayment) GetAmount() RecurringPaymentAmount`

GetAmount returns the Amount field if non-nil, zero value otherwise.

### GetAmountOk

`func (o *RecurringPayment) GetAmountOk() (*RecurringPaymentAmount, bool)`

GetAmountOk returns a tuple with the Amount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAmount

`func (o *RecurringPayment) SetAmount(v RecurringPaymentAmount)`

SetAmount sets Amount field to given value.

### HasAmount

`func (o *RecurringPayment) HasAmount() bool`

HasAmount returns a boolean if a field has been set.

### GetCancelReason

`func (o *RecurringPayment) GetCancelReason() string`

GetCancelReason returns the CancelReason field if non-nil, zero value otherwise.

### GetCancelReasonOk

`func (o *RecurringPayment) GetCancelReasonOk() (*string, bool)`

GetCancelReasonOk returns a tuple with the CancelReason field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCancelReason

`func (o *RecurringPayment) SetCancelReason(v string)`

SetCancelReason sets CancelReason field to given value.

### HasCancelReason

`func (o *RecurringPayment) HasCancelReason() bool`

HasCancelReason returns a boolean if a field has been set.

### SetCancelReasonNil

`func (o *RecurringPayment) SetCancelReasonNil(b bool)`

 SetCancelReasonNil sets the value for CancelReason to be an explicit nil

### UnsetCancelReason
`func (o *RecurringPayment) UnsetCancelReason()`

UnsetCancelReason ensures that no value is present for CancelReason, not even an explicit nil
### GetLinks

`func (o *RecurringPayment) GetLinks() RecurringPaymentLinks`

GetLinks returns the Links field if non-nil, zero value otherwise.

### GetLinksOk

`func (o *RecurringPayment) GetLinksOk() (*RecurringPaymentLinks, bool)`

GetLinksOk returns a tuple with the Links field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLinks

`func (o *RecurringPayment) SetLinks(v RecurringPaymentLinks)`

SetLinks sets Links field to given value.

### HasLinks

`func (o *RecurringPayment) HasLinks() bool`

HasLinks returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


