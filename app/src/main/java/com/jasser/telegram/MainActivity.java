package com.jasser.telegram;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText messageInput = findViewById(R.id.messageInput);
        Button sendButton = findViewById(R.id.sendButton);

        if (sendButton != null) {
            sendButton.setOnClickListener(v -> {
                String msg = messageInput.getText().toString();
                if (!msg.isEmpty()) {
                    Toast.makeText(this, "جاري الإرسال: " + msg, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "الرجاء كتابة رسالة", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
