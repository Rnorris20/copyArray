class Main {
  public static void main(String[] args) {
// establishing a string statement when we do not know the variables.
    String[] roster2 = new String[10];
// establishing a string array where we know the variables.
    String[] roster1 = {"Ryan","George","James","Matthew","William","Marco","Lauren","Sam","Rob","Joe","James"};
    //added a for loop in order to print out the values of the first string into the second String

   

     for (int i = 0; i < 10; i++){
       //copied over the variables from the first roster to second one
     roster2[i] = roster1[i];
      //created a print statement to print out the value.
      System.out.println("The new element that has been added to roster 2 from roster 1 is " + roster1[i]);
     }
  }
}
//Paragraph reflection below
//In order to fix the output on this code, i first fixed the original value of teh arrays by putting them both to string arrays and making sure that one of the arrays have values yet to be determined. Then i created a for loop which will scan through all of the code, next i created a statement to copy over each of the variables from roster1 to roster2. Finally i created a print statement which will display all of the variables in each array and copy it from one to another.

