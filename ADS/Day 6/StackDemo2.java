
class Stack{
	static final int MAX = 7;
	int top;
	int a[] = new int[MAX];
	
	Stack(){
		top = -1;
	}
	
	boolean isEmpty(){
		return top < 0;
	}
	
	boolean isFull(){
		return top > MAX-1;
	}
	
	boolean push(int x){
		if(top >= (MAX-1)){
			System.out.println("Stack Overflow!!!");
			return false;
			
		}
		else{
			a[++top] = x;
			System.out.println(x+"Element pushed!");
			return true;
		
		}
	
	}
	
	int pop(){
		if(top < 0){
			System.out.println("Stack underflow");
			return 0;
		}
		else{
			
			int x = a[top--];
			return x;
			
		}
		
	}
	
	int peek(){
		if(top < 0){
			System.out.println("Stack underflow");
			return 0;
		}
		else{
			int x = a[top];
			return x;
		}
	}
	
	
}

class StackDemo11{
	public static void reverse(StringBuffer str)
	{
		int n=str.length();
		Stack s1 = new Stack(n);
		
		int i;
		for(i=0;i<n;i++)
			s1.push(str.charAt(i));
		
		for(i=0;i<n;i++)
		{
			char ch =(char)s1.pop();
			str.setCharAt(i,ch);
		}
	}

	public static void main(String[] args) {
	StringBuffer s = new StringBuffer("CDAC MUMBAI");
	reverse(s);
	System.out.println("Reverse string is "+s);

	}
		
	
}