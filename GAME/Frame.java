package GAME;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JProgressBar;
import java.awt.SystemColor;

public class Frame extends JFrame {

	private JPanel contentPane;

	int DIFFICULTY_VAR = 12;
	int TRYS_VAR;
	
	int PERCENT_VAR;
	
	
	int DIFFICULTY_CBX_IND;
	
	int CODE_COLOR_1_VAR = 0; 
	int CODE_COLOR_2_VAR = 0; 
	int CODE_COLOR_3_VAR = 0; 
	int CODE_COLOR_4_VAR = 0; 

	int GUESS_COLOR_1_VAR = 0;
	int GUESS_COLOR_2_VAR = 0;
	int GUESS_COLOR_3_VAR = 0;
	int GUESS_COLOR_4_VAR = 0;
	
	int TEMP_CODE_COLOR_1_VAR = 0;
	int TEMP_CODE_COLOR_2_VAR = 0;
	int TEMP_CODE_COLOR_3_VAR = 0;
	int TEMP_CODE_COLOR_4_VAR = 0;

	int X_POSITION_LAST_TRY_VAR = 140;
	
	int CORRECT_COLOR;
	int CORRECT_POSITION;
	private JTextField textField;
	private JTextField TITLE1_LBL;
	
	
	
	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	
	
	
	public Frame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTriesXx = new JLabel("TRIES x/x");
		lblTriesXx.setHorizontalAlignment(SwingConstants.CENTER);
		lblTriesXx.setForeground(Color.BLACK);
		lblTriesXx.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblTriesXx.setBounds(490, 630, 159, 28);
		contentPane.add(lblTriesXx);
		
		//USER INTERFACE
		
		JButton START_BTN = new JButton("Start!");
		
		START_BTN.setFont(new Font("Verdana", Font.PLAIN, 24));
		START_BTN.setBounds(290, 520, 500, 80);
		START_BTN.setBackground(Color.white); 
		contentPane.add(START_BTN);
		
		JButton CODE_OK_BTN = new JButton("Create Code");
		
		CODE_OK_BTN.setFont(new Font("Verdana", Font.PLAIN, 8));
		CODE_OK_BTN.setBounds(1150, 520, 80, 80);
		CODE_OK_BTN.setBackground(Color.white); 
		CODE_OK_BTN.setVisible(false);
		contentPane.add(CODE_OK_BTN);
		
		JButton GUESS_CODE_OK_BTN = new JButton("Guess Code");
		
		GUESS_CODE_OK_BTN.setFont(new Font("Verdana", Font.PLAIN, 5));
		GUESS_CODE_OK_BTN.setBounds(30, 520, 80, 80);
		GUESS_CODE_OK_BTN.setBackground(Color.white); 
		GUESS_CODE_OK_BTN.setVisible(false);
		contentPane.add(GUESS_CODE_OK_BTN);
		
		JLabel WIN_LBL = new JLabel("CONGRATS YOU CRACKED THE CODE!");
		WIN_LBL.setForeground(Color.GREEN);
		WIN_LBL.setFont(new Font ("Century Gothic", Font.BOLD, 54));
		WIN_LBL.setBounds(100, 520, 1100, 100);
		WIN_LBL.setVisible(false);
		contentPane.add(WIN_LBL);
		contentPane.repaint();
		
		
		JLabel LOSE_LBL = new JLabel("SORRY YOU LOST!");
		LOSE_LBL.setForeground(Color.RED);
		LOSE_LBL.setFont(new Font ("Century Gothic", Font.BOLD, 54));
		LOSE_LBL.setBounds(86, 409, 1100, 100);
		LOSE_LBL.setVisible(false);
		contentPane.add(LOSE_LBL);
		contentPane.repaint();
		
		
		
		//CODE BUTTONS 
		
		JButton CODE_COLOR_1_BTN = new JButton("");
		
		CODE_COLOR_1_BTN.setBounds(1150, 10, 80, 80);
		CODE_COLOR_1_BTN.setBackground(Color.blue); 
		CODE_COLOR_1_BTN.setVisible(false);
		contentPane.add(CODE_COLOR_1_BTN);		
		
		JButton CODE_COLOR_2_BTN = new JButton("");
		
		CODE_COLOR_2_BTN.setBounds(1150, 100, 80, 80);
		CODE_COLOR_2_BTN.setBackground(Color.blue); 
		CODE_COLOR_2_BTN.setVisible(false);
		contentPane.add(CODE_COLOR_2_BTN);		
		
		
		JButton CODE_COLOR_3_BTN = new JButton("");
		
