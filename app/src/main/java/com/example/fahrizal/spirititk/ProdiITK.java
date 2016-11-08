package com.example.fahrizal.spirititk;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class ProdiITK extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prodi_itk);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ArrayList<Card> cards = new ArrayList<>();

        cards.add(new Card("Fisika", R.drawable.fisika));
        cards.add(new Card("Matematika", R.drawable.matematika));
        cards.add(new Card("Teknik Mesin", R.drawable.mesin));
        cards.add(new Card("Teknik Elektro", R.drawable.elektro));
        cards.add(new Card("Teknik Kimia", R.drawable.tekim));
        cards.add(new Card("Teknik Material dan Metalurgi", R.drawable.mamet));
        cards.add(new Card("Teknik Sipil", R.drawable.sipil));
        cards.add(new Card("Perencanaan Wilayah dan Kota", R.drawable.pwk));
        cards.add(new Card("Teknik Perkapalan", R.drawable.kapal));
        cards.add(new Card("Sistem Informasi", R.drawable.si));


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list_item);
        CardAdapter myAdapter = new CardAdapter(cards);

        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.prodi_itk, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_news) {
            Intent i = new Intent(ProdiITK.this, MainActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_prodi) {
            Intent i = new Intent(ProdiITK.this, ProdiITK.class);
            startActivity(i);
        } else if (id == R.id.nav_fasilitas) {
            Intent i = new Intent(ProdiITK.this, FasilitasITK.class);
            startActivity(i);
        } else if (id == R.id.nav_tentang) {
            Intent i = new Intent(ProdiITK.this, TentangITK.class);
            startActivity(i);
        } else if (id == R.id.nav_jalur){
            Intent i = new Intent(ProdiITK.this, JalurMasuk.class);
            startActivity(i);
        } else if (id == R.id.nav_contact) {

        } else if (id == R.id.nav_exit) {
            moveTaskToBack(true);
        } else if (id == R.id.nav_team) {
            Intent i = new Intent(ProdiITK.this, TeamDev.class);
            startActivity(i);
        } else if (id == R.id.nav_about) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
