<?php
/**
 * BasketRow
 *
 * PHP version 7.4
 *
 * @category Class
 * @package  TebexCheckout
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Tebex Checkout API
 *
 * The Checkout APIs are designed to allow our creators to use the Tebex Checkout flow and payment acceptance capabilities without the need to set up a Tebex-powered webstore. Using these APIs allows you to create baskets with custom products (as opposed to pre-created products on our webstore platform), and send customers directly to the checkout flow to proceed with payment options.  You must receive prior authorisation before the Checkout API is enabled on your account. Please contact customer support or your account manager to discover if you qualify to use the Checkout API before beginning integration.
 *
 * The version of the OpenAPI document: 1.1.2
 * Contact: tebex-integrations@overwolf.com
 * Generated by: https://openapi-generator.tech
 * Generator version: 7.5.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace TebexCheckout\Model;

use \ArrayAccess;
use \TebexCheckout\ObjectSerializer;

/**
 * BasketRow Class Doc Comment
 *
 * @category Class
 * @package  TebexCheckout
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class BasketRow implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'BasketRow';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'id' => 'int',
        'basket' => 'int',
        'package' => 'int',
        'override' => 'int',
        'quantity' => 'int',
        'server' => 'int',
        'price' => 'float',
        'gift_username_id' => 'int',
        'options' => 'object',
        'recurring' => 'bool',
        'recurring_period' => 'string',
        'recurring_next_payment_date' => '\DateTime',
        'meta' => '\TebexCheckout\Model\BasketRowMeta',
        'custom' => 'object',
        'image_url' => 'string',
        'recurring_price' => 'float'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'id' => null,
        'basket' => null,
        'package' => null,
        'override' => null,
        'quantity' => null,
        'server' => null,
        'price' => 'float',
        'gift_username_id' => null,
        'options' => null,
        'recurring' => null,
        'recurring_period' => null,
        'recurring_next_payment_date' => 'date-time',
        'meta' => null,
        'custom' => null,
        'image_url' => null,
        'recurring_price' => 'float'
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'id' => false,
        'basket' => false,
        'package' => true,
        'override' => false,
        'quantity' => false,
        'server' => true,
        'price' => false,
        'gift_username_id' => true,
        'options' => true,
        'recurring' => false,
        'recurring_period' => true,
        'recurring_next_payment_date' => true,
        'meta' => false,
        'custom' => true,
        'image_url' => true,
        'recurring_price' => true
    ];

    /**
      * If a nullable field gets set to null, insert it here
      *
      * @var boolean[]
      */
    protected array $openAPINullablesSetToNull = [];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of nullable properties
     *
     * @return array
     */
    protected static function openAPINullables(): array
    {
        return self::$openAPINullables;
    }

    /**
     * Array of nullable field names deliberately set to null
     *
     * @return boolean[]
     */
    private function getOpenAPINullablesSetToNull(): array
    {
        return $this->openAPINullablesSetToNull;
    }

    /**
     * Setter - Array of nullable field names deliberately set to null
     *
     * @param boolean[] $openAPINullablesSetToNull
     */
    private function setOpenAPINullablesSetToNull(array $openAPINullablesSetToNull): void
    {
        $this->openAPINullablesSetToNull = $openAPINullablesSetToNull;
    }

    /**
     * Checks if a property is nullable
     *
     * @param string $property
     * @return bool
     */
    public static function isNullable(string $property): bool
    {
        return self::openAPINullables()[$property] ?? false;
    }

    /**
     * Checks if a nullable property is set to null.
     *
     * @param string $property
     * @return bool
     */
    public function isNullableSetToNull(string $property): bool
    {
        return in_array($property, $this->getOpenAPINullablesSetToNull(), true);
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'id' => 'id',
        'basket' => 'basket',
        'package' => 'package',
        'override' => 'override',
        'quantity' => 'quantity',
        'server' => 'server',
        'price' => 'price',
        'gift_username_id' => 'gift_username_id',
        'options' => 'options',
        'recurring' => 'recurring',
        'recurring_period' => 'recurring_period',
        'recurring_next_payment_date' => 'recurring_next_payment_date',
        'meta' => 'meta',
        'custom' => 'custom',
        'image_url' => 'image_url',
        'recurring_price' => 'recurring_price'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'id' => 'setId',
        'basket' => 'setBasket',
        'package' => 'setPackage',
        'override' => 'setOverride',
        'quantity' => 'setQuantity',
        'server' => 'setServer',
        'price' => 'setPrice',
        'gift_username_id' => 'setGiftUsernameId',
        'options' => 'setOptions',
        'recurring' => 'setRecurring',
        'recurring_period' => 'setRecurringPeriod',
        'recurring_next_payment_date' => 'setRecurringNextPaymentDate',
        'meta' => 'setMeta',
        'custom' => 'setCustom',
        'image_url' => 'setImageUrl',
        'recurring_price' => 'setRecurringPrice'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'id' => 'getId',
        'basket' => 'getBasket',
        'package' => 'getPackage',
        'override' => 'getOverride',
        'quantity' => 'getQuantity',
        'server' => 'getServer',
        'price' => 'getPrice',
        'gift_username_id' => 'getGiftUsernameId',
        'options' => 'getOptions',
        'recurring' => 'getRecurring',
        'recurring_period' => 'getRecurringPeriod',
        'recurring_next_payment_date' => 'getRecurringNextPaymentDate',
        'meta' => 'getMeta',
        'custom' => 'getCustom',
        'image_url' => 'getImageUrl',
        'recurring_price' => 'getRecurringPrice'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }


    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('basket', $data ?? [], null);
        $this->setIfExists('package', $data ?? [], null);
        $this->setIfExists('override', $data ?? [], null);
        $this->setIfExists('quantity', $data ?? [], null);
        $this->setIfExists('server', $data ?? [], null);
        $this->setIfExists('price', $data ?? [], null);
        $this->setIfExists('gift_username_id', $data ?? [], null);
        $this->setIfExists('options', $data ?? [], null);
        $this->setIfExists('recurring', $data ?? [], null);
        $this->setIfExists('recurring_period', $data ?? [], null);
        $this->setIfExists('recurring_next_payment_date', $data ?? [], null);
        $this->setIfExists('meta', $data ?? [], null);
        $this->setIfExists('custom', $data ?? [], null);
        $this->setIfExists('image_url', $data ?? [], null);
        $this->setIfExists('recurring_price', $data ?? [], null);
    }

    /**
    * Sets $this->container[$variableName] to the given data or to the given default Value; if $variableName
    * is nullable and its value is set to null in the $fields array, then mark it as "set to null" in the
    * $this->openAPINullablesSetToNull array
    *
    * @param string $variableName
    * @param array  $fields
    * @param mixed  $defaultValue
    */
    private function setIfExists(string $variableName, array $fields, $defaultValue): void
    {
        if (self::isNullable($variableName) && array_key_exists($variableName, $fields) && is_null($fields[$variableName])) {
            $this->openAPINullablesSetToNull[] = $variableName;
        }

        $this->container[$variableName] = $fields[$variableName] ?? $defaultValue;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets id
     *
     * @return int|null
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     *
     * @param int|null $id id
     *
     * @return self
     */
    public function setId($id)
    {
        if (is_null($id)) {
            throw new \InvalidArgumentException('non-nullable id cannot be null');
        }
        $this->container['id'] = $id;

        return $this;
    }

    /**
     * Gets basket
     *
     * @return int|null
     */
    public function getBasket()
    {
        return $this->container['basket'];
    }

    /**
     * Sets basket
     *
     * @param int|null $basket Numeric basket ID
     *
     * @return self
     */
    public function setBasket($basket)
    {
        if (is_null($basket)) {
            throw new \InvalidArgumentException('non-nullable basket cannot be null');
        }
        $this->container['basket'] = $basket;

        return $this;
    }

    /**
     * Gets package
     *
     * @return int|null
     */
    public function getPackage()
    {
        return $this->container['package'];
    }

    /**
     * Sets package
     *
     * @param int|null $package Package ID associated with this item
     *
     * @return self
     */
    public function setPackage($package)
    {
        if (is_null($package)) {
            array_push($this->openAPINullablesSetToNull, 'package');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('package', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['package'] = $package;

        return $this;
    }

    /**
     * Gets override
     *
     * @return int|null
     */
    public function getOverride()
    {
        return $this->container['override'];
    }

    /**
     * Sets override
     *
     * @param int|null $override Package ID associated with this item
     *
     * @return self
     */
    public function setOverride($override)
    {
        if (is_null($override)) {
            throw new \InvalidArgumentException('non-nullable override cannot be null');
        }
        $this->container['override'] = $override;

        return $this;
    }

    /**
     * Gets quantity
     *
     * @return int|null
     */
    public function getQuantity()
    {
        return $this->container['quantity'];
    }

    /**
     * Sets quantity
     *
     * @param int|null $quantity quantity
     *
     * @return self
     */
    public function setQuantity($quantity)
    {
        if (is_null($quantity)) {
            throw new \InvalidArgumentException('non-nullable quantity cannot be null');
        }
        $this->container['quantity'] = $quantity;

        return $this;
    }

    /**
     * Gets server
     *
     * @return int|null
     */
    public function getServer()
    {
        return $this->container['server'];
    }

    /**
     * Sets server
     *
     * @param int|null $server server
     *
     * @return self
     */
    public function setServer($server)
    {
        if (is_null($server)) {
            array_push($this->openAPINullablesSetToNull, 'server');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('server', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['server'] = $server;

        return $this;
    }

    /**
     * Gets price
     *
     * @return float|null
     */
    public function getPrice()
    {
        return $this->container['price'];
    }

    /**
     * Sets price
     *
     * @param float|null $price price
     *
     * @return self
     */
    public function setPrice($price)
    {
        if (is_null($price)) {
            throw new \InvalidArgumentException('non-nullable price cannot be null');
        }
        $this->container['price'] = $price;

        return $this;
    }

    /**
     * Gets gift_username_id
     *
     * @return int|null
     */
    public function getGiftUsernameId()
    {
        return $this->container['gift_username_id'];
    }

    /**
     * Sets gift_username_id
     *
     * @param int|null $gift_username_id gift_username_id
     *
     * @return self
     */
    public function setGiftUsernameId($gift_username_id)
    {
        if (is_null($gift_username_id)) {
            array_push($this->openAPINullablesSetToNull, 'gift_username_id');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('gift_username_id', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['gift_username_id'] = $gift_username_id;

        return $this;
    }

    /**
     * Gets options
     *
     * @return object|null
     */
    public function getOptions()
    {
        return $this->container['options'];
    }

    /**
     * Sets options
     *
     * @param object|null $options options
     *
     * @return self
     */
    public function setOptions($options)
    {
        if (is_null($options)) {
            array_push($this->openAPINullablesSetToNull, 'options');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('options', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['options'] = $options;

        return $this;
    }

    /**
     * Gets recurring
     *
     * @return bool|null
     */
    public function getRecurring()
    {
        return $this->container['recurring'];
    }

    /**
     * Sets recurring
     *
     * @param bool|null $recurring recurring
     *
     * @return self
     */
    public function setRecurring($recurring)
    {
        if (is_null($recurring)) {
            throw new \InvalidArgumentException('non-nullable recurring cannot be null');
        }
        $this->container['recurring'] = $recurring;

        return $this;
    }

    /**
     * Gets recurring_period
     *
     * @return string|null
     */
    public function getRecurringPeriod()
    {
        return $this->container['recurring_period'];
    }

    /**
     * Sets recurring_period
     *
     * @param string|null $recurring_period recurring_period
     *
     * @return self
     */
    public function setRecurringPeriod($recurring_period)
    {
        if (is_null($recurring_period)) {
            array_push($this->openAPINullablesSetToNull, 'recurring_period');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('recurring_period', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['recurring_period'] = $recurring_period;

        return $this;
    }

    /**
     * Gets recurring_next_payment_date
     *
     * @return \DateTime|null
     */
    public function getRecurringNextPaymentDate()
    {
        return $this->container['recurring_next_payment_date'];
    }

    /**
     * Sets recurring_next_payment_date
     *
     * @param \DateTime|null $recurring_next_payment_date recurring_next_payment_date
     *
     * @return self
     */
    public function setRecurringNextPaymentDate($recurring_next_payment_date)
    {
        if (is_null($recurring_next_payment_date)) {
            array_push($this->openAPINullablesSetToNull, 'recurring_next_payment_date');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('recurring_next_payment_date', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['recurring_next_payment_date'] = $recurring_next_payment_date;

        return $this;
    }

    /**
     * Gets meta
     *
     * @return \TebexCheckout\Model\BasketRowMeta|null
     */
    public function getMeta()
    {
        return $this->container['meta'];
    }

    /**
     * Sets meta
     *
     * @param \TebexCheckout\Model\BasketRowMeta|null $meta meta
     *
     * @return self
     */
    public function setMeta($meta)
    {
        if (is_null($meta)) {
            throw new \InvalidArgumentException('non-nullable meta cannot be null');
        }
        $this->container['meta'] = $meta;

        return $this;
    }

    /**
     * Gets custom
     *
     * @return object|null
     */
    public function getCustom()
    {
        return $this->container['custom'];
    }

    /**
     * Sets custom
     *
     * @param object|null $custom custom
     *
     * @return self
     */
    public function setCustom($custom)
    {
        if (is_null($custom)) {
            array_push($this->openAPINullablesSetToNull, 'custom');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('custom', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['custom'] = $custom;

        return $this;
    }

    /**
     * Gets image_url
     *
     * @return string|null
     */
    public function getImageUrl()
    {
        return $this->container['image_url'];
    }

    /**
     * Sets image_url
     *
     * @param string|null $image_url image_url
     *
     * @return self
     */
    public function setImageUrl($image_url)
    {
        if (is_null($image_url)) {
            array_push($this->openAPINullablesSetToNull, 'image_url');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('image_url', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['image_url'] = $image_url;

        return $this;
    }

    /**
     * Gets recurring_price
     *
     * @return float|null
     */
    public function getRecurringPrice()
    {
        return $this->container['recurring_price'];
    }

    /**
     * Sets recurring_price
     *
     * @param float|null $recurring_price recurring_price
     *
     * @return self
     */
    public function setRecurringPrice($recurring_price)
    {
        if (is_null($recurring_price)) {
            array_push($this->openAPINullablesSetToNull, 'recurring_price');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('recurring_price', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['recurring_price'] = $recurring_price;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset): bool
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed|null
     */
    #[\ReturnTypeWillChange]
    public function offsetGet($offset)
    {
        return $this->container[$offset] ?? null;
    }

    /**
     * Sets value based on offset.
     *
     * @param int|null $offset Offset
     * @param mixed    $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value): void
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset): void
    {
        unset($this->container[$offset]);
    }

    /**
     * Serializes the object to a value that can be serialized natively by json_encode().
     * @link https://www.php.net/manual/en/jsonserializable.jsonserialize.php
     *
     * @return mixed Returns data which can be serialized by json_encode(), which is a value
     * of any type other than a resource.
     */
    #[\ReturnTypeWillChange]
    public function jsonSerialize()
    {
       return ObjectSerializer::sanitizeForSerialization($this);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue()
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


