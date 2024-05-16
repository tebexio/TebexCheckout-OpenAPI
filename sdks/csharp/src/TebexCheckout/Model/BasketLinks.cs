/*
 * Tebex Checkout API
 *
 * The Checkout APIs are designed to allow our creators to use the Tebex Checkout flow and payment acceptance capabilities without the need to set up a Tebex-powered webstore. Using these APIs allows you to create baskets with custom products (as opposed to pre-created products on our webstore platform), and send customers directly to the checkout flow to proceed with payment options.  You must receive prior authorisation before the Checkout API is enabled on your account. Please contact customer support or your account manager to discover if you qualify to use the Checkout API before beginning integration.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: tebex-integrations@overwolf.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = TebexCheckout.Client.OpenAPIDateConverter;

namespace TebexCheckout.Model
{
    /// <summary>
    /// BasketLinks
    /// </summary>
    [DataContract(Name = "BasketLinks")]
    public partial class BasketLinks : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BasketLinks" /> class.
        /// </summary>
        /// <param name="payment">The &#x60;links.payment&#x60; property is only returned if the basket has been paid for and a payment exists with the &#x60;complete&#x60;,&#x60;refund&#x60;, or &#x60;chargeback&#x60; status..</param>
        /// <param name="checkout">The &#x60;links.checkout&#x60; property is only returned if the basket has not been paid, and is the URL to send the customer to make payment.</param>
        public BasketLinks(string payment = default(string), string checkout = default(string))
        {
            this.Payment = payment;
            this.Checkout = checkout;
        }

        /// <summary>
        /// The &#x60;links.payment&#x60; property is only returned if the basket has been paid for and a payment exists with the &#x60;complete&#x60;,&#x60;refund&#x60;, or &#x60;chargeback&#x60; status.
        /// </summary>
        /// <value>The &#x60;links.payment&#x60; property is only returned if the basket has been paid for and a payment exists with the &#x60;complete&#x60;,&#x60;refund&#x60;, or &#x60;chargeback&#x60; status.</value>
        /// <example>https://checkout.tebex.io/api/payments/tbx-12345</example>
        [DataMember(Name = "payment", EmitDefaultValue = false)]
        public string Payment { get; set; }

        /// <summary>
        /// The &#x60;links.checkout&#x60; property is only returned if the basket has not been paid, and is the URL to send the customer to make payment
        /// </summary>
        /// <value>The &#x60;links.checkout&#x60; property is only returned if the basket has not been paid, and is the URL to send the customer to make payment</value>
        /// <example>https://checkout.tebex.io/checkout/1a-55fff4107740a1f40d844ff89607557f45bfafb3</example>
        [DataMember(Name = "checkout", EmitDefaultValue = false)]
        public string Checkout { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class BasketLinks {\n");
            sb.Append("  Payment: ").Append(Payment).Append("\n");
            sb.Append("  Checkout: ").Append(Checkout).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}