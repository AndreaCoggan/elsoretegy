import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EasyButton implements MouseListener {
	public static void main(String[]args){
		new EasyButton();
		
	}
	public EasyButton(){
		showEasyButton();
		easyButtonImage.addMouseListener(this);
	}

	

	JLabel easyButtonImage;

	private void showEasyButton() {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		URL url = null;
		try {
			url = new URL(
					"https://github.com/jointheleague/league-images/blob/master/easy_button.jpg?raw=true");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		Icon icon = new ImageIcon(url);
		this.easyButtonImage = new JLabel(icon);
		quizWindow.add(easyButtonImage);
		quizWindow.pack();
	}

	private void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		speak("that was easy");
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
