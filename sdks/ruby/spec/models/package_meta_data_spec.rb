=begin
#Tebex Checkout API

#The Checkout APIs are designed to allow our creators to use the Tebex Checkout flow and payment acceptance capabilities without the need to set up a Tebex-powered webstore. Using these APIs allows you to create baskets with custom products (as opposed to pre-created products on our webstore platform), and send customers directly to the checkout flow to proceed with payment options.  You must receive prior authorisation before the Checkout API is enabled on your account. Please contact customer support or your account manager to discover if you qualify to use the Checkout API before beginning integration.

The version of the OpenAPI document: 1.0.0
Contact: tebex-integrations@overwolf.com
Generated by: https://openapi-generator.tech
Generator version: 7.5.0

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for OpenapiClient::PackageMetaData
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe OpenapiClient::PackageMetaData do
  let(:instance) { OpenapiClient::PackageMetaData.new }

  describe 'test an instance of PackageMetaData' do
    it 'should create an instance of PackageMetaData' do
      # uncomment below to test the instance creation
      #expect(instance).to be_instance_of(OpenapiClient::PackageMetaData)
    end
  end

  describe 'test attribute "custom"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

end
