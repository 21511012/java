
package javaapplication70;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;


class Test extends JFrame{
    Test(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("rawa");
        Toolkit kit =Toolkit.getDefaultToolkit();
        Dimension dim=new Dimension(kit.getScreenSize());
        this.setLocation(dim.width/4,dim.height/4);
        this.setSize(dim.width/2, dim.height/2);
        this.setVisible(true);
        Container c=this.getContentPane();
        c.add(new MyPanel());
                        }
       
        class MyPanel extends JPanel{
            int x,y;
            String op;
            JFrame frame;
            JButton number[]=new JButton[10] ;
            JButton opreat[]=new JButton[3];
            JTextField text;

            MyPanel(){
          
          
          for(int i=0;i<10;i++)
          {
            number[i]=new JButton(String.valueOf(i));
          this.add(number[i]);
          number[i].addActionListener(new AL());
          
          
          }
          opreat[0]=new JButton("*");
          opreat[1]=new JButton("-");
          opreat[2]=new JButton("=");
          for(int i=0;i<3;i++)
          {
          this.add(opreat[i]);
          opreat[i].addActionListener(new AL());
          opreat[i].setBackground(Color.yellow);
          
          }
                
text =new JTextField("0");
text.setColumns(20);
text.setEditable(false);
this.add(text);
   text.setBackground(Color.pink);
   
               
                                  }
          
                                                
                   
                
                                                   
            
                                      
         private class AL implements ActionListener{
            
     public void actionPerformed(ActionEvent e) {
         if( ((JButton)e.getSource()).getText().equals("0")  || ((JButton)e.getSource()).getText().equals("1")  ||((JButton)e.getSource()).getText().equals("2")                       
         
         ||((JButton)e.getSource()).getText().equals("3")    ||((JButton)e.getSource()).getText().equals("4")  ||((JButton)e.getSource()).getText().equals("5")
         || ((JButton)e.getSource()).getText().equals("6")   ||((JButton)e.getSource()).getText().equals("7")  ||((JButton)e.getSource()).getText().equals("8")
         ||((JButton)e.getSource()).getText().equals("9")        )
             text.setText(text.getText()   +((JButton)e.getSource()).getText());
         if(   ((JButton)e.getSource()).getText().equals("*")|| ((JButton)e.getSource()).getText().equals("-"))
         {
          x=Integer.parseInt(text.getText());
          text.setText("");
          op=((JButton)e.getSource()).getText();
          
         }
         if(((JButton)e.getSource()).getText().equals("=")){
             y=Integer.parseInt(text.getText());
             text.setText("");
             if(op.equals("*"))
                 text.setText(String.valueOf(x*y));
             else
                 text.setText(String.valueOf(x-y));
              }
     }
  }  
       }//pannel
          }//jframe
                          
public class JavaApplication70 {

    
    public static void main(String[] args) {
       new Test();
    }
    
}
