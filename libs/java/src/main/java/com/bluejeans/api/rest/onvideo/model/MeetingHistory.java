/*
 * BlueJeans onVideo REST API
 * _Video That Works Where You Do._  This site provides developers access to API's from BlueJean's onVideo meeting service.  From here you will be able to make actual API calls to manage User Accounts, Meetings, and Recordings.  Also, you can pull analytical data as well retrieve current state information.  With these API's  you should be able to quickly integrate **BlueJeans** video into your applications.     # Authentication All API transactions (excluding Authentication) require an access token per **OAuth standards**.  BlueJeans provides multiple methods for obtaining an access token.  Additionally there are diffferent scopes of token access. ## Grant Types Bluejeans provides 4 different methods for users to Authenticate.  Successful authentication allows BlueJeans to grant an access token to perform operations. * Password Credentials Grant – Authenticate with a username and password and receive an access token with user level permission. Known as two-legged OAuth. * Meeting Credentials Grant – Authenticate with a meeting ID and meeting passcode and receive an access token with meeting level permission. Known as two-legged OAuth. * Client Credentials Grant –  Authenticate with a client ID and client secret and receive an access token with enterprise level permission. Known as two-legged OAuth. * Authorization Code Grant – After creating a developer application, users witll authenticate via a BlueJeans page, and receive an authorization code. Submit authorization with other tokens and receive an access token. Known as three-legged OAuth. ## Access & Permissions BlueJeans defines 3 levels of API access into the system.  When an access token is granted, it carries one of these 3 levels.  The scope of system functionality depends upon the token's access level. * Meeting-level – Scope of APIs is limited to individual meetings. * User-level – Scope depends on the requested permissions. * App-level – provisioned either by BlueJeans personnel, or the BlueJeans Enterprise Admin, an app, is issued a client key and secret key. These tokens then are used by the BlueJeans Authentication API to receive the token. The token's scope provides access to the entire enterprise and all of its users. All endpoints in this document that require **Enterprise Admin** access will be marked as such. # Getting Started Before you start using the API's on this site, you must first have a BlueJeans account.  With your BlueJean credentials, use one of the Authentication methods to obtain an access token. - Click on the Authorize button at the top of page - Enter your access token in the field marked \"api_key\" Now the web site will automatically include your access token on all API calls you make. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: brandon@bluejeans.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.bluejeans.api.rest.onvideo.model;

import java.util.Objects;
import com.bluejeans.api.rest.onvideo.model.MeetingHistoryLeaderInfo;
import com.bluejeans.api.rest.onvideo.model.MeetingHistoryParticipantList;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * MeetingHistory
 */

public class MeetingHistory {
  @SerializedName("meetingGuid")
  private String meetingGuid = null;

  @SerializedName("meetingNumericId")
  private String meetingNumericId = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("leaderInfo")
  private MeetingHistoryLeaderInfo leaderInfo = null;

  @SerializedName("userId")
  private Integer userId = null;

  @SerializedName("meetingDuration")
  private Integer meetingDuration = null;

  @SerializedName("maxParticipantCount")
  private Integer maxParticipantCount = null;

  @SerializedName("totalParticipantMinutes")
  private Integer totalParticipantMinutes = null;

  @SerializedName("maxParticipantMinutes")
  private Integer maxParticipantMinutes = null;

  @SerializedName("extraParticipantMinutes")
  private Integer extraParticipantMinutes = null;

  @SerializedName("isdnEndpoints")
  private Integer isdnEndpoints = null;

  @SerializedName("totalDialoutMinutes")
  private Integer totalDialoutMinutes = null;

  @SerializedName("totalTollFreeMinutes")
  private Integer totalTollFreeMinutes = null;

  @SerializedName("callDIDMinutes")
  private Integer callDIDMinutes = null;

  @SerializedName("startTime")
  private Integer startTime = null;

  @SerializedName("endTime")
  private Integer endTime = null;

  /**
   * Gets or Sets meetingStatus
   */
  public enum MeetingStatusEnum {
    @SerializedName("Complete")
    COMPLETE("Complete");

    private String value;

    MeetingStatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("meetingStatus")
  private MeetingStatusEnum meetingStatus = null;

  @SerializedName("meetingThumbnail")
  private String meetingThumbnail = null;

  @SerializedName("startTimeZone")
  private String startTimeZone = null;

  /**
   * Gets or Sets processingStatus
   */
  public enum ProcessingStatusEnum {
    @SerializedName("PROCESSED")
    PROCESSED("PROCESSED");

    private String value;

    ProcessingStatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("processingStatus")
  private ProcessingStatusEnum processingStatus = null;

  @SerializedName("concurrentCalls")
  private String concurrentCalls = null;

