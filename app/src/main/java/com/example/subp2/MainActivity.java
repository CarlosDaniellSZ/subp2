package com.example.subp2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {


    EditText edit_nome;
    EditText edit_idade;
    EditText edit_cpf;
    EditText edit_datanascimento;
    ListView ListV_dados;

    private List<CadPessoal> listpessoal = new ArrayList<CadPessoal>();
    private ArrayAdapter<CadPessoal> arrayadapterpessoal;

    FirebaseDatabase firebasedatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_nome = (EditText) findViewById(R.id.edit_nome);
        edit_idade = (EditText) findViewById(R.id.edit_idade);
        edit_cpf = (EditText) findViewById(R.id.edit_cpf);
        edit_datanascimento = (EditText) findViewById(R.id.edit_datanascimento);
        ListV_dados = (ListView)findViewById(R.id.list_V);

    }

    private void iniciarFirebase() {
        FirebaseApp.initializeApp(MainActivity. this);
        firebasedatabase = FirebaseDatabase.getInstance();
        firebasedatabase.setPersistenceEnabled(true);
        databaseReference = firebasedatabase.getReference();
    }


    public void botaoClick(View view){

        CadPessoal p = new CadPessoal();
        p.setId(UUID.randomUUID().toString());
        p.setNome(edit_nome.getText().toString());

        String value= edit_idade.getText().toString();
        int finalValue=Integer.parseInt(value);
        p.setIdade(finalValue);

        String value2= edit_cpf.getText().toString();
        int finalValue2=Integer.parseInt(value2);
        p.setIdade(finalValue2);

        String value3= edit_datanascimento.getText().toString();
        int finalValue3=Integer.parseInt(value3);
        p.setIdade(finalValue3);

        databaseReference.child("FirebaseSub").child(p.getId()).setValue(p);

        limparcampos();
        Toast.makeText(MainActivity.this, "DADOS GRAVADOS", Toast.LENGTH_LONG).show();
    }

    private void limparcampos() {
        edit_idade.setText("");
        edit_nome.setText("");
        edit_cpf.setText("");
        edit_datanascimento.setText("");
    }
}