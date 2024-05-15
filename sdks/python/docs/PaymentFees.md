# PaymentFees


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tax** | [**PaymentFeesTax**](PaymentFeesTax.md) |  | [optional] 
**gateway** | [**PaymentFeesGateway**](PaymentFeesGateway.md) |  | [optional] 

## Example

```python
from TebexCheckout.models.payment_fees import PaymentFees

# TODO update the JSON string below
json = "{}"
# create an instance of PaymentFees from a JSON string
payment_fees_instance = PaymentFees.from_json(json)
# print the JSON string representation of the object
print(PaymentFees.to_json())

# convert the object into a dict
payment_fees_dict = payment_fees_instance.to_dict()
# create an instance of PaymentFees from a dict
payment_fees_from_dict = PaymentFees.from_dict(payment_fees_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


