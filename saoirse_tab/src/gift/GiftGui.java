package gift;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.BevelBorder;

import net.miginfocom.swing.MigLayout;

public class GiftGui extends JFrame{
	
	JPanel essayPanel = new JPanel(new MigLayout("","[][][]","[][][]"));
	JPanel trueFalsePanel = new JPanel();
	JPanel MCQPanel = new JPanel(new MigLayout("debug","",""));
	JPanel MCQAPanel = new JPanel();
	JPanel numericalPanel = new JPanel(new MigLayout("debug","",""));
	JPanel matchingPanel = new JPanel();
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

	//4 containers for each area
	Container MCQContainer = new Container();
	Container answerContainer = new Container();
	Container OutputContainer = new Container();
	Container ButtonContainer = new Container();

	JTabbedPane tabBar = new JTabbedPane();
	
	public GiftGui() {
		
		setLayout(new MigLayout("","[][]","[][][]"));//
		//essay panel goes here
		essayPanel.add(test1);
		
		 //True False panel goes here
		trueFalsePanel.add(test2);
		
		//MCQ panel goes here
		 
		//MCQPanel.add(test3);
		MCQContainer.setLayout(new MigLayout("debug","[][][][][][]","[][]"));
		answerContainer.setLayout(new MigLayout("debug","[][][][]","[][][]"));
		ButtonContainer.setLayout(new MigLayout("debug","[][]","[][][][]"));
		OutputContainer.setLayout(new MigLayout("debug","[]","[]"));

		JLabel MCQtitle = new JLabel("Question Title:");
		JTextField MCQTitleText = new JTextField("Title Text");
		MCQTitleText.setBackground(Color.WHITE);
		JLabel MCQquestion = new JLabel("Question:");
		JLabel MCQanswer = new JLabel("Answer:           ");
		JLabel MCQoutput = new JLabel("GIFT Output:");
		JLabel MCQChoice = new JLabel("Choice:");
		JLabel MCQFeedback = new JLabel("Feedback:");
		JLabel MCQSelect = new JLabel("Select:");

		JTextArea MCQquestionText = new JTextArea("Question Text");
		JTextArea MCQanswerText1 = new JTextArea("Text");
		JTextArea MCQanswerText2 = new JTextArea("Text");
		JTextArea MCQanswerText3 = new JTextArea("Text");
		JTextArea MCQanswerText4 = new JTextArea("Text");
		JTextArea MCQanswerText5 = new JTextArea("Text");
		JTextArea MCQanswerText6 = new JTextArea("Text");
		JTextArea MCQanswerText7 = new JTextArea("Text");
		JTextArea MCQanswerText8 = new JTextArea("Text");

		JRadioButton MCQRadio = new JRadioButton("Correct");
		JRadioButton MCQRadio2 = new JRadioButton("Correct");
		JRadioButton MCQRadio3 = new JRadioButton("Correct");
		JRadioButton MCQRadio4 = new JRadioButton("Correct");

		JButton MCQButton = new JButton("Add Answer");
		JButton MCQButton2 = new JButton("Remove Answer");
		JButton MCQButton3 = new JButton("Clear Question");
		JButton MCQButton4 = new JButton("Create Gift Code");

		JTextArea GiftOutput= new JTextArea("Gift Output");

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
		answerContainer.add(MCQFeedback);
		answerContainer.add(MCQSelect);

		answerContainer.add(MCQanswerText1, "h 20!, w 200!, cell 1 1");//col, row
		answerContainer.add(MCQanswerText2, "h 20!, w 200!, cell 2 1");
		answerContainer.add(MCQanswerText3, "h 20!, w 200!, cell 1 2");
		answerContainer.add(MCQanswerText4, "h 20!, w 200!, cell 2 2");
		answerContainer.add(MCQanswerText5, "h 20!, w 200!, cell 1 3");
		answerContainer.add(MCQanswerText6, "h 20!, w 200!, cell 2 3");
		answerContainer.add(MCQanswerText7, "h 20!, w 200!, cell 1 4");
		answerContainer.add(MCQanswerText8, "h 20!, w 200!, cell 2 4");

		answerContainer.add(MCQRadio,  ", cell 3 1");
		answerContainer.add(MCQRadio2, ", cell 3 2");
		answerContainer.add(MCQRadio3, ", cell 3 3");
		answerContainer.add(MCQRadio4, ", cell 3 4");

		ButtonContainer.add(MCQButton, "gapleft 80, cell 1 0");
		ButtonContainer.add(MCQButton2, "gapleft 80, cell 1 1");
		ButtonContainer.add(MCQButton3, "gapleft 400, cell 4 0");
		ButtonContainer.add(MCQButton4, "gapleft 400, cell 4 1");

		OutputContainer.add( MCQoutput);
		OutputContainer.add( GiftOutput, "h 200!, pushx, growx, span, wrap");

		GiftOutput.setText("::This is multiple choice::");

		MCQButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				JTextArea extra_answer = new JTextArea();
				JTextField textField = new JTextField();

				answerContainer.add(textField," align center");
				answerContainer.revalidate();
				validate();


				MCQquestionText.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));


			}
		});

		MCQButton3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					MCQanswerText1.setText("");
					MCQanswerText2.setText("");
					MCQanswerText3.setText("");
					MCQanswerText4.setText("");
					MCQanswerText5.setText("");
					MCQanswerText6.setText("");
					MCQanswerText7.setText("");
					MCQanswerText8.setText("");
			}
		});
		MCQButton4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				String QuestionText = MCQquestionText.getText();

				GiftOutput.append(QuestionText + "{" + "\n"  );

				MCQRadio.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						String correct = MCQanswerText1.getText();
						String incorrect = MCQanswerText3.getText();
						String incorrect2 = MCQanswerText5.getText();
						String incorrect3 = MCQanswerText7.getText();

						GiftOutput.append(" = " +  correct  +"\n" );
						GiftOutput.append(" ~ " +  incorrect  +"\n" );
						GiftOutput.append(" ~ " +  incorrect2  +"\n" );
						GiftOutput.append(" ~ " +  incorrect3  +"\n" );



					}
				});
			}
		});







		//GiftOutput.append(MCQquestion)














		MCQPanel.add(MCQContainer, "pushx, growx, span");
		MCQPanel.add(answerContainer,"pushx, growx, span");
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

}
