/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Alina
 */
public class Main extends javax.swing.JFrame {

    
    Trilink Tree;
    Node myTree;
    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        
        
        Tree = new Trilink();
        myTree = new Node();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtShow = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jlblOut = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtareaSort = new javax.swing.JTextArea();
        jtxtFind = new javax.swing.JTextField();
        jbtnSearch = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        InActive = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Open .txt File");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jtxtShow.setColumns(20);
        jtxtShow.setRows(5);
        jScrollPane1.setViewportView(jtxtShow);

        jButton2.setText("Sort and Count");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jlblOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblOut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jlblOut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jtxtareaSort.setColumns(20);
        jtxtareaSort.setLineWrap(true);
        jtxtareaSort.setRows(5);
        jScrollPane2.setViewportView(jtxtareaSort);

        jbtnSearch.setText("Search");
        jbtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSearchActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        InActive.setColumns(20);
        InActive.setLineWrap(true);
        InActive.setRows(5);
        InActive.setWrapStyleWord(true);
        jScrollPane3.setViewportView(InActive);

        jLabel1.setText("Inactive Nodes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jlblOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jButton2))
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtxtFind, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbtnSearch)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton3))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(39, 39, 39)))))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jlblOut, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jtxtFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnSearch)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        jbtnSearch.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        //open and read file
        //error message is needed
        StringBuilder buffer = new StringBuilder();
        JFileChooser fc = new JFileChooser();
        fc.setFileFilter(new FileNameExtensionFilter("Text Document (*.txt)", new String[] { "txt" }));
        int result = fc.showOpenDialog(this);
        if (result == 0)
        {
          File file = fc.getSelectedFile();
          try
          {
            FileReader reader = new FileReader(file);
            for (int i = reader.read(); i != -1; i = reader.read())
            {
              char ch = (char)i;
              buffer.append(ch);
            }
            //Gather numbers for integers
            //Remove white spaces, uppercase, letters
            //Split
            String what = buffer.toString().trim();
            String str = what;
            
            str = str.replace("\n", " ");
            str = str.replaceAll("[^0-9 ]", "");
            str = str.replaceAll("  "," ");
            str = str.trim();
                        
            this.jtxtShow.setText(str);
            this.jlblOut.setText("");
          }
          catch (FileNotFoundException ex)
          {
            this.jlblOut.setText("File Not Found!!!");
          }
          catch (IOException ex)
          {
            this.jlblOut.setText("Read Error!!!");
          }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                
        Tree = new Trilink();
        String numbers = jtxtShow.getText();
        //Check str
        //Display error message
        if (numbers.isEmpty())
        {
            jlblOut.setText("Select a File or Insert Integers");
        }
        //continue               
        //String Array to int Array
        String[] word = numbers.split(" ");              
                
        int[] data = new int[word.length];
        for(int n = 0; n < word.length; n++)
        {
            String item = word[n];
            data[n] = Integer.parseInt(item); 
            //Tree.insert(data[n]);            
        }
        
        int j = data.length;
        for(int i = 0; i < j; i ++)
        {            
            Tree.insert(data[i]);
        }
        //Test Data
        /*
        Tree.insert(15);
        Tree.insert(12);
        Tree.insert(11);
        Tree.insert(15);
        */
        
        //Display output
        String output = Tree.print();
        jtxtareaSort.setText(output);
       
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSearchActionPerformed
        // TODO add your handling code here:
        //will search? then not find active values?
        //Search tree
        String Find = jtxtFind.getText();
        if (Find.isEmpty())
        {
            jlblOut.setText("Enter an Integer to Search");
        }
        int iFind = Integer.parseInt(Find);
        ;
        if(Tree.delete(iFind) == false && Tree.find(iFind)== true)
        {
            jlblOut.setText(Find + " was found");
        }
        else
        {
            jlblOut.setText(Find +" was not found");
        }
        
    }//GEN-LAST:event_jbtnSearchActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //will continue to delete inactive values???
        //Delete int from tree
        String out = InActive.getText();
        String Find = jtxtFind.getText();
        if (Find.isEmpty())
        {
            jlblOut.setText("Enter an Integer to Delete");
        }
        
        int iFind = Integer.parseInt(Find);
        if(Tree.delete(iFind) == true && Tree.find(iFind)== true)
        {
            jlblOut.setText(iFind + " was 'deleted'");    
            out = out + iFind + "; ";
            InActive.setText(out);
        }
        if(Tree.delete(iFind)== false)
        {
            jlblOut.setText(Find +" was not found");
        }       
                
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea InActive;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbtnSearch;
    private javax.swing.JLabel jlblOut;
    private javax.swing.JTextField jtxtFind;
    private javax.swing.JTextArea jtxtShow;
    private javax.swing.JTextArea jtxtareaSort;
    // End of variables declaration//GEN-END:variables
}
