package com.corona.coronazp20;//failo vieta diske



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
//bibliotekos

public class RegisterActivity extends AppCompatActivity { //atidaro,uzdaro:klases funkcjijas salygas , ciklus

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//atidaromas tuscias langas
        setContentView(R.layout.activity_register);//uzkrauk to lango vaizda
        //kodas rasomas nuo cia
            final EditText username=findViewById(R.id.username);
            final EditText email=findViewById(R.id.email);
            final EditText password=findViewById(R.id.password);
            Button kaipNoriuTaipVadinu=findViewById(R.id.register_btn);

            kaipNoriuTaipVadinu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                 //nuo cia rasomas kodas , kuris veiks paspaudus mygtuka
                    /*Toast.makeText(RegisterActivity.this,
                            "prisijungimo vardas: "+username.getText().toString() +"\n"+
                                    "slaptazodis:"+password.getText().toString() +"\n" ,
                            Toast.LENGTH_SHORT).show();*/
                    username.setError(null);
                    if (!Validation.isValidUsername(username.getText().toString())){//jeigu nevalidus
                        username.setError("Error! Wrong username");
                        username.requestFocus();
                    }
                    else if (!Validation.isValidPassword(password.getText().toString())){
                        password.setError("Error! Wrong password");
                        password.requestFocus();

                    }
                    else if (!Validation.isValidEmail(email.getText().toString())) {
                        email.setError("Error! Wrong email");
                        email.requestFocus();
                    }
                    else{//bus vykdomas kodas kai praeis sekmingai validacija
                        Intent goToLoginActivity = new Intent(RegisterActivity.this, LoginActivity.class);
                        startActivity(goToLoginActivity);
                    }
                }//baigiasi funkcija
            });//kad veiktu mygtukas kai paspaudi VIRSUJE
    }//funkcija
}//klase
// kodu formatavimas ctrl+alt=L