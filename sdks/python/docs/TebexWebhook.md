# TebexWebhook


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | [optional] 
**type** | **str** |  | [optional] 
**var_date** | **str** |  | [optional] 
**subject** | **object** | Depending on the webhook &#x60;type&#x60;, the &#x60;subject&#x60; will contain as &#x60;PaymentSubject&#x60; or &#x60;RecurringPaymentSubject&#x60;. | [optional] 

## Example

```python
from TebexCheckout.models.tebex_webhook import TebexWebhook

# TODO update the JSON string below
json = "{}"
# create an instance of TebexWebhook from a JSON string
tebex_webhook_instance = TebexWebhook.from_json(json)
# print the JSON string representation of the object
print(TebexWebhook.to_json())

# convert the object into a dict
tebex_webhook_dict = tebex_webhook_instance.to_dict()
# create an instance of TebexWebhook from a dict
tebex_webhook_from_dict = TebexWebhook.from_dict(tebex_webhook_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


