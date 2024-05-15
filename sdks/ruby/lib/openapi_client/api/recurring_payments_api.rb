=begin
#Tebex Checkout API

#The Checkout APIs are designed to allow our creators to use the Tebex Checkout flow and payment acceptance capabilities without the need to set up a Tebex-powered webstore. Using these APIs allows you to create baskets with custom products (as opposed to pre-created products on our webstore platform), and send customers directly to the checkout flow to proceed with payment options.  You must receive prior authorisation before the Checkout API is enabled on your account. Please contact customer support or your account manager to discover if you qualify to use the Checkout API before beginning integration.

The version of the OpenAPI document: 1.0.0
Contact: tebex-integrations@overwolf.com
Generated by: https://openapi-generator.tech
Generator version: 7.5.0

=end

require 'cgi'

module OpenapiClient
  class RecurringPaymentsApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Cancel a recurring payment
    # This cancels the recurring payment for the reference provided. Recurring payment references start with `tbx-r-`
    # @param reference [String] The recurring payment reference to cancel.
    # @param [Hash] opts the optional parameters
    # @return [RecurringPayment]
    def cancel_recurring_payment(reference, opts = {})
      data, _status_code, _headers = cancel_recurring_payment_with_http_info(reference, opts)
      data
    end

    # Cancel a recurring payment
    # This cancels the recurring payment for the reference provided. Recurring payment references start with &#x60;tbx-r-&#x60;
    # @param reference [String] The recurring payment reference to cancel.
    # @param [Hash] opts the optional parameters
    # @return [Array<(RecurringPayment, Integer, Hash)>] RecurringPayment data, response status code and response headers
    def cancel_recurring_payment_with_http_info(reference, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: RecurringPaymentsApi.cancel_recurring_payment ...'
      end
      # verify the required parameter 'reference' is set
      if @api_client.config.client_side_validation && reference.nil?
        fail ArgumentError, "Missing the required parameter 'reference' when calling RecurringPaymentsApi.cancel_recurring_payment"
      end
      # resource path
      local_var_path = '/recurring-payments/{reference}'.sub('{' + 'reference' + '}', CGI.escape(reference.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'RecurringPayment'

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"RecurringPaymentsApi.cancel_recurring_payment",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:DELETE, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: RecurringPaymentsApi#cancel_recurring_payment\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Fetch a recurring payment (subscription) by its reference
    # @param reference [String] The recurring payment reference to fetch.
    # @param [Hash] opts the optional parameters
    # @return [RecurringPayment]
    def get_recurring_payment(reference, opts = {})
      data, _status_code, _headers = get_recurring_payment_with_http_info(reference, opts)
      data
    end

    # Fetch a recurring payment (subscription) by its reference
    # @param reference [String] The recurring payment reference to fetch.
    # @param [Hash] opts the optional parameters
    # @return [Array<(RecurringPayment, Integer, Hash)>] RecurringPayment data, response status code and response headers
    def get_recurring_payment_with_http_info(reference, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: RecurringPaymentsApi.get_recurring_payment ...'
      end
      # verify the required parameter 'reference' is set
      if @api_client.config.client_side_validation && reference.nil?
        fail ArgumentError, "Missing the required parameter 'reference' when calling RecurringPaymentsApi.get_recurring_payment"
      end
      # resource path
      local_var_path = '/recurring-payments/{reference}'.sub('{' + 'reference' + '}', CGI.escape(reference.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'RecurringPayment'

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"RecurringPaymentsApi.get_recurring_payment",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: RecurringPaymentsApi#get_recurring_payment\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Pause or reactivate a recurring payment
    # @param reference [String] The recurring payment reference to update.
    # @param [Hash] opts the optional parameters
    # @option opts [UpdateRecurringPaymentRequest] :update_recurring_payment_request 
    # @return [RecurringPayment]
    def update_recurring_payment(reference, opts = {})
      data, _status_code, _headers = update_recurring_payment_with_http_info(reference, opts)
      data
    end

    # Pause or reactivate a recurring payment
    # @param reference [String] The recurring payment reference to update.
    # @param [Hash] opts the optional parameters
    # @option opts [UpdateRecurringPaymentRequest] :update_recurring_payment_request 
    # @return [Array<(RecurringPayment, Integer, Hash)>] RecurringPayment data, response status code and response headers
    def update_recurring_payment_with_http_info(reference, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: RecurringPaymentsApi.update_recurring_payment ...'
      end
      # verify the required parameter 'reference' is set
      if @api_client.config.client_side_validation && reference.nil?
        fail ArgumentError, "Missing the required parameter 'reference' when calling RecurringPaymentsApi.update_recurring_payment"
      end
      # resource path
      local_var_path = '/recurring-payments/{reference}/status'.sub('{' + 'reference' + '}', CGI.escape(reference.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      content_type = @api_client.select_header_content_type(['application/json'])
      if !content_type.nil?
          header_params['Content-Type'] = content_type
      end

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body] || @api_client.object_to_http_body(opts[:'update_recurring_payment_request'])

      # return_type
      return_type = opts[:debug_return_type] || 'RecurringPayment'

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"RecurringPaymentsApi.update_recurring_payment",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:PUT, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: RecurringPaymentsApi#update_recurring_payment\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Update a subscription with a new product / amount to pay - replacing the existing product
    # If the new subscription amount is higher than the existing amount, a pro-rata charge will be made to cover the cost of the new price up until the next billing date.   **This endpoint requires prior approval - please contact your account manager.**
    # @param reference [String] The recurring payment reference to fetch.
    # @param [Hash] opts the optional parameters
    # @option opts [UpdateSubscriptionRequest] :update_subscription_request 
    # @return [RecurringPayment]
    def update_subscription(reference, opts = {})
      data, _status_code, _headers = update_subscription_with_http_info(reference, opts)
      data
    end

    # Update a subscription with a new product / amount to pay - replacing the existing product
    # If the new subscription amount is higher than the existing amount, a pro-rata charge will be made to cover the cost of the new price up until the next billing date.   **This endpoint requires prior approval - please contact your account manager.**
    # @param reference [String] The recurring payment reference to fetch.
    # @param [Hash] opts the optional parameters
    # @option opts [UpdateSubscriptionRequest] :update_subscription_request 
    # @return [Array<(RecurringPayment, Integer, Hash)>] RecurringPayment data, response status code and response headers
    def update_subscription_with_http_info(reference, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: RecurringPaymentsApi.update_subscription ...'
      end
      # verify the required parameter 'reference' is set
      if @api_client.config.client_side_validation && reference.nil?
        fail ArgumentError, "Missing the required parameter 'reference' when calling RecurringPaymentsApi.update_subscription"
      end
      # resource path
      local_var_path = '/recurring-payments/{reference}'.sub('{' + 'reference' + '}', CGI.escape(reference.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      content_type = @api_client.select_header_content_type(['application/json'])
      if !content_type.nil?
          header_params['Content-Type'] = content_type
      end

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body] || @api_client.object_to_http_body(opts[:'update_subscription_request'])

      # return_type
      return_type = opts[:debug_return_type] || 'RecurringPayment'

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"RecurringPaymentsApi.update_subscription",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:PUT, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: RecurringPaymentsApi#update_subscription\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
