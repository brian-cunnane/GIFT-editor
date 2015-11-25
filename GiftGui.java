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
	JTabbedPane tabBar = new JTabbedPane();
	
	public GiftGui() {
		
		setLayout(new MigLayout("","[][]","[][][]"));
		//essay panel goes here
		essayPanel.add(test1);
		
		 //True False panel goes here
		trueFalsePanel.add(test2);
		
		//MCQ panel goes here
		 
		MCQPanel.add(test3);
		
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
		gg.setSize(800,300);
		
		gg.setVisible(true);
		

	}

}
