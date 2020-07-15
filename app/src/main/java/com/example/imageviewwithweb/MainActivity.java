package com.example.imageviewwithweb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView ivImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivImage = findViewById(R.id.ivImage);
        String url = "https://cdn.pixabay.com/photo/2017/01/11/11/33/cake-1971552_1280.jpg";
        Picasso.get().load(url)
                .resize(200, 100)
                .centerCrop()
                .into(ivImage);

    }
}