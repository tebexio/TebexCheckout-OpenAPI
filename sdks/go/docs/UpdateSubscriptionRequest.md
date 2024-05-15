# UpdateSubscriptionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | Pointer to [**[]Package**](Package.md) | An array containing the item to be added to the recurring payment. **Only 1 item is supported at this time.** | [optional] 

## Methods

### NewUpdateSubscriptionRequest

`func NewUpdateSubscriptionRequest() *UpdateSubscriptionRequest`

NewUpdateSubscriptionRequest instantiates a new UpdateSubscriptionRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUpdateSubscriptionRequestWithDefaults

`func NewUpdateSubscriptionRequestWithDefaults() *UpdateSubscriptionRequest`

NewUpdateSubscriptionRequestWithDefaults instantiates a new UpdateSubscriptionRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItems

`func (o *UpdateSubscriptionRequest) GetItems() []Package`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *UpdateSubscriptionRequest) GetItemsOk() (*[]Package, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *UpdateSubscriptionRequest) SetItems(v []Package)`

SetItems sets Items field to given value.

### HasItems

`func (o *UpdateSubscriptionRequest) HasItems() bool`

HasItems returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


