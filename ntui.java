package numbertricks;

import javax.swing.JOptionPane;

class ntui extends javax.swing.JFrame {

    /** Creates new form ntui */
    public ntui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    thinking = new javax.swing.JLabel();
    analysislabel = new javax.swing.JLabel();
    tabs = new javax.swing.JTabbedPane();
    jPanel1 = new javax.swing.JPanel();
    number = new javax.swing.JScrollPane();
    numresult = new javax.swing.JTextArea();
    factorial = new javax.swing.JCheckBox();
    input = new javax.swing.JTextField();
    go = new javax.swing.JButton();
    jPanel2 = new javax.swing.JPanel();
    stats = new javax.swing.JScrollPane();
    statresult = new javax.swing.JTextArea();
    statinput = new javax.swing.JTextField();
    statgo = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Numbertricks v0.3");
    setLocationByPlatform(true);
    setMinimumSize(new java.awt.Dimension(430, 380));

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18));
    jLabel1.setText("Numbertricks");

    jLabel2.setText("v0.3");

    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel3.setText("© J. Henson 2011");
    jLabel3.setEnabled(false);

    thinking.setFont(new java.awt.Font("Tahoma", 1, 12));
    thinking.setEnabled(false);

    analysislabel.setFont(new java.awt.Font("Tahoma", 1, 11));
    analysislabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

    numresult.setColumns(20);
    numresult.setEditable(false);
    numresult.setLineWrap(true);
    numresult.setRows(5);
    numresult.setWrapStyleWord(true);
    number.setViewportView(numresult);

    factorial.setText("Factorial?");

    go.setText("Analyse!");
    go.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        goActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(factorial)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(input, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(go)
        .addContainerGap())
      .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(number, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(factorial)
          .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(go))
        .addContainerGap(229, Short.MAX_VALUE))
      .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
          .addContainerGap(29, Short.MAX_VALUE)
          .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
    );

    tabs.addTab("Number", jPanel1);

    statresult.setColumns(20);
    statresult.setLineWrap(true);
    statresult.setRows(5);
    statresult.setText("Please separate the numbers in your sample by a comma (e.g. to use 2, 3 and 4, type 2,3,4)");
    statresult.setWrapStyleWord(true);
    stats.setViewportView(statresult);

    statgo.setText("Analyse!");
    statgo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        statgoActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        .addComponent(statinput, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(statgo)
        .addContainerGap())
      .addComponent(stats, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(statinput, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(statgo))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(stats, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
    );

    tabs.addTab("Statistics", jPanel2);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(thinking)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
            .addComponent(analysislabel, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 287, Short.MAX_VALUE)
            .addComponent(jLabel3)
            .addGap(11, 11, 11))))
      .addComponent(tabs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(322, 322, 322)
        .addComponent(thinking))
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel1)
            .addComponent(jLabel2))
          .addComponent(analysislabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel3))
    );

    tabs.getAccessibleContext().setAccessibleName("number");

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void goActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goActionPerformed
      Numbertricks find = new Numbertricks();
      String in = input.getText();

      try {
        int test = Integer.parseInt(in);
      } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null,"The value you entered is not an integer. Please enter a positive integer.","Error!",JOptionPane.ERROR_MESSAGE);
        input.setText("");
      } catch (NegativeArraySizeException e) {
        JOptionPane.showMessageDialog(null,"The number you entered is negative. Please enter a positive integer.","Error!",JOptionPane.ERROR_MESSAGE);
        input.setText("");
      }

      boolean gofact = false;
      if(factorial.isSelected()) gofact=true;

      analysislabel.setText("Analysis of the number " + Integer.parseInt(input.getText()) + "... ");

      thinking.setText("Thinking...");
      String numstats = find.go(in, gofact);
      thinking.setText("");
      numresult.setText(numstats);
    }//GEN-LAST:event_goActionPerformed

private void statgoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statgoActionPerformed
      Statistics sfind = new Statistics();
      String in = statinput.getText();

      analysislabel.setText("Analysis of the numbers " + in + "... ");

      thinking.setText("Thinking...");
      String stats = sfind.go(in);
      thinking.setText("");
      statresult.setText(stats);
}//GEN-LAST:event_statgoActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
      ntui program = new ntui();
      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ntui().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel analysislabel;
  private javax.swing.JCheckBox factorial;
  private javax.swing.JButton go;
  private javax.swing.JTextField input;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JScrollPane number;
  private javax.swing.JTextArea numresult;
  private javax.swing.JButton statgo;
  private javax.swing.JTextField statinput;
  private javax.swing.JTextArea statresult;
  private javax.swing.JScrollPane stats;
  private javax.swing.JTabbedPane tabs;
  private javax.swing.JLabel thinking;
  // End of variables declaration//GEN-END:variables

}
