/*
 * Tebex Checkout API
 *
 * The Checkout APIs are designed to allow our creators to use the Tebex Checkout flow and payment acceptance capabilities without the need to set up a Tebex-powered webstore. Using these APIs allows you to create baskets with custom products (as opposed to pre-created products on our webstore platform), and send customers directly to the checkout flow to proceed with payment options.  You must receive prior authorisation before the Checkout API is enabled on your account. Please contact customer support or your account manager to discover if you qualify to use the Checkout API before beginning integration.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: tebex-integrations@overwolf.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using Xunit;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using TebexCheckout.Model;
using TebexCheckout.Client;
using System.Reflection;
using Newtonsoft.Json;

namespace TebexCheckout.Test.Model
{
    /// <summary>
    ///  Class for testing RevenueShare
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the model.
    /// </remarks>
    public class RevenueShareTests : IDisposable
    {
        // TODO uncomment below to declare an instance variable for RevenueShare
        //private RevenueShare instance;

        public RevenueShareTests()
        {
            // TODO uncomment below to create an instance of RevenueShare
            //instance = new RevenueShare();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of RevenueShare
        /// </summary>
        [Fact]
        public void RevenueShareInstanceTest()
        {
            // TODO uncomment below to test "IsType" RevenueShare
            //Assert.IsType<RevenueShare>(instance);
        }

        /// <summary>
        /// Test the property 'WalletRef'
        /// </summary>
        [Fact]
        public void WalletRefTest()
        {
            // TODO unit test for the property 'WalletRef'
        }

        /// <summary>
        /// Test the property 'Amount'
        /// </summary>
        [Fact]
        public void AmountTest()
        {
            // TODO unit test for the property 'Amount'
        }

        /// <summary>
        /// Test the property 'GatewayFeePercent'
        /// </summary>
        [Fact]
        public void GatewayFeePercentTest()
        {
            // TODO unit test for the property 'GatewayFeePercent'
        }
    }
}
