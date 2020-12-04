class Main {
  public static void main(String[] args) {

    String[] roster2 = new String[10];

    String[] roster1 = {"Ryan","George","James","Matthew","William","Marco","Lauren","Sam","Rob","Joe","James"};
    
    
    roster1[0] = 10;
    roster1[1] = roster2[1];
    System.out.println(roster1[0]);
    System.out.println(roster1[1]);
  
   for (int i = 0; i <= roster1.length; i++)
     
      for(int index = 2; index < roster1.length; index++){
      //copying over roster2 into roster1
      roster1[index] = roster2[index];
      //print out roster1
      System.out.println("roster1 =" + roster1[index]);
      }
     

  }
}

int sum;
    sum = 3;