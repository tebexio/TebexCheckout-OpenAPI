# UpdateSubscriptionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[Package]**](Package.md) | An array containing the item to be added to the recurring payment. **Only 1 item is supported at this time.** | [optional] 

## Example

```python
from TebexCheckout.models.update_subscription_request import UpdateSubscriptionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateSubscriptionRequest from a JSON string
update_subscription_request_instance = UpdateSubscriptionRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateSubscriptionRequest.to_json())

# convert the object into a dict
update_subscription_request_dict = update_subscription_request_instance.to_dict()
# create an instance of UpdateSubscriptionRequest from a dict
update_subscription_request_from_dict = UpdateSubscriptionRequest.from_dict(update_subscription_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


