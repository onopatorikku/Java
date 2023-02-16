package PerfectPitchPiano;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.*;
import java.io.File;
import java.util.Random;

public class Main {
	
	public static String notePath = "";
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("PerfectPitchPiano");
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		frame.add(panel);
		
		//Button for generating notes
		JButton randomButton = new JButton("Generate note");
		panel.add(randomButton);
		
		randomButton.addActionListener(randomButtonListener);
		
		//Buttons for playing notes
		JButton noteButton1 = new JButton("C");
		panel.add(noteButton1);
		JButton noteButton2 = new JButton("C#");
		panel.add(noteButton2);
		JButton noteButton3 = new JButton("D");
		panel.add(noteButton3);
		JButton noteButton4 = new JButton("D#");
		panel.add(noteButton4);
		JButton noteButton5 = new JButton("E");
		panel.add(noteButton5);
		JButton noteButton6 = new JButton("F");
		panel.add(noteButton6);
		JButton noteButton7 = new JButton("F#");
		panel.add(noteButton7);
		JButton noteButton8 = new JButton("G");
		panel.add(noteButton8);
		JButton noteButton9 = new JButton("G#");
		panel.add(noteButton9);
		JButton noteButton10 = new JButton("A");
		panel.add(noteButton10);
		JButton noteButton11 = new JButton("Bb");
		panel.add(noteButton11);
		JButton noteButton12 = new JButton("B");
		panel.add(noteButton12);
		
		//Adding listeners for other notes
		noteButton1.addActionListener(cNoteButtonListener);
		noteButton2.addActionListener(cSharpNoteButtonListener);
		noteButton3.addActionListener(dNoteButtonListener);
		noteButton4.addActionListener(dSharpNoteButtonListener);
		noteButton5.addActionListener(eNoteButtonListener);
		noteButton6.addActionListener(fNoteButtonListener);
		noteButton7.addActionListener(fSharpNoteButtonListener);
		noteButton8.addActionListener(gNoteButtonListener);
		noteButton9.addActionListener(gSharpNoteButtonListener);
		noteButton10.addActionListener(aNoteButtonListener);
		noteButton11.addActionListener(bFlatNoteButtonListener);
		noteButton12.addActionListener(bNoteButtonListener);
		
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public static int note;
	public static int randomNr;
	
	public static Random random = new Random();
	
	//Action listeners
	
