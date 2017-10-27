import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator {
	JTextField field;
	double op;
	double op2;
	int cure;
	String x="empty";
	String prev="null";
public void run(){
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(300,500);
	frame.setTitle("Calculator by David");
	frame.setVisible(true);
	JPanel panel = new JPanel();
	frame.getContentPane().add(BorderLayout.NORTH,panel);
	JPanel panel2 = new JPanel();
	frame.getContentPane().add(BorderLayout.CENTER,panel2);
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	JPanel panel5 = new JPanel();
	JPanel panel6 = new JPanel();
	JPanel panel7 = new JPanel();
	panel2.setLayout(new BoxLayout(panel2,BoxLayout.Y_AXIS));
	panel2.add(panel3);
	panel2.add(panel4);
	panel2.add(panel5);
	panel2.add(panel6);
	panel2.add(panel7);

	field = new JTextField(12);
	Font inputFont = new Font("serif",Font.BOLD,28);
	field.setFont(inputFont);
	panel.add(field);
	JButton button7 = new JButton("7");
	button7.addActionListener(new button7Listener());
	JButton button8 = new JButton("8");
	button8.addActionListener(new button8Listener());
	JButton button9 = new JButton("9");
	button9.addActionListener(new button9Listener());
	JButton buttonplus = new JButton("+");
	buttonplus.addActionListener(new buttonplusListener());
	panel3.add(button7);
	panel3.add(button8);
	panel3.add(button9);
	panel3.add(buttonplus);
	
	JButton button4 = new JButton("4");
	button4.addActionListener(new button4Listener());
	JButton button5 = new JButton("5");
	button5.addActionListener(new button5Listener());
	JButton button6 = new JButton("6");
	button6.addActionListener(new button6Listener());
	JButton buttonminus = new JButton("-");
	buttonminus.addActionListener(new buttonminusListener());
	panel4.add(button4);
	panel4.add(button5);
	panel4.add(button6);
	panel4.add(buttonminus);
	
	JButton button1 = new JButton("1");
	button1.addActionListener(new button1Listener());
	JButton button2 = new JButton("2");
	button2.addActionListener(new button2Listener());
	JButton button3 = new JButton("3");
	button3.addActionListener(new button3Listener());
	JButton buttontimes = new JButton("x");
	buttontimes.addActionListener(new buttontimesListener());
	panel5.add(button1);
	panel5.add(button2);
	panel5.add(button3);
	panel5.add(buttontimes);
	
	JButton buttondot = new JButton(".");
	buttondot.addActionListener(new buttondotListener());
	JButton button0 = new JButton("0");
	button0.addActionListener(new button0Listener());
	JButton buttonequals = new JButton("=");
	buttonequals.addActionListener(new buttonequalsListener());
	JButton buttondiv = new JButton("/");
	buttondiv.addActionListener(new buttondivideListener());
	panel6.add(buttondot);
	panel6.add(button0);
	panel6.add(buttonequals);
	panel6.add(buttondiv);
	
	JButton buttonclear = new JButton("Clear!");
	buttonclear.setBackground(Color.RED);
	buttonclear.addActionListener(new buttonclearListener());
	panel7.add(buttonclear);
	
}
public static void main(String[] args){
	Calculator cal = new Calculator();
	cal.run();
}
class button1Listener implements ActionListener{
	public void actionPerformed(ActionEvent event){
if(cure==0){
	String c1 = field.getText();
	String c11 = c1+"1";
	field.setText(c11);
}
else{
	field.setText("1");
	cure=0;
}

		
	}
}
class button0Listener implements ActionListener{
	public void actionPerformed(ActionEvent event){
		if(cure==0){
			String c1 = field.getText();
			String c11 = c1+"0";
			field.setText(c11);
		}
		else{
			field.setText("0");
			cure=0;
		}
	}
}
class buttondotListener implements ActionListener{
	public void actionPerformed(ActionEvent event){
		if(cure==0){
			String c1 = field.getText();
			String c11 = c1+".";
			field.setText(c11);
		}
		else{
			field.setText(".");
			cure=0;
		}
		
	}
}
class button2Listener implements ActionListener{
	public void actionPerformed(ActionEvent event){
		if(cure==0){
			String c1 = field.getText();
			String c11 = c1+"2";
			field.setText(c11);
		}
		else{
			field.setText("2");
			cure=0;
		}
	}
}
class button3Listener implements ActionListener{
	public void actionPerformed(ActionEvent event){
		if(cure==0){
			String c1 = field.getText();
			String c11 = c1+"3";
			field.setText(c11);
		}
		else{
			field.setText("3");
			cure=0;
		}
	}
}
class button4Listener implements ActionListener{
	public void actionPerformed(ActionEvent event){
		if(cure==0){
			String c1 = field.getText();
			String c11 = c1+"4";
			field.setText(c11);
		}
		else{
			field.setText("4");
			cure=0;
		}
	}
}
class button5Listener implements ActionListener{
	public void actionPerformed(ActionEvent event){
		if(cure==0){
			String c1 = field.getText();
			String c11 = c1+"5";
			field.setText(c11);
		}
		else{
			field.setText("5");
			cure=0;
		}
	}
}
class button6Listener implements ActionListener{
	public void actionPerformed(ActionEvent event){
		if(cure==0){
			String c1 = field.getText();
			String c11 = c1+"6";
			field.setText(c11);
		}
		else{
			field.setText("6");
			cure=0;
		}
	}
}
class button7Listener implements ActionListener{
	public void actionPerformed(ActionEvent event){
		if(cure==0){
			String c1 = field.getText();
			String c11 = c1+"7";
			field.setText(c11);
		}
		else{
			field.setText("7");
			cure=0;
		}
	}
}
class button8Listener implements ActionListener{
	public void actionPerformed(ActionEvent event){
		if(cure==0){
			String c1 = field.getText();
			String c11 = c1+"8";
			field.setText(c11);
		}
		else{
			field.setText("8");
			cure=0;
		}
	}
}
class button9Listener implements ActionListener{
	public void actionPerformed(ActionEvent event){
		if(cure==0){
			String c1 = field.getText();
			String c11 = c1+"9";
			field.setText(c11);
		}
		else{
			field.setText("9");
			cure=0;
		}
		
	}
}
class buttonplusListener implements ActionListener{
	public void actionPerformed(ActionEvent event){
		plus();
		
	}
}
class buttonminusListener implements ActionListener{
	public void actionPerformed(ActionEvent event){
		minus();
		
	}
}
class buttontimesListener implements ActionListener{
	public void actionPerformed(ActionEvent event){
		times();
		
	}
}
class buttondivideListener implements ActionListener{
	public void actionPerformed(ActionEvent event){
		divide();
		
	}
}
class buttonequalsListener implements ActionListener{
	public void actionPerformed(ActionEvent event){
	equal();
		
	}
}
class buttonclearListener implements ActionListener{
	public void actionPerformed(ActionEvent event){
	field.setText("");
	op=0;
	}
}
public double plus(){
	x ="plus";
	cure=1;
	if(op==0&&!(prev.equals("plus")))
	{
		String val = field.getText();
	double value = Double.parseDouble(val);
	op=value;
	prev="plus";
	return op;
	}
	else if(op!=0&&!(prev.equals("plus"))&&!(prev.equals("times"))&&!(prev.equals("divide"))&&!(prev.equals("minus"))){
		String val = field.getText();
		double value = Double.parseDouble(val);
		op=value;
		prev="plus";
		return op;
		
	}
	else if(op!=0&&prev.equals("plus")) {
		String val = field.getText();	
		double value = Double.parseDouble(val);
		op=op+value;
		Double q1 = op;
		String q2 = q1.toString();
		field.setText(q2);
		prev="plus";
		return op;
	}
	else if(op!=0&&prev.equals("minus")) {
		String val = field.getText();	
		double value = Double.parseDouble(val);
		op=op-value;
		Double q1 = op;
		String q2 = q1.toString();
		field.setText(q2);
		prev="plus";
		return op;
	}
	else if(op!=0&&prev.equals("times")) {
		String val = field.getText();	
		double value = Double.parseDouble(val);
		op=op*value;
		Double q1 = op;
		String q2 = q1.toString();
		field.setText(q2);
		prev="plus";
		return op;
	}
	else if(op!=0&&prev.equals("divide")) {
		String val = field.getText();	
		double value = Double.parseDouble(val);
		op=op/value;
		Double q1 = op;
		String q2 = q1.toString();
		field.setText(q2);
		prev="plus";
		return op;
	}
	
	return op;
	}
public double minus(){
	x ="minus";
	cure=1;
	if(op==0&&!(prev.equals("minus")))
	{
		String val = field.getText();
	double value = Double.parseDouble(val);
	op=value;
	prev="minus";
	return op;
	}
	else if(op!=0&&!(prev.equals("minus"))&&!(prev.equals("times"))&&!(prev.equals("plus"))&&!(prev.equals("divide"))){
		String val = field.getText();
		double value = Double.parseDouble(val);
		op=value;
		prev="minus";
		return op;
		
	}
	else if(op!=0&&prev.equals("minus")) {
		String val = field.getText();	
		double value = Double.parseDouble(val);
		op=op-value;
		Double q1 = op;
		String q2 = q1.toString();
		field.setText(q2);
		prev="minus";
		return op;
	}
	else if(op!=0&&prev.equals("plus")) {
		String val = field.getText();	
		double value = Double.parseDouble(val);
		op=op+value;
		Double q1 = op;
		String q2 = q1.toString();
		field.setText(q2);
		prev="minus";
		return op;
	}
	else if(op!=0&&prev.equals("times")) {
		String val = field.getText();	
		double value = Double.parseDouble(val);
		op=op*value;
		Double q1 = op;
		String q2 = q1.toString();
		field.setText(q2);
		prev="minus";
		return op;
	}
	else if(op!=0&&prev.equals("divide")) {
		String val = field.getText();	
		double value = Double.parseDouble(val);
		op=op/value;
		Double q1 = op;
		String q2 = q1.toString();
		field.setText(q2);
		prev="minus";
		return op;
	}
	
	return op;
	}

public double times(){
	x ="times";
	cure=1;
	if(op==0&&!(prev.equals("times")))
	{
		String val = field.getText();
	double value = Double.parseDouble(val);
	op=value;
	prev="times";
	return op;
	}
	else if(op!=0&&!(prev.equals("times"))&&!(prev.equals("divide"))&&!(prev.equals("plus"))&&!(prev.equals("minus"))){
		String val = field.getText();
		double value = Double.parseDouble(val);
		op=value;
		prev="times";
		return op;
		
	}
	else if(op!=0&&prev.equals("times")) {
		String val = field.getText();	
		double value = Double.parseDouble(val);
		op=op*value;
		Double q1 = op;
		String q2 = q1.toString();
		field.setText(q2);
		prev="times";
		return op;
	}
	else if(op!=0&&prev.equals("minus")) {
		String val = field.getText();	
		double value = Double.parseDouble(val);
		op=op-value;
		Double q1 = op;
		String q2 = q1.toString();
		field.setText(q2);
		prev="times";
		return op;
	}
	else if(op!=0&&prev.equals("plus")) {
		String val = field.getText();	
		double value = Double.parseDouble(val);
		op=op+value;
		Double q1 = op;
		String q2 = q1.toString();
		field.setText(q2);
		prev="times";
		return op;
	}
	else if(op!=0&&prev.equals("divide")) {
		String val = field.getText();	
		double value = Double.parseDouble(val);
		op=op/value;
		Double q1 = op;
		String q2 = q1.toString();
		field.setText(q2);
		prev="times";
		return op;
	}
	
	return op;
	
	}

public double divide(){
	x ="divide";
	cure=1;
	if(op==0&&!(prev.equals("divide")))
	{
		String val = field.getText();
	double value = Double.parseDouble(val);
	op=value;
	prev="divide";
	return op;
	}
	else if(op!=0&&!(prev.equals("divide"))&&!(prev.equals("times"))&&!(prev.equals("plus"))&&!(prev.equals("minus"))){
		String val = field.getText();
		double value = Double.parseDouble(val);
		op=value;
		prev="divide";
		return op;
		
	}
	else if(op!=0&&prev.equals("divide")) {
		String val = field.getText();	
		double value = Double.parseDouble(val);
		op=op/value;
		Double q1 = op;
		String q2 = q1.toString();
		field.setText(q2);
		prev="divide";
		return op;
	}
	else if(op!=0&&prev.equals("minus")) {
		String val = field.getText();	
		double value = Double.parseDouble(val);
		op=op-value;
		Double q1 = op;
		String q2 = q1.toString();
		field.setText(q2);
		prev="divide";
		return op;
	}
	else if(op!=0&&prev.equals("times")) {
		String val = field.getText();	
		double value = Double.parseDouble(val);
		op=op*value;
		Double q1 = op;
		String q2 = q1.toString();
		field.setText(q2);
		prev="divide";
		return op;
	}
	else if(op!=0&&prev.equals("plus")) {
		String val = field.getText();	
		double value = Double.parseDouble(val);
		op=op+value;
		Double q1 = op;
		String q2 = q1.toString();
		field.setText(q2);
		prev="divide";
		return op;
	}
	
	return op;
	}

public void equal(){
	cure=1;
	switch(x){
	case "plus" :
	String eq =	field.getText();
	double equal = Double.parseDouble(eq);
	Double result = op + equal;
	String res = result.toString();
	field.setText(res);
	x="null";
	break;
	
	case "minus" :
		String eq2 =	field.getText();
		double equal2 = Double.parseDouble(eq2);
		Double result2 = op - equal2;
		String res2 = result2.toString();
		field.setText(res2);
		x="null";
	break;
	
	case "times" :
		String eq3 =	field.getText();
		double equal3 = Double.parseDouble(eq3);
		Double result3 = op*equal3;
		String res3 = result3.toString();
		field.setText(res3);
		x="null";
	break;
	
	case "divide" :
		String eq4 =	field.getText();
		double equal4 = Double.parseDouble(eq4);
		Double result4 = op/equal4;
		String res4 = result4.toString();
		field.setText(res4);
		x="null";
	break;
	default:
	break;
	
	}	
	prev="null";
}
}
