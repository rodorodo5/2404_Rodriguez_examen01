package com.example.rodo.examen01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.rodo.examen01.models.Customer;
import com.example.rodo.examen01.models.customerAdapter;
import com.example.rodo.examen01.models.singleton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ArrayList<Customer> CustomerList = new ArrayList<Customer>();
    public static final int MI_CODIGO_RETORNO=1;

    ListView homeListView;
    customerAdapter oCustomerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button but_addc = (Button) findViewById(R.id.but_addc);
        Button but_calculate = (Button) findViewById(R.id.but_calculate);
        oCustomerAdapter = new customerAdapter(this);


        final EditText custName = (EditText) findViewById(R.id.custName);
        final EditText operationsNum = (EditText) findViewById(R.id.operationsNum);

        homeListView = (ListView) findViewById(R.id.homeListView);

        homeListView.setAdapter(oCustomerAdapter);



        but_addc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                EditText editText = (EditText) findViewById(R.id.custName);
                String CustName = editText.getText().toString();

                EditText editText2 = (EditText) findViewById(R.id.operationsNum);

                String operationsNum = editText2.getText().toString();
                //int operationsNum2 = Integer.parseInt(operationsNum);


                Customer oCustomer = new Customer(
                        CustName,
                        operationsNum

                );


                singleton.getInstance().getCustomers().add(oCustomer);
                ArrayList<Customer> CustomerList = singleton.getInstance().getCustomers();
                fillCustomerDatabase(CustomerList);




            }

        });


        but_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), QueueActivity.class);
                intent.putExtra("Parcel", CustomerList);
                startActivity(intent);
            }
        });



    }




    private void fillCustomerDatabase(ArrayList<Customer> lCustomer)
    {
        oCustomerAdapter.clear();
        for(Customer oCustomer: lCustomer)
        {
            oCustomerAdapter.add(oCustomer);
        }

        oCustomerAdapter.notifyDataSetChanged();;
    }




    public void updateListC (ArrayList<Customer> lMovies) {

        for(Customer oCustomer: lMovies)
        {
            oCustomerAdapter.add(oCustomer);
        }

        oCustomerAdapter.notifyDataSetChanged();
    }



}
