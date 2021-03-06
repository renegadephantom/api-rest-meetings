<?php
/**
 * PairingCodeSIP
 *
 * PHP version 5
 *
 * @category Class
 * @package  BlueJeansMeetingsRestApi
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * BlueJeans Meetings REST API
 *
 * ## Video That Works Where You Do. <p>This site provides developers access to APIs from BlueJean's Meetings meeting service.  From here you can see and try actual API calls to manage User Accounts, Meetings, and Recordings, pull Analytical Data and Current State information.</p>    <nosdk> <hr> <div> <div class=\"key\">     <a href=\"./basics.html\" target=\"_\"><img class=\"keyimg\" src=\"./img/bjnmeeting.png\"/></a> </div> <div class=\"keybox\"> Basic instructions about What is a BlueJeans Meeting, and Getting Started Using API's, are <a href=\"./basics.html\" target=\"_blank\">available here <i class=\"glyphicon glyphicon-new-window\"></i></a>. </div> </div> <hr> <alert>2/21/2019</alert> Change response of Change layout and Endpoint API's to 204<br/> 12/03/2018 Add API for setting user profile photograph.<br/> 10/17/2018 Updated API field definitions for time variables to be 64-bit .<br/> 7/23/2018 Corrected errors in API definition file.<br/> 7/10/2018 Deprecated some Command Center API's.  Exposed API's that Summarize usage.<br/> 7/06/2018 Added API for changing ownership of recordings.<br/> 6/28/2018 Restored Create Enterprise Account, added Enterprise and User Profile Tag API's.<br/> 6/01/2018 Clarified Access Token requirements for meeting endpoint API's.<br/> 5/21/2018 Corrected return model for meeting history call.<br/> </nosdk> <hr>
 *
 * OpenAPI spec version: 1.0.4402212019
 * Contact: glenn@bluejeans.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 * Swagger Codegen version: 2.4.0-SNAPSHOT
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace BlueJeansMeetingsRestApi\Model;

use \ArrayAccess;
use \BlueJeansMeetingsRestApi\ObjectSerializer;

/**
 * PairingCodeSIP Class Doc Comment
 *
 * @category Class
 * @package  BlueJeansMeetingsRestApi
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class PairingCodeSIP implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'PairingCodeSIP';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'endpoint_guid' => 'string',
        'force_turn' => 'bool',
        'pairing_code' => 'string',
        'turnservers' => '\BlueJeansMeetingsRestApi\Model\PairingCodeSIPTurnservers[]',
        'uri' => 'string',
        'seam_endpoint_guid' => 'string',
        'connection_guid' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'endpoint_guid' => null,
        'force_turn' => null,
        'pairing_code' => null,
        'turnservers' => null,
        'uri' => null,
        'seam_endpoint_guid' => null,
        'connection_guid' => null
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerFormats()
    {
        return self::$swaggerFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'endpoint_guid' => 'endpointGuid',
        'force_turn' => 'forceTURN',
        'pairing_code' => 'pairingCode',
        'turnservers' => 'turnservers',
        'uri' => 'uri',
        'seam_endpoint_guid' => 'seamEndpointGuid',
        'connection_guid' => 'connectionGuid'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'endpoint_guid' => 'setEndpointGuid',
        'force_turn' => 'setForceTurn',
        'pairing_code' => 'setPairingCode',
        'turnservers' => 'setTurnservers',
        'uri' => 'setUri',
        'seam_endpoint_guid' => 'setSeamEndpointGuid',
        'connection_guid' => 'setConnectionGuid'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'endpoint_guid' => 'getEndpointGuid',
        'force_turn' => 'getForceTurn',
        'pairing_code' => 'getPairingCode',
        'turnservers' => 'getTurnservers',
        'uri' => 'getUri',
        'seam_endpoint_guid' => 'getSeamEndpointGuid',
        'connection_guid' => 'getConnectionGuid'
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
        return self::$swaggerModelName;
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
        $this->container['endpoint_guid'] = isset($data['endpoint_guid']) ? $data['endpoint_guid'] : null;
        $this->container['force_turn'] = isset($data['force_turn']) ? $data['force_turn'] : null;
        $this->container['pairing_code'] = isset($data['pairing_code']) ? $data['pairing_code'] : null;
        $this->container['turnservers'] = isset($data['turnservers']) ? $data['turnservers'] : null;
        $this->container['uri'] = isset($data['uri']) ? $data['uri'] : null;
        $this->container['seam_endpoint_guid'] = isset($data['seam_endpoint_guid']) ? $data['seam_endpoint_guid'] : null;
        $this->container['connection_guid'] = isset($data['connection_guid']) ? $data['connection_guid'] : null;
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
     * Gets endpoint_guid
     *
     * @return string
     */
    public function getEndpointGuid()
    {
        return $this->container['endpoint_guid'];
    }

    /**
     * Sets endpoint_guid
     *
     * @param string $endpoint_guid endpoint_guid
     *
     * @return $this
     */
    public function setEndpointGuid($endpoint_guid)
    {
        $this->container['endpoint_guid'] = $endpoint_guid;

        return $this;
    }

    /**
     * Gets force_turn
     *
     * @return bool
     */
    public function getForceTurn()
    {
        return $this->container['force_turn'];
    }

    /**
     * Sets force_turn
     *
     * @param bool $force_turn force_turn
     *
     * @return $this
     */
    public function setForceTurn($force_turn)
    {
        $this->container['force_turn'] = $force_turn;

        return $this;
    }

    /**
     * Gets pairing_code
     *
     * @return string
     */
    public function getPairingCode()
    {
        return $this->container['pairing_code'];
    }

    /**
     * Sets pairing_code
     *
     * @param string $pairing_code pairing_code
     *
     * @return $this
     */
    public function setPairingCode($pairing_code)
    {
        $this->container['pairing_code'] = $pairing_code;

        return $this;
    }

    /**
     * Gets turnservers
     *
     * @return \BlueJeansMeetingsRestApi\Model\PairingCodeSIPTurnservers[]
     */
    public function getTurnservers()
    {
        return $this->container['turnservers'];
    }

    /**
     * Sets turnservers
     *
     * @param \BlueJeansMeetingsRestApi\Model\PairingCodeSIPTurnservers[] $turnservers turnservers
     *
     * @return $this
     */
    public function setTurnservers($turnservers)
    {
        $this->container['turnservers'] = $turnservers;

        return $this;
    }

    /**
     * Gets uri
     *
     * @return string
     */
    public function getUri()
    {
        return $this->container['uri'];
    }

    /**
     * Sets uri
     *
     * @param string $uri uri
     *
     * @return $this
     */
    public function setUri($uri)
    {
        $this->container['uri'] = $uri;

        return $this;
    }

    /**
     * Gets seam_endpoint_guid
     *
     * @return string
     */
    public function getSeamEndpointGuid()
    {
        return $this->container['seam_endpoint_guid'];
    }

    /**
     * Sets seam_endpoint_guid
     *
     * @param string $seam_endpoint_guid seam_endpoint_guid
     *
     * @return $this
     */
    public function setSeamEndpointGuid($seam_endpoint_guid)
    {
        $this->container['seam_endpoint_guid'] = $seam_endpoint_guid;

        return $this;
    }

    /**
     * Gets connection_guid
     *
     * @return string
     */
    public function getConnectionGuid()
    {
        return $this->container['connection_guid'];
    }

    /**
     * Sets connection_guid
     *
     * @param string $connection_guid connection_guid
     *
     * @return $this
     */
    public function setConnectionGuid($connection_guid)
    {
        $this->container['connection_guid'] = $connection_guid;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     *
     * @param integer $offset Offset
     * @param mixed   $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value)
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
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(
                ObjectSerializer::sanitizeForSerialization($this),
                JSON_PRETTY_PRINT
            );
        }

        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


