public class MergeSort {
   private static void array(int[] array){
       for(int i: array){
           System.out.println(i+ " ");
       }
       System.out.println();
   }

   private static int[] mergeSort(int[] array){
       if(array.length <= 1){
           return array;
       }
       int med = array.length/2;
       int[] izq = new int[med];
       int[] der;

       if (array.length % 2 == 0){
           der = new int[med];
       }else{
           der = new int[med + 1];
       }

       for (int i = 0; i < med; i++) {
           izq[i]=array[i];

       }
       for (int j = 0; j < der.length; j++) {
           der[j]=array[med+j];
       }
       int[] result = new int[array.length];

       izq = mergeSort(izq);
       der = mergeSort(der);

       result = merge(izq, der);
   }

}
