package com.example.trabalhofinal;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

import static com.example.trabalhofinal.R.drawable.tranparente;

public class game extends AppCompatActivity {

    androidx.gridlayout.widget.GridLayout vv;
    int vetcolunas[] = new int[6],c;
    boolean muda = false;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_game);

        final ImageView replay = (ImageView) findViewById(R.id.replay);
        final ImageView pause = (ImageView) findViewById(R.id.pause);
        vv = (androidx.gridlayout.widget.GridLayout) findViewById(R.id.grid);
        //e lá vamos nós
        ImageView sobe1 = (ImageView) findViewById(R.id.sobe1);
        sobe1.setTag(0);
        ImageView sobe2 = (ImageView) findViewById(R.id.sobe2);
        sobe2.setTag(1);
        ImageView sobe3 = (ImageView) findViewById(R.id.sobe3);
        sobe3.setTag(2);
        ImageView sobe4 = (ImageView) findViewById(R.id.sobe4);
        sobe4.setTag(3);
        ImageView sobe5 = (ImageView) findViewById(R.id.sobe5);
        sobe5.setTag(4);
        ImageView sobe6 = (ImageView) findViewById(R.id.sobe6);
        sobe6.setTag(5);
        ImageView sobe7 = (ImageView) findViewById(R.id.sobe7);
        sobe7.setTag(6);
        ImageView sobe8 = (ImageView) findViewById(R.id.sobe8);
        sobe8.setTag(7);
        ImageView sobe9 = (ImageView) findViewById(R.id.sobe9);
        sobe9.setTag(8);
        ImageView sobe10 = (ImageView) findViewById(R.id.sobe10);
        sobe10.setTag(9);
        ImageView sobe11 = (ImageView) findViewById(R.id.sobe11);
        sobe11.setTag(10);
        ImageView sobe12 = (ImageView) findViewById(R.id.sobe12);
        sobe12.setTag(11);
        ImageView sobe13 = (ImageView) findViewById(R.id.sobe13);
        sobe13.setTag(12);
        ImageView sobe14 = (ImageView) findViewById(R.id.sobe14);
        sobe14.setTag(13);
        ImageView sobe15 = (ImageView) findViewById(R.id.sobe15);
        sobe15.setTag(14);
        ImageView sobe16 = (ImageView) findViewById(R.id.sobe16);
        sobe16.setTag(15);
        ImageView sobe17 = (ImageView) findViewById(R.id.sobe17);
        sobe17.setTag(16);
        ImageView sobe18 = (ImageView) findViewById(R.id.sobe18);
        sobe18.setTag(17);
        ImageView sobe19 = (ImageView) findViewById(R.id.sobe19);
        sobe19.setTag(18);
        ImageView sobe20 = (ImageView) findViewById(R.id.sobe20);
        sobe20.setTag(19);
        ImageView sobe21 = (ImageView) findViewById(R.id.sobe21);
        sobe21.setTag(20);
        ImageView sobe22 = (ImageView) findViewById(R.id.sobe22);
        sobe22.setTag(21);
        ImageView sobe23 = (ImageView) findViewById(R.id.sobe23);
        sobe23.setTag(22);
        ImageView sobe24 = (ImageView) findViewById(R.id.sobe24);
        sobe24.setTag(23);
        ImageView sobe25 = (ImageView) findViewById(R.id.sobe25);
        sobe25.setTag(24);
        ImageView sobe26 = (ImageView) findViewById(R.id.sobe26);
        sobe26.setTag(25);
        ImageView sobe27 = (ImageView) findViewById(R.id.sobe27);
        sobe27.setTag(26);
        ImageView sobe28 = (ImageView) findViewById(R.id.sobe28);
        sobe28.setTag(27);
        ImageView sobe29 = (ImageView) findViewById(R.id.sobe29);
        sobe29.setTag(28);
        ImageView sobe30 = (ImageView) findViewById(R.id.sobe30);
        sobe30.setTag(29);
        ImageView sobe31 = (ImageView) findViewById(R.id.sobe31);
        sobe31.setTag(30);
        ImageView sobe32 = (ImageView) findViewById(R.id.sobe32);
        sobe32.setTag(31);
        ImageView sobe33 = (ImageView) findViewById(R.id.sobe33);
        sobe33.setTag(32);
        ImageView sobe34 = (ImageView) findViewById(R.id.sobe34);
        sobe34.setTag(33);
        ImageView sobe35 = (ImageView) findViewById(R.id.sobe35);
        sobe35.setTag(34);
        ImageView sobe36 = (ImageView) findViewById(R.id.sobe36);
        sobe36.setTag(35);
        ImageView sobe37 = (ImageView) findViewById(R.id.sobe37);
        sobe37.setTag(36);
        ImageView sobe38 = (ImageView) findViewById(R.id.sobe38);
        sobe38.setTag(37);
        ImageView sobe39 = (ImageView) findViewById(R.id.sobe39);
        sobe39.setTag(38);
        ImageView sobe40 = (ImageView) findViewById(R.id.sobe40);
        sobe40.setTag(39);
        ImageView sobe41 = (ImageView) findViewById(R.id.sobe41);
        sobe41.setTag(40);
        ImageView sobe42 = (ImageView) findViewById(R.id.sobe42);
        sobe42.setTag(41);
        ImageView sobe43 = (ImageView) findViewById(R.id.sobe43);
        sobe43.setTag(42);
        ImageView sobe44 = (ImageView) findViewById(R.id.sobe44);
        sobe44.setTag(43);
        ImageView sobe45 = (ImageView) findViewById(R.id.sobe45);
        sobe45.setTag(44);
        ImageView sobe46 = (ImageView) findViewById(R.id.sobe46);
        sobe46.setTag(45);
        ImageView sobe47 = (ImageView) findViewById(R.id.sobe47);
        sobe47.setTag(46);
        ImageView sobe48 = (ImageView) findViewById(R.id.sobe48);
        sobe48.setTag(47);
        ImageView sobe49 = (ImageView) findViewById(R.id.sobe49);
        sobe49.setTag(48);
        ImageView sobe50 = (ImageView) findViewById(R.id.sobe50);
        sobe50.setTag(49);
        ImageView sobe51 = (ImageView) findViewById(R.id.sobe51);
        sobe51.setTag(50);
        ImageView sobe52 = (ImageView) findViewById(R.id.sobe52);
        sobe52.setTag(51);
        ImageView sobe53 = (ImageView) findViewById(R.id.sobe53);
        sobe53.setTag(52);
        ImageView sobe54 = (ImageView) findViewById(R.id.sobe54);
        sobe54.setTag(53);
        ImageView sobe55 = (ImageView) findViewById(R.id.sobe55);
        sobe55.setTag(54);
        ImageView sobe56 = (ImageView) findViewById(R.id.sobe56);
        sobe56.setTag(55);
        ImageView sobe57 = (ImageView) findViewById(R.id.sobe57);
        sobe57.setTag(56);
        ImageView sobe58 = (ImageView) findViewById(R.id.sobe58);
        sobe58.setTag(57);
        ImageView sobe59 = (ImageView) findViewById(R.id.sobe59);
        sobe59.setTag(58);
        ImageView sobe60 = (ImageView) findViewById(R.id.sobe60);
        sobe60.setTag(59);
        //sobe1.setOnClickListener(btnMessageOnClickListener);
        //sobe2.setOnClickListener(btnMessageOnClickListener);
        //sobe3.setOnClickListener(btnMessageOnClickListener);
        //sobe4.setOnClickListener(btnMessageOnClickListener);
        //sobe5.setOnClickListener(btnMessageOnClickListener);
        //sobe6.setOnClickListener(btnMessageOnClickListener);
        sobe7.setOnClickListener(btnMessageOnClickListener);
        sobe8.setOnClickListener(btnMessageOnClickListener);
        sobe9.setOnClickListener(btnMessageOnClickListener);
        sobe10.setOnClickListener(btnMessageOnClickListener);
        sobe11.setOnClickListener(btnMessageOnClickListener);
        sobe12.setOnClickListener(btnMessageOnClickListener);
        sobe13.setOnClickListener(btnMessageOnClickListener);
        sobe14.setOnClickListener(btnMessageOnClickListener);
        sobe15.setOnClickListener(btnMessageOnClickListener);
        sobe16.setOnClickListener(btnMessageOnClickListener);
        sobe17.setOnClickListener(btnMessageOnClickListener);
        sobe18.setOnClickListener(btnMessageOnClickListener);
        sobe19.setOnClickListener(btnMessageOnClickListener);
        sobe20.setOnClickListener(btnMessageOnClickListener);
        sobe21.setOnClickListener(btnMessageOnClickListener);
        sobe22.setOnClickListener(btnMessageOnClickListener);
        sobe23.setOnClickListener(btnMessageOnClickListener);
        sobe24.setOnClickListener(btnMessageOnClickListener);
        sobe25.setOnClickListener(btnMessageOnClickListener);
        sobe26.setOnClickListener(btnMessageOnClickListener);
        sobe27.setOnClickListener(btnMessageOnClickListener);
        sobe28.setOnClickListener(btnMessageOnClickListener);
        sobe29.setOnClickListener(btnMessageOnClickListener);
        sobe30.setOnClickListener(btnMessageOnClickListener);
        sobe31.setOnClickListener(btnMessageOnClickListener);
        sobe32.setOnClickListener(btnMessageOnClickListener);
        sobe33.setOnClickListener(btnMessageOnClickListener);
        sobe34.setOnClickListener(btnMessageOnClickListener);
        sobe35.setOnClickListener(btnMessageOnClickListener);
        sobe36.setOnClickListener(btnMessageOnClickListener);
        sobe37.setOnClickListener(btnMessageOnClickListener);
        sobe38.setOnClickListener(btnMessageOnClickListener);
        sobe39.setOnClickListener(btnMessageOnClickListener);
        sobe40.setOnClickListener(btnMessageOnClickListener);
        sobe41.setOnClickListener(btnMessageOnClickListener);
        sobe42.setOnClickListener(btnMessageOnClickListener);
        sobe43.setOnClickListener(btnMessageOnClickListener);
        sobe44.setOnClickListener(btnMessageOnClickListener);
        sobe45.setOnClickListener(btnMessageOnClickListener);
        sobe46.setOnClickListener(btnMessageOnClickListener);
        sobe47.setOnClickListener(btnMessageOnClickListener);
        sobe48.setOnClickListener(btnMessageOnClickListener);
        sobe49.setOnClickListener(btnMessageOnClickListener);
        sobe50.setOnClickListener(btnMessageOnClickListener);
        sobe51.setOnClickListener(btnMessageOnClickListener);
        sobe52.setOnClickListener(btnMessageOnClickListener);
        sobe53.setOnClickListener(btnMessageOnClickListener);
        sobe54.setOnClickListener(btnMessageOnClickListener);
        sobe55.setOnClickListener(btnMessageOnClickListener);
        sobe56.setOnClickListener(btnMessageOnClickListener);
        sobe57.setOnClickListener(btnMessageOnClickListener);
        sobe58.setOnClickListener(btnMessageOnClickListener);
        sobe59.setOnClickListener(btnMessageOnClickListener);
        sobe60.setOnClickListener(btnMessageOnClickListener);

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(game.this, Pause.class);
                startActivity(i);
            }
        });

        replay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(game.this, game.class);
                startActivity(i);
                finish();
            }
        });

       geracao();
    }

    private View.OnClickListener btnMessageOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View img) {

            int tag = (int)img.getTag();
            System.out.println("Resultado: " + tag);

            if (tag % 6 == 0) {
                if(vetcolunas[0] <= 54 || c == 0)
                    movimenta(vetcolunas[0],0);
            } else if (tag % 6 == 1) {
                if(vetcolunas[1] <= 55 || c == 1)
                 movimenta(vetcolunas[1],1);
            } else if (tag % 6 == 2) {
                if(vetcolunas[2] <= 56 || c == 2)
                    movimenta(vetcolunas[2],2);
            } else if (tag % 6 == 3 ) {
                if(vetcolunas[3] <= 57 || c == 3)
                    movimenta(vetcolunas[3],3);
            } else if (tag % 6 == 4) {
                if(vetcolunas[4] <= 58 || c == 4)
                     movimenta(vetcolunas[4],4);
            } else {
                if(vetcolunas[5] <= 59 || c == 5)
                    movimenta(vetcolunas[5],5);
            }
        }
    };

    public void movimenta(int tag ,int coluna)
    {
        ImageView v;
        Drawable drawable,d1;
        if(muda == false)
        {
            v = (ImageView) vv.findViewWithTag(tag);
            d1 = v.getDrawable();
            drawable = getResources().getDrawable(R.drawable.background);
            v.setImageDrawable(drawable);
            v = (ImageView) vv.findViewWithTag(coluna);
            v.setImageDrawable(d1);
            vetcolunas[coluna]+=6;
            muda = true;
            c = coluna;
        }else {
            if(c == coluna)
            {
                v = (ImageView) vv.findViewWithTag(coluna);
                d1 = v.getDrawable();
                drawable = getResources().getDrawable(tranparente);
                v.setImageDrawable(drawable);
                vetcolunas[coluna]-=6;
                v = (ImageView) vv.findViewWithTag(vetcolunas[coluna]);
                v.setImageDrawable(d1);
                muda = false;
            }else {
                if(vetcolunas[coluna] > 5)
                {
                    boolean igual = false;
                    ImageView v1 = (ImageView) vv.findViewWithTag(vetcolunas[coluna]);
                    drawable = v1.getDrawable();
                    v = (ImageView) vv.findViewWithTag(c);
                    d1 = v.getDrawable();
                    while(drawable == d1)
                    {
                        igual = true;
                    }

                    if(igual == false)
                    {
                        Drawable aux = getResources().getDrawable(R.drawable.doois);

                        if(v.getDrawable() == aux)
                        {
                            drawable = getResources().getDrawable(tranparente);
                            v.setImageDrawable(drawable);
                            v1 = (ImageView) vv.findViewWithTag(vetcolunas[coluna]-6);
                            v1.setImageDrawable(aux);
                        }
                    }

                }
            }
        }
    }
    public void geracao()
    {
        int comeco = 24;
        for (int j = 0; j < 6; j++)
        {
            comeco = 24 + j;
            ImageView v;
            Drawable drawable;

            Random rand = new Random();
            int r = rand.nextInt(6),oto,gerei;
            vetcolunas[j] = comeco + 6*r;
            comeco += 6*r;
            drawable = getResources().getDrawable(R.drawable.doois);
            gerei = rand.nextInt(7);

            for (;r < 6;r++)
            {
                System.out.println("Resultado: " + comeco);
                v = (ImageView) vv.findViewWithTag(comeco);
                oto = rand.nextInt(7);
                if(gerei == oto) oto  = (oto+1)%6;

                if(oto == 0) drawable = getResources().getDrawable(R.drawable.doois);
                else if(oto == 1) drawable = getResources().getDrawable(R.drawable.quatro);
                else if(oto == 2) drawable = getResources().getDrawable(R.drawable.oito);
                else if(oto == 3) drawable = getResources().getDrawable(R.drawable.dezeseis);
                else if(oto == 4) drawable = getResources().getDrawable(R.drawable.trintaedois);
                else if(oto == 5) drawable = getResources().getDrawable(R.drawable.sessentaequatro);
                else if(oto == 6) drawable = getResources().getDrawable(R.drawable.centoevinte);

                v.setImageDrawable(drawable);
                comeco += 6;
                gerei = oto;
            }
            System.out.println("sai " + r);
        }

    }
}