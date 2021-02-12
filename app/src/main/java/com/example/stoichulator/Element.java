package com.example.stoichulator;

        import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;
        import android.widget.SeekBar;
        import java.util.ArrayList;

public class Element extends AppCompatActivity {
    ListView timesTableListView;

    public void generateTable(int timesTable) {
        ArrayList<String> timesTableContent = new ArrayList<String>();
        if(timesTable == 1) {
            timesTableContent.add("H(1)");
            timesTableContent.add("Li(3)");
            timesTableContent.add("Na(11)");
            timesTableContent.add("K(19)");
            timesTableContent.add("Rb(37)");
            timesTableContent.add("Cs(55)");
            timesTableContent.add("Fr(87)");
        }
        if(timesTable == 2) {
            timesTableContent.add("-");
            timesTableContent.add("Be(4)");
            timesTableContent.add("Mg(12)");
            timesTableContent.add("Ca(20)");
            timesTableContent.add("Sr(38)");
            timesTableContent.add("Ba(56)");
            timesTableContent.add("Ra(88)");
        }
        if(timesTable == 3) {
            timesTableContent.add("-");
            timesTableContent.add("-");
            timesTableContent.add("-");
            timesTableContent.add("Sc(21)");
            timesTableContent.add("Y(39)");
            timesTableContent.add("Lanthanoids(In 19th column of table)");
            timesTableContent.add("Antinoids(In 20th column of table)");
        }
        if(timesTable == 4) {
            timesTableContent.add("-");
            timesTableContent.add("-");
            timesTableContent.add("-");
            timesTableContent.add("Ti(22)");
            timesTableContent.add("Zr(40)");
            timesTableContent.add("Hf(72)");
            timesTableContent.add("Rf(104)");
        }
        if(timesTable == 5) {
            timesTableContent.add("-");
            timesTableContent.add("-");
            timesTableContent.add("-");
            timesTableContent.add("V(23)");
            timesTableContent.add("Nb(41)");
            timesTableContent.add("Ta(73)");
            timesTableContent.add("Db(105)");
        }
        if(timesTable == 6) {
            timesTableContent.add("-");
            timesTableContent.add("-");
            timesTableContent.add("-");
            timesTableContent.add("Cr(24)");
            timesTableContent.add("Mo(42)");
            timesTableContent.add("W(74)");
            timesTableContent.add("Sg(106)");
        }
        if(timesTable == 7) {
            timesTableContent.add("-");
            timesTableContent.add("-");
            timesTableContent.add("-");
            timesTableContent.add("Mn(25)");
            timesTableContent.add("Tc(43)");
            timesTableContent.add("Re(75)");
            timesTableContent.add("Bh(107)");
        }
        if(timesTable == 8) {
            timesTableContent.add("-");
            timesTableContent.add("-");
            timesTableContent.add("-");
            timesTableContent.add("Fe(26)");
            timesTableContent.add("Ru(44)");
            timesTableContent.add("Os(76)");
            timesTableContent.add("Hs(108)");
        }
        if(timesTable == 9) {
            timesTableContent.add("-");
            timesTableContent.add("-");
            timesTableContent.add("-");
            timesTableContent.add("Co(27)");
            timesTableContent.add("Rh(45)");
            timesTableContent.add("Ir(77)");
            timesTableContent.add("Mt(109)");
        }
        if(timesTable == 10) {
            timesTableContent.add("-");
            timesTableContent.add("-");
            timesTableContent.add("-");
            timesTableContent.add("Ni(28)");
            timesTableContent.add("Pd(46)");
            timesTableContent.add("Pt(78)");
            timesTableContent.add("Ds(110)");
        }
        if(timesTable == 11) {
            timesTableContent.add("-");
            timesTableContent.add("-");
            timesTableContent.add("-");
            timesTableContent.add("Cu(29)");
            timesTableContent.add("Ag(47)");
            timesTableContent.add("Au(79)");
            timesTableContent.add("Rg(111)");
        }
        if(timesTable == 12) {
            timesTableContent.add("-");
            timesTableContent.add("-");
            timesTableContent.add("-");
            timesTableContent.add("Zn(30)");
            timesTableContent.add("Cd(48)");
            timesTableContent.add("Hg(80)");
            timesTableContent.add("Cn(112)");
        }
        if(timesTable == 13) {
            timesTableContent.add("-");
            timesTableContent.add("B(5)");
            timesTableContent.add("Al(13)");
            timesTableContent.add("Ga(31)");
            timesTableContent.add("In(49)");
            timesTableContent.add("Tl(81)");
            timesTableContent.add("Nh(113)");
        }
        if(timesTable == 14) {
            timesTableContent.add("-");
            timesTableContent.add("C(6)");
            timesTableContent.add("Si(14)");
            timesTableContent.add("Ge(32)");
            timesTableContent.add("Sn(50)");
            timesTableContent.add("Pb(82)");
            timesTableContent.add("Fl(114)");
        }
        if(timesTable == 15) {
            timesTableContent.add("-");
            timesTableContent.add("N(7)");
            timesTableContent.add("P(15)");
            timesTableContent.add("As(33)");
            timesTableContent.add("Sb(51)");
            timesTableContent.add("Bi(83)");
            timesTableContent.add("Mc(115)");
        }
        if(timesTable == 16) {
            timesTableContent.add("-");
            timesTableContent.add("O(8)");
            timesTableContent.add("S(16)");
            timesTableContent.add("Se(34)");
            timesTableContent.add("Te(52)");
            timesTableContent.add("Po(84)");
            timesTableContent.add("Lv(116)");
        }
        if(timesTable == 17) {
            timesTableContent.add("-");
            timesTableContent.add("F(9)");
            timesTableContent.add("Cl(17)");
            timesTableContent.add("Br(35)");
            timesTableContent.add("I(53)");
            timesTableContent.add("At(85)");
            timesTableContent.add("Ts(117)");
        }
        if(timesTable == 18) {
            timesTableContent.add("He(2)");
            timesTableContent.add("Ne(10)");
            timesTableContent.add("Ar(18)");
            timesTableContent.add("Kr(36)");
            timesTableContent.add("Xe(54)");
            timesTableContent.add("Rn(86)");
            timesTableContent.add("Og(118)");
        }
        if(timesTable == 19) {
            timesTableContent.add("La(57)");
            timesTableContent.add("Ce(58)");
            timesTableContent.add("Pr(59)");
            timesTableContent.add("Nd(60)");
            timesTableContent.add("Pm(61)");
            timesTableContent.add("Sm(62)");
            timesTableContent.add("Eu(63)");
            timesTableContent.add("Gd(64)");
            timesTableContent.add("Tb(65)");
            timesTableContent.add("Dy(66)");
            timesTableContent.add("Ho(67)");
            timesTableContent.add("Er(68)");
            timesTableContent.add("Tm(69)");
            timesTableContent.add("Yb(70)");
            timesTableContent.add("Lu(71)");
        }
        if(timesTable == 20) {
            timesTableContent.add("Ac(89)");
            timesTableContent.add("Th(90)");
            timesTableContent.add("Pa(91)");
            timesTableContent.add("U(92)");
            timesTableContent.add("Np(93)");
            timesTableContent.add("Pu(94)");
            timesTableContent.add("Am(95)");
            timesTableContent.add("Cm(96)");
            timesTableContent.add("Bk(97)");
            timesTableContent.add("Cf(98)");
            timesTableContent.add("Es(99)");
            timesTableContent.add("Fm(100)");
            timesTableContent.add("Md(101)");
            timesTableContent.add("No(102)");
            timesTableContent.add("Lr(103)");
        }




        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, timesTableContent);
        timesTableListView.setAdapter(arrayAdapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_element);
        final SeekBar timesTableSeekBar = (SeekBar) findViewById(R.id.timesTableSeekBar);
        timesTableListView = (ListView) findViewById(R.id.timesTableListView);
        timesTableSeekBar.setMax(20);
        timesTableSeekBar.setProgress(10);
        timesTableSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int min = 1;
                int timesTable;
                if (progress < min) {
                    timesTable = min;
                    timesTableSeekBar.setProgress(min);
                } else {
                    timesTable = progress;

                }
                generateTable(timesTable);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });


        generateTable(10);
    }}
