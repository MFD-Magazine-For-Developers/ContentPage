package contentSec;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainPanel extends JFrame { //추후 작성할 것
	
	public MainPanel(){
		
		setTitle("Content Page");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    Container c = getContentPane();
	    c.setLayout(new BorderLayout());
	    c.setBackground(new Color(255, 235, 148));
	    
	    //제목 라벨 
	    TitlePanel titlePanel = new TitlePanel(this);
	    IndexPanel indexPanel = new IndexPanel(this);
	    JScrollPane scrollIndexPanel = new JScrollPane(new ContentPanel(),JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	    add(scrollIndexPanel,BorderLayout.CENTER);
	    
	    
	    setSize(1500,800);
	    setVisible(true);
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MainPanel();
		
		
	}

}
