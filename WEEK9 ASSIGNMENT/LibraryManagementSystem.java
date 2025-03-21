import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class Book {
    String title, author, isbn, genre;
    int publicationYear;
    boolean isAvailable;

    public Book(String title, String author, String isbn, String genre, int publicationYear, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.genre = genre;
        this.publicationYear = publicationYear;
        this.isAvailable = isAvailable;
    }
}

public class LibraryManagementSystem extends JFrame {
    private ArrayList<Book> books;
    private DefaultTableModel tableModel;
    private JTextField titleField, authorField, isbnField, yearField;
    private JComboBox<String> genreCombo;
    private JCheckBox availabilityCheck;
    private JTable bookTable;

    public LibraryManagementSystem() {
        books = new ArrayList<>();
        setTitle("Library Management System");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Menu Bar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        setJMenuBar(menuBar);

        // Tool Bar
        JToolBar toolBar = new JToolBar();
        JButton addButton = new JButton("Add Book");
        JButton updateButton = new JButton("Update Book");
        JButton removeButton = new JButton("Remove Book");
        JButton searchButton = new JButton("Search");
        toolBar.add(addButton);
        toolBar.add(updateButton);
        toolBar.add(removeButton);
        toolBar.add(searchButton);
        add(toolBar, BorderLayout.NORTH);

        // Tabbed Pane
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Book Details", createBookDetailsPanel());
        tabbedPane.addTab("Book List", createBookListPanel());
        add(tabbedPane, BorderLayout.CENTER);

        // Button Actions
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addBook();
            }
        });

        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateBook();
            }
        });

        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                removeBook();
            }
        });

        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                searchBook();
            }
        });
    }

    private JPanel createBookDetailsPanel() {
        JPanel panel = new JPanel(new GridLayout(6, 2));
        titleField = new JTextField();
        authorField = new JTextField();
        isbnField = new JTextField();
        yearField = new JTextField();
        genreCombo = new JComboBox<>(new String[]{"Fiction", "Non-Fiction", "Science", "History", "Fantasy"});
        availabilityCheck = new JCheckBox("Available");

        panel.add(new JLabel("Title:"));
        panel.add(titleField);
        panel.add(new JLabel("Author:"));
        panel.add(authorField);
        panel.add(new JLabel("ISBN:"));
        panel.add(isbnField);
        panel.add(new JLabel("Genre:"));
        panel.add(genreCombo);
        panel.add(new JLabel("Publication Year:"));
        panel.add(yearField);
        panel.add(availabilityCheck);

        return panel;
    }

    private JScrollPane createBookListPanel() {
        String[] columnNames = {"Title", "Author", "ISBN", "Genre", "Publication Year", "Available"};
        tableModel = new DefaultTableModel(columnNames, 0);
        bookTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(bookTable);
        return scrollPane;
    }

    private void addBook() {
        String title = titleField.getText();
        String author = authorField.getText();
        String isbn = isbnField.getText();
        String genre = (String) genreCombo.getSelectedItem();
        int year = Integer.parseInt(yearField.getText());
        boolean isAvailable = availabilityCheck.isSelected();

        Book book = new Book(title, author, isbn, genre, year, isAvailable);
        books.add(book);
        tableModel.addRow(new Object[]{title, author, isbn, genre, year, isAvailable});
        clearFields();
    }

    private void updateBook() {
        int selectedRow = bookTable.getSelectedRow();
        if (selectedRow != -1) {
            String title = titleField.getText();
            String author = authorField.getText();
            String isbn = isbnField.getText();
            String genre = (String) genreCombo.getSelectedItem();
            int year = Integer.parseInt(yearField.getText());
            boolean isAvailable = availabilityCheck.isSelected();

            Book book = books.get(selectedRow);
            book.title = title;
            book.author = author;
            book.isbn = isbn;
            book.genre = genre;
            book.publicationYear = year;
            book.isAvailable = isAvailable;

            tableModel.setValueAt(title, selectedRow, 0);
            tableModel.setValueAt(author, selectedRow, 1);
            tableModel.setValueAt(isbn, selectedRow, 2);
            tableModel.setValueAt(genre, selectedRow, 3);
            tableModel.setValueAt(year, selectedRow, 4);
            tableModel.setValueAt(isAvailable, selectedRow, 5);

            clearFields();
        } else {
            showErrorDialog("Please select a book to update.");
        }
    }

    private void removeBook() {
        int selectedRow = bookTable.getSelectedRow();
        if (selectedRow != -1) {
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this book?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                books.remove(selectedRow);
                tableModel.removeRow(selectedRow);
                clearFields();
            }
        } else {
            showErrorDialog("Please select a book to remove.");
        }
    }

    private void searchBook() {
        String searchTerm = JOptionPane.showInputDialog(this, "Enter book title or author to search:");
        if (searchTerm != null && !searchTerm.trim().isEmpty()) {
            tableModel.setRowCount(0); // Clear the current table
            for (Book book : books) {
                if (book.title.toLowerCase().contains(searchTerm.toLowerCase()) || 
                    book.author.toLowerCase().contains(searchTerm.toLowerCase())) {
                    tableModel.addRow(new Object[]{book.title, book.author, book.isbn, book.genre, book.publicationYear, book.isAvailable});
                }
            }
            if (tableModel.getRowCount() == 0) {
                showErrorDialog("No books found matching your search.");
            }
        }
    }

    private void clearFields() {
        titleField.setText("");
        authorField.setText("");
        isbnField.setText("");
        yearField.setText("");
        availabilityCheck.setSelected(false);
        bookTable.clearSelection();
    }

    private void showErrorDialog(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LibraryManagementSystem app = new LibraryManagementSystem();
            app.setVisible(true);
        });
    }
}
