package com.example.movieslist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Bundle b=getIntent().getExtras();
        Movie m = (Movie) b.getSerializable("movie");

        ImageView img = findViewById(R.id.imageView2);
        TextView name = findViewById(R.id.name);
        TextView genre = findViewById(R.id.genre);
        TextView year = findViewById(R.id.year);
        ImageView isAnimationImg = findViewById(R.id.imageView3);


        img.setImageResource(m.getImg());
        name.setText(m.getName());
        genre.setText(m.getGenre());
        year.setText(m.getYear()+"");

        if(m.isAnimation())
            isAnimationImg.setImageResource(R.drawable.ic_baseline_check_24);
        else
            isAnimationImg.setImageResource(R.drawable.ic_baseline_close_24);


    }
}