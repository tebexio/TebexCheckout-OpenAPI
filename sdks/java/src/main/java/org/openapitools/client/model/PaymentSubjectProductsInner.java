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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.PaymentFeesTax;
import org.openapitools.client.model.PaymentSubjectPrice;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * PaymentSubjectProductsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-08T10:31:44.004464-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class PaymentSubjectProductsInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_BASE_PRICE = "base_price";
  @SerializedName(SERIALIZED_NAME_BASE_PRICE)
  private PaymentSubjectPrice basePrice;

  public static final String SERIALIZED_NAME_PAID_PRICE = "paid_price";
  @SerializedName(SERIALIZED_NAME_PAID_PRICE)
  private PaymentFeesTax paidPrice;

  public static final String SERIALIZED_NAME_VARIABLES = "variables";
  @SerializedName(SERIALIZED_NAME_VARIABLES)
  private List<Object> variables = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  public static final String SERIALIZED_NAME_CUSTOM = "custom";
  @SerializedName(SERIALIZED_NAME_CUSTOM)
  private Object custom;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public PaymentSubjectProductsInner() {
  }

  public PaymentSubjectProductsInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public PaymentSubjectProductsInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public PaymentSubjectProductsInner quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @javax.annotation.Nullable
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public PaymentSubjectProductsInner basePrice(PaymentSubjectPrice basePrice) {
    this.basePrice = basePrice;
    return this;
  }

   /**
   * Get basePrice
   * @return basePrice
  **/
  @javax.annotation.Nullable
  public PaymentSubjectPrice getBasePrice() {
    return basePrice;
  }

  public void setBasePrice(PaymentSubjectPrice basePrice) {
    this.basePrice = basePrice;
  }


  public PaymentSubjectProductsInner paidPrice(PaymentFeesTax paidPrice) {
    this.paidPrice = paidPrice;
    return this;
  }

   /**
   * Get paidPrice
   * @return paidPrice
  **/
  @javax.annotation.Nullable
  public PaymentFeesTax getPaidPrice() {
    return paidPrice;
  }

  public void setPaidPrice(PaymentFeesTax paidPrice) {
    this.paidPrice = paidPrice;
  }


  public PaymentSubjectProductsInner variables(List<Object> variables) {
    this.variables = variables;
    return this;
  }

  public PaymentSubjectProductsInner addVariablesItem(Object variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<>();
    }
    this.variables.add(variablesItem);
    return this;
  }

   /**
   * Get variables
   * @return variables
  **/
  @javax.annotation.Nullable
  public List<Object> getVariables() {
    return variables;
  }

  public void setVariables(List<Object> variables) {
    this.variables = variables;
  }


  public PaymentSubjectProductsInner expiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Get expiresAt
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  public PaymentSubjectProductsInner custom(Object custom) {
    this.custom = custom;
    return this;
  }

   /**
   * Get custom
   * @return custom
  **/
  @javax.annotation.Nullable
  public Object getCustom() {
    return custom;
  }

  public void setCustom(Object custom) {
    this.custom = custom;
  }


  public PaymentSubjectProductsInner username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentSubjectProductsInner paymentSubjectProductsInner = (PaymentSubjectProductsInner) o;
    return Objects.equals(this.id, paymentSubjectProductsInner.id) &&
        Objects.equals(this.name, paymentSubjectProductsInner.name) &&
        Objects.equals(this.quantity, paymentSubjectProductsInner.quantity) &&
        Objects.equals(this.basePrice, paymentSubjectProductsInner.basePrice) &&
        Objects.equals(this.paidPrice, paymentSubjectProductsInner.paidPrice) &&
        Objects.equals(this.variables, paymentSubjectProductsInner.variables) &&
        Objects.equals(this.expiresAt, paymentSubjectProductsInner.expiresAt) &&
        Objects.equals(this.custom, paymentSubjectProductsInner.custom) &&
        Objects.equals(this.username, paymentSubjectProductsInner.username);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, quantity, basePrice, paidPrice, variables, expiresAt, custom, username);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSubjectProductsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    basePrice: ").append(toIndentedString(basePrice)).append("\n");
    sb.append("    paidPrice: ").append(toIndentedString(paidPrice)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("quantity");
    openapiFields.add("base_price");
    openapiFields.add("paid_price");
    openapiFields.add("variables");
    openapiFields.add("expires_at");
    openapiFields.add("custom");
    openapiFields.add("username");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentSubjectProductsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PaymentSubjectProductsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentSubjectProductsInner is not found in the empty JSON string", PaymentSubjectProductsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PaymentSubjectProductsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentSubjectProductsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `base_price`
      if (jsonObj.get("base_price") != null && !jsonObj.get("base_price").isJsonNull()) {
        PaymentSubjectPrice.validateJsonElement(jsonObj.get("base_price"));
      }
      // validate the optional field `paid_price`
      if (jsonObj.get("paid_price") != null && !jsonObj.get("paid_price").isJsonNull()) {
        PaymentFeesTax.validateJsonElement(jsonObj.get("paid_price"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("variables") != null && !jsonObj.get("variables").isJsonNull() && !jsonObj.get("variables").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `variables` to be an array in the JSON string but got `%s`", jsonObj.get("variables").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentSubjectProductsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentSubjectProductsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentSubjectProductsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentSubjectProductsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentSubjectProductsInner>() {
           @Override
           public void write(JsonWriter out, PaymentSubjectProductsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentSubjectProductsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentSubjectProductsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentSubjectProductsInner
  * @throws IOException if the JSON string is invalid with respect to PaymentSubjectProductsInner
  */
  public static PaymentSubjectProductsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentSubjectProductsInner.class);
  }

 /**
  * Convert an instance of PaymentSubjectProductsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

