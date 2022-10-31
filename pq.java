import java.io.*;
import java.util.*;
public class Main{
  public static void main(String[]args){
      PriorityQueue<Integer>pq = new PriorityQueue<>();
      int[]ranks = {10,35,89,9,0};
       
      for(int val:ranks){
          pq.add(val);
      }
       
      while(pq.size()>0){
          System.out.println(pq.peek());
          pq.remove();
      }
       
       
  }
    
}


import java.io.*;
import java.util.*;
public class Main{
  public static void main(String[]args){
      PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
      int[]ranks = {10,35,89,9,0};
       
      for(int val:ranks){
          pq.add(val);
      }
       
      while(pq.size()>0){
          System.out.println(pq.peek());
          pq.remove();
      }
       
       
  }
    
}

