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
    /// RevenueShare
    /// </summary>
    [DataContract(Name = "RevenueShare")]
    public partial class RevenueShare : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RevenueShare" /> class.
        /// </summary>
        /// <param name="walletRef">walletRef.</param>
        /// <param name="amount">A float (decimal) value representing the amount of this payment in your account currency that is credited to the &#x60;wallet_ref&#x60;.</param>
        /// <param name="gatewayFeePercent">A float (decimal) value representing the percentage of the gateway fee that should be dedicated from this wallet’s revenue share. This optional value can be anywhere between 0 - 100..</param>
        public RevenueShare(string walletRef = default(string), decimal amount = default(decimal), decimal gatewayFeePercent = default(decimal))
        {
            this.WalletRef = walletRef;
            this.Amount = amount;
            this.GatewayFeePercent = gatewayFeePercent;
        }

        /// <summary>
        /// Gets or Sets WalletRef
        /// </summary>
        /// <example>some_wallet_reference</example>
        [DataMember(Name = "wallet_ref", EmitDefaultValue = false)]
        public string WalletRef { get; set; }

        /// <summary>
        /// A float (decimal) value representing the amount of this payment in your account currency that is credited to the &#x60;wallet_ref&#x60;
        /// </summary>
        /// <value>A float (decimal) value representing the amount of this payment in your account currency that is credited to the &#x60;wallet_ref&#x60;</value>
        /// <example>0.5</example>
        [DataMember(Name = "amount", EmitDefaultValue = false)]
        public decimal Amount { get; set; }

        /// <summary>
        /// A float (decimal) value representing the percentage of the gateway fee that should be dedicated from this wallet’s revenue share. This optional value can be anywhere between 0 - 100.
        /// </summary>
        /// <value>A float (decimal) value representing the percentage of the gateway fee that should be dedicated from this wallet’s revenue share. This optional value can be anywhere between 0 - 100.</value>
        /// <example>50.0</example>
        [DataMember(Name = "gateway_fee_percent", EmitDefaultValue = false)]
        public decimal GatewayFeePercent { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RevenueShare {\n");
            sb.Append("  WalletRef: ").Append(WalletRef).Append("\n");
            sb.Append("  Amount: ").Append(Amount).Append("\n");
            sb.Append("  GatewayFeePercent: ").Append(GatewayFeePercent).Append("\n");
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