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

// checks if the RecurringPayment type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &RecurringPayment{}

// RecurringPayment struct for RecurringPayment
type RecurringPayment struct {
	Id *int32 `json:"id,omitempty"`
	CreatedAt *time.Time `json:"created_at,omitempty"`
	UpdatedAt *time.Time `json:"updated_at,omitempty"`
	PausedAt NullableTime `json:"paused_at,omitempty"`
	PausedUntil NullableTime `json:"paused_until,omitempty"`
	NextPaymentDate *string `json:"next_payment_date,omitempty"`
	Reference *string `json:"reference,omitempty"`
	AccountId *int32 `json:"account_id,omitempty"`
	Interval *string `json:"interval,omitempty"`
	CancelledAt NullableTime `json:"cancelled_at,omitempty"`
	Status *RecurringPaymentStatus `json:"status,omitempty"`
	Amount *RecurringPaymentAmount `json:"amount,omitempty"`
	CancelReason NullableString `json:"cancel_reason,omitempty"`
	Links *RecurringPaymentLinks `json:"links,omitempty"`
}

// NewRecurringPayment instantiates a new RecurringPayment object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRecurringPayment() *RecurringPayment {
	this := RecurringPayment{}
	return &this
}

// NewRecurringPaymentWithDefaults instantiates a new RecurringPayment object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRecurringPaymentWithDefaults() *RecurringPayment {
	this := RecurringPayment{}
	return &this
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *RecurringPayment) GetId() int32 {
	if o == nil || IsNil(o.Id) {
		var ret int32
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RecurringPayment) GetIdOk() (*int32, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *RecurringPayment) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given int32 and assigns it to the Id field.
func (o *RecurringPayment) SetId(v int32) {
	o.Id = &v
}

// GetCreatedAt returns the CreatedAt field value if set, zero value otherwise.
func (o *RecurringPayment) GetCreatedAt() time.Time {
	if o == nil || IsNil(o.CreatedAt) {
		var ret time.Time
		return ret
	}
	return *o.CreatedAt
}

// GetCreatedAtOk returns a tuple with the CreatedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RecurringPayment) GetCreatedAtOk() (*time.Time, bool) {
	if o == nil || IsNil(o.CreatedAt) {
		return nil, false
	}
	return o.CreatedAt, true
}

// HasCreatedAt returns a boolean if a field has been set.
func (o *RecurringPayment) HasCreatedAt() bool {
	if o != nil && !IsNil(o.CreatedAt) {
		return true
	}

	return false
}

// SetCreatedAt gets a reference to the given time.Time and assigns it to the CreatedAt field.
func (o *RecurringPayment) SetCreatedAt(v time.Time) {
	o.CreatedAt = &v
}

// GetUpdatedAt returns the UpdatedAt field value if set, zero value otherwise.
func (o *RecurringPayment) GetUpdatedAt() time.Time {
	if o == nil || IsNil(o.UpdatedAt) {
		var ret time.Time
		return ret
	}
	return *o.UpdatedAt
}

// GetUpdatedAtOk returns a tuple with the UpdatedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RecurringPayment) GetUpdatedAtOk() (*time.Time, bool) {
	if o == nil || IsNil(o.UpdatedAt) {
		return nil, false
	}
	return o.UpdatedAt, true
}

// HasUpdatedAt returns a boolean if a field has been set.
func (o *RecurringPayment) HasUpdatedAt() bool {
	if o != nil && !IsNil(o.UpdatedAt) {
		return true
	}

	return false
}

// SetUpdatedAt gets a reference to the given time.Time and assigns it to the UpdatedAt field.
func (o *RecurringPayment) SetUpdatedAt(v time.Time) {
	o.UpdatedAt = &v
}

// GetPausedAt returns the PausedAt field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *RecurringPayment) GetPausedAt() time.Time {
	if o == nil || IsNil(o.PausedAt.Get()) {
		var ret time.Time
		return ret
	}
	return *o.PausedAt.Get()
}

// GetPausedAtOk returns a tuple with the PausedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *RecurringPayment) GetPausedAtOk() (*time.Time, bool) {
	if o == nil {
		return nil, false
	}
	return o.PausedAt.Get(), o.PausedAt.IsSet()
}

