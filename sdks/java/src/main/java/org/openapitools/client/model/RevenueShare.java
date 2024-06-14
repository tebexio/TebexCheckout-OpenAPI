/*
 * Tebex Checkout API
 * The Checkout APIs are designed to allow our creators to use the Tebex Checkout flow and payment acceptance capabilities without the need to set up a Tebex-powered webstore. Using these APIs allows you to create baskets with custom products (as opposed to pre-created products on our webstore platform), and send customers directly to the checkout flow to proceed with payment options.  You must receive prior authorisation before the Checkout API is enabled on your account. Please contact customer support or your account manager to discover if you qualify to use the Checkout API before beginning integration.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: tebex-integrations@overwolf.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import TebexCheckout.JSON;

/**
 * RevenueShare
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-14T12:22:39.312899-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class RevenueShare {
  public static final String SERIALIZED_NAME_WALLET_REF = "wallet_ref";
  @SerializedName(SERIALIZED_NAME_WALLET_REF)
  private String walletRef;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Float amount;

  public static final String SERIALIZED_NAME_GATEWAY_FEE_PERCENT = "gateway_fee_percent";
  @SerializedName(SERIALIZED_NAME_GATEWAY_FEE_PERCENT)
  private Float gatewayFeePercent;

  public RevenueShare() {
  }

  public RevenueShare walletRef(String walletRef) {
    this.walletRef = walletRef;
    return this;
  }

   /**
   * Get walletRef
   * @return walletRef
  **/
  @javax.annotation.Nullable
  public String getWalletRef() {
    return walletRef;
  }

  public void setWalletRef(String walletRef) {
    this.walletRef = walletRef;
  }


  public RevenueShare amount(Float amount) {
    this.amount = amount;
    return this;
  }

   /**
   * A float (decimal) value representing the amount of this payment in your account currency that is credited to the &#x60;wallet_ref&#x60;
   * @return amount
  **/
  @javax.annotation.Nullable
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }


  public RevenueShare gatewayFeePercent(Float gatewayFeePercent) {
    this.gatewayFeePercent = gatewayFeePercent;
    return this;
  }

   /**
   * A float (decimal) value representing the percentage of the gateway fee that should be dedicated from this wallet’s revenue share. This optional value can be anywhere between 0 - 100.
   * @return gatewayFeePercent
  **/
  @javax.annotation.Nullable
  public Float getGatewayFeePercent() {
    return gatewayFeePercent;
  }

  public void setGatewayFeePercent(Float gatewayFeePercent) {
    this.gatewayFeePercent = gatewayFeePercent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevenueShare revenueShare = (RevenueShare) o;
    return Objects.equals(this.walletRef, revenueShare.walletRef) &&
        Objects.equals(this.amount, revenueShare.amount) &&
        Objects.equals(this.gatewayFeePercent, revenueShare.gatewayFeePercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(walletRef, amount, gatewayFeePercent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevenueShare {\n");
    sb.append("    walletRef: ").append(toIndentedString(walletRef)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    gatewayFeePercent: ").append(toIndentedString(gatewayFeePercent)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("wallet_ref");
    openapiFields.add("amount");
    openapiFields.add("gateway_fee_percent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RevenueShare
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RevenueShare.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RevenueShare is not found in the empty JSON string", RevenueShare.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RevenueShare.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RevenueShare` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("wallet_ref") != null && !jsonObj.get("wallet_ref").isJsonNull()) && !jsonObj.get("wallet_ref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wallet_ref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wallet_ref").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RevenueShare.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RevenueShare' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RevenueShare> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RevenueShare.class));

       return (TypeAdapter<T>) new TypeAdapter<RevenueShare>() {
           @Override
           public void write(JsonWriter out, RevenueShare value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RevenueShare read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RevenueShare given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RevenueShare
  * @throws IOException if the JSON string is invalid with respect to RevenueShare
  */
  public static RevenueShare fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RevenueShare.class);
  }

 /**
  * Convert an instance of RevenueShare to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

