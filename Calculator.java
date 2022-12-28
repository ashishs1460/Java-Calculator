import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	boolean isOperatorClicked=false;
	String oldValue;
	int operator=0;
	float result=0;
	
	JFrame jf;
	JLabel displayLabel;
	
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton;
	JButton zeroButton;
	JButton equalButton;
	JButton divButton;
	JButton mulButton;
	JButton minusButton;
	JButton addButton;
	JButton clearButton;
public Calculator() {
    jf =new JFrame("Calculator");
	jf.setLayout(null);
	jf.setSize(600,600);
	jf.setLocation(300,150);
	
	 displayLabel=new JLabel();
	displayLabel.setBounds(30, 50, 540, 40);
	displayLabel.setBackground(Color.gray);
	displayLabel.setOpaque(true);
	displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
	displayLabel.setForeground(Color.white);
	jf.add(displayLabel);
	
	  sevenButton=new JButton("7");
		sevenButton.setBounds(30,120, 80, 80);
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(130, 120, 80, 80);
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(230, 120, 80, 80);
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(30,220, 80, 80);
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(130, 220, 80, 80);
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(230, 220, 80, 80);
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(30,320, 80, 80);
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(130, 320, 80, 80);
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(230, 320, 80, 80);
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		
		dotButton=new JButton(".");
		dotButton.setBounds(30,420, 80, 80);
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(130, 420, 80, 80);
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		equalButton=new JButton("=");
		equalButton.setBounds(230, 420, 80, 80);
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		divButton=new JButton("/");
		divButton.setBounds(330, 120, 80, 80);
		divButton.addActionListener(this);
		jf.add(divButton);
		
		mulButton=new JButton("x");
		mulButton.setBounds(330, 220, 80, 80);
		mulButton.addActionListener(this);
		jf.add(mulButton);
		
		minusButton=new JButton("-");
		minusButton.setBounds(330, 320, 80, 80);
		minusButton.addActionListener(this);
		jf.add(minusButton);
		
	    addButton=new JButton("+");
		addButton.setBounds(330, 420, 80, 80);
		addButton.addActionListener(this);
		jf.add(addButton);
		
		clearButton=new JButton("Clear");
		clearButton.setBounds(430, 420, 80, 80);
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
	
	jf.setVisible(true);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main (String ar[]) {
	Calculator c= new Calculator();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==sevenButton) {
		if(isOperatorClicked) {
			displayLabel.setText("7");
			isOperatorClicked=false;
			
		}else {
			displayLabel.setText(displayLabel.getText()+"7");
			
		}
		
		
	}else if(e.getSource()==eightButton) {
		if(isOperatorClicked) {
			displayLabel.setText("8");
			isOperatorClicked=false;
			
		}else {
			displayLabel.setText(displayLabel.getText()+"8");
			
		}
		
		 
	}else if(e.getSource()==nineButton) {
		if(isOperatorClicked) {
			displayLabel.setText("9");
			isOperatorClicked=false;
			
		}else {
			displayLabel.setText(displayLabel.getText()+"9");
			
		}
		
		
	}else if(e.getSource()==fourButton) {
		if(isOperatorClicked) {
			displayLabel.setText("4");
			isOperatorClicked=false;
			
		}else {
			displayLabel.setText(displayLabel.getText()+"4");
			
		}
		
		
	}else if(e.getSource()==fiveButton) {
		if(isOperatorClicked) {
			displayLabel.setText("5");
			isOperatorClicked=false;
			
		}else {
			displayLabel.setText(displayLabel.getText()+"5");
			
		}
		
		
	}else if(e.getSource()==sixButton) {
		if(isOperatorClicked) {
			displayLabel.setText("6");
			isOperatorClicked=false;
			
		}else {
			displayLabel.setText(displayLabel.getText()+"6");
			
		}
		
		
	}else if(e.getSource()==oneButton) {
		if(isOperatorClicked) {
			displayLabel.setText("1");
			isOperatorClicked=false;
			
		}else {
			displayLabel.setText(displayLabel.getText()+"1");
			
		}
		
		
	}else if(e.getSource()==twoButton) {
		if(isOperatorClicked) {
			displayLabel.setText("2");
			isOperatorClicked=false;
			
		}else {
			displayLabel.setText(displayLabel.getText()+"2");
			
		}
		
		
	}else if(e.getSource()==threeButton) {
		if(isOperatorClicked) {
			displayLabel.setText("3");
			isOperatorClicked=false;
			
		}else {
			displayLabel.setText(displayLabel.getText()+"3");
			
		}
		
		
	}else if(e.getSource()==dotButton) {
		displayLabel.setText(displayLabel.getText()+".");
		
	}else if(e.getSource()==zeroButton) {
		if(isOperatorClicked) {
			displayLabel.setText("0");
			isOperatorClicked=false;
			
		}else {
			displayLabel.setText(displayLabel.getText()+"0");
			
		}
		
		
	}else if(e.getSource()==equalButton) {
		String newValue=displayLabel.getText();
		float oldValueF=Float.parseFloat(oldValue);
		float newValueF=Float.parseFloat(newValue);
		if (operator == 1) {
            result = oldValueF/newValueF;
        }else if(operator == 2) {
            result=oldValueF*newValueF;
        }else if(operator == 3) {
            result=oldValueF-newValueF;
        }else if(operator == 4) {
            result=oldValueF+newValueF;
        }
        displayLabel.setText(result +" ");
      }else if(e.getSource()==divButton) {
		operator = 1;
		isOperatorClicked=true;
		oldValue=displayLabel.getText();
		
	}else if(e.getSource()==mulButton) {
		operator=2;
		isOperatorClicked=true;
		oldValue=displayLabel.getText();
		
		
	}else if(e.getSource()==minusButton) {
		operator=3;
		isOperatorClicked=true;
		oldValue=displayLabel.getText();
		
		
	}else if(e.getSource()==addButton) {
		operator=4;
		isOperatorClicked=true;
		oldValue=displayLabel.getText();
		
		
		
		
	}else if (e.getSource()==clearButton) {
		displayLabel.setText("");
	}
	
	
}
}

