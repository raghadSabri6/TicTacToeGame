/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tic_Tac_Toe_Game;

import static java.awt.Color.yellow;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Medium extends javax.swing.JFrame {
    
    private String startValue = "X";
    private int Xcount = 0;
    private int Ocount = 0;
    private int turn = 2;
    private int buttonUsed[] = {0,0,0,0,0,0,0,0,0};
    private int Xwon[] = {0,0,0,0,0,0,0,0,0};
    private int Owon[] = {0,0,0,0,0,0,0,0,0};
    private int RX = 0;
    private int RO = 0;
    private int RV = 1;

    private void Ochoise(int Oindex){
        if(turn%2==1){            
            switch(Oindex){
                case 0: 
                    b0.setText("O");
                    break;
                case 1: 
                    b1.setText("O");
                    break;
                case 2: 
                    b2.setText("O");
                    break;
                case 3: 
                    b3.setText("O");
                    break;    
                case 4: 
                    b4.setText("O");
                    break;
                case 5: 
                    b5.setText("O");
                    break;    
                case 6: 
                    b6.setText("O");
                    break;
                case 7: 
                    b7.setText("O");
                    break; 
                case 8: 
                    b8.setText("O");
                break;
                default:
                    break;
            }
            Ocount++;
            Owon[Oindex]=1;
            RO = Owinning();
            turn++;
            buttonUsed[Oindex]=1;
            gameScore();
            if(RO==1){
                JOptionPane.showMessageDialog(rootPane,"PLAYER O WINS");
                Restart();
            }
        }
    }

    
    
    private void OTurn(){
        int result = miniMax(3,false,true);
                
    }


    private void Restart(){
        
        Xcount = 0;
        Ocount = 0;
        turn = 2;
        for(int i=0 ; i<9 ; i++){
            buttonUsed[i] = 0;
            Xwon[i] = 0;
            Owon[i] = 0;        
        }
        RX = 0;
        RO = 0;
        this.setVisible(false);
        new Medium().setVisible(true);
        
    }
    private int checkXwinning(){
        if(Xwon[0]==1 && Xwon[3]==1 && Xwon[6]==1){
            return 1;
        }else if(Xwon[1]==1 && Xwon[4]==1 && Xwon[7]==1){
            return 1;
        }else if(Xwon[2]==1 && Xwon[5]==1 && Xwon[8]==1){
            return 1;
        }else if(Xwon[0]==1 && Xwon[1]==1 && Xwon[2]==1){
            return 1;
        }else if(Xwon[3]==1 && Xwon[4]==1 && Xwon[5]==1){
            return 1;
        }else if(Xwon[6]==1 && Xwon[7]==1 && Xwon[8]==1){
            return 1;
        }else if(Xwon[0]==1 && Xwon[4]==1 && Xwon[8]==1){
            return 1;
        }else if(Xwon[6]==1 && Xwon[4]==1 && Xwon[2]==1){
            return 1;
        }
        return 0;
    }
    private int checkOwinning(){
            if(Owon[0]==1 && Owon[3]==1 && Owon[6]==1){
            return 1;
        }else if(Owon[1]==1 && Owon[4]==1 && Owon[7]==1){
            return 1;
        }else if(Owon[2]==1 && Owon[5]==1 && Owon[8]==1){
            return 1;
        }else if(Owon[0]==1 && Owon[1]==1 && Owon[2]==1){
            return 1;
        }else if(Owon[3]==1 && Owon[4]==1 && Owon[5]==1){
            return 1;
        }else if(Owon[6]==1 && Owon[7]==1 && Owon[8]==1){
            return 1;
        }else if(Owon[0]==1 && Owon[4]==1 && Owon[8]==1){
            return 1;
        }else if(Owon[6]==1 && Owon[4]==1 && Owon[2]==1){
            return 1;
        }
        return 0;
    }
    
    
    private int Xwinning(){
        if(Xwon[0]==1 && Xwon[3]==1 && Xwon[6]==1){
            b0.setBackground(yellow);
            b3.setBackground(yellow);
            b6.setBackground(yellow);
            return 1;
        }else if(Xwon[1]==1 && Xwon[4]==1 && Xwon[7]==1){
            b1.setBackground(yellow);
            b4.setBackground(yellow);
            b7.setBackground(yellow);
            return 1;
        }else if(Xwon[2]==1 && Xwon[5]==1 && Xwon[8]==1){
            b2.setBackground(yellow);
            b5.setBackground(yellow);
            b8.setBackground(yellow);
            return 1;
        }else if(Xwon[0]==1 && Xwon[1]==1 && Xwon[2]==1){
            b0.setBackground(yellow);
            b1.setBackground(yellow);
            b2.setBackground(yellow);
            return 1;
        }else if(Xwon[3]==1 && Xwon[4]==1 && Xwon[5]==1){
            b3.setBackground(yellow);
            b4.setBackground(yellow);
            b5.setBackground(yellow);
            return 1;
        }else if(Xwon[6]==1 && Xwon[7]==1 && Xwon[8]==1){
            b6.setBackground(yellow);
            b7.setBackground(yellow);
            b8.setBackground(yellow);
            return 1;
        }else if(Xwon[0]==1 && Xwon[4]==1 && Xwon[8]==1){
            b0.setBackground(yellow);
            b4.setBackground(yellow);
            b8.setBackground(yellow);
            return 1;
        }else if(Xwon[6]==1 && Xwon[4]==1 && Xwon[2]==1){
            b6.setBackground(yellow);
            b4.setBackground(yellow);
            b2.setBackground(yellow);
            return 1;
        }
        return 0;
    }
    private int Owinning(){
            if(Owon[0]==1 && Owon[3]==1 && Owon[6]==1){
            b0.setBackground(yellow);
            b3.setBackground(yellow);
            b6.setBackground(yellow);
            return 1;
        }else if(Owon[1]==1 && Owon[4]==1 && Owon[7]==1){
            b1.setBackground(yellow);
            b4.setBackground(yellow);
            b7.setBackground(yellow);
            return 1;
        }else if(Owon[2]==1 && Owon[5]==1 && Owon[8]==1){
            b2.setBackground(yellow);
            b5.setBackground(yellow);
            b8.setBackground(yellow);
            return 1;
        }else if(Owon[0]==1 && Owon[1]==1 && Owon[2]==1){
            b0.setBackground(yellow);
            b1.setBackground(yellow);
            b2.setBackground(yellow);
            return 1;
        }else if(Owon[3]==1 && Owon[4]==1 && Owon[5]==1){
            b3.setBackground(yellow);
            b4.setBackground(yellow);
            b5.setBackground(yellow);
            return 1;
        }else if(Owon[6]==1 && Owon[7]==1 && Owon[8]==1){
            b6.setBackground(yellow);
            b7.setBackground(yellow);
            b8.setBackground(yellow);
            return 1;
        }else if(Owon[0]==1 && Owon[4]==1 && Owon[8]==1){
            b0.setBackground(yellow);
            b4.setBackground(yellow);
            b8.setBackground(yellow);
            return 1;
        }else if(Owon[6]==1 && Owon[4]==1 && Owon[2]==1){
            b6.setBackground(yellow);
            b4.setBackground(yellow);
            b2.setBackground(yellow);
            return 1;
        }
        return 0;
    }

    /**
     * Creates new form NewJFrame
     */
    public Medium() {
        initComponents();
    }
    private void gameScore(){
        Xc.setText(String.valueOf(Xcount));
        Oc.setText(String.valueOf(Ocount));
        if(Xcount+Ocount==9 && RX!=1 && RO!=1){
            JOptionPane.showMessageDialog(rootPane,"TIE NO WINS");
            Restart();
        }
    }
    private int ResaltValue(){
        RX = checkXwinning();
        RO = checkOwinning();
        if(Xcount+Ocount==9 && RX!=1 && RO!=1){
            RV = 0;
        }else if(checkOwinning()==1){
            RV = -2;
        }else if(checkXwinning()==1){
            RV = 2;
        }else
            RV = 1;
        return RV;
    }
    private int miniMax(int depth ,boolean isMaximizing , boolean firstTime){
        int result = ResaltValue();
        if(result != 1 || depth == 0)
            return result;
        if(isMaximizing){
            int finalScore = -1000;
            for(int i=0 ; i<9 ; i++){
                if(buttonUsed[i]==0){
                    buttonUsed[i] = 1;
                    Xcount++;
                    Xwon[i]=1;
                    turn++;                    
                    int score = miniMax(depth-1 , false , false);
                    buttonUsed[i] = 0;
                    Xcount--;
                    Xwon[i]=0;
                    turn--;
                    if(score > finalScore)
                        finalScore =score;
                }
                    
            }
            return finalScore;
        }else {
            int finalScore = 1000;
            int finalI = 0;
            for(int i=0 ; i<9 ; i++){
                if(buttonUsed[i]==0){
                    buttonUsed[i] = 1;
                    Ocount++;
                    Owon[i]=1;
                    turn++;                    
                    int score = miniMax(depth-1 , true , false);
                    buttonUsed[i] = 0;
                    Ocount--;
                    Owon[i]=0;
                    turn--;
                    if(score < finalScore){
                        finalScore =score;
                        finalI =i;
                    }
                    
                }
                    
            }
            if(firstTime){
                Ochoise(finalI);
                        
            }
            return finalScore;
        }
        
        
    }

    private void choose_A_Player(){
        if(startValue.equalsIgnoreCase("X"))
            startValue ="O";
        else
            startValue ="X";
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Xc = new javax.swing.JLabel();
        Oc = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(255, 153, 255));
        jButton1.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        jButton1.setText("restart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        b0.setBackground(new java.awt.Color(255, 153, 255));
        b0.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(255, 153, 255));
        b3.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(255, 153, 255));
        b6.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(255, 153, 255));
        b1.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(255, 153, 255));
        b4.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(255, 153, 255));
        b7.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(255, 153, 255));
        b2.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(255, 153, 255));
        b5.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(255, 153, 255));
        b8.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 153));
        jLabel2.setText("Medium level");

        jButton11.setBackground(new java.awt.Color(255, 153, 255));
        jButton11.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        jButton11.setText("exit");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        jLabel1.setText(" player X :");

        Xc.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        Xc.setForeground(new java.awt.Color(204, 0, 102));

        Oc.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        Oc.setForeground(new java.awt.Color(204, 0, 102));

        jLabel5.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        jLabel5.setText("Payer O :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(b0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Xc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Oc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(72, 72, 72))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                        .addComponent(Xc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Oc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton11))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        // TODO add your handling code here:
        if(buttonUsed[0]==0){
            if(turn%2==0){
                b0.setText("X");
                Xcount++;
                Xwon[0]=1;
                RX = Xwinning();
                turn++;
                buttonUsed[0]=1;
                gameScore();
                if(RX==1){
                   JOptionPane.showMessageDialog(rootPane,"PLAYER X WINS");
                   Restart();
                } 
                OTurn();
                         
            }
                
        }else{
            JOptionPane.showMessageDialog(rootPane,"THIS BUTTON HAS ALREADY USED");
        }
        
    }//GEN-LAST:event_b0ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        if(buttonUsed[3]==0){
            if(turn%2==0){
                b3.setText("X");
                Xcount++;
                Xwon[3]=1;
                RX = Xwinning();
                turn++;
                buttonUsed[3]=1;
                gameScore();
                if(RX==1){
                   JOptionPane.showMessageDialog(rootPane,"PLAYER X WINS");
                   Restart();
                } 
                OTurn();
                         
            }
                
        }else{
            JOptionPane.showMessageDialog(rootPane,"THIS BUTTON HAS ALREADY USED");
        }
        
    }//GEN-LAST:event_b3ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
        if(buttonUsed[6]==0){
            if(turn%2==0){
                b6.setText("X");
                Xcount++;
                Xwon[6]=1;
                RX = Xwinning();
                turn++;
                buttonUsed[6]=1;
                gameScore();
                if(RX==1){
                   JOptionPane.showMessageDialog(rootPane,"PLAYER X WINS");
                   Restart();
                } 
                OTurn();
                         
            }
                
        }else{
            JOptionPane.showMessageDialog(rootPane,"THIS BUTTON HAS ALREADY USED");
        }
    }//GEN-LAST:event_b6ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        if(buttonUsed[1]==0){
            if(turn%2==0){
                b1.setText("X");
                Xcount++;
                Xwon[1]=1;
                RX = Xwinning();
                turn++;
                buttonUsed[1]=1;
                gameScore();
                if(RX==1){
                   JOptionPane.showMessageDialog(rootPane,"PLAYER X WINS");
                   Restart();
                } 
                OTurn();
                         
            }
                
        }else{
            JOptionPane.showMessageDialog(rootPane,"THIS BUTTON HAS ALREADY USED");
        }
        
    }//GEN-LAST:event_b1ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
        if(buttonUsed[4]==0){
            if(turn%2==0){
                b4.setText("X");
                Xcount++;
                Xwon[4]=1;
                RX = Xwinning();
                turn++;
                buttonUsed[4]=1;
                gameScore();
                if(RX==1){
                   JOptionPane.showMessageDialog(rootPane,"PLAYER X WINS");
                   Restart();
                } 
                OTurn();
                         
            }
                
        }else{
            JOptionPane.showMessageDialog(rootPane,"THIS BUTTON HAS ALREADY USED");
        }
        
    }//GEN-LAST:event_b4ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
        if(buttonUsed[7]==0){
            if(turn%2==0){
                b7.setText("X");
                Xcount++;
                Xwon[7]=1;
                RX = Xwinning();
                turn++;
                buttonUsed[7]=1;
                gameScore();
                if(RX==1){
                   JOptionPane.showMessageDialog(rootPane,"PLAYER X WINS");
                   Restart();
                } 
                OTurn();
                         
            }
                
        }else{
            JOptionPane.showMessageDialog(rootPane,"THIS BUTTON HAS ALREADY USED");
        }
        
    }//GEN-LAST:event_b7ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        if(buttonUsed[2]==0){
            if(turn%2==0){
                b2.setText("X");
                Xcount++;
                Xwon[2]=1;
                RX = Xwinning();
                turn++;
                buttonUsed[2]=1;
                gameScore();
                if(RX==1){
                   JOptionPane.showMessageDialog(rootPane,"PLAYER X WINS");
                   Restart();
                } 
                OTurn();
                         
            }
                
        }else{
            JOptionPane.showMessageDialog(rootPane,"THIS BUTTON HAS ALREADY USED");
        }
        
    }//GEN-LAST:event_b2ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
        if(buttonUsed[5]==0){
            if(turn%2==0){
                b5.setText("X");
                Xcount++;
                Xwon[5]=1;
                RX = Xwinning();
                turn++;
                buttonUsed[5]=1;
                gameScore();
                if(RX==1){
                   JOptionPane.showMessageDialog(rootPane,"PLAYER X WINS");
                   Restart();
                } 
                OTurn();
                         
            }
                
        }else{
            JOptionPane.showMessageDialog(rootPane,"THIS BUTTON HAS ALREADY USED");
        }
    }//GEN-LAST:event_b5ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
        if(buttonUsed[8]==0){
            if(turn%2==0){
                b8.setText("X");
                Xcount++;
                Xwon[8]=1;
                RX = Xwinning();
                turn++;
                buttonUsed[8]=1;
                gameScore();
                if(RX==1){
                   JOptionPane.showMessageDialog(rootPane,"PLAYER X WINS");
                   Restart();
                } 
                OTurn();
                         
            }
                
        }else{
            JOptionPane.showMessageDialog(rootPane,"THIS BUTTON HAS ALREADY USED");
        }
    }//GEN-LAST:event_b8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Restart();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(rootPane, "Are you sure?", "WARNING",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            new Home().setVisible(true);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(Medium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Medium().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Oc;
    private javax.swing.JLabel Xc;
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
