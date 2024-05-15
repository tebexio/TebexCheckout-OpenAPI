# CheckoutItem

An item added to a basket as part of the `/checkout` request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**package** | [**Package**](Package.md) |  | [optional] 

## Example

```python
from TebexCheckout.models.checkout_item import CheckoutItem

# TODO update the JSON string below
json = "{}"
# create an instance of CheckoutItem from a JSON string
checkout_item_instance = CheckoutItem.from_json(json)
# print the JSON string representation of the object
print(CheckoutItem.to_json())

# convert the object into a dict
checkout_item_dict = checkout_item_instance.to_dict()
# create an instance of CheckoutItem from a dict
checkout_item_from_dict = CheckoutItem.from_dict(checkout_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


