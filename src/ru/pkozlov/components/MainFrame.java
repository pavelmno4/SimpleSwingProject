package ru.pkozlov.components;

import ru.pkozlov.fakePhone.FakePhoneGenerator;

import javax.swing.*;
import java.awt.*;

public class MainFrame {

    public MainFrame() {
        FakePhoneGenerator fPG = FakePhoneGenerator.generateThread("Generator");
        fPG.addFakePhone("445533", "Nina", "112233");

        JFrame frame = new JFrame("Arm02");
        frame.setLayout((new BorderLayout()));
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Verdana", Font.PLAIN, 12);

        JMenuBar menuBar = new JMenuBar();

        JMenu createCall = new JMenu("Создать звонок");
        createCall.setLayout(new FlowLayout());
        createCall.setFont(font);

        JLabel phoneNumberLabel = new JLabel("phoneNumber: ");
        phoneNumberLabel.setFont(font);

        JLabel phoneNameLabel = new JLabel("phoneName: ");
        phoneNameLabel.setFont(font);

        JLabel phoneDataLabel = new JLabel("phoneData: ");
        phoneDataLabel.setFont(font);

        JTextField phoneNumberField = new JTextField(10);
        JTextField phoneNameField = new JTextField(10);
        JTextField phoneDataField = new JTextField(10);

        JButton createCallBtn = new JButton("Позвонить");

        createCallBtn.addActionListener(ae -> {
            fPG.addFakePhone(phoneNumberField.getText(),
                    phoneNameField.getText(),
                    phoneDataField.getText()
            );
            fPG.thrd.start();
        });

        createCall.add(phoneNumberLabel);
        createCall.add(phoneNumberField);
        createCall.add(phoneNameLabel);
        createCall.add(phoneNameField);
        createCall.add(phoneDataLabel);
        createCall.add(phoneDataField);
        createCall.add(createCallBtn);

        menuBar.add(createCall);
        frame.add(menuBar, BorderLayout.PAGE_START);

        frame.setVisible(true);
    }
}
