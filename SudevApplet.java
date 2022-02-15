
import java.applet.Applet;
import java.awt.*;


 /*
 <applet code="SudevApplet.class" width=600 height=400 background-color="grey">
 </applet>
 */
public class SudevApplet extends Applet { 
   
	    
	
    public void paint(Graphics g) {
    	
        int x[]={120, 220, 30};
        int y[]={30, 220, 220};
	
    	g.setColor(Color.red);
        g.drawPolygon(x,y,3);
        g.fillPolygon(x,y,3);
    	
    	    	
        g.setColor(Color.green);
    	g.drawOval(220,40,200,120);
    	g.setColor(Color.blue);
    	g.fillOval(220,40,200,120);
    	
    	setBackground(Color.CYAN);
    }
}