package Tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// QUESTION NUM : 3

class SplitGroups {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of students : ");
        int noOfStudents = scanner.nextInt();
        System.out.println("Enter number of Groups to divide : ");
        int numberOfGroups = scanner.nextInt();
        System.out.println("Enter start roll number : ");
        int startRollNum = scanner.nextInt();

        Map<Integer, List<Integer>> groups = new HashMap<>();
        for (int i = 1; i <= numberOfGroups; i++) {
            groups.put(i, new ArrayList<>()); 
        }

        for (int rollNo=startRollNum; rollNo < startRollNum + noOfStudents;rollNo++) {
            int groupNo = ((rollNo - startRollNum) % numberOfGroups) + 1;
            groups.get(groupNo).add(rollNo);
        }

        for (int groupNo : groups.keySet()) {
            System.out.println("Group " + groupNo + ": " + groups.get(groupNo));
        }
        scanner.close();
    }
}