/**
 * BlueJeans onVideo REST API
 * _Video That Works Where You Do._  This site provides developers access to API's from BlueJean's onVideo meeting service.  From here you will be able to make actual API calls to manage User Accounts, Meetings, and Recordings.  Also, you can pull analytical data as well retrieve current state information.  With these API's  you should be able to quickly integrate **BlueJeans** video into your applications.     # Authentication All API transactions (excluding Authentication) require an access token per **OAuth standards**.  BlueJeans provides multiple methods for obtaining an access token.  Additionally there are diffferent scopes of token access. ## Grant Types Bluejeans provides 4 different methods for users to Authenticate.  Successful authentication allows BlueJeans to grant an access token to perform operations. * Password Credentials Grant – Authenticate with a username and password and receive an access token with user level permission. Known as two-legged OAuth. * Meeting Credentials Grant – Authenticate with a meeting ID and meeting passcode and receive an access token with meeting level permission. Known as two-legged OAuth. * Client Credentials Grant –  Authenticate with a client ID and client secret and receive an access token with enterprise level permission. Known as two-legged OAuth. * Authorization Code Grant – After creating a developer application, users witll authenticate via a BlueJeans page, and receive an authorization code. Submit authorization with other tokens and receive an access token. Known as three-legged OAuth. ## Access & Permissions BlueJeans defines 3 levels of API access into the system.  When an access token is granted, it carries one of these 3 levels.  The scope of system functionality depends upon the token's access level. * Meeting-level – Scope of APIs is limited to individual meetings. * User-level – Scope depends on the requested permissions. * App-level – provisioned either by BlueJeans personnel, or the BlueJeans Enterprise Admin, an app, is issued a client key and secret key. These tokens then are used by the BlueJeans Authentication API to receive the token. The token's scope provides access to the entire enterprise and all of its users. All endpoints in this document that require **Enterprise Admin** access will be marked as such. # Getting Started Before you start using the API's on this site, you must first have a BlueJeans account.  With your BlueJean credentials, use one of the Authentication methods to obtain an access token. - Click on the Authorize button at the top of page - Enter your access token in the field marked \"api_key\" Now the web site will automatically include your access token on all API calls you make. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: brandon@bluejeans.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/Error', 'model/GrantClient', 'model/GrantCode', 'model/GrantMeeting', 'model/GrantPassword', 'model/GrantRefresh', 'model/GrantRequestClient', 'model/GrantRequestCode', 'model/GrantRequestMeeting', 'model/GrantRequestPassword', 'model/GrantRequestRefresh', 'model/GrantRequestRevoke', 'model/InlineResponse200'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/Error'), require('../model/GrantClient'), require('../model/GrantCode'), require('../model/GrantMeeting'), require('../model/GrantPassword'), require('../model/GrantRefresh'), require('../model/GrantRequestClient'), require('../model/GrantRequestCode'), require('../model/GrantRequestMeeting'), require('../model/GrantRequestPassword'), require('../model/GrantRequestRefresh'), require('../model/GrantRequestRevoke'), require('../model/InlineResponse200'));
  } else {
    // Browser globals (root is window)
    if (!root.BlueJeansOnVideoRestApi) {
      root.BlueJeansOnVideoRestApi = {};
    }
    root.BlueJeansOnVideoRestApi.AuthenticationApi = factory(root.BlueJeansOnVideoRestApi.ApiClient, root.BlueJeansOnVideoRestApi.Error, root.BlueJeansOnVideoRestApi.GrantClient, root.BlueJeansOnVideoRestApi.GrantCode, root.BlueJeansOnVideoRestApi.GrantMeeting, root.BlueJeansOnVideoRestApi.GrantPassword, root.BlueJeansOnVideoRestApi.GrantRefresh, root.BlueJeansOnVideoRestApi.GrantRequestClient, root.BlueJeansOnVideoRestApi.GrantRequestCode, root.BlueJeansOnVideoRestApi.GrantRequestMeeting, root.BlueJeansOnVideoRestApi.GrantRequestPassword, root.BlueJeansOnVideoRestApi.GrantRequestRefresh, root.BlueJeansOnVideoRestApi.GrantRequestRevoke, root.BlueJeansOnVideoRestApi.InlineResponse200);
  }
}(this, function(ApiClient, Error, GrantClient, GrantCode, GrantMeeting, GrantPassword, GrantRefresh, GrantRequestClient, GrantRequestCode, GrantRequestMeeting, GrantRequestPassword, GrantRequestRefresh, GrantRequestRevoke, InlineResponse200) {
  'use strict';

  /**
   * Authentication service.
   * @module api/AuthenticationApi
   * @version 1.0.0
   */

  /**
   * Constructs a new AuthenticationApi. 
   * @alias module:api/AuthenticationApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the getAuthorizationCode operation.
     * @callback module:api/AuthenticationApi~getAuthorizationCodeCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get Authorization Code
     * This is NOT a REST endpoint. Documenting here for consistentcy. This URL should be used by a client application user&#39;s browser to perform authorization.  User will be redirected back to client application upon completion with state and code parameters. Use \&quot;bluejeans.com\&quot; as hostname. The code returned is only good for 30 seconds. You will want to call /oauth2/token with it as soon as possible.
     * @param {Object} opts Optional parameters
     * @param {String} opts.clientId The 32 character client ID generated when you created the client application.
     * @param {String} opts.redirectUri The URL where the authorization code will be returned via redirect.  The URL must match a URL registered with the client application.
     * @param {String} opts.state Client application specific state passed through and returned in the redirect URL. May be useful for identifying operations or users.
     * @param {String} opts.scope A comma delimited list of scopes requested. Scopes may be list_meetings, modify_meetings, user_info
     * @param {String} opts.responseType The type of authorization you are peforrming.  Set to \&quot;code\&quot;. (default to code)
     * @param {String} opts.appName The name of the client application shown to user during authorization.
     * @param {String} opts.appLogoUrl URL to an 84x84 image shown to user during authorization.
     * @param {module:api/AuthenticationApi~getAuthorizationCodeCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.getAuthorizationCode = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'clientId': opts['clientId'],
        'redirectUri': opts['redirectUri'],
        'state': opts['state'],
        'scope': opts['scope'],
        'responseType': opts['responseType'],
        'appName': opts['appName'],
        'appLogoUrl': opts['appLogoUrl']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['access_token'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = null;

      return this.apiClient.callApi(
        '/oauth2/authorize', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getTokenByClient operation.
     * @callback module:api/AuthenticationApi~getTokenByClientCallback
     * @param {String} error Error message, if any.
     * @param {module:model/GrantClient} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Authentication via Client Grant Type
     * This API is typically called from an application.  Client ID and Secret are provisioned within the BlueJeans Enterprise Administration console and given to the customer.
     * @param {module:model/GrantRequestClient} grantRequestClient Contains information about the type of grant you are requesting.
     * @param {module:api/AuthenticationApi~getTokenByClientCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/GrantClient}
     */
    this.getTokenByClient = function(grantRequestClient, callback) {
      var postBody = grantRequestClient;

      // verify the required parameter 'grantRequestClient' is set
      if (grantRequestClient == undefined || grantRequestClient == null) {
        throw new Error("Missing the required parameter 'grantRequestClient' when calling getTokenByClient");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['access_token'];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = GrantClient;

      return this.apiClient.callApi(
        '/oauth2/token?Client', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getTokenByCode operation.
     * @callback module:api/AuthenticationApi~getTokenByCodeCallback
     * @param {String} error Error message, if any.
     * @param {module:model/GrantCode} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Authentication via Code Grant Type
     * This API is part of the 3-legged OAuth 2.0 authorization flow.
     * @param {module:model/GrantRequestCode} grantRequestCode Contains information about the type of grant you are requesting.
     * @param {module:api/AuthenticationApi~getTokenByCodeCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/GrantCode}
     */
    this.getTokenByCode = function(grantRequestCode, callback) {
      var postBody = grantRequestCode;

      // verify the required parameter 'grantRequestCode' is set
      if (grantRequestCode == undefined || grantRequestCode == null) {
        throw new Error("Missing the required parameter 'grantRequestCode' when calling getTokenByCode");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['access_token'];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = GrantCode;

      return this.apiClient.callApi(
        '/oauth2/token?Code', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getTokenByMeeting operation.
     * @callback module:api/AuthenticationApi~getTokenByMeetingCallback
     * @param {String} error Error message, if any.
     * @param {module:model/GrantMeeting} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Authentication via Meeting Grant Type
     * This API uses an OAuth-like grant/request method similar to the Password grant type. The scope of access covers the meeting only. Call this API with the meetings&#39; numerid ID, and the meeting passcode (it one exists).  If a Moderator passcode is sent, moderator privileges are granted. If an Attendee access code is passed, the access token will grant attendee abilities.
     * @param {module:model/GrantRequestMeeting} grantRequestMeeting Contains information about the type of grant you are requesting.
     * @param {module:api/AuthenticationApi~getTokenByMeetingCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/GrantMeeting}
     */
    this.getTokenByMeeting = function(grantRequestMeeting, callback) {
      var postBody = grantRequestMeeting;

      // verify the required parameter 'grantRequestMeeting' is set
      if (grantRequestMeeting == undefined || grantRequestMeeting == null) {
        throw new Error("Missing the required parameter 'grantRequestMeeting' when calling getTokenByMeeting");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['access_token'];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = GrantMeeting;

      return this.apiClient.callApi(
        '/oauth2/token?Meeting', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getTokenByPassword operation.
     * @callback module:api/AuthenticationApi~getTokenByPasswordCallback
     * @param {String} error Error message, if any.
     * @param {module:model/GrantPassword} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Authentication via Password Grant Type
     * This API performs an authentication based upon a username and password.   Call this API and provide a valid username and password.  Set the grant_type to \&quot;password\&quot;.
     * @param {module:model/GrantRequestPassword} grantRequestPassword Contains information about the type of grant you are requesting.
     * @param {module:api/AuthenticationApi~getTokenByPasswordCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/GrantPassword}
     */
    this.getTokenByPassword = function(grantRequestPassword, callback) {
      var postBody = grantRequestPassword;

      // verify the required parameter 'grantRequestPassword' is set
      if (grantRequestPassword == undefined || grantRequestPassword == null) {
        throw new Error("Missing the required parameter 'grantRequestPassword' when calling getTokenByPassword");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['access_token'];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = GrantPassword;

      return this.apiClient.callApi(
        '/oauth2/token?Password', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getTokenByRefresh operation.
     * @callback module:api/AuthenticationApi~getTokenByRefreshCallback
     * @param {String} error Error message, if any.
     * @param {module:model/GrantRefresh} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Authentication via Refresh Grant Type
     * This API is part of the 3-legged OAuth 2.0 authorization flow.
     * @param {module:model/GrantRequestRefresh} grantRequestRefresh Contains information about the type of grant you are requesting.
     * @param {module:api/AuthenticationApi~getTokenByRefreshCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/GrantRefresh}
     */
    this.getTokenByRefresh = function(grantRequestRefresh, callback) {
      var postBody = grantRequestRefresh;

      // verify the required parameter 'grantRequestRefresh' is set
      if (grantRequestRefresh == undefined || grantRequestRefresh == null) {
        throw new Error("Missing the required parameter 'grantRequestRefresh' when calling getTokenByRefresh");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['access_token'];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = GrantRefresh;

      return this.apiClient.callApi(
        '/oauth2/token?Refresh', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getTokenInfo operation.
     * @callback module:api/AuthenticationApi~getTokenInfoCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Validate a Token
     * This endpoint will validate if a token is valid or not.
     * @param {Object} opts Optional parameters
     * @param {String} opts.accessToken 
     * @param {module:api/AuthenticationApi~getTokenInfoCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/InlineResponse200}
     */
    this.getTokenInfo = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'access_token': opts['accessToken']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['access_token'];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/oauth2/tokenInfo', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the revokeAccessToken operation.
     * @callback module:api/AuthenticationApi~revokeAccessTokenCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Revoke Access Token
     * This API is part of the 3-legged OAuth 2.0 authorization flow.
     * @param {module:model/GrantRequestRevoke} grantRequestRevoke Contains information about the type of grant you are revoking.
     * @param {Object} opts Optional parameters
     * @param {String} opts.accessToken 
     * @param {module:api/AuthenticationApi~revokeAccessTokenCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.revokeAccessToken = function(grantRequestRevoke, opts, callback) {
      opts = opts || {};
      var postBody = grantRequestRevoke;

      // verify the required parameter 'grantRequestRevoke' is set
      if (grantRequestRevoke == undefined || grantRequestRevoke == null) {
        throw new Error("Missing the required parameter 'grantRequestRevoke' when calling revokeAccessToken");
      }


      var pathParams = {
      };
      var queryParams = {
        'access_token': opts['accessToken']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['access_token'];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = null;

      return this.apiClient.callApi(
        '/oauth2/token?Revoke', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
