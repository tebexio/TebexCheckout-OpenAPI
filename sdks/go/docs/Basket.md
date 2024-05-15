# Basket

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ident** | Pointer to **string** |  | [optional] 
**Expire** | Pointer to **string** |  | [optional] 
**Price** | Pointer to **float32** |  | [optional] 
**PriceDetails** | Pointer to [**PriceDetails**](PriceDetails.md) |  | [optional] 
**Type** | Pointer to **string** |  | [optional] 
**Recurring** | Pointer to **bool** |  | [optional] 
**RecurringPeriod** | Pointer to **map[string]interface{}** |  | [optional] 
**RecurringNextPaymentDate** | Pointer to **NullableString** |  | [optional] 
**IsPaymentMethodUpdate** | Pointer to **bool** |  | [optional] 
**ReturnUrl** | Pointer to **NullableString** |  | [optional] 
**Complete** | Pointer to **bool** |  | [optional] 
**Tax** | Pointer to **map[string]interface{}** |  | [optional] 
**Username** | Pointer to **NullableString** |  | [optional] 
**Discounts** | Pointer to **[]map[string]interface{}** |  | [optional] 
**Coupons** | Pointer to **[]map[string]interface{}** |  | [optional] 
**Giftcards** | Pointer to **[]map[string]interface{}** |  | [optional] 
**Address** | Pointer to [**Address**](Address.md) |  | [optional] 
**Rows** | Pointer to [**[]BasketItem**](BasketItem.md) |  | [optional] 
**Fingerprint** | Pointer to **NullableString** | Browser fingerprint to identify the user | [optional] 
**CreatorCode** | Pointer to **string** | The creator code is used to share a percentage of the payment with another party. See more about creator codes at https://docs.tebex.io/creators/tebex-control-panel/engagement/creator-codes | [optional] 
**Roundup** | Pointer to **NullableBool** |  | [optional] 
**CancelUrl** | Pointer to **string** |  | [optional] 
**CompleteUrl** | Pointer to **NullableString** |  | [optional] 
**CompleteAutoRedirect** | Pointer to **bool** |  | [optional] 
**Custom** | Pointer to **map[string]interface{}** |  | [optional] 
**Links** | Pointer to [**BasketLinks**](BasketLinks.md) |  | [optional] 

## Methods

### NewBasket

`func NewBasket() *Basket`

NewBasket instantiates a new Basket object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBasketWithDefaults

`func NewBasketWithDefaults() *Basket`

NewBasketWithDefaults instantiates a new Basket object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIdent

`func (o *Basket) GetIdent() string`

GetIdent returns the Ident field if non-nil, zero value otherwise.

### GetIdentOk

`func (o *Basket) GetIdentOk() (*string, bool)`

GetIdentOk returns a tuple with the Ident field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdent

`func (o *Basket) SetIdent(v string)`

SetIdent sets Ident field to given value.

### HasIdent

`func (o *Basket) HasIdent() bool`

HasIdent returns a boolean if a field has been set.

### GetExpire

`func (o *Basket) GetExpire() string`

GetExpire returns the Expire field if non-nil, zero value otherwise.

### GetExpireOk

`func (o *Basket) GetExpireOk() (*string, bool)`

GetExpireOk returns a tuple with the Expire field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpire

`func (o *Basket) SetExpire(v string)`

SetExpire sets Expire field to given value.

### HasExpire

`func (o *Basket) HasExpire() bool`

HasExpire returns a boolean if a field has been set.

### GetPrice

`func (o *Basket) GetPrice() float32`

GetPrice returns the Price field if non-nil, zero value otherwise.

### GetPriceOk

`func (o *Basket) GetPriceOk() (*float32, bool)`

GetPriceOk returns a tuple with the Price field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice

`func (o *Basket) SetPrice(v float32)`

SetPrice sets Price field to given value.

### HasPrice

`func (o *Basket) HasPrice() bool`

HasPrice returns a boolean if a field has been set.

