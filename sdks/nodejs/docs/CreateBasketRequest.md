# TebexCheckoutApi.CreateBasketRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**returnUrl** | **String** | The URL a customer can return to without completing checkout | [optional] 
**completeUrl** | **String** | URL the customer can return to after completing payment | [optional] 
**custom** | **Object** | Any custom data to be passed through the request. This will be returned in a post-completion webhook. | [optional] 
**firstName** | **String** | The first name of the customer | [optional] 
**lastName** | **String** | The last name of the customer | [optional] 
**email** | **String** | The email address of the customer | [optional] 
**expiresAt** | **String** | An ISO8601 formatted date. After this date the basket cannot be used to checkout. | [optional] 
**completeAutoRedirect** | **Boolean** | Automatically redirect to the complete_url provided | [optional] 
**country** | **String** | An ISO 3166-1 alpha-2 character code representing the customer&#39;s country. | [optional] 
**creatorCode** | **String** | The creator code is used to share a percentage of the payment with another party. See more about creator codes at https://docs.tebex.io/creators/tebex-control-panel/engagement/creator-codes | [optional] 
**ip** | **String** | The IP address of the customer using this basket. Provide the IP if creating a basket on your server backend. | [optional] 


