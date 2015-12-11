package gift;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.*;

import net.miginfocom.swing.MigLayout;

public class GiftGui extends JFrame implements ActionListener{
	
	JPanel essayPanel = new JPanel(new MigLayout("","[][][]","[][][]"));
	JPanel trueFalsePanel = new JPanel(new MigLayout("","[][][]","[][][]"));
	JPanel MCQPanel = new JPanel(new MigLayout("debug","",""));
	JPanel MCQAPanel = new JPanel(new MigLayout("debug","",""));
	JPanel numericalPanel = new JPanel(new MigLayout("debug","",""));
	JPanel matchingPanel = new JPanel(new MigLayout("debug","",""));
	JPanel fillBlanksPanel = new JPanel();
	public static boolean isPressed = false;
	public static int button_Press=0;
	JRadioButton extra_radio = new JRadioButton("Correct");
    JRadioButton extra_radio2 = new JRadioButton("Correct");
    JRadioButton extra_radio3 = new JRadioButton("Correct");
	JRadioButton FillBlanksextra_radio = new JRadioButton("Correct");
    JRadioButton FillBlanksextra_radio2 = new JRadioButton("Correct");
    JTextField MCQATitleText = new JTextField("");
    JRadioButton FillBlanksextra_radio3 = new JRadioButton("Correct");
    JTextField FillBlanksTitleText = new JTextField("");


	JLabel test6 = new JLabel("test6");
	JLabel test7 = new JLabel("test7");
	
	JPanel topPanel = new JPanel();
	
	JButton clearQ = new JButton("Clear Question");
	JButton clearOut = new JButton("Clear Output");
	JButton delete = new JButton("delete");
	JButton save = new JButton("Save");
	JButton create = new JButton("Create GIFT Code");

    JTextField MCQTitleText = new JTextField("");

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
	JTextArea MatchingGiftOutput=   new JTextArea(10, 10);
	JTextArea FillBlanksGiftOutput= new JTextArea();

	Container numericalContainer = new Container();
	Container numericalButtonsContainer = new Container();
	Container matchingContainer = new Container();
	Container MatchingOutputContainer = new Container();
	Container MatchingOutputButtonContainer = new Container();

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
    JTextField textField2;
    JTextField extra_feed2;
    JTextField textField3;
    JTextField extra_feed3;


    JTextField MCQAtextField;
	JTextField MCQAextra_feed;
    JTextField MCQAtextField2;
    JTextField MCQAextra_feed2;
    JTextField MCQAtextField3;
    JTextField MCQAextra_feed3;


    JTextField FillBlankstextField;
    JTextField FillBlankstextField2;
    JTextField FillBlankstextField3;



    JTextField MultipleA3 = new JTextField();
    JTextField MultipleA4 = new JTextField();
    JTextField MultipleA5 = new JTextField();
	JTextField FillBlanksextra_feed;

    String[] MCQAnumbers5 = {"-1","0","1"};
	SpinnerListModel MCQnumberModel5 = new SpinnerListModel(MCQAnumbers5);
	JSpinner MCQAoptions5 = new JSpinner(MCQnumberModel5);

    String[] MCQAnumbers6 = {"-1","0","1"};
    SpinnerListModel MCQnumberModel6 = new SpinnerListModel(MCQAnumbers6);
    JSpinner MCQAoptions6 = new JSpinner(MCQnumberModel6);

    String[] MCQAnumbers7 = {"-1","0","1"};
    SpinnerListModel MCQnumberModel7 = new SpinnerListModel(MCQAnumbers7);
    JSpinner MCQAoptions7 = new JSpinner(MCQnumberModel6);


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
        //essayPanel.add(ess_output_text,"pushx, growx, pushy, growy, wrap");
		trueFalsePanel.add(torf_out_text,"pushx, growx, pushy, growy, wrap");
		trueFalsePanel.add(clear_out, "right, span2, w 150!");
		/* ======================================================================================================== */

		MCQContainer.setLayout(new MigLayout("debug","[][][][][][]","[][]"));
		MCQtitleContainer.setLayout(new MigLayout("","[]","[]"));
		answerContainer.setLayout(new MigLayout("","[][]","[][][][][][]"));
		answer2Container.setLayout(new MigLayout("debug","[][]","[][][][][][]"));
		radioContainer.setLayout(new MigLayout("debug","[]","[][][][][]"));
		ButtonContainer.setLayout(new MigLayout("debug","[][]","[][]"));
		OutputContainer.setLayout(new MigLayout("debug","[]","[][]"));

		JLabel MCQtitle = new JLabel("Question Title:");

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

        textField = new JTextField("");
        answerContainer.add(textField,"   pushx, growx, span, wrap, cell 0 5");
        textField.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        textField.setVisible(false);
        extra_feed = new JTextField("");
        answer2Container.add(extra_feed," pushx, growx, span, wrap,cell 0 5");
        extra_feed.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        extra_feed.setVisible(false);

        textField2 = new JTextField("");
        answerContainer.add(textField2,"   pushx, growx, span, wrap, cell 0 6");
        textField2.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        textField2.setVisible(false);
        extra_feed2 = new JTextField("");
        answer2Container.add(extra_feed2," pushx, growx, span, wrap,cell 0 6");
        extra_feed2.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        extra_feed2.setVisible(false);

        textField3 = new JTextField("");
        answerContainer.add(textField3,"   pushx, growx, span, wrap, cell 0 7");
        textField3.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        textField3.setVisible(false);
        extra_feed3 = new JTextField("");
        answer2Container.add(extra_feed3," pushx, growx, span, wrap,cell 0 7");
        extra_feed3.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        extra_feed3.setVisible(false);

