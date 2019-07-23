/* file name    : {name}
 * authors      : Adrian Głąbik adrian@edenland.pl
 * created      : {date}
 * copyright    : MIT
 * version      : 0.1
 */
package suwakbeans;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class SuwakBeans extends JFrame{

        private Okno okno;
    
    public SuwakBeans(){
        super("Programowanie komponentowe");
        this.setPreferredSize(new Dimension(500,270));
        this.setSize(this.getPreferredSize() );
        this.okno = new Okno();
        this.add(this.okno);
        this.setVisible(true);
        this.addWindowStateListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }    


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                SuwakBeans suwakBeans = new SuwakBeans();
            }
        });
    }
}
