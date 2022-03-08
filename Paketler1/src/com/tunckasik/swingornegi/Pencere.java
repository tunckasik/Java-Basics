
package com.tunckasik.swingornegi;

import javax.swing.*;

public class Pencere {
    
    
    private JFrame frame;
    
    public Pencere() {
        frame = new JFrame();
        
        JButton button1 = new JButton("Click");
        
        button1.setBounds(100,100,100,25);
        
        frame.add(button1);
        
        frame.setSize(400,500);
        
        frame.setLayout(null);
        
        frame.setVisible(true);
        
        
    }
    
    
}
