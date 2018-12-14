package keyworddrivenframework;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;


import jxl.Sheet;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Myrunner {

	public static void main(String[] args) throws Exception, Exception 
	{

		File f=new File("w2sms.xls");
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh1=rwb.getSheet(0);
		int nour1=rsh1.getRows();
		int nouc1=rsh1.getColumns();
		Sheet rsh2=rwb.getSheet(1);
		int nour2=rsh2.getRows();
		int nouc2=rsh2.getColumns();
		//writing
		WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
		WritableSheet wsh1=wwb.getSheet(0);
		WritableSheet wsh2=wwb.getSheet(1);
		WritableCellFormat cf=new WritableCellFormat();
		cf.setAlignment(Alignment.JUSTIFY);
		cf.setWrap(true);
		//set name to result in sheet2
		Date dt=new Date();
		SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
		String cname=df.format(dt);
		Label l1=new Label(nouc1,0,cname,cf);
		wsh1.addCell(l1);
		Label l2=new Label(nouc2,0,cname,cf);
		wsh2.addCell(l2);
		Mymethods mm=new Mymethods();
		Method m[]=mm.getClass().getMethods();
		try
		{
			for(int i=1;i<nour1;i++)
			{
				int flag=0;
				String tid=rsh1.getCell(0,i).getContents();
				String mode=rsh1.getCell(2,i).getContents();
				if(mode.equalsIgnoreCase("yes"))
				{
					for(int j=1;j<nour2;j++)
					{
						String sid=rsh2.getCell(0,j).getContents();
						if(tid.equalsIgnoreCase(sid))
						{
						String mn=rsh2.getCell(2,j).getContents();
						String e=rsh2.getCell(3,j).getContents();
						String d=rsh2.getCell(4,j).getContents();
						String c=rsh2.getCell(5,j).getContents();
						System.out.println(mn+" "+e+""+d+""+c);
						for(int k=0;k<m.length;k++)
						{
							if(m[k].getName().equals(mn))
							{
								String r=(String) m[k].invoke(mm,e,d,c);
								Label lb=new Label(nouc2,j,r,cf);
								wsh2.addCell(lb);
								if(r.equals("unknown browser"))
								{
									wwb.write();
									wwb.close();
									rwb.close();
									System.exit(0);
								}
								if(r.contains("failed")||r.contains("interrupted"))
								{
									flag=1;
								}
							}
						}
						}
					}
					if(flag==0)
					{
						Label l=new Label(nouc1,i,"passed",cf);
						wsh1.addCell(l);
					}
					else
					{
						Label l=new Label(nouc1,i,"failed",cf);
						wsh1.addCell(l);
					}
				}
			}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		wwb.write();
		wwb.close();
		rwb.close();
		
	}

}
