package com.example.personalinfonote;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddDataFragment extends Fragment {

    private EditText inputSNo,inputName,inputMobileNo,inputAge;
    private Button btnadd;

    public AddDataFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_data,container, false);
        inputSNo = view.findViewById(R.id.inputsno);
        inputName = view.findViewById(R.id.inputname);
        inputMobileNo = view.findViewById(R.id.inputmobileno);
        inputAge = view.findViewById(R.id.inputage);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sno = Integer.parseInt(inputSNo.getText().toString());
                String name = inputName.getText().toString();
                String mobileno = inputMobileNo.getText().toString();
                int age = Integer.parseInt(inputAge.getText().toString());

                Person person = new Person();

                person.setSno(sno);
                person.setName(name);
                person.setMobileNo(mobileno);
                person.setAge(age);

                MainActivity.roomDatabaseClass.personDao().addPerson(person);
                Toast.makeText(getActivity(), "Data Added Succesfully", Toast.LENGTH_SHORT).show();
                inputSNo.setText("");
                inputName.setText("");
                inputMobileNo.setText("");
                inputAge.setText("");



            }
        });


        return view;
    }
}