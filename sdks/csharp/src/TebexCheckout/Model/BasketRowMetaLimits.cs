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
    /// BasketRowMetaLimits
    /// </summary>
    [DataContract(Name = "BasketRow_meta_limits")]
    public partial class BasketRowMetaLimits : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BasketRowMetaLimits" /> class.
        /// </summary>
        /// <param name="user">user.</param>
        /// <param name="global">global.</param>
        /// <param name="packageExpiryTime">packageExpiryTime.</param>
        public BasketRowMetaLimits(BasketRowMetaLimitsUser user = default(BasketRowMetaLimitsUser), BasketRowMetaLimitsUser global = default(BasketRowMetaLimitsUser), int packageExpiryTime = default(int))
        {
            this.User = user;
            this.Global = global;
            this.PackageExpiryTime = packageExpiryTime;
        }

        /// <summary>
        /// Gets or Sets User
        /// </summary>
        [DataMember(Name = "user", EmitDefaultValue = false)]
        public BasketRowMetaLimitsUser User { get; set; }

        /// <summary>
        /// Gets or Sets Global
        /// </summary>
        [DataMember(Name = "global", EmitDefaultValue = false)]
        public BasketRowMetaLimitsUser Global { get; set; }

        /// <summary>
        /// Gets or Sets PackageExpiryTime
        /// </summary>
        /// <example>0</example>
        [DataMember(Name = "packageExpiryTime", EmitDefaultValue = false)]
        public int PackageExpiryTime { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class BasketRowMetaLimits {\n");
            sb.Append("  User: ").Append(User).Append("\n");
            sb.Append("  Global: ").Append(Global).Append("\n");
            sb.Append("  PackageExpiryTime: ").Append(PackageExpiryTime).Append("\n");
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