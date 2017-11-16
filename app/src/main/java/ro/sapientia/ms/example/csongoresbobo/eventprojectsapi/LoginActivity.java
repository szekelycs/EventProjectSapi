package ro.sapientia.ms.example.csongoresbobo.eventprojectsapi;

import android.content.Intent;
import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

public class LoginActivity extends AppCompatActivity {

    public static final String TAG = "LoginActivity";
    private LoginButton loginButton;
    private CallbackManager callbackManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        setContentView(R.layout.activity_login);
        loginButton = (LoginButton) findViewById(R.id.fb_login_btn);
        callbackManager = CallbackManager.Factory.create();
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {

                Toast.makeText(LoginActivity.this, "Success!",
                        Toast.LENGTH_LONG).show();
            }

            @Override
            public void onCancel() {

                Toast.makeText(LoginActivity.this, "Cancel!",
                        Toast.LENGTH_LONG).show();
            }

            @Override
            public void onError(FacebookException error) {

                Toast.makeText(LoginActivity.this, "Failed!",
                        Toast.LENGTH_LONG).show();
                Log.d(TAG,"Error: "+error.toString());
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //Log.d(TAG,"onActivityResult()");
        //if( data != null ){
        //    String name = (String)data.getExtras().get("name");
        //    Log.d(TAG,name);
        //}
        callbackManager.onActivityResult(requestCode,requestCode,data);
    }
}
