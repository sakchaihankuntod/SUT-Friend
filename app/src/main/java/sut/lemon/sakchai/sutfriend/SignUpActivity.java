package sut.lemon.sakchai.sutfriend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    //Explicit ประกาศตัวแปร
    private EditText
            nameEditText,
            addressEditText,
            phoneEditText,
            userEditText,
            passwordEditText;
    private String nameString,ardressString,phoneString,userString,
            passwordString,genderString,imageString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //ฝูกความสัมพันธ์ตัวแปลกับ winget
        nameEditText = (EditText) findViewById(R.id.editText);
        addressEditText = (EditText) findViewById(R.id.editText2);
        phoneEditText = (EditText) findViewById(R.id.editText3);
        userEditText = (EditText) findViewById(R.id.editText4);
        passwordEditText = (EditText) findViewById(R.id.editText5);

    }//Main Method

    public void clickSignUpSign(View view) {

        //GET VALUE From Edit Text
        nameString = nameEditText.getText().toString().trim();
        ardressString = addressEditText.getText().toString().trim();
        phoneString = phoneEditText.getText().toString().trim();
        userString = userEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();

    }//clicksignUp


}//Main Class
