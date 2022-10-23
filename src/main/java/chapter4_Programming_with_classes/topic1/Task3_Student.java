package chapter4_Programming_with_classes.topic1;

//              Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//            из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//            номеров групп студентов, имеющих оценки, равные только 9 или 10.

public class Task3_Student {

        private String lastname;
        private int numberOfGroup;
        private int[] negotiability;

        public Task3_Student(String lastname, int numberOfGroup, int[] negotiability) {
            this.lastname = lastname;
            this.numberOfGroup = numberOfGroup;
            this.negotiability = negotiability;
        }

        private static void printExcellentStudent(Task3_Student [] students){

            for (Task3_Student student : students){
                int minGrade = 10;
                for (int grade : student.negotiability){
                    if (grade<minGrade){
                        minGrade = grade;
                    }
                }
                if (minGrade>=9){
                    System.out.println("Good student is " + student.lastname);
                }
            }
        }

        public static void main(String[] args) {
            Task3_Student [] students = new Task3_Student[8];

            students[0] = new Task3_Student("Price", 15, new int[]{7, 6, 8, 7, 9});
            students[1] = new Task3_Student("MacGregor", 20, new int[]{9, 8, 8, 10, 9});
            students[2] = new Task3_Student("Putin", 15, new int[]{4, 5, 7, 10, 6});
            students[3] = new Task3_Student("Timashuk", 24, new int[]{10, 10, 10, 10, 10});
            students[4] = new Task3_Student("Oher", 20, new int[]{7, 6, 8, 7, 9});
            students[5] = new Task3_Student("Lapchenko Jr.", 24, new int[]{9, 9, 10, 10, 9});
            students[6] = new Task3_Student("Strah", 21, new int[]{9, 9, 8, 10, 9});
            students[7] = new Task3_Student("Todrik", 15, new int[]{10, 9, 9, 10, 9});

            printExcellentStudent(students);
        }
}
