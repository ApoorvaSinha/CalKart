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

public class Fragment_beverges extends Fragment {

    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
    CheckBox bc1,bc2,bc3,bc4,bc5,bc6,bc7;
    Button b1,b2,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    ImageButton b3;
    int x1,x2,x3,x4,x5,x6,x7,x8,x9,x10,x11,x12,x13,x14,g1,g2,g3,g4,g5,g6,g7,g8,g9,g10,g11,g12,g13,g14;
    String res,res1,res2,res3,res4,res5,res6,re,re1,re2,re3,re4,re5,re6;
    SharedPreferences bsp;
    private static Fragment_beverges binstance;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binstance = this;
        return inflater.inflate(R.layout.fragment_beverges,null);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        t1 = getActivity().findViewById(R.id.btextView);
        t2 = getActivity().findViewById(R.id.btextView1);
        t3 = getActivity().findViewById(R.id.btextView2);
        t4 = getActivity().findViewById(R.id.btextView3);
        t5 = getActivity().findViewById(R.id.btextView4);
        t6 = getActivity().findViewById(R.id.btextView5);
        t7 = getActivity().findViewById(R.id.btextView6);
        t8 = getActivity().findViewById(R.id.btextView7);
        t9 = getActivity().findViewById(R.id.btextView8);
        t10 = getActivity().findViewById(R.id.btextView9);
        t11 = getActivity().findViewById(R.id.btextView10);
        t12 = getActivity().findViewById(R.id.btextView11);
        t13 = getActivity().findViewById(R.id.btextView12);
        t14 = getActivity().findViewById(R.id.btextView13);
        b1 = getActivity().findViewById(R.id.bbutton);
        b2 = getActivity().findViewById(R.id.bbutton1);
        b5 = getActivity().findViewById(R.id.bbutton2);
        b6 = getActivity().findViewById(R.id.bbutton3);
        b7 = getActivity().findViewById(R.id.bbutton4);
        b8 = getActivity().findViewById(R.id.bbutton5);
        b9 = getActivity().findViewById(R.id.bbutton6);
        b10 = getActivity().findViewById(R.id.bbutton7);
        b11 = getActivity().findViewById(R.id.bbutton8);
        b12 = getActivity().findViewById(R.id.bbutton9);
        b13 = getActivity().findViewById(R.id.bbutton10);
        b14 = getActivity().findViewById(R.id.bbutton11);
        b15 = getActivity().findViewById(R.id.bbutton12);
        b16 = getActivity().findViewById(R.id.bbutton13);
        b3 = getActivity().findViewById(R.id.imageButton);
        bc1 = getActivity().findViewById(R.id.bcheckBox);
        bc2 = getActivity().findViewById(R.id.bcheckBox1);
        bc3 = getActivity().findViewById(R.id.bcheckBox2);
        bc4 = getActivity().findViewById(R.id.bcheckBox3);
        bc5 = getActivity().findViewById(R.id.bcheckBox4);
        bc6 = getActivity().findViewById(R.id.bcheckBox5);
        bc7 = getActivity().findViewById(R.id.bcheckBox6);

        bc1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b1.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 200;

