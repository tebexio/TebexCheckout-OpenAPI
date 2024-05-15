# OpenapiClient::Payment

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **transaction_id** | **String** |  | [optional] |
| **status** | [**PaymentStatus**](PaymentStatus.md) |  | [optional] |
| **payment_sequence** | **String** |  | [optional] |
| **created_at** | **Time** |  | [optional] |
| **price** | [**PaymentPrice**](PaymentPrice.md) |  | [optional] |
| **fees** | [**PaymentFees**](PaymentFees.md) |  | [optional] |
| **customer** | [**PaymentCustomer**](PaymentCustomer.md) |  | [optional] |
| **products** | [**Array&lt;PaymentProductsInner&gt;**](PaymentProductsInner.md) |  | [optional] |
| **coupons** | **Array&lt;String&gt;** |  | [optional] |
| **gift_cards** | **Array&lt;String&gt;** |  | [optional] |
| **recurring_payment_reference** | **String** |  | [optional] |
| **custom** | [**PaymentCustom**](PaymentCustom.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::Payment.new(
  transaction_id: tbx-26929122a56954-0e15be,
  status: null,
  payment_sequence: oneoff,
  created_at: 2022-10-19T15:49:15Z,
  price: null,
  fees: null,
  customer: null,
  products: null,
  coupons: null,
  gift_cards: null,
  recurring_payment_reference: null,
  custom: null
)
```

