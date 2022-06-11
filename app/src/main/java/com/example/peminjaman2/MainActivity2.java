package com.example.peminjaman2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity2 extends AppCompatActivity {

    BottomNavigationView bottomnav ;
    private NavigationBarView.OnItemSelectedListener navigation = new NavigationBarView.OnItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected( MenuItem item) {
            Fragment f = null;
            switch (item.getItemId()){
                case R.id.menu_home:
                    f = new FragmentHome();
                    startActivity(new Intent(getApplicationContext(),UploadKTM.class));
                    overridePendingTransition(0,0);
                    break;
                case R.id.menu_notif:
                    f = new FragmentNotif();
                    break;

                case R.id.menu_history:
                    f = new FragmentHistory();
//                    startActivity(new Intent(getApplicationContext(), History.class));
//                      overridePendingTransition(0,0);
                    break;
                case R.id.menu_scanQR:
                    f = new FragmentScan();
                    break;

                case R.id.menu_logout:
                    f = new FragmenLogout();
                    break;

            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmen,f).commit();
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bottomnav = findViewById(R.id.bottom_nav_menu);

        bottomnav.setOnItemSelectedListener(navigation);
    }
}