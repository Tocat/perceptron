package pertronshow;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;  
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.Point;  
import java.awt.Toolkit;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener; 
import java.io.BufferedReader;
import java.io.File;  
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;  
import javax.swing.JFileChooser;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JOptionPane;  
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;  
import javax.swing.JTextField;  

import java.awt.Graphics;


class Test3 extends JPanel {

	private int x;
	private int y;
	  public void paint(Graphics g) {
		  float lineWidth = 10.0f;
	      ((Graphics2D)g).setStroke(new BasicStroke(lineWidth));
		  g.drawLine (x, y, 300, 400);
	    g.setColor(Color.red);
	    
	    g.drawLine (200, 200, 200, 200);
	  }
	  
	public int gety() {
		return y;
	}
	public void sety(int y) {
		this.y = y;
	}
	public int getx() {
		return x;
	}
	public void setx(int x) {
		this.x = x;
	}
	Test3(int x,int y){
		this.x=x;
		this.y=y;
	}
}

public class Show implements ActionListener {  
    JFrame frame = new JFrame("PERCEPTRON-show");
    JTabbedPane tabPane = new JTabbedPane();
    Container con = new Container();
    JLabel label1 = new JLabel("DATAfile");  
    JLabel label2 = new JLabel("feature9"); 
    //JLabel label5 = new JLabel("outputdir"); 
    //JLabel label3 = new JLabel("dimension");
    
    //JLabel label4 = new JLabel("coordinate");
    //JLabel label41 = new JLabel("1");
    //JTextField text41 = new JTextField();
    //JLabel label42 = new JLabel("2");
    //JTextField text42 = new JTextField();
    //JLabel label43 = new JLabel("3");
    //JTextField text43 = new JTextField();
    //JLabel label44 = new JLabel("4");
    //JTextField text44 = new JTextField();
    JLabel label3 = new JLabel("feature1");
    JTextField text3 = new JTextField();
    JLabel label4 = new JLabel("feature2");
    JTextField text4 = new JTextField();
    JLabel label5 = new JLabel("feature3");
    JTextField text5 = new JTextField();
    JLabel label6 = new JLabel("feature4");
    JTextField text6 = new JTextField();
    JLabel label7 = new JLabel("feature5");
    JTextField text7 = new JTextField();
    JLabel label8 = new JLabel("feature6");
    JTextField text8 = new JTextField();
    JLabel label9 = new JLabel("feature7");
    JTextField text9 = new JTextField();
    JLabel label10 = new JLabel("feature8");
    JTextField text10 = new JTextField();
    
    JLabel label13 = new JLabel("feature10");
    JTextField text13 = new JTextField();
    JLabel label14 = new JLabel("feature11");
    JTextField text14 = new JTextField();
    JLabel label15 = new JLabel("feature12");
    JTextField text15 = new JTextField();
    JLabel label16 = new JLabel("feature13");
    JTextField text16 = new JTextField();
    JLabel label17 = new JLabel("feature14");
    JTextField text17 = new JTextField();
    JLabel label18 = new JLabel("feature15");
    JTextField text18 = new JTextField();
    JLabel label19 = new JLabel("feature16");
    JTextField text19 = new JTextField();
    JLabel label20 = new JLabel("feature17");
    JTextField text20 = new JTextField();
    JLabel label12 = new JLabel("feature18");
    JTextField text12 = new JTextField();
    
    
    JTextField text1 = new JTextField();
    JTextField text2 = new JTextField();
    JButton button1 = new JButton("choose data file");
    
    JFileChooser jfc = new JFileChooser();  
    JButton button3 = new JButton("start");
    
    JLabel labeljz1 = new JLabel("result");
    JLabel labeljz2_1 = new JLabel("positive-testdata");
    JLabel labeljz2_2 = new JLabel("negative-testdata");
    JLabel labeljz3_1 = new JLabel("positive-perceptron");
    JTextField textjz3_2 = new JTextField();
    JTextField textjz3_3 = new JTextField();
    JLabel labeljz4_1 = new JLabel("negative-perceptron");
    JTextField textjz4_2 = new JTextField();
    JTextField textjz4_3 = new JTextField();
    //JTextField text2 = new JTextField();
    
    private JFrame frmTesttitle2;
    
    String trainDatares[][];
      
