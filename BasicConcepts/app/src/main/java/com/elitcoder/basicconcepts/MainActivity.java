package com.elitcoder.basicconcepts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button, clear;
    private EditText name,email,password,about;
    private RadioGroup gender;
    private RadioButton male,female,other;
    private CheckBox java, python, cpp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button reference ese gese.. ui button signup
        this.initalizeViews();
        //color change
        //text change
        //animate
        //button.setText("Changed");

        //attach listener :
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast.makeText(MainActivity.this, "Successful", Toast.LENGTH_SHORT).show();
                 String nameV = name.getText().toString();
                 String emailV = email.getText().toString();
                 String passwordV = password.getText().toString();
                 if(nameV.trim().equals("")){
                     Toast.makeText(MainActivity.this, "Name is required!", Toast.LENGTH_SHORT).show();
                     name.setError("Name is Required!");
                     return;
                 }
                 if(passwordV.trim().equals("")){
                     Toast.makeText(MainActivity.this, "Password is required!", Toast.LENGTH_SHORT).show();
                     password.setError("Password is Required!");
                     return;
                 }
                 String genderV = "";
                 if (male.isChecked()){
                     genderV = "Male";
                 }
                 if(female.isChecked()){
                     genderV = "Female";
                 }
                 if(other.isChecked()){
                     genderV = "Other";
                 }

                 String cources = "";
                 if(java.isChecked()){
                     cources += "Java";
                 }
                 if(cpp.isChecked()){
                     cources += " C++ ";
                 }
                 if(python.isChecked()){
                     cources += "Python";
                 }

                 Log.w("Name :",nameV);
                 Log.w("Gender :", genderV);
                 Log.w("Courses :", cources);

                 Toast.makeText(MainActivity.this, "Got the Data", Toast.LENGTH_SHORT).show();

                 //Validate
                 //call api to send data...
                 //Save data to database(room)
                 //firebase save data...

             }

         });
    }
    public void initalizeViews(){
        button = findViewById(R.id.buttonSignUp);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        about = findViewById(R.id.about);
        gender = findViewById(R.id.gender);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        other = findViewById(R.id.other);
        java = findViewById(R.id.java);
        cpp = findViewById(R.id.cpp);
        python = findViewById(R.id.python);
        clear = findViewById(R.id.buttonClear);
    }
}