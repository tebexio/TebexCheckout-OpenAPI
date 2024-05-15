# PaymentCustom


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user** | **str** |  | [optional] 
**ref** | **str** |  | [optional] 

## Example

```python
from TebexCheckout.models.payment_custom import PaymentCustom

# TODO update the JSON string below
json = "{}"
# create an instance of PaymentCustom from a JSON string
payment_custom_instance = PaymentCustom.from_json(json)
# print the JSON string representation of the object
print(PaymentCustom.to_json())

# convert the object into a dict
payment_custom_dict = payment_custom_instance.to_dict()
# create an instance of PaymentCustom from a dict
payment_custom_from_dict = PaymentCustom.from_dict(payment_custom_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


