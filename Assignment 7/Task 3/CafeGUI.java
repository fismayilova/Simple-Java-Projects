package task3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * GUI for the Checkout class
 * 
 * @author Emil Neo
 * 
 *  Requirements: 
 *  	Name: Must be a String
 * 		Price: Must contain only integers (ex $1 -> 100) 
 * 		Weight: Must be a double Price/lbs, Price/doz, 
 *  	Number: Must contain only integers
 */
public class CafeGUI extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private Checkout checkout = new Checkout();
	private final static int INFO_SIZE = 30;
	private JTextField _info = new JTextField("Number of Items: 0", 100);

	private String bnames[] = { "Pizza", "Peanut", "Baklava", "Mixed Pizza" };
	// private String lnames[]={"Name", "Price", "Weight", "Price/lbs", "Price/doz", "Number"};
	private String lnames[] = { "Name", "Price", "Weight", "Price/lbs",
			"Price/doz", "Number", "Topping", "Topping Cost" };
	private String bnames2[] = { "Enter", "Total", "Reset" };
	private String mnames[] = { "Reset", "Exit" };

	private JButton buttons[];
	private JLabel labels[];
	private JButton buttons2[];
	private JTextField tfields[];
	private JMenuItem menuitems[];

	private JMenuBar bar = new JMenuBar();
	private JMenu file = new JMenu("File");
	private int selecteditem = 0;

	/**
	 * Declares the Labels
	 */
	private void setlabels() {
		labels = new JLabel[lnames.length];
		for (int i = 0; i < lnames.length; i++) {
			labels[i] = new JLabel(lnames[i]);
			labels[i].setHorizontalAlignment(SwingConstants.CENTER);
			labels[i].setEnabled(false);
		}
	}

	/**
	 * Declares the Buttons
	 */
	private void setbuttons() {
		buttons = new JButton[bnames.length];
		for (int i = 0; i < bnames.length; i++) {
			buttons[i] = new JButton(bnames[i]);
			buttons[i].addActionListener(this);

		}
	}

	/**
	 * Declares the TextField
	 */
	private void settextfield() {
		tfields = new JTextField[lnames.length];
		for (int i = 0; i < lnames.length; i++) {
			tfields[i] = new JTextField(INFO_SIZE);
			tfields[i].setEnabled(false);
		}
	}

	/**
	 * Declares the Enter and Total Buttons
	 */
	private void setbutton2() {
		buttons2 = new JButton[bnames2.length];
		for (int i = 0; i < bnames2.length; i++) {
			buttons2[i] = new JButton(bnames2[i]);
			buttons2[i].addActionListener(this);
		}
	}

	private void setmenubar() {
		menuitems = new JMenuItem[mnames.length];
		for (int i = 0; i < mnames.length; i++) {
			menuitems[i] = new JMenuItem(mnames[i]);
			menuitems[i].addActionListener(this);
		}

	}

	/**
	 * Constructor
	 * @param checkout
	 */
	public CafeGUI(Checkout checkout) {
		super("CafeGUI");
		checkout = this.checkout;
		setSize(600, 300);
		setLocation(200, 200);
		setlabels();
		setbuttons();
		settextfield();
		setbutton2();
		setmenubar();
		ContainerSetup();
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();

		if (source == menuitems[0] || source == buttons2[2]) // Reset
		{
			checkout.clear();
			_info.setText("Number of Items: 0");
			resetInfo();
			enableButtonsAll();
			disableInfoAll();
		} else if (source == menuitems[1]) // Exit
		{
			System.exit(1);
		} else if (source == buttons[0]) // Pizza
		{
			enableInfo(0); // name
			enableInfo(1); // price
			// enableInfo(5); //number
			selecteditem = 0;
		} else if (source == buttons[1]) // Peanut
		{
			enableInfo(0); // name
			enableInfo(3); // price/lbs
			enableInfo(2); // weight
			// enableInfo(5); //number
			selecteditem = 1;
		} else if (source == buttons[2]) // Baklava
		{
			enableInfo(0); // name
			// enableInfo(1); //price
			enableInfo(4); // price/doz
			enableInfo(5); // number
			selecteditem = 2;
		} else if (source == buttons[3]) // Mixed Pizza
		{
			enableInfo(0); // name
			enableInfo(1); // price
			// enableInfo(4); //price/doz
			// enableInfo(5); //number
			enableInfo(6); // topping
			enableInfo(7); // topping cost
			selecteditem = 3;
		} else if (source == buttons2[0]) // Enter
		{
			enableButtonsAll();
			disableInfoAll();

			try {
				switch (selecteditem) {
				case 0: // Ice Cream
					checkout.enterItem(new Pizza(tfields[0].getText(),
							Integer.parseInt(tfields[1].getText())));
					break;
				case 1: // Candy
					checkout.enterItem(new Peanut(tfields[0].getText(), Double
							.parseDouble(tfields[2].getText()), Integer
							.parseInt(tfields[3].getText())));
					break;
				case 2: // Baked Goods
					checkout.enterItem(new Baklava(tfields[0].getText(), Integer
							.parseInt(tfields[5].getText()), Integer
							.parseInt(tfields[4].getText())));
					break;
				case 3: // Sundae
					checkout.enterItem(new MixedPizza(tfields[0].getText(),
					// Integer.parseInt(tfields[5].getText()),
							Integer.parseInt(tfields[1].getText()), tfields[6]
									.getText(), Integer.parseInt(tfields[7]
									.getText())));
					break;
				} // end switch

				_info.setText("Number of items: " + checkout.numberOfItems());
			} // end try

			catch (Exception ref) {
				_info.setText("Invalid Entry, Number of Items: "
						+ checkout.numberOfItems());
			}

			finally {
				resetInfo();
			}
		} else if (source == buttons2[1]) // Total
		{
			new ReceiptGUI(checkout.toString());
			checkout.clear();
			_info.setText("Number of Items: 0");
			resetInfo();
			enableButtonsAll();
			disableInfoAll();
		}

		for (int i = 0; i < buttons.length; i++) // types
		{
			if (source == buttons[i]) {
				disableButtons(i);
			}
		}
	}

	private void resetInfo() {
		for (int i = 0; i < lnames.length; i++) {
			tfields[i].setText("");
		}
	}

	private void disableButtons(int b) {
		for (int i = 0; i < buttons.length; i++) {
			if (b != i)
				buttons[i].setEnabled(false);
		}
	}

	private void enableButtonsAll() {
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].setEnabled(true);
		}
	}

	private void enableInfo(int b) {
		for (int i = 0; i < lnames.length; i++) {
			if (b == i) {
				labels[i].setEnabled(true);
				tfields[i].setEnabled(true);
			}
		} // end for
	}

	private void disableInfoAll() {
		for (int i = 0; i < lnames.length; i++) {
			labels[i].setEnabled(false);
			tfields[i].setEnabled(false);
		}
	}

	class ReceiptGUI {

		private JTextArea text = new JTextArea();
		private JFrame receipt = new JFrame("Receipt");

		public ReceiptGUI(String info) {
			Container p = receipt.getContentPane();
			receipt.setSize(235, 600);
			p.add(new JScrollPane(text), BorderLayout.CENTER);
			text.setText(info);
			text.setEditable(false);
			text.setFont(new Font("Monospaced", Font.PLAIN, 12));
			receipt.setVisible(true);
		}
	}

	private void ContainerSetup() {
		Container c = getContentPane();

		for (int i = 0; i < mnames.length; i++)
			file.add(menuitems[i]);
		bar.add(file);
		setJMenuBar(bar);

		// North Layout
		_info.setEditable(false);
		_info.setBackground(Color.white);
		c.add(_info, BorderLayout.NORTH);

		// South Layout
		JPanel spanel = new JPanel();
		for (int i = 0; i < bnames2.length; i++)
			spanel.add(buttons2[i]);
		c.add(spanel, BorderLayout.SOUTH);

		// Center Layout
		JPanel cpanel = new JPanel();
		cpanel.setBorder(BorderFactory.createLoweredBevelBorder());
		cpanel.setLayout(new GridLayout(lnames.length, 2));
		for (int i = 0; i < lnames.length; i++) {
			cpanel.add(labels[i]);
			cpanel.add(tfields[i]);
		}
		c.add(cpanel, BorderLayout.CENTER);

		// West Layout
		JPanel wpanel = new JPanel();
		wpanel.setLayout(new GridLayout(4, 0));
		for (int i = 0; i < bnames.length; i++)
			wpanel.add(buttons[i]);
		c.add(wpanel, BorderLayout.WEST);
	}

	public static void main(String args[]) {
		CafeGUI app = new CafeGUI(new Checkout());

		app.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}
} // end CheckoutGUI