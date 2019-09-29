package com.example.yumurcak.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.yumurcak.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class RegisterActivity extends AppCompatActivity {

        private static final String TAG = "RegisterActivity";
        private RadioGroup radioGroup;
        private RadioButton radioButton;
        EditText name_et;
        EditText surname_et;
        ImageButton profile_icon;
        EditText email_et;
        EditText password_et;
        EditText confirmPassword_et;
        Button register_btn;
        String name;
        String surname;
        String email;
        String password;
        String confirmPassword;
        FirebaseAuth mAuth;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_register);

            name_et = findViewById(R.id.name_et);
            surname_et = findViewById(R.id.surname_et);
            profile_icon = findViewById(R.id.profile_icon);
            email_et = findViewById(R.id.user_email_register_et);
            password_et = findViewById(R.id.user_password_register_et);
            confirmPassword_et = findViewById(R.id.user_confirm_email_register_tv);
            radioGroup = (RadioGroup) findViewById(R.id.radioMotherFather);
            register_btn = findViewById(R.id.button_register);

            mAuth = FirebaseAuth.getInstance();

            register_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getUserInfoAndRegister();
                }
            });
        }
        private void getUserInfoAndRegister(){
            name = name_et.getText().toString().trim();
            surname = surname_et.getText().toString().trim();
            email = email_et.getText().toString().trim();
            password = password_et.getText().toString().trim();
            confirmPassword = confirmPassword_et.getText().toString().trim();
            if(!name.isEmpty() && !surname.isEmpty() && !email.isEmpty() && !password.isEmpty() && !confirmPassword.isEmpty()){
                if(password.equals(confirmPassword)){
                    register();
                }
            } else{
                Toast.makeText(this,"Edittextleri kontrol edin",Toast.LENGTH_LONG);
            }
        }

        private void register(){
            mAuth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                Log.d(TAG, "createUserWithEmail:success");
                                FirebaseUser user = mAuth.getCurrentUser();
                                Intent intent=new Intent(RegisterActivity.this,LoginActivity.class);
                                startActivity(intent);
                            } else {
                                Log.w(TAG, "createUserWithEmail:failure", task.getException());
                                Toast.makeText(RegisterActivity.this, "Authentication failed.",
                                        Toast.LENGTH_SHORT).show();

                            }
                            //int selectedId = radioGroup.getCheckedRadioButtonId();
                            //radioButton = (RadioButton) findViewById(selectedId);
                        }
                    });
        }


    }
