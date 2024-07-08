# 1.1.0
-------
- Checkout API now supports baskets with both single and subscription packages in a single transaction.
    - Added `Package.type` which replaces `Basket.type`. Type may be `single` or `subscription`.
    - Changed `Package.metaData -> Package.custom`
- Authorization is now included with bundled SDKs
- Added models for webhooks and webhook subjects
    - `TebexWebhook`
    - `PaymentSubject`
    - `RecurringPaymentSubject`
- Removed `RecurringPeriod` model
- Removed `Basket.recurringPeriod`
- Removed `Basket.recurringNextPaymentDate`

# 1.0.0
---------
- Initial release.