# UpdateBasketRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**state_id** | **str** |  | [optional] 
**first_name** | **str** |  | [optional] 
**last_name** | **str** |  | [optional] 
**postal_code** | **str** |  | [optional] 
**creator_code** | **str** |  | [optional] 
**complete_auto_redirect** | **bool** |  | [optional] 
**expires_at** | **datetime** | An ISO8601 formatted date. After this date the basket cannot be used to checkout. | [optional] 

## Example

```python
from TebexCheckout.models.update_basket_request import UpdateBasketRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateBasketRequest from a JSON string
update_basket_request_instance = UpdateBasketRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateBasketRequest.to_json())

# convert the object into a dict
update_basket_request_dict = update_basket_request_instance.to_dict()
# create an instance of UpdateBasketRequest from a dict
update_basket_request_from_dict = UpdateBasketRequest.from_dict(update_basket_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


