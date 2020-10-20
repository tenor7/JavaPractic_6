package pr6;

public class TestClass {
    static public void test() {
        Student[] iDNumber = new Student[10];
        for (int i = 0; i < 10; i++) {
            iDNumber[i] = new Student(10-i);
        }
        for(int i = 0;i < 10;i++){
            System.out.print(iDNumber[i].getId()+ " ");
        }

        insertionSortImperative(iDNumber);
        System.out.println();
        for(int i = 0;i < 10;i++){
            System.out.print(iDNumber[i].getId()+ " ");
        }
    }

    public static void insertionSortImperative(Student[]input) {
        for (int i = 1; i < input.length; i++) {
            Student key = input[i];
            int j = i - 1;
            while (j >= 0 && input[j].getId()> key.getId()) {
                input[j + 1]= input[j];
                j = j - 1;
            }
            input[j + 1]= key;
        }
    }
}