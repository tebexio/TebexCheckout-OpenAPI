# OpenapiClient::PaymentsApi

All URIs are relative to *https://checkout.tebex.io/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**get_payment_by_id**](PaymentsApi.md#get_payment_by_id) | **GET** /payments/{txnId}?type&#x3D;txn_id | Fetch a payment by its transaction ID |
| [**refund_payment_by_id**](PaymentsApi.md#refund_payment_by_id) | **POST** /payments/{txnId}/refund?type&#x3D;txn_id | Refund a payment by its transaction ID |


## get_payment_by_id

> <Payment> get_payment_by_id(txn_id)

Fetch a payment by its transaction ID

This will fetch the given payment associated with this transaction id. Single payment transaction IDs begin with `tbx-`

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::PaymentsApi.new
txn_id = 'tbx-55fff4107740a1f40d844ff89607557f45bfafb3' # String | The payment reference to fetch.

begin
  # Fetch a payment by its transaction ID
  result = api_instance.get_payment_by_id(txn_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling PaymentsApi->get_payment_by_id: #{e}"
end
```

#### Using the get_payment_by_id_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Payment>, Integer, Hash)> get_payment_by_id_with_http_info(txn_id)

```ruby
begin
  # Fetch a payment by its transaction ID
  data, status_code, headers = api_instance.get_payment_by_id_with_http_info(txn_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Payment>
rescue OpenapiClient::ApiError => e
  puts "Error when calling PaymentsApi->get_payment_by_id_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **txn_id** | **String** | The payment reference to fetch. |  |

### Return type

[**Payment**](Payment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## refund_payment_by_id

> <Payment> refund_payment_by_id(txn_id)

Refund a payment by its transaction ID

This will refund the given payment associated with this transaction id.

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::PaymentsApi.new
txn_id = 'tbx-55fff4107740a1f40d844ff89607557f45bfafb3' # String | The payment reference to refund.

begin
  # Refund a payment by its transaction ID
  result = api_instance.refund_payment_by_id(txn_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling PaymentsApi->refund_payment_by_id: #{e}"
end
```

#### Using the refund_payment_by_id_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Payment>, Integer, Hash)> refund_payment_by_id_with_http_info(txn_id)

```ruby
begin
  # Refund a payment by its transaction ID
  data, status_code, headers = api_instance.refund_payment_by_id_with_http_info(txn_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Payment>
rescue OpenapiClient::ApiError => e
  puts "Error when calling PaymentsApi->refund_payment_by_id_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **txn_id** | **String** | The payment reference to refund. |  |

### Return type

[**Payment**](Payment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

