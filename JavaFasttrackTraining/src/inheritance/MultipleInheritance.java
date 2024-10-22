package inheritance;


	interface a
	{
	void show();//public + abstarct

	}
	interface b
	{
	void show();//public + abstarct
	}

    class MultipleInheritance implements a,b
    {
    	public void show()
    	{
    		System.out.println("interface of a and b");
    	}

	public static void main(String[] args) 
	{
		MultipleInheritance m1=new MultipleInheritance ();
		m1.show();
		
	}
}
