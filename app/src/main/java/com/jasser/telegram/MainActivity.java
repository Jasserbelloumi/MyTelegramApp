package com.jasser.telegram;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText input = findViewById(R.id.messageInput);
        Button btn = findViewById(R.id.sendButton);

        btn.setOnClickListener(v -> {
            String msg = input.getText().toString();
            new Thread(() -> {
                try {
                    String urlStr = "https://api.telegram.org/bot8439446538:AAE7qOmKwdw93kK7R9n4P2T21V7z2KcF-YI/sendMessage?chat_id=5653032481&text=" + msg;
                    HttpURLConnection conn = (HttpURLConnection) new URL(urlStr).openConnection();
                    conn.setRequestMethod("GET");
                    conn.getInputStream().read();
                } catch (Exception e) {}
            }).start();
        });
    }
}