		static ActionListener randomButtonListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				randomNr = random.nextInt(12);
				try {
				if(randomNr == 0) {
					notePath = "C.wav";
					PlayNote();
				} else if(randomNr == 1) {
					notePath = "Csharp.wav";
					PlayNote();
				} else if(randomNr == 2) {
					notePath = "D.wav";
					PlayNote();
				} else if(randomNr == 3) {
					notePath = "Dsharp.wav";
					PlayNote();
				} else if(randomNr == 4) {
					notePath = "E.wav";
					PlayNote();
				} else if(randomNr == 5) {
					notePath = "F.wav";
					PlayNote();
				} else if(randomNr == 6) {
					notePath = "Fsharp.wav";
					PlayNote();
				} else if(randomNr == 7) {
					notePath = "G.wav";
					PlayNote();
				} else if(randomNr == 8) {
					notePath = "Gsharp.wav";
					PlayNote();
				} else if(randomNr == 9) {
					notePath = "A.wav";
					PlayNote();
				} else if(randomNr == 10) {
					notePath = "Bflat.wav";
					PlayNote();
				} else if(randomNr == 11) {
					notePath = "B.wav";
					PlayNote();
				}
				} catch(Exception e2) {
					e2.printStackTrace();
				}
			}
		};
		
		 static ActionListener cNoteButtonListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				notePath = "C.wav";
				try {
					PlayNote();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				note = 0;
				if (randomNr == note) {
					JOptionPane.showMessageDialog(null, "Correct!");
				} else {
					JOptionPane.showMessageDialog(null, "Wrong, try again.");
				}
			}
		};
		
		static ActionListener cSharpNoteButtonListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				notePath = "Csharp.wav";
				try {
					PlayNote();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				note = 1;
				if (randomNr == note) {
					JOptionPane.showMessageDialog(null, "Correct!");
				} else {
					JOptionPane.showMessageDialog(null, "Wrong, try again.");
				}
			}
		};
		
		static ActionListener dNoteButtonListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				notePath = "D.wav";
				try {
					PlayNote();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				note = 2;
				if (randomNr == note) {
					JOptionPane.showMessageDialog(null, "Correct!");
				} else {
					JOptionPane.showMessageDialog(null, "Wrong, try again.");
				}
			}
		};
		
		static ActionListener dSharpNoteButtonListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				notePath = "Dsharp.wav";
				try {
					PlayNote();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				note = 3;
				if (randomNr == note) {
					JOptionPane.showMessageDialog(null, "Correct!");
				} else {
					JOptionPane.showMessageDialog(null, "Wrong, try again.");
				}
			}
		};
		
		static ActionListener eNoteButtonListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				notePath = "E.wav";
				try {
					PlayNote();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				note = 4;
				if (randomNr == note) {
					JOptionPane.showMessageDialog(null, "Correct!");
				} else {
					JOptionPane.showMessageDialog(null, "Wrong, try again.");
				}
			}
		};
		
		static ActionListener fNoteButtonListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				notePath = "F.wav";
				try {
					PlayNote();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				note = 5;
				if (randomNr == note) {
					JOptionPane.showMessageDialog(null, "Correct!");
				} else {
					JOptionPane.showMessageDialog(null, "Wrong, try again.");
				}
			}
		};
		
		static ActionListener fSharpNoteButtonListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				notePath = "Fsharp.wav";
				try {
					PlayNote();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				note = 6;
				if (randomNr == note) {
					JOptionPane.showMessageDialog(null, "Correct!");
				} else {
					JOptionPane.showMessageDialog(null, "Wrong, try again.");
				}
			}
		};
		
		static ActionListener gNoteButtonListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				notePath = "G.wav";
				try {
					PlayNote();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				note = 7;
				if (randomNr == note) {
					JOptionPane.showMessageDialog(null, "Correct!");
				} else {
					JOptionPane.showMessageDialog(null, "Wrong, try again.");
				}
			}
		};
		
		static ActionListener gSharpNoteButtonListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				notePath = "Gsharp.wav";
				try {
					PlayNote();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				note = 8;
				if (randomNr == note) {
					JOptionPane.showMessageDialog(null, "Correct!");
				} else {
					JOptionPane.showMessageDialog(null, "Wrong, try again.");
				}
			}
		};
		
		static ActionListener aNoteButtonListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				notePath = "A.wav";
				try {
					PlayNote();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				note = 9;
				if (randomNr == note) {
					JOptionPane.showMessageDialog(null, "Correct!");
				} else {
					JOptionPane.showMessageDialog(null, "Wrong, try again.");
				}
			}
		};
		
		static ActionListener bFlatNoteButtonListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				notePath = "Bflat.wav";
				try {
					PlayNote();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				note = 10;
				if (randomNr == note) {
					JOptionPane.showMessageDialog(null, "Correct!");
				} else {
					JOptionPane.showMessageDialog(null, "Wrong, try again.");
				}
			}
		};
		
		static ActionListener bNoteButtonListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				notePath = "B.wav";
				try {
					PlayNote();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				note = 11;
				if (randomNr == note) {
					JOptionPane.showMessageDialog(null, "Correct!");
				} else {
					JOptionPane.showMessageDialog(null, "Wrong, try again.");
				}
			}
		};
		
		//Method for playing sounds
		public static void PlayNote() throws Exception{
			File file = new File(notePath);
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
			Clip clip = AudioSystem.getClip();
			clip.open(audioStream);
			clip.start();
		}
}

