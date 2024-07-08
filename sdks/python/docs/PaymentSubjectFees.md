# PaymentSubjectFees


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tax** | [**PaymentSubjectPrice**](PaymentSubjectPrice.md) |  | [optional] 
**gateway** | [**PaymentSubjectPrice**](PaymentSubjectPrice.md) |  | [optional] 

## Example

```python
from TebexCheckout.models.payment_subject_fees import PaymentSubjectFees

# TODO update the JSON string below
json = "{}"
# create an instance of PaymentSubjectFees from a JSON string
payment_subject_fees_instance = PaymentSubjectFees.from_json(json)
# print the JSON string representation of the object
print(PaymentSubjectFees.to_json())

# convert the object into a dict
payment_subject_fees_dict = payment_subject_fees_instance.to_dict()
# create an instance of PaymentSubjectFees from a dict
payment_subject_fees_from_dict = PaymentSubjectFees.from_dict(payment_subject_fees_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


