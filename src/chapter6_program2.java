public class chapter6_program2 {
    public static void main(String[] args) {
        int[] marks = {1, 2, 3, 4, 5, 6};
   /* float [] marks ={233.3f,12.4f,343.45f,34.5f,34.3f};
    String [] students ={"dwew","ref","rer","rwrf","gsw","fw"};
        */
        System.out.print("length of array   ");
        System.out.println(marks.length);


//  display array by for loop
//for(int i=0;i<marks.length;i++){
//    System.out.println(marks[i]);
        //  display array by for loop in reverse oder
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println(marks[i]);
        }
        System.out.println("display array by for-each  loop");
         for (int element : marks ) {
                System.out.print(element);
            }
        }
    }


