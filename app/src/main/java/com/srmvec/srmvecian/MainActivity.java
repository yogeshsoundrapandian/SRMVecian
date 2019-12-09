package com.srmvec.srmvecian;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener, AdapterView.OnItemSelectedListener {
    private Button web,courses,fb,qb,qb1;
    private Button rej,vid,tut,so,qu;
    private WebView wv;
    private WebSettings ws;
    Spinner sp,sp1;
    int value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.dept_array,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp=(Spinner)findViewById(R.id.spinner);
        sp.setAdapter(adapter);

        ArrayAdapter adapter1=ArrayAdapter.createFromResource(this,R.array.format_array,android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1=(Spinner)findViewById(R.id.spinner2);
        sp1.setAdapter(adapter1);

        web=(Button)findViewById(R.id.bad) ;
        courses=(Button)findViewById(R.id.bco);
        fb=(Button)findViewById(R.id.bfb);
        qb=(Button)findViewById(R.id.bqb);
        qb1=(Button)findViewById(R.id.bqb2);

        rej=(Button)findViewById(R.id.ibrej);
        vid=(Button)findViewById(R.id.ibvid);
        tut=(Button)findViewById(R.id.ibtut);
        so=(Button)findViewById(R.id.so);
        qu=(Button)findViewById(R.id.qu);

        wv=(WebView)findViewById(R.id.webView4);
        ws=wv.getSettings();
        ws.setJavaScriptEnabled(true);

        web.setOnClickListener(this);
        courses.setOnClickListener(this);
        fb.setOnClickListener(this);

        rej.setOnClickListener(this);
        vid.setOnClickListener(this);
        tut.setOnClickListener(this);

        sp.setOnItemSelectedListener(this);
        qb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(value==1)
                {
                    Intent i =new Intent(MainActivity.this,qcivil.class);
                    startActivity(i);
                }
                if(value==2)
                {
                    Intent i =new Intent(MainActivity.this,qcse.class);
                    startActivity(i);
                }
                if(value==3)
                {
                    Intent i =new Intent(MainActivity.this,qece.class);
                    startActivity(i);
                }
                if(value==4)
                {
                    Intent i =new Intent(MainActivity.this,qeee.class);
                    startActivity(i);
                }
                if(value==5)
                {
                    Intent i =new Intent(MainActivity.this,qeie.class);
                    startActivity(i);
                }
                if(value==6)
                {
                    Intent i =new Intent(MainActivity.this,qmech.class);
                    startActivity(i);
                }
                if(value==7)
                {
                    Intent i =new Intent(MainActivity.this,qit.class);
                    startActivity(i);
                }
                if(value==8)
                {
                    Intent i =new Intent(MainActivity.this,qmestruct.class);
                    startActivity(i);
                }
                if(value==9)
                {
                    Intent i =new Intent(MainActivity.this,qmecse.class);
                    startActivity(i);
                }
                if(value==10)
                {
                    Intent i =new Intent(MainActivity.this,qmecomm.class);
                    startActivity(i);
                }
                if(value==11)
                {
                    Intent i =new Intent(MainActivity.this,qmepower.class);
                    startActivity(i);
                }
                if(value==12)
                {
                    Intent i =new Intent(MainActivity.this,qmeci.class);
                    startActivity(i);
                }
                if(value==13)
                {
                    Intent i =new Intent(MainActivity.this,qmecad.class);
                    startActivity(i);
                }
                if(value==14)
                {
                    Intent i =new Intent(MainActivity.this,qmemba.class);
                    startActivity(i);
                }
                if(value==15)
                {
                    Intent i =new Intent(MainActivity.this,qmca.class);
                    startActivity(i);
                }
            }
        });

        sp1.setOnItemSelectedListener(this);
        qb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(value==1)
                {
                    wv.loadUrl("https://drive.google.com/open?id=0Bx2EdFy1JIK7TzlkZzJhU1hmbDA");
                }
                if(value==2)
                {
                    wv.loadUrl("https://drive.google.com/open?id=0Bx2EdFy1JIK7eEZ4MnNNRGZOQzA");
                }
                if(value==3)
                {
                    wv.loadUrl("https://drive.google.com/open?id=0Bx2EdFy1JIK7Q25TYlhzSnk3MHM");
                }
                if(value==4)
                {
                    wv.loadUrl("https://drive.google.com/open?id=0Bx2EdFy1JIK7Z1JfVy1vVnRpSVU");
                }
            }
        });
        so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,stack.class);
                startActivity(i);
            }
        });
        qu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,quora.class);
                startActivity(i);
            }
        });


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.h1) {
            // Handle the camera action
            Intent i = new Intent(MainActivity.this,aboutvec.class);
            startActivity(i);
        } else if (id == R.id.h2) {
            Intent i = new Intent(MainActivity.this,facility.class);
            startActivity(i);

        } else if (id == R.id.h3) {
            Intent i = new Intent(MainActivity.this,contactus.class);
            startActivity(i);
        } else if (id == R.id.p1) {
            Intent i = new Intent(MainActivity.this,aboutplacement.class);
            startActivity(i);
        } else if (id == R.id.p2) {
            Intent i = new Intent(MainActivity.this,p2.class);
            startActivity(i);
        }else if (id == R.id.a1) {
            Intent i = new Intent(MainActivity.this,auwebsite.class);
            startActivity(i);
        }else if (id == R.id.abt) {
            Intent i = new Intent(MainActivity.this,techboyapp.class);
            startActivity(i);
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onClick(View v) {
        if(v==web){
            Intent i = new Intent(MainActivity.this,website.class);
            startActivity(i);
        }

        if(v==courses){
            Intent i = new Intent(MainActivity.this,course.class);
            startActivity(i);
        }
        if(v==fb){
            Intent i = new Intent(MainActivity.this,fb.class);
            startActivity(i);
        }
        if(v==rej)
        {
            Intent i = new Intent(MainActivity.this,rejinpaul.class);
            startActivity(i);
        }
        if(v==vid)
        {
            Intent i = new Intent(MainActivity.this,vidyarthiplus.class);
            startActivity(i);
        }
        if(v==tut)
        {
            Intent i = new Intent(MainActivity.this,tp.class);
            startActivity(i);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        value=position;
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
