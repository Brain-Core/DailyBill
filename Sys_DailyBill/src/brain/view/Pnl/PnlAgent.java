/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brain.view.Pnl;

import brainaden.controller.DtHelper;
import brainaden.metier.ClsAgent;
import brainaden.view.Frame.frmPaiement;
import brainaden.view.Frame.frmSalaire;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Brain
 */
public class PnlAgent extends javax.swing.JPanel {

    ClsAgent agent;

    /**
     * Creates new form PnlDashboard
     */
    public PnlAgent() {
        initComponents();
        try 
        {
            DtHelper.Load_TblData(jXTable1, "SELECT * FROM tAgent");
            txtId.setText(""+DtHelper.Increment_ID("tAgent"));
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Erreur de Chargement:\n" + e.getMessage(), "Agent Form Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jXTable1 = new org.jdesktop.swingx.JXTable();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtId = new org.jdesktop.swingx.JXTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNom = new org.jdesktop.swingx.JXTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPostnom = new org.jdesktop.swingx.JXTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPrenom = new org.jdesktop.swingx.JXTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtLieuNaiss = new org.jdesktop.swingx.JXTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtTel = new org.jdesktop.swingx.JXTextField();
        cmbSexe = new javax.swing.JComboBox<>();
        txtDate = new org.jdesktop.swingx.JXDatePicker();
        cmbEtatCivil = new javax.swing.JComboBox<>();
        cmbNiveau = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShadowColor(new java.awt.Color(0, 153, 255));
        dropShadowBorder1.setShadowOpacity(1.0F);
        setBorder(dropShadowBorder1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brain/img/agent_black.png"))); // NOI18N
        jLabel1.setText("Interface Agent");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brain/img/Ajout.png"))); // NOI18N
        jLabel2.setText("Ajouter un agent");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder2 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder2.setShadowColor(new java.awt.Color(0, 153, 204));
        dropShadowBorder2.setShadowOpacity(1.0F);
        jLabel2.setBorder(dropShadowBorder2);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brain/img/paiemnt.png"))); // NOI18N
        jLabel3.setText("Payer un agent");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder3 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder3.setShadowColor(new java.awt.Color(0, 153, 204));
        dropShadowBorder3.setShadowOpacity(1.0F);
        jLabel3.setBorder(dropShadowBorder3);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brain/img/payer.png"))); // NOI18N
        jLabel4.setText("Option Salaire");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder4 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder4.setShadowColor(new java.awt.Color(0, 153, 204));
        dropShadowBorder4.setShadowOpacity(1.0F);
        jLabel4.setBorder(dropShadowBorder4);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jXTable1.setColumnSelectionAllowed(true);
        jXTable1.setDragEnabled(true);
        jXTable1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jScrollPane1.setViewportView(jXTable1);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder5 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder5.setShadowColor(new java.awt.Color(0, 153, 204));
        dropShadowBorder5.setShadowOpacity(1.0F);
        dropShadowBorder5.setShowLeftShadow(true);
        dropShadowBorder5.setShowTopShadow(true);
        jPanel1.setBorder(dropShadowBorder5);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("ID");

        txtId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtId.setToolTipText("");
        txtId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtId.setName(""); // NOI18N
        txtId.setPrompt("");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Nom");

        txtNom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNom.setName(""); // NOI18N
        txtNom.setPrompt("Entrer le nom");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Postnom");

        txtPostnom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPostnom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPostnom.setName(""); // NOI18N
        txtPostnom.setPrompt("Entrer le postnom");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Prenom");

        txtPrenom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrenom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPrenom.setName(""); // NOI18N
        txtPrenom.setPrompt("Entrer le prenom");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Sexe");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Lieu Naiss.");

        txtLieuNaiss.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLieuNaiss.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtLieuNaiss.setName(""); // NOI18N
        txtLieuNaiss.setPrompt("Entrer le lieu de naissance");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Date Naiss.");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Etat Civil");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Piece identite");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Numero piece identite");

        txtTel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTel.setToolTipText("Entrer le numéro de la piece d'identite");
        txtTel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTel.setName(""); // NOI18N
        txtTel.setPrompt("Entrer le numéro de la piece d'identite");

        cmbSexe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbSexe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Homme", "Femme", "Non precisé" }));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder6 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder6.setShowRightShadow(false);
        cmbSexe.setBorder(dropShadowBorder6);

        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder7 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder7.setShowRightShadow(false);
        txtDate.setBorder(dropShadowBorder7);

