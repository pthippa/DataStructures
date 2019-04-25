
public class RecursionReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Please reverse this statement";
		char[] nameArr = name.toCharArray();
		reverse(nameArr, 0, nameArr.length-1);
		System.out.println(nameArr);
	}
	
	public static void reverse(char[] nameArr, int start, int end) {
		if (start >= end)
			return;
		else {
			char temp = nameArr[start];
			nameArr[start] = nameArr[end];
			nameArr[end] = temp;
			start++;
			end--;
			reverse(nameArr, start, end);
		}
	}

}
