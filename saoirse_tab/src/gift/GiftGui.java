package gift;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

import net.miginfocom.swing.MigLayout;

public class GiftGui extends JFrame implements ActionListener{
	
	JPanel essayPanel = new JPanel(new MigLayout("","[][][]","[][][]"));
	JPanel trueFalsePanel = new JPanel();
	JPanel MCQPanel = new JPanel(new MigLayout("debug","",""));
	JPanel MCQAPanel = new JPanel();
	JPanel numericalPanel = new JPanel(new MigLayout("debug","",""));
	JPanel matchingPanel = new JPanel();
	JPanel fillBlanksPanel = new JPanel();
	public static boolean isPressed = false;
	JRadioButton extra_radio = new JRadioButton("Correct");
	
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

	JButton MCQButton = new JButton("Add Answer");
	JButton MCQButton2 = new JButton("Remove Answer");
	JButton MCQButton3 = new JButton("Clear Question");
	JButton MCQButton4 = new JButton("Create Gift Code");
	JButton MCQButton5 = new JButton("Clear Output List");

	JRadioButton MCQRadio = new JRadioButton("Correct");
	JRadioButton MCQRadio2 = new JRadioButton("Correct");
	JRadioButton MCQRadio3 = new JRadioButton("Correct");
	JRadioButton MCQRadio4 = new JRadioButton("Correct");

	JTextArea MCQquestionText = new JTextArea("Question Text");
	JTextArea MCQanswerText1 = new JTextArea("Text");
	JTextArea MCQanswerText2 = new JTextArea("Text");
	JTextArea MCQanswerText3 = new JTextArea("Text");
	JTextArea MCQanswerText4 = new JTextArea("Text");
	JTextArea MCQanswerText5 = new JTextArea("Text");
	JTextArea MCQanswerText6 = new JTextArea("Text");
	JTextArea MCQanswerText7 = new JTextArea("Text");
	JTextArea MCQanswerText8 = new JTextArea("Text");

	JTextArea GiftOutput= new JTextArea();

	Container numericalContainer = new Container();

	//4 containers for each area
	Container MCQContainer = new Container();
	Container answerContainer = new Container();
	Container answer2Container = new Container();
	Container radioContainer = new Container();
	Container OutputContainer = new Container();
	Container ButtonContainer = new Container();
	JTextField textField;
	JTextField extra_feed;
	JTabbedPane tabBar = new JTabbedPane();
	
