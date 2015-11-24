import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

/**
 * Created by g00238234 on 24/11/2015.
 */
public class MultipleChoiceBasic {


    public static void main(String[] args) {

        JFrame p = new JFrame();

        p.setDefaultCloseOperation(p.EXIT_ON_CLOSE);

        JPanel r = new JPanel();
        JPanel r2 = new JPanel();
        JPanel r3 = new JPanel();
        JPanel r4 = new JPanel();
        JPanel r5 = new JPanel();
        JPanel r6 = new JPanel();
        JPanel r7 = new JPanel();
        JPanel r8 = new JPanel();
        JPanel r9 = new JPanel();

        p.setSize(600,600);

        r.setSize(600,600);
        r2.setSize(50,50);

        r.setLayout(new MigLayout("debug ", "","grow" ));

        r.add(r4, "height 30!");
        r.add(r9,"height 30!, span, grow, pushx");
        r.add(r7);
        r.add(r8," spany 2 ,span, grow, pushx");
        r.add(r3);
        r.add(r2,"spany 2 ,span, grow, pushx");
        r.add(r6);
        r.add(r5, "spany 2, span ,grow, pushx");


        //JTextField jft = new JTextField("200");

        JLabel jta = new JLabel("Question Title");
        JLabel jta2 = new JLabel("Question");

      //  jft.setBackground(Color.WHITE);

        p.add(r);

        r4.add(jta);
        r7.add(jta2  );

        //r9.add(jft,"span, w :400:, h :200:, growx");
        //p.add(r2);

        //r.add(jta);
        //r2.add(jta2);

        r9.add(new JTextArea("title"), "growx, push, span");

        p.setVisible(true);


        //JTextField JFT = new JTextField();

       // p.add(JFT);





}







}
