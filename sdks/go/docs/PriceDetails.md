# PriceDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FullPrice** | Pointer to **float32** |  | [optional] 
**SubTotal** | Pointer to **float32** |  | [optional] 
**Discounts** | Pointer to **[]map[string]interface{}** |  | [optional] 
**Total** | Pointer to **float32** |  | [optional] 
**Tax** | Pointer to **float32** |  | [optional] 
**Balance** | Pointer to **float32** |  | [optional] 
**Sales** | Pointer to [**[]Sale**](Sale.md) |  | [optional] 
**Giftcards** | Pointer to **[]map[string]interface{}** |  | [optional] 
**RoundUp** | Pointer to **NullableFloat32** |  | [optional] 

## Methods

### NewPriceDetails

`func NewPriceDetails() *PriceDetails`

NewPriceDetails instantiates a new PriceDetails object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPriceDetailsWithDefaults

`func NewPriceDetailsWithDefaults() *PriceDetails`

NewPriceDetailsWithDefaults instantiates a new PriceDetails object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFullPrice

`func (o *PriceDetails) GetFullPrice() float32`

GetFullPrice returns the FullPrice field if non-nil, zero value otherwise.

### GetFullPriceOk

`func (o *PriceDetails) GetFullPriceOk() (*float32, bool)`

GetFullPriceOk returns a tuple with the FullPrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullPrice

`func (o *PriceDetails) SetFullPrice(v float32)`

SetFullPrice sets FullPrice field to given value.

### HasFullPrice

`func (o *PriceDetails) HasFullPrice() bool`

HasFullPrice returns a boolean if a field has been set.

### GetSubTotal

`func (o *PriceDetails) GetSubTotal() float32`

GetSubTotal returns the SubTotal field if non-nil, zero value otherwise.

### GetSubTotalOk

`func (o *PriceDetails) GetSubTotalOk() (*float32, bool)`

GetSubTotalOk returns a tuple with the SubTotal field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubTotal

`func (o *PriceDetails) SetSubTotal(v float32)`

SetSubTotal sets SubTotal field to given value.

### HasSubTotal

`func (o *PriceDetails) HasSubTotal() bool`

HasSubTotal returns a boolean if a field has been set.

### GetDiscounts

`func (o *PriceDetails) GetDiscounts() []map[string]interface{}`

GetDiscounts returns the Discounts field if non-nil, zero value otherwise.

### GetDiscountsOk

`func (o *PriceDetails) GetDiscountsOk() (*[]map[string]interface{}, bool)`

GetDiscountsOk returns a tuple with the Discounts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDiscounts

`func (o *PriceDetails) SetDiscounts(v []map[string]interface{})`

SetDiscounts sets Discounts field to given value.

### HasDiscounts

`func (o *PriceDetails) HasDiscounts() bool`

HasDiscounts returns a boolean if a field has been set.

### GetTotal

`func (o *PriceDetails) GetTotal() float32`

GetTotal returns the Total field if non-nil, zero value otherwise.

### GetTotalOk

`func (o *PriceDetails) GetTotalOk() (*float32, bool)`

GetTotalOk returns a tuple with the Total field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotal

`func (o *PriceDetails) SetTotal(v float32)`

SetTotal sets Total field to given value.

### HasTotal

`func (o *PriceDetails) HasTotal() bool`

HasTotal returns a boolean if a field has been set.

### GetTax

`func (o *PriceDetails) GetTax() float32`

GetTax returns the Tax field if non-nil, zero value otherwise.

### GetTaxOk

`func (o *PriceDetails) GetTaxOk() (*float32, bool)`

GetTaxOk returns a tuple with the Tax field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTax

`func (o *PriceDetails) SetTax(v float32)`

SetTax sets Tax field to given value.

### HasTax

`func (o *PriceDetails) HasTax() bool`

HasTax returns a boolean if a field has been set.

### GetBalance

`func (o *PriceDetails) GetBalance() float32`

GetBalance returns the Balance field if non-nil, zero value otherwise.

### GetBalanceOk

`func (o *PriceDetails) GetBalanceOk() (*float32, bool)`

GetBalanceOk returns a tuple with the Balance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBalance

`func (o *PriceDetails) SetBalance(v float32)`

SetBalance sets Balance field to given value.

### HasBalance

`func (o *PriceDetails) HasBalance() bool`

HasBalance returns a boolean if a field has been set.

### GetSales

`func (o *PriceDetails) GetSales() []Sale`

GetSales returns the Sales field if non-nil, zero value otherwise.

### GetSalesOk

`func (o *PriceDetails) GetSalesOk() (*[]Sale, bool)`

GetSalesOk returns a tuple with the Sales field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSales

`func (o *PriceDetails) SetSales(v []Sale)`

SetSales sets Sales field to given value.

### HasSales

`func (o *PriceDetails) HasSales() bool`

HasSales returns a boolean if a field has been set.

### GetGiftcards

`func (o *PriceDetails) GetGiftcards() []map[string]interface{}`

GetGiftcards returns the Giftcards field if non-nil, zero value otherwise.

### GetGiftcardsOk

`func (o *PriceDetails) GetGiftcardsOk() (*[]map[string]interface{}, bool)`

GetGiftcardsOk returns a tuple with the Giftcards field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGiftcards

`func (o *PriceDetails) SetGiftcards(v []map[string]interface{})`

SetGiftcards sets Giftcards field to given value.

### HasGiftcards

`func (o *PriceDetails) HasGiftcards() bool`

HasGiftcards returns a boolean if a field has been set.

### GetRoundUp

`func (o *PriceDetails) GetRoundUp() float32`

GetRoundUp returns the RoundUp field if non-nil, zero value otherwise.

### GetRoundUpOk

`func (o *PriceDetails) GetRoundUpOk() (*float32, bool)`

GetRoundUpOk returns a tuple with the RoundUp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoundUp

`func (o *PriceDetails) SetRoundUp(v float32)`

SetRoundUp sets RoundUp field to given value.

### HasRoundUp

`func (o *PriceDetails) HasRoundUp() bool`

HasRoundUp returns a boolean if a field has been set.

### SetRoundUpNil

`func (o *PriceDetails) SetRoundUpNil(b bool)`

 SetRoundUpNil sets the value for RoundUp to be an explicit nil

### UnsetRoundUp
`func (o *PriceDetails) UnsetRoundUp()`

UnsetRoundUp ensures that no value is present for RoundUp, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


