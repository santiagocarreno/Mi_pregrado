package saeta.mi_pregrado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Universidad_de_los_Andes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_universidad_de_los__andes);

        //metodo spinner
// NO BORRARRRRRRRRRRR
        Spinner andesArte_spinner = (Spinner) findViewById(R.id.andesArte_spinner);

// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.andesArte_array)){
            @Override
            public boolean isEnabled(int position) {
                return false;
            }
        };
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        andesArte_spinner.setAdapter(adapter);
//NO BORRARRRRRRRR //
//safe position




    }
}
