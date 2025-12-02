# CreateBasketRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**return_url** | **str** | The URL a customer can return to without completing checkout | [optional] 
**complete_url** | **str** | URL the customer can return to after completing payment | [optional] 
**custom** | **object** | Any custom data to be passed through the request. This will be returned in a post-completion webhook. | [optional] 
**first_name** | **str** | The first name of the customer | [optional] 
**last_name** | **str** | The last name of the customer | [optional] 
**email** | **str** | The email address of the customer | [optional] 
**complete_auto_redirect** | **bool** | Automatically redirect to the complete_url provided | [optional] 
**country** | **str** | An ISO 3166-1 alpha-2 character code representing the customer&#39;s country. | [optional] 
**creator_code** | **str** | The creator code is used to share a percentage of the payment with another party. See more about creator codes at https://docs.tebex.io/creators/tebex-control-panel/engagement/creator-codes | [optional] 
**ip** | **str** | The IP address of the customer using this basket. Provide the IP if creating a basket on your server backend. | [optional] 

## Example

```python
from TebexCheckout.models.create_basket_request import CreateBasketRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateBasketRequest from a JSON string
create_basket_request_instance = CreateBasketRequest.from_json(json)
# print the JSON string representation of the object
print(CreateBasketRequest.to_json())

# convert the object into a dict
create_basket_request_dict = create_basket_request_instance.to_dict()
# create an instance of CreateBasketRequest from a dict
create_basket_request_from_dict = CreateBasketRequest.from_dict(create_basket_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


