import java.lang.String;
class StringLibrary
{
	public static void main(String args[])
	{
		int i;
		String f="";
		char[] ch={'H','e','L','l','O'};
		String obj=new String(ch);
		System.out.println(obj);
		String obj1=obj.toUpperCase();
		System.out.println(obj1);
		String obj2=obj.toLowerCase();
		System.out.println(obj2);
		System.out.println(obj.length());
		System.out.println(obj.isEmpty());
		System.out.println(f.isEmpty());
	char[] aa= obj.toCharArray();
		for(i=0; i<aa.length; i++)
{
	System.out.println(aa[i] + " ");
}
	}
}