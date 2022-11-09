package contentSec;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TitlePanel extends JPanel  {  //라벨이 가능하면 라벨로, 안되면 패널로.

	public TitlePanel(MainPanel mp) {
		
		 setLayout(null);
		 setPreferredSize(new Dimension(500,180));//BorderLayout에서 Component의 크기 설정
		 setBackground(MainPanel.defaultBackgroundColor);
		 
		 JLabel title = new JLabel("I want to be a Developer");
		 title.setFont(new Font("G마켓 산스 TTF", Font.PLAIN, 25));
		 title.setBounds(30, 20, 300, 100);
		 add(title); //제목 
		 
		 JLabel language = new JLabel("JavaScript");
		 language.setFont(new Font("G마켓 산스 TTF", Font.BOLD, 60));
		 language.setBounds(610, 90, 400, 60); // 상수 해결할 것.. 추후에
		 add(language); //언어 		 
		 
		 mp.add(this,BorderLayout.NORTH);
	}
	
	
	
}
