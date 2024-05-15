# OpenapiClient::RecurringPaymentsApi

All URIs are relative to *https://checkout.tebex.io/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**cancel_recurring_payment**](RecurringPaymentsApi.md#cancel_recurring_payment) | **DELETE** /recurring-payments/{reference} | Cancel a recurring payment |
| [**get_recurring_payment**](RecurringPaymentsApi.md#get_recurring_payment) | **GET** /recurring-payments/{reference} | Fetch a recurring payment (subscription) by its reference |
| [**update_recurring_payment**](RecurringPaymentsApi.md#update_recurring_payment) | **PUT** /recurring-payments/{reference}/status | Pause or reactivate a recurring payment |
| [**update_subscription**](RecurringPaymentsApi.md#update_subscription) | **PUT** /recurring-payments/{reference} | Update a subscription with a new product / amount to pay - replacing the existing product |


## cancel_recurring_payment

> <RecurringPayment> cancel_recurring_payment(reference)

Cancel a recurring payment

This cancels the recurring payment for the reference provided. Recurring payment references start with `tbx-r-`

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::RecurringPaymentsApi.new
reference = 'tbx-r-55fff4107740a1f40d844ff89607557f45bfafb3' # String | The recurring payment reference to cancel.

begin
  # Cancel a recurring payment
  result = api_instance.cancel_recurring_payment(reference)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling RecurringPaymentsApi->cancel_recurring_payment: #{e}"
end
```

#### Using the cancel_recurring_payment_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<RecurringPayment>, Integer, Hash)> cancel_recurring_payment_with_http_info(reference)

```ruby
begin
  # Cancel a recurring payment
  data, status_code, headers = api_instance.cancel_recurring_payment_with_http_info(reference)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <RecurringPayment>
rescue OpenapiClient::ApiError => e
  puts "Error when calling RecurringPaymentsApi->cancel_recurring_payment_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **reference** | **String** | The recurring payment reference to cancel. |  |

### Return type

[**RecurringPayment**](RecurringPayment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_recurring_payment

> <RecurringPayment> get_recurring_payment(reference)

Fetch a recurring payment (subscription) by its reference

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::RecurringPaymentsApi.new
reference = 'tbx-r-55fff4107740a1f40d844ff89607557f45bfafb3' # String | The recurring payment reference to fetch.

begin
  # Fetch a recurring payment (subscription) by its reference
  result = api_instance.get_recurring_payment(reference)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling RecurringPaymentsApi->get_recurring_payment: #{e}"
end
```

#### Using the get_recurring_payment_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<RecurringPayment>, Integer, Hash)> get_recurring_payment_with_http_info(reference)

```ruby
begin
  # Fetch a recurring payment (subscription) by its reference
  data, status_code, headers = api_instance.get_recurring_payment_with_http_info(reference)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <RecurringPayment>
rescue OpenapiClient::ApiError => e
  puts "Error when calling RecurringPaymentsApi->get_recurring_payment_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **reference** | **String** | The recurring payment reference to fetch. |  |

### Return type

[**RecurringPayment**](RecurringPayment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## update_recurring_payment

> <RecurringPayment> update_recurring_payment(reference, opts)

Pause or reactivate a recurring payment

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::RecurringPaymentsApi.new
reference = 'tbx-r-55fff4107740a1f40d844ff89607557f45bfafb3' # String | The recurring payment reference to update.
opts = {
  update_recurring_payment_request: OpenapiClient::UpdateRecurringPaymentRequest.new({status: 'Paused'}) # UpdateRecurringPaymentRequest | 
}

begin
  # Pause or reactivate a recurring payment
  result = api_instance.update_recurring_payment(reference, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling RecurringPaymentsApi->update_recurring_payment: #{e}"
end
```

#### Using the update_recurring_payment_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<RecurringPayment>, Integer, Hash)> update_recurring_payment_with_http_info(reference, opts)

```ruby
begin
  # Pause or reactivate a recurring payment
  data, status_code, headers = api_instance.update_recurring_payment_with_http_info(reference, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <RecurringPayment>
rescue OpenapiClient::ApiError => e
  puts "Error when calling RecurringPaymentsApi->update_recurring_payment_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **reference** | **String** | The recurring payment reference to update. |  |
| **update_recurring_payment_request** | [**UpdateRecurringPaymentRequest**](UpdateRecurringPaymentRequest.md) |  | [optional] |

### Return type

[**RecurringPayment**](RecurringPayment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## update_subscription

> <RecurringPayment> update_subscription(reference, opts)

Update a subscription with a new product / amount to pay - replacing the existing product

If the new subscription amount is higher than the existing amount, a pro-rata charge will be made to cover the cost of the new price up until the next billing date.   **This endpoint requires prior approval - please contact your account manager.**

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::RecurringPaymentsApi.new
reference = 'tbx-r-55fff4107740a1f40d844ff89607557f45bfafb3' # String | The recurring payment reference to fetch.
opts = {
  update_subscription_request: OpenapiClient::UpdateSubscriptionRequest.new # UpdateSubscriptionRequest | 
}

begin
  # Update a subscription with a new product / amount to pay - replacing the existing product
  result = api_instance.update_subscription(reference, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling RecurringPaymentsApi->update_subscription: #{e}"
end
```

#### Using the update_subscription_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<RecurringPayment>, Integer, Hash)> update_subscription_with_http_info(reference, opts)

```ruby
begin
  # Update a subscription with a new product / amount to pay - replacing the existing product
  data, status_code, headers = api_instance.update_subscription_with_http_info(reference, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <RecurringPayment>
rescue OpenapiClient::ApiError => e
  puts "Error when calling RecurringPaymentsApi->update_subscription_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **reference** | **String** | The recurring payment reference to fetch. |  |
| **update_subscription_request** | [**UpdateSubscriptionRequest**](UpdateSubscriptionRequest.md) |  | [optional] |

### Return type

[**RecurringPayment**](RecurringPayment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

