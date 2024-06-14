# BasketRow


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] 
**basket** | **int** | Numeric basket ID | [optional] 
**package** | **int** | Package ID associated with this item | [optional] 
**override** | **int** | Package ID associated with this item | [optional] 
**quantity** | **int** |  | [optional] 
**server** | **int** |  | [optional] 
**price** | **float** |  | [optional] 
**gift_username_id** | **int** |  | [optional] 
**options** | **object** |  | [optional] 
**recurring** | **bool** |  | [optional] 
**recurring_period** | **str** |  | [optional] 
**recurring_next_payment_date** | **datetime** |  | [optional] 
**meta** | [**BasketRowMeta**](BasketRowMeta.md) |  | [optional] 
**custom** | **object** |  | [optional] 
**image_url** | **str** |  | [optional] 
**recurring_price** | **float** |  | [optional] 

## Example

```python
from TebexCheckout.models.basket_row import BasketRow

# TODO update the JSON string below
json = "{}"
# create an instance of BasketRow from a JSON string
basket_row_instance = BasketRow.from_json(json)
# print the JSON string representation of the object
print(BasketRow.to_json())

# convert the object into a dict
basket_row_dict = basket_row_instance.to_dict()
# create an instance of BasketRow from a dict
basket_row_from_dict = BasketRow.from_dict(basket_row_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


