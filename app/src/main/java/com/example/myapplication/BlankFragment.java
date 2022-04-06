package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

interface myinterface{
    void communicate(String data);
}
public class BlankFragment extends Fragment {
    myinterface var;
    EditText e1;
    Button b1;
    public void onAttach(Context context){
        super.onAttach(context);
        try {
            var = (myinterface) context;
        }
        catch (Exception e){
            Toast.makeText(getActivity(), "error occured", Toast.LENGTH_SHORT).show();
        }
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_blank, container, false);
        e1=v.findViewById(R.id.text1);
        b1=v.findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String get=e1.getText().toString();
                var.communicate(get);
            }
        });
        return v;
    }
}