// Libraries
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame {
    // Panels
    private JPanel personalInformationPanel;
    private JPanel homePanel;
    private Point initialClick;

    public Login() {
        formatFrame();
    }

    public void formatFrame() {
        // DO NOT TOUCH

        // Components

        // Panels
        JPanel titleBar = new JPanel();
        JPanel navigationPanel = new JPanel();
        JPanel home = new JPanel();
        homePanel = new JPanel();
        JPanel personalInformation = new JPanel();
        JPanel educationalBackground = new JPanel();
        JPanel employmentHistory = new JPanel();
        personalInformationPanel = new JPanel();

        // Labels
        JLabel x = new JLabel("=");
        JLabel txtHome = new JLabel("Home");
        JLabel txtPersonalInformation = new JLabel("Personal Information");
        JLabel txtEducationalBackground = new JLabel("Educational Background");
        JLabel txtEmploymentHistory = new JLabel("Employment History");

        // Buttons
        JButton btnHome = new JButton("Home");

        // Main format
        setSize(1280, 720);
        setLayout(null);
        setUndecorated(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Configurations
        titleBar.setLayout(null);
        homePanel.setLayout(null);
        personalInformationPanel.setLayout(null);
        navigationPanel.setLayout(null);
        personalInformation.setLayout(null);
        titleBar.setBackground(Color.white);
        navigationPanel.setBackground(new Color(52, 73, 94));
        home.setBackground(Color.white);
        x.setForeground(Color.BLACK);
        txtHome.setForeground(Color.blue);
        homePanel.setBackground(new Color(189, 195, 199));
        personalInformationPanel.setBackground(Color.blue);
        txtPersonalInformation.setForeground(Color.blue);
        educationalBackground.setBackground(Color.white);
        txtEducationalBackground.setForeground(Color.blue);
        employmentHistory.setBackground(Color.white);
        txtEmploymentHistory.setForeground(Color.blue);

        // Placements
        navigationPanel.setBounds(0, 0, 180, 720);
        titleBar.setBounds(0, 0, 1280, 60);
        x.setBounds(-1100, 0, 400, 40);
        txtHome.setBounds(60, 0, 160, 40);
        home.setBounds(10, 130, 160, 40);
        homePanel.setBounds(180, 60, 1100, 660); // Adjusted bounds
        personalInformationPanel.setBounds(180, 60, 1100, 660); // Adjusted bounds
        personalInformation.setBounds(10, 200, 160, 40);
        txtPersonalInformation.setBounds(25, 0, 160, 40);
        educationalBackground.setBounds(10, 270, 160, 40);
        txtEducationalBackground.setBounds(12, 0, 160, 40);
        employmentHistory.setBounds(10, 340, 160, 40);
        txtEmploymentHistory.setBounds(22, 0, 160, 40);

        setVisible(true);
        homePanel.setVisible(true);
        personalInformationPanel.setVisible(false); // Ensure personalInformationPanel is hidden initially

        // Adding components

        // Title bar
        add(titleBar);
        titleBar.add(x);

        // Navigation panel
        add(home);
        home.add(txtHome);
        add(navigationPanel);
        navigationPanel.add(personalInformation);
        personalInformation.add(txtPersonalInformation);
        navigationPanel.add(educationalBackground);
        educationalBackground.add(txtEducationalBackground);
        navigationPanel.add(employmentHistory);
        employmentHistory.add(txtEmploymentHistory);
        add(personalInformationPanel);
        add(homePanel);

        // Add mouse listeners for switching panels
        txtPersonalInformation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPersonalInformationPanel();
            }
        });

        personalInformation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPersonalInformationPanel();
            }
        });

        txtHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showHomePanel();
            }
        });

        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showHomePanel();
            }
        });

        // Add mouse listener for dragging the frame
        titleBar.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                initialClick = e.getPoint();
                getComponentAt(initialClick);
            }
        });

        titleBar.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                // Get the current location of the window
                int thisX = getLocation().x;
                int thisY = getLocation().y;

                // Determine how much the mouse moved since the initial click
                int xMoved = e.getX() - initialClick.x;
                int yMoved = e.getY() - initialClick.y;

                // Move the window to this position
                int X = thisX + xMoved;
                int Y = thisY + yMoved;
                setLocation(X, Y);
            }
        });
    }

    private void showPersonalInformationPanel() {
        homePanel.setVisible(false);
        personalInformationPanel.setVisible(true);
    }

    private void showHomePanel() {
        personalInformationPanel.setVisible(false);
        homePanel.setVisible(true);
    }

    
}



