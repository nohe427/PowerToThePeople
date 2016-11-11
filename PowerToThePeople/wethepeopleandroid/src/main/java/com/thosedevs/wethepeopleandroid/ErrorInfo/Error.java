package com.thosedevs.wethepeopleandroid.ErrorInfo;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Error {

@SerializedName("metadata")
@Expose
private Metadata metadata;

/**
* No args constructor for use in serialization
* 
*/
public Error() {
}

/**
* 
* @param metadata
*/
public Error(Metadata metadata) {
this.metadata = metadata;
}

/**
* 
* @return
* The metadata
*/
public Metadata getMetadata() {
return metadata;
}

/**
* 
* @param metadata
* The metadata
*/
public void setMetadata(Metadata metadata) {
this.metadata = metadata;
}

}