### GetPriceDetails

`func (o *Basket) GetPriceDetails() PriceDetails`

GetPriceDetails returns the PriceDetails field if non-nil, zero value otherwise.

### GetPriceDetailsOk

`func (o *Basket) GetPriceDetailsOk() (*PriceDetails, bool)`

GetPriceDetailsOk returns a tuple with the PriceDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPriceDetails

`func (o *Basket) SetPriceDetails(v PriceDetails)`

SetPriceDetails sets PriceDetails field to given value.

### HasPriceDetails

`func (o *Basket) HasPriceDetails() bool`

HasPriceDetails returns a boolean if a field has been set.

### GetType

`func (o *Basket) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *Basket) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *Basket) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *Basket) HasType() bool`

HasType returns a boolean if a field has been set.

### GetRecurring

`func (o *Basket) GetRecurring() bool`

GetRecurring returns the Recurring field if non-nil, zero value otherwise.

### GetRecurringOk

`func (o *Basket) GetRecurringOk() (*bool, bool)`

GetRecurringOk returns a tuple with the Recurring field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecurring

`func (o *Basket) SetRecurring(v bool)`

SetRecurring sets Recurring field to given value.

### HasRecurring

`func (o *Basket) HasRecurring() bool`

HasRecurring returns a boolean if a field has been set.

### GetRecurringPeriod

`func (o *Basket) GetRecurringPeriod() map[string]interface{}`

GetRecurringPeriod returns the RecurringPeriod field if non-nil, zero value otherwise.

### GetRecurringPeriodOk

`func (o *Basket) GetRecurringPeriodOk() (*map[string]interface{}, bool)`

GetRecurringPeriodOk returns a tuple with the RecurringPeriod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecurringPeriod

`func (o *Basket) SetRecurringPeriod(v map[string]interface{})`

SetRecurringPeriod sets RecurringPeriod field to given value.

### HasRecurringPeriod

`func (o *Basket) HasRecurringPeriod() bool`

HasRecurringPeriod returns a boolean if a field has been set.

### GetRecurringNextPaymentDate

`func (o *Basket) GetRecurringNextPaymentDate() string`

GetRecurringNextPaymentDate returns the RecurringNextPaymentDate field if non-nil, zero value otherwise.

### GetRecurringNextPaymentDateOk

`func (o *Basket) GetRecurringNextPaymentDateOk() (*string, bool)`

GetRecurringNextPaymentDateOk returns a tuple with the RecurringNextPaymentDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecurringNextPaymentDate

`func (o *Basket) SetRecurringNextPaymentDate(v string)`

SetRecurringNextPaymentDate sets RecurringNextPaymentDate field to given value.

### HasRecurringNextPaymentDate

`func (o *Basket) HasRecurringNextPaymentDate() bool`

HasRecurringNextPaymentDate returns a boolean if a field has been set.

### SetRecurringNextPaymentDateNil

`func (o *Basket) SetRecurringNextPaymentDateNil(b bool)`

 SetRecurringNextPaymentDateNil sets the value for RecurringNextPaymentDate to be an explicit nil

### UnsetRecurringNextPaymentDate
`func (o *Basket) UnsetRecurringNextPaymentDate()`

UnsetRecurringNextPaymentDate ensures that no value is present for RecurringNextPaymentDate, not even an explicit nil
### GetIsPaymentMethodUpdate

`func (o *Basket) GetIsPaymentMethodUpdate() bool`

GetIsPaymentMethodUpdate returns the IsPaymentMethodUpdate field if non-nil, zero value otherwise.

### GetIsPaymentMethodUpdateOk

`func (o *Basket) GetIsPaymentMethodUpdateOk() (*bool, bool)`

GetIsPaymentMethodUpdateOk returns a tuple with the IsPaymentMethodUpdate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsPaymentMethodUpdate

`func (o *Basket) SetIsPaymentMethodUpdate(v bool)`

