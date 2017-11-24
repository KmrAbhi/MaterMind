package com.example.abhi.mastermind;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class OnClickingNew extends AppCompatActivity {
    private GoogleApiClient client;
    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_clicking_new);
        /*
        ArrayList<int> a = new ArrayList();
        a.add(1)        // after clicking on color boxes
        //after clicking on Go
        Bundle b = new Bundle();
        b.put(a, "colorList");
        Intent i = new Intent(getApplicationContext(), secondActivity.class);
        i.putExtras(b);
        startActivity(i);
         */
        /*
        to receive list
        Bundle b = getIntent().getExtras();
        ArrayList<int> a2 = b.getIntegerArrayList("colorList");
         */
        final TextView level0 = (TextView) findViewById(R.id.new_button1);
        level0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent level0Intent = new Intent(OnClickingNew.this, MainActivity.class);
                startActivity(level0Intent);
            }
        });

        final int color_black = Color.rgb(0,0,0);
        final int color_default = Color.rgb(236, 239, 241);
        final List<Integer> a = new ArrayList<>();
        Random rng = new Random(System.currentTimeMillis()); // Ideally just create one instance globally
        for (int i = 0; i < 5; i++) {
            while (true) {
                Integer next = rng.nextInt(12) + 4;
                if (!a.contains(next)) {
                    a.add(next);
                    break;
                }
            }
        }
