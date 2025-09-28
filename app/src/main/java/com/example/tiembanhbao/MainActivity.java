package com.example.tiembanhbao;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

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

        btnDonHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, OrderManagementActivity.class));
            }
        });

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.nav_home:
                    Toast.makeText(this, "Trang chủ", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.nav_notifications:
                    Toast.makeText(this, "Thông báo", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.nav_user:
                    Toast.makeText(this, "Người dùng", Toast.LENGTH_SHORT).show();
                    return true;
            }
            return false;
        });
    }
}