SetIsPaymentMethodUpdate sets IsPaymentMethodUpdate field to given value.

### HasIsPaymentMethodUpdate

`func (o *Basket) HasIsPaymentMethodUpdate() bool`

HasIsPaymentMethodUpdate returns a boolean if a field has been set.

### GetReturnUrl

`func (o *Basket) GetReturnUrl() string`

GetReturnUrl returns the ReturnUrl field if non-nil, zero value otherwise.

### GetReturnUrlOk

`func (o *Basket) GetReturnUrlOk() (*string, bool)`

GetReturnUrlOk returns a tuple with the ReturnUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReturnUrl

`func (o *Basket) SetReturnUrl(v string)`

SetReturnUrl sets ReturnUrl field to given value.

### HasReturnUrl

`func (o *Basket) HasReturnUrl() bool`

HasReturnUrl returns a boolean if a field has been set.

### SetReturnUrlNil

`func (o *Basket) SetReturnUrlNil(b bool)`

 SetReturnUrlNil sets the value for ReturnUrl to be an explicit nil

### UnsetReturnUrl
`func (o *Basket) UnsetReturnUrl()`

UnsetReturnUrl ensures that no value is present for ReturnUrl, not even an explicit nil
### GetComplete

`func (o *Basket) GetComplete() bool`

GetComplete returns the Complete field if non-nil, zero value otherwise.

### GetCompleteOk

`func (o *Basket) GetCompleteOk() (*bool, bool)`

GetCompleteOk returns a tuple with the Complete field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComplete

`func (o *Basket) SetComplete(v bool)`

SetComplete sets Complete field to given value.

### HasComplete

`func (o *Basket) HasComplete() bool`

HasComplete returns a boolean if a field has been set.

### GetTax

`func (o *Basket) GetTax() map[string]interface{}`

GetTax returns the Tax field if non-nil, zero value otherwise.

### GetTaxOk

`func (o *Basket) GetTaxOk() (*map[string]interface{}, bool)`

GetTaxOk returns a tuple with the Tax field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTax

`func (o *Basket) SetTax(v map[string]interface{})`

SetTax sets Tax field to given value.

### HasTax

`func (o *Basket) HasTax() bool`

HasTax returns a boolean if a field has been set.

### GetUsername

`func (o *Basket) GetUsername() string`

GetUsername returns the Username field if non-nil, zero value otherwise.

### GetUsernameOk

`func (o *Basket) GetUsernameOk() (*string, bool)`

GetUsernameOk returns a tuple with the Username field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsername

`func (o *Basket) SetUsername(v string)`

SetUsername sets Username field to given value.

### HasUsername

`func (o *Basket) HasUsername() bool`

HasUsername returns a boolean if a field has been set.

### SetUsernameNil

`func (o *Basket) SetUsernameNil(b bool)`

 SetUsernameNil sets the value for Username to be an explicit nil

### UnsetUsername
`func (o *Basket) UnsetUsername()`

UnsetUsername ensures that no value is present for Username, not even an explicit nil
### GetDiscounts

`func (o *Basket) GetDiscounts() []map[string]interface{}`

GetDiscounts returns the Discounts field if non-nil, zero value otherwise.

### GetDiscountsOk

`func (o *Basket) GetDiscountsOk() (*[]map[string]interface{}, bool)`

GetDiscountsOk returns a tuple with the Discounts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDiscounts

`func (o *Basket) SetDiscounts(v []map[string]interface{})`

SetDiscounts sets Discounts field to given value.

### HasDiscounts

`func (o *Basket) HasDiscounts() bool`

HasDiscounts returns a boolean if a field has been set.

### GetCoupons

`func (o *Basket) GetCoupons() []map[string]interface{}`

GetCoupons returns the Coupons field if non-nil, zero value otherwise.

### GetCouponsOk

`func (o *Basket) GetCouponsOk() (*[]map[string]interface{}, bool)`

GetCouponsOk returns a tuple with the Coupons field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoupons

