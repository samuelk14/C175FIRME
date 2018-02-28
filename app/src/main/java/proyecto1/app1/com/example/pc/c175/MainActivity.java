package proyecto1.app1.com.example.pc.c175;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.R;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button boton1, boton2, boton3, boton4, boton5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton1 =(Button) findViewById(R.id.boton1);
        boton2 =(Button) findViewById(R.id.button2);
        boton3 =(Button) findViewById(R.id.button3);
        boton4 =(Button) findViewById(R.id.button4);
        boton5 =(Button) findViewById(R.id.button5);
        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
        boton3.setOnClickListener(this);
        boton4.setOnClickListener(this);
        boton5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        try{
            switch (view.getId()){
                case R.id.button:
                    Intent i = new Intent(this,Main2Activity.class);
                    startActivity(i);
            }
           }
    }
}
