# UpdateRecurringPaymentRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | **string** | Your desired state of the recurring payment. Provide &#x60;Paused&#x60; with &#x60;paused_until&#x60; to pause a recurring payment. Otherwise, provide &#x60;Active&#x60; to resume a recurring payment. | 
**PausedUntil** | Pointer to **string** | To pause a payment, provide a ISO8601 formatted date on which the payment should be reactivated. | [optional] 

## Methods

### NewUpdateRecurringPaymentRequest

`func NewUpdateRecurringPaymentRequest(status string, ) *UpdateRecurringPaymentRequest`

NewUpdateRecurringPaymentRequest instantiates a new UpdateRecurringPaymentRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateRecurringPaymentRequestWithDefaults

`func NewUpdateRecurringPaymentRequestWithDefaults() *UpdateRecurringPaymentRequest`

NewUpdateRecurringPaymentRequestWithDefaults instantiates a new UpdateRecurringPaymentRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *UpdateRecurringPaymentRequest) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *UpdateRecurringPaymentRequest) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *UpdateRecurringPaymentRequest) SetStatus(v string)`

SetStatus sets Status field to given value.


### GetPausedUntil

`func (o *UpdateRecurringPaymentRequest) GetPausedUntil() string`

GetPausedUntil returns the PausedUntil field if non-nil, zero value otherwise.

### GetPausedUntilOk

`func (o *UpdateRecurringPaymentRequest) GetPausedUntilOk() (*string, bool)`

GetPausedUntilOk returns a tuple with the PausedUntil field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPausedUntil

`func (o *UpdateRecurringPaymentRequest) SetPausedUntil(v string)`

SetPausedUntil sets PausedUntil field to given value.

### HasPausedUntil

`func (o *UpdateRecurringPaymentRequest) HasPausedUntil() bool`

HasPausedUntil returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


