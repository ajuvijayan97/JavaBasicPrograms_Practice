package oops;

public class EncapPgm {
	
	static class Empl {
		private String empname;
		private String empdesignation;
		
		public String getEmpname() {
			return empname;
		}
		
		public void setEmpname(String empname) {
			this.empname = empname;
		}
		
		public String getEmpdesignation() {
			return empdesignation;
		}
		
		public void setEmpdesignation(String empdesignation) {
			this.empdesignation = empdesignation;
		}
	}

	public static void main(String[] args) {
		Empl obj = new Empl();
		obj.setEmpname("Akhil");
		obj.setEmpdesignation("tester");
		
		System.out.println(obj.getEmpname());
		System.out.println(obj.getEmpdesignation());
	}
}