/*
        TextView textview = (TextView) findViewById(R.id.text1);
        textview.setText("" + a.get(0));
        TextView textview1 = (TextView) findViewById(R.id.text2);
        textview1.setText("" + a.get(1));
        TextView textview2 = (TextView) findViewById(R.id.text3);
        textview2.setText("" + a.get(2));
        TextView textview3 = (TextView) findViewById(R.id.text4);
        textview3.setText("" + a.get(3));
        TextView textview4 = (TextView) findViewById(R.id.text5);
        textview4.setText("" + a.get(4));
*/
        final Button color13 = (Button) findViewById(R.id.color_13);
        color13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Button selection_button = (Button) findViewById(R.id.Current_Selection_Button);
                selection_button.setBackgroundColor(Color.rgb(93, 64, 55));
            }
        });
        final Button color14 = (Button) findViewById(R.id.color_14);
        color14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Button selection_button = (Button) findViewById(R.id.Current_Selection_Button);
                selection_button.setBackgroundColor(Color.rgb(38, 198, 218));
            }
        });
        final Button color15= (Button) findViewById(R.id.color_15);
        color15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Button selection_button = (Button) findViewById(R.id.Current_Selection_Button);
                selection_button.setBackgroundColor(Color.rgb(69, 90, 100));
            }
        });
        final Button color4 = (Button) findViewById(R.id.color_4);
        color4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Button selection_button = (Button) findViewById(R.id.Current_Selection_Button);
                selection_button.setBackgroundColor(Color.rgb(244, 81, 30));
            }
        });
        final Button color5 = (Button) findViewById(R.id.color_5);
        color5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Button selection_button = (Button) findViewById(R.id.Current_Selection_Button);
                selection_button.setBackgroundColor(Color.rgb(117, 117, 117));
            }
        });
        final Button color6 = (Button) findViewById(R.id.color_6);
        color6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Button selection_button = (Button) findViewById(R.id.Current_Selection_Button);
                selection_button.setBackgroundColor(Color.rgb(61, 90, 254));
            }
        });
        final Button color7 = (Button) findViewById(R.id.color_7);
        color7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Button selection_button = (Button) findViewById(R.id.Current_Selection_Button);
                selection_button.setBackgroundColor(Color.rgb(255, 145, 0));
            }
        });
        final Button color8 = (Button) findViewById(R.id.color_8);
        color8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Button selection_button = (Button) findViewById(R.id.Current_Selection_Button);
                selection_button.setBackgroundColor(Color.rgb(155, 48, 255));
            }
        });
        final Button color9 = (Button) findViewById(R.id.color_9);
        color9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Button selection_button = (Button) findViewById(R.id.Current_Selection_Button);
                selection_button.setBackgroundColor(Color.rgb(204, 255, 144));
            }
        });
        final Button color10 = (Button) findViewById(R.id.color_10);
        color10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Button selection_button = (Button) findViewById(R.id.Current_Selection_Button);
                selection_button.setBackgroundColor(Color.rgb(240, 98, 146));
            }
        });
        final Button color11 = (Button) findViewById(R.id.color_11);
        color11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Button selection_button = (Button) findViewById(R.id.Current_Selection_Button);
                selection_button.setBackgroundColor(Color.rgb(69, 39, 160));
            }
        });
        final Button color12 = (Button) findViewById(R.id.color_12);
        color12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Button selection_button = (Button) findViewById(R.id.Current_Selection_Button);
                selection_button.setBackgroundColor(Color.rgb(255, 238, 88));
            }
        });
        final Button Current_Selection = (Button) findViewById(R.id.Current_Selection_Button);
        final Button Button01 = (Button) findViewById(R.id.Button01);
        final Button Button02 = (Button) findViewById(R.id.Button02);
        final Button Button03 = (Button) findViewById(R.id.Button03);
        final Button Button04 = (Button) findViewById(R.id.Button04);
        final Button Button05 = (Button) findViewById(R.id.Button05);
        final Button Button11 = (Button) findViewById(R.id.Button11);
        final Button Button12 = (Button) findViewById(R.id.Button12);
        final Button Button13 = (Button) findViewById(R.id.Button13);
        final Button Button14 = (Button) findViewById(R.id.Button14);
        final Button Button15 = (Button) findViewById(R.id.Button15);
        final Button Button21 = (Button) findViewById(R.id.Button21);
        final Button Button22 = (Button) findViewById(R.id.Button22);
        final Button Button23 = (Button) findViewById(R.id.Button23);
        final Button Button24 = (Button) findViewById(R.id.Button24);
        final Button Button25 = (Button) findViewById(R.id.Button25);
        final Button Button31 = (Button) findViewById(R.id.Button31);
        final Button Button32 = (Button) findViewById(R.id.Button32);
        final Button Button33 = (Button) findViewById(R.id.Button33);
        final Button Button34 = (Button) findViewById(R.id.Button34);
        final Button Button35 = (Button) findViewById(R.id.Button35);
        final Button Button41 = (Button) findViewById(R.id.Button41);
        final Button Button42 = (Button) findViewById(R.id.Button42);
        final Button Button43 = (Button) findViewById(R.id.Button43);
        final Button Button44 = (Button) findViewById(R.id.Button44);
        final Button Button45 = (Button) findViewById(R.id.Button45);
        final Button Button51 = (Button) findViewById(R.id.Button51);
        final Button Button52 = (Button) findViewById(R.id.Button52);
        final Button Button53 = (Button) findViewById(R.id.Button53);
        final Button Button54 = (Button) findViewById(R.id.Button54);
        final Button Button55 = (Button) findViewById(R.id.Button55);
        final Button Button61 = (Button) findViewById(R.id.Button61);
        final Button Button62 = (Button) findViewById(R.id.Button62);
        final Button Button63 = (Button) findViewById(R.id.Button63);
        final Button Button64 = (Button) findViewById(R.id.Button64);
        final Button Button65 = (Button) findViewById(R.id.Button65);
        final Button Button71 = (Button) findViewById(R.id.Button71);
        final Button Button72 = (Button) findViewById(R.id.Button72);
        final Button Button73 = (Button) findViewById(R.id.Button73);
        final Button Button74 = (Button) findViewById(R.id.Button74);
        final Button Button75 = (Button) findViewById(R.id.Button75);
        final Button Button81 = (Button) findViewById(R.id.Button81);
        final Button Button82 = (Button) findViewById(R.id.Button82);
        final Button Button83 = (Button) findViewById(R.id.Button83);
        final Button Button84 = (Button) findViewById(R.id.Button84);
        final Button Button85 = (Button) findViewById(R.id.Button85);
        final Button Button91 = (Button) findViewById(R.id.Button91);
        final Button Button92 = (Button) findViewById(R.id.Button92);
        final Button Button93 = (Button) findViewById(R.id.Button93);
        final Button Button94 = (Button) findViewById(R.id.Button94);
        final Button Button95 = (Button) findViewById(R.id.Button95);
        final Button Button101 = (Button) findViewById(R.id.Button101);
        final Button Button102 = (Button) findViewById(R.id.Button102);
        final Button Button103 = (Button) findViewById(R.id.Button103);
        final Button Button104 = (Button) findViewById(R.id.Button104);
        final Button Button105 = (Button) findViewById(R.id.Button105);
        final Button Button111 = (Button) findViewById(R.id.Button111);
        final Button Button112 = (Button) findViewById(R.id.Button112);
        final Button Button113 = (Button) findViewById(R.id.Button113);
        final Button Button114 = (Button) findViewById(R.id.Button114);
        final Button Button115 = (Button) findViewById(R.id.Button115);
        final Button Button121 = (Button) findViewById(R.id.Button121);
        final Button Button122 = (Button) findViewById(R.id.Button122);
        final Button Button123 = (Button) findViewById(R.id.Button123);
        final Button Button124 = (Button) findViewById(R.id.Button124);
        final Button Button125 = (Button) findViewById(R.id.Button125);
        final Button Button131 = (Button) findViewById(R.id.Button131);
        final Button Button132 = (Button) findViewById(R.id.Button132);
        final Button Button133 = (Button) findViewById(R.id.Button133);
        final Button Button134 = (Button) findViewById(R.id.Button134);
        final Button Button135 = (Button) findViewById(R.id.Button135);
        final Button Button141 = (Button) findViewById(R.id.Button141);
        final Button Button142 = (Button) findViewById(R.id.Button142);
        final Button Button143 = (Button) findViewById(R.id.Button143);
        final Button Button144 = (Button) findViewById(R.id.Button144);
        final Button Button145 = (Button) findViewById(R.id.Button145);
        final Button Button151 = (Button) findViewById(R.id.Button151);
        final Button Button152 = (Button) findViewById(R.id.Button152);
        final Button Button153 = (Button) findViewById(R.id.Button153);
        final Button Button154 = (Button) findViewById(R.id.Button154);
        final Button Button155 = (Button) findViewById(R.id.Button155);
        final Button Button161 = (Button) findViewById(R.id.Button161);
        final Button Button162 = (Button) findViewById(R.id.Button162);
        final Button Button163 = (Button) findViewById(R.id.Button163);
        final Button Button164 = (Button) findViewById(R.id.Button164);
        final Button Button165 = (Button) findViewById(R.id.Button165);
        final Button Button171 = (Button) findViewById(R.id.Button171);
        final Button Button172 = (Button) findViewById(R.id.Button172);
        final Button Button173 = (Button) findViewById(R.id.Button173);
        final Button Button174 = (Button) findViewById(R.id.Button174);
        final Button Button175 = (Button) findViewById(R.id.Button175);
        final Button Button181 = (Button) findViewById(R.id.Button181);
        final Button Button182 = (Button) findViewById(R.id.Button182);
        final Button Button183 = (Button) findViewById(R.id.Button183);
        final Button Button184 = (Button) findViewById(R.id.Button184);
        final Button Button185 = (Button) findViewById(R.id.Button185);
        final Button Button191 = (Button) findViewById(R.id.Button191);
        final Button Button192 = (Button) findViewById(R.id.Button192);
        final Button Button193 = (Button) findViewById(R.id.Button193);
        final Button Button194 = (Button) findViewById(R.id.Button194);
        final Button Button195 = (Button) findViewById(R.id.Button195);
        Button Go0 = (Button) findViewById(R.id.Go0);
        final Button Go1 = (Button) findViewById(R.id.Go1);
        final Button Go2 = (Button) findViewById(R.id.Go2);
        final Button Go3 = (Button) findViewById(R.id.Go3);
        final Button Go4 = (Button) findViewById(R.id.Go4);
        final Button Go5 = (Button) findViewById(R.id.Go5);
        final Button Go6 = (Button) findViewById(R.id.Go6);
        final Button Go7 = (Button) findViewById(R.id.Go7);
        final Button Go8 = (Button) findViewById(R.id.Go8);
        final Button Go9 = (Button) findViewById(R.id.Go9);
        final Button a11 = (Button) findViewById(R.id.a11);
        final Button a12 = (Button) findViewById(R.id.a12);
        final Button a13 = (Button) findViewById(R.id.a13);
        final Button a14 = (Button) findViewById(R.id.a14);
        final Button a15 = (Button) findViewById(R.id.a15);
        final Button a16 = (Button) findViewById(R.id.a16);
        final Button a17 = (Button) findViewById(R.id.a17);
        final Button a18 = (Button) findViewById(R.id.a18);
        final Button a19 = (Button) findViewById(R.id.a19);
        final Button a110 = (Button) findViewById(R.id.a110);
        final int[] level1 = new int[1];
        level1[0] = 0;
        Button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level1[0] == 0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button02 = Color.RED;
                    Drawable background_button02 = Button02.getBackground();
                    if (background_button02 instanceof ColorDrawable) {
                        color_button02 = (((ColorDrawable) background_button02).getColor());
                    }
                    int color_button03 = Color.RED;
                    Drawable background_button03 = Button03.getBackground();
                    if (background_button03 instanceof ColorDrawable) {
                        color_button03 = (((ColorDrawable) background_button03).getColor());
                    }
                    int color_button04 = Color.RED;
                    Drawable background_button04 = Button04.getBackground();
                    if (background_button04 instanceof ColorDrawable) {
                        color_button04 = (((ColorDrawable) background_button04).getColor());
                    }
                    int color_button05 = Color.RED;
                    Drawable background_button05 = Button05.getBackground();
                    if (background_button05 instanceof ColorDrawable) {
                        color_button05 = (((ColorDrawable) background_button05).getColor());
                    }
                    if (color_current_selection == color_button02 || color_current_selection == color_button03 || color_current_selection == color_button04 || color_current_selection == color_button05) {
                    } else
                        Button01.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level1[0] == 0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button03 = Color.RED;
                    Drawable background_button03 = Button03.getBackground();
                    if (background_button03 instanceof ColorDrawable) {
                        color_button03 = (((ColorDrawable) background_button03).getColor());
                    }
                    int color_button04 = Color.RED;
                    Drawable background_button04 = Button04.getBackground();
                    if (background_button04 instanceof ColorDrawable) {
                        color_button04 = (((ColorDrawable) background_button04).getColor());
                    }
                    int color_button05 = Color.RED;
                    Drawable background_button05 = Button05.getBackground();
                    if (background_button05 instanceof ColorDrawable) {
                        color_button05 = (((ColorDrawable) background_button05).getColor());
                    }
                    int color_button01 = Color.RED;
                    Drawable background_button01 = Button01.getBackground();
                    if (background_button01 instanceof ColorDrawable) {
                        color_button01 = (((ColorDrawable) background_button01).getColor());
                    }
                    if (color_current_selection == color_button01 || color_current_selection == color_button03 || color_current_selection == color_button04 || color_current_selection == color_button05) {
                    } else
                        Button02.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level1[0] == 0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button01 = Color.RED;
                    Drawable background_button01 = Button01.getBackground();
                    if (background_button01 instanceof ColorDrawable) {
                        color_button01 = (((ColorDrawable) background_button01).getColor());
                    }
                    int color_button04 = Color.RED;
                    Drawable background_button04 = Button04.getBackground();
                    if (background_button04 instanceof ColorDrawable) {
                        color_button04 = (((ColorDrawable) background_button04).getColor());
                    }
                    int color_button05 = Color.RED;
                    Drawable background_button05 = Button05.getBackground();
                    if (background_button05 instanceof ColorDrawable) {
                        color_button05 = (((ColorDrawable) background_button05).getColor());
                    }
                    int color_button02 = Color.RED;
                    Drawable background_button02 = Button02.getBackground();
                    if (background_button02 instanceof ColorDrawable) {
                        color_button02 = (((ColorDrawable) background_button02).getColor());
                    }
                    if (color_current_selection == color_button01 || color_current_selection == color_button02 || color_current_selection == color_button04 || color_current_selection == color_button05) {
                    } else
                        Button03.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level1[0] == 0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button03 = Color.RED;
                    Drawable background_button03 = Button03.getBackground();
                    if (background_button03 instanceof ColorDrawable) {
                        color_button03 = (((ColorDrawable) background_button03).getColor());
                    }
                    int color_button02 = Color.RED;
                    Drawable background_button02 = Button02.getBackground();
                    if (background_button02 instanceof ColorDrawable) {
                        color_button02 = (((ColorDrawable) background_button02).getColor());
                    }
                    int color_button05 = Color.RED;
                    Drawable background_button05 = Button05.getBackground();
                    if (background_button05 instanceof ColorDrawable) {
                        color_button05 = (((ColorDrawable) background_button05).getColor());
                    }
                    int color_button01 = Color.RED;
                    Drawable background_button01 = Button01.getBackground();
                    if (background_button01 instanceof ColorDrawable) {
                        color_button01 = (((ColorDrawable) background_button01).getColor());
                    }
                    if (color_current_selection == color_button01 || color_current_selection == color_button03 || color_current_selection == color_button02 || color_current_selection == color_button05) {
                    } else
                        Button04.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level1[0] == 0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button03 = Color.RED;
                    Drawable background_button03 = Button03.getBackground();
                    if (background_button03 instanceof ColorDrawable) {
                        color_button03 = (((ColorDrawable) background_button03).getColor());
                    }
                    int color_button04 = Color.RED;
                    Drawable background_button04 = Button04.getBackground();
                    if (background_button04 instanceof ColorDrawable) {
                        color_button04 = (((ColorDrawable) background_button04).getColor());
                    }
                    int color_button02 = Color.RED;
                    Drawable background_button02 = Button02.getBackground();
                    if (background_button02 instanceof ColorDrawable) {
                        color_button02 = (((ColorDrawable) background_button02).getColor());
                    }
                    int color_button01 = Color.RED;
                    Drawable background_button01 = Button01.getBackground();
                    if (background_button01 instanceof ColorDrawable) {
                        color_button01 = (((ColorDrawable) background_button01).getColor());
                    }
                    if (color_current_selection == color_button01 || color_current_selection == color_button03 || color_current_selection == color_button04 || color_current_selection == color_button02) {
                    } else
                        Button05.setBackgroundColor(color_current_selection);
                }
            }
        });
        Go0.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                int final_color13 = Color.RED;
                Drawable final_background1 = color13.getBackground();
                if (final_background1 instanceof ColorDrawable) {
                    final_color13 = (((ColorDrawable) final_background1).getColor());
                }
        /*int final_color2 = Color.RED;
        Drawable final_background2 = color2.getBackground();
        if (final_background2 instanceof ColorDrawable) {
            final_color2 = (((ColorDrawable) final_background2).getColor());
        }
        int final_color3 = Color.RED;
        Drawable final_background3 = color3.getBackground();
        if (final_background3 instanceof ColorDrawable) {
            final_color3 = (((ColorDrawable) final_background3).getColor());
        }*/
                int final_color4 = Color.RED;
                Drawable final_background4 = color4.getBackground();
                if (final_background4 instanceof ColorDrawable) {
                    final_color4 = (((ColorDrawable) final_background4).getColor());
                }
                int final_color5 = Color.RED;
                Drawable final_background5 = color5.getBackground();
                if (final_background5 instanceof ColorDrawable) {
                    final_color5 = (((ColorDrawable) final_background5).getColor());
                }
                int final_color6 = Color.RED;
                Drawable final_background6 = color6.getBackground();
                if (final_background6 instanceof ColorDrawable) {
                    final_color6 = (((ColorDrawable) final_background6).getColor());
                }
                int final_color7 = Color.RED;
                Drawable final_background7 = color7.getBackground();
                if (final_background7 instanceof ColorDrawable) {
                    final_color7 = (((ColorDrawable) final_background7).getColor());
                }
                int final_color8 = Color.RED;
                Drawable final_background8 = color8.getBackground();
                if (final_background8 instanceof ColorDrawable) {
                    final_color8 = (((ColorDrawable) final_background8).getColor());
                }
                int final_color9 = Color.RED;
                Drawable final_background9 = color9.getBackground();
                if (final_background9 instanceof ColorDrawable) {
                    final_color9 = (((ColorDrawable) final_background9).getColor());
                }
                int final_color10 = Color.RED;
                Drawable final_background10 = color10.getBackground();
                if (final_background10 instanceof ColorDrawable) {
                    final_color10 = (((ColorDrawable) final_background10).getColor());
                }
                int final_color11 = Color.RED;
                Drawable final_background11 = color11.getBackground();
                if (final_background11 instanceof ColorDrawable) {
                    final_color11 = (((ColorDrawable) final_background11).getColor());
                }
                int final_color12 = Color.RED;
                Drawable final_background12 = color12.getBackground();
                if (final_background12 instanceof ColorDrawable) {
                    final_color12 = (((ColorDrawable) final_background12).getColor());
                }
                int final_color14 = Color.RED;
                Drawable final_background14 = color14.getBackground();
                if (final_background14 instanceof ColorDrawable) {
                    final_color14 = (((ColorDrawable) final_background14).getColor());
                }
                int final_color15 = Color.RED;
                Drawable final_background15 = color15.getBackground();
                if (final_background15 instanceof ColorDrawable) {
                    final_color15 = (((ColorDrawable) final_background15).getColor());
                }
                if (level1[0] == 0) {
                    int final_color_button01 = Color.RED;
                    Drawable final_background_button01 = Button01.getBackground();
                    if (final_background_button01 instanceof ColorDrawable) {
                        final_color_button01 = (((ColorDrawable) final_background_button01).getColor());
                    }
                    int final_color_button02 = Color.RED;
                    Drawable final_background_button02 = Button02.getBackground();
                    if (final_background_button02 instanceof ColorDrawable) {
                        final_color_button02 = (((ColorDrawable) final_background_button02).getColor());
                    }
                    int final_color_button03 = Color.RED;
                    Drawable final_background_button03 = Button03.getBackground();
                    if (final_background_button03 instanceof ColorDrawable) {
                        final_color_button03 = (((ColorDrawable) final_background_button03).getColor());
                    }
                    int final_color_button04 = Color.RED;
                    Drawable final_background_button04 = Button04.getBackground();
                    if (final_background_button04 instanceof ColorDrawable) {
                        final_color_button04 = (((ColorDrawable) final_background_button04).getColor());
                    }
                    int final_color_button05 = Color.RED;
                    Drawable final_background_button05 = Button05.getBackground();
                    if (final_background_button05 instanceof ColorDrawable) {
                        final_color_button05 = (((ColorDrawable) final_background_button05).getColor());
                    }
                    if (final_color_button01 != color_default && final_color_button02 != color_default && final_color_button03 != color_default && final_color_button04 != color_default && final_color_button05 != color_default) {
                        Button11.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button12.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button13.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button14.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button15.setBackgroundColor(Color.rgb(236, 239, 241));
                        a11.setBackgroundColor(Color.rgb(236, 239, 241));
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 13) {
                                if (final_color_button01 == final_color13)
                                    Button11.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13) {
                                if (final_color_button01 == final_color13)
                                    Button11.setBackgroundColor(Color.CYAN);
                            }
                        }
               /* for (int x = 1; x < 5; x++) {
                    if (a.get(0) == 2) {
                        if (final_color_button01 == final_color2)
                            Button11.setBackgroundColor(Color.RED);
                    } else if (a.get(x) == 2) {
                        if (final_color_button01 == final_color2)
                            Button11.setBackgroundColor(Color.CYAN);
                    }
                }
                for (int x = 1; x < 5; x++) {
                    if (a.get(0) == 3) {
                        if (final_color_button01 == final_color3)
                            Button11.setBackgroundColor(Color.RED);
                    } else if (a.get(x) == 3) {
                        if (final_color_button01 == final_color3)
                            Button11.setBackgroundColor(Color.CYAN);
                    }
                }*/
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 4) {
                                if (final_color_button01 == final_color4)
                                    Button11.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4) {
                                if (final_color_button01 == final_color4)
                                    Button11.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 5) {
                                if (final_color_button01 == final_color5)
                                    Button11.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5) {
                                if (final_color_button01 == final_color5)
                                    Button11.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 6) {
                                if (final_color_button01 == final_color6)
                                    Button11.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6) {
                                if (final_color_button01 == final_color6)
                                    Button11.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 7) {
                                if (final_color_button01 == final_color7)
                                    Button11.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7) {
                                if (final_color_button01 == final_color7)
                                    Button11.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 8) {
                                if (final_color_button01 == final_color8)
                                    Button11.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8) {
                                if (final_color_button01 == final_color8)
                                    Button11.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 9) {
                                if (final_color_button01 == final_color9)
                                    Button11.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9) {
                                if (final_color_button01 == final_color9)
                                    Button11.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 10) {
                                if (final_color_button01 == final_color10)
                                    Button11.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10) {
                                if (final_color_button01 == final_color10)
                                    Button11.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 11) {
                                if (final_color_button01 == final_color11)
                                    Button11.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11) {
                                if (final_color_button01 == final_color11)
                                    Button11.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 12) {
                                if (final_color_button01 == final_color12)
                                    Button11.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12) {
                                if (final_color_button01 == final_color12)
                                    Button11.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 14) {
                                if (final_color_button01 == final_color14)
                                    Button11.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14) {
                                if (final_color_button01 == final_color14)
                                    Button11.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 15) {
                                if (final_color_button01 == final_color15)
                                    Button11.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15) {
                                if (final_color_button01 == final_color15)
                                    Button11.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 13) {
                                if (final_color_button02 == final_color13)
                                    Button12.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13 && x != 1) {
                                if (final_color_button02 == final_color13)
                                    Button12.setBackgroundColor(Color.CYAN);
                            }
                        }
                /*for (int x = 0; x < 5; x++) {
                    if (a.get(1) == 2) {
                        if (final_color_button02 == final_color2)
                            Button12.setBackgroundColor(Color.RED);
                    } else if (a.get(x) == 2 && x != 1) {
                        if (final_color_button02 == final_color2)
                            Button12.setBackgroundColor(Color.CYAN);
                    }
                }
                for (int x = 0; x < 5; x++) {
                    if (a.get(1) == 3) {
                        if (final_color_button02 == final_color3)
                            Button12.setBackgroundColor(Color.RED);
                    } else if (a.get(x) == 3 && x != 1) {
                        if (final_color_button02 == final_color3)
                            Button12.setBackgroundColor(Color.CYAN);
                    }
                }*/
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 4) {
                                if (final_color_button02 == final_color4)
                                    Button12.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4 && x != 1) {
                                if (final_color_button02 == final_color4)
                                    Button12.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 5) {
                                if (final_color_button02 == final_color5)
                                    Button12.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5 && x != 1) {
                                if (final_color_button02 == final_color5)
                                    Button12.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 6) {
                                if (final_color_button02 == final_color6)
                                    Button12.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6 && x != 1) {
                                if (final_color_button02 == final_color6)
                                    Button12.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 7) {
                                if (final_color_button02 == final_color7)
                                    Button12.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7 && x != 1) {
                                if (final_color_button02 == final_color7)
                                    Button12.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 8) {
                                if (final_color_button02 == final_color8)
                                    Button12.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8 && x != 1) {
                                if (final_color_button02 == final_color8)
                                    Button12.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 9) {
                                if (final_color_button02 == final_color9)
                                    Button12.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9 && x != 1) {
                                if (final_color_button02 == final_color9)
                                    Button12.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 10) {
                                if (final_color_button02 == final_color10)
                                    Button12.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10 && x != 1) {
                                if (final_color_button02 == final_color10)
                                    Button12.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 11) {
                                if (final_color_button02 == final_color11)
                                    Button12.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11 && x != 1) {
                                if (final_color_button02 == final_color11)
                                    Button12.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 12) {
                                if (final_color_button02 == final_color12)
                                    Button12.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12 && x != 1) {
                                if (final_color_button02 == final_color12)
                                    Button12.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 14) {
                                if (final_color_button02 == final_color14)
                                    Button12.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14 && x != 1) {
                                if (final_color_button02 == final_color14)
                                    Button12.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 15) {
                                if (final_color_button02 == final_color15)
                                    Button12.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15 && x != 1) {
                                if (final_color_button02 == final_color15)
                                    Button12.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 13) {
                                if (final_color_button03 == final_color13)
                                    Button13.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13 && x != 2) {
                                if (final_color_button03 == final_color13)
                                    Button13.setBackgroundColor(Color.CYAN);
                            }
                        }
                /*for (int x = 0; x < 5; x++) {
                    if (a.get(2) == 2) {
                        if (final_color_button03 == final_color2)
                            Button13.setBackgroundColor(Color.RED);
                    } else if (a.get(x) == 2 && x != 2) {
                        if (final_color_button03 == final_color2)
                            Button13.setBackgroundColor(Color.CYAN);
                    }
                }
                for (int x = 0; x < 5; x++) {
                    if (a.get(2) == 3) {
                        if (final_color_button03 == final_color3)
                            Button13.setBackgroundColor(Color.RED);
                    } else if (a.get(x) == 3 && x != 2) {
                        if (final_color_button03 == final_color3)
                            Button13.setBackgroundColor(Color.CYAN);
                    }
                }*/
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 4) {
                                if (final_color_button03 == final_color4)
                                    Button13.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4 && x != 2) {
                                if (final_color_button03 == final_color4)
                                    Button13.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 5) {
                                if (final_color_button03 == final_color5)
                                    Button13.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5 && x != 2) {
                                if (final_color_button03 == final_color5)
                                    Button13.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 6) {
                                if (final_color_button03 == final_color6)
                                    Button13.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6 && x != 2) {
                                if (final_color_button03 == final_color6)
                                    Button13.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 7) {
                                if (final_color_button03 == final_color7)
                                    Button13.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7 && x != 2) {
                                if (final_color_button03 == final_color7)
                                    Button13.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 8) {
                                if (final_color_button03 == final_color8)
                                    Button13.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8 && x != 2) {
                                if (final_color_button03 == final_color8)
                                    Button13.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 9) {
                                if (final_color_button03 == final_color9)
                                    Button13.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9 && x != 2) {
                                if (final_color_button03 == final_color9)
                                    Button13.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 10) {
                                if (final_color_button03 == final_color10)
                                    Button13.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10 && x != 2) {
                                if (final_color_button03 == final_color10)
                                    Button13.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 11) {
                                if (final_color_button03 == final_color11)
                                    Button13.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11 && x != 2) {
                                if (final_color_button03 == final_color11)
                                    Button13.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 12) {
                                if (final_color_button03 == final_color12)
                                    Button13.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12 && x != 2) {
                                if (final_color_button03 == final_color12)
                                    Button13.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 14) {
                                if (final_color_button03 == final_color14)
                                    Button13.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14 && x != 2) {
                                if (final_color_button03 == final_color14)
                                    Button13.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 15) {
                                if (final_color_button03 == final_color15)
                                    Button13.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15 && x != 2) {
                                if (final_color_button03 == final_color15)
                                    Button13.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 13) {
                                if (final_color_button04 == final_color13)
                                    Button14.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13 && x != 3) {
                                if (final_color_button04 == final_color13)
                                    Button14.setBackgroundColor(Color.CYAN);
                            }
                        }
                /*for (int x = 0; x < 5; x++) {
                    if (a.get(3) == 2) {
                        if (final_color_button04 == final_color2)
                            Button14.setBackgroundColor(Color.RED);
                    } else if (a.get(x) == 2 && x != 3) {
                        if (final_color_button04 == final_color2)
                            Button14.setBackgroundColor(Color.CYAN);
                    }
                }
                for (int x = 0; x < 5; x++) {
                    if (a.get(3) == 3) {
                        if (final_color_button04 == final_color3)
                            Button14.setBackgroundColor(Color.RED);
                    } else if (a.get(x) == 3 && x != 3) {
                        if (final_color_button04 == final_color3)
                            Button14.setBackgroundColor(Color.CYAN);
                    }
                }*/
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 4) {
                                if (final_color_button04 == final_color4)
                                    Button14.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4 && x != 3) {
                                if (final_color_button04 == final_color4)
                                    Button14.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 5) {
                                if (final_color_button04 == final_color5)
                                    Button14.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5 && x != 3) {
                                if (final_color_button04 == final_color5)
                                    Button14.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 6) {
                                if (final_color_button04 == final_color6)
                                    Button14.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6 && x != 3) {
                                if (final_color_button04 == final_color6)
                                    Button14.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 7) {
                                if (final_color_button04 == final_color7)
                                    Button14.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7 && x != 3) {
                                if (final_color_button04 == final_color7)
                                    Button14.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 8) {
                                if (final_color_button04 == final_color8)
                                    Button14.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8 && x != 3) {
                                if (final_color_button04 == final_color8)
                                    Button14.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 9) {
                                if (final_color_button04 == final_color9)
                                    Button14.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9 && x != 3) {
                                if (final_color_button04 == final_color9)
                                    Button14.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 10) {
                                if (final_color_button04 == final_color10)
                                    Button14.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10 && x != 3) {
                                if (final_color_button04 == final_color10)
                                    Button14.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 11) {
                                if (final_color_button04 == final_color11)
                                    Button14.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11 && x != 3) {
                                if (final_color_button04 == final_color11)
                                    Button14.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 12) {
                                if (final_color_button04 == final_color12)
                                    Button14.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12 && x != 3) {
                                if (final_color_button04 == final_color12)
                                    Button14.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 14) {
                                if (final_color_button04 == final_color14)
                                    Button14.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14 && x != 3) {
                                if (final_color_button04 == final_color14)
                                    Button14.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 15) {
                                if (final_color_button04 == final_color15)
                                    Button14.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15 && x != 3) {
                                if (final_color_button04 == final_color15)
                                    Button14.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 13) {
                                if (final_color_button05 == final_color13)
                                    Button15.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13) {
                                if (final_color_button05 == final_color13)
                                    Button15.setBackgroundColor(Color.CYAN);
                            }
                        }
               /* for (int x = 0; x < 4; x++) {
                    if (a.get(4) == 2) {
                        if (final_color_button05 == final_color2)
                            Button15.setBackgroundColor(Color.RED);
                    } else if (a.get(x) == 2) {
                        if (final_color_button05 == final_color2)
                            Button15.setBackgroundColor(Color.CYAN);
                    }
                }
                for (int x = 0; x < 4; x++) {
                    if (a.get(4) == 3) {
                        if (final_color_button05 == final_color3)
                            Button15.setBackgroundColor(Color.RED);
                    } else if (a.get(x) == 3) {
                        if (final_color_button05 == final_color3)
                            Button15.setBackgroundColor(Color.CYAN);
                    }
                }*/
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 4) {
                                if (final_color_button05 == final_color4)
                                    Button15.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4) {
                                if (final_color_button05 == final_color4)
                                    Button15.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 5) {
                                if (final_color_button05 == final_color5)
                                    Button15.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5) {
                                if (final_color_button05 == final_color5)
                                    Button15.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 6) {
                                if (final_color_button05 == final_color6)
                                    Button15.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6) {
                                if (final_color_button05 == final_color6)
                                    Button15.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 7) {
                                if (final_color_button05 == final_color7)
                                    Button15.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7) {
                                if (final_color_button05 == final_color7)
                                    Button15.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 8) {
                                if (final_color_button05 == final_color8)
                                    Button15.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8) {
                                if (final_color_button05 == final_color8)
                                    Button15.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 9) {
                                if (final_color_button05 == final_color9)
                                    Button15.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9) {
                                if (final_color_button05 == final_color9)
                                    Button15.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 10) {
                                if (final_color_button05 == final_color10)
                                    Button15.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10) {
                                if (final_color_button05 == final_color10)
                                    Button15.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 11) {
                                if (final_color_button05 == final_color11)
                                    Button15.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11) {
                                if (final_color_button05 == final_color11)
                                    Button15.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 12) {
                                if (final_color_button05 == final_color12)
                                    Button15.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12) {
                                if (final_color_button05 == final_color12)
                                    Button15.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 14) {
                                if (final_color_button05 == final_color14)
                                    Button15.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14) {
                                if (final_color_button05 == final_color14)
                                    Button15.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 15) {
                                if (final_color_button05 == final_color15)
                                    Button15.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15) {
                                if (final_color_button05 == final_color15)
                                    Button15.setBackgroundColor(Color.CYAN);
                            }
                        }
                        final List<Integer> b = new ArrayList<>();
                        Random random = new Random(System.currentTimeMillis());
                        for (int i = 0; i < 5; i++) {
                            while (true) {
                                Integer next = random.nextInt(5) + 1;
                                if (!b.contains(next)) {
                                    b.add(next);
                                    break;
                                }
                            }
                        }
                        int final_color_button1 = Color.RED;
                        Drawable final_background_button1 = Button11.getBackground();
                        if (final_background_button1 instanceof ColorDrawable) {
                            final_color_button1 = (((ColorDrawable) final_background_button1).getColor());
                        }
                        int final_color_button2 = Color.RED;
                        Drawable final_background_button2 = Button12.getBackground();
                        if (final_background_button2 instanceof ColorDrawable) {
                            final_color_button2 = (((ColorDrawable) final_background_button2).getColor());
                        }
                        int final_color_button3 = Color.RED;
                        Drawable final_background_button3 = Button13.getBackground();
                        if (final_background_button3 instanceof ColorDrawable) {
                            final_color_button3 = (((ColorDrawable) final_background_button3).getColor());
                        }
                        int final_color_button4 = Color.RED;
                        Drawable final_background_button4 = Button14.getBackground();
                        if (final_background_button4 instanceof ColorDrawable) {
                            final_color_button4 = (((ColorDrawable) final_background_button4).getColor());
                        }
                        int final_color_button5 = Color.RED;
                        Drawable final_background_button5 = Button15.getBackground();
                        if (final_background_button5 instanceof ColorDrawable) {
                            final_color_button5 = (((ColorDrawable) final_background_button5).getColor());
                        }
                        if (b.get(0) == 1) {
                            Button11.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(0) == 2) {
                            Button11.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(0) == 3) {
                            Button11.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(0) == 4) {
                            Button11.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(0) == 5) {
                            Button11.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(1) == 1) {
                            Button12.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(1) == 2) {
                            Button12.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(1) == 3) {
                            Button12.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(1) == 4) {
                            Button12.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(1) == 5) {
                            Button12.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(2) == 1) {
                            Button13.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(2) == 2) {
                            Button13.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(2) == 3) {
                            Button13.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(2) == 4) {
                            Button13.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(2) == 5) {
                            Button13.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(3) == 1) {
                            Button14.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(3) == 2) {
                            Button14.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(3) == 3) {
                            Button14.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(3) == 4) {
                            Button14.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(3) == 5) {
                            Button14.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(4) == 1) {
                            Button15.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(4) == 2) {
                            Button15.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(4) == 3) {
                            Button15.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(4) == 4) {
                            Button15.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(4) == 5) {
                            Button15.setBackgroundColor(final_color_button5);
                        }
                        int count = Color.RED;
                        if ((final_color_button1 == count) && (final_color_button2 == count) && (final_color_button3 == count) && (final_color_button4 == count) && (final_color_button5 == count)) {
                            Toast.makeText(getApplicationContext(), "YOU WON", Toast.LENGTH_LONG).show();
                        } else {
                            View SplitLine1 = (View)findViewById(R.id.SplitLine1);
                            SplitLine1.setBackgroundColor(Color.GREEN);
                            Go1.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button21.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button22.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button23.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button24.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button25.setBackgroundColor(Color.rgb(236, 239, 241));
                        }
                        level1[0]++;
                    }
                }
            }
        });
        final int[] level2 = new int[1];
        level2[0] = 0;
        Button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level2[0] == 0&&level1[0] !=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button22 = Color.RED;
                    Drawable background_button22 = Button22.getBackground();
                    if (background_button22 instanceof ColorDrawable) {
                        color_button22 = (((ColorDrawable) background_button22).getColor());
                    }
                    int color_button23 = Color.RED;
                    Drawable background_button23 = Button23.getBackground();
                    if (background_button23 instanceof ColorDrawable) {
                        color_button23 = (((ColorDrawable) background_button23).getColor());
                    }
                    int color_button24 = Color.RED;
                    Drawable background_button24 = Button24.getBackground();
                    if (background_button24 instanceof ColorDrawable) {
                        color_button24 = (((ColorDrawable) background_button24).getColor());
                    }
                    int color_button25 = Color.RED;
                    Drawable background_button25 = Button25.getBackground();
                    if (background_button25 instanceof ColorDrawable) {
                        color_button25 = (((ColorDrawable) background_button25).getColor());
                    }
                    if (color_current_selection == color_button22 || color_current_selection == color_button23 || color_current_selection == color_button24 || color_current_selection == color_button25) {
                    } else
                        Button21.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level2[0] == 0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button23 = Color.RED;
                    Drawable background_button23 = Button23.getBackground();
                    if (background_button23 instanceof ColorDrawable) {
                        color_button23 = (((ColorDrawable) background_button23).getColor());
                    }
                    int color_button24 = Color.RED;
                    Drawable background_button24 = Button24.getBackground();
                    if (background_button24 instanceof ColorDrawable) {
                        color_button24 = (((ColorDrawable) background_button24).getColor());
                    }
                    int color_button25 = Color.RED;
                    Drawable background_button25 = Button25.getBackground();
                    if (background_button25 instanceof ColorDrawable) {
                        color_button25 = (((ColorDrawable) background_button25).getColor());
                    }
                    int color_button21 = Color.RED;
                    Drawable background_button21 = Button21.getBackground();
                    if (background_button21 instanceof ColorDrawable) {
                        color_button21 = (((ColorDrawable) background_button21).getColor());
                    }
                    if (color_current_selection == color_button21 || color_current_selection == color_button23 || color_current_selection == color_button24 || color_current_selection == color_button25) {
                    } else
                        Button22.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level2[0] == 0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button21 = Color.RED;
                    Drawable background_button21 = Button21.getBackground();
                    if (background_button21 instanceof ColorDrawable) {
                        color_button21 = (((ColorDrawable) background_button21).getColor());
                    }
                    int color_button24 = Color.RED;
                    Drawable background_button24 = Button24.getBackground();
                    if (background_button24 instanceof ColorDrawable) {
                        color_button24 = (((ColorDrawable) background_button24).getColor());
                    }
                    int color_button25 = Color.RED;
                    Drawable background_button25 = Button25.getBackground();
                    if (background_button25 instanceof ColorDrawable) {
                        color_button25 = (((ColorDrawable) background_button25).getColor());
                    }
                    int color_button22 = Color.RED;
                    Drawable background_button22 = Button22.getBackground();
                    if (background_button22 instanceof ColorDrawable) {
                        color_button22 = (((ColorDrawable) background_button22).getColor());
                    }
                    if (color_current_selection == color_button21 || color_current_selection == color_button22 || color_current_selection == color_button24 || color_current_selection == color_button25) {
                    } else
                        Button23.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level2[0] == 0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button23 = Color.RED;
                    Drawable background_button23 = Button23.getBackground();
                    if (background_button23 instanceof ColorDrawable) {
                        color_button23 = (((ColorDrawable) background_button23).getColor());
                    }
                    int color_button22 = Color.RED;
                    Drawable background_button22 = Button22.getBackground();
                    if (background_button22 instanceof ColorDrawable) {
                        color_button22 = (((ColorDrawable) background_button22).getColor());
                    }
                    int color_button25 = Color.RED;
                    Drawable background_button25 = Button25.getBackground();
                    if (background_button25 instanceof ColorDrawable) {
                        color_button25 = (((ColorDrawable) background_button25).getColor());
                    }
                    int color_button21 = Color.RED;
                    Drawable background_button21 = Button21.getBackground();
                    if (background_button21 instanceof ColorDrawable) {
                        color_button21 = (((ColorDrawable) background_button21).getColor());
                    }
                    if (color_current_selection == color_button21 || color_current_selection == color_button23 || color_current_selection == color_button22 || color_current_selection == color_button25) {
                    } else
                        Button24.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level2[0] == 0&&level1[0] !=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button23 = Color.RED;
                    Drawable background_button23 = Button23.getBackground();
                    if (background_button23 instanceof ColorDrawable) {
                        color_button23 = (((ColorDrawable) background_button23).getColor());
                    }
                    int color_button24 = Color.RED;
                    Drawable background_button24 = Button24.getBackground();
                    if (background_button24 instanceof ColorDrawable) {
                        color_button24 = (((ColorDrawable) background_button24).getColor());
                    }
                    int color_button22 = Color.RED;
                    Drawable background_button22 = Button22.getBackground();
                    if (background_button22 instanceof ColorDrawable) {
                        color_button22 = (((ColorDrawable) background_button22).getColor());
                    }
                    int color_button21 = Color.RED;
                    Drawable background_button21 = Button21.getBackground();
                    if (background_button21 instanceof ColorDrawable) {
                        color_button21 = (((ColorDrawable) background_button21).getColor());
                    }
                    if (color_current_selection == color_button21 || color_current_selection == color_button23 || color_current_selection == color_button24 || color_current_selection == color_button22) {
                    } else
                        Button25.setBackgroundColor(color_current_selection);
                }
            }
        });
        Go1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (level2[0] == 0) {

                    int final_color13 = Color.RED;
                    Drawable final_background1 = color13.getBackground();
                    if (final_background1 instanceof ColorDrawable) {
                        final_color13 = (((ColorDrawable) final_background1).getColor());
                    }
                   /* int final_color2 = Color.RED;
                    Drawable final_background2 = color2.getBackground();
                    if (final_background2 instanceof ColorDrawable) {
                        final_color2 = (((ColorDrawable) final_background2).getColor());
                    }
                    int final_color3 = Color.RED;
                    Drawable final_background3 = color3.getBackground();
                    if (final_background3 instanceof ColorDrawable) {
                        final_color3 = (((ColorDrawable) final_background3).getColor());
                    }*/
                    int final_color4 = Color.RED;
                    Drawable final_background4 = color4.getBackground();
                    if (final_background4 instanceof ColorDrawable) {
                        final_color4 = (((ColorDrawable) final_background4).getColor());
                    }
                    int final_color5 = Color.RED;
                    Drawable final_background5 = color5.getBackground();
                    if (final_background5 instanceof ColorDrawable) {
                        final_color5 = (((ColorDrawable) final_background5).getColor());
                    }
                    int final_color6 = Color.RED;
                    Drawable final_background6 = color6.getBackground();
                    if (final_background6 instanceof ColorDrawable) {
                        final_color6 = (((ColorDrawable) final_background6).getColor());
                    }
                    int final_color7 = Color.RED;
                    Drawable final_background7 = color7.getBackground();
                    if (final_background7 instanceof ColorDrawable) {
                        final_color7 = (((ColorDrawable) final_background7).getColor());
                    }
                    int final_color8 = Color.RED;
                    Drawable final_background8 = color8.getBackground();
                    if (final_background8 instanceof ColorDrawable) {
                        final_color8 = (((ColorDrawable) final_background8).getColor());
                    }
                    int final_color9 = Color.RED;
                    Drawable final_background9 = color9.getBackground();
                    if (final_background9 instanceof ColorDrawable) {
                        final_color9 = (((ColorDrawable) final_background9).getColor());
                    }
                    int final_color10 = Color.RED;
                    Drawable final_background10 = color10.getBackground();
                    if (final_background10 instanceof ColorDrawable) {
                        final_color10 = (((ColorDrawable) final_background10).getColor());
                    }
                    int final_color11 = Color.RED;
                    Drawable final_background11 = color11.getBackground();
                    if (final_background11 instanceof ColorDrawable) {
                        final_color11 = (((ColorDrawable) final_background11).getColor());
                    }
                    int final_color12 = Color.RED;
                    Drawable final_background12 = color12.getBackground();
                    if (final_background12 instanceof ColorDrawable) {
                        final_color12 = (((ColorDrawable) final_background12).getColor());
                    }
                    int final_color14 = Color.RED;
                    Drawable final_background14 = color14.getBackground();
                    if (final_background14 instanceof ColorDrawable) {
                        final_color14 = (((ColorDrawable) final_background14).getColor());
                    }
                    int final_color15 = Color.RED;
                    Drawable final_background15 = color15.getBackground();
                    if (final_background15 instanceof ColorDrawable) {
                        final_color15 = (((ColorDrawable) final_background15).getColor());
                    }
                    int final_color_button21 = Color.RED;
                    Drawable final_background_button21 = Button21.getBackground();
                    if (final_background_button21 instanceof ColorDrawable) {
                        final_color_button21 = (((ColorDrawable) final_background_button21).getColor());
                    }
                    int final_color_button22 = Color.RED;
                    Drawable final_background_button22 = Button22.getBackground();
                    if (final_background_button22 instanceof ColorDrawable) {
                        final_color_button22 = (((ColorDrawable) final_background_button22).getColor());
                    }
                    int final_color_button23 = Color.RED;
                    Drawable final_background_button23 = Button23.getBackground();
                    if (final_background_button23 instanceof ColorDrawable) {
                        final_color_button23 = (((ColorDrawable) final_background_button23).getColor());
                    }
                    int final_color_button24 = Color.RED;
                    Drawable final_background_button24 = Button24.getBackground();
                    if (final_background_button24 instanceof ColorDrawable) {
                        final_color_button24 = (((ColorDrawable) final_background_button24).getColor());
                    }
                    int final_color_button25 = Color.RED;
                    Drawable final_background_button25 = Button25.getBackground();
                    if (final_background_button25 instanceof ColorDrawable) {
                        final_color_button25 = (((ColorDrawable) final_background_button25).getColor());
                    }
                    if (final_color_button21 != color_default && final_color_button22 != color_default && final_color_button23 != color_default && final_color_button24 != color_default && final_color_button25 != color_default&&final_color_button21!=color_black&&final_color_button22!=color_black&&final_color_button23!=color_black&&final_color_button24!=color_black&&final_color_button25!=color_black) {
                        a12.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button31.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button32.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button33.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button34.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button35.setBackgroundColor(Color.rgb(236, 239, 241));
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 13) {
                                if (final_color_button21 == final_color13)
                                    Button31.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13) {
                                if (final_color_button21 == final_color13)
                                    Button31.setBackgroundColor(Color.CYAN);
                            }
                        }
                        /*for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 2) {
                                if (final_color_button21 == final_color2)
                                    Button31.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2) {
                                if (final_color_button21 == final_color2)
                                    Button31.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 3) {
                                if (final_color_button21 == final_color3)
                                    Button31.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3) {
                                if (final_color_button21 == final_color3)
                                    Button31.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 4) {
                                if (final_color_button21 == final_color4)
                                    Button31.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4) {
                                if (final_color_button21 == final_color4)
                                    Button31.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 5) {
                                if (final_color_button21 == final_color5)
                                    Button31.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5) {
                                if (final_color_button21 == final_color5)
                                    Button31.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 6) {
                                if (final_color_button21 == final_color6)
                                    Button31.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6) {
                                if (final_color_button21 == final_color6)
                                    Button31.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 7) {
                                if (final_color_button21 == final_color7)
                                    Button31.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7) {
                                if (final_color_button21 == final_color7)
                                    Button31.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 8) {
                                if (final_color_button21 == final_color8)
                                    Button31.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8) {
                                if (final_color_button21 == final_color8)
                                    Button31.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 9) {
                                if (final_color_button21 == final_color9)
                                    Button31.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9) {
                                if (final_color_button21 == final_color9)
                                    Button31.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 10) {
                                if (final_color_button21 == final_color10)
                                    Button31.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10) {
                                if (final_color_button21 == final_color10)
                                    Button31.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 11) {
                                if (final_color_button21 == final_color11)
                                    Button31.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11) {
                                if (final_color_button21 == final_color11)
                                    Button31.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 12) {
                                if (final_color_button21 == final_color12)
                                    Button31.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12) {
                                if (final_color_button21 == final_color12)
                                    Button31.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 14) {
                                if (final_color_button21 == final_color14)
                                    Button31.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14) {
                                if (final_color_button21 == final_color14)
                                    Button31.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 15) {
                                if (final_color_button21 == final_color15)
                                    Button31.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15) {
                                if (final_color_button21 == final_color15)
                                    Button31.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 13) {
                                if (final_color_button22 == final_color13)
                                    Button32.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13 && x != 1) {
                                if (final_color_button22 == final_color13)
                                    Button32.setBackgroundColor(Color.CYAN);
                            }
                        }
                       /* for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 2) {
                                if (final_color_button22 == final_color2)
                                    Button32.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2 && x != 1) {
                                if (final_color_button22 == final_color2)
                                    Button32.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 3) {
                                if (final_color_button22 == final_color3)
                                    Button32.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3 && x != 1) {
                                if (final_color_button22 == final_color3)
                                    Button32.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 4) {
                                if (final_color_button22 == final_color4)
                                    Button32.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4 && x != 1) {
                                if (final_color_button22 == final_color4)
                                    Button32.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 5) {
                                if (final_color_button22 == final_color5)
                                    Button32.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5 && x != 1) {
                                if (final_color_button22 == final_color5)
                                    Button32.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 6) {
                                if (final_color_button22 == final_color6)
                                    Button32.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6 && x != 1) {
                                if (final_color_button22 == final_color6)
                                    Button32.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 7) {
                                if (final_color_button22 == final_color7)
                                    Button32.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7 && x != 1) {
                                if (final_color_button22 == final_color7)
                                    Button32.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 8) {
                                if (final_color_button22 == final_color8)
                                    Button32.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8 && x != 1) {
                                if (final_color_button22 == final_color8)
                                    Button32.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 9) {
                                if (final_color_button22 == final_color9)
                                    Button32.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9 && x != 1) {
                                if (final_color_button22 == final_color9)
                                    Button32.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 10) {
                                if (final_color_button22 == final_color10)
                                    Button32.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10 && x != 1) {
                                if (final_color_button22 == final_color10)
                                    Button32.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 11) {
                                if (final_color_button22 == final_color11)
                                    Button32.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11 && x != 1) {
                                if (final_color_button22 == final_color11)
                                    Button32.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 12) {
                                if (final_color_button22 == final_color12)
                                    Button32.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12 && x != 1) {
                                if (final_color_button22 == final_color12)
                                    Button32.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 15) {
                                if (final_color_button22 == final_color15)
                                    Button32.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15 && x != 1) {
                                if (final_color_button22 == final_color15)
                                    Button32.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 14) {
                                if (final_color_button22 == final_color14)
                                    Button32.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14 && x != 1) {
                                if (final_color_button22 == final_color14)
                                    Button32.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 13) {
                                if (final_color_button23 == final_color13)
                                    Button33.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13 && x != 2) {
                                if (final_color_button23 == final_color13)
                                    Button33.setBackgroundColor(Color.CYAN);
                            }
                        }
                        /*for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 2) {
                                if (final_color_button23 == final_color2)
                                    Button33.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2 && x != 2) {
                                if (final_color_button23 == final_color2)
                                    Button33.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 3) {
                                if (final_color_button23 == final_color3)
                                    Button33.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3 && x != 2) {
                                if (final_color_button23 == final_color3)
                                    Button33.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 4) {
                                if (final_color_button23 == final_color4)
                                    Button33.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4 && x != 2) {
                                if (final_color_button23 == final_color4)
                                    Button33.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 5) {
                                if (final_color_button23 == final_color5)
                                    Button33.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5 && x != 2) {
                                if (final_color_button23 == final_color5)
                                    Button33.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 6) {
                                if (final_color_button23 == final_color6)
                                    Button33.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6 && x != 2) {
                                if (final_color_button23 == final_color6)
                                    Button33.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 7) {
                                if (final_color_button23 == final_color7)
                                    Button33.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7 && x != 2) {
                                if (final_color_button23 == final_color7)
                                    Button33.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 8) {
                                if (final_color_button23 == final_color8)
                                    Button33.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8 && x != 2) {
                                if (final_color_button23 == final_color8)
                                    Button33.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 9) {
                                if (final_color_button23 == final_color9)
                                    Button33.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9 && x != 2) {
                                if (final_color_button23 == final_color9)
                                    Button33.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 10) {
                                if (final_color_button23 == final_color10)
                                    Button33.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10 && x != 2) {
                                if (final_color_button23 == final_color10)
                                    Button33.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 11) {
                                if (final_color_button23 == final_color11)
                                    Button33.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11 && x != 2) {
                                if (final_color_button23 == final_color11)
                                    Button33.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 12) {
                                if (final_color_button23 == final_color12)
                                    Button33.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12 && x != 2) {
                                if (final_color_button23 == final_color12)
                                    Button33.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 14) {
                                if (final_color_button23 == final_color14)
                                    Button33.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14 && x != 2) {
                                if (final_color_button23 == final_color14)
                                    Button33.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 15) {
                                if (final_color_button23 == final_color15)
                                    Button33.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15 && x != 2) {
                                if (final_color_button23 == final_color15)
                                    Button33.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 13) {
                                if (final_color_button24 == final_color13)
                                    Button34.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13 && x != 3) {
                                if (final_color_button24 == final_color13)
                                    Button34.setBackgroundColor(Color.CYAN);
                            }
                        }
                        /*for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 2) {
                                if (final_color_button24 == final_color2)
                                    Button34.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2 && x != 3) {
                                if (final_color_button24 == final_color2)
                                    Button34.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 3) {
                                if (final_color_button24 == final_color3)
                                    Button34.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3 && x != 3) {
                                if (final_color_button24 == final_color3)
                                    Button34.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 4) {
                                if (final_color_button24 == final_color4)
                                    Button34.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4 && x != 3) {
                                if (final_color_button24 == final_color4)
                                    Button34.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 5) {
                                if (final_color_button24 == final_color5)
                                    Button34.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5 && x != 3) {
                                if (final_color_button24 == final_color5)
                                    Button34.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 6) {
                                if (final_color_button24 == final_color6)
                                    Button34.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6 && x != 3) {
                                if (final_color_button24 == final_color6)
                                    Button34.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 7) {
                                if (final_color_button24 == final_color7)
                                    Button34.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7 && x != 3) {
                                if (final_color_button24 == final_color7)
                                    Button34.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 8) {
                                if (final_color_button24 == final_color8)
                                    Button34.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8 && x != 3) {
                                if (final_color_button24 == final_color8)
                                    Button34.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 9) {
                                if (final_color_button24 == final_color9)
                                    Button34.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9 && x != 3) {
                                if (final_color_button24 == final_color9)
                                    Button34.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 10) {
                                if (final_color_button24 == final_color10)
                                    Button34.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10 && x != 3) {
                                if (final_color_button24 == final_color10)
                                    Button34.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 11) {
                                if (final_color_button24 == final_color11)
                                    Button34.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11 && x != 3) {
                                if (final_color_button24 == final_color11)
                                    Button34.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 12) {
                                if (final_color_button24 == final_color12)
                                    Button34.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12 && x != 3) {
                                if (final_color_button24 == final_color12)
                                    Button34.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 14) {
                                if (final_color_button24 == final_color14)
                                    Button34.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14 && x != 3) {
                                if (final_color_button24 == final_color14)
                                    Button34.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 15) {
                                if (final_color_button24 == final_color15)
                                    Button34.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15 && x != 3) {
                                if (final_color_button24 == final_color15)
                                    Button34.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 13) {
                                if (final_color_button25 == final_color13)
                                    Button35.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13) {
                                if (final_color_button25 == final_color13)
                                    Button35.setBackgroundColor(Color.CYAN);
                            }
                        }
                        /*for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 2) {
                                if (final_color_button25 == final_color2)
                                    Button35.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2) {
                                if (final_color_button25 == final_color2)
                                    Button35.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 3) {
                                if (final_color_button25 == final_color3)
                                    Button35.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3) {
                                if (final_color_button25 == final_color3)
                                    Button35.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 4) {
                                if (final_color_button25 == final_color4)
                                    Button35.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4) {
                                if (final_color_button25 == final_color4)
                                    Button35.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 5) {
                                if (final_color_button25 == final_color5)
                                    Button35.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5) {
                                if (final_color_button25 == final_color5)
                                    Button35.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 6) {
                                if (final_color_button25 == final_color6)
                                    Button35.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6) {
                                if (final_color_button25 == final_color6)
                                    Button35.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 7) {
                                if (final_color_button25 == final_color7)
                                    Button35.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7) {
                                if (final_color_button25 == final_color7)
                                    Button35.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 8) {
                                if (final_color_button25 == final_color8)
                                    Button35.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8) {
                                if (final_color_button25 == final_color8)
                                    Button35.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 9) {
                                if (final_color_button25 == final_color9)
                                    Button35.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9) {
                                if (final_color_button25 == final_color9)
                                    Button35.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 10) {
                                if (final_color_button25 == final_color10)
                                    Button35.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10) {
                                if (final_color_button25 == final_color10)
                                    Button35.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 11) {
                                if (final_color_button25 == final_color11)
                                    Button35.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11) {
                                if (final_color_button25 == final_color11)
                                    Button35.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 12) {
                                if (final_color_button25 == final_color12)
                                    Button35.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12) {
                                if (final_color_button25 == final_color12)
                                    Button35.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 14) {
                                if (final_color_button25 == final_color14)
                                    Button35.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14) {
                                if (final_color_button25 == final_color14)
                                    Button35.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 15) {
                                if (final_color_button25 == final_color15)
                                    Button35.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15) {
                                if (final_color_button25 == final_color15)
                                    Button35.setBackgroundColor(Color.CYAN);
                            }
                        }
                        final List<Integer> b = new ArrayList<>();
                        Random random = new Random(System.currentTimeMillis());
                        for (int i = 0; i < 5; i++) {
                            while (true) {
                                Integer next = random.nextInt(5) + 1;
                                if (!b.contains(next)) {
                                    b.add(next);
                                    break;
                                }
                            }
                        }
                        int final_color_button1 = Color.RED;
                        Drawable final_background_button1 = Button31.getBackground();
                        if (final_background_button1 instanceof ColorDrawable) {
                            final_color_button1 = (((ColorDrawable) final_background_button1).getColor());
                        }
                        int final_color_button2 = Color.RED;
                        Drawable final_background_button2 = Button32.getBackground();
                        if (final_background_button2 instanceof ColorDrawable) {
                            final_color_button2 = (((ColorDrawable) final_background_button2).getColor());
                        }
                        int final_color_button3 = Color.RED;
                        Drawable final_background_button3 = Button33.getBackground();
                        if (final_background_button3 instanceof ColorDrawable) {
                            final_color_button3 = (((ColorDrawable) final_background_button3).getColor());
                        }
                        int final_color_button4 = Color.RED;
                        Drawable final_background_button4 = Button34.getBackground();
                        if (final_background_button4 instanceof ColorDrawable) {
                            final_color_button4 = (((ColorDrawable) final_background_button4).getColor());
                        }
                        int final_color_button5 = Color.RED;
                        Drawable final_background_button5 = Button35.getBackground();
                        if (final_background_button5 instanceof ColorDrawable) {
                            final_color_button5 = (((ColorDrawable) final_background_button5).getColor());
                        }
                        if (b.get(0) == 1) {
                            Button31.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(0) == 2) {
                            Button31.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(0) == 3) {
                            Button31.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(0) == 4) {
                            Button31.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(0) == 5) {
                            Button31.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(1) == 1) {
                            Button32.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(1) == 2) {
                            Button32.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(1) == 3) {
                            Button32.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(1) == 4) {
                            Button32.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(1) == 5) {
                            Button32.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(2) == 1) {
                            Button33.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(2) == 2) {
                            Button33.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(2) == 3) {
                            Button33.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(2) == 4) {
                            Button33.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(2) == 5) {
                            Button33.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(3) == 1) {
                            Button34.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(3) == 2) {
                            Button34.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(3) == 3) {
                            Button34.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(3) == 4) {
                            Button34.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(3) == 5) {
                            Button34.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(4) == 1) {
                            Button35.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(4) == 2) {
                            Button35.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(4) == 3) {
                            Button35.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(4) == 4) {
                            Button35.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(4) == 5) {
                            Button35.setBackgroundColor(final_color_button5);
                        }
                        int count = Color.RED;
                        if ((final_color_button1 == count) && (final_color_button2 == count) && (final_color_button3 == count) && (final_color_button4 == count) && (final_color_button5 == count)) {
                            Toast.makeText(getApplicationContext(), "YOU WON", Toast.LENGTH_LONG).show(); }
                        else {
                            View SplitLine2 = (View)findViewById(R.id.SplitLine2);
                            SplitLine2.setBackgroundColor(Color.GREEN);
                            Go2.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button41.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button42.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button43.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button44.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button45.setBackgroundColor(Color.rgb(236, 239, 241));
                        }
                        level2[0]++;
                    }
                }
            }
        });
        final int[] level3 = new int[1];
        level3[0] = 0;
        Button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level3[0] == 0&&level2[0]!=0&&level1[0]!=0 ) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button42 = Color.RED;
                    Drawable background_button42 = Button42.getBackground();
                    if (background_button42 instanceof ColorDrawable) {
                        color_button42 = (((ColorDrawable) background_button42).getColor());
                    }
                    int color_button43 = Color.RED;
                    Drawable background_button43 = Button43.getBackground();
                    if (background_button43 instanceof ColorDrawable) {
                        color_button43 = (((ColorDrawable) background_button43).getColor());
                    }
                    int color_button44 = Color.RED;
                    Drawable background_button44 = Button44.getBackground();
                    if (background_button44 instanceof ColorDrawable) {
                        color_button44 = (((ColorDrawable) background_button44).getColor());
                    }
                    int color_button45 = Color.RED;
                    Drawable background_button45 = Button45.getBackground();
                    if (background_button45 instanceof ColorDrawable) {
                        color_button45 = (((ColorDrawable) background_button45).getColor());
                    }
                    if (color_current_selection == color_button42 || color_current_selection == color_button43 || color_current_selection == color_button44 || color_current_selection == color_button45) {
                    } else
                        Button41.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level3[0] == 0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button43 = Color.RED;
                    Drawable background_button43 = Button43.getBackground();
                    if (background_button43 instanceof ColorDrawable) {
                        color_button43 = (((ColorDrawable) background_button43).getColor());
                    }
                    int color_button44 = Color.RED;
                    Drawable background_button44 = Button44.getBackground();
                    if (background_button44 instanceof ColorDrawable) {
                        color_button44 = (((ColorDrawable) background_button44).getColor());
                    }
                    int color_button45 = Color.RED;
                    Drawable background_button45 = Button45.getBackground();
                    if (background_button45 instanceof ColorDrawable) {
                        color_button45 = (((ColorDrawable) background_button45).getColor());
                    }
                    int color_button41 = Color.RED;
                    Drawable background_button41 = Button41.getBackground();
                    if (background_button41 instanceof ColorDrawable) {
                        color_button41 = (((ColorDrawable) background_button41).getColor());
                    }
                    if (color_current_selection == color_button41 || color_current_selection == color_button43 || color_current_selection == color_button44 || color_current_selection == color_button45) {
                    } else
                        Button42.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level3[0] == 0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button41 = Color.RED;
                    Drawable background_button41 = Button41.getBackground();
                    if (background_button41 instanceof ColorDrawable) {
                        color_button41 = (((ColorDrawable) background_button41).getColor());
                    }
                    int color_button44 = Color.RED;
                    Drawable background_button44 = Button44.getBackground();
                    if (background_button44 instanceof ColorDrawable) {
                        color_button44 = (((ColorDrawable) background_button44).getColor());
                    }
                    int color_button45 = Color.RED;
                    Drawable background_button45 = Button45.getBackground();
                    if (background_button45 instanceof ColorDrawable) {
                        color_button45 = (((ColorDrawable) background_button45).getColor());
                    }
                    int color_button42 = Color.RED;
                    Drawable background_button42 = Button42.getBackground();
                    if (background_button42 instanceof ColorDrawable) {
                        color_button42 = (((ColorDrawable) background_button42).getColor());
                    }
                    if (color_current_selection == color_button41 || color_current_selection == color_button42 || color_current_selection == color_button44 || color_current_selection == color_button45) {
                    } else
                        Button43.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level3[0] == 0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button43 = Color.RED;
                    Drawable background_button43 = Button43.getBackground();
                    if (background_button43 instanceof ColorDrawable) {
                        color_button43 = (((ColorDrawable) background_button43).getColor());
                    }
                    int color_button42 = Color.RED;
                    Drawable background_button42 = Button42.getBackground();
                    if (background_button42 instanceof ColorDrawable) {
                        color_button42 = (((ColorDrawable) background_button42).getColor());
                    }
                    int color_button45 = Color.RED;
                    Drawable background_button45 = Button45.getBackground();
                    if (background_button45 instanceof ColorDrawable) {
                        color_button45 = (((ColorDrawable) background_button45).getColor());
                    }
                    int color_button41 = Color.RED;
                    Drawable background_button41 = Button41.getBackground();
                    if (background_button41 instanceof ColorDrawable) {
                        color_button41 = (((ColorDrawable) background_button41).getColor());
                    }
                    if (color_current_selection == color_button41 || color_current_selection == color_button43 || color_current_selection == color_button42 || color_current_selection == color_button45) {
                    } else
                        Button44.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level3[0] == 0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button43 = Color.RED;
                    Drawable background_button43 = Button43.getBackground();
                    if (background_button43 instanceof ColorDrawable) {
                        color_button43 = (((ColorDrawable) background_button43).getColor());
                    }
                    int color_button44 = Color.RED;
                    Drawable background_button44 = Button44.getBackground();
                    if (background_button44 instanceof ColorDrawable) {
                        color_button44 = (((ColorDrawable) background_button44).getColor());
                    }
                    int color_button42 = Color.RED;
                    Drawable background_button42 = Button42.getBackground();
                    if (background_button42 instanceof ColorDrawable) {
                        color_button42 = (((ColorDrawable) background_button42).getColor());
                    }
                    int color_button41 = Color.RED;
                    Drawable background_button41 = Button41.getBackground();
                    if (background_button41 instanceof ColorDrawable) {
                        color_button41 = (((ColorDrawable) background_button41).getColor());
                    }
                    if (color_current_selection == color_button41 || color_current_selection == color_button43 || color_current_selection == color_button44 || color_current_selection == color_button42) {
                    } else
                        Button45.setBackgroundColor(color_current_selection);
                }
            }
        });
        Go2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (level3[0] == 0) {

                    int final_color13 = Color.RED;
                    Drawable final_background1 = color13.getBackground();
                    if (final_background1 instanceof ColorDrawable) {
                        final_color13 = (((ColorDrawable) final_background1).getColor());
                    }
                   /* int final_color2 = Color.RED;
                    Drawable final_background2 = color2.getBackground();
                    if (final_background2 instanceof ColorDrawable) {
                        final_color2 = (((ColorDrawable) final_background2).getColor());
                    }
                    int final_color3 = Color.RED;
                    Drawable final_background3 = color3.getBackground();
                    if (final_background3 instanceof ColorDrawable) {
                        final_color3 = (((ColorDrawable) final_background3).getColor());
                    }*/
                    int final_color4 = Color.RED;
                    Drawable final_background4 = color4.getBackground();
                    if (final_background4 instanceof ColorDrawable) {
                        final_color4 = (((ColorDrawable) final_background4).getColor());
                    }
                    int final_color5 = Color.RED;
                    Drawable final_background5 = color5.getBackground();
                    if (final_background5 instanceof ColorDrawable) {
                        final_color5 = (((ColorDrawable) final_background5).getColor());
                    }
                    int final_color6 = Color.RED;
                    Drawable final_background6 = color6.getBackground();
                    if (final_background6 instanceof ColorDrawable) {
                        final_color6 = (((ColorDrawable) final_background6).getColor());
                    }
                    int final_color7 = Color.RED;
                    Drawable final_background7 = color7.getBackground();
                    if (final_background7 instanceof ColorDrawable) {
                        final_color7 = (((ColorDrawable) final_background7).getColor());
                    }
                    int final_color8 = Color.RED;
                    Drawable final_background8 = color8.getBackground();
                    if (final_background8 instanceof ColorDrawable) {
                        final_color8 = (((ColorDrawable) final_background8).getColor());
                    }
                    int final_color9 = Color.RED;
                    Drawable final_background9 = color9.getBackground();
                    if (final_background9 instanceof ColorDrawable) {
                        final_color9 = (((ColorDrawable) final_background9).getColor());
                    }
                    int final_color10 = Color.RED;
                    Drawable final_background10 = color10.getBackground();
                    if (final_background10 instanceof ColorDrawable) {
                        final_color10 = (((ColorDrawable) final_background10).getColor());
                    }
                    int final_color11 = Color.RED;
                    Drawable final_background11 = color11.getBackground();
                    if (final_background11 instanceof ColorDrawable) {
                        final_color11 = (((ColorDrawable) final_background11).getColor());
                    }
                    int final_color12 = Color.RED;
                    Drawable final_background12 = color12.getBackground();
                    if (final_background12 instanceof ColorDrawable) {
                        final_color12 = (((ColorDrawable) final_background12).getColor());
                    }
                    int final_color14 = Color.RED;
                    Drawable final_background14 = color14.getBackground();
                    if (final_background14 instanceof ColorDrawable) {
                        final_color14 = (((ColorDrawable) final_background14).getColor());
                    }
                    int final_color15 = Color.RED;
                    Drawable final_background15 = color15.getBackground();
                    if (final_background15 instanceof ColorDrawable) {
                        final_color15 = (((ColorDrawable) final_background15).getColor());
                    }
                    int final_color_button41 = Color.RED;
                    Drawable final_background_button41 = Button41.getBackground();
                    if (final_background_button41 instanceof ColorDrawable) {
                        final_color_button41 = (((ColorDrawable) final_background_button41).getColor());
                    }
                    int final_color_button42 = Color.RED;
                    Drawable final_background_button42 = Button42.getBackground();
                    if (final_background_button42 instanceof ColorDrawable) {
                        final_color_button42 = (((ColorDrawable) final_background_button42).getColor());
                    }
                    int final_color_button43 = Color.RED;
                    Drawable final_background_button43 = Button43.getBackground();
                    if (final_background_button43 instanceof ColorDrawable) {
                        final_color_button43 = (((ColorDrawable) final_background_button43).getColor());
                    }
                    int final_color_button44 = Color.RED;
                    Drawable final_background_button44 = Button44.getBackground();
                    if (final_background_button44 instanceof ColorDrawable) {
                        final_color_button44 = (((ColorDrawable) final_background_button44).getColor());
                    }
                    int final_color_button45 = Color.RED;
                    Drawable final_background_button45 = Button45.getBackground();
                    if (final_background_button45 instanceof ColorDrawable) {
                        final_color_button45 = (((ColorDrawable) final_background_button45).getColor());
                    }
                    if (final_color_button41 != color_default && final_color_button42 != color_default && final_color_button43 != color_default && final_color_button44 != color_default && final_color_button45 != color_default&&final_color_button41!=color_black&&final_color_button42!=color_black&&final_color_button43!=color_black&&final_color_button44!=color_black&&final_color_button45!=color_black) {
                        a13.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button51.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button52.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button53.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button54.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button55.setBackgroundColor(Color.rgb(236, 239, 241));
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 13) {
                                if (final_color_button41 == final_color13)
                                    Button51.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13) {
                                if (final_color_button41 == final_color13)
                                    Button51.setBackgroundColor(Color.CYAN);
                            }
                        }
                       /* for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 2) {
                                if (final_color_button41 == final_color2)
                                    Button51.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2) {
                                if (final_color_button41 == final_color2)
                                    Button51.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 3) {
                                if (final_color_button41 == final_color3)
                                    Button51.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3) {
                                if (final_color_button41 == final_color3)
                                    Button51.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 4) {
                                if (final_color_button41 == final_color4)
                                    Button51.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4) {
                                if (final_color_button41 == final_color4)
                                    Button51.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 5) {
                                if (final_color_button41 == final_color5)
                                    Button51.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5) {
                                if (final_color_button41 == final_color5)
                                    Button51.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 6) {
                                if (final_color_button41 == final_color6)
                                    Button51.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6) {
                                if (final_color_button41 == final_color6)
                                    Button51.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 7) {
                                if (final_color_button41 == final_color7)
                                    Button51.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7) {
                                if (final_color_button41 == final_color7)
                                    Button51.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 8) {
                                if (final_color_button41 == final_color8)
                                    Button51.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8) {
                                if (final_color_button41 == final_color8)
                                    Button51.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 9) {
                                if (final_color_button41 == final_color9)
                                    Button51.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9) {
                                if (final_color_button41 == final_color9)
                                    Button51.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 10) {
                                if (final_color_button41 == final_color10)
                                    Button51.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10) {
                                if (final_color_button41 == final_color10)
                                    Button51.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 11) {
                                if (final_color_button41 == final_color11)
                                    Button51.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11) {
                                if (final_color_button41 == final_color11)
                                    Button51.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 12) {
                                if (final_color_button41 == final_color12)
                                    Button51.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12) {
                                if (final_color_button41 == final_color12)
                                    Button51.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 14) {
                                if (final_color_button41 == final_color14)
                                    Button51.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14) {
                                if (final_color_button41 == final_color14)
                                    Button51.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 15) {
                                if (final_color_button41 == final_color15)
                                    Button51.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15) {
                                if (final_color_button41 == final_color15)
                                    Button51.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 13) {
                                if (final_color_button42 == final_color13)
                                    Button52.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13 && x != 1) {
                                if (final_color_button42 == final_color13)
                                    Button52.setBackgroundColor(Color.CYAN);
                            }
                        }
                       /* for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 2) {
                                if (final_color_button42 == final_color2)
                                    Button52.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2 && x != 1) {
                                if (final_color_button42 == final_color2)
                                    Button52.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 3) {
                                if (final_color_button42 == final_color3)
                                    Button52.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3 && x != 1) {
                                if (final_color_button42 == final_color3)
                                    Button52.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 4) {
                                if (final_color_button42 == final_color4)
                                    Button52.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4 && x != 1) {
                                if (final_color_button42 == final_color4)
                                    Button52.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 5) {
                                if (final_color_button42 == final_color5)
                                    Button52.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5 && x != 1) {
                                if (final_color_button42 == final_color5)
                                    Button52.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 6) {
                                if (final_color_button42 == final_color6)
                                    Button52.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6 && x != 1) {
                                if (final_color_button42 == final_color6)
                                    Button52.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 7) {
                                if (final_color_button42 == final_color7)
                                    Button52.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7 && x != 1) {
                                if (final_color_button42 == final_color7)
                                    Button52.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 8) {
                                if (final_color_button42 == final_color8)
                                    Button52.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8 && x != 1) {
                                if (final_color_button42 == final_color8)
                                    Button52.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 9) {
                                if (final_color_button42 == final_color9)
                                    Button52.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9 && x != 1) {
                                if (final_color_button42 == final_color9)
                                    Button52.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 10) {
                                if (final_color_button42 == final_color10)
                                    Button52.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10 && x != 1) {
                                if (final_color_button42 == final_color10)
                                    Button52.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 11) {
                                if (final_color_button42 == final_color11)
                                    Button52.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11 && x != 1) {
                                if (final_color_button42 == final_color11)
                                    Button52.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 12) {
                                if (final_color_button42 == final_color12)
                                    Button52.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12 && x != 1) {
                                if (final_color_button42 == final_color12)
                                    Button52.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 14) {
                                if (final_color_button42 == final_color14)
                                    Button52.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14 && x != 1) {
                                if (final_color_button42 == final_color14)
                                    Button52.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 15) {
                                if (final_color_button42 == final_color15)
                                    Button52.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15 && x != 1) {
                                if (final_color_button42 == final_color15)
                                    Button52.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 13) {
                                if (final_color_button43 == final_color13)
                                    Button53.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13&& x != 2) {
                                if (final_color_button43 == final_color13)
                                    Button53.setBackgroundColor(Color.CYAN);
                            }
                        }
                        /*for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 2) {
                                if (final_color_button43 == final_color2)
                                    Button53.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2 && x != 2) {
                                if (final_color_button43 == final_color2)
                                    Button53.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 3) {
                                if (final_color_button43 == final_color3)
                                    Button53.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3 && x != 2) {
                                if (final_color_button43 == final_color3)
                                    Button53.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 4) {
                                if (final_color_button43 == final_color4)
                                    Button53.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4 && x != 2) {
                                if (final_color_button43 == final_color4)
                                    Button53.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 5) {
                                if (final_color_button43 == final_color5)
                                    Button53.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5 && x != 2) {
                                if (final_color_button43 == final_color5)
                                    Button53.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 6) {
                                if (final_color_button43 == final_color6)
                                    Button53.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6 && x != 2) {
                                if (final_color_button43 == final_color6)
                                    Button53.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 7) {
                                if (final_color_button43 == final_color7)
                                    Button53.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7 && x != 2) {
                                if (final_color_button43 == final_color7)
                                    Button53.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 8) {
                                if (final_color_button43 == final_color8)
                                    Button53.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8 && x != 2) {
                                if (final_color_button43 == final_color8)
                                    Button53.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 9) {
                                if (final_color_button43 == final_color9)
                                    Button53.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9 && x != 2) {
                                if (final_color_button43 == final_color9)
                                    Button53.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 10) {
                                if (final_color_button43 == final_color10)
                                    Button53.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10 && x != 2) {
                                if (final_color_button43 == final_color10)
                                    Button53.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 11) {
                                if (final_color_button43 == final_color11)
                                    Button53.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11 && x != 2) {
                                if (final_color_button43 == final_color11)
                                    Button53.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 12) {
                                if (final_color_button43 == final_color12)
                                    Button53.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12 && x != 2) {
                                if (final_color_button43 == final_color12)
                                    Button53.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 14) {
                                if (final_color_button43 == final_color14)
                                    Button53.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14&& x != 2) {
                                if (final_color_button43 == final_color14)
                                    Button53.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 15) {
                                if (final_color_button43 == final_color15)
                                    Button53.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15&& x != 2) {
                                if (final_color_button43 == final_color15)
                                    Button53.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 13) {
                                if (final_color_button44 == final_color13)
                                    Button54.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13 && x != 3) {
                                if (final_color_button44 == final_color13)
                                    Button54.setBackgroundColor(Color.CYAN);
                            }
                        }
                       /* for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 2) {
                                if (final_color_button44 == final_color2)
                                    Button54.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2 && x != 3) {
                                if (final_color_button44 == final_color2)
                                    Button54.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 3) {
                                if (final_color_button44 == final_color3)
                                    Button54.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3 && x != 3) {
                                if (final_color_button44 == final_color3)
                                    Button54.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 4) {
                                if (final_color_button44 == final_color4)
                                    Button54.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4 && x != 3) {
                                if (final_color_button44 == final_color4)
                                    Button54.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 5) {
                                if (final_color_button44 == final_color5)
                                    Button54.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5 && x != 3) {
                                if (final_color_button44 == final_color5)
                                    Button54.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 6) {
                                if (final_color_button44 == final_color6)
                                    Button54.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6 && x != 3) {
                                if (final_color_button44 == final_color6)
                                    Button54.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 7) {
                                if (final_color_button44 == final_color7)
                                    Button54.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7 && x != 3) {
                                if (final_color_button44 == final_color7)
                                    Button54.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 8) {
                                if (final_color_button44 == final_color8)
                                    Button54.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8 && x != 3) {
                                if (final_color_button44 == final_color8)
                                    Button54.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 9) {
                                if (final_color_button44 == final_color9)
                                    Button54.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9 && x != 3) {
                                if (final_color_button44 == final_color9)
                                    Button54.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 10) {
                                if (final_color_button44 == final_color10)
                                    Button54.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10 && x != 3) {
                                if (final_color_button44 == final_color10)
                                    Button54.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 11) {
                                if (final_color_button44 == final_color11)
                                    Button54.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11 && x != 3) {
                                if (final_color_button44 == final_color11)
                                    Button54.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 12) {
                                if (final_color_button44 == final_color12)
                                    Button54.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12 && x != 3) {
                                if (final_color_button44 == final_color12)
                                    Button54.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 14) {
                                if (final_color_button44 == final_color14)
                                    Button54.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14 && x != 3) {
                                if (final_color_button44 == final_color14)
                                    Button54.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 15) {
                                if (final_color_button44 == final_color15)
                                    Button54.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15 && x != 3) {
                                if (final_color_button44 == final_color15)
                                    Button54.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 13) {
                                if (final_color_button45 == final_color13)
                                    Button55.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13) {
                                if (final_color_button45 == final_color13)
                                    Button55.setBackgroundColor(Color.CYAN);
                            }
                        }
                       /* for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 2) {
                                if (final_color_button45 == final_color2)
                                    Button55.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2) {
                                if (final_color_button45 == final_color2)
                                    Button55.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 3) {
                                if (final_color_button45 == final_color3)
                                    Button55.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3) {
                                if (final_color_button45 == final_color3)
                                    Button55.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 4) {
                                if (final_color_button45 == final_color4)
                                    Button55.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4) {
                                if (final_color_button45 == final_color4)
                                    Button55.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 5) {
                                if (final_color_button45 == final_color5)
                                    Button55.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5) {
                                if (final_color_button45 == final_color5)
                                    Button55.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 6) {
                                if (final_color_button45 == final_color6)
                                    Button55.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6) {
                                if (final_color_button45 == final_color6)
                                    Button55.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 7) {
                                if (final_color_button45 == final_color7)
                                    Button55.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7) {
                                if (final_color_button45 == final_color7)
                                    Button55.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 8) {
                                if (final_color_button45 == final_color8)
                                    Button55.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8) {
                                if (final_color_button45 == final_color8)
                                    Button55.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 9) {
                                if (final_color_button45 == final_color9)
                                    Button55.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9) {
                                if (final_color_button45 == final_color9)
                                    Button55.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 10) {
                                if (final_color_button45 == final_color10)
                                    Button55.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10) {
                                if (final_color_button45 == final_color10)
                                    Button55.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 11) {
                                if (final_color_button45 == final_color11)
                                    Button55.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11) {
                                if (final_color_button45 == final_color11)
                                    Button55.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 12) {
                                if (final_color_button45 == final_color12)
                                    Button55.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12) {
                                if (final_color_button45 == final_color12)
                                    Button55.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 14) {
                                if (final_color_button45 == final_color14)
                                    Button55.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14) {
                                if (final_color_button45 == final_color14)
                                    Button55.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 15) {
                                if (final_color_button45 == final_color15)
                                    Button55.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15) {
                                if (final_color_button45 == final_color15)
                                    Button55.setBackgroundColor(Color.CYAN);
                            }
                        }
                        final List<Integer> b = new ArrayList<>();
                        Random random = new Random(System.currentTimeMillis());
                        for (int i = 0; i < 5; i++) {
                            while (true) {
                                Integer next = random.nextInt(5) + 1;
                                if (!b.contains(next)) {
                                    b.add(next);
                                    break;
                                }
                            }
                        }
                        int final_color_button1 = Color.RED;
                        Drawable final_background_button1 = Button51.getBackground();
                        if (final_background_button1 instanceof ColorDrawable) {
                            final_color_button1 = (((ColorDrawable) final_background_button1).getColor());
                        }
                        int final_color_button2 = Color.RED;
                        Drawable final_background_button2 = Button52.getBackground();
                        if (final_background_button2 instanceof ColorDrawable) {
                            final_color_button2 = (((ColorDrawable) final_background_button2).getColor());
                        }
                        int final_color_button3 = Color.RED;
                        Drawable final_background_button3 = Button53.getBackground();
                        if (final_background_button3 instanceof ColorDrawable) {
                            final_color_button3 = (((ColorDrawable) final_background_button3).getColor());
                        }
                        int final_color_button4 = Color.RED;
                        Drawable final_background_button4 = Button54.getBackground();
                        if (final_background_button4 instanceof ColorDrawable) {
                            final_color_button4 = (((ColorDrawable) final_background_button4).getColor());
                        }
                        int final_color_button5 = Color.RED;
                        Drawable final_background_button5 = Button55.getBackground();
                        if (final_background_button5 instanceof ColorDrawable) {
                            final_color_button5 = (((ColorDrawable) final_background_button5).getColor());
                        }
                        if (b.get(0) == 1) {
                            Button51.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(0) == 2) {
                            Button51.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(0) == 3) {
                            Button51.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(0) == 4) {
                            Button51.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(0) == 5) {
                            Button51.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(1) == 1) {
                            Button52.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(1) == 2) {
                            Button52.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(1) == 3) {
                            Button52.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(1) == 4) {
                            Button52.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(1) == 5) {
                            Button52.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(2) == 1) {
                            Button53.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(2) == 2) {
                            Button53.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(2) == 3) {
                            Button53.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(2) == 4) {
                            Button53.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(2) == 5) {
                            Button53.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(3) == 1) {
                            Button54.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(3) == 2) {
                            Button54.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(3) == 3) {
                            Button54.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(3) == 4) {
                            Button54.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(3) == 5) {
                            Button54.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(4) == 1) {
                            Button55.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(4) == 2) {
                            Button55.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(4) == 3) {
                            Button55.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(4) == 4) {
                            Button55.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(4) == 5) {
                            Button55.setBackgroundColor(final_color_button5);
                        }
                        int count = Color.RED;
                        if ((final_color_button1 == count) && (final_color_button2 == count) && (final_color_button3 == count) && (final_color_button4 == count) && (final_color_button5 == count)) {
                            Toast.makeText(getApplicationContext(), "YOU WON", Toast.LENGTH_LONG).show(); }
                        else {
                            View SplitLine3 = (View)findViewById(R.id.SplitLine3);
                            SplitLine3.setBackgroundColor(Color.GREEN);
                            Go3.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button61.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button62.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button63.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button64.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button65.setBackgroundColor(Color.rgb(236, 239, 241));
                        }
                        level3[0]++;
                    }
                }
            }
        });
        final int[] level4 = new int[1];
        level4[0] = 0;
        Button61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level4[0] == 0&&level3[0]!=0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button62 = Color.RED;
                    Drawable background_button62 = Button62.getBackground();
                    if (background_button62 instanceof ColorDrawable) {
                        color_button62 = (((ColorDrawable) background_button62).getColor());
                    }
                    int color_button63 = Color.RED;
                    Drawable background_button63 = Button63.getBackground();
                    if (background_button63 instanceof ColorDrawable) {
                        color_button63 = (((ColorDrawable) background_button63).getColor());
                    }
                    int color_button64 = Color.RED;
                    Drawable background_button64 = Button64.getBackground();
                    if (background_button64 instanceof ColorDrawable) {
                        color_button64 = (((ColorDrawable) background_button64).getColor());
                    }
                    int color_button65 = Color.RED;
                    Drawable background_button65 = Button65.getBackground();
                    if (background_button65 instanceof ColorDrawable) {
                        color_button65 = (((ColorDrawable) background_button65).getColor());
                    }
                    if (color_current_selection == color_button62 || color_current_selection == color_button63 || color_current_selection == color_button64 || color_current_selection == color_button65) {
                    } else
                        Button61.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level4[0] == 0&&level3[0]!=0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button63 = Color.RED;
                    Drawable background_button63 = Button63.getBackground();
                    if (background_button63 instanceof ColorDrawable) {
                        color_button63 = (((ColorDrawable) background_button63).getColor());
                    }
                    int color_button64 = Color.RED;
                    Drawable background_button64 = Button64.getBackground();
                    if (background_button64 instanceof ColorDrawable) {
                        color_button64 = (((ColorDrawable) background_button64).getColor());
                    }
                    int color_button65 = Color.RED;
                    Drawable background_button65 = Button65.getBackground();
                    if (background_button65 instanceof ColorDrawable) {
                        color_button65 = (((ColorDrawable) background_button65).getColor());
                    }
                    int color_button61 = Color.RED;
                    Drawable background_button61 = Button61.getBackground();
                    if (background_button61 instanceof ColorDrawable) {
                        color_button61 = (((ColorDrawable) background_button61).getColor());
                    }
                    if (color_current_selection == color_button61 || color_current_selection == color_button63 || color_current_selection == color_button64 || color_current_selection == color_button65) {
                    } else
                        Button62.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level4[0] == 0&&level3[0]!=0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button61 = Color.RED;
                    Drawable background_button61 = Button61.getBackground();
                    if (background_button61 instanceof ColorDrawable) {
                        color_button61 = (((ColorDrawable) background_button61).getColor());
                    }
                    int color_button64 = Color.RED;
                    Drawable background_button64 = Button64.getBackground();
                    if (background_button64 instanceof ColorDrawable) {
                        color_button64 = (((ColorDrawable) background_button64).getColor());
                    }
                    int color_button65 = Color.RED;
                    Drawable background_button65 = Button65.getBackground();
                    if (background_button65 instanceof ColorDrawable) {
                        color_button65 = (((ColorDrawable) background_button65).getColor());
                    }
                    int color_button62 = Color.RED;
                    Drawable background_button62 = Button62.getBackground();
                    if (background_button62 instanceof ColorDrawable) {
                        color_button62 = (((ColorDrawable) background_button62).getColor());
                    }
                    if (color_current_selection == color_button61 || color_current_selection == color_button62 || color_current_selection == color_button64 || color_current_selection == color_button65) {
                    } else
                        Button63.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level4[0] == 0&&level3[0]!=0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button63 = Color.RED;
                    Drawable background_button63 = Button63.getBackground();
                    if (background_button63 instanceof ColorDrawable) {
                        color_button63 = (((ColorDrawable) background_button63).getColor());
                    }
                    int color_button62 = Color.RED;
                    Drawable background_button62 = Button62.getBackground();
                    if (background_button62 instanceof ColorDrawable) {
                        color_button62 = (((ColorDrawable) background_button62).getColor());
                    }
                    int color_button65 = Color.RED;
                    Drawable background_button65 = Button65.getBackground();
                    if (background_button65 instanceof ColorDrawable) {
                        color_button65 = (((ColorDrawable) background_button65).getColor());
                    }
                    int color_button61 = Color.RED;
                    Drawable background_button61 = Button61.getBackground();
                    if (background_button61 instanceof ColorDrawable) {
                        color_button61 = (((ColorDrawable) background_button61).getColor());
                    }
                    if (color_current_selection == color_button61 || color_current_selection == color_button63 || color_current_selection == color_button62 || color_current_selection == color_button65) {
                    } else
                        Button64.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level4[0] == 0&&level3[0]!=0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button63 = Color.RED;
                    Drawable background_button63 = Button63.getBackground();
                    if (background_button63 instanceof ColorDrawable) {
                        color_button63 = (((ColorDrawable) background_button63).getColor());
                    }
                    int color_button64 = Color.RED;
                    Drawable background_button64 = Button64.getBackground();
                    if (background_button64 instanceof ColorDrawable) {
                        color_button64 = (((ColorDrawable) background_button64).getColor());
                    }
                    int color_button62 = Color.RED;
                    Drawable background_button62 = Button62.getBackground();
                    if (background_button62 instanceof ColorDrawable) {
                        color_button62 = (((ColorDrawable) background_button62).getColor());
                    }
                    int color_button61 = Color.RED;
                    Drawable background_button61 = Button61.getBackground();
                    if (background_button61 instanceof ColorDrawable) {
                        color_button61 = (((ColorDrawable) background_button61).getColor());
                    }
                    if (color_current_selection == color_button61 || color_current_selection == color_button63 || color_current_selection == color_button64 || color_current_selection == color_button62) {
                    } else
                        Button65.setBackgroundColor(color_current_selection);
                }
            }
        });
        Go3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level4[0] == 0) {

                    int final_color13 = Color.RED;
                    Drawable final_background1 = color13.getBackground();
                    if (final_background1 instanceof ColorDrawable) {
                        final_color13 = (((ColorDrawable) final_background1).getColor());
                    }
                   /* int final_color2 = Color.RED;
                    Drawable final_background2 = color2.getBackground();
                    if (final_background2 instanceof ColorDrawable) {
                        final_color2 = (((ColorDrawable) final_background2).getColor());
                    }
                    int final_color3 = Color.RED;
                    Drawable final_background3 = color3.getBackground();
                    if (final_background3 instanceof ColorDrawable) {
                        final_color3 = (((ColorDrawable) final_background3).getColor());
                    }*/
                    int final_color4 = Color.RED;
                    Drawable final_background4 = color4.getBackground();
                    if (final_background4 instanceof ColorDrawable) {
                        final_color4 = (((ColorDrawable) final_background4).getColor());
                    }
                    int final_color5 = Color.RED;
                    Drawable final_background5 = color5.getBackground();
                    if (final_background5 instanceof ColorDrawable) {
                        final_color5 = (((ColorDrawable) final_background5).getColor());
                    }
                    int final_color6 = Color.RED;
                    Drawable final_background6 = color6.getBackground();
                    if (final_background6 instanceof ColorDrawable) {
                        final_color6 = (((ColorDrawable) final_background6).getColor());
                    }
                    int final_color7 = Color.RED;
                    Drawable final_background7 = color7.getBackground();
                    if (final_background7 instanceof ColorDrawable) {
                        final_color7 = (((ColorDrawable) final_background7).getColor());
                    }
                    int final_color8 = Color.RED;
                    Drawable final_background8 = color8.getBackground();
                    if (final_background8 instanceof ColorDrawable) {
                        final_color8 = (((ColorDrawable) final_background8).getColor());
                    }
                    int final_color9 = Color.RED;
                    Drawable final_background9 = color9.getBackground();
                    if (final_background9 instanceof ColorDrawable) {
                        final_color9 = (((ColorDrawable) final_background9).getColor());
                    }
                    int final_color10 = Color.RED;
                    Drawable final_background10 = color10.getBackground();
                    if (final_background10 instanceof ColorDrawable) {
                        final_color10 = (((ColorDrawable) final_background10).getColor());
                    }
                    int final_color11 = Color.RED;
                    Drawable final_background11 = color11.getBackground();
                    if (final_background11 instanceof ColorDrawable) {
                        final_color11 = (((ColorDrawable) final_background11).getColor());
                    }
                    int final_color12 = Color.RED;
                    Drawable final_background12 = color12.getBackground();
                    if (final_background12 instanceof ColorDrawable) {
                        final_color12 = (((ColorDrawable) final_background12).getColor());
                    }
                    int final_color14 = Color.RED;
                    Drawable final_background14 = color14.getBackground();
                    if (final_background14 instanceof ColorDrawable) {
                        final_color14 = (((ColorDrawable) final_background14).getColor());
                    }
                    int final_color15 = Color.RED;
                    Drawable final_background15 = color15.getBackground();
                    if (final_background15 instanceof ColorDrawable) {
                        final_color15 = (((ColorDrawable) final_background15).getColor());
                    }
                    int final_color_button61 = Color.RED;
                    Drawable final_background_button61 = Button61.getBackground();
                    if (final_background_button61 instanceof ColorDrawable) {
                        final_color_button61 = (((ColorDrawable) final_background_button61).getColor());
                    }
                    int final_color_button62 = Color.RED;
                    Drawable final_background_button62 = Button62.getBackground();
                    if (final_background_button62 instanceof ColorDrawable) {
                        final_color_button62 = (((ColorDrawable) final_background_button62).getColor());
                    }
                    int final_color_button63 = Color.RED;
                    Drawable final_background_button63 = Button63.getBackground();
                    if (final_background_button63 instanceof ColorDrawable) {
                        final_color_button63 = (((ColorDrawable) final_background_button63).getColor());
                    }
                    int final_color_button64 = Color.RED;
                    Drawable final_background_button64 = Button64.getBackground();
                    if (final_background_button64 instanceof ColorDrawable) {
                        final_color_button64 = (((ColorDrawable) final_background_button64).getColor());
                    }
                    int final_color_button65 = Color.RED;
                    Drawable final_background_button65 = Button65.getBackground();
                    if (final_background_button65 instanceof ColorDrawable) {
                        final_color_button65 = (((ColorDrawable) final_background_button65).getColor());
                    }
                    if (final_color_button61 != color_default && final_color_button62 != color_default && final_color_button63 != color_default && final_color_button64 != color_default && final_color_button65 != color_default&&final_color_button61!=color_black&&final_color_button62!=color_black&&final_color_button63!=color_black&&final_color_button64!=color_black&&final_color_button65!=color_black) {
                        a14.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button71.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button72.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button73.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button74.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button75.setBackgroundColor(Color.rgb(236, 239, 241));
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 13) {
                                if (final_color_button61 == final_color13)
                                    Button71.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13) {
                                if (final_color_button61 == final_color13)
                                    Button71.setBackgroundColor(Color.CYAN);
                            }
                        }
                        /*for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 2) {
                                if (final_color_button61 == final_color2)
                                    Button71.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2) {
                                if (final_color_button61 == final_color2)
                                    Button71.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 3) {
                                if (final_color_button61 == final_color3)
                                    Button71.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3) {
                                if (final_color_button61 == final_color3)
                                    Button71.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 4) {
                                if (final_color_button61 == final_color4)
                                    Button71.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4) {
                                if (final_color_button61 == final_color4)
                                    Button71.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 5) {
                                if (final_color_button61 == final_color5)
                                    Button71.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5) {
                                if (final_color_button61 == final_color5)
                                    Button71.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 6) {
                                if (final_color_button61 == final_color6)
                                    Button71.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6) {
                                if (final_color_button61 == final_color6)
                                    Button71.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 7) {
                                if (final_color_button61 == final_color7)
                                    Button71.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7) {
                                if (final_color_button61 == final_color7)
                                    Button71.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 8) {
                                if (final_color_button61 == final_color8)
                                    Button71.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8) {
                                if (final_color_button61 == final_color8)
                                    Button71.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 9) {
                                if (final_color_button61 == final_color9)
                                    Button71.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9) {
                                if (final_color_button61 == final_color9)
                                    Button71.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 10) {
                                if (final_color_button61 == final_color10)
                                    Button71.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10) {
                                if (final_color_button61 == final_color10)
                                    Button71.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 11) {
                                if (final_color_button61 == final_color11)
                                    Button71.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11) {
                                if (final_color_button61 == final_color11)
                                    Button71.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 12) {
                                if (final_color_button61 == final_color12)
                                    Button71.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12) {
                                if (final_color_button61 == final_color12)
                                    Button71.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 14) {
                                if (final_color_button61 == final_color14)
                                    Button71.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14) {
                                if (final_color_button61 == final_color14)
                                    Button71.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 15) {
                                if (final_color_button61 == final_color15)
                                    Button71.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15) {
                                if (final_color_button61 == final_color15)
                                    Button71.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5 && x != 1; x++) {
                            if (a.get(1) == 13) {
                                if (final_color_button62 == final_color13)
                                    Button72.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13) {
                                if (final_color_button62 == final_color13)
                                    Button72.setBackgroundColor(Color.CYAN);
                            }
                        }
                       /* for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 2) {
                                if (final_color_button62 == final_color2)
                                    Button72.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2 && x != 1) {
                                if (final_color_button62 == final_color2)
                                    Button72.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 3) {
                                if (final_color_button62 == final_color3)
                                    Button72.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3 && x != 1) {
                                if (final_color_button62 == final_color3)
                                    Button72.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 4) {
                                if (final_color_button62 == final_color4)
                                    Button72.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4 && x != 1) {
                                if (final_color_button62 == final_color4)
                                    Button72.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 5) {
                                if (final_color_button62 == final_color5)
                                    Button72.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5 && x != 1) {
                                if (final_color_button62 == final_color5)
                                    Button72.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 6) {
                                if (final_color_button62 == final_color6)
                                    Button72.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6 && x != 1) {
                                if (final_color_button62 == final_color6)
                                    Button72.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 7) {
                                if (final_color_button62 == final_color7)
                                    Button72.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7 && x != 1) {
                                if (final_color_button62 == final_color7)
                                    Button72.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 8) {
                                if (final_color_button62 == final_color8)
                                    Button72.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8 && x != 1) {
                                if (final_color_button62 == final_color8)
                                    Button72.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 9) {
                                if (final_color_button62 == final_color9)
                                    Button72.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9 && x != 1) {
                                if (final_color_button62 == final_color9)
                                    Button72.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 10) {
                                if (final_color_button62 == final_color10)
                                    Button72.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10 && x != 1) {
                                if (final_color_button62 == final_color10)
                                    Button72.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 11) {
                                if (final_color_button62 == final_color11)
                                    Button72.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11 && x != 1) {
                                if (final_color_button62 == final_color11)
                                    Button72.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 12) {
                                if (final_color_button62 == final_color12)
                                    Button72.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12 && x != 1) {
                                if (final_color_button62 == final_color12)
                                    Button72.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5 && x != 1; x++) {
                            if (a.get(1) == 14) {
                                if (final_color_button62 == final_color14)
                                    Button72.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14) {
                                if (final_color_button62 == final_color14)
                                    Button72.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5 && x != 1; x++) {
                            if (a.get(1) == 15) {
                                if (final_color_button62 == final_color15)
                                    Button72.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15) {
                                if (final_color_button62 == final_color15)
                                    Button72.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 13) {
                                if (final_color_button63 == final_color13)
                                    Button73.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13 && x != 2) {
                                if (final_color_button63 == final_color13)
                                    Button73.setBackgroundColor(Color.CYAN);
                            }
                        }
                       /* for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 2) {
                                if (final_color_button63 == final_color2)
                                    Button73.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2 && x != 2) {
                                if (final_color_button63 == final_color2)
                                    Button73.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 3) {
                                if (final_color_button63 == final_color3)
                                    Button73.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3 && x != 2) {
                                if (final_color_button63 == final_color3)
                                    Button73.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 4) {
                                if (final_color_button63 == final_color4)
                                    Button73.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4 && x != 2) {
                                if (final_color_button63 == final_color4)
                                    Button73.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 5) {
                                if (final_color_button63 == final_color5)
                                    Button73.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5 && x != 2) {
                                if (final_color_button63 == final_color5)
                                    Button73.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 6) {
                                if (final_color_button63 == final_color6)
                                    Button73.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6 && x != 2) {
                                if (final_color_button63 == final_color6)
                                    Button73.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 7) {
                                if (final_color_button63 == final_color7)
                                    Button73.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7 && x != 2) {
                                if (final_color_button63 == final_color7)
                                    Button73.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 8) {
                                if (final_color_button63 == final_color8)
                                    Button73.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8 && x != 2) {
                                if (final_color_button63 == final_color8)
                                    Button73.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 9) {
                                if (final_color_button63 == final_color9)
                                    Button73.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9 && x != 2) {
                                if (final_color_button63 == final_color9)
                                    Button73.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 10) {
                                if (final_color_button63 == final_color10)
                                    Button73.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10 && x != 2) {
                                if (final_color_button63 == final_color10)
                                    Button73.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 11) {
                                if (final_color_button63 == final_color11)
                                    Button73.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11 && x != 2) {
                                if (final_color_button63 == final_color11)
                                    Button73.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 12) {
                                if (final_color_button63 == final_color12)
                                    Button73.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12 && x != 2) {
                                if (final_color_button63 == final_color12)
                                    Button73.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 14) {
                                if (final_color_button63 == final_color14)
                                    Button73.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14 && x != 2) {
                                if (final_color_button63 == final_color14)
                                    Button73.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 15) {
                                if (final_color_button63 == final_color15)
                                    Button73.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15 && x != 2) {
                                if (final_color_button63 == final_color15)
                                    Button73.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 13) {
                                if (final_color_button64 == final_color13)
                                    Button74.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13 && x != 3) {
                                if (final_color_button64 == final_color13)
                                    Button74.setBackgroundColor(Color.CYAN);
                            }
                        }
                        /*for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 2) {
                                if (final_color_button64 == final_color2)
                                    Button74.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2 && x != 3) {
                                if (final_color_button64 == final_color2)
                                    Button74.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 3) {
                                if (final_color_button64 == final_color3)
                                    Button74.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3 && x != 3) {
                                if (final_color_button64 == final_color3)
                                    Button74.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 4) {
                                if (final_color_button64 == final_color4)
                                    Button74.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4 && x != 3) {
                                if (final_color_button64 == final_color4)
                                    Button74.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 5) {
                                if (final_color_button64 == final_color5)
                                    Button74.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5 && x != 3) {
                                if (final_color_button64 == final_color5)
                                    Button74.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 6) {
                                if (final_color_button64 == final_color6)
                                    Button74.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6 && x != 3) {
                                if (final_color_button64 == final_color6)
                                    Button74.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 7) {
                                if (final_color_button64 == final_color7)
                                    Button74.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7 && x != 3) {
                                if (final_color_button64 == final_color7)
                                    Button74.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 8) {
                                if (final_color_button64 == final_color8)
                                    Button74.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8 && x != 3) {
                                if (final_color_button64 == final_color8)
                                    Button74.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 9) {
                                if (final_color_button64 == final_color9)
                                    Button74.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9 && x != 3) {
                                if (final_color_button64 == final_color9)
                                    Button74.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 10) {
                                if (final_color_button64 == final_color10)
                                    Button74.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10 && x != 3) {
                                if (final_color_button64 == final_color10)
                                    Button74.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 11) {
                                if (final_color_button64 == final_color11)
                                    Button74.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11 && x != 3) {
                                if (final_color_button64 == final_color11)
                                    Button74.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 12) {
                                if (final_color_button64 == final_color12)
                                    Button74.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12 && x != 3) {
                                if (final_color_button64 == final_color12)
                                    Button74.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 14) {
                                if (final_color_button64 == final_color14)
                                    Button74.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14 && x != 3) {
                                if (final_color_button64 == final_color14)
                                    Button74.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 15) {
                                if (final_color_button64 == final_color15)
                                    Button74.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15 && x != 3) {
                                if (final_color_button64 == final_color15)
                                    Button74.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 13) {
                                if (final_color_button65 == final_color13)
                                    Button75.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13) {
                                if (final_color_button65 == final_color13)
                                    Button75.setBackgroundColor(Color.CYAN);
                            }
                        }
                        /*for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 2) {
                                if (final_color_button65 == final_color2)
                                    Button75.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2) {
                                if (final_color_button65 == final_color2)
                                    Button75.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 3) {
                                if (final_color_button65 == final_color3)
                                    Button75.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3) {
                                if (final_color_button65 == final_color3)
                                    Button75.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 4) {
                                if (final_color_button65 == final_color4)
                                    Button75.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4) {
                                if (final_color_button65 == final_color4)
                                    Button75.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 5) {
                                if (final_color_button65 == final_color5)
                                    Button75.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5) {
                                if (final_color_button65 == final_color5)
                                    Button75.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 6) {
                                if (final_color_button65 == final_color6)
                                    Button75.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6) {
                                if (final_color_button65 == final_color6)
                                    Button75.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 7) {
                                if (final_color_button65 == final_color7)
                                    Button75.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7) {
                                if (final_color_button65 == final_color7)
                                    Button75.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 8) {
                                if (final_color_button65 == final_color8)
                                    Button75.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8) {
                                if (final_color_button65 == final_color8)
                                    Button75.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 9) {
                                if (final_color_button65 == final_color9)
                                    Button75.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9) {
                                if (final_color_button65 == final_color9)
                                    Button75.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 10) {
                                if (final_color_button65 == final_color10)
                                    Button75.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10) {
                                if (final_color_button65 == final_color10)
                                    Button75.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 11) {
                                if (final_color_button65 == final_color11)
                                    Button75.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11) {
                                if (final_color_button65 == final_color11)
                                    Button75.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 12) {
                                if (final_color_button65 == final_color12)
                                    Button75.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12) {
                                if (final_color_button65 == final_color12)
                                    Button75.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 14) {
                                if (final_color_button65 == final_color14)
                                    Button75.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14) {
                                if (final_color_button65 == final_color14)
                                    Button75.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 15) {
                                if (final_color_button65 == final_color15)
                                    Button75.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15) {
                                if (final_color_button65 == final_color15)
                                    Button75.setBackgroundColor(Color.CYAN);
                            }
                        }
                        final List<Integer> b = new ArrayList<>();
                        Random random = new Random(System.currentTimeMillis());
                        for (int i = 0; i < 5; i++) {
                            while (true) {
                                Integer next = random.nextInt(5) + 1;
                                if (!b.contains(next)) {
                                    b.add(next);
                                    break;
                                }
                            }
                        }
                        int final_color_button1 = Color.RED;
                        Drawable final_background_button1 = Button71.getBackground();
                        if (final_background_button1 instanceof ColorDrawable) {
                            final_color_button1 = (((ColorDrawable) final_background_button1).getColor());
                        }
                        int final_color_button2 = Color.RED;
                        Drawable final_background_button2 = Button72.getBackground();
                        if (final_background_button2 instanceof ColorDrawable) {
                            final_color_button2 = (((ColorDrawable) final_background_button2).getColor());
                        }
                        int final_color_button3 = Color.RED;
                        Drawable final_background_button3 = Button73.getBackground();
                        if (final_background_button3 instanceof ColorDrawable) {
                            final_color_button3 = (((ColorDrawable) final_background_button3).getColor());
                        }
                        int final_color_button4 = Color.RED;
                        Drawable final_background_button4 = Button74.getBackground();
                        if (final_background_button4 instanceof ColorDrawable) {
                            final_color_button4 = (((ColorDrawable) final_background_button4).getColor());
                        }
                        int final_color_button5 = Color.RED;
                        Drawable final_background_button5 = Button75.getBackground();
                        if (final_background_button5 instanceof ColorDrawable) {
                            final_color_button5 = (((ColorDrawable) final_background_button5).getColor());
                        }
                        if (b.get(0) == 1) {
                            Button71.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(0) == 2) {
                            Button71.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(0) == 3) {
                            Button71.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(0) == 4) {
                            Button71.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(0) == 5) {
                            Button71.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(1) == 1) {
                            Button72.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(1) == 2) {
                            Button72.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(1) == 3) {
                            Button72.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(1) == 4) {
                            Button72.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(1) == 5) {
                            Button72.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(2) == 1) {
                            Button73.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(2) == 2) {
                            Button73.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(2) == 3) {
                            Button73.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(2) == 4) {
                            Button73.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(2) == 5) {
                            Button73.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(3) == 1) {
                            Button74.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(3) == 2) {
                            Button74.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(3) == 3) {
                            Button74.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(3) == 4) {
                            Button74.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(3) == 5) {
                            Button74.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(4) == 1) {
                            Button75.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(4) == 2) {
                            Button75.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(4) == 3) {
                            Button75.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(4) == 4) {
                            Button75.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(4) == 5) {
                            Button75.setBackgroundColor(final_color_button5);
                        }
                        int count = Color.RED;
                        if ((final_color_button1 == count) && (final_color_button2 == count) && (final_color_button3 == count) && (final_color_button4 == count) && (final_color_button5 == count)) {
                            Toast.makeText(getApplicationContext(), "YOU WON", Toast.LENGTH_LONG).show();}
                        else {
                            View SplitLine4 = (View)findViewById(R.id.SplitLine4);
                            SplitLine4.setBackgroundColor(Color.GREEN);
                            Go4.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button81.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button82.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button83.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button84.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button85.setBackgroundColor(Color.rgb(236, 239, 241));
                        }
                        level4[0]++;
                    }
                }
            }
        });
        final int[] level5 = new int[1];
        level5[0] = 0;
        Button81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level5[0] == 0&&level4[0]!=0&&level3[0]!=0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button82 = Color.RED;
                    Drawable background_button82 = Button82.getBackground();
                    if (background_button82 instanceof ColorDrawable) {
                        color_button82 = (((ColorDrawable) background_button82).getColor());
                    }
                    int color_button83 = Color.RED;
                    Drawable background_button83 = Button83.getBackground();
                    if (background_button83 instanceof ColorDrawable) {
                        color_button83 = (((ColorDrawable) background_button83).getColor());
                    }
                    int color_button84 = Color.RED;
                    Drawable background_button84 = Button84.getBackground();
                    if (background_button84 instanceof ColorDrawable) {
                        color_button84 = (((ColorDrawable) background_button84).getColor());
                    }
                    int color_button85 = Color.RED;
                    Drawable background_button85 = Button85.getBackground();
                    if (background_button85 instanceof ColorDrawable) {
                        color_button85 = (((ColorDrawable) background_button85).getColor());
                    }
                    if (color_current_selection == color_button82 || color_current_selection == color_button83 || color_current_selection == color_button84 || color_current_selection == color_button85) {
                    } else
                        Button81.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level5[0] == 0&&level4[0]!=0&&level3[0]!=0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button83 = Color.RED;
                    Drawable background_button83 = Button83.getBackground();
                    if (background_button83 instanceof ColorDrawable) {
                        color_button83 = (((ColorDrawable) background_button83).getColor());
                    }
                    int color_button84 = Color.RED;
                    Drawable background_button84 = Button84.getBackground();
                    if (background_button84 instanceof ColorDrawable) {
                        color_button84 = (((ColorDrawable) background_button84).getColor());
                    }
                    int color_button85 = Color.RED;
                    Drawable background_button85 = Button85.getBackground();
                    if (background_button85 instanceof ColorDrawable) {
                        color_button85 = (((ColorDrawable) background_button85).getColor());
                    }
                    int color_button81 = Color.RED;
                    Drawable background_button81 = Button81.getBackground();
                    if (background_button81 instanceof ColorDrawable) {
                        color_button81 = (((ColorDrawable) background_button81).getColor());
                    }
                    if (color_current_selection == color_button81 || color_current_selection == color_button83 || color_current_selection == color_button84 || color_current_selection == color_button85) {
                    } else
                        Button82.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level5[0] == 0&&level4[0]!=0&&level3[0]!=0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button81 = Color.RED;
                    Drawable background_button81 = Button81.getBackground();
                    if (background_button81 instanceof ColorDrawable) {
                        color_button81 = (((ColorDrawable) background_button81).getColor());
                    }
                    int color_button84 = Color.RED;
                    Drawable background_button84 = Button84.getBackground();
                    if (background_button84 instanceof ColorDrawable) {
                        color_button84 = (((ColorDrawable) background_button84).getColor());
                    }
                    int color_button85 = Color.RED;
                    Drawable background_button85 = Button85.getBackground();
                    if (background_button85 instanceof ColorDrawable) {
                        color_button85 = (((ColorDrawable) background_button85).getColor());
                    }
                    int color_button82 = Color.RED;
                    Drawable background_button82 = Button82.getBackground();
                    if (background_button82 instanceof ColorDrawable) {
                        color_button82 = (((ColorDrawable) background_button82).getColor());
                    }
                    if (color_current_selection == color_button81 || color_current_selection == color_button82 || color_current_selection == color_button84 || color_current_selection == color_button85) {
                    } else
                        Button83.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level5[0] == 0&&level4[0]!=0&&level3[0]!=0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button83 = Color.RED;
                    Drawable background_button83 = Button83.getBackground();
                    if (background_button83 instanceof ColorDrawable) {
                        color_button83 = (((ColorDrawable) background_button83).getColor());
                    }
                    int color_button82 = Color.RED;
                    Drawable background_button82 = Button82.getBackground();
                    if (background_button82 instanceof ColorDrawable) {
                        color_button82 = (((ColorDrawable) background_button82).getColor());
                    }
                    int color_button85 = Color.RED;
                    Drawable background_button85 = Button85.getBackground();
                    if (background_button85 instanceof ColorDrawable) {
                        color_button85 = (((ColorDrawable) background_button85).getColor());
                    }
                    int color_button81 = Color.RED;
                    Drawable background_button81 = Button81.getBackground();
                    if (background_button81 instanceof ColorDrawable) {
                        color_button81 = (((ColorDrawable) background_button81).getColor());
                    }
                    if (color_current_selection == color_button81 || color_current_selection == color_button83 || color_current_selection == color_button82 || color_current_selection == color_button85) {
                    } else
                        Button84.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level5[0] == 0&&level4[0]!=0&&level3[0]!=0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button83 = Color.RED;
                    Drawable background_button83 = Button83.getBackground();
                    if (background_button83 instanceof ColorDrawable) {
                        color_button83 = (((ColorDrawable) background_button83).getColor());
                    }
                    int color_button84 = Color.RED;
                    Drawable background_button84 = Button84.getBackground();
                    if (background_button84 instanceof ColorDrawable) {
                        color_button84 = (((ColorDrawable) background_button84).getColor());
                    }
                    int color_button82 = Color.RED;
                    Drawable background_button82 = Button82.getBackground();
                    if (background_button82 instanceof ColorDrawable) {
                        color_button82 = (((ColorDrawable) background_button82).getColor());
                    }
                    int color_button81 = Color.RED;
                    Drawable background_button81 = Button81.getBackground();
                    if (background_button81 instanceof ColorDrawable) {
                        color_button81 = (((ColorDrawable) background_button81).getColor());
                    }
                    if (color_current_selection == color_button81 || color_current_selection == color_button83 || color_current_selection == color_button84 || color_current_selection == color_button82) {
                    } else
                        Button85.setBackgroundColor(color_current_selection);
                }
            }
        });
        Go4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level5[0] == 0) {


                    int final_color13 = Color.RED;
                    Drawable final_background1 = color13.getBackground();
                    if (final_background1 instanceof ColorDrawable) {
                        final_color13 = (((ColorDrawable) final_background1).getColor());
                    }
                   /* int final_color2 = Color.RED;
                    Drawable final_background2 = color2.getBackground();
                    if (final_background2 instanceof ColorDrawable) {
                        final_color2 = (((ColorDrawable) final_background2).getColor());
                    }
                    int final_color3 = Color.RED;
                    Drawable final_background3 = color3.getBackground();
                    if (final_background3 instanceof ColorDrawable) {
                        final_color3 = (((ColorDrawable) final_background3).getColor());
                    }*/
                    int final_color4 = Color.RED;
                    Drawable final_background4 = color4.getBackground();
                    if (final_background4 instanceof ColorDrawable) {
                        final_color4 = (((ColorDrawable) final_background4).getColor());
                    }
                    int final_color5 = Color.RED;
                    Drawable final_background5 = color5.getBackground();
                    if (final_background5 instanceof ColorDrawable) {
                        final_color5 = (((ColorDrawable) final_background5).getColor());
                    }
                    int final_color6 = Color.RED;
                    Drawable final_background6 = color6.getBackground();
                    if (final_background6 instanceof ColorDrawable) {
                        final_color6 = (((ColorDrawable) final_background6).getColor());
                    }
                    int final_color7 = Color.RED;
                    Drawable final_background7 = color7.getBackground();
                    if (final_background7 instanceof ColorDrawable) {
                        final_color7 = (((ColorDrawable) final_background7).getColor());
                    }
                    int final_color8 = Color.RED;
                    Drawable final_background8 = color8.getBackground();
                    if (final_background8 instanceof ColorDrawable) {
                        final_color8 = (((ColorDrawable) final_background8).getColor());
                    }
                    int final_color9 = Color.RED;
                    Drawable final_background9 = color9.getBackground();
                    if (final_background9 instanceof ColorDrawable) {
                        final_color9 = (((ColorDrawable) final_background9).getColor());
                    }
                    int final_color10 = Color.RED;
                    Drawable final_background10 = color10.getBackground();
                    if (final_background10 instanceof ColorDrawable) {
                        final_color10 = (((ColorDrawable) final_background10).getColor());
                    }
                    int final_color11 = Color.RED;
                    Drawable final_background11 = color11.getBackground();
                    if (final_background11 instanceof ColorDrawable) {
                        final_color11 = (((ColorDrawable) final_background11).getColor());
                    }
                    int final_color12 = Color.RED;
                    Drawable final_background12 = color12.getBackground();
                    if (final_background12 instanceof ColorDrawable) {
                        final_color12 = (((ColorDrawable) final_background12).getColor());
                    }
                    int final_color14 = Color.RED;
                    Drawable final_background14 = color14.getBackground();
                    if (final_background14 instanceof ColorDrawable) {
                        final_color14 = (((ColorDrawable) final_background14).getColor());
                    }
                    int final_color15 = Color.RED;
                    Drawable final_background15 = color15.getBackground();
                    if (final_background15 instanceof ColorDrawable) {
                        final_color15 = (((ColorDrawable) final_background15).getColor());
                    }
                    int final_color_button81 = Color.RED;
                    Drawable final_background_button81 = Button81.getBackground();
                    if (final_background_button81 instanceof ColorDrawable) {
                        final_color_button81 = (((ColorDrawable) final_background_button81).getColor());
                    }
                    int final_color_button82 = Color.RED;
                    Drawable final_background_button82 = Button82.getBackground();
                    if (final_background_button82 instanceof ColorDrawable) {
                        final_color_button82 = (((ColorDrawable) final_background_button82).getColor());
                    }
                    int final_color_button83 = Color.RED;
                    Drawable final_background_button83 = Button83.getBackground();
                    if (final_background_button83 instanceof ColorDrawable) {
                        final_color_button83 = (((ColorDrawable) final_background_button83).getColor());
                    }
                    int final_color_button84 = Color.RED;
                    Drawable final_background_button84 = Button84.getBackground();
                    if (final_background_button84 instanceof ColorDrawable) {
                        final_color_button84 = (((ColorDrawable) final_background_button84).getColor());
                    }
                    int final_color_button85 = Color.RED;
                    Drawable final_background_button85 = Button85.getBackground();
                    if (final_background_button85 instanceof ColorDrawable) {
                        final_color_button85 = (((ColorDrawable) final_background_button85).getColor());
                    }
                    if (final_color_button81 != color_default && final_color_button82 != color_default && final_color_button83 != color_default && final_color_button84 != color_default && final_color_button85 != color_default&&final_color_button81!=color_black&&final_color_button82!=color_black&&final_color_button83!=color_black&&final_color_button84!=color_black&&final_color_button85!=color_black) {
                        Button91.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button92.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button93.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button94.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button95.setBackgroundColor(Color.rgb(236, 239, 241));
                        for (int x = 1; x < 5; x++) {
                            a15.setBackgroundColor(Color.rgb(236, 239, 241));
                            if (a.get(0) == 13) {
                                if (final_color_button81 == final_color13)
                                    Button91.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13) {
                                if (final_color_button81 == final_color13)
                                    Button91.setBackgroundColor(Color.CYAN);
                            }
                        }
                       /* for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 2) {
                                if (final_color_button81 == final_color2)
                                    Button91.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2) {
                                if (final_color_button81 == final_color2)
                                    Button91.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 3) {
                                if (final_color_button81 == final_color3)
                                    Button91.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3) {
                                if (final_color_button81 == final_color3)
                                    Button91.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 4) {
                                if (final_color_button81 == final_color4)
                                    Button91.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4) {
                                if (final_color_button81 == final_color4)
                                    Button91.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 5) {
                                if (final_color_button81 == final_color5)
                                    Button91.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5) {
                                if (final_color_button81 == final_color5)
                                    Button91.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 6) {
                                if (final_color_button81 == final_color6)
                                    Button91.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6) {
                                if (final_color_button81 == final_color6)
                                    Button91.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 7) {
                                if (final_color_button81 == final_color7)
                                    Button91.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7) {
                                if (final_color_button81 == final_color7)
                                    Button91.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 8) {
                                if (final_color_button81 == final_color8)
                                    Button91.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8) {
                                if (final_color_button81 == final_color8)
                                    Button91.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 9) {
                                if (final_color_button81 == final_color9)
                                    Button91.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9) {
                                if (final_color_button81 == final_color9)
                                    Button91.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 10) {
                                if (final_color_button81 == final_color10)
                                    Button91.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10) {
                                if (final_color_button81 == final_color10)
                                    Button91.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 11) {
                                if (final_color_button81 == final_color11)
                                    Button91.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11) {
                                if (final_color_button81 == final_color11)
                                    Button91.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 12) {
                                if (final_color_button81 == final_color12)
                                    Button91.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12) {
                                if (final_color_button81 == final_color12)
                                    Button91.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 14) {
                                if (final_color_button81 == final_color14)
                                    Button91.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14) {
                                if (final_color_button81 == final_color14)
                                    Button91.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 15) {
                                if (final_color_button81 == final_color15)
                                    Button91.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15) {
                                if (final_color_button81 == final_color15)
                                    Button91.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 13) {
                                if (final_color_button82 == final_color13)
                                    Button92.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13 && x != 1) {
                                if (final_color_button82 == final_color13)
                                    Button92.setBackgroundColor(Color.CYAN);
                            }
                        }
                       /* for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 2) {
                                if (final_color_button82 == final_color2)
                                    Button92.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2 && x != 1) {
                                if (final_color_button82 == final_color2)
                                    Button92.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 3) {
                                if (final_color_button82 == final_color3)
                                    Button92.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3 && x != 1) {
                                if (final_color_button82 == final_color3)
                                    Button92.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 4) {
                                if (final_color_button82 == final_color4)
                                    Button92.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4 && x != 1) {
                                if (final_color_button82 == final_color4)
                                    Button92.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 5) {
                                if (final_color_button82 == final_color5)
                                    Button92.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5 && x != 1) {
                                if (final_color_button82 == final_color5)
                                    Button92.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 6) {
                                if (final_color_button82 == final_color6)
                                    Button92.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6 && x != 1) {
                                if (final_color_button82 == final_color6)
                                    Button92.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 7) {
                                if (final_color_button82 == final_color7)
                                    Button92.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7 && x != 1) {
                                if (final_color_button82 == final_color7)
                                    Button92.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 8) {
                                if (final_color_button82 == final_color8)
                                    Button92.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8 && x != 1) {
                                if (final_color_button82 == final_color8)
                                    Button92.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 9) {
                                if (final_color_button82 == final_color9)
                                    Button92.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9 && x != 1) {
                                if (final_color_button82 == final_color9)
                                    Button92.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 10) {
                                if (final_color_button82 == final_color10)
                                    Button92.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10 && x != 1) {
                                if (final_color_button82 == final_color10)
                                    Button92.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 11) {
                                if (final_color_button82 == final_color11)
                                    Button92.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11 && x != 1) {
                                if (final_color_button82 == final_color11)
                                    Button92.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 12) {
                                if (final_color_button82 == final_color12)
                                    Button92.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12 && x != 1) {
                                if (final_color_button82 == final_color12)
                                    Button92.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 14) {
                                if (final_color_button82 == final_color14)
                                    Button92.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14 && x != 1) {
                                if (final_color_button82 == final_color14)
                                    Button92.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 15) {
                                if (final_color_button82 == final_color15)
                                    Button92.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15 && x != 1) {
                                if (final_color_button82 == final_color15)
                                    Button92.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 13) {
                                if (final_color_button83 == final_color13)
                                    Button93.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13 && x != 2) {
                                if (final_color_button83 == final_color13)
                                    Button93.setBackgroundColor(Color.CYAN);
                            }
                        }
                        /*for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 2) {
                                if (final_color_button83 == final_color2)
                                    Button93.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2 && x != 2) {
                                if (final_color_button83 == final_color2)
                                    Button93.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 3) {
                                if (final_color_button83 == final_color3)
                                    Button93.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3 && x != 2) {
                                if (final_color_button83 == final_color3)
                                    Button93.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 4) {
                                if (final_color_button83 == final_color4)
                                    Button93.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4 && x != 2) {
                                if (final_color_button83 == final_color4)
                                    Button93.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 5) {
                                if (final_color_button83 == final_color5)
                                    Button93.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5 && x != 2) {
                                if (final_color_button83 == final_color5)
                                    Button93.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 6) {
                                if (final_color_button83 == final_color6)
                                    Button93.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6 && x != 2) {
                                if (final_color_button83 == final_color6)
                                    Button93.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 7) {
                                if (final_color_button83 == final_color7)
                                    Button93.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7 && x != 2) {
                                if (final_color_button83 == final_color7)
                                    Button93.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 8) {
                                if (final_color_button83 == final_color8)
                                    Button93.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8 && x != 2) {
                                if (final_color_button83 == final_color8)
                                    Button93.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 9) {
                                if (final_color_button83 == final_color9)
                                    Button93.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9 && x != 2) {
                                if (final_color_button83 == final_color9)
                                    Button93.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 10) {
                                if (final_color_button83 == final_color10)
                                    Button93.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10 && x != 2) {
                                if (final_color_button83 == final_color10)
                                    Button93.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 11) {
                                if (final_color_button83 == final_color11)
                                    Button93.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11 && x != 2) {
                                if (final_color_button83 == final_color11)
                                    Button93.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 12) {
                                if (final_color_button83 == final_color12)
                                    Button93.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12 && x != 2) {
                                if (final_color_button83 == final_color12)
                                    Button93.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 14) {
                                if (final_color_button83 == final_color14)
                                    Button93.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14 && x != 2) {
                                if (final_color_button83 == final_color14)
                                    Button93.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 15) {
                                if (final_color_button83 == final_color15)
                                    Button93.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15 && x != 2) {
                                if (final_color_button83 == final_color15)
                                    Button93.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 13) {
                                if (final_color_button84 == final_color13)
                                    Button94.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13 && x != 3) {
                                if (final_color_button84 == final_color13)
                                    Button94.setBackgroundColor(Color.CYAN);
                            }
                        }
                        /*for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 2) {
                                if (final_color_button84 == final_color2)
                                    Button94.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2 && x != 3) {
                                if (final_color_button84 == final_color2)
                                    Button94.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 3) {
                                if (final_color_button84 == final_color3)
                                    Button94.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3 && x != 3) {
                                if (final_color_button84 == final_color3)
                                    Button94.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 4) {
                                if (final_color_button84 == final_color4)
                                    Button94.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4 && x != 3) {
                                if (final_color_button84 == final_color4)
                                    Button94.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 5) {
                                if (final_color_button84 == final_color5)
                                    Button94.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5 && x != 3) {
                                if (final_color_button84 == final_color5)
                                    Button94.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 6) {
                                if (final_color_button84 == final_color6)
                                    Button94.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6 && x != 3) {
                                if (final_color_button84 == final_color6)
                                    Button94.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 7) {
                                if (final_color_button84 == final_color7)
                                    Button94.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7 && x != 3) {
                                if (final_color_button84 == final_color7)
                                    Button94.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 8) {
                                if (final_color_button84 == final_color8)
                                    Button94.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8 && x != 3) {
                                if (final_color_button84 == final_color8)
                                    Button94.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 9) {
                                if (final_color_button84 == final_color9)
                                    Button94.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9 && x != 3) {
                                if (final_color_button84 == final_color9)
                                    Button94.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 10) {
                                if (final_color_button84 == final_color10)
                                    Button94.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10 && x != 3) {
                                if (final_color_button84 == final_color10)
                                    Button94.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 11) {
                                if (final_color_button84 == final_color11)
                                    Button94.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11 && x != 3) {
                                if (final_color_button84 == final_color11)
                                    Button94.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 12) {
                                if (final_color_button84 == final_color12)
                                    Button94.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12 && x != 3) {
                                if (final_color_button84 == final_color12)
                                    Button94.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 14) {
                                if (final_color_button84 == final_color14)
                                    Button94.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14 && x != 3) {
                                if (final_color_button84 == final_color14)
                                    Button94.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 15) {
                                if (final_color_button84 == final_color15)
                                    Button94.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15 && x != 3) {
                                if (final_color_button84 == final_color15)
                                    Button94.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 13) {
                                if (final_color_button85 == final_color13)
                                    Button95.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13) {
                                if (final_color_button85 == final_color13)
                                    Button95.setBackgroundColor(Color.CYAN);
                            }
                        }
                        /*for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 2) {
                                if (final_color_button85 == final_color2)
                                    Button95.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2) {
                                if (final_color_button85 == final_color2)
                                    Button95.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 3) {
                                if (final_color_button85 == final_color3)
                                    Button95.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3) {
                                if (final_color_button85 == final_color3)
                                    Button95.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 4) {
                                if (final_color_button85 == final_color4)
                                    Button95.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4) {
                                if (final_color_button85 == final_color4)
                                    Button95.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 5) {
                                if (final_color_button85 == final_color5)
                                    Button95.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5) {
                                if (final_color_button85 == final_color5)
                                    Button95.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 6) {
                                if (final_color_button85 == final_color6)
                                    Button95.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6) {
                                if (final_color_button85 == final_color6)
                                    Button95.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 7) {
                                if (final_color_button85 == final_color7)
                                    Button95.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7) {
                                if (final_color_button85 == final_color7)
                                    Button95.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 8) {
                                if (final_color_button85 == final_color8)
                                    Button95.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8) {
                                if (final_color_button85 == final_color8)
                                    Button95.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 9) {
                                if (final_color_button85 == final_color9)
                                    Button95.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9) {
                                if (final_color_button85 == final_color9)
                                    Button95.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 10) {
                                if (final_color_button85 == final_color10)
                                    Button95.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10) {
                                if (final_color_button85 == final_color10)
                                    Button95.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 11) {
                                if (final_color_button85 == final_color11)
                                    Button95.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11) {
                                if (final_color_button85 == final_color11)
                                    Button95.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 12) {
                                if (final_color_button85 == final_color12)
                                    Button95.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12) {
                                if (final_color_button85 == final_color12)
                                    Button95.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 14) {
                                if (final_color_button85 == final_color14)
                                    Button95.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14) {
                                if (final_color_button85 == final_color14)
                                    Button95.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 15) {
                                if (final_color_button85 == final_color15)
                                    Button95.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15) {
                                if (final_color_button85 == final_color15)
                                    Button95.setBackgroundColor(Color.CYAN);
                            }
                        }
                        final List<Integer> b = new ArrayList<>();
                        Random random = new Random(System.currentTimeMillis());
                        for (int i = 0; i < 5; i++) {
                            while (true) {
                                Integer next = random.nextInt(5) + 1;
                                if (!b.contains(next)) {
                                    b.add(next);
                                    break;
                                }
                            }
                        }
                        int final_color_button1 = Color.RED;
                        Drawable final_background_button1 = Button91.getBackground();
                        if (final_background_button1 instanceof ColorDrawable) {
                            final_color_button1 = (((ColorDrawable) final_background_button1).getColor());
                        }
                        int final_color_button2 = Color.RED;
                        Drawable final_background_button2 = Button92.getBackground();
                        if (final_background_button2 instanceof ColorDrawable) {
                            final_color_button2 = (((ColorDrawable) final_background_button2).getColor());
                        }
                        int final_color_button3 = Color.RED;
                        Drawable final_background_button3 = Button93.getBackground();
                        if (final_background_button3 instanceof ColorDrawable) {
                            final_color_button3 = (((ColorDrawable) final_background_button3).getColor());
                        }
                        int final_color_button4 = Color.RED;
                        Drawable final_background_button4 = Button94.getBackground();
                        if (final_background_button4 instanceof ColorDrawable) {
                            final_color_button4 = (((ColorDrawable) final_background_button4).getColor());
                        }
                        int final_color_button5 = Color.RED;
                        Drawable final_background_button5 = Button95.getBackground();
                        if (final_background_button5 instanceof ColorDrawable) {
                            final_color_button5 = (((ColorDrawable) final_background_button5).getColor());
                        }
                        if (b.get(0) == 1) {
                            Button91.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(0) == 2) {
                            Button91.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(0) == 3) {
                            Button91.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(0) == 4) {
                            Button91.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(0) == 5) {
                            Button91.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(1) == 1) {
                            Button92.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(1) == 2) {
                            Button92.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(1) == 3) {
                            Button92.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(1) == 4) {
                            Button92.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(1) == 5) {
                            Button92.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(2) == 1) {
                            Button93.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(2) == 2) {
                            Button93.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(2) == 3) {
                            Button93.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(2) == 4) {
                            Button93.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(2) == 5) {
                            Button93.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(3) == 1) {
                            Button94.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(3) == 2) {
                            Button94.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(3) == 3) {
                            Button94.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(3) == 4) {
                            Button94.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(3) == 5) {
                            Button94.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(4) == 1) {
                            Button95.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(4) == 2) {
                            Button95.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(4) == 3) {
                            Button95.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(4) == 4) {
                            Button95.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(4) == 5) {
                            Button95.setBackgroundColor(final_color_button5);
                        }
                        int count = Color.RED;
                        if ((final_color_button1 == count) && (final_color_button2 == count) && (final_color_button3 == count) && (final_color_button4 == count) && (final_color_button5 == count)) {
                            Toast.makeText(getApplicationContext(), "YOU WON", Toast.LENGTH_LONG).show(); }
                        else {
                            View SplitLine5 = (View)findViewById(R.id.SplitLine5);
                            SplitLine5.setBackgroundColor(Color.GREEN);
                            Go5.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button101.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button102.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button103.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button104.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button105.setBackgroundColor(Color.rgb(236, 239, 241));
                        }
                        level5[0]++;
                    }
                }
            }
        });
        final int[] level6 = new int[1];
        level6[0] = 0;
        Button101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level6[0] == 0&&level5[0]!=0&&level4[0]!=0&&level3[0]!=0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button102 = Color.RED;
                    Drawable background_button102 = Button102.getBackground();
                    if (background_button102 instanceof ColorDrawable) {
                        color_button102 = (((ColorDrawable) background_button102).getColor());
                    }
                    int color_button103 = Color.RED;
                    Drawable background_button103 = Button103.getBackground();
                    if (background_button103 instanceof ColorDrawable) {
                        color_button103 = (((ColorDrawable) background_button103).getColor());
                    }
                    int color_button104 = Color.RED;
                    Drawable background_button104 = Button104.getBackground();
                    if (background_button104 instanceof ColorDrawable) {
                        color_button104 = (((ColorDrawable) background_button104).getColor());
                    }
                    int color_button105 = Color.RED;
                    Drawable background_button105 = Button105.getBackground();
                    if (background_button105 instanceof ColorDrawable) {
                        color_button105 = (((ColorDrawable) background_button105).getColor());
                    }
                    if (color_current_selection == color_button102 || color_current_selection == color_button103 || color_current_selection == color_button104 || color_current_selection == color_button105) {
                    } else
                        Button101.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level6[0] == 0&&level5[0]!=0&&level4[0]!=0&&level3[0]!=0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button103 = Color.RED;
                    Drawable background_button103 = Button103.getBackground();
                    if (background_button103 instanceof ColorDrawable) {
                        color_button103 = (((ColorDrawable) background_button103).getColor());
                    }
                    int color_button104 = Color.RED;
                    Drawable background_button104 = Button104.getBackground();
                    if (background_button104 instanceof ColorDrawable) {
                        color_button104 = (((ColorDrawable) background_button104).getColor());
                    }
                    int color_button105 = Color.RED;
                    Drawable background_button105 = Button105.getBackground();
                    if (background_button105 instanceof ColorDrawable) {
                        color_button105 = (((ColorDrawable) background_button105).getColor());
                    }
                    int color_button101 = Color.RED;
                    Drawable background_button101 = Button101.getBackground();
                    if (background_button101 instanceof ColorDrawable) {
                        color_button101 = (((ColorDrawable) background_button101).getColor());
                    }
                    if (color_current_selection == color_button101 || color_current_selection == color_button103 || color_current_selection == color_button104 || color_current_selection == color_button105) {
                    } else
                        Button102.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level6[0] == 0&&level5[0]!=0&&level4[0]!=0&&level3[0]!=0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button101 = Color.RED;
                    Drawable background_button101 = Button101.getBackground();
                    if (background_button101 instanceof ColorDrawable) {
                        color_button101 = (((ColorDrawable) background_button101).getColor());
                    }
                    int color_button104 = Color.RED;
                    Drawable background_button104 = Button104.getBackground();
                    if (background_button104 instanceof ColorDrawable) {
                        color_button104 = (((ColorDrawable) background_button104).getColor());
                    }
                    int color_button105 = Color.RED;
                    Drawable background_button105 = Button105.getBackground();
                    if (background_button105 instanceof ColorDrawable) {
                        color_button105 = (((ColorDrawable) background_button105).getColor());
                    }
                    int color_button102 = Color.RED;
                    Drawable background_button102 = Button102.getBackground();
                    if (background_button102 instanceof ColorDrawable) {
                        color_button102 = (((ColorDrawable) background_button102).getColor());
                    }
                    if (color_current_selection == color_button101 || color_current_selection == color_button102 || color_current_selection == color_button104 || color_current_selection == color_button105) {
                    } else
                        Button103.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level6[0] == 0&&level5[0]!=0&&level4[0]!=0&&level3[0]!=0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button103 = Color.RED;
                    Drawable background_button103 = Button103.getBackground();
                    if (background_button103 instanceof ColorDrawable) {
                        color_button103 = (((ColorDrawable) background_button103).getColor());
                    }
                    int color_button102 = Color.RED;
                    Drawable background_button102 = Button102.getBackground();
                    if (background_button102 instanceof ColorDrawable) {
                        color_button102 = (((ColorDrawable) background_button102).getColor());
                    }
                    int color_button105 = Color.RED;
                    Drawable background_button105 = Button105.getBackground();
                    if (background_button105 instanceof ColorDrawable) {
                        color_button105 = (((ColorDrawable) background_button105).getColor());
                    }
                    int color_button101 = Color.RED;
                    Drawable background_button101 = Button101.getBackground();
                    if (background_button101 instanceof ColorDrawable) {
                        color_button101 = (((ColorDrawable) background_button101).getColor());
                    }
                    if (color_current_selection == color_button101 || color_current_selection == color_button103 || color_current_selection == color_button102 || color_current_selection == color_button105) {
                    } else
                        Button104.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level6[0] == 0&&level5[0]!=0&&level4[0]!=0&&level3[0]!=0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button103 = Color.RED;
                    Drawable background_button103 = Button103.getBackground();
                    if (background_button103 instanceof ColorDrawable) {
                        color_button103 = (((ColorDrawable) background_button103).getColor());
                    }
                    int color_button104 = Color.RED;
                    Drawable background_button104 = Button104.getBackground();
                    if (background_button104 instanceof ColorDrawable) {
                        color_button104 = (((ColorDrawable) background_button104).getColor());
                    }
                    int color_button102 = Color.RED;
                    Drawable background_button102 = Button102.getBackground();
                    if (background_button102 instanceof ColorDrawable) {
                        color_button102 = (((ColorDrawable) background_button102).getColor());
                    }
                    int color_button101 = Color.RED;
                    Drawable background_button101 = Button101.getBackground();
                    if (background_button101 instanceof ColorDrawable) {
                        color_button101 = (((ColorDrawable) background_button101).getColor());
                    }
                    if (color_current_selection == color_button101 || color_current_selection == color_button103 || color_current_selection == color_button104 || color_current_selection == color_button102) {
                    } else
                        Button105.setBackgroundColor(color_current_selection);
                }
            }
        });
        Go5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level6[0] == 0) {

                    int final_color13 = Color.RED;
                    Drawable final_background1 = color13.getBackground();
                    if (final_background1 instanceof ColorDrawable) {
                        final_color13 = (((ColorDrawable) final_background1).getColor());
                    }
                    /*int final_color2 = Color.RED;
                    Drawable final_background2 = color2.getBackground();
                    if (final_background2 instanceof ColorDrawable) {
                        final_color2 = (((ColorDrawable) final_background2).getColor());
                    }
                    int final_color3 = Color.RED;
                    Drawable final_background3 = color3.getBackground();
                    if (final_background3 instanceof ColorDrawable) {
                        final_color3 = (((ColorDrawable) final_background3).getColor());
                    }*/
                    int final_color4 = Color.RED;
                    Drawable final_background4 = color4.getBackground();
                    if (final_background4 instanceof ColorDrawable) {
                        final_color4 = (((ColorDrawable) final_background4).getColor());
                    }
                    int final_color5 = Color.RED;
                    Drawable final_background5 = color5.getBackground();
                    if (final_background5 instanceof ColorDrawable) {
                        final_color5 = (((ColorDrawable) final_background5).getColor());
                    }
                    int final_color6 = Color.RED;
                    Drawable final_background6 = color6.getBackground();
                    if (final_background6 instanceof ColorDrawable) {
                        final_color6 = (((ColorDrawable) final_background6).getColor());
                    }
                    int final_color7 = Color.RED;
                    Drawable final_background7 = color7.getBackground();
                    if (final_background7 instanceof ColorDrawable) {
                        final_color7 = (((ColorDrawable) final_background7).getColor());
                    }
                    int final_color8 = Color.RED;
                    Drawable final_background8 = color8.getBackground();
                    if (final_background8 instanceof ColorDrawable) {
                        final_color8 = (((ColorDrawable) final_background8).getColor());
                    }
                    int final_color9 = Color.RED;
                    Drawable final_background9 = color9.getBackground();
                    if (final_background9 instanceof ColorDrawable) {
                        final_color9 = (((ColorDrawable) final_background9).getColor());
                    }
                    int final_color10 = Color.RED;
                    Drawable final_background10 = color10.getBackground();
                    if (final_background10 instanceof ColorDrawable) {
                        final_color10 = (((ColorDrawable) final_background10).getColor());
                    }
                    int final_color11 = Color.RED;
                    Drawable final_background11 = color11.getBackground();
                    if (final_background11 instanceof ColorDrawable) {
                        final_color11 = (((ColorDrawable) final_background11).getColor());
                    }
                    int final_color12 = Color.RED;
                    Drawable final_background12 = color12.getBackground();
                    if (final_background12 instanceof ColorDrawable) {
                        final_color12 = (((ColorDrawable) final_background12).getColor());
                    }
                    int final_color14 = Color.RED;
                    Drawable final_background14 = color14.getBackground();
                    if (final_background14 instanceof ColorDrawable) {
                        final_color14 = (((ColorDrawable) final_background14).getColor());
                    }
                    int final_color15 = Color.RED;
                    Drawable final_background15 = color15.getBackground();
                    if (final_background15 instanceof ColorDrawable) {
                        final_color15 = (((ColorDrawable) final_background15).getColor());
                    }
                    int final_color_button101 = Color.RED;
                    Drawable final_background_button101 = Button101.getBackground();
                    if (final_background_button101 instanceof ColorDrawable) {
                        final_color_button101 = (((ColorDrawable) final_background_button101).getColor());
                    }
                    int final_color_button102 = Color.RED;
                    Drawable final_background_button102 = Button102.getBackground();
                    if (final_background_button102 instanceof ColorDrawable) {
                        final_color_button102 = (((ColorDrawable) final_background_button102).getColor());
                    }
                    int final_color_button103 = Color.RED;
                    Drawable final_background_button103 = Button103.getBackground();
                    if (final_background_button103 instanceof ColorDrawable) {
                        final_color_button103 = (((ColorDrawable) final_background_button103).getColor());
                    }
                    int final_color_button104 = Color.RED;
                    Drawable final_background_button104 = Button104.getBackground();
                    if (final_background_button104 instanceof ColorDrawable) {
                        final_color_button104 = (((ColorDrawable) final_background_button104).getColor());
                    }
                    int final_color_button105 = Color.RED;
                    Drawable final_background_button105 = Button105.getBackground();
                    if (final_background_button105 instanceof ColorDrawable) {
                        final_color_button105 = (((ColorDrawable) final_background_button105).getColor());
                    }
                    if (final_color_button101 != color_default && final_color_button102 != color_default && final_color_button103 != color_default && final_color_button104 != color_default && final_color_button105 != color_default&&final_color_button101!=color_black&&final_color_button102!=color_black&&final_color_button103!=color_black&&final_color_button104!=color_black&&final_color_button105!=color_black) {
                        a16.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button111.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button112.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button113.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button114.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button115.setBackgroundColor(Color.rgb(236, 239, 241));
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 13) {
                                if (final_color_button101 == final_color13)
                                    Button111.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13) {
                                if (final_color_button101 == final_color13)
                                    Button111.setBackgroundColor(Color.CYAN);
                            }
                        }
                        /*for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 2) {
                                if (final_color_button101 == final_color2)
                                    Button111.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2) {
                                if (final_color_button101 == final_color2)
                                    Button111.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 3) {
                                if (final_color_button101 == final_color3)
                                    Button111.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3) {
                                if (final_color_button101 == final_color3)
                                    Button111.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 4) {
                                if (final_color_button101 == final_color4)
                                    Button111.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4) {
                                if (final_color_button101 == final_color4)
                                    Button111.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 5) {
                                if (final_color_button101 == final_color5)
                                    Button111.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5) {
                                if (final_color_button101 == final_color5)
                                    Button111.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 6) {
                                if (final_color_button101 == final_color6)
                                    Button111.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6) {
                                if (final_color_button101 == final_color6)
                                    Button111.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 7) {
                                if (final_color_button101 == final_color7)
                                    Button111.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7) {
                                if (final_color_button101 == final_color7)
                                    Button111.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 8) {
                                if (final_color_button101 == final_color8)
                                    Button111.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8) {
                                if (final_color_button101 == final_color8)
                                    Button111.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 9) {
                                if (final_color_button101 == final_color9)
                                    Button111.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9) {
                                if (final_color_button101 == final_color9)
                                    Button111.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 10) {
                                if (final_color_button101 == final_color10)
                                    Button111.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10) {
                                if (final_color_button101 == final_color10)
                                    Button111.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 11) {
                                if (final_color_button101 == final_color11)
                                    Button111.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11) {
                                if (final_color_button101 == final_color11)
                                    Button111.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 12) {
                                if (final_color_button101 == final_color12)
                                    Button111.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12) {
                                if (final_color_button101 == final_color12)
                                    Button111.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 14) {
                                if (final_color_button101 == final_color14)
                                    Button111.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14) {
                                if (final_color_button101 == final_color14)
                                    Button111.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 15) {
                                if (final_color_button101 == final_color15)
                                    Button111.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15) {
                                if (final_color_button101 == final_color15)
                                    Button111.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 13) {
                                if (final_color_button102 == final_color13)
                                    Button112.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13 && x != 1) {
                                if (final_color_button102 == final_color13)
                                    Button112.setBackgroundColor(Color.CYAN);
                            }
                        }
                       /* for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 2) {
                                if (final_color_button102 == final_color2)
                                    Button112.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2 && x != 1) {
                                if (final_color_button102 == final_color2)
                                    Button112.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 3) {
                                if (final_color_button102 == final_color3)
                                    Button112.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3 && x != 1) {
                                if (final_color_button102 == final_color3)
                                    Button112.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 4) {
                                if (final_color_button102 == final_color4)
                                    Button112.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4 && x != 1) {
                                if (final_color_button102 == final_color4)
                                    Button112.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 5) {
                                if (final_color_button102 == final_color5)
                                    Button112.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5 && x != 1) {
                                if (final_color_button102 == final_color5)
                                    Button112.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 6) {
                                if (final_color_button102 == final_color6)
                                    Button112.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6 && x != 1) {
                                if (final_color_button102 == final_color6)
                                    Button112.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 7) {
                                if (final_color_button102 == final_color7)
                                    Button112.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7 && x != 1) {
                                if (final_color_button102 == final_color7)
                                    Button112.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 8) {
                                if (final_color_button102 == final_color8)
                                    Button112.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8 && x != 1) {
                                if (final_color_button102 == final_color8)
                                    Button112.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 9) {
                                if (final_color_button102 == final_color9)
                                    Button112.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9 && x != 1) {
                                if (final_color_button102 == final_color9)
                                    Button112.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 10) {
                                if (final_color_button102 == final_color10)
                                    Button112.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10 && x != 1) {
                                if (final_color_button102 == final_color10)
                                    Button112.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 11) {
                                if (final_color_button102 == final_color11)
                                    Button112.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11 && x != 1) {
                                if (final_color_button102 == final_color11)
                                    Button112.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 12) {
                                if (final_color_button102 == final_color12)
                                    Button112.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12 && x != 1) {
                                if (final_color_button102 == final_color12)
                                    Button112.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 14) {
                                if (final_color_button102 == final_color14)
                                    Button112.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14 && x != 1) {
                                if (final_color_button102 == final_color14)
                                    Button112.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 15) {
                                if (final_color_button102 == final_color15)
                                    Button112.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15 && x != 1) {
                                if (final_color_button102 == final_color15)
                                    Button112.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 13) {
                                if (final_color_button103 == final_color13)
                                    Button113.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13 && x != 2) {
                                if (final_color_button103 == final_color13)
                                    Button113.setBackgroundColor(Color.CYAN);
                            }
                        }
                        /*for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 2) {
                                if (final_color_button103 == final_color2)
                                    Button113.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2 && x != 2) {
                                if (final_color_button103 == final_color2)
                                    Button113.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 3) {
                                if (final_color_button103 == final_color3)
                                    Button113.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3 && x != 2) {
                                if (final_color_button103 == final_color3)
                                    Button113.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 4) {
                                if (final_color_button103 == final_color4)
                                    Button113.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4 && x != 2) {
                                if (final_color_button103 == final_color4)
                                    Button113.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 5) {
                                if (final_color_button103 == final_color5)
                                    Button93.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5 && x != 2) {
                                if (final_color_button103 == final_color5)
                                    Button113.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 6) {
                                if (final_color_button103 == final_color6)
                                    Button113.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6 && x != 2) {
                                if (final_color_button103 == final_color6)
                                    Button113.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 7) {
                                if (final_color_button103 == final_color7)
                                    Button113.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7 && x != 2) {
                                if (final_color_button103 == final_color7)
                                    Button113.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 8) {
                                if (final_color_button103 == final_color8)
                                    Button113.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8 && x != 2) {
                                if (final_color_button103 == final_color8)
                                    Button113.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 9) {
                                if (final_color_button103 == final_color9)
                                    Button113.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9 && x != 2) {
                                if (final_color_button103 == final_color9)
                                    Button113.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 10) {
                                if (final_color_button103 == final_color10)
                                    Button113.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10 && x != 2) {
                                if (final_color_button103 == final_color10)
                                    Button113.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 11) {
                                if (final_color_button103 == final_color11)
                                    Button113.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11 && x != 2) {
                                if (final_color_button103 == final_color11)
                                    Button113.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 12) {
                                if (final_color_button103 == final_color12)
                                    Button113.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12 && x != 2) {
                                if (final_color_button103 == final_color12)
                                    Button113.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 14) {
                                if (final_color_button103 == final_color14)
                                    Button113.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14 && x != 2) {
                                if (final_color_button103 == final_color14)
                                    Button113.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 15) {
                                if (final_color_button103 == final_color15)
                                    Button113.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15 && x != 2) {
                                if (final_color_button103 == final_color15)
                                    Button113.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 13) {
                                if (final_color_button104 == final_color13)
                                    Button114.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13 && x != 3) {
                                if (final_color_button104 == final_color13)
                                    Button114.setBackgroundColor(Color.CYAN);
                            }
                        }
                       /* for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 2) {
                                if (final_color_button104 == final_color2)
                                    Button114.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2 && x != 3) {
                                if (final_color_button104 == final_color2)
                                    Button114.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 3) {
                                if (final_color_button104 == final_color3)
                                    Button114.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3 && x != 3) {
                                if (final_color_button104 == final_color3)
                                    Button114.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 4) {
                                if (final_color_button104 == final_color4)
                                    Button114.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4 && x != 3) {
                                if (final_color_button104 == final_color4)
                                    Button114.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 5) {
                                if (final_color_button104 == final_color5)
                                    Button114.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5 && x != 3) {
                                if (final_color_button104 == final_color5)
                                    Button114.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 6) {
                                if (final_color_button104 == final_color6)
                                    Button114.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6 && x != 3) {
                                if (final_color_button104 == final_color6)
                                    Button114.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 7) {
                                if (final_color_button104 == final_color7)
                                    Button114.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7 && x != 3) {
                                if (final_color_button104 == final_color7)
                                    Button114.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 8) {
                                if (final_color_button104 == final_color8)
                                    Button114.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8 && x != 3) {
                                if (final_color_button104 == final_color8)
                                    Button114.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 9) {
                                if (final_color_button104 == final_color9)
                                    Button114.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9 && x != 3) {
                                if (final_color_button104 == final_color9)
                                    Button114.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 10) {
                                if (final_color_button104 == final_color10)
                                    Button114.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10 && x != 3) {
                                if (final_color_button104 == final_color10)
                                    Button114.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 11) {
                                if (final_color_button104 == final_color11)
                                    Button114.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11 && x != 3) {
                                if (final_color_button104 == final_color11)
                                    Button114.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 12) {
                                if (final_color_button104 == final_color12)
                                    Button114.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12 && x != 3) {
                                if (final_color_button104 == final_color12)
                                    Button114.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 14) {
                                if (final_color_button104 == final_color14)
                                    Button114.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14 && x != 3) {
                                if (final_color_button104 == final_color14)
                                    Button114.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 15) {
                                if (final_color_button104 == final_color15)
                                    Button114.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15 && x != 3) {
                                if (final_color_button104 == final_color15)
                                    Button114.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 13) {
                                if (final_color_button105 == final_color13)
                                    Button115.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13) {
                                if (final_color_button105 == final_color13)
                                    Button115.setBackgroundColor(Color.CYAN);
                            }
                        }
                        /*for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 2) {
                                if (final_color_button105 == final_color2)
                                    Button115.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2) {
                                if (final_color_button105 == final_color2)
                                    Button115.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 3) {
                                if (final_color_button105 == final_color3)
                                    Button115.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3) {
                                if (final_color_button105 == final_color3)
                                    Button115.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 4) {
                                if (final_color_button105 == final_color4)
                                    Button115.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4) {
                                if (final_color_button105 == final_color4)
                                    Button115.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 5) {
                                if (final_color_button105 == final_color5)
                                    Button115.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5) {
                                if (final_color_button105 == final_color5)
                                    Button115.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 6) {
                                if (final_color_button105 == final_color6)
                                    Button115.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6) {
                                if (final_color_button105 == final_color6)
                                    Button115.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 7) {
                                if (final_color_button105 == final_color7)
                                    Button115.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7) {
                                if (final_color_button105 == final_color7)
                                    Button115.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 8) {
                                if (final_color_button105 == final_color8)
                                    Button115.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8) {
                                if (final_color_button105 == final_color8)
                                    Button115.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 9) {
                                if (final_color_button105 == final_color9)
                                    Button115.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9) {
                                if (final_color_button105 == final_color9)
                                    Button115.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 10) {
                                if (final_color_button105 == final_color10)
                                    Button115.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10) {
                                if (final_color_button105 == final_color10)
                                    Button115.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 11) {
                                if (final_color_button105 == final_color11)
                                    Button115.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11) {
                                if (final_color_button105 == final_color11)
                                    Button115.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 12) {
                                if (final_color_button105 == final_color12)
                                    Button115.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12) {
                                if (final_color_button105 == final_color12)
                                    Button115.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 14) {
                                if (final_color_button105 == final_color14)
                                    Button115.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14) {
                                if (final_color_button105 == final_color14)
                                    Button115.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 15) {
                                if (final_color_button105 == final_color15)
                                    Button115.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15) {
                                if (final_color_button105 == final_color15)
                                    Button115.setBackgroundColor(Color.CYAN);
                            }
                        }
                        final List<Integer> b = new ArrayList<>();
                        Random random = new Random(System.currentTimeMillis());
                        for (int i = 0; i < 5; i++) {
                            while (true) {
                                Integer next = random.nextInt(5) + 1;
                                if (!b.contains(next)) {
                                    b.add(next);
                                    break;
                                }
                            }
                        }
                        int final_color_button1 = Color.RED;
                        Drawable final_background_button1 = Button111.getBackground();
                        if (final_background_button1 instanceof ColorDrawable) {
                            final_color_button1 = (((ColorDrawable) final_background_button1).getColor());
                        }
                        int final_color_button2 = Color.RED;
                        Drawable final_background_button2 = Button112.getBackground();
                        if (final_background_button2 instanceof ColorDrawable) {
                            final_color_button2 = (((ColorDrawable) final_background_button2).getColor());
                        }
                        int final_color_button3 = Color.RED;
                        Drawable final_background_button3 = Button113.getBackground();
                        if (final_background_button3 instanceof ColorDrawable) {
                            final_color_button3 = (((ColorDrawable) final_background_button3).getColor());
                        }
                        int final_color_button4 = Color.RED;
                        Drawable final_background_button4 = Button114.getBackground();
                        if (final_background_button4 instanceof ColorDrawable) {
                            final_color_button4 = (((ColorDrawable) final_background_button4).getColor());
                        }
                        int final_color_button5 = Color.RED;
                        Drawable final_background_button5 = Button115.getBackground();
                        if (final_background_button5 instanceof ColorDrawable) {
                            final_color_button5 = (((ColorDrawable) final_background_button5).getColor());
                        }
                        if (b.get(0) == 1) {
                            Button111.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(0) == 2) {
                            Button111.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(0) == 3) {
                            Button111.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(0) == 4) {
                            Button111.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(0) == 5) {
                            Button111.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(1) == 1) {
                            Button112.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(1) == 2) {
                            Button112.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(1) == 3) {
                            Button112.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(1) == 4) {
                            Button112.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(1) == 5) {
                            Button112.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(2) == 1) {
                            Button113.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(2) == 2) {
                            Button113.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(2) == 3) {
                            Button113.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(2) == 4) {
                            Button113.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(2) == 5) {
                            Button113.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(3) == 1) {
                            Button114.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(3) == 2) {
                            Button114.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(3) == 3) {
                            Button114.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(3) == 4) {
                            Button114.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(3) == 5) {
                            Button114.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(4) == 1) {
                            Button115.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(4) == 2) {
                            Button115.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(4) == 3) {
                            Button115.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(4) == 4) {
                            Button115.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(4) == 5) {
                            Button115.setBackgroundColor(final_color_button5);
                        }
                        int count = Color.RED;
                        if ((final_color_button1 == count) && (final_color_button2 == count) && (final_color_button3 == count) && (final_color_button4 == count) && (final_color_button5 == count)) {
                            Toast.makeText(getApplicationContext(), "YOU WON", Toast.LENGTH_LONG).show();}
                        else {
                            View SplitLine6 = (View)findViewById(R.id.SplitLine6);
                            SplitLine6.setBackgroundColor(Color.GREEN);
                            Go6.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button121.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button122.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button123.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button124.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button125.setBackgroundColor(Color.rgb(236, 239, 241));
                        }
                        level6[0]++;
                    }
                }
            }
        });
        final int[] level7 = new int[1];
        level7[0] = 0;
        Button121.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level7[0] == 0&&level6[0]!=0&&level5[0]!=0&&level4[0]!=0&&level3[0]!=0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button122 = Color.RED;
                    Drawable background_button122 = Button122.getBackground();
                    if (background_button122 instanceof ColorDrawable) {
                        color_button122 = (((ColorDrawable) background_button122).getColor());
                    }
                    int color_button123 = Color.RED;
                    Drawable background_button123 = Button123.getBackground();
                    if (background_button123 instanceof ColorDrawable) {
                        color_button123 = (((ColorDrawable) background_button123).getColor());
                    }
                    int color_button124 = Color.RED;
                    Drawable background_button124 = Button124.getBackground();
                    if (background_button124 instanceof ColorDrawable) {
                        color_button124 = (((ColorDrawable) background_button124).getColor());
                    }
                    int color_button125 = Color.RED;
                    Drawable background_button125 = Button125.getBackground();
                    if (background_button125 instanceof ColorDrawable) {
                        color_button125 = (((ColorDrawable) background_button125).getColor());
                    }
                    if (color_current_selection == color_button122 || color_current_selection == color_button123 || color_current_selection == color_button124 || color_current_selection == color_button125) {
                    } else
                        Button121.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level7[0] == 0&&level6[0]!=0&&level5[0]!=0&&level4[0]!=0&&level3[0]!=0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button123 = Color.RED;
                    Drawable background_button123 = Button123.getBackground();
                    if (background_button123 instanceof ColorDrawable) {
                        color_button123 = (((ColorDrawable) background_button123).getColor());
                    }
                    int color_button124 = Color.RED;
                    Drawable background_button124 = Button124.getBackground();
                    if (background_button124 instanceof ColorDrawable) {
                        color_button124 = (((ColorDrawable) background_button124).getColor());
                    }
                    int color_button125 = Color.RED;
                    Drawable background_button125 = Button125.getBackground();
                    if (background_button125 instanceof ColorDrawable) {
                        color_button125 = (((ColorDrawable) background_button125).getColor());
                    }
                    int color_button121 = Color.RED;
                    Drawable background_button121 = Button121.getBackground();
                    if (background_button121 instanceof ColorDrawable) {
                        color_button121 = (((ColorDrawable) background_button121).getColor());
                    }
                    if (color_current_selection == color_button121 || color_current_selection == color_button123 || color_current_selection == color_button124 || color_current_selection == color_button125) {
                    } else
                        Button122.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level7[0] == 0&&level6[0]!=0&&level5[0]!=0&&level4[0]!=0&&level3[0]!=0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button121 = Color.RED;
                    Drawable background_button121 = Button121.getBackground();
                    if (background_button121 instanceof ColorDrawable) {
                        color_button121 = (((ColorDrawable) background_button121).getColor());
                    }
                    int color_button124 = Color.RED;
                    Drawable background_button124 = Button124.getBackground();
                    if (background_button124 instanceof ColorDrawable) {
                        color_button124 = (((ColorDrawable) background_button124).getColor());
                    }
                    int color_button125 = Color.RED;
                    Drawable background_button125 = Button125.getBackground();
                    if (background_button125 instanceof ColorDrawable) {
                        color_button125 = (((ColorDrawable) background_button125).getColor());
                    }
                    int color_button122 = Color.RED;
                    Drawable background_button122 = Button122.getBackground();
                    if (background_button122 instanceof ColorDrawable) {
                        color_button122 = (((ColorDrawable) background_button122).getColor());
                    }
                    if (color_current_selection == color_button121 || color_current_selection == color_button122 || color_current_selection == color_button124 || color_current_selection == color_button125) {
                    } else
                        Button123.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button124.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level7[0] == 0&&level6[0]!=0&&level5[0]!=0&&level4[0]!=0&&level3[0]!=0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button123 = Color.RED;
                    Drawable background_button123 = Button123.getBackground();
                    if (background_button123 instanceof ColorDrawable) {
                        color_button123 = (((ColorDrawable) background_button123).getColor());
                    }
                    int color_button122 = Color.RED;
                    Drawable background_button122 = Button122.getBackground();
                    if (background_button122 instanceof ColorDrawable) {
                        color_button122 = (((ColorDrawable) background_button122).getColor());
                    }
                    int color_button125 = Color.RED;
                    Drawable background_button125 = Button125.getBackground();
                    if (background_button125 instanceof ColorDrawable) {
                        color_button125 = (((ColorDrawable) background_button125).getColor());
                    }
                    int color_button121 = Color.RED;
                    Drawable background_button121 = Button121.getBackground();
                    if (background_button121 instanceof ColorDrawable) {
                        color_button121 = (((ColorDrawable) background_button121).getColor());
                    }
                    if (color_current_selection == color_button121 || color_current_selection == color_button123 || color_current_selection == color_button122 || color_current_selection == color_button125) {
                    } else
                        Button124.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button125.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level7[0] == 0&&level6[0]!=0&&level5[0]!=0&&level4[0]!=0&&level3[0]!=0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button123 = Color.RED;
                    Drawable background_button123 = Button123.getBackground();
                    if (background_button123 instanceof ColorDrawable) {
                        color_button123 = (((ColorDrawable) background_button123).getColor());
                    }
                    int color_button124 = Color.RED;
                    Drawable background_button124 = Button124.getBackground();
                    if (background_button124 instanceof ColorDrawable) {
                        color_button124 = (((ColorDrawable) background_button124).getColor());
                    }
                    int color_button122 = Color.RED;
                    Drawable background_button122 = Button122.getBackground();
                    if (background_button122 instanceof ColorDrawable) {
                        color_button122 = (((ColorDrawable) background_button122).getColor());
                    }
                    int color_button121 = Color.RED;
                    Drawable background_button121 = Button121.getBackground();
                    if (background_button121 instanceof ColorDrawable) {
                        color_button121 = (((ColorDrawable) background_button121).getColor());
                    }
                    if (color_current_selection == color_button121 || color_current_selection == color_button123 || color_current_selection == color_button124 || color_current_selection == color_button122) {
                    } else
                        Button125.setBackgroundColor(color_current_selection);
                }
            }
        });
        Go6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level7[0] == 0) {

                    int final_color13 = Color.RED;
                    Drawable final_background1 = color13.getBackground();
                    if (final_background1 instanceof ColorDrawable) {
                        final_color13 = (((ColorDrawable) final_background1).getColor());
                    }
                    /*int final_color2 = Color.RED;
                    Drawable final_background2 = color2.getBackground();
                    if (final_background2 instanceof ColorDrawable) {
                        final_color2 = (((ColorDrawable) final_background2).getColor());
                    }
                    int final_color3 = Color.RED;
                    Drawable final_background3 = color3.getBackground();
                    if (final_background3 instanceof ColorDrawable) {
                        final_color3 = (((ColorDrawable) final_background3).getColor());
                    }*/
                    int final_color4 = Color.RED;
                    Drawable final_background4 = color4.getBackground();
                    if (final_background4 instanceof ColorDrawable) {
                        final_color4 = (((ColorDrawable) final_background4).getColor());
                    }
                    int final_color5 = Color.RED;
                    Drawable final_background5 = color5.getBackground();
                    if (final_background5 instanceof ColorDrawable) {
                        final_color5 = (((ColorDrawable) final_background5).getColor());
                    }
                    int final_color6 = Color.RED;
                    Drawable final_background6 = color6.getBackground();
                    if (final_background6 instanceof ColorDrawable) {
                        final_color6 = (((ColorDrawable) final_background6).getColor());
                    }
                    int final_color7 = Color.RED;
                    Drawable final_background7 = color7.getBackground();
                    if (final_background7 instanceof ColorDrawable) {
                        final_color7 = (((ColorDrawable) final_background7).getColor());
                    }
                    int final_color8 = Color.RED;
                    Drawable final_background8 = color8.getBackground();
                    if (final_background8 instanceof ColorDrawable) {
                        final_color8 = (((ColorDrawable) final_background8).getColor());
                    }
                    int final_color9 = Color.RED;
                    Drawable final_background9 = color9.getBackground();
                    if (final_background9 instanceof ColorDrawable) {
                        final_color9 = (((ColorDrawable) final_background9).getColor());
                    }
                    int final_color10 = Color.RED;
                    Drawable final_background10 = color10.getBackground();
                    if (final_background10 instanceof ColorDrawable) {
                        final_color10 = (((ColorDrawable) final_background10).getColor());
                    }
                    int final_color11 = Color.RED;
                    Drawable final_background11 = color11.getBackground();
                    if (final_background11 instanceof ColorDrawable) {
                        final_color11 = (((ColorDrawable) final_background11).getColor());
                    }
                    int final_color12 = Color.RED;
                    Drawable final_background12 = color12.getBackground();
                    if (final_background12 instanceof ColorDrawable) {
                        final_color12 = (((ColorDrawable) final_background12).getColor());
                    }
                    int final_color14 = Color.RED;
                    Drawable final_background14 = color14.getBackground();
                    if (final_background14 instanceof ColorDrawable) {
                        final_color14 = (((ColorDrawable) final_background14).getColor());
                    }
                    int final_color15 = Color.RED;
                    Drawable final_background15 = color15.getBackground();
                    if (final_background15 instanceof ColorDrawable) {
                        final_color15 = (((ColorDrawable) final_background15).getColor());
                    }
                    int final_color_button121 = Color.RED;
                    Drawable final_background_button121 = Button121.getBackground();
                    if (final_background_button121 instanceof ColorDrawable) {
                        final_color_button121 = (((ColorDrawable) final_background_button121).getColor());
                    }
                    int final_color_button122 = Color.RED;
                    Drawable final_background_button122 = Button122.getBackground();
                    if (final_background_button122 instanceof ColorDrawable) {
                        final_color_button122 = (((ColorDrawable) final_background_button122).getColor());
                    }
                    int final_color_button123 = Color.RED;
                    Drawable final_background_button123 = Button123.getBackground();
                    if (final_background_button123 instanceof ColorDrawable) {
                        final_color_button123 = (((ColorDrawable) final_background_button123).getColor());
                    }
                    int final_color_button124 = Color.RED;
                    Drawable final_background_button124 = Button124.getBackground();
                    if (final_background_button124 instanceof ColorDrawable) {
                        final_color_button124 = (((ColorDrawable) final_background_button124).getColor());
                    }
                    int final_color_button125 = Color.RED;
                    Drawable final_background_button125 = Button125.getBackground();
                    if (final_background_button125 instanceof ColorDrawable) {
                        final_color_button125 = (((ColorDrawable) final_background_button125).getColor());
                    }
                    if (final_color_button121 != color_default && final_color_button122 != color_default && final_color_button123 != color_default && final_color_button124 != color_default && final_color_button125 != color_default&&final_color_button121!=color_black&&final_color_button122!=color_black&&final_color_button123!=color_black&&final_color_button124!=color_black&&final_color_button125!=color_black) {
                        a17.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button131.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button132.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button133.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button134.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button135.setBackgroundColor(Color.rgb(236, 239, 241));
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 13) {
                                if (final_color_button121 == final_color13)
                                    Button131.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13) {
                                if (final_color_button121 == final_color13)
                                    Button131.setBackgroundColor(Color.CYAN);
                            }
                        }
                        /*for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 2) {
                                if (final_color_button121 == final_color2)
                                    Button131.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2) {
                                if (final_color_button121 == final_color2)
                                    Button131.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 3) {
                                if (final_color_button121 == final_color3)
                                    Button131.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3) {
                                if (final_color_button121 == final_color3)
                                    Button131.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 4) {
                                if (final_color_button121 == final_color4)
                                    Button131.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4) {
                                if (final_color_button121 == final_color4)
                                    Button131.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 5) {
                                if (final_color_button121 == final_color5)
                                    Button131.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5) {
                                if (final_color_button121 == final_color5)
                                    Button131.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 6) {
                                if (final_color_button121 == final_color6)
                                    Button131.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6) {
                                if (final_color_button121 == final_color6)
                                    Button131.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 7) {
                                if (final_color_button121 == final_color7)
                                    Button131.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7) {
                                if (final_color_button121 == final_color7)
                                    Button131.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 8) {
                                if (final_color_button121 == final_color8)
                                    Button131.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8) {
                                if (final_color_button121 == final_color8)
                                    Button131.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 9) {
                                if (final_color_button121 == final_color9)
                                    Button131.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9) {
                                if (final_color_button121 == final_color9)
                                    Button131.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 10) {
                                if (final_color_button121 == final_color10)
                                    Button131.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10) {
                                if (final_color_button121 == final_color10)
                                    Button131.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 11) {
                                if (final_color_button121 == final_color11)
                                    Button131.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11) {
                                if (final_color_button121 == final_color11)
                                    Button131.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 12) {
                                if (final_color_button121 == final_color12)
                                    Button131.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12) {
                                if (final_color_button121 == final_color12)
                                    Button131.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 14) {
                                if (final_color_button121 == final_color14)
                                    Button131.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14) {
                                if (final_color_button121 == final_color14)
                                    Button131.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 15) {
                                if (final_color_button121 == final_color15)
                                    Button131.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15) {
                                if (final_color_button121 == final_color15)
                                    Button131.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 13) {
                                if (final_color_button122 == final_color13)
                                    Button132.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13 && x != 1) {
                                if (final_color_button122 == final_color13)
                                    Button132.setBackgroundColor(Color.CYAN);
                            }
                        }
                        /*for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 2) {
                                if (final_color_button122 == final_color2)
                                    Button132.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2 && x != 1) {
                                if (final_color_button122 == final_color2)
                                    Button132.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 3) {
                                if (final_color_button122 == final_color3)
                                    Button132.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3 && x != 1) {
                                if (final_color_button122 == final_color3)
                                    Button132.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 4) {
                                if (final_color_button122 == final_color4)
                                    Button132.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4 && x != 1) {
                                if (final_color_button122 == final_color4)
                                    Button132.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 5) {
                                if (final_color_button122 == final_color5)
                                    Button132.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5 && x != 1) {
                                if (final_color_button122 == final_color5)
                                    Button132.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 6) {
                                if (final_color_button122 == final_color6)
                                    Button132.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6 && x != 1) {
                                if (final_color_button122 == final_color6)
                                    Button132.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 7) {
                                if (final_color_button122 == final_color7)
                                    Button132.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7 && x != 1) {
                                if (final_color_button122 == final_color7)
                                    Button132.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 8) {
                                if (final_color_button122 == final_color8)
                                    Button132.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8 && x != 1) {
                                if (final_color_button122 == final_color8)
                                    Button132.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 9) {
                                if (final_color_button122 == final_color9)
                                    Button132.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9 && x != 1) {
                                if (final_color_button122 == final_color9)
                                    Button132.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 10) {
                                if (final_color_button122 == final_color10)
                                    Button132.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10 && x != 1) {
                                if (final_color_button122 == final_color10)
                                    Button132.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 11) {
                                if (final_color_button122 == final_color11)
                                    Button132.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11 && x != 1) {
                                if (final_color_button122 == final_color11)
                                    Button132.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 12) {
                                if (final_color_button122 == final_color12)
                                    Button132.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12 && x != 1) {
                                if (final_color_button122 == final_color12)
                                    Button132.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 14) {
                                if (final_color_button122 == final_color14)
                                    Button132.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14 && x != 1) {
                                if (final_color_button122 == final_color14)
                                    Button132.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 15) {
                                if (final_color_button122 == final_color15)
                                    Button132.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15 && x != 1) {
                                if (final_color_button122 == final_color15)
                                    Button132.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 13) {
                                if (final_color_button123 == final_color13)
                                    Button133.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13 && x != 2) {
                                if (final_color_button123 == final_color13)
                                    Button133.setBackgroundColor(Color.CYAN);
                            }
                        }
                        /*for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 2) {
                                if (final_color_button123 == final_color2)
                                    Button133.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2 && x != 2) {
                                if (final_color_button123 == final_color2)
                                    Button133.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 3) {
                                if (final_color_button123 == final_color3)
                                    Button133.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3 && x != 2) {
                                if (final_color_button123 == final_color3)
                                    Button133.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 4) {
                                if (final_color_button123 == final_color4)
                                    Button133.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4 && x != 2) {
                                if (final_color_button123 == final_color4)
                                    Button133.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 5) {
                                if (final_color_button123 == final_color5)
                                    Button133.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5 && x != 2) {
                                if (final_color_button123 == final_color5)
                                    Button133.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 6) {
                                if (final_color_button123 == final_color6)
                                    Button133.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6 && x != 2) {
                                if (final_color_button123 == final_color6)
                                    Button133.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 7) {
                                if (final_color_button123 == final_color7)
                                    Button133.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7 && x != 2) {
                                if (final_color_button123 == final_color7)
                                    Button133.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 8) {
                                if (final_color_button123 == final_color8)
                                    Button133.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8 && x != 2) {
                                if (final_color_button123 == final_color8)
                                    Button133.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 9) {
                                if (final_color_button123 == final_color9)
                                    Button133.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9 && x != 2) {
                                if (final_color_button123 == final_color9)
                                    Button133.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 10) {
                                if (final_color_button123 == final_color10)
                                    Button133.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10 && x != 2) {
                                if (final_color_button123 == final_color10)
                                    Button113.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 11) {
                                if (final_color_button123 == final_color11)
                                    Button133.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11 && x != 2) {
                                if (final_color_button123 == final_color11)
                                    Button133.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 12) {
                                if (final_color_button123 == final_color12)
                                    Button133.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12 && x != 2) {
                                if (final_color_button123 == final_color12)
                                    Button133.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 14) {
                                if (final_color_button123 == final_color14)
                                    Button133.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14 && x != 2) {
                                if (final_color_button123 == final_color14)
                                    Button133.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 15) {
                                if (final_color_button123 == final_color15)
                                    Button133.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15 && x != 2) {
                                if (final_color_button123 == final_color15)
                                    Button133.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 13) {
                                if (final_color_button124 == final_color13)
                                    Button134.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13 && x != 3) {
                                if (final_color_button124 == final_color13)
                                    Button134.setBackgroundColor(Color.CYAN);
                            }
                        }
                        /*for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 2) {
                                if (final_color_button124 == final_color2)
                                    Button134.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2 && x != 3) {
                                if (final_color_button124 == final_color2)
                                    Button134.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 3) {
                                if (final_color_button124 == final_color3)
                                    Button134.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3 && x != 3) {
                                if (final_color_button124 == final_color3)
                                    Button134.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 4) {
                                if (final_color_button124 == final_color4)
                                    Button134.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4 && x != 3) {
                                if (final_color_button124 == final_color4)
                                    Button134.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 5) {
                                if (final_color_button124 == final_color5)
                                    Button134.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5 && x != 3) {
                                if (final_color_button124 == final_color5)
                                    Button134.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 6) {
                                if (final_color_button124 == final_color6)
                                    Button134.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6 && x != 3) {
                                if (final_color_button124 == final_color6)
                                    Button134.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 7) {
                                if (final_color_button124 == final_color7)
                                    Button134.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7 && x != 3) {
                                if (final_color_button124 == final_color7)
                                    Button134.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 8) {
                                if (final_color_button124 == final_color8)
                                    Button134.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8 && x != 3) {
                                if (final_color_button124 == final_color8)
                                    Button134.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 9) {
                                if (final_color_button124 == final_color9)
                                    Button134.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9 && x != 3) {
                                if (final_color_button124 == final_color9)
                                    Button134.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 10) {
                                if (final_color_button124 == final_color10)
                                    Button134.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10 && x != 3) {
                                if (final_color_button124 == final_color10)
                                    Button134.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 11) {
                                if (final_color_button124 == final_color11)
                                    Button134.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11 && x != 3) {
                                if (final_color_button124 == final_color11)
                                    Button134.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 12) {
                                if (final_color_button124 == final_color12)
                                    Button134.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12 && x != 3) {
                                if (final_color_button124 == final_color12)
                                    Button134.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 14) {
                                if (final_color_button124 == final_color14)
                                    Button134.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14 && x != 3) {
                                if (final_color_button124 == final_color14)
                                    Button134.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 15) {
                                if (final_color_button124 == final_color15)
                                    Button134.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15 && x != 3) {
                                if (final_color_button124 == final_color15)
                                    Button134.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 13) {
                                if (final_color_button125 == final_color13)
                                    Button135.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13) {
                                if (final_color_button125 == final_color13)
                                    Button135.setBackgroundColor(Color.CYAN);
                            }
                        }
                        /*for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 2) {
                                if (final_color_button125 == final_color2)
                                    Button135.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2) {
                                if (final_color_button125 == final_color2)
                                    Button135.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 3) {
                                if (final_color_button125 == final_color3)
                                    Button135.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3) {
                                if (final_color_button125 == final_color3)
                                    Button135.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 4) {
                                if (final_color_button125 == final_color4)
                                    Button135.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4) {
                                if (final_color_button125 == final_color4)
                                    Button135.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 5) {
                                if (final_color_button125 == final_color5)
                                    Button135.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5) {
                                if (final_color_button125 == final_color5)
                                    Button135.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 6) {
                                if (final_color_button125 == final_color6)
                                    Button135.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6) {
                                if (final_color_button125 == final_color6)
                                    Button135.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 7) {
                                if (final_color_button125 == final_color7)
                                    Button135.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7) {
                                if (final_color_button125 == final_color7)
                                    Button135.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 8) {
                                if (final_color_button125 == final_color8)
                                    Button135.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8) {
                                if (final_color_button125 == final_color8)
                                    Button135.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 9) {
                                if (final_color_button125 == final_color9)
                                    Button135.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9) {
                                if (final_color_button125 == final_color9)
                                    Button135.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 10) {
                                if (final_color_button125 == final_color10)
                                    Button135.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10) {
                                if (final_color_button125 == final_color10)
                                    Button135.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 11) {
                                if (final_color_button125 == final_color11)
                                    Button135.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11) {
                                if (final_color_button125 == final_color11)
                                    Button135.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 12) {
                                if (final_color_button125 == final_color12)
                                    Button135.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12) {
                                if (final_color_button125 == final_color12)
                                    Button135.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 14) {
                                if (final_color_button125 == final_color14)
                                    Button135.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14) {
                                if (final_color_button125 == final_color14)
                                    Button135.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 15) {
                                if (final_color_button125 == final_color15)
                                    Button135.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15) {
                                if (final_color_button125 == final_color15)
                                    Button135.setBackgroundColor(Color.CYAN);
                            }
                        }
                        final List<Integer> b = new ArrayList<>();
                        Random random = new Random(System.currentTimeMillis());
                        for (int i = 0; i < 5; i++) {
                            while (true) {
                                Integer next = random.nextInt(5) + 1;
                                if (!b.contains(next)) {
                                    b.add(next);
                                    break;
                                }
                            }
                        }
                        int final_color_button1 = Color.RED;
                        Drawable final_background_button1 = Button131.getBackground();
                        if (final_background_button1 instanceof ColorDrawable) {
                            final_color_button1 = (((ColorDrawable) final_background_button1).getColor());
                        }
                        int final_color_button2 = Color.RED;
                        Drawable final_background_button2 = Button132.getBackground();
                        if (final_background_button2 instanceof ColorDrawable) {
                            final_color_button2 = (((ColorDrawable) final_background_button2).getColor());
                        }
                        int final_color_button3 = Color.RED;
                        Drawable final_background_button3 = Button133.getBackground();
                        if (final_background_button3 instanceof ColorDrawable) {
                            final_color_button3 = (((ColorDrawable) final_background_button3).getColor());
                        }
                        int final_color_button4 = Color.RED;
                        Drawable final_background_button4 = Button134.getBackground();
                        if (final_background_button4 instanceof ColorDrawable) {
                            final_color_button4 = (((ColorDrawable) final_background_button4).getColor());
                        }
                        int final_color_button5 = Color.RED;
                        Drawable final_background_button5 = Button135.getBackground();
                        if (final_background_button5 instanceof ColorDrawable) {
                            final_color_button5 = (((ColorDrawable) final_background_button5).getColor());
                        }
                        if (b.get(0) == 1) {
                            Button131.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(0) == 2) {
                            Button131.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(0) == 3) {
                            Button131.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(0) == 4) {
                            Button131.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(0) == 5) {
                            Button131.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(1) == 1) {
                            Button132.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(1) == 2) {
                            Button132.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(1) == 3) {
                            Button132.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(1) == 4) {
                            Button132.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(1) == 5) {
                            Button132.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(2) == 1) {
                            Button133.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(2) == 2) {
                            Button133.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(2) == 3) {
                            Button133.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(2) == 4) {
                            Button133.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(2) == 5) {
                            Button133.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(3) == 1) {
                            Button134.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(3) == 2) {
                            Button134.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(3) == 3) {
                            Button134.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(3) == 4) {
                            Button134.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(3) == 5) {
                            Button134.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(4) == 1) {
                            Button135.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(4) == 2) {
                            Button135.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(4) == 3) {
                            Button135.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(4) == 4) {
                            Button135.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(4) == 5) {
                            Button135.setBackgroundColor(final_color_button5);
                        }
                        int count = Color.RED;
                        if ((final_color_button1 == count) && (final_color_button2 == count) && (final_color_button3 == count) && (final_color_button4 == count) && (final_color_button5 == count)) {
                            Toast.makeText(getApplicationContext(), "YOU WON", Toast.LENGTH_LONG).show(); }
                        else {
                            View SplitLine7 = (View)findViewById(R.id.SplitLine7);
                            SplitLine7.setBackgroundColor(Color.GREEN);
                            Go7.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button141.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button142.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button143.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button144.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button145.setBackgroundColor(Color.rgb(236, 239, 241));
                        }
                        level7[0]++;
                    }
                }
            }
        });
        final int[] level8 = new int[1];
        level8[0] = 0;
        Button141.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level8[0] == 0&&level7[0]!=0&&level6[0]!=0&&level5[0]!=0&&level4[0]!=0&&level3[0]!=0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button142 = Color.RED;
                    Drawable background_button142 = Button142.getBackground();
                    if (background_button142 instanceof ColorDrawable) {
                        color_button142 = (((ColorDrawable) background_button142).getColor());
                    }
                    int color_button143 = Color.RED;
                    Drawable background_button143 = Button143.getBackground();
                    if (background_button143 instanceof ColorDrawable) {
                        color_button143 = (((ColorDrawable) background_button143).getColor());
                    }
                    int color_button144 = Color.RED;
                    Drawable background_button144 = Button144.getBackground();
                    if (background_button144 instanceof ColorDrawable) {
                        color_button144 = (((ColorDrawable) background_button144).getColor());
                    }
                    int color_button145 = Color.RED;
                    Drawable background_button145 = Button145.getBackground();
                    if (background_button145 instanceof ColorDrawable) {
                        color_button145 = (((ColorDrawable) background_button145).getColor());
                    }
                    if (color_current_selection == color_button142 || color_current_selection == color_button143 || color_current_selection == color_button144 || color_current_selection == color_button145) {
                    } else
                        Button141.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button142.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level8[0] == 0&&level7[0]!=0&&level6[0]!=0&&level5[0]!=0&&level4[0]!=0&&level3[0]!=0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button143 = Color.RED;
                    Drawable background_button143 = Button143.getBackground();
                    if (background_button143 instanceof ColorDrawable) {
                        color_button143 = (((ColorDrawable) background_button143).getColor());
                    }
                    int color_button144 = Color.RED;
                    Drawable background_button144 = Button144.getBackground();
                    if (background_button144 instanceof ColorDrawable) {
                        color_button144 = (((ColorDrawable) background_button144).getColor());
                    }
                    int color_button145 = Color.RED;
                    Drawable background_button145 = Button145.getBackground();
                    if (background_button145 instanceof ColorDrawable) {
                        color_button145 = (((ColorDrawable) background_button145).getColor());
                    }
                    int color_button141 = Color.RED;
                    Drawable background_button141 = Button141.getBackground();
                    if (background_button141 instanceof ColorDrawable) {
                        color_button141 = (((ColorDrawable) background_button141).getColor());
                    }
                    if (color_current_selection == color_button141 || color_current_selection == color_button143 || color_current_selection == color_button144 || color_current_selection == color_button145) {
                    } else
                        Button142.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button143.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level8[0] == 0&&level7[0]!=0&&level6[0]!=0&&level5[0]!=0&&level4[0]!=0&&level3[0]!=0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button141 = Color.RED;
                    Drawable background_button141 = Button141.getBackground();
                    if (background_button141 instanceof ColorDrawable) {
                        color_button141 = (((ColorDrawable) background_button141).getColor());
                    }
                    int color_button144 = Color.RED;
                    Drawable background_button144 = Button144.getBackground();
                    if (background_button144 instanceof ColorDrawable) {
                        color_button144 = (((ColorDrawable) background_button144).getColor());
                    }
                    int color_button145 = Color.RED;
                    Drawable background_button145 = Button145.getBackground();
                    if (background_button145 instanceof ColorDrawable) {
                        color_button145 = (((ColorDrawable) background_button145).getColor());
                    }
                    int color_button142 = Color.RED;
                    Drawable background_button142 = Button142.getBackground();
                    if (background_button142 instanceof ColorDrawable) {
                        color_button142 = (((ColorDrawable) background_button142).getColor());
                    }
                    if (color_current_selection == color_button141 || color_current_selection == color_button142 || color_current_selection == color_button144 || color_current_selection == color_button145) {
                    } else
                        Button143.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button144.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level8[0] == 0&&level7[0]!=0&&level6[0]!=0&&level5[0]!=0&&level4[0]!=0&&level3[0]!=0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button143 = Color.RED;
                    Drawable background_button143 = Button143.getBackground();
                    if (background_button143 instanceof ColorDrawable) {
                        color_button143 = (((ColorDrawable) background_button143).getColor());
                    }
                    int color_button142 = Color.RED;
                    Drawable background_button142 = Button142.getBackground();
                    if (background_button142 instanceof ColorDrawable) {
                        color_button142 = (((ColorDrawable) background_button142).getColor());
                    }
                    int color_button145 = Color.RED;
                    Drawable background_button145 = Button145.getBackground();
                    if (background_button145 instanceof ColorDrawable) {
                        color_button145 = (((ColorDrawable) background_button145).getColor());
                    }
                    int color_button141 = Color.RED;
                    Drawable background_button141 = Button141.getBackground();
                    if (background_button141 instanceof ColorDrawable) {
                        color_button141 = (((ColorDrawable) background_button141).getColor());
                    }
                    if (color_current_selection == color_button141 || color_current_selection == color_button143 || color_current_selection == color_button142 || color_current_selection == color_button145) {
                    } else
                        Button144.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button145.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level8[0] == 0&&level7[0]!=0&&level6[0]!=0&&level5[0]!=0&&level4[0]!=0&&level3[0]!=0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button143 = Color.RED;
                    Drawable background_button143 = Button143.getBackground();
                    if (background_button143 instanceof ColorDrawable) {
                        color_button143 = (((ColorDrawable) background_button143).getColor());
                    }
                    int color_button144 = Color.RED;
                    Drawable background_button144 = Button144.getBackground();
                    if (background_button144 instanceof ColorDrawable) {
                        color_button144 = (((ColorDrawable) background_button144).getColor());
                    }
                    int color_button142 = Color.RED;
                    Drawable background_button142 = Button142.getBackground();
                    if (background_button142 instanceof ColorDrawable) {
                        color_button142 = (((ColorDrawable) background_button142).getColor());
                    }
                    int color_button141 = Color.RED;
                    Drawable background_button141 = Button141.getBackground();
                    if (background_button141 instanceof ColorDrawable) {
                        color_button141 = (((ColorDrawable) background_button141).getColor());
                    }
                    if (color_current_selection == color_button141 || color_current_selection == color_button143 || color_current_selection == color_button144 || color_current_selection == color_button142) {
                    } else
                        Button145.setBackgroundColor(color_current_selection);
                }
            }
        });
        Go7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (level8[0] == 0) {

                    int final_color13 = Color.RED;
                    Drawable final_background1 = color13.getBackground();
                    if (final_background1 instanceof ColorDrawable) {
                        final_color13 = (((ColorDrawable) final_background1).getColor());
                    }
                    /*int final_color2 = Color.RED;
                    Drawable final_background2 = color2.getBackground();
                    if (final_background2 instanceof ColorDrawable) {
                        final_color2 = (((ColorDrawable) final_background2).getColor());
                    }
                    int final_color3 = Color.RED;
                    Drawable final_background3 = color3.getBackground();
                    if (final_background3 instanceof ColorDrawable) {
                        final_color3 = (((ColorDrawable) final_background3).getColor());
                    }*/
                    int final_color4 = Color.RED;
                    Drawable final_background4 = color4.getBackground();
                    if (final_background4 instanceof ColorDrawable) {
                        final_color4 = (((ColorDrawable) final_background4).getColor());
                    }
                    int final_color5 = Color.RED;
                    Drawable final_background5 = color5.getBackground();
                    if (final_background5 instanceof ColorDrawable) {
                        final_color5 = (((ColorDrawable) final_background5).getColor());
                    }
                    int final_color6 = Color.RED;
                    Drawable final_background6 = color6.getBackground();
                    if (final_background6 instanceof ColorDrawable) {
                        final_color6 = (((ColorDrawable) final_background6).getColor());
                    }
                    int final_color7 = Color.RED;
                    Drawable final_background7 = color7.getBackground();
                    if (final_background7 instanceof ColorDrawable) {
                        final_color7 = (((ColorDrawable) final_background7).getColor());
                    }
                    int final_color8 = Color.RED;
                    Drawable final_background8 = color8.getBackground();
                    if (final_background8 instanceof ColorDrawable) {
                        final_color8 = (((ColorDrawable) final_background8).getColor());
                    }
                    int final_color9 = Color.RED;
                    Drawable final_background9 = color9.getBackground();
                    if (final_background9 instanceof ColorDrawable) {
                        final_color9 = (((ColorDrawable) final_background9).getColor());
                    }
                    int final_color10 = Color.RED;
                    Drawable final_background10 = color10.getBackground();
                    if (final_background10 instanceof ColorDrawable) {
                        final_color10 = (((ColorDrawable) final_background10).getColor());
                    }
                    int final_color11 = Color.RED;
                    Drawable final_background11 = color11.getBackground();
                    if (final_background11 instanceof ColorDrawable) {
                        final_color11 = (((ColorDrawable) final_background11).getColor());
                    }
                    int final_color12 = Color.RED;
                    Drawable final_background12 = color12.getBackground();
                    if (final_background12 instanceof ColorDrawable) {
                        final_color12 = (((ColorDrawable) final_background12).getColor());
                    }
                    int final_color14 = Color.RED;
                    Drawable final_background14 = color14.getBackground();
                    if (final_background14 instanceof ColorDrawable) {
                        final_color14 = (((ColorDrawable) final_background14).getColor());
                    }
                    int final_color15 = Color.RED;
                    Drawable final_background15 = color15.getBackground();
                    if (final_background15 instanceof ColorDrawable) {
                        final_color15 = (((ColorDrawable) final_background15).getColor());
                    }
                    int final_color_button141 = Color.RED;
                    Drawable final_background_button141 = Button141.getBackground();
                    if (final_background_button141 instanceof ColorDrawable) {
                        final_color_button141 = (((ColorDrawable) final_background_button141).getColor());
                    }
                    int final_color_button142 = Color.RED;
                    Drawable final_background_button142 = Button142.getBackground();
                    if (final_background_button142 instanceof ColorDrawable) {
                        final_color_button142 = (((ColorDrawable) final_background_button142).getColor());
                    }
                    int final_color_button143 = Color.RED;
                    Drawable final_background_button143 = Button143.getBackground();
                    if (final_background_button143 instanceof ColorDrawable) {
                        final_color_button143 = (((ColorDrawable) final_background_button143).getColor());
                    }
                    int final_color_button144 = Color.RED;
                    Drawable final_background_button144 = Button144.getBackground();
                    if (final_background_button144 instanceof ColorDrawable) {
                        final_color_button144 = (((ColorDrawable) final_background_button144).getColor());
                    }
                    int final_color_button145 = Color.RED;
                    Drawable final_background_button145 = Button145.getBackground();
                    if (final_background_button145 instanceof ColorDrawable) {
                        final_color_button145 = (((ColorDrawable) final_background_button145).getColor());
                    }
                    if (final_color_button141 != color_default && final_color_button142 != color_default && final_color_button143 != color_default && final_color_button144 != color_default && final_color_button145 != color_default&&final_color_button141!=color_black&&final_color_button142!=color_black&&final_color_button143!=color_black&&final_color_button144!=color_black&&final_color_button145!=color_black) {
                        a18.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button151.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button152.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button153.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button154.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button155.setBackgroundColor(Color.rgb(236, 239, 241));
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 13) {
                                if (final_color_button141 == final_color13)
                                    Button151.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13) {
                                if (final_color_button141 == final_color13)
                                    Button151.setBackgroundColor(Color.CYAN);
                            }
                        }
                        /*for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 2) {
                                if (final_color_button141 == final_color2)
                                    Button151.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2) {
                                if (final_color_button141 == final_color2)
                                    Button151.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 3) {
                                if (final_color_button141 == final_color3)
                                    Button151.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3) {
                                if (final_color_button141 == final_color3)
                                    Button151.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 4) {
                                if (final_color_button141 == final_color4)
                                    Button151.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4) {
                                if (final_color_button141 == final_color4)
                                    Button151.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 5) {
                                if (final_color_button141 == final_color5)
                                    Button151.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5) {
                                if (final_color_button141 == final_color5)
                                    Button151.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 6) {
                                if (final_color_button141 == final_color6)
                                    Button151.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6) {
                                if (final_color_button141 == final_color6)
                                    Button151.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 7) {
                                if (final_color_button141 == final_color7)
                                    Button151.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7) {
                                if (final_color_button141 == final_color7)
                                    Button151.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 8) {
                                if (final_color_button141 == final_color8)
                                    Button151.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8) {
                                if (final_color_button141 == final_color8)
                                    Button151.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 9) {
                                if (final_color_button141 == final_color9)
                                    Button151.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9) {
                                if (final_color_button141 == final_color9)
                                    Button151.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 10) {
                                if (final_color_button141 == final_color10)
                                    Button151.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10) {
                                if (final_color_button141 == final_color10)
                                    Button151.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 11) {
                                if (final_color_button141 == final_color11)
                                    Button151.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11) {
                                if (final_color_button141 == final_color11)
                                    Button151.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 12) {
                                if (final_color_button141 == final_color12)
                                    Button151.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12) {
                                if (final_color_button141 == final_color12)
                                    Button151.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 14) {
                                if (final_color_button141 == final_color14)
                                    Button151.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14) {
                                if (final_color_button141 == final_color14)
                                    Button151.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 15) {
                                if (final_color_button141 == final_color15)
                                    Button151.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15) {
                                if (final_color_button141 == final_color15)
                                    Button151.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 13) {
                                if (final_color_button142 == final_color13)
                                    Button152.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13 && x != 1) {
                                if (final_color_button142 == final_color13)
                                    Button152.setBackgroundColor(Color.CYAN);
                            }
                        }
                        /*for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 2) {
                                if (final_color_button142 == final_color2)
                                    Button152.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2 && x != 1) {
                                if (final_color_button142 == final_color2)
                                    Button152.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 3) {
                                if (final_color_button142 == final_color3)
                                    Button152.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3 && x != 1) {
                                if (final_color_button142 == final_color3)
                                    Button152.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 4) {
                                if (final_color_button142 == final_color4)
                                    Button152.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4 && x != 1) {
                                if (final_color_button142 == final_color4)
                                    Button152.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 5) {
                                if (final_color_button142 == final_color5)
                                    Button152.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5 && x != 1) {
                                if (final_color_button142 == final_color5)
                                    Button152.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 6) {
                                if (final_color_button142 == final_color6)
                                    Button152.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6 && x != 1) {
                                if (final_color_button142 == final_color6)
                                    Button152.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 7) {
                                if (final_color_button142 == final_color7)
                                    Button152.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7 && x != 1) {
                                if (final_color_button142 == final_color7)
                                    Button152.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 8) {
                                if (final_color_button142 == final_color8)
                                    Button152.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8 && x != 1) {
                                if (final_color_button142 == final_color8)
                                    Button152.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 9) {
                                if (final_color_button142 == final_color9)
                                    Button152.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9 && x != 1) {
                                if (final_color_button142 == final_color9)
                                    Button152.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 10) {
                                if (final_color_button142 == final_color10)
                                    Button152.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10 && x != 1) {
                                if (final_color_button142 == final_color10)
                                    Button152.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 11) {
                                if (final_color_button142 == final_color11)
                                    Button152.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11 && x != 1) {
                                if (final_color_button142 == final_color11)
                                    Button152.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 12) {
                                if (final_color_button142 == final_color12)
                                    Button152.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12 && x != 1) {
                                if (final_color_button142 == final_color12)
                                    Button152.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 14) {
                                if (final_color_button142 == final_color14)
                                    Button152.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14 && x != 1) {
                                if (final_color_button142 == final_color14)
                                    Button152.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 15) {
                                if (final_color_button142 == final_color15)
                                    Button152.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15 && x != 1) {
                                if (final_color_button142 == final_color15)
                                    Button152.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 13) {
                                if (final_color_button143 == final_color13)
                                    Button153.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13 && x != 2) {
                                if (final_color_button143 == final_color13)
                                    Button153.setBackgroundColor(Color.CYAN);
                            }
                        }
                        /*for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 2) {
                                if (final_color_button143 == final_color2)
                                    Button153.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2 && x != 2) {
                                if (final_color_button143 == final_color2)
                                    Button153.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 3) {
                                if (final_color_button143 == final_color3)
                                    Button153.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3 && x != 2) {
                                if (final_color_button143 == final_color3)
                                    Button153.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 4) {
                                if (final_color_button143 == final_color4)
                                    Button153.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4 && x != 2) {
                                if (final_color_button143 == final_color4)
                                    Button153.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 5) {
                                if (final_color_button143 == final_color5)
                                    Button153.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5 && x != 2) {
                                if (final_color_button143 == final_color5)
                                    Button153.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 6) {
                                if (final_color_button143 == final_color6)
                                    Button153.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6 && x != 2) {
                                if (final_color_button143 == final_color6)
                                    Button153.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 7) {
                                if (final_color_button143 == final_color7)
                                    Button153.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7 && x != 2) {
                                if (final_color_button143 == final_color7)
                                    Button153.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 8) {
                                if (final_color_button143 == final_color8)
                                    Button153.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8 && x != 2) {
                                if (final_color_button143 == final_color8)
                                    Button153.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 9) {
                                if (final_color_button143 == final_color9)
                                    Button153.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9 && x != 2) {
                                if (final_color_button143 == final_color9)
                                    Button153.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 10) {
                                if (final_color_button143 == final_color10)
                                    Button153.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10 && x != 2) {
                                if (final_color_button143 == final_color10)
                                    Button153.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 11) {
                                if (final_color_button143 == final_color11)
                                    Button153.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11 && x != 2) {
                                if (final_color_button143 == final_color11)
                                    Button153.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 12) {
                                if (final_color_button143 == final_color12)
                                    Button153.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12 && x != 2) {
                                if (final_color_button143 == final_color12)
                                    Button153.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 14) {
                                if (final_color_button143 == final_color14)
                                    Button153.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14 && x != 2) {
                                if (final_color_button143 == final_color14)
                                    Button153.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 15) {
                                if (final_color_button143 == final_color15)
                                    Button153.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15 && x != 2) {
                                if (final_color_button143 == final_color15)
                                    Button153.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 13) {
                                if (final_color_button144 == final_color13)
                                    Button154.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13 && x != 3) {
                                if (final_color_button144 == final_color13)
                                    Button154.setBackgroundColor(Color.CYAN);
                            }
                        }
                        /*for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 2) {
                                if (final_color_button144 == final_color2)
                                    Button154.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2 && x != 3) {
                                if (final_color_button144 == final_color2)
                                    Button154.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 3) {
                                if (final_color_button144 == final_color3)
                                    Button154.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3 && x != 3) {
                                if (final_color_button144 == final_color3)
                                    Button154.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 4) {
                                if (final_color_button144 == final_color4)
                                    Button154.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4 && x != 3) {
                                if (final_color_button144 == final_color4)
                                    Button154.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 5) {
                                if (final_color_button144 == final_color5)
                                    Button154.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5 && x != 3) {
                                if (final_color_button144 == final_color5)
                                    Button154.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 6) {
                                if (final_color_button144 == final_color6)
                                    Button154.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6 && x != 3) {
                                if (final_color_button144 == final_color6)
                                    Button154.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 7) {
                                if (final_color_button144 == final_color7)
                                    Button154.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7 && x != 3) {
                                if (final_color_button144 == final_color7)
                                    Button154.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 8) {
                                if (final_color_button144 == final_color8)
                                    Button154.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8 && x != 3) {
                                if (final_color_button144 == final_color8)
                                    Button154.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 9) {
                                if (final_color_button144 == final_color9)
                                    Button154.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9 && x != 3) {
                                if (final_color_button144 == final_color9)
                                    Button154.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 10) {
                                if (final_color_button144 == final_color10)
                                    Button154.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10 && x != 3) {
                                if (final_color_button144 == final_color10)
                                    Button154.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 11) {
                                if (final_color_button144 == final_color11)
                                    Button154.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11 && x != 3) {
                                if (final_color_button144 == final_color11)
                                    Button154.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 12) {
                                if (final_color_button144 == final_color12)
                                    Button154.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12 && x != 3) {
                                if (final_color_button144 == final_color12)
                                    Button154.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 14) {
                                if (final_color_button144 == final_color14)
                                    Button154.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14 && x != 3) {
                                if (final_color_button144 == final_color14)
                                    Button154.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 15) {
                                if (final_color_button144 == final_color15)
                                    Button154.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15 && x != 3) {
                                if (final_color_button144 == final_color15)
                                    Button154.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 13) {
                                if (final_color_button145 == final_color13)
                                    Button155.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13) {
                                if (final_color_button145 == final_color13)
                                    Button155.setBackgroundColor(Color.CYAN);
                            }
                        }
                        /*for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 2) {
                                if (final_color_button145 == final_color2)
                                    Button155.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2) {
                                if (final_color_button145 == final_color2)
                                    Button155.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 3) {
                                if (final_color_button145 == final_color3)
                                    Button155.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3) {
                                if (final_color_button145 == final_color3)
                                    Button155.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 4) {
                                if (final_color_button145 == final_color4)
                                    Button155.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4) {
                                if (final_color_button145 == final_color4)
                                    Button155.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 5) {
                                if (final_color_button145 == final_color5)
                                    Button155.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5) {
                                if (final_color_button145 == final_color5)
                                    Button155.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 6) {
                                if (final_color_button145 == final_color6)
                                    Button155.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6) {
                                if (final_color_button145 == final_color6)
                                    Button155.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 7) {
                                if (final_color_button145 == final_color7)
                                    Button155.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7) {
                                if (final_color_button145 == final_color7)
                                    Button155.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 8) {
                                if (final_color_button145 == final_color8)
                                    Button155.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8) {
                                if (final_color_button145 == final_color8)
                                    Button155.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 9) {
                                if (final_color_button145 == final_color9)
                                    Button155.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9) {
                                if (final_color_button145 == final_color9)
                                    Button155.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 10) {
                                if (final_color_button145 == final_color10)
                                    Button155.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10) {
                                if (final_color_button145 == final_color10)
                                    Button155.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 11) {
                                if (final_color_button145 == final_color11)
                                    Button155.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11) {
                                if (final_color_button145 == final_color11)
                                    Button155.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 12) {
                                if (final_color_button145 == final_color12)
                                    Button155.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12) {
                                if (final_color_button145 == final_color12)
                                    Button155.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 14) {
                                if (final_color_button145 == final_color14)
                                    Button155.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14) {
                                if (final_color_button145 == final_color14)
                                    Button155.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 15) {
                                if (final_color_button145 == final_color15)
                                    Button155.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15) {
                                if (final_color_button145 == final_color15)
                                    Button155.setBackgroundColor(Color.CYAN);
                            }
                        }
                        final List<Integer> b = new ArrayList<>();
                        Random random = new Random(System.currentTimeMillis());
                        for (int i = 0; i < 5; i++) {
                            while (true) {
                                Integer next = random.nextInt(5) + 1;
                                if (!b.contains(next)) {
                                    b.add(next);
                                    break;
                                }
                            }
                        }
                        int final_color_button1 = Color.RED;
                        Drawable final_background_button1 = Button151.getBackground();
                        if (final_background_button1 instanceof ColorDrawable) {
                            final_color_button1 = (((ColorDrawable) final_background_button1).getColor());
                        }
                        int final_color_button2 = Color.RED;
                        Drawable final_background_button2 = Button152.getBackground();
                        if (final_background_button2 instanceof ColorDrawable) {
                            final_color_button2 = (((ColorDrawable) final_background_button2).getColor());
                        }
                        int final_color_button3 = Color.RED;
                        Drawable final_background_button3 = Button153.getBackground();
                        if (final_background_button3 instanceof ColorDrawable) {
                            final_color_button3 = (((ColorDrawable) final_background_button3).getColor());
                        }
                        int final_color_button4 = Color.RED;
                        Drawable final_background_button4 = Button154.getBackground();
                        if (final_background_button4 instanceof ColorDrawable) {
                            final_color_button4 = (((ColorDrawable) final_background_button4).getColor());
                        }
                        int final_color_button5 = Color.RED;
                        Drawable final_background_button5 = Button155.getBackground();
                        if (final_background_button5 instanceof ColorDrawable) {
                            final_color_button5 = (((ColorDrawable) final_background_button5).getColor());
                        }
                        if (b.get(0) == 1) {
                            Button151.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(0) == 2) {
                            Button151.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(0) == 3) {
                            Button151.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(0) == 4) {
                            Button151.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(0) == 5) {
                            Button151.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(1) == 1) {
                            Button152.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(1) == 2) {
                            Button152.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(1) == 3) {
                            Button152.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(1) == 4) {
                            Button152.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(1) == 5) {
                            Button152.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(2) == 1) {
                            Button153.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(2) == 2) {
                            Button153.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(2) == 3) {
                            Button153.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(2) == 4) {
                            Button153.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(2) == 5) {
                            Button153.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(3) == 1) {
                            Button154.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(3) == 2) {
                            Button154.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(3) == 3) {
                            Button154.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(3) == 4) {
                            Button154.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(3) == 5) {
                            Button154.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(4) == 1) {
                            Button155.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(4) == 2) {
                            Button155.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(4) == 3) {
                            Button155.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(4) == 4) {
                            Button155.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(4) == 5) {
                            Button155.setBackgroundColor(final_color_button5);
                        }
                        int count = Color.RED;
                        if ((final_color_button1 == count) && (final_color_button2 == count) && (final_color_button3 == count) && (final_color_button4 == count) && (final_color_button5 == count)) {
                            Toast.makeText(getApplicationContext(), "YOU WON", Toast.LENGTH_LONG).show();}
                        else {
                            View SplitLine8 = (View)findViewById(R.id.SplitLine8);
                            SplitLine8.setBackgroundColor(Color.GREEN);
                            Go8.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button161.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button162.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button163.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button164.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button165.setBackgroundColor(Color.rgb(236, 239, 241));
                        }
                        level8[0]++;
                    }
                }
            }
        });
        final int[] level9 = new int[1];
        level9[0] = 0;
        Button161.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level9[0] == 0&&level8[0]!=0&&level7[0]!=0&&level6[0]!=0&&level5[0]!=0&&level4[0]!=0&&level3[0]!=0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button162 = Color.RED;
                    Drawable background_button162 = Button162.getBackground();
                    if (background_button162 instanceof ColorDrawable) {
                        color_button162 = (((ColorDrawable) background_button162).getColor());
                    }
                    int color_button163 = Color.RED;
                    Drawable background_Button163 = Button163.getBackground();
                    if (background_Button163 instanceof ColorDrawable) {
                        color_button163 = (((ColorDrawable) background_Button163).getColor());
                    }
                    int color_button164 = Color.RED;
                    Drawable background_Button164 = Button164.getBackground();
                    if (background_Button164 instanceof ColorDrawable) {
                        color_button164 = (((ColorDrawable) background_Button164).getColor());
                    }
                    int color_button165 = Color.RED;
                    Drawable background_Button165 = Button165.getBackground();
                    if (background_Button165 instanceof ColorDrawable) {
                        color_button165 = (((ColorDrawable) background_Button165).getColor());
                    }
                    if (color_current_selection == color_button162 || color_current_selection == color_button163 || color_current_selection == color_button164 || color_current_selection == color_button165) {
                    } else
                        Button161.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button162.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level9[0] == 0&&level8[0]!=0&&level7[0]!=0&&level6[0]!=0&&level5[0]!=0&&level4[0]!=0&&level3[0]!=0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button163 = Color.RED;
                    Drawable background_Button163 = Button163.getBackground();
                    if (background_Button163 instanceof ColorDrawable) {
                        color_button163 = (((ColorDrawable) background_Button163).getColor());
                    }
                    int color_button164 = Color.RED;
                    Drawable background_Button164 = Button164.getBackground();
                    if (background_Button164 instanceof ColorDrawable) {
                        color_button164 = (((ColorDrawable) background_Button164).getColor());
                    }
                    int color_button165 = Color.RED;
                    Drawable background_Button165 = Button165.getBackground();
                    if (background_Button165 instanceof ColorDrawable) {
                        color_button165 = (((ColorDrawable) background_Button165).getColor());
                    }
                    int color_button161 = Color.RED;
                    Drawable background_Button161 = Button161.getBackground();
                    if (background_Button161 instanceof ColorDrawable) {
                        color_button161 = (((ColorDrawable) background_Button161).getColor());
                    }
                    if (color_current_selection == color_button161 || color_current_selection == color_button163 || color_current_selection == color_button164 || color_current_selection == color_button165) {
                    } else
                        Button162.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button163.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level9[0] == 0&&level8[0]!=0&&level7[0]!=0&&level6[0]!=0&&level5[0]!=0&&level4[0]!=0&&level3[0]!=0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button161 = Color.RED;
                    Drawable background_Button161 = Button161.getBackground();
                    if (background_Button161 instanceof ColorDrawable) {
                        color_button161 = (((ColorDrawable) background_Button161).getColor());
                    }
                    int color_button164 = Color.RED;
                    Drawable background_Button164 = Button164.getBackground();
                    if (background_Button164 instanceof ColorDrawable) {
                        color_button164 = (((ColorDrawable) background_Button164).getColor());
                    }
                    int color_button165 = Color.RED;
                    Drawable background_Button165 = Button165.getBackground();
                    if (background_Button165 instanceof ColorDrawable) {
                        color_button165 = (((ColorDrawable) background_Button165).getColor());
                    }
                    int color_button162 = Color.RED;
                    Drawable background_Button162 = Button162.getBackground();
                    if (background_Button162 instanceof ColorDrawable) {
                        color_button162 = (((ColorDrawable) background_Button162).getColor());
                    }
                    if (color_current_selection == color_button161 || color_current_selection == color_button162 || color_current_selection == color_button164 || color_current_selection == color_button165) {
                    } else
                        Button163.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button164.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level9[0] == 0&&level8[0]!=0&&level7[0]!=0&&level6[0]!=0&&level5[0]!=0&&level4[0]!=0&&level3[0]!=0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button163 = Color.RED;
                    Drawable background_Button163 = Button163.getBackground();
                    if (background_Button163 instanceof ColorDrawable) {
                        color_button163 = (((ColorDrawable) background_Button163).getColor());
                    }
                    int color_button162 = Color.RED;
                    Drawable background_Button162 = Button162.getBackground();
                    if (background_Button162 instanceof ColorDrawable) {
                        color_button162 = (((ColorDrawable) background_Button162).getColor());
                    }
                    int color_button165 = Color.RED;
                    Drawable background_Button165 = Button165.getBackground();
                    if (background_Button165 instanceof ColorDrawable) {
                        color_button165 = (((ColorDrawable) background_Button165).getColor());
                    }
                    int color_button161 = Color.RED;
                    Drawable background_Button161 = Button161.getBackground();
                    if (background_Button161 instanceof ColorDrawable) {
                        color_button161 = (((ColorDrawable) background_Button161).getColor());
                    }
                    if (color_current_selection == color_button161 || color_current_selection == color_button163 || color_current_selection == color_button162 || color_current_selection == color_button165) {
                    } else
                        Button164.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button165.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level9[0] == 0&&level8[0]!=0&&level7[0]!=0&&level6[0]!=0&&level5[0]!=0&&level4[0]!=0&&level3[0]!=0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_button163 = Color.RED;
                    Drawable background_Button163 = Button163.getBackground();
                    if (background_Button163 instanceof ColorDrawable) {
                        color_button163 = (((ColorDrawable) background_Button163).getColor());
                    }
                    int color_button164 = Color.RED;
                    Drawable background_Button164 = Button164.getBackground();
                    if (background_Button164 instanceof ColorDrawable) {
                        color_button164 = (((ColorDrawable) background_Button164).getColor());
                    }
                    int color_button162 = Color.RED;
                    Drawable background_Button162 = Button162.getBackground();
                    if (background_Button162 instanceof ColorDrawable) {
                        color_button162 = (((ColorDrawable) background_Button162).getColor());
                    }
                    int color_button161 = Color.RED;
                    Drawable background_Button161 = Button161.getBackground();
                    if (background_Button161 instanceof ColorDrawable) {
                        color_button161 = (((ColorDrawable) background_Button161).getColor());
                    }
                    if (color_current_selection == color_button161 || color_current_selection == color_button163 || color_current_selection == color_button164 || color_current_selection == color_button162) {
                    } else
                        Button165.setBackgroundColor(color_current_selection);
                }
            }
        });
        Go8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (level9[0] == 0) {

                    int final_color13 = Color.RED;
                    Drawable final_background1 = color13.getBackground();
                    if (final_background1 instanceof ColorDrawable) {
                        final_color13 = (((ColorDrawable) final_background1).getColor());
                    }
                    /*int final_color2 = Color.RED;
                    Drawable final_background2 = color2.getBackground();
                    if (final_background2 instanceof ColorDrawable) {
                        final_color2 = (((ColorDrawable) final_background2).getColor());
                    }
                    int final_color3 = Color.RED;
                    Drawable final_background3 = color3.getBackground();
                    if (final_background3 instanceof ColorDrawable) {
                        final_color3 = (((ColorDrawable) final_background3).getColor());
                    }*/
                    int final_color4 = Color.RED;
                    Drawable final_background4 = color4.getBackground();
                    if (final_background4 instanceof ColorDrawable) {
                        final_color4 = (((ColorDrawable) final_background4).getColor());
                    }
                    int final_color5 = Color.RED;
                    Drawable final_background5 = color5.getBackground();
                    if (final_background5 instanceof ColorDrawable) {
                        final_color5 = (((ColorDrawable) final_background5).getColor());
                    }
                    int final_color6 = Color.RED;
                    Drawable final_background6 = color6.getBackground();
                    if (final_background6 instanceof ColorDrawable) {
                        final_color6 = (((ColorDrawable) final_background6).getColor());
                    }
                    int final_color7 = Color.RED;
                    Drawable final_background7 = color7.getBackground();
                    if (final_background7 instanceof ColorDrawable) {
                        final_color7 = (((ColorDrawable) final_background7).getColor());
                    }
                    int final_color8 = Color.RED;
                    Drawable final_background8 = color8.getBackground();
                    if (final_background8 instanceof ColorDrawable) {
                        final_color8 = (((ColorDrawable) final_background8).getColor());
                    }
                    int final_color9 = Color.RED;
                    Drawable final_background9 = color9.getBackground();
                    if (final_background9 instanceof ColorDrawable) {
                        final_color9 = (((ColorDrawable) final_background9).getColor());
                    }
                    int final_color10 = Color.RED;
                    Drawable final_background10 = color10.getBackground();
                    if (final_background10 instanceof ColorDrawable) {
                        final_color10 = (((ColorDrawable) final_background10).getColor());
                    }
                    int final_color11 = Color.RED;
                    Drawable final_background11 = color11.getBackground();
                    if (final_background11 instanceof ColorDrawable) {
                        final_color11 = (((ColorDrawable) final_background11).getColor());
                    }
                    int final_color12 = Color.RED;
                    Drawable final_background12 = color12.getBackground();
                    if (final_background12 instanceof ColorDrawable) {
                        final_color12 = (((ColorDrawable) final_background12).getColor());
                    }
                    int final_color14 = Color.RED;
                    Drawable final_background14 = color14.getBackground();
                    if (final_background14 instanceof ColorDrawable) {
                        final_color14 = (((ColorDrawable) final_background14).getColor());
                    }
                    int final_color15 = Color.RED;
                    Drawable final_background15 = color15.getBackground();
                    if (final_background15 instanceof ColorDrawable) {
                        final_color15 = (((ColorDrawable) final_background15).getColor());
                    }
                    int final_color_button161 = Color.RED;
                    Drawable final_background_Button161 = Button161.getBackground();
                    if (final_background_Button161 instanceof ColorDrawable) {
                        final_color_button161 = (((ColorDrawable) final_background_Button161).getColor());
                    }
                    int final_color_button162 = Color.RED;
                    Drawable final_background_Button162 = Button162.getBackground();
                    if (final_background_Button162 instanceof ColorDrawable) {
                        final_color_button162 = (((ColorDrawable) final_background_Button162).getColor());
                    }
                    int final_color_button163 = Color.RED;
                    Drawable final_background_Button163 = Button163.getBackground();
                    if (final_background_Button163 instanceof ColorDrawable) {
                        final_color_button163 = (((ColorDrawable) final_background_Button163).getColor());
                    }
                    int final_color_button164 = Color.RED;
                    Drawable final_background_Button164 = Button164.getBackground();
                    if (final_background_Button164 instanceof ColorDrawable) {
                        final_color_button164 = (((ColorDrawable) final_background_Button164).getColor());
                    }
                    int final_color_button165 = Color.RED;
                    Drawable final_background_Button165 = Button165.getBackground();
                    if (final_background_Button165 instanceof ColorDrawable) {
                        final_color_button165 = (((ColorDrawable) final_background_Button165).getColor());
                    }
                    if (final_color_button161 != color_default && final_color_button162 != color_default && final_color_button163 != color_default && final_color_button164 != color_default && final_color_button165 != color_default&&final_color_button161!=color_black&&final_color_button162!=color_black&&final_color_button163!=color_black&&final_color_button164!=color_black&&final_color_button165!=color_black) {
                        a19.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button171.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button172.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button173.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button174.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button175.setBackgroundColor(Color.rgb(236, 239, 241));
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 13) {
                                if (final_color_button161 == final_color13)
                                    Button171.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13) {
                                if (final_color_button161 == final_color13)
                                    Button171.setBackgroundColor(Color.CYAN);
                            }
                        }
                        /*for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 2) {
                                if (final_color_button161 == final_color2)
                                    Button171.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2) {
                                if (final_color_button161 == final_color2)
                                    Button171.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 3) {
                                if (final_color_button161 == final_color3)
                                    Button171.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3) {
                                if (final_color_button161 == final_color3)
                                    Button171.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 4) {
                                if (final_color_button161 == final_color4)
                                    Button171.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4) {
                                if (final_color_button161 == final_color4)
                                    Button171.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 5) {
                                if (final_color_button161 == final_color5)
                                    Button171.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5) {
                                if (final_color_button161 == final_color5)
                                    Button171.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 6) {
                                if (final_color_button161 == final_color6)
                                    Button171.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6) {
                                if (final_color_button161 == final_color6)
                                    Button171.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 7) {
                                if (final_color_button161 == final_color7)
                                    Button171.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7) {
                                if (final_color_button161 == final_color7)
                                    Button171.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 8) {
                                if (final_color_button161 == final_color8)
                                    Button171.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8) {
                                if (final_color_button161 == final_color8)
                                    Button171.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 9) {
                                if (final_color_button161 == final_color9)
                                    Button171.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9) {
                                if (final_color_button161 == final_color9)
                                    Button171.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 10) {
                                if (final_color_button161 == final_color10)
                                    Button171.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10) {
                                if (final_color_button161 == final_color10)
                                    Button171.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 11) {
                                if (final_color_button161 == final_color11)
                                    Button171.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11) {
                                if (final_color_button161 == final_color11)
                                    Button171.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 12) {
                                if (final_color_button161 == final_color12)
                                    Button171.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12) {
                                if (final_color_button161 == final_color12)
                                    Button171.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 14) {
                                if (final_color_button161 == final_color14)
                                    Button171.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14) {
                                if (final_color_button161 == final_color14)
                                    Button171.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 15) {
                                if (final_color_button161 == final_color15)
                                    Button171.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15) {
                                if (final_color_button161 == final_color15)
                                    Button171.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 13) {
                                if (final_color_button162 == final_color13)
                                    Button172.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13 && x != 1) {
                                if (final_color_button162 == final_color13)
                                    Button172.setBackgroundColor(Color.CYAN);
                            }
                        }
                        /*for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 2) {
                                if (final_color_button162 == final_color2)
                                    Button172.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2 && x != 1) {
                                if (final_color_button162 == final_color2)
                                    Button172.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 3) {
                                if (final_color_button162 == final_color3)
                                    Button172.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3 && x != 1) {
                                if (final_color_button162 == final_color3)
                                    Button172.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 4) {
                                if (final_color_button162 == final_color4)
                                    Button172.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4 && x != 1) {
                                if (final_color_button162 == final_color4)
                                    Button172.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 5) {
                                if (final_color_button162 == final_color5)
                                    Button172.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5 && x != 1) {
                                if (final_color_button162 == final_color5)
                                    Button172.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 6) {
                                if (final_color_button162 == final_color6)
                                    Button172.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6 && x != 1) {
                                if (final_color_button162 == final_color6)
                                    Button172.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 7) {
                                if (final_color_button162 == final_color7)
                                    Button172.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7 && x != 1) {
                                if (final_color_button162 == final_color7)
                                    Button172.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 8) {
                                if (final_color_button162 == final_color8)
                                    Button172.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8 && x != 1) {
                                if (final_color_button162 == final_color8)
                                    Button172.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 9) {
                                if (final_color_button162 == final_color9)
                                    Button172.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9 && x != 1) {
                                if (final_color_button162 == final_color9)
                                    Button172.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 10) {
                                if (final_color_button162 == final_color10)
                                    Button172.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10 && x != 1) {
                                if (final_color_button162 == final_color10)
                                    Button172.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 11) {
                                if (final_color_button162 == final_color11)
                                    Button172.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11 && x != 1) {
                                if (final_color_button162 == final_color11)
                                    Button172.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 12) {
                                if (final_color_button162 == final_color12)
                                    Button172.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12 && x != 1) {
                                if (final_color_button162 == final_color12)
                                    Button172.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 14) {
                                if (final_color_button162 == final_color14)
                                    Button172.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14 && x != 1) {
                                if (final_color_button162 == final_color14)
                                    Button172.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 15) {
                                if (final_color_button162 == final_color15)
                                    Button172.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15 && x != 1) {
                                if (final_color_button162 == final_color15)
                                    Button172.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 13) {
                                if (final_color_button163 == final_color13)
                                    Button173.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13 && x != 2) {
                                if (final_color_button163 == final_color13)
                                    Button173.setBackgroundColor(Color.CYAN);
                            }
                        }
                        /*for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 2) {
                                if (final_color_button163 == final_color2)
                                    Button173.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2 && x != 2) {
                                if (final_color_button163 == final_color2)
                                    Button173.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 3) {
                                if (final_color_button163 == final_color3)
                                    Button173.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3 && x != 2) {
                                if (final_color_button163 == final_color3)
                                    Button173.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 4) {
                                if (final_color_button163 == final_color4)
                                    Button173.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4 && x != 2) {
                                if (final_color_button163 == final_color4)
                                    Button173.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 5) {
                                if (final_color_button163 == final_color5)
                                    Button173.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5 && x != 2) {
                                if (final_color_button163 == final_color5)
                                    Button173.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 6) {
                                if (final_color_button163 == final_color6)
                                    Button173.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6 && x != 2) {
                                if (final_color_button163 == final_color6)
                                    Button173.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 7) {
                                if (final_color_button163 == final_color7)
                                    Button173.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7 && x != 2) {
                                if (final_color_button163 == final_color7)
                                    Button173.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 8) {
                                if (final_color_button163 == final_color8)
                                    Button173.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8 && x != 2) {
                                if (final_color_button163 == final_color8)
                                    Button173.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 9) {
                                if (final_color_button163 == final_color9)
                                    Button173.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9 && x != 2) {
                                if (final_color_button163 == final_color9)
                                    Button173.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 10) {
                                if (final_color_button163 == final_color10)
                                    Button173.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10 && x != 2) {
                                if (final_color_button163 == final_color10)
                                    Button173.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 11) {
                                if (final_color_button163 == final_color11)
                                    Button173.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11 && x != 2) {
                                if (final_color_button163 == final_color11)
                                    Button173.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 12) {
                                if (final_color_button163 == final_color12)
                                    Button173.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12 && x != 2) {
                                if (final_color_button163 == final_color12)
                                    Button173.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 14) {
                                if (final_color_button163 == final_color14)
                                    Button173.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14 && x != 2) {
                                if (final_color_button163 == final_color14)
                                    Button173.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 15) {
                                if (final_color_button163 == final_color15)
                                    Button173.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15 && x != 2) {
                                if (final_color_button163 == final_color15)
                                    Button173.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 13) {
                                if (final_color_button164 == final_color13)
                                    Button174.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13 && x != 3) {
                                if (final_color_button164 == final_color13)
                                    Button174.setBackgroundColor(Color.CYAN);
                            }
                        }
                        /*for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 2) {
                                if (final_color_button164 == final_color2)
                                    Button174.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2 && x != 3) {
                                if (final_color_button164 == final_color2)
                                    Button174.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 3) {
                                if (final_color_button164 == final_color3)
                                    Button174.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3 && x != 3) {
                                if (final_color_button164 == final_color3)
                                    Button174.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 4) {
                                if (final_color_button164 == final_color4)
                                    Button174.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4 && x != 3) {
                                if (final_color_button164 == final_color4)
                                    Button174.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 5) {
                                if (final_color_button164 == final_color5)
                                    Button174.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5 && x != 3) {
                                if (final_color_button164 == final_color5)
                                    Button174.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 6) {
                                if (final_color_button164 == final_color6)
                                    Button174.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6 && x != 3) {
                                if (final_color_button164 == final_color6)
                                    Button174.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 7) {
                                if (final_color_button164 == final_color7)
                                    Button174.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7 && x != 3) {
                                if (final_color_button164 == final_color7)
                                    Button174.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 8) {
                                if (final_color_button164 == final_color8)
                                    Button174.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8 && x != 3) {
                                if (final_color_button164 == final_color8)
                                    Button174.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 9) {
                                if (final_color_button164 == final_color9)
                                    Button174.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9 && x != 3) {
                                if (final_color_button164 == final_color9)
                                    Button174.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 10) {
                                if (final_color_button164 == final_color10)
                                    Button174.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10 && x != 3) {
                                if (final_color_button164 == final_color10)
                                    Button174.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 11) {
                                if (final_color_button164 == final_color11)
                                    Button174.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11 && x != 3) {
                                if (final_color_button164 == final_color11)
                                    Button174.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 12) {
                                if (final_color_button164 == final_color12)
                                    Button174.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12 && x != 3) {
                                if (final_color_button164 == final_color12)
                                    Button174.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 14) {
                                if (final_color_button164 == final_color14)
                                    Button174.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14 && x != 3) {
                                if (final_color_button164 == final_color14)
                                    Button174.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 15) {
                                if (final_color_button164 == final_color15)
                                    Button174.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15 && x != 3) {
                                if (final_color_button164 == final_color15)
                                    Button174.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 13) {
                                if (final_color_button165 == final_color13)
                                    Button175.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13) {
                                if (final_color_button165 == final_color13)
                                    Button175.setBackgroundColor(Color.CYAN);
                            }
                        }
                        /*for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 2) {
                                if (final_color_button165 == final_color2)
                                    Button175.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2) {
                                if (final_color_button165 == final_color2)
                                    Button175.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 3) {
                                if (final_color_button165 == final_color3)
                                    Button175.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3) {
                                if (final_color_button165 == final_color3)
                                    Button175.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 4) {
                                if (final_color_button165 == final_color4)
                                    Button175.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4) {
                                if (final_color_button165 == final_color4)
                                    Button175.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 5) {
                                if (final_color_button165 == final_color5)
                                    Button175.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5) {
                                if (final_color_button165 == final_color5)
                                    Button175.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 6) {
                                if (final_color_button165 == final_color6)
                                    Button175.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6) {
                                if (final_color_button165 == final_color6)
                                    Button175.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 7) {
                                if (final_color_button165 == final_color7)
                                    Button175.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7) {
                                if (final_color_button165 == final_color7)
                                    Button175.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 8) {
                                if (final_color_button165 == final_color8)
                                    Button175.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8) {
                                if (final_color_button165 == final_color8)
                                    Button175.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 9) {
                                if (final_color_button165 == final_color9)
                                    Button175.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9) {
                                if (final_color_button165 == final_color9)
                                    Button175.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 10) {
                                if (final_color_button165 == final_color10)
                                    Button175.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10) {
                                if (final_color_button165 == final_color10)
                                    Button175.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 11) {
                                if (final_color_button165 == final_color11)
                                    Button175.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11) {
                                if (final_color_button165 == final_color11)
                                    Button175.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 12) {
                                if (final_color_button165 == final_color12)
                                    Button175.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12) {
                                if (final_color_button165 == final_color12)
                                    Button175.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 14) {
                                if (final_color_button165 == final_color14)
                                    Button175.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14) {
                                if (final_color_button165 == final_color14)
                                    Button175.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 15) {
                                if (final_color_button165 == final_color15)
                                    Button175.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15) {
                                if (final_color_button165 == final_color15)
                                    Button175.setBackgroundColor(Color.CYAN);
                            }
                        }
                        final List<Integer> b = new ArrayList<>();
                        Random random = new Random(System.currentTimeMillis());
                        for (int i = 0; i < 5; i++) {
                            while (true) {
                                Integer next = random.nextInt(5) + 1;
                                if (!b.contains(next)) {
                                    b.add(next);
                                    break;
                                }
                            }
                        }
                        int final_color_button1 = Color.RED;
                        Drawable final_background_button1 = Button171.getBackground();
                        if (final_background_button1 instanceof ColorDrawable) {
                            final_color_button1 = (((ColorDrawable) final_background_button1).getColor());
                        }
                        int final_color_button2 = Color.RED;
                        Drawable final_background_button2 = Button172.getBackground();
                        if (final_background_button2 instanceof ColorDrawable) {
                            final_color_button2 = (((ColorDrawable) final_background_button2).getColor());
                        }
                        int final_color_button3 = Color.RED;
                        Drawable final_background_button3 = Button173.getBackground();
                        if (final_background_button3 instanceof ColorDrawable) {
                            final_color_button3 = (((ColorDrawable) final_background_button3).getColor());
                        }
                        int final_color_button4 = Color.RED;
                        Drawable final_background_button4 = Button174.getBackground();
                        if (final_background_button4 instanceof ColorDrawable) {
                            final_color_button4 = (((ColorDrawable) final_background_button4).getColor());
                        }
                        int final_color_button5 = Color.RED;
                        Drawable final_background_button5 = Button175.getBackground();
                        if (final_background_button5 instanceof ColorDrawable) {
                            final_color_button5 = (((ColorDrawable) final_background_button5).getColor());
                        }
                        if (b.get(0) == 1) {
                            Button171.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(0) == 2) {
                            Button171.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(0) == 3) {
                            Button171.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(0) == 4) {
                            Button171.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(0) == 5) {
                            Button171.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(1) == 1) {
                            Button172.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(1) == 2) {
                            Button172.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(1) == 3) {
                            Button172.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(1) == 4) {
                            Button172.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(1) == 5) {
                            Button172.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(2) == 1) {
                            Button173.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(2) == 2) {
                            Button173.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(2) == 3) {
                            Button173.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(2) == 4) {
                            Button173.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(2) == 5) {
                            Button173.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(3) == 1) {
                            Button174.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(3) == 2) {
                            Button174.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(3) == 3) {
                            Button174.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(3) == 4) {
                            Button174.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(3) == 5) {
                            Button174.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(4) == 1) {
                            Button175.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(4) == 2) {
                            Button175.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(4) == 3) {
                            Button175.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(4) == 4) {
                            Button175.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(4) == 5) {
                            Button175.setBackgroundColor(final_color_button5);
                        }
                        int count = Color.RED;
                        if ((final_color_button1 == count) && (final_color_button2 == count) && (final_color_button3 == count) && (final_color_button4 == count) && (final_color_button5 == count)) {
                            Toast.makeText(getApplicationContext(), "YOU WON", Toast.LENGTH_LONG).show();}
                        else {
                            View SplitLine9 = (View)findViewById(R.id.SplitLine9);
                            SplitLine9.setBackgroundColor(Color.GREEN);
                            Go9.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button181.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button182.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button183.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button184.setBackgroundColor(Color.rgb(236, 239, 241));
                            Button185.setBackgroundColor(Color.rgb(236, 239, 241));
                        }
                        level9[0]++;
                    }
                }
            }
        });
        final int[] level10 = new int[1];
        level10[0] = 0;
        Button181.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level10[0] == 0&&level9[0]!=0&&level8[0]!=0&&level7[0]!=0&&level6[0]!=0&&level5[0]!=0&&level4[0]!=0&&level3[0]!=0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_Button202 = Color.RED;
                    Drawable background_Button182 = Button182.getBackground();
                    if (background_Button182 instanceof ColorDrawable) {
                        color_Button202 = (((ColorDrawable) background_Button182).getColor());
                    }
                    int color_Button203 = Color.RED;
                    Drawable background_Button183 = Button183.getBackground();
                    if (background_Button183 instanceof ColorDrawable) {
                        color_Button203 = (((ColorDrawable) background_Button183).getColor());
                    }
                    int color_Button204 = Color.RED;
                    Drawable background_Button184 = Button184.getBackground();
                    if (background_Button184 instanceof ColorDrawable) {
                        color_Button204 = (((ColorDrawable) background_Button184).getColor());
                    }
                    int color_Button205 = Color.RED;
                    Drawable background_Button185 = Button185.getBackground();
                    if (background_Button185 instanceof ColorDrawable) {
                        color_Button205 = (((ColorDrawable) background_Button185).getColor());
                    }
                    if (color_current_selection == color_Button202 || color_current_selection == color_Button203 || color_current_selection == color_Button204 || color_current_selection == color_Button205) {
                    } else
                        Button181.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button182.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level10[0] == 0&&level9[0]!=0&&level8[0]!=0&&level7[0]!=0&&level6[0]!=0&&level5[0]!=0&&level4[0]!=0&&level3[0]!=0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_Button203 = Color.RED;
                    Drawable background_Button183 = Button183.getBackground();
                    if (background_Button183 instanceof ColorDrawable) {
                        color_Button203 = (((ColorDrawable) background_Button183).getColor());
                    }
                    int color_Button204 = Color.RED;
                    Drawable background_Button184 = Button184.getBackground();
                    if (background_Button184 instanceof ColorDrawable) {
                        color_Button204 = (((ColorDrawable) background_Button184).getColor());
                    }
                    int color_Button205 = Color.RED;
                    Drawable background_Button185 = Button185.getBackground();
                    if (background_Button185 instanceof ColorDrawable) {
                        color_Button205 = (((ColorDrawable) background_Button185).getColor());
                    }
                    int color_Button181 = Color.RED;
                    Drawable background_Button181 = Button181.getBackground();
                    if (background_Button181 instanceof ColorDrawable) {
                        color_Button181 = (((ColorDrawable) background_Button181).getColor());
                    }
                    if (color_current_selection == color_Button181 || color_current_selection == color_Button203 || color_current_selection == color_Button204 || color_current_selection == color_Button205) {
                    } else
                        Button182.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button183.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level10[0] == 0&&level9[0]!=0&&level8[0]!=0&&level7[0]!=0&&level6[0]!=0&&level5[0]!=0&&level4[0]!=0&&level3[0]!=0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_Button181 = Color.RED;
                    Drawable background_Button181 = Button181.getBackground();
                    if (background_Button181 instanceof ColorDrawable) {
                        color_Button181 = (((ColorDrawable) background_Button181).getColor());
                    }
                    int color_Button204 = Color.RED;
                    Drawable background_Button184 = Button184.getBackground();
                    if (background_Button184 instanceof ColorDrawable) {
                        color_Button204 = (((ColorDrawable) background_Button184).getColor());
                    }
                    int color_Button205 = Color.RED;
                    Drawable background_Button185 = Button185.getBackground();
                    if (background_Button185 instanceof ColorDrawable) {
                        color_Button205 = (((ColorDrawable) background_Button185).getColor());
                    }
                    int color_Button202 = Color.RED;
                    Drawable background_Button182 = Button182.getBackground();
                    if (background_Button182 instanceof ColorDrawable) {
                        color_Button202 = (((ColorDrawable) background_Button182).getColor());
                    }
                    if (color_current_selection == color_Button181 || color_current_selection == color_Button202 || color_current_selection == color_Button204 || color_current_selection == color_Button205) {
                    } else
                        Button183.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button184.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level10[0] == 0&&level9[0]!=0&&level8[0]!=0&&level7[0]!=0&&level6[0]!=0&&level5[0]!=0&&level4[0]!=0&&level3[0]!=0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_Button203 = Color.RED;
                    Drawable background_Button183 = Button183.getBackground();
                    if (background_Button183 instanceof ColorDrawable) {
                        color_Button203 = (((ColorDrawable) background_Button183).getColor());
                    }
                    int color_Button202 = Color.RED;
                    Drawable background_Button182 = Button182.getBackground();
                    if (background_Button182 instanceof ColorDrawable) {
                        color_Button202 = (((ColorDrawable) background_Button182).getColor());
                    }
                    int color_Button205 = Color.RED;
                    Drawable background_Button185 = Button185.getBackground();
                    if (background_Button185 instanceof ColorDrawable) {
                        color_Button205 = (((ColorDrawable) background_Button185).getColor());
                    }
                    int color_Button181 = Color.RED;
                    Drawable background_Button181 = Button181.getBackground();
                    if (background_Button181 instanceof ColorDrawable) {
                        color_Button181 = (((ColorDrawable) background_Button181).getColor());
                    }
                    if (color_current_selection == color_Button181 || color_current_selection == color_Button203 || color_current_selection == color_Button202 || color_current_selection == color_Button205) {
                    } else
                        Button184.setBackgroundColor(color_current_selection);
                }
            }
        });
        Button185.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level10[0] == 0&&level9[0]!=0&&level8[0]!=0&&level7[0]!=0&&level6[0]!=0&&level5[0]!=0&&level4[0]!=0&&level3[0]!=0&&level2[0]!=0&&level1[0]!=0) {
                    int color_current_selection = Color.RED;
                    Drawable background = Current_Selection.getBackground();
                    if (background instanceof ColorDrawable) {
                        color_current_selection = (((ColorDrawable) background).getColor());
                    }
                    int color_Button203 = Color.RED;
                    Drawable background_Button183 = Button183.getBackground();
                    if (background_Button183 instanceof ColorDrawable) {
                        color_Button203 = (((ColorDrawable) background_Button183).getColor());
                    }
                    int color_Button204 = Color.RED;
                    Drawable background_Button184 = Button184.getBackground();
                    if (background_Button184 instanceof ColorDrawable) {
                        color_Button204 = (((ColorDrawable) background_Button184).getColor());
                    }
                    int color_Button202 = Color.RED;
                    Drawable background_Button182 = Button182.getBackground();
                    if (background_Button182 instanceof ColorDrawable) {
                        color_Button202 = (((ColorDrawable) background_Button182).getColor());
                    }
                    int color_Button181 = Color.RED;
                    Drawable background_Button181 = Button181.getBackground();
                    if (background_Button181 instanceof ColorDrawable) {
                        color_Button181 = (((ColorDrawable) background_Button181).getColor());
                    }
                    if (color_current_selection == color_Button181 || color_current_selection == color_Button203 || color_current_selection == color_Button204 || color_current_selection == color_Button202) {
                    } else
                        Button185.setBackgroundColor(color_current_selection);
                }
            }
        });
        Go9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (level10[0] == 0) {

                    int final_color13 = Color.RED;
                    Drawable final_background1 = color13.getBackground();
                    if (final_background1 instanceof ColorDrawable) {
                        final_color13 = (((ColorDrawable) final_background1).getColor());
                    }
                    /*int final_color2 = Color.RED;
                    Drawable final_background2 = color2.getBackground();
                    if (final_background2 instanceof ColorDrawable) {
                        final_color2 = (((ColorDrawable) final_background2).getColor());
                    }
                    int final_color3 = Color.RED;
                    Drawable final_background3 = color3.getBackground();
                    if (final_background3 instanceof ColorDrawable) {
                        final_color3 = (((ColorDrawable) final_background3).getColor());
                    }*/
                    int final_color4 = Color.RED;
                    Drawable final_background4 = color4.getBackground();
                    if (final_background4 instanceof ColorDrawable) {
                        final_color4 = (((ColorDrawable) final_background4).getColor());
                    }
                    int final_color5 = Color.RED;
                    Drawable final_background5 = color5.getBackground();
                    if (final_background5 instanceof ColorDrawable) {
                        final_color5 = (((ColorDrawable) final_background5).getColor());
                    }
                    int final_color6 = Color.RED;
                    Drawable final_background6 = color6.getBackground();
                    if (final_background6 instanceof ColorDrawable) {
                        final_color6 = (((ColorDrawable) final_background6).getColor());
                    }
                    int final_color7 = Color.RED;
                    Drawable final_background7 = color7.getBackground();
                    if (final_background7 instanceof ColorDrawable) {
                        final_color7 = (((ColorDrawable) final_background7).getColor());
                    }
                    int final_color8 = Color.RED;
                    Drawable final_background8 = color8.getBackground();
                    if (final_background8 instanceof ColorDrawable) {
                        final_color8 = (((ColorDrawable) final_background8).getColor());
                    }
                    int final_color9 = Color.RED;
                    Drawable final_background9 = color9.getBackground();
                    if (final_background9 instanceof ColorDrawable) {
                        final_color9 = (((ColorDrawable) final_background9).getColor());
                    }
                    int final_color10 = Color.RED;
                    Drawable final_background10 = color10.getBackground();
                    if (final_background10 instanceof ColorDrawable) {
                        final_color10 = (((ColorDrawable) final_background10).getColor());
                    }
                    int final_color11 = Color.RED;
                    Drawable final_background11 = color11.getBackground();
                    if (final_background11 instanceof ColorDrawable) {
                        final_color11 = (((ColorDrawable) final_background11).getColor());
                    }
                    int final_color12 = Color.RED;
                    Drawable final_background12 = color12.getBackground();
                    if (final_background12 instanceof ColorDrawable) {
                        final_color12 = (((ColorDrawable) final_background12).getColor());
                    }
                    int final_color14 = Color.RED;
                    Drawable final_background14 = color14.getBackground();
                    if (final_background14 instanceof ColorDrawable) {
                        final_color14 = (((ColorDrawable) final_background14).getColor());
                    }
                    int final_color15 = Color.RED;
                    Drawable final_background15 = color15.getBackground();
                    if (final_background15 instanceof ColorDrawable) {
                        final_color15 = (((ColorDrawable) final_background15).getColor());
                    }
                    int final_color_Button181 = Color.RED;
                    Drawable final_background_Button181 = Button181.getBackground();
                    if (final_background_Button181 instanceof ColorDrawable) {
                        final_color_Button181 = (((ColorDrawable) final_background_Button181).getColor());
                    }
                    int final_color_Button182 = Color.RED;
                    Drawable final_background_Button182 = Button182.getBackground();
                    if (final_background_Button182 instanceof ColorDrawable) {
                        final_color_Button182 = (((ColorDrawable) final_background_Button182).getColor());
                    }
                    int final_color_Button183 = Color.RED;
                    Drawable final_background_Button183 = Button183.getBackground();
                    if (final_background_Button183 instanceof ColorDrawable) {
                        final_color_Button183 = (((ColorDrawable) final_background_Button183).getColor());
                    }
                    int final_color_Button184 = Color.RED;
                    Drawable final_background_Button184 = Button184.getBackground();
                    if (final_background_Button184 instanceof ColorDrawable) {
                        final_color_Button184 = (((ColorDrawable) final_background_Button184).getColor());
                    }
                    int final_color_Button185 = Color.RED;
                    Drawable final_background_Button185 = Button185.getBackground();
                    if (final_background_Button185 instanceof ColorDrawable) {
                        final_color_Button185 = (((ColorDrawable) final_background_Button185).getColor());
                    }
                    if (final_color_Button181 != color_default && final_color_Button182 != color_default && final_color_Button183 != color_default && final_color_Button184 != color_default && final_color_Button185 != color_default&&final_color_Button181!=color_black&&final_color_Button182!=color_black&&final_color_Button183!=color_black&&final_color_Button184!=color_black&&final_color_Button185!=color_black) {
                        a110.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button191.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button192.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button193.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button194.setBackgroundColor(Color.rgb(236, 239, 241));
                        Button195.setBackgroundColor(Color.rgb(236, 239, 241));
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 13) {
                                if (final_color_Button181 == final_color13)
                                    Button191.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13) {
                                if (final_color_Button181 == final_color13)
                                    Button191.setBackgroundColor(Color.CYAN);
                            }
                        }
                        /*for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 2) {
                                if (final_color_Button181 == final_color2)
                                    Button191.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2) {
                                if (final_color_Button181 == final_color2)
                                    Button191.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 3) {
                                if (final_color_Button181 == final_color3)
                                    Button191.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3) {
                                if (final_color_Button181 == final_color3)
                                    Button191.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 4) {
                                if (final_color_Button181 == final_color4)
                                    Button191.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4) {
                                if (final_color_Button181 == final_color4)
                                    Button191.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 5) {
                                if (final_color_Button181 == final_color5)
                                    Button191.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5) {
                                if (final_color_Button181 == final_color5)
                                    Button191.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 6) {
                                if (final_color_Button181 == final_color6)
                                    Button191.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6) {
                                if (final_color_Button181 == final_color6)
                                    Button191.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 7) {
                                if (final_color_Button181 == final_color7)
                                    Button191.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7) {
                                if (final_color_Button181 == final_color7)
                                    Button191.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 8) {
                                if (final_color_Button181 == final_color8)
                                    Button191.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8) {
                                if (final_color_Button181 == final_color8)
                                    Button191.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 9) {
                                if (final_color_Button181 == final_color9)
                                    Button191.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9) {
                                if (final_color_Button181 == final_color9)
                                    Button191.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 10) {
                                if (final_color_Button181 == final_color10)
                                    Button191.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10) {
                                if (final_color_Button181 == final_color10)
                                    Button191.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 11) {
                                if (final_color_Button181 == final_color11)
                                    Button191.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11) {
                                if (final_color_Button181 == final_color11)
                                    Button191.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 12) {
                                if (final_color_Button181 == final_color12)
                                    Button191.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12) {
                                if (final_color_Button181 == final_color12)
                                    Button191.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 14) {
                                if (final_color_Button181 == final_color14)
                                    Button191.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14) {
                                if (final_color_Button181 == final_color14)
                                    Button191.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 1; x < 5; x++) {
                            if (a.get(0) == 15) {
                                if (final_color_Button181 == final_color15)
                                    Button191.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15) {
                                if (final_color_Button181 == final_color15)
                                    Button191.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 13) {
                                if (final_color_Button182 == final_color13)
                                    Button192.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13 && x != 1) {
                                if (final_color_Button182 == final_color13)
                                    Button192.setBackgroundColor(Color.CYAN);
                            }
                        }
                        /*for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 2) {
                                if (final_color_Button182 == final_color2)
                                    Button192.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2 && x != 1) {
                                if (final_color_Button182 == final_color2)
                                    Button192.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 3) {
                                if (final_color_Button182 == final_color3)
                                    Button192.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3 && x != 1) {
                                if (final_color_Button182 == final_color3)
                                    Button192.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 4) {
                                if (final_color_Button182 == final_color4)
                                    Button192.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4 && x != 1) {
                                if (final_color_Button182 == final_color4)
                                    Button192.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 5) {
                                if (final_color_Button182 == final_color5)
                                    Button192.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5 && x != 1) {
                                if (final_color_Button182 == final_color5)
                                    Button192.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 6) {
                                if (final_color_Button182 == final_color6)
                                    Button192.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6 && x != 1) {
                                if (final_color_Button182 == final_color6)
                                    Button192.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 7) {
                                if (final_color_Button182 == final_color7)
                                    Button192.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7 && x != 1) {
                                if (final_color_Button182 == final_color7)
                                    Button192.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 8) {
                                if (final_color_Button182 == final_color8)
                                    Button192.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8 && x != 1) {
                                if (final_color_Button182 == final_color8)
                                    Button192.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 9) {
                                if (final_color_Button182 == final_color9)
                                    Button192.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9 && x != 1) {
                                if (final_color_Button182 == final_color9)
                                    Button192.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 10) {
                                if (final_color_Button182 == final_color10)
                                    Button192.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10 && x != 1) {
                                if (final_color_Button182 == final_color10)
                                    Button192.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 11) {
                                if (final_color_Button182 == final_color11)
                                    Button192.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11 && x != 1) {
                                if (final_color_Button182 == final_color11)
                                    Button192.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 12) {
                                if (final_color_Button182 == final_color12)
                                    Button192.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12 && x != 1) {
                                if (final_color_Button182 == final_color12)
                                    Button192.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 14) {
                                if (final_color_Button182 == final_color14)
                                    Button192.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14 && x != 1) {
                                if (final_color_Button182 == final_color14)
                                    Button192.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(1) == 15) {
                                if (final_color_Button182 == final_color15)
                                    Button192.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15 && x != 1) {
                                if (final_color_Button182 == final_color15)
                                    Button192.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 13) {
                                if (final_color_Button183 == final_color13)
                                    Button193.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13 && x != 2) {
                                if (final_color_Button183 == final_color13)
                                    Button193.setBackgroundColor(Color.CYAN);
                            }
                        }
                        /*for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 2) {
                                if (final_color_Button183 == final_color2)
                                    Button193.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2 && x != 2) {
                                if (final_color_Button183 == final_color2)
                                    Button193.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 3) {
                                if (final_color_Button183 == final_color3)
                                    Button193.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3 && x != 2) {
                                if (final_color_Button183 == final_color3)
                                    Button193.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 4) {
                                if (final_color_Button183 == final_color4)
                                    Button193.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4 && x != 2) {
                                if (final_color_Button183 == final_color4)
                                    Button193.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 5) {
                                if (final_color_Button183 == final_color5)
                                    Button193.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5 && x != 2) {
                                if (final_color_Button183 == final_color5)
                                    Button193.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 6) {
                                if (final_color_Button183 == final_color6)
                                    Button193.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6 && x != 2) {
                                if (final_color_Button183 == final_color6)
                                    Button193.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 7) {
                                if (final_color_Button183 == final_color7)
                                    Button193.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7 && x != 2) {
                                if (final_color_Button183 == final_color7)
                                    Button193.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 8) {
                                if (final_color_Button183 == final_color8)
                                    Button193.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8 && x != 2) {
                                if (final_color_Button183 == final_color8)
                                    Button193.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 9) {
                                if (final_color_Button183 == final_color9)
                                    Button193.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9 && x != 2) {
                                if (final_color_Button183 == final_color9)
                                    Button193.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 10) {
                                if (final_color_Button183 == final_color10)
                                    Button193.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10 && x != 2) {
                                if (final_color_Button183 == final_color10)
                                    Button193.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 11) {
                                if (final_color_Button183 == final_color11)
                                    Button193.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11 && x != 2) {
                                if (final_color_Button183 == final_color11)
                                    Button193.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 12) {
                                if (final_color_Button183 == final_color12)
                                    Button193.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12 && x != 2) {
                                if (final_color_Button183 == final_color12)
                                    Button193.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 14) {
                                if (final_color_Button183 == final_color14)
                                    Button193.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14 && x != 2) {
                                if (final_color_Button183 == final_color14)
                                    Button193.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(2) == 15) {
                                if (final_color_Button183 == final_color15)
                                    Button193.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15 && x != 2) {
                                if (final_color_Button183 == final_color15)
                                    Button193.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 13) {
                                if (final_color_Button184 == final_color13)
                                    Button194.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13 && x != 3) {
                                if (final_color_Button184 == final_color13)
                                    Button194.setBackgroundColor(Color.CYAN);
                            }
                        }
                        /*for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 2) {
                                if (final_color_Button184 == final_color2)
                                    Button194.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2 && x != 3) {
                                if (final_color_Button184 == final_color2)
                                    Button194.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 3) {
                                if (final_color_Button184 == final_color3)
                                    Button194.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3 && x != 3) {
                                if (final_color_Button184 == final_color3)
                                    Button194.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 4) {
                                if (final_color_Button184 == final_color4)
                                    Button194.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4 && x != 3) {
                                if (final_color_Button184 == final_color4)
                                    Button194.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 5) {
                                if (final_color_Button184 == final_color5)
                                    Button194.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5 && x != 3) {
                                if (final_color_Button184 == final_color5)
                                    Button194.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 6) {
                                if (final_color_Button184 == final_color6)
                                    Button194.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6 && x != 3) {
                                if (final_color_Button184 == final_color6)
                                    Button194.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 7) {
                                if (final_color_Button184 == final_color7)
                                    Button194.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7 && x != 3) {
                                if (final_color_Button184 == final_color7)
                                    Button194.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 8) {
                                if (final_color_Button184 == final_color8)
                                    Button194.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8 && x != 3) {
                                if (final_color_Button184 == final_color8)
                                    Button194.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 9) {
                                if (final_color_Button184 == final_color9)
                                    Button194.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9 && x != 3) {
                                if (final_color_Button184 == final_color9)
                                    Button194.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 10) {
                                if (final_color_Button184 == final_color10)
                                    Button194.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10 && x != 3) {
                                if (final_color_Button184 == final_color10)
                                    Button194.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 11) {
                                if (final_color_Button184 == final_color11)
                                    Button194.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11 && x != 3) {
                                if (final_color_Button184 == final_color11)
                                    Button194.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 12) {
                                if (final_color_Button184 == final_color12)
                                    Button194.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12 && x != 3) {
                                if (final_color_Button184 == final_color12)
                                    Button194.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 14) {
                                if (final_color_Button184 == final_color14)
                                    Button194.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4 && x != 3) {
                                if (final_color_Button184 == final_color14)
                                    Button194.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 5; x++) {
                            if (a.get(3) == 15) {
                                if (final_color_Button184 == final_color15)
                                    Button194.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15 && x != 3) {
                                if (final_color_Button184 == final_color15)
                                    Button194.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 13) {
                                if (final_color_Button185 == final_color13)
                                    Button195.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 13) {
                                if (final_color_Button185 == final_color13)
                                    Button195.setBackgroundColor(Color.CYAN);
                            }
                        }
                        /*for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 2) {
                                if (final_color_Button185 == final_color2)
                                    Button195.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 2) {
                                if (final_color_Button185 == final_color2)
                                    Button195.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 3) {
                                if (final_color_Button185 == final_color3)
                                    Button195.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 3) {
                                if (final_color_Button185 == final_color3)
                                    Button195.setBackgroundColor(Color.CYAN);
                            }
                        }*/
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 4) {
                                if (final_color_Button185 == final_color4)
                                    Button195.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 4) {
                                if (final_color_Button185 == final_color4)
                                    Button195.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 5) {
                                if (final_color_Button185 == final_color5)
                                    Button195.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 5) {
                                if (final_color_Button185 == final_color5)
                                    Button195.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 6) {
                                if (final_color_Button185 == final_color6)
                                    Button195.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 6) {
                                if (final_color_Button185 == final_color6)
                                    Button195.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 7) {
                                if (final_color_Button185 == final_color7)
                                    Button195.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 7) {
                                if (final_color_Button185 == final_color7)
                                    Button195.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 8) {
                                if (final_color_Button185 == final_color8)
                                    Button195.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 8) {
                                if (final_color_Button185 == final_color8)
                                    Button195.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 9) {
                                if (final_color_Button185 == final_color9)
                                    Button195.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 9) {
                                if (final_color_Button185 == final_color9)
                                    Button195.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 10) {
                                if (final_color_Button185 == final_color10)
                                    Button195.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 10) {
                                if (final_color_Button185 == final_color10)
                                    Button195.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 11) {
                                if (final_color_Button185 == final_color11)
                                    Button195.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 11) {
                                if (final_color_Button185 == final_color11)
                                    Button195.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 12) {
                                if (final_color_Button185 == final_color12)
                                    Button195.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 12) {
                                if (final_color_Button185 == final_color12)
                                    Button195.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 14) {
                                if (final_color_Button185 == final_color14)
                                    Button195.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 14) {
                                if (final_color_Button185 == final_color14)
                                    Button195.setBackgroundColor(Color.CYAN);
                            }
                        }
                        for (int x = 0; x < 4; x++) {
                            if (a.get(4) == 15) {
                                if (final_color_Button185 == final_color15)
                                    Button195.setBackgroundColor(Color.RED);
                            } else if (a.get(x) == 15) {
                                if (final_color_Button185 == final_color15)
                                    Button195.setBackgroundColor(Color.CYAN);
                            }
                        }
                        final List<Integer> b = new ArrayList<>();
                        Random random = new Random(System.currentTimeMillis());
                        for (int i = 0; i < 5; i++) {
                            while (true) {
                                Integer next = random.nextInt(5) + 1;
                                if (!b.contains(next)) {
                                    b.add(next);
                                    break;
                                }
                            }
                        }
                        int final_color_button1 = Color.RED;
                        Drawable final_background_button1 = Button191.getBackground();
                        if (final_background_button1 instanceof ColorDrawable) {
                            final_color_button1 = (((ColorDrawable) final_background_button1).getColor());
                        }
                        int final_color_button2 = Color.RED;
                        Drawable final_background_button2 = Button192.getBackground();
                        if (final_background_button2 instanceof ColorDrawable) {
                            final_color_button2 = (((ColorDrawable) final_background_button2).getColor());
                        }
                        int final_color_button3 = Color.RED;
                        Drawable final_background_button3 = Button193.getBackground();
                        if (final_background_button3 instanceof ColorDrawable) {
                            final_color_button3 = (((ColorDrawable) final_background_button3).getColor());
                        }
                        int final_color_button4 = Color.RED;
                        Drawable final_background_button4 = Button194.getBackground();
                        if (final_background_button4 instanceof ColorDrawable) {
                            final_color_button4 = (((ColorDrawable) final_background_button4).getColor());
                        }
                        int final_color_button5 = Color.RED;
                        Drawable final_background_button5 = Button195.getBackground();
                        if (final_background_button5 instanceof ColorDrawable) {
                            final_color_button5 = (((ColorDrawable) final_background_button5).getColor());
                        }
                        if (b.get(0) == 1) {
                            Button191.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(0) == 2) {
                            Button191.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(0) == 3) {
                            Button191.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(0) == 4) {
                            Button191.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(0) == 5) {
                            Button191.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(1) == 1) {
                            Button192.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(1) == 2) {
                            Button192.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(1) == 3) {
                            Button192.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(1) == 4) {
                            Button192.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(1) == 5) {
                            Button192.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(2) == 1) {
                            Button193.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(2) == 2) {
                            Button193.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(2) == 3) {
                            Button193.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(2) == 4) {
                            Button193.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(2) == 5) {
                            Button193.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(3) == 1) {
                            Button194.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(3) == 2) {
                            Button194.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(3) == 3) {
                            Button194.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(3) == 4) {
                            Button194.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(3) == 5) {
                            Button194.setBackgroundColor(final_color_button5);
                        }
                        if (b.get(4) == 1) {
                            Button195.setBackgroundColor(final_color_button1);
                        }
                        if (b.get(4) == 2) {
                            Button195.setBackgroundColor(final_color_button2);
                        }
                        if (b.get(4) == 3) {
                            Button195.setBackgroundColor(final_color_button3);
                        }
                        if (b.get(4) == 4) {
                            Button195.setBackgroundColor(final_color_button4);
                        }
                        if (b.get(4) == 5) {
                            Button195.setBackgroundColor(final_color_button5);
                        }
                        int count = Color.RED;
                        if ((final_color_button1 == count) && (final_color_button2 == count) && (final_color_button3 == count) && (final_color_button4 == count) && (final_color_button5 == count)) {
                            Toast.makeText(getApplicationContext(), "YOU WON", Toast.LENGTH_LONG).show();}
                        else {Toast.makeText(getApplicationContext(), "TRY AGAIN", Toast.LENGTH_LONG).show();
                        }
                        level10[0]++;
                    }
                }
            }
        });
    }
}
