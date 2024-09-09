# Basket


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ident** | **str** |  | [optional] 
**expire** | **str** |  | [optional] 
**price** | **float** |  | [optional] 
**price_details** | [**PriceDetails**](PriceDetails.md) |  | [optional] 
**is_payment_method_update** | **bool** |  | [optional] 
**return_url** | **str** |  | [optional] 
**complete** | **bool** |  | [optional] 
**tax** | **float** |  | [optional] 
**username** | **str** |  | [optional] 
**email_immutable** | **bool** |  | [optional] 
**discounts** | **List[object]** |  | [optional] 
**coupons** | **List[object]** |  | [optional] 
**giftcards** | **List[object]** |  | [optional] 
**address** | [**Address**](Address.md) |  | [optional] 
**rows** | [**List[BasketRow]**](BasketRow.md) |  | [optional] 
**fingerprint** | **str** | Browser fingerprint to identify the user | [optional] 
**creator_code** | **str** | The creator code is used to share a percentage of the payment with another party. See more about creator codes at https://docs.tebex.io/creators/tebex-control-panel/engagement/creator-codes | [optional] 
**roundup** | **bool** |  | [optional] 
**cancel_url** | **str** |  | [optional] 
**complete_url** | **str** |  | [optional] 
**complete_auto_redirect** | **bool** |  | [optional] 
**recurring_items** | **List[object]** |  | [optional] 
**payment** | [**Payment**](.md) |  | [optional] 
**custom** | **object** |  | [optional] 
**links** | [**BasketLinks**](BasketLinks.md) |  | [optional] 

## Example

```python
from TebexCheckout.models.basket import Basket

# TODO update the JSON string below
json = "{}"
# create an instance of Basket from a JSON string
basket_instance = Basket.from_json(json)
# print the JSON string representation of the object
print(Basket.to_json())

# convert the object into a dict
basket_dict = basket_instance.to_dict()
# create an instance of Basket from a dict
basket_from_dict = Basket.from_dict(basket_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


