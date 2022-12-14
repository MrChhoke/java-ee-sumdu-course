package ua.bondar.controller;

import ua.bondar.model.dto.JsonSaver;
import ua.bondar.model.entity.Race;
import ua.bondar.model.entity.Stats;
import ua.bondar.model.service.Memento;
import ua.bondar.model.service.Repo;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.util.*;
import java.util.List;

public class MainControllerGUI extends JFrame {

    private JPanel components;
    private JLabel labelName;
    private JTextField fieldName;
    private JLabel raceLabel;
    private JButton generateButton;
    private JComboBox races;
    private JTable stats;

    private Repo repo;

    public MainControllerGUI(String title) throws HeadlessException {
        super(title);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(components);
        pack();

        repo = new Repo();

        // ADDING RACES TO COMBOBOX
        for (Race race : Race.values()) {
            races.addItem(race.name());
        }

        stats.setModel(
                new DefaultTableModel(
                        new Object[][]{},
                        new Object[]{"strength", "dexterity", "constitution", "intelligence", "wisdom", "charisma"}
                )
        );

        DefaultTableModel model = (DefaultTableModel) this.stats.getModel();

        generateButton.addActionListener(actionEvent -> {
            if (fieldName.getText().isEmpty()) {
                JOptionPane.showMessageDialog(
                        this,
                        "Name cannot be empty",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
                return;
            }

            if (model.getRowCount() < 6) {
                Stats stats = Stats.generate();
                repo.addSave(stats.save());
                Map<String, Integer> values = stats.getValues();

                JTableHeader tableHeader = this.stats.getTableHeader();
                TableColumnModel columnModel = tableHeader.getColumnModel();
                List<Integer> params = new ArrayList<>(6);

                for (int i = 0; i < columnModel.getColumnCount(); i++) {
                    Integer valueParam = values.get(columnModel.getColumn(i).getHeaderValue());
                    params.add(valueParam);
                }

                model.addRow(params.toArray());

                if (model.getRowCount() == 6) {
                    fieldName.setEditable(false);
                    races.setEnabled(false);
                    generateButton.setText("Show character");
                }
                return;
            }

            Map<String, Integer> mapStats = new TreeMap<>();

            repo.getSaves().stream()
                    .sorted((o1, o2) -> Integer.compare(o2.sumAllStats(), o1.sumAllStats()))
                    .limit(3)
                    .map(Memento::getSavedStats)
                    .forEach(stats1 -> {
                        Map<String, Integer> values = stats1.getValues();

                        for (var entry : values.entrySet()) {
                            Integer integer = mapStats.get(entry.getKey()) == null ?
                                    mapStats.put(entry.getKey(), entry.getValue()) :
                                    mapStats.put(entry.getKey(), mapStats.get(entry.getKey()) + entry.getValue());
                        }
                    });

            StringBuilder sb = new StringBuilder(100);
            for (var entry : mapStats.entrySet()) {
                sb.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
            }

            JOptionPane.showMessageDialog(
                    this,
                    "Name: " + fieldName.getText() + "\n" +
                            "Race: " + races.getSelectedItem() + "\n" +
                            "Character info: \n" + sb,
                    "Character info",
                    JOptionPane.INFORMATION_MESSAGE
            );

            Map<String, Object> json = new LinkedHashMap<>();

            json.put("Name", fieldName.getText());
            json.put("Race", Objects.requireNonNull(races.getSelectedItem()).toString());
            json.put("stats:", mapStats);

            JFileChooser f = new JFileChooser();
            f.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            f.showSaveDialog(null);
            new JsonSaver().write(f.getSelectedFile() + "\\test.json", json);
        });
    }

    public static void main(String[] args) {
        MainControllerGUI mainControllerGUI = new MainControllerGUI("Lab-8 Vladyslav Bondar");
        mainControllerGUI.setVisible(true);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        components = new JPanel();
        components.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(4, 2, new Insets(0, 0, 0, 0), -1, -1));
        labelName = new JLabel();
        labelName.setText("Name: ");
        components.add(labelName, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        fieldName = new JTextField();
        components.add(fieldName, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        raceLabel = new JLabel();
        raceLabel.setText("Race");
        components.add(raceLabel, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        races = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        races.setModel(defaultComboBoxModel1);
        components.add(races, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JScrollPane scrollPane1 = new JScrollPane();
        components.add(scrollPane1, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        stats = new JTable();
        scrollPane1.setViewportView(stats);
        generateButton = new JButton();
        generateButton.setText("Generate");
        components.add(generateButton, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return components;
    }
}
