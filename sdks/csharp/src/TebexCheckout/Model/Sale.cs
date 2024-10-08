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
    /// Sale
    /// </summary>
    [DataContract(Name = "Sale")]
    public partial class Sale : IValidatableObject
    {
        /// <summary>
        /// The type of discount, either &#x60;percentage&#x60; for deducting a percentage of each item, or &#x60;amount&#x60; to deduct a fixed amount from each item.
        /// </summary>
        /// <value>The type of discount, either &#x60;percentage&#x60; for deducting a percentage of each item, or &#x60;amount&#x60; to deduct a fixed amount from each item.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum DiscountTypeEnum
        {
            /// <summary>
            /// Enum Percentage for value: percentage
            /// </summary>
            [EnumMember(Value = "percentage")]
            Percentage = 1,

            /// <summary>
            /// Enum Amount for value: amount
            /// </summary>
            [EnumMember(Value = "amount")]
            Amount = 2
        }


        /// <summary>
        /// The type of discount, either &#x60;percentage&#x60; for deducting a percentage of each item, or &#x60;amount&#x60; to deduct a fixed amount from each item.
        /// </summary>
        /// <value>The type of discount, either &#x60;percentage&#x60; for deducting a percentage of each item, or &#x60;amount&#x60; to deduct a fixed amount from each item.</value>
        /// <example>amount</example>
        [DataMember(Name = "discount_type", EmitDefaultValue = false)]
        public DiscountTypeEnum? DiscountType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="Sale" /> class.
        /// </summary>
        /// <param name="name">The name of the sale (displayed to the customer).</param>
        /// <param name="discountType">The type of discount, either &#x60;percentage&#x60; for deducting a percentage of each item, or &#x60;amount&#x60; to deduct a fixed amount from each item..</param>
        /// <param name="amount">The amount or percentage to deduct.</param>
        public Sale(string name = default(string), DiscountTypeEnum? discountType = default(DiscountTypeEnum?), decimal amount = default(decimal))
        {
            this.Name = name;
            this.DiscountType = discountType;
            this.Amount = amount;
        }

        /// <summary>
        /// The name of the sale (displayed to the customer)
        /// </summary>
        /// <value>The name of the sale (displayed to the customer)</value>
        /// <example>Test Sale</example>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// The amount or percentage to deduct
        /// </summary>
        /// <value>The amount or percentage to deduct</value>
        /// <example>4.99</example>
        [DataMember(Name = "amount", EmitDefaultValue = false)]
        public decimal Amount { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Sale {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  DiscountType: ").Append(DiscountType).Append("\n");
            sb.Append("  Amount: ").Append(Amount).Append("\n");
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
