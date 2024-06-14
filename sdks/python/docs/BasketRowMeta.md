# BasketRowMeta


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | [optional] 
**rowprice** | **float** |  | [optional] 
**initialprice** | **float** |  | [optional] 
**is_cumulative** | **bool** |  | [optional] 
**required_packages** | **List[int]** |  | [optional] 
**requires_any** | **bool** |  | [optional] 
**category** | **bool** |  | [optional] 
**produces_gift_card** | **bool** |  | [optional] 
**allows_gift_cards** | **bool** |  | [optional] 
**servers** | **List[int]** |  | [optional] 
**limits** | [**BasketRowMetaLimits**](BasketRowMetaLimits.md) |  | [optional] 
**has_deliverables** | **bool** |  | [optional] 
**deliverable_types** | **List[str]** |  | [optional] 
**download_link** | **str** |  | [optional] 
**has_seller_protection** | **bool** |  | [optional] 
**item_type** | **str** |  | [optional] 
**revenue_share** | **List[float]** |  | [optional] 
**image** | **str** |  | [optional] 
**realprice** | **float** |  | [optional] 

## Example

```python
from TebexCheckout.models.basket_row_meta import BasketRowMeta

# TODO update the JSON string below
json = "{}"
# create an instance of BasketRowMeta from a JSON string
basket_row_meta_instance = BasketRowMeta.from_json(json)
# print the JSON string representation of the object
print(BasketRowMeta.to_json())

# convert the object into a dict
basket_row_meta_dict = basket_row_meta_instance.to_dict()
# create an instance of BasketRowMeta from a dict
basket_row_meta_from_dict = BasketRowMeta.from_dict(basket_row_meta_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


