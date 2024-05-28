public class generics {
    public static void main(String args[]){
        /*generics = enables types (classes and interfaces) to be parameters when defining:
         *           classes, interfaces and methods
         *           a benefit is to eliminate the need to create multiple versions 
         *           of methods or classes for various data types.
         *           use 1 version for all reference data types.
        */

        Integer[] inArray = {1, 2, 3, 4, 5};
        Double[] dArray = {1.1, 2.2, 3.3};
        Character[] charArray = {'H', 'E', 'L','L'};
        String[] stringArray = {"Hello", "World"};


        // displayArray(dArray);
        // displayArray(inArray);
        // displayArray(charArray);
        // displayArray(stringArray);

        System.out.println(getFirst(inArray));
        System.out.println(getFirst(dArray));
        System.out.println(getFirst(charArray));
        System.out.println(getFirst(stringArray));
    }
    // public static <Thing> void displayArray(Thing[] array) {
    //     for(Thing x : array){
    //         System.out.println(x+" ");
    //     }
    //     System.out.println();
    // }

    public static <T> T getFirst(T[] array){
        return array[0];
        }
    }

