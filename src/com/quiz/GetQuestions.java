package com.quiz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class GetQuestions {

	public static void getQuestions() throws SQLException {
		HashMap<String, String> storeQA = new HashMap();
		Scanner scanner = new Scanner(System.in);
		HashMap<String, ArrayList<String>> map = QuestionAnswer.setQuestionAnswers();

		ArrayList<String> al = new ArrayList<String>();
		// here we added keys of the HashMap for shuffle
		Set<String> s = map.keySet();
		for (String s1 : s) {
			al.add(s1);
		}

		Collections.shuffle(al);

		// Traversing Questions
		for (String s2 : al) {
			for (String s3 : s) {
				if (s2.equals(s3)) {
					int i = 0;
					while (i >= 0) {
						System.out.println("Question >> " + s3);
//					System.out.println("Options >> " +map.get(s3));
						System.out.println("Options>>");
						for (String s4 : map.get(s3)) {
							System.out.println(s4);
						}

						System.out.println("Enter Correct Option : ");

						String ans = scanner.next();

						if (ans.equalsIgnoreCase("A") || ans.equalsIgnoreCase("B") || ans.equalsIgnoreCase("C")
								|| ans.equalsIgnoreCase("D")) {
							storeQA.put(s3, ans);
							break;
						} else {
							System.out.println("Incorrect Input!!");
							i++;
						}
					}
				}
			}
		}

		int count = StoreInput.checkAns(storeQA);
		Grades.getGrades(count);
	}

}
