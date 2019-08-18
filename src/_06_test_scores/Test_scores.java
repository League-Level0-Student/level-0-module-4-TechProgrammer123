package _06_test_scores;

import javax.swing.JOptionPane;

public class Test_scores {
public static void main(String[] args) {
	String Score =JOptionPane.showInputDialog("What was your test score");
	double score = Double.parseDouble(Score);
if (score < 70) {
JOptionPane.showMessageDialog(null, "If you study more you can have a better score!");

}
if (score >70) {
	JOptionPane.showMessageDialog(null, "You must have studied hard for your test!");
}
}
}


