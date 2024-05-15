# PaymentStatus


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] 
**description** | **str** |  | [optional] 

## Example

```python
from TebexCheckout.models.payment_status import PaymentStatus

# TODO update the JSON string below
json = "{}"
# create an instance of PaymentStatus from a JSON string
payment_status_instance = PaymentStatus.from_json(json)
# print the JSON string representation of the object
print(PaymentStatus.to_json())

# convert the object into a dict
payment_status_dict = payment_status_instance.to_dict()
# create an instance of PaymentStatus from a dict
payment_status_from_dict = PaymentStatus.from_dict(payment_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


