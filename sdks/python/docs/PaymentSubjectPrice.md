# PaymentSubjectPrice


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **float** |  | [optional] 
**currency** | **str** |  | [optional] 

## Example

```python
from TebexCheckout.models.payment_subject_price import PaymentSubjectPrice

# TODO update the JSON string below
json = "{}"
# create an instance of PaymentSubjectPrice from a JSON string
payment_subject_price_instance = PaymentSubjectPrice.from_json(json)
# print the JSON string representation of the object
print(PaymentSubjectPrice.to_json())

# convert the object into a dict
payment_subject_price_dict = payment_subject_price_instance.to_dict()
# create an instance of PaymentSubjectPrice from a dict
payment_subject_price_from_dict = PaymentSubjectPrice.from_dict(payment_subject_price_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


