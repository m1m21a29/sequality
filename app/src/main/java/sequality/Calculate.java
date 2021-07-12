package sequality;
public class Calculate {
public int sum(int x, int y) {
  System.out.println("Sum of "+x+" and "+y+" is "+(x+y)+".");
return x + y;
//return 0;
}
public double ave(double x, double y) {
  System.out.println("Average is "+(x+y)/2+".");
return (x + y)/2;
//return 0;
}

public int sumave(int x, int y) {
  System.out.print("Sum of "+x+" and "+y+" is "+(x+y)+".");
  System.out.println("Average is "+(double)(x+y)/2+".");
//return (x + y)/2;
return 0;
}

public int sumall(int x, int y) {
  int sumA=0;
  int count=0;

  for(int i=x;i<=y;i++){
    sumA+=i;
    count++;
  }
  System.out.print("Sum of "+x+" to "+y+" is "+sumA+".");
  System.out.println("Average is "+(double)sumA/count+".");
return sumA;
//return 0;
}

public int oddeven(int x, int y) {
  int sumodd=0;
  int sumeven=0;

  for(int i=x;i<=y;i++){
    if(i%2==0){
      sumeven+=i;
    }else if(i%2!=0){
      sumodd+=i;
    }
  }
  System.out.print("Sum of odd of "+x+" to "+y+" is "+sumodd+".");
  System.out.println("Sum of even is "+sumeven+".");
return sumodd;
}

}
