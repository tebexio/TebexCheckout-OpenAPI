

# PaymentSubject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionId** | **String** |  |  [optional] |
|**status** | [**PaymentStatus**](PaymentStatus.md) |  |  [optional] |
|**paymentSequence** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**price** | [**PaymentSubjectPrice**](PaymentSubjectPrice.md) |  |  [optional] |
|**pricePaid** | [**PaymentSubjectPrice**](PaymentSubjectPrice.md) |  |  [optional] |
|**paymentMethod** | [**PaymentSubjectPaymentMethod**](PaymentSubjectPaymentMethod.md) |  |  [optional] |
|**fees** | [**PaymentSubjectFees**](PaymentSubjectFees.md) |  |  [optional] |
|**customer** | [**PaymentSubjectCustomer**](PaymentSubjectCustomer.md) |  |  [optional] |
|**products** | [**List&lt;PaymentSubjectProductsInner&gt;**](PaymentSubjectProductsInner.md) |  |  [optional] |
|**coupons** | **List&lt;Object&gt;** |  |  [optional] |
|**giftCards** | **List&lt;Object&gt;** |  |  [optional] |
|**recurringPaymentReference** | **String** |  |  [optional] |
|**custom** | **Object** |  |  [optional] |
|**revenueShare** | [**List&lt;RevenueShare&gt;**](RevenueShare.md) |  |  [optional] |
|**declineReason** | **String** |  |  [optional] |



