package academy.learnprogramming;

public class Main {

	public static void main(String[] args) {
		
		int myMinIntValue = Integer.MAX_VALUE;
		int myMaxIntValue = Integer.MIN_VALUE;
		System.out.println("Integer Minimum Value = " + myMinIntValue);
		System.out.println("Integer Maximum Value = " + myMaxIntValue);
		System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
		System.out.println("Busted MIN value = " + (myMinIntValue -1));
		
		System.out.println("***************");
		
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("Byte Minimum Value = " + myMinByteValue);
		System.out.println("Byte Maximum Value = " + myMaxByteValue);
		
		System.out.println("***************");
		
		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		System.out.println("Short Minimum Value = " + myMinShortValue);
		System.out.println("Short Maximum Value = " + myMaxShortValue);
		
		System.out.println("***************");
		
		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;
		System.out.println("Double Minimum Value = " + myMinDoubleValue);
		System.out.println("Double Maximum Value = " + myMaxDoubleValue);
		
		System.out.println("***************");
		
		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		System.out.println("Long Minimum Value = " + myMinLongValue);
		System.out.println("Long Maximum Value = " + myMaxLongValue);
		
		System.out.println("***************");
		
		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;
		System.out.println("Float Minimum Value = " + myMinFloatValue);
		System.out.println("Float Maximum Value = " + myMaxFloatValue);
		
		System.out.println("***************");
		
		int myTotal = (myMinIntValue / 2);
		
		byte myNewByteValue = (byte) (myMinByteValue / 2);
		
		short myNewShortValue = (short) (myMinShortValue / 2);
		
		int myIntValue = 5 / 2;
		float myFloatValue = 5f / 3f;
		double myDoubleValue = 5d / 3d;
		System.out.println("MyIntValue = " + myIntValue);
		System.out.println("MyFloatValue = " + myFloatValue);
		System.out.println("MyDoubleValue = " + myDoubleValue);
		
		System.out.println("***************");
		
		double numberOfPounds = 200d;
		double convertedKilograms = numberOfPounds * .45359237d;
		System.out.println("Converted kilograms = " + convertedKilograms);
		
				
		
		
		
	}

}
