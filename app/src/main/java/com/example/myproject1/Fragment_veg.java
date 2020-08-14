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
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Fragment_veg extends Fragment {

    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16;
    CheckBox vc1,vc2,vc3,vc4,vc5,vc6,vc7,vc8;
    Button b1,b2,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18;
    ImageButton b3;
    int x1,x2,x3,x4,x5,x6,x7,x8,x9,x10,x11,x12,x13,x14,x15,x16,g1,g2,g3,g4,g5,g6,g7,g8,g9,g10,g11,g12,g13,g14,g15,g16;
    String res,res1,res2,res3,res4,res5,res6,res7,re,re1,re2,re3,re4,re5,re6,re7;
    SharedPreferences vsp;
    private static Fragment_veg vinstance;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        vinstance = this;
        return inflater.inflate(R.layout.fragment_veg,null);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        t1 = getActivity().findViewById(R.id.vtextView);
        t2 = getActivity().findViewById(R.id.vtextView1);
        t3 = getActivity().findViewById(R.id.vtextView3);
        t4 = getActivity().findViewById(R.id.vtextView4);
        t5 = getActivity().findViewById(R.id.vtextView5);
        t6 = getActivity().findViewById(R.id.vtextView6);
        t7 = getActivity().findViewById(R.id.vtextView7);
        t8 = getActivity().findViewById(R.id.vtextView8);
        t9 = getActivity().findViewById(R.id.vtextView9);
        t10 = getActivity().findViewById(R.id.vtextView10);
        t11 = getActivity().findViewById(R.id.vtextView11);
        t12 = getActivity().findViewById(R.id.vtextView12);
        t13 = getActivity().findViewById(R.id.vtextView13);
        t14 = getActivity().findViewById(R.id.vtextView14);
        t15 = getActivity().findViewById(R.id.vtextView15);
        t16 = getActivity().findViewById(R.id.vtextView16);
        b1 = getActivity().findViewById(R.id.vbutton);
        b2 = getActivity().findViewById(R.id.vbutton1);
        b5 = getActivity().findViewById(R.id.vbutton3);
        b6 = getActivity().findViewById(R.id.vbutton4);
        b7 = getActivity().findViewById(R.id.vbutton5);
        b8 = getActivity().findViewById(R.id.vbutton6);
        b9 = getActivity().findViewById(R.id.vbutton7);
        b10 = getActivity().findViewById(R.id.vbutton8);
        b11 = getActivity().findViewById(R.id.vbutton9);
        b12 = getActivity().findViewById(R.id.vbutton10);
        b13 = getActivity().findViewById(R.id.vbutton11);
        b14 = getActivity().findViewById(R.id.vbutton12);
        b15 = getActivity().findViewById(R.id.vbutton13);
        b16 = getActivity().findViewById(R.id.vbutton14);
        b17 = getActivity().findViewById(R.id.vbutton15);
        b18 = getActivity().findViewById(R.id.vbutton16);
        b3 = getActivity().findViewById(R.id.imageButton);
        vc1 = getActivity().findViewById(R.id.vcheckBox);
        vc2 = getActivity().findViewById(R.id.vcheckBox1);
        vc3 = getActivity().findViewById(R.id.vcheckBox2);
        vc4 = getActivity().findViewById(R.id.vcheckBox3);
        vc5 = getActivity().findViewById(R.id.vcheckBox4);
        vc6 = getActivity().findViewById(R.id.vcheckBox5);
        vc7 = getActivity().findViewById(R.id.vcheckBox6);
        vc8 = getActivity().findViewById(R.id.vcheckBox7);

        vc1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b1.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 190;

                    @Override
                    public void onClick(View v) {
                        if (vc1.isChecked() == true) {
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

                                if (vc1.isChecked() == true) {
                                    decrements();
                                }

                            }

                            private void decrements() {
                                if (w1 > 1) {
                                    y1 = y1 - 190;
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
                        j = g2 + 190;
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
                        j = j + 190;
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

        vc2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b5.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 80;

                    @Override
                    public void onClick(View v) {
                        if (vc2.isChecked() == true) {
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

                                if (vc2.isChecked() == true) {
                                    decrements();
                                }

                            }

                            private void decrements() {
                                if (w2 > 1) {
                                    y2 = y2 - 80;
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
                        j = g4 + 80;
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
                        j = j + 80;
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

        vc3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b7.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 100;

                    @Override
                    public void onClick(View v) {
                        if (vc3.isChecked() == true) {
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
                                if (vc3.isChecked() == true) {
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

        vc4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b9.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 70;

                    @Override
                    public void onClick(View v) {
                        if (vc4.isChecked() == true) {
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

                                if (vc4.isChecked() == true) {
                                    decrements();
                                }

                            }

                            private void decrements() {
                                if (w4 > 1) {
                                    y4 = y4 - 70;
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
                        j = g8 + 70;
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
                        j = j + 70;
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

        vc5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b11.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 90;

                    @Override
                    public void onClick(View v) {
                        if (vc5.isChecked() == true) {
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

                                if (vc5.isChecked() == true) {
                                    decrements();
                                }

                            }

                            private void decrements() {
                                if (w5 > 1) {
                                    y5 = y5 - 90;
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
                        j = g10 + 90;
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
                        j = j + 90;
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

        vc6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b13.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 120;

                    @Override
                    public void onClick(View v) {
                        if (vc6.isChecked() == true) {
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

                                if (vc6.isChecked() == true) {
                                    decrements();
                                }

                            }

                            private void decrements() {
                                if (w5 > 1) {
                                    y5 = y5 - 120;
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
                        j = g12 + 120;
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
                        j = j + 120;
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

        vc7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b15.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 150;

                    @Override
                    public void onClick(View v) {
                        if (vc7.isChecked() == true) {
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

                                if (vc7.isChecked() == true) {
                                    decrements();
                                }

                            }

                            private void decrements() {
                                if (w5 > 1) {
                                    y5 = y5 - 150;
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
                        j = g14 + 150;
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
                        j = j + 150;
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

        vc8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b17.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 70;

                    @Override
                    public void onClick(View v) {
                        if (vc8.isChecked() == true) {
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

                                if (vc8.isChecked() == true) {
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


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj3 = new Intent(getActivity(), MainActivity.class);
                startActivity(obj3);
            }
        });

    }
    public static Fragment_veg vgetInstance() {
        return vinstance;
    }
    public void vcalcu(){
        int vtotal = 0;
        String vitem="",vqty="",vamt="";
        if (vc1.isChecked() == true) {

            vitem = vitem + vc1.getText().toString() + "\n";
            vqty = vqty + t2.getText().toString() + "\n";
            vamt = vamt + t1.getText().toString() + "\n";
            String t = t1.getText().toString();
            vtotal = vtotal + Integer.parseInt(t);
        }
        if (vc2.isChecked() == true) {
            vitem = vitem + vc2.getText().toString() + "\n";
            vqty = vqty + t4.getText().toString() + "\n";
            vamt = vamt + t3.getText().toString() + "\n";
            String t = t3.getText().toString();
            vtotal = vtotal + Integer.parseInt(t);
        }
        if (vc3.isChecked() == true) {
            vitem = vitem + vc3.getText().toString() + "\n";
            vqty = vqty + t6.getText().toString() + "\n";
            vamt = vamt + t5.getText().toString() + "\n";
            String t = t5.getText().toString();
            vtotal = vtotal + Integer.parseInt(t);
        }
        if (vc4.isChecked() == true) {
            vitem = vitem + vc4.getText().toString() + "\n";
            vqty = vqty + t8.getText().toString() + "\n";
            vamt = vamt + t7.getText().toString() + "\n";
            String t = t7.getText().toString();
            vtotal = vtotal + Integer.parseInt(t);

        }
        if (vc5.isChecked() == true) {
            vitem = vitem + vc5.getText().toString() + "\n";
            vqty = vqty + t10.getText().toString() + "\n";
            vamt = vamt + t9.getText().toString() + "\n";
            String t = t9.getText().toString();
            vtotal = vtotal + Integer.parseInt(t);

        }
        if (vc6.isChecked() == true) {
            vitem = vitem + vc6.getText().toString() + "\n";
            vqty = vqty + t12.getText().toString() + "\n";
            vamt = vamt + t11.getText().toString() + "\n";
            String t = t11.getText().toString();
            vtotal = vtotal + Integer.parseInt(t);

        }
        if (vc7.isChecked() == true) {
            vitem = vitem + vc7.getText().toString() + "\n";
            vqty = vqty + t14.getText().toString() + "\n";
            vamt = vamt + t13.getText().toString() + "\n";
            String t = t13.getText().toString();
            vtotal = vtotal + Integer.parseInt(t);

        }
        if (vc8.isChecked() == true) {
            vitem = vitem + vc8.getText().toString() + "\n";
            vqty = vqty + t16.getText().toString() + "\n";
            vamt = vamt + t15.getText().toString() + "\n";
            String t = t15.getText().toString();
            vtotal = vtotal + Integer.parseInt(t);

        }
        vsp=this.getActivity().getSharedPreferences("vcalis", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=vsp.edit();
        editor.putString("k1",vitem);
        editor.putString("k2",vqty);
        editor.putString("k3", vamt);
        editor.putInt("k4", vtotal);
        editor.commit();
    }
}
