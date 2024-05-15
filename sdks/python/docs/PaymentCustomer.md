# PaymentCustomer


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**first_name** | **str** |  | [optional] 
**last_name** | **str** |  | [optional] 
**email** | **str** |  | [optional] 
**ip** | **str** |  | [optional] 
**username** | **str** |  | [optional] 
**marketing_consent** | **bool** |  | [optional] 
**country** | **str** |  | [optional] 
**postal_code** | **str** |  | [optional] 

## Example

```python
from TebexCheckout.models.payment_customer import PaymentCustomer

# TODO update the JSON string below
json = "{}"
# create an instance of PaymentCustomer from a JSON string
payment_customer_instance = PaymentCustomer.from_json(json)
# print the JSON string representation of the object
print(PaymentCustomer.to_json())

# convert the object into a dict
payment_customer_dict = payment_customer_instance.to_dict()
# create an instance of PaymentCustomer from a dict
payment_customer_from_dict = PaymentCustomer.from_dict(payment_customer_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


