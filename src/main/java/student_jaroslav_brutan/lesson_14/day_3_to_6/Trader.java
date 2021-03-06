package student_jaroslav_brutan.lesson_14.day_3_to_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Trader {

        private String name;
        private String city;

        public Trader(String name, String city) {
            this.name = name;
            this.city = city;
        }

        public String getName() {
            return this.name;
        }

        public String getCity() {
            return this.city;
        }

        public String toString() {
            return "Trader:"+this.name + " in " + this.city;
        }
}
