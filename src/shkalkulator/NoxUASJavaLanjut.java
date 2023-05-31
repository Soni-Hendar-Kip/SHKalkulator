package shkalkulator;

import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.*;

/**
 * UAS Matkul Java Lanjut PTI 4B
 *
 * @author Soni Hendarkanto PTI 4B
 *
 * With Apache NetBeans IDE 16, Belsoft JAVA JDK 19 on Linux Mint 21.1 "VERA"
 * Cinnamon Desktop Edition
 *
 * My github for this project: https://github.com/Soni-Hendar-Kip/SHKalkulator
 *
 * link tutor: original version from pak dosen rozi,
 *
 * and
 * https://www.tutorialsfield.com/simple-calculator-program-in-java-using-swing/
 * https://www.duniaprogramming.com/2017/02/cara-membuat-program-kalkulator-keren.html
 * http://ngoding-java.blogspot.com/2016/02/membuat-aplikasi-konverter-suhu-dengan.html
 * https://arbysan.wordpress.com/2014/10/19/menampilkan-2-angka-belakang-koma-dengan-java/
 *
 */
public class NoxUASJavaLanjut extends javax.swing.JFrame {

    String TandaHitung = ""; //untuk mewakili simbol operator hitung +-/*
    String LayarAwal; //untuk mewakili layar awal
    boolean FirstClick = false;

    double Angka_ke1 = 0; //untuk mewakili angka pertama yg akan di hitung pada kalkulator
    double Angka_ke2 = 0; //untuk mewakili angka kedua
    double Hasil_Hitung; //untuk mewakili hasil perhitungan

    //UAS
    public Double NoxSuhuuuu; //variable hitung suhu, dianggap satuanya adalah celcius
    public Double NoxCelc; //celcius bro
    public Double NoxFahrell; //tau ndiri lah
    public Double NoxKelvinSanjaya; //mosok dadak di tulis
    public Double NoxRemunerasi; //reamur bro

    public String NoxHasilSuhu;

    public NoxUASJavaLanjut() {
        initComponents();
        NoxRadioBtOn_.setEnabled(false);
        NoxRadioCelcius_.setEnabled(false);
    }

    public void AturTextLayar(String k) {
        LayarAwal = NoxLayar_.getText();
        if (LayarAwal.equals("0")) {
            LayarAwal = LayarAwal.replace("0", "");
        }
        if (!TandaHitung.equals("") && FirstClick) {
            NoxLayar_.setText(k);
            FirstClick = false;
        } else {
            NoxLayar_.setText(LayarAwal + k);
        }
    }

    public void AturWarnaTombolAngka(boolean yes_or_no) {
        setBackground(Color.yellow);
    }

    public void HilangkanWarnaTombol(boolean yes_or_no) {
        NoxBt0_.setBackground(Color.LIGHT_GRAY);
        NoxBt1_.setBackground(Color.LIGHT_GRAY);
        NoxBt2_.setBackground(Color.LIGHT_GRAY);
        NoxBt3_.setBackground(Color.LIGHT_GRAY);
        NoxBt4_.setBackground(Color.LIGHT_GRAY);
        NoxBt5_.setBackground(Color.LIGHT_GRAY);
        NoxBt6_.setBackground(Color.LIGHT_GRAY);
        NoxBt7_.setBackground(Color.LIGHT_GRAY);
        NoxBt8_.setBackground(Color.LIGHT_GRAY);
        NoxBt9_.setBackground(Color.LIGHT_GRAY);
        NoxBtBagi_.setBackground(Color.magenta);
        NoxBtClear_.setBackground(Color.LIGHT_GRAY);
        NoxBtKali_.setBackground(Color.magenta);
        NoxBtKoma_.setBackground(Color.magenta);
        NoxBtKurang_.setBackground(Color.magenta);
        NoxBtPersen_.setBackground(Color.magenta);
        NoxBtSamaDengan_.setBackground(Color.blue);
        NoxBtTambah_.setBackground(Color.magenta);
        NoxBtDelete_.setBackground(Color.blue);
    }

