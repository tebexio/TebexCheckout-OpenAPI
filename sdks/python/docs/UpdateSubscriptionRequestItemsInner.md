# UpdateSubscriptionRequestItemsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The type of payment, either &#x60;single&#x60; for one-time payments or &#x60;subscription&#x60;. | [optional] 
**qty** | **float** |  | [optional] 
**revenue_share** | **List[object]** |  | [optional] 
**package** | [**Package**](Package.md) |  | [optional] 

## Example

```python
from TebexCheckout.models.update_subscription_request_items_inner import UpdateSubscriptionRequestItemsInner

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateSubscriptionRequestItemsInner from a JSON string
update_subscription_request_items_inner_instance = UpdateSubscriptionRequestItemsInner.from_json(json)
# print the JSON string representation of the object
print(UpdateSubscriptionRequestItemsInner.to_json())

# convert the object into a dict
update_subscription_request_items_inner_dict = update_subscription_request_items_inner_instance.to_dict()
# create an instance of UpdateSubscriptionRequestItemsInner from a dict
update_subscription_request_items_inner_from_dict = UpdateSubscriptionRequestItemsInner.from_dict(update_subscription_request_items_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


