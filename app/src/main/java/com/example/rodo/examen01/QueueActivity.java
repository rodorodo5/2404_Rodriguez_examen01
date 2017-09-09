package com.example.rodo.examen01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.rodo.examen01.models.Customer;
import com.example.rodo.examen01.models.customerAdapter;

import java.util.ArrayList;

public class QueueActivity extends AppCompatActivity {
    customerAdapter oCustomerAdapter;
    ListView listViewCalculate;
    ArrayList<Customer> CustomerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queue);


        listViewCalculate = (ListView) findViewById(R.id.listViewCalculate);
        oCustomerAdapter = new customerAdapter(this);
        listViewCalculate.setAdapter(oCustomerAdapter);
        CustomerList = this.getIntent().getParcelableArrayListExtra("Parcel");
        makeQueue(CustomerList);

    }


    private void makeQueue(ArrayList<Customer> customers) {


    }

}
