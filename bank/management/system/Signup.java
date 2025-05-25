package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JRadioButton r1,r2,r3,m1,m2;
    JButton next;

    JTextField textName , textFName,textEmail,textAddress,textCity,textPin,textState;
    JDateChooser dateChooser;

    Random ran = new Random();
    long first4 =(ran.nextLong() %9000L) +1000L;
    String first = " " + Math.abs(first4);


    Signup(){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/detail.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(20,10,100,100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO:" + first);
        label1.setBounds(185,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,30));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Ralway",Font.BOLD,14));
        label2.setBounds(775,730,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(300,80,600,30);
        add(label3);

        JLabel labelName = new JLabel("NAME :");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel labelFName = new JLabel("FATHER'S NAME :");
        labelFName.setFont(new Font("Raleway",Font.BOLD,20));
        labelFName.setBounds(100,240,200,30);
        add(labelFName);

        textFName = new JTextField();
        textFName.setFont(new Font("Raleway",Font.BOLD,14));
        textFName.setBounds(300,240,400,30);
        add(textFName);

        JLabel birth = new JLabel("Date Of Birth :");
        birth.setFont(new Font("Raleway",Font.BOLD,20));
        birth.setBounds(100,340,200,30);
        add(birth);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender :");
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        labelG.setBounds(100,290,200,30);
        add(labelG);

       r1 = new JRadioButton("Male");
       r1.setFont(new Font("Raleway",Font.BOLD,14));
       r1.setBackground(new Color(212,207,208));
       r1.setBounds(300,290,60,30);
       add(r1);

       r2 = new JRadioButton("Female");
       r2.setFont(new Font("Raleway",Font.BOLD,14));
       r2.setBackground(new Color(212,207,208));
       r2.setBounds(450,290,90,30);
       add(r2);

        r3 = new JRadioButton("Others");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(new Color(212,207,208));
        r3.setBounds(600,290,90,30);
        add(r3);

       ButtonGroup buttonGroup = new ButtonGroup();
       buttonGroup.add(r1);
       buttonGroup.add(r2);
       buttonGroup.add(r3);

       JLabel labelemail = new JLabel("E-mail address");
       labelemail.setFont(new Font("Raleway",Font.BOLD,20));
       labelemail.setBounds(100,390,200,30);
       add(labelemail);

       textEmail = new JTextField();
       textEmail.setFont(new Font("Raleway",Font.BOLD,14));
       textEmail.setBounds(300,390,400,30);
       add(textEmail);

       JLabel labelM = new JLabel("Marital Status :");
       labelM.setFont(new Font("Raleway",Font.BOLD,20));
       labelM.setBounds(100,440,200,30);
       add(labelM);


        m1 = new JRadioButton("Married");
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBackground(new Color(212,207,208));
        m1.setBounds(300,440,150,30);
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBackground(new Color(212,207,208));
        m2.setBounds(450,440,150,30);
        add(m2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);


        JLabel labeladdress = new JLabel("Address :");
        labeladdress.setFont(new Font("Raleway",Font.BOLD,20));
        labeladdress.setBounds(100,490,100,30);
        add(labeladdress);

        textAddress = new JTextField();
        textAddress.setFont(new Font("Raleway",Font.BOLD,14));
        textAddress.setBounds(300,490,530,30);
        add(textAddress);



        JLabel labelcity = new JLabel("City :");
        labelcity.setFont(new Font("Raleway",Font.BOLD,20));
        labelcity.setBounds(100,540,100,30);
        add(labelcity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,14));
        textCity.setBounds(300,540,400,30);
        add(textCity);

        JLabel labelpin = new JLabel("Pin Code :");
        labelpin.setFont(new Font("Raleway",Font.BOLD,20));
        labelpin.setBounds(100,590,100,30);
        add(labelpin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD,14));
        textPin.setBounds(300,590,200,30);
        add(textPin);

        JLabel labelstate = new JLabel("State :");
        labelstate.setFont(new Font("Raleway",Font.BOLD,20));
        labelstate.setBounds(100,640,100,30);
        add(labelstate);

        textState = new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD,14));
        textState.setBounds(300,640,300,30);
        add(textState);



        next = new JButton("Next >>>");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(620,710,100,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(212,207,208));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textName.getText();
        String fname = textFName.getText();
        String birth = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }else if (r2.isSelected()){
            gender = "Female";
        }
        String email = textEmail.getText();
        String marital = null;
        if (m1.isSelected()){
            marital = "Married";
        }else if (m2.isSelected()){
            marital = "Unmarried";
        }
        String address = textAddress.getText();
        String city = textCity.getText();
        String pin = textPin.getText();
        String state = textState.getText();

        try{
            if (textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the Fields");
            }
            else{
                Con con1 = new Con();
                String q = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+birth+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pin+"', '"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args){
        new Signup();
    }
}
