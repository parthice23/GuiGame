// CSE 205     : <Class 205> / <Tuesday and Thursday>
// Projects  : <Classes>
// Author      : <Parth Patel> & <1219217324>
// Description : <Gui>

//imports
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class gui {
	//window
	JFrame window;
	//JPanel
	JPanel enterScreen;
	JPanel buttonforBegin;
	JPanel information;
	JPanel characterbutton; 
	JPanel stronghealth;
	//JLabel
	JLabel enterScreen1;
	JLabel strong;
	JLabel health;
	//font
	Font enterStyle = new Font("Arial",Font.PLAIN, 85);
	Font classicStyle = new Font("Arial",Font.PLAIN, 25);
	//JButton
	JButton buttonforBegin1; 
	JButton batman;
	JButton joker;
	JButton robin;
	JButton bane;
	//Container
	Container value;
	//JTextArea
	JTextArea information1;
	//Screen
	TitleScreenHandler tsh = new TitleScreenHandler();
	
	public static void main(String[] args) {
		new gui();
	}
	
	public gui() {
		//starting window 
		window = new JFrame();
		//starting window color
		window.getContentPane().setBackground(Color.gray);
		//starting window size
		window.setSize(850,650);
		//if you want to exit starting window 
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(null);
		//so you can see the screen
		window.setVisible(true);
		//use container value to add things together 
		value = window.getContentPane();
		
		//Title for enter screen
		enterScreen = new JPanel();
		//bounds
		enterScreen.setBounds(100, 100, 600, 150);
		//color
		enterScreen.setBackground(Color.black);
		//letters
		enterScreen1 = new JLabel ("FIGHT GAME!");
		//letter colors
		enterScreen1.setForeground(Color.ORANGE);
		//letter font
		enterScreen1.setFont(enterStyle);
		
		//button for enter screen
		buttonforBegin = new JPanel();
		buttonforBegin.setBounds(300,400,250,50);
		buttonforBegin.setBackground(Color.black);
		
		//all the information for the button screen
		buttonforBegin1 = new JButton("BEGIN FIGHT!");
		buttonforBegin1.setBackground(Color.black);
		buttonforBegin1.setForeground(Color.orange);
		buttonforBegin1.setFont(classicStyle);
		//this allows us to click on begin buttom
		buttonforBegin1.addActionListener(tsh);
		
		//add the title letters into the title box
		enterScreen.add(enterScreen1);
		//add the begin letters into the begin box
		buttonforBegin.add(buttonforBegin1);		
		value.add(enterScreen);
		value.add(buttonforBegin);
		
		//add again so you can see the screen
		window.setVisible(true);
		
	}
	
	public void startingwindow() {
		//need to remove these after you click on begin screen
		enterScreen.setVisible(false);
		buttonforBegin.setVisible(false);
		
		//information window after you click on the begin button
		information = new JPanel();
		information.setBounds(95,95,600,250);
		information.setBackground(Color.black);
		value.add(information);
		
		//information window 
		information1 = new JTextArea ("GOTHAM has gone into array. Choose the main CHARACTER you want to fight with in order to SAVE or TAKEDOWN Gotham! ENJOY!");
		//bounds
		information1.setBounds(100,100,600,250);
		//color for text and window
		information1.setBackground(Color.black);
		information1.setForeground(Color.orange);
		//font of text
		information1.setFont(classicStyle);
		information1.setLineWrap(true);
		//add all info into the window
		information.add(information1);
		
		characterbutton = new JPanel();
		//bounds
		characterbutton.setBounds(250,350,300,150);
		//color
		characterbutton.setBackground(Color.black);
		//grid so we have four button choices
		characterbutton.setLayout(new GridLayout(4,1));
		//use container value to add buttons
		value.add(characterbutton);
		
		//Batman button
		batman = new JButton("BATMAN");
		//color for text and window
		batman.setBackground(Color.white);
		batman.setForeground(Color.orange);
		//font of text
		batman.setFont(classicStyle);
		characterbutton.add(batman);
		
		//Joker button
		joker = new JButton("JOKER");
		//color for text and window
		joker.setBackground(Color.white);
		joker.setForeground(Color.orange);
		//font of text
		joker.setFont(classicStyle);
		characterbutton.add(joker);
		
		//Robin batman
		robin = new JButton("ROBIN");
		//color for text and window
		robin.setBackground(Color.white);
		robin.setForeground(Color.orange);
		//font of text
		robin.setFont(classicStyle);
		characterbutton.add(robin);
		
		//Bane button
		bane = new JButton("BANE");
		//color for text and window
		bane.setBackground(Color.white);
		bane.setForeground(Color.orange);
		//font of text
		bane.setFont(classicStyle);
		characterbutton.add(bane);
		
		//top of the window with strong and health points
		stronghealth = new JPanel();
		//color for text and window
		stronghealth.setBounds(100,15,600,50);
		stronghealth.setBackground(Color.orange);
		//use layout so one side I can have strong and other side I have 
		stronghealth.setLayout(new GridLayout(1,4));
		value.add(stronghealth);
		//print out text
		strong = new JLabel("STRONG: ");
		
		//font of text
		strong.setFont(classicStyle);
		//color
		strong.setForeground(Color.black);
		stronghealth.add(strong);
		
		//print out text
		health = new JLabel("HEALTH: ");
		//font
		health.setFont(classicStyle);
		//color
		health.setForeground(Color.black);
		stronghealth.add(health);
	
		
	}
	
	//make the button actually work
	public class TitleScreenHandler implements ActionListener{
		public void actionPerformed(ActionEvent party) {
			startingwindow();		
		}
	}
}

