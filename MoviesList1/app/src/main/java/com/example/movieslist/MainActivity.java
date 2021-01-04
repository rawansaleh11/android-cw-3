package com.example.movieslist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Movie> movielibrary = new ArrayList<>();

        Movie a= new Movie("lion king",1.5,5,"kids",1994,true, R.drawable.lion_king);
        Movie b= new Movie("lion king2",1.7,4,"kids",2019,true,R.drawable.lion_king2);
        Movie c= new Movie("Harry potter",1.8,4,"Fantasy",2005,false,R.drawable.harry_potter);
        Movie w= new Movie("Frozen",1.6,5,"Kids",2017,true,R.drawable.frozen);

        movielibrary.add(a);//1
        movielibrary.add(b);//2
        movielibrary.add(c);//3
        movielibrary.add(w);//4


        RecyclerView movielist = findViewById(R.id.rv);

        movielist.setHasFixedSize(true);
        RecyclerView.LayoutManager LM =new LinearLayoutManager(this);
        movielist.setLayoutManager(LM);

        MovieAdapter ma= new MovieAdapter(movielibrary,MainActivity.this);
        movielist.setAdapter(ma);

    }
}