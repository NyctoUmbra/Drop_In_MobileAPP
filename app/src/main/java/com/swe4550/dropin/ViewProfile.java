package com.swe4550.dropin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class ViewProfile extends AppCompatActivity {

    //bonded the variables
    User user_info;
    String user_key;
    ImageView userPfp;
    TextView userName;
    EditText bio;
    ImageView game_one;
    ImageView game_two;
    ImageView game_three;
    ImageView game_four;
    TextView interest_one;
    TextView interest_two;
    TextView interest_three;
    TextView interest_four;
    Button star_btn_one;
    Button star_btn_two;
    Button star_btn_three;
    Button star_btn_four;
    Button star_btn_five;
    ImageView star_image_one;
    ImageView star_image_two;
    ImageView star_image_three;
    ImageView star_image_four;
    ImageView star_image_five;
    Button setupProfile;
    Button logoutBtn;
    Button pokeBtn;
    TextView pokeText;
    TextView rateText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_profile);

        //setting the variables to their UI counterparts
        userPfp = (ImageView)findViewById(R.id.user_pfp);
        userName = findViewById(R.id.user_name);
        bio = findViewById(R.id.biography);
        game_one = findViewById(R.id.game_1);
        game_two = findViewById(R.id.game_2);
        game_three = findViewById(R.id.game_3);
        game_four = findViewById(R.id.game_4);
        interest_one = findViewById(R.id.interest_1);
        interest_two = findViewById(R.id.interest_2);
        interest_three = findViewById(R.id.interest_3);
        interest_four = findViewById(R.id.interest_4);
        star_btn_one = findViewById(R.id.star_btn_1);
        star_btn_two = findViewById(R.id.star_btn_2);
        star_btn_three = findViewById(R.id.star_btn_3);
        star_btn_four = findViewById(R.id.star_btn_4);
        star_btn_five = findViewById(R.id.star_btn_5);
        star_image_one = findViewById(R.id.star_image_1);
        star_image_two = findViewById(R.id.star_image_2);
        star_image_three = findViewById(R.id.star_image_3);
        star_image_four = findViewById(R.id.star_image_4);
        star_image_five = findViewById(R.id.star_image_5);
        setupProfile = findViewById(R.id.setup_profile);
        logoutBtn = findViewById(R.id.login_btn);
        pokeBtn = findViewById(R.id.poke_btn);
        pokeText = findViewById(R.id.poke_txt);
        rateText = findViewById(R.id.rate_txt);



        //setting the profile picture to the one that they chose before.
        if (user_info.getPfp().equals("Xbox")) {
            userPfp.setImageResource(R.drawable.xbox_icon_logo);
        } else if (user_info.getPfp().equals("Computer")) {
            userPfp.setImageResource(R.drawable.personal_computer_icon_logo);
        } else if (user_info.getPfp().equals("Nintendo")) {
            userPfp.setImageResource(R.drawable.nintendo_switch_icon_logo);
        } else if (user_info.getPfp().equals("Playstation")) {
            userPfp.setImageResource(R.drawable.playstation_icon_logo);
        }


        //setting the users user name.
        userName.setText(user_info.getUserName());

        // setting the users Bio
        bio.setText(user_info.getBiography());

        //displaying the games and interests.
        ArrayList<String> given_games = new ArrayList<>();
        ArrayList<String> given_interests = new ArrayList<>();
        ArrayList<String> games = new ArrayList<>(Arrays.asList(user_info.getGame1(),user_info.getGame2(),user_info.getGame3(),user_info.getGame4()));
        ArrayList<String> interests = new ArrayList<>(Arrays.asList(user_info.getInterest1(),user_info.getInterest2(),user_info.getInterest3(),user_info.getInterest4()));
        for(int U = 0; U < interests.size(); U++) {
            if(!interests.get(U).equals(" ")){
                given_interests.add(interests.get(U));
            }
            if(!games.get(U).equals(" ")){
                given_games.add(games.get(U));
            }
        }

        switch (given_games.size()){
            case 4:
                game_four.setVisibility(View.VISIBLE);

                if (user_info.getGame4().equals("Elden Ring")) {
                game_four.setImageResource(R.drawable.elden_ring_game_image);
                }else if (user_info.getGame4().equals("Fortnite")){
                game_four.setImageResource(R.drawable.fortnite_game_image);
                }else if (user_info.getGame4().equals("Apex Legends")){
                game_four.setImageResource(R.drawable.apex_legends_game_image);
                }else if (user_info.getGame4().equals("Call of Duty Warzone")){
                game_four.setImageResource(R.drawable.callofduty_warzone_game_image);
                }else if (user_info.getGame4().equals("Rocket League")){
                game_four.setImageResource(R.drawable.rocket_league_game_image);
                }else if (user_info.getGame4().equals("Minecraft")){
                game_four.setImageResource(R.drawable.minecraft_game_image);
                }else if (user_info.getGame4().equals("Grand Theft Auto Online")){
                game_four.setImageResource(R.drawable.grand_theft_auto_game_image);
                }else if (user_info.getGame4().equals("Fallout 76")){
                game_four.setImageResource(R.drawable.fallout_76_game_image);
                }
            case 3:
                game_three.setVisibility(View.VISIBLE);

                if (user_info.getGame3().equals("Elden Ring")) {
                    game_three.setImageResource(R.drawable.elden_ring_game_image);
                }else if (user_info.getGame3().equals("Fortnite")){
                    game_three.setImageResource(R.drawable.fortnite_game_image);
                }else if (user_info.getGame3().equals("Apex Legends")){
                    game_three.setImageResource(R.drawable.apex_legends_game_image);
                }else if (user_info.getGame3().equals("Call of Duty Warzone")){
                    game_three.setImageResource(R.drawable.callofduty_warzone_game_image);
                }else if (user_info.getGame3().equals("Rocket League")){
                    game_three.setImageResource(R.drawable.rocket_league_game_image);
                }else if (user_info.getGame3().equals("Minecraft")){
                    game_three.setImageResource(R.drawable.minecraft_game_image);
                }else if (user_info.getGame3().equals("Grand Theft Auto Online")){
                    game_three.setImageResource(R.drawable.grand_theft_auto_game_image);
                }else if (user_info.getGame3().equals("Fallout 76")){
                    game_three.setImageResource(R.drawable.fallout_76_game_image);
                }
            case 2:
                game_two.setVisibility(View.VISIBLE);

                if (user_info.getGame2().equals("Elden Ring")) {
                    game_two.setImageResource(R.drawable.elden_ring_game_image);
                }else if (user_info.getGame2().equals("Fortnite")){
                    game_two.setImageResource(R.drawable.fortnite_game_image);
                }else if (user_info.getGame2().equals("Apex Legends")){
                    game_two.setImageResource(R.drawable.apex_legends_game_image);
                }else if (user_info.getGame2().equals("Call of Duty Warzone")){
                    game_two.setImageResource(R.drawable.callofduty_warzone_game_image);
                }else if (user_info.getGame2().equals("Rocket League")){
                    game_two.setImageResource(R.drawable.rocket_league_game_image);
                }else if (user_info.getGame2().equals("Minecraft")){
                    game_two.setImageResource(R.drawable.minecraft_game_image);
                }else if (user_info.getGame2().equals("Grand Theft Auto Online")){
                    game_two.setImageResource(R.drawable.grand_theft_auto_game_image);
                }else if (user_info.getGame2().equals("Fallout 76")){
                    game_two.setImageResource(R.drawable.fallout_76_game_image);
                }
            case 1:
                game_one.setVisibility(View.VISIBLE);

                if (user_info.getGame1().equals("Elden Ring")) {
                    game_one.setImageResource(R.drawable.elden_ring_game_image);
                }else if (user_info.getGame1().equals("Fortnite")){
                    game_one.setImageResource(R.drawable.fortnite_game_image);
                }else if (user_info.getGame1().equals("Apex Legends")){
                    game_one.setImageResource(R.drawable.apex_legends_game_image);
                }else if (user_info.getGame1().equals("Call of Duty Warzone")){
                    game_one.setImageResource(R.drawable.callofduty_warzone_game_image);
                }else if (user_info.getGame1().equals("Rocket League")){
                    game_one.setImageResource(R.drawable.rocket_league_game_image);
                }else if (user_info.getGame1().equals("Minecraft")){
                    game_one.setImageResource(R.drawable.minecraft_game_image);
                }else if (user_info.getGame1().equals("Grand Theft Auto Online")){
                    game_one.setImageResource(R.drawable.grand_theft_auto_game_image);
                }else if (user_info.getGame1().equals("Fallout 76")){
                    game_one.setImageResource(R.drawable.fallout_76_game_image);
                }

        }
        //switch statement for interests.
        switch (given_interests.size()){
            case 4:

            case 3:

            case 2:

            case 1:

        }



}
}