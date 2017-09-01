package app.primera.android.curso.uabc.com.holamundo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

//Se declara la clase y hereda de ActionBarActivity, tambien hereda comportamiento de esuchador del OnClickListener
// para los views que lo soporten, en este caso el ejemplo se centra en Botones (Button).
public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    //Definiendo como global los objetos
    private Button miBoton,miSuma;
    private TextView miTexto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Relaciona la vista en Java con el XML Layout
        setContentView(R.layout.activity_main);
        //Obtenemos mediante el findViewById el elemento del archivo XML
        miBoton= (Button) findViewById(R.id.mi_boton);
        miTexto=(TextView) findViewById(R.id.texto_hola_mundo);
	////SOY UN CAMBIO DEL 2017 ....buuuu	
        // Agregar el escuchador del Boton
       /* miBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Cuando se presiona el boton se llama el metodo onClick
                miTexto.setText("Hola a todos!!");

            }
        });*/
        //Se asigna el OnClickListener de la clase MainActivity
        miBoton.setOnClickListener(this);

        miSuma=(Button)findViewById(R.id.sumar);

        miSuma.setOnClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Asigna el menu y los items al "action bar".
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Manja la accion del item seleccionado en el menu "action bar"
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        if(v==miBoton){

            //Cuando se presiona el boton se llama el metodo onClick
            miTexto.setText("Hola a todos!!");

            Toast notificacion=Toast.

            makeText(getApplicationContext(),"Si soy el boton \"mi_boton\" ",Toast.LENGTH_SHORT);

            notificacion.show();
        }else if(v==miSuma){

            int A=5;
            int B=10;
            int R=A+B;

            miTexto.setText("Resultado: "+R);

        }
    }
}

















