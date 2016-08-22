package model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

//import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by Abanoub on 7/6/2015.
 */

/**
 * Holds attachment attributes for logged in user
 * Note:There are a lot of services needed attachment to complete the survey process for attaching ,downloading and uploading to salesforce portal
 */
public class Attachment implements Serializable {

    public String ID;
    public String Body;
    public String BodyLength;
    public String Name;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getBody() {
        return Body;
    }

    public void setBody(String body) {
        Body = body;
    }

    public String getBodyLength() {
        return BodyLength;
    }

    public void setBodyLength(String bodyLength) {
        BodyLength = bodyLength;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}
