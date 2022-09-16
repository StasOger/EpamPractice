package chapter4_Programming_with_classes;

import java.util.Comparator;

class MyComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        ArrayListSort person1 = (ArrayListSort) o1;
        ArrayListSort person2 = (ArrayListSort) o2;
        if (person1.getAge() < person2.getAge()) {// Установить порядок сортировки здесь
            return 1;
        } else {
            return 0;
        }
    }

}