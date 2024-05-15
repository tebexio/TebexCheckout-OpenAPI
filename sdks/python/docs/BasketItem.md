# BasketItem

A package within an existing basket.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**qty** | **int** | The quantity of &#x60;package&#x60; in this basket. This is not the total quantity of overall items in the basket. | [optional] 
**type** | **str** | The type of payment, either &#x60;single&#x60; for one-time payments or &#x60;subscription&#x60;. | [optional] 
**revenue_share** | [**List[RevenueShare]**](RevenueShare.md) | An array of payment destination objects describing how the purchase should be split between multiple wallets. **Only available with pre-agreement from Tebex.** | [optional] 

## Example

```python
from TebexCheckout.models.basket_item import BasketItem

# TODO update the JSON string below
json = "{}"
# create an instance of BasketItem from a JSON string
basket_item_instance = BasketItem.from_json(json)
# print the JSON string representation of the object
print(BasketItem.to_json())

# convert the object into a dict
basket_item_dict = basket_item_instance.to_dict()
# create an instance of BasketItem from a dict
basket_item_from_dict = BasketItem.from_dict(basket_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


