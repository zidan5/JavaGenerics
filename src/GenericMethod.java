public class GenericMethod {


    public static < E > void printArrayContent( E[] inputArray ) {
        for(E element : inputArray) {
            System.out.print(element+" ");
        }
    }
    public static void main(String[] Args){
        Integer[] IntArray ={2,4,6,8,10};
        String[] stringArray = {"Two","Four","Six","Eight","Ten"};

        GenericMethod.printArrayContent(stringArray);
        System.out.println();
        GenericMethod.printArrayContent(IntArray);

    }
}

