package contentSec;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IndexPanel extends JPanel {

	public IndexPanel(MainPanel mp) {
		
		setLayout(null);
		setPreferredSize(new Dimension(300,500));//BorderLayout에서 Component의 크기 설정
		setBackground(Color.blue);		
		
		 JLabel headingText = new JLabel("<html>인덱스</html>");
		 headingText.setFont(new Font("G마켓 산스 TTF", Font.PLAIN, 25));
		 headingText.setBounds(30, 20, 300, 100);
		 add(headingText); //제목 
		 
		 mp.add(this,BorderLayout.WEST);
		
	}
	
	
}
