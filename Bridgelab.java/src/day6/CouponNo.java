package day6;

public class CouponNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		{
			char[] chars="HEAmumbaiSDCSDCHSDNWDKXCdelhi kWolkata pune bareilly banglore dubai punjab".toCharArray();
			int max=30000;
			int random=(int) (Math.random()*max);	
			StringBuffer sb=new StringBuffer();
			
			while (random>0)
			{
				sb.append(chars[random % chars.length]);
				random /= chars.length;
			}

			String couponCode=sb.toString();
			System.out.println("Coupon Code: "+couponCode);	
		
	}

	}}