		CODE_COLOR_3_BTN.setBounds(1150, 190, 80, 80);
		CODE_COLOR_3_BTN.setBackground(Color.blue); 
		CODE_COLOR_3_BTN.setVisible(false);
		contentPane.add(CODE_COLOR_3_BTN);		
		
		JButton CODE_COLOR_4_BTN = new JButton("");
		
		CODE_COLOR_4_BTN.setBounds(1150, 280, 80, 80);
		CODE_COLOR_4_BTN.setBackground(Color.blue);  
		CODE_COLOR_4_BTN.setVisible(false);
		contentPane.add(CODE_COLOR_4_BTN);		
		
		
		//GUESS BUTTONS
		
		JButton GUESS_COLOR_1_BTN = new JButton("");

		
		GUESS_COLOR_1_BTN.setBounds(30, 10, 80, 80);
		GUESS_COLOR_1_BTN.setBackground(Color.blue); 
		GUESS_COLOR_1_BTN.setVisible(false);
		contentPane.add(GUESS_COLOR_1_BTN);		
		
		JButton GUESS_COLOR_2_BTN = new JButton("");
		
		
		GUESS_COLOR_2_BTN.setBounds(30, 100, 80, 80);
		GUESS_COLOR_2_BTN.setBackground(Color.blue);
		GUESS_COLOR_2_BTN.setVisible(false);
		contentPane.add(GUESS_COLOR_2_BTN);		
		
		
		JButton GUESS_COLOR_3_BTN = new JButton("");
		
		
		GUESS_COLOR_3_BTN.setBounds(30, 190, 80, 80);
		GUESS_COLOR_3_BTN.setBackground(Color.blue);
		GUESS_COLOR_3_BTN.setVisible(false);
		contentPane.add(GUESS_COLOR_3_BTN);		
		
