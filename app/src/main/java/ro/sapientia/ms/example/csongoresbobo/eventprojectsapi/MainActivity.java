package ro.sapientia.ms.example.csongoresbobo.eventprojectsapi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtain the FirebaseAnalytics instance.
        //mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        //DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();
        //DatabaseReference userCloudEndPoint = mDatabase.child("users");

       // User user = new User("123", "a@b.c");

        //userCloudEndPoint.setValue(user);

        Intent intent = new Intent(MainActivity.this,LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
