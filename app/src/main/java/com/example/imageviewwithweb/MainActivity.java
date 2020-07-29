package com.example.imageviewwithweb;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import static android.content.Intent.ACTION_VIEW;

public class MainActivity extends AppCompatActivity {

    private ImageView ivImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivImage = findViewById(R.id.ivImage);
        String url = "https://cdn.pixabay.com/photo/2017/01/11/11/33/cake-1971552_1280.jpg";
//        Picasso.with(this).load(url)
//                .resize(200, 100)
//                .centerCrop()
//                .into(ivImage);

        Glide.with(getApplicationContext())
                .load(url)
                .into(ivImage);

        if(url != null){

            ivImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(ACTION_VIEW);
                    i.setData(Uri.parse("http://www.correios.com.br/"));
                    startActivity(i);
                }
            });

        }

    }
}