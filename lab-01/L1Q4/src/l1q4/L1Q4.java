/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l1q4;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author samue
 */
public class L1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       


   

        JFrame frame = new JFrame("Monthly Sales 2016");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new BarChart());

        frame.setSize(850, 550);

        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}

class BarChart extends JPanel {

    String[] months = {
        "January", "February", "March",
        "April", "May", "June"
    };

    int[] sales = {
        2500, 1600, 2000, 2700, 3200, 800
    };

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON
        );

        int width = getWidth();
        int height = getHeight();

        // Chart title
        g2.setFont(new Font("Arial", Font.BOLD, 24));
        g2.drawString("Monthly Sales 2016", 300, 40);

        // Chart dimensions
        int left = 90;
        int bottom = height - 100;
        int chartHeight = 350;

        // Draw Y-axis and X-axis
        g2.drawLine(left, bottom - chartHeight,
                    left, bottom);

        g2.drawLine(left, bottom,
                    width - 40, bottom);

        // Draw horizontal grid lines and values
        g2.setFont(new Font("Arial", Font.PLAIN, 12));

        for (int value = 0; value <= 3500; value += 500) {

            int y = bottom - (value * chartHeight / 3500);

            g2.setColor(Color.LIGHT_GRAY);
            g2.drawLine(left, y, width - 40, y);

            g2.setColor(Color.BLACK);
            g2.drawString(String.valueOf(value), 45, y + 5);
        }

        // Draw bars
        int barWidth = 65;
        int gap = 35;

        for (int i = 0; i < sales.length; i++) {

            int barHeight = sales[i] * chartHeight / 3500;

            int x = left + 35 + i * (barWidth + gap);
            int y = bottom - barHeight;

            g2.setColor(new Color(70, 130, 180));

            g2.fillRect(x, y, barWidth, barHeight);

            // Display sales value
            g2.setColor(Color.BLACK);
            g2.drawString(
                String.valueOf(sales[i]),
                x + 15,
                y - 8
            );

            // Display month
            g2.drawString(
                months[i],
                x - 5,
                bottom + 25
            );
        }
    }
}

    
    