    public void Modiarrr() {
        NoxBt1_.setEnabled(false);
        NoxBt2_.setEnabled(false);
        NoxBt3_.setEnabled(false);
        NoxBt4_.setEnabled(false);
        NoxBt5_.setEnabled(false);
        NoxBt6_.setEnabled(false);
        NoxBt7_.setEnabled(false);
        NoxBt8_.setEnabled(false);
        NoxBt9_.setEnabled(false);
        NoxBt0_.setEnabled(false);
        NoxBtAbout_.setEnabled(false);
        NoxBtAkarKuadrat_.setEnabled(false);
        NoxBtAkarKubik_.setEnabled(false);
        NoxBtBagi_.setEnabled(false);
        NoxBtClear_.setEnabled(false);
        NoxBtDelete_.setEnabled(false);
        NoxBtKali_.setEnabled(false);
        NoxBtKoma_.setEnabled(false);
        NoxBtKurang_.setEnabled(false);
        NoxBtPangkatKuadrat_.setEnabled(false);
        NoxBtPersen_.setEnabled(false);
        NoxBtSamaDengan_.setEnabled(false);
        NoxBtTambah_.setEnabled(false);
        NoxLayar_.setEnabled(false);
        NoxRadioBtOff_.setEnabled(false);
        NoxRadioBtOn_.setEnabled(true);
        NoxRadioCelcius_.setEnabled(false);
        NoxRadioFahrenheit_.setEnabled(false);
        NoxRadioKelvin_.setEnabled(false);
        NoxRadioReamur_.setEnabled(false);
        jPanel2.setBackground(Color.LIGHT_GRAY);
        jLabel2.setForeground(Color.GRAY);
        jLabel3.setForeground(Color.GRAY);
        jLabel1.setForeground(Color.red);
    }

