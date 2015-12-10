package gift;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import net.miginfocom.swing.MigLayout;

public class GiftGui extends JFrame {

	JPanel essayPanel = new JPanel(new MigLayout("", "[][][]", "[][][]"));
	JPanel trueFalsePanel = new JPanel();
	JPanel MCQPanel = new JPanel();
	JPanel MCQAPanel = new JPanel();
	JPanel numericalPanel = new JPanel(new MigLayout("debug", "", ""));
	JPanel matchingPanel = new JPanel(new MigLayout("debug", "", ""));
	JPanel fillBlanksPanel = new JPanel();

	JLabel test1 = new JLabel("test1");
	JLabel test2 = new JLabel("test2");
	JLabel test3 = new JLabel("test3");
	JLabel test4 = new JLabel("test4");
	JLabel test5 = new JLabel("test5");
	JLabel test6 = new JLabel("test6");
	JLabel test7 = new JLabel("test7");

	JPanel topPanel = new JPanel();

	JButton clearQ = new JButton("Clear Question");
	JButton clearOut = new JButton("Clear Output");
	JButton delete = new JButton("delete");
	JButton save = new JButton("Save");
	JButton create = new JButton("Create GIFT Code");

	Container numericalContainer = new Container();
	Container numericalButtonsContainer = new Container();
	Container matchingContainer = new Container();
	JTabbedPane tabBar = new JTabbedPane();

