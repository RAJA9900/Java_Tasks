package july_29;

public class OddEven_string {

	public static void main(String[] args) {
		
		String s="hi hello everbody we using now this task for checking odd length and even length string if odd length print middle letter caps else even letter first letter caps";
		System.out.println(convertToTitleCase(s));

	}
	
	public static String convertToTitleCase(String s) {
		String ar[]=s.split(" ");
		StringBuilder sb=new StringBuilder();
		for (int w = 0; w < ar.length; w++) {
			if(ar[w].length()%2!=0)
			{
				int k= ar[w].length()/2;
				//System.out.println("odd character");
				sb.append(ar[w].substring(0,k)).append(Character.toUpperCase(ar[w].charAt(k))).append(ar[w].substring(k+1)).append(" ");
				
			}
			else
			{
			sb.append(Character.toUpperCase(ar[w].charAt(0))).append(ar[w].substring(1)).append(" ");
		}
		}
		
		return sb.toString().trim();
	}
}
