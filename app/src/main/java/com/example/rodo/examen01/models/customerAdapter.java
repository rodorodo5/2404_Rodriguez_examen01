package com.example.rodo.examen01.models;

import android.widget.ArrayAdapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.rodo.examen01.R;

/**
 * Created by rodo on 9/8/17.
 */

public class customerAdapter extends ArrayAdapter<Customer> {
    public customerAdapter(Context context)
    {
        super(context, R.layout.linearlay, R.id.customer_name);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View objectView = super.getView(position, convertView, parent);
        TextView fila = (TextView) objectView.findViewById(R.id.fila);

        TextView customer_name = (TextView) objectView.findViewById(R.id.customer_name);
        TextView number_operations = (TextView) objectView.findViewById(R.id.number_operations);

        final Customer customer = this.getItem(position);
        fila.setText((position + 1) + "  ");

        customer_name.setText(customer.getCustomers() + "  ");
        number_operations.setText(customer.getOperations() + " ");

        return objectView;
    }
}




