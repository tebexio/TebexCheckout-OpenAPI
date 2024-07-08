# PaymentSubjectPaymentMethod


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | [optional] 
**refundable** | **bool** |  | [optional] 

## Example

```python
from TebexCheckout.models.payment_subject_payment_method import PaymentSubjectPaymentMethod

# TODO update the JSON string below
json = "{}"
# create an instance of PaymentSubjectPaymentMethod from a JSON string
payment_subject_payment_method_instance = PaymentSubjectPaymentMethod.from_json(json)
# print the JSON string representation of the object
print(PaymentSubjectPaymentMethod.to_json())

# convert the object into a dict
payment_subject_payment_method_dict = payment_subject_payment_method_instance.to_dict()
# create an instance of PaymentSubjectPaymentMethod from a dict
payment_subject_payment_method_from_dict = PaymentSubjectPaymentMethod.from_dict(payment_subject_payment_method_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


