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
    ///  Class for testing BasketRowMetaLimitsUser
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the model.
    /// </remarks>
    public class BasketRowMetaLimitsUserTests : IDisposable
    {
        // TODO uncomment below to declare an instance variable for BasketRowMetaLimitsUser
        //private BasketRowMetaLimitsUser instance;

        public BasketRowMetaLimitsUserTests()
        {
            // TODO uncomment below to create an instance of BasketRowMetaLimitsUser
            //instance = new BasketRowMetaLimitsUser();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of BasketRowMetaLimitsUser
        /// </summary>
        [Fact]
        public void BasketRowMetaLimitsUserInstanceTest()
        {
            // TODO uncomment below to test "IsType" BasketRowMetaLimitsUser
            //Assert.IsType<BasketRowMetaLimitsUser>(instance);
        }

        /// <summary>
        /// Test the property 'Enabled'
        /// </summary>
        [Fact]
        public void EnabledTest()
        {
            // TODO unit test for the property 'Enabled'
        }

        /// <summary>
        /// Test the property 'Timestamp'
        /// </summary>
        [Fact]
        public void TimestampTest()
        {
            // TODO unit test for the property 'Timestamp'
        }

        /// <summary>
        /// Test the property 'Limit'
        /// </summary>
        [Fact]
        public void LimitTest()
        {
            // TODO unit test for the property 'Limit'
        }
    }
}