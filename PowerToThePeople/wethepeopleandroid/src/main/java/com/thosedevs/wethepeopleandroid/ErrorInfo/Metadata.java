package com.thosedevs.wethepeopleandroid.ErrorInfo;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Metadata {

@SerializedName("responseInfo")
@Expose
private ResponseInfo responseInfo;

/**
* No args constructor for use in serialization
* 
*/
public Metadata() {
}

/**
* 
* @param responseInfo
*/
public Metadata(ResponseInfo responseInfo) {
this.responseInfo = responseInfo;
}

/**
* 
* @return
* The responseInfo
*/
public ResponseInfo getResponseInfo() {
return responseInfo;
}

/**
* 
* @param responseInfo
* The responseInfo
*/
public void setResponseInfo(ResponseInfo responseInfo) {
this.responseInfo = responseInfo;
}

}