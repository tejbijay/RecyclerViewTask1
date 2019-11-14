package com.example.usapresident;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class UserViewDetails extends AppCompatActivity {
    private TextView tvtitle, tvdescription;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        tvtitle = (TextView) findViewById(R.id.TitleText);
        tvdescription = (TextView) findViewById(R.id.DescText);
        img =(ImageView) findViewById(R.id.ThumbnailUser);




        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Thumbnail");




        tvtitle.setText(Title);
        tvdescription.setText(Description);
        img.setImageResource(image);
    }
}
