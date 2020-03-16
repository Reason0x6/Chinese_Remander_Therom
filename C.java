import java.util.*;
import java.lang.*; 

class C{
  private int n, a;

  private LinkedList<Integer> fact = new LinkedList<Integer>();
  
  private LinkedList<Integer> xs = new LinkedList<Integer>();
  
  private LinkedList<Integer> ys = new LinkedList<Integer>();
  C(int n ,int a){

  
      this.n = n;
      this.a = a;
      
    System.out.println("----------");
      prime(n);
      condence();
      solveX(a, n);
      solveY(a,n);
      cTheroy(a,n);
  }

  public void prime( int number ){

    for(int i = 2; i< number; i++) {
         while(number%i == 0) {
            System.out.println("Prime Factor: " +i+ " ");
            fact.add(i);
            number = number/i;
         }
      }
      if(number >2) {
        System.out.println("Prime Factor: " +number+ " ");
            fact.add(number);
      }
  }

  public void condence(){

    int[][] seen = new int[100000][2];
   
        for(int i = 0; i < fact.size(); i++){
          if (Arrays.asList(fact.get(i)).contains(fact.get(i))){
            seen[fact.get(i)][0] += 1;
          }else{
            seen[fact.get(i)][0] = 1;
          }
        }

        fact.clear();

        for(int i = 0; i < 100000; i++){
          if(seen[i][0] != 0){
            int adds = (int)Math.pow(i, seen[i][0]);
           
            fact.add(adds);
          }
        }
    System.out.println("----------");
      
  }

  public void solveX( int a, int n){
        System.out.println(fact.get(0));
        for(int i = 0; i < fact.size(); i++){
            int x = 1;
            while( a * x % fact.get(i) != 1){
              if( a * x % fact.get(i) == 0 ){
                break;
              }
              x++;
            }
            System.out.println("x" + i + " = " + x);
            xs.add(x);
        }

  }

   public void solveY( int a, int n){

        for(int i = 0; i < fact.size(); i++){
            int y = 1;
            int t = (n/fact.get(i));

            while(  t * y % fact.get(i) != 1){
              if( t * y % fact.get(i) == 0 ){
                break;
              }
              y++;
            }

            System.out.println("y" + i + " = " + y);
            ys.add(y);
        }
         System.out.println("----------");

  }

  public void cTheroy( int a, int n){

      int tot = 0;

        for(int i = 0; i < fact.size(); i++){
           
           tot += (n/ fact.get(i) ) * xs.get(i) * ys.get(i);
           
        }

         System.out.println(" x = " + tot % n);

       

  }



}