  @SerializedName("uploadStatus")
  private String uploadStatus = null;

  @SerializedName("pstnonly")
  private Boolean pstnonly = null;

  @SerializedName("participantList")
  private List<MeetingHistoryParticipantList> participantList = new ArrayList<MeetingHistoryParticipantList>();

  public MeetingHistory meetingGuid(String meetingGuid) {
    this.meetingGuid = meetingGuid;
    return this;
  }

   /**
   * Get meetingGuid
   * @return meetingGuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMeetingGuid() {
    return meetingGuid;
  }

  public void setMeetingGuid(String meetingGuid) {
    this.meetingGuid = meetingGuid;
  }

  public MeetingHistory meetingNumericId(String meetingNumericId) {
    this.meetingNumericId = meetingNumericId;
    return this;
  }

   /**
   * Get meetingNumericId
   * @return meetingNumericId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMeetingNumericId() {
    return meetingNumericId;
  }

  public void setMeetingNumericId(String meetingNumericId) {
    this.meetingNumericId = meetingNumericId;
  }

  public MeetingHistory title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public MeetingHistory description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MeetingHistory leaderInfo(MeetingHistoryLeaderInfo leaderInfo) {
    this.leaderInfo = leaderInfo;
    return this;
  }

   /**
   * Get leaderInfo
   * @return leaderInfo
  **/
  @ApiModelProperty(example = "null", value = "")
  public MeetingHistoryLeaderInfo getLeaderInfo() {
    return leaderInfo;
  }

  public void setLeaderInfo(MeetingHistoryLeaderInfo leaderInfo) {
    this.leaderInfo = leaderInfo;
  }

  public MeetingHistory userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public MeetingHistory meetingDuration(Integer meetingDuration) {
    this.meetingDuration = meetingDuration;
    return this;
  }