		JButton GUESS_COLOR_4_BTN = new JButton("");
		
	  
		GUESS_COLOR_4_BTN.setBounds(30, 280, 80, 80);
		GUESS_COLOR_4_BTN.setBackground(Color.blue);
		GUESS_COLOR_4_BTN.setVisible(false);
		contentPane.add(GUESS_COLOR_4_BTN);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField.setBounds(638, 409, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(586, 51, 46, 13);
		contentPane.add(lblNewLabel);
		
		JComboBox DIFFICULTY_CBX = new JComboBox();
		DIFFICULTY_CBX.setFont(new Font("Verdana", Font.PLAIN, 34));
		DIFFICULTY_CBX.setModel(new DefaultComboBoxModel(new String[] {"EASY", "NORMAL", "HARD"}));
		DIFFICULTY_CBX.setBackground(Color.white);
		DIFFICULTY_CBX.setSelectedIndex(1);
		DIFFICULTY_CBX.setBounds(796, 516, 200, 100);
		contentPane.add(DIFFICULTY_CBX);
		
		TITLE1_LBL = new JTextField();
		TITLE1_LBL.setHorizontalAlignment(SwingConstants.CENTER);
		TITLE1_LBL.setFont(new Font("Tahoma", Font.PLAIN, 39));
		TITLE1_LBL.setText("MASTERMIND");
		TITLE1_LBL.setBounds(399, 232, 335, 90);
		contentPane.add(TITLE1_LBL);
		TITLE1_LBL.setColumns(10);
		
		JProgressBar TRYS_DISPLAY_LBL = new JProgressBar();
		TRYS_DISPLAY_LBL.setFont(new Font("Tahoma", Font.PLAIN, 11));
		TRYS_DISPLAY_LBL.setForeground(SystemColor.text);
		TRYS_DISPLAY_LBL.setBackground(SystemColor.textHighlight);
		TRYS_DISPLAY_LBL.setBounds(0, 637, 1270, 28);
		contentPane.add(TRYS_DISPLAY_LBL);

	 //USER INTERFACE ACTIONS
		
		
		START_BTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TITLE1_LBL.setVisible(false);
				

				CODE_COLOR_1_BTN.setVisible(true);
				CODE_COLOR_2_BTN.setVisible(true);
				CODE_COLOR_3_BTN.setVisible(true);
				CODE_COLOR_4_BTN.setVisible(true);

				
				DIFFICULTY_CBX.setVisible(false);
				
				DIFFICULTY_CBX_IND = DIFFICULTY_CBX.getSelectedIndex();
				
				if (DIFFICULTY_CBX_IND == 0) {
					DIFFICULTY_VAR = 16;
				}
				
				else if (DIFFICULTY_CBX_IND == 1) {
					DIFFICULTY_VAR = 12;

				}
				else if (DIFFICULTY_CBX_IND == 2) {
					DIFFICULTY_VAR = 8;

				}
				
				CODE_OK_BTN.setVisible(true);
				
				START_BTN.setVisible(false);
			}
		});
		
		CODE_OK_BTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CODE_COLOR_1_BTN.setVisible(false);
				CODE_COLOR_2_BTN.setVisible(false);
				CODE_COLOR_3_BTN.setVisible(false);
				CODE_COLOR_4_BTN.setVisible(false);

				GUESS_COLOR_1_BTN.setVisible(true);
				GUESS_COLOR_2_BTN.setVisible(true);
				GUESS_COLOR_3_BTN.setVisible(true);
				GUESS_COLOR_4_BTN.setVisible(true);

				GUESS_CODE_OK_BTN.setVisible(true);
				
				CODE_OK_BTN.setVisible(false);
			}
		});
		
		 //GAME ACTIONS
		
		CODE_COLOR_1_BTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CODE_COLOR_1_VAR++;
				
				if (CODE_COLOR_1_VAR >= 6) {
					CODE_COLOR_1_VAR = 0;
				}
				
				
				if (CODE_COLOR_1_VAR == 0) {
					CODE_COLOR_1_BTN.setBackground(Color.blue);
				}
				
				else if (CODE_COLOR_1_VAR == 1) {
					CODE_COLOR_1_BTN.setBackground(Color.red);
				}
				
				else if (CODE_COLOR_1_VAR == 2) {
					CODE_COLOR_1_BTN.setBackground(Color.yellow);
				}
				
				else if (CODE_COLOR_1_VAR == 3) {
					CODE_COLOR_1_BTN.setBackground(Color.green);
				}
				
				else if (CODE_COLOR_1_VAR == 4) {
					CODE_COLOR_1_BTN.setBackground(Color.orange);
				}
				
				else if (CODE_COLOR_1_VAR == 5) {
					CODE_COLOR_1_BTN.setBackground(Color.magenta);
				}
			}
		});
		
		CODE_COLOR_2_BTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CODE_COLOR_2_VAR++;
				
				if (CODE_COLOR_2_VAR >= 6) {
					CODE_COLOR_2_VAR = 0;
				}
				
				
				if (CODE_COLOR_2_VAR == 0) {
					CODE_COLOR_2_BTN.setBackground(Color.blue);
				}
				
				else if (CODE_COLOR_2_VAR == 1) {
					CODE_COLOR_2_BTN.setBackground(Color.red);
				}
				
				else if (CODE_COLOR_2_VAR == 2) {
					CODE_COLOR_2_BTN.setBackground(Color.yellow);
				}
				
				else if (CODE_COLOR_2_VAR == 3) {
					CODE_COLOR_2_BTN.setBackground(Color.green);
				}
				
				else if (CODE_COLOR_2_VAR == 4) {
					CODE_COLOR_2_BTN.setBackground(Color.orange);
				}
				
				else if (CODE_COLOR_2_VAR == 5) {
					CODE_COLOR_2_BTN.setBackground(Color.magenta);
				}
			}
		});
		
		CODE_COLOR_3_BTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CODE_COLOR_3_VAR++;
				
				if (CODE_COLOR_3_VAR >= 6) {
					CODE_COLOR_3_VAR = 0;
				}
				
				
				if (CODE_COLOR_3_VAR == 0) {
					CODE_COLOR_3_BTN.setBackground(Color.blue);
				}
				
				else if (CODE_COLOR_3_VAR == 1) {
					CODE_COLOR_3_BTN.setBackground(Color.red);
				}
				
				else if (CODE_COLOR_3_VAR == 2) {
					CODE_COLOR_3_BTN.setBackground(Color.yellow);
				}
				
				else if (CODE_COLOR_3_VAR == 3) {
					CODE_COLOR_3_BTN.setBackground(Color.green);
				}
				
				else if (CODE_COLOR_3_VAR == 4) {
					CODE_COLOR_3_BTN.setBackground(Color.orange);
				}
				
				else if (CODE_COLOR_3_VAR == 5) {
					CODE_COLOR_3_BTN.setBackground(Color.magenta);
				}
			}
		});
		
		CODE_COLOR_4_BTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CODE_COLOR_4_VAR++;
				
				if (CODE_COLOR_4_VAR >= 6) {
					CODE_COLOR_4_VAR = 0;
				}
				
				
				if (CODE_COLOR_4_VAR == 0) {
					CODE_COLOR_4_BTN.setBackground(Color.blue);
				}
				
				else if (CODE_COLOR_4_VAR == 1) {
					CODE_COLOR_4_BTN.setBackground(Color.red);
				}
				
				else if (CODE_COLOR_4_VAR == 2) {
					CODE_COLOR_4_BTN.setBackground(Color.yellow);
				}
				
				else if (CODE_COLOR_4_VAR == 3) {
					CODE_COLOR_4_BTN.setBackground(Color.green);
				}
				
				else if (CODE_COLOR_4_VAR == 4) {
					CODE_COLOR_4_BTN.setBackground(Color.orange);
				}
				
				else if (CODE_COLOR_4_VAR == 5) {
					CODE_COLOR_4_BTN.setBackground(Color.magenta);
				}
			}
		});
		
		GUESS_COLOR_1_BTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GUESS_COLOR_1_VAR++;
				
				if (GUESS_COLOR_1_VAR >= 6) {
					GUESS_COLOR_1_VAR = 0;
				}
				
				
				if (GUESS_COLOR_1_VAR == 0) {
					GUESS_COLOR_1_BTN.setBackground(Color.blue);
				}
				
				else if (GUESS_COLOR_4_VAR == 1) {
					GUESS_COLOR_1_BTN.setBackground(Color.red);
				}
				
				else if (GUESS_COLOR_4_VAR == 2) {
					GUESS_COLOR_1_BTN.setBackground(Color.yellow);
				}
				
				else if (GUESS_COLOR_4_VAR == 3) {
					GUESS_COLOR_1_BTN.setBackground(Color.green);
				}
				
				else if (GUESS_COLOR_4_VAR == 4) {
					GUESS_COLOR_1_BTN.setBackground(Color.orange);
				}
				
				else if (GUESS_COLOR_4_VAR == 5) {
					GUESS_COLOR_1_BTN.setBackground(Color.magenta);
				}
			}
		});
		
		GUESS_COLOR_2_BTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GUESS_COLOR_2_VAR++;
				
				if (GUESS_COLOR_2_VAR >= 6) {
					GUESS_COLOR_2_VAR = 0;
				}
				
				
				if (GUESS_COLOR_2_VAR == 0) {
					GUESS_COLOR_2_BTN.setBackground(Color.blue);
				}
				
				else if (GUESS_COLOR_2_VAR == 1) {
					GUESS_COLOR_2_BTN.setBackground(Color.red);
				}
				
				else if (GUESS_COLOR_2_VAR == 2) {
					GUESS_COLOR_2_BTN.setBackground(Color.yellow);
				}
				
				else if (GUESS_COLOR_2_VAR == 3) {
					GUESS_COLOR_2_BTN.setBackground(Color.green);
				}
				
				else if (GUESS_COLOR_2_VAR == 4) {
					GUESS_COLOR_2_BTN.setBackground(Color.orange);
				}
				
				else if (GUESS_COLOR_2_VAR == 5) {
					GUESS_COLOR_2_BTN.setBackground(Color.magenta);
				}
			}
		});
		
		GUESS_COLOR_3_BTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GUESS_COLOR_3_VAR++;
				
				if (GUESS_COLOR_3_VAR >= 6) {
					GUESS_COLOR_3_VAR = 0;
				}
				
				
				if (GUESS_COLOR_3_VAR == 0) {
					GUESS_COLOR_3_BTN.setBackground(Color.blue);
				}
				
				else if (GUESS_COLOR_3_VAR == 1) {
					GUESS_COLOR_3_BTN.setBackground(Color.red);
				}
				
				else if (GUESS_COLOR_3_VAR == 2) {
					GUESS_COLOR_3_BTN.setBackground(Color.yellow);
				}
				
				else if (GUESS_COLOR_3_VAR == 3) {
					GUESS_COLOR_3_BTN.setBackground(Color.green);
				}
				
				else if (GUESS_COLOR_3_VAR == 4) {
					GUESS_COLOR_3_BTN.setBackground(Color.orange);
				}
				
				else if (GUESS_COLOR_3_VAR == 5) {
					GUESS_COLOR_3_BTN.setBackground(Color.magenta);
				}
			}
		});
		
		GUESS_COLOR_4_BTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GUESS_COLOR_4_VAR++;
				
				if (GUESS_COLOR_4_VAR >= 6) {
					GUESS_COLOR_4_VAR = 0;
				}
				
				
				if (GUESS_COLOR_4_VAR == 0) {
					GUESS_COLOR_4_BTN.setBackground(Color.blue);
				}
				
				else if (GUESS_COLOR_4_VAR == 1) {
					GUESS_COLOR_4_BTN.setBackground(Color.red);
				}
				
				else if (GUESS_COLOR_4_VAR == 2) {
					GUESS_COLOR_4_BTN.setBackground(Color.yellow);
				}
				
				else if (GUESS_COLOR_4_VAR == 3) {
					GUESS_COLOR_4_BTN.setBackground(Color.green);
				}
				
				else if (GUESS_COLOR_4_VAR == 4) {
					GUESS_COLOR_4_BTN.setBackground(Color.orange);
				}
				
				else if (GUESS_COLOR_4_VAR == 5) {
					GUESS_COLOR_4_BTN.setBackground(Color.magenta);
				}
			}
		});
		
		GUESS_CODE_OK_BTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//LAST TRYS
				
				
				
				CORRECT_COLOR = 0;
				CORRECT_POSITION = 0;
				TRYS_VAR++;
				
				
				PERCENT_VAR = TRYS_VAR * 100 / DIFFICULTY_VAR;
				TRYS_DISPLAY_LBL.setValue(PERCENT_VAR);
				contentPane.add(TRYS_DISPLAY_LBL);
				contentPane.repaint();
				
				
				
				if (TRYS_VAR <= DIFFICULTY_VAR) {
					
				
				
				JButton LAST_TRY_1 = new JButton("");
				
				if (GUESS_COLOR_1_VAR == 0) {
					LAST_TRY_1.setBackground(Color.blue); 
				
				}
				
				else if (GUESS_COLOR_1_VAR == 1) {
					LAST_TRY_1.setBackground(Color.red); 

				}
				else if (GUESS_COLOR_1_VAR == 2) {
					LAST_TRY_1.setBackground(Color.yellow); 
				}
				else if (GUESS_COLOR_1_VAR == 3) {
					LAST_TRY_1.setBackground(Color.green); 
				}
				else if (GUESS_COLOR_1_VAR == 4) {
					LAST_TRY_1.setBackground(Color.orange); 
				}
				else if (GUESS_COLOR_1_VAR == 5) {
					LAST_TRY_1.setBackground(Color.magenta); 
				}
				
				
				
				LAST_TRY_1.setEnabled(false);
				LAST_TRY_1.setBounds(X_POSITION_LAST_TRY_VAR, 30, 40, 40);
				contentPane.add(LAST_TRY_1);
				
				
				
				
				JButton LAST_TRY_2 = new JButton("");
				
				if (GUESS_COLOR_1_VAR == 0) {
					LAST_TRY_2.setBackground(Color.blue); 
				}
				
				else if (GUESS_COLOR_1_VAR == 1) {
					LAST_TRY_2.setBackground(Color.red); 
				}
				else if (GUESS_COLOR_1_VAR == 2) {
					LAST_TRY_2.setBackground(Color.yellow); 
				}
				else if (GUESS_COLOR_1_VAR == 3) {
					LAST_TRY_2.setBackground(Color.green); 
				}
				else if (GUESS_COLOR_1_VAR == 4) {
					LAST_TRY_2.setBackground(Color.orange); 
				}
				else if (GUESS_COLOR_1_VAR == 5) {
					LAST_TRY_2.setBackground(Color.magenta); 
				}
				
				LAST_TRY_2.setEnabled(false);
				LAST_TRY_2.setBounds(X_POSITION_LAST_TRY_VAR, 120, 40, 40);
				contentPane.add(LAST_TRY_2);
				
				
				
				JButton LAST_TRY_3 = new JButton("");
				
				if (GUESS_COLOR_1_VAR == 0) {
					LAST_TRY_3.setBackground(Color.blue); 
				}
				
				else if (GUESS_COLOR_1_VAR == 1) {
					LAST_TRY_3.setBackground(Color.red); 
				}
				else if (GUESS_COLOR_1_VAR == 2) {
					LAST_TRY_3.setBackground(Color.yellow); 
				}
				else if (GUESS_COLOR_1_VAR == 3) {
					LAST_TRY_3.setBackground(Color.green); 
				}
				else if (GUESS_COLOR_1_VAR == 4) {
					LAST_TRY_3.setBackground(Color.orange); 
				}
				else if (GUESS_COLOR_1_VAR == 5) {
					LAST_TRY_3.setBackground(Color.magenta); 
				}
				
				LAST_TRY_3.setEnabled(false);
				LAST_TRY_3.setBounds(X_POSITION_LAST_TRY_VAR, 210, 40, 40);
				contentPane.add(LAST_TRY_3);
				
				JButton LAST_TRY_4 = new JButton("");
				
				if (GUESS_COLOR_1_VAR == 0) {
					LAST_TRY_4.setBackground(Color.blue); 
				}
				
				else if (GUESS_COLOR_1_VAR == 1) {
					LAST_TRY_4.setBackground(Color.red); 
				}
				else if (GUESS_COLOR_1_VAR == 2) {
					LAST_TRY_4.setBackground(Color.yellow); 
				}
				else if (GUESS_COLOR_1_VAR == 3) {
					LAST_TRY_4.setBackground(Color.green); 
				}
				else if (GUESS_COLOR_1_VAR == 4) {
					LAST_TRY_4.setBackground(Color.orange); 
				}
				else if (GUESS_COLOR_1_VAR == 5) {
					LAST_TRY_4.setBackground(Color.magenta); 
				}
				
				LAST_TRY_4.setEnabled(false);
				LAST_TRY_4.setBounds(X_POSITION_LAST_TRY_VAR, 300, 40, 40);
				contentPane.add(LAST_TRY_4);
				

				TEMP_CODE_COLOR_1_VAR = CODE_COLOR_1_VAR;
				TEMP_CODE_COLOR_2_VAR = CODE_COLOR_2_VAR;
				TEMP_CODE_COLOR_3_VAR = CODE_COLOR_3_VAR;
				TEMP_CODE_COLOR_4_VAR = CODE_COLOR_4_VAR;
				
				if (GUESS_COLOR_1_VAR == TEMP_CODE_COLOR_1_VAR) {
					CORRECT_COLOR++;
					TEMP_CODE_COLOR_1_VAR = -10;
				}
				else if (GUESS_COLOR_1_VAR == TEMP_CODE_COLOR_2_VAR) {
					CORRECT_COLOR++;
					TEMP_CODE_COLOR_2_VAR = -10;
				}
				else if (GUESS_COLOR_1_VAR == TEMP_CODE_COLOR_3_VAR) {
					CORRECT_COLOR++;
					TEMP_CODE_COLOR_3_VAR = -10;
				}
				else if (GUESS_COLOR_1_VAR == TEMP_CODE_COLOR_4_VAR) {
					CORRECT_COLOR++;
					TEMP_CODE_COLOR_4_VAR = -10;
				}
				
				if (GUESS_COLOR_2_VAR == TEMP_CODE_COLOR_1_VAR) {
					CORRECT_COLOR++;
					TEMP_CODE_COLOR_1_VAR = -10;
				}
				else if (GUESS_COLOR_2_VAR == TEMP_CODE_COLOR_2_VAR) {
					CORRECT_COLOR++;
					TEMP_CODE_COLOR_2_VAR = -10;
				}
				else if (GUESS_COLOR_2_VAR == TEMP_CODE_COLOR_3_VAR) {
					CORRECT_COLOR++;
					TEMP_CODE_COLOR_3_VAR = -10;
				}
				else if (GUESS_COLOR_2_VAR == TEMP_CODE_COLOR_4_VAR) {
					CORRECT_COLOR++;
					TEMP_CODE_COLOR_4_VAR = -10;
				}
				if (GUESS_COLOR_3_VAR == TEMP_CODE_COLOR_1_VAR) {
					CORRECT_COLOR++;
					TEMP_CODE_COLOR_1_VAR = -10;
				}
				else if (GUESS_COLOR_3_VAR == TEMP_CODE_COLOR_2_VAR) {
					CORRECT_COLOR++;
					TEMP_CODE_COLOR_2_VAR = -10;
				}
				else if (GUESS_COLOR_3_VAR == TEMP_CODE_COLOR_3_VAR) {
					CORRECT_COLOR++;
					TEMP_CODE_COLOR_3_VAR = -10;
				}
				else if (GUESS_COLOR_3_VAR == TEMP_CODE_COLOR_4_VAR) {
					CORRECT_COLOR++;
					TEMP_CODE_COLOR_4_VAR = -10;
				}
				if (GUESS_COLOR_4_VAR == TEMP_CODE_COLOR_1_VAR) {
					CORRECT_COLOR++;
					TEMP_CODE_COLOR_1_VAR = -10;
				}
				else if (GUESS_COLOR_4_VAR == TEMP_CODE_COLOR_2_VAR) {
					CORRECT_COLOR++;
					TEMP_CODE_COLOR_2_VAR = -10;
				}
				else if (GUESS_COLOR_4_VAR == TEMP_CODE_COLOR_3_VAR) {
					CORRECT_COLOR++;
					TEMP_CODE_COLOR_3_VAR = -10;
				}
				else if (GUESS_COLOR_4_VAR == TEMP_CODE_COLOR_4_VAR) {
					CORRECT_COLOR++;
					TEMP_CODE_COLOR_4_VAR = -10;
				}
				
				if (GUESS_COLOR_1_VAR == CODE_COLOR_1_VAR) {
					CORRECT_POSITION++;
				}
				if (GUESS_COLOR_2_VAR == CODE_COLOR_2_VAR) {
					CORRECT_POSITION++;
				}
				if (GUESS_COLOR_3_VAR == CODE_COLOR_3_VAR) {
					CORRECT_POSITION++;
				}
				if (GUESS_COLOR_4_VAR == CODE_COLOR_4_VAR) {
					CORRECT_POSITION++;
				}
				
				
		
		JButton LAST_TRY_CORRECT_COLOR_1 = new JButton("");
		
		
		LAST_TRY_CORRECT_COLOR_1.setEnabled(false);
		LAST_TRY_CORRECT_COLOR_1.setBounds(X_POSITION_LAST_TRY_VAR, 400, 15, 15);
		LAST_TRY_CORRECT_COLOR_1.setBackground(Color.white); 
		if (CORRECT_COLOR >= 1) {
			LAST_TRY_CORRECT_COLOR_1.setVisible(true);
		}
		else {
			LAST_TRY_CORRECT_COLOR_1.setVisible(false);
		}
		contentPane.add(LAST_TRY_CORRECT_COLOR_1);
		
		JButton LAST_TRY_CORRECT_COLOR_2 = new JButton("");
		
		
		LAST_TRY_CORRECT_COLOR_2.setEnabled(false);
		LAST_TRY_CORRECT_COLOR_2.setBounds(X_POSITION_LAST_TRY_VAR + 25, 400, 15, 15);
		LAST_TRY_CORRECT_COLOR_2.setBackground(Color.white); 
		if (CORRECT_COLOR >= 2) {
			LAST_TRY_CORRECT_COLOR_2.setVisible(true);
		}
		else {
			LAST_TRY_CORRECT_COLOR_2.setVisible(false);
		}
		contentPane.add(LAST_TRY_CORRECT_COLOR_2);
		
		JButton LAST_TRY_CORRECT_COLOR_3 = new JButton("");
		
		
		LAST_TRY_CORRECT_COLOR_3.setEnabled(false);
		LAST_TRY_CORRECT_COLOR_3.setBounds(X_POSITION_LAST_TRY_VAR, 425, 15, 15);
		LAST_TRY_CORRECT_COLOR_3.setBackground(Color.white); 
		if (CORRECT_COLOR >= 3) {
			LAST_TRY_CORRECT_COLOR_3.setVisible(true);
		}
		else {
			LAST_TRY_CORRECT_COLOR_3.setVisible(false);
		}
		contentPane.add(LAST_TRY_CORRECT_COLOR_3);
		
		JButton LAST_TRY_CORRECT_COLOR_4 = new JButton("");
		
		
		LAST_TRY_CORRECT_COLOR_4.setEnabled(false);
		LAST_TRY_CORRECT_COLOR_4.setBounds(X_POSITION_LAST_TRY_VAR + 25, 425, 15, 15);
		LAST_TRY_CORRECT_COLOR_4.setBackground(Color.white); 
		if (CORRECT_COLOR >= 4) {
			LAST_TRY_CORRECT_COLOR_4.setVisible(true);
		}
		else {
			LAST_TRY_CORRECT_COLOR_4.setVisible(false);
		}
		contentPane.add(LAST_TRY_CORRECT_COLOR_4);
		
		
		
		
		
		
		
		
		JButton LAST_TRY_CORRECT_POSITION_1 = new JButton("");
		
		
		LAST_TRY_CORRECT_POSITION_1.setEnabled(false);
		LAST_TRY_CORRECT_POSITION_1.setBounds(X_POSITION_LAST_TRY_VAR, 460, 15, 15);
		LAST_TRY_CORRECT_POSITION_1.setBackground(Color.black); 
		if (CORRECT_POSITION >= 1) {
			LAST_TRY_CORRECT_POSITION_1.setVisible(true);
		}
		else {
			LAST_TRY_CORRECT_POSITION_1.setVisible(false);
		}
		contentPane.add(LAST_TRY_CORRECT_POSITION_1);
		
		JButton LAST_TRY_CORRECT_POSITION_2 = new JButton("");
		
		
		LAST_TRY_CORRECT_POSITION_2.setEnabled(false);
		LAST_TRY_CORRECT_POSITION_2.setBounds(X_POSITION_LAST_TRY_VAR + 25, 460, 15, 15);
		LAST_TRY_CORRECT_POSITION_2.setBackground(Color.black); 
		if (CORRECT_POSITION >= 2) {
			LAST_TRY_CORRECT_POSITION_2.setVisible(true);
		}
		else {
			LAST_TRY_CORRECT_POSITION_2.setVisible(false);
		}
		contentPane.add(LAST_TRY_CORRECT_POSITION_2);
		
		JButton LAST_TRY_CORRECT_POSITION_3 = new JButton("");
		
		
		LAST_TRY_CORRECT_POSITION_3.setEnabled(false);
		LAST_TRY_CORRECT_POSITION_3.setBounds(X_POSITION_LAST_TRY_VAR, 485, 15, 15);
		LAST_TRY_CORRECT_POSITION_3.setBackground(Color.black); 
		if (CORRECT_POSITION >= 3) {
			LAST_TRY_CORRECT_POSITION_3.setVisible(true);
		}
		else {
			LAST_TRY_CORRECT_POSITION_3.setVisible(false);
		}
		contentPane.add(LAST_TRY_CORRECT_POSITION_3);
		
		JButton LAST_TRY_CORRECT_POSITION_4 = new JButton("");
		
		
		LAST_TRY_CORRECT_POSITION_4.setEnabled(false);
		LAST_TRY_CORRECT_POSITION_4.setBounds(X_POSITION_LAST_TRY_VAR + 25, 485, 15, 15);
		LAST_TRY_CORRECT_POSITION_4.setBackground(Color.black); 
		if (CORRECT_POSITION >= 4) {
			LAST_TRY_CORRECT_POSITION_4.setVisible(true);
		}
		else {
			LAST_TRY_CORRECT_POSITION_4.setVisible(false);
		}
		contentPane.add(LAST_TRY_CORRECT_POSITION_4);
		
		
		
		contentPane.repaint();

		
		if (DIFFICULTY_VAR == 12) {

		X_POSITION_LAST_TRY_VAR = X_POSITION_LAST_TRY_VAR + 85;
		}
		else if (DIFFICULTY_VAR == 16) {

			X_POSITION_LAST_TRY_VAR = X_POSITION_LAST_TRY_VAR + 62;
			}
		if (DIFFICULTY_VAR == 8) {

			X_POSITION_LAST_TRY_VAR = X_POSITION_LAST_TRY_VAR + 133;
			}
		
		
		if (CORRECT_POSITION == 4) {
			GUESS_COLOR_1_BTN.setEnabled(false);
			GUESS_COLOR_2_BTN.setEnabled(false);
			GUESS_COLOR_3_BTN.setEnabled(false);
			GUESS_COLOR_4_BTN.setEnabled(false);

			CODE_COLOR_1_BTN.setVisible(true);
			CODE_COLOR_1_BTN.setEnabled(false);
			CODE_COLOR_2_BTN.setVisible(true);
			CODE_COLOR_2_BTN.setEnabled(false);
			CODE_COLOR_3_BTN.setVisible(true);
			CODE_COLOR_3_BTN.setEnabled(false);
			CODE_COLOR_4_BTN.setVisible(true);
			CODE_COLOR_4_BTN.setEnabled(false);
			
			GUESS_CODE_OK_BTN.setVisible(false);
			
			WIN_LBL.setVisible(true);
		}
		
		else if (TRYS_VAR == DIFFICULTY_VAR) {
			
			GUESS_COLOR_1_BTN.setEnabled(false);
			GUESS_COLOR_2_BTN.setEnabled(false);
			GUESS_COLOR_3_BTN.setEnabled(false);
			GUESS_COLOR_4_BTN.setEnabled(false);

			CODE_COLOR_1_BTN.setVisible(true);
			CODE_COLOR_1_BTN.setEnabled(false);
			CODE_COLOR_2_BTN.setVisible(true);
			CODE_COLOR_2_BTN.setEnabled(false);
			CODE_COLOR_3_BTN.setVisible(true);
			CODE_COLOR_3_BTN.setEnabled(false);
			CODE_COLOR_4_BTN.setVisible(true);
			CODE_COLOR_4_BTN.setEnabled(false);
			
			GUESS_CODE_OK_BTN.setVisible(false);
			
			LOSE_LBL.setVisible(true);
			
		}
		
		
		
		
				}
		
		
		
			}
		});
		
	}
}
