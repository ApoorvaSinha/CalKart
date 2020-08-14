package com.example.myproject1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_snacks extends Fragment {

    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18;
    CheckBox sc1,sc2,sc3,sc4,sc5,sc6,sc7,sc8,sc9;
    Button b1,b2,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
    ImageButton b3;
    int x1,x2,x3,x4,x5,x6,x7,x8,x9,x10,x11,x12,x13,x14,x15,x16,x17,x18,g1,g2,g3,g4,g5,g6,g7,g8,g9,g10,g11,g12,g13,g14,g15,g16,g17,g18;
    String res,res1,res2,res3,res4,res5,res6,res7,res8,re,re1,re2,re3,re4,re5,re6,re7,re8;
    SharedPreferences ssp;
    private static Fragment_snacks sinstance;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        sinstance = this;
        return inflater.inflate(R.layout.fragment_snacks,null);
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        t1 = getActivity().findViewById(R.id.stextView);
        t2 = getActivity().findViewById(R.id.stextView1);
        t3 = getActivity().findViewById(R.id.stextView2);
        t4 = getActivity().findViewById(R.id.stextView3);
        t5 = getActivity().findViewById(R.id.stextView4);
        t6 = getActivity().findViewById(R.id.stextView5);
        t7 = getActivity().findViewById(R.id.stextView6);
        t8 = getActivity().findViewById(R.id.stextView7);
        t9 = getActivity().findViewById(R.id.stextView8);
        t10 = getActivity().findViewById(R.id.stextView9);
        t11 = getActivity().findViewById(R.id.stextView10);
        t12 = getActivity().findViewById(R.id.stextView11);
        t13 = getActivity().findViewById(R.id.stextView12);
        t14 = getActivity().findViewById(R.id.stextView13);
        t15 = getActivity().findViewById(R.id.stextView14);
        t16 = getActivity().findViewById(R.id.stextView15);
        t17 = getActivity().findViewById(R.id.stextView16);
        t18 = getActivity().findViewById(R.id.stextView17);
        b1 = getActivity().findViewById(R.id.sbutton);
        b2 = getActivity().findViewById(R.id.sbutton1);
        b5 = getActivity().findViewById(R.id.sbutton2);
        b6 = getActivity().findViewById(R.id.sbutton3);
        b7 = getActivity().findViewById(R.id.sbutton4);
        b8 = getActivity().findViewById(R.id.sbutton5);
        b9 = getActivity().findViewById(R.id.sbutton6);
        b10 = getActivity().findViewById(R.id.sbutton7);
        b11 = getActivity().findViewById(R.id.sbutton8);
        b12 = getActivity().findViewById(R.id.sbutton9);
        b13 = getActivity().findViewById(R.id.sbutton10);
        b14 = getActivity().findViewById(R.id.sbutton11);
        b15 = getActivity().findViewById(R.id.sbutton12);
        b16 = getActivity().findViewById(R.id.sbutton13);
        b17 = getActivity().findViewById(R.id.sbutton14);
        b18 = getActivity().findViewById(R.id.sbutton15);
        b19 = getActivity().findViewById(R.id.sbutton16);
        b20 = getActivity().findViewById(R.id.sbutton17);
        b3 = getActivity().findViewById(R.id.imageButton);
        sc1 = getActivity().findViewById(R.id.scheckBox);
        sc2 = getActivity().findViewById(R.id.scheckBox1);
        sc3 = getActivity().findViewById(R.id.scheckBox2);
        sc4 = getActivity().findViewById(R.id.scheckBox3);
        sc5 = getActivity().findViewById(R.id.scheckBox4);
        sc6 = getActivity().findViewById(R.id.scheckBox5);
        sc7 = getActivity().findViewById(R.id.scheckBox6);
        sc8 = getActivity().findViewById(R.id.scheckBox7);
        sc9 = getActivity().findViewById(R.id.scheckBox8);

        sc1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b1.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 150;

                    @Override
                    public void onClick(View v) {
                        if (sc1.isChecked() == true) {
                            if (g1 != 0 || g2 != 0) {
                                increments2();
                            } else {
                                increments();
                            }
                        }

                        b2.setOnClickListener(new View.OnClickListener() {
                            int w1 = x1;
                            int y1 = x2;

                            @Override
                            public void onClick(View v) {

                                if (sc1.isChecked() == true) {
                                    decrements();
                                }

                            }

                            private void decrements() {
                                if (w1 > 1) {
                                    y1 = y1 - 150;
                                    w1--;
                                }
                                re = String.valueOf(w1);
                                t2.setText(String.valueOf(w1));
                                res = String.valueOf(y1);
                                t1.setText(res);
                                g1 = Integer.parseInt(re);
                                g2 = Integer.parseInt(res);
                            }
                        });
                    }

                    private void increments2() {
                        i = g1 + 1;
                        j = g2 + 150;
                        re = String.valueOf(i);
                        t2.setText(re);
                        res = String.valueOf(j);
                        t1.setText(res);
                        x1 = Integer.parseInt(re);
                        x2 = Integer.parseInt(res);
                        g1 = 0;
                        g2 = 0;
                    }

                    private void increments() {
                        i = i + 1;
                        j = j + 150;
                        re = String.valueOf(i);
                        t2.setText(re);
                        res = String.valueOf(j);
                        t1.setText(res);
                        x1 = Integer.parseInt(re);
                        x2 = Integer.parseInt(res);
                    }

                });
            }
        });

        sc2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b5.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 60;

                    @Override
                    public void onClick(View v) {
                        if (sc2.isChecked() == true) {
                            if (g3 != 0 || g4 != 0) {
                                increments2();
                            } else {
                                increments();
                            }

                        }

                        b6.setOnClickListener(new View.OnClickListener() {
                            int y2 = x4;
                            int w2 = x3;

                            @Override
                            public void onClick(View v) {

                                if (sc2.isChecked() == true) {
                                    decrements();
                                }

                            }

                            private void decrements() {
                                if (w2 > 1) {
                                    y2 = y2 - 60;
                                    w2--;
                                }
                                re1 = String.valueOf(w2);
                                t4.setText(re1);
                                res1 = String.valueOf(y2);
                                t3.setText(res1);
                                g3 = Integer.parseInt(re1);
                                g4 = Integer.parseInt(res1);
                            }

                        });
                    }

                    private void increments2() {
                        i = g3 + 1;
                        j = g4 + 60;
                        re1 = String.valueOf(i);
                        t4.setText(re1);
                        res1 = String.valueOf(j);
                        t3.setText(res1);
                        x3 = Integer.parseInt(re1);
                        x4 = Integer.parseInt(res1);
                        g3 = 0;
                        g4 = 0;
                    }

                    private void increments() {
                        i = i + 1;
                        j = j + 60;
                        res1 = String.valueOf(j);
                        t3.setText(res1);
                        re1 = String.valueOf(i);
                        t4.setText(re1);
                        x3 = Integer.parseInt(re1);
                        x4 = Integer.parseInt(res1);
                    }
                });
            }
        });

        sc3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b7.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 100;

                    @Override
                    public void onClick(View v) {
                        if (sc3.isChecked() == true) {
                            if (g5 != 0 || g6 != 0) {
                                increments2();
                            } else {
                                increments();
                            }

                        }

                        b8.setOnClickListener(new View.OnClickListener() {
                            int y3 = x6;
                            int w3 = x5;

                            @Override
                            public void onClick(View v) {
                                if (sc3.isChecked() == true) {
                                    decrements();
                                }
                            }

                            private void decrements() {
                                if (w3 > 1) {
                                    y3 = y3 - 100;
                                    w3--;
                                }
                                re2 = String.valueOf(w3);
                                t6.setText(re2);
                                res2 = String.valueOf(y3);
                                t5.setText(res2);
                                g5 = Integer.parseInt(re2);
                                g6 = Integer.parseInt(res2);
                            }
                        });
                    }

                    private void increments2() {
                        i = g5 + 1;
                        j = g6 + 100;
                        re2 = String.valueOf(i);
                        t6.setText(re2);
                        res2 = String.valueOf(j);
                        t5.setText(res2);
                        x5 = Integer.parseInt(re2);
                        x6 = Integer.parseInt(res2);
                        g5 = 0;
                        g6 = 0;
                    }

                    private void increments() {
                        i = i + 1;
                        j = j + 100;
                        re2 = String.valueOf(i);
                        t6.setText(re2);
                        res2 = String.valueOf(j);
                        t5.setText(res2);
                        x5 = Integer.parseInt(re2);
                        x6 = Integer.parseInt(res2);
                    }
                });
            }

        });

        sc4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b9.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 110;

                    @Override
                    public void onClick(View v) {
                        if (sc4.isChecked() == true) {
                            if (g7 != 0 || g8 != 0) {
                                increments2();
                            } else {
                                increments();
                            }

                        }

                        b10.setOnClickListener(new View.OnClickListener() {
                            int y4 = x8;
                            int w4 = x7;

                            @Override
                            public void onClick(View v) {

                                if (sc4.isChecked() == true) {
                                    decrements();
                                }

                            }

                            private void decrements() {
                                if (w4 > 1) {
                                    y4 = y4 - 110;
                                    w4--;
                                }
                                re3 = String.valueOf(w4);
                                t8.setText(re3);
                                res3 = String.valueOf(y4);
                                t7.setText(res3);
                                g7 = Integer.parseInt(re3);
                                g8 = Integer.parseInt(res3);
                            }
                        });
                    }

                    private void increments2() {
                        i = g7 + 1;
                        j = g8 + 110;
                        re3 = String.valueOf(i);
                        t8.setText(re3);
                        res3 = String.valueOf(j);
                        t7.setText(res3);
                        x7 = Integer.parseInt(re3);
                        x8 = Integer.parseInt(res3);
                        g7 = 0;
                        g8 = 0;
                    }

                    private void increments() {
                        i = i + 1;
                        j = j + 110;
                        re3 = String.valueOf(i);
                        t8.setText(re3);
                        res3 = String.valueOf(j);
                        t7.setText(res3);
                        x7 = Integer.parseInt(re3);
                        x8 = Integer.parseInt(res3);
                    }
                });
            }

        });

        sc5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b11.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 140;

                    @Override
                    public void onClick(View v) {
                        if (sc5.isChecked() == true) {
                            if (g9 != 0 || g10 != 0) {
                                increments2();
                            } else {
                                increments();
                            }
                        }

                        b12.setOnClickListener(new View.OnClickListener() {
                            int y5 = x10;
                            int w5 = x9;

                            @Override
                            public void onClick(View v) {

                                if (sc5.isChecked() == true) {
                                    decrements();
                                }

                            }

                            private void decrements() {
                                if (w5 > 1) {
                                    y5 = y5 - 140;
                                    w5--;
                                }
                                re4 = String.valueOf(w5);
                                t10.setText(re4);
                                res4 = String.valueOf(y5);
                                t9.setText(res4);
                                g9 = Integer.parseInt(re4);
                                g10 = Integer.parseInt(res4);
                            }
                        });
                    }

                    private void increments2() {
                        i = g9 + 1;
                        j = g10 + 140;
                        re4 = String.valueOf(i);
                        t10.setText(re4);
                        res4 = String.valueOf(j);
                        t9.setText(res4);
                        x9 = Integer.parseInt(re4);
                        x10 = Integer.parseInt(res4);
                        g9 = 0;
                        g10 = 0;
                    }

                    private void increments() {
                        i = i + 1;
                        j = j + 140;
                        re4 = String.valueOf(i);
                        t10.setText(re4);
                        res4 = String.valueOf(j);
                        t9.setText(res4);
                        x9 = Integer.parseInt(re4);
                        x10 = Integer.parseInt(res4);
                    }
                });
            }

        });

        sc6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b13.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 70;

                    @Override
                    public void onClick(View v) {
                        if (sc6.isChecked() == true) {
                            if (g11 != 0 || g12 != 0) {
                                increments2();
                            } else {
                                increments();
                            }
                        }

                        b14.setOnClickListener(new View.OnClickListener() {
                            int y5 = x12;
                            int w5 = x11;

                            @Override
                            public void onClick(View v) {

                                if (sc6.isChecked() == true) {
                                    decrements();
                                }

                            }

                            private void decrements() {
                                if (w5 > 1) {
                                    y5 = y5 - 70;
                                    w5--;
                                }
                                re5 = String.valueOf(w5);
                                t12.setText(re5);
                                res5 = String.valueOf(y5);
                                t11.setText(res5);
                                g11 = Integer.parseInt(re5);
                                g12 = Integer.parseInt(res5);
                            }
                        });
                    }

                    private void increments2() {
                        i = g11 + 1;
                        j = g12 + 70;
                        re5 = String.valueOf(i);
                        t12.setText(re5);
                        res5 = String.valueOf(j);
                        t11.setText(res5);
                        x11 = Integer.parseInt(re5);
                        x12 = Integer.parseInt(res5);
                        g11 = 0;
                        g12 = 0;
                    }

                    private void increments() {
                        i = i + 1;
                        j = j + 70;
                        re5 = String.valueOf(i);
                        t12.setText(re5);
                        res5 = String.valueOf(j);
                        t11.setText(res5);
                        x11 = Integer.parseInt(re5);
                        x12 = Integer.parseInt(res5);
                    }
                });
            }

        });

        sc7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b15.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 50;

                    @Override
                    public void onClick(View v) {
                        if (sc7.isChecked() == true) {
                            if (g13 != 0 || g14 != 0) {
                                increments2();
                            } else {
                                increments();
                            }
                        }

                        b16.setOnClickListener(new View.OnClickListener() {
                            int y5 = x14;
                            int w5 = x13;

                            @Override
                            public void onClick(View v) {

                                if (sc7.isChecked() == true) {
                                    decrements();
                                }

                            }

                            private void decrements() {
                                if (w5 > 1) {
                                    y5 = y5 - 50;
                                    w5--;
                                }
                                re6 = String.valueOf(w5);
                                t14.setText(re6);
                                res6 = String.valueOf(y5);
                                t13.setText(res6);
                                g13 = Integer.parseInt(re6);
                                g14 = Integer.parseInt(res6);
                            }
                        });
                    }

                    private void increments2() {
                        i = g13 + 1;
                        j = g14 + 50;
                        re6 = String.valueOf(i);
                        t14.setText(re6);
                        res6 = String.valueOf(j);
                        t13.setText(res6);
                        x13 = Integer.parseInt(re6);
                        x14 = Integer.parseInt(res6);
                        g13 = 0;
                        g14 = 0;
                    }

                    private void increments() {
                        i = i + 1;
                        j = j + 50;
                        re6 = String.valueOf(i);
                        t14.setText(re6);
                        res6 = String.valueOf(j);
                        t13.setText(res6);
                        x13 = Integer.parseInt(re6);
                        x14 = Integer.parseInt(res6);
                    }
                });
            }

        });

        sc8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b17.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 70;

                    @Override
                    public void onClick(View v) {
                        if (sc8.isChecked() == true) {
                            if (g15 != 0 || g16 != 0) {
                                increments2();
                            } else {
                                increments();
                            }
                        }

                        b18.setOnClickListener(new View.OnClickListener() {
                            int y5 = x16;
                            int w5 = x15;

                            @Override
                            public void onClick(View v) {

                                if (sc8.isChecked() == true) {
                                    decrements();
                                }

                            }

                            private void decrements() {
                                if (w5 > 1) {
                                    y5 = y5 - 70;
                                    w5--;
                                }
                                re7 = String.valueOf(w5);
                                t16.setText(re7);
                                res7 = String.valueOf(y5);
                                t15.setText(res7);
                                g15 = Integer.parseInt(re7);
                                g16 = Integer.parseInt(res7);
                            }
                        });
                    }

                    private void increments2() {
                        i = g15 + 1;
                        j = g16 + 70;
                        re7 = String.valueOf(i);
                        t16.setText(re7);
                        res7 = String.valueOf(j);
                        t15.setText(res7);
                        x15 = Integer.parseInt(re7);
                        x16 = Integer.parseInt(res7);
                        g15 = 0;
                        g16 = 0;
                    }

                    private void increments() {
                        i = i + 1;
                        j = j + 70;
                        re7 = String.valueOf(i);
                        t16.setText(re7);
                        res7 = String.valueOf(j);
                        t15.setText(res7);
                        x15 = Integer.parseInt(re7);
                        x16 = Integer.parseInt(res7);
                    }
                });
            }

        });

        sc9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b19.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 120;

                    @Override
                    public void onClick(View v) {
                        if (sc9.isChecked() == true) {
                            if (g17 != 0 || g18 != 0) {
                                increments2();
                            } else {
                                increments();
                            }
                        }

                        b20.setOnClickListener(new View.OnClickListener() {
                            int y5 = x18;
                            int w5 = x17;

                            @Override
                            public void onClick(View v) {

                                if (sc9.isChecked() == true) {
                                    decrements();
                                }

                            }

                            private void decrements() {
                                if (w5 > 1) {
                                    y5 = y5 - 120;
                                    w5--;
                                }
                                re8 = String.valueOf(w5);
                                t18.setText(re8);
                                res8 = String.valueOf(y5);
                                t17.setText(res8);
                                g17 = Integer.parseInt(re8);
                                g18 = Integer.parseInt(res8);
                            }
                        });
                    }

                    private void increments2() {
                        i = g17 + 1;
                        j = g18 + 120;
                        re8 = String.valueOf(i);
                        t18.setText(re8);
                        res8 = String.valueOf(j);
                        t17.setText(res8);
                        x17 = Integer.parseInt(re8);
                        x18 = Integer.parseInt(res8);
                        g17 = 0;
                        g18 = 0;
                    }

                    private void increments() {
                        i = i + 1;
                        j = j + 120;
                        re8 = String.valueOf(i);
                        t18.setText(re8);
                        res8 = String.valueOf(j);
                        t17.setText(res8);
                        x17 = Integer.parseInt(re8);
                        x18 = Integer.parseInt(res8);
                    }
                });
            }

        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj3 = new Intent(getActivity(), MainActivity.class);
                startActivity(obj3);
            }
        });
    }
        public static Fragment_snacks sgetInstance() {
            return sinstance;
        }
        public void scalcu(){
            int stotal = 0;
            String sitem="",sqty="",samt="";
            if (sc1.isChecked() == true) {

                sitem = sitem + sc1.getText().toString() + "\n";
                sqty = sqty + t2.getText().toString() + "\n";
                samt = samt + t1.getText().toString() + "\n";
                String t = t1.getText().toString();
                stotal = stotal + Integer.parseInt(t);
            }
            if (sc2.isChecked() == true) {
                sitem = sitem + sc2.getText().toString() + "\n";
                sqty = sqty + t4.getText().toString() + "\n";
                samt = samt + t3.getText().toString() + "\n";
                String t = t3.getText().toString();
                stotal = stotal + Integer.parseInt(t);
            }
            if (sc3.isChecked() == true) {
                sitem = sitem + sc3.getText().toString() + "\n";
                sqty = sqty + t6.getText().toString() + "\n";
                samt = samt + t5.getText().toString() + "\n";
                String t = t5.getText().toString();
                stotal = stotal + Integer.parseInt(t);
            }
            if (sc4.isChecked() == true) {
                sitem = sitem + sc4.getText().toString() + "\n";
                sqty = sqty + t8.getText().toString() + "\n";
                samt = samt + t7.getText().toString() + "\n";
                String t = t7.getText().toString();
                stotal = stotal + Integer.parseInt(t);

            }
            if (sc5.isChecked() == true) {
                sitem = sitem + sc5.getText().toString() + "\n";
                sqty = sqty + t10.getText().toString() + "\n";
                samt = samt + t9.getText().toString() + "\n";
                String t = t9.getText().toString();
                stotal = stotal + Integer.parseInt(t);

            }
            if (sc6.isChecked() == true) {
                sitem = sitem + sc6.getText().toString() + "\n";
                sqty = sqty + t12.getText().toString() + "\n";
                samt = samt + t11.getText().toString() + "\n";
                String t = t11.getText().toString();
                stotal = stotal + Integer.parseInt(t);

            }
            if (sc7.isChecked() == true) {
                sitem = sitem + sc7.getText().toString() + "\n";
                sqty = sqty + t14.getText().toString() + "\n";
                samt = samt + t13.getText().toString() + "\n";
                String t = t13.getText().toString();
                stotal = stotal + Integer.parseInt(t);

            }
            if (sc8.isChecked() == true) {
                sitem = sitem + sc8.getText().toString() + "\n";
                sqty = sqty + t16.getText().toString() + "\n";
                samt = samt + t15.getText().toString() + "\n";
                String t = t15.getText().toString();
                stotal = stotal + Integer.parseInt(t);

            }
            if (sc9.isChecked() == true) {
                sitem = sitem + sc9.getText().toString() + "\n";
                sqty = sqty + t18.getText().toString() + "\n";
                samt = samt + t17.getText().toString() + "\n";
                String t = t17.getText().toString();
                stotal = stotal + Integer.parseInt(t);

            }
            ssp=this.getActivity().getSharedPreferences("scalis", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor=ssp.edit();
            editor.putString("k1",sitem);
            editor.putString("k2",sqty);
            editor.putString("k3", samt);
            editor.putInt("k4", stotal);
            editor.commit();
        }

}
