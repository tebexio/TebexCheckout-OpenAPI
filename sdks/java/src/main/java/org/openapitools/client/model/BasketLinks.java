/*
 * Tebex Checkout API
 * The Checkout APIs are designed to allow our creators to use the Tebex Checkout flow and payment acceptance capabilities without the need to set up a Tebex-powered webstore. Using these APIs allows you to create baskets with custom products (as opposed to pre-created products on our webstore platform), and send customers directly to the checkout flow to proceed with payment options.  You must receive prior authorisation before the Checkout API is enabled on your account. Please contact customer support or your account manager to discover if you qualify to use the Checkout API before beginning integration.
 *
 * The version of the OpenAPI document: 1.1.2
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
 * BasketLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-09T15:30:05.763865-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class BasketLinks {
  public static final String SERIALIZED_NAME_PAYMENT = "payment";
  @SerializedName(SERIALIZED_NAME_PAYMENT)
  private String payment;

  public static final String SERIALIZED_NAME_CHECKOUT = "checkout";
  @SerializedName(SERIALIZED_NAME_CHECKOUT)
  private String checkout;

  public BasketLinks() {
  }

  public BasketLinks payment(String payment) {
    this.payment = payment;
    return this;
  }

   /**
   * The &#x60;links.payment&#x60; property is only returned if the basket has been paid for and a payment exists with the &#x60;complete&#x60;,&#x60;refund&#x60;, or &#x60;chargeback&#x60; status.
   * @return payment
  **/
  @javax.annotation.Nullable
  public String getPayment() {
    return payment;
  }

  public void setPayment(String payment) {
    this.payment = payment;
  }


  public BasketLinks checkout(String checkout) {
    this.checkout = checkout;
    return this;
  }

   /**
   * The &#x60;links.checkout&#x60; property is only returned if the basket has not been paid, and is the URL to send the customer to make payment
   * @return checkout
  **/
  @javax.annotation.Nullable
  public String getCheckout() {
    return checkout;
  }

  public void setCheckout(String checkout) {
    this.checkout = checkout;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasketLinks basketLinks = (BasketLinks) o;
    return Objects.equals(this.payment, basketLinks.payment) &&
        Objects.equals(this.checkout, basketLinks.checkout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payment, checkout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasketLinks {\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    checkout: ").append(toIndentedString(checkout)).append("\n");
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
    openapiFields.add("payment");
    openapiFields.add("checkout");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BasketLinks
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BasketLinks.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BasketLinks is not found in the empty JSON string", BasketLinks.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BasketLinks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BasketLinks` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("payment") != null && !jsonObj.get("payment").isJsonNull()) && !jsonObj.get("payment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment").toString()));
      }
      if ((jsonObj.get("checkout") != null && !jsonObj.get("checkout").isJsonNull()) && !jsonObj.get("checkout").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `checkout` to be a primitive type in the JSON string but got `%s`", jsonObj.get("checkout").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BasketLinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BasketLinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BasketLinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BasketLinks.class));

       return (TypeAdapter<T>) new TypeAdapter<BasketLinks>() {
           @Override
           public void write(JsonWriter out, BasketLinks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BasketLinks read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BasketLinks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BasketLinks
  * @throws IOException if the JSON string is invalid with respect to BasketLinks
  */
  public static BasketLinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BasketLinks.class);
  }

 /**
  * Convert an instance of BasketLinks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