// HasPausedAt returns a boolean if a field has been set.
func (o *RecurringPayment) HasPausedAt() bool {
	if o != nil && o.PausedAt.IsSet() {
		return true
	}

	return false
}

// SetPausedAt gets a reference to the given NullableTime and assigns it to the PausedAt field.
func (o *RecurringPayment) SetPausedAt(v time.Time) {
	o.PausedAt.Set(&v)
}
// SetPausedAtNil sets the value for PausedAt to be an explicit nil
func (o *RecurringPayment) SetPausedAtNil() {
	o.PausedAt.Set(nil)
}

// UnsetPausedAt ensures that no value is present for PausedAt, not even an explicit nil
func (o *RecurringPayment) UnsetPausedAt() {
	o.PausedAt.Unset()
}

// GetPausedUntil returns the PausedUntil field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *RecurringPayment) GetPausedUntil() time.Time {
	if o == nil || IsNil(o.PausedUntil.Get()) {
		var ret time.Time
		return ret
	}
	return *o.PausedUntil.Get()
}

// GetPausedUntilOk returns a tuple with the PausedUntil field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *RecurringPayment) GetPausedUntilOk() (*time.Time, bool) {
	if o == nil {
		return nil, false
	}
	return o.PausedUntil.Get(), o.PausedUntil.IsSet()
}

// HasPausedUntil returns a boolean if a field has been set.
func (o *RecurringPayment) HasPausedUntil() bool {
	if o != nil && o.PausedUntil.IsSet() {
		return true
	}

	return false
}

// SetPausedUntil gets a reference to the given NullableTime and assigns it to the PausedUntil field.
func (o *RecurringPayment) SetPausedUntil(v time.Time) {
	o.PausedUntil.Set(&v)
}
// SetPausedUntilNil sets the value for PausedUntil to be an explicit nil
func (o *RecurringPayment) SetPausedUntilNil() {
	o.PausedUntil.Set(nil)
}

// UnsetPausedUntil ensures that no value is present for PausedUntil, not even an explicit nil
func (o *RecurringPayment) UnsetPausedUntil() {
	o.PausedUntil.Unset()
}

// GetNextPaymentDate returns the NextPaymentDate field value if set, zero value otherwise.
func (o *RecurringPayment) GetNextPaymentDate() string {
	if o == nil || IsNil(o.NextPaymentDate) {
		var ret string
		return ret
	}
	return *o.NextPaymentDate
}

// GetNextPaymentDateOk returns a tuple with the NextPaymentDate field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RecurringPayment) GetNextPaymentDateOk() (*string, bool) {
	if o == nil || IsNil(o.NextPaymentDate) {
		return nil, false
	}
	return o.NextPaymentDate, true
}

// HasNextPaymentDate returns a boolean if a field has been set.
func (o *RecurringPayment) HasNextPaymentDate() bool {
	if o != nil && !IsNil(o.NextPaymentDate) {
		return true
	}

	return false
}

// SetNextPaymentDate gets a reference to the given string and assigns it to the NextPaymentDate field.
func (o *RecurringPayment) SetNextPaymentDate(v string) {
	o.NextPaymentDate = &v
}

// GetReference returns the Reference field value if set, zero value otherwise.
func (o *RecurringPayment) GetReference() string {
	if o == nil || IsNil(o.Reference) {
		var ret string
		return ret
	}
	return *o.Reference
}

// GetReferenceOk returns a tuple with the Reference field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RecurringPayment) GetReferenceOk() (*string, bool) {
	if o == nil || IsNil(o.Reference) {
		return nil, false
	}
	return o.Reference, true
}

// HasReference returns a boolean if a field has been set.
func (o *RecurringPayment) HasReference() bool {
	if o != nil && !IsNil(o.Reference) {
		return true
	}

	return false
}

// SetReference gets a reference to the given string and assigns it to the Reference field.
func (o *RecurringPayment) SetReference(v string) {
	o.Reference = &v
}

// GetAccountId returns the AccountId field value if set, zero value otherwise.
func (o *RecurringPayment) GetAccountId() int32 {
	if o == nil || IsNil(o.AccountId) {
		var ret int32
		return ret
	}
	return *o.AccountId
}

// GetAccountIdOk returns a tuple with the AccountId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RecurringPayment) GetAccountIdOk() (*int32, bool) {
	if o == nil || IsNil(o.AccountId) {
		return nil, false
	}
	return o.AccountId, true
}

