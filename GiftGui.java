package gift;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GiftGui extends JFrame{

	JPanel essayPanel = new JPanel(new MigLayout("debug", "", ""));
	JPanel trueFalsePanel = new JPanel(new MigLayout("debug", "", ""));
	JPanel MCQPanel = new JPanel();
	JPanel MCQAPanel = new JPanel();
	JPanel numericalPanel = new JPanel(new MigLayout("debug","",""));
	JPanel matchingPanel = new JPanel(new MigLayout("debug","",""));
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
	Container matchingContainer = new Container();
	JTabbedPane tabBar = new JTabbedPane();
	
	public GiftGui() {
		
		setLayout(new MigLayout());

		//essay panel goes here
		JLabel ess_title = new JLabel("Question title:");
		JLabel ess_question = new JLabel("Question:");
		JLabel ess_output = new JLabel("GIFT Output:");
		final JTextField essQ_text = new JTextField();
		final JTextArea ess_quest_text = new JTextArea();
		final JTextArea ess_output_text = new JTextArea();
		essQ_text.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		ess_quest_text.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		ess_output_text.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		JButton ess_clear_butt = new JButton("Clear Question");
		JButton ess_create_butt = new JButton("Create GIFT code");
		JButton ess_clear_out = new JButton("Clear Output");

		//Clear Question ActionListener
		ess_clear_butt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ess_quest_text.setText("");
			}
		});

		//Create GIFT code ActionListener
		ess_create_butt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String qTitle = essQ_text.getText();
				String qQuest = ess_quest_text.getText();
				ess_output_text.setText("::" + qTitle + "::" + qQuest + "{}");
				essQ_text.setText("");
				ess_quest_text.setText("");
			}
		});
		//Clear Output ActionListener
		ess_clear_out.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				essQ_text.setText("");
				ess_output.setText("");
			}
		});

		essayPanel.add(ess_title,"right");
		essayPanel.add(essQ_text,"pushx, growx, wrap");
		essayPanel.add(ess_question,"right, top");
		essayPanel.add(ess_quest_text,"pushx, growx, pushy, growy, wrap");
		essayPanel.add(ess_clear_butt,"right, span2, w 150, wrap");
		essayPanel.add(ess_create_butt,"right, span2, w 150, wrap");
		essayPanel.add(ess_output,"right, top");
		essayPanel.add(ess_output_text,"pushx, growx, pushy, growy, wrap");
		essayPanel.add(ess_clear_out, "right, span2, w 150,");
		/* ======================================================================================================= */
		 //True False panel goes here
		JPanel trueFalse = new JPanel(new MigLayout("debug", "[]", "[]"));
		JPanel butt_pair = new JPanel(new MigLayout("debug", "[grow]", "[] []"));
		JPanel combined = new JPanel(new MigLayout("", "[]push[]", ""));

		Border loweredborder = new SoftBevelBorder(SoftBevelBorder.LOWERED);
		trueFalse.setBorder(new TitledBorder(loweredborder, "Select"));
		JLabel torf_title = new JLabel("Question title:");
		JLabel torf_question = new JLabel("Question:");
		JLabel torf_output = new JLabel("GIFT Output:");
		JLabel t_or_f = new JLabel("Answer:");

		final JTextField torf_text = new JTextField();
		final JTextArea torf_q_text = new JTextArea();
		final JTextArea torf_out_text = new JTextArea();

		torf_text.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		torf_q_text.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		torf_out_text.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));

		JButton clear_out = new JButton("Clear Output");
		JButton clear_butt = new JButton("Clear Question");
		JButton create_butt = new JButton("Create GIFT code");
		JRadioButton true_butt = new JRadioButton("True");
		JRadioButton false_butt = new JRadioButton("False");
		ButtonGroup butt_group = new ButtonGroup();

		clear_butt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				torf_text.setText("");
				torf_q_text.setText("");
				butt_group.clearSelection();
			}
		});
		create_butt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String qTitle = torf_text.getText();
				String qQuest = torf_q_text.getText();

				if (true_butt.isSelected()) {
					torf_out_text.setText("::" + qTitle + "::" + qQuest + "{T}");
				} else if (false_butt.isSelected()) {
					torf_out_text.setText("::" + qTitle + "::" + qQuest + "{F}");
				}
				torf_text.setText("");
				torf_q_text.setText("");
				butt_group.clearSelection();
			}
		});
		clear_out.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				torf_out_text.setText("");
				butt_group.clearSelection();
			}
		});

		butt_group.add(true_butt);
		butt_group.add(false_butt);
		trueFalse.add(true_butt);
		trueFalse.add(false_butt);
		butt_pair.add(clear_butt, "right, w 150, wrap");
		butt_pair.add(create_butt, "right, w 150");
		combined.add(trueFalse, "left, growx, pushx");
		combined.add(butt_pair, "right, growx, pushx");
		trueFalsePanel.add(torf_title,"right");
		trueFalsePanel.add(torf_text,"pushx, growx, wrap");
		trueFalsePanel.add(torf_question,"right, top");
		trueFalsePanel.add(torf_q_text,"pushx, growx, pushy, growy, wrap");
		trueFalsePanel.add(t_or_f, "right, top");
		trueFalsePanel.add(combined, "pushx, growx, wrap");
		trueFalsePanel.add(torf_output,"right, top");
		trueFalsePanel.add(torf_out_text,"pushx, growx, pushy, growy, wrap");
		trueFalsePanel.add(clear_out, "right, span2, w 150,");
		/* ======================================================================================================== */
		//MCQ panel goes here
		MCQPanel.add(test3);
		
		// MCQA panel goes here
		MCQAPanel.add(test4);
		
		//numerical panel goes here
		numericalContainer.setLayout(new MigLayout("","[][][][][][]","[][]"));
		String[] numbers = {"-2","-1","0","1","2"};
		JLabel title = new JLabel("Question Title:");
		JLabel questionLabel = new JLabel("Question:");
		JLabel answerLabel = new JLabel("Answer:");
		JLabel feedbackLabel = new JLabel("Feedback");
		JLabel outputLabel = new JLabel("GIFT Output:");
		SpinnerListModel numberModel = new SpinnerListModel(numbers);
		JSpinner options = new JSpinner(numberModel);
		JTextArea questionText = new JTextArea();
		JTextArea answerText = new JTextArea();
		JTextArea feedbackText = new JTextArea();
		JTextArea outputText = new JTextArea();
		questionText.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		answerText.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		feedbackText.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		numericalContainer.add(title);
		numericalContainer.add(options,"wrap");
		
		//TODO reduce gap between question label and text field
		numericalContainer.add(questionLabel);
		numericalContainer.add(questionText,"pushx, growx, span, wrap");
		
		numericalContainer.add(answerLabel);
		numericalContainer.add(feedbackLabel, "wrap");
		numericalContainer.add(answerText,"pushx, growx");
		numericalContainer.add(feedbackText,"pushx, growx, span, wrap");
		
		numericalContainer.add(clearQ,"align right, span, wrap");
		numericalContainer.add(create,"align right, span, wrap");
		
		numericalContainer.add(outputLabel);
		numericalContainer.add(outputText,"pushx, growx, span, wrap");
		numericalContainer.add(clearOut, "align right, span, wrap");
		numericalPanel.add(numericalContainer,"pushx, growx, span");
		
		//matching panel goes here
		matchingContainer.setLayout(new MigLayout("debug","[][][][][][]","[][]"));
		JLabel matchingTitleLabel = new JLabel("Question Title:");
		JLabel matchingQuestionLabel = new JLabel("Question:");
		JLabel matchingAnswerLabel = new JLabel("Answer:");
		JLabel matchingSelectLabel = new JLabel("Select:");
		JLabel matchingGiftOutputLabel = new JLabel("Gift Output:");
		
		JTextArea matchingQuestionText = new JTextArea();
		
		JButton matchingAddQA = new JButton("Add Q&A");
		JButton matchingRemoveSelected = new JButton("Remove Selected");
		
		matchingContainer.add(matchingTitleLabel);
		matchingContainer.add(matchingQuestionText,"pushx, growx, span, wrap");
		matchingContainer.add(matchingAddQA,"cell 1 2");
		/*TODO initially add 1 Q and A pair.
		 button press will call some kind of creator method to add additional pairs.
		 is there a JTextArea factory? Maybe store in an array and increment with button?*/
		
		matchingPanel.add(matchingContainer, "pushx, growx, span");
		
		//fill the blanks panel goes here
		fillBlanksPanel.add(test7);
		
		tabBar.add("Essay",essayPanel);
		tabBar.add("True/False",trueFalsePanel);
		tabBar.add("Multiple Choice Basic",MCQPanel);
		tabBar.add("Multiple Choice Advanced",MCQAPanel);
		tabBar.add("Numerical",numericalPanel);
		tabBar.add("Matching",matchingPanel);
		tabBar.add("Fill Blanks",fillBlanksPanel);
		
		topPanel.add(save,"split 1");
		topPanel.add(delete,"wrap");
		
		add(topPanel,"span, pushx, growx");
		add(tabBar,"pushx, growx, pushy, growy");
	}

	public static void main(String[] args) {
		
		GiftGui gg = new GiftGui();
		
		gg.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		gg.setLocation(400,200);
		gg.setSize(800,500);
		
		gg.setVisible(true);
		

	}

}
