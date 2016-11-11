package com.thosedevs.wethepeopleandroid.ErrorInfo;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ResponseInfo {

@SerializedName("status")
@Expose
private String status;
@SerializedName("developerMessage:")
@Expose
private String developerMessage;
@SerializedName("userMessage")
@Expose
private String userMessage;
@SerializedName("errorCode")
@Expose
private String errorCode;
@SerializedName("moreInfo")
@Expose
private String moreInfo;

/**
* No args constructor for use in serialization
* 
*/
public ResponseInfo() {
}

/**
* 
* @param status
* @param developerMessage
* @param userMessage
* @param errorCode
* @param moreInfo
*/
public ResponseInfo(String status, String developerMessage, String userMessage, String errorCode, String moreInfo) {
this.status = status;
this.developerMessage = developerMessage;
this.userMessage = userMessage;
this.errorCode = errorCode;
this.moreInfo = moreInfo;
}

/**
* 
* @return
* The status
*/
public String getStatus() {
return status;
}

/**
* 
* @param status
* The status
*/
public void setStatus(String status) {
this.status = status;
}

/**
* 
* @return
* The developerMessage
*/
public String getDeveloperMessage() {
return developerMessage;
}

/**
* 
* @param developerMessage
* The developerMessage:
*/
public void setDeveloperMessage(String developerMessage) {
this.developerMessage = developerMessage;
}

/**
* 
* @return
* The userMessage
*/
public String getUserMessage() {
return userMessage;
}

/**
* 
* @param userMessage
* The userMessage
*/
public void setUserMessage(String userMessage) {
this.userMessage = userMessage;
}

/**
* 
* @return
* The errorCode
*/
public String getErrorCode() {
return errorCode;
}

/**
* 
* @param errorCode
* The errorCode
*/
public void setErrorCode(String errorCode) {
this.errorCode = errorCode;
}

/**
* 
* @return
* The moreInfo
*/
public String getMoreInfo() {
return moreInfo;
}

/**
* 
* @param moreInfo
* The moreInfo
*/
public void setMoreInfo(String moreInfo) {
this.moreInfo = moreInfo;
}

}