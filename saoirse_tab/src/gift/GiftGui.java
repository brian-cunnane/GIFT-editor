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
	JPanel MCQAPanel = new JPanel(new MigLayout("debug","",""));
	JPanel numericalPanel = new JPanel(new MigLayout("debug","",""));
	JPanel matchingPanel = new JPanel();
	JPanel fillBlanksPanel = new JPanel();
	public static boolean isPressed = false;
	JRadioButton extra_radio = new JRadioButton("Correct");
	JRadioButton FillBlanksextra_radio = new JRadioButton("Correct");


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

	JButton MCQAButton = new JButton("Add Answer");
	JButton MCQAButton2 = new JButton("Remove Answer");
	JButton MCQAButton3 = new JButton("Clear Question");
	JButton MCQAButton4 = new JButton("Create Gift Code");
	JButton MCQAButton5 = new JButton("Clear Output List");

	JRadioButton MCQRadio = new JRadioButton("Correct");
	JRadioButton MCQRadio2 = new JRadioButton("Correct");
	JRadioButton MCQRadio3 = new JRadioButton("Correct");
	JRadioButton MCQRadio4 = new JRadioButton("Correct");

	JTextArea MCQquestionText = new JTextArea("");
	JTextArea MCQanswerText1 = new JTextArea("");
	JTextArea MCQanswerText2 = new JTextArea("");
	JTextArea MCQanswerText3 = new JTextArea("");
	JTextArea MCQanswerText4 = new JTextArea("");
	JTextArea MCQanswerText5 = new JTextArea("");
	JTextArea MCQanswerText6 = new JTextArea("");
	JTextArea MCQanswerText7 = new JTextArea("");
	JTextArea MCQanswerText8 = new JTextArea("");

	JTextArea MCQAquestionText = new JTextArea("");
	JTextArea MCQAanswerText1 = new JTextArea("");
	JTextArea MCQAanswerText2 = new JTextArea("");
	JTextArea MCQAanswerText3 = new JTextArea("");
	JTextArea MCQAanswerText4 = new JTextArea("");
	JTextArea MCQAanswerText5 = new JTextArea("");
	JTextArea MCQAanswerText6 = new JTextArea("");

	JTextArea FillBlanksquestionText = new JTextArea("");
	JTextArea FillBlanksanswerText1 = new JTextArea("");
	JTextArea FillBlanksanswerText2 = new JTextArea("");
	JTextArea FillBlanksanswerText3 = new JTextArea("");
	JTextArea FillBlanksanswerText4 = new JTextArea("");
	JTextArea FillBlanksanswerText5 = new JTextArea("");

	JButton FillBlanksButton = new JButton("Add Answer");
	JButton FillBlanksButton2 = new JButton("Remove Answer");
	JButton FillBlanksButton3 = new JButton("Clear Question");
	JButton FillBlanksButton4 = new JButton("Create Gift Code");
	JButton FillBlanksButton5 = new JButton("Clear Output List");

	JRadioButton FillBlanksRadio = new JRadioButton("Correct");
	JRadioButton FillBlanksRadio2 = new JRadioButton("Correct");
	JRadioButton FillBlanksRadio3 = new JRadioButton("Correct");
	JRadioButton FillBlanksRadio4 = new JRadioButton("Correct");


	String[] MCQAnumbers = {"-2","-1","0","1","2"};
	String[] MCQAnumbers2 = {"-2","-1","0","1","2"};
	String[] MCQAnumbers3 = {"-2","-1","0","1","2"};

	SpinnerListModel MCQnumberModel = new SpinnerListModel(MCQAnumbers);
	SpinnerListModel MCQnumberModel2 = new SpinnerListModel(MCQAnumbers2);
	SpinnerListModel MCQnumberModel3 = new SpinnerListModel(MCQAnumbers3);

	JSpinner MCQAoptions = new JSpinner(MCQnumberModel);
	JSpinner MCQAoptions2 = new JSpinner(MCQnumberModel2);
	JSpinner MCQAoptions3 = new JSpinner(MCQnumberModel3);

	JTextArea GiftOutput= new JTextArea();
	JTextArea MCQAGiftOutput= new JTextArea();
	JTextArea FillBlanksGiftOutput= new JTextArea();

	Container numericalContainer = new Container();

	//4 containers for each area
	Container MCQContainer = new Container();
	Container MCQtitleContainer  = new Container();
	Container answerContainer = new Container();
	Container answer2Container = new Container();
	Container radioContainer = new Container();
	Container OutputContainer = new Container();
	Container ButtonContainer = new Container();

	Container MCQAContainer = new Container();
	Container MCQAtitleContainer = new Container();
	Container MCQAanswerContainer = new Container();
	Container MCQAanswer2Container = new Container();
	Container MCQAradioContainer = new Container();
	Container MCQAOutputContainer = new Container();
	Container MCQAButtonContainer = new Container();

	Container FillBlanksContainer = new Container();
	Container FillBlankstitleContainer  = new Container();
	Container FillBlanksanswerContainer = new Container();
	Container FillBlanksanswer2Container = new Container();
	Container FillBlanksradioContainer = new Container();
	Container FillBlanksOutputContainer = new Container();
	Container FillBlanksButtonContainer = new Container();

	JTextField textField;
	JTextField extra_feed;
	JTextField MCQAtextField;
	JTextField MCQAextra_feed;
	JTextField FillBlankstextField;
	JTextField FillBlanksextra_feed;



	String[] MCQAnumbers5 = {"-1","0","1"};
	SpinnerListModel MCQnumberModel5 = new SpinnerListModel(MCQAnumbers5);
	JSpinner MCQAoptions5 = new JSpinner(MCQnumberModel5);

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

		MCQContainer.setLayout(new MigLayout("debug","[][][][][][]","[][]"));
		MCQtitleContainer.setLayout(new MigLayout("","[]","[]"));
		answerContainer.setLayout(new MigLayout("","[][]","[][][][][][]"));
		answer2Container.setLayout(new MigLayout("debug","[][]","[][][][][][]"));
		radioContainer.setLayout(new MigLayout("debug","[]","[][][][][]"));
		ButtonContainer.setLayout(new MigLayout("debug","[][]","[][]"));
		OutputContainer.setLayout(new MigLayout("debug","[]","[][]"));

		JLabel MCQtitle = new JLabel("Question Title:");
		JTextField MCQTitleText = new JTextField("");
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

		MCQtitleContainer.add(MCQanswer,"aligny top");
		answerContainer.add(MCQChoice);
		answer2Container.add(MCQFeedback);
		radioContainer.add(MCQSelect);

		answerContainer.add(MCQanswerText1, " cell 0 1,pushx, growx, span, wrap");//col, row
		answerContainer.add(MCQanswerText2, "pushx, growx, span, wrap, cell 0 2");
		answerContainer.add(MCQanswerText3, "pushx, growx, span, wrap, cell 0 3");
		answerContainer.add(MCQanswerText4, "pushx, growx, span, wrap, cell 0 4");

		answer2Container.add(MCQanswerText5, "pushx, growx, span, wrap, cell 0 1");
		answer2Container.add(MCQanswerText6, "pushx, growx, span, wrap, cell 0 2");
		answer2Container.add(MCQanswerText7, "pushx, growx, span, wrap, cell 0 3");
		answer2Container.add(MCQanswerText8, "pushx, growx, span, wrap, cell 0 4");

		radioContainer.add(MCQRadio,  ", cell 0 1");
		radioContainer.add(MCQRadio2, ", cell 0 2");
		radioContainer.add(MCQRadio3, ", cell 0 3");
		radioContainer.add(MCQRadio4, ", cell 0 4,wrap");

		//ButtonContainer.add(MCQButton, "gapleft 80, cell 1 0");
		ButtonContainer.add(MCQButton, " gapright 440, right, pushx, cell 1 0");
		ButtonContainer.add(MCQButton2, "gapright 420, right, pushx, cell 1 1");
		ButtonContainer.add(MCQButton3, "right,pushx, cell 4 0");
		ButtonContainer.add(MCQButton4, "right,pushx, cell 4 1");

		OutputContainer.add( MCQoutput);
		OutputContainer.add( GiftOutput, "cell 0 1 ,h 200!, pushx, growx, span, wrap");
		OutputContainer.add( MCQButton5, "right,pushx");

		GiftOutput.setText("::This is multiple choice::");

		MCQPanel.add(MCQContainer, "pushx, growx, span");
		MCQPanel.add(MCQtitleContainer, "w 50, h 100, pushx, growx");
		MCQPanel.add(answerContainer,"w 350, pushx, growx");
		MCQPanel.add(answer2Container,"w 300, pushx, growx");
		MCQPanel.add(radioContainer,"wrap");
		MCQPanel.add(ButtonContainer,"pushx, growx, span");
		MCQPanel.add(OutputContainer,"pushx, growx, span");

