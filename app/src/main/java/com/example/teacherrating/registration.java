
package com.example.teacherrating;
        import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class registration extends AppCompatActivity {

    EditText firstname;
    EditText lastname;
    EditText mobile;
    EditText password;
    EditText confirepassword;
    Button next;

    //DatabaseRerence addata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        firstname =findViewById(R.id.firstname);
        lastname =findViewById(R.id.lastname);
        mobile=findViewById(R.id.mobile);
        password =findViewById(R.id.password);
        confirepassword=findViewById(R.id.confirepassword);
        next=findViewById(R.id.next);


    }
}