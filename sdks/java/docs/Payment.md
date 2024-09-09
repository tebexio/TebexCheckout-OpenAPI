

# Payment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionId** | **String** |  |  [optional] |
|**status** | [**PaymentStatus**](PaymentStatus.md) |  |  [optional] |
|**paymentSequence** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**price** | [**PaymentPrice**](PaymentPrice.md) |  |  [optional] |
|**pricePaid** | [**PaymentPrice**](PaymentPrice.md) |  |  [optional] |
|**paymentMethod** | [**PaymentPaymentMethod**](PaymentPaymentMethod.md) |  |  [optional] |
|**revenueShare** | [**List&lt;RevenueShare&gt;**](RevenueShare.md) |  |  [optional] |
|**declineReason** | **String** |  |  [optional] |
|**fees** | [**PaymentFees**](PaymentFees.md) |  |  [optional] |
|**customer** | [**PaymentCustomer**](PaymentCustomer.md) |  |  [optional] |
|**products** | [**List&lt;PaymentProductsInner&gt;**](PaymentProductsInner.md) |  |  [optional] |
|**coupons** | **List&lt;Object&gt;** |  |  [optional] |
|**giftCards** | **List&lt;Object&gt;** |  |  [optional] |
|**recurringPaymentReference** | **String** |  |  [optional] |
|**custom** | **Object** |  |  [optional] |