// HasAccountId returns a boolean if a field has been set.
func (o *RecurringPayment) HasAccountId() bool {
	if o != nil && !IsNil(o.AccountId) {
		return true
	}

	return false
}

// SetAccountId gets a reference to the given int32 and assigns it to the AccountId field.
func (o *RecurringPayment) SetAccountId(v int32) {
	o.AccountId = &v
}

// GetInterval returns the Interval field value if set, zero value otherwise.
func (o *RecurringPayment) GetInterval() string {
	if o == nil || IsNil(o.Interval) {
		var ret string
		return ret
	}
	return *o.Interval
}

// GetIntervalOk returns a tuple with the Interval field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RecurringPayment) GetIntervalOk() (*string, bool) {
	if o == nil || IsNil(o.Interval) {
		return nil, false
	}
	return o.Interval, true
}

// HasInterval returns a boolean if a field has been set.
func (o *RecurringPayment) HasInterval() bool {
	if o != nil && !IsNil(o.Interval) {
		return true
	}

	return false
}

// SetInterval gets a reference to the given string and assigns it to the Interval field.
func (o *RecurringPayment) SetInterval(v string) {
	o.Interval = &v
}

// GetCancelledAt returns the CancelledAt field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *RecurringPayment) GetCancelledAt() time.Time {
	if o == nil || IsNil(o.CancelledAt.Get()) {
		var ret time.Time
		return ret
	}
	return *o.CancelledAt.Get()
}

// GetCancelledAtOk returns a tuple with the CancelledAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *RecurringPayment) GetCancelledAtOk() (*time.Time, bool) {
	if o == nil {
		return nil, false
	}
	return o.CancelledAt.Get(), o.CancelledAt.IsSet()
}

// HasCancelledAt returns a boolean if a field has been set.
func (o *RecurringPayment) HasCancelledAt() bool {
	if o != nil && o.CancelledAt.IsSet() {
		return true
	}

	return false
}

// SetCancelledAt gets a reference to the given NullableTime and assigns it to the CancelledAt field.
func (o *RecurringPayment) SetCancelledAt(v time.Time) {
	o.CancelledAt.Set(&v)
}
// SetCancelledAtNil sets the value for CancelledAt to be an explicit nil
func (o *RecurringPayment) SetCancelledAtNil() {
	o.CancelledAt.Set(nil)
}

// UnsetCancelledAt ensures that no value is present for CancelledAt, not even an explicit nil
func (o *RecurringPayment) UnsetCancelledAt() {
	o.CancelledAt.Unset()
}

// GetStatus returns the Status field value if set, zero value otherwise.
func (o *RecurringPayment) GetStatus() RecurringPaymentStatus {
	if o == nil || IsNil(o.Status) {
		var ret RecurringPaymentStatus
		return ret
	}
	return *o.Status
}

// GetStatusOk returns a tuple with the Status field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RecurringPayment) GetStatusOk() (*RecurringPaymentStatus, bool) {
	if o == nil || IsNil(o.Status) {
		return nil, false
	}
	return o.Status, true
}

// HasStatus returns a boolean if a field has been set.
func (o *RecurringPayment) HasStatus() bool {
	if o != nil && !IsNil(o.Status) {
		return true
	}

	return false
}

// SetStatus gets a reference to the given RecurringPaymentStatus and assigns it to the Status field.
func (o *RecurringPayment) SetStatus(v RecurringPaymentStatus) {
	o.Status = &v
}

// GetAmount returns the Amount field value if set, zero value otherwise.
func (o *RecurringPayment) GetAmount() RecurringPaymentAmount {
	if o == nil || IsNil(o.Amount) {
		var ret RecurringPaymentAmount
		return ret
	}
	return *o.Amount
}

// GetAmountOk returns a tuple with the Amount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RecurringPayment) GetAmountOk() (*RecurringPaymentAmount, bool) {
	if o == nil || IsNil(o.Amount) {
		return nil, false
	}
	return o.Amount, true
}

// HasAmount returns a boolean if a field has been set.
func (o *RecurringPayment) HasAmount() bool {
	if o != nil && !IsNil(o.Amount) {
		return true
	}

	return false
}

// SetAmount gets a reference to the given RecurringPaymentAmount and assigns it to the Amount field.
func (o *RecurringPayment) SetAmount(v RecurringPaymentAmount) {
	o.Amount = &v
}

