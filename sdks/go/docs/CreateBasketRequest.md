# CreateBasketRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReturnUrl** | Pointer to **string** | The URL a customer can return to without completing checkout | [optional] 
**CompleteUrl** | Pointer to **string** | URL the customer can return to after completing payment | [optional] 
**Custom** | Pointer to **map[string]interface{}** | Any custom data to be passed through the request. This will be returned in a post-completion webhook. | [optional] 
**FirstName** | Pointer to **string** | The first name of the customer | [optional] 
**LastName** | Pointer to **string** | The last name of the customer | [optional] 
**Email** | Pointer to **string** | The email address of the customer | [optional] 
**ExpiresAt** | Pointer to **string** | An ISO8601 formatted date. After this date the basket cannot be used to checkout. | [optional] 
**CompleteAutoRedirect** | Pointer to **bool** | Automatically redirect to the complete_url provided | [optional] 
**Country** | Pointer to **string** | An ISO 3166-1 alpha-2 character code representing the customer&#39;s country. | [optional] 
**CreatorCode** | Pointer to **string** | The creator code is used to share a percentage of the payment with another party. See more about creator codes at https://docs.tebex.io/creators/tebex-control-panel/engagement/creator-codes | [optional] 

## Methods

### NewCreateBasketRequest

`func NewCreateBasketRequest() *CreateBasketRequest`

NewCreateBasketRequest instantiates a new CreateBasketRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateBasketRequestWithDefaults

`func NewCreateBasketRequestWithDefaults() *CreateBasketRequest`

NewCreateBasketRequestWithDefaults instantiates a new CreateBasketRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetReturnUrl

`func (o *CreateBasketRequest) GetReturnUrl() string`

GetReturnUrl returns the ReturnUrl field if non-nil, zero value otherwise.

### GetReturnUrlOk

`func (o *CreateBasketRequest) GetReturnUrlOk() (*string, bool)`

GetReturnUrlOk returns a tuple with the ReturnUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReturnUrl

`func (o *CreateBasketRequest) SetReturnUrl(v string)`

SetReturnUrl sets ReturnUrl field to given value.

### HasReturnUrl

`func (o *CreateBasketRequest) HasReturnUrl() bool`

HasReturnUrl returns a boolean if a field has been set.

### GetCompleteUrl

`func (o *CreateBasketRequest) GetCompleteUrl() string`

GetCompleteUrl returns the CompleteUrl field if non-nil, zero value otherwise.

### GetCompleteUrlOk

`func (o *CreateBasketRequest) GetCompleteUrlOk() (*string, bool)`

GetCompleteUrlOk returns a tuple with the CompleteUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompleteUrl

`func (o *CreateBasketRequest) SetCompleteUrl(v string)`

SetCompleteUrl sets CompleteUrl field to given value.

### HasCompleteUrl

`func (o *CreateBasketRequest) HasCompleteUrl() bool`

HasCompleteUrl returns a boolean if a field has been set.

### GetCustom

`func (o *CreateBasketRequest) GetCustom() map[string]interface{}`

GetCustom returns the Custom field if non-nil, zero value otherwise.

### GetCustomOk

`func (o *CreateBasketRequest) GetCustomOk() (*map[string]interface{}, bool)`

GetCustomOk returns a tuple with the Custom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustom

`func (o *CreateBasketRequest) SetCustom(v map[string]interface{})`

SetCustom sets Custom field to given value.

### HasCustom

`func (o *CreateBasketRequest) HasCustom() bool`

HasCustom returns a boolean if a field has been set.

### GetFirstName

`func (o *CreateBasketRequest) GetFirstName() string`

GetFirstName returns the FirstName field if non-nil, zero value otherwise.

### GetFirstNameOk

`func (o *CreateBasketRequest) GetFirstNameOk() (*string, bool)`

GetFirstNameOk returns a tuple with the FirstName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstName

`func (o *CreateBasketRequest) SetFirstName(v string)`

SetFirstName sets FirstName field to given value.

### HasFirstName

`func (o *CreateBasketRequest) HasFirstName() bool`

HasFirstName returns a boolean if a field has been set.

### GetLastName

`func (o *CreateBasketRequest) GetLastName() string`

GetLastName returns the LastName field if non-nil, zero value otherwise.

### GetLastNameOk

`func (o *CreateBasketRequest) GetLastNameOk() (*string, bool)`

GetLastNameOk returns a tuple with the LastName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastName

`func (o *CreateBasketRequest) SetLastName(v string)`

SetLastName sets LastName field to given value.

### HasLastName

`func (o *CreateBasketRequest) HasLastName() bool`

HasLastName returns a boolean if a field has been set.

### GetEmail

`func (o *CreateBasketRequest) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *CreateBasketRequest) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *CreateBasketRequest) SetEmail(v string)`

SetEmail sets Email field to given value.

### HasEmail

`func (o *CreateBasketRequest) HasEmail() bool`

HasEmail returns a boolean if a field has been set.

### GetExpiresAt

`func (o *CreateBasketRequest) GetExpiresAt() string`

GetExpiresAt returns the ExpiresAt field if non-nil, zero value otherwise.

### GetExpiresAtOk

`func (o *CreateBasketRequest) GetExpiresAtOk() (*string, bool)`

GetExpiresAtOk returns a tuple with the ExpiresAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpiresAt

`func (o *CreateBasketRequest) SetExpiresAt(v string)`

SetExpiresAt sets ExpiresAt field to given value.

### HasExpiresAt

`func (o *CreateBasketRequest) HasExpiresAt() bool`

HasExpiresAt returns a boolean if a field has been set.

### GetCompleteAutoRedirect

`func (o *CreateBasketRequest) GetCompleteAutoRedirect() bool`

GetCompleteAutoRedirect returns the CompleteAutoRedirect field if non-nil, zero value otherwise.

### GetCompleteAutoRedirectOk

`func (o *CreateBasketRequest) GetCompleteAutoRedirectOk() (*bool, bool)`

GetCompleteAutoRedirectOk returns a tuple with the CompleteAutoRedirect field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompleteAutoRedirect

`func (o *CreateBasketRequest) SetCompleteAutoRedirect(v bool)`

SetCompleteAutoRedirect sets CompleteAutoRedirect field to given value.

### HasCompleteAutoRedirect

`func (o *CreateBasketRequest) HasCompleteAutoRedirect() bool`

HasCompleteAutoRedirect returns a boolean if a field has been set.

### GetCountry

`func (o *CreateBasketRequest) GetCountry() string`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *CreateBasketRequest) GetCountryOk() (*string, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *CreateBasketRequest) SetCountry(v string)`

SetCountry sets Country field to given value.

### HasCountry

`func (o *CreateBasketRequest) HasCountry() bool`

HasCountry returns a boolean if a field has been set.

### GetCreatorCode

`func (o *CreateBasketRequest) GetCreatorCode() string`

GetCreatorCode returns the CreatorCode field if non-nil, zero value otherwise.

### GetCreatorCodeOk

`func (o *CreateBasketRequest) GetCreatorCodeOk() (*string, bool)`

GetCreatorCodeOk returns a tuple with the CreatorCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatorCode

`func (o *CreateBasketRequest) SetCreatorCode(v string)`

SetCreatorCode sets CreatorCode field to given value.

### HasCreatorCode

`func (o *CreateBasketRequest) HasCreatorCode() bool`

HasCreatorCode returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


