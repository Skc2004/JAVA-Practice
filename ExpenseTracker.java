import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class ExpenseTracker extends JFrame {
    private JTextField expenseField;
    private JTextField amountField;
    private JComboBox<String> categoryCombo;
    private JLabel dailyLimitLabel;

    private double monthlyLimit = 1000.00;
    private double dailyExpenses = 0.0;

    public ExpenseTracker() {
        setTitle("Expense Tracker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 400);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        inputPanel.setLayout(new GridLayout(4, 2, 10, 10));

        inputPanel.add(new JLabel("Expense:"));
        expenseField = new JTextField();
        inputPanel.add(expenseField);

        inputPanel.add(new JLabel("Amount (INR):"));
        amountField = new JTextField();
        inputPanel.add(amountField);

        inputPanel.add(new JLabel("Category:"));
        String[] categories = {"Food", "Transport", "Entertainment", "Shopping", "Other"};
        categoryCombo = new JComboBox<>(categories);
        inputPanel.add(categoryCombo);

        JButton saveButton = new JButton("Save Expense");
        saveButton.addActionListener(new SaveExpenseAction());
        inputPanel.add(saveButton);

        dailyLimitLabel = new JLabel("Daily Limit: 0.00 INR");
        updateDailyLimitLabel();

        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        rightPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        JButton showExpensesButton = new JButton("Show Expenses");
        showExpensesButton.addActionListener(new ShowExpensesAction());
        rightPanel.add(showExpensesButton);
        rightPanel.add(Box.createVerticalStrut(10));

        JButton resetButton = new JButton("Reset Data");
        resetButton.addActionListener(new ResetDataAction());
        rightPanel.add(resetButton);
        rightPanel.add(Box.createVerticalStrut(10));

        rightPanel.add(dailyLimitLabel);

        add(inputPanel, BorderLayout.CENTER);
        add(rightPanel, BorderLayout.EAST);

        // Check if the file exists, otherwise create it
        try {
            File file = new File("expenses.txt");
            if (!file.exists()) file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateDailyLimitLabel() {
        dailyLimitLabel.setText(String.format("Daily Limit: %.2f INR", monthlyLimit - dailyExpenses));
    }

    private class SaveExpenseAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String expense = expenseField.getText();
            String amountText = amountField.getText();
            String category = (String) categoryCombo.getSelectedItem();

            if (expense.isEmpty() || amountText.isEmpty() || category == null) {
                JOptionPane.showMessageDialog(ExpenseTracker.this, "All fields are required.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            try {
                double amount = Double.parseDouble(amountText);
                if (dailyExpenses + amount > monthlyLimit) {
                    JOptionPane.showMessageDialog(ExpenseTracker.this, "Daily limit exceeded.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                try (FileWriter writer = new FileWriter("expenses.txt", true)) {
                    writer.write("Category: " + category + ", Expense: " + expense + ", Amount: " + amount + "\n");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                dailyExpenses += amount;
                expenseField.setText("");
                amountField.setText("");
                updateDailyLimitLabel();
                JOptionPane.showMessageDialog(ExpenseTracker.this, "Expense saved successfully.", "Expense Tracker", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(ExpenseTracker.this, "Amount must be a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private class ShowExpensesAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JTextArea expensesText = new JTextArea();
            expensesText.setEditable(false);

            try (Scanner scanner = new Scanner(new File("expenses.txt"))) {
                while (scanner.hasNextLine()) {
                    expensesText.append(scanner.nextLine() + "\n");
                }
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }

            JScrollPane scrollPane = new JScrollPane(expensesText);
            scrollPane.setPreferredSize(new Dimension(400, 300));

            JOptionPane.showMessageDialog(ExpenseTracker.this, scrollPane, "Expenses", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private class ResetDataAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            File file = new File("expenses.txt");
            if (file.exists()) {
                if (file.delete()) {
                    dailyExpenses = 0.0;
                    updateDailyLimitLabel();
                    JOptionPane.showMessageDialog(ExpenseTracker.this, "All data has been reset.", "Expense Tracker", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(ExpenseTracker.this, "No data found to reset.", "Expense Tracker", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ExpenseTracker tracker = new ExpenseTracker();
            tracker.setVisible(true);
        });
    }
}