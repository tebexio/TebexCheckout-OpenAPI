# Payment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TransactionId** | Pointer to **string** |  | [optional] 
**Status** | Pointer to [**PaymentStatus**](PaymentStatus.md) |  | [optional] 
**PaymentSequence** | Pointer to **string** |  | [optional] 
**CreatedAt** | Pointer to **time.Time** |  | [optional] 
**Price** | Pointer to [**PaymentPrice**](PaymentPrice.md) |  | [optional] 
**Fees** | Pointer to [**PaymentFees**](PaymentFees.md) |  | [optional] 
**Customer** | Pointer to [**PaymentCustomer**](PaymentCustomer.md) |  | [optional] 
**Products** | Pointer to [**[]PaymentProductsInner**](PaymentProductsInner.md) |  | [optional] 
**Coupons** | Pointer to **[]string** |  | [optional] 
**GiftCards** | Pointer to **[]string** |  | [optional] 
**RecurringPaymentReference** | Pointer to **NullableString** |  | [optional] 
**Custom** | Pointer to [**PaymentCustom**](PaymentCustom.md) |  | [optional] 

## Methods

### NewPayment

`func NewPayment() *Payment`

NewPayment instantiates a new Payment object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPaymentWithDefaults

`func NewPaymentWithDefaults() *Payment`

NewPaymentWithDefaults instantiates a new Payment object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTransactionId

`func (o *Payment) GetTransactionId() string`

GetTransactionId returns the TransactionId field if non-nil, zero value otherwise.

### GetTransactionIdOk

`func (o *Payment) GetTransactionIdOk() (*string, bool)`

GetTransactionIdOk returns a tuple with the TransactionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransactionId

`func (o *Payment) SetTransactionId(v string)`

SetTransactionId sets TransactionId field to given value.

### HasTransactionId

`func (o *Payment) HasTransactionId() bool`

HasTransactionId returns a boolean if a field has been set.

### GetStatus

`func (o *Payment) GetStatus() PaymentStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *Payment) GetStatusOk() (*PaymentStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *Payment) SetStatus(v PaymentStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *Payment) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetPaymentSequence

`func (o *Payment) GetPaymentSequence() string`

GetPaymentSequence returns the PaymentSequence field if non-nil, zero value otherwise.

### GetPaymentSequenceOk

`func (o *Payment) GetPaymentSequenceOk() (*string, bool)`

GetPaymentSequenceOk returns a tuple with the PaymentSequence field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentSequence

`func (o *Payment) SetPaymentSequence(v string)`

SetPaymentSequence sets PaymentSequence field to given value.

### HasPaymentSequence

`func (o *Payment) HasPaymentSequence() bool`

HasPaymentSequence returns a boolean if a field has been set.

### GetCreatedAt

`func (o *Payment) GetCreatedAt() time.Time`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *Payment) GetCreatedAtOk() (*time.Time, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *Payment) SetCreatedAt(v time.Time)`

SetCreatedAt sets CreatedAt field to given value.

### HasCreatedAt

`func (o *Payment) HasCreatedAt() bool`

HasCreatedAt returns a boolean if a field has been set.

### GetPrice

`func (o *Payment) GetPrice() PaymentPrice`

GetPrice returns the Price field if non-nil, zero value otherwise.

### GetPriceOk

`func (o *Payment) GetPriceOk() (*PaymentPrice, bool)`

GetPriceOk returns a tuple with the Price field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice

`func (o *Payment) SetPrice(v PaymentPrice)`

SetPrice sets Price field to given value.

### HasPrice

`func (o *Payment) HasPrice() bool`

HasPrice returns a boolean if a field has been set.

### GetFees

`func (o *Payment) GetFees() PaymentFees`

GetFees returns the Fees field if non-nil, zero value otherwise.

### GetFeesOk

`func (o *Payment) GetFeesOk() (*PaymentFees, bool)`

GetFeesOk returns a tuple with the Fees field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFees

`func (o *Payment) SetFees(v PaymentFees)`

SetFees sets Fees field to given value.