    public void Muruppp() {
        NoxBt1_.setEnabled(true);
        NoxBt2_.setEnabled(true);
        NoxBt3_.setEnabled(true);
        NoxBt4_.setEnabled(true);
        NoxBt5_.setEnabled(true);
        NoxBt6_.setEnabled(true);
        NoxBt7_.setEnabled(true);
        NoxBt8_.setEnabled(true);
        NoxBt9_.setEnabled(true);
        NoxBt0_.setEnabled(true);
        NoxBtAbout_.setEnabled(true);
        NoxBtAkarKuadrat_.setEnabled(true);
        NoxBtAkarKubik_.setEnabled(true);
        NoxBtBagi_.setEnabled(true);
        NoxBtClear_.setEnabled(true);
        NoxBtDelete_.setEnabled(true);
        NoxBtKali_.setEnabled(true);
        NoxBtKoma_.setEnabled(true);
        NoxBtKurang_.setEnabled(true);
        NoxBtPangkatKuadrat_.setEnabled(true);
        NoxBtPersen_.setEnabled(true);
        NoxBtSamaDengan_.setEnabled(true);
        NoxBtTambah_.setEnabled(true);
        NoxLayar_.setEnabled(true);
        NoxRadioBtOff_.setEnabled(true);
        NoxRadioBtOn_.setEnabled(false);
        NoxRadioCelcius_.setEnabled(true);
        NoxRadioFahrenheit_.setEnabled(true);
        NoxRadioKelvin_.setEnabled(true);
        NoxRadioReamur_.setEnabled(true);
        jPanel2.setBackground(Color.getHSBColor(255, 255, 255));
        jLabel2.setForeground(Color.black);
        jLabel3.setForeground(Color.black);
        jLabel1.setForeground(Color.black);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroupSuhu_ = new javax.swing.ButtonGroup();
        NoxLayar_ = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        NoxBt7_ = new javax.swing.JButton();
        NoxBt8_ = new javax.swing.JButton();
        NoxBt9_ = new javax.swing.JButton();
        NoxBt4_ = new javax.swing.JButton();
        NoxBt5_ = new javax.swing.JButton();
        NoxBt6_ = new javax.swing.JButton();
        NoxBt1_ = new javax.swing.JButton();
        NoxBt2_ = new javax.swing.JButton();
        NoxBt3_ = new javax.swing.JButton();
        NoxBt0_ = new javax.swing.JButton();
        NoxBtClear_ = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        NoxBtTambah_ = new javax.swing.JButton();
        NoxBtKurang_ = new javax.swing.JButton();
        NoxBtKali_ = new javax.swing.JButton();
        NoxBtBagi_ = new javax.swing.JButton();
        NoxBtKoma_ = new javax.swing.JButton();
        NoxBtPersen_ = new javax.swing.JButton();
        NoxBtSamaDengan_ = new javax.swing.JButton();
        NoxBtAbout_ = new javax.swing.JButton();
        NoxBtDelete_ = new javax.swing.JButton();
        NoxRadioBtOn_ = new javax.swing.JRadioButton();
        NoxRadioBtOff_ = new javax.swing.JRadioButton();
        NoxBtAkarKuadrat_ = new javax.swing.JButton();
        NoxBtAkarKubik_ = new javax.swing.JButton();
        NoxBtPangkatKuadrat_ = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        NoxRadioCelcius_ = new javax.swing.JRadioButton();
        NoxRadioFahrenheit_ = new javax.swing.JRadioButton();
        NoxRadioKelvin_ = new javax.swing.JRadioButton();
        NoxRadioReamur_ = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SH PTI 4B");
        setResizable(false);

        NoxLayar_.setEditable(false);
        NoxLayar_.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        NoxLayar_.setText("0");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        NoxBt7_.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        NoxBt7_.setText("7");
        NoxBt7_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxBt7_ActionPerformed(evt);
            }
        });

        NoxBt8_.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        NoxBt8_.setText("8");
        NoxBt8_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxBt8_ActionPerformed(evt);
            }
        });

        NoxBt9_.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        NoxBt9_.setText("9");
        NoxBt9_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxBt9_ActionPerformed(evt);
            }
        });

        NoxBt4_.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        NoxBt4_.setText("4");
        NoxBt4_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxBt4_ActionPerformed(evt);
            }
        });

        NoxBt5_.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        NoxBt5_.setText("5");
        NoxBt5_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxBt5_ActionPerformed(evt);
            }
        });

        NoxBt6_.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        NoxBt6_.setText("6");
        NoxBt6_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxBt6_ActionPerformed(evt);
            }
        });

        NoxBt1_.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        NoxBt1_.setText("1");
        NoxBt1_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxBt1_ActionPerformed(evt);
            }
        });

        NoxBt2_.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        NoxBt2_.setText("2");
        NoxBt2_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxBt2_ActionPerformed(evt);
            }
        });

        NoxBt3_.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        NoxBt3_.setText("3");
        NoxBt3_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxBt3_ActionPerformed(evt);
            }
        });

        NoxBt0_.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        NoxBt0_.setText("0");
        NoxBt0_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxBt0_ActionPerformed(evt);
            }
        });

        NoxBtClear_.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        NoxBtClear_.setText("Clear");
        NoxBtClear_.setToolTipText("kosongkan layar");
        NoxBtClear_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxBtClear_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NoxBt7_, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(NoxBt4_, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(NoxBt1_, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(NoxBt0_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NoxBt8_, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoxBt5_, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoxBt2_, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NoxBt9_, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoxBt6_, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoxBt3_, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(NoxBtClear_, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NoxBt7_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NoxBt8_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NoxBt9_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NoxBt4_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NoxBt5_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NoxBt6_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NoxBt1_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NoxBt2_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NoxBt3_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NoxBt0_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NoxBtClear_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(0, 153, 102));
        jLabel1.setFont(new java.awt.Font("Liberation Sans", 3, 17)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Kalkulator Anti Mumet");

        NoxBtTambah_.setBackground(new java.awt.Color(204, 0, 204));
        NoxBtTambah_.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        NoxBtTambah_.setForeground(new java.awt.Color(255, 255, 255));
        NoxBtTambah_.setText("+");
        NoxBtTambah_.setToolTipText("penjumlahan");
        NoxBtTambah_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxBtTambah_ActionPerformed(evt);
            }
        });

        NoxBtKurang_.setBackground(new java.awt.Color(204, 0, 204));
        NoxBtKurang_.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        NoxBtKurang_.setForeground(new java.awt.Color(255, 255, 255));
        NoxBtKurang_.setText("-");
        NoxBtKurang_.setToolTipText("pengurangan");
        NoxBtKurang_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxBtKurang_ActionPerformed(evt);
            }
        });

        NoxBtKali_.setBackground(new java.awt.Color(204, 0, 204));
        NoxBtKali_.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        NoxBtKali_.setForeground(new java.awt.Color(255, 255, 255));
        NoxBtKali_.setText("x");
        NoxBtKali_.setToolTipText("perkalian");
        NoxBtKali_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxBtKali_ActionPerformed(evt);
            }
        });

        NoxBtBagi_.setBackground(new java.awt.Color(204, 0, 204));
        NoxBtBagi_.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        NoxBtBagi_.setForeground(new java.awt.Color(255, 255, 255));
        NoxBtBagi_.setText("/");
        NoxBtBagi_.setToolTipText("pembagian");
        NoxBtBagi_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxBtBagi_ActionPerformed(evt);
            }
        });

        NoxBtKoma_.setBackground(new java.awt.Color(204, 0, 204));
        NoxBtKoma_.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        NoxBtKoma_.setForeground(new java.awt.Color(255, 255, 255));
        NoxBtKoma_.setText(",");
        NoxBtKoma_.setToolTipText("koma");
        NoxBtKoma_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxBtKoma_ActionPerformed(evt);
            }
        });

        NoxBtPersen_.setBackground(new java.awt.Color(204, 0, 204));
        NoxBtPersen_.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        NoxBtPersen_.setForeground(new java.awt.Color(255, 255, 255));
        NoxBtPersen_.setText("%");
        NoxBtPersen_.setToolTipText("persen");
        NoxBtPersen_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxBtPersen_ActionPerformed(evt);
            }
        });

        NoxBtSamaDengan_.setBackground(new java.awt.Color(51, 51, 255));
        NoxBtSamaDengan_.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        NoxBtSamaDengan_.setForeground(new java.awt.Color(255, 255, 255));
        NoxBtSamaDengan_.setText("=");
        NoxBtSamaDengan_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxBtSamaDengan_ActionPerformed(evt);
            }
        });

        NoxBtAbout_.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        NoxBtAbout_.setText("about");
        NoxBtAbout_.setToolTipText("About this program....");
        NoxBtAbout_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxBtAbout_ActionPerformed(evt);
            }
        });

        NoxBtDelete_.setBackground(new java.awt.Color(51, 51, 255));
        NoxBtDelete_.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        NoxBtDelete_.setForeground(new java.awt.Color(255, 255, 255));
        NoxBtDelete_.setText("DEL");
        NoxBtDelete_.setToolTipText("Backspace / Delete");
        NoxBtDelete_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxBtDelete_ActionPerformed(evt);
            }
        });

        buttonGroup1.add(NoxRadioBtOn_);
        NoxRadioBtOn_.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        NoxRadioBtOn_.setText("On");
        NoxRadioBtOn_.setToolTipText("nyalakan..");
        NoxRadioBtOn_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxRadioBtOn_ActionPerformed(evt);
            }
        });

        buttonGroup1.add(NoxRadioBtOff_);
        NoxRadioBtOff_.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        NoxRadioBtOff_.setText("Off");
        NoxRadioBtOff_.setToolTipText("matikan kalkulator");
        NoxRadioBtOff_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxRadioBtOff_ActionPerformed(evt);
            }
        });

        NoxBtAkarKuadrat_.setFont(new java.awt.Font("Liberation Sans", 3, 13)); // NOI18N
        NoxBtAkarKuadrat_.setText("^(2)");
        NoxBtAkarKuadrat_.setToolTipText("akar kuadrat");
        NoxBtAkarKuadrat_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxBtAkarKuadrat_ActionPerformed(evt);
            }
        });

        NoxBtAkarKubik_.setFont(new java.awt.Font("Liberation Sans", 3, 13)); // NOI18N
        NoxBtAkarKubik_.setText("^(3)");
        NoxBtAkarKubik_.setToolTipText("akar kubik (3)");
        NoxBtAkarKubik_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxBtAkarKubik_ActionPerformed(evt);
            }
        });

        NoxBtPangkatKuadrat_.setFont(new java.awt.Font("Liberation Sans", 3, 13)); // NOI18N
        NoxBtPangkatKuadrat_.setText("x^");
        NoxBtPangkatKuadrat_.setToolTipText("pangkat kuadrat");
        NoxBtPangkatKuadrat_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxBtPangkatKuadrat_ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 204, 51));

        buttonGroupSuhu_.add(NoxRadioCelcius_);
        NoxRadioCelcius_.setFont(new java.awt.Font("Liberation Sans", 3, 13)); // NOI18N
        NoxRadioCelcius_.setSelected(true);
        NoxRadioCelcius_.setText("Celcius");
        NoxRadioCelcius_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxRadioCelcius_ActionPerformed(evt);
            }
        });

        buttonGroupSuhu_.add(NoxRadioFahrenheit_);
        NoxRadioFahrenheit_.setFont(new java.awt.Font("Liberation Sans", 3, 13)); // NOI18N
        NoxRadioFahrenheit_.setText("Fahrenheit");
        NoxRadioFahrenheit_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxRadioFahrenheit_ActionPerformed(evt);
            }
        });

        buttonGroupSuhu_.add(NoxRadioKelvin_);
        NoxRadioKelvin_.setFont(new java.awt.Font("Liberation Sans", 3, 13)); // NOI18N
        NoxRadioKelvin_.setText("Kelvin");
        NoxRadioKelvin_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxRadioKelvin_ActionPerformed(evt);
            }
        });

        buttonGroupSuhu_.add(NoxRadioReamur_);
        NoxRadioReamur_.setFont(new java.awt.Font("Liberation Sans", 3, 13)); // NOI18N
        NoxRadioReamur_.setText("Reamur");
        NoxRadioReamur_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxRadioReamur_ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Konverter");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Suhu");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NoxRadioFahrenheit_)
                            .addComponent(NoxRadioKelvin_)
                            .addComponent(NoxRadioReamur_)
                            .addComponent(NoxRadioCelcius_)))
                    .addComponent(jSeparator1))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoxRadioCelcius_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NoxRadioFahrenheit_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NoxRadioKelvin_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NoxRadioReamur_)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(132, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NoxLayar_)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NoxRadioBtOn_)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NoxRadioBtOff_)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NoxBtAkarKuadrat_, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(NoxBtKoma_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                .addComponent(NoxBtDelete_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(NoxBtTambah_, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoxBtKali_, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoxBtPangkatKuadrat_, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NoxBtKurang_, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NoxBtBagi_, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(NoxBtSamaDengan_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                        .addComponent(NoxBtPersen_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NoxBtAkarKubik_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(12, 12, 12)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NoxBtAbout_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NoxLayar_, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(NoxBtBagi_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NoxBtPersen_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(NoxBtSamaDengan_, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(NoxBtAkarKuadrat_)
                                            .addComponent(NoxBtPangkatKuadrat_)
                                            .addComponent(NoxBtAkarKubik_)))
                                    .addComponent(NoxBtAbout_))
                                .addGap(1, 1, 1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(NoxBtTambah_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(NoxBtKurang_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(NoxBtKali_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(NoxBtKoma_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(13, 13, 13)
                                            .addComponent(NoxBtDelete_, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(NoxRadioBtOn_)
                                    .addComponent(NoxRadioBtOff_))))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NoxBt9_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBt9_ActionPerformed
        // TODO add your handling code here:

        AturTextLayar("9");
        HilangkanWarnaTombol(true);
        NoxBt9_.setBackground(Color.GREEN);

    }//GEN-LAST:event_NoxBt9_ActionPerformed

    private void NoxBt6_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBt6_ActionPerformed
        // TODO add your handling code here:

        AturTextLayar("6");
        HilangkanWarnaTombol(true);
        NoxBt6_.setBackground(Color.GREEN);

    }//GEN-LAST:event_NoxBt6_ActionPerformed

    private void NoxBt5_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBt5_ActionPerformed
        // TODO add your handling code here:

        AturTextLayar("5");
        HilangkanWarnaTombol(true);
        NoxBt5_.setBackground(Color.GREEN);

    }//GEN-LAST:event_NoxBt5_ActionPerformed

    private void NoxBt2_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBt2_ActionPerformed
        // TODO add your handling code here:

        AturTextLayar("2");
        HilangkanWarnaTombol(true);
        NoxBt2_.setBackground(Color.GREEN);

    }//GEN-LAST:event_NoxBt2_ActionPerformed

    private void NoxBt3_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBt3_ActionPerformed
        // TODO add your handling code here:        

        AturTextLayar("3");
        HilangkanWarnaTombol(true);
        NoxBt3_.setBackground(Color.GREEN);
    }//GEN-LAST:event_NoxBt3_ActionPerformed

    private void NoxBtClear_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBtClear_ActionPerformed
        // TODO add your handling code here:
        NoxLayar_.setText("");

        HilangkanWarnaTombol(true);
        NoxBtClear_.setBackground(Color.blue);
        NoxRadioCelcius_.setEnabled(true);
        NoxRadioCelcius_.setSelected(true);
        NoxRadioFahrenheit_.setEnabled(true);
        NoxRadioKelvin_.setEnabled(true);
        NoxRadioReamur_.setEnabled(true);
    }//GEN-LAST:event_NoxBtClear_ActionPerformed

    private void NoxBtTambah_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBtTambah_ActionPerformed
        // TODO add your handling code here:

        TandaHitung = "+";
        FirstClick = true;
        Angka_ke1 = Double.parseDouble(NoxLayar_.getText());

        HilangkanWarnaTombol(true);
        NoxBtTambah_.setBackground(Color.YELLOW);
    }//GEN-LAST:event_NoxBtTambah_ActionPerformed

    private void NoxBtKurang_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBtKurang_ActionPerformed
        // TODO add your handling code here:

        TandaHitung = "-";
        FirstClick = true;
        Angka_ke1 = Double.parseDouble(NoxLayar_.getText());

        HilangkanWarnaTombol(true);
        NoxBtKurang_.setBackground(Color.YELLOW);
    }//GEN-LAST:event_NoxBtKurang_ActionPerformed

    private void NoxBtKali_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBtKali_ActionPerformed
        // TODO add your handling code here:

        TandaHitung = "*";
        FirstClick = true;
        Angka_ke1 = Double.parseDouble(NoxLayar_.getText());

        HilangkanWarnaTombol(true);
        NoxBtKali_.setBackground(Color.YELLOW);
    }//GEN-LAST:event_NoxBtKali_ActionPerformed

    private void NoxBtBagi_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBtBagi_ActionPerformed
        // TODO add your handling code here:

        TandaHitung = "/";
        FirstClick = true;
        Angka_ke1 = Double.parseDouble(NoxLayar_.getText());

        HilangkanWarnaTombol(true);
        NoxBtBagi_.setBackground(Color.YELLOW);
    }//GEN-LAST:event_NoxBtBagi_ActionPerformed

    private void NoxBtKoma_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBtKoma_ActionPerformed
        // Fungsi agar kalo dilayar sudah ada koma, tidak bisa muncul koma lagi
        if (NoxLayar_.getText().contains(".")) {
            return;
        } else {
            AturTextLayar("."); //koma dalam inggris menjadi . (titik)
        }

        HilangkanWarnaTombol(true);
        NoxBtKoma_.setBackground(Color.YELLOW);

    }//GEN-LAST:event_NoxBtKoma_ActionPerformed

    private void NoxBtPersen_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBtPersen_ActionPerformed
        // TODO add your handling code here:

        Angka_ke2 = Double.parseDouble(NoxLayar_.getText());
        Hasil_Hitung = Angka_ke1 * Angka_ke2 / 100;
        NoxLayar_.setText(Double.toString(Hasil_Hitung));
    }//GEN-LAST:event_NoxBtPersen_ActionPerformed

    private void NoxBtSamaDengan_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBtSamaDengan_ActionPerformed
        // TODO add your handling code here:
        Hasil_Hitung = 0;
        Angka_ke2 = Double.parseDouble(NoxLayar_.getText());
        if (TandaHitung == "+") {
            Hasil_Hitung = Angka_ke1 + Angka_ke2;
        } else if (TandaHitung == "-") {
            Hasil_Hitung = Angka_ke1 - Angka_ke2;
        } else if (TandaHitung == "*") {
            Hasil_Hitung = Angka_ke1 * Angka_ke2;
        } else if (TandaHitung == "/") {
            Hasil_Hitung = Angka_ke1 / Angka_ke2;
        }
        
        // agar menjadi dua angka saja dibelakang desimal
        DecimalFormat ddd = new DecimalFormat("#.###"); //atur jumlah angka desimal di sini
        String Rungkad = ddd.format(Hasil_Hitung);

        // menampilkan hasil yang telah di sunat desimal nya
        NoxLayar_.setText(Rungkad);

        HilangkanWarnaTombol(true);
        NoxBtSamaDengan_.setBackground(Color.RED);
    }//GEN-LAST:event_NoxBtSamaDengan_ActionPerformed

    private void NoxBtAbout_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBtAbout_ActionPerformed
        // TODO add your handling code here:
        new abot().setVisible(true); //memanggil form abot (About)

        /*JOptionPane.showMessageDialog(rootPane, "UAS Matkul Pemrograman lanjut\n"
                + "Dosen: Pak Fahrur Rozi\n\n"
                + "Kalkulator Sederhana + Converter Suhu Sederhana Juga   \n\n"
                + "Soni Hendarkanto (PTI 4B)\n"
                + "21183207051\n\n"
                + "NB:\n"
                + "Converter suhu hanya bisa satu arah, dari Celcius ke Lainnya,\n"
                + "misal Celcius ke Farenheit,\n"
                + "         Celcius ke Kelvin,\n"
                + "         Celcius ke Reamur,\n\n"
                + "Tidak bisa dari dari Farenheit ke Kelvin,\n"
                + "atau dari Reamur ke Farenheit", "Tentang Kalkulator ini", HEIGHT);*/
    }//GEN-LAST:event_NoxBtAbout_ActionPerformed

    private void NoxBt7_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBt7_ActionPerformed
        // TODO add your handling code here:

        AturTextLayar("7");
        HilangkanWarnaTombol(true);
        NoxBt7_.setBackground(Color.GREEN);

    }//GEN-LAST:event_NoxBt7_ActionPerformed

    private void NoxBt8_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBt8_ActionPerformed
        // TODO add your handling code here:

        AturTextLayar("8");
        HilangkanWarnaTombol(true);
        NoxBt8_.setBackground(Color.GREEN);

    }//GEN-LAST:event_NoxBt8_ActionPerformed

    private void NoxBt4_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBt4_ActionPerformed
        // TODO add your handling code here:

        AturTextLayar("4");
        HilangkanWarnaTombol(true);
        NoxBt4_.setBackground(Color.GREEN);

    }//GEN-LAST:event_NoxBt4_ActionPerformed

    private void NoxBt1_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBt1_ActionPerformed
        // TODO add your handling code here:

        AturTextLayar("1");
        HilangkanWarnaTombol(true);
        NoxBt1_.setBackground(Color.GREEN);

    }//GEN-LAST:event_NoxBt1_ActionPerformed

    private void NoxBt0_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBt0_ActionPerformed
        // TODO add your handling code here:
        AturTextLayar("0");
        HilangkanWarnaTombol(true);
        NoxBt0_.setBackground(Color.GREEN);
    }//GEN-LAST:event_NoxBt0_ActionPerformed

    private void NoxBtDelete_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBtDelete_ActionPerformed
        // TODO add your handling code here:
        int PanjangAngka = NoxLayar_.getText().length();
        int DinasPajak = PanjangAngka - 1;

        if (PanjangAngka > 0) {
            StringBuilder HapusKarakter = new StringBuilder(NoxLayar_.getText());
            HapusKarakter.deleteCharAt(DinasPajak);
            NoxLayar_.setText(HapusKarakter.toString());
        }

        HilangkanWarnaTombol(true);
        NoxBtDelete_.setBackground(Color.YELLOW);
    }//GEN-LAST:event_NoxBtDelete_ActionPerformed

    private void NoxRadioBtOff_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxRadioBtOff_ActionPerformed
        // TODO add your handling code here:
        Modiarrr();
        NoxLayar_.setText("");
        jLabel1.setText("OFF");
    }//GEN-LAST:event_NoxRadioBtOff_ActionPerformed

    private void NoxBtAkarKuadrat_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBtAkarKuadrat_ActionPerformed
        // TODO add your handling code here:

        Angka_ke1 = Double.parseDouble(NoxLayar_.getText());
        Double AkarKuadrat = Math.sqrt(Angka_ke1);
        
        // agar menjadi dua angka saja dibelakang desimal
        DecimalFormat ddd = new DecimalFormat("#.###"); //atur jumlah angka desimal di sini
        String Rungkad = ddd.format(AkarKuadrat);
        //NoxLayar_.setText(Double.toString(AkarKuadrat));
        NoxLayar_.setText(Rungkad);
    }//GEN-LAST:event_NoxBtAkarKuadrat_ActionPerformed

    private void NoxBtAkarKubik_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBtAkarKubik_ActionPerformed
        // Akar Kubik adalah akar 3, misal 27 hasilnya 3

        Angka_ke1 = Double.parseDouble(NoxLayar_.getText());
        Double AkarKubik = Math.cbrt(Angka_ke1);
        
        // agar menjadi dua angka saja dibelakang desimal
        DecimalFormat ddd = new DecimalFormat("#.###"); //atur jumlah angka desimal di sini
        String Rungkad = ddd.format(AkarKubik);
        //NoxLayar_.setText(Double.toString(AkarKubik));
        NoxLayar_.setText(Rungkad);
    }//GEN-LAST:event_NoxBtAkarKubik_ActionPerformed

    private void NoxBtPangkatKuadrat_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBtPangkatKuadrat_ActionPerformed
        // Rumus pangkat kuadrat adalah Math.pow(angka, 2) artinya angka x angka;
        // bisa juga Math.pow(angka, 3) artinya angka x angka x angka;
        // Math.pow(7, 4) artinya 7x7x7x7;

        Angka_ke1 = Double.parseDouble(NoxLayar_.getText());
        Double PangkatKuadrat = Math.pow(Angka_ke1, 2);
        NoxLayar_.setText(Double.toString(PangkatKuadrat));
    }//GEN-LAST:event_NoxBtPangkatKuadrat_ActionPerformed

    private void NoxRadioBtOn_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxRadioBtOn_ActionPerformed
        // TODO add your handling code here:
        Muruppp();
        NoxLayar_.setText("0");
        jLabel1.setText("Kalkulator Anti Mumet");
    }//GEN-LAST:event_NoxRadioBtOn_ActionPerformed

    private void NoxRadioCelcius_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxRadioCelcius_ActionPerformed
        // TODO add your handling code here:
        NoxLayar_.setText("0");

        NoxRadioFahrenheit_.setEnabled(true);
        NoxRadioKelvin_.setEnabled(true);
        NoxRadioReamur_.setEnabled(true);
    }//GEN-LAST:event_NoxRadioCelcius_ActionPerformed

    private void NoxRadioFahrenheit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxRadioFahrenheit_ActionPerformed
        // TODO add your handling code here:
        LayarAwal = NoxLayar_.getText();

        if (LayarAwal.equals("")) { //agar kalau layar kosong, tidak error
            JOptionPane.showMessageDialog(null, "Maaf...\n"
                    + "Angka di layar masih kosong");
            NoxRadioCelcius_.setSelected(true);
        } else {
            NoxSuhuuuu = Double.valueOf(NoxLayar_.getText());
            NoxFahrell = NoxSuhuuuu * 1.8 + 32;
            
            // agar menjadi dua angka saja dibelakang desimal
            DecimalFormat ddd = new DecimalFormat("#.###"); //atur jumlah angka desimal di sini
            String Rungkad = ddd.format(NoxFahrell);
            //NoxHasilSuhu = Double.toString(NoxFahrell);
            NoxLayar_.setText(Rungkad + " 'F");
            
            //NoxRadioFahrenheit_.setEnabled(false);
            NoxRadioKelvin_.setEnabled(false);
            NoxRadioReamur_.setEnabled(false);
            NoxRadioCelcius_.setEnabled(true);
            //NoxRadioCelcius_.setSelected(true);
        }
    }//GEN-LAST:event_NoxRadioFahrenheit_ActionPerformed

    private void NoxRadioKelvin_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxRadioKelvin_ActionPerformed
        // TODO add your handling code here:
        LayarAwal = NoxLayar_.getText();

        if (LayarAwal.equals("")) { //agar kalau layar kosong, tidak error
            JOptionPane.showMessageDialog(null, "Maaf...\n"
                    + "Angka di layar masih kosong");
            NoxRadioCelcius_.setSelected(true);
        } else {
            NoxSuhuuuu = Double.valueOf(NoxLayar_.getText());
            NoxKelvinSanjaya = NoxSuhuuuu + 273.15;
            
            // agar menjadi dua angka saja dibelakang desimal
            DecimalFormat ddd = new DecimalFormat("#.###"); //atur jumlah angka desimal di sini
            String Rungkad = ddd.format(NoxKelvinSanjaya);
            //NoxHasilSuhu = Double.toString(NoxKelvinSanjaya);
            NoxLayar_.setText(Rungkad + " 'K");
            
            NoxRadioCelcius_.setEnabled(true);
            NoxRadioFahrenheit_.setEnabled(false);
            //NoxRadioKelvin_.setEnabled(false);
            NoxRadioReamur_.setEnabled(false);
            //NoxRadioCelcius_.setSelected(true);
        }
    }//GEN-LAST:event_NoxRadioKelvin_ActionPerformed

    private void NoxRadioReamur_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxRadioReamur_ActionPerformed
        // TODO add your handling code here:
        LayarAwal = NoxLayar_.getText();

        if (LayarAwal.equals("")) { //agar kalau layar kosong, tidak error
            JOptionPane.showMessageDialog(null, "Maaf...\n"
                    + "Angka di layar masih kosong");
            NoxRadioCelcius_.setSelected(true);
        } else {
            NoxSuhuuuu = Double.valueOf(NoxLayar_.getText());
            NoxRemunerasi = NoxSuhuuuu * 0.8;
            //NoxHasilSuhu = Double.toString(NoxRemunerasi);
            
            // agar menjadi dua angka saja dibelakang desimal
            DecimalFormat ddd = new DecimalFormat("#.###"); //atur jumlah angka desimal di sini
            String Rungkad = ddd.format(NoxRemunerasi);
            NoxLayar_.setText(Rungkad + " 'R");
            //NoxLayar_.setText(NoxHasilSuhu + " 'R");

            NoxRadioFahrenheit_.setEnabled(false);
            NoxRadioKelvin_.setEnabled(false);
            NoxRadioCelcius_.setEnabled(true);
            //NoxRadioReamur_.setEnabled(false);
            //NoxRadioCelcius_.setSelected(true);
        }
    }//GEN-LAST:event_NoxRadioReamur_ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NoxUASJavaLanjut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NoxUASJavaLanjut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NoxUASJavaLanjut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NoxUASJavaLanjut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NoxUASJavaLanjut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NoxBt0_;
    private javax.swing.JButton NoxBt1_;
    private javax.swing.JButton NoxBt2_;
    private javax.swing.JButton NoxBt3_;
    private javax.swing.JButton NoxBt4_;
    private javax.swing.JButton NoxBt5_;
    private javax.swing.JButton NoxBt6_;
    private javax.swing.JButton NoxBt7_;
    private javax.swing.JButton NoxBt8_;
    private javax.swing.JButton NoxBt9_;
    private javax.swing.JButton NoxBtAbout_;
    private javax.swing.JButton NoxBtAkarKuadrat_;
    private javax.swing.JButton NoxBtAkarKubik_;
    private javax.swing.JButton NoxBtBagi_;
    private javax.swing.JButton NoxBtClear_;
    private javax.swing.JButton NoxBtDelete_;
    private javax.swing.JButton NoxBtKali_;
    private javax.swing.JButton NoxBtKoma_;
    private javax.swing.JButton NoxBtKurang_;
    private javax.swing.JButton NoxBtPangkatKuadrat_;
    private javax.swing.JButton NoxBtPersen_;
    private javax.swing.JButton NoxBtSamaDengan_;
    private javax.swing.JButton NoxBtTambah_;
    private javax.swing.JTextField NoxLayar_;
    private javax.swing.JRadioButton NoxRadioBtOff_;
    private javax.swing.JRadioButton NoxRadioBtOn_;
    private javax.swing.JRadioButton NoxRadioCelcius_;
    private javax.swing.JRadioButton NoxRadioFahrenheit_;
    private javax.swing.JRadioButton NoxRadioKelvin_;
    private javax.swing.JRadioButton NoxRadioReamur_;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroupSuhu_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
