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
import java.util.Arrays;
import org.openapitools.client.model.PackageMetaData;

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
 * ModelPackage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-16T10:59:54.383377-05:00[America/Chicago]", comments = "Generator version: 7.5.0")
public class ModelPackage {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  /**
   * The renewal period of this item
   */
  @JsonAdapter(ExpiryPeriodEnum.Adapter.class)
  public enum ExpiryPeriodEnum {
    DAY("day"),
    
    MONTH("month"),
    
    YEAR("year");

    private String value;

    ExpiryPeriodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExpiryPeriodEnum fromValue(String value) {
      for (ExpiryPeriodEnum b : ExpiryPeriodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ExpiryPeriodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExpiryPeriodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExpiryPeriodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ExpiryPeriodEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ExpiryPeriodEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_EXPIRY_PERIOD = "expiry_period";
  @SerializedName(SERIALIZED_NAME_EXPIRY_PERIOD)
  private ExpiryPeriodEnum expiryPeriod;

  public static final String SERIALIZED_NAME_EXPIRY_LENGTH = "expiry_length";
  @SerializedName(SERIALIZED_NAME_EXPIRY_LENGTH)
  private Integer expiryLength;

  public static final String SERIALIZED_NAME_META_DATA = "metaData";
  @SerializedName(SERIALIZED_NAME_META_DATA)
  private PackageMetaData metaData;

  public ModelPackage() {
  }

  public ModelPackage name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the item being purchased. This should be user-friendly as it is shown to the customer on checkout and receipts.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public ModelPackage price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * A float (decimal describing the price of the package in your account currency)
   * @return price
  **/
  @javax.annotation.Nullable
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public ModelPackage expiryPeriod(ExpiryPeriodEnum expiryPeriod) {
    this.expiryPeriod = expiryPeriod;
    return this;
  }

   /**
   * The renewal period of this item
   * @return expiryPeriod
  **/
  @javax.annotation.Nullable
  public ExpiryPeriodEnum getExpiryPeriod() {
    return expiryPeriod;
  }

  public void setExpiryPeriod(ExpiryPeriodEnum expiryPeriod) {
    this.expiryPeriod = expiryPeriod;
  }


  public ModelPackage expiryLength(Integer expiryLength) {
    this.expiryLength = expiryLength;
    return this;
  }

   /**
   * An integer representing the number of &#x60;expiry_periods&#x60; that make up the renewal period.
   * @return expiryLength
  **/
  @javax.annotation.Nullable
  public Integer getExpiryLength() {
    return expiryLength;
  }

  public void setExpiryLength(Integer expiryLength) {
    this.expiryLength = expiryLength;
  }


  public ModelPackage metaData(PackageMetaData metaData) {
    this.metaData = metaData;
    return this;
  }

   /**
   * Get metaData
   * @return metaData
  **/
  @javax.annotation.Nullable
  public PackageMetaData getMetaData() {
    return metaData;
  }

  public void setMetaData(PackageMetaData metaData) {
    this.metaData = metaData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelPackage _package = (ModelPackage) o;
    return Objects.equals(this.name, _package.name) &&
        Objects.equals(this.price, _package.price) &&
        Objects.equals(this.expiryPeriod, _package.expiryPeriod) &&
        Objects.equals(this.expiryLength, _package.expiryLength) &&
        Objects.equals(this.metaData, _package.metaData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, price, expiryPeriod, expiryLength, metaData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelPackage {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    expiryPeriod: ").append(toIndentedString(expiryPeriod)).append("\n");
    sb.append("    expiryLength: ").append(toIndentedString(expiryLength)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("price");
    openapiFields.add("expiry_period");
    openapiFields.add("expiry_length");
    openapiFields.add("metaData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModelPackage
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModelPackage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelPackage is not found in the empty JSON string", ModelPackage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModelPackage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelPackage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("expiry_period") != null && !jsonObj.get("expiry_period").isJsonNull()) && !jsonObj.get("expiry_period").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expiry_period` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expiry_period").toString()));
      }
      // validate the optional field `expiry_period`
      if (jsonObj.get("expiry_period") != null && !jsonObj.get("expiry_period").isJsonNull()) {
        ExpiryPeriodEnum.validateJsonElement(jsonObj.get("expiry_period"));
      }
      // validate the optional field `metaData`
      if (jsonObj.get("metaData") != null && !jsonObj.get("metaData").isJsonNull()) {
        PackageMetaData.validateJsonElement(jsonObj.get("metaData"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelPackage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelPackage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelPackage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelPackage.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelPackage>() {
           @Override
           public void write(JsonWriter out, ModelPackage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelPackage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelPackage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelPackage
  * @throws IOException if the JSON string is invalid with respect to ModelPackage
  */
  public static ModelPackage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelPackage.class);
  }

 /**
  * Convert an instance of ModelPackage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
