
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;


public class LogInFrame extends JFrame {
    //create panels
    
    private JPanel headingPnl;
    private JPanel userNamePnl;
    private JPanel passwordPnl;
    private JPanel btnsPnl;
    private JPanel mainPanel;
    private JPanel usernamePasswordCombinedPnl;
    
    //labels
    private JLabel headingLbl;
    private JLabel userNameLbl;
    private JLabel passwordLbl;
    
    //textField
    private JTextField usernameTxtFld;
    
    //Jpassword field
    private JPasswordField passwordFld;
    
    //buttons
    private JButton submitBtn;
    private JButton clearBtn;
    private JButton exitBtn;

    public LogInFrame() {
        setTitle("Login page");
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setDefaultLookAndFeelDecorated(true);
        
        //crate panels
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        userNamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        passwordPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        btnsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        usernamePasswordCombinedPnl = new JPanel(new GridLayout(2,1,1,1));
        usernamePasswordCombinedPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE, 2), "Login details"));
        
        mainPanel = new JPanel(new BorderLayout());
        
        //create labels
        headingLbl = new JLabel("Login details");
        headingLbl.setForeground(Color.GREEN);
        headingLbl.setFont(new Font(Font.SANS_SERIF, Font.BOLD + Font.ITALIC , 30));
        headingLbl.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        
        userNameLbl = new JLabel("Username: ");
        passwordLbl = new JLabel("Password: ");
        
        //create fields
        usernameTxtFld = new JTextField(10);
        usernameTxtFld.setFocusable(true);
        
        passwordFld = new JPasswordField(10);
        
        //create buttons
        submitBtn = new JButton("Submit");
        clearBtn = new JButton("Clear");
        exitBtn = new JButton("Exit");
        
        //add components to their panesl
        headingPnl.add(headingLbl);
        
        userNamePnl.add(userNameLbl);
        userNamePnl.add(usernameTxtFld);
        
        passwordPnl.add(passwordLbl);
        passwordPnl.add(passwordFld);
        
        usernamePasswordCombinedPnl.add(userNamePnl);
        usernamePasswordCombinedPnl.add(passwordPnl);
        
        btnsPnl.add(submitBtn);
        btnsPnl.add(clearBtn);
        btnsPnl.add(exitBtn);
        
        mainPanel.add(headingPnl, BorderLayout.NORTH);
        mainPanel.add(usernamePasswordCombinedPnl, BorderLayout.CENTER);
        mainPanel.add(btnsPnl, BorderLayout.SOUTH);
        
        add(mainPanel);
        
        pack();
        setVisible(true);      
        
    }
}