	public GiftGui() {
		
		setLayout(new MigLayout("","[][]","[][][]"));//
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
		//MCQPanel.add(test3);
		//essay panel goes here
		//essayPanel.add(test1);

	//	trueFalsePanel.add(test2);

		MCQContainer.setLayout(new MigLayout("debug","[][][][][][]","[][]"));
		answerContainer.setLayout(new MigLayout("","[][]","[][][][][][]"));
		answer2Container.setLayout(new MigLayout("debug","[][]","[][][][][][]"));
		radioContainer.setLayout(new MigLayout("debug","[]","[][][][][]"));
		ButtonContainer.setLayout(new MigLayout("debug","[][]","[][][][]"));
		OutputContainer.setLayout(new MigLayout("debug","[]","[][]"));

		JLabel MCQtitle = new JLabel("Question Title:");
		JTextField MCQTitleText = new JTextField("Title Text");
		MCQTitleText.setBackground(Color.WHITE);
		JLabel MCQquestion = new JLabel("Question:");
		JLabel MCQanswer = new JLabel("Answer:           ");
		JLabel MCQoutput = new JLabel("GIFT Output:");
		JLabel MCQChoice = new JLabel("Choice:");
		JLabel MCQFeedback = new JLabel("Feedback:");
		JLabel MCQSelect = new JLabel("Select:");

		MCQButton.addActionListener(this);
		MCQButton2.addActionListener(this);
		MCQButton3.addActionListener(this);
		MCQButton4.addActionListener(this);
		MCQButton5.addActionListener(this);


		MCQquestionText.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		MCQanswerText1.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		MCQanswerText2.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		MCQanswerText3.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		MCQanswerText4.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		MCQanswerText5.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		MCQanswerText6.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		MCQanswerText7.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		MCQanswerText8.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		GiftOutput.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));

		MCQContainer.add(MCQtitle);
		MCQContainer.add(MCQTitleText,"pushx, growx, span, wrap");
		MCQContainer.add(MCQquestion);
		MCQContainer.add(MCQquestionText,"h 40!, pushx, growx, span, wrap");

		answerContainer.add(MCQanswer);
		answerContainer.add(MCQChoice);
		answer2Container.add(MCQFeedback);
		radioContainer.add(MCQSelect);

		answerContainer.add(MCQanswerText1, " cell 1 1,pushx, growx, span, wrap");//col, row
		answerContainer.add(MCQanswerText2, "pushx, growx, span, wrap, cell 1 2");
		answerContainer.add(MCQanswerText3, "pushx, growx, span, wrap, cell 1 3");
		answerContainer.add(MCQanswerText4, "h 20!, w 300!,wrap, cell 1 4");

		answer2Container.add(MCQanswerText5, "pushx, growx, span, wrap, cell 0 1");
		answer2Container.add(MCQanswerText6, "pushx, growx, span, wrap, cell 0 2");
		answer2Container.add(MCQanswerText7, "pushx, growx, span, wrap, cell 0 3");
		answer2Container.add(MCQanswerText8, "pushx, growx, span, wrap, cell 0 4");

		radioContainer.add(MCQRadio,  ", cell 0 1");
		radioContainer.add(MCQRadio2, ", cell 0 2");
		radioContainer.add(MCQRadio3, ", cell 0 3");
		radioContainer.add(MCQRadio4, ", cell 0 4,wrap");

		ButtonContainer.add(MCQButton, "gapleft 80, cell 1 0");
		ButtonContainer.add(MCQButton2, "gapleft 80, cell 1 1");
		ButtonContainer.add(MCQButton3, "gapleft 400, cell 4 0");
		ButtonContainer.add(MCQButton4, "gapleft 400, cell 4 1");

		OutputContainer.add( MCQoutput);
		OutputContainer.add( GiftOutput, "cell 0 1 ,h 200!, pushx, growx, span, wrap");
		OutputContainer.add( MCQButton5, "gapleft 600");

		GiftOutput.setText("::This is multiple choice::");

		MCQPanel.add(MCQContainer, "pushx, growx, span");
		MCQPanel.add(answerContainer,"w 350, pushx, growx");
		MCQPanel.add(answer2Container,"w 300, pushx, growx");
		MCQPanel.add(radioContainer,"wrap");


		MCQPanel.add(ButtonContainer,"pushx, growx, span");
		MCQPanel.add(OutputContainer,"pushx, growx, span");

		// MCQA panel goes here
		MCQAPanel.add(test4);
		
		//numerical panel goes here
		numericalContainer.setLayout(new MigLayout("debug","[][][][][][]","[][]"));
		String[] numbers = {"-2","-1","0","1","2"};
		JLabel title = new JLabel("Question Title:");
		JLabel question = new JLabel("Question:");
		JLabel answer = new JLabel("Answer:");
		JLabel output = new JLabel("GIFT Output:");
		SpinnerListModel numberModel = new SpinnerListModel(numbers);
		JSpinner options = new JSpinner(numberModel);
		JTextArea questionText = new JTextArea();
		JTextArea answerText = new JTextArea();
		JTextArea outputText = new JTextArea();
		questionText.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		answerText.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));

		numericalContainer.add(title);
		numericalContainer.add(options,"wrap");
		numericalContainer.add(question);
		numericalContainer.add(questionText,"pushx, growx, span, wrap");
		numericalContainer.add(answer);
		//TODO split answer text into answer and feedback
		numericalContainer.add(answerText,"pushx, growx, span, wrap");
		
		numericalContainer.add(clearQ,"align right, span, wrap");
		numericalContainer.add(create,"align right, span, wrap");
		numericalContainer.add(output);
		numericalContainer.add(outputText,"pushx, growx, span, wrap");
		numericalContainer.add(clearOut, "align right, span, wrap");
		numericalPanel.add(numericalContainer,"pushx, growx, span");
		//matching panel goes here
		matchingPanel.add(test6);
		
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
		
		gg.setLocation(300,300);
		gg.setSize(800,700);
		
		gg.setVisible(true);
		

	}
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == MCQButton)
		{

			textField = new JTextField("Text");
			answerContainer.add(textField," gapleft 82,  pushx, growx, span, wrap");
			textField.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
			extra_feed = new JTextField("Text");
			answer2Container.add(extra_feed," pushx, growx, span, wrap");
			textField.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
			 extra_radio = new JRadioButton("Correct");
			radioContainer.add(extra_radio,  "wrap");
		}
		else if(e.getSource() == MCQButton2)
		{
			answerContainer.remove(textField);
			repaint();
			answer2Container.remove(extra_feed);
			repaint();
			radioContainer.remove(extra_radio);
		}
		else if(e.getSource() == MCQButton3) {

			MCQanswerText1.setText("Text");
			MCQanswerText2.setText("Text");
			MCQanswerText3.setText("Text");
			MCQanswerText4.setText("Text");
			MCQanswerText5.setText("Text");
			MCQanswerText6.setText("Text");
			MCQanswerText7.setText("Text");
			MCQanswerText8.setText("Text");
			textField.setText("Text");
			extra_feed.setText("Text");

		}
			else if(e.getSource() == MCQButton4) {
			String QuestionText = MCQquestionText.getText();

			GiftOutput.append(QuestionText + "{" + "\n");

			String answer = MCQanswerText1.getText();
			String answer2 = MCQanswerText2.getText();
			String answer3 = MCQanswerText3.getText();
			String answer4 = MCQanswerText4.getText();

			if(MCQRadio.isSelected()) {
				GiftOutput.append(" = " + answer + "\n");
				GiftOutput.append(" ~ " + answer2 + "\n");
				GiftOutput.append(" ~ " + answer3 + "\n");
				GiftOutput.append(" ~ " + answer4 + "\n");
			}
			else if(MCQRadio2.isSelected())
			{
				GiftOutput.append(" ~ " + answer + "\n");
				GiftOutput.append(" = " + answer2 + "\n");
				GiftOutput.append(" ~ " + answer3 + "\n");
				GiftOutput.append(" ~ " + answer4 + "\n");
			}
			else if(MCQRadio3.isSelected())
			{
				GiftOutput.append(" = " + answer + "\n");
				GiftOutput.append(" ~ " + answer2 + "\n");
				GiftOutput.append(" = " + answer3 + "\n");
				GiftOutput.append(" ~ " + answer4 + "\n");
			}
			else if(MCQRadio3.isSelected())
			{
				GiftOutput.append(" ~ " + answer + "\n");
				GiftOutput.append(" ~ " + answer2 + "\n");
				GiftOutput.append(" ~ " + answer3 + "\n");
				GiftOutput.append(" = " + answer4 + "\n");
			}

		}
		else if(e.getSource() == MCQButton5) {
			GiftOutput.setText("::This is multiple choice::");
		}

	}
}
