package InterviewQuestion.InterviewQuestion;

public class MutableString {

	public static void main(String[] args) {
		StringBuffer sBuffer=new StringBuffer("string");
		StringBuilder sBuilder=new StringBuilder("string");
		System.out.println(sBuffer.append("Buffer"));//append meanss to add something
		
		System.out.println(sBuilder.append("Builder"));
		//***************************************************
		System.out.println(sBuffer.insert(1,"**"));//s**tringBuffer

		System.out.println(sBuilder.insert(1,"**"));//s**tringBuilder

        //******************************************************************
		System.out.println(sBuffer.replace(2, 5,"@@"));//s*@@ingBuffer

		System.out.println(sBuilder.replace(2, 5,"@@"));//s*@@ingBuilder
		//********************************************************************
		System.out.println(sBuffer.delete(2, 5));//s*ngBuffer
		System.out.println(sBuilder.delete(2, 5));//s*ngBuilder
        //****************************************************
		System.out.println(sBuffer.reverse());//reffuBgn*s
	
		System.out.println(sBuilder.reverse());//	redliuBgn*s
		//**********************************************************
		System.out.println(sBuffer.capacity());
		System.out.println(sBuilder.capacity());



	}

}
