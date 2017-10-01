package com.amazonaws.models.nosql;

import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBAttribute;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBHashKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBIndexHashKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBIndexRangeKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBRangeKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBTable;

import java.util.List;
import java.util.Map;
import java.util.Set;

@DynamoDBTable(tableName = "disasterhelp-mobilehub-521152414-users")

public class UsersDO {
    private String _userId;
    private String _location;
    private String _message;
    private boolean _type;
    private String _username;

    @DynamoDBHashKey(attributeName = "userId")
    @DynamoDBAttribute(attributeName = "userId")
    public String getUserId() {
        return _userId;
    }

    public void setUserId(final String _userId) {
        this._userId = _userId;
    }
    @DynamoDBAttribute(attributeName = "location")
    public String getLocation() {
        return _location;
    }

    public void setLocation(final String _location) {
        this._location = _location;
    }
    @DynamoDBAttribute(attributeName = "message")
    public String getMessage() {
        return _message;
    }

    public void setMessage(final String _message) {
        this._message = _message;
    }

    @DynamoDBAttribute(attributeName = "type")
    public boolean getType() {
        return _type;
    }

    public void setType(final boolean _type) {
        this._type = _type;
    }

    @DynamoDBAttribute(attributeName = "username")
    public String getUsername() {
        return _username;
    }

    public void setUsername(final String _username) {
        this._username = _username;
    }

}
