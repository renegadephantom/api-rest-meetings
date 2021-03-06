/*
 * BlueJeans Meetings REST API
 *  ## Video That Works Where You Do. <p>This site provides developers access to APIs from BlueJean's Meetings meeting service.  From here you can see and try actual API calls to manage User Accounts, Meetings, and Recordings, pull Analytical Data and Current State information.</p>    <nosdk> <hr> <div> <div class=\"key\">     <a href=\"./basics.html\" target=\"_\"><img class=\"keyimg\" src=\"./img/bjnmeeting.png\"/></a> </div> <div class=\"keybox\"> Basic instructions about What is a BlueJeans Meeting, and Getting Started Using API's, are <a href=\"./basics.html\" target=\"_blank\">available here <i class=\"glyphicon glyphicon-new-window\"></i></a>. </div> </div> <hr> <alert>2/21/2019</alert> Change response of Change layout and Endpoint API's to 204<br/> 12/03/2018 Add API for setting user profile photograph.<br/> 10/17/2018 Updated API field definitions for time variables to be 64-bit .<br/> 7/23/2018 Corrected errors in API definition file.<br/> 7/10/2018 Deprecated some Command Center API's.  Exposed API's that Summarize usage.<br/> 7/06/2018 Added API for changing ownership of recordings.<br/> 6/28/2018 Restored Create Enterprise Account, added Enterprise and User Profile Tag API's.<br/> 6/01/2018 Clarified Access Token requirements for meeting endpoint API's.<br/> 5/21/2018 Corrected return model for meeting history call.<br/> </nosdk> <hr> 
 *
 * OpenAPI spec version: 1.0.4402212019
 * Contact: glenn@bluejeans.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.bluejeans.api.rest.meetings.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * AnalyticsTopUsersUsage
 */

public class AnalyticsTopUsersUsage {
  @SerializedName("lastMeetingTime")
  private Long lastMeetingTime = null;

  @SerializedName("participantMinutes")
  private BigDecimal participantMinutes = null;

  @SerializedName("last_name")
  private String lastName = null;

  @SerializedName("userName")
  private String userName = null;

  @SerializedName("userId")
  private Integer userId = null;

  @SerializedName("first_name")
  private String firstName = null;

  public AnalyticsTopUsersUsage lastMeetingTime(Long lastMeetingTime) {
    this.lastMeetingTime = lastMeetingTime;
    return this;
  }

   /**
   * Get lastMeetingTime
   * @return lastMeetingTime
  **/
  @ApiModelProperty(value = "")
  public Long getLastMeetingTime() {
    return lastMeetingTime;
  }

  public void setLastMeetingTime(Long lastMeetingTime) {
    this.lastMeetingTime = lastMeetingTime;
  }

  public AnalyticsTopUsersUsage participantMinutes(BigDecimal participantMinutes) {
    this.participantMinutes = participantMinutes;
    return this;
  }

   /**
   * Get participantMinutes
   * @return participantMinutes
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getParticipantMinutes() {
    return participantMinutes;
  }

  public void setParticipantMinutes(BigDecimal participantMinutes) {
    this.participantMinutes = participantMinutes;
  }

  public AnalyticsTopUsersUsage lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public AnalyticsTopUsersUsage userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @ApiModelProperty(value = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public AnalyticsTopUsersUsage userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public AnalyticsTopUsersUsage firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsTopUsersUsage analyticsTopUsersUsage = (AnalyticsTopUsersUsage) o;
    return Objects.equals(this.lastMeetingTime, analyticsTopUsersUsage.lastMeetingTime) &&
        Objects.equals(this.participantMinutes, analyticsTopUsersUsage.participantMinutes) &&
        Objects.equals(this.lastName, analyticsTopUsersUsage.lastName) &&
        Objects.equals(this.userName, analyticsTopUsersUsage.userName) &&
        Objects.equals(this.userId, analyticsTopUsersUsage.userId) &&
        Objects.equals(this.firstName, analyticsTopUsersUsage.firstName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastMeetingTime, participantMinutes, lastName, userName, userId, firstName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsTopUsersUsage {\n");
    
    sb.append("    lastMeetingTime: ").append(toIndentedString(lastMeetingTime)).append("\n");
    sb.append("    participantMinutes: ").append(toIndentedString(participantMinutes)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
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

