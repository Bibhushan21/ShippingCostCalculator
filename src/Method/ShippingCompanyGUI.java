package Method;

import javax.swing.*;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


	public class ShippingCompanyGUI extends JFrame implements ActionListener {
	    private JTextField laptopField;
	    private JTextField mouseField;
	    private JTextField desktopField;
	    private JTextField lcdScreensField;
	    private JButton submitButton;

	    public ShippingCompanyGUI() {
	        setTitle("Shipping Company");
	        setBounds(550, 200,600,500);

	        JPanel panel = new JPanel();
	        panel.setLayout(new GridLayout(5, 2,10,50));
	        
	        JLabel label = new JLabel("WELCOME TO BIBHUSHAN SHIPPING .CO");

	        JLabel laptopLabel = new JLabel("Laptop quantity:");
	        laptopField = new JTextField();
	        JLabel mouseLabel = new JLabel("Mouse quantity:");
	        mouseField = new JTextField();
	        JLabel desktopLabel = new JLabel("Desktop quantity:");
	        desktopField = new JTextField();
	        JLabel lcdScreensLabel = new JLabel("LCD screens quantity:");
	        lcdScreensField = new JTextField();
	        
	        
	        panel.setBackground(Color.GRAY);
	        desktopLabel.setFont(new Font ("MV Boil",Font.PLAIN,20));
	        mouseLabel.setFont(new Font ("MV Boil",Font.PLAIN,20));
	        lcdScreensLabel.setFont(new Font ("MV Boil",Font.PLAIN,20));
	        laptopLabel.setFont(new Font ("MV Boil",Font.PLAIN,20));

	        submitButton = new JButton("Submit");
	        submitButton.addActionListener(this);
	       

	        panel.add(laptopLabel);
	        panel.add(laptopField);
	        panel.add(mouseLabel);
	        panel.add(mouseField);
	        panel.add(desktopLabel);
	        panel.add(desktopField);
	        panel.add(lcdScreensLabel);
	        panel.add(lcdScreensField);
	        panel.add(new JLabel());
	        panel.add(submitButton);

	        add(panel);

	        setSize(600, 500);
	        setVisible(true);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }

	    public void actionPerformed(ActionEvent e) {
	    try {    if (e.getSource() == submitButton) {
	            int laptopQty = Integer.parseInt(laptopField.getText());
	            int mouseQty = Integer.parseInt(mouseField.getText());
	            int desktopQty = Integer.parseInt(desktopField.getText());
	            int lcdScreensQty = Integer.parseInt(lcdScreensField.getText());
	            submitButton.addActionListener(f -> System.out.println("ERROR"));

	            Calculation calculation = new Calculation();
	            calculation.addItems();
	            calculation.addOrder(laptopQty, mouseQty, desktopQty, lcdScreensQty);
	            calculation.totalVolume();
	            calculation.totalWeight();

	            JOptionPane.showMessageDialog(this, "Order submitted!");

	            calculation.bestShipping();
	            calculation.printOrder();
	            calculation.shippingPrice();
                
	        }  
	    }catch(NumberFormatException f){
       	System.out.println("InValid Format - PLEASE PUT Valid INPUT");
	    }
	    }

	    
	    
	}