        radioContainer.add(MCQRadio,  ", cell 0 1");
		radioContainer.add(MCQRadio2, ", cell 0 2");
		radioContainer.add(MCQRadio3, ", cell 0 3");
		radioContainer.add(MCQRadio4, ", cell 0 4,wrap");

        extra_radio = new JRadioButton("Correct");
        radioContainer.add(extra_radio,  "cell 0 5");
        extra_radio.setVisible(false);
        extra_radio2 = new JRadioButton("Correct");
        radioContainer.add(extra_radio2,  "cell 0 6");
        extra_radio2.setVisible(false);
        extra_radio3 = new JRadioButton("Correct");
        radioContainer.add(extra_radio3,  "cell 0 7,wrap");
        extra_radio3.setVisible(false);

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

        MCQAtextField = new JTextField("Text");
        MCQAanswerContainer.add(MCQAtextField,"  pushx, growx, span, wrap, cell 0 4");
        MCQAtextField.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        MCQAextra_feed = new JTextField("Text");
        MCQAanswer2Container.add(MCQAextra_feed," pushx, growx, span, wrap , cell 0 4");
        MCQAtextField.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        MCQAradioContainer.add(MCQAoptions5, "cell 0 4");

        MCQAtextField.setVisible(false);
        MCQAextra_feed.setVisible(false);
        MCQAoptions5.setVisible(false);

        MCQAtextField2 = new JTextField("Text");
        MCQAanswerContainer.add(MCQAtextField2,"  pushx, growx, span, wrap, cell 0 5");
        MCQAtextField2.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        MCQAextra_feed2 = new JTextField("Text");
        MCQAanswer2Container.add(MCQAextra_feed2," pushx, growx, span, wrap, cell 0 5");
        MCQAtextField2.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        MCQAradioContainer.add(MCQAoptions6, "cell 0 5");

        MCQAtextField2.setVisible(false);
        MCQAextra_feed2.setVisible(false);
        MCQAoptions6.setVisible(false);

        MCQAtextField3 = new JTextField("Text");
        MCQAanswerContainer.add(MCQAtextField3,"  pushx, growx, span, wrap, cell 0 6");
        MCQAtextField.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        MCQAextra_feed3 = new JTextField("Text");
        MCQAanswer2Container.add(MCQAextra_feed3," pushx, growx, span, wrap, cell 0 6");
        MCQAtextField.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        MCQAradioContainer.add(MCQAoptions7, "cell 0 6");

        MCQAtextField3.setVisible(false);
        MCQAextra_feed3.setVisible(false);
        MCQAoptions7.setVisible(false);

        MCQAradioContainer.add(MCQAoptions,  ", cell 0 1");
		MCQAradioContainer.add(MCQAoptions2, ", cell 0 2");
		MCQAradioContainer.add(MCQAoptions3, ", cell 0 3");

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
		numericalContainer.setLayout(new MigLayout("", "", ""));
		numericalButtonsContainer.setLayout(new MigLayout("", "", ""));

		String[] question = { "Answer(+-) set range" };
		JLabel title = new JLabel("Question Type:");
		JLabel questionLabel = new JLabel("Question Title:");
        JLabel question2Label = new JLabel("Question:");
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
        feedbackText.setEnabled(false);
		JTextArea outputText = new JTextArea(10, 10);
        JTextArea numericalRangequestionText = new JTextArea();

		JPanel numericalRange = new JPanel(new MigLayout("", "", ""));

		JLabel numericalRangeLabel = new JLabel("Range (+/-)");
		JLabel numericalEndLabel = new JLabel("Range End:");
		String[] numbers = { "0", "1", "2", "3", "4", "5" };
		SpinnerListModel rangeModel = new SpinnerListModel(numbers);
		JSpinner rangeOptions = new JSpinner(rangeModel);
		JSpinner rangeEnd = new JSpinner(rangeModel);

		numericalRange.setBorder(new TitledBorder("Range Options"));
		numericalRange.add(numericalRangeLabel);
		numericalRange.add(rangeOptions, "w 300 ");
		numericalRange.add(numericalEndLabel);
		rangeEnd.setEnabled(false);
		numericalRange.add(rangeEnd,"w 300 ");
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

