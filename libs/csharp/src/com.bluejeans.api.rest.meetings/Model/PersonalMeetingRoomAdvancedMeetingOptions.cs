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
    /// PersonalMeetingRoomAdvancedMeetingOptions
    /// </summary>
    [DataContract]
    public partial class PersonalMeetingRoomAdvancedMeetingOptions :  IEquatable<PersonalMeetingRoomAdvancedMeetingOptions>, IValidatableObject
    {
        /// <summary>
        /// How this meeting is to be encrypted.
        /// </summary>
        /// <value>How this meeting is to be encrypted.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum EncryptionTypeEnum
        {
            
            /// <summary>
            /// Enum NOENCRYPTION for value: NO_ENCRYPTION
            /// </summary>
            [EnumMember(Value = "NO_ENCRYPTION")]
            NOENCRYPTION = 1,
            
            /// <summary>
            /// Enum ENCRYPTEDONLY for value: ENCRYPTED_ONLY
            /// </summary>
            [EnumMember(Value = "ENCRYPTED_ONLY")]
            ENCRYPTEDONLY = 2,
            
            /// <summary>
            /// Enum ENCRYPTEDORPSTNONLY for value: ENCRYPTED_OR_PSTN_ONLY
            /// </summary>
            [EnumMember(Value = "ENCRYPTED_OR_PSTN_ONLY")]
            ENCRYPTEDORPSTNONLY = 3
        }

        /// <summary>
        /// How this meeting is to be encrypted.
        /// </summary>
        /// <value>How this meeting is to be encrypted.</value>
        [DataMember(Name="encryptionType", EmitDefaultValue=false)]
        public EncryptionTypeEnum? EncryptionType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="PersonalMeetingRoomAdvancedMeetingOptions" /> class.
        /// </summary>
        /// <param name="videoBestFit">Same user ID as passed in path parameter..</param>
        /// <param name="publishMeeting">Same user ID as passed in path parameter..</param>
        /// <param name="encryptionType">How this meeting is to be encrypted..</param>
        /// <param name="moderatorLess">If set require that a user enter&#39;s a moderator passcode to start meeting..</param>
        /// <param name="allowStream">Allow sending of streamed video.</param>
        /// <param name="autoRecord">By default start recording anytime 2 or more join this room..</param>
        /// <param name="disallowChat">If set, disable the ability to send chat message within this meeting..</param>
        /// <param name="muteParticipantsOnEntry">If set, force each joining participant to be muted..</param>
        /// <param name="showAllAttendeesInMeetingInvite">When sending email invitations, include the exhaustive list of invited people..</param>
        /// <param name="editability">editability.</param>
        public PersonalMeetingRoomAdvancedMeetingOptions(bool? videoBestFit = default(bool?), bool? publishMeeting = default(bool?), EncryptionTypeEnum? encryptionType = default(EncryptionTypeEnum?), bool? moderatorLess = default(bool?), bool? allowStream = default(bool?), bool? autoRecord = default(bool?), bool? disallowChat = default(bool?), bool? muteParticipantsOnEntry = default(bool?), bool? showAllAttendeesInMeetingInvite = default(bool?), PersonalMeetingRoomAdvancedMeetingOptionsEditability editability = default(PersonalMeetingRoomAdvancedMeetingOptionsEditability))
        {
            this.VideoBestFit = videoBestFit;
            this.PublishMeeting = publishMeeting;
            this.EncryptionType = encryptionType;
            this.ModeratorLess = moderatorLess;
            this.AllowStream = allowStream;
            this.AutoRecord = autoRecord;
            this.DisallowChat = disallowChat;
            this.MuteParticipantsOnEntry = muteParticipantsOnEntry;
            this.ShowAllAttendeesInMeetingInvite = showAllAttendeesInMeetingInvite;
            this.Editability = editability;
        }
        
        /// <summary>
        /// Same user ID as passed in path parameter.
        /// </summary>
        /// <value>Same user ID as passed in path parameter.</value>
        [DataMember(Name="videoBestFit", EmitDefaultValue=false)]
        public bool? VideoBestFit { get; set; }

        /// <summary>
        /// Same user ID as passed in path parameter.
        /// </summary>
        /// <value>Same user ID as passed in path parameter.</value>
        [DataMember(Name="publishMeeting", EmitDefaultValue=false)]
        public bool? PublishMeeting { get; set; }


        /// <summary>
        /// If set require that a user enter&#39;s a moderator passcode to start meeting.
        /// </summary>
        /// <value>If set require that a user enter&#39;s a moderator passcode to start meeting.</value>
        [DataMember(Name="moderatorLess", EmitDefaultValue=false)]
        public bool? ModeratorLess { get; set; }

        /// <summary>
        /// Allow sending of streamed video
        /// </summary>
        /// <value>Allow sending of streamed video</value>
        [DataMember(Name="allowStream", EmitDefaultValue=false)]
        public bool? AllowStream { get; set; }

        /// <summary>
        /// By default start recording anytime 2 or more join this room.
        /// </summary>
        /// <value>By default start recording anytime 2 or more join this room.</value>
        [DataMember(Name="autoRecord", EmitDefaultValue=false)]
        public bool? AutoRecord { get; set; }

        /// <summary>
        /// If set, disable the ability to send chat message within this meeting.
        /// </summary>
        /// <value>If set, disable the ability to send chat message within this meeting.</value>
        [DataMember(Name="disallowChat", EmitDefaultValue=false)]
        public bool? DisallowChat { get; set; }

        /// <summary>
        /// If set, force each joining participant to be muted.
        /// </summary>
        /// <value>If set, force each joining participant to be muted.</value>
        [DataMember(Name="muteParticipantsOnEntry", EmitDefaultValue=false)]
        public bool? MuteParticipantsOnEntry { get; set; }

        /// <summary>
        /// When sending email invitations, include the exhaustive list of invited people.
        /// </summary>
        /// <value>When sending email invitations, include the exhaustive list of invited people.</value>
        [DataMember(Name="showAllAttendeesInMeetingInvite", EmitDefaultValue=false)]
        public bool? ShowAllAttendeesInMeetingInvite { get; set; }

        /// <summary>
        /// Gets or Sets Editability
        /// </summary>
        [DataMember(Name="editability", EmitDefaultValue=false)]
        public PersonalMeetingRoomAdvancedMeetingOptionsEditability Editability { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PersonalMeetingRoomAdvancedMeetingOptions {\n");
            sb.Append("  VideoBestFit: ").Append(VideoBestFit).Append("\n");
            sb.Append("  PublishMeeting: ").Append(PublishMeeting).Append("\n");
            sb.Append("  EncryptionType: ").Append(EncryptionType).Append("\n");
            sb.Append("  ModeratorLess: ").Append(ModeratorLess).Append("\n");
            sb.Append("  AllowStream: ").Append(AllowStream).Append("\n");
            sb.Append("  AutoRecord: ").Append(AutoRecord).Append("\n");
            sb.Append("  DisallowChat: ").Append(DisallowChat).Append("\n");
            sb.Append("  MuteParticipantsOnEntry: ").Append(MuteParticipantsOnEntry).Append("\n");
            sb.Append("  ShowAllAttendeesInMeetingInvite: ").Append(ShowAllAttendeesInMeetingInvite).Append("\n");
            sb.Append("  Editability: ").Append(Editability).Append("\n");
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
            return this.Equals(input as PersonalMeetingRoomAdvancedMeetingOptions);
        }

        /// <summary>
        /// Returns true if PersonalMeetingRoomAdvancedMeetingOptions instances are equal
        /// </summary>
        /// <param name="input">Instance of PersonalMeetingRoomAdvancedMeetingOptions to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PersonalMeetingRoomAdvancedMeetingOptions input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.VideoBestFit == input.VideoBestFit ||
                    (this.VideoBestFit != null &&
                    this.VideoBestFit.Equals(input.VideoBestFit))
                ) && 
                (
                    this.PublishMeeting == input.PublishMeeting ||
                    (this.PublishMeeting != null &&
                    this.PublishMeeting.Equals(input.PublishMeeting))
                ) && 
                (
                    this.EncryptionType == input.EncryptionType ||
                    (this.EncryptionType != null &&
                    this.EncryptionType.Equals(input.EncryptionType))
                ) && 
                (
                    this.ModeratorLess == input.ModeratorLess ||
                    (this.ModeratorLess != null &&
                    this.ModeratorLess.Equals(input.ModeratorLess))
                ) && 
                (
                    this.AllowStream == input.AllowStream ||
                    (this.AllowStream != null &&
                    this.AllowStream.Equals(input.AllowStream))
                ) && 
                (
                    this.AutoRecord == input.AutoRecord ||
                    (this.AutoRecord != null &&
                    this.AutoRecord.Equals(input.AutoRecord))
                ) && 
                (
                    this.DisallowChat == input.DisallowChat ||
                    (this.DisallowChat != null &&
                    this.DisallowChat.Equals(input.DisallowChat))
                ) && 
                (
                    this.MuteParticipantsOnEntry == input.MuteParticipantsOnEntry ||
                    (this.MuteParticipantsOnEntry != null &&
                    this.MuteParticipantsOnEntry.Equals(input.MuteParticipantsOnEntry))
                ) && 
                (
                    this.ShowAllAttendeesInMeetingInvite == input.ShowAllAttendeesInMeetingInvite ||
                    (this.ShowAllAttendeesInMeetingInvite != null &&
                    this.ShowAllAttendeesInMeetingInvite.Equals(input.ShowAllAttendeesInMeetingInvite))
                ) && 
                (
                    this.Editability == input.Editability ||
                    (this.Editability != null &&
                    this.Editability.Equals(input.Editability))
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
                if (this.VideoBestFit != null)
                    hashCode = hashCode * 59 + this.VideoBestFit.GetHashCode();
                if (this.PublishMeeting != null)
                    hashCode = hashCode * 59 + this.PublishMeeting.GetHashCode();
                if (this.EncryptionType != null)
                    hashCode = hashCode * 59 + this.EncryptionType.GetHashCode();
                if (this.ModeratorLess != null)
                    hashCode = hashCode * 59 + this.ModeratorLess.GetHashCode();
                if (this.AllowStream != null)
                    hashCode = hashCode * 59 + this.AllowStream.GetHashCode();
                if (this.AutoRecord != null)
                    hashCode = hashCode * 59 + this.AutoRecord.GetHashCode();
                if (this.DisallowChat != null)
                    hashCode = hashCode * 59 + this.DisallowChat.GetHashCode();
                if (this.MuteParticipantsOnEntry != null)
                    hashCode = hashCode * 59 + this.MuteParticipantsOnEntry.GetHashCode();
                if (this.ShowAllAttendeesInMeetingInvite != null)
                    hashCode = hashCode * 59 + this.ShowAllAttendeesInMeetingInvite.GetHashCode();
                if (this.Editability != null)
                    hashCode = hashCode * 59 + this.Editability.GetHashCode();
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