`func (o *Basket) SetCoupons(v []map[string]interface{})`

SetCoupons sets Coupons field to given value.

### HasCoupons

`func (o *Basket) HasCoupons() bool`

HasCoupons returns a boolean if a field has been set.

### GetGiftcards

`func (o *Basket) GetGiftcards() []map[string]interface{}`

GetGiftcards returns the Giftcards field if non-nil, zero value otherwise.

### GetGiftcardsOk

`func (o *Basket) GetGiftcardsOk() (*[]map[string]interface{}, bool)`

GetGiftcardsOk returns a tuple with the Giftcards field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGiftcards

`func (o *Basket) SetGiftcards(v []map[string]interface{})`

SetGiftcards sets Giftcards field to given value.

### HasGiftcards

`func (o *Basket) HasGiftcards() bool`

HasGiftcards returns a boolean if a field has been set.

### GetAddress

`func (o *Basket) GetAddress() Address`

GetAddress returns the Address field if non-nil, zero value otherwise.

### GetAddressOk

`func (o *Basket) GetAddressOk() (*Address, bool)`

GetAddressOk returns a tuple with the Address field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddress

`func (o *Basket) SetAddress(v Address)`

SetAddress sets Address field to given value.

### HasAddress

`func (o *Basket) HasAddress() bool`

HasAddress returns a boolean if a field has been set.

### GetRows

`func (o *Basket) GetRows() []BasketItem`

GetRows returns the Rows field if non-nil, zero value otherwise.

### GetRowsOk

`func (o *Basket) GetRowsOk() (*[]BasketItem, bool)`

GetRowsOk returns a tuple with the Rows field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRows

`func (o *Basket) SetRows(v []BasketItem)`

SetRows sets Rows field to given value.

### HasRows

`func (o *Basket) HasRows() bool`

HasRows returns a boolean if a field has been set.

### GetFingerprint

`func (o *Basket) GetFingerprint() string`

GetFingerprint returns the Fingerprint field if non-nil, zero value otherwise.

### GetFingerprintOk

`func (o *Basket) GetFingerprintOk() (*string, bool)`

GetFingerprintOk returns a tuple with the Fingerprint field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFingerprint

`func (o *Basket) SetFingerprint(v string)`

SetFingerprint sets Fingerprint field to given value.

### HasFingerprint

`func (o *Basket) HasFingerprint() bool`

HasFingerprint returns a boolean if a field has been set.

### SetFingerprintNil

`func (o *Basket) SetFingerprintNil(b bool)`

 SetFingerprintNil sets the value for Fingerprint to be an explicit nil

### UnsetFingerprint
`func (o *Basket) UnsetFingerprint()`

UnsetFingerprint ensures that no value is present for Fingerprint, not even an explicit nil
### GetCreatorCode

`func (o *Basket) GetCreatorCode() string`

GetCreatorCode returns the CreatorCode field if non-nil, zero value otherwise.

### GetCreatorCodeOk

`func (o *Basket) GetCreatorCodeOk() (*string, bool)`

GetCreatorCodeOk returns a tuple with the CreatorCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatorCode

`func (o *Basket) SetCreatorCode(v string)`

SetCreatorCode sets CreatorCode field to given value.

### HasCreatorCode

`func (o *Basket) HasCreatorCode() bool`

HasCreatorCode returns a boolean if a field has been set.

### GetRoundup

`func (o *Basket) GetRoundup() bool`

GetRoundup returns the Roundup field if non-nil, zero value otherwise.

### GetRoundupOk

`func (o *Basket) GetRoundupOk() (*bool, bool)`

GetRoundupOk returns a tuple with the Roundup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoundup

`func (o *Basket) SetRoundup(v bool)`

SetRoundup sets Roundup field to given value.

### HasRoundup

`func (o *Basket) HasRoundup() bool`

HasRoundup returns a boolean if a field has been set.

### SetRoundupNil

`func (o *Basket) SetRoundupNil(b bool)`

 SetRoundupNil sets the value for Roundup to be an explicit nil

### UnsetRoundup
`func (o *Basket) UnsetRoundup()`

UnsetRoundup ensures that no value is present for Roundup, not even an explicit nil
### GetCancelUrl

`func (o *Basket) GetCancelUrl() string`

GetCancelUrl returns the CancelUrl field if non-nil, zero value otherwise.

### GetCancelUrlOk

`func (o *Basket) GetCancelUrlOk() (*string, bool)`

GetCancelUrlOk returns a tuple with the CancelUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCancelUrl

`func (o *Basket) SetCancelUrl(v string)`

SetCancelUrl sets CancelUrl field to given value.

### HasCancelUrl

`func (o *Basket) HasCancelUrl() bool`

HasCancelUrl returns a boolean if a field has been set.

### GetCompleteUrl

`func (o *Basket) GetCompleteUrl() string`

GetCompleteUrl returns the CompleteUrl field if non-nil, zero value otherwise.

### GetCompleteUrlOk

`func (o *Basket) GetCompleteUrlOk() (*string, bool)`

GetCompleteUrlOk returns a tuple with the CompleteUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompleteUrl

`func (o *Basket) SetCompleteUrl(v string)`

SetCompleteUrl sets CompleteUrl field to given value.

### HasCompleteUrl

`func (o *Basket) HasCompleteUrl() bool`

HasCompleteUrl returns a boolean if a field has been set.

### SetCompleteUrlNil

`func (o *Basket) SetCompleteUrlNil(b bool)`

 SetCompleteUrlNil sets the value for CompleteUrl to be an explicit nil

### UnsetCompleteUrl
`func (o *Basket) UnsetCompleteUrl()`

UnsetCompleteUrl ensures that no value is present for CompleteUrl, not even an explicit nil
### GetCompleteAutoRedirect

`func (o *Basket) GetCompleteAutoRedirect() bool`

GetCompleteAutoRedirect returns the CompleteAutoRedirect field if non-nil, zero value otherwise.

### GetCompleteAutoRedirectOk

`func (o *Basket) GetCompleteAutoRedirectOk() (*bool, bool)`

GetCompleteAutoRedirectOk returns a tuple with the CompleteAutoRedirect field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompleteAutoRedirect

`func (o *Basket) SetCompleteAutoRedirect(v bool)`

SetCompleteAutoRedirect sets CompleteAutoRedirect field to given value.

### HasCompleteAutoRedirect

`func (o *Basket) HasCompleteAutoRedirect() bool`

HasCompleteAutoRedirect returns a boolean if a field has been set.

### GetCustom

`func (o *Basket) GetCustom() map[string]interface{}`

GetCustom returns the Custom field if non-nil, zero value otherwise.

### GetCustomOk

`func (o *Basket) GetCustomOk() (*map[string]interface{}, bool)`

GetCustomOk returns a tuple with the Custom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustom

`func (o *Basket) SetCustom(v map[string]interface{})`

SetCustom sets Custom field to given value.

### HasCustom

`func (o *Basket) HasCustom() bool`

HasCustom returns a boolean if a field has been set.

### SetCustomNil

`func (o *Basket) SetCustomNil(b bool)`

 SetCustomNil sets the value for Custom to be an explicit nil

### UnsetCustom
`func (o *Basket) UnsetCustom()`

UnsetCustom ensures that no value is present for Custom, not even an explicit nil
### GetLinks

`func (o *Basket) GetLinks() BasketLinks`

GetLinks returns the Links field if non-nil, zero value otherwise.

### GetLinksOk

`func (o *Basket) GetLinksOk() (*BasketLinks, bool)`

GetLinksOk returns a tuple with the Links field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLinks

`func (o *Basket) SetLinks(v BasketLinks)`

SetLinks sets Links field to given value.

### HasLinks

`func (o *Basket) HasLinks() bool`

HasLinks returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


