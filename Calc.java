
 class Calc {
	 int num1;
	 int num2;
	 int result;
	
	 public Calc()
	 {
		 num1 = 5;
		 num2 = 6;
		  
	 }
	 public Calc(int i) {
		 num1= i;
		 num2=i;
		 
	 }
	public static void main(String[] args) {
		
		Calc obj=new Calc(); // constructor//
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		System.out.println("Hey there!");
		Calc obj1=new Calc(9);
		System.out.println(obj1.num2);
	}

}
