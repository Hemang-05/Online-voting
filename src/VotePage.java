
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class VotePage extends JFrame implements ActionListener {
     
            JButton b1,b2,b3,b4,b5,b6;
            int a,b,c,d,n;
        VotePage(){
            ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("pic/bjp.png"));
             JLabel l1=new JLabel(i1);
             l1.setBounds(50,0,300,300);
             add(l1);
             
             ImageIcon i2= new ImageIcon(ClassLoader.getSystemResource("pic/cong.jpg"));
             JLabel l2=new JLabel(i2);
             l2.setBounds(50,400,300,300);
             add(l2);
             
             ImageIcon i3= new ImageIcon(ClassLoader.getSystemResource("pic/tmc.png"));
             JLabel l3=new JLabel(i3);
             l3.setBounds(1050,0,300,300);
             add(l3);
             
             ImageIcon i4= new ImageIcon(ClassLoader.getSystemResource("pic/JDU.jpg"));
             JLabel l4=new JLabel(i4);
             l4.setBounds(1050,400,300,300);
             add(l4);
           
             
             
        //Buttons
             b1 = new JButton("B J P");
             b1.addActionListener(this);
             b1.setBackground(Color.yellow);
             b1.setBounds(150,310,100,50);
             add(b1);
             
             b2 = new JButton("T M C");
             b2.addActionListener(this);
             b2.setBackground(Color.yellow);
             b2.setBounds(1155,310,100,50);
             add(b2);
             
             b3 = new JButton("CONGRESS");
             b3.addActionListener(this);
             b3.setBackground(Color.yellow);
             b3.setBounds(150,710,120,50);
             add(b3);
             
             b4 = new JButton("J D U");
             b4.addActionListener(this);
             b4.setBackground(Color.yellow);
             b4.setBounds(1155,710,100,50);
             add(b4);
          
             b5 = new JButton("N O T A");
             b5.addActionListener(this);
             b5.setBackground(Color.pink);
             b5.setBounds(590,300,200,200);
             add(b5);
             
             b6 = new JButton("RESULTS");
             b6.addActionListener(this);
             b6.setBackground(Color.yellow);
             b6.setBounds(640,110,100,50);
             add(b6);
             
             
             
             
             
             
             
             setBounds(0,0,1600,1000);
            getContentPane().setBackground(Color.white);
            setLayout(null);
            setVisible(true);
            
            
        }
        public static void main(String[] args){
            new VotePage();
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            a+=1;
            JOptionPane.showMessageDialog(null,"Your Vote added to BJP");
             }
        if(e.getSource() == b2){
            b+=1;
            JOptionPane.showMessageDialog(null,"Your Vote added to TMC");
             }
        
        if(e.getSource() == b3){
            c+=1;
            JOptionPane.showMessageDialog(null,"Your Vote added to Congress");
             }
    
        if(e.getSource() == b4){
            d+=1;
            JOptionPane.showMessageDialog(null,"Your Vote added to JDU");
             }
           
        if(e.getSource() == b5){
            n+=1;
            JOptionPane.showMessageDialog(null,"Your Vote added to NOTA");
             }
       
         String res=new String();
        if(a>b && a>c && a>d && a>n ){
            res= "B J P WINS";
        }
        else if(b>a && b>c && b>d && b>n ){
             res= "T M C WINS";
        }
       else if(c>b && c>a && c>d && c>n ){
             res= "CONGRESS WINS";
        }
       else if(d>b && d>c && d>a && d>n ){
             res= "J D U WINS";
        }
       else if(n>b && n>c && n>d && n>a ){
             res= "No party win the majority";
        }
            
            
            
        
        if(e.getSource() == b6){
            
            JOptionPane.showMessageDialog(null,"BJP: "+a+"\n"+"TMC: "+b+"\n"+"CONGRESS: "+c+"\n"+"JDU: "+d+"\n"+"NOTA: "+n+"\n"+"\n"+"\n"+"        "+res );
             }
             
        
             
    }
         }
