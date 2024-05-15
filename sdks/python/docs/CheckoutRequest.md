# CheckoutRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**basket** | [**CheckoutRequestBasket**](CheckoutRequestBasket.md) |  | 
**items** | [**List[CheckoutItem]**](CheckoutItem.md) | An array of &#x60;Packages&#x60; in the basket. | 
**sale** | [**Sale**](Sale.md) |  | [optional] 

## Example

```python
from TebexCheckout.models.checkout_request import CheckoutRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CheckoutRequest from a JSON string
checkout_request_instance = CheckoutRequest.from_json(json)
# print the JSON string representation of the object
print(CheckoutRequest.to_json())

# convert the object into a dict
checkout_request_dict = checkout_request_instance.to_dict()
# create an instance of CheckoutRequest from a dict
checkout_request_from_dict = CheckoutRequest.from_dict(checkout_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


