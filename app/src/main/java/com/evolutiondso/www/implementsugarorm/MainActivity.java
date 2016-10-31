package com.evolutiondso.www.implementsugarorm;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.orm.SugarContext;
import com.orm.SugarRecord;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MySugarTAG: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"OnCreate!");
    }

    public void doMagic(View view) {
        SugarRecord.deleteAll(Book.class);
        Book book = new Book("Hello", "World");
        book.save();
        Log.d(TAG,"Hello World!");
        Toast toast = Toast.makeText(getApplicationContext(), "Hello World!", Toast.LENGTH_SHORT);
        toast.show();
    }
}
