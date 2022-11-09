package contentSec;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IndexPanel extends JPanel {

	public IndexPanel(MainPanel mp) {
		
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		setPreferredSize(new Dimension(300,500));//BorderLayout에서 Component의 크기 설정
		setBackground(MainPanel.defaultBackgroundColor);
		
		JLabel headingText = new JLabel("<html><br> &nbsp &nbsp &nbsp  인덱스 </html>");
		 headingText.setFont(new Font("forte",Font.BOLD, 35));
		 headingText.setAlignmentX(Component.CENTER_ALIGNMENT);
		 add(headingText); //제목 		 
		 
		 ContentPanelEx1 ex1 = new ContentPanelEx1();
		 ContentPanelEx2 ex2 = new ContentPanelEx2();
		 ContentPanelEx3 ex3 = new ContentPanelEx3();
		 ContentPanelEx4 ex4 = new ContentPanelEx4();
		 
		 class MyActionListener implements ActionListener { //버튼 이벤트 리스너
			 public void actionPerformed(ActionEvent e) {
				
				 JButton btn =  (JButton)e.getSource();
				 String textInBtn = btn.getText();
				 
				 if(textInBtn.equals("btn1")) {  // 일단은 버튼 이름에 따라서 화면이 나오는 화면이 결정되게끔 했습니다.
					 MainPanel.scrollIndexPanel.setViewportView(ex1);
				 } else if(textInBtn.equals("btn2")) {
					 MainPanel.scrollIndexPanel.setViewportView(ex2);
				 } else if(textInBtn.equals("btn3")) {
					 MainPanel.scrollIndexPanel.setViewportView(ex3);
				 } else if(textInBtn.equals("btn4")) {
					 MainPanel.scrollIndexPanel.setViewportView(ex4);
				 } 
				mp.validate();
				mp.repaint();
			 }
		}
		 
		 
		 JButton[] btnArr = new JButton[4];
		 
		 for(int i = 0; i<btnArr.length; i++) {
			 btnArr[i] = new JButton("btn"+(i+1));
			 btnArr[i].setAlignmentX(Component.CENTER_ALIGNMENT);
			 btnArr[i].addActionListener(new MyActionListener());
		     this.add(Box.createVerticalStrut(25));
			 add(btnArr[i]);
		 }
		 
		 mp.add(this,BorderLayout.WEST);
	}
}

