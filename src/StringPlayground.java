// Written By: Austin Barnett
// Date: 3/27/2024
// Version 1.0

import java.awt.Point;
import java.awt.Rectangle;

public class StringPlayground {
    public static int countParentheses(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') { count++; }
            else if (c == ')') { count--; }
        }
        return count;
    }

    public static void printPoint(Point p) {
        System.out.println("(" + p.x + ", " + p.y + ")");
    }

    public static Point findCenter(Rectangle box) {
        int x = box.x + box.width / 2;
        int y = box.y + box.height / 2;
        return new Point(x, y);
    }

    public static void main(String[] args) {

        String s = "((3 + 7) * 2)";
        System.out.println("Count of parentheses: " + countParentheses(s));


        Rectangle box1 = new Rectangle(2, 4, 7, 9);
        Point p1 = findCenter(box1);
        printPoint(p1);
        box1.grow(1, 1);
        Point p2 = findCenter(box1);
        printPoint(p2);
    }
}
