package contentSec;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainPanel extends JFrame { //추후 작성할 것
	
	public static JScrollPane scrollIndexPanel;
	public static Color defaultBackgroundColor = new Color(255, 235, 148);
	public static Color defaultContentColor = new Color(253, 159, 40);
	
	public MainPanel(){
		
		setTitle("Content Page");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    Container c = getContentPane();
	    c.setLayout(new BorderLayout());
	    c.setBackground(defaultBackgroundColor);
	    
	    //제목 라벨 
	    TitlePanel titlePanel = new TitlePanel(this);
	    IndexPanel indexPanel = new IndexPanel(this);
	    scrollIndexPanel = new JScrollPane(new ContentPanel(),JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	    add(scrollIndexPanel,BorderLayout.CENTER);
	    
	    JPanel emptySpace = new JPanel();
	    emptySpace.setPreferredSize(new Dimension(200,500));
	    emptySpace.setBackground(defaultBackgroundColor);
	    add(emptySpace,BorderLayout.EAST); //여백공간..
	    
	    setSize(1500,800);
	    setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MainPanel();
		
		
	}

}
