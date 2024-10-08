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
    /// PriceDetails
    /// </summary>
    [DataContract(Name = "PriceDetails")]
    public partial class PriceDetails : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PriceDetails" /> class.
        /// </summary>
        /// <param name="fullPrice">fullPrice.</param>
        /// <param name="subTotal">subTotal.</param>
        /// <param name="discounts">discounts.</param>
        /// <param name="total">total.</param>
        /// <param name="tax">tax.</param>
        /// <param name="balance">balance.</param>
        /// <param name="sales">sales.</param>
        /// <param name="giftcards">giftcards.</param>
        /// <param name="recurring">Contains recurring amount. Limited to 1 subscription package in the basket at a time..</param>
        /// <param name="username">username.</param>
        /// <param name="roundUp">roundUp.</param>
        public PriceDetails(float fullPrice = default(float), float subTotal = default(float), List<Object> discounts = default(List<Object>), float total = default(float), float tax = default(float), float balance = default(float), List<Sale> sales = default(List<Sale>), List<Object> giftcards = default(List<Object>), bool recurring = default(bool), string username = default(string), decimal? roundUp = default(decimal?))
        {
            this.FullPrice = fullPrice;
            this.SubTotal = subTotal;
            this.Discounts = discounts;
            this.Total = total;
            this.Tax = tax;
            this.Balance = balance;
            this.Sales = sales;
            this.Giftcards = giftcards;
            this.Recurring = recurring;
            this.Username = username;
            this.RoundUp = roundUp;
        }

        /// <summary>
        /// Gets or Sets FullPrice
        /// </summary>
        [DataMember(Name = "fullPrice", EmitDefaultValue = false)]
        public float FullPrice { get; set; }

        /// <summary>
        /// Gets or Sets SubTotal
        /// </summary>
        [DataMember(Name = "subTotal", EmitDefaultValue = false)]
        public float SubTotal { get; set; }

        /// <summary>
        /// Gets or Sets Discounts
        /// </summary>
        [DataMember(Name = "discounts", EmitDefaultValue = false)]
        public List<Object> Discounts { get; set; }

        /// <summary>
        /// Gets or Sets Total
        /// </summary>
        [DataMember(Name = "total", EmitDefaultValue = false)]
        public float Total { get; set; }

        /// <summary>
        /// Gets or Sets Tax
        /// </summary>
        [DataMember(Name = "tax", EmitDefaultValue = false)]
        public float Tax { get; set; }

        /// <summary>
        /// Gets or Sets Balance
        /// </summary>
        [DataMember(Name = "balance", EmitDefaultValue = false)]
        public float Balance { get; set; }

        /// <summary>
        /// Gets or Sets Sales
        /// </summary>
        [DataMember(Name = "sales", EmitDefaultValue = false)]
        public List<Sale> Sales { get; set; }

        /// <summary>
        /// Gets or Sets Giftcards
        /// </summary>
        [DataMember(Name = "giftcards", EmitDefaultValue = false)]
        public List<Object> Giftcards { get; set; }

        /// <summary>
        /// Contains recurring amount. Limited to 1 subscription package in the basket at a time.
        /// </summary>
        /// <value>Contains recurring amount. Limited to 1 subscription package in the basket at a time.</value>
        [DataMember(Name = "recurring", EmitDefaultValue = true)]
        public bool Recurring { get; set; }

        /// <summary>
        /// Gets or Sets Username
        /// </summary>
        [DataMember(Name = "username", EmitDefaultValue = false)]
        public string Username { get; set; }

        /// <summary>
        /// Gets or Sets RoundUp
        /// </summary>
        [DataMember(Name = "roundUp", EmitDefaultValue = true)]
        public decimal? RoundUp { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PriceDetails {\n");
            sb.Append("  FullPrice: ").Append(FullPrice).Append("\n");
            sb.Append("  SubTotal: ").Append(SubTotal).Append("\n");
            sb.Append("  Discounts: ").Append(Discounts).Append("\n");
            sb.Append("  Total: ").Append(Total).Append("\n");
            sb.Append("  Tax: ").Append(Tax).Append("\n");
            sb.Append("  Balance: ").Append(Balance).Append("\n");
            sb.Append("  Sales: ").Append(Sales).Append("\n");
            sb.Append("  Giftcards: ").Append(Giftcards).Append("\n");
            sb.Append("  Recurring: ").Append(Recurring).Append("\n");
            sb.Append("  Username: ").Append(Username).Append("\n");
            sb.Append("  RoundUp: ").Append(RoundUp).Append("\n");
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
