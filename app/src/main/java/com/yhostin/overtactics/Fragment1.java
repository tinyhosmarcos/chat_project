package com.yhostin.overtactics;

import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
public class Fragment1 extends ListFragment {
    String[] presidents = {
            "Fabrizio Floeres",
            "Yhostin Marcos",
            "Gonzalo Coayla",
            "Gonzalo FLores",
            "Paulo Mendoza",
            "Paulo Rodriguez",
            "Adriana Gutierrez",
    };
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment1, container, false);
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, presidents));
    }

    public void onListItemClick(ListView parent, View v, int position, long id)
    {
        Intent i = new Intent("com.yhostin.overtactics.AcercaDe");
        i.putExtra("names_contacts",presidents[position]);
        startActivity(i);
    }
}