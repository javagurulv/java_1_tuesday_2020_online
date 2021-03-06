package student_igors_bartkevics.lesson_8.homework.level_x.super_task_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Argument extends MathOperation {

	private double argument;

	public Argument(double argument) {
		this.argument = argument;
	}

	@Override
	public double calculate() {
		return argument;
	}
}
