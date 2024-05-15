# CheckoutRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Basket** | [**CheckoutRequestBasket**](CheckoutRequestBasket.md) |  | 
**Items** | [**[]CheckoutItem**](CheckoutItem.md) | An array of &#x60;Packages&#x60; in the basket. | 
**Sale** | Pointer to [**Sale**](Sale.md) |  | [optional] 

## Methods

### NewCheckoutRequest

`func NewCheckoutRequest(basket CheckoutRequestBasket, items []CheckoutItem, ) *CheckoutRequest`

NewCheckoutRequest instantiates a new CheckoutRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCheckoutRequestWithDefaults

`func NewCheckoutRequestWithDefaults() *CheckoutRequest`

NewCheckoutRequestWithDefaults instantiates a new CheckoutRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBasket

`func (o *CheckoutRequest) GetBasket() CheckoutRequestBasket`

GetBasket returns the Basket field if non-nil, zero value otherwise.

### GetBasketOk

`func (o *CheckoutRequest) GetBasketOk() (*CheckoutRequestBasket, bool)`

GetBasketOk returns a tuple with the Basket field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBasket

`func (o *CheckoutRequest) SetBasket(v CheckoutRequestBasket)`

SetBasket sets Basket field to given value.


### GetItems

`func (o *CheckoutRequest) GetItems() []CheckoutItem`

GetItems returns the Items field if non-nil, zero value otherwise.

### GetItemsOk

`func (o *CheckoutRequest) GetItemsOk() (*[]CheckoutItem, bool)`

GetItemsOk returns a tuple with the Items field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItems

`func (o *CheckoutRequest) SetItems(v []CheckoutItem)`

SetItems sets Items field to given value.


### GetSale

`func (o *CheckoutRequest) GetSale() Sale`

GetSale returns the Sale field if non-nil, zero value otherwise.

### GetSaleOk

`func (o *CheckoutRequest) GetSaleOk() (*Sale, bool)`

GetSaleOk returns a tuple with the Sale field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSale

`func (o *CheckoutRequest) SetSale(v Sale)`

SetSale sets Sale field to given value.

### HasSale

`func (o *CheckoutRequest) HasSale() bool`

HasSale returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