	public GiftGui() {

		setLayout(new MigLayout());
		// essay panel goes here
		essayPanel.add(test1);

		// True False panel goes here
		trueFalsePanel.add(test2);

		// MCQ panel goes here

		MCQPanel.add(test3);

		// MCQA panel goes here
		MCQAPanel.add(test4);

		// numerical panel goes here
		numericalContainer.setLayout(new MigLayout("", "", ""));
		numericalButtonsContainer.setLayout(new MigLayout("", "", ""));

		String[] question = { "Answer(+-) set range" };
		JLabel title = new JLabel("Question Title:");
		JLabel questionLabel = new JLabel("Question:");
		JLabel answer = new JLabel("Answer:");
		JLabel answerLabel = new JLabel("Answer:");
		JLabel feedbackLabel = new JLabel("Feedback");
		JLabel outputLabel = new JLabel("GIFT Output:");

		JComboBox questionType = new JComboBox(question);
		// SpinnerListModel numberModel = new SpinnerListModel(numbers);
		// JSpinner options = new JSpinner(numberModel);

		JTextArea questionText = new JTextArea();
		JTextArea answerText = new JTextArea();
		JTextArea feedbackText = new JTextArea();
		JTextArea outputText = new JTextArea(10, 10);

		JPanel numericalRange = new JPanel();

		JLabel numericalRangeLabel = new JLabel("Range (+/-)");
		JLabel numericalEndLabel = new JLabel("Range End:");
		String[] numbers = { "0", "1", "2", "3", "4", "5" };
		SpinnerListModel rangeModel = new SpinnerListModel(numbers);
		JSpinner rangeOptions = new JSpinner(rangeModel);
		JSpinner rangeEnd = new JSpinner(rangeModel);

		numericalRange.setBorder(new TitledBorder("Range Options"));
		numericalRange.add(numericalRangeLabel);
		numericalRange.add(rangeOptions);
		numericalRange.add(numericalEndLabel);
		rangeEnd.setEnabled(false);
		numericalRange.add(rangeEnd);
		numericalRange.setBorder(BorderFactory
				.createEtchedBorder(EtchedBorder.LOWERED));

		questionText.setBorder(BorderFactory
				.createBevelBorder(BevelBorder.LOWERED));
		answerText.setBorder(BorderFactory
				.createBevelBorder(BevelBorder.LOWERED));
		feedbackText.setBorder(BorderFactory
				.createBevelBorder(BevelBorder.LOWERED));
		outputText.setBorder(BorderFactory
				.createBevelBorder(BevelBorder.LOWERED));

		numericalContainer.add(title, "sizegroup 1, split, span");
		numericalContainer.add(questionType, "pushx, growx, span,wrap");

		numericalContainer.add(questionLabel, "split, span, sizegroup 1");
		numericalContainer.add(questionText, "span, pushx, growx, wrap");

		numericalContainer.add(answerLabel);
		numericalContainer.add(feedbackLabel, "wrap");
		numericalContainer.add(answer, "sizegroup 1,split, span");
		numericalContainer.add(answerText, "pushx, growx");
		numericalContainer.add(feedbackText, "pushx, growx, span, wrap");

		numericalContainer.add(numericalRange, "gap left 85, growx, pushx");

		clearQ.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				questionText.setText("");
				answerText.setText("");
				feedbackText.setText("");

			}

		});
		numericalContainer.add(clearQ, "align right, span, wrap, sizegroup 2");

		create.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				outputText.append("//" + questionType.getSelectedItem() + "\n");
				outputText.append("::" + questionText.getText() + "::\n");
				outputText.append("{#" + answerText.getText() + ":");
				outputText.append(feedbackText.getText() + "}\n");
			}

		});
		numericalContainer.add(create, "align right, span, wrap, sizegroup 2");

		numericalContainer.add(outputLabel, "sizegroup 1, split, span");
		numericalContainer.add(outputText,
				"pushx, growx,pushy, growy, span, wrap");
		numericalContainer.add(clearOut, "align right, span, wrap");
		// numericalPanel.add(numericalLabelContainer,"aligny top, push y, grow y");
		numericalPanel.add(numericalContainer, "aligny top,pushx, growx, span");

		// matching panel goes here
		matchingContainer.setLayout(new MigLayout("debug", "[][][][][][]",
				"[][]"));

		JLabel matchingTitleLabel = new JLabel("Question Title:");
		JLabel matchingQuestionLabel = new JLabel("Question:");
		JLabel matchingAnswerLabel = new JLabel("Answer:");
		JLabel matchingSelectLabel = new JLabel("Select:");
		JLabel matchingGiftOutputLabel = new JLabel("Gift Output:");

		JTextArea matchingQuestionText = new JTextArea();
		JTextField matchingQ1 = new JTextField();
		JTextField matchingQ2 = new JTextField();
		JTextField matchingQ3 = new JTextField();
		JTextField matchingQ4 = new JTextField();
		JTextField matchingQ5 = new JTextField();

		JTextField matchingA1 = new JTextField();
		JTextField matchingA2 = new JTextField();
		JTextField matchingA3 = new JTextField();
		JTextField matchingA4 = new JTextField();
		JTextField matchingA5 = new JTextField();

		JCheckBox matchingCheck1 = new JCheckBox();
		JCheckBox matchingCheck2 = new JCheckBox();
		JCheckBox matchingCheck3 = new JCheckBox();
		JCheckBox matchingCheck4 = new JCheckBox();
		JCheckBox matchingCheck5 = new JCheckBox();

		JButton matchingAddQA = new JButton("Add Q&A");
		JButton matchingRemoveSelected = new JButton("Remove Selected");
		JButton matchingRemoveButton = new JButton("Remove");
		JPanel matchingRemovePanel = new JPanel();
		JLabel matchingRemoveLabel = new JLabel("Remove Selected");

		JPanel questionPanel = new JPanel(new MigLayout("debug", "", ""));
		questionPanel.add(new JLabel("Question"), "cell 1 0");
		questionPanel.add(new JLabel("Answer"), "cell 2 0");
		questionPanel.add(new JLabel("Select"), "cell 3 0 ,wrap");
		questionPanel.add(matchingAddQA);
		matchingAddQA.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (matchingCheck3.isVisible() == false
						&& matchingCheck4.isVisible() == false
						&& matchingCheck5.isVisible() == false) {
					matchingCheck3.setVisible(true);
					matchingQ3.setVisible(true);
					matchingA3.setVisible(true);
				} else if (matchingCheck3.isVisible() == true
						&& matchingCheck4.isVisible() == false
						&& matchingCheck5.isVisible() == false) {
					matchingCheck4.setVisible(true);
					matchingQ4.setVisible(true);
					matchingA4.setVisible(true);
				} else{
					matchingCheck5.setVisible(true);
					matchingQ5.setVisible(true);
					matchingA5.setVisible(true);
				}
			}

		});
		questionPanel.add(matchingQ1, "pushx, growx");
		questionPanel.add(matchingA1, "pushx, growx");
		questionPanel.add(matchingCheck1, "wrap");
		questionPanel.add(matchingQ2, "cell 1 2,pushx, growx");
		questionPanel.add(matchingA2, "pushx, growx");
		questionPanel.add(matchingCheck2, "wrap");
		questionPanel.add(matchingQ3, "cell 1 3,pushx, growx");
		questionPanel.add(matchingA3, "pushx, growx");
		questionPanel.add(matchingCheck3, "wrap");
		matchingQ3.setVisible(false);
		matchingA3.setVisible(false);
		matchingCheck3.setVisible(false);
		questionPanel.add(matchingQ4, "cell 1 4,pushx, growx");
		questionPanel.add(matchingA4, "pushx, growx");
		questionPanel.add(matchingCheck4, "wrap");
		matchingQ4.setVisible(false);
		matchingA4.setVisible(false);
		matchingCheck4.setVisible(false);
		questionPanel.add(matchingQ5, "cell 1 5,pushx, growx");
		questionPanel.add(matchingA5, "pushx, growx");
		questionPanel.add(matchingCheck5, "wrap");
		matchingQ5.setVisible(false);
		matchingA5.setVisible(false);
		matchingCheck5.setVisible(false);

		matchingContainer.add(matchingTitleLabel, "split");
		matchingContainer.add(matchingQuestionText, "pushx, growx, span, wrap");
		matchingContainer.add(questionPanel, "pushx, growx, wrap");

		matchingPanel.add(matchingContainer, "pushx, growx, span");

		matchingRemovePanel.add(matchingRemoveLabel);
		matchingRemovePanel.add(matchingRemoveButton);
		matchingRemovePanel.setBorder(BorderFactory
				.createEtchedBorder(EtchedBorder.LOWERED));
		matchingContainer.add(matchingRemovePanel);

		// fill the blanks panel goes here
		fillBlanksPanel.add(test7);

		tabBar.add("Essay", essayPanel);
		tabBar.add("True/False", trueFalsePanel);
		tabBar.add("Multiple Choice Basic", MCQPanel);
		tabBar.add("Multiple Choice Advanced", MCQAPanel);
		tabBar.add("Numerical", numericalPanel);
		tabBar.add("Matching", matchingPanel);
		tabBar.add("Fill Blanks", fillBlanksPanel);

		topPanel.add(save, "split 1");
		topPanel.add(delete, "wrap");

		add(topPanel, "span, pushx, growx");
		add(tabBar, "pushx, growx, pushy, growy");
	}

	public static void main(String[] args) {

		GiftGui gg = new GiftGui();

		gg.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		gg.setLocation(300, 300);
		gg.setSize(800, 300);

		gg.setVisible(true);

	}

}
