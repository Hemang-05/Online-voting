
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class voting extends JFrame implements ActionListener{

    voting(){
   
        setBounds(0,0,1600,700);
        getContentPane().setBackground(Color.ORANGE);
        
        
        JLabel l1= new JLabel("WELCOME To");
        l1.setFont(new Font("Tahoma",Font.PLAIN,40));
        l1.setBounds(650,50,800,100); 
        add(l1);
       
        JLabel l2= new JLabel(" New Online Voting System: ");
        l2.setFont(new Font("Algerian",Font.PLAIN,40));
        l2.setBounds(500,100,700,100);
        add(l2);
        
        JButton b1= new JButton("CLICK TO VOTE");
        b1.setBackground(Color.GREEN);
        b1.addActionListener(this);
        b1.setFont(new Font("TimesRoman",Font.PLAIN,20));
        b1.setBounds(620,200, 300, 80);
        add(b1);
    
        
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("pic/vote.png"));
        JLabel l3= new JLabel(il);
        l3.setBounds(530,300,500,500);
        add(l3); 
         
        
         
         setLayout(null);
         setVisible(true);
       
    
    }
public static void main(String[] args) {
       new voting();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new VotePage().setVisible(true);
    }
    
}
