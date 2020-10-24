package com.example.tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }

    @Override
    protected void onStart() {
        super.onStart();
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_personalizado_onstart,  (ViewGroup) findViewById(R.id.toast_on_start));
        TextView texto_Toast = (TextView) layout.findViewById(R.id.texto_Toast);
        texto_Toast.setText("La aplicacion se ha Iniciado");

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL, 0,0 );
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }
    @Override
    protected void onResume() {
        super.onResume();
 /*       Log.i(tag, "onResume");
        //    Toast.makeText(this, "la aplicacion se ha reactivado". Toast.LENGTH_SHORT).show();
        Context context = getApplicationContext();
        CharSequence text ="La aplicacion se ha reactivado";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context,text,duration);
        toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();*/
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_personalizado_onresume,  (ViewGroup) findViewById(R.id.toast_on_resume));
        TextView texto_Toast = (TextView) layout.findViewById(R.id.texto_Toast);
        texto_Toast.setText("La aplicacion se ha recuperado");

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL, 0,0 );
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_personalizado_onpause,  (ViewGroup) findViewById(R.id.toast_on_pause));
        TextView texto_Toast = (TextView) layout.findViewById(R.id.texto_Toast);
        texto_Toast.setText("La aplicacion se ha pausado");

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL, 0,0 );
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_personalizado_onstop,  (ViewGroup) findViewById(R.id.toast_on_stop));
        TextView texto_Toast = (TextView) layout.findViewById(R.id.texto_Toast);
        texto_Toast.setText("La aplicacion se ha Detenido");

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL, 0,0 );
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }
}
