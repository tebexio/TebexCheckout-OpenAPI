# PaymentPrice


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **float** |  | [optional] 
**currency** | **str** |  | [optional] 

## Example

```python
from TebexCheckout.models.payment_price import PaymentPrice

# TODO update the JSON string below
json = "{}"
# create an instance of PaymentPrice from a JSON string
payment_price_instance = PaymentPrice.from_json(json)
# print the JSON string representation of the object
print(PaymentPrice.to_json())

# convert the object into a dict
payment_price_dict = payment_price_instance.to_dict()
# create an instance of PaymentPrice from a dict
payment_price_from_dict = PaymentPrice.from_dict(payment_price_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


