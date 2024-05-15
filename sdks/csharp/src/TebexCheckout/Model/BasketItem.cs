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
    /// A package within an existing basket.
    /// </summary>
    [DataContract(Name = "BasketItem")]
    public partial class BasketItem : IValidatableObject
    {
        /// <summary>
        /// The type of payment, either &#x60;single&#x60; for one-time payments or &#x60;subscription&#x60;.
        /// </summary>
        /// <value>The type of payment, either &#x60;single&#x60; for one-time payments or &#x60;subscription&#x60;.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            /// <summary>
            /// Enum Single for value: single
            /// </summary>
            [EnumMember(Value = "single")]
            Single = 1,

            /// <summary>
            /// Enum Subscription for value: subscription
            /// </summary>
            [EnumMember(Value = "subscription")]
            Subscription = 2
        }


        /// <summary>
        /// The type of payment, either &#x60;single&#x60; for one-time payments or &#x60;subscription&#x60;.
        /// </summary>
        /// <value>The type of payment, either &#x60;single&#x60; for one-time payments or &#x60;subscription&#x60;.</value>
        /// <example>single</example>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public TypeEnum? Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="BasketItem" /> class.
        /// </summary>
        /// <param name="qty">The quantity of &#x60;package&#x60; in this basket. This is not the total quantity of overall items in the basket..</param>
        /// <param name="type">The type of payment, either &#x60;single&#x60; for one-time payments or &#x60;subscription&#x60;..</param>
        /// <param name="revenueShare">An array of payment destination objects describing how the purchase should be split between multiple wallets. **Only available with pre-agreement from Tebex.**.</param>
        public BasketItem(int qty = default(int), TypeEnum? type = default(TypeEnum?), List<RevenueShare> revenueShare = default(List<RevenueShare>))
        {
            this.Qty = qty;
            this.Type = type;
            this.RevenueShare = revenueShare;
        }

        /// <summary>
        /// The quantity of &#x60;package&#x60; in this basket. This is not the total quantity of overall items in the basket.
        /// </summary>
        /// <value>The quantity of &#x60;package&#x60; in this basket. This is not the total quantity of overall items in the basket.</value>
        /// <example>2</example>
        [DataMember(Name = "qty", EmitDefaultValue = false)]
        public int Qty { get; set; }

        /// <summary>
        /// An array of payment destination objects describing how the purchase should be split between multiple wallets. **Only available with pre-agreement from Tebex.**
        /// </summary>
        /// <value>An array of payment destination objects describing how the purchase should be split between multiple wallets. **Only available with pre-agreement from Tebex.**</value>
        [DataMember(Name = "revenue_share", EmitDefaultValue = false)]
        public List<RevenueShare> RevenueShare { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class BasketItem {\n");
            sb.Append("  Qty: ").Append(Qty).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  RevenueShare: ").Append(RevenueShare).Append("\n");
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
