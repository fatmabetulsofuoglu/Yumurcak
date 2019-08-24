package com.example.yumurcak.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.yumurcak.R;
import com.example.yumurcak.ui.fragment.NewPostFragment;

public class BottomSheetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bu kısımda internetten izleyerek yaptığım videoda başka bir .xml dosyasında dialog u açmak için buton oluşturuyor ve burda da o butona bağlıyor ama ben bizim projede nereye bağlayacağımı çözemedim
        onMenuItemSelected() buttonOpenBottomSheet=findViewById(R.id.add);
        buttonOpenBottomSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NewPostFragment bottomSheet=new NewPostFragment();
                bottomSheet.show(getSupportFragmentManager(),"BottomSheet");
            }
        });


    }
}
