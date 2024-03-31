public class GPA {

    public static int getGPA(double point) {
        if (point < 0 || point > 10) {
            return -1;
        }

        int gpa;

        if (point >= 0 && point < 4.0) {
            gpa = 0;
        } else if (point >= 4.0 && point < 5.5) {
            gpa = 1;
        } else if (point >= 5.5 && point < 7.0) {
            gpa = 2;
        } else if (point >= 7.0 && point < 8.5) {
            gpa = 3;
        } else {
            gpa = 4;
        }

        return gpa;
    }

}
