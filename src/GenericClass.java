public class GenericClass<T> {
        private T variable;

        public void set(T input){  // Setter
            variable = input;
        }
        public void get(){  // Getter
            System.out.println(variable);
        }

    public static void main(String[] Args){

            GenericClass gen = new GenericClass<Integer>(); //Using Integers in Generic class
            gen.set(3);
            gen.get();

            GenericClass gen1 =new GenericClass<String>(); //Using String in Generic class
            gen1.set("Generic class");
            gen1.get();
        
    }
}
