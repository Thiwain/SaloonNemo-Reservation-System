/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ruzzz.nemo.gui;

import com.ruzzz.nemo.model.LoggedUserData;
import com.ruzzz.nemo.model.Role;
import com.ruzzz.nemo.model.SaveData;
import static com.ruzzz.nemo.properties.ThemeManager.applyTheme;
import java.awt.Color;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import raven.toast.Notifications;

/**
 *
 * @author Acer
 */
public class ProgressToControlePanel extends javax.swing.JFrame {

    /**
     * Creates new form ProgressToControlePanel
     */
    public ProgressToControlePanel() {
        initComponents();
        this.setBackground(new Color(0, 0, 0, 0));

        ImageIcon icon = new ImageIcon(getClass().getResource("/com/ruzzz/nemo/img/scissors_icon.png"));
        this.setIconImage(icon.getImage());

        progress();
        applyTheme();
    }

    private void progress() {
        new Thread(() -> {
            for (int i = 0; i <= 100; i++) {
                jProgressBar1.setValue(i);

                jLabel1.setText(i + "%");

                switch (i) {
                    case 10:
                        jLabel3.setText("Loading...");
                        break;
                    case 20:
                        jLabel3.setText("Loading........");
                        break;
                    case 30:
                        jLabel3.setText("Loading...");
                        break;
                    case 40:
                        if (LoggedUserData.getUserRole().equals(Role.ADMIN.name())) {
                            Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.TOP_CENTER, "Please wait a while.....");
                            SaveData.SaveData();
                            jLabel3.setText("Loading Finantial Data........");
                        } else {
                            jLabel3.setText("Loading........");
                        }
                        break;
                    case 50:
                        jLabel3.setText("Loading...");
                        break;
                    case 60:
                        jLabel3.setText("Loading........");
                        break;
                    case 70:
                        jLabel3.setText("Loading...");
                        break;
                    case 80:
                        jLabel3.setText("Loading........");
                        break;
                    case 90:
                        jLabel3.setText("Loading...");
                        break;
                    case 100:
                        jLabel3.setText("Loading......");
                        break;
                    default:
                        break;
                }
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            this.dispose();
            new ControlPanel().setVisible(true);
        }).start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        background1 = new com.ruzzz.nemo.component.Background();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
                    .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        background1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel3});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        applyTheme();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgressToControlePanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.ruzzz.nemo.component.Background background1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
