# BasketItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Qty** | Pointer to **int32** | The quantity of &#x60;package&#x60; in this basket. This is not the total quantity of overall items in the basket. | [optional] 
**Type** | Pointer to **string** | The type of payment, either &#x60;single&#x60; for one-time payments or &#x60;subscription&#x60;. | [optional] 
**RevenueShare** | Pointer to [**[]RevenueShare**](RevenueShare.md) | An array of payment destination objects describing how the purchase should be split between multiple wallets. **Only available with pre-agreement from Tebex.** | [optional] 

## Methods

### NewBasketItem

`func NewBasketItem() *BasketItem`

NewBasketItem instantiates a new BasketItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBasketItemWithDefaults

`func NewBasketItemWithDefaults() *BasketItem`

NewBasketItemWithDefaults instantiates a new BasketItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetQty

`func (o *BasketItem) GetQty() int32`

GetQty returns the Qty field if non-nil, zero value otherwise.

### GetQtyOk

`func (o *BasketItem) GetQtyOk() (*int32, bool)`

GetQtyOk returns a tuple with the Qty field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQty

`func (o *BasketItem) SetQty(v int32)`

SetQty sets Qty field to given value.

### HasQty

`func (o *BasketItem) HasQty() bool`

HasQty returns a boolean if a field has been set.

### GetType

`func (o *BasketItem) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *BasketItem) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *BasketItem) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *BasketItem) HasType() bool`

HasType returns a boolean if a field has been set.

### GetRevenueShare

`func (o *BasketItem) GetRevenueShare() []RevenueShare`

GetRevenueShare returns the RevenueShare field if non-nil, zero value otherwise.

### GetRevenueShareOk

`func (o *BasketItem) GetRevenueShareOk() (*[]RevenueShare, bool)`

GetRevenueShareOk returns a tuple with the RevenueShare field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRevenueShare

`func (o *BasketItem) SetRevenueShare(v []RevenueShare)`

SetRevenueShare sets RevenueShare field to given value.

### HasRevenueShare

`func (o *BasketItem) HasRevenueShare() bool`

HasRevenueShare returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


