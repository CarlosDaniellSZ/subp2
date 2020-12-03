package com.example.subp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    EditText edit_nome;
    EditText edit_idade;
    EditText edit_cpf;
    EditText edit_datanascimento;
    ListView ListV_dados;

    private List<CadPessoal> listpessoa = new ArrayList<CadPessoal>();
    private ArrayAdapter<CadPessoal> arrayadapterpessoal;

    FirebaseDatabase firebasedatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}