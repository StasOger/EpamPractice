package chapter4_Programming_with_classes.topic1;

//          Создйте  класс  Test2 c  двумя  переменными.  Добавьте  конструктор  с  входными  параметрами.  Добавьте
//        конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
//        класса.

public class Task2_Test2 {
        private int a;
        private int b;

        public Task2_Test2(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public Task2_Test2() {
        }

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }
}
