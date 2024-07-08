/*
 * Tebex Checkout API
 * The Checkout APIs are designed to allow our creators to use the Tebex Checkout flow and payment acceptance capabilities without the need to set up a Tebex-powered webstore. Using these APIs allows you to create baskets with custom products (as opposed to pre-created products on our webstore platform), and send customers directly to the checkout flow to proceed with payment options.  You must receive prior authorisation before the Checkout API is enabled on your account. Please contact customer support or your account manager to discover if you qualify to use the Checkout API before beginning integration.
 *
 * The version of the OpenAPI document: 1.1.0
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * RecurringPaymentLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-08T10:31:44.004464-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class RecurringPaymentLinks {
  public static final String SERIALIZED_NAME_INITIAL_PAYMENT = "initial_payment";
  @SerializedName(SERIALIZED_NAME_INITIAL_PAYMENT)
  private String initialPayment;

  public static final String SERIALIZED_NAME_PAYMENT_HISTORY = "payment_history";
  @SerializedName(SERIALIZED_NAME_PAYMENT_HISTORY)
  private List<String> paymentHistory = new ArrayList<>();

  public RecurringPaymentLinks() {
  }

  public RecurringPaymentLinks initialPayment(String initialPayment) {
    this.initialPayment = initialPayment;
    return this;
  }

   /**
   * Get initialPayment
   * @return initialPayment
  **/
  @javax.annotation.Nullable
  public String getInitialPayment() {
    return initialPayment;
  }

  public void setInitialPayment(String initialPayment) {
    this.initialPayment = initialPayment;
  }


  public RecurringPaymentLinks paymentHistory(List<String> paymentHistory) {
    this.paymentHistory = paymentHistory;
    return this;
  }

  public RecurringPaymentLinks addPaymentHistoryItem(String paymentHistoryItem) {
    if (this.paymentHistory == null) {
      this.paymentHistory = new ArrayList<>();
    }
    this.paymentHistory.add(paymentHistoryItem);
    return this;
  }

   /**
   * Get paymentHistory
   * @return paymentHistory
  **/
  @javax.annotation.Nullable
  public List<String> getPaymentHistory() {
    return paymentHistory;
  }

  public void setPaymentHistory(List<String> paymentHistory) {
    this.paymentHistory = paymentHistory;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurringPaymentLinks recurringPaymentLinks = (RecurringPaymentLinks) o;
    return Objects.equals(this.initialPayment, recurringPaymentLinks.initialPayment) &&
        Objects.equals(this.paymentHistory, recurringPaymentLinks.paymentHistory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initialPayment, paymentHistory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringPaymentLinks {\n");
    sb.append("    initialPayment: ").append(toIndentedString(initialPayment)).append("\n");
    sb.append("    paymentHistory: ").append(toIndentedString(paymentHistory)).append("\n");
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
    openapiFields.add("initial_payment");
    openapiFields.add("payment_history");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RecurringPaymentLinks
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RecurringPaymentLinks.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecurringPaymentLinks is not found in the empty JSON string", RecurringPaymentLinks.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RecurringPaymentLinks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RecurringPaymentLinks` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("initial_payment") != null && !jsonObj.get("initial_payment").isJsonNull()) && !jsonObj.get("initial_payment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `initial_payment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("initial_payment").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("payment_history") != null && !jsonObj.get("payment_history").isJsonNull() && !jsonObj.get("payment_history").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_history` to be an array in the JSON string but got `%s`", jsonObj.get("payment_history").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecurringPaymentLinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecurringPaymentLinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecurringPaymentLinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecurringPaymentLinks.class));

       return (TypeAdapter<T>) new TypeAdapter<RecurringPaymentLinks>() {
           @Override
           public void write(JsonWriter out, RecurringPaymentLinks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecurringPaymentLinks read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RecurringPaymentLinks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RecurringPaymentLinks
  * @throws IOException if the JSON string is invalid with respect to RecurringPaymentLinks
  */
  public static RecurringPaymentLinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecurringPaymentLinks.class);
  }

 /**
  * Convert an instance of RecurringPaymentLinks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

