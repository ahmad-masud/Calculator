
import java.awt.Image;
import javax.imageio.ImageIO;

public class MainFrame extends javax.swing.JFrame {

    private Double num1;
    private Double num2;
    private String operater;
    private Boolean operation=false;
    
    public MainFrame() {
        initComponents();
        
        try {
            Image i = ImageIO.read(getClass().getResource("icon.png"));
            setIconImage(i);
        } catch (Exception e) {}
    }
    
    public Boolean isDouble(Double num) {
        String temp = String.valueOf(num);
        int decimalIndex=0;
        for (int i=0; i<temp.length(); i++) {
            if (temp.substring(i, i+1).equals(".")) {
                decimalIndex=i;
            }
        }
        for (int i=decimalIndex+1; i<temp.length(); i++) {
            if (temp.substring(i, i+1).equals("0")==false) {
                return true;
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textArea = new javax.swing.JTextField();
        buttonClear = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button1 = new javax.swing.JButton();
        button0 = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonDecimal = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        buttonDivide = new javax.swing.JButton();
        ButtonMultiply = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        buttonPercentage = new javax.swing.JButton();
        buttonEqual = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();
        buttonSubtract = new javax.swing.JButton();
        textArea2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setMaximumSize(new java.awt.Dimension(286, 426));
        setPreferredSize(new java.awt.Dimension(300, 475));
        setResizable(false);
        setSize(new java.awt.Dimension(286, 426));

        textArea.setEditable(false);
        textArea.setBackground(new java.awt.Color(214, 217, 223));
        textArea.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        textArea.setBorder(null);
        textArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAreaActionPerformed(evt);
            }
        });

