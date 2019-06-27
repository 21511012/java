
package javaapplication40;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Test extends JFrame{
    Test(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("x and o");
        this.setSize(600,600);
        this.setVisible(true);
        Container c=this.getContentPane();
        c.add(new MyPanel());
          }
    class MyPanel extends JPanel implements ActionListener{
        JButton button[];
        String letter = "";
         int count = 0;
         boolean win = false;
        MyPanel(){
            button=new JButton[9];
            for(int i=0;i<9;i++){
               button[i]=new JButton("");
               button[i].addActionListener(this);
               this.add( button[i]);
               this.setLayout(new GridLayout(3,3));
                                }
   
                  }
   public void actionPerformed(ActionEvent e){      
                 count++;

if(count == 1 || count == 3 || count == 5 || count == 7 || count == 9){

      letter = "X";

} else if(count == 2 || count == 4 || count == 6 || count == 8 || count == 10){

letter = "O"; }

if(e.getSource() == button[0]){
button[0].setText(letter);
button[0].setEnabled(false);

} 
else if(e.getSource() == button[1]){
button[1].setText(letter);
button[1].setEnabled(false);

                                  } 
else if(e.getSource() == button[2]){
button[2].setText(letter);
button[2].setEnabled(false);

                                     } 
else if(e.getSource() == button[3]){
button[3].setText(letter);
button[3].setEnabled(false);
                                   } 
else if(e.getSource() == button[4]){
button[4].setText(letter);
button[4].setEnabled(false);
                                   } 
else if(e.getSource() == button[5]){
button[5].setText(letter);
button[5].setEnabled(false);
                                  }
else if(e.getSource() == button[6]){
button[6].setText(letter);
button[6].setEnabled(false);
                                   } 
else if(e.getSource() == button[7]){
button[7].setText(letter);
button[7].setEnabled(false);
                                     } 
else if(e.getSource() == button[8]){
button[8].setText(letter);
button[8].setEnabled(false);

                                     }

if( button[0].getText() == button[1].getText() && button[0].getText() == button[2].getText() && button[0].getText() != ""){

win = true;

}

else if(button[3].getText() == button[4].getText() && button[4].getText() == button[5].getText() && button[3].getText() != ""){

win = true;

}


else if(button[6].getText() == button[7].getText() && button[7].getText() == button[8].getText() && button[6].getText() != ""){
win = true;

}

else if(button[0].getText() == button[3].getText() && button[3].getText() == button[6].getText() && button[0].getText() != ""){

win = true;

}
else if(button[1].getText() == button[4].getText() && button[4].getText() == button[7].getText() && button[1].getText() != ""){
win = true;

}
else if(button[2].getText() == button[5].getText() && button[2].getText() == button[8].getText() && button[2].getText() != ""){

win = true;

}//diagonal wins

else if(button[0].getText() == button[4].getText() && button[4].getText() == button[8].getText() && button[0].getText() != ""){

win = true;

}

else if(button[2].getText() == button[4].getText() && button[4].getText() == button[6].getText() && button[2].getText() != ""){

win = true;

}

else {

win = false;

}/*Show a dialog if someone wins or the game is tie*/

if(win == true){

JOptionPane.showMessageDialog(null, letter + "is WINS");

} else if(count == 9 && win == false){
JOptionPane.showMessageDialog(null, "end game no one win");

}










}//actionperform

}                                         }
    
                          
public class JavaApplication40 {

    
    
    public static void main(String[] args) {
        new Test();
    }
    
}
