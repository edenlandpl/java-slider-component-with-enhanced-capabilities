package suwakbeans;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class Okno extends JPanel {

	public Suwak suwak;
        public SuwakTester suwakTester;
        public SuwakPanel suwakPanel;
	public Okno(){
		
		super();
                this.setPreferredSize(new Dimension(800,400));	
		this.setSize(this.getPreferredSize());		
		this.setLayout(new FlowLayout());		
		this.setBackground(Color.lightGray);
                this.add(this.createSuwak());	
		this.add(this.createSuwakTester());
                this.add(this.createSuwakPanel());
		this.setVisible(true);
	}
        
        private Suwak createSuwak(){		
		if(this.suwak == null){			
			this.suwak = new Suwak();
		}		
		return this.suwak;
	}
        private SuwakTester createSuwakTester(){		
		if(this.suwakTester == null){			
			this.suwakTester = new SuwakTester();
		}		
		return this.suwakTester;
	}
                private SuwakPanel createSuwakPanel(){		
		if(this.suwakPanel == null){			
			this.suwakPanel = new SuwakPanel();
		}		
		return this.suwakPanel;
	}
}