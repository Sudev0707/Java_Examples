/**
 * @(#)DevApplet.java
 *
 *
 * @author 
 * @version 1.00 2022/2/13
 */

import java.applet.*;
import java.awt.*;

/*
 <applet code="DevApplet.class" width=400 height=600>
 </applet>
 */

public class DevApplet extends Applet {
    
    
    public void paint(Graphics g) {
    	g.setColor(Color.green);
    	g.drawRect(40,40,100,100);
    	g.setColor(Color.red);
    	g.fillRect(40,40,100,100);
    	
    	g.setColor(Color.green);
    	g.drawOval(150,150,150,150);
    	g.setColor(Color.blue);
    	g.fillOval(150,150,150,150);
    }
}