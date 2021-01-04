package com.example.movieslist;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


        public class MovieAdapter extends RecyclerView.Adapter {
            ArrayList<Movie>mArray;
            Context context;

            public MovieAdapter(ArrayList<Movie> mArray, Context context) {
        this.mArray = mArray;
        this.context = context;
    }

            @NonNull
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list_item,parent,false);
                ViewHolder vh =new ViewHolder(view);
                return vh;
            }

            @Override
            public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
                ((ViewHolder)holder).name.setText( mArray.get(position).getName());
                ((ViewHolder) holder).rating.setText(mArray.get(position).getRating() + "");
        ((ViewHolder) holder).duration.setText(mArray.get(position).getDuration() + "");
                ((ViewHolder)holder).img.setImageResource( mArray.get(position).getImg());
                ((ViewHolder)holder).view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(context,Details.class);
                        i.putExtra("game",mArray.get(position));
                        context.startActivity(i);
                    }
                });


                final AlertDialog.Builder builder = new AlertDialog.Builder(context);
                ((ViewHolder)holder).delete.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        builder.setTitle("Delete");
                        builder.setMessage("Are you sure you want to delete" );
                        builder.setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                mArray.remove(position);
                                notifyDataSetChanged();

                            }
                        });
                        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(context, "not Deleted",Toast.LENGTH_SHORT).show();
                            }
                        });
                        AlertDialog alertDialog=builder.create();
                        alertDialog.show();
                    }
                });

            }

            @Override
            public int getItemCount() {
                return mArray.size();
            }
            public static class ViewHolder extends RecyclerView.ViewHolder {
               public ImageView img;
         public ImageView delete;
         public TextView name;
         public TextView duration;
         public TextView rating;
         public View view;

         public ViewHolder(@NonNull View itemView) {
             super(itemView);
             view = itemView;
             img = itemView.findViewById(R.id.imageView);
             name = itemView.findViewById(R.id.textView);
             duration = itemView.findViewById(R.id.textView6);
             rating =  itemView.findViewById(R.id.textView7);
             delete = itemView.findViewById(R.id.imageView4);


                }

            }
        }