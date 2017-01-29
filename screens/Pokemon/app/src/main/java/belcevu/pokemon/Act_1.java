package belcevu.pokemon;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Act_1 extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_1);
        Button but1 = (Button)findViewById(R.id.but1);
        Button but2 = (Button)findViewById(R.id.but2);
        Button but3 = (Button)findViewById(R.id.but3);
        Button but4 = (Button)findViewById(R.id.but4);
        Button but5 = (Button)findViewById(R.id.but5);
        Button but6 = (Button)findViewById(R.id.but6);
        Button but7 = (Button)findViewById(R.id.but7);
        Button but8 = (Button)findViewById(R.id.but8);
        Button but9 = (Button)findViewById(R.id.but9);
        Button but10 = (Button)findViewById(R.id.but10);
        Button but11 = (Button)findViewById(R.id.but11);
        Button but12 = (Button)findViewById(R.id.but12);
    }
    public void but1(View view){
        MediaPlayer mp=MediaPlayer.create(this,R.raw.bulbasaur);
        mp.start();
    }
    public void but2(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.ivysaur);
        mp.start();
    }

    public void but3(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.venusaur);
        mp.start();
    }

    public void but4(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.charmander);
        mp.start();
    }

    public void but5(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.charmeleon);
        mp.start();
    }

    public void but6(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.charizard);
        mp.start();
    }

    public void but7(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.squirtle);
        mp.start();
    }

    public void but8(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.wartortle);
        mp.start();
    }

    public void but9(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.blastoise);
        mp.start();
    }

    public void but10(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.bellsprout);
        mp.start();
    }

    public void but11(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.weepinbell);
        mp.start();
    }

    public void but12(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.victreebel);
        mp.start();}
}
