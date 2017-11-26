package ro.sapientia.ms.example.csongoresbobo.eventprojectsapi;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by Csongor on 2017.10.26..
 */
@IgnoreExtraProperties
public class User {

    public String username;
    public String email;
    public String type;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String username, String email,String type) {
        this.username = username;
        this.email = email;
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}