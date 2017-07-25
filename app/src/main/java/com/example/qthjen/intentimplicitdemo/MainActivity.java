package com.example.qthjen.intentimplicitdemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ivBrowser;
    ImageView ivMessage;
    ImageView ivCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivBrowser = (ImageView) findViewById(R.id.ivBrowser);
        ivMessage = (ImageView) findViewById(R.id.ivMessage);
        ivCall    = (ImageView) findViewById(R.id.ivCall);

        ivBrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://tinhte.vn")); // web cần truy cập
                startActivity(intent);

            }
        });

        ivMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SENDTO);
                intent.putExtra("sms_body", "Hi Q.ThjeN"); // putExtra gửi nội dụng với sms_body là key mặc định ko thể thay đổi
                intent.setData(Uri.parse("sms:0968511597")); // sđt cần gửi tới
                startActivity(intent);

            }
        });

        ivCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:0968511597"));
                startActivity(intent);

            }
        });

    }
}
