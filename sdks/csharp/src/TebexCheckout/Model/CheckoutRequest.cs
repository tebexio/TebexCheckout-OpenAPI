/*
 * Tebex Checkout API
 *
 * The Checkout APIs are designed to allow our creators to use the Tebex Checkout flow and payment acceptance capabilities without the need to set up a Tebex-powered webstore. Using these APIs allows you to create baskets with custom products (as opposed to pre-created products on our webstore platform), and send customers directly to the checkout flow to proceed with payment options.  You must receive prior authorisation before the Checkout API is enabled on your account. Please contact customer support or your account manager to discover if you qualify to use the Checkout API before beginning integration.
 *
 * The version of the OpenAPI document: 1.1.2
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
    /// CheckoutRequest
    /// </summary>
    [DataContract(Name = "checkout_request")]
    public partial class CheckoutRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CheckoutRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CheckoutRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CheckoutRequest" /> class.
        /// </summary>
        /// <param name="basket">basket (required).</param>
        /// <param name="items">An array of &#x60;Packages&#x60; in the basket. (required).</param>
        /// <param name="sale">sale.</param>
        public CheckoutRequest(CheckoutRequestBasket basket = default(CheckoutRequestBasket), List<CheckoutItem> items = default(List<CheckoutItem>), Sale sale = default(Sale))
        {
            // to ensure "basket" is required (not null)
            if (basket == null)
            {
                throw new ArgumentNullException("basket is a required property for CheckoutRequest and cannot be null");
            }
            this.Basket = basket;
            // to ensure "items" is required (not null)
            if (items == null)
            {
                throw new ArgumentNullException("items is a required property for CheckoutRequest and cannot be null");
            }
            this.Items = items;
            this.Sale = sale;
        }

        /// <summary>
        /// Gets or Sets Basket
        /// </summary>
        [DataMember(Name = "basket", IsRequired = true, EmitDefaultValue = true)]
        public CheckoutRequestBasket Basket { get; set; }

        /// <summary>
        /// An array of &#x60;Packages&#x60; in the basket.
        /// </summary>
        /// <value>An array of &#x60;Packages&#x60; in the basket.</value>
        [DataMember(Name = "items", IsRequired = true, EmitDefaultValue = true)]
        public List<CheckoutItem> Items { get; set; }

        /// <summary>
        /// Gets or Sets Sale
        /// </summary>
        [DataMember(Name = "sale", EmitDefaultValue = false)]
        public Sale Sale { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CheckoutRequest {\n");
            sb.Append("  Basket: ").Append(Basket).Append("\n");
            sb.Append("  Items: ").Append(Items).Append("\n");
            sb.Append("  Sale: ").Append(Sale).Append("\n");
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