   /**
   * Get meetingDuration
   * @return meetingDuration
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMeetingDuration() {
    return meetingDuration;
  }

  public void setMeetingDuration(Integer meetingDuration) {
    this.meetingDuration = meetingDuration;
  }

  public MeetingHistory maxParticipantCount(Integer maxParticipantCount) {
    this.maxParticipantCount = maxParticipantCount;
    return this;
  }

   /**
   * Get maxParticipantCount
   * @return maxParticipantCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMaxParticipantCount() {
    return maxParticipantCount;
  }

  public void setMaxParticipantCount(Integer maxParticipantCount) {
    this.maxParticipantCount = maxParticipantCount;
  }

  public MeetingHistory totalParticipantMinutes(Integer totalParticipantMinutes) {
    this.totalParticipantMinutes = totalParticipantMinutes;
    return this;
  }

   /**
   * Get totalParticipantMinutes
   * @return totalParticipantMinutes
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTotalParticipantMinutes() {
    return totalParticipantMinutes;
  }

  public void setTotalParticipantMinutes(Integer totalParticipantMinutes) {
    this.totalParticipantMinutes = totalParticipantMinutes;
  }

  public MeetingHistory maxParticipantMinutes(Integer maxParticipantMinutes) {
    this.maxParticipantMinutes = maxParticipantMinutes;
    return this;
  }

   /**
   * Get maxParticipantMinutes
   * @return maxParticipantMinutes
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMaxParticipantMinutes() {
    return maxParticipantMinutes;
  }

  public void setMaxParticipantMinutes(Integer maxParticipantMinutes) {
    this.maxParticipantMinutes = maxParticipantMinutes;
  }

  public MeetingHistory extraParticipantMinutes(Integer extraParticipantMinutes) {
    this.extraParticipantMinutes = extraParticipantMinutes;
    return this;
  }

   /**
   * Get extraParticipantMinutes
   * @return extraParticipantMinutes
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getExtraParticipantMinutes() {
    return extraParticipantMinutes;
  }

  public void setExtraParticipantMinutes(Integer extraParticipantMinutes) {
    this.extraParticipantMinutes = extraParticipantMinutes;
  }

  public MeetingHistory isdnEndpoints(Integer isdnEndpoints) {
    this.isdnEndpoints = isdnEndpoints;
    return this;
  }

   /**
   * Get isdnEndpoints
   * @return isdnEndpoints
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getIsdnEndpoints() {
    return isdnEndpoints;
  }

  public void setIsdnEndpoints(Integer isdnEndpoints) {
    this.isdnEndpoints = isdnEndpoints;
  }

  public MeetingHistory totalDialoutMinutes(Integer totalDialoutMinutes) {
    this.totalDialoutMinutes = totalDialoutMinutes;
    return this;
  }

   /**
   * Get totalDialoutMinutes
   * @return totalDialoutMinutes
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTotalDialoutMinutes() {
    return totalDialoutMinutes;
  }

  public void setTotalDialoutMinutes(Integer totalDialoutMinutes) {
    this.totalDialoutMinutes = totalDialoutMinutes;
  }

  public MeetingHistory totalTollFreeMinutes(Integer totalTollFreeMinutes) {
    this.totalTollFreeMinutes = totalTollFreeMinutes;
    return this;
  }

   /**
   * Get totalTollFreeMinutes
   * @return totalTollFreeMinutes
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTotalTollFreeMinutes() {
    return totalTollFreeMinutes;
  }

  public void setTotalTollFreeMinutes(Integer totalTollFreeMinutes) {
    this.totalTollFreeMinutes = totalTollFreeMinutes;
  }

  public MeetingHistory callDIDMinutes(Integer callDIDMinutes) {
    this.callDIDMinutes = callDIDMinutes;
    return this;
  }

   /**
   * Get callDIDMinutes
   * @return callDIDMinutes
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getCallDIDMinutes() {
    return callDIDMinutes;
  }

  public void setCallDIDMinutes(Integer callDIDMinutes) {
    this.callDIDMinutes = callDIDMinutes;
  }

  public MeetingHistory startTime(Integer startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getStartTime() {
    return startTime;
  }

  public void setStartTime(Integer startTime) {
    this.startTime = startTime;
  }

  public MeetingHistory endTime(Integer endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getEndTime() {
    return endTime;
  }

  public void setEndTime(Integer endTime) {
    this.endTime = endTime;
  }

  public MeetingHistory meetingStatus(MeetingStatusEnum meetingStatus) {
    this.meetingStatus = meetingStatus;
    return this;
  }

   /**
   * Get meetingStatus
   * @return meetingStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public MeetingStatusEnum getMeetingStatus() {
    return meetingStatus;
  }

  public void setMeetingStatus(MeetingStatusEnum meetingStatus) {
    this.meetingStatus = meetingStatus;
  }

  public MeetingHistory meetingThumbnail(String meetingThumbnail) {
    this.meetingThumbnail = meetingThumbnail;
    return this;
  }

   /**
   * Get meetingThumbnail
   * @return meetingThumbnail
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMeetingThumbnail() {
    return meetingThumbnail;
  }

  public void setMeetingThumbnail(String meetingThumbnail) {
    this.meetingThumbnail = meetingThumbnail;
  }

  public MeetingHistory startTimeZone(String startTimeZone) {
    this.startTimeZone = startTimeZone;
    return this;
  }

   /**
   * Get startTimeZone
   * @return startTimeZone
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStartTimeZone() {
    return startTimeZone;
  }

  public void setStartTimeZone(String startTimeZone) {
    this.startTimeZone = startTimeZone;
  }

  public MeetingHistory processingStatus(ProcessingStatusEnum processingStatus) {
    this.processingStatus = processingStatus;
    return this;
  }

   /**
   * Get processingStatus
   * @return processingStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public ProcessingStatusEnum getProcessingStatus() {
    return processingStatus;
  }

  public void setProcessingStatus(ProcessingStatusEnum processingStatus) {
    this.processingStatus = processingStatus;
  }

  public MeetingHistory concurrentCalls(String concurrentCalls) {
    this.concurrentCalls = concurrentCalls;
    return this;
  }

   /**
   * Get concurrentCalls
   * @return concurrentCalls
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getConcurrentCalls() {
    return concurrentCalls;
  }

  public void setConcurrentCalls(String concurrentCalls) {
    this.concurrentCalls = concurrentCalls;
  }

  public MeetingHistory uploadStatus(String uploadStatus) {
    this.uploadStatus = uploadStatus;
    return this;
  }

   /**
   * Get uploadStatus
   * @return uploadStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUploadStatus() {
    return uploadStatus;
  }

  public void setUploadStatus(String uploadStatus) {
    this.uploadStatus = uploadStatus;
  }

  public MeetingHistory pstnonly(Boolean pstnonly) {
    this.pstnonly = pstnonly;
    return this;
  }

   /**
   * Get pstnonly
   * @return pstnonly
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getPstnonly() {
    return pstnonly;
  }

  public void setPstnonly(Boolean pstnonly) {
    this.pstnonly = pstnonly;
  }

  public MeetingHistory participantList(List<MeetingHistoryParticipantList> participantList) {
    this.participantList = participantList;
    return this;
  }

  public MeetingHistory addParticipantListItem(MeetingHistoryParticipantList participantListItem) {
    this.participantList.add(participantListItem);
    return this;
  }

   /**
   * Get participantList
   * @return participantList
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<MeetingHistoryParticipantList> getParticipantList() {
    return participantList;
  }

  public void setParticipantList(List<MeetingHistoryParticipantList> participantList) {
    this.participantList = participantList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeetingHistory meetingHistory = (MeetingHistory) o;
    return Objects.equals(this.meetingGuid, meetingHistory.meetingGuid) &&
        Objects.equals(this.meetingNumericId, meetingHistory.meetingNumericId) &&
        Objects.equals(this.title, meetingHistory.title) &&
        Objects.equals(this.description, meetingHistory.description) &&
        Objects.equals(this.leaderInfo, meetingHistory.leaderInfo) &&
        Objects.equals(this.userId, meetingHistory.userId) &&
        Objects.equals(this.meetingDuration, meetingHistory.meetingDuration) &&
        Objects.equals(this.maxParticipantCount, meetingHistory.maxParticipantCount) &&
        Objects.equals(this.totalParticipantMinutes, meetingHistory.totalParticipantMinutes) &&
        Objects.equals(this.maxParticipantMinutes, meetingHistory.maxParticipantMinutes) &&
        Objects.equals(this.extraParticipantMinutes, meetingHistory.extraParticipantMinutes) &&
        Objects.equals(this.isdnEndpoints, meetingHistory.isdnEndpoints) &&
        Objects.equals(this.totalDialoutMinutes, meetingHistory.totalDialoutMinutes) &&
        Objects.equals(this.totalTollFreeMinutes, meetingHistory.totalTollFreeMinutes) &&
        Objects.equals(this.callDIDMinutes, meetingHistory.callDIDMinutes) &&
        Objects.equals(this.startTime, meetingHistory.startTime) &&
        Objects.equals(this.endTime, meetingHistory.endTime) &&
        Objects.equals(this.meetingStatus, meetingHistory.meetingStatus) &&
        Objects.equals(this.meetingThumbnail, meetingHistory.meetingThumbnail) &&
        Objects.equals(this.startTimeZone, meetingHistory.startTimeZone) &&
        Objects.equals(this.processingStatus, meetingHistory.processingStatus) &&
        Objects.equals(this.concurrentCalls, meetingHistory.concurrentCalls) &&
        Objects.equals(this.uploadStatus, meetingHistory.uploadStatus) &&
        Objects.equals(this.pstnonly, meetingHistory.pstnonly) &&
        Objects.equals(this.participantList, meetingHistory.participantList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meetingGuid, meetingNumericId, title, description, leaderInfo, userId, meetingDuration, maxParticipantCount, totalParticipantMinutes, maxParticipantMinutes, extraParticipantMinutes, isdnEndpoints, totalDialoutMinutes, totalTollFreeMinutes, callDIDMinutes, startTime, endTime, meetingStatus, meetingThumbnail, startTimeZone, processingStatus, concurrentCalls, uploadStatus, pstnonly, participantList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeetingHistory {\n");
    
    sb.append("    meetingGuid: ").append(toIndentedString(meetingGuid)).append("\n");
    sb.append("    meetingNumericId: ").append(toIndentedString(meetingNumericId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    leaderInfo: ").append(toIndentedString(leaderInfo)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    meetingDuration: ").append(toIndentedString(meetingDuration)).append("\n");
    sb.append("    maxParticipantCount: ").append(toIndentedString(maxParticipantCount)).append("\n");
    sb.append("    totalParticipantMinutes: ").append(toIndentedString(totalParticipantMinutes)).append("\n");
    sb.append("    maxParticipantMinutes: ").append(toIndentedString(maxParticipantMinutes)).append("\n");
    sb.append("    extraParticipantMinutes: ").append(toIndentedString(extraParticipantMinutes)).append("\n");
    sb.append("    isdnEndpoints: ").append(toIndentedString(isdnEndpoints)).append("\n");
    sb.append("    totalDialoutMinutes: ").append(toIndentedString(totalDialoutMinutes)).append("\n");
    sb.append("    totalTollFreeMinutes: ").append(toIndentedString(totalTollFreeMinutes)).append("\n");
    sb.append("    callDIDMinutes: ").append(toIndentedString(callDIDMinutes)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    meetingStatus: ").append(toIndentedString(meetingStatus)).append("\n");
    sb.append("    meetingThumbnail: ").append(toIndentedString(meetingThumbnail)).append("\n");
    sb.append("    startTimeZone: ").append(toIndentedString(startTimeZone)).append("\n");
    sb.append("    processingStatus: ").append(toIndentedString(processingStatus)).append("\n");
    sb.append("    concurrentCalls: ").append(toIndentedString(concurrentCalls)).append("\n");
    sb.append("    uploadStatus: ").append(toIndentedString(uploadStatus)).append("\n");
    sb.append("    pstnonly: ").append(toIndentedString(pstnonly)).append("\n");
    sb.append("    participantList: ").append(toIndentedString(participantList)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

