package edu.csbsju.cs;

public class SimplePrint {
	private String pName;
	private String pAge;
	/**
	 * @return the pName
	 */
	public String getpName() {
		return pName;
	}

	/**
	 * @param pName the pName to set
	 */
	public void setpName(String pName) {
		this.pName = pName;
	}

	/**
	 * @return the pAge
	 */
	public String getpAge() {
		return pAge;
	}

	/**
	 * @param pAge the pAge to set
	 */
	public void setpAge(String pAge) {
		this.pAge = pAge;
	}

	public SimplePrint() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param pName
	 * @param pAge
	 */
	public SimplePrint(String pName, String pAge) {
		super();
		this.pName = pName;
		this.pAge = pAge;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sara, Ian, Karld");
		for(int i=0; i<args.length;i++){
			System.out.println("args[ " + i + " ] = " + args[i] );
			}
	}

}
