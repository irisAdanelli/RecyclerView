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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_r);

        recycler=findViewById(R.id.recyclerview);
        recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        listDatos=new ArrayList<String>();
        for(int i=0;i<=50;i++){
            listDatos.add("Dato # "+i+" ");
        }

        AdapterDato adapter = new AdapterDato(listDatos);
        recycler.setAdapter(adapter);



    }


}