        cmbEtatCivil.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbEtatCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Célibataire", "Marié(e)", "Divorcé(e)", "Veuf(ve)", "Non Precisé" }));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder8 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder8.setShowRightShadow(false);
        cmbEtatCivil.setBorder(dropShadowBorder8);

        cmbNiveau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbNiveau.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aucune", "Carte d'electeur", "Pasport", "Atestation", "Diplicatat", "Tenant lieu" }));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder9 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder9.setShowRightShadow(false);
        cmbNiveau.setBorder(dropShadowBorder9);
        cmbNiveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNiveauActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brain/img/ax.png"))); // NOI18N
        jLabel19.setText("Enregistrer");
        jLabel19.setToolTipText("Enregistrer");
        jLabel19.setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brain/img/ax2.png"))); // NOI18N
        jLabel18.setText("Supprimer");
        jLabel18.setToolTipText("Supprimer");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder10 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder10.setShowLeftShadow(true);
        dropShadowBorder10.setShowRightShadow(false);
        jLabel18.setBorder(dropShadowBorder10);
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbSexe, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPostnom, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbNiveau, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbEtatCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLieuNaiss, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(cmbEtatCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPostnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(cmbNiveau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmbSexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtLieuNaiss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        new frmPaiement().setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        new frmSalaire().setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        try 
        {
            agent = new ClsAgent();

            agent.setId(Integer.valueOf(txtId.getText()));
            agent.setNom(txtNom.getText());
            agent.setPostnom(txtPostnom.getText());
            agent.setPrenom(txtPrenom.getText());
            agent.setSexe(cmbSexe.getSelectedItem().toString());
            agent.setLieuNaissance(txtLieuNaiss.getText());
            agent.setDateNaissance(new Date(txtDate.getDate().getYear(), txtDate.getDate().getMonth(), txtDate.getDate().getDate()));
            agent.setEtatCivil(cmbEtatCivil.getSelectedItem().toString());
            agent.setNiveauEtude(cmbNiveau.getSelectedItem().toString());
            agent.setTel(txtTel.getText());
            agent.setEmail(txtEmail.getText());
            agent.setPoste(txtPoste.getText());
            if (agent.Update()) 
            {                
                JOptionPane.showMessageDialog(null, "Agent Enregistré", "Succès", JOptionPane.INFORMATION_MESSAGE);
                DtHelper.Load_TblData(jXTable1, "SELECT * FROM tAgent");
                txtId.setText(""+DtHelper.Increment_ID("tAgent"));
                DtHelper.TextClean(txtNom);
                DtHelper.TextClean(txtPostnom);
                DtHelper.TextClean(txtPrenom);
                DtHelper.TextClean(txtLieuNaiss);
                DtHelper.TextClean(txtTel);
                DtHelper.TextClean(txtEmail);
                DtHelper.TextClean(txtPoste);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Non enregistré");
            }
        }
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(null, "Erreur :\n"+ex.getMessage(), "Echec Saving Agent", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        try 
        {
            txtId.setText(""+DtHelper.Increment_ID("tAgent"));
            DtHelper.TextClean(txtNom);
            DtHelper.TextClean(txtPostnom);
            DtHelper.TextClean(txtPrenom);
            DtHelper.TextClean(txtLieuNaiss);
            DtHelper.TextClean(txtTel);
            DtHelper.TextClean(txtEmail);
            DtHelper.TextClean(txtPoste);
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Erreur de Chargement:\n" + e.getMessage(), "Agent Form Error", JOptionPane.WARNING_MESSAGE);
        }        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void cmbNiveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNiveauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNiveauActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbEtatCivil;
    private javax.swing.JComboBox<String> cmbNiveau;
    private javax.swing.JComboBox<String> cmbSexe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private org.jdesktop.swingx.JXTable jXTable1;
    private org.jdesktop.swingx.JXDatePicker txtDate;
    private org.jdesktop.swingx.JXTextField txtId;
    private org.jdesktop.swingx.JXTextField txtLieuNaiss;
    private org.jdesktop.swingx.JXTextField txtNom;
    private org.jdesktop.swingx.JXTextField txtPostnom;
    private org.jdesktop.swingx.JXTextField txtPrenom;
    private org.jdesktop.swingx.JXTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
