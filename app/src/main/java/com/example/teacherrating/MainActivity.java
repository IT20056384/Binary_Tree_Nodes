package com.example.teacherrating;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
   //button
    Button button;
    RatingBar ratingStars;
    float myRating =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        ratingStars = findViewById(R.id.ratingBar);
        ratingStars.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {

                int rating = (int) v;
                String message = null;
                myRating =  ratingStars.getRating();

                //rating
                switch (rating){
                    case 1:
                        message ="Sorry to hear that!:(";
                        break;

                    case 2:
                        message ="You always acceot auggrstion!";
                        break;

                    case 3:
                        message ="Good enoug!";
                        break;

                    case 4:
                        message ="Great!Thank You!";
                        break;

                    case 5:
                        message ="Awasome! You are the best!";
                        break;
                }
                Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();

            }
        });
    }

//           button.setOnClickListener (new View.OnClickListener(){
//          @Override
//          public void onClick(View view){
//       Toast.makeText (context: MainActivity.this, text"Your rating is:"+myRating,Toast.LENGTH_SHORT).show();
//        }
//});
}