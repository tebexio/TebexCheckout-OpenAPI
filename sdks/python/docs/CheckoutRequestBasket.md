# CheckoutRequestBasket

An object containing the customer's information, relevant links, and any custom tracking data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**first_name** | **str** |  | [optional] 
**last_name** | **str** |  | [optional] 
**email** | **str** |  | [optional] 
**return_url** | **str** |  | [optional] 
**complete_url** | **str** |  | [optional] 
**custom** | **object** |  | [optional] 

## Example

```python
from TebexCheckout.models.checkout_request_basket import CheckoutRequestBasket

# TODO update the JSON string below
json = "{}"
# create an instance of CheckoutRequestBasket from a JSON string
checkout_request_basket_instance = CheckoutRequestBasket.from_json(json)
# print the JSON string representation of the object
print(CheckoutRequestBasket.to_json())

# convert the object into a dict
checkout_request_basket_dict = checkout_request_basket_instance.to_dict()
# create an instance of CheckoutRequestBasket from a dict
checkout_request_basket_from_dict = CheckoutRequestBasket.from_dict(checkout_request_basket_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