        buttonClear.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        buttonClear.setForeground(new java.awt.Color(0, 100, 255));
        buttonClear.setText("CE");
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });

        button7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        button7.setText("7");
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        button4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        button4.setText("4");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        button1.setText("1");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button0.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        button0.setText("0");
        button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button0ActionPerformed(evt);
            }
        });

        buttonDelete.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        buttonDelete.setForeground(new java.awt.Color(0, 100, 255));
        buttonDelete.setText("del");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        buttonDecimal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        buttonDecimal.setText(".");
        buttonDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDecimalActionPerformed(evt);
            }
        });

        button2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        button2.setText("2");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        button5.setText("5");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        button8.setText("8");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        buttonDivide.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        buttonDivide.setForeground(new java.awt.Color(0, 100, 255));
        buttonDivide.setText("÷");
        buttonDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDivideActionPerformed(evt);
            }
        });

        ButtonMultiply.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ButtonMultiply.setForeground(new java.awt.Color(0, 100, 255));
        ButtonMultiply.setText("×");
        ButtonMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMultiplyActionPerformed(evt);
            }
        });

        button3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        button3.setText("3");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        button6.setText("6");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        button9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        button9.setText("9");
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        buttonPercentage.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        buttonPercentage.setForeground(new java.awt.Color(0, 100, 255));
        buttonPercentage.setText("%");
        buttonPercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPercentageActionPerformed(evt);
            }
        });

        buttonEqual.setBackground(new java.awt.Color(0, 100, 255));
        buttonEqual.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        buttonEqual.setForeground(new java.awt.Color(255, 255, 255));
        buttonEqual.setText("=");
        buttonEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEqualActionPerformed(evt);
            }
        });

        buttonAdd.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        buttonAdd.setForeground(new java.awt.Color(0, 100, 255));
        buttonAdd.setText("+");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        buttonSubtract.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        buttonSubtract.setForeground(new java.awt.Color(0, 100, 255));
        buttonSubtract.setText("-");
        buttonSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubtractActionPerformed(evt);
            }
        });

        textArea2.setEditable(false);
        textArea2.setBackground(new java.awt.Color(214, 217, 223));
        textArea2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textArea2.setBorder(null);
        textArea2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textArea)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(button0, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(buttonDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonEqual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(146, 146, 146)
                                .addComponent(ButtonMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(140, 140, 140)
                                        .addComponent(buttonPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonSubtract, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(textArea2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textArea, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(buttonClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonPercentage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonMultiply, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(button4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(button6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonSubtract, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(button0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonDecimal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        if (operation) {
            textArea.setText("");
            textArea2.setText("");
            operation=false;
        }
        textArea.setText("");
    }//GEN-LAST:event_buttonClearActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        if (operation) {
            textArea.setText("");
            textArea2.setText("");
            operation=false;
        }
        String text = textArea.getText();
        if (text.length()==1) {
            textArea.setText("");
        } else if (text.length()>1) {
            text = text.substring(0, text.length()-1);
            textArea.setText(text);
        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        if (operation) {
            textArea.setText("");
            textArea2.setText("");
            operation=false;
        }
        String text = textArea.getText();
        text = text + "7";
        textArea.setText(text);
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        if (operation) {
            textArea.setText("");
            textArea2.setText("");
            operation=false;
        }
        
        String text = textArea.getText();
        text = text + "8";
        textArea.setText(text);
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        if (operation) {
            textArea.setText("");
            textArea2.setText("");
            operation=false;
        }        
        String text = textArea.getText();
        text = text + "9";
        textArea.setText(text);
    }//GEN-LAST:event_button9ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        if (operation) {
            textArea.setText("");
            textArea2.setText("");
            operation=false;
        }        
        String text = textArea.getText();
        text = text + "4";
        textArea.setText(text);
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        if (operation) {
            textArea.setText("");
            textArea2.setText("");
            operation=false;
        }        
        String text = textArea.getText();
        text = text + "5";
        textArea.setText(text);
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        if (operation) {
            textArea.setText("");
            textArea2.setText("");
            operation=false;
        }        
        String text = textArea.getText();
        text = text + "6";
        textArea.setText(text);
    }//GEN-LAST:event_button6ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        if (operation) {
            textArea.setText("");
            textArea2.setText("");
            operation=false;
        }        
        String text = textArea.getText();
        text = text + "1";
        textArea.setText(text);
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        if (operation) {
            textArea.setText("");
            textArea2.setText("");
            operation=false;
        }        
        String text = textArea.getText();
        text = text + "2";
        textArea.setText(text);
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        if (operation) {
            textArea.setText("");
            textArea2.setText("");
            operation=false;
        }        
        String text = textArea.getText();
        text = text + "3";
        textArea.setText(text);
    }//GEN-LAST:event_button3ActionPerformed

    private void button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button0ActionPerformed
        if (operation) {
            textArea.setText("");
            textArea2.setText("");
            operation=false;
        }        
        String text = textArea.getText();
        text = text + "0";
        textArea.setText(text);
    }//GEN-LAST:event_button0ActionPerformed

    private void buttonDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDecimalActionPerformed
        if (operation) {
            textArea.setText("");
            textArea2.setText("");
            operation=false;
        }        
        String text = textArea.getText();
        text = text + ".";
        textArea.setText(text);
    }//GEN-LAST:event_buttonDecimalActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        if (operation) {
            textArea.setText("");
            textArea2.setText("");
            operation=false;
        }        
        String text = textArea.getText();
        if (text.equals("")==false) {
            num1 = Double.parseDouble(text);
            operater = "+";
            textArea.setText("");
            textArea2.setText(text+operater);
        }
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonSubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubtractActionPerformed
        if (operation) {
            textArea.setText("");
            textArea2.setText("");
            operation=false;
        }        
        String text = textArea.getText();
        if (text.equals("")==false) {
            num1 = Double.parseDouble(text);
            operater = "-";
            textArea.setText("");
            textArea2.setText(text+operater);
        }
    }//GEN-LAST:event_buttonSubtractActionPerformed

    private void ButtonMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMultiplyActionPerformed
        if (operation) {
            textArea.setText("");
            textArea2.setText("");
            operation=false;
        }        
        String text = textArea.getText();
        if (text.equals("")==false) {
            num1 = Double.parseDouble(text);
            operater = "×";
            textArea.setText("");
            textArea2.setText(text+operater);
        }
    }//GEN-LAST:event_ButtonMultiplyActionPerformed

    private void buttonEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEqualActionPerformed
        String text = textArea.getText();
        String text2 = textArea2.getText();
        if (num1!=null) {
            num2 = Double.parseDouble(text);
            textArea2.setText(text2+text);
            if (operater.equals("+")) {
                if (isDouble(num1+num2)) {
                    textArea.setText(String.valueOf(Math.round((num1+num2) * 10000000000000d) / 10000000000000d));
                } else {
                    textArea.setText(String.valueOf((int)(num1+num2)));
                }
            } else if (operater.equals("-")) {
                if (isDouble(num1-num2)) {
                    textArea.setText(String.valueOf(Math.round((num1-num2) * 10000000000000d) / 10000000000000d));
                } else {
                    textArea.setText(String.valueOf((int)(num1-num2)));
                }
            } else if (operater.equals("×")) {
                if (isDouble(num1*num2)) {
                    textArea.setText(String.valueOf(Math.round((num1*num2) * 10000000000000d) / 10000000000000d));
                } else {
                    textArea.setText(String.valueOf((int)(num1*num2)));
                }
            } else if (operater.equals("÷")) {
                if (isDouble(num1/num2)) {
                    textArea.setText(String.valueOf(Math.round((num1/num2) * 10000000000000d) / 10000000000000d));
                } else {
                    textArea.setText(String.valueOf((int)(num1/num2)));
                }
            } else if (operater.equals("%")) {
                if (isDouble((num1/100)*num2)) {
                    textArea.setText(String.valueOf((num1/100)*num2));
                } else {
                    textArea.setText(String.valueOf((int)((num1/100)*num2)));
                }
            }
            operation=true;
            num1=null;
            num2=null;
            operater="";
        }
    }//GEN-LAST:event_buttonEqualActionPerformed

    private void buttonDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDivideActionPerformed
        if (operation) {
            textArea.setText("");
            textArea2.setText("");
            operation=false;
        }        
        String text = textArea.getText();
        if (text.equals("")==false) {
            num1 = Double.parseDouble(text);
            operater = "÷";
            textArea.setText("");
            textArea2.setText(text+operater);
        }
    }//GEN-LAST:event_buttonDivideActionPerformed

    private void textAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAreaActionPerformed

    private void buttonPercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPercentageActionPerformed
        if (operation) {
            textArea.setText("");
            textArea2.setText("");
            operation=false;
        }        
        String text = textArea.getText();
        if (text.equals("")==false) {
            num1 = Double.parseDouble(text);
            operater = "%";
            textArea.setText("");
            textArea2.setText(text+operater);
        }
    }//GEN-LAST:event_buttonPercentageActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonMultiply;
    private javax.swing.JButton button0;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonDecimal;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonDivide;
    private javax.swing.JButton buttonEqual;
    private javax.swing.JButton buttonPercentage;
    private javax.swing.JButton buttonSubtract;
    private javax.swing.JTextField textArea;
    private javax.swing.JTextField textArea2;
    // End of variables declaration//GEN-END:variables
}
