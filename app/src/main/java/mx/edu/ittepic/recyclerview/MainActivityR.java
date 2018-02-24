package mx.edu.ittepic.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.util.SortedList;
import android.support.v7.util.SortedList.Callback;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivityR extends AppCompatActivity {

    ArrayList<String>listDatos;
    RecyclerView recycler;
    public int i;
    //String[] vector = getResources().getStringArray(R.array.alumnos_array);
    String[] vector = {"iris Lopez \n tics \n 14401035","adanelli garcia\n tics \n 14401036","lopez villegas \n tics \n 15401020","garcia mitre \n tics \n 14401034","carlos guerra \n tics \n 14401025","cesar tejeda \n tics \n 13401030","jose hilario \n tics \n 13401030","jorge rubio \n tics \n 14401047","jorge caseres \n sistemas \n 14401000","Richi lopez \n tics \n 13401015"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_r);

        recycler=findViewById(R.id.recyclerview);

        recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        listDatos=new ArrayList<String>();
        for(i=0;i<=9;i++){
                listDatos.add(" "+vector[i]);
            //listDatos.set(i,@array/alumnos_array);
        }

        AdapterDato adapter = new AdapterDato(listDatos);
        recycler.setAdapter(adapter);



    }


}

