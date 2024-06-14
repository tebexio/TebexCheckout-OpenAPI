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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ModelPackage;
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
 * UpdateSubscriptionRequestItemsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-14T12:22:39.312899-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class UpdateSubscriptionRequestItemsInner {
  /**
   * The type of payment, either &#x60;single&#x60; for one-time payments or &#x60;subscription&#x60;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    SINGLE("single"),
    
    SUBSCRIPTION("subscription");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_QTY = "qty";
  @SerializedName(SERIALIZED_NAME_QTY)
  private BigDecimal qty;

  public static final String SERIALIZED_NAME_REVENUE_SHARE = "revenue_share";
  @SerializedName(SERIALIZED_NAME_REVENUE_SHARE)
  private List<Object> revenueShare;

  public static final String SERIALIZED_NAME_PACKAGE = "package";
  @SerializedName(SERIALIZED_NAME_PACKAGE)
  private ModelPackage _package;

  public UpdateSubscriptionRequestItemsInner() {
  }

  public UpdateSubscriptionRequestItemsInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of payment, either &#x60;single&#x60; for one-time payments or &#x60;subscription&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  public UpdateSubscriptionRequestItemsInner qty(BigDecimal qty) {
    this.qty = qty;
    return this;
  }

   /**
   * Get qty
   * @return qty
  **/
  @javax.annotation.Nullable
  public BigDecimal getQty() {
    return qty;
  }

  public void setQty(BigDecimal qty) {
    this.qty = qty;
  }


  public UpdateSubscriptionRequestItemsInner revenueShare(List<Object> revenueShare) {
    this.revenueShare = revenueShare;
    return this;
  }

  public UpdateSubscriptionRequestItemsInner addRevenueShareItem(Object revenueShareItem) {
    if (this.revenueShare == null) {
      this.revenueShare = new ArrayList<>();
    }
    this.revenueShare.add(revenueShareItem);
    return this;
  }

   /**
   * Get revenueShare
   * @return revenueShare
  **/
  @javax.annotation.Nullable
  public List<Object> getRevenueShare() {
    return revenueShare;
  }

  public void setRevenueShare(List<Object> revenueShare) {
    this.revenueShare = revenueShare;
  }


  public UpdateSubscriptionRequestItemsInner _package(ModelPackage _package) {
    this._package = _package;
    return this;
  }

   /**
   * Get _package
   * @return _package
  **/
  @javax.annotation.Nullable
  public ModelPackage getPackage() {
    return _package;
  }

  public void setPackage(ModelPackage _package) {
    this._package = _package;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSubscriptionRequestItemsInner updateSubscriptionRequestItemsInner = (UpdateSubscriptionRequestItemsInner) o;
    return Objects.equals(this.type, updateSubscriptionRequestItemsInner.type) &&
        Objects.equals(this.qty, updateSubscriptionRequestItemsInner.qty) &&
        Objects.equals(this.revenueShare, updateSubscriptionRequestItemsInner.revenueShare) &&
        Objects.equals(this._package, updateSubscriptionRequestItemsInner._package);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, qty, revenueShare, _package);
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
    sb.append("class UpdateSubscriptionRequestItemsInner {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
    sb.append("    revenueShare: ").append(toIndentedString(revenueShare)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("qty");
    openapiFields.add("revenue_share");
    openapiFields.add("package");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateSubscriptionRequestItemsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateSubscriptionRequestItemsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateSubscriptionRequestItemsInner is not found in the empty JSON string", UpdateSubscriptionRequestItemsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateSubscriptionRequestItemsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateSubscriptionRequestItemsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("revenue_share") != null && !jsonObj.get("revenue_share").isJsonNull() && !jsonObj.get("revenue_share").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `revenue_share` to be an array in the JSON string but got `%s`", jsonObj.get("revenue_share").toString()));
      }
      // validate the optional field `package`
      if (jsonObj.get("package") != null && !jsonObj.get("package").isJsonNull()) {
        ModelPackage.validateJsonElement(jsonObj.get("package"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateSubscriptionRequestItemsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateSubscriptionRequestItemsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateSubscriptionRequestItemsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateSubscriptionRequestItemsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateSubscriptionRequestItemsInner>() {
           @Override
           public void write(JsonWriter out, UpdateSubscriptionRequestItemsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateSubscriptionRequestItemsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateSubscriptionRequestItemsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateSubscriptionRequestItemsInner
  * @throws IOException if the JSON string is invalid with respect to UpdateSubscriptionRequestItemsInner
  */
  public static UpdateSubscriptionRequestItemsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateSubscriptionRequestItemsInner.class);
  }

 /**
  * Convert an instance of UpdateSubscriptionRequestItemsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

