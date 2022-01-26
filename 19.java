class Divisible7{
	public static void main(String arg[]){
		int first=0,last=0,diff=7,n=0,sum=0;
		//finding first no divisible by 7
		for(int i=100;i<200;i++){
			if(i%7==0){
				first=i;
				break;
			}
		}
		//Finding Last no divisible by 7
		for(int i=200;i>100;i--){
			if(i%7==0){
				last=i;
				break;
			}
		}
		//no of digits between 100 & 200 divisible by 7
		n = (last - first)/diff + 1;
		
		//Sum of Numbers 
		sum = (n/2)*(2*first + (n-1)*diff);
		System.out.println(sum);
	}
}