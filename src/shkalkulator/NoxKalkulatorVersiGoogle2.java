
package shkalkulator;

/**
     * @author Soni Hendarkanto PTI 4B
     * With Apache NetBeans IDE 16, Belsoft JAVA JDK 19
     * on Linux Mint 21.1 "VERA" Cinnamon Desktop Edition
     * My github for this project: https://github.com/Soni-Hendar-Kip/SHKalkulator
     * 
     * link tutor:
     * https://github.com/debck/Calculator
     */
public class NoxKalkulatorVersiGoogle2 extends javax.swing.JFrame {
    String signh="";
    boolean FirstClick=false;

    /**
     * Creates new form NoxKalkulatorX
     */
    public NoxKalkulatorVersiGoogle2() {
        initComponents();
    }
    
    // ini coding tutor dari pak dosen rozi, bagus, tp untuk disini tidak saya pake
    public void AturTextLayar(String k){
        System.out.println("SIGN : " +signh);
        System.out.println("FIRST CLICK : " +FirstClick);
        
        if(signh.equals("plus") && FirstClick){
            NoxLayar_.setText(k);
            FirstClick=false;
        }
        else{
            NoxLayar_.setText(NoxLayar_.getText()+k);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SH PTI 4B");
        setResizable(false);

        NoxLayar_.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N

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
        jLabel1.setFont(new java.awt.Font("Liberation Sans", 3, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Kalkulator Anti Mumet Google v2");

        NoxBtTambah_.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        NoxBtTambah_.setText("+");
        NoxBtTambah_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxBtTambah_ActionPerformed(evt);
            }
        });

        NoxBtKurang_.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        NoxBtKurang_.setText("-");
        NoxBtKurang_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxBtKurang_ActionPerformed(evt);
            }
        });

        NoxBtKali_.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        NoxBtKali_.setText("x");
        NoxBtKali_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxBtKali_ActionPerformed(evt);
            }
        });

        NoxBtBagi_.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        NoxBtBagi_.setText("/");
        NoxBtBagi_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxBtBagi_ActionPerformed(evt);
            }
        });

        NoxBtKoma_.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        NoxBtKoma_.setText(",");
        NoxBtKoma_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxBtKoma_ActionPerformed(evt);
            }
        });

        NoxBtPersen_.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        NoxBtPersen_.setText("%");
        NoxBtPersen_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxBtPersen_ActionPerformed(evt);
            }
        });

        NoxBtSamaDengan_.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        NoxBtSamaDengan_.setText("=");
        NoxBtSamaDengan_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxBtSamaDengan_ActionPerformed(evt);
            }
        });

        NoxBtAbout_.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        NoxBtAbout_.setText("?");
        NoxBtAbout_.setToolTipText("About this program....");
        NoxBtAbout_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoxBtAbout_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NoxLayar_)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NoxBtTambah_, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addComponent(NoxBtKurang_, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NoxBtKali_, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NoxBtBagi_, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NoxBtKoma_, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NoxBtPersen_, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(NoxBtSamaDengan_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(NoxBtAbout_, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NoxLayar_, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NoxBtTambah_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoxBtKurang_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NoxBtKali_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoxBtBagi_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NoxBtKoma_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoxBtPersen_, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NoxBtSamaDengan_, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(NoxBtAbout_)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NoxBt9_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBt9_ActionPerformed
        // TODO add your handling code here:
        if (NoxLayar_.getText().isEmpty()){
            NoxLayar_.setText(NoxBt9_.getText());
            Nilai1 = 9;
        }
        else {
            NoxLayar_.setText(NoxLayar_.getText() + "" + NoxBt9_.getText());
            Nilai2 = 9;
        }
            //AturTextLayar("9");
            //SHAngka+="9";
            //NoxTextLayar_.setText(SHAngka);
    }//GEN-LAST:event_NoxBt9_ActionPerformed

    private void NoxBt6_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBt6_ActionPerformed
        // TODO add your handling code here:
        if (NoxLayar_.getText().isEmpty()){
            NoxLayar_.setText(NoxBt6_.getText());
            Nilai1 = 6;
        }
        else {
            NoxLayar_.setText(NoxLayar_.getText() + "" + NoxBt6_.getText());
            Nilai2 = 6;
        }
            //AturTextLayar("6");
            //SHAngka+="6";
            //NoxTextLayar_.setText(SHAngka);
    }//GEN-LAST:event_NoxBt6_ActionPerformed

    private void NoxBt5_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBt5_ActionPerformed
        // TODO add your handling code here:
        if (NoxLayar_.getText().isEmpty()){
            NoxLayar_.setText(NoxBt5_.getText());
            Nilai1 = 5;
        }
        else {
            NoxLayar_.setText(NoxLayar_.getText() + "" + NoxBt5_.getText());
            Nilai2 = 5;
        }
            //AturTextLayar("5");
            //SHAngka+="5";
            //NoxTextLayar_.setText(SHAngka);
    }//GEN-LAST:event_NoxBt5_ActionPerformed

    private void NoxBt2_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBt2_ActionPerformed
        // TODO add your handling code here:
        if (NoxLayar_.getText().isEmpty()){
            NoxLayar_.setText(NoxBt2_.getText());
            Nilai1 = 2;
        }
        else {
            NoxLayar_.setText(NoxLayar_.getText() + "" + NoxBt2_.getText());
            Nilai2 = 2;
        }
            //AturTextLayar("2");
            //SHAngka+="2";
            //NoxTextLayar_.setText(SHAngka);
    }//GEN-LAST:event_NoxBt2_ActionPerformed

    private void NoxBt3_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBt3_ActionPerformed
        // TODO add your handling code here:        
        if (NoxLayar_.getText().isEmpty()){
            NoxLayar_.setText(NoxBt3_.getText());
            Nilai1 = 3;
        }
        else {
            NoxLayar_.setText(NoxLayar_.getText() + "" + NoxBt3_.getText());
            Nilai2 = 3;
        }
            //AturTextLayar("3");
            //SHAngka+="3";
            //NoxTextLayar_.setText(SHAngka);
    }//GEN-LAST:event_NoxBt3_ActionPerformed

    private void NoxBtClear_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBtClear_ActionPerformed
        // TODO add your handling code here:
         NoxLayar_.setText("");
    }//GEN-LAST:event_NoxBtClear_ActionPerformed

    private void NoxBtTambah_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBtTambah_ActionPerformed
        // TODO add your handling code here:
        if (!(NoxLayar_.getText().isEmpty())){
            OperatorMTK = "tambah";
            NoxLayar_.setText(NoxLayar_.getText() + "+");
        }
            //signh = "plus";
            //FirstClick = true;
            //SHBil_1=Double.parseDouble(NoxTextLayar_.getText());
    }//GEN-LAST:event_NoxBtTambah_ActionPerformed

    private void NoxBtKurang_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBtKurang_ActionPerformed
        // TODO add your handling code here:
        if (!(NoxLayar_.getText().isEmpty())){
            OperatorMTK = "kurang";
            NoxLayar_.setText(NoxLayar_.getText() + "-");
        }
    }//GEN-LAST:event_NoxBtKurang_ActionPerformed

    private void NoxBtKali_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBtKali_ActionPerformed
        // TODO add your handling code here:
        if (!(NoxLayar_.getText().isEmpty())){
            OperatorMTK = "perkalian";
            NoxLayar_.setText(NoxLayar_.getText() + "*");
        }
    }//GEN-LAST:event_NoxBtKali_ActionPerformed

    private void NoxBtBagi_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBtBagi_ActionPerformed
        // TODO add your handling code here:
        if (!(NoxLayar_.getText().isEmpty())){
            OperatorMTK = "pembagian";
            NoxLayar_.setText(NoxLayar_.getText() + "/");
        }
    }//GEN-LAST:event_NoxBtBagi_ActionPerformed

    private void NoxBtKoma_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBtKoma_ActionPerformed
        // TODO add your handling code here:
        /*SHasil = 0;
        SHBil_2=Double.parseDouble(NoxLayar_.getText());
        if (signh.equals("plus")){
            SHasil=SHBil_1 + SHBil_2;
        }
        NoxLayar_.setText(SHasil+"");*/
    }//GEN-LAST:event_NoxBtKoma_ActionPerformed

    private void NoxBtPersen_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBtPersen_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoxBtPersen_ActionPerformed

    private void NoxBtSamaDengan_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBtSamaDengan_ActionPerformed
        // TODO add your handling code here:
        double SHJumlah = 0;
        if (OperatorMTK == "tambah"){
            SHJumlah = Nilai1 + Nilai2 ;
        }
        else if (OperatorMTK == "kurang"){
            SHJumlah = Nilai1 - Nilai2 ;
        }
        else if (OperatorMTK == "perkalian"){
            SHJumlah = Nilai1 * Nilai2 ;
        }
        else if (OperatorMTK == "pembagian"){
            SHJumlah = Nilai1 / Nilai2 ;
        }
        
        String SHasil = Double.toString(SHJumlah);
        NoxLayar_.setText(SHasil);
    }//GEN-LAST:event_NoxBtSamaDengan_ActionPerformed

    private void NoxBtAbout_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBtAbout_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoxBtAbout_ActionPerformed

    private void NoxBt7_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBt7_ActionPerformed
        // TODO add your handling code here:
        if (NoxLayar_.getText().isEmpty()){
            NoxLayar_.setText(NoxBt7_.getText());
            Nilai1 = 7;
        }
        else {
            NoxLayar_.setText(NoxLayar_.getText() + "" + NoxBt7_.getText());
            Nilai2 = 7;
        }
            //AturTextLayar("7");
            //SHAngka+="7";
            //NoxTextLayar_.setText(SHAngka);
    }//GEN-LAST:event_NoxBt7_ActionPerformed

    private void NoxBt8_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBt8_ActionPerformed
        // TODO add your handling code here:
        if (NoxLayar_.getText().isEmpty()){
            NoxLayar_.setText(NoxBt8_.getText());
            Nilai1 = 8;
        }
        else {
            NoxLayar_.setText(NoxLayar_.getText() + "" + NoxBt8_.getText());
            Nilai2 = 8;
        }
            //AturTextLayar("8");
            //SHAngka+="8";
            //NoxTextLayar_.setText(SHAngka);
    }//GEN-LAST:event_NoxBt8_ActionPerformed

    private void NoxBt4_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBt4_ActionPerformed
        // TODO add your handling code here:
        if (NoxLayar_.getText().isEmpty()){
            NoxLayar_.setText(NoxBt4_.getText());
            Nilai1 = 4;
        }
        else {
            NoxLayar_.setText(NoxLayar_.getText() + "" + NoxBt4_.getText());
            Nilai2 = 4;
        }
            //AturTextLayar("4");
            //SHAngka+="4";
            //NoxTextLayar_.setText(SHAngka);
    }//GEN-LAST:event_NoxBt4_ActionPerformed

    private void NoxBt1_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBt1_ActionPerformed
        // TODO add your handling code here:
        if (NoxLayar_.getText().isEmpty()){
            NoxLayar_.setText(NoxBt1_.getText());
            Nilai1 = 1;
        }
        else {
            NoxLayar_.setText(NoxLayar_.getText() + "" + NoxBt1_.getText());
            Nilai2 = 1;
        }
            //AturTextLayar("1");
            //SHAngka+="1";
            //NoxTextLayar_.setText(SHAngka);
    }//GEN-LAST:event_NoxBt1_ActionPerformed

    private void NoxBt0_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoxBt0_ActionPerformed
        // TODO add your handling code here:
        if (NoxLayar_.getText().isEmpty()){
            NoxLayar_.setText(NoxBt0_.getText());
            Nilai1 = 0;
        }
        else {
            NoxLayar_.setText(NoxLayar_.getText() + "" + NoxBt0_.getText());
            Nilai2 = 0;
        }
            //AturTextLayar("0");
            //SHAngka+="0";
            //NoxTextLayar_.setText(SHAngka);
    }//GEN-LAST:event_NoxBt0_ActionPerformed

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
            java.util.logging.Logger.getLogger(NoxKalkulatorVersiGoogle2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NoxKalkulatorVersiGoogle2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NoxKalkulatorVersiGoogle2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NoxKalkulatorVersiGoogle2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new NoxKalkulatorVersiGoogle2().setVisible(true);
            }
        });
    }
    
    static int Nilai1;
    static int Nilai2;
    static String OperatorMTK;

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
    private javax.swing.JButton NoxBtBagi_;
    private javax.swing.JButton NoxBtClear_;
    private javax.swing.JButton NoxBtKali_;
    private javax.swing.JButton NoxBtKoma_;
    private javax.swing.JButton NoxBtKurang_;
    private javax.swing.JButton NoxBtPersen_;
    private javax.swing.JButton NoxBtSamaDengan_;
    private javax.swing.JButton NoxBtTambah_;
    private javax.swing.JTextField NoxLayar_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
