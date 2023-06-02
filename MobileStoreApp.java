import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class MobileStoreApp {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/SSMobiles";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "";

    private static Connection connection;

    public static void main(String[] args) {
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            return;
        }

        createHomeFrame();
    }

    private static void createHomeFrame() {
        JFrame homeFrame = new JFrame("SS Mobile Store");
        homeFrame.setSize(300, 200);
        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JButton adminButton = new JButton("Admin Login");
        JButton customerButton = new JButton("Customer Login");

        panel.add(adminButton);
        panel.add(customerButton);
        homeFrame.getContentPane().add(panel);

        adminButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                createAdminLoginFrame();
                homeFrame.dispose();
            }
        });

        customerButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                createCustomerLoginFrame();
                homeFrame.dispose();
            }
        });

        homeFrame.setVisible(true);
    }

    private static void createAdminLoginFrame() {
        JFrame adminFrame = new JFrame("Admin Login");
        adminFrame.setSize(300, 200);
        adminFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameTextField = new JTextField(15);
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(15);
        JButton loginButton = new JButton("Login");

        panel.add(usernameLabel);
        panel.add(usernameTextField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        adminFrame.getContentPane().add(panel);

        loginButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                String username = usernameTextField.getText();
                String password = new String(passwordField.getPassword());

                if (authenticateAdmin(username, password)) {
                    createAdminPanel();
                    adminFrame.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password. Please try again.");
                }
            }
        });

        adminFrame.setVisible(true);
    }

    private static void createAdminPanel() {
        JFrame adminPanelFrame = new JFrame("Admin - SS MOBILES");
        adminPanelFrame.setSize(500, 220);
        adminPanelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel imeiLabel = new JLabel("IMEI:");
        JTextField imeiTextField = new JTextField(15);
        JLabel modelLabel = new JLabel("Model:");
        JTextField modelTextField = new JTextField(15);
        JLabel priceLabel = new JLabel("Price:");
        JTextField priceTextField = new JTextField(15);
        JLabel quantityLabel = new JLabel("Quantity:");
        JTextField quantityTextField = new JTextField(15);
        JButton addButton = new JButton("Add Mobile");
        JButton viewSalesButton = new JButton("View Sales");
        JButton viewStockButton = new JButton("View Stoke");
        JButton logout = new JButton("Log Out");

        panel.add(imeiLabel);import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

        public class MobileStoreApp {
            private static final String DB_URL = "jdbc:mysql://localhost:3306/SSMobiles";
            private static final String DB_USERNAME = "root";
            private static final String DB_PASSWORD = "";

            private static Connection connection;

            public static void main(String[] args) {
                try {
                    connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
                } catch (SQLException e) {
                    e.printStackTrace();
                    return;
                }

                createHomeFrame();
            }

            private static void createHomeFrame() {
                JFrame homeFrame = new JFrame("SS Mobile Store");
                homeFrame.setSize(300, 200);
                homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JPanel panel = new JPanel();
                JButton adminButton = new JButton("Admin Login");
                JButton customerButton = new JButton("Customer Login");

                panel.add(adminButton);
                panel.add(customerButton);
                homeFrame.getContentPane().add(panel);

                adminButton.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        createAdminLoginFrame();
                        homeFrame.dispose();
                    }
                });

                customerButton.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        createCustomerLoginFrame();
                        homeFrame.dispose();
                    }
                });

                homeFrame.setVisible(true);
            }

            private static void createAdminLoginFrame() {
                JFrame adminFrame = new JFrame("Admin Login");
                adminFrame.setSize(300, 200);
                adminFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JPanel panel = new JPanel();
                JLabel usernameLabel = new JLabel("Username:");
                JTextField usernameTextField = new JTextField(15);
                JLabel passwordLabel = new JLabel("Password:");
                JPasswordField passwordField = new JPasswordField(15);
                JButton loginButton = new JButton("Login");

                panel.add(usernameLabel);
                panel.add(usernameTextField);
                panel.add(passwordLabel);
                panel.add(passwordField);
                panel.add(loginButton);
                adminFrame.getContentPane().add(panel);

                loginButton.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        String username = usernameTextField.getText();
                        String password = new String(passwordField.getPassword());

                        if (authenticateAdmin(username, password)) {
                            createAdminPanel();
                            adminFrame.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid username or password. Please try again.");
                        }
                    }
                });

                adminFrame.setVisible(true);
            }

            private static void createAdminPanel() {
                JFrame adminPanelFrame = new JFrame("Admin - SS MOBILES");
                adminPanelFrame.setSize(500, 220);
                adminPanelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JPanel panel = new JPanel();
                JLabel imeiLabel = new JLabel("IMEI:");
                JTextField imeiTextField = new JTextField(15);
                JLabel modelLabel = new JLabel("Model:");
                JTextField modelTextField = new JTextField(15);
                JLabel priceLabel = new JLabel("Price:");
                JTextField priceTextField = new JTextField(15);
                JLabel quantityLabel = new JLabel("Quantity:");
                JTextField quantityTextField = new JTextField(15);
                JButton addButton = new JButton("Add Mobile");
                JButton viewSalesButton = new JButton("View Sales");
                JButton viewStockButton = new JButton("View Stoke");
                JButton logout = new JButton("Log Out");

                panel.add(imeiLabel);
                panel.add(imeiTextField);
                panel.add(modelLabel);
                panel.add(modelTextField);
                panel.add(priceLabel);
                panel.add(priceTextField);
                panel.add(quantityLabel);
                panel.add(quantityTextField);
                panel.add(addButton);
                panel.add(viewSalesButton);
                panel.add(viewStockButton);
                panel.add(logout);
                adminPanelFrame.getContentPane().add(panel);
                adminPanelFrame.setLayout(new GridLayout(2,5));

                addButton.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        String imei = imeiTextField.getText();
                        String model = modelTextField.getText();
                        double price = Double.parseDouble(priceTextField.getText());
                        int quantity = Integer.parseInt(quantityTextField.getText());

                        addMobileToStock(imei, model, price, quantity);
                        JOptionPane.showMessageDialog(null, "Mobile added to stock successfully.");
                    }
                });

                viewSalesButton.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        viewSales();
                    }
                });

                viewStockButton.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        viewStock();
                    }
                });

                logout.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        adminPanelFrame.dispose();
                        createHomeFrame();

                    }
                });
                adminPanelFrame.setVisible(true);
            }

            private static void createCustomerLoginFrame() {
                JFrame customerLoginFrame = new JFrame("Customer Login");
                customerLoginFrame.setSize(300, 200);
                customerLoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JPanel panel = new JPanel();
                JLabel usernameLabel = new JLabel("Username:");
                JTextField usernameTextField = new JTextField(15);
                JLabel passwordLabel = new JLabel("Password:");
                JPasswordField passwordField = new JPasswordField(15);
                JButton loginButton = new JButton("Login");
                JButton registerButton = new JButton("Register");

                panel.add(usernameLabel);
                panel.add(usernameTextField);
                panel.add(passwordLabel);
                panel.add(passwordField);
                panel.add(loginButton);
                panel.add(registerButton);
                customerLoginFrame.getContentPane().add(panel);

                loginButton.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        String username = usernameTextField.getText();
                        String password = new String(passwordField.getPassword());

                        if (authenticateCustomer(username, password)) {
                            createCustomerPanel(username);
                            customerLoginFrame.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid username or password. Please try again.");
                        }
                    }
                });

                registerButton.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        createCustomerRegistrationFrame();
                        customerLoginFrame.dispose();
                    }
                });

                customerLoginFrame.setVisible(true);
            }

            private static void createCustomerRegistrationFrame() {
                JFrame registrationFrame = new JFrame("Customer Registration");
                registrationFrame.setSize(500, 220);
                registrationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JPanel panel = new JPanel();
                JLabel nameLabel = new JLabel("Name:");
                JTextField nameTextField = new JTextField(15);
                JLabel emailLabel = new JLabel("Email:");
                JTextField emailTextField = new JTextField(15);
                JLabel passwordLabel = new JLabel("Password:");
                JPasswordField passwordField = new JPasswordField(15);
                JLabel genderLabel = new JLabel("Gender:");
                JRadioButton maleRadioButton = new JRadioButton("Male");
                JRadioButton femaleRadioButton = new JRadioButton("Female");
                JButton registerButton = new JButton("Register");

                ButtonGroup genderGroup = new ButtonGroup();
                genderGroup.add(maleRadioButton);
                genderGroup.add(femaleRadioButton);

                panel.add(nameLabel);
                panel.add(nameTextField);
                panel.add(emailLabel);
                panel.add(emailTextField);
                panel.add(passwordLabel);
                panel.add(passwordField);
                panel.add(genderLabel);
                panel.add(maleRadioButton);
                panel.add(femaleRadioButton);
                panel.add(registerButton);
                registrationFrame.getContentPane().add(panel);
                registrationFrame.setLayout(new GridLayout(2,5));

                registerButton.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        String name = nameTextField.getText();
                        String email = emailTextField.getText();
                        String password = new String(passwordField.getPassword());
                        String gender = maleRadioButton.isSelected() ? "Male" : "Female";

                        registerCustomer(name, email, password, gender);
                        JOptionPane.showMessageDialog(null, "Registration successful. Please login to continue.");
                        registrationFrame.dispose();
                        createCustomerLoginFrame();
                    }
                });

                registrationFrame.setVisible(true);
            }

            private static void createCustomerPanel(String uname) {

                JFrame customerPanelFrame = new JFrame("SS MOBILES");
                customerPanelFrame.setSize(400, 300);
                customerPanelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JPanel panel = new JPanel();


                // Fetch mobiles from the stock table
                String[] mobiles = getMobilesFromStock();

                // Create a list to display mobiles
                JList<String> mobileList = new JList<>(mobiles);
                JScrollPane scrollPane = new JScrollPane(mobileList);

                JButton buyButton = new JButton("Buy");
                JButton logout = new JButton("Log Out");

                panel.add(scrollPane);
                panel.add(buyButton);
                panel.add(logout);
                customerPanelFrame.getContentPane().add(panel);

                buyButton.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        String selectedMobile = mobileList.getSelectedValue();

                        if (selectedMobile == null) {
                            JOptionPane.showMessageDialog(null, "Please select a mobile to buy.");
                        } else {
                            String username;
                            username = uname;

                            String imei = selectedMobile.split(" - ")[0];
                            String model = selectedMobile.split(" - ")[1];
                            double price = Double.parseDouble(selectedMobile.split(" - ")[2]);

                            String upiNumber = JOptionPane.showInputDialog(null, "Enter UPI number for payment:");

                            if (upiNumber != null) {
                                if (processPayment(username, model, price, upiNumber)) {
                                    JOptionPane.showMessageDialog(null, "Payment successful. Mobile purchased.");
                                    updateStockQuantity(imei);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Payment failed. Please try again.");
                                }
                            }
                        }
                    }
                });
                logout.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        customerPanelFrame.dispose();
                        createHomeFrame();

                    }
                });

                customerPanelFrame.setVisible(true);
            }

            private static boolean authenticateAdmin(String username, String password) {
                try {
                    PreparedStatement statement = connection.prepareStatement("SELECT * FROM admin WHERE username = ? AND password = ?");
                    statement.setString(1, username);
                    statement.setString(2, password);
                    ResultSet resultSet = statement.executeQuery();

                    return resultSet.next();
                } catch (SQLException e) {
                    e.printStackTrace();
                    return false;
                }
            }

            private static boolean authenticateCustomer(String username, String password) {
                try {
                    PreparedStatement statement = connection.prepareStatement("SELECT * FROM user WHERE email = ? AND password = ?");
                    statement.setString(1, username);
                    statement.setString(2, password);
                    ResultSet resultSet = statement.executeQuery();

                    return resultSet.next();
                } catch (SQLException e) {
                    e.printStackTrace();
                    return false;
                }
            }

            private static void addMobileToStock(String imei, String model, double price, int quantity) {
                try {
                    PreparedStatement statement = connection.prepareStatement("INSERT INTO stock (imei, model, price, quantity) VALUES (?, ?, ?, ?)");
                    statement.setString(1, imei);
                    statement.setString(2, model);
                    statement.setDouble(3, price);
                    statement.setInt(4, quantity);
                    statement.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            private static void viewSales() {
                try {
                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery("SELECT * FROM sale");

                    StringBuilder saleDetails = new StringBuilder();
                    while (resultSet.next()) {
                        String user = resultSet.getString("user");
                        String model = resultSet.getString("model");
                        double amount = resultSet.getDouble("amount");
                        String upiNumber = resultSet.getString("upi_number");

                        saleDetails.append("USER: ").append(user)
                                .append(", Model: ").append(model)
                                .append(", Amount: ").append(amount)
                                .append(", UPI Number: ").append(upiNumber)
                                .append("\n");
                    }

                    if (saleDetails.length() > 0) {
                        JOptionPane.showMessageDialog(null, saleDetails.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "No sales found.");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            private static void viewStock() {
                try {
                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery("SELECT * FROM stock");

                    StringBuilder stockDetails = new StringBuilder();
                    while (resultSet.next()) {
                        String imei = resultSet.getString("imei");
                        String model = resultSet.getString("model");
                        double price = resultSet.getDouble("price");
                        String quantity = resultSet.getString("quantity");

                        stockDetails.append("IMEI: ").append(imei)
                                .append(", Model: ").append(model)
                                .append(", Price: ").append(price)
                                .append(", Quantity: ").append(quantity)
                                .append("\n");
                    }

                    if (stockDetails.length() > 0) {
                        JOptionPane.showMessageDialog(null, stockDetails.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "No Stoke found.");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }


            private static String[] getMobilesFromStock() {
                try {
                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery("SELECT * FROM stock");

                    StringBuilder mobiles = new StringBuilder();
                    while (resultSet.next()) {
                        String imei = resultSet.getString("imei");
                        String model = resultSet.getString("model");
                        double price = resultSet.getDouble("price");

                        mobiles.append(imei).append(" - ").append(model).append(" - ").append(price).append("\n");
                    }

                    if (mobiles.length() > 0) {
                        return mobiles.toString().split("\n");
                    } else {
                        return new String[]{};
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                    return new String[]{};
                }
            }

            private static boolean processPayment(String username, String model, double amount, String upiNumber) {
                try {
                    PreparedStatement statement = connection.prepareStatement("INSERT INTO sale (user, model, amount, upi_number) VALUES (?, ?, ?, ?)");
                    statement.setString(1, username);
                    statement.setString(2, model);
                    statement.setDouble(3, amount);
                    statement.setString(4, upiNumber);
                    statement.executeUpdate();

                    return true;
                } catch (SQLException e) {
                    e.printStackTrace();
                    return false;
                }
            }

            private static void updateStockQuantity(String imei) {
                try {
                    PreparedStatement statement = connection.prepareStatement("UPDATE stock SET quantity = quantity - 1 WHERE imei = ?");
                    statement.setString(1, imei);
                    statement.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            private static void registerCustomer(String name, String email, String password, String gender) {
                try {
                    PreparedStatement statement = connection.prepareStatement("INSERT INTO user (name, email, password, gender) VALUES (?, ?, ?, ?)");
                    statement.setString(1, name);
                    statement.setString(2, email);
                    statement.setString(3, password);
                    statement.setString(4, gender);
                    statement.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        panel.add(imeiTextField);
        panel.add(modelLabel);
        panel.add(modelTextField);
        panel.add(priceLabel);
        panel.add(priceTextField);
        panel.add(quantityLabel);
        panel.add(quantityTextField);
        panel.add(addButton);
        panel.add(viewSalesButton);
        panel.add(viewStockButton);
        panel.add(logout);
        adminPanelFrame.getContentPane().add(panel);
        adminPanelFrame.setLayout(new GridLayout(2,5));

        addButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                String imei = imeiTextField.getText();
                String model = modelTextField.getText();
                double price = Double.parseDouble(priceTextField.getText());
                int quantity = Integer.parseInt(quantityTextField.getText());

                addMobileToStock(imei, model, price, quantity);
                JOptionPane.showMessageDialog(null, "Mobile added to stock successfully.");
            }
        });

        viewSalesButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                viewSales();
            }
        });

        viewStockButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                viewStock();
            }
        });

        logout.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                adminPanelFrame.dispose();
                createHomeFrame();

            }
        });
        adminPanelFrame.setVisible(true);
    }

    private static void createCustomerLoginFrame() {
        JFrame customerLoginFrame = new JFrame("Customer Login");
        customerLoginFrame.setSize(300, 200);
        customerLoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameTextField = new JTextField(15);
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(15);
        JButton loginButton = new JButton("Login");
        JButton registerButton = new JButton("Register");

        panel.add(usernameLabel);
        panel.add(usernameTextField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(registerButton);
        customerLoginFrame.getContentPane().add(panel);

        loginButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                String username = usernameTextField.getText();
                String password = new String(passwordField.getPassword());

                if (authenticateCustomer(username, password)) {
                    createCustomerPanel(username);
                    customerLoginFrame.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password. Please try again.");
                }
            }
        });

        registerButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                createCustomerRegistrationFrame();
                customerLoginFrame.dispose();
            }
        });

        customerLoginFrame.setVisible(true);
    }

    private static void createCustomerRegistrationFrame() {
        JFrame registrationFrame = new JFrame("Customer Registration");
        registrationFrame.setSize(500, 220);
        registrationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameTextField = new JTextField(15);
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailTextField = new JTextField(15);
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(15);
        JLabel genderLabel = new JLabel("Gender:");
        JRadioButton maleRadioButton = new JRadioButton("Male");
        JRadioButton femaleRadioButton = new JRadioButton("Female");
        JButton registerButton = new JButton("Register");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        panel.add(nameLabel);
        panel.add(nameTextField);
        panel.add(emailLabel);
        panel.add(emailTextField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(genderLabel);
        panel.add(maleRadioButton);
        panel.add(femaleRadioButton);
        panel.add(registerButton);
        registrationFrame.getContentPane().add(panel);
        registrationFrame.setLayout(new GridLayout(2,5));

        registerButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                String email = emailTextField.getText();
                String password = new String(passwordField.getPassword());
                String gender = maleRadioButton.isSelected() ? "Male" : "Female";

                registerCustomer(name, email, password, gender);
                JOptionPane.showMessageDialog(null, "Registration successful. Please login to continue.");
                registrationFrame.dispose();
                createCustomerLoginFrame();
            }
        });

        registrationFrame.setVisible(true);
    }

    private static void createCustomerPanel(String uname) {

        JFrame customerPanelFrame = new JFrame("SS MOBILES");
        customerPanelFrame.setSize(400, 300);
        customerPanelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();


        // Fetch mobiles from the stock table
        String[] mobiles = getMobilesFromStock();

        // Create a list to display mobiles
        JList<String> mobileList = new JList<>(mobiles);
        JScrollPane scrollPane = new JScrollPane(mobileList);

        JButton buyButton = new JButton("Buy");
        JButton logout = new JButton("Log Out");

        panel.add(scrollPane);
        panel.add(buyButton);
        panel.add(logout);
        customerPanelFrame.getContentPane().add(panel);

        buyButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                String selectedMobile = mobileList.getSelectedValue();

                if (selectedMobile == null) {
                    JOptionPane.showMessageDialog(null, "Please select a mobile to buy.");
                } else {
                    String username;
                    username = uname;

                    String imei = selectedMobile.split(" - ")[0];
                    String model = selectedMobile.split(" - ")[1];
                    double price = Double.parseDouble(selectedMobile.split(" - ")[2]);

                    String upiNumber = JOptionPane.showInputDialog(null, "Enter UPI number for payment:");

                    if (upiNumber != null) {
                        if (processPayment(username, model, price, upiNumber)) {
                            JOptionPane.showMessageDialog(null, "Payment successful. Mobile purchased.");
                            updateStockQuantity(imei);
                        } else {
                            JOptionPane.showMessageDialog(null, "Payment failed. Please try again.");
                        }
                    }
                }
            }
        });
        logout.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                customerPanelFrame.dispose();
                createHomeFrame();

            }
        });

        customerPanelFrame.setVisible(true);
    }

    private static boolean authenticateAdmin(String username, String password) {
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM admin WHERE username = ? AND password = ?");
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();

            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static boolean authenticateCustomer(String username, String password) {
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM user WHERE email = ? AND password = ?");
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();

            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static void addMobileToStock(String imei, String model, double price, int quantity) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO stock (imei, model, price, quantity) VALUES (?, ?, ?, ?)");
            statement.setString(1, imei);
            statement.setString(2, model);
            statement.setDouble(3, price);
            statement.setInt(4, quantity);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void viewSales() {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM sale");

            StringBuilder saleDetails = new StringBuilder();
            while (resultSet.next()) {
                String user = resultSet.getString("user");
                String model = resultSet.getString("model");
                double amount = resultSet.getDouble("amount");
                String upiNumber = resultSet.getString("upi_number");

                saleDetails.append("USER: ").append(user)
                        .append(", Model: ").append(model)
                        .append(", Amount: ").append(amount)
                        .append(", UPI Number: ").append(upiNumber)
                        .append("\n");
            }

            if (saleDetails.length() > 0) {
                JOptionPane.showMessageDialog(null, saleDetails.toString());
            } else {
                JOptionPane.showMessageDialog(null, "No sales found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void viewStock() {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM stock");

            StringBuilder stockDetails = new StringBuilder();
            while (resultSet.next()) {
                String imei = resultSet.getString("imei");
                String model = resultSet.getString("model");
                double price = resultSet.getDouble("price");
                String quantity = resultSet.getString("quantity");

                stockDetails.append("IMEI: ").append(imei)
                        .append(", Model: ").append(model)
                        .append(", Price: ").append(price)
                        .append(", Quantity: ").append(quantity)
                        .append("\n");
            }

            if (stockDetails.length() > 0) {
                JOptionPane.showMessageDialog(null, stockDetails.toString());
            } else {
                JOptionPane.showMessageDialog(null, "No Stoke found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private static String[] getMobilesFromStock() {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM stock");

            StringBuilder mobiles = new StringBuilder();
            while (resultSet.next()) {
                String imei = resultSet.getString("imei");
                String model = resultSet.getString("model");
                double price = resultSet.getDouble("price");

                mobiles.append(imei).append(" - ").append(model).append(" - ").append(price).append("\n");
            }

            if (mobiles.length() > 0) {
                return mobiles.toString().split("\n");
            } else {
                return new String[]{};
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return new String[]{};
        }
    }

    private static boolean processPayment(String username, String model, double amount, String upiNumber) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO sale (user, model, amount, upi_number) VALUES (?, ?, ?, ?)");
            statement.setString(1, username);
            statement.setString(2, model);
            statement.setDouble(3, amount);
            statement.setString(4, upiNumber);
            statement.executeUpdate();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static void updateStockQuantity(String imei) {
        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE stock SET quantity = quantity - 1 WHERE imei = ?");
            statement.setString(1, imei);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void registerCustomer(String name, String email, String password, String gender) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO user (name, email, password, gender) VALUES (?, ?, ?, ?)");
            statement.setString(1, name);
            statement.setString(2, email);
            statement.setString(3, password);
            statement.setString(4, gender);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
