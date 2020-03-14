import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame= new JFrame("Calculator");
		Container c= frame.getContentPane();
		c.setLayout(null);
		
		ImageIcon icon= new ImageIcon("C:/Users/sagit/Desktop/calc.png");
		frame.setIconImage(icon.getImage());
		
		JButton b0= new JButton("0");
		JButton b1= new JButton("1");
		JButton b2= new JButton("2");
		JButton b3= new JButton("3");
		JButton b4= new JButton("4");
		JButton b5= new JButton("5");
		JButton b6= new JButton("6");
		JButton b7= new JButton("7");
		JButton b8= new JButton("8");
		JButton b9= new JButton("9");
		JButton bplus= new JButton("+");
		JButton bminus= new JButton("-");
		JButton bmul= new JButton("X");
		JButton bdiv= new JButton("/");
		JButton bequal= new JButton("=");
		JButton bclear= new JButton("Clear");
		JButton bdel= new JButton("Backspace");
		JButton bdot= new JButton(".");
		
		JTextField tx= new JTextField();
		
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setBounds(500, 200, 315, 380);
		tx.setBounds(25, 25, 250, 50);
		bclear.setBounds(25, 100, 110, 45);
		bdel.setBounds(150, 100, 110, 45);
		
		b7.setBounds(25, 150, 55 ,40);
		b8.setBounds(85, 150, 55, 40);
		b9.setBounds(145, 150, 55, 40);
		bdiv.setBounds(205, 150, 55, 40);
		
		b4.setBounds(25, 195, 55, 40);
		b5.setBounds(85, 195, 55, 40);
		b6.setBounds(145, 195, 55, 40);
		bmul.setBounds(205, 195, 55, 40);
		
		b1.setBounds(25, 240, 55, 40);
		b2.setBounds(85, 240, 55, 40);
		b3.setBounds(145, 240, 55, 40);
		bminus.setBounds(205, 240, 55, 40);
		
		b0.setBounds(25, 285, 55, 40);
		bdot.setBounds(85, 285, 55, 40);
		bequal.setBounds(145, 285, 55, 40);
		bplus.setBounds(205, 285, 55, 40);
		
		Font op= new Font("Times New Roman", Font.BOLD, 30);
		bmul.setFont(op); bmul.setForeground(Color.RED);
		bdiv.setFont(op); bdiv.setForeground(Color.RED);
		bplus.setFont(op); bplus.setForeground(Color.RED);
		bminus.setFont(op); bminus.setForeground(Color.RED);
		bequal.setFont(op); bequal.setForeground(Color.RED);
		
		bclear.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		bclear.setForeground(Color.RED);
		bdel.setFont(new Font("Times New Roman", Font.PLAIN, 17)); 
		bdel.setForeground(Color.RED);
		
		Font f= new Font("Times New Roman", Font.BOLD, 30);
		b0.setFont(f); b0.setForeground(Color.BLUE);
		b1.setFont(f); b1.setForeground(Color.BLUE);
		b2.setFont(f); b2.setForeground(Color.BLUE);
		b3.setFont(f); b3.setForeground(Color.BLUE);
		b4.setFont(f); b4.setForeground(Color.BLUE);
		b5.setFont(f); b5.setForeground(Color.BLUE);
		b6.setFont(f); b6.setForeground(Color.BLUE);
		b7.setFont(f); b7.setForeground(Color.BLUE);
		b8.setFont(f); b8.setForeground(Color.BLUE);
		b9.setFont(f); b9.setForeground(Color.BLUE);
		bdot.setFont(f); bdot.setForeground(Color.BLUE);
		
		tx.setFont(new Font("Arial", Font.BOLD, 30));
		tx.setHorizontalAlignment(SwingConstants.RIGHT);
		
		c.add(tx); c.add(b0); c.add(b1); c.add(b2);c.add(b3);c.add(b4); c.add(b5);
		c.add(bequal);c.add(bminus);c.add(bplus);c.add(b9);c.add(b8);c.add(b7); 
		c.add(b6); c.add(bdiv); c.add(bmul);c.add(bdel); c.add(bclear); c.add(bdot);

		b0.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tx.setText(tx.getText()+"0");
			}
		}); 
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tx.setText(tx.getText()+"1");
			}
		}); 
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tx.setText(tx.getText()+"2");
			}
		}); 
		b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tx.setText(tx.getText()+"5");
			}
		}); 
		b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tx.setText(tx.getText()+"4");
			}
		}); 
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tx.setText(tx.getText()+"3");
			}
		}); 
		b6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tx.setText(tx.getText()+"6");
			}
		}); 
		b7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tx.setText(tx.getText()+"7");
			}
		}); 
		b8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tx.setText(tx.getText()+"8");
			}
		}); 
		bminus.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tx.setText(tx.getText()+"-");
			}
		}); 
		bplus.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tx.setText(tx.getText()+"+");
			}
		}); 
		b9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tx.setText(tx.getText()+"9");
			}
		}); 
		bdot.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tx.setText(tx.getText()+".");
			}
		}); 
		bdiv.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tx.setText(tx.getText()+"/");
			}
		}); 
		bmul.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tx.setText(tx.getText()+"*");
			}
		}); 
		bequal.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String ans=cal(tx.getText());
				tx.setText(ans);
			}
		}); 
		bdel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tx.setText(tx.getText().substring(0, tx.getText().length()-1));
			}
		}); 
		bclear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tx.setText("");
			}
		}); 
		
	}
	
	public static String cal(String input){
		try{
		String ans="";
		
		ArrayList<Character> op= new ArrayList<>();
		ArrayList<Float> num= new ArrayList<>();
		
		String curr= "";
		boolean neg= false;
		for(int i=0; i<input.length(); i++){
			
			char a= input.charAt(i);
			if(a=='+'|| a=='-'|| a=='*'|| a=='/'){
				if(curr=="" &&( a=='+' || a=='-')){
					if(a=='-') neg= true;
				}
				else{
				op.add(a);
				float b= Float.parseFloat(curr);
				if(neg==true){ b*=-1;}
				num.add(b);
				neg=false;
				curr="";
				}
			}
			else{
				curr=curr+input.charAt(i);
			}
				
		}
		float b= Float.parseFloat(curr);
		if(neg==true){ b*=-1;}
		num.add(b);		

		while(op.indexOf('*')!=-1){
			int index= op.indexOf('*');
			int first= index;
			int sec= index+1;
			
			float x= num.get(first);
			float y= num.get(sec);
			
			num.set(first, x*y);
			num.remove(sec);
			op.remove(index);
		}
		while(op.indexOf('/')!=-1){
			int index= op.indexOf('/');
			int first= index;
			int sec= index+1;
			
			float x= num.get(first);
			float y= num.get(sec);
			
			num.set(first, x/y);
			num.remove(sec);
			op.remove(index);
		}
		while(op.indexOf('+')!=-1){
			int index= op.indexOf('+');
			int first= index;
			int sec= index+1;
			
			float x= num.get(first);
			float y= num.get(sec);
			
			num.set(first, x+y);
			num.remove(sec);
			op.remove(index);
			
			
		}
		while(op.indexOf('-')!=-1){
			int index= op.indexOf('-');
			int first= index;
			int sec= index+1;
			
			float x= num.get(first);
			float y= num.get(sec);
			
			num.set(first, x-y);
			num.remove(sec);
			op.remove(index);
		}
		if(num.size()==1){
			ans= ""+num.get(0);
		return ans;
		}
		else throw new Exception() ;	
	}
		
		catch(Exception e){
			JFrame fr= new JFrame("Error");
			fr.setBounds(550, 300, 200, 100);
			fr.setResizable(false);
			fr.setVisible(true);
			fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			Container c= fr.getContentPane();
			c.setLayout(null);
			
			ImageIcon ic= new ImageIcon("C:/Users/sagit/Desktop/error.jpg");
			fr.setIconImage(ic.getImage());
			
			JLabel l= new JLabel("Error! Enter valid input.");
			l.setBounds(10, 10, 200, 50);
			c.add(l);
		
		}
		
 return ""; 
}
}
