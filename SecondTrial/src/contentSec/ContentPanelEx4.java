package contentSec;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ContentPanelEx4 extends JPanel  {

	int defaultX = 100;
	int defaultMarginY = 50;
	int defaultDesWidth = 900;
	public Font defaultFontsStyle_big =  new Font("forte",Font.BOLD, 35);
	public Font defaultFontsStyle_small =  new Font("forte",Font.BOLD, 15);
	public Font defaultFontsStyle_smaller =  new Font("forte",Font.PLAIN, 10);

	public ContentPanelEx4 () {
		
		setLayout(null);
		setBackground(MainPanel.defaultContentColor);	
		setPreferredSize(new Dimension(1000,5000));

		JLabel intro_H = new JLabel("<html>페이지Ex4</html>");
		intro_H.setFont(defaultFontsStyle_big);
		intro_H.setBounds(defaultX, defaultMarginY, 250, 70);
		add(intro_H); //js 소개
		
//		
//		String intro_str = "Js(Java Script)는 프로그래밍 언어이며  서버 개발, 앱 개발 등 다양한 목적을 위해 사용할 수 있는 언어이지만, 주된 활동 분야는 **\"웹 개발\"** 입니다. \r\n"
//				+ "<br>"
//				+ "웹 페이지는 기본적으로 다음과 같은 요소들로 이루어져 있습니다.<br>"
//				+ "<br>"
//				+ "HTML : HTML 은 웹 콘텐츠의 구조를 짜고 의미를 부여하는 마크업 언어입니다. 예를 들어 페이지의 어디가 문단이고, 헤딩이고, 데이터 표와 외부 이미지/비디오인지 정의합니다. 웹 페이지의 뼈대를 담당합니다.";
//		JLabel intro_des = new JLabel("<html><p>"+ intro_str + "</p></html>");
//		intro_des.setFont(defaultFontsStyle_small);
//		intro_des.setBounds(defaultX, defaultMarginY, defaultDesWidth, 300); //이 왜 돼? 저절로 인식해주나? 
//		add(intro_des);
//		
//		ImageIcon intro_html_img = new ImageIcon("imges/intro_html.png");
//		JLabel intro_html_label = new JLabel(intro_html_img);
//		intro_html_label.setBounds(defaultX, 300, defaultDesWidth, 300);
//		add(intro_html_label);
//		
//		
//		 String img_des_str1 = "왼쪽은 화면이고 오른쪽은 html 파일의 소스코드입니다."+ "<br>" 
//		 		+ "웹페이지에 넣고자 하는 컨텐츠를 html을 사용하여 화면에 그릴 수(렌더링) 있습니다. ";
//		 JLabel img_des1 = new JLabel("<html><p>"+ img_des_str1 + "</p></html>");
//		 img_des1.setFont(defaultFontsStyle_small);
//		 img_des1.setBounds(defaultX, 480 , defaultDesWidth, 300); //이 왜 돼? 저절로 인식해주나? 
//		 add(img_des1);
//		
//		 String intro_css_label = "CSS:  HTML 콘텐츠에 스타일을 적용할 수 있는 스타일 규칙 언어입니다. 배경색을 추가하고, 글꼴을 바꾸고," +"<br>"
//		 		+ "콘텐츠를 신문처럼 다열 레이아웃으로 배치할 수 있습니다.)";
//		 
//		 
		 
		 
		 
		
		

		
	}
	
	
}
