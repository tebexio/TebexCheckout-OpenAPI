# PaymentFees

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Tax** | Pointer to [**PaymentFeesTax**](PaymentFeesTax.md) |  | [optional] 
**Gateway** | Pointer to [**PaymentFeesGateway**](PaymentFeesGateway.md) |  | [optional] 

## Methods

### NewPaymentFees

`func NewPaymentFees() *PaymentFees`

NewPaymentFees instantiates a new PaymentFees object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPaymentFeesWithDefaults

`func NewPaymentFeesWithDefaults() *PaymentFees`

NewPaymentFeesWithDefaults instantiates a new PaymentFees object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTax

`func (o *PaymentFees) GetTax() PaymentFeesTax`

GetTax returns the Tax field if non-nil, zero value otherwise.

### GetTaxOk

`func (o *PaymentFees) GetTaxOk() (*PaymentFeesTax, bool)`

GetTaxOk returns a tuple with the Tax field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTax

`func (o *PaymentFees) SetTax(v PaymentFeesTax)`

SetTax sets Tax field to given value.

### HasTax

`func (o *PaymentFees) HasTax() bool`

HasTax returns a boolean if a field has been set.

### GetGateway

`func (o *PaymentFees) GetGateway() PaymentFeesGateway`

GetGateway returns the Gateway field if non-nil, zero value otherwise.

### GetGatewayOk

`func (o *PaymentFees) GetGatewayOk() (*PaymentFeesGateway, bool)`

GetGatewayOk returns a tuple with the Gateway field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGateway

`func (o *PaymentFees) SetGateway(v PaymentFeesGateway)`

SetGateway sets Gateway field to given value.

### HasGateway

`func (o *PaymentFees) HasGateway() bool`

HasGateway returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


