package com.example.mydestiny;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class StartPage extends AppCompatActivity {

    ImageView redbtn;
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        redbtn = findViewById(R.id.iv_redbtn);
        redbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //0 -> Yes , 1 -> No
                Random rand = new Random();
                System.out.println(rand.nextInt(1)); // 0~1
                result = rand.nextInt(2);


                if(result == 0){
                    System.out.println("Yes");
                    Intent intent = new Intent(getApplicationContext(), Yes.class);
                startActivity(intent);

                }else if (result == 1){
                    System.out.println("No");
                    Intent intent = new Intent(getApplicationContext(), No.class);
                startActivity(intent);
            }

        }
    });
}
}