/* ======================================================================================================== */

		JLabel MCQAtitle = new JLabel("Question Title:");
		JTextField MCQATitleText = new JTextField("");
		MCQATitleText.setBackground(Color.WHITE);
		JLabel MCQAquestion = new JLabel("Question:");
		JLabel MCQAanswer = new JLabel("Answer:");
		JLabel MCQAoutput = new JLabel("GIFT Output:");
		JLabel MCQAChoice = new JLabel("Choice:");
		JLabel MCQAFeedback = new JLabel("Feedback:");
		JLabel MCQASelect = new JLabel("Select:");

		MCQAquestionText.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		MCQAquestionText.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		MCQAanswerText1.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		MCQAanswerText2.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		MCQAanswerText3.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		MCQAanswerText4.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		MCQAanswerText5.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		MCQAanswerText6.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		MCQAGiftOutput.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));

		MCQAButton.addActionListener(this);
		MCQAButton2.addActionListener(this);
		MCQAButton3.addActionListener(this);
		MCQAButton4.addActionListener(this);
		MCQAButton5.addActionListener(this);

		MCQAContainer.setLayout(new MigLayout("debug","[][][][][][]","[][]"));

		MCQAanswerContainer.setLayout(new MigLayout("","[][]","[][][][][][]"));
		MCQAtitleContainer.setLayout(new MigLayout("","[]","[]"));
		MCQAanswer2Container.setLayout(new MigLayout("debug","[]","[]"));
		MCQAradioContainer.setLayout(new MigLayout("debug","[]","[][][][][]"));
		MCQAButtonContainer.setLayout(new MigLayout("debug","[][]","[][][][]"));
		MCQAOutputContainer.setLayout(new MigLayout("debug","[]","[][]"));

		MCQAContainer.add(MCQAtitle);
		MCQAContainer.add(MCQATitleText,"pushx, growx, span, wrap");
		MCQAContainer.add(MCQAquestion);
		MCQAContainer.add(MCQAquestionText,"h 40!, pushx, growx, span, wrap");

		MCQAGiftOutput.setText("::This is multiple choice::");

		MCQAtitleContainer.add(MCQAanswer,"aligny top");
		MCQAanswerContainer.add(MCQAChoice);
		MCQAanswer2Container.add(MCQAFeedback);
		MCQAradioContainer.add(MCQASelect);

		MCQAanswerContainer.add(MCQAanswerText1, " cell 0 1,pushx, growx, span, wrap");//col, row
		MCQAanswerContainer.add(MCQAanswerText2, "pushx, growx, span, wrap, cell 0 2");
		MCQAanswerContainer.add(MCQAanswerText3, "cell 0 3,pushx, growx, span, wrap");

		MCQAanswer2Container.add(MCQAanswerText4, "pushx, growx, span, wrap, cell 0 1");
		MCQAanswer2Container.add(MCQAanswerText5, "pushx, growx, span, wrap, cell 0 2");
		MCQAanswer2Container.add(MCQAanswerText6, "pushx, growx, span, wrap, cell 0 3");

		MCQAradioContainer.add(MCQAoptions,  ", cell 0 1");
		MCQAradioContainer.add(MCQAoptions2, ", cell 0 2");
		MCQAradioContainer.add(MCQAoptions3, ", cell 0 3,wrap");

		MCQAButtonContainer.add(MCQAButton, "gapright 440, right, pushx, cell 1 0");
		MCQAButtonContainer.add(MCQAButton2, "gapright 420, right, pushx, cell 1 1");
		MCQAButtonContainer.add(MCQAButton3, "right,pushx, cell 4 0");
		MCQAButtonContainer.add(MCQAButton4, "right,pushx, cell 4 1");

		MCQAOutputContainer.add( MCQAoutput);
		MCQAOutputContainer.add( MCQAGiftOutput, "cell 0 1 ,h 200!, pushx, growx, span, wrap");
		MCQAOutputContainer.add( MCQAButton5, "right,pushx");

		MCQAPanel.add(MCQAContainer, "pushx, growx, span");
		MCQAPanel.add(MCQAtitleContainer, "w 50, h 100, pushx, growx");
		MCQAPanel.add(MCQAanswerContainer,"w 350, pushx, growx");
		MCQAPanel.add(MCQAanswer2Container,"w 300, pushx, growx");
		MCQAPanel.add(MCQAradioContainer,"wrap");
		MCQAPanel.add(MCQAButtonContainer,"pushx, growx, span");
		MCQAPanel.add(MCQAOutputContainer,"pushx, growx, span");