                    @Override
                    public void onClick(View v) {
                        if (bc1.isChecked() == true) {
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

                                if (bc1.isChecked() == true) {
                                    decrements();
                                }

                            }

                            private void decrements() {
                                if (w1 > 1) {
                                    y1 = y1 - 200;
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
                        j = g2 + 200;
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
                        j = j + 200;
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

        bc2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b5.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 50;

                    @Override
                    public void onClick(View v) {
                        if (bc2.isChecked() == true) {
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

                                if (bc2.isChecked() == true) {
                                    decrements();
                                }

                            }

                            private void decrements() {
                                if (w2 > 1) {
                                    y2 = y2 - 50;
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
                        j = g4 + 50;
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
                        j = j + 50;
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

        bc3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b7.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 35;

                    @Override
                    public void onClick(View v) {
                        if (bc3.isChecked() == true) {
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
                                if (bc3.isChecked() == true) {
                                    decrements();
                                }
                            }

                            private void decrements() {
                                if (w3 > 1) {
                                    y3 = y3 - 35;
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
                        j = g6 + 35;
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
                        j = j + 35;
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

        bc4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b9.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 300;

                    @Override
                    public void onClick(View v) {
                        if (bc4.isChecked() == true) {
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

                                if (bc4.isChecked() == true) {
                                    decrements();
                                }

                            }

                            private void decrements() {
                                if (w4 > 1) {
                                    y4 = y4 - 300;
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
                        j = g8 + 300;
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
                        j = j + 300;
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

        bc5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b11.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 75;

                    @Override
                    public void onClick(View v) {
                        if (bc5.isChecked() == true) {
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

                                if (bc5.isChecked() == true) {
                                    decrements();
                                }

                            }

                            private void decrements() {
                                if (w5 > 1) {
                                    y5 = y5 - 75;
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
                        j = g10 + 75;
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
                        j = j + 75;
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

        bc6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b13.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 380;

                    @Override
                    public void onClick(View v) {
                        if (bc6.isChecked() == true) {
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

                                if (bc6.isChecked() == true) {
                                    decrements();
                                }

                            }

                            private void decrements() {
                                if (w5 > 1) {
                                    y5 = y5 - 380;
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
                        j = g12 + 380;
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
                        j = j + 380;
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

        bc7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                b15.setOnClickListener(new View.OnClickListener() {
                    int i = 1;
                    int j = 80;

                    @Override
                    public void onClick(View v) {
                        if (bc7.isChecked() == true) {
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

                                if (bc7.isChecked() == true) {
                                    decrements();
                                }

                            }

                            private void decrements() {
                                if (w5 > 1) {
                                    y5 = y5 - 80;
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
                        j = g14 + 80;
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
                        j = j + 80;
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
                Intent obj3 = new Intent(getActivity(), MainActivity.class);
                startActivity(obj3);
            }
        });
    }

    public static Fragment_beverges bgetInstance() {
        return binstance;
    }
    public void bcalcu(){
        int btotal = 0;
        String bitem="",bqty="",bamt="";
        if (bc1.isChecked() == true) {

            bitem = bitem + bc1.getText().toString() + "\n";
            bqty = bqty + t2.getText().toString() + "\n";
            bamt = bamt + t1.getText().toString() + "\n";
            String t = t1.getText().toString();
            btotal = btotal + Integer.parseInt(t);
        }
        if (bc2.isChecked() == true) {
            bitem = bitem + bc2.getText().toString() + "\n";
            bqty = bqty + t4.getText().toString() + "\n";
            bamt = bamt + t3.getText().toString() + "\n";
            String t = t3.getText().toString();
            btotal = btotal + Integer.parseInt(t);
        }
        if (bc3.isChecked() == true) {
            bitem = bitem + bc3.getText().toString() + "\n";
            bqty = bqty + t6.getText().toString() + "\n";
            bamt = bamt + t5.getText().toString() + "\n";
            String t = t5.getText().toString();
            btotal = btotal + Integer.parseInt(t);
        }
        if (bc4.isChecked() == true) {
            bitem = bitem + bc4.getText().toString() + "\n";
            bqty = bqty + t8.getText().toString() + "\n";
            bamt = bamt + t7.getText().toString() + "\n";
            String t = t7.getText().toString();
            btotal = btotal + Integer.parseInt(t);

        }
        if (bc5.isChecked() == true) {
            bitem = bitem + bc5.getText().toString() + "\n";
            bqty = bqty + t10.getText().toString() + "\n";
            bamt = bamt + t9.getText().toString() + "\n";
            String t = t9.getText().toString();
            btotal = btotal + Integer.parseInt(t);

        }
        if (bc6.isChecked() == true) {
            bitem = bitem + bc6.getText().toString() + "\n";
            bqty = bqty + t12.getText().toString() + "\n";
            bamt = bamt + t11.getText().toString() + "\n";
            String t = t11.getText().toString();
            btotal = btotal + Integer.parseInt(t);

        }
        if (bc7.isChecked() == true) {
            bitem = bitem + bc7.getText().toString() + "\n";
            bqty = bqty + t14.getText().toString() + "\n";
            bamt = bamt + t13.getText().toString() + "\n";
            String t = t13.getText().toString();
            btotal = btotal + Integer.parseInt(t);

        }
        bsp=this.getActivity().getSharedPreferences("bcalis", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=bsp.edit();
        editor.putString("k1",bitem);
        editor.putString("k2",bqty);
        editor.putString("k3", bamt);
        editor.putInt("k4", btotal);
        editor.commit();
    }
}
