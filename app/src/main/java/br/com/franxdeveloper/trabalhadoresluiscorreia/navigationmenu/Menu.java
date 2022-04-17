package br.com.franxdeveloper.trabalhadoresluiscorreia.navigationmenu;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.ColorUtils;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import br.com.franxdeveloper.trabalhadoresluiscorreia.R;
import br.com.franxdeveloper.trabalhadoresluiscorreia.activity.CV;
import br.com.franxdeveloper.trabalhadoresluiscorreia.activity.SearchAct;
import br.com.franxdeveloper.trabalhadoresluiscorreia.navigationmenu.fragments.ProfileList;
import br.com.franxdeveloper.trabalhadoresluiscorreia.navigationmenu.fragments.Search;
import br.com.franxdeveloper.trabalhadoresluiscorreia.navigationmenu.fragments.UserProfile;

public class Menu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        getSupportFragmentManager().beginTransaction().replace(R.id.navigation_menu,new Search()).commit();
    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    private void selectItem(int idch , int idimg){
        CheckBox checkBox;
        ImageView imageView;
        checkBox = findViewById(R.id.checkbox_search);
        checkBox.setChecked(false);
        checkBox = findViewById(R.id.checkbox_list);
        checkBox.setChecked(false);
        checkBox = findViewById(R.id.checkbox_account);
        checkBox.setChecked(false);
        checkBox = findViewById(idch);
        checkBox.setChecked(true);

        imageView = findViewById(R.id.img_search);
        setImgTint(imageView,R.color.snow_white);
        imageView = findViewById(R.id.img_list);
        setImgTint(imageView,R.color.snow_white);
        imageView = findViewById(R.id.img_account);
        setImgTint(imageView,R.color.snow_white);

        imageView = findViewById(idimg);
        setImgTint(imageView,R.color.color_primary);

    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    private void setImgTint(ImageView imageView , int colorId){
        imageView.setColorFilter(getColor(colorId));
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void onClickCheckbox(View view) {
        Fragment fragment = null;
        switch (view.getId()){
            case R.id.checkbox_search:
                selectItem( R.id.checkbox_search,R.id.img_search);
                fragment = new Search();
                break;
            case R.id.checkbox_list:
                selectItem( R.id.checkbox_list,R.id.img_list);
                fragment = new ProfileList();
                break;
            case R.id.checkbox_account:
                selectItem( R.id.checkbox_account,R.id.img_account);
                fragment = new UserProfile();
                break;
        }
        getSupportFragmentManager().beginTransaction().replace(R.id.navigation_menu,fragment).commit();
    }
    public void onCV(View v){
        startActivity(new Intent(this, CV.class));
    }
    public void onSearch(View v){
        startActivity(new Intent(this, SearchAct.class));
    }
}