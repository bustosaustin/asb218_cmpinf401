package edu.pitt.menumanager;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class MenuManagerGUI 
{
	private JFrame firstFrame;
	private JComboBox entreeBox;
	private int entreeIndex;
	private JComboBox sideBox;
	private int sideIndex;
	private JComboBox saladBox;
	private int saladIndex;
	private JComboBox dessertBox;
	private int dessertIndex;
	private JTextArea textArea;
	private JFrame secondFrame;
	private JTextArea entreeText = new JTextArea();
	private JTextArea sideText = new JTextArea();
	private JTextArea saladText = new JTextArea();
	private JTextArea dessertText = new JTextArea();
	private JTextField caloriesText = new JTextField();
	private JTextField priceText = new JTextField();
	private ArrayList<Menu> menus = new ArrayList<>(); // All components of GUI as properties

	public MenuManagerGUI()
	{
		MenuManager menu = new MenuManager("data/dishes.txt");

		firstFrame = new JFrame("Menu Manager");
		firstFrame.setBounds(0, 0, 650, 380);
		firstFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		firstFrame.setLayout(null); // Creating the main window with no layout

		JPanel firstPanel = new JPanel();
		firstPanel.setBorder(BorderFactory.createTitledBorder("Build your own Menu"));
		firstPanel.setBounds(10, 10, 300, 210);
		firstPanel.setLayout(null);
		firstFrame.getContentPane().add(firstPanel); // Creating the first panel in which you pick the dishes you want

		JPanel secondPanel = new JPanel();
		secondPanel.setBorder(BorderFactory.createTitledBorder("Or generate a Menu"));
		secondPanel.setBounds(10, 230, 300, 100);
		secondPanel.setLayout(null);
		firstFrame.getContentPane().add(secondPanel); // Creating the second panel to choose if you want to generate a random menu, a minimum calorie menu, or max calorie menu (the last two options are for extra credit only, so I did not do those)

		JLabel entreeLabel = new JLabel("Entree");
		entreeLabel.setBounds(15, 20, 60, 20);
		firstPanel.add(entreeLabel); // Creating the entree label for the entree drop down box

		ArrayList<Entree> entrees = new ArrayList<Entree>(menu.getEntrees());
		String[] entreeList = new String[entrees.size() + 1];
		entreeList[0] = "None";
		for (int i = 0; i < entrees.size(); i++)
		{
			entreeList[i + 1] = entrees.get(i).getName();
		}
		entreeBox = new JComboBox(entreeList);
		entreeBox.setBounds(75, 20, 210, 20);
		firstPanel.add(entreeBox);
		entreeText.setText("None");
		entreeBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				JComboBox comboBox = (JComboBox)e.getSource();
				entreeIndex = comboBox.getSelectedIndex(); 
			}
		}); // Configuring the drop down box to get the selected entree

		JLabel sideLabel = new JLabel("Side");
		sideLabel.setBounds(15, 55, 60, 20);
		firstPanel.add(sideLabel); // Creating the side label for the sides drop down box

		ArrayList<Side> sides = new ArrayList<Side>(menu.getSides());
		String[] sideList = new String[sides.size() + 1];
		sideList[0] = "None";
		for (int i = 0; i < sides.size(); i++)
		{
			sideList[i + 1] = sides.get(i).getName();
		}
		sideBox = new JComboBox(sideList);
		sideBox.setBounds(75, 55, 210, 20);
		firstPanel.add(sideBox);
		sideText.setText("None");
		sideBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JComboBox comboBox = (JComboBox)e.getSource();
				sideIndex = comboBox.getSelectedIndex();
			}
		}); // Configuring the drop down box to get the selected side

		JLabel saladLabel = new JLabel("Salad");
		saladLabel.setBounds(15, 90, 60, 20);
		firstPanel.add(saladLabel); // Creating the side label for the salads drop down box

		ArrayList<Salad> salads = new ArrayList<Salad>(menu.getSalads());
		String[] saladList = new String[salads.size() + 1];
		saladList[0] = "None";
		for (int i = 0; i < salads.size(); i++)
		{
			saladList[i + 1] = salads.get(i).getName();
		}
		saladBox = new JComboBox(saladList);
		saladBox.setBounds(75, 90, 210, 20);
		firstPanel.add(saladBox);
		saladText.setText("None");
		saladBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JComboBox comboBox = (JComboBox)e.getSource();
				saladIndex = comboBox.getSelectedIndex();
			}
		}); // Configuring the drop down box to get the selected salad 

		JLabel dessertLabel = new JLabel("Dessert");
		dessertLabel.setBounds(15, 125, 60, 20);
		firstPanel.add(dessertLabel); // Creating the dessert label for the sides drop down box

		ArrayList<Dessert> desserts = new ArrayList<Dessert>(menu.getDesserts());
		String[] dessertList = new String[desserts.size() + 1];
		dessertList[0] = "None";
		for (int i = 0; i < desserts.size(); i++)
		{
			dessertList[i + 1] = desserts.get(i).getName();
		}
		dessertBox = new JComboBox(dessertList);
		dessertBox.setBounds(75, 125, 210, 20);
		firstPanel.add(dessertBox);
		dessertText.setText("None");
		dessertBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JComboBox comboBox = (JComboBox)e.getSource();
				dessertIndex = comboBox.getSelectedIndex();
			}
		}); // Configuring the drop down box to get the selected dessert

		JButton createMenuButton = new JButton("Create Menu with selected dishes");
		createMenuButton.setBounds(20, 160, 250, 30);
		firstPanel.add(createMenuButton); // Creating button to create a menu with the selected dishes
		createMenuButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String menuName = JOptionPane.showInputDialog("What is the name of this menu?");
				String string  = menuName + "\n" + "";
				textArea.setText(string);
				if (entreeIndex == 0 )
				{
					entreeText.setText("Entree: N/A");
				}
				else 
				{
					entreeText.setText(entrees.get(entreeIndex - 1).getName() + "\n" + entrees.get(entreeIndex - 1).getDescription() + "\n" + "Calories: " + String.valueOf(entrees.get(entreeIndex - 1).getCalories()) + "\n" + "Price: $" + String.valueOf(entrees.get(entreeIndex - 1).getPrice()));
				}

				if (sideIndex == 0)
				{
					sideText.setText("Side:N/A");
				}
				else 
				{
					sideText.setText(sides.get(sideIndex - 1).getName() + "\n" + sides.get(sideIndex - 1).getDescription()+ "\n" + "Calories: " + String.valueOf(sides.get(sideIndex - 1).getCalories()) + "\n" + "Price: $ " + String.valueOf(sides.get(sideIndex - 1).getPrice()));
				}

				if (saladIndex == 0)
				{
					saladText.setText("Salad: N/A");
				}
				else
				{
					saladText.setText(salads.get(saladIndex - 1).getName() + "\n" + salads.get(saladIndex - 1).getDescription() + "\n" + "Calories: " + String.valueOf(salads.get(saladIndex - 1).getCalories()) + "\n" + "Price: $" + String.valueOf(salads.get(saladIndex - 1).getPrice()));
				}

				if (dessertIndex == 0)
				{
					dessertText.setText("Dessert: N/A");
				}
				else 
				{
					dessertText.setText(desserts.get(dessertIndex - 1).getName() + "\n" + desserts.get(dessertIndex - 1).getDescription() + "\n" + "Calories: " + String.valueOf(desserts.get(dessertIndex - 1).getCalories()) + "\n" + "Price: $" + String.valueOf(desserts.get(dessertIndex - 1).getPrice()));
				}

				priceText.setText(String.valueOf(entreeIndex == 0 ? 0:entrees.get(entreeIndex - 1).getPrice()) + (sideIndex == 0 ? 0:sides.get(sideIndex - 1).getPrice()) + (saladIndex == 0 ? 0:salads.get(saladIndex - 1).getPrice()) + (dessertIndex == 0 ? 0:desserts.get(dessertIndex - 1).getPrice()));
				
				caloriesText.setText(String.valueOf((entreeIndex == 0 ? 0:entrees.get(entreeIndex - 1).getCalories()) + (sideIndex == 0 ? 0:sides.get(sideIndex - 1).getCalories()) + (saladIndex == 0 ? 0:salads.get(saladIndex - 1).getCalories()) + (dessertIndex == 0 ? 0:desserts.get(dessertIndex - 1).getCalories())));

				if ((entreeIndex != 0) || (sideIndex != 0) || (saladIndex != 0) || (dessertIndex != 0))
				{
					menus.add(new Menu(menuName, entrees.get(entreeIndex - 1), sides.get(sideIndex - 1), salads.get(saladIndex - 1), desserts.get(dessertIndex - 1)));
				}
			}
		});// Setting the entrees, sides, salads, and desserts to what the user selected (or not selected)

		JButton randomMenuButton = new JButton("Generate a Random Menu");
		randomMenuButton.setBounds(50, 40, 200, 30);
		secondPanel.add(randomMenuButton);
		randomMenuButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String menuName = JOptionPane.showInputDialog("What is the name of this menu?");
				String string  = menuName + "\n";
				textArea.setText(string);
				Menu randomMenu = menu.randomMenu(menuName);

				entreeText.setText(randomMenu.getEntree().getName() + "\n" + randomMenu.getEntree().getDescription() + "\n" + "Calories: " + String.valueOf(randomMenu.getEntree().getCalories()) + "\n" + "Price: $" + String.valueOf(randomMenu.getEntree().getPrice()));

				sideText.setText(randomMenu.getSide().getName() + "\n" + randomMenu.getSide().getDescription() + "\n" + "Calories: " + String.valueOf(randomMenu.getSide().getCalories()) + "\n" + "Price: $" + String.valueOf(randomMenu.getSide().getPrice()));

				saladText.setText(randomMenu.getSalad().getName() + "\n" + randomMenu.getSalad().getDescription() + "\n" + "Calories: " + String.valueOf(randomMenu.getSalad().getCalories()) + "\n" + "Price: $" + String.valueOf(randomMenu.getSalad().getPrice()));

				dessertText.setText(randomMenu.getDessert().getName() + "\n" + randomMenu.getDessert().getDescription() + "\n" + "Calories: " + String.valueOf(randomMenu.getDessert().getCalories()) + "\n" + "Price: $" + String.valueOf(randomMenu.getDessert().getPrice()));

				priceText.setText(String.valueOf(randomMenu.getEntree().getPrice() + randomMenu.getSide().getPrice() + randomMenu.getSalad().getPrice() + randomMenu.getDessert().getPrice()));

				caloriesText.setText(String.valueOf(randomMenu.getEntree().getCalories() + randomMenu.getSide().getCalories() + randomMenu.getSalad().getCalories() + randomMenu.getDessert().getCalories()));

				menus.add(new Menu("Random Menu", randomMenu.getEntree(), randomMenu.getSide(), randomMenu.getSalad(), randomMenu.getDessert()));
			}
		});

		JLabel label = new JLabel("Created Menus:");
		label.setBounds(320, 15, 100, 15);
		firstFrame.getContentPane().add(label); // Creating the label for the menus created

		textArea = new JTextArea();
		textArea.setBorder(BorderFactory.createLineBorder(Color.black));
		textArea.setEditable(false);
		textArea.setBounds(320, 35, 300, 260);
		firstFrame.getContentPane().add(textArea); // Creating the text fields of the created menus

		JButton detailsButton = new JButton("Details");
		detailsButton.setBounds(320, 305, 80, 20);
		detailsButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
					secondFrame.setVisible(true);
			}
		});
		firstFrame.getContentPane().add(detailsButton);

		JButton deleteAllButton = new JButton("Delete All");
		deleteAllButton.setBounds(410, 305, 90, 20);
		deleteAllButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				textArea.setText("");
				menus.clear();
			}
		});
		firstFrame.getContentPane().add(deleteAllButton);

		JButton saveButton = new JButton("Save to File");
		saveButton.setBounds(510, 305, 110, 20);
		firstFrame.getContentPane().add(saveButton);

		saveButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				FileManager.writeMenu("data/menus.txt", menus);
			}
		});
		
		secondFrame = new JFrame("Menu: My own menu");
		secondFrame.setBounds(0, 0, 790, 800);
		secondFrame.getContentPane().setLayout(null);
		
		JLabel secondEntreeLabel = new JLabel("Entree");
		secondEntreeLabel.setBounds(10, 10, 60, 20);
		secondFrame.getContentPane().add(secondEntreeLabel);
		
		entreeText.setBounds(100, 10, 780, 80);
		entreeText.setBorder(BorderFactory.createLineBorder(Color.black));
		entreeText.setEditable(false);
		secondFrame.getContentPane().add(entreeText);
		
		JLabel secondSideLabel = new JLabel("Side");
		secondSideLabel.setBounds(10, 110, 60, 20);
		secondFrame.getContentPane().add(secondSideLabel);
		
		sideText.setBounds(100, 110, 780, 80);
		sideText.setBorder(BorderFactory.createLineBorder(Color.black));
		sideText.setEditable(false);
		secondFrame.getContentPane().add(sideText);

		JLabel secondSaladLabel = new JLabel("Salad");
		secondSaladLabel.setBounds(10, 210, 60, 20);
		secondFrame.getContentPane().add(secondSaladLabel);
		
		saladText.setBounds(100, 210, 780, 80);
		saladText.setBorder(BorderFactory.createLineBorder(Color.black));
		saladText.setEditable(false);
		secondFrame.getContentPane().add(saladText);
		
		JLabel secondDessertLabel = new JLabel("Dessert");
		secondDessertLabel.setBounds(10, 310, 60, 20);
		secondFrame.getContentPane().add(secondDessertLabel);
		
		dessertText.setBounds(100, 310, 780, 80);
		dessertText.setBorder(BorderFactory.createLineBorder(Color.black));
		dessertText.setEditable(false);
		secondFrame.getContentPane().add(dessertText);
		
		JLabel secondCaloriesLabel = new JLabel("Total Calories:");
		secondCaloriesLabel.setBounds(10, 410, 100, 20);
		secondFrame.getContentPane().add(secondCaloriesLabel);
		
		caloriesText.setBounds(100, 410, 100, 40);
		caloriesText.setBorder(BorderFactory.createLineBorder(Color.black));
		caloriesText.setEditable(false);
		secondFrame.getContentPane().add(caloriesText);
		
		JLabel secondPriceLabel = new JLabel("Total Price: $");
		secondPriceLabel.setBounds(10, 510, 100, 20);
		secondFrame.getContentPane().add(secondPriceLabel);
		
		priceText.setBounds(100, 510, 100, 40);
		priceText.setBorder(BorderFactory.createLineBorder(Color.black));
		priceText.setEditable(false);
		secondFrame.getContentPane().add(priceText);
	}

	public static void main(String[] args) 
	{
		MenuManagerGUI create = new MenuManagerGUI();
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				create.firstFrame.setVisible(true);
			}
		});
	}
}