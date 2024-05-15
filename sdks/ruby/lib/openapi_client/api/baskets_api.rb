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
  class BasketsApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Add a package to the basket
    # This adds a package (an object describing the product) to the basket `{ident}`. For subscriptions, **only one subscription item may be in a basket at a time**, and it cannot be included with one-time payment items. **This endpoint requires prior approval. Please contact your account manager.**
    # @param ident [String] The basket identifier.
    # @param [Hash] opts the optional parameters
    # @option opts [AddPackageRequest] :add_package_request 
    # @return [Basket]
    def add_package(ident, opts = {})
      data, _status_code, _headers = add_package_with_http_info(ident, opts)
      data
    end

    # Add a package to the basket
    # This adds a package (an object describing the product) to the basket &#x60;{ident}&#x60;. For subscriptions, **only one subscription item may be in a basket at a time**, and it cannot be included with one-time payment items. **This endpoint requires prior approval. Please contact your account manager.**
    # @param ident [String] The basket identifier.
    # @param [Hash] opts the optional parameters
    # @option opts [AddPackageRequest] :add_package_request 
    # @return [Array<(Basket, Integer, Hash)>] Basket data, response status code and response headers
    def add_package_with_http_info(ident, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BasketsApi.add_package ...'
      end
      # verify the required parameter 'ident' is set
      if @api_client.config.client_side_validation && ident.nil?
        fail ArgumentError, "Missing the required parameter 'ident' when calling BasketsApi.add_package"
      end
      # resource path
      local_var_path = '/baskets/{ident}/packages'.sub('{' + 'ident' + '}', CGI.escape(ident.to_s))

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
      post_body = opts[:debug_body] || @api_client.object_to_http_body(opts[:'add_package_request'])

      # return_type
      return_type = opts[:debug_return_type] || 'Basket'

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"BasketsApi.add_package",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: BasketsApi#add_package\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Add a sale to the basket
    # Adds a `Sale` to the basket with `{ident}`. **Sales cannot be applied to baskets with `revenue_share` set.**
    # @param ident [String] The basket identifier.
    # @param [Hash] opts the optional parameters
    # @option opts [Sale] :sale Provide a &#x60;Sale&#x60; as an object to apply it to the basket.
    # @return [Basket]
    def add_sale_to_basket(ident, opts = {})
      data, _status_code, _headers = add_sale_to_basket_with_http_info(ident, opts)
      data
    end

    # Add a sale to the basket
    # Adds a &#x60;Sale&#x60; to the basket with &#x60;{ident}&#x60;. **Sales cannot be applied to baskets with &#x60;revenue_share&#x60; set.**
    # @param ident [String] The basket identifier.
    # @param [Hash] opts the optional parameters
    # @option opts [Sale] :sale Provide a &#x60;Sale&#x60; as an object to apply it to the basket.
    # @return [Array<(Basket, Integer, Hash)>] Basket data, response status code and response headers
    def add_sale_to_basket_with_http_info(ident, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BasketsApi.add_sale_to_basket ...'
      end
      # verify the required parameter 'ident' is set
      if @api_client.config.client_side_validation && ident.nil?
        fail ArgumentError, "Missing the required parameter 'ident' when calling BasketsApi.add_sale_to_basket"
      end
      # resource path
      local_var_path = '/baskets/{ident}/sales'.sub('{' + 'ident' + '}', CGI.escape(ident.to_s))

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
      post_body = opts[:debug_body] || @api_client.object_to_http_body(opts[:'sale'])

      # return_type
      return_type = opts[:debug_return_type] || 'Basket'

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"BasketsApi.add_sale_to_basket",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: BasketsApi#add_sale_to_basket\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Create a basket that can be used to pay for items
    # This will create and return a `Basket` that can be paid for by redirecting the user to `links.checkout`
    # @param [Hash] opts the optional parameters
    # @option opts [CreateBasketRequest] :create_basket_request Create a basket, returning the full basket object and payment link.
    # @return [Basket]
    def create_basket(opts = {})
      data, _status_code, _headers = create_basket_with_http_info(opts)
      data
    end

    # Create a basket that can be used to pay for items
    # This will create and return a &#x60;Basket&#x60; that can be paid for by redirecting the user to &#x60;links.checkout&#x60;
    # @param [Hash] opts the optional parameters
    # @option opts [CreateBasketRequest] :create_basket_request Create a basket, returning the full basket object and payment link.
    # @return [Array<(Basket, Integer, Hash)>] Basket data, response status code and response headers
    def create_basket_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BasketsApi.create_basket ...'
      end
      # resource path
      local_var_path = '/baskets'

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
      post_body = opts[:debug_body] || @api_client.object_to_http_body(opts[:'create_basket_request'])

      # return_type
      return_type = opts[:debug_return_type] || 'Basket'

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"BasketsApi.create_basket",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: BasketsApi#create_basket\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Fetch a basket by its identifier
    # Gets the basket associated with the provided identifier.
    # @param ident [String] The basket identifier.
    # @param [Hash] opts the optional parameters
    # @return [Basket]
    def get_basket_by_id(ident, opts = {})
      data, _status_code, _headers = get_basket_by_id_with_http_info(ident, opts)
      data
    end

    # Fetch a basket by its identifier
    # Gets the basket associated with the provided identifier.
    # @param ident [String] The basket identifier.
    # @param [Hash] opts the optional parameters
    # @return [Array<(Basket, Integer, Hash)>] Basket data, response status code and response headers
    def get_basket_by_id_with_http_info(ident, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BasketsApi.get_basket_by_id ...'
      end
      # verify the required parameter 'ident' is set
      if @api_client.config.client_side_validation && ident.nil?
        fail ArgumentError, "Missing the required parameter 'ident' when calling BasketsApi.get_basket_by_id"
      end
      # resource path
      local_var_path = '/baskets/{ident}'.sub('{' + 'ident' + '}', CGI.escape(ident.to_s))

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
      return_type = opts[:debug_return_type] || 'Basket'

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"BasketsApi.get_basket_by_id",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: BasketsApi#get_basket_by_id\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Remove a row from the basket
    # This will remove the given `{row.id}` from the basket `{ident}`. The basket must be re-fetched after running to receive updated totals.
    # @param ident [String] The basket identifier.
    # @param row_id [Integer] The &#x60;id&#x60; of the &#x60;basket.rows&#x60; row to remove.
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def remove_row_from_basket(ident, row_id, opts = {})
      remove_row_from_basket_with_http_info(ident, row_id, opts)
      nil
    end

    # Remove a row from the basket
    # This will remove the given &#x60;{row.id}&#x60; from the basket &#x60;{ident}&#x60;. The basket must be re-fetched after running to receive updated totals.
    # @param ident [String] The basket identifier.
    # @param row_id [Integer] The &#x60;id&#x60; of the &#x60;basket.rows&#x60; row to remove.
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def remove_row_from_basket_with_http_info(ident, row_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BasketsApi.remove_row_from_basket ...'
      end
      # verify the required parameter 'ident' is set
      if @api_client.config.client_side_validation && ident.nil?
        fail ArgumentError, "Missing the required parameter 'ident' when calling BasketsApi.remove_row_from_basket"
      end
      # verify the required parameter 'row_id' is set
      if @api_client.config.client_side_validation && row_id.nil?
        fail ArgumentError, "Missing the required parameter 'row_id' when calling BasketsApi.remove_row_from_basket"
      end
      # resource path
      local_var_path = '/baskets/{ident}/packages/{row.id}'.sub('{' + 'ident' + '}', CGI.escape(ident.to_s)).sub('{' + 'row.id' + '}', CGI.escape(row_id.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type]

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"BasketsApi.remove_row_from_basket",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:DELETE, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: BasketsApi#remove_row_from_basket\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