// GetCancelReason returns the CancelReason field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *RecurringPayment) GetCancelReason() string {
	if o == nil || IsNil(o.CancelReason.Get()) {
		var ret string
		return ret
	}
	return *o.CancelReason.Get()
}

// GetCancelReasonOk returns a tuple with the CancelReason field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *RecurringPayment) GetCancelReasonOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.CancelReason.Get(), o.CancelReason.IsSet()
}

// HasCancelReason returns a boolean if a field has been set.
func (o *RecurringPayment) HasCancelReason() bool {
	if o != nil && o.CancelReason.IsSet() {
		return true
	}

	return false
}

// SetCancelReason gets a reference to the given NullableString and assigns it to the CancelReason field.
func (o *RecurringPayment) SetCancelReason(v string) {
	o.CancelReason.Set(&v)
}
// SetCancelReasonNil sets the value for CancelReason to be an explicit nil
func (o *RecurringPayment) SetCancelReasonNil() {
	o.CancelReason.Set(nil)
}

// UnsetCancelReason ensures that no value is present for CancelReason, not even an explicit nil
func (o *RecurringPayment) UnsetCancelReason() {
	o.CancelReason.Unset()
}

// GetLinks returns the Links field value if set, zero value otherwise.
func (o *RecurringPayment) GetLinks() RecurringPaymentLinks {
	if o == nil || IsNil(o.Links) {
		var ret RecurringPaymentLinks
		return ret
	}
	return *o.Links
}

// GetLinksOk returns a tuple with the Links field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RecurringPayment) GetLinksOk() (*RecurringPaymentLinks, bool) {
	if o == nil || IsNil(o.Links) {
		return nil, false
	}
	return o.Links, true
}

// HasLinks returns a boolean if a field has been set.
func (o *RecurringPayment) HasLinks() bool {
	if o != nil && !IsNil(o.Links) {
		return true
	}

	return false
}

// SetLinks gets a reference to the given RecurringPaymentLinks and assigns it to the Links field.
func (o *RecurringPayment) SetLinks(v RecurringPaymentLinks) {
	o.Links = &v
}

func (o RecurringPayment) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o RecurringPayment) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !IsNil(o.CreatedAt) {
		toSerialize["created_at"] = o.CreatedAt
	}
	if !IsNil(o.UpdatedAt) {
		toSerialize["updated_at"] = o.UpdatedAt
	}
	if o.PausedAt.IsSet() {
		toSerialize["paused_at"] = o.PausedAt.Get()
	}
	if o.PausedUntil.IsSet() {
		toSerialize["paused_until"] = o.PausedUntil.Get()
	}
	if !IsNil(o.NextPaymentDate) {
		toSerialize["next_payment_date"] = o.NextPaymentDate
	}
	if !IsNil(o.Reference) {
		toSerialize["reference"] = o.Reference
	}
	if !IsNil(o.AccountId) {
		toSerialize["account_id"] = o.AccountId
	}
	if !IsNil(o.Interval) {
		toSerialize["interval"] = o.Interval
	}
	if o.CancelledAt.IsSet() {
		toSerialize["cancelled_at"] = o.CancelledAt.Get()
	}
	if !IsNil(o.Status) {
		toSerialize["status"] = o.Status
	}
	if !IsNil(o.Amount) {
		toSerialize["amount"] = o.Amount
	}
	if o.CancelReason.IsSet() {
		toSerialize["cancel_reason"] = o.CancelReason.Get()
	}
	if !IsNil(o.Links) {
		toSerialize["links"] = o.Links
	}
	return toSerialize, nil
}

type NullableRecurringPayment struct {
	value *RecurringPayment
	isSet bool
}

func (v NullableRecurringPayment) Get() *RecurringPayment {
	return v.value
}

func (v *NullableRecurringPayment) Set(val *RecurringPayment) {
	v.value = val
	v.isSet = true
}

func (v NullableRecurringPayment) IsSet() bool {
	return v.isSet
}

func (v *NullableRecurringPayment) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRecurringPayment(val *RecurringPayment) *NullableRecurringPayment {
	return &NullableRecurringPayment{value: val, isSet: true}
}

func (v NullableRecurringPayment) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRecurringPayment) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