       numericalContainer.add(question2Label,"wrap");
        numericalContainer.add(numericalRangequestionText, " gapleft 80, span, pushx, growx, wrap");
        numericalRangequestionText.setBorder(BorderFactory
                .createBevelBorder(BevelBorder.LOWERED));

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
                numericalRangequestionText.setText("");

			}

		});
		numericalContainer.add(clearQ, "align right, span, wrap, sizegroup 2");

		create.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				outputText.append("//Question Type '" + questionType.getSelectedItem() + "'" +"\n");
				outputText.append("::" + questionText.getText() + "::" + numericalRangequestionText.getText());


				outputText.append("{#" + answerText.getText() + ":");
				outputText.append(feedbackText.getText() +"::"+ (String) rangeOptions.getValue()+ "}\n");
			}

		});
        clearOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputText.setText("");
            }
        });

		numericalContainer.add(create, "align right, span, wrap, sizegroup 2");

		numericalContainer.add(outputLabel, "sizegroup 1, split, span");
		numericalContainer.add(outputText,
				"h 250 , pushx, growx,pushy, growy, span, wrap");
		numericalContainer.add(clearOut, "align right, span, wrap");
		// numericalPanel.add(numericalLabelContainer,"aligny top, push y, grow y");
		numericalPanel.add(numericalContainer, "aligny top,pushx, growx, span");

		// matching panel goes here

		/* ======================================================================================================== */
		matchingContainer.setLayout(new MigLayout("debug", "[][][][][][]",
				"[][]"));

		MatchingOutputContainer.setLayout(new MigLayout("debug", "[][]",
				"[][]"));
		MatchingOutputButtonContainer.setLayout(new MigLayout("debug", "[][]",
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

		JCheckBox matchingCheck1 = new JCheckBox("Delete");
		JCheckBox matchingCheck2 = new JCheckBox("Delete");
		JCheckBox matchingCheck3 = new JCheckBox("Delete");
		JCheckBox matchingCheck4 = new JCheckBox("Delete");
		JCheckBox matchingCheck5 = new JCheckBox("Delete");

		matchingCheck1.setEnabled(false);
		matchingCheck2.setEnabled(false);

		JButton matchingAddQA = new JButton("Add Q&A");
		JButton matchingRemoveSelected = new JButton("Remove Selected");
		JButton matchingRemoveButton = new JButton("Remove");
		JButton matchingClearText = new JButton("Clear Question Text");
		JButton matchingGiftOutput = new JButton("Create Gift Output");
		JButton matchingClearButton = new JButton("Clear Output");
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
		matchingRemoveButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(matchingCheck3.isSelected())
				{
					matchingCheck3.setVisible(false);
					matchingQ3.setVisible(false);
					matchingA3.setVisible(false);
				}
				else if(matchingCheck4.isSelected()) {

					matchingCheck4.setVisible(false);
					matchingQ4.setVisible(false);
					matchingA4.setVisible(false);
				}
				else if(matchingCheck5.isSelected()) {

					matchingCheck5.setVisible(false);
					matchingQ5.setVisible(false);
					matchingA5.setVisible(false);
				}
			}
		});
		matchingClearText.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
                matchingGiftOutput.setText("");
                matchingQuestionText.setText("");

			}

		});
		matchingGiftOutput.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MatchingGiftOutput.append("::"+matchingQuestionText.getText()+ "::{" + "\n");
				MatchingGiftOutput.append("=" + matchingQ1.getText() + "->" +  matchingA1.getText()+ "\n");
				MatchingGiftOutput.append("=" + matchingQ2.getText() + "->" +  matchingA2.getText()+ "\n");
				if(matchingQ3.isVisible())
				{
					MatchingGiftOutput.append("=" + matchingQ3.getText() + "->" +  matchingA3.getText()+ "\n");
				}
				if(matchingQ4.isVisible())
				{
					MatchingGiftOutput.append("=" + matchingQ4.getText() + "->" +  matchingA4.getText()+ "\n");
				}
				if(matchingQ5.isVisible())
				{
					MatchingGiftOutput.append("=" + matchingQ5.getText() + "->" +  matchingA5.getText()+ "\n");
				}
			}
		});
		matchingClearText.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				matchingQ1.setText("");
				matchingA1.setText("");
				matchingQ2.setText("");
				matchingA2.setText("");

				if(matchingQ3.isVisible())
				{
					matchingQ3.setText("");
					matchingA3.setText("");

				}
				if(matchingQ4.isVisible())
				{
					matchingQ4.setText("");
					matchingQ4.setText("");
				}
				if(matchingQ5.isVisible())
				{
					matchingQ5.setText("");
					matchingQ5.setText("");
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

		matchingQuestionText.setBorder(BorderFactory
				.createBevelBorder(BevelBorder.LOWERED));
		matchingContainer.add(matchingQuestionText, "pushx, growx, span, wrap");

		matchingContainer.add(questionPanel, "pushx, growx,span, wrap");

		matchingContainer.add(matchingClearText,"right,wrap");

		matchingContainer.add(matchingGiftOutput,"right,wrap");

		matchingPanel.add(matchingContainer, "pushx, growx, span");

		matchingRemovePanel.add(matchingRemoveLabel);
		matchingRemovePanel.add(matchingRemoveButton,"left");

		matchingRemovePanel.setBorder(BorderFactory
				.createEtchedBorder(EtchedBorder.LOWERED));
		matchingContainer.add(matchingRemovePanel,"left,wrap");

		MatchingGiftOutput.setBorder(BorderFactory
				.createBevelBorder(BevelBorder.LOWERED));

		matchingContainer.add(MatchingOutputContainer, "h 300!, pushx, growx, span");
		MatchingOutputContainer.add(matchingGiftOutputLabel,"top");
		MatchingOutputContainer.add(MatchingGiftOutput,
				"h 250!, w 1000!, pushx, growx, span, wrap");
		MatchingOutputContainer.add(MatchingOutputButtonContainer, "right, pushx, growx, span");
		MatchingOutputButtonContainer.add(matchingClearButton,"right,w 150!, pushx, growx");


		//fill the blanks panel goes here
		/* ======================================================================================================== */
		JLabel FillBlankstitle = new JLabel("Question Title:");

		FillBlanksTitleText.setBackground(Color.WHITE);
		JLabel FillBlanksquestion = new JLabel("Question Start:");
		JLabel FillBlanksanswer = new JLabel("Select");
        JLabel FillBlanks = new JLabel("Blank(s)");
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


        FillBlankstextField= new JTextField("");
        FillBlanksanswerContainer.add(FillBlankstextField,"   pushx, growx, span, wrap, cell 0 5");
        FillBlankstextField.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        FillBlanksextra_radio = new JRadioButton("Correct");
        FillBlanksradioContainer.add(FillBlanksextra_radio,  "wrap, cell 1 5 ");

        FillBlankstextField2= new JTextField("");
        FillBlanksanswerContainer.add(FillBlankstextField2,"   pushx, growx, span, wrap, cell 0 6");
        FillBlankstextField2.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        FillBlanksextra_radio2 = new JRadioButton("Correct");
        FillBlanksradioContainer.add(FillBlanksextra_radio2,  "wrap, cell 1 6 ");

        FillBlankstextField3= new JTextField("");
        FillBlanksanswerContainer.add(FillBlankstextField3,"   pushx, growx, span, wrap, cell 0 7");
        FillBlankstextField3.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        FillBlanksextra_radio3 = new JRadioButton("Correct");
        FillBlanksradioContainer.add(FillBlanksextra_radio3,  "wrap, cell 1 7 ");

        FillBlankstextField.setVisible(false);
        FillBlankstextField2.setVisible(false);
        FillBlankstextField3.setVisible(false);

        FillBlanksextra_radio.setVisible(false);
        FillBlanksextra_radio2.setVisible(false);
        FillBlanksextra_radio3.setVisible(false);

        FillBlanksButtonContainer.add(FillBlanksButton, " right, right, pushx, cell 3 0");
		FillBlanksButtonContainer.add(FillBlanksButton2, "wrap, pushx, cell 3 0");

		FillBlanksButtonContainer.add(FilleBlanksQEnd, " left, cell 0 0");
		FillBlanksButtonContainer.add(FillBlanksanswerText5, "h 50!, pushx, growx,span, cell 1 1");
		FillBlanksButtonContainer.add(FillBlanksButton3, "right, pushx, cell 3 2");
		FillBlanksButtonContainer.add(FillBlanksButton4, "right,pushx, cell 3 2");

        FillBlanksradioContainer.add(FillBlanksanswer, ", cell 0 0");
        FillBlanksradioContainer.add(FillBlanksRadio2, ", cell 1 2");
		FillBlanksradioContainer.add(FillBlanksRadio3, ", cell 1 3");
		FillBlanksradioContainer.add(FillBlanksRadio4, ", cell 1 4,wrap");

        FillBlanksOutputContainer.add( FillBlanksGiftOutput, "cell 0 1 ,h 100!, pushx, growx, span, wrap");
		FillBlanksOutputContainer.add( FillBlanksButton5, "right,pushx");

		FillBlankstitleContainer.add(FillBlanks,"aligny top");

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
		gg.setSize(1200,800);
		
		gg.setVisible(true);
		

	}
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == MCQButton)
		{
            if (textField.isVisible() == false
                    && extra_feed.isVisible() == false
                    && extra_radio.isVisible() == false) {
                textField.setVisible(true);
                extra_feed.setVisible(true);
                extra_radio.setVisible(true);
            } else if (textField2.isVisible() == false
                    && extra_feed2.isVisible() == false
                    && extra_radio2.isVisible() == false) {
                textField2.setVisible(true);
                extra_feed2.setVisible(true);
                extra_radio2.setVisible(true);
            } else{
                extra_radio3.setVisible(true);
                extra_feed3.setVisible(true);
                textField3.setVisible(true);
            }
		}
		else if(e.getSource() == MCQButton2)
		{


            if (textField3.isVisible())
           {
               textField3.setVisible(false);
               extra_feed3.setVisible(false);
               extra_radio3.setVisible(false);
           }
        else if (textField2.isVisible())
        {
            textField2.setVisible(false);
            extra_feed2.setVisible(false);
            extra_radio2.setVisible(false);
        }
           else if(textField.isVisible())
            {
                textField.setVisible(false);
                extra_feed.setVisible(false);
                extra_radio.setVisible(false);
            }


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
            MCQTitleText.setText("");

            if(textField.isVisible())
            {
                textField.setText("");
                extra_feed.setText("");
            }
            else if(textField2.isVisible())
            {
                textField2.setText("");
                extra_feed2.setText("");
            }
            else if(textField3.isVisible())
            {
                textField3.setText("");
                extra_feed3.setText("");
            }
        }
        else if(e.getSource() == MCQButton4) {
			String QuestionText = MCQquestionText.getText();

            GiftOutput.setText("::This is multiple choice::");
            GiftOutput.append(MCQTitleText.getText() + "{" + "\n");

			String answer = MCQanswerText1.getText();
			String answer2 = MCQanswerText2.getText();
			String answer3 = MCQanswerText3.getText();
			String answer4 = MCQanswerText4.getText();

			String feedback = MCQanswerText5.getText();
			String feedback2 = MCQanswerText6.getText();
			String feedback3 = MCQanswerText7.getText();
			String feedback4 = MCQanswerText8.getText();

			if(MCQRadio.isSelected()) {


				GiftOutput.append(" = " + answer + "\n" + "#Yes-" + feedback +"\n");
				GiftOutput.append(" ~ " + answer2 + "\n"+ "#" + feedback2 +"\n");
				GiftOutput.append(" ~ " + answer3 + "\n"+ "#" + feedback3 +"\n");
				GiftOutput.append(" ~ " + answer4 + "\n"+ "#" + feedback4 +"\n");
                if(textField.isVisible())
                {
                    GiftOutput.append(" ~ " + textField.getText() + "\n"+ "#" + extra_feed.getText() +"\n");
                }
                else if(textField2.isVisible())
                {
                    GiftOutput.append(" ~ " + textField2.getText() + "\n"+ "#" + extra_feed2.getText() +"\n");
                }
                else if(textField3.isVisible())
                {
                    GiftOutput.append(" ~ " + textField3.getText() + "\n"+ "#" + extra_feed3.getText() +"\n");
                }
            }
			else if(MCQRadio2.isSelected())
			{
				GiftOutput.append(" ~ " + answer + "\n" + "#" + feedback+ "\n");
				GiftOutput.append(" = " + answer2 + "\n"+ "#Yes-" +feedback2 +"\n");
				GiftOutput.append(" ~ " + answer3 + "\n"+ "#" + feedback3 +"\n");
				GiftOutput.append(" ~ " + answer4 + "\n"+ "#" + feedback4 +"\n");
                if(textField.isVisible())
                {
                    GiftOutput.append(" ~ " + textField.getText() + "\n"+ "#" + extra_feed.getText() +"\n");
                }
                else if(textField2.isVisible())
                {
                    GiftOutput.append(" ~ " + textField2.getText() + "\n"+ "#" + extra_feed2.getText() +"\n");
                }
                else if(textField3.isVisible())
                {
                    GiftOutput.append(" ~ " + textField3.getText() + "\n"+ "#" + extra_feed3.getText() +"\n");
                }

			}
			else if(MCQRadio3.isSelected())
			{
				GiftOutput.append(" ~ " + answer + "\n" + "#" + feedback+ "\n");
				GiftOutput.append(" ~ " + answer2 + "\n"+ "#"+ feedback2 + "\n");
				GiftOutput.append(" = " + answer3 + "\n"+ "#Yes-" + feedback3 +"\n");
				GiftOutput.append(" ~ " + answer4 + "\n"+ "#" + feedback4 +"\n");
                if(textField.isVisible())
                {
                    GiftOutput.append(" ~ " + textField.getText() + "\n"+ "#" + extra_feed.getText() +"\n");
                }
                else if(textField2.isVisible())
                {
                    GiftOutput.append(" ~ " + textField2.getText() + "\n"+ "#" + extra_feed2.getText() +"\n");
                }
                else if(textField3.isVisible())
                {
                    GiftOutput.append(" ~ " + textField3.getText() + "\n"+ "#" + extra_feed3.getText() +"\n");
                }

			}
			else if(MCQRadio4.isSelected())
			{
				GiftOutput.append(" ~ " + answer + "\n" + "#" + feedback+ "\n");
				GiftOutput.append(" ~ " + answer2 + "\n"+ "#"+ feedback2 + "\n");
				GiftOutput.append(" ~ " + answer3 + "\n"+ "#"+ feedback3 +"\n");
				GiftOutput.append(" = " + answer4 + "\n"+ "#Yes-" + feedback4  +"\n");
                if(textField.isVisible())
                {
                    GiftOutput.append(" ~ " + textField.getText() + "\n"+ "#" + extra_feed.getText() +"\n");
                }
                else if(textField2.isVisible())
                {
                    GiftOutput.append(" ~ " + textField2.getText() + "\n"+ "#" + extra_feed2.getText() +"\n");
                }
                else if(textField3.isVisible())
                {
                    GiftOutput.append(" ~ " + textField3.getText() + "\n"+ "#" + extra_feed3.getText() +"\n");
                }

			}
            else if(extra_radio.isSelected())
            {
                GiftOutput.append(" ~ " + answer + "\n" + "#" + feedback+ "\n");
                GiftOutput.append(" ~ " + answer2 + "\n"+ "#"+ feedback2 + "\n");
                GiftOutput.append(" ~ " + answer3 + "\n"+ "#"+ feedback3 +"\n");
                GiftOutput.append(" ~ " + answer4 + "\n"+ "#"  +"\n");
                if(textField.isVisible())
                {
                    GiftOutput.append(" = " + textField.getText() + "\n"+ "#Yes-" + extra_feed +"\n");
                }
                else if(textField2.isVisible())
                {
                    GiftOutput.append(" ~ " + textField2.getText() + "\n"+ "#" + extra_feed2.getText() +"\n");
                }
                else if(textField3.isVisible())
                {
                    GiftOutput.append(" ~ " + textField3.getText() + "\n"+ "#" + extra_feed3.getText() +"\n");
                }
            }
            else if(extra_radio2.isSelected())
            {
                GiftOutput.append(" ~ " + answer + "\n" + "#" + feedback+ "\n");
                GiftOutput.append(" ~ " + answer2 + "\n"+ "#"+ feedback2 + "\n");
                GiftOutput.append(" ~ " + answer3 + "\n"+ "#"+ feedback3 +"\n");
                GiftOutput.append(" ~ " + answer4 + "\n"+ "#"  +"\n");
                if(textField.isVisible())
                {
                    GiftOutput.append(" ~ " + textField.getText() + "\n"+ "#" + extra_feed.getText() +"\n");
                }
                else if(textField2.isVisible())
                {
                    GiftOutput.append(" ~ " + textField2.getText() + "\n"+ "#" + "#Yes-" + extra_feed2.getText()  +"\n");
                }
                else if(textField3.isVisible())
                {
                    GiftOutput.append(" ~ " + textField3.getText() + "\n"+ "#" + extra_feed3.getText() +"\n");
                }
            }
            else if(extra_radio3.isSelected())
            {
                GiftOutput.append(" ~ " + answer + "\n" + "#" + feedback+ "\n");
                GiftOutput.append(" ~ " + answer2 + "\n"+ "#"+ feedback2 + "\n");
                GiftOutput.append(" ~ " + answer3 + "\n"+ "#"+ feedback3 +"\n");
                GiftOutput.append(" ~ " + answer4 + "\n"+ "#"  +"\n");
                if(textField.isVisible())
                {
                    GiftOutput.append(" ~ " + textField.getText() + "\n"+ "#" + extra_feed.getText() +"\n");
                }
                else if(textField2.isVisible())
                {
                    GiftOutput.append(" ~" + textField2.getText() + "\n"+ "#" + extra_feed2.getText() +"\n");
                }
                else if(textField3.isVisible())
                {
                    GiftOutput.append(" ~ " + textField3.getText() + "\n"+  "#Yes" + extra_feed3.getText()  +"\n");
                }
            }

            GiftOutput.append("}");
        }
		else if(e.getSource() == MCQButton5) {
			GiftOutput.setText("::This is multiple choice::");
		}
		else if(e.getSource() == MCQAButton)
		{
            if (MCQAtextField.isVisible() == false
                    && MCQAextra_feed.isVisible() == false
                    && MCQAoptions5.isVisible() == false) {
                MCQAtextField.setVisible(true);
                MCQAextra_feed.setVisible(true);
                MCQAoptions5.setVisible(true);
            } else if (MCQAtextField2.isVisible() == false
                    && MCQAextra_feed2.isVisible() == false
                    && MCQAoptions6.isVisible() == false) {
                MCQAtextField2.setVisible(true);
                MCQAextra_feed2.setVisible(true);
                MCQAoptions6.setVisible(true);
            } else{
                MCQAtextField3.setVisible(true);
                MCQAextra_feed3.setVisible(true);
                MCQAoptions7.setVisible(true);
            }

		}
		else if(e.getSource() == MCQAButton2)
		{
            if (MCQAtextField3.isVisible())
            {
                MCQAtextField3.setVisible(false);
                MCQAextra_feed3.setVisible(false);
                MCQAoptions7.setVisible(false);
            }
            else if (MCQAtextField2.isVisible())
            {
                MCQAtextField2.setVisible(false);
                MCQAextra_feed2.setVisible(false);
                MCQAoptions6.setVisible(false);
            }
            else if(MCQAtextField.isVisible())
            {
                MCQAtextField.setVisible(false);
                MCQAextra_feed.setVisible(false);
                MCQAoptions5.setVisible(false);
            }

        }
		else if(e.getSource() == MCQAButton3) {

            MCQAanswerText1.setText("");
            MCQAanswerText2.setText("");
            MCQAanswerText3.setText("");
            MCQAanswerText4.setText("");
            MCQAanswerText5.setText("");
            MCQAanswerText6.setText("");
            MCQATitleText.setText("");


            if(MCQAtextField.isVisible())
            {
                MCQAtextField.setText("");
                MCQAextra_feed.setText("");
            }
            else if(MCQAtextField2.isVisible())
            {
                MCQAtextField2.setText("");
                MCQAextra_feed2.setText("");
            }
            else if(MCQAtextField3.isVisible())
            {
                MCQAtextField3.setText("");
                MCQAextra_feed3.setText("");
            }

		}
		else if(e.getSource() == MCQAButton4) {
			String QuestionText = MCQATitleText.getText();

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


			MCQAGiftOutput.append(" ~%" + currentValue + "%" + answer + "\n");
            MCQAGiftOutput.append("#" + feedback + "\n");
			MCQAGiftOutput.append(" ~%" + currentValue2 + "%" + answer2 + "\n");
			MCQAGiftOutput.append("#" + feedback2 + "\n");
			MCQAGiftOutput.append(" ~%" + currentValue3 + "%" + answer3 + "\n");
			MCQAGiftOutput.append("#" + feedback3 + "\n");

            if(MCQAtextField.isVisible())
            {
                MCQAGiftOutput.append(" ~%" + currentValue + "%" + answer + "\n");
                MCQAGiftOutput.append("#" + feedback + "\n");
                MCQAGiftOutput.append(" ~%" + currentValue2 + "%" + answer2 + "\n");
                MCQAGiftOutput.append("#" + feedback2 + "\n");
                MCQAGiftOutput.append(" ~%" + currentValue3 + "%" + answer3 + "\n");
                MCQAGiftOutput.append("#" + feedback3 + "\n");
                MCQAGiftOutput.append(" ~%" + (String) MCQAoptions5.getValue() + "%" + MCQAtextField + "\n");
                MCQAGiftOutput.append("#" + MCQAextra_feed + "\n");


            }
            else if(MCQAtextField2.isVisible())
            {
                MCQAGiftOutput.append(" ~%" + currentValue + "%" + answer + "\n");
                MCQAGiftOutput.append("#" + feedback + "\n");
                MCQAGiftOutput.append(" ~%" + currentValue2 + "%" + answer2 + "\n");
                MCQAGiftOutput.append("#" + feedback2 + "\n");
                MCQAGiftOutput.append(" ~%" + currentValue3 + "%" + answer3 + "\n");
                MCQAGiftOutput.append("#" + feedback3 + "\n");
                MCQAGiftOutput.append(" ~%" + (String) MCQAoptions5.getValue() + "%" + MCQAtextField + "\n");
                MCQAGiftOutput.append("#" + MCQAextra_feed + "\n");
                MCQAGiftOutput.append(" ~%" + (String) MCQAoptions6.getValue() + "%" + MCQAtextField2 + "\n");
                MCQAGiftOutput.append("#" + MCQAextra_feed2 + "\n");
            }
            else if(MCQAtextField3.isVisible())
            {
                MCQAGiftOutput.append(" ~%" + currentValue + "%" + answer + "\n");
                MCQAGiftOutput.append("#" + feedback + "\n");
                MCQAGiftOutput.append(" ~%" + currentValue2 + "%" + answer2 + "\n");
                MCQAGiftOutput.append("#" + feedback2 + "\n");
                MCQAGiftOutput.append(" ~%" + currentValue3 + "%" + answer3 + "\n");
                MCQAGiftOutput.append("#" + feedback3 + "\n");
                MCQAGiftOutput.append(" ~%" + (String) MCQAoptions5.getValue() + "%" + MCQAtextField + "\n");
                MCQAGiftOutput.append("#" + MCQAextra_feed + "\n");
                MCQAGiftOutput.append(" ~%" + (String) MCQAoptions6.getValue() + "%" + MCQAtextField2 + "\n");
                MCQAGiftOutput.append("#" + MCQAextra_feed2 + "\n");
                MCQAGiftOutput.append(" ~%" + (String) MCQAoptions7.getValue() + "%" + MCQAtextField3 + "\n");
                MCQAGiftOutput.append("#" + MCQAextra_feed3 + "\n");
            }

            MCQAGiftOutput.append("}");

		}
		else if(e.getSource() == MCQButton5) {
			MCQAGiftOutput.setText("::Multiple choice::");
		}

		else if(e.getSource() == FillBlanksButton) {

            if (FillBlankstextField.isVisible() == false
                    && FillBlanksextra_radio.isVisible() == false) {
                FillBlankstextField.setVisible(true);
                FillBlanksextra_radio.setVisible(true);
            } else if (FillBlankstextField2.isVisible() == false
                    && FillBlanksextra_radio2.isVisible() == false )
            {
                FillBlankstextField2.setVisible(true);
                FillBlanksextra_radio2.setVisible(true);
            } else{
                FillBlankstextField3.setVisible(true);
                FillBlanksextra_radio3.setVisible(true);

            }
		}
		else if(e.getSource() == FillBlanksButton2)
		{
            if (FillBlankstextField3.isVisible())
            {
                FillBlankstextField3.setVisible(false);
                FillBlanksextra_radio3.setVisible(false);

            }
            else if (FillBlankstextField2.isVisible())
            {
                FillBlankstextField2.setVisible(false);
                FillBlanksextra_radio2.setVisible(false);

            }
            else if(FillBlankstextField.isVisible())
            {
                FillBlankstextField.setVisible(false);
                FillBlanksextra_radio.setVisible(false);
            }

        }
		else if(e.getSource() == FillBlanksButton3) {

			FillBlanksanswerText1.setText("");
			FillBlanksanswerText2.setText("");
			FillBlanksanswerText3.setText("");
			FillBlanksanswerText4.setText("");
			FillBlanksanswerText5.setText("");
			FillBlankstextField.setText("");
            FillBlanksTitleText.setText("");

            if(FillBlankstextField.isVisible())
            {
                FillBlankstextField.setText("");
                FillBlanksextra_radio.setText("");
            }
            else if(FillBlankstextField2.isVisible())
            {
                FillBlankstextField2.setText("");
                FillBlanksextra_radio2.setText("");
            }
            else if(FillBlankstextField3.isVisible())
            {
                FillBlankstextField3.setText("");
                FillBlanksextra_radio3.setText("");
            }

		}
		else if(e.getSource() == FillBlanksButton4) {

            FillBlanksGiftOutput.append("::" + FillBlanksTitleText.getText()+ "::");
           // FillBlanksGiftOutput.append("::" + FillBlanksQ.getText()+ "::");


           // FillBlanksGiftOutput.append("::Fill the Blanks::");


			String answer = FillBlanksquestionText.getText();
			String answer2 = FillBlanksanswerText1.getText();
			String answer3 = FillBlanksanswerText2.getText();

			String answer4 = FillBlanksanswerText3.getText();
			String  answer5= FillBlanksanswerText4.getText();
			String answer6 = FillBlanksanswerText5.getText();

			if(FillBlanksRadio.isSelected()) {
				FillBlanksGiftOutput.append(answer + " {" + "=" + answer2 + "~" + answer3 + "~" + answer4 + "~" + answer5 + "}" + answer6);
                if(FillBlankstextField.isVisible())
                {
                    FillBlanksGiftOutput.append(answer + " {" + "=" + answer2 + "~" + answer3 + "~" + answer4 + "~" + answer5 + "~" + FillBlankstextField.getText()+  "}" + answer6
                            );

                }
                else if(FillBlankstextField2.isVisible())
                {
                    FillBlanksGiftOutput.append(answer + " {" + "=" + answer2 + "~" + answer3 + "~" + answer4 + "~" + answer5 +
                            "~" + FillBlankstextField.getText() + "~" + FillBlankstextField2.getText() +  "}" + answer6 );
                }
                else if(FillBlankstextField3.isVisible())
                {
                    FillBlanksGiftOutput.append(answer + " {" + "=" + answer2 + "~" + answer3 + "~" + answer4 + "~" + answer5 + "~" + FillBlankstextField.getText() + "~" + FillBlankstextField2.getText() + "~" + FillBlankstextField3.getText() +"}" + answer6
                            );
                }
			}
			else if(FillBlanksRadio2.isSelected())
			{
				FillBlanksGiftOutput.append(answer + " {" + "~" + answer2 + "=" + answer3 + "~" + answer4 + "~" + answer5 + "}" + answer6 );
                if(FillBlankstextField.isVisible())
                {
                    FillBlanksGiftOutput.append(answer + " {" + "~" + answer2 + "=" + answer3 + "~" + answer4 + "~" + answer5 + "~" + FillBlankstextField.getText() + "}" + answer6
                            );

                }
                else if(FillBlankstextField2.isVisible())
                {
                    FillBlanksGiftOutput.append(answer + " {" + "~" + answer2 + "=" + answer3 + "~" + answer4 + "~" + answer5 +  "~" + FillBlankstextField.getText() + "~" + FillBlankstextField2.getText() + "}" + answer6
                           );
                }
                else if(FillBlankstextField3.isVisible())
                {
                    FillBlanksGiftOutput.append(answer + " {" + "~" + answer2 + "=" + answer3 + "~" + answer4 + "~" + answer5 +  "~" + FillBlankstextField.getText() + "~" + FillBlankstextField2.getText() + "~" + FillBlankstextField3.getText() +"}" + answer6
                           );
                }
			}
			else if(FillBlanksRadio3.isSelected())
			{
				FillBlanksGiftOutput.append(answer + " {" + "~" + answer2 + "~" + answer3 + "=" + answer4 + "~" + answer5 + "}" + answer6);
                if(FillBlankstextField.isVisible())
                {
                    FillBlanksGiftOutput.append(answer + " {" + "~" + answer2 + "~" + answer3 + "=" + answer4 + "~" + answer5 +"~" + FillBlankstextField.getText()  + "}" + answer6
                    );

                }
                else if(FillBlankstextField2.isVisible())
                {
                    FillBlanksGiftOutput.append(answer + " {" + "~" + answer2 + "~" + answer3 + "=" + answer4 + "~" + answer5 +"~" + FillBlankstextField.getText() + "~" + FillBlankstextField2.getText() + "}" + answer6
                            );
                }
                else if(FillBlankstextField3.isVisible())
                {
                    FillBlanksGiftOutput.append(answer + " {" + "~" + answer2 + "~" + answer3 + "=" + answer4 + "~" + answer5 + "~" + FillBlankstextField.getText() + "~" + FillBlankstextField2.getText() + "~" + FillBlankstextField3.getText() + "}" + answer6
                            );
                }
            }
			else if(FillBlanksRadio4.isSelected()) {
                FillBlanksGiftOutput.append(answer + " {" + "~" + answer2 + "~" + answer3 + "~" + answer4 + "=" + answer5 + "}" + answer6);

                if (FillBlankstextField.isVisible()) {
                    FillBlanksGiftOutput.append(answer + " {" + "~" + answer2 + "~" + answer3 + "~" + answer4 + "=" + answer5 + "}" + answer6 +
                            "~" + FillBlankstextField.getText());

                } else if (FillBlankstextField2.isVisible()) {
                    FillBlanksGiftOutput.append(answer + " {" + "~" + answer2 + "~" + answer3 + "~" + answer4 + "=" + answer5 + "}" + answer6 +
                            "~" + FillBlankstextField.getText() + "~" + FillBlankstextField2.getText());
                } else if (FillBlankstextField3.isVisible()) {
                    FillBlanksGiftOutput.append(answer + " {" + "~" + answer2 + "~" + answer3 + "~" + answer4 + "=" + answer5 + "}" + answer6 +
                            "~" + FillBlankstextField.getText() + "~" + FillBlankstextField2.getText() + "~" + FillBlankstextField3.getText());
                }
            }
            else if(FillBlanksextra_radio.isSelected()) {
                    FillBlanksGiftOutput.append(answer + " {" + "~" + answer2 + "~" + answer3 + "~" + answer4 + "=" + answer5 + "=" + FillBlankstextField.getText() + "}" + answer6);

                    if (FillBlankstextField2.isVisible()) {
                        FillBlanksGiftOutput.append(answer + " {" + "~" + answer2 + "~" + answer3 + "~" + answer4 + "~" + answer5 + "=" + FillBlankstextField.getText() + "~" + FillBlankstextField.getText() + "~" + FillBlankstextField2.getText() + "}" + answer6
                        );
                    } else if (FillBlankstextField3.isVisible()) {
                        FillBlanksGiftOutput.append(answer + " {" + "~" + answer2 + "~" + answer3 + "~" + answer4 + "~" + answer5 + "=" + FillBlankstextField.getText() + "~" + FillBlankstextField.getText() + "~" + FillBlankstextField2.getText() + "~" + FillBlankstextField3.getText() + "}" + answer6
                        );
                    }
            }
            else if(FillBlanksextra_radio2.isSelected()) {
                if (FillBlankstextField2.isVisible()) {
                    FillBlanksGiftOutput.append(answer + " {" + "~" + answer2 + "~" + answer3 + "~" + answer4 + "~" + answer5 + "~" + FillBlankstextField.getText() + "=" + FillBlankstextField.getText() + "~" + FillBlankstextField2.getText() + "}" + answer6
                    );
                } else if (FillBlankstextField3.isVisible()) {
                    FillBlanksGiftOutput.append(answer + " {" + "~" + answer2 + "~" + answer3 + "~" + answer4 + "~" + answer5 + "~" + FillBlankstextField.getText() + "=" + FillBlankstextField.getText() + "~" + FillBlankstextField2.getText() + "~" + FillBlankstextField3.getText() + "}" + answer6
                    );
                }
            }
            else if(FillBlanksextra_radio3.isSelected()) {

                } else if (FillBlankstextField3.isVisible()) {
                    FillBlanksGiftOutput.append(answer + " {" + "~" + answer2 + "~" + answer3 + "~" + answer4 + "~" + answer5 + "~" + FillBlankstextField.getText() + "~" + FillBlankstextField.getText() + "~" + FillBlankstextField2.getText() + "~" + FillBlankstextField3.getText() + "}" + answer6
                    );
                }
            }








		}




	}