    Show() {  
        jfc.setCurrentDirectory(new File("d://")); 
          
        double lx = Toolkit.getDefaultToolkit().getScreenSize().getWidth();  
          
        double ly = Toolkit.getDefaultToolkit().getScreenSize().getHeight();  
          
        frame.setLocation(new Point((int) (lx / 2) - 150, (int) (ly / 2) - 150));  
        frame.setSize(500, 600);  
        frame.setContentPane(tabPane);  
        
        label1.setBounds(10, 10, 70, 20);  
        text1.setBounds(75, 10, 180, 20);  
        button1.setBounds(280, 10, 180, 20);  
        
        label2.setBounds(10, 65, 70, 20);  
        text2.setBounds(75, 65, 180, 20);
        
        
        
        
        
        label3.setBounds(10, 95, 70, 20);  
        text3.setBounds(60, 95, 180, 20);
        label4.setBounds(10, 125, 70, 20);  
        text4.setBounds(60, 125, 180, 20);
        label5.setBounds(10, 155, 70, 20);  
        text5.setBounds(60, 155, 180, 20);
        label6.setBounds(10, 185, 70, 20);  
        text6.setBounds(60, 185, 180, 20);
        label7.setBounds(10, 215, 70, 20);  
        text7.setBounds(60, 215, 180, 20);
        label8.setBounds(10, 245, 70, 20);  
        text8.setBounds(60, 245, 180, 20);
        label9.setBounds(10, 275, 70, 20);  
        text9.setBounds(60, 275, 180, 20);
        label10.setBounds(10, 305, 70, 20);  
        text10.setBounds(60, 305, 180, 20);
        label2.setBounds(10, 335, 70, 20);  
        text2.setBounds(60, 335, 180, 20);
        
        
        label13.setBounds(240, 95, 70, 20);  
        text13.setBounds(300, 95, 180, 20);
        label14.setBounds(240, 125, 70, 20);  
        text14.setBounds(300, 125, 180, 20);
        label15.setBounds(240, 155, 70, 20);  
        text15.setBounds(300, 155, 180, 20);
        label16.setBounds(240, 185, 70, 20);  
        text16.setBounds(300, 185, 180, 20);
        label17.setBounds(240, 215, 70, 20);  
        text17.setBounds(300, 215, 180, 20);
        label18.setBounds(240, 245, 70, 20);  
        text18.setBounds(300, 245, 180, 20);
        label19.setBounds(240, 275, 70, 20);  
        text19.setBounds(300, 275, 180, 20);
        label20.setBounds(240, 305, 70, 20);  
        text20.setBounds(300, 305, 180, 20);
        label12.setBounds(240, 335, 70, 20);  
        text12.setBounds(300, 335, 180, 20);
        
        labeljz1.setBounds(20,400,40,20);
        labeljz2_1.setBounds(170,420,140,20);
        labeljz2_2.setBounds(300,420,140,20);
        labeljz3_1.setBounds(20,450,140,20);
        textjz3_2.setBounds(170,450,100,20);
        textjz3_3.setBounds(300,450,100,20);
        
        labeljz4_1.setBounds(20,480,140,20);
        textjz4_2.setBounds(170,480,100,20);
        textjz4_3.setBounds(300,480,100,20);
        
        
        
        button3.setBounds(110, 35, 280, 20);  
        button1.addActionListener(this);  
        
        button3.addActionListener(this);  
        
        con.add(label1);  
        con.add(text1);  
        con.add(button1);  
        
        con.add(label2);  
        con.add(text2); 
        con.add(label3);  
        con.add(text3); 
        con.add(label4);  
        con.add(text4); 
        con.add(label5);  
        con.add(text5); 
        con.add(label6);  
        con.add(text6); 
        con.add(label7);  
        con.add(text7); 
        con.add(label8);  
        con.add(text8); 
        con.add(label9);  
        con.add(text9); 
        con.add(label10);  
        con.add(text10);
        
        
        con.add(label13);  
        con.add(text13); 
        con.add(label14);  
        con.add(text14); 
        con.add(label15);  
        con.add(text15); 
        con.add(label16);  
        con.add(text16); 
        con.add(label17);  
        con.add(text17); 
        con.add(label18);  
        con.add(text18); 
        con.add(label19);  
        con.add(text19); 
        con.add(label20);  
        con.add(text20);
        con.add(label12);  
        con.add(text12); 
        
        con.add(labeljz1);  
        con.add(labeljz2_1); 
        con.add(labeljz2_2);  
        con.add(labeljz3_1);
        con.add(textjz3_2);  
        con.add(textjz3_3);
        con.add(labeljz4_1);
        con.add(textjz4_2);  
        con.add(textjz4_3);
        
        con.add(button3);  
        frame.setVisible(true); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        tabPane.add("choose files", con);
          
    	
    }  
      
    public void actionPerformed(ActionEvent e) {  
        // TODO Auto-generated method stub  
        if (e.getSource().equals(button1)) {  
            jfc.setFileSelectionMode(0);  
            int state = jfc.showOpenDialog(null);  
            if (state == 1) {  
                return;  
            } else {  
                File f = jfc.getSelectedFile();  
                text1.setText(f.getAbsolutePath());  
            }  
        }  
        if (e.getSource().equals(button3)) { 
        	String[] res=Pertron.run(text1.getText());
        	
        	
        	text3.setText(res[0]);
        	text4.setText(res[1]);
        	text5.setText(res[2]);
        	text6.setText(res[3]);
        	text7.setText(res[4]);
        	text8.setText(res[5]);
        	text9.setText(res[6]);
        	text10.setText(res[7]);
        	text2.setText(res[8]);
        	
        	text13.setText(res[9]);
        	text14.setText(res[10]);
        	text15.setText(res[11]);
        	text16.setText(res[12]);
        	text17.setText(res[13]);
        	text18.setText(res[14]);
        	text19.setText(res[15]);
        	text20.setText(res[16]);
        	text12.setText(res[17]);
        	textjz3_2.setText(res[18]);
        	textjz3_3.setText(res[19]);
        	textjz4_2.setText(res[21]);
        	textjz4_3.setText(res[20]);
        	
        }
        
          
            
        	
        	
        	
        	
        	//String[] test2={text41.getText(),text42.getText(),text43.getText(),text44.getText()};
            //trainDatares=KNN.run(text1.getText(), text2.getText(),text5.getText());
           
            
            
            
            
            
            
            
            

            
            
        	
         
    } 
    
    
    
    
    
    public static void main(String[] args) {  
        new Show();  
    } 
    
}
