import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class sounds implements ActionListener {
	JFrame frame = new JFrame("Click To Hear The Animal Sounds");
	JPanel panel = new JPanel();
	JButton button = new JButton("Llama");
	JButton button1 = new JButton("Cat");
	JButton button2 = new JButton("Cow");
	JButton button3 = new JButton("Duck");
	JButton button4 = new JButton("Dog");
	 
	public static void main(String[] args) {

	new sounds().createUI();
}
 public void createUI() {
	 frame.add(panel);
		panel.add(button);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		
		frame.setVisible(true);
		
		frame.pack();
	 button.addActionListener(this);
	 button1.addActionListener(this);
	 button2.addActionListener(this);
	 button3.addActionListener(this);
	 button4.addActionListener(this);
 }
public void playNoise(String soundFile) {
	try {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
		sound.play();
		Thread.sleep(3400);
	} catch (Exception ex) {
		ex.printStackTrace();
	}
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
		if (e.getSource()== button) {
		playNoise("llama.wav");
	}
	else if (e.getSource()== button1) {
		playNoise("meow.wav");
	}
	else if (e.getSource()== button2) {
		playNoise("moo.wav");
	}
	else if (e.getSource()== button3) {
		playNoise("quack.wav");
	}
	else if (e.getSource()== button4) {
		playNoise("woof.wav");
	}

}
}
