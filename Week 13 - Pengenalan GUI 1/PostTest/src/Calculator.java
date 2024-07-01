import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.text.DecimalFormat;
import java.awt.*;
import javax.swing.*;

public class Calculator {
    JFrame frame;
    JLabel label = new JLabel();
    JTextField textField = new JTextField("0");
    JButton buttonMC = new JButton("MC");
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonMR = new JButton("MR");
    JButton buttonMS = new JButton("MS");
    JButton buttonMPlus = new JButton("M+");
    JButton buttonBack = new JButton("<-");
    JButton buttonCE = new JButton("CE");
    JButton buttonC = new JButton("C");
    JButton buttonAnd = new JButton("&");
    JButton buttonRoot = new JButton("[]");
    JButton buttonDivision = new JButton("/");
    JButton buttonPercent = new JButton("%");
    JButton buttonMultiply = new JButton("X");
    JButton buttonOneDividedByX = new JButton("1/x");
    JButton buttonMinus = new JButton("-");
    JButton buttonPlus = new JButton("+");
    JButton buttonEqual = new JButton("=");
	JButton buttonMminus = new JButton("M-");

    double firstNumber;
    double secondNumber;
    String operator;

    Calculator() {
        GUI();
        addComponents();
        addListeners();
    }

    public void GUI() {
        frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setSize(308, 385);
        frame.getContentPane().setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
		frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addComponents() {
        label.setBounds(250, 0, 50, 50);
        frame.add(label);

        textField.setBounds(11, 8, 270, 60);
        textField.setFont(textField.getFont().deriveFont(30f));
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(textField);

        buttonSeven.setBounds(10, 165, 50, 40);
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonSeven);

        buttonEight.setBounds(65, 165, 50, 40);
        buttonEight.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonEight);

        buttonNine.setBounds(120, 165, 50, 40);
        buttonNine.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonNine);

        buttonFour.setBounds(10, 210, 50, 40);
        buttonFour.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonFour);

        buttonFive.setBounds(65, 210, 50, 40);
        buttonFive.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonFive);

        buttonSix.setBounds(120, 210, 50, 40);
        buttonSix.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonSix);

        buttonOne.setBounds(10, 255, 50, 40);
        buttonOne.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonOne);

        buttonTwo.setBounds(65, 255, 50, 40);
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonTwo);

        buttonThree.setBounds(120, 255, 50, 40);
        buttonThree.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonThree);

        buttonDot.setBounds(120, 300, 50, 40);
        buttonDot.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonDot);

        buttonZero.setBounds(10, 300, 105, 40);
        buttonZero.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonZero);

        buttonEqual.setBounds(230, 255, 50, 85);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonEqual);

        buttonPlus.setBounds(175, 300, 50, 40);
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonPlus);
        
        buttonMinus.setBounds(175, 255, 50, 40);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonMinus);
        
        buttonOneDividedByX.setBounds(230, 210, 50, 40);
        buttonOneDividedByX.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonOneDividedByX);
        
        buttonMultiply.setBounds(175, 210, 50, 40);
        buttonMultiply.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonMultiply);
              
        buttonPercent.setBounds(230, 165, 50, 40);
        buttonPercent.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonPercent);
      
        buttonDivision.setBounds(175, 165, 50, 40);
        buttonDivision.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonDivision);
              
        buttonRoot.setBounds(230, 120, 50, 40);
        buttonRoot.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonRoot);
        
        buttonAnd.setBounds(175, 120, 50, 40);
        buttonAnd.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonAnd);
                
        buttonC.setBounds(120, 120, 50, 40);
        buttonC.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonC);
                
        buttonCE.setBounds(65, 120, 50, 40);
        buttonCE.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonCE);
                
        buttonBack.setBounds(10, 120, 50, 40);
        buttonBack.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonBack);

        buttonMS.setBounds(120, 75, 50, 40);
        buttonMS.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonMS);

        buttonMR.setBounds(65, 75, 50, 40);
        buttonMR.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonMR);
        
        buttonMC.setBounds(10 , 75 , 50, 40 );
        buttonMC.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonMC);

		buttonMminus.setBounds(230, 75, 50, 40);
        buttonMminus.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonMminus);

        buttonMPlus.setBounds(175, 75, 50, 40);
        buttonMPlus.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonMPlus);
    }

    public void addListeners() {
        buttonZero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appendNumber("0");
            }
        });

        buttonOne.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appendNumber("1");
            }
        });

        buttonTwo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appendNumber("2");
            }
        });

        buttonThree.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appendNumber("3");
            }
        });

        buttonFour.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appendNumber("4");
            }
        });

        buttonFive.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appendNumber("5");
            }
        });

        buttonSix.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appendNumber("6");
            }
        });

        buttonSeven.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appendNumber("7");
            }
        });

        buttonEight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appendNumber("8");
            }
        });

        buttonNine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appendNumber("9");
            }
        });

        buttonDot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String currentText = textField.getText();
                if (!currentText.contains(".")) {
                    textField.setText(currentText + ".");
                }
            }
        });

        buttonPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                processOperator("+");
            }
        });

        buttonMinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                processOperator("-");
            }
        });

        buttonMultiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                processOperator("*");
            }
        });

        buttonDivision.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                processOperator("/");
            }
        });

        buttonPercent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculatePercent();
            }
        });

        buttonOneDividedByX.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateOneDividedByX();
            }
        });

        buttonEqual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateResult();
            }
        });
		buttonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
		}
		});

		buttonCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
				firstNumber = 0;
				operator = "";
			}
		});

    }

    private void appendNumber(String number) {
        String currentText = textField.getText();
        if (currentText.equals("0") || currentText.equals("ERROR")) {
            textField.setText(number);
        } else {
            textField.setText(currentText + number);
        }
    }

    private void processOperator(String op) {
        firstNumber = Double.parseDouble(textField.getText());
        operator = op;
        textField.setText("0");
    }

    private void calculatePercent() {
        double number = Double.parseDouble(textField.getText());
        double result = number / 100;
        textField.setText(String.valueOf(result));
    }

    private void calculateOneDividedByX() {
        double number = Double.parseDouble(textField.getText());
        if (number != 0) {
            double result = 1 / number;
            textField.setText(String.valueOf(result));
        } else {
            textField.setText("ERROR");
        }
    }

	private void calculateResult() {
		secondNumber = Double.parseDouble(textField.getText());
		double result = 0;

		switch (operator) {
			case "+":
				result = firstNumber + secondNumber;
				break;
			case "-":
				result = firstNumber - secondNumber;
				break;
			case "*":
				result = firstNumber * secondNumber;
				break;
			case "/":
				if (secondNumber != 0) {
					result = firstNumber / secondNumber;
				} else {
					textField.setText("ERROR");
					return;
				}
				break;
		}

		// Batasi jumlah digit menjadi 6
		DecimalFormat decimalFormat = new DecimalFormat("#.######");
		String formattedResult = decimalFormat.format(result);

		textField.setText(formattedResult);
	}

    public static void main(String[] args) {
        new Calculator();
    }
}
