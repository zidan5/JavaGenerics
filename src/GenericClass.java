public class GenericClass<T> {
    private T variable;

    public void set(T input) {  // Setter
        variable = input;
    }

    public void get() {  // Getter
        System.out.println(variable);
    }

    public static <E> void printArrayContent(E[] inputArray) {
        for (E element : inputArray) {
            System.out.print(element + " ");
        }
    }
        public static void main (String[]Args){

            GenericClass gen = new GenericClass<Integer>(); //Using Integers in Generic class
            gen.set(3);
            gen.get();

            GenericClass gen1 = new GenericClass<String>(); //Using String in Generic class
            gen1.set("Generic class");
            gen1.get();

            Integer[] IntArray = {2, 4, 6, 8, 10};
            String[] stringArray = {"Two", "Four", "Six", "Eight", "Ten"};

            printArrayContent(stringArray); //Printing String elements using printArrayContent method
            System.out.println();
            printArrayContent(IntArray); //Printing integer elements using printArrayContent method

        }
    }

