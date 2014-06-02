import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Gui {

	/* Frame */
	private JFrame frame;

	/* JMenu items */
	private JMenuBar menuBar = new JMenuBar();
	private JMenuItem troublesMenuItem = new JMenuItem("Troubles");
	private JMenu mnAbout = new JMenu("About");
	private JMenuItem aboutMenuItem = new JMenuItem("About");
	private JMenu fileMenu = new JMenu("File");
	private JMenuItem exitMenuItem = new JMenuItem("Exit");
	private JMenu helpMenu = new JMenu("Help");
	private JMenuItem eatingMenuItem = new JMenuItem("Eating");
	private JMenuItem lootingMenuItem = new JMenuItem("Looting");

	/* Labels */
	private JLabel percentLabel = new JLabel("%");
	private JLabel selectPercentLabel = new JLabel(
			"<html>Please select at what percent level you<br>you want script to eat.</html>");
	private JLabel lootLabel = new JLabel(
			"Please select what you want script to loot.");

	/* Spinner */
	private SpinnerNumberModel numModel = new SpinnerNumberModel(1.0, 0.0,
			99.0, 1.0);
	private JSpinner spinner = new JSpinner(numModel);

	/* Combo boxes */
	private JComboBox<?> lootComboBox = new JComboBox<>();
	private JCheckBox foodCheckBox = new JCheckBox("Eat food");
	private JCheckBox lootCheckBox = new JCheckBox("Loot");

	/* Panels */
	private JPanel panel = new JPanel();
	private JPanel panel_1 = new JPanel();
	private JPanel panel_2 = new JPanel();

	/* Button */
	private JButton startButton = new JButton("Start");

	/* Layouts */
	GroupLayout gl_panel = new GroupLayout(panel);
	GroupLayout gl_panel_1 = new GroupLayout(panel_1);
	GroupLayout gl_panel_2 = new GroupLayout(panel_2);

	public Gui() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("QCow Killer");
		frame.setBounds(100, 100, 306, 292);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);

		frame.getContentPane().add(panel, BorderLayout.CENTER);

		panel_1.setBorder(new TitledBorder(new EtchedBorder(
				EtchedBorder.LOWERED, null, null), "Food",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));

		panel_2.setBorder(new TitledBorder(new EtchedBorder(
				EtchedBorder.LOWERED, null, null), "Loot",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));

		gl_panel.setHorizontalGroup(gl_panel
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						Alignment.TRAILING,
						gl_panel.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.TRAILING)
												.addComponent(
														panel_1,
														Alignment.LEADING,
														GroupLayout.DEFAULT_SIZE,
														280, Short.MAX_VALUE)
												.addComponent(lootCheckBox,
														Alignment.LEADING)
												.addComponent(foodCheckBox,
														Alignment.LEADING)
												.addComponent(
														panel_2,
														Alignment.LEADING,
														GroupLayout.DEFAULT_SIZE,
														280, Short.MAX_VALUE)
												.addComponent(
														startButton,
														Alignment.LEADING,
														GroupLayout.DEFAULT_SIZE,
														280, Short.MAX_VALUE))
								.addContainerGap()));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(
				Alignment.TRAILING).addGroup(
				gl_panel.createSequentialGroup()
						.addContainerGap(GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addComponent(foodCheckBox)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lootCheckBox)
						.addGap(4)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 74,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 74,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(startButton).addGap(57)));

		gl_panel_2.setHorizontalGroup(gl_panel_2
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						Alignment.TRAILING,
						gl_panel_2
								.createSequentialGroup()
								.addContainerGap(115, Short.MAX_VALUE)
								.addComponent(lootComboBox,
										GroupLayout.PREFERRED_SIZE, 133,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addGroup(
						gl_panel_2.createSequentialGroup().addContainerGap()
								.addComponent(lootLabel)
								.addContainerGap(202, Short.MAX_VALUE)));
		gl_panel_2.setVerticalGroup(gl_panel_2.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel_2
						.createSequentialGroup()
						.addComponent(lootLabel)
						.addGap(8)
						.addComponent(lootComboBox, GroupLayout.PREFERRED_SIZE,
								25, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(42, Short.MAX_VALUE)));
		panel_2.setLayout(gl_panel_2);

		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(
				Alignment.LEADING).addGroup(
				Alignment.TRAILING,
				gl_panel_1
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(selectPercentLabel)
						.addPreferredGap(ComponentPlacement.RELATED, 120,
								Short.MAX_VALUE)
						.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 77,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(percentLabel)));
		gl_panel_1
				.setVerticalGroup(gl_panel_1
						.createParallelGroup(Alignment.TRAILING)
						.addGroup(
								gl_panel_1
										.createSequentialGroup()
										.addGroup(
												gl_panel_1
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_panel_1
																		.createSequentialGroup()
																		.addContainerGap()
																		.addGroup(
																				gl_panel_1
																						.createParallelGroup(
																								Alignment.BASELINE)
																						.addComponent(
																								spinner,
																								GroupLayout.PREFERRED_SIZE,
																								22,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								percentLabel)))
														.addComponent(
																selectPercentLabel))
										.addContainerGap(56, Short.MAX_VALUE)));

		panel_1.setLayout(gl_panel_1);
		panel.setLayout(gl_panel);

		/* Menu */
		frame.setJMenuBar(menuBar);
		menuBar.add(fileMenu);
		fileMenu.add(exitMenuItem);
		menuBar.add(helpMenu);
		helpMenu.add(eatingMenuItem);
		helpMenu.add(lootingMenuItem);
		helpMenu.add(troublesMenuItem);
		menuBar.add(mnAbout);
		mnAbout.add(aboutMenuItem);

		/* Action listeners */
		aboutMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Made by Qosmiof2\n"
						+ "Released on x.x.x\n"
						+ "For further information contact me. \n"
						+ "Skype: Qosmiof2\n" + "Send me a PM. \n", "About",
						JOptionPane.INFORMATION_MESSAGE);
			}

		});

		foodCheckBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (spinner.isEnabled()) {
					spinner.setEnabled(false);
					selectPercentLabel.setEnabled(false);
					percentLabel.setEnabled(false);
				} else {
					spinner.setEnabled(true);
					selectPercentLabel.setEnabled(true);
					percentLabel.setEnabled(true);
				}

			}

		});

		lootCheckBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (lootComboBox.isEnabled()) {
					lootComboBox.setEnabled(false);
					lootLabel.setEnabled(false);
				} else {
					lootComboBox.setEnabled(true);
					lootLabel.setEnabled(true);
				}

			}

		});

		eatingMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(frame,
						"Script will eat any food you have in backpack. \n"
								+ "(cooked ofcourse)", "Help",
						JOptionPane.INFORMATION_MESSAGE);

			}

		});

		lootingMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(frame,
						"Select what item you want script to loot. \n"
								+ "multiple items coming soon!", "Help",
						JOptionPane.INFORMATION_MESSAGE);

			}

		});

		troublesMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(frame,
						"Are you experiencing any troubles? \n"
								+ "- Yes? Contact me or post on my thread.\n"
								+ "Contact info is in ABOUT tab. ", "Help",
						JOptionPane.INFORMATION_MESSAGE);

			}

		});

		exitMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}

		});

		startButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (lootCheckBox.isSelected()) {
					System.out.println(lootComboBox.getSelectedItem()
							.toString());
				}

				if (foodCheckBox.isSelected()) {

				}
			}

		});

		/* Focus */
		foodCheckBox.setFocusable(false);
		lootCheckBox.setFocusable(false);
		lootComboBox.setFocusable(false);
		startButton.setFocusable(false);
		spinner.setFocusable(false);

		/* Enabling */
		lootComboBox.setEnabled(false);
		lootLabel.setEnabled(false);
		selectPercentLabel.setEnabled(false);
		spinner.setEnabled(false);
		percentLabel.setEnabled(false);

	}
}
