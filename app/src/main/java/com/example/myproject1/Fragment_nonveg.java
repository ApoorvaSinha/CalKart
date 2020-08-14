package com.example.myproject1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.Settings;
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

public class Fragment_nonveg extends Fragment {


    TextView t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
    CheckBox c1,c2,c3,c4,c5,c6,c7;
    Button b1,b2,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    ImageButton b3;
    int x1,x2,x3,x4,x5,x6,x7,x8,x9,x10,x11,x12,x13,x14,g1,g2,g3,g4,g5,g6,g7,g8,g9,g10,g11,g12,g13,g14;
    String res,res1,res2,res3,res4,res5,res6,re,re1,re2,re3,re4,re5,re6;
    //FloatingActionButton b4;
    SharedPreferences sp;
    private static Fragment_nonveg instance;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        instance = this;
        return inflater.inflate(R.layout.fragment_nonveg, null);
    }

        @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        t = getActivity().findViewById(R.id.textView2);
        t1 = getActivity().findViewById(R.id.textView21);
        t2 = getActivity().findViewById(R.id.textView11);
        t3 = getActivity().findViewById(R.id.textView22);
        t4 = getActivity().findViewById(R.id.textView12);
        t5 = getActivity().findViewById(R.id.textView23);
        t6 = getActivity().findViewById(R.id.textView13);
        t7 = getActivity().findViewById(R.id.textView24);
        t8 = getActivity().findViewById(R.id.textView14);
        t9 = getActivity().findViewById(R.id.textView25);
        t10 = getActivity().findViewById(R.id.textView15);
        t11 = getActivity().findViewById(R.id.textView26);
        t12 = getActivity().findViewById(R.id.textView16);
        t13 = getActivity().findViewById(R.id.textView27);
        t14 = getActivity().findViewById(R.id.textView17);
        b1 = getActivity().findViewById(R.id.button2);
        b2 = getActivity().findViewById(R.id.button12);
        b5 = getActivity().findViewById(R.id.button3);
        b6 = getActivity().findViewById(R.id.button13);
        b7 = getActivity().findViewById(R.id.button4);
        b8 = getActivity().findViewById(R.id.button14);
        b9 = getActivity().findViewById(R.id.button5);
        b10 = getActivity().findViewById(R.id.button15);
        b11 = getActivity().findViewById(R.id.button6);
        b12 = getActivity().findViewById(R.id.button16);
        b13 = getActivity().findViewById(R.id.button7);
        b14 = getActivity().findViewById(R.id.button17);
        b15 = getActivity().findViewById(R.id.button8);
        b16 = getActivity().findViewById(R.id.button18);
        b3 = getActivity().findViewById(R.id.imageButton);
        c1 = getActivity().findViewById(R.id.checkBox);
        c2 = getActivity().findViewById(R.id.checkBox1);
        c3 = getActivity().findViewById(R.id.checkBox2);
        c4 = getActivity().findViewById(R.id.checkBox3);
        c5 = getActivity().findViewById(R.id.checkBox4);
        c6=getActivity().findViewById(R.id.checkBox6);
        c7=getActivity().findViewById(R.id.checkBox7);
        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b1.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 150;

                    @Override
                    public void onClick(View v) {
                        if (c1.isChecked() == true) {
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

                                if (c1.isChecked() == true) {
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

        c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b5.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 280;

                    @Override
                    public void onClick(View v) {
                        if (c2.isChecked() == true) {
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

                                if (c2.isChecked() == true) {
                                    decrements();
                                }

                            }

                            private void decrements() {
                                if (w2 > 1) {
                                    y2 = y2 - 280;
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
                        j = g4 + 280;
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
                        j = j + 280;
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

        c3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b7.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 190;

                    @Override
                    public void onClick(View v) {
                        if (c3.isChecked() == true) {
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
                                if (c3.isChecked() == true) {
                                    decrements();
                                }
                            }

                            private void decrements() {
                                if (w3 > 1) {
                                    y3 = y3 - 190;
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
                        j = g6 + 190;
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
                        j = j + 190;
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

        c4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b9.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 120;

                    @Override
                    public void onClick(View v) {
                        if (c4.isChecked() == true) {
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

                                if (c4.isChecked() == true) {
                                    decrements();
                                }

                            }

                            private void decrements() {
                                if (w4 > 1) {
                                    y4 = y4 - 120;
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
                        j = g8 + 120;
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
                        j = j + 120;
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

        c5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b11.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 180;

                    @Override
                    public void onClick(View v) {
                        if (c5.isChecked() == true) {
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

                                if (c5.isChecked() == true) {
                                    decrements();
                                }

                            }

                            private void decrements() {
                                if (w5 > 1) {
                                    y5 = y5 - 180;
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
                        j = g10 + 180;
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
                        j = j + 180;
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

            c5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                    b11.setOnClickListener(new View.OnClickListener() {
                        int i = 1;
                        int j = 180;

                        @Override
                        public void onClick(View v) {
                            if (c5.isChecked() == true) {
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

                                    if (c5.isChecked() == true) {
                                        decrements();
                                    }

                                }

                                private void decrements() {
                                    if (w5 > 1) {
                                        y5 = y5 - 180;
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
                            j = g10 + 180;
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
                            j = j + 180;
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

            c6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                    b13.setOnClickListener(new View.OnClickListener() {
                        int i = 1;
                        int j = 130;

                        @Override
                        public void onClick(View v) {
                            if (c6.isChecked() == true) {
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

                                    if (c6.isChecked() == true) {
                                        decrements();
                                    }

                                }

                                private void decrements() {
                                    if (w5 > 1) {
                                        y5 = y5 - 130;
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
                            j = g12 + 130;
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
                            j = j + 130;
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

            c7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                    b15.setOnClickListener(new View.OnClickListener() {
                        int i = 1;
                        int j = 145;

                        @Override
                        public void onClick(View v) {
                            if (c7.isChecked() == true) {
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

                                    if (c7.isChecked() == true) {
                                        decrements();
                                    }

                                }

                                private void decrements() {
                                    if (w5 > 1) {
                                        y5 = y5 - 145;
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
                            j = g14 + 145;
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
                            j = j + 145;
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


            b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj3 = new Intent(getActivity().getBaseContext(), MainActivity.class);
                startActivity(obj3);
            }
        });


    }
    public static Fragment_nonveg getInstance() {
        return instance;
    }
    public void calcu(){
        int total = 0;
        String item="",qty="",amt="";

        if (c1.isChecked() == true) {

            item=item+c1.getText().toString() + "\n";
            qty=qty+t2.getText().toString() + "\n";
            amt=amt+t1.getText().toString()+ "\n";
            String t = t1.getText().toString();
            total=total+Integer.parseInt(t);
        }
        if (c2.isChecked() == true) {
            item=item+c2.getText().toString()+"\n";
            qty=qty+t4.getText().toString()+"\n";
            amt=amt+t3.getText().toString() + "\n";
            String t = t3.getText().toString();
            total=total+Integer.parseInt(t);
        }
        if (c3.isChecked() == true) {
            item=item+c3.getText().toString() + "\n";
            qty=qty+t6.getText().toString() + "\n";
            amt=amt+t5.getText().toString() + "\n";
            String t = t5.getText().toString();
            total=total+Integer.parseInt(t);
        }
        if (c4.isChecked() == true) {
            item=item+c4.getText().toString() + "\n";
            qty=qty+t8.getText().toString() + "\n";
            amt=amt+t7.getText().toString()+ "\n";
            String t = t7.getText().toString();
            total=total+Integer.parseInt(t);

        }
        if (c5.isChecked() == true) {
            item = item + c5.getText().toString() + "\n";
            qty= qty + t10.getText().toString() + "\n";
            amt = amt+ t9.getText().toString() + "\n";
            String t = t9.getText().toString();
            total=total+Integer.parseInt(t);

        }
        if (c6.isChecked() == true) {
            item = item + c6.getText().toString() + "\n";
            qty= qty + t12.getText().toString() + "\n";
            amt = amt+ t11.getText().toString() + "\n";
            String t = t11.getText().toString();
            total=total+Integer.parseInt(t);

        }
        if (c7.isChecked() == true) {
            item = item + c7.getText().toString() + "\n";
            qty= qty + t14.getText().toString() + "\n";
            amt = amt+ t13.getText().toString() + "\n";
            String t = t13.getText().toString();
            total=total+Integer.parseInt(t);

        }

        sp=this.getActivity().getSharedPreferences("calis", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sp.edit();
        editor.putString("k1",item);
        editor.putString("k2",qty);
        editor.putString("k3", amt);
        editor.putInt("k4", total);
        editor.commit();
    }


}

