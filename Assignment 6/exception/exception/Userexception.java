package exception;

public class Userexception {
	private String custNo;
	private String custName;
	private String category;
	public Userexception(String custNo, String custName, String category) {
		super();
		this.custNo = custNo;
		this.custName = custName;
		this.category = category;
	}
	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public static void main(String args[])
	{
		int bool=0;
		Userexception obj=new Userexception("one","char","Moldopkkijhcc");
		
		try
		{
			if(obj.category.equals("Gold")||!obj.category.equals("Platinum")||!obj.category.equals("Silver"))
			{
				bool=1;
			}
			if(bool!=1)
			throw new CategorException("error, wrong Category");
			if(obj.custName.charAt(0)!='c')
			{
				throw new Cexception("name doesnot start with c");
			}
			if(obj.custName.length()!=4)
			{
				throw new LengthException("error, Name length not equals 4");
			}
			if(obj.category.equals("Gold")||!obj.category.equals("Platinum")||!obj.category.equals("Silver"))
			{
				bool=1;
			}
			if(bool!=1)
			throw new CategorException("error, wrong Category");
		}
		catch(Cexception e)
		{
			System.out.println(e);
		}
	catch(LengthException p)
	{
		System.out.println(p);
	}
	catch(CategorException q)
	{
		System.out.println(q);
	}	
	}
}



