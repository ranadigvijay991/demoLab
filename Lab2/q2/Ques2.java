class Ques2{

public static void main(String args[]){
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[2]);
	char c = args[1].charAt(0);
	
	if (c == '+'){
		int sum = a+b;
		System.out.println("The sum of "+ a +" and "+b+ " is "+sum);
	}
	else if (c=='X'){
		int mult = a*b;
		System.out.println("The multipication of " +a+" and "+b + " is " +mult);
	}
	else if(c== '/'){
		int div = a/b;
		System.out.println("Division is " + div);
	}
	else if( c== '-'){
		int diff = a - b;
		System.out.println("Subtraction is "+diff);
	}
	else
		System.out.println("ERROR");


}

}