public class GenericClass<T> {
        private T variable;

        public void set(T input){  // Setter
            variable = input;
        }
        public T get(){  // Getter
            return variable;
        }

    public static void main(String[] Args){

            GenericClass gen = new GenericClass<Integer>(); //Using Integers in Generic class
            gen.set(3);
            int intValue = (int)gen.get();
            System.out.println(intValue);

            GenericClass gen1 =new GenericClass<String>(); //Using String in Generic class
            gen1.set("Generic class");
            String stringValue = gen1.get().toString();
            System.out.println(stringValue);
    }
}
