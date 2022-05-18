package benutzerschnittstelle;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Locale;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * GUI Klasse des Programms Gehweg-Pacrcours
 * 
 * @author julianschumacher
 *
 */
public final class Spielfeld extends JFrame
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				try
				{
					Spielfeld frame = new Spielfeld();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Spielfeld()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);

		JCheckBox chckbxNewCheckBox_4_4_14 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_14 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_14.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_14.gridx = 2;
		gbc_chckbxNewCheckBox_4_4_14.gridy = 2;
		contentPane.add(chckbxNewCheckBox_4_4_14, gbc_chckbxNewCheckBox_4_4_14);

		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox.gridx = 3;
		gbc_chckbxNewCheckBox.gridy = 2;
		contentPane.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_1 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_1.gridx = 4;
		gbc_chckbxNewCheckBox_1.gridy = 2;
		contentPane.add(chckbxNewCheckBox_1, gbc_chckbxNewCheckBox_1);

		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_2 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_2.gridx = 5;
		gbc_chckbxNewCheckBox_2.gridy = 2;
		contentPane.add(chckbxNewCheckBox_2, gbc_chckbxNewCheckBox_2);

		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_3 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_3.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_3.gridx = 6;
		gbc_chckbxNewCheckBox_3.gridy = 2;
		contentPane.add(chckbxNewCheckBox_3, gbc_chckbxNewCheckBox_3);

		JCheckBox chckbxNewCheckBox_4_4_15 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_15 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_15.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_4_4_15.gridx = 7;
		gbc_chckbxNewCheckBox_4_4_15.gridy = 2;
		contentPane.add(chckbxNewCheckBox_4_4_15, gbc_chckbxNewCheckBox_4_4_15);

		JCheckBox chckbxNewCheckBox_4_4_16 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_16 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_16.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_16.gridx = 2;
		gbc_chckbxNewCheckBox_4_4_16.gridy = 3;
		contentPane.add(chckbxNewCheckBox_4_4_16, gbc_chckbxNewCheckBox_4_4_16);

		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4.gridx = 3;
		gbc_chckbxNewCheckBox_4.gridy = 3;
		contentPane.add(chckbxNewCheckBox_4, gbc_chckbxNewCheckBox_4);

		JCheckBox chckbxNewCheckBox_4_1 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_1 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_1.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_1.gridx = 4;
		gbc_chckbxNewCheckBox_4_1.gridy = 3;
		contentPane.add(chckbxNewCheckBox_4_1, gbc_chckbxNewCheckBox_4_1);

		JCheckBox chckbxNewCheckBox_4_2 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_2 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_2.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_2.gridx = 5;
		gbc_chckbxNewCheckBox_4_2.gridy = 3;
		contentPane.add(chckbxNewCheckBox_4_2, gbc_chckbxNewCheckBox_4_2);

		JCheckBox chckbxNewCheckBox_4_3 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_3 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_3.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_3.gridx = 6;
		gbc_chckbxNewCheckBox_4_3.gridy = 3;
		contentPane.add(chckbxNewCheckBox_4_3, gbc_chckbxNewCheckBox_4_3);

		JCheckBox chckbxNewCheckBox_4_4_17 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_17 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_17.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_4_4_17.gridx = 7;
		gbc_chckbxNewCheckBox_4_4_17.gridy = 3;
		contentPane.add(chckbxNewCheckBox_4_4_17, gbc_chckbxNewCheckBox_4_4_17);

		JCheckBox chckbxNewCheckBox_4_4_18 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_18 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_18.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_18.gridx = 2;
		gbc_chckbxNewCheckBox_4_4_18.gridy = 4;
		contentPane.add(chckbxNewCheckBox_4_4_18, gbc_chckbxNewCheckBox_4_4_18);

		JCheckBox chckbxNewCheckBox_4_4 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4.gridx = 3;
		gbc_chckbxNewCheckBox_4_4.gridy = 4;
		contentPane.add(chckbxNewCheckBox_4_4, gbc_chckbxNewCheckBox_4_4);

		JCheckBox chckbxNewCheckBox_4_4_1 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_1 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_1.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_1.gridx = 4;
		gbc_chckbxNewCheckBox_4_4_1.gridy = 4;
		contentPane.add(chckbxNewCheckBox_4_4_1, gbc_chckbxNewCheckBox_4_4_1);

		JCheckBox chckbxNewCheckBox_4_4_2 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_2 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_2.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_2.gridx = 5;
		gbc_chckbxNewCheckBox_4_4_2.gridy = 4;
		contentPane.add(chckbxNewCheckBox_4_4_2, gbc_chckbxNewCheckBox_4_4_2);

		JCheckBox chckbxNewCheckBox_4_4_3 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_3 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_3.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_3.gridx = 6;
		gbc_chckbxNewCheckBox_4_4_3.gridy = 4;
		contentPane.add(chckbxNewCheckBox_4_4_3, gbc_chckbxNewCheckBox_4_4_3);

		JCheckBox chckbxNewCheckBox_4_4_19 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_19 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_19.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_4_4_19.gridx = 7;
		gbc_chckbxNewCheckBox_4_4_19.gridy = 4;
		contentPane.add(chckbxNewCheckBox_4_4_19, gbc_chckbxNewCheckBox_4_4_19);

		JCheckBox chckbxNewCheckBox_4_4_20 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_20 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_20.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_20.gridx = 2;
		gbc_chckbxNewCheckBox_4_4_20.gridy = 5;
		contentPane.add(chckbxNewCheckBox_4_4_20, gbc_chckbxNewCheckBox_4_4_20);

		JCheckBox chckbxNewCheckBox_4_4_4 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_4 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_4.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_4.gridx = 3;
		gbc_chckbxNewCheckBox_4_4_4.gridy = 5;
		contentPane.add(chckbxNewCheckBox_4_4_4, gbc_chckbxNewCheckBox_4_4_4);

		JCheckBox chckbxNewCheckBox_4_4_5 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_5 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_5.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_5.gridx = 4;
		gbc_chckbxNewCheckBox_4_4_5.gridy = 5;
		contentPane.add(chckbxNewCheckBox_4_4_5, gbc_chckbxNewCheckBox_4_4_5);

		JCheckBox chckbxNewCheckBox_4_4_6 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_6 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_6.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_6.gridx = 5;
		gbc_chckbxNewCheckBox_4_4_6.gridy = 5;
		contentPane.add(chckbxNewCheckBox_4_4_6, gbc_chckbxNewCheckBox_4_4_6);

		JCheckBox chckbxNewCheckBox_4_4_7 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_7 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_7.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_7.gridx = 6;
		gbc_chckbxNewCheckBox_4_4_7.gridy = 5;
		contentPane.add(chckbxNewCheckBox_4_4_7, gbc_chckbxNewCheckBox_4_4_7);

		JCheckBox chckbxNewCheckBox_4_4_21 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_21 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_21.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_4_4_21.gridx = 7;
		gbc_chckbxNewCheckBox_4_4_21.gridy = 5;
		contentPane.add(chckbxNewCheckBox_4_4_21, gbc_chckbxNewCheckBox_4_4_21);

		JCheckBox chckbxNewCheckBox_4_4_22 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_22 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_22.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_22.gridx = 2;
		gbc_chckbxNewCheckBox_4_4_22.gridy = 6;
		contentPane.add(chckbxNewCheckBox_4_4_22, gbc_chckbxNewCheckBox_4_4_22);

		JCheckBox chckbxNewCheckBox_4_4_8 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_8 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_8.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_8.gridx = 3;
		gbc_chckbxNewCheckBox_4_4_8.gridy = 6;
		contentPane.add(chckbxNewCheckBox_4_4_8, gbc_chckbxNewCheckBox_4_4_8);

		JCheckBox chckbxNewCheckBox_4_4_9 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_9 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_9.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_9.gridx = 4;
		gbc_chckbxNewCheckBox_4_4_9.gridy = 6;
		contentPane.add(chckbxNewCheckBox_4_4_9, gbc_chckbxNewCheckBox_4_4_9);

		JCheckBox chckbxNewCheckBox_4_4_10 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_10 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_10.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_10.gridx = 5;
		gbc_chckbxNewCheckBox_4_4_10.gridy = 6;
		contentPane.add(chckbxNewCheckBox_4_4_10, gbc_chckbxNewCheckBox_4_4_10);

		JCheckBox chckbxNewCheckBox_4_4_11 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_11 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_11.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_11.gridx = 6;
		gbc_chckbxNewCheckBox_4_4_11.gridy = 6;
		contentPane.add(chckbxNewCheckBox_4_4_11, gbc_chckbxNewCheckBox_4_4_11);

		JCheckBox chckbxNewCheckBox_4_4_23 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_23 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_23.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_4_4_23.gridx = 7;
		gbc_chckbxNewCheckBox_4_4_23.gridy = 6;
		contentPane.add(chckbxNewCheckBox_4_4_23, gbc_chckbxNewCheckBox_4_4_23);

		JCheckBox chckbxNewCheckBox_4_4_24 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_24 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_24.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_24.gridx = 2;
		gbc_chckbxNewCheckBox_4_4_24.gridy = 7;
		contentPane.add(chckbxNewCheckBox_4_4_24, gbc_chckbxNewCheckBox_4_4_24);

		JCheckBox chckbxNewCheckBox_4_4_12 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_12 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_12.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_12.gridx = 3;
		gbc_chckbxNewCheckBox_4_4_12.gridy = 7;
		contentPane.add(chckbxNewCheckBox_4_4_12, gbc_chckbxNewCheckBox_4_4_12);

		JCheckBox chckbxNewCheckBox_4_4_13 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_13 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_13.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_13.gridx = 4;
		gbc_chckbxNewCheckBox_4_4_13.gridy = 7;
		contentPane.add(chckbxNewCheckBox_4_4_13, gbc_chckbxNewCheckBox_4_4_13);

		JCheckBox chckbxNewCheckBox_4_4_25 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_25 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_25.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_25.gridx = 5;
		gbc_chckbxNewCheckBox_4_4_25.gridy = 7;
		contentPane.add(chckbxNewCheckBox_4_4_25, gbc_chckbxNewCheckBox_4_4_25);

		JCheckBox chckbxNewCheckBox_4_4_26 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_26 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_26.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_26.gridx = 6;
		gbc_chckbxNewCheckBox_4_4_26.gridy = 7;
		contentPane.add(chckbxNewCheckBox_4_4_26, gbc_chckbxNewCheckBox_4_4_26);

		JCheckBox chckbxNewCheckBox_4_4_27 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_27 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_27.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_4_4_27.gridx = 7;
		gbc_chckbxNewCheckBox_4_4_27.gridy = 7;
		contentPane.add(chckbxNewCheckBox_4_4_27, gbc_chckbxNewCheckBox_4_4_27);

		JCheckBox chckbxNewCheckBox_4_4_28 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_28 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_28.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_28.gridx = 2;
		gbc_chckbxNewCheckBox_4_4_28.gridy = 8;
		contentPane.add(chckbxNewCheckBox_4_4_28, gbc_chckbxNewCheckBox_4_4_28);

		JCheckBox chckbxNewCheckBox_4_4_29 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_29 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_29.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_29.gridx = 3;
		gbc_chckbxNewCheckBox_4_4_29.gridy = 8;
		contentPane.add(chckbxNewCheckBox_4_4_29, gbc_chckbxNewCheckBox_4_4_29);

		JCheckBox chckbxNewCheckBox_4_4_30 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_30 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_30.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_30.gridx = 4;
		gbc_chckbxNewCheckBox_4_4_30.gridy = 8;
		contentPane.add(chckbxNewCheckBox_4_4_30, gbc_chckbxNewCheckBox_4_4_30);

		JCheckBox chckbxNewCheckBox_4_4_31 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_31 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_31.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_31.gridx = 5;
		gbc_chckbxNewCheckBox_4_4_31.gridy = 8;
		contentPane.add(chckbxNewCheckBox_4_4_31, gbc_chckbxNewCheckBox_4_4_31);

		JCheckBox chckbxNewCheckBox_4_4_32 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_32 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_32.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_32.gridx = 6;
		gbc_chckbxNewCheckBox_4_4_32.gridy = 8;
		contentPane.add(chckbxNewCheckBox_4_4_32, gbc_chckbxNewCheckBox_4_4_32);

		JCheckBox chckbxNewCheckBox_4_4_33 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_33 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_33.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_4_4_33.gridx = 7;
		gbc_chckbxNewCheckBox_4_4_33.gridy = 8;
		contentPane.add(chckbxNewCheckBox_4_4_33, gbc_chckbxNewCheckBox_4_4_33);

		JCheckBox chckbxNewCheckBox_4_4_34 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_34 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_34.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_34.gridx = 2;
		gbc_chckbxNewCheckBox_4_4_34.gridy = 9;
		contentPane.add(chckbxNewCheckBox_4_4_34, gbc_chckbxNewCheckBox_4_4_34);

		JCheckBox chckbxNewCheckBox_4_4_35 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_35 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_35.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_35.gridx = 3;
		gbc_chckbxNewCheckBox_4_4_35.gridy = 9;
		contentPane.add(chckbxNewCheckBox_4_4_35, gbc_chckbxNewCheckBox_4_4_35);

		JCheckBox chckbxNewCheckBox_4_4_36 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_36 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_36.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_36.gridx = 4;
		gbc_chckbxNewCheckBox_4_4_36.gridy = 9;
		contentPane.add(chckbxNewCheckBox_4_4_36, gbc_chckbxNewCheckBox_4_4_36);

		JCheckBox chckbxNewCheckBox_4_4_37 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_37 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_37.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_37.gridx = 5;
		gbc_chckbxNewCheckBox_4_4_37.gridy = 9;
		contentPane.add(chckbxNewCheckBox_4_4_37, gbc_chckbxNewCheckBox_4_4_37);

		JCheckBox chckbxNewCheckBox_4_4_38 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_38 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_38.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_38.gridx = 6;
		gbc_chckbxNewCheckBox_4_4_38.gridy = 9;
		contentPane.add(chckbxNewCheckBox_4_4_38, gbc_chckbxNewCheckBox_4_4_38);

		JCheckBox chckbxNewCheckBox_4_4_39 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_39 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_39.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_4_4_39.gridx = 7;
		gbc_chckbxNewCheckBox_4_4_39.gridy = 9;
		contentPane.add(chckbxNewCheckBox_4_4_39, gbc_chckbxNewCheckBox_4_4_39);

		JCheckBox chckbxNewCheckBox_4_4_40 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_40 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_40.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_40.gridx = 2;
		gbc_chckbxNewCheckBox_4_4_40.gridy = 10;
		contentPane.add(chckbxNewCheckBox_4_4_40, gbc_chckbxNewCheckBox_4_4_40);

		JCheckBox chckbxNewCheckBox_4_4_41 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_41 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_41.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_41.gridx = 3;
		gbc_chckbxNewCheckBox_4_4_41.gridy = 10;
		contentPane.add(chckbxNewCheckBox_4_4_41, gbc_chckbxNewCheckBox_4_4_41);

		JCheckBox chckbxNewCheckBox_4_4_42 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_42 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_42.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_42.gridx = 4;
		gbc_chckbxNewCheckBox_4_4_42.gridy = 10;
		contentPane.add(chckbxNewCheckBox_4_4_42, gbc_chckbxNewCheckBox_4_4_42);

		JCheckBox chckbxNewCheckBox_4_4_43 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_43 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_43.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_43.gridx = 5;
		gbc_chckbxNewCheckBox_4_4_43.gridy = 10;
		contentPane.add(chckbxNewCheckBox_4_4_43, gbc_chckbxNewCheckBox_4_4_43);

		JCheckBox chckbxNewCheckBox_4_4_44 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_44 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_44.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_44.gridx = 6;
		gbc_chckbxNewCheckBox_4_4_44.gridy = 10;
		contentPane.add(chckbxNewCheckBox_4_4_44, gbc_chckbxNewCheckBox_4_4_44);

		JCheckBox chckbxNewCheckBox_4_4_45 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_45 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_45.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_4_4_45.gridx = 7;
		gbc_chckbxNewCheckBox_4_4_45.gridy = 10;
		contentPane.add(chckbxNewCheckBox_4_4_45, gbc_chckbxNewCheckBox_4_4_45);

		JCheckBox chckbxNewCheckBox_4_4_46 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_46 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_46.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_46.gridx = 2;
		gbc_chckbxNewCheckBox_4_4_46.gridy = 11;
		contentPane.add(chckbxNewCheckBox_4_4_46, gbc_chckbxNewCheckBox_4_4_46);

		JCheckBox chckbxNewCheckBox_4_4_47 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_47 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_47.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_47.gridx = 3;
		gbc_chckbxNewCheckBox_4_4_47.gridy = 11;
		contentPane.add(chckbxNewCheckBox_4_4_47, gbc_chckbxNewCheckBox_4_4_47);

		JCheckBox chckbxNewCheckBox_4_4_48 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_48 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_48.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_48.gridx = 4;
		gbc_chckbxNewCheckBox_4_4_48.gridy = 11;
		contentPane.add(chckbxNewCheckBox_4_4_48, gbc_chckbxNewCheckBox_4_4_48);

		JCheckBox chckbxNewCheckBox_4_4_49 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_49 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_49.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_49.gridx = 5;
		gbc_chckbxNewCheckBox_4_4_49.gridy = 11;
		contentPane.add(chckbxNewCheckBox_4_4_49, gbc_chckbxNewCheckBox_4_4_49);

		JCheckBox chckbxNewCheckBox_4_4_50 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_50 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_50.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_50.gridx = 6;
		gbc_chckbxNewCheckBox_4_4_50.gridy = 11;
		contentPane.add(chckbxNewCheckBox_4_4_50, gbc_chckbxNewCheckBox_4_4_50);

		JCheckBox chckbxNewCheckBox_4_4_51 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_51 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_51.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_4_4_51.gridx = 7;
		gbc_chckbxNewCheckBox_4_4_51.gridy = 11;
		contentPane.add(chckbxNewCheckBox_4_4_51, gbc_chckbxNewCheckBox_4_4_51);

		JCheckBox chckbxNewCheckBox_4_4_52 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_52 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_52.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_52.gridx = 2;
		gbc_chckbxNewCheckBox_4_4_52.gridy = 12;
		contentPane.add(chckbxNewCheckBox_4_4_52, gbc_chckbxNewCheckBox_4_4_52);

		JCheckBox chckbxNewCheckBox_4_4_56 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_56 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_56.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_56.gridx = 3;
		gbc_chckbxNewCheckBox_4_4_56.gridy = 12;
		contentPane.add(chckbxNewCheckBox_4_4_56, gbc_chckbxNewCheckBox_4_4_56);

		JCheckBox chckbxNewCheckBox_4_4_57 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_57 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_57.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_57.gridx = 4;
		gbc_chckbxNewCheckBox_4_4_57.gridy = 12;
		contentPane.add(chckbxNewCheckBox_4_4_57, gbc_chckbxNewCheckBox_4_4_57);

		JCheckBox chckbxNewCheckBox_4_4_58 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_58 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_58.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_58.gridx = 5;
		gbc_chckbxNewCheckBox_4_4_58.gridy = 12;
		contentPane.add(chckbxNewCheckBox_4_4_58, gbc_chckbxNewCheckBox_4_4_58);

		JCheckBox chckbxNewCheckBox_4_4_59 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_59 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_59.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_59.gridx = 6;
		gbc_chckbxNewCheckBox_4_4_59.gridy = 12;
		contentPane.add(chckbxNewCheckBox_4_4_59, gbc_chckbxNewCheckBox_4_4_59);

		JCheckBox chckbxNewCheckBox_4_4_60 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_60 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_60.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_4_4_60.gridx = 7;
		gbc_chckbxNewCheckBox_4_4_60.gridy = 12;
		contentPane.add(chckbxNewCheckBox_4_4_60, gbc_chckbxNewCheckBox_4_4_60);

		JCheckBox chckbxNewCheckBox_4_4_53 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_53 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_53.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_53.gridx = 2;
		gbc_chckbxNewCheckBox_4_4_53.gridy = 13;
		contentPane.add(chckbxNewCheckBox_4_4_53, gbc_chckbxNewCheckBox_4_4_53);

		JCheckBox chckbxNewCheckBox_4_4_61 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_61 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_61.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_61.gridx = 3;
		gbc_chckbxNewCheckBox_4_4_61.gridy = 13;
		contentPane.add(chckbxNewCheckBox_4_4_61, gbc_chckbxNewCheckBox_4_4_61);

		JCheckBox chckbxNewCheckBox_4_4_62 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_62 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_62.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_62.gridx = 4;
		gbc_chckbxNewCheckBox_4_4_62.gridy = 13;
		contentPane.add(chckbxNewCheckBox_4_4_62, gbc_chckbxNewCheckBox_4_4_62);

		JCheckBox chckbxNewCheckBox_4_4_63 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_63 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_63.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_63.gridx = 5;
		gbc_chckbxNewCheckBox_4_4_63.gridy = 13;
		contentPane.add(chckbxNewCheckBox_4_4_63, gbc_chckbxNewCheckBox_4_4_63);

		JCheckBox chckbxNewCheckBox_4_4_64 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_64 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_64.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_64.gridx = 6;
		gbc_chckbxNewCheckBox_4_4_64.gridy = 13;
		contentPane.add(chckbxNewCheckBox_4_4_64, gbc_chckbxNewCheckBox_4_4_64);

		JCheckBox chckbxNewCheckBox_4_4_65 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_65 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_65.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_4_4_65.gridx = 7;
		gbc_chckbxNewCheckBox_4_4_65.gridy = 13;
		contentPane.add(chckbxNewCheckBox_4_4_65, gbc_chckbxNewCheckBox_4_4_65);

		JCheckBox chckbxNewCheckBox_4_4_54 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_54 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_54.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_54.gridx = 2;
		gbc_chckbxNewCheckBox_4_4_54.gridy = 14;
		contentPane.add(chckbxNewCheckBox_4_4_54, gbc_chckbxNewCheckBox_4_4_54);

		JCheckBox chckbxNewCheckBox_4_4_66 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_66 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_66.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_66.gridx = 3;
		gbc_chckbxNewCheckBox_4_4_66.gridy = 14;
		contentPane.add(chckbxNewCheckBox_4_4_66, gbc_chckbxNewCheckBox_4_4_66);

		JCheckBox chckbxNewCheckBox_4_4_67 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_67 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_67.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_67.gridx = 4;
		gbc_chckbxNewCheckBox_4_4_67.gridy = 14;
		contentPane.add(chckbxNewCheckBox_4_4_67, gbc_chckbxNewCheckBox_4_4_67);

		JCheckBox chckbxNewCheckBox_4_4_68 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_68 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_68.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_68.gridx = 5;
		gbc_chckbxNewCheckBox_4_4_68.gridy = 14;
		contentPane.add(chckbxNewCheckBox_4_4_68, gbc_chckbxNewCheckBox_4_4_68);

		JCheckBox chckbxNewCheckBox_4_4_69 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_69 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_69.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_4_4_69.gridx = 6;
		gbc_chckbxNewCheckBox_4_4_69.gridy = 14;
		contentPane.add(chckbxNewCheckBox_4_4_69, gbc_chckbxNewCheckBox_4_4_69);

		JCheckBox chckbxNewCheckBox_4_4_70 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_70 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_70.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_4_4_70.gridx = 7;
		gbc_chckbxNewCheckBox_4_4_70.gridy = 14;
		contentPane.add(chckbxNewCheckBox_4_4_70, gbc_chckbxNewCheckBox_4_4_70);

		JCheckBox chckbxNewCheckBox_4_4_55 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_55 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_55.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxNewCheckBox_4_4_55.gridx = 2;
		gbc_chckbxNewCheckBox_4_4_55.gridy = 15;
		contentPane.add(chckbxNewCheckBox_4_4_55, gbc_chckbxNewCheckBox_4_4_55);

		JCheckBox chckbxNewCheckBox_4_4_71 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_71 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_71.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxNewCheckBox_4_4_71.gridx = 3;
		gbc_chckbxNewCheckBox_4_4_71.gridy = 15;
		contentPane.add(chckbxNewCheckBox_4_4_71, gbc_chckbxNewCheckBox_4_4_71);

		JCheckBox chckbxNewCheckBox_4_4_72 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_72 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_72.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxNewCheckBox_4_4_72.gridx = 4;
		gbc_chckbxNewCheckBox_4_4_72.gridy = 15;
		contentPane.add(chckbxNewCheckBox_4_4_72, gbc_chckbxNewCheckBox_4_4_72);

		JCheckBox chckbxNewCheckBox_4_4_73 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_73 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_73.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxNewCheckBox_4_4_73.gridx = 5;
		gbc_chckbxNewCheckBox_4_4_73.gridy = 15;
		contentPane.add(chckbxNewCheckBox_4_4_73, gbc_chckbxNewCheckBox_4_4_73);

		JCheckBox chckbxNewCheckBox_4_4_74 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_74 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_74.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxNewCheckBox_4_4_74.gridx = 6;
		gbc_chckbxNewCheckBox_4_4_74.gridy = 15;
		contentPane.add(chckbxNewCheckBox_4_4_74, gbc_chckbxNewCheckBox_4_4_74);

		JCheckBox chckbxNewCheckBox_4_4_75 = new JCheckBox("");
		GridBagConstraints gbc_chckbxNewCheckBox_4_4_75 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4_4_75.gridx = 7;
		gbc_chckbxNewCheckBox_4_4_75.gridy = 15;
		contentPane.add(chckbxNewCheckBox_4_4_75, gbc_chckbxNewCheckBox_4_4_75);

		// Titel des Fensters festlegen
		setTitle("Gehweg-Parcours");

		// Möglichkeit das Fenster zu skalieren aktivieren
		setResizable(true);

		// Das Fenster selbst aktivieren
		setEnabled(true);

		// Die Sprache auf Deutsch setzen
		setLocale(new Locale("de"));
	}

}