/* ======================================================================================================== */
		//numerical panel goes here
		numericalContainer.setLayout(new MigLayout("debug","[][][][][][]","[][][]"));
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
		/* ======================================================================================================== */
		JLabel FillBlankstitle = new JLabel("Question Title:");
		JTextField FillBlanksTitleText = new JTextField("");
		FillBlanksTitleText.setBackground(Color.WHITE);
		JLabel FillBlanksquestion = new JLabel("Question:");
		JLabel FillBlanksanswer = new JLabel("Answer:");
		JLabel FillBlanksoutput = new JLabel("GIFT Output:");
		JLabel FilleBlanksChoice = new JLabel("Choice:");
		JLabel FilleBlanksQEnd = new JLabel("Question End:");

		fillBlanksPanel.setLayout(new MigLayout("debug","[][][][][]","[][]"));

		FillBlanksquestionText.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		FillBlanksanswerText1.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		FillBlanksanswerText2.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		FillBlanksanswerText3.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		FillBlanksanswerText4.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		FillBlanksanswerText5.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		FillBlanksGiftOutput.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));

		FillBlanksButton.addActionListener(this);
		FillBlanksButton2.addActionListener(this);
		FillBlanksButton3.addActionListener(this);
		FillBlanksButton4.addActionListener(this);
		FillBlanksButton5.addActionListener(this);


		FillBlanksContainer.setLayout(new MigLayout("debug","[][][][][][]","[][]"));
		FillBlankstitleContainer.setLayout(new MigLayout("","[]","[]"));
		FillBlanksanswerContainer.setLayout(new MigLayout("","[]","[][][][][][]"));
		FillBlanksradioContainer.setLayout(new MigLayout("debug","[]","[][][][][]"));
		FillBlanksButtonContainer.setLayout(new MigLayout("debug","[][]","[][]"));
		FillBlanksOutputContainer.setLayout(new MigLayout("debug","[]","[][]"));

		FillBlanksContainer.add(FillBlankstitle);
		FillBlanksContainer.add(FillBlanksTitleText,"pushx, growx, span, wrap");
		FillBlanksContainer.add(FillBlanksquestion);
		FillBlanksContainer.add(FillBlanksquestionText,"h 40!, pushx, growx, span, wrap");

		FillBlanksOutputContainer.add( FillBlanksoutput);

		FillBlanksanswerContainer.add(FilleBlanksChoice);
		FillBlanksanswerContainer.add(FillBlanksanswerText1, " pushx, growx, span, wrap, cell 0 1");//col, row
		FillBlanksanswerContainer.add(FillBlanksanswerText2, "pushx, growx, span, wrap , cell 0 2");
		FillBlanksanswerContainer.add(FillBlanksanswerText3, "pushx, growx, span, wrap , cell 0 3");
		FillBlanksanswerContainer.add(FillBlanksanswerText4, "pushx, growx, span, wrap, , cell 0 4");



		FillBlanksButtonContainer.add(FillBlanksButton, " right, right, pushx, cell 3 0");
		FillBlanksButtonContainer.add(FillBlanksButton2, "wrap, pushx, cell 3 0");


		//FillBlanksButtonContainer.add(FillBlanksButton3, "right,pushx, cell 4 0");
		//FillBlanksButtonContainer.add(FillBlanksButton4, "right,pushx, cell 4 1");
		FillBlanksButtonContainer.add(FilleBlanksQEnd, " left, cell 0 0");
		FillBlanksButtonContainer.add(FillBlanksanswerText5, "h 50!, pushx, growx,span, cell 1 1");
		FillBlanksButtonContainer.add(FillBlanksButton3, "right, pushx, cell 3 2");
		FillBlanksButtonContainer.add(FillBlanksButton4, "right,pushx, cell 3 2");

		FillBlanksradioContainer.add(FillBlanksRadio,  ", cell 0 1");
		FillBlanksradioContainer.add(FillBlanksRadio2, ", cell 0 2");
		FillBlanksradioContainer.add(FillBlanksRadio3, ", cell 0 3");
		FillBlanksradioContainer.add(FillBlanksRadio4, ", cell 0 4,wrap");



		FillBlanksOutputContainer.add( FillBlanksGiftOutput, "cell 0 1 ,h 200!, pushx, growx, span, wrap");
		FillBlanksOutputContainer.add( FillBlanksButton5, "right,pushx");

		FillBlankstitleContainer.add(FillBlanksanswer,"aligny top");



		fillBlanksPanel.add(FillBlanksContainer, "pushx, growx, span");
		fillBlanksPanel.add(FillBlankstitleContainer, "w 10, h 100, pushx, growx");
		fillBlanksPanel.add(FillBlanksanswerContainer," w 400, pushx, growx");
		fillBlanksPanel.add(FillBlanksradioContainer,"wrap");

		fillBlanksPanel.add(FillBlanksButtonContainer,"pushx, growx, span");
		fillBlanksPanel.add(FillBlanksanswer2Container,", pushx, growx,span");
		fillBlanksPanel.add(FillBlanksOutputContainer,"pushx, growx, span");

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
		gg.setSize(1000,1000);
		
		gg.setVisible(true);
		

	}
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == MCQButton)
		{

			textField = new JTextField("Text");
			answerContainer.add(textField,"   pushx, growx, span, wrap");
			textField.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
			extra_feed = new JTextField("Text");
			answer2Container.add(extra_feed," pushx, growx, span, wrap");
			extra_feed.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
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

			MCQanswerText1.setText("");
			MCQanswerText2.setText("");
			MCQanswerText3.setText("");
			MCQanswerText4.setText("");
			MCQanswerText5.setText("");
			MCQanswerText6.setText("");
			MCQanswerText7.setText("");
			MCQanswerText8.setText("");
			textField.setText("");
			extra_feed.setText("");

		}
			else if(e.getSource() == MCQButton4) {
			String QuestionText = MCQquestionText.getText();

			GiftOutput.append(QuestionText + "{" + "\n");

			String answer = MCQanswerText1.getText();
			String answer2 = MCQanswerText2.getText();
			String answer3 = MCQanswerText3.getText();
			String answer4 = MCQanswerText4.getText();

			String feedback = MCQanswerText5.getText();
			String feedback2 = MCQanswerText6.getText();
			String feedback3 = MCQanswerText7.getText();
			String feedback4 = MCQanswerText8.getText();

			if(MCQRadio.isSelected()) {
				GiftOutput.append(" = " + answer + "\n" + "#Yes-Well done" +"\n");
				GiftOutput.append(" ~ " + answer2 + "\n"+ "#" + feedback2 +"\n");
				GiftOutput.append(" ~ " + answer3 + "\n"+ "#" + feedback3 +"\n");
				GiftOutput.append(" ~ " + answer4 + "\n"+ "#" + feedback4 +"\n");
			}
			else if(MCQRadio2.isSelected())
			{
				GiftOutput.append(" ~ " + answer + "\n" + "#" + feedback+ "\n");
				GiftOutput.append(" = " + answer2 + "\n"+ "#Yes-Well done" +"\n");
				GiftOutput.append(" ~ " + answer3 + "\n"+ "#" + feedback3 +"\n");
				GiftOutput.append(" ~ " + answer4 + "\n"+ "#" + feedback4 +"\n");
			}
			else if(MCQRadio3.isSelected())
			{
				GiftOutput.append(" ~ " + answer + "\n" + "#" + feedback+ "\n");
				GiftOutput.append(" ~ " + answer2 + "\n"+ "#"+ feedback2 + "\n");
				GiftOutput.append(" = " + answer3 + "\n"+ "#Yes-Well done" +"\n");
				GiftOutput.append(" ~ " + answer4 + "\n"+ "#" + feedback4 +"\n");
			}
			else if(MCQRadio3.isSelected())
			{
				GiftOutput.append(" ~ " + answer + "\n" + "#" + feedback+ "\n");
				GiftOutput.append(" ~ " + answer2 + "\n"+ "#"+ feedback2 + "\n");
				GiftOutput.append(" ~ " + answer3 + "\n"+ "#"+ feedback3 +"\n");
				GiftOutput.append(" = " + answer4 + "\n"+ "#Yes-Well done"  +"\n");
			}

		}
		else if(e.getSource() == MCQButton5) {
			GiftOutput.setText("::This is multiple choice::");
		}
		else if(e.getSource() == MCQAButton)
		{

			MCQAtextField = new JTextField("Text");
			MCQAanswerContainer.add(MCQAtextField,"  pushx, growx, span, wrap");
			MCQAtextField.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
			MCQAextra_feed = new JTextField("Text");
			MCQAanswer2Container.add(MCQAextra_feed," pushx, growx, span, wrap");
			MCQAtextField.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
			MCQAradioContainer.add(MCQAoptions5, "wrap");
		}
		else if(e.getSource() == MCQAButton2)
		{
			MCQAanswerContainer.remove(MCQAtextField);
			repaint();
			MCQAanswer2Container.remove(MCQAextra_feed);
			repaint();
			MCQAradioContainer.remove(MCQAoptions5);
		}
		else if(e.getSource() == MCQAButton3) {

			MCQAanswerText1.setText("");
			MCQAanswerText2.setText("");
			MCQAanswerText3.setText("");
			MCQAanswerText4.setText("");
			MCQAanswerText5.setText("");
			MCQAanswerText6.setText("");
			MCQAtextField.setText("");
			MCQAextra_feed.setText("");

		}
		else if(e.getSource() == MCQAButton4) {
			String QuestionText = MCQAquestionText.getText();

			MCQAGiftOutput.append(QuestionText + "{" + "\n");

			String answer = MCQAanswerText1.getText();
			String answer2 = MCQAanswerText2.getText();
			String answer3 = MCQAanswerText3.getText();

			String feedback = MCQAanswerText4.getText();
			String feedback2 = MCQAanswerText5.getText();
			String feedback3 = MCQAanswerText6.getText();

			String currentValue =  (String) MCQAoptions.getValue();
			String currentValue2 = (String) MCQAoptions2.getValue();
			String currentValue3 = (String) MCQAoptions3.getValue();
			String currentValue5 = (String) MCQAoptions5.getValue();

			MCQAGiftOutput.append(" ~%" + currentValue + "%" + answer + "\n");
				MCQAGiftOutput.append("#" + feedback + "\n");
			MCQAGiftOutput.append(" ~%" + currentValue2 + "%" + answer2 + "\n");
			MCQAGiftOutput.append("#" + feedback2 + "\n");
			MCQAGiftOutput.append(" ~%" + currentValue3 + "%" + answer3 + "\n");
			MCQAGiftOutput.append("#" + feedback3 + "\n");

		}
		else if(e.getSource() == MCQButton5) {
			MCQAGiftOutput.setText("::This is multiple choice::");
		}

		else if(e.getSource() == FillBlanksButton) {
			FillBlankstextField= new JTextField("");
			FillBlanksanswerContainer.add(FillBlankstextField,"   pushx, growx, span, wrap");
			FillBlankstextField.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
			FillBlanksextra_radio = new JRadioButton("Correct");
			FillBlanksradioContainer.add(FillBlanksextra_radio,  "wrap");
		}
		else if(e.getSource() == FillBlanksButton2)
		{
			FillBlanksanswerContainer.remove(FillBlankstextField);
			repaint();
			FillBlanksradioContainer.remove(FillBlanksextra_radio);
		}
		else if(e.getSource() == FillBlanksButton3) {

			FillBlanksanswerText1.setText("");
			FillBlanksanswerText2.setText("");
			FillBlanksanswerText3.setText("");
			FillBlanksanswerText4.setText("");
			FillBlanksanswerText5.setText("");
			FillBlankstextField.setText("");

		}
		else if(e.getSource() == FillBlanksButton4) {
			//String QuestionText = MCQAquestionText.getText();

			//MCQAGiftOutput.append(QuestionText + "{" + "\n");

			String answer = FillBlanksquestionText.getText();
			String answer2 = FillBlanksanswerText1.getText();
			String answer3 = FillBlanksanswerText2.getText();

			String answer4 = FillBlanksanswerText3.getText();
			String  answer5= FillBlanksanswerText4.getText();
			String answer6 = FillBlanksanswerText5.getText();

			if(FillBlanksRadio.isSelected()) {
				FillBlanksGiftOutput.append(answer + " {" + "=" + answer2 + "~" + answer3 + "~" + answer4 + "~" + answer5 + "}" + answer6);
			}
			else if(FillBlanksRadio2.isSelected())
			{
				FillBlanksGiftOutput.append(answer + " {" + "~" + answer2 + "=" + answer3 + "~" + answer4 + "~" + answer5 + "}" + answer6);
			}
			else if(FillBlanksRadio3.isSelected())
			{
				FillBlanksGiftOutput.append(answer + " {" + "~" + answer2 + "~" + answer3 + "=" + answer4 + "~" + answer5 + "}" + answer6);

			}
			else if(FillBlanksRadio4.isSelected())
			{
				FillBlanksGiftOutput.append(answer + " {" + "~" + answer2 + "~" + answer3 + "~" + answer4 + "=" + answer5 + "}" + answer6);

			}




		}




	}
}
