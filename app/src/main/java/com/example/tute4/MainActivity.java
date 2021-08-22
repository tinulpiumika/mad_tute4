package com.example.tute4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static final int CAMERA_REQUEST = 1888;
    ImageView imageView;

    //Button photoButton =  this.findViewById(R.id.photoButton);

    Activity activity;


    static final int REQUEST_IMAGE_CAPTURE = 1;





    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





       /* photoButton.setOnClickListener(new View.OnClickListener() {
            @Deprecated
            public void onClick(View v) {


             Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
             activity.startActivityForResult(cameraIntent, CAMERA_REQUEST);


            }
        }); */

    }




    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        imageView = this.findViewById(R.id.imageView2);

        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            //Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) data.getExtras().get("data");
            imageView.setImageBitmap(imageBitmap);
        }
    }








    public void openCamera(View view) {

        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(intent);

        //startActivityForResult(intent, CAMERA_REQUEST);

       // imageView = this.findViewById(R.id.imageView2);


    }
}