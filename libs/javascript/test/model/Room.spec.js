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
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.BlueJeansOnVideoRestApi);
  }
}(this, function(expect, BlueJeansOnVideoRestApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new BlueJeansOnVideoRestApi.Room();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('Room', function() {
    it('should create an instance of Room', function() {
      // uncomment below and update the code to test Room
      //var instane = new BlueJeansOnVideoRestApi.Room();
      //expect(instance).to.be.a(BlueJeansOnVideoRestApi.Room);
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instane = new BlueJeansOnVideoRestApi.Room();
      //expect(instance).to.be();
    });

    it('should have the property numericId (base name: "numericId")', function() {
      // uncomment below and update the code to test the property numericId
      //var instane = new BlueJeansOnVideoRestApi.Room();
      //expect(instance).to.be();
    });

    it('should have the property name (base name: "name")', function() {
      // uncomment below and update the code to test the property name
      //var instane = new BlueJeansOnVideoRestApi.Room();
      //expect(instance).to.be();
    });

    it('should have the property originPopId (base name: "originPopId")', function() {
      // uncomment below and update the code to test the property originPopId
      //var instane = new BlueJeansOnVideoRestApi.Room();
      //expect(instance).to.be();
    });

    it('should have the property isLargeMeeting (base name: "isLargeMeeting")', function() {
      // uncomment below and update the code to test the property isLargeMeeting
      //var instane = new BlueJeansOnVideoRestApi.Room();
      //expect(instance).to.be();
    });

    it('should have the property showVideoAnimations (base name: "showVideoAnimations")', function() {
      // uncomment below and update the code to test the property showVideoAnimations
      //var instane = new BlueJeansOnVideoRestApi.Room();
      //expect(instance).to.be();
    });

    it('should have the property backgroundImage (base name: "backgroundImage")', function() {
      // uncomment below and update the code to test the property backgroundImage
      //var instane = new BlueJeansOnVideoRestApi.Room();
      //expect(instance).to.be();
    });

    it('should have the property isModeratorLess (base name: "isModeratorLess")', function() {
      // uncomment below and update the code to test the property isModeratorLess
      //var instane = new BlueJeansOnVideoRestApi.Room();
      //expect(instance).to.be();
    });

    it('should have the property welcomeMessage (base name: "welcomeMessage")', function() {
      // uncomment below and update the code to test the property welcomeMessage
      //var instane = new BlueJeansOnVideoRestApi.Room();
      //expect(instance).to.be();
    });

    it('should have the property disallowChat (base name: "disallowChat")', function() {
      // uncomment below and update the code to test the property disallowChat
      //var instane = new BlueJeansOnVideoRestApi.Room();
      //expect(instance).to.be();
    });

    it('should have the property encryptionType (base name: "encryptionType")', function() {
      // uncomment below and update the code to test the property encryptionType
      //var instane = new BlueJeansOnVideoRestApi.Room();
      //expect(instance).to.be();
    });

    it('should have the property showAllParticipantsInIcs (base name: "showAllParticipantsInIcs")', function() {
      // uncomment below and update the code to test the property showAllParticipantsInIcs
      //var instane = new BlueJeansOnVideoRestApi.Room();
      //expect(instance).to.be();
    });

    it('should have the property participantPasscode (base name: "participantPasscode")', function() {
      // uncomment below and update the code to test the property participantPasscode
      //var instane = new BlueJeansOnVideoRestApi.Room();
      //expect(instance).to.be();
    });

    it('should have the property publishMeeting (base name: "publishMeeting")', function() {
      // uncomment below and update the code to test the property publishMeeting
      //var instane = new BlueJeansOnVideoRestApi.Room();
      //expect(instance).to.be();
    });

    it('should have the property moderatorLess (base name: "moderatorLess")', function() {
      // uncomment below and update the code to test the property moderatorLess
      //var instane = new BlueJeansOnVideoRestApi.Room();
      //expect(instance).to.be();
    });

    it('should have the property videoBestFit (base name: "videoBestFit")', function() {
      // uncomment below and update the code to test the property videoBestFit
      //var instane = new BlueJeansOnVideoRestApi.Room();
      //expect(instance).to.be();
    });

    it('should have the property muteParticipantsOnEntry (base name: "muteParticipantsOnEntry")', function() {
      // uncomment below and update the code to test the property muteParticipantsOnEntry
      //var instane = new BlueJeansOnVideoRestApi.Room();
      //expect(instance).to.be();
    });

    it('should have the property enforceMeetingEncryption (base name: "enforceMeetingEncryption")', function() {
      // uncomment below and update the code to test the property enforceMeetingEncryption
      //var instane = new BlueJeansOnVideoRestApi.Room();
      //expect(instance).to.be();
    });

    it('should have the property enforceMeetingEncryptionAllowPSTN (base name: "enforceMeetingEncryptionAllowPSTN")', function() {
      // uncomment below and update the code to test the property enforceMeetingEncryptionAllowPSTN
      //var instane = new BlueJeansOnVideoRestApi.Room();
      //expect(instance).to.be();
    });

    it('should have the property idleTimeout (base name: "idleTimeout")', function() {
      // uncomment below and update the code to test the property idleTimeout
      //var instane = new BlueJeansOnVideoRestApi.Room();
      //expect(instance).to.be();
    });

    it('should have the property defaultLayout (base name: "defaultLayout")', function() {
      // uncomment below and update the code to test the property defaultLayout
      //var instane = new BlueJeansOnVideoRestApi.Room();
      //expect(instance).to.be();
    });

    it('should have the property playAudioAlerts (base name: "playAudioAlerts")', function() {
      // uncomment below and update the code to test the property playAudioAlerts
      //var instane = new BlueJeansOnVideoRestApi.Room();
      //expect(instance).to.be();
    });

    it('should have the property personalMeetingId (base name: "personalMeetingId")', function() {
      // uncomment below and update the code to test the property personalMeetingId
      //var instane = new BlueJeansOnVideoRestApi.Room();
      //expect(instance).to.be();
    });

    it('should have the property moderatorPasscode (base name: "moderatorPasscode")', function() {
      // uncomment below and update the code to test the property moderatorPasscode
      //var instane = new BlueJeansOnVideoRestApi.Room();
      //expect(instance).to.be();
    });

  });

}));
