# PaymentPaymentMethod


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **object** |  | [optional] 
**refundable** | **bool** |  | [optional] 

## Example

```python
from TebexCheckout.models.payment_payment_method import PaymentPaymentMethod

# TODO update the JSON string below
json = "{}"
# create an instance of PaymentPaymentMethod from a JSON string
payment_payment_method_instance = PaymentPaymentMethod.from_json(json)
# print the JSON string representation of the object
print(PaymentPaymentMethod.to_json())

# convert the object into a dict
payment_payment_method_dict = payment_payment_method_instance.to_dict()
# create an instance of PaymentPaymentMethod from a dict
payment_payment_method_from_dict = PaymentPaymentMethod.from_dict(payment_payment_method_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


