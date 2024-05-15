# PaymentFeesGateway


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **float** |  | [optional] 
**currency** | **str** |  | [optional] 

## Example

```python
from TebexCheckout.models.payment_fees_gateway import PaymentFeesGateway

# TODO update the JSON string below
json = "{}"
# create an instance of PaymentFeesGateway from a JSON string
payment_fees_gateway_instance = PaymentFeesGateway.from_json(json)
# print the JSON string representation of the object
print(PaymentFeesGateway.to_json())

# convert the object into a dict
payment_fees_gateway_dict = payment_fees_gateway_instance.to_dict()
# create an instance of PaymentFeesGateway from a dict
payment_fees_gateway_from_dict = PaymentFeesGateway.from_dict(payment_fees_gateway_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


