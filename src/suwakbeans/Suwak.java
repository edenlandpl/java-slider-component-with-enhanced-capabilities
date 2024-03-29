/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suwakbeans;

import static java.awt.Adjustable.VERTICAL;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.beans.PropertyChangeEvent;
import java.io.Serializable;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;

/**
 *
 * @author Adrian
 */
public class Suwak extends JComponent implements Serializable {

    private int minSuwak, maxSuwak, ustawSuwak;
    JSlider slider = new JSlider(0, 255);
    private JPanel sliderPanel;
    private JLabel integerlbl;
    private JTextField textField;
    private ChangeListener listener;
    private int value = 0;

    /**
     * Creates new form Suwak
     */
    public Suwak() {

        sliderPanel = new JPanel();
        sliderPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
//listens for slider
        listener = new ChangeListener() {
            public void stateChanged(ChangeEvent event) {
//update text field when the slider value changes
                JSlider source = (JSlider) event.getSource();
                if (source.getValueIsAdjusting()) {
                    int fps = (int) source.getValue();
                }
                integerlbl.setText("" + source.getValue());
            }
        };
//add a filled slider
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.putClientProperty("JSlider.isFilled", Boolean.TRUE);
        addSlider(slider, "Filled");

//add the text field that displays the slider value
        integerlbl = new JLabel();
        textField = new JTextField(5);
//Container contentPane = getContentPane();
//contentPane.add(sliderPanel, BorderLayout.CENTER);
//contentPane.add(textField);
//contentPane.add(integerlbl, BorderLayout.SOUTH);
//}//close constructor

        initComponents();
        jSlider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent ce) {
                System.out.println(((JSlider) ce.getSource()).getValue()); // wyświetlanie wskazania Slidera
            }
        });
    }

    public int setMin(int minSuwakUstaw) {
        System.out.println("MINSuwak " + minSuwakUstaw + " " + minSuwak);
        minSuwak = minSuwakUstaw;
        //ustawMin();
        System.out.println("MINSuwak " + minSuwakUstaw + " " + minSuwak);
        return minSuwak;
    }

    public int setMax(int minSuwakUstaw) {
        System.out.println("MAXSuwak " + minSuwakUstaw);
        maxSuwak = minSuwakUstaw;
        //ustawMax();
        return minSuwak;
    }

    private void ustawMax() {
        jSlider1.setMaximum(maxSuwak);

        zmianaSuwaka();
    }

    private void ustawMin() {
        jSlider1.setMinimum(minSuwak);
        System.out.println("MINSuwak w ustawMin" + minSuwak);
        zmianaSuwaka();
    }

    public void zmianaSuwaka() {
        Icon icon = new ImageIcon("heart.png");
        UIDefaults defaults = UIManager.getDefaults();
        defaults.put("Slider.horizontalThumbIcon", icon);
        defaults.put("Slider.verticalThumbIcon", icon);
        defaults.put("Slider.thumbHeight", 25); //
        defaults.put("Slider.thumbWidth", 35); // change width
        //Slider.putClientProperty( "Slider.paintThumbArrowShape", Boolean.FALSE );
        //Slider.putClientProperty( "Slider.horizontalThumbIcon", icon );
        System.out.println("MIejsce 01");
        repaintSuwak();
    }

    public void repaintSuwak() {
        //jSlider1.repaint();
        System.out.println("MIejsce 02");
        initComponents();
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jButton1 = new javax.swing.JButton();

        jSlider1.setMajorTickSpacing(10);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);
        jSlider1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSlider1.setName("Slider Komponent"); // NOI18N
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        jSlider1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jSlider1MouseMoved(evt);
            }
        });
        jSlider1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSlider1MouseClicked(evt);
            }
        });
        jSlider1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jSlider1PropertyChange(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //jSlider1.setMaximum(120);
        ustawMin();
//        ustawMax();
        jSlider1.setMaximum(minSuwak);
        System.out.println("MINSuwak w Button " + minSuwak);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jSlider1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider1MouseClicked
//        // TODO add your handling code here:
//        jSlider1.setMaximum(maxSuwak);
//        System.out.println("Max " + maxSuwak);
//        jSlider1.setMinimum(minSuwak);
//        System.out.println("Min " + minSuwak);
        ustawMin();
    }//GEN-LAST:event_jSlider1MouseClicked

    private void jSlider1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jSlider1PropertyChange
        //jSlider1.setMaximum(140);
    }//GEN-LAST:event_jSlider1PropertyChange

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        // TODO add your handling code here:
        //jSlider1.setMaximum(160);
    }//GEN-LAST:event_jSlider1StateChanged

    private void jSlider1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider1MouseMoved
//        jSlider1.setMaximum(maxSuwak);
//        System.out.println("Max " + maxSuwak);
//        jSlider1.setMinimum(minSuwak);
//        System.out.println("Min " + minSuwak);
        ustawMin();
    }//GEN-LAST:event_jSlider1MouseMoved
    public void changeUpdate(DocumentEvent e) {
    }

    public void insertUpdate(DocumentEvent e) {
        updateSlider();
    }

    public void removeUpdate(DocumentEvent e) {
        updateSlider();
    }

    private void updateSlider() {
        int val = 0;
        try {
            val = Integer.parseInt(textField.getText());
        } catch (NumberFormatException e) {
        }
        slider.setValue(val);
    }
//public void propertyChange(PropertyChangeEvent e)
//{
//    if (textField.equals(e.getPropertyName()))
//{
//    Number value = (Number)e.getNewValue();
//if (slider != null && value != null)
//{
//   slider.setValue(value.intValue());
//}
//}
//}

    public void addSlider(JSlider s, String description) {
        s.addChangeListener(listener);
        JPanel panel = new JPanel();
        panel.add(s);
        panel.add(new JLabel(description));
        sliderPanel.add(panel);
    }

    public void setValue(int val) {
        value = val;
    }

    public int getValue() {
        return value;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    public javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}
