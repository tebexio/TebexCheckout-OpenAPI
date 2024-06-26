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
    /// Package
    /// </summary>
    [DataContract(Name = "Package")]
    public partial class Package : IValidatableObject
    {
        /// <summary>
        /// The renewal period of this item
        /// </summary>
        /// <value>The renewal period of this item</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ExpiryPeriodEnum
        {
            /// <summary>
            /// Enum Day for value: day
            /// </summary>
            [EnumMember(Value = "day")]
            Day = 1,

            /// <summary>
            /// Enum Month for value: month
            /// </summary>
            [EnumMember(Value = "month")]
            Month = 2,

            /// <summary>
            /// Enum Year for value: year
            /// </summary>
            [EnumMember(Value = "year")]
            Year = 3
        }


        /// <summary>
        /// The renewal period of this item
        /// </summary>
        /// <value>The renewal period of this item</value>
        /// <example>month</example>
        [DataMember(Name = "expiry_period", EmitDefaultValue = false)]
        public ExpiryPeriodEnum? ExpiryPeriod { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="Package" /> class.
        /// </summary>
        /// <param name="name">The name of the item being purchased. This should be user-friendly as it is shown to the customer on checkout and receipts..</param>
        /// <param name="price">A float (decimal describing the price of the package in your account currency).</param>
        /// <param name="expiryPeriod">The renewal period of this item.</param>
        /// <param name="expiryLength">An integer representing the number of &#x60;expiry_periods&#x60; that make up the renewal period..</param>
        /// <param name="metaData">metaData.</param>
        public Package(string name = default(string), float price = default(float), ExpiryPeriodEnum? expiryPeriod = default(ExpiryPeriodEnum?), int expiryLength = default(int), PackageMetaData metaData = default(PackageMetaData))
        {
            this.Name = name;
            this.Price = price;
            this.ExpiryPeriod = expiryPeriod;
            this.ExpiryLength = expiryLength;
            this.MetaData = metaData;
        }

        /// <summary>
        /// The name of the item being purchased. This should be user-friendly as it is shown to the customer on checkout and receipts.
        /// </summary>
        /// <value>The name of the item being purchased. This should be user-friendly as it is shown to the customer on checkout and receipts.</value>
        /// <example>1000 Gold</example>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// A float (decimal describing the price of the package in your account currency)
        /// </summary>
        /// <value>A float (decimal describing the price of the package in your account currency)</value>
        /// <example>1.27</example>
        [DataMember(Name = "price", EmitDefaultValue = false)]
        public float Price { get; set; }

        /// <summary>
        /// An integer representing the number of &#x60;expiry_periods&#x60; that make up the renewal period.
        /// </summary>
        /// <value>An integer representing the number of &#x60;expiry_periods&#x60; that make up the renewal period.</value>
        /// <example>3</example>
        [DataMember(Name = "expiry_length", EmitDefaultValue = false)]
        public int ExpiryLength { get; set; }

        /// <summary>
        /// Gets or Sets MetaData
        /// </summary>
        [DataMember(Name = "metaData", EmitDefaultValue = false)]
        public PackageMetaData MetaData { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Package {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("  ExpiryPeriod: ").Append(ExpiryPeriod).Append("\n");
            sb.Append("  ExpiryLength: ").Append(ExpiryLength).Append("\n");
            sb.Append("  MetaData: ").Append(MetaData).Append("\n");
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
