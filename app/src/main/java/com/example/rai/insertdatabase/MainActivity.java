package com.example.rai.insertdatabase;

import android.content.ContentValues;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editName, editAddress, editPhone, idT;
    Button insert;
    DatabaseAdapter dbAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editName = (EditText)findViewById(R.id.name);
        editAddress = (EditText)findViewById(R.id.address);
        editPhone = (EditText)findViewById(R.id.phone);
        idT = (EditText)findViewById(R.id.ids);
        insert = (Button)findViewById(R.id.send);
        idT.setText("0");
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                saveToDatabase();
            }
        });
        dbAdapter = new DatabaseAdapter(this);

    }

    public void saveToDatabase(){
        ContentValues cv = new ContentValues();
        long id = 1;
            if (idT.getText().toString().equals("0")) {
                cv.put(DBConstant.ST_NAME, editName.getText().toString());
                cv.put(DBConstant.ST_PHONE, editPhone.getText().toString());
                cv.put(DBConstant.ST_ADDRESS, editAddress.getText().toString());
                id = dbAdapter.insertData(cv);
                showToast("Data Inserted");
            }
        if(id!=-1){
            editName.setText("");
            editAddress.setText("");
            editPhone.setText("");
            idT.setText("0");
        }
    }

    public void showToast(String s) {
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }

}
