package com.example.ankitkumar.inboxstylenotification;

/**
 * Created by Ankit Kumar on 6/13/2017.
 */

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.TextView;

public class Inbox_Activity extends AppCompatActivity {
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inbox_);
        txt= (TextView) findViewById(R.id.textView_inbox);
    }
}

