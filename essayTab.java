import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 Created by Jawmie. This is my attempt at the essay tab using miglayout for the GIFT project.
 **/
public class essayTab {
    public static void main(String[] args){
        //Setting the frame for tab
        JFrame ess_frame = new JFrame("Essay Tab");
        ess_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ess_frame.setSize(800,500);
        //Add panel
        JPanel ess_panel = new JPanel();

        ess_panel.setBorder(BorderFactory.createTitledBorder("Essay"));
        ess_frame.add(ess_panel);

        ess_panel.setLayout(new MigLayout("", "[]10[]10[]", "[] [] [] [] [] []"));

        JLabel q_title = new JLabel("Question title:");
        JLabel question = new JLabel("Question:");
        JLabel output = new JLabel("GIFT Output:");
        final JTextField q_text = new JTextField();
        final JTextArea question_text = new JTextArea();
        question_text.setMargin(new Insets(10,10,10,10));
        final JTextArea out_text = new JTextArea();
        JButton clear_butt = new JButton("Clear Question");
        JButton create_butt = new JButton("Create GIFT code");
        JButton clear_out = new JButton("Clear Output");

        clear_butt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                question_text.setText("");
            }
        });

        create_butt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String qTitle = q_text.getText();
                String qQuest = question_text.getText();

                out_text.setText("::" + qTitle + "::" + qQuest + "{}");
            }
        });

        clear_out.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                out_text.setText("");
            }
        });

        //Row1
        ess_panel.add(q_title,"right");
        ess_panel.add(q_text,"pushx, growx, wrap");
        //Row2
        ess_panel.add(question,"right, top");
        ess_panel.add(question_text,"pushx, growx, pushy, growy, wrap");
        //Row3
        ess_panel.add(clear_butt,"right, span2, w 150, wrap");
        //Row4
        ess_panel.add(create_butt,"right, span2, w 150, wrap");
        //Row5
        ess_panel.add(output,"right, top");
        ess_panel.add(out_text,"pushx, growx, pushy, growy, wrap");
        //Row6
        ess_panel.add(clear_out, "right, span2, w 150,");






        ess_frame.setVisible(true);
    }
}
