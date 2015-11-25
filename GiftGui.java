package gift;

import java.awt.Color;
import java.awt.Container;

import javax.swing.*;
import javax.swing.border.BevelBorder;

import net.miginfocom.swing.MigLayout;

public class GiftGui extends JFrame{
	
	JPanel essayPanel = new JPanel(new MigLayout("","[][][]","[][][]"));
	JPanel trueFalsePanel = new JPanel();
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
		essayPanel.add(test1);
		
		 //True False panel goes here
		trueFalsePanel.add(test2);
		
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
		
		gg.setLocation(300,300);
		gg.setSize(800,300);
		
		gg.setVisible(true);
		

	}

}
