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
	"bytes"
	"fmt"
)

// checks if the UpdateRecurringPaymentRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &UpdateRecurringPaymentRequest{}

// UpdateRecurringPaymentRequest struct for UpdateRecurringPaymentRequest
type UpdateRecurringPaymentRequest struct {
	// Your desired state of the recurring payment. Provide `Paused` with `paused_until` to pause a recurring payment. Otherwise, provide `Active` to resume a recurring payment.
	Status string `json:"status"`
	// To pause a payment, provide a ISO8601 formatted date on which the payment should be reactivated.
	PausedUntil *string `json:"paused_until,omitempty"`
}

type _UpdateRecurringPaymentRequest UpdateRecurringPaymentRequest

// NewUpdateRecurringPaymentRequest instantiates a new UpdateRecurringPaymentRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUpdateRecurringPaymentRequest(status string) *UpdateRecurringPaymentRequest {
	this := UpdateRecurringPaymentRequest{}
	this.Status = status
	return &this
}

// NewUpdateRecurringPaymentRequestWithDefaults instantiates a new UpdateRecurringPaymentRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUpdateRecurringPaymentRequestWithDefaults() *UpdateRecurringPaymentRequest {
	this := UpdateRecurringPaymentRequest{}
	return &this
}

// GetStatus returns the Status field value
func (o *UpdateRecurringPaymentRequest) GetStatus() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Status
}

// GetStatusOk returns a tuple with the Status field value
// and a boolean to check if the value has been set.
func (o *UpdateRecurringPaymentRequest) GetStatusOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Status, true
}

// SetStatus sets field value
func (o *UpdateRecurringPaymentRequest) SetStatus(v string) {
	o.Status = v
}

// GetPausedUntil returns the PausedUntil field value if set, zero value otherwise.
func (o *UpdateRecurringPaymentRequest) GetPausedUntil() string {
	if o == nil || IsNil(o.PausedUntil) {
		var ret string
		return ret
	}
	return *o.PausedUntil
}

// GetPausedUntilOk returns a tuple with the PausedUntil field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UpdateRecurringPaymentRequest) GetPausedUntilOk() (*string, bool) {
	if o == nil || IsNil(o.PausedUntil) {
		return nil, false
	}
	return o.PausedUntil, true
}

// HasPausedUntil returns a boolean if a field has been set.
func (o *UpdateRecurringPaymentRequest) HasPausedUntil() bool {
	if o != nil && !IsNil(o.PausedUntil) {
		return true
	}

	return false
}

// SetPausedUntil gets a reference to the given string and assigns it to the PausedUntil field.
func (o *UpdateRecurringPaymentRequest) SetPausedUntil(v string) {
	o.PausedUntil = &v
}

func (o UpdateRecurringPaymentRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o UpdateRecurringPaymentRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["status"] = o.Status
	if !IsNil(o.PausedUntil) {
		toSerialize["paused_until"] = o.PausedUntil
	}
	return toSerialize, nil
}

func (o *UpdateRecurringPaymentRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"status",
	}

	allProperties := make(map[string]interface{})

	err = json.Unmarshal(data, &allProperties)

	if err != nil {
		return err;
	}

	for _, requiredProperty := range(requiredProperties) {
		if _, exists := allProperties[requiredProperty]; !exists {
			return fmt.Errorf("no value given for required property %v", requiredProperty)
		}
	}

	varUpdateRecurringPaymentRequest := _UpdateRecurringPaymentRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varUpdateRecurringPaymentRequest)

	if err != nil {
		return err
	}

	*o = UpdateRecurringPaymentRequest(varUpdateRecurringPaymentRequest)

	return err
}

type NullableUpdateRecurringPaymentRequest struct {
	value *UpdateRecurringPaymentRequest
	isSet bool
}

func (v NullableUpdateRecurringPaymentRequest) Get() *UpdateRecurringPaymentRequest {
	return v.value
}

func (v *NullableUpdateRecurringPaymentRequest) Set(val *UpdateRecurringPaymentRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableUpdateRecurringPaymentRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableUpdateRecurringPaymentRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUpdateRecurringPaymentRequest(val *UpdateRecurringPaymentRequest) *NullableUpdateRecurringPaymentRequest {
	return &NullableUpdateRecurringPaymentRequest{value: val, isSet: true}
}

func (v NullableUpdateRecurringPaymentRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUpdateRecurringPaymentRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


