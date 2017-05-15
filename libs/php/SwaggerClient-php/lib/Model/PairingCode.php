<?php
/**
 * PairingCode
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swaagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * BlueJeans onVideo REST API
 *
 * _Video That Works Where You Do._  This site provides developers access to API's from BlueJean's onVideo meeting service.  From here you will be able to make actual API calls to manage User Accounts, Meetings, and Recordings.  Also, you can pull analytical data as well retrieve current state information.  With these API's  you should be able to quickly integrate **BlueJeans** video into your applications.     # Authentication All API transactions (excluding Authentication) require an access token per **OAuth standards**.  BlueJeans provides multiple methods for obtaining an access token.  Additionally there are diffferent scopes of token access. ## Grant Types Bluejeans provides 4 different methods for users to Authenticate.  Successful authentication allows BlueJeans to grant an access token to perform operations. * Password Credentials Grant – Authenticate with a username and password and receive an access token with user level permission. Known as two-legged OAuth. * Meeting Credentials Grant – Authenticate with a meeting ID and meeting passcode and receive an access token with meeting level permission. Known as two-legged OAuth. * Client Credentials Grant –  Authenticate with a client ID and client secret and receive an access token with enterprise level permission. Known as two-legged OAuth. * Authorization Code Grant – After creating a developer application, users witll authenticate via a BlueJeans page, and receive an authorization code. Submit authorization with other tokens and receive an access token. Known as three-legged OAuth. ## Access & Permissions BlueJeans defines 3 levels of API access into the system.  When an access token is granted, it carries one of these 3 levels.  The scope of system functionality depends upon the token's access level. * Meeting-level – Scope of APIs is limited to individual meetings. * User-level – Scope depends on the requested permissions. * App-level – provisioned either by BlueJeans personnel, or the BlueJeans Enterprise Admin, an app, is issued a client key and secret key. These tokens then are used by the BlueJeans Authentication API to receive the token. The token's scope provides access to the entire enterprise and all of its users. All endpoints in this document that require **Enterprise Admin** access will be marked as such. # Getting Started Before you start using the API's on this site, you must first have a BlueJeans account.  With your BlueJean credentials, use one of the Authentication methods to obtain an access token. - Click on the Authorize button at the top of page - Enter your access token in the field marked \"api_key\" Now the web site will automatically include your access token on all API calls you make.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: brandon@bluejeans.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;

/**
 * PairingCode Class Doc Comment
 *
 * @category    Class
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class PairingCode implements ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'PairingCode';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'callguid' => 'string',
        'endpoint_guid' => 'string',
        'force_turn' => 'bool',
        'pairing_code' => 'string',
        'status' => 'int',
        'status_text' => 'string',
        'turnservers' => '\Swagger\Client\Model\PairingCodeTurnservers[]',
        'uri' => 'string',
        'seam_endpoint_guid' => 'string',
        'connection_guid' => 'string',
        'endpoint_name' => 'string'
    ];

    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of attributes where the key is the local name, and the value is the original name
     * @var string[]
     */
    protected static $attributeMap = [
        'callguid' => 'callguid',
        'endpoint_guid' => 'endpointGuid',
        'force_turn' => 'forceTURN',
        'pairing_code' => 'pairingCode',
        'status' => 'status',
        'status_text' => 'statusText',
        'turnservers' => 'turnservers',
        'uri' => 'uri',
        'seam_endpoint_guid' => 'seamEndpointGuid',
        'connection_guid' => 'connectionGuid',
        'endpoint_name' => 'endpointName'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'callguid' => 'setCallguid',
        'endpoint_guid' => 'setEndpointGuid',
        'force_turn' => 'setForceTurn',
        'pairing_code' => 'setPairingCode',
        'status' => 'setStatus',
        'status_text' => 'setStatusText',
        'turnservers' => 'setTurnservers',
        'uri' => 'setUri',
        'seam_endpoint_guid' => 'setSeamEndpointGuid',
        'connection_guid' => 'setConnectionGuid',
        'endpoint_name' => 'setEndpointName'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'callguid' => 'getCallguid',
        'endpoint_guid' => 'getEndpointGuid',
        'force_turn' => 'getForceTurn',
        'pairing_code' => 'getPairingCode',
        'status' => 'getStatus',
        'status_text' => 'getStatusText',
        'turnservers' => 'getTurnservers',
        'uri' => 'getUri',
        'seam_endpoint_guid' => 'getSeamEndpointGuid',
        'connection_guid' => 'getConnectionGuid',
        'endpoint_name' => 'getEndpointName'
    ];

    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    public static function setters()
    {
        return self::$setters;
    }

    public static function getters()
    {
        return self::$getters;
    }

    const STATUS_TEXT_OK = 'OK';
    

    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public function getStatusTextAllowableValues()
    {
        return [
            self::STATUS_TEXT_OK,
        ];
    }
    

    /**
     * Associative array for storing property values
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['callguid'] = isset($data['callguid']) ? $data['callguid'] : null;
        $this->container['endpoint_guid'] = isset($data['endpoint_guid']) ? $data['endpoint_guid'] : null;
        $this->container['force_turn'] = isset($data['force_turn']) ? $data['force_turn'] : null;
        $this->container['pairing_code'] = isset($data['pairing_code']) ? $data['pairing_code'] : null;
        $this->container['status'] = isset($data['status']) ? $data['status'] : null;
        $this->container['status_text'] = isset($data['status_text']) ? $data['status_text'] : null;
        $this->container['turnservers'] = isset($data['turnservers']) ? $data['turnservers'] : null;
        $this->container['uri'] = isset($data['uri']) ? $data['uri'] : null;
        $this->container['seam_endpoint_guid'] = isset($data['seam_endpoint_guid']) ? $data['seam_endpoint_guid'] : null;
        $this->container['connection_guid'] = isset($data['connection_guid']) ? $data['connection_guid'] : null;
        $this->container['endpoint_name'] = isset($data['endpoint_name']) ? $data['endpoint_name'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = [];

        $allowed_values = ["OK"];
        if (!in_array($this->container['status_text'], $allowed_values)) {
            $invalid_properties[] = "invalid value for 'status_text', must be one of 'OK'.";
        }

        return $invalid_properties;
    }

    /**
     * validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {

        $allowed_values = ["OK"];
        if (!in_array($this->container['status_text'], $allowed_values)) {
            return false;
        }
        return true;
    }


    /**
     * Gets callguid
     * @return string
     */
    public function getCallguid()
    {
        return $this->container['callguid'];
    }

    /**
     * Sets callguid
     * @param string $callguid
     * @return $this
     */
    public function setCallguid($callguid)
    {
        $this->container['callguid'] = $callguid;

        return $this;
    }

    /**
     * Gets endpoint_guid
     * @return string
     */
    public function getEndpointGuid()
    {
        return $this->container['endpoint_guid'];
    }

    /**
     * Sets endpoint_guid
     * @param string $endpoint_guid
     * @return $this
     */
    public function setEndpointGuid($endpoint_guid)
    {
        $this->container['endpoint_guid'] = $endpoint_guid;

        return $this;
    }

    /**
     * Gets force_turn
     * @return bool
     */
    public function getForceTurn()
    {
        return $this->container['force_turn'];
    }

    /**
     * Sets force_turn
     * @param bool $force_turn
     * @return $this
     */
    public function setForceTurn($force_turn)
    {
        $this->container['force_turn'] = $force_turn;

        return $this;
    }

    /**
     * Gets pairing_code
     * @return string
     */
    public function getPairingCode()
    {
        return $this->container['pairing_code'];
    }

    /**
     * Sets pairing_code
     * @param string $pairing_code
     * @return $this
     */
    public function setPairingCode($pairing_code)
    {
        $this->container['pairing_code'] = $pairing_code;

        return $this;
    }

    /**
     * Gets status
     * @return int
     */
    public function getStatus()
    {
        return $this->container['status'];
    }

    /**
     * Sets status
     * @param int $status
     * @return $this
     */
    public function setStatus($status)
    {
        $this->container['status'] = $status;

        return $this;
    }

    /**
     * Gets status_text
     * @return string
     */
    public function getStatusText()
    {
        return $this->container['status_text'];
    }

    /**
     * Sets status_text
     * @param string $status_text
     * @return $this
     */
    public function setStatusText($status_text)
    {
        $allowed_values = array('OK');
        if (!is_null($status_text) && (!in_array($status_text, $allowed_values))) {
            throw new \InvalidArgumentException("Invalid value for 'status_text', must be one of 'OK'");
        }
        $this->container['status_text'] = $status_text;

        return $this;
    }

    /**
     * Gets turnservers
     * @return \Swagger\Client\Model\PairingCodeTurnservers[]
     */
    public function getTurnservers()
    {
        return $this->container['turnservers'];
    }

    /**
     * Sets turnservers
     * @param \Swagger\Client\Model\PairingCodeTurnservers[] $turnservers
     * @return $this
     */
    public function setTurnservers($turnservers)
    {
        $this->container['turnservers'] = $turnservers;

        return $this;
    }

    /**
     * Gets uri
     * @return string
     */
    public function getUri()
    {
        return $this->container['uri'];
    }

    /**
     * Sets uri
     * @param string $uri
     * @return $this
     */
    public function setUri($uri)
    {
        $this->container['uri'] = $uri;

        return $this;
    }

    /**
     * Gets seam_endpoint_guid
     * @return string
     */
    public function getSeamEndpointGuid()
    {
        return $this->container['seam_endpoint_guid'];
    }

    /**
     * Sets seam_endpoint_guid
     * @param string $seam_endpoint_guid
     * @return $this
     */
    public function setSeamEndpointGuid($seam_endpoint_guid)
    {
        $this->container['seam_endpoint_guid'] = $seam_endpoint_guid;

        return $this;
    }

    /**
     * Gets connection_guid
     * @return string
     */
    public function getConnectionGuid()
    {
        return $this->container['connection_guid'];
    }

    /**
     * Sets connection_guid
     * @param string $connection_guid
     * @return $this
     */
    public function setConnectionGuid($connection_guid)
    {
        $this->container['connection_guid'] = $connection_guid;

        return $this;
    }

    /**
     * Gets endpoint_name
     * @return string
     */
    public function getEndpointName()
    {
        return $this->container['endpoint_name'];
    }

    /**
     * Sets endpoint_name
     * @param string $endpoint_name
     * @return $this
     */
    public function setEndpointName($endpoint_name)
    {
        $this->container['endpoint_name'] = $endpoint_name;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     * @param  integer $offset Offset
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     * @param  integer $offset Offset
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     * @param  integer $offset Offset
     * @param  mixed   $value  Value to be set
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
     * @param  integer $offset Offset
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this), JSON_PRETTY_PRINT);
        }

        return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this));
    }
}


