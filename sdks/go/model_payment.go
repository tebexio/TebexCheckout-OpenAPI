/*
Tebex Checkout API

The Checkout APIs are designed to allow our creators to use the Tebex Checkout flow and payment acceptance capabilities without the need to set up a Tebex-powered webstore. Using these APIs allows you to create baskets with custom products (as opposed to pre-created products on our webstore platform), and send customers directly to the checkout flow to proceed with payment options.  You must receive prior authorisation before the Checkout API is enabled on your account. Please contact customer support or your account manager to discover if you qualify to use the Checkout API before beginning integration.

API version: 1.0.0
Contact: tebex-integrations@overwolf.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package TebexCheckout

import (
	"encoding/json"
	"time"
)

// checks if the Payment type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &Payment{}

// Payment struct for Payment
type Payment struct {
	TransactionId *string `json:"transaction_id,omitempty"`
	Status *PaymentStatus `json:"status,omitempty"`
	PaymentSequence *string `json:"payment_sequence,omitempty"`
	CreatedAt *time.Time `json:"created_at,omitempty"`
	Price *PaymentPrice `json:"price,omitempty"`
	Fees *PaymentFees `json:"fees,omitempty"`
	Customer *PaymentCustomer `json:"customer,omitempty"`
	Products []PaymentProductsInner `json:"products,omitempty"`
	Coupons []string `json:"coupons,omitempty"`
	GiftCards []string `json:"gift_cards,omitempty"`
	RecurringPaymentReference NullableString `json:"recurring_payment_reference,omitempty"`
	Custom *PaymentCustom `json:"custom,omitempty"`
}

// NewPayment instantiates a new Payment object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewPayment() *Payment {
	this := Payment{}
	return &this
}

// NewPaymentWithDefaults instantiates a new Payment object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewPaymentWithDefaults() *Payment {
	this := Payment{}
	return &this
}

// GetTransactionId returns the TransactionId field value if set, zero value otherwise.
func (o *Payment) GetTransactionId() string {
	if o == nil || IsNil(o.TransactionId) {
		var ret string
		return ret
	}
	return *o.TransactionId
}

// GetTransactionIdOk returns a tuple with the TransactionId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Payment) GetTransactionIdOk() (*string, bool) {
	if o == nil || IsNil(o.TransactionId) {
		return nil, false
	}
	return o.TransactionId, true
}

// HasTransactionId returns a boolean if a field has been set.
func (o *Payment) HasTransactionId() bool {
	if o != nil && !IsNil(o.TransactionId) {
		return true
	}

	return false
}

// SetTransactionId gets a reference to the given string and assigns it to the TransactionId field.
func (o *Payment) SetTransactionId(v string) {
	o.TransactionId = &v
}

// GetStatus returns the Status field value if set, zero value otherwise.
func (o *Payment) GetStatus() PaymentStatus {
	if o == nil || IsNil(o.Status) {
		var ret PaymentStatus
		return ret
	}
	return *o.Status
}

// GetStatusOk returns a tuple with the Status field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Payment) GetStatusOk() (*PaymentStatus, bool) {
	if o == nil || IsNil(o.Status) {
		return nil, false
	}
	return o.Status, true
}

// HasStatus returns a boolean if a field has been set.
func (o *Payment) HasStatus() bool {
	if o != nil && !IsNil(o.Status) {
		return true
	}

	return false
}

// SetStatus gets a reference to the given PaymentStatus and assigns it to the Status field.
func (o *Payment) SetStatus(v PaymentStatus) {
	o.Status = &v
}

// GetPaymentSequence returns the PaymentSequence field value if set, zero value otherwise.
func (o *Payment) GetPaymentSequence() string {
	if o == nil || IsNil(o.PaymentSequence) {
		var ret string
		return ret
	}
	return *o.PaymentSequence
}

// GetPaymentSequenceOk returns a tuple with the PaymentSequence field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Payment) GetPaymentSequenceOk() (*string, bool) {
	if o == nil || IsNil(o.PaymentSequence) {
		return nil, false
	}
	return o.PaymentSequence, true
}

// HasPaymentSequence returns a boolean if a field has been set.
func (o *Payment) HasPaymentSequence() bool {
	if o != nil && !IsNil(o.PaymentSequence) {
		return true
	}

	return false
}

// SetPaymentSequence gets a reference to the given string and assigns it to the PaymentSequence field.
func (o *Payment) SetPaymentSequence(v string) {
	o.PaymentSequence = &v
}

// GetCreatedAt returns the CreatedAt field value if set, zero value otherwise.
func (o *Payment) GetCreatedAt() time.Time {
	if o == nil || IsNil(o.CreatedAt) {
		var ret time.Time
		return ret
	}
	return *o.CreatedAt
}

// GetCreatedAtOk returns a tuple with the CreatedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Payment) GetCreatedAtOk() (*time.Time, bool) {
	if o == nil || IsNil(o.CreatedAt) {
		return nil, false
	}
	return o.CreatedAt, true
}

// HasCreatedAt returns a boolean if a field has been set.
func (o *Payment) HasCreatedAt() bool {
	if o != nil && !IsNil(o.CreatedAt) {
		return true
	}

	return false
}

// SetCreatedAt gets a reference to the given time.Time and assigns it to the CreatedAt field.
func (o *Payment) SetCreatedAt(v time.Time) {
	o.CreatedAt = &v
}

// GetPrice returns the Price field value if set, zero value otherwise.
func (o *Payment) GetPrice() PaymentPrice {
	if o == nil || IsNil(o.Price) {
		var ret PaymentPrice
		return ret
	}
	return *o.Price
}

// GetPriceOk returns a tuple with the Price field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Payment) GetPriceOk() (*PaymentPrice, bool) {
	if o == nil || IsNil(o.Price) {
		return nil, false
	}
	return o.Price, true
}

// HasPrice returns a boolean if a field has been set.
func (o *Payment) HasPrice() bool {
	if o != nil && !IsNil(o.Price) {
		return true
	}

	return false
}

// SetPrice gets a reference to the given PaymentPrice and assigns it to the Price field.
func (o *Payment) SetPrice(v PaymentPrice) {
	o.Price = &v
}

// GetFees returns the Fees field value if set, zero value otherwise.
func (o *Payment) GetFees() PaymentFees {
	if o == nil || IsNil(o.Fees) {
		var ret PaymentFees
		return ret
	}
	return *o.Fees
}

// GetFeesOk returns a tuple with the Fees field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Payment) GetFeesOk() (*PaymentFees, bool) {
	if o == nil || IsNil(o.Fees) {
		return nil, false
	}
	return o.Fees, true
}

// HasFees returns a boolean if a field has been set.
func (o *Payment) HasFees() bool {
	if o != nil && !IsNil(o.Fees) {
		return true
	}

	return false
}

// SetFees gets a reference to the given PaymentFees and assigns it to the Fees field.
func (o *Payment) SetFees(v PaymentFees) {
	o.Fees = &v
}

// GetCustomer returns the Customer field value if set, zero value otherwise.
func (o *Payment) GetCustomer() PaymentCustomer {
	if o == nil || IsNil(o.Customer) {
		var ret PaymentCustomer
		return ret
	}
	return *o.Customer
}

// GetCustomerOk returns a tuple with the Customer field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Payment) GetCustomerOk() (*PaymentCustomer, bool) {
	if o == nil || IsNil(o.Customer) {
		return nil, false
	}
	return o.Customer, true
}

// HasCustomer returns a boolean if a field has been set.
func (o *Payment) HasCustomer() bool {
	if o != nil && !IsNil(o.Customer) {
		return true
	}

	return false
}

// SetCustomer gets a reference to the given PaymentCustomer and assigns it to the Customer field.
func (o *Payment) SetCustomer(v PaymentCustomer) {
	o.Customer = &v
}

// GetProducts returns the Products field value if set, zero value otherwise.
func (o *Payment) GetProducts() []PaymentProductsInner {
	if o == nil || IsNil(o.Products) {
		var ret []PaymentProductsInner
		return ret
	}
	return o.Products
}

// GetProductsOk returns a tuple with the Products field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Payment) GetProductsOk() ([]PaymentProductsInner, bool) {
	if o == nil || IsNil(o.Products) {
		return nil, false
	}
	return o.Products, true
}

// HasProducts returns a boolean if a field has been set.
func (o *Payment) HasProducts() bool {
	if o != nil && !IsNil(o.Products) {
		return true
	}

	return false
}

// SetProducts gets a reference to the given []PaymentProductsInner and assigns it to the Products field.
func (o *Payment) SetProducts(v []PaymentProductsInner) {
	o.Products = v
}

// GetCoupons returns the Coupons field value if set, zero value otherwise.
func (o *Payment) GetCoupons() []string {
	if o == nil || IsNil(o.Coupons) {
		var ret []string
		return ret
	}
	return o.Coupons
}

// GetCouponsOk returns a tuple with the Coupons field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Payment) GetCouponsOk() ([]string, bool) {
	if o == nil || IsNil(o.Coupons) {
		return nil, false
	}
	return o.Coupons, true
}

// HasCoupons returns a boolean if a field has been set.
func (o *Payment) HasCoupons() bool {
	if o != nil && !IsNil(o.Coupons) {
		return true
	}

	return false
}

// SetCoupons gets a reference to the given []string and assigns it to the Coupons field.
func (o *Payment) SetCoupons(v []string) {
	o.Coupons = v
}

// GetGiftCards returns the GiftCards field value if set, zero value otherwise.
func (o *Payment) GetGiftCards() []string {
	if o == nil || IsNil(o.GiftCards) {
		var ret []string
		return ret
	}
	return o.GiftCards
}

// GetGiftCardsOk returns a tuple with the GiftCards field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Payment) GetGiftCardsOk() ([]string, bool) {
	if o == nil || IsNil(o.GiftCards) {
		return nil, false
	}
	return o.GiftCards, true
}

// HasGiftCards returns a boolean if a field has been set.
func (o *Payment) HasGiftCards() bool {
	if o != nil && !IsNil(o.GiftCards) {
		return true
	}

	return false
}

// SetGiftCards gets a reference to the given []string and assigns it to the GiftCards field.
func (o *Payment) SetGiftCards(v []string) {
	o.GiftCards = v
}

// GetRecurringPaymentReference returns the RecurringPaymentReference field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *Payment) GetRecurringPaymentReference() string {
	if o == nil || IsNil(o.RecurringPaymentReference.Get()) {
		var ret string
		return ret
	}
	return *o.RecurringPaymentReference.Get()
}

// GetRecurringPaymentReferenceOk returns a tuple with the RecurringPaymentReference field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *Payment) GetRecurringPaymentReferenceOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.RecurringPaymentReference.Get(), o.RecurringPaymentReference.IsSet()
}

// HasRecurringPaymentReference returns a boolean if a field has been set.
func (o *Payment) HasRecurringPaymentReference() bool {
	if o != nil && o.RecurringPaymentReference.IsSet() {
		return true
	}

	return false
}

// SetRecurringPaymentReference gets a reference to the given NullableString and assigns it to the RecurringPaymentReference field.
func (o *Payment) SetRecurringPaymentReference(v string) {
	o.RecurringPaymentReference.Set(&v)
}
// SetRecurringPaymentReferenceNil sets the value for RecurringPaymentReference to be an explicit nil
func (o *Payment) SetRecurringPaymentReferenceNil() {
	o.RecurringPaymentReference.Set(nil)
}

// UnsetRecurringPaymentReference ensures that no value is present for RecurringPaymentReference, not even an explicit nil
func (o *Payment) UnsetRecurringPaymentReference() {
	o.RecurringPaymentReference.Unset()
}

// GetCustom returns the Custom field value if set, zero value otherwise.
func (o *Payment) GetCustom() PaymentCustom {
	if o == nil || IsNil(o.Custom) {
		var ret PaymentCustom
		return ret
	}
	return *o.Custom
}

// GetCustomOk returns a tuple with the Custom field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Payment) GetCustomOk() (*PaymentCustom, bool) {
	if o == nil || IsNil(o.Custom) {
		return nil, false
	}
	return o.Custom, true
}

// HasCustom returns a boolean if a field has been set.
func (o *Payment) HasCustom() bool {
	if o != nil && !IsNil(o.Custom) {
		return true
	}

	return false
}

// SetCustom gets a reference to the given PaymentCustom and assigns it to the Custom field.
func (o *Payment) SetCustom(v PaymentCustom) {
	o.Custom = &v
}

func (o Payment) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o Payment) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.TransactionId) {
		toSerialize["transaction_id"] = o.TransactionId
	}
	if !IsNil(o.Status) {
		toSerialize["status"] = o.Status
	}
	if !IsNil(o.PaymentSequence) {
		toSerialize["payment_sequence"] = o.PaymentSequence
	}
	if !IsNil(o.CreatedAt) {
		toSerialize["created_at"] = o.CreatedAt
	}
	if !IsNil(o.Price) {
		toSerialize["price"] = o.Price
	}
	if !IsNil(o.Fees) {
		toSerialize["fees"] = o.Fees
	}
	if !IsNil(o.Customer) {
		toSerialize["customer"] = o.Customer
	}
	if !IsNil(o.Products) {
		toSerialize["products"] = o.Products
	}
	if !IsNil(o.Coupons) {
		toSerialize["coupons"] = o.Coupons
	}
	if !IsNil(o.GiftCards) {
		toSerialize["gift_cards"] = o.GiftCards
	}
	if o.RecurringPaymentReference.IsSet() {
		toSerialize["recurring_payment_reference"] = o.RecurringPaymentReference.Get()
	}
	if !IsNil(o.Custom) {
		toSerialize["custom"] = o.Custom
	}
	return toSerialize, nil
}

type NullablePayment struct {
	value *Payment
	isSet bool
}

func (v NullablePayment) Get() *Payment {
	return v.value
}

func (v *NullablePayment) Set(val *Payment) {
	v.value = val
	v.isSet = true
}

func (v NullablePayment) IsSet() bool {
	return v.isSet
}

func (v *NullablePayment) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePayment(val *Payment) *NullablePayment {
	return &NullablePayment{value: val, isSet: true}
}

func (v NullablePayment) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePayment) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


