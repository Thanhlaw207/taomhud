package com.example.tiembanhbao;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnBanhBao, btnDonHang, btnThongKe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBanhBao = findViewById(R.id.btnBanhBao);
        btnDonHang = findViewById(R.id.btnDonHang);
        btnThongKe = findViewById(R.id.btnThongKe);

        btnBanhBao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BanhBaoActivity.class));
            }
        });

        // Tạm thời các nút khác để trống, thêm sau
    }
}
