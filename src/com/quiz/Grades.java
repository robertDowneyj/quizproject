package com.quiz;

import java.sql.SQLException;

public class Grades {

	public static void getGrades(int count) throws SQLException {
		String grade = null;
		int marks = count;

		if (count >= 8 && count <= 10) {
			grade = "A";

		} else if (count >= 6 && count < 8) {
			grade = "B";

		} else if (count == 5) {
			grade = "C";

		} else {
			grade = "D";

		}
		StoreGrade.storeScoreToDatabase(marks, grade);
	}

}
