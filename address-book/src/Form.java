import javax.swing.*;
import java.io.File;

public class Form extends JFrame {

    // Form Attributes
    private JTextField id;
    private JComboBox region;
    private JTextField name;
    private JTextArea address;
    private JTextField housePhone;
    private JTextField cellphone1;
    private JTextField cellphone2;
    private JTextField email;
    private JTextField website;
    private JTextField instagram;

    // Form Labels
    private JLabel labelId;
    private JLabel labelRegion;
    private JLabel labelName;
    private JLabel labelAddress;
    private JLabel labelHousePhone;
    private JLabel labelCellphone1;
    private JLabel labelCellphone2;
    private JLabel labelEmail;
    private JLabel labelWebsite;
    private JLabel labelInstagram;

    // Form Buttons
    private JButton buttonNew;
    private JButton buttonSave;
    private JButton buttonDelete;
    private JButton buttonRefresh;
    private JButton buttonClear;

    // Miscellaneous
    private JTable table;
    private JMenuBar menuBar;
    private JScrollPane scrollTable;

    // Retrieve The Excel File
    private File excelFile = new File(Configuration.DATABASE_PATH);

    // Constructors
    public Form() {
        initComponent();
        loadData();
    }

    // Initialize Components
    private void initComponent() {
        generateMenu();
        generateButton();
        generateLabels();
        generateAttributes();
        generateTable();

        // Create Pane With a Null Layout
        JPanel contentPane = generateContentPane();

        // Adding Panels to JFrame and setting the window positions, the closing operation,
        // setting the title, the form's size, and (the relative location) setting the visible
        getContentPane().add(contentPane);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle(Configuration.PROJECT_TITLE);
        setSize(1000, 780);
        // setLocationRelativeTo(null);
        setVisible(true);
        pack();
    }

    // Read / Get Data From Microsoft Excel and Set To Table
    private void loadData() {

    }

    // A Simple Method to Generate The Menu Bar
    private void generateMenu() {
    }

    // A Simple Method to Generate Buttons
    private void generateButton() {

    }

    // A Simple Method to Generate the Button's Labels
    private void generateLabels() {

    }

    // A Simple Method to Generate the Form's Attributes
    private void generateAttributes() {

    }

    // A Simple Method to Generate the Table
    private void generateTable() {

    }

    // A Function to Generate Content Panes
    public JPanel generateContentPane() {
        return new JPanel();
    }
}
