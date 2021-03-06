/* 
 * BlueJeans Meetings REST API
 *
 *  ## Video That Works Where You Do. <p>This site provides developers access to APIs from BlueJean's Meetings meeting service.  From here you can see and try actual API calls to manage User Accounts, Meetings, and Recordings, pull Analytical Data and Current State information.</p>    <nosdk> <hr> <div> <div class=\"key\">     <a href=\"./basics.html\" target=\"_\"><img class=\"keyimg\" src=\"./img/bjnmeeting.png\"/></a> </div> <div class=\"keybox\"> Basic instructions about What is a BlueJeans Meeting, and Getting Started Using API's, are <a href=\"./basics.html\" target=\"_blank\">available here <i class=\"glyphicon glyphicon-new-window\"></i></a>. </div> </div> <hr> <alert>2/21/2019</alert> Change response of Change layout and Endpoint API's to 204<br/> 12/03/2018 Add API for setting user profile photograph.<br/> 10/17/2018 Updated API field definitions for time variables to be 64-bit .<br/> 7/23/2018 Corrected errors in API definition file.<br/> 7/10/2018 Deprecated some Command Center API's.  Exposed API's that Summarize usage.<br/> 7/06/2018 Added API for changing ownership of recordings.<br/> 6/28/2018 Restored Create Enterprise Account, added Enterprise and User Profile Tag API's.<br/> 6/01/2018 Clarified Access Token requirements for meeting endpoint API's.<br/> 5/21/2018 Corrected return model for meeting history call.<br/> </nosdk> <hr> 
 *
 * OpenAPI spec version: 1.0.4402212019
 * Contact: glenn@bluejeans.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = com.bluejeans.api.rest.meetings.Client.SwaggerDateConverter;

namespace com.bluejeans.api.rest.meetings.Model
{
    /// <summary>
    /// Application
    /// </summary>
    [DataContract]
    public partial class Application :  IEquatable<Application>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Application" /> class.
        /// </summary>
        /// <param name="description">A summary of the client application..</param>
        /// <param name="appName">The name of the client application..</param>
        /// <param name="appLogoUrl">A URL of an image that will be displayed to users during authorization..</param>
        /// <param name="redirectUrls">redirectUrls.</param>
        public Application(string description = default(string), string appName = default(string), string appLogoUrl = default(string), List<string> redirectUrls = default(List<string>))
        {
            this.Description = description;
            this.AppName = appName;
            this.AppLogoUrl = appLogoUrl;
            this.RedirectUrls = redirectUrls;
        }
        
        /// <summary>
        /// A summary of the client application.
        /// </summary>
        /// <value>A summary of the client application.</value>
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// The name of the client application.
        /// </summary>
        /// <value>The name of the client application.</value>
        [DataMember(Name="appName", EmitDefaultValue=false)]
        public string AppName { get; set; }

        /// <summary>
        /// A URL of an image that will be displayed to users during authorization.
        /// </summary>
        /// <value>A URL of an image that will be displayed to users during authorization.</value>
        [DataMember(Name="appLogoUrl", EmitDefaultValue=false)]
        public string AppLogoUrl { get; set; }

        /// <summary>
        /// Gets or Sets RedirectUrls
        /// </summary>
        [DataMember(Name="redirectUrls", EmitDefaultValue=false)]
        public List<string> RedirectUrls { get; set; }

        /// <summary>
        /// The client ID will be generated on creation of the application. Normally, a 32 character hexadecimal numeric string.
        /// </summary>
        /// <value>The client ID will be generated on creation of the application. Normally, a 32 character hexadecimal numeric string.</value>
        [DataMember(Name="clientId", EmitDefaultValue=false)]
        public string ClientId { get; private set; }

        /// <summary>
        /// The client secret will be generated on creation of the application. Retain this value as it will only be revealed one time. If lost, you will need to regenerate.
        /// </summary>
        /// <value>The client secret will be generated on creation of the application. Retain this value as it will only be revealed one time. If lost, you will need to regenerate.</value>
        [DataMember(Name="clientSecret", EmitDefaultValue=false)]
        public string ClientSecret { get; private set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Application {\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  AppName: ").Append(AppName).Append("\n");
            sb.Append("  AppLogoUrl: ").Append(AppLogoUrl).Append("\n");
            sb.Append("  RedirectUrls: ").Append(RedirectUrls).Append("\n");
            sb.Append("  ClientId: ").Append(ClientId).Append("\n");
            sb.Append("  ClientSecret: ").Append(ClientSecret).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as Application);
        }

        /// <summary>
        /// Returns true if Application instances are equal
        /// </summary>
        /// <param name="input">Instance of Application to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Application input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.AppName == input.AppName ||
                    (this.AppName != null &&
                    this.AppName.Equals(input.AppName))
                ) && 
                (
                    this.AppLogoUrl == input.AppLogoUrl ||
                    (this.AppLogoUrl != null &&
                    this.AppLogoUrl.Equals(input.AppLogoUrl))
                ) && 
                (
                    this.RedirectUrls == input.RedirectUrls ||
                    this.RedirectUrls != null &&
                    this.RedirectUrls.SequenceEqual(input.RedirectUrls)
                ) && 
                (
                    this.ClientId == input.ClientId ||
                    (this.ClientId != null &&
                    this.ClientId.Equals(input.ClientId))
                ) && 
                (
                    this.ClientSecret == input.ClientSecret ||
                    (this.ClientSecret != null &&
                    this.ClientSecret.Equals(input.ClientSecret))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Description != null)
                    hashCode = hashCode * 59 + this.Description.GetHashCode();
                if (this.AppName != null)
                    hashCode = hashCode * 59 + this.AppName.GetHashCode();
                if (this.AppLogoUrl != null)
                    hashCode = hashCode * 59 + this.AppLogoUrl.GetHashCode();
                if (this.RedirectUrls != null)
                    hashCode = hashCode * 59 + this.RedirectUrls.GetHashCode();
                if (this.ClientId != null)
                    hashCode = hashCode * 59 + this.ClientId.GetHashCode();
                if (this.ClientSecret != null)
                    hashCode = hashCode * 59 + this.ClientSecret.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
