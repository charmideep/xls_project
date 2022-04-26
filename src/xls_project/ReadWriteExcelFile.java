package xls_project;

public class ReadWriteExcelFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Xls_Reader d=new Xls_Reader("C:\\Testing\\NikulTest.xlsx");
		System.out.println(d.getCellData("Data1", "UserName", 2));
		String s=d.getCellData("Data1", 0, 2);
		System.out.println(s);
		
		System.out.println(d.getRowCount("Data1"));
		System.out.println(d.getColumnCount("Data1"));
		
	//	d.setCellData("Data1", "Name", 13, "charmi");
		
		d.addColumn("Data1", "charmi");
	}

}
 