### HasFees

`func (o *Payment) HasFees() bool`

HasFees returns a boolean if a field has been set.

### GetCustomer

`func (o *Payment) GetCustomer() PaymentCustomer`

GetCustomer returns the Customer field if non-nil, zero value otherwise.

### GetCustomerOk

`func (o *Payment) GetCustomerOk() (*PaymentCustomer, bool)`

GetCustomerOk returns a tuple with the Customer field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomer

`func (o *Payment) SetCustomer(v PaymentCustomer)`

SetCustomer sets Customer field to given value.

### HasCustomer

`func (o *Payment) HasCustomer() bool`

HasCustomer returns a boolean if a field has been set.

### GetProducts

`func (o *Payment) GetProducts() []PaymentProductsInner`

GetProducts returns the Products field if non-nil, zero value otherwise.

### GetProductsOk

`func (o *Payment) GetProductsOk() (*[]PaymentProductsInner, bool)`

GetProductsOk returns a tuple with the Products field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProducts

`func (o *Payment) SetProducts(v []PaymentProductsInner)`

SetProducts sets Products field to given value.

### HasProducts

`func (o *Payment) HasProducts() bool`

HasProducts returns a boolean if a field has been set.

### GetCoupons

`func (o *Payment) GetCoupons() []string`

GetCoupons returns the Coupons field if non-nil, zero value otherwise.

### GetCouponsOk

`func (o *Payment) GetCouponsOk() (*[]string, bool)`

GetCouponsOk returns a tuple with the Coupons field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoupons

`func (o *Payment) SetCoupons(v []string)`

SetCoupons sets Coupons field to given value.

### HasCoupons

`func (o *Payment) HasCoupons() bool`

HasCoupons returns a boolean if a field has been set.

### GetGiftCards

`func (o *Payment) GetGiftCards() []string`

GetGiftCards returns the GiftCards field if non-nil, zero value otherwise.

### GetGiftCardsOk

`func (o *Payment) GetGiftCardsOk() (*[]string, bool)`

GetGiftCardsOk returns a tuple with the GiftCards field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGiftCards

`func (o *Payment) SetGiftCards(v []string)`

SetGiftCards sets GiftCards field to given value.

### HasGiftCards

`func (o *Payment) HasGiftCards() bool`

HasGiftCards returns a boolean if a field has been set.

### GetRecurringPaymentReference

`func (o *Payment) GetRecurringPaymentReference() string`

GetRecurringPaymentReference returns the RecurringPaymentReference field if non-nil, zero value otherwise.

### GetRecurringPaymentReferenceOk

`func (o *Payment) GetRecurringPaymentReferenceOk() (*string, bool)`

GetRecurringPaymentReferenceOk returns a tuple with the RecurringPaymentReference field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecurringPaymentReference

`func (o *Payment) SetRecurringPaymentReference(v string)`

SetRecurringPaymentReference sets RecurringPaymentReference field to given value.

### HasRecurringPaymentReference

`func (o *Payment) HasRecurringPaymentReference() bool`

HasRecurringPaymentReference returns a boolean if a field has been set.

### SetRecurringPaymentReferenceNil

`func (o *Payment) SetRecurringPaymentReferenceNil(b bool)`

 SetRecurringPaymentReferenceNil sets the value for RecurringPaymentReference to be an explicit nil

### UnsetRecurringPaymentReference
`func (o *Payment) UnsetRecurringPaymentReference()`

UnsetRecurringPaymentReference ensures that no value is present for RecurringPaymentReference, not even an explicit nil
### GetCustom

`func (o *Payment) GetCustom() PaymentCustom`

GetCustom returns the Custom field if non-nil, zero value otherwise.

### GetCustomOk

`func (o *Payment) GetCustomOk() (*PaymentCustom, bool)`

GetCustomOk returns a tuple with the Custom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustom

`func (o *Payment) SetCustom(v PaymentCustom)`

SetCustom sets Custom field to given value.

### HasCustom

`func (o *Payment) HasCustom() bool`

HasCustom returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


