package dd;


import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;


public class OpenWebPageWithinApplet extends Applet implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7014069759869361465L;
	Button btn;
	TextField textUrl;
	
	public void init() {
		textUrl = new TextField();
		btn = new Button("Lets Click");
		btn.setPreferredSize(new Dimension(100,50));
		this.setSize(new Dimension(100,50));
		btn.setVisible(true);
		btn.setFocusable(true);
		add(btn);
		this.add(btn);
		this.setVisible(true);
		btn.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == btn) {
			try {
				URL url = new URL("http://"+textUrl.getText()+" ");
				System.out.println(url);
				AppletContext context = getAppletContext();
				context.showDocument(url,"_self");
						
			}
			catch(MalformedURLException mfe) {
				mfe.printStackTrace();
			}
		}
	}

}
