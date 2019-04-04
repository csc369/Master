import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class sample extends Frame implements WindowListener,ActionListener
{
public void windowActivated(WindowEvent e) {  }
public void windowDeactivated(WindowEvent e) {  }
public void windowIconified(WindowEvent e) {  }
public void windowDeiconified(WindowEvent e) {  }
public void windowClosing(WindowEvent e) {   System.exit(0); }
public void windowClosed(WindowEvent e) {  }
public void windowOpened(WindowEvent e) {  }
TextArea t1;
Checkbox c1,c2,c3;
CheckboxGroup g;
Button b1,b2;
Connection c;
Statement s;
ResultSet rs;
int i=0;
int marks=0;
int j=0;

public static void main(String args[]) throws Exception 
{
sample s= new sample();	// Create a new frame 



}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()== b2)		// Start
{
try{
rs.next();
t1.setText(rs.getString(1));
c1.setLabel(rs.getString(2));
c2.setLabel(rs.getString(3));
c3.setLabel(rs.getString(4));
}catch(Exception e) { System.out.println(e); } 
}
if(ae.getSource()== b1)		// Submit
{
try{
t1.setText(rs.getString(1));
c1.setLabel(rs.getString(2));
c2.setLabel(rs.getString(3));
c3.setLabel(rs.getString(4));
if(c1.getState()==true)  j=1;
if(c2.getState()==true)  j=2;
if(c3.getState()==true)  j=3;
String ans=rs.getString(5);
int k=Integer.parseInt(ans);
if(j==k)
marks=marks+2;
else
marks=marks-1;
System.out.println("ANS IS " + k);
System.out.println("J IS " + j);
System.out.println(marks);
rs.next();
}catch(Exception e) { System.out.println(e); } 




}


}
sample()
{
try{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

Line 31852: 194:<imgclass="sortImage"id="sortingstatus"src="<%=request.getContextPath()%>/images/triangle-sort_asc.gif"/>
Line 31870: 212:value=<%=ftrList.getFtrid()%>/></TD>
Line 31871: 213:<TD><%=ftrList.getFtrid()%></TD>
Line 31872: 214:<TD><%=ftrList.getTranfertype()%></TD>
Line 31873: 215:<TD><%=ftrList.getJobtitle()%></TD>
Line 31874: 216:<TD><%=ftrList.getDiscipline()%></TD>
Line 31875: 217:<TD><%=ftrList.getExchange()%></TD>
Line 31876: 218:<TD><%=ftrList.getWorklocation()%></TD>
Line 31895: 212:value=<%=ftrList.getFtrid()%>/></TD>
Line 31896: 213:<TD><%=ftrList.getFtrid()%></TD>
Line 31897: 214:<TD><%=ftrList.getTranfertype()%></TD>
Line 31898: 215:<TD><%=ftrList.getJobtitle()%></TD>
Line 31899: 216:<TD><%=ftrList.getDiscipline()%></TD>
Line 31900: 217:<TD><%=ftrList.getExchange()%></TD>
Line 31901: 218:<TD><%=ftrList.getWorklocation()%></TD>
Line 31902: 219:<TD><%=ftrList.getSubmissionDateStr()%></TD>
Line 31920: 212:value=<%=ftrList.getFtrid()%>/></TD>
Line 31921: 213:<TD><%=ftrList.getFtrid()%></TD>
Line 31922: 214:<TD><%=ftrList.getTranfertype()%></TD>
Line 31923: 215:<TD><%=ftrList.getJobtitle()%></TD>
Line 31924: 216:<TD><%=ftrList.getDiscipline()%></TD>
Line 31925: 217:<TD><%=ftrList.getExchange()%></TD>
Line 31926: 218:<TD><%=ftrList.getWorklocation()%></TD>
Line 31927: 219:<TD><%=ftrList.getSubmissionDateStr()%></TD>
Line 31928: 220:<TD><%=ftrList.getStatus()%></TD>
Line 31945: 212:value=<%=ftrList.getFtrid()%>/></TD>
Line 31946: 213:<TD><%=ftrList.getFtrid()%></TD>
Line 31947: 214:<TD><%=ftrList.getTranfertype()%></TD>
Line 31948: 215:<TD><%=ftrList.getJobtitle()%></TD>
Line 31949: 216:<TD><%=ftrList.getDiscipline()%></TD>
Line 31950: 217:<TD><%=ftrList.getExchange()%></TD>
Line 31951: 218:<TD><%=ftrList.getWorklocation()%></TD>
Line 31952: 219:<TD><%=ftrList.getSubmissionDateStr()%></TD>
Line 31953: 220:<TD><%=ftrList.getStatus()%></TD>
Line 31970: 212:value=<%=ftrList.getFtrid()%>/></TD>
Line 31971: 213:<TD><%=ftrList.getFtrid()%></TD>
Line 31972: 214:<TD><%=ftrList.getTranfertype()%></TD>
Line 31973: 215:<TD><%=ftrList.getJobtitle()%></TD>
Line 31974: 216:<TD><%=ftrList.getDiscipline()%></TD>
Line 31975: 217:<TD><%=ftrList.getExchange()%></TD>
Line 31976: 218:<TD><%=ftrList.getWorklocation()%></TD>
Line 31977: 219:<TD><%=ftrList.getSubmissionDateStr()%></TD>
Line 31978: 220:<TD><%=ftrList.getStatus()%></TD>
Line 31995: 212:value=<%=ftrList.getFtrid()%>/></TD>
Line 31996: 213:<TD><%=ftrList.getFtrid()%></TD>
Line 31997: 214:<TD><%=ftrList.getTranfertype()%></TD>
Line 31998: 215:<TD><%=ftrList.getJobtitle()%></TD>
Line 31999: 216:<TD><%=ftrList.getDiscipline()%></TD>
Line 32000: 217:<TD><%=ftrList.getExchange()%></TD>
Line 32001: 218:<TD><%=ftrList.getWorklocation()%></TD>
Line 32002: 219:<TD><%=ftrList.getSubmissionDateStr()%></TD>
Line 32003: 220:<TD><%=ftrList.getStatus()%></TD>
Line 32019: 212:value=<%=ftrList.getFtrid()%>/></TD>
Line 32020: 213:<TD><%=ftrList.getFtrid()%></TD>
Line 32021: 214:<TD><%=ftrList.getTranfertype()%></TD>
Line 32022: 215:<TD><%=ftrList.getJobtitle()%></TD>
Line 32023: 216:<TD><%=ftrList.getDiscipline()%></TD>
Line 32024: 217:<TD><%=ftrList.getExchange()%></TD>
Line 32025: 218:<TD><%=ftrList.getWorklocation()%></TD>
Line 32026: 219:<TD><%=ftrList.getSubmissionDateStr()%></TD>
Line 32027: 220:<TD><%=ftrList.getStatus()%></TD>
Line 32053: 102:<Ahref="onclick="javascript:submitSelectionBusinessUnit('<%=businessUnit.getBusinessUnitID()%>','<%=businessUnit.getBusinessUnitCode()%>');window.close();returnfalse;"><%=businessUnit.getBusinessUnitCode()%></A>
Line 32053: 102:<Ahref="onclick="javascript:submitSelectionBusinessUnit('<%=businessUnit.getBusinessUnitID()%>','<%=businessUnit.getBusinessUnitCode()%>');window.close();returnfalse;"><%=businessUnit.getBusinessUnitCode()%></A>
Line 32053: 102:<Ahref="onclick="javascript:submitSelectionBusinessUnit('<%=businessUnit.getBusinessUnitID()%>','<%=businessUnit.getBusinessUnitCode()%>');window.close();returnfalse;"><%=businessUnit.getBusinessUnitCode()%></A>
Line 32055: 104:<TDclass="TableResultTD"width="65%"align="left"><%=businessUnit.getBusinessUnitName()%></TD>
Line 32056: 105:<TDclass="TableResultTD"width="15%"align="left"><%=ControlTablesUtil.nullToBlank(businessUnit.getInactiveDate())%>&nbsp;</TD>
Line 32079: 102:<Ahref="onclick="javascript:submitSelectionBusinessUnit('<%=businessUnit.getBusinessUnitID()%>','<%=businessUnit.getBusinessUnitCode()%>');window.close();returnfalse;"><%=businessUnit.getBusinessUnitCode()%></A>
Line 32079: 102:<Ahref="onclick="javascript:submitSelectionBusinessUnit('<%=businessUnit.getBusinessUnitID()%>','<%=businessUnit.getBusinessUnitCode()%>');window.close();returnfalse;"><%=businessUnit.getBusinessUnitCode()%></A>
Line 32079: 102:<Ahref="onclick="javascript:submitSelectionBusinessUnit('<%=businessUnit.getBusinessUnitID()%>','<%=businessUnit.getBusinessUnitCode()%>');window.close();returnfalse;"><%=businessUnit.getBusinessUnitCode()%></A>
Line 32081: 104:<TDclass="TableResultTD"width="65%"align="left"><%=businessUnit.getBusinessUnitName()%></TD>
Line 32082: 105:<TDclass="TableResultTD"width="15%"align="left"><%=ControlTablesUtil.nullToBlank(businessUnit.getInactiveDate())%>&nbsp;</TD>
Line 32103: 102:<Ahref="onclick="javascript:submitSelectionBusinessUnit('<%=businessUnit.getBusinessUnitID()%>','<%=businessUnit.getBusinessUnitCode()%>');window.close();returnfalse;"><%=businessUnit.getBusinessUnitCode()%></A>
Line 32103: 102:<Ahref="onclick="javascript:submitSelectionBusinessUnit('<%=businessUnit.getBusinessUnitID()%>','<%=businessUnit.getBusinessUnitCode()%>');window.close();returnfalse;"><%=businessUnit.getBusinessUnitCode()%></A>
Line 32103: 102:<Ahref="onclick="javascript:submitSelectionBusinessUnit('<%=businessUnit.getBusinessUnitID()%>','<%=businessUnit.getBusinessUnitCode()%>');window.close();returnfalse;"><%=businessUnit.getBusinessUnitCode()%></A>
Line 32105: 104:<TDclass="TableResultTD"width="65%"align="left"><%=businessUnit.getBusinessUnitName()%></TD>
Line 32106: 105:<TDclass="TableResultTD"width="15%"align="left"><%=ControlTablesUtil.nullToBlank(businessUnit.getInactiveDate())%>&nbsp;</TD>
Line 32118: 78:comparator="<%=com.sbc.jobs.util.controltables.ControlTablesUtil.JOB_TITLE_COMPARATOR%>">
Line 32131: 91:<Ahref="onclick="javascript:OpenProgress('Processing');selectRow('<%=jobTitle.getJobTitleID()%>','<%=jobTitle.getName()%>','<%=jobTitle.getLaborUnion().getLaborUnionCode()%>');window.close();returnfalse;"><%=jobTitle.getLaborUnion().getLaborUnionName()%></A>
Line 32131: 91:<Ahref="onclick="javascript:OpenProgress('Processing');selectRow('<%=jobTitle.getJobTitleID()%>','<%=jobTitle.getName()%>','<%=jobTitle.getLaborUnion().getLaborUnionCode()%>');window.close();returnfalse;"><%=jobTitle.getLaborUnion().getLaborUnionName()%></A>
Line 32131: 91:<Ahref="onclick="javascript:OpenProgress('Processing');selectRow('<%=jobTitle.getJobTitleID()%>','<%=jobTitle.getName()%>','<%=jobTitle.getLaborUnion().getLaborUnionCode()%>');window.close();returnfalse;"><%=jobTitle.getLaborUnion().getLaborUnionName()%></A>
Line 32131: 91:<Ahref="onclick="javascript:OpenProgress('Processing');selectRow('<%=jobTitle.getJobTitleID()%>','<%=jobTitle.getName()%>','<%=jobTitle.getLaborUnion().getLaborUnionCode()%>');window.close();returnfalse;"><%=jobTitle.getLaborUnion().getLaborUnionName()%></A>
Line 32133: 93:<TDwidth="10%"align="center"<%if(sortcolumn.equals("jobTitleCodeSortField"))out.print("CLASS=COLCOLOR");%>><%=jobTitle.getJobTitleCode()%></TD>
Line 32134: 94:<TDwidth="30%"align="left"<%if(sortcolumn.equals("jobTitleNameSortField"))out.print("CLASS=COLCOLOR");%>><%=jobTitle.getName()%></TD>
Line 32135: 95:<TDwidth="10%"align="center"<%if(sortcolumn.equals("jobTitleEffectiveDateSortField"))out.print("CLASS=COLCOLOR");%>><%=ControlTablesUtil.nullToBlank(jobTitle.getEffectiveDate())%></TD>
Line 32136: 96:<TDwidth="10%"align="center"<%if(sortcolumn.equals("jobTitleDeactivateDateSortField"))out.print("CLASS=COLCOLOR");%>><%=ControlTablesUtil.nullToBlank(jobTitle.getDiscontinueDate())%></TD>
Line 32144: 78:comparator="<%=com.sbc.jobs.util.controltables.ControlTablesUtil.JOB_TITLE_COMPARATOR%>">
Line 32157: 91:<Ahref="onclick="javascript:OpenProgress('Processing');selectRow('<%=jobTitle.getJobTitleID()%>','<%=jobTitle.getName()%>','<%=jobTitle.getLaborUnion().getLaborUnionCode()%>');window.close();returnfalse;"><%=jobTitle.getLaborUnion().getLaborUnionName()%></A>
Line 32157: 91:<Ahref="onclick="javascript:OpenProgress('Processing');selectRow('<%=jobTitle.getJobTitleID()%>','<%=jobTitle.getName()%>','<%=jobTitle.getLaborUnion().getLaborUnionCode()%>');window.close();returnfalse;"><%=jobTitle.getLaborUnion().getLaborUnionName()%></A>
Line 32157: 91:<Ahref="onclick="javascript:OpenProgress('Processing');selectRow('<%=jobTitle.getJobTitleID()%>','<%=jobTitle.getName()%>','<%=jobTitle.getLaborUnion().getLaborUnionCode()%>');window.close();returnfalse;"><%=jobTitle.getLaborUnion().getLaborUnionName()%></A>
Line 32157: 91:<Ahref="onclick="javascript:OpenProgress('Processing');selectRow('<%=jobTitle.getJobTitleID()%>','<%=jobTitle.getName()%>','<%=jobTitle.getLaborUnion().getLaborUnionCode()%>');window.close();returnfalse;"><%=jobTitle.getLaborUnion().getLaborUnionName()%></A>
Line 32159: 93:<TDwidth="10%"align="center"<%if(sortcolumn.equals("jobTitleCodeSortField"))out.print("CLASS=COLCOLOR");%>><%=jobTitle.getJobTitleCode()%></TD>
Line 32160: 94:<TDwidth="30%"align="left"<%if(sortcolumn.equals("jobTitleNameSortField"))out.print("CLASS=COLCOLOR");%>><%=jobTitle.getName()%></TD>
Line 32161: 95:<TDwidth="10%"align="center"<%if(sortcolumn.equals("jobTitleEffectiveDateSortField"))out.print("CLASS=COLCOLOR");%>><%=ControlTablesUtil.nullToBlank(jobTitle.getEffectiveDate())%></TD>
Line 32162: 96:<TDwidth="10%"align="center"<%if(sortcolumn.equals("jobTitleDeactivateDateSortField"))out.print("CLASS=COLCOLOR");%>><%=ControlTablesUtil.nullToBlank(jobTitle.getDiscontinueDate())%></TD>
Line 32170: 78:comparator="<%=com.sbc.jobs.util.controltables.ControlTablesUtil.JOB_TITLE_COMPARATOR%>">
Line 32183: 91:<Ahref="onclick="javascript:OpenProgress('Processing');selectRow('<%=jobTitle.getJobTitleID()%>','<%=jobTitle.getName()%>','<%=jobTitle.getLaborUnion().getLaborUnionCode()%>');window.close();returnfalse;"><%=jobTitle.getLaborUnion().getLaborUnionName()%></A>
Line 32183: 91:<Ahref="onclick="javascript:OpenProgress('Processing');selectRow('<%=jobTitle.getJobTitleID()%>','<%=jobTitle.getName()%>','<%=jobTitle.getLaborUnion().getLaborUnionCode()%>');window.close();returnfalse;"><%=jobTitle.getLaborUnion().getLaborUnionName()%></A>
Line 32183: 91:<Ahref="onclick="javascript:OpenProgress('Processing');selectRow('<%=jobTitle.getJobTitleID()%>','<%=jobTitle.getName()%>','<%=jobTitle.getLaborUnion().getLaborUnionCode()%>');window.close();returnfalse;"><%=jobTitle.getLaborUnion().getLaborUnionName()%></A>
Line 32183: 91:<Ahref="onclick="javascript:OpenProgress('Processing');selectRow('<%=jobTitle.getJobTitleID()%>','<%=jobTitle.getName()%>','<%=jobTitle.getLaborUnion().getLaborUnionCode()%>');window.close();returnfalse;"><%=jobTitle.getLaborUnion().getLaborUnionName()%></A>
Line 32185: 93:<TDwidth="10%"align="center"<%if(sortcolumn.equals("jobTitleCodeSortField"))out.print("CLASS=COLCOLOR");%>><%=jobTitle.getJobTitleCode()%></TD>
Line 32186: 94:<TDwidth="30%"align="left"<%if(sortcolumn.equals("jobTitleNameSortField"))out.print("CLASS=COLCOLOR");%>><%=jobTitle.getName()%></TD>
Line 32187: 95:<TDwidth="10%"align="center"<%if(sortcolumn.equals("jobTitleEffectiveDateSortField"))out.print("CLASS=COLCOLOR");%>><%=ControlTablesUtil.nullToBlank(jobTitle.getEffectiveDate())%></TD>
Line 32188: 96:<TDwidth="10%"align="center"<%if(sortcolumn.equals("jobTitleDeactivateDateSortField"))out.print("CLASS=COLCOLOR");%>><%=ControlTablesUtil.nullToBlank(jobTitle.getDiscontinueDate())%></TD>
Line 32194: 78:comparator="<%=com.sbc.jobs.util.controltables.ControlTablesUtil.JOB_TITLE_COMPARATOR%>">
Line 32207: 91:<Ahref="onclick="javascript:OpenProgress('Processing');selectRow('<%=jobTitle.getJobTitleID()%>','<%=jobTitle.getName()%>','<%=jobTitle.getLaborUnion().getLaborUnionCode()%>');window.close();returnfalse;"><%=jobTitle.getLaborUnion().getLaborUnionName()%></A>
Line 32207: 91:<Ahref="onclick="javascript:OpenProgress('Processing');selectRow('<%=jobTitle.getJobTitleID()%>','<%=jobTitle.getName()%>','<%=jobTitle.getLaborUnion().getLaborUnionCode()%>');window.close();returnfalse;"><%=jobTitle.getLaborUnion().getLaborUnionName()%></A>
Line 32207: 91:<Ahref="onclick="javascript:OpenProgress('Processing');selectRow('<%=jobTitle.getJobTitleID()%>','<%=jobTitle.getName()%>','<%=jobTitle.getLaborUnion().getLaborUnionCode()%>');window.close();returnfalse;"><%=jobTitle.getLaborUnion().getLaborUnionName()%></A>
Line 32207: 91:<Ahref="onclick="javascript:OpenProgress('Processing');selectRow('<%=jobTitle.getJobTitleID()%>','<%=jobTitle.getName()%>','<%=jobTitle.getLaborUnion().getLaborUnionCode()%>');window.close();returnfalse;"><%=jobTitle.getLaborUnion().getLaborUnionName()%></A>
Line 32209: 93:<TDwidth="10%"align="center"<%if(sortcolumn.equals("jobTitleCodeSortField"))out.print("CLASS=COLCOLOR");%>><%=jobTitle.getJobTitleCode()%></TD>
Line 32210: 94:<TDwidth="30%"align="left"<%if(sortcolumn.equals("jobTitleNameSortField"))out.print("CLASS=COLCOLOR");%>><%=jobTitle.getName()%></TD>
Line 32211: 95:<TDwidth="10%"align="center"<%if(sortcolumn.equals("jobTitleEffectiveDateSortField"))out.print("CLASS=COLCOLOR");%>><%=ControlTablesUtil.nullToBlank(jobTitle.getEffectiveDate())%></TD>
Line 32212: 96:<TDwidth="10%"align="center"<%if(sortcolumn.equals("jobTitleDeactivateDateSortField"))out.print("CLASS=COLCOLOR");%>><%=ControlTablesUtil.nullToBlank(jobTitle.getDiscontinueDate())%></TD>
Line 32219: 78:comparator="<%=com.sbc.jobs.util.controltables.ControlTablesUtil.JOB_TITLE_COMPARATOR%>">
Line 32232: 91:<Ahref="onclick="javascript:OpenProgress('Processing');selectRow('<%=jobTitle.getJobTitleID()%>','<%=jobTitle.getName()%>','<%=jobTitle.getLaborUnion().getLaborUnionCode()%>');window.close();returnfalse;"><%=jobTitle.getLaborUnion().getLaborUnionName()%></A>
Line 32232: 91:<Ahref="onclick="javascript:OpenProgress('Processing');selectRow('<%=jobTitle.getJobTitleID()%>','<%=jobTitle.getName()%>','<%=jobTitle.getLaborUnion().getLaborUnionCode()%>');window.close();returnfalse;"><%=jobTitle.getLaborUnion().getLaborUnionName()%></A>
Line 32232: 91:<Ahref="onclick="javascript:OpenProgress('Processing');selectRow('<%=jobTitle.getJobTitleID()%>','<%=jobTitle.getName()%>','<%=jobTitle.getLaborUnion().getLaborUnionCode()%>');window.close();returnfalse;"><%=jobTitle.getLaborUnion().getLaborUnionName()%></A>
Line 32232: 91:<Ahref="onclick="javascript:OpenProgress('Processing');selectRow('<%=jobTitle.getJobTitleID()%>','<%=jobTitle.getName()%>','<%=jobTitle.getLaborUnion().getLaborUnionCode()%>');window.close();returnfalse;"><%=jobTitle.getLaborUnion().getLaborUnionName()%></A>
Line 32234: 93:<TDwidth="10%"align="center"<%if(sortcolumn.equals("jobTitleCodeSortField"))out.print("CLASS=COLCOLOR");%>><%=jobTitle.getJobTitleCode()%></TD>
Line 32235: 94:<TDwidth="30%"align="left"<%if(sortcolumn.equals("jobTitleNameSortField"))out.print("CLASS=COLCOLOR");%>><%=jobTitle.getName()%></TD>
Line 32236: 95:<TDwidth="10%"align="center"<%if(sortcolumn.equals("jobTitleEffectiveDateSortField"))out.print("CLASS=COLCOLOR");%>><%=ControlTablesUtil.nullToBlank(jobTitle.getEffectiveDate())%></TD>
Line 32237: 96:<TDwidth="10%"align="center"<%if(sortcolumn.equals("jobTitleDeactivateDateSortField"))out.print("CLASS=COLCOLOR");%>><%=ControlTablesUtil.nullToBlank(jobTitle.getDiscontinueDate())%></TD>
Line 32256: 88:comparator="<%=com.sbc.jobs.util.controltables.ControlTablesUtil.JOB_TITLE_COMPARATOR%>">
Line 32261: 93:<Ahref="onclick="javascript:selectRow('<%=jobTitle.getJobTitleID()%>','<%=jobTitle.getLaborUnion().getLaborUnionCode()%>');window.close();returnfalse;"><%=jobTitle.getLaborUnion().getLaborUnionName()%></A>
Line 32261: 93:<Ahref="onclick="javascript:selectRow('<%=jobTitle.getJobTitleID()%>','<%=jobTitle.getLaborUnion().getLaborUnionCode()%>');window.close();returnfalse;"><%=jobTitle.getLaborUnion().getLaborUnionName()%></A>
Line 32261: 93:<Ahref="onclick="javascript:selectRow('<%=jobTitle.getJobTitleID()%>','<%=jobTitle.getLaborUnion().getLaborUnionCode()%>');window.close();returnfalse;"><%=jobTitle.getLaborUnion().getLaborUnionName()%></A>
Line 32263: 95:<TDclass="TableResultTD"width="12%"align="left"><%=jobTitle.getJobTitleCode()%></TD>
Line 32264: 96:<TDclass="TableResultTD"width="22%"align="left"><%=jobTitle.getName()%></TD>
Line 32265: 97:<TDclass="TableResultTD"width="18%"align="left"><%=ControlTablesUtil.nullToBlank(jobTitle.getEffectiveDate())%></TD>
Line 32266: 98:<TDclass="TableResultTD"width="18%"align="left"><%=ControlTablesUtil.nullToBlank(jobTitle.getDiscontinueDate())%>&nbsp;</TD>
Line 32282: 88:comparator="<%=com.sbc.jobs.util.controltables.ControlTablesUtil.JOB_TITLE_COMPARATOR%>">
Line 32287: 93:<Ahref="onclick="javascript:selectRow('<%=jobTitle.getJobTitleID()%>','<%=jobTitle.getLaborUnion().getLaborUnionCode()%>');window.close();returnfalse;"><%=jobTitle.getLaborUnion().getLaborUnionName()%></A>
Line 32287: 93:<Ahref="onclick="javascript:selectRow('<%=jobTitle.getJobTitleID()%>','<%=jobTitle.getLaborUnion().getLaborUnionCode()%>');window.close();returnfalse;"><%=jobTitle.getLaborUnion().getLaborUnionName()%></A>
Line 32287: 93:<Ahref="onclick="javascript:selectRow('<%=jobTitle.getJobTitleID()%>','<%=jobTitle.getLaborUnion().getLaborUnionCode()%>');window.close();returnfalse;"><%=jobTitle.getLaborUnion().getLaborUnionName()%></A>
Line 32289: 95:<TDclass="TableResultTD"width="12%"align="left"><%=jobTitle.getJobTitleCode()%></TD>
Line 32290: 96:<TDclass="TableResultTD"width="22%"align="left"><%=jobTitle.getName()%></TD>
Line 32291: 97:<TDclass="TableResultTD"width="18%"align="left"><%=ControlTablesUtil.nullToBlank(jobTitle.getEffectiveDate())%></TD>
Line 32292: 98:<TDclass="TableResultTD"width="18%"align="left"><%=ControlTablesUtil.nullToBlank(jobTitle.getDiscontinueDate())%>&nbsp;</TD>
Line 32306: 88:comparator="<%=com.sbc.jobs.util.controltables.ControlTablesUtil.JOB_TITLE_COMPARATOR%>">
Line 32311: 93:<Ahref="onclick="javascript:selectRow('<%=jobTitle.getJobTitleID()%>','<%=jobTitle.getLaborUnion().getLaborUnionCode()%>');window.close();returnfalse;"><%=jobTitle.getLaborUnion().getLaborUnionName()%></A>
Line 32311: 93:<Ahref="onclick="javascript:selectRow('<%=jobTitle.getJobTitleID()%>','<%=jobTitle.getLaborUnion().getLaborUnionCode()%>');window.close();returnfalse;"><%=jobTitle.getLaborUnion().getLaborUnionName()%></A>
Line 32311: 93:<Ahref="onclick="javascript:selectRow('<%=jobTitle.getJobTitleID()%>','<%=jobTitle.getLaborUnion().getLaborUnionCode()%>');window.close();returnfalse;"><%=jobTitle.getLaborUnion().getLaborUnionName()%></A>
Line 32313: 95:<TDclass="TableResultTD"width="12%"align="left"><%=jobTitle.getJobTitleCode()%></TD>
Line 32314: 96:<TDclass="TableResultTD"width="22%"align="left"><%=jobTitle.getName()%></TD>
Line 32315: 97:<TDclass="TableResultTD"width="18%"align="left"><%=ControlTablesUtil.nullToBlank(jobTitle.getEffectiveDate())%></TD>
Line 32316: 98:<TDclass="TableResultTD"width="18%"align="left"><%=ControlTablesUtil.nullToBlank(jobTitle.getDiscontinueDate())%>&nbsp;</TD>
Line 32331: 88:comparator="<%=com.sbc.jobs.util.controltables.ControlTablesUtil.JOB_TITLE_COMPARATOR%>">
Line 32336: 93:<Ahref="onclick="javascript:selectRow('<%=jobTitle.getJobTitleID()%>','<%=jobTitle.getLaborUnion().getLaborUnionCode()%>');window.close();returnfalse;"><%=jobTitle.getLaborUnion().getLaborUnionName()%></A>
Line 32336: 93:<Ahref="onclick="javascript:selectRow('<%=jobTitle.getJobTitleID()%>','<%=jobTitle.getLaborUnion().getLaborUnionCode()%>');window.close();returnfalse;"><%=jobTitle.getLaborUnion().getLaborUnionName()%></A>
Line 32336: 93:<Ahref="onclick="javascript:selectRow('<%=jobTitle.getJobTitleID()%>','<%=jobTitle.getLaborUnion().getLaborUnionCode()%>');window.close();returnfalse;"><%=jobTitle.getLaborUnion().getLaborUnionName()%></A>
Line 32338: 95:<TDclass="TableResultTD"width="12%"align="left"><%=jobTitle.getJobTitleCode()%></TD>
Line 32339: 96:<TDclass="TableResultTD"width="22%"align="left"><%=jobTitle.getName()%></TD>
Line 32340: 97:<TDclass="TableResultTD"width="18%"align="left"><%=ControlTablesUtil.nullToBlank(jobTitle.getEffectiveDate())%></TD>
Line 32341: 98:<TDclass="TableResultTD"width="18%"align="left"><%=ControlTablesUtil.nullToBlank(jobTitle.getDiscontinueDate())%>&nbsp;</TD>
Line 32359: 61:<%inti=0;%><jobs:iteratecollectionName="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_ADD_LANGUAGE_RESULTS_LIST%>"
Line 32363: 65:comparator="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_ADD_LANGUAGE_RESULTS_COMPARATOR%>">
Line 32365: 67:<TDcolspan=2><%out.print("<INPUTtype='checkbox'name='action'value='"+languageList.getSkillId()+"'>");%><%=languageList.getSkillName()%></TD>
Line 32383: 91:<%inti=0;%><jobs:iteratecollectionName="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_EDUCATION_RESULTS_LIST%>"
Line 32387: 95:comparator="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_EDUCATION_RESULTS_COMPARATOR%>">
Line 32391: 99:<Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddEducationServlet','VIEWLOAD','<%=educationList.getEmplQualID()%>');returnfalse;"><%=educationList.getSchoolType().getTextName()%></A>
Line 32391: 99:<Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddEducationServlet','VIEWLOAD','<%=educationList.getEmplQualID()%>');returnfalse;"><%=educationList.getSchoolType().getTextName()%></A>
Line 32393: 101:<Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddEducationServlet','UPDATE','<%=educationList.getEmplQualID()%>');returnfalse;"><%=educationList.getSchoolType().getTextName()%></A>
Line 32393: 101:<Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddEducationServlet','UPDATE','<%=educationList.getEmplQualID()%>');returnfalse;"><%=educationList.getSchoolType().getTextName()%></A>
Line 32407: 91:<%inti=0;%><jobs:iteratecollectionName="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_EDUCATION_RESULTS_LIST%>"
Line 32411: 95:comparator="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_EDUCATION_RESULTS_COMPARATOR%>">
Line 32415: 99:<Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddEducationServlet','VIEWLOAD','<%=educationList.getEmplQualID()%>');returnfalse;"><%=educationList.getSchoolType().getTextName()%></A>
Line 32415: 99:<Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddEducationServlet','VIEWLOAD','<%=educationList.getEmplQualID()%>');returnfalse;"><%=educationList.getSchoolType().getTextName()%></A>
Line 32417: 101:<Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddEducationServlet','UPDATE','<%=educationList.getEmplQualID()%>');returnfalse;"><%=educationList.getSchoolType().getTextName()%></A>
Line 32417: 101:<Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddEducationServlet','UPDATE','<%=educationList.getEmplQualID()%>');returnfalse;"><%=educationList.getSchoolType().getTextName()%></A>
Line 32421: 105:<TD><%=JOBSCommonUtils.strConvertSpecialCharacterToHTML(educationList.getSchoolName())%></TD>
Line 32422: 106:<TD><%=JOBSCommonUtils.strConvertSpecialCharacterToHTML(educationList.getDegree().getDegreeName())%></TD>
Line 32429: 91:<%inti=0;%><jobs:iteratecollectionName="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_EDUCATION_RESULTS_LIST%>"
Line 32433: 95:comparator="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_EDUCATION_RESULTS_COMPARATOR%>">
Line 32437: 99:<Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddEducationServlet','VIEWLOAD','<%=educationList.getEmplQualID()%>');returnfalse;"><%=educationList.getSchoolType().getTextName()%></A>
Line 32437: 99:<Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddEducationServlet','VIEWLOAD','<%=educationList.getEmplQualID()%>');returnfalse;"><%=educationList.getSchoolType().getTextName()%></A>
Line 32439: 101:<Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddEducationServlet','UPDATE','<%=educationList.getEmplQualID()%>');returnfalse;"><%=educationList.getSchoolType().getTextName()%></A>
Line 32439: 101:<Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddEducationServlet','UPDATE','<%=educationList.getEmplQualID()%>');returnfalse;"><%=educationList.getSchoolType().getTextName()%></A>
Line 32443: 105:<TD><%=JOBSCommonUtils.strConvertSpecialCharacterToHTML(educationList.getSchoolName())%></TD>
Line 32444: 106:<TD><%=JOBSCommonUtils.strConvertSpecialCharacterToHTML(educationList.getDegree().getDegreeName())%></TD>
Line 32448: 110:<TDalign="center"><%=educationList.getDegreeDateEarnedString()%></TD>
Line 32454: 91:<%inti=0;%><jobs:iteratecollectionName="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_EDUCATION_RESULTS_LIST%>"
Line 32458: 95:comparator="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_EDUCATION_RESULTS_COMPARATOR%>">
Line 32462: 99:<Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddEducationServlet','VIEWLOAD','<%=educationList.getEmplQualID()%>');returnfalse;"><%=educationList.getSchoolType().getTextName()%></A>
Line 32462: 99:<Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddEducationServlet','VIEWLOAD','<%=educationList.getEmplQualID()%>');returnfalse;"><%=educationList.getSchoolType().getTextName()%></A>
Line 32464: 101:<Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddEducationServlet','UPDATE','<%=educationList.getEmplQualID()%>');returnfalse;"><%=educationList.getSchoolType().getTextName()%></A>
Line 32464: 101:<Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddEducationServlet','UPDATE','<%=educationList.getEmplQualID()%>');returnfalse;"><%=educationList.getSchoolType().getTextName()%></A>
Line 32468: 105:<TD><%=JOBSCommonUtils.strConvertSpecialCharacterToHTML(educationList.getSchoolName())%></TD>
Line 32469: 106:<TD><%=JOBSCommonUtils.strConvertSpecialCharacterToHTML(educationList.getDegree().getDegreeName())%></TD>
Line 32473: 110:<TDalign="center"><%=educationList.getDegreeDateEarnedString()%></TD>
Line 32478: 91:<%inti=0;%><jobs:iteratecollectionName="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_EDUCATION_RESULTS_LIST%>"
Line 32482: 95:comparator="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_EDUCATION_RESULTS_COMPARATOR%>">
Line 32486: 99:<Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddEducationServlet','VIEWLOAD','<%=educationList.getEmplQualID()%>');returnfalse;"><%=educationList.getSchoolType().getTextName()%></A>
Line 32486: 99:<Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddEducationServlet','VIEWLOAD','<%=educationList.getEmplQualID()%>');returnfalse;"><%=educationList.getSchoolType().getTextName()%></A>
Line 32488: 101:<Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddEducationServlet','UPDATE','<%=educationList.getEmplQualID()%>');returnfalse;"><%=educationList.getSchoolType().getTextName()%></A>
Line 32488: 101:<Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddEducationServlet','UPDATE','<%=educationList.getEmplQualID()%>');returnfalse;"><%=educationList.getSchoolType().getTextName()%></A>
Line 32492: 105:<TD><%=JOBSCommonUtils.strConvertSpecialCharacterToHTML(educationList.getSchoolName())%></TD>
Line 32493: 106:<TD><%=JOBSCommonUtils.strConvertSpecialCharacterToHTML(educationList.getDegree().getDegreeName())%></TD>
Line 32497: 110:<TDalign="center"><%=educationList.getDegreeDateEarnedString()%></TD>
Line 32499: 112:<TDalign="center"><%=educationList.getApprovedInd()%></TD>
Line 32503: 91:<%inti=0;%><jobs:iteratecollectionName="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_EDUCATION_RESULTS_LIST%>"
Line 32507: 95:comparator="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_EDUCATION_RESULTS_COMPARATOR%>">
Line 32511: 99:<Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddEducationServlet','VIEWLOAD','<%=educationList.getEmplQualID()%>');returnfalse;"><%=educationList.getSchoolType().getTextName()%></A>
Line 32511: 99:<Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddEducationServlet','VIEWLOAD','<%=educationList.getEmplQualID()%>');returnfalse;"><%=educationList.getSchoolType().getTextName()%></A>
Line 32513: 101:<Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddEducationServlet','UPDATE','<%=educationList.getEmplQualID()%>');returnfalse;"><%=educationList.getSchoolType().getTextName()%></A>
Line 32513: 101:<Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddEducationServlet','UPDATE','<%=educationList.getEmplQualID()%>');returnfalse;"><%=educationList.getSchoolType().getTextName()%></A>
Line 32517: 105:<TD><%=JOBSCommonUtils.strConvertSpecialCharacterToHTML(educationList.getSchoolName())%></TD>
Line 32518: 106:<TD><%=JOBSCommonUtils.strConvertSpecialCharacterToHTML(educationList.getDegree().getDegreeName())%></TD>
Line 32522: 110:<TDalign="center"><%=educationList.getDegreeDateEarnedString()%></TD>
Line 32524: 112:<TDalign="center"><%=educationList.getApprovedInd()%></TD>
Line 32541: 70:<%inti=0;%><jobs:iteratecollectionName="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_LANGUAGE_RESULTS_LIST%>"
Line 32545: 74:comparator="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_LANGUAGE_RESULTS_COMPARATOR%>">
Line 32547: 76:<TD><%=languageList.getLanguageSkill().getSkillName()%></TD>
Line 32566: 90:<%inti=0;%><jobs:iteratecollectionName="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_LICENSECERT_RESULTS_LIST%>"
Line 32570: 94:comparator="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_LICENSECERT_RESULTS_COMPARATOR%>">
Line 32573: 97:<TD><Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddLicAndCertificateServlet','<%Stringact1=LicenseCertList.getAction();Stringappmode=(String)session.getAttribute(com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_APPMODE);if(appmode==null)appmode=";if(act1.equals("ACTIVE")&&!appmode.equals("VIEW")){out.print("UPDATE");}else{out.print("VIEWLOAD");}%>','<%=LicenseCertList.getPersonSkillID()%>');returnfalse;"><%=JOBSCommonUtils.strConvertSpecialCharacterToHTML(LicenseCertList.getLicCertSkill().getSkillName())%></A></TD>
Line 32573: 97:<TD><Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddLicAndCertificateServlet','<%Stringact1=LicenseCertList.getAction();Stringappmode=(String)session.getAttribute(com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_APPMODE);if(appmode==null)appmode=";if(act1.equals("ACTIVE")&&!appmode.equals("VIEW")){out.print("UPDATE");}else{out.print("VIEWLOAD");}%>','<%=LicenseCertList.getPersonSkillID()%>');returnfalse;"><%=JOBSCommonUtils.strConvertSpecialCharacterToHTML(LicenseCertList.getLicCertSkill().getSkillName())%></A></TD>
Line 32576: 100:<TD><%=LicenseCertList.getIssueDateString()%></TD>
Line 32591: 90:<%inti=0;%><jobs:iteratecollectionName="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_LICENSECERT_RESULTS_LIST%>"
Line 32595: 94:comparator="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_LICENSECERT_RESULTS_COMPARATOR%>">
Line 32598: 97:<TD><Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddLicAndCertificateServlet','<%Stringact1=LicenseCertList.getAction();Stringappmode=(String)session.getAttribute(com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_APPMODE);if(appmode==null)appmode=";if(act1.equals("ACTIVE")&&!appmode.equals("VIEW")){out.print("UPDATE");}else{out.print("VIEWLOAD");}%>','<%=LicenseCertList.getPersonSkillID()%>');returnfalse;"><%=JOBSCommonUtils.strConvertSpecialCharacterToHTML(LicenseCertList.getLicCertSkill().getSkillName())%></A></TD>
Line 32598: 97:<TD><Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddLicAndCertificateServlet','<%Stringact1=LicenseCertList.getAction();Stringappmode=(String)session.getAttribute(com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_APPMODE);if(appmode==null)appmode=";if(act1.equals("ACTIVE")&&!appmode.equals("VIEW")){out.print("UPDATE");}else{out.print("VIEWLOAD");}%>','<%=LicenseCertList.getPersonSkillID()%>');returnfalse;"><%=JOBSCommonUtils.strConvertSpecialCharacterToHTML(LicenseCertList.getLicCertSkill().getSkillName())%></A></TD>
Line 32601: 100:<TD><%=LicenseCertList.getIssueDateString()%></TD>
Line 32604: 103:<TDalign="center"><%=LicenseCertList.getApprovedInd().getYesNo()%></TD>
Line 32619: 71:<%inti=0;%><jobs:iteratecollectionName="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_MILITARYJOB_RESULTS_LIST%>"
Line 32623: 75:comparator="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_MILITARYJOB_RESULTS_COMPARATOR%>">
Line 32625: 77:<TDalign="left"><Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddMilitaryJobServlet','<%Stringact1=MilitaryJobList.getAction();Stringappmode=(String)session.getAttribute(com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_APPMODE);if(appmode==null)appmode=";if(act1.equals("ACTIVE")&&!appmode.equals("VIEW")){out.print("UPDATE");}else{out.print("VIEWLOAD");}%>','<%=MilitaryJobList.getSeqNbr()%>');returnfalse;"><%=MilitaryJobList.getJob()%></A></TD>
Line 32625: 77:<TDalign="left"><Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddMilitaryJobServlet','<%Stringact1=MilitaryJobList.getAction();Stringappmode=(String)session.getAttribute(com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_APPMODE);if(appmode==null)appmode=";if(act1.equals("ACTIVE")&&!appmode.equals("VIEW")){out.print("UPDATE");}else{out.print("VIEWLOAD");}%>','<%=MilitaryJobList.getSeqNbr()%>');returnfalse;"><%=MilitaryJobList.getJob()%></A></TD>
Line 32645: 71:<%inti=0;%><jobs:iteratecollectionName="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_MILITARYTRAINING_RESULTS_LIST%>"
Line 32649: 75:comparator="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_MILITARYTRAINING_RESULTS_COMPARATOR%>">
Line 32651: 77:<TDalign="left"><Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddMilitaryTrainingServlet','<%Stringact1=MilitaryTrainingList.getAction();Stringappmode=(String)session.getAttribute(com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_APPMODE);if(appmode==null)appmode=";if(act1.equals("ACTIVE")&&!appmode.equals("VIEW")){out.print("UPDATE");}else{out.print("VIEWLOAD");}%>','<%=MilitaryTrainingList.getSubject().getSkillCode()%>');returnfalse;"><%=MilitaryTrainingList.getSubject().getSkillName()%></A></TD>
Line 32651: 77:<TDalign="left"><Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddMilitaryTrainingServlet','<%Stringact1=MilitaryTrainingList.getAction();Stringappmode=(String)session.getAttribute(com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_APPMODE);if(appmode==null)appmode=";if(act1.equals("ACTIVE")&&!appmode.equals("VIEW")){out.print("UPDATE");}else{out.print("VIEWLOAD");}%>','<%=MilitaryTrainingList.getSubject().getSkillCode()%>');returnfalse;"><%=MilitaryTrainingList.getSubject().getSkillName()%></A></TD>
Line 32671: 71:<%inti=0;%><jobs:iteratecollectionName="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_MILITARYTRAINING_RESULTS_LIST%>"
Line 32675: 75:comparator="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_MILITARYTRAINING_RESULTS_COMPARATOR%>">
Line 32677: 77:<TDalign="left"><Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddMilitaryTrainingServlet','<%Stringact1=MilitaryTrainingList.getAction();Stringappmode=(String)session.getAttribute(com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_APPMODE);if(appmode==null)appmode=";if(act1.equals("ACTIVE")&&!appmode.equals("VIEW")){out.print("UPDATE");}else{out.print("VIEWLOAD");}%>','<%=MilitaryTrainingList.getSubject().getSkillCode()%>');returnfalse;"><%=MilitaryTrainingList.getSubject().getSkillName()%></A></TD>
Line 32677: 77:<TDalign="left"><Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddMilitaryTrainingServlet','<%Stringact1=MilitaryTrainingList.getAction();Stringappmode=(String)session.getAttribute(com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_APPMODE);if(appmode==null)appmode=";if(act1.equals("ACTIVE")&&!appmode.equals("VIEW")){out.print("UPDATE");}else{out.print("VIEWLOAD");}%>','<%=MilitaryTrainingList.getSubject().getSkillCode()%>');returnfalse;"><%=MilitaryTrainingList.getSubject().getSkillName()%></A></TD>
Line 32694: 71:<%inti=0;%><jobs:iteratecollectionName="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_MILITARYTRAINING_RESULTS_LIST%>"
Line 32698: 75:comparator="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_MILITARYTRAINING_RESULTS_COMPARATOR%>">
Line 32700: 77:<TDalign="left"><Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddMilitaryTrainingServlet','<%Stringact1=MilitaryTrainingList.getAction();Stringappmode=(String)session.getAttribute(com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_APPMODE);if(appmode==null)appmode=";if(act1.equals("ACTIVE")&&!appmode.equals("VIEW")){out.print("UPDATE");}else{out.print("VIEWLOAD");}%>','<%=MilitaryTrainingList.getSubject().getSkillCode()%>');returnfalse;"><%=MilitaryTrainingList.getSubject().getSkillName()%></A></TD>
Line 32700: 77:<TDalign="left"><Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddMilitaryTrainingServlet','<%Stringact1=MilitaryTrainingList.getAction();Stringappmode=(String)session.getAttribute(com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_APPMODE);if(appmode==null)appmode=";if(act1.equals("ACTIVE")&&!appmode.equals("VIEW")){out.print("UPDATE");}else{out.print("VIEWLOAD");}%>','<%=MilitaryTrainingList.getSubject().getSkillCode()%>');returnfalse;"><%=MilitaryTrainingList.getSubject().getSkillName()%></A></TD>
Line 32717: 71:<%inti=0;%><jobs:iteratecollectionName="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_MILITARYTRAINING_RESULTS_LIST%>"
Line 32721: 75:comparator="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_MILITARYTRAINING_RESULTS_COMPARATOR%>">
Line 32723: 77:<TDalign="left"><Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddMilitaryTrainingServlet','<%Stringact1=MilitaryTrainingList.getAction();Stringappmode=(String)session.getAttribute(com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_APPMODE);if(appmode==null)appmode=";if(act1.equals("ACTIVE")&&!appmode.equals("VIEW")){out.print("UPDATE");}else{out.print("VIEWLOAD");}%>','<%=MilitaryTrainingList.getSubject().getSkillCode()%>');returnfalse;"><%=MilitaryTrainingList.getSubject().getSkillName()%></A></TD>
Line 32723: 77:<TDalign="left"><Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddMilitaryTrainingServlet','<%Stringact1=MilitaryTrainingList.getAction();Stringappmode=(String)session.getAttribute(com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_APPMODE);if(appmode==null)appmode=";if(act1.equals("ACTIVE")&&!appmode.equals("VIEW")){out.print("UPDATE");}else{out.print("VIEWLOAD");}%>','<%=MilitaryTrainingList.getSubject().getSkillCode()%>');returnfalse;"><%=MilitaryTrainingList.getSubject().getSkillName()%></A></TD>
Line 32741: 71:<%inti=0;%><jobs:iteratecollectionName="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_MILITARYTRAINING_RESULTS_LIST%>"
Line 32745: 75:comparator="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_MILITARYTRAINING_RESULTS_COMPARATOR%>">
Line 32747: 77:<TDalign="left"><Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddMilitaryTrainingServlet','<%Stringact1=MilitaryTrainingList.getAction();Stringappmode=(String)session.getAttribute(com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_APPMODE);if(appmode==null)appmode=";if(act1.equals("ACTIVE")&&!appmode.equals("VIEW")){out.print("UPDATE");}else{out.print("VIEWLOAD");}%>','<%=MilitaryTrainingList.getSubject().getSkillCode()%>');returnfalse;"><%=MilitaryTrainingList.getSubject().getSkillName()%></A></TD>
Line 32747: 77:<TDalign="left"><Ahref="onclick="javascript:OpenProgress('Processing');openAddUpdateWindowForEmplQual('EmplQualAddMilitaryTrainingServlet','<%Stringact1=MilitaryTrainingList.getAction();Stringappmode=(String)session.getAttribute(com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_APPMODE);if(appmode==null)appmode=";if(act1.equals("ACTIVE")&&!appmode.equals("VIEW")){out.print("UPDATE");}else{out.print("VIEWLOAD");}%>','<%=MilitaryTrainingList.getSubject().getSkillCode()%>');returnfalse;"><%=MilitaryTrainingList.getSubject().getSkillName()%></A></TD>
Line 32764: 46:<TDid="TABLEBORDER"class="black_link"align="left"width="18%"><INPUTTYPE="hidden"name="noteid"value="><INPUTTYPE="hidden"name="notedate"value="><INPUTTYPE="hidden"name="notechgby"value="><Ahref="<%=request.getContextPath()%>/SearchEmplQualNoteSortingServlet?sortField=notedate">NoteDate</A></TD>
Line 32765: 47:<TDid="TABLEBORDER"class="black_link"align="left"width="34%"><Ahref="<%=request.getContextPath()%>/SearchEmplQualNoteSortingServlet?sortField=author">Author</A></TD>
Line 32766: 48:<TDid="TABLEBORDER"class="black_link"align="left"width="30%"><Ahref="<%=request.getContextPath()%>/SearchEmplQualNoteSortingServlet?sortField=title">Title</A></TD>
Line 32767: 49:<!--<TDid="TABLEBORDER"class="black_link"align="left"width="13%"><Ahref="<%=request.getContextPath()%>/SearchEmplQualNoteSortingServlet?sortField=changeddate">LastChangedDate</A></TD>-->
Line 32768: 50:<TDid="TABLEBORDER"class="black_link"align="left"width="18%"><Ahref="<%=request.getContextPath()%>/SearchEmplQualNoteSortingServlet?sortField=action">Action</A></TD>
Line 32773: 55:<%inti=0;%><%--<jobs:iteratecollectionName="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_NOTES_RESULTS_LIST%>"--%>
Line 32778: 60:comparator="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_NOTES_RESULTS_COMPARATOR%>">
Line 32780: 62:<TDid="TABLEBORDER"align="center"width="20%"><%=emplQualNotesList.getNoteDateString()%></TD>
Line 32781: 63:<TDid="TABLEBORDER"align="left"width="30%"><%=emplQualNotesList.toString()%></TD>
Line 32783: 65:<%--<TDid="TABLEBORDER"width="13%"align="center"><%=emplQualNotesList.getLastChgdDateString()%></TD>--%>
Line 32785: 67:<!--<TD<%if(sortcolumn.equals("SearchEmplQualNoteaction"))out.print("CLASS=COLCOLOR");%>align="center"width="8%"><Ahref="javascript:submitNoteFormIframe('SearchEmplQualNoteProcessServlet','_parent','noteid','<%=emplQualNotesList.getPersonId()%>','<%=emplQualNotesList.getNoteDateTimeString()%>','<%=emplQualNotesList.getChgdBySBCUID()%>')"><%=emplQualNotesList.getAction()%></A></TD>-->
Line 32785: 67:<!--<TD<%if(sortcolumn.equals("SearchEmplQualNoteaction"))out.print("CLASS=COLCOLOR");%>align="center"width="8%"><Ahref="javascript:submitNoteFormIframe('SearchEmplQualNoteProcessServlet','_parent','noteid','<%=emplQualNotesList.getPersonId()%>','<%=emplQualNotesList.getNoteDateTimeString()%>','<%=emplQualNotesList.getChgdBySBCUID()%>')"><%=emplQualNotesList.getAction()%></A></TD>-->
Line 32785: 67:<!--<TD<%if(sortcolumn.equals("SearchEmplQualNoteaction"))out.print("CLASS=COLCOLOR");%>align="center"width="8%"><Ahref="javascript:submitNoteFormIframe('SearchEmplQualNoteProcessServlet','_parent','noteid','<%=emplQualNotesList.getPersonId()%>','<%=emplQualNotesList.getNoteDateTimeString()%>','<%=emplQualNotesList.getChgdBySBCUID()%>')"><%=emplQualNotesList.getAction()%></A></TD>-->
Line 32785: 67:<!--<TD<%if(sortcolumn.equals("SearchEmplQualNoteaction"))out.print("CLASS=COLCOLOR");%>align="center"width="8%"><Ahref="javascript:submitNoteFormIframe('SearchEmplQualNoteProcessServlet','_parent','noteid','<%=emplQualNotesList.getPersonId()%>','<%=emplQualNotesList.getNoteDateTimeString()%>','<%=emplQualNotesList.getChgdBySBCUID()%>')"><%=emplQualNotesList.getAction()%></A></TD>-->
Line 32786: 68:<TDid="TABLEBORDER"align="center"width="20%"><Ahref="javascript:submitNoteFormIframe('SearchEmplQualNoteProcessServlet','_parent','noteid','<%=emplQualNotesList.getPersonId()%>','<%=emplQualNotesList.getNoteDateTimeString()%>','<%=emplQualNotesList.getChgdBySBCUID()%>')"><%if((String)session.getAttribute(EmplQualUtil.EMPLQUAL_APPMODE)=="VIEW"||mode.equalsIgnoreCase("View"))out.print("View");elseout.print(emplQualNotesList.getAction());%></A></TD>
Line 32786: 68:<TDid="TABLEBORDER"align="center"width="20%"><Ahref="javascript:submitNoteFormIframe('SearchEmplQualNoteProcessServlet','_parent','noteid','<%=emplQualNotesList.getPersonId()%>','<%=emplQualNotesList.getNoteDateTimeString()%>','<%=emplQualNotesList.getChgdBySBCUID()%>')"><%if((String)session.getAttribute(EmplQualUtil.EMPLQUAL_APPMODE)=="VIEW"||mode.equalsIgnoreCase("View"))out.print("View");elseout.print(emplQualNotesList.getAction());%></A></TD>
Line 32786: 68:<TDid="TABLEBORDER"align="center"width="20%"><Ahref="javascript:submitNoteFormIframe('SearchEmplQualNoteProcessServlet','_parent','noteid','<%=emplQualNotesList.getPersonId()%>','<%=emplQualNotesList.getNoteDateTimeString()%>','<%=emplQualNotesList.getChgdBySBCUID()%>')"><%if((String)session.getAttribute(EmplQualUtil.EMPLQUAL_APPMODE)=="VIEW"||mode.equalsIgnoreCase("View"))out.print("View");elseout.print(emplQualNotesList.getAction());%></A></TD>
Line 32789: 46:<TDid="TABLEBORDER"class="black_link"align="left"width="18%"><INPUTTYPE="hidden"name="noteid"value="><INPUTTYPE="hidden"name="notedate"value="><INPUTTYPE="hidden"name="notechgby"value="><Ahref="<%=request.getContextPath()%>/SearchEmplQualNoteSortingServlet?sortField=notedate">NoteDate</A></TD>
Line 32790: 47:<TDid="TABLEBORDER"class="black_link"align="left"width="34%"><Ahref="<%=request.getContextPath()%>/SearchEmplQualNoteSortingServlet?sortField=author">Author</A></TD>
Line 32791: 48:<TDid="TABLEBORDER"class="black_link"align="left"width="30%"><Ahref="<%=request.getContextPath()%>/SearchEmplQualNoteSortingServlet?sortField=title">Title</A></TD>
Line 32792: 49:<!--<TDid="TABLEBORDER"class="black_link"align="left"width="13%"><Ahref="<%=request.getContextPath()%>/SearchEmplQualNoteSortingServlet?sortField=changeddate">LastChangedDate</A></TD>-->
Line 32793: 50:<TDid="TABLEBORDER"class="black_link"align="left"width="18%"><Ahref="<%=request.getContextPath()%>/SearchEmplQualNoteSortingServlet?sortField=action">Action</A></TD>
Line 32798: 55:<%inti=0;%><%--<jobs:iteratecollectionName="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_NOTES_RESULTS_LIST%>"--%>
Line 32803: 60:comparator="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_NOTES_RESULTS_COMPARATOR%>">
Line 32805: 62:<TDid="TABLEBORDER"align="center"width="20%"><%=emplQualNotesList.getNoteDateString()%></TD>
Line 32806: 63:<TDid="TABLEBORDER"align="left"width="30%"><%=emplQualNotesList.toString()%></TD>
Line 32808: 65:<%--<TDid="TABLEBORDER"width="13%"align="center"><%=emplQualNotesList.getLastChgdDateString()%></TD>--%>
Line 32810: 67:<!--<TD<%if(sortcolumn.equals("SearchEmplQualNoteaction"))out.print("CLASS=COLCOLOR");%>align="center"width="8%"><Ahref="javascript:submitNoteFormIframe('SearchEmplQualNoteProcessServlet','_parent','noteid','<%=emplQualNotesList.getPersonId()%>','<%=emplQualNotesList.getNoteDateTimeString()%>','<%=emplQualNotesList.getChgdBySBCUID()%>')"><%=emplQualNotesList.getAction()%></A></TD>-->
Line 32810: 67:<!--<TD<%if(sortcolumn.equals("SearchEmplQualNoteaction"))out.print("CLASS=COLCOLOR");%>align="center"width="8%"><Ahref="javascript:submitNoteFormIframe('SearchEmplQualNoteProcessServlet','_parent','noteid','<%=emplQualNotesList.getPersonId()%>','<%=emplQualNotesList.getNoteDateTimeString()%>','<%=emplQualNotesList.getChgdBySBCUID()%>')"><%=emplQualNotesList.getAction()%></A></TD>-->
Line 32810: 67:<!--<TD<%if(sortcolumn.equals("SearchEmplQualNoteaction"))out.print("CLASS=COLCOLOR");%>align="center"width="8%"><Ahref="javascript:submitNoteFormIframe('SearchEmplQualNoteProcessServlet','_parent','noteid','<%=emplQualNotesList.getPersonId()%>','<%=emplQualNotesList.getNoteDateTimeString()%>','<%=emplQualNotesList.getChgdBySBCUID()%>')"><%=emplQualNotesList.getAction()%></A></TD>-->
Line 32810: 67:<!--<TD<%if(sortcolumn.equals("SearchEmplQualNoteaction"))out.print("CLASS=COLCOLOR");%>align="center"width="8%"><Ahref="javascript:submitNoteFormIframe('SearchEmplQualNoteProcessServlet','_parent','noteid','<%=emplQualNotesList.getPersonId()%>','<%=emplQualNotesList.getNoteDateTimeString()%>','<%=emplQualNotesList.getChgdBySBCUID()%>')"><%=emplQualNotesList.getAction()%></A></TD>-->
Line 32811: 68:<TDid="TABLEBORDER"align="center"width="20%"><Ahref="javascript:submitNoteFormIframe('SearchEmplQualNoteProcessServlet','_parent','noteid','<%=emplQualNotesList.getPersonId()%>','<%=emplQualNotesList.getNoteDateTimeString()%>','<%=emplQualNotesList.getChgdBySBCUID()%>')"><%if((String)session.getAttribute(EmplQualUtil.EMPLQUAL_APPMODE)=="VIEW"||mode.equalsIgnoreCase("View"))out.print("View");elseout.print(emplQualNotesList.getAction());%></A></TD>
Line 32811: 68:<TDid="TABLEBORDER"align="center"width="20%"><Ahref="javascript:submitNoteFormIframe('SearchEmplQualNoteProcessServlet','_parent','noteid','<%=emplQualNotesList.getPersonId()%>','<%=emplQualNotesList.getNoteDateTimeString()%>','<%=emplQualNotesList.getChgdBySBCUID()%>')"><%if((String)session.getAttribute(EmplQualUtil.EMPLQUAL_APPMODE)=="VIEW"||mode.equalsIgnoreCase("View"))out.print("View");elseout.print(emplQualNotesList.getAction());%></A></TD>
Line 32811: 68:<TDid="TABLEBORDER"align="center"width="20%"><Ahref="javascript:submitNoteFormIframe('SearchEmplQualNoteProcessServlet','_parent','noteid','<%=emplQualNotesList.getPersonId()%>','<%=emplQualNotesList.getNoteDateTimeString()%>','<%=emplQualNotesList.getChgdBySBCUID()%>')"><%if((String)session.getAttribute(EmplQualUtil.EMPLQUAL_APPMODE)=="VIEW"||mode.equalsIgnoreCase("View"))out.print("View");elseout.print(emplQualNotesList.getAction());%></A></TD>
Line 32814: "49:<!--<TDid="TABLEBORDER"class="black_link"align="left"width="13%"><Ahref="<%=request.getContextPath()%>/SearchEmplQualNoteSortingServlet?sortField=changeddate">LastChangedDate</A></TD>-->
Line 32815: 50:<TDid="TABLEBORDER"class="black_link"align="left"width="18%"><Ahref="<%=request.getContextPath()%>/SearchEmplQualNoteSortingServlet?sortField=action">Action</A></TD>
Line 32820: 55:<%inti=0;%><%--<jobs:iteratecollectionName="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_NOTES_RESULTS_LIST%>"--%>
Line 32825: 60:comparator="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_NOTES_RESULTS_COMPARATOR%>">
Line 32827: 62:<TDid="TABLEBORDER"align="center"width="20%"><%=emplQualNotesList.getNoteDateString()%></TD>
Line 32828: 63:<TDid="TABLEBORDER"align="left"width="30%"><%=emplQualNotesList.toString()%></TD>
Line 32830: 65:<%--<TDid="TABLEBORDER"width="13%"align="center"><%=emplQualNotesList.getLastChgdDateString()%></TD>--%>
Line 32832: 67:<!--<TD<%if(sortcolumn.equals("SearchEmplQualNoteaction"))out.print("CLASS=COLCOLOR");%>align="center"width="8%"><Ahref="javascript:submitNoteFormIframe('SearchEmplQualNoteProcessServlet','_parent','noteid','<%=emplQualNotesList.getPersonId()%>','<%=emplQualNotesList.getNoteDateTimeString()%>','<%=emplQualNotesList.getChgdBySBCUID()%>')"><%=emplQualNotesList.getAction()%></A></TD>-->
Line 32832: 67:<!--<TD<%if(sortcolumn.equals("SearchEmplQualNoteaction"))out.print("CLASS=COLCOLOR");%>align="center"width="8%"><Ahref="javascript:submitNoteFormIframe('SearchEmplQualNoteProcessServlet','_parent','noteid','<%=emplQualNotesList.getPersonId()%>','<%=emplQualNotesList.getNoteDateTimeString()%>','<%=emplQualNotesList.getChgdBySBCUID()%>')"><%=emplQualNotesList.getAction()%></A></TD>-->
Line 32832: 67:<!--<TD<%if(sortcolumn.equals("SearchEmplQualNoteaction"))out.print("CLASS=COLCOLOR");%>align="center"width="8%"><Ahref="javascript:submitNoteFormIframe('SearchEmplQualNoteProcessServlet','_parent','noteid','<%=emplQualNotesList.getPersonId()%>','<%=emplQualNotesList.getNoteDateTimeString()%>','<%=emplQualNotesList.getChgdBySBCUID()%>')"><%=emplQualNotesList.getAction()%></A></TD>-->
Line 32832: 67:<!--<TD<%if(sortcolumn.equals("SearchEmplQualNoteaction"))out.print("CLASS=COLCOLOR");%>align="center"width="8%"><Ahref="javascript:submitNoteFormIframe('SearchEmplQualNoteProcessServlet','_parent','noteid','<%=emplQualNotesList.getPersonId()%>','<%=emplQualNotesList.getNoteDateTimeString()%>','<%=emplQualNotesList.getChgdBySBCUID()%>')"><%=emplQualNotesList.getAction()%></A></TD>-->
Line 32833: 68:<TDid="TABLEBORDER"align="center"width="20%"><Ahref="javascript:submitNoteFormIframe('SearchEmplQualNoteProcessServlet','_parent','noteid','<%=emplQualNotesList.getPersonId()%>','<%=emplQualNotesList.getNoteDateTimeString()%>','<%=emplQualNotesList.getChgdBySBCUID()%>')"><%if((String)session.getAttribute(EmplQualUtil.EMPLQUAL_APPMODE)=="VIEW"||mode.equalsIgnoreCase("View"))out.print("View");elseout.print(emplQualNotesList.getAction());%></A></TD>
Line 32833: 68:<TDid="TABLEBORDER"align="center"width="20%"><Ahref="javascript:submitNoteFormIframe('SearchEmplQualNoteProcessServlet','_parent','noteid','<%=emplQualNotesList.getPersonId()%>','<%=emplQualNotesList.getNoteDateTimeString()%>','<%=emplQualNotesList.getChgdBySBCUID()%>')"><%if((String)session.getAttribute(EmplQualUtil.EMPLQUAL_APPMODE)=="VIEW"||mode.equalsIgnoreCase("View"))out.print("View");elseout.print(emplQualNotesList.getAction());%></A></TD>
Line 32833: 68:<TDid="TABLEBORDER"align="center"width="20%"><Ahref="javascript:submitNoteFormIframe('SearchEmplQualNoteProcessServlet','_parent','noteid','<%=emplQualNotesList.getPersonId()%>','<%=emplQualNotesList.getNoteDateTimeString()%>','<%=emplQualNotesList.getChgdBySBCUID()%>')"><%if((String)session.getAttribute(EmplQualUtil.EMPLQUAL_APPMODE)=="VIEW"||mode.equalsIgnoreCase("View"))out.print("View");elseout.print(emplQualNotesList.getAction());%></A></TD>
Line 32840: "15:<linktype="text/css"rel="stylesheet"href="<%=request.getContextPath()%>/style/styleEmployee.css"/>
Line 32842: 17:<scripttype="text/javascript"src="<%=request.getContextPath()%>/scripts/spin.js"></script>
Line 32843: 18:<scripttype="text/javascript"src="<%=request.getContextPath()%>/scripts/jquery.js"></script>
Line 32844: 19:<scripttype="text/javascript"src="<%=request.getContextPath()%>/scripts/jqdomwindow.js"></script>
Line 32845: 20:<scripttype="text/javascript"src="<%=request.getContextPath()%>/scripts/menu.js"></script>
Line 32846: 21:<scripttype="text/javascript"src="<%=request.getContextPath()%>/scripts/NMICmenu.js"></script>
Line 32849: 24:<scripttype="text/javascript"src="<%=request.getContextPath()%>/scripts/jquery.datepicker.js"></script>
Line 32850: 25:<scripttype="text/javascript"src="<%=request.getContextPath()%>/scripts/datepicker_lang_US.js"></script>
Line 32852: 27:<scripttype="text/javascript"src="<%=request.getContextPath()%>/scripts/dates.js"></script>
Line 32853: 28:<SCRIPTskill="JavaScript"src="<%=request.getContextPath()%>/scripts/qualifications.js"></SCRIPT>
Line 32854: 29:<scriptlanguage="JavaScript"src="<%=request.getContextPath()%>/scripts/jobs.js"></script>
Line 32859: 34:checkedBoxesArray=newArray(<%=session.getAttribute("ESS_checkedBoxes")%>);
Line 32860: 35:checkedBoxesRemoveArray=newArray(<%=session.getAttribute("ESS_checkedBoxesRemove")%>);
Line 32867: 17:<scripttype="text/javascript"src="<%=request.getContextPath()%>/scripts/spin.js"></script>
Line 32868: 18:<scripttype="text/javascript"src="<%=request.getContextPath()%>/scripts/jquery.js"></script>
Line 32869: 19:<scripttype="text/javascript"src="<%=request.getContextPath()%>/scripts/jqdomwindow.js"></script>
Line 32870: 20:<scripttype="text/javascript"src="<%=request.getContextPath()%>/scripts/menu.js"></script>
Line 32871: 21:<scripttype="text/javascript"src="<%=request.getContextPath()%>/scripts/NMICmenu.js"></script>
Line 32874: 24:<scripttype="text/javascript"src="<%=request.getContextPath()%>/scripts/jquery.datepicker.js"></script>
Line 32875: 25:<scripttype="text/javascript"src="<%=request.getContextPath()%>/scripts/datepicker_lang_US.js"></script>
Line 32877: 27:<scripttype="text/javascript"src="<%=request.getContextPath()%>/scripts/dates.js"></script>
Line 32878: 28:<SCRIPTskill="JavaScript"src="<%=request.getContextPath()%>/scripts/qualifications.js"></SCRIPT>
Line 32879: 29:<scriptlanguage="JavaScript"src="<%=request.getContextPath()%>/scripts/jobs.js"></script>
Line 32884: 34:checkedBoxesArray=newArray(<%=session.getAttribute("ESS_checkedBoxes")%>);
Line 32885: 35:checkedBoxesRemoveArray=newArray(<%=session.getAttribute("ESS_checkedBoxesRemove")%>);
Line 32905: 292:<FORMname="iframeaddskillresultsform"action="<%=request.getContextPath()%>/EmplQualSkillSortServlet"
Line 32911: 298:<INPUTtype="hidden"name="EDITMODE"value="<%=editMode%>">
Line 32912: 299:<INPUTtype="hidden"name="SKILLSUBTYPE"value="<%=skillSubType%>">
Line 32930: 292:<FORMname="iframeaddskillresultsform"action="<%=request.getContextPath()%>/EmplQualSkillSortServlet"
Line 32936: 298:<INPUTtype="hidden"name="EDITMODE"value="<%=editMode%>">
Line 32937: 299:<INPUTtype="hidden"name="SKILLSUBTYPE"value="<%=skillSubType%>">
Line 32953: 451:collectionName="<%=collectionName%>"
Line 32957: 455:comparator="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_ADD_SKILL_RESULTS_COMPARATOR%>">
Line 32959: 457:<inputtype="hidden"name="personSkillId"value="<%=skillList.getPersonSkillId()%>"/>
Line 32961: 459:<inputtype="hidden"name="skillId"value="<%=skillList.getSkillId()%>"/>
Line 32963: 461:<inputtype="hidden"name="skillSubType"value="<%=skillList.getSkillSubType()%>"/>
Line 32964: 462:<inputtype="hidden"name="skillCode"value="<%=skillList.getSkillCode()%>"/>
Line 32965: 463:<inputtype="hidden"name="skillName"value="<%=skillList.getSkillName()%>"/>
Line 32968: 466:<inputtype="hidden"name="skillName_<%=skillList.getSkillId()%>"
Line 32978: 451:collectionName="<%=collectionName%>"
Line 32982: 455:comparator="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_ADD_SKILL_RESULTS_COMPARATOR%>">
Line 32984: 457:<inputtype="hidden"name="personSkillId"value="<%=skillList.getPersonSkillId()%>"/>
Line 32986: 459:<inputtype="hidden"name="skillId"value="<%=skillList.getSkillId()%>"/>
Line 32988: 461:<inputtype="hidden"name="skillSubType"value="<%=skillList.getSkillSubType()%>"/>
Line 32989: 462:<inputtype="hidden"name="skillCode"value="<%=skillList.getSkillCode()%>"/>
Line 32990: 463:<inputtype="hidden"name="skillName"value="<%=skillList.getSkillName()%>"/>
Line 32993: 466:<inputtype="hidden"name="skillName_<%=skillList.getSkillId()%>"
Line 32994: 467:value="<%=skillList.getSkillName()%>"/><!--needskillName_b/cnamehassinglequotessometimes-->
Line 33003: 451:collectionName="<%=collectionName%>"
Line 33007: 455:comparator="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_ADD_SKILL_RESULTS_COMPARATOR%>">
Line 33009: 457:<inputtype="hidden"name="personSkillId"value="<%=skillList.getPersonSkillId()%>"/>
Line 33011: 459:<inputtype="hidden"name="skillId"value="<%=skillList.getSkillId()%>"/>
Line 33013: 461:<inputtype="hidden"name="skillSubType"value="<%=skillList.getSkillSubType()%>"/>
Line 33014: 462:<inputtype="hidden"name="skillCode"value="<%=skillList.getSkillCode()%>"/>
Line 33015: 463:<inputtype="hidden"name="skillName"value="<%=skillList.getSkillName()%>"/>
Line 33018: 466:<inputtype="hidden"name="skillName_<%=skillList.getSkillId()%>"
Line 33019: 467:value="<%=skillList.getSkillName()%>"/><!--needskillName_b/cnamehassinglequotessometimes-->
Line 33025: 451:collectionName="<%=collectionName%>"
Line 33029: 455:comparator="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_ADD_SKILL_RESULTS_COMPARATOR%>">
Line 33031: 457:<inputtype="hidden"name="personSkillId"value="<%=skillList.getPersonSkillId()%>"/>
Line 33033: 459:<inputtype="hidden"name="skillId"value="<%=skillList.getSkillId()%>"/>
Line 33035: 461:<inputtype="hidden"name="skillSubType"value="<%=skillList.getSkillSubType()%>"/>
Line 33036: 462:<inputtype="hidden"name="skillCode"value="<%=skillList.getSkillCode()%>"/>
Line 33037: 463:<inputtype="hidden"name="skillName"value="<%=skillList.getSkillName()%>"/>
Line 33040: 466:<inputtype="hidden"name="skillName_<%=skillList.getSkillId()%>"
Line 33041: 467:value="<%=skillList.getSkillName()%>"/><!--needskillName_b/cnamehassinglequotessometimes-->
Line 33048: "459:<inputtype="hidden"name="skillId"value="<%=skillList.getSkillId()%>"/>
Line 33050: 461:<inputtype="hidden"name="skillSubType"value="<%=skillList.getSkillSubType()%>"/>
Line 33051: 462:<inputtype="hidden"name="skillCode"value="<%=skillList.getSkillCode()%>"/>
Line 33052: 463:<inputtype="hidden"name="skillName"value="<%=skillList.getSkillName()%>"/>
Line 33055: 466:<inputtype="hidden"name="skillName_<%=skillList.getSkillId()%>"
Line 33056: 467:value="<%=skillList.getSkillName()%>"/><!--needskillName_b/cnamehassinglequotessometimes-->
Line 33065: 476:name="chkbox_skill"value="<%=skillList.getPersonSkillId()%>"
Line 33067: 478:onClick="checkDupCheckbox(this,'<%=skillList.getSkillName()%>');"/>
Line 33074: "467:value="<%=skillList.getSkillName()%>"/><!--needskillName_b/cnamehassinglequotessometimes-->
Line 33083: 476:name="chkbox_skill"value="<%=skillList.getPersonSkillId()%>"
Line 33085: 478:onClick="checkDupCheckbox(this,'<%=skillList.getSkillName()%>');"/>
Line 33092: 485:name="chkbox_skill"value="<%=skillList.getSkillId()%>"
Line 33093: 486:onClick="isSkillAssigned(this,'<%=skillList.getSkillCode()%>');"/>
Line 33101: 478:onClick="checkDupCheckbox(this,'<%=skillList.getSkillName()%>');"/>
Line 33108: 485:name="chkbox_skill"value="<%=skillList.getSkillId()%>"
Line 33109: 486:onClick="isSkillAssigned(this,'<%=skillList.getSkillCode()%>');"/>
Line 33119: 496:<%=skillList.getSkillName()%>
Line 33123: 500:<ahref="#"onclick="openDescription('<%=skillList.getSkillId()%>');returnfalse;">
Line 33124: 501:<%=skillList.getSkillName()%></a>
Line 33129: 485:name="chkbox_skill"value="<%=skillList.getSkillId()%>"
Line 33130: 486:onClick="isSkillAssigned(this,'<%=skillList.getSkillCode()%>');"/>
Line 33140: 496:<%=skillList.getSkillName()%>
Line 33144: 500:<ahref="#"onclick="openDescription('<%=skillList.getSkillId()%>');returnfalse;">
Line 33145: 501:<%=skillList.getSkillName()%></a>
Line 33150: 506:<tdclass="skillCategory"><%=skillList.getCategoryName()%></td>
Line 33161: 496:<%=skillList.getSkillName()%>
Line 33165: 500:<ahref="#"onclick="openDescription('<%=skillList.getSkillId()%>');returnfalse;">
Line 33166: 501:<%=skillList.getSkillName()%></a>
Line 33171: 506:<tdclass="skillCategory"><%=skillList.getCategoryName()%></td>
Line 33173: 508:<tdclass="skillCode"><%=skillList.getSkillCode()%></td>
Line 33185: 496:<%=skillList.getSkillName()%>
Line 33189: 500:<ahref="#"onclick="openDescription('<%=skillList.getSkillId()%>');returnfalse;">
Line 33190: 501:<%=skillList.getSkillName()%></a>
Line 33195: 506:<tdclass="skillCategory"><%=skillList.getCategoryName()%></td>
Line 33197: 508:<tdclass="skillCode"><%=skillList.getSkillCode()%></td>
Line 33201: 512:<inputtype=textname="acquireDate"value="<%=skillList.getAcquireDateStr()%>"
Line 33211: 551:value="<%=skillList.getDateOfIssueStr()%>"onchange="isValidLastUsedDate(this)"
Line 33223: 563:value="<%=skillList.getExpirationDateStr()%>"onchange="isValidExpirationDate(this,'<%=skillList.getSkillSubType()%>')"
Line 33223: 563:value="<%=skillList.getExpirationDateStr()%>"onchange="isValidExpirationDate(this,'<%=skillList.getSkillSubType()%>')"
Line 33248: 586:name="chkbox_remove_skill"value="<%=skillList.getPersonSkillId()%>"
Line 33249: 587:onClick="checkDupCheckbox(this,'<%=skillList.getSkillName()%>');"
Line 33256: "13:<scripttype="text/javascript"src="<%=request.getContextPath()%>/scripts/jquery.js"></script>
Line 33257: 14:<scripttype="text/javascript"src="<%=request.getContextPath()%>/scripts/jqdomwindow.js"></script>
Line 33258: 15:<scripttype="text/javascript"src="<%=request.getContextPath()%>/scripts/menu.js"></script>
Line 33259: 16:<scripttype="text/javascript"src="<%=request.getContextPath()%>/scripts/NMICmenu.js"></script>
Line 33262: 19:<SCRIPTskill="JavaScript"src="<%=request.getContextPath()%>/scripts/qualifications.js"></SCRIPT>
Line 33265: 22:<linktype="text/css"rel="stylesheet"href="<%=request.getContextPath()%>/style/styleEmployee.css"/>
Line 33275: 32:checkedBoxesArray=newArray(<%=session.getAttribute("ESS_checkedBoxes")%>);
Line 33300: 73:<pstyle="margin-left:1%;"><imgid="att_top_logo_ess"src="<%=request.getContextPath()%>/images/error.gif"/>
Line 33301: 74:<spanstyle="font-family:Tahoma,Arial,Verdana;font-size:12px;color:red;"><b><%=session.getAttribute("invalidInput")%></b></span></p>
Line 33313: 210:<jobs:iteratecollectionName="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_SKILL_RESULTS_LIST%>"
Line 33317: 214:comparator="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_SKILL_RESULTS_COMPARATOR%>">
Line 33325: 222:value="<%=skillList.getPersonSkillId()%>"/></td>
Line 33327: 224:<TD><%=skillList.getSkillName()%>&nbsp;</TD>
Line 33329: 226:<TD><%=skillList.getCategoryName()%></TD>
Line 33331: 228:<TD><%=skillList.getSkillCode()%></TD>
Line 33337: 210:<jobs:iteratecollectionName="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_SKILL_RESULTS_LIST%>"
Line 33341: 214:comparator="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_SKILL_RESULTS_COMPARATOR%>">
Line 33349: 222:value="<%=skillList.getPersonSkillId()%>"/></td>
Line 33351: 224:<TD><%=skillList.getSkillName()%>&nbsp;</TD>
Line 33353: 226:<TD><%=skillList.getCategoryName()%></TD>
Line 33355: 228:<TD><%=skillList.getSkillCode()%></TD>
Line 33358: 231:<TD><%=skillList.getAcquireDateStr()%>&nbsp;</TD>
Line 33361: 210:<jobs:iteratecollectionName="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_SKILL_RESULTS_LIST%>"
Line 33365: 214:comparator="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_SKILL_RESULTS_COMPARATOR%>">
Line 33373: 222:value="<%=skillList.getPersonSkillId()%>"/></td>
Line 33375: 224:<TD><%=skillList.getSkillName()%>&nbsp;</TD>
Line 33377: 226:<TD><%=skillList.getCategoryName()%></TD>
Line 33379: 228:<TD><%=skillList.getSkillCode()%></TD>
Line 33382: 231:<TD><%=skillList.getAcquireDateStr()%>&nbsp;</TD>
Line 33399: 42:<jobs:iteratecollectionName="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_TRAININGHISTORY_RESULTS_LIST%>"
Line 33424: 42:<jobs:iteratecollectionName="<%=com.sbc.jobs.util.qualifications.EmplQualUtil.EMPLQUAL_TRAININGHISTORY_RESULTS_LIST%>"
Line 33440: 46:<TDcolspan="10"><%=employees.size()%>recordsfoundthatmeetyourCriteria.</TD>
Line 33455: 61:comparator="<%=com.sbc.jobs.util.employee.EmployeeUtil.EMPLOYEE_COMPARATOR%>">
Line 33457: 63:<TD<%if(sortcolumn.equals("EmployeeSearchssn"))out.print("CLASS=COLCOLOR");%>width="96"><Ahref="onclick="javascript:OpenProgress('Processing');selectEmployee('<%=employeeList.getPersonID()%>');"><%=employeeList.getSSN()%></A></TD>
Line 33457: 63:<TD<%if(sortcolumn.equals("EmployeeSearchssn"))out.print("CLASS=COLCOLOR");%>width="96"><Ahref="onclick="javascript:OpenProgress('Processing');selectEmployee('<%=employeeList.getPersonID()%>');"><%=employeeList.getSSN()%></A></TD>
Line 33458: 64:<TD<%if(sortcolumn.equals("EmployeeSearchfirstname"))out.print("CLASS=COLCOLOR");%>width="105"><%=employeeList.getFirstName()%></TD>
Line 33459: 65:<TD<%if(sortcolumn.equals("EmployeeSearchlastname"))out.print("CLASS=COLCOLOR");%>width="106"><%=employeeList.getLastName()%></TD>
Line 33460: 66:<TD<%if(sortcolumn.equals("EmployeeSearchlevelandclass"))out.print("CLASS=COLCOLOR");%>width="55"><%=employeeList.getLevelAndClass()%></TD>
Line 33461: 67:<TD<%if(sortcolumn.equals("EmployeeSearchcity"))out.print("CLASS=COLCOLOR");%>width="120"><%=employeeList.getWorkLocation().getAddress().getCity()%></TD>
Line 33462: 68:<TD<%if(sortcolumn.equals("EmployeeSearchworkloc"))out.print("CLASS=COLCOLOR");%>width="154"><%=employeeList.getWorkLocation().getWorkLocationCode()%></TD>
Line 33465: 46:<TDcolspan="10"><%=employees.size()%>recordsfoundthatmeetyourCriteria.</TD>
Line 33480: 61:comparator="<%=com.sbc.jobs.util.employee.EmployeeUtil.EMPLOYEE_COMPARATOR%>">
Line 33482: 63:<TD<%if(sortcolumn.equals("EmployeeSearchssn"))out.print("CLASS=COLCOLOR");%>width="96"><Ahref="onclick="javascript:OpenProgress('Processing');selectEmployee('<%=employeeList.getPersonID()%>');"><%=employeeList.getSSN()%></A></TD>
Line 33482: 63:<TD<%if(sortcolumn.equals("EmployeeSearchssn"))out.print("CLASS=COLCOLOR");%>width="96"><Ahref="onclick="javascript:OpenProgress('Processing');selectEmployee('<%=employeeList.getPersonID()%>');"><%=employeeList.getSSN()%></A></TD>
Line 33483: 64:<TD<%if(sortcolumn.equals("EmployeeSearchfirstname"))out.print("CLASS=COLCOLOR");%>width="105"><%=employeeList.getFirstName()%></TD>
Line 33484: 65:<TD<%if(sortcolumn.equals("EmployeeSearchlastname"))out.print("CLASS=COLCOLOR");%>width="106"><%=employeeList.getLastName()%></TD>
Line 33485: 66:<TD<%if(sortcolumn.equals("EmployeeSearchlevelandclass"))out.print("CLASS=COLCOLOR");%>width="55"><%=employeeList.getLevelAndClass()%></TD>
Line 33486: 67:<TD<%if(sortcolumn.equals("EmployeeSearchcity"))out.print("CLASS=COLCOLOR");%>width="120"><%=employeeList.getWorkLocation().getAddress().getCity()%></TD>
Line 33487: 68:<TD<%if(sortcolumn.equals("EmployeeSearchworkloc"))out.print("CLASS=COLCOLOR");%>width="154"><%=employeeList.getWorkLocation().getWorkLocationCode()%></TD>
Line 33490: "46:<TDcolspan="10"><%=employees.size()%>recordsfoundthatmeetyourCriteria.</TD>
Line 33505: 61:comparator="<%=com.sbc.jobs.util.employee.EmployeeUtil.EMPLOYEE_COMPARATOR%>">
Line 33507: 63:<TD<%if(sortcolumn.equals("EmployeeSearchssn"))out.print("CLASS=COLCOLOR");%>width="96"><Ahref="onclick="javascript:OpenProgress('Processing');selectEmployee('<%=employeeList.getPersonID()%>');"><%=employeeList.getSSN()%></A></TD>
Line 33507: 63:<TD<%if(sortcolumn.equals("EmployeeSearchssn"))out.print("CLASS=COLCOLOR");%>width="96"><Ahref="onclick="javascript:OpenProgress('Processing');selectEmployee('<%=employeeList.getPersonID()%>');"><%=employeeList.getSSN()%></A></TD>
Line 33508: 64:<TD<%if(sortcolumn.equals("EmployeeSearchfirstname"))out.print("CLASS=COLCOLOR");%>width="105"><%=employeeList.getFirstName()%></TD>
Line 33509: 65:<TD<%if(sortcolumn.equals("EmployeeSearchlastname"))out.print("CLASS=COLCOLOR");%>width="106"><%=employeeList.getLastName()%></TD>
Line 33510: 66:<TD<%if(sortcolumn.equals("EmployeeSearchlevelandclass"))out.print("CLASS=COLCOLOR");%>width="55"><%=employeeList.getLevelAndClass()%></TD>
Line 33511: 67:<TD<%if(sortcolumn.equals("EmployeeSearchcity"))out.print("CLASS=COLCOLOR");%>width="120"><%=employeeList.getWorkLocation().getAddress().getCity()%></TD>
Line 33512: 68:<TD<%if(sortcolumn.equals("EmployeeSearchworkloc"))out.print("CLASS=COLCOLOR");%>width="154"><%=employeeList.getWorkLocation().getWorkLocationCode()%></TD>
Line 33528: 61:comparator="<%=com.sbc.jobs.util.employee.EmployeeUtil.EMPLOYEE_COMPARATOR%>">
Line 33530: 63:<TD<%if(sortcolumn.equals("EmployeeSearchssn"))out.print("CLASS=COLCOLOR");%>width="96"><Ahref="onclick="javascript:OpenProgress('Processing');selectEmployee('<%=employeeList.getPersonID()%>');"><%=employeeList.getSSN()%></A></TD>
Line 33530: 63:<TD<%if(sortcolumn.equals("EmployeeSearchssn"))out.print("CLASS=COLCOLOR");%>width="96"><Ahref="onclick="javascript:OpenProgress('Processing');selectEmployee('<%=employeeList.getPersonID()%>');"><%=employeeList.getSSN()%></A></TD>
Line 33531: 64:<TD<%if(sortcolumn.equals("EmployeeSearchfirstname"))out.print("CLASS=COLCOLOR");%>width="105"><%=employeeList.getFirstName()%></TD>
Line 33532: 65:<TD<%if(sortcolumn.equals("EmployeeSearchlastname"))out.print("CLASS=COLCOLOR");%>width="106"><%=employeeList.getLastName()%></TD>
Line 33533: 66:<TD<%if(sortcolumn.equals("EmployeeSearchlevelandclass"))out.print("CLASS=COLCOLOR");%>width="55"><%=employeeList.getLevelAndClass()%></TD>
Line 33534: 67:<TD<%if(sortcolumn.equals("EmployeeSearchcity"))out.print("CLASS=COLCOLOR");%>width="120"><%=employeeList.getWorkLocation().getAddress().getCity()%></TD>
Line 33535: 68:<TD<%if(sortcolumn.equals("EmployeeSearchworkloc"))out.print("CLASS=COLCOLOR");%>width="154"><%=employeeList.getWorkLocation().getWorkLocationCode()%></TD>
Line 33559: 75:comparator="<%=com.sbc.jobs.util.employee.EmployeeUtil.EMPLOYEE_COMPARATOR%>">
Line 33561: 77:<TD<%if(sortcolumn.equals("EmployeeSearchssn"))out.print("CLASS=COLCOLOR");%>width="15%"><Ahref="onclick="javascript:selectEmployee('<%=employeeList.getPersonID()%>');"><%=employeeList.getSSN()%></A></TD>
Line 33561: 77:<TD<%if(sortcolumn.equals("EmployeeSearchssn"))out.print("CLASS=COLCOLOR");%>width="15%"><Ahref="onclick="javascript:selectEmployee('<%=employeeList.getPersonID()%>');"><%=employeeList.getSSN()%></A></TD>
Line 33562: 78:<TD<%if(sortcolumn.equals("EmployeeSearchfirstname"))out.print("CLASS=COLCOLOR");%>width="20%"><%=employeeList.getFirstName()%></TD>
Line 33563: 79:<TD<%if(sortcolumn.equals("EmployeeSearchlastname"))out.print("CLASS=COLCOLOR");%>width="20%"><%=employeeList.getLastName()%></TD>
Line 33564: 80:<TD<%if(sortcolumn.equals("EmployeeSearchlevelandclass"))out.print("CLASS=COLCOLOR");%>width="15%"><%=employeeList.getLevelAndClass()%></TD>
Line 33565: 81:<TD<%if(sortcolumn.equals("EmployeeSearchcity"))out.print("CLASS=COLCOLOR");%>width="15%"><%=employeeList.getWorkLocation().getAddress().getCity()%></TD>
Line 33566: 82:<TD<%if(sortcolumn.equals("EmployeeSearchstate"))out.print("CLASS=COLCOLOR");%>width="5%"><%=employeeList.getWorkLocation().getAddress().getState().getName()%></TD>
Line 33584: 75:comparator="<%=com.sbc.jobs.util.employee.EmployeeUtil.EMPLOYEE_COMPARATOR%>">
Line 33586: 77:<TD<%if(sortcolumn.equals("EmployeeSearchssn"))out.print("CLASS=COLCOLOR");%>width="15%"><Ahref="onclick="javascript:selectEmployee('<%=employeeList.getPersonID()%>');"><%=employeeList.getSSN()%></A></TD>
Line 33586: 77:<TD<%if(sortcolumn.equals("EmployeeSearchssn"))out.print("CLASS=COLCOLOR");%>width="15%"><Ahref="onclick="javascript:selectEmployee('<%=employeeList.getPersonID()%>');"><%=employeeList.getSSN()%></A></TD>
Line 33587: 78:<TD<%if(sortcolumn.equals("EmployeeSearchfirstname"))out.print("CLASS=COLCOLOR");%>width="20%"><%=employeeList.getFirstName()%></TD>
Line 33588: 79:<TD<%if(sortcolumn.equals("EmployeeSearchlastname"))out.print("CLASS=COLCOLOR");%>width="20%"><%=employeeList.getLastName()%></TD>
Line 33589: 80:<TD<%if(sortcolumn.equals("EmployeeSearchlevelandclass"))out.print("CLASS=COLCOLOR");%>width="15%"><%=employeeList.getLevelAndClass()%></TD>
Line 33590: 81:<TD<%if(sortcolumn.equals("EmployeeSearchcity"))out.print("CLASS=COLCOLOR");%>width="15%"><%=employeeList.getWorkLocation().getAddress().getCity()%></TD>
Line 33591: 82:<TD<%if(sortcolumn.equals("EmployeeSearchstate"))out.print("CLASS=COLCOLOR");%>width="5%"><%=employeeList.getWorkLocation().getAddress().getState().getName()%></TD>
Line 33592: 83:<TD<%if(sortcolumn.equals("EmployeeSearchworkloc"))out.print("CLASS=COLCOLOR");%>width="10%"><%=employeeList.getWorkLocation().getWorkLocationCode()%></TD>
Line 33609: 75:comparator="<%=com.sbc.jobs.util.employee.EmployeeUtil.EMPLOYEE_COMPARATOR%>">
Line 33611: 77:<TD<%if(sortcolumn.equals("EmployeeSearchssn"))out.print("CLASS=COLCOLOR");%>width="15%"><Ahref="onclick="javascript:selectEmployee('<%=employeeList.getPersonID()%>');"><%=employeeList.getSSN()%></A></TD>
Line 33611: 77:<TD<%if(sortcolumn.equals("EmployeeSearchssn"))out.print("CLASS=COLCOLOR");%>width="15%"><Ahref="onclick="javascript:selectEmployee('<%=employeeList.getPersonID()%>');"><%=employeeList.getSSN()%></A></TD>
Line 33612: 78:<TD<%if(sortcolumn.equals("EmployeeSearchfirstname"))out.print("CLASS=COLCOLOR");%>width="20%"><%=employeeList.getFirstName()%></TD>
Line 33613: 79:<TD<%if(sortcolumn.equals("EmployeeSearchlastname"))out.print("CLASS=COLCOLOR");%>width="20%"><%=employeeList.getLastName()%></TD>
Line 33614: 80:<TD<%if(sortcolumn.equals("EmployeeSearchlevelandclass"))out.print("CLASS=COLCOLOR");%>width="15%"><%=employeeList.getLevelAndClass()%></TD>
Line 33615: 81:<TD<%if(sortcolumn.equals("EmployeeSearchcity"))out.print("CLASS=COLCOLOR");%>width="15%"><%=employeeList.getWorkLocation().getAddress().getCity()%></TD>
Line 33616: 82:<TD<%if(sortcolumn.equals("EmployeeSearchstate"))out.print("CLASS=COLCOLOR");%>width="5%"><%=employeeList.getWorkLocation().getAddress().getState().getName()%></TD>
Line 33617: 83:<TD<%if(sortcolumn.equals("EmployeeSearchworkloc"))out.print("CLASS=COLCOLOR");%>width="10%"><%=employeeList.getWorkLocation().getWorkLocationCode()%></TD>
Line 33632: 75:comparator="<%=com.sbc.jobs.util.employee.EmployeeUtil.EMPLOYEE_COMPARATOR%>">
Line 33634: 77:<TD<%if(sortcolumn.equals("EmployeeSearchssn"))out.print("CLASS=COLCOLOR");%>width="15%"><Ahref="onclick="javascript:selectEmployee('<%=employeeList.getPersonID()%>');"><%=employeeList.getSSN()%></A></TD>
Line 33634: 77:<TD<%if(sortcolumn.equals("EmployeeSearchssn"))out.print("CLASS=COLCOLOR");%>width="15%"><Ahref="onclick="javascript:selectEmployee('<%=employeeList.getPersonID()%>');"><%=employeeList.getSSN()%></A></TD>
Line 33635: 78:<TD<%if(sortcolumn.equals("EmployeeSearchfirstname"))out.print("CLASS=COLCOLOR");%>width="20%"><%=employeeList.getFirstName()%></TD>
Line 33636: 79:<TD<%if(sortcolumn.equals("EmployeeSearchlastname"))out.print("CLASS=COLCOLOR");%>width="20%"><%=employeeList.getLastName()%></TD>
Line 33637: 80:<TD<%if(sortcolumn.equals("EmployeeSearchlevelandclass"))out.print("CLASS=COLCOLOR");%>width="15%"><%=employeeList.getLevelAndClass()%></TD>
Line 33638: 81:<TD<%if(sortcolumn.equals("EmployeeSearchcity"))out.print("CLASS=COLCOLOR");%>width="15%"><%=employeeList.getWorkLocation().getAddress().getCity()%></TD>
Line 33639: 82:<TD<%if(sortcolumn.equals("EmployeeSearchstate"))out.print("CLASS=COLCOLOR");%>width="5%"><%=employeeList.getWorkLocation().getAddress().getState().getName()%></TD>
Line 33640: 83:<TD<%if(sortcolumn.equals("EmployeeSearchworkloc"))out.print("CLASS=COLCOLOR");%>width="10%"><%=employeeList.getWorkLocation().getWorkLocationCode()%></TD>
Line 33657: 75:comparator="<%=com.sbc.jobs.util.employee.EmployeeUtil.EMPLOYEE_COMPARATOR%>">
Line 33659: 77:<TD<%if(sortcolumn.equals("EmployeeSearchssn"))out.print("CLASS=COLCOLOR");%>width="15%"><Ahref="onclick="javascript:selectEmployee('<%=employeeList.getPersonID()%>');"><%=employeeList.getSSN()%></A></TD>
Line 33659: 77:<TD<%if(sortcolumn.equals("EmployeeSearchssn"))out.print("CLASS=COLCOLOR");%>width="15%"><Ahref="onclick="javascript:selectEmployee('<%=employeeList.getPersonID()%>');"><%=employeeList.getSSN()%></A></TD>
Line 33660: 78:<TD<%if(sortcolumn.equals("EmployeeSearchfirstname"))out.print("CLASS=COLCOLOR");%>width="20%"><%=employeeList.getFirstName()%></TD>
Line 33661: 79:<TD<%if(sortcolumn.equals("EmployeeSearchlastname"))out.print("CLASS=COLCOLOR");%>width="20%"><%=employeeList.getLastName()%></TD>
Line 33662: 80:<TD<%if(sortcolumn.equals("EmployeeSearchlevelandclass"))out.print("CLASS=COLCOLOR");%>width="15%"><%=employeeList.getLevelAndClass()%></TD>
Line 33663: 81:<TD<%if(sortcolumn.equals("EmployeeSearchcity"))out.print("CLASS=COLCOLOR");%>width="15%"><%=employeeList.getWorkLocation().getAddress().getCity()%></TD>
Line 33664: 82:<TD<%if(sortcolumn.equals("EmployeeSearchstate"))out.print("CLASS=COLCOLOR");%>width="5%"><%=employeeList.getWorkLocation().getAddress().getState().getName()%></TD>
Line 33665: 83:<TD<%if(sortcolumn.equals("EmployeeSearchworkloc"))out.print("CLASS=COLCOLOR");%>width="10%"><%=employeeList.getWorkLocation().getWorkLocationCode()%></TD>
Line 33684: 86:<%inti=0;%><jobs:iteratecollectionName="<%=com.sbc.jobs.util.JOBSCommonUtils.SBCUID_SEARCH_RESULT_LIST%>"
Line 33688: 90:comparator="<%=com.sbc.jobs.util.application.ApplicationUtil.EMPLOYEE_COMPARATOR%>">
Line 33691: 93:<Ahref="onclick="javascript:OpenProgress('Processing');submitSelection('SBCUIDFindProcessServlet','sbcuid','<%=sbcuidList.getSBCUID()%>','<%=strTargetUrlWindow%>');window.close();returnfalse;"><%=sbcuidList.getSBCUID()%></A></TD>
Line 33691: 93:<Ahref="onclick="javascript:OpenProgress('Processing');submitSelection('SBCUIDFindProcessServlet','sbcuid','<%=sbcuidList.getSBCUID()%>','<%=strTargetUrlWindow%>');window.close();returnfalse;"><%=sbcuidList.getSBCUID()%></A></TD>
Line 33691: 93:<Ahref="onclick="javascript:OpenProgress('Processing');submitSelection('SBCUIDFindProcessServlet','sbcuid','<%=sbcuidList.getSBCUID()%>','<%=strTargetUrlWindow%>');window.close();returnfalse;"><%=sbcuidList.getSBCUID()%></A></TD>
Line 33710: 86:<%inti=0;%><jobs:iteratecollectionName="<%=com.sbc.jobs.util.JOBSCommonUtils.SBCUID_SEARCH_RESULT_LIST%>"
Line 33714: 90:comparator="<%=com.sbc.jobs.util.application.ApplicationUtil.EMPLOYEE_COMPARATOR%>">
Line 33717: 93:<Ahref="onclick="javascript:OpenProgress('Processing');submitSelection('SBCUIDFindProcessServlet','sbcuid','<%=sbcuidList.getSBCUID()%>','<%=strTargetUrlWindow%>');window.close();returnfalse;"><%=sbcuidList.getSBCUID()%></A></TD>
Line 33717: 93:<Ahref="onclick="javascript:OpenProgress('Processing');submitSelection('SBCUIDFindProcessServlet','sbcuid','<%=sbcuidList.getSBCUID()%>','<%=strTargetUrlWindow%>');window.close();returnfalse;"><%=sbcuidList.getSBCUID()%></A></TD>
Line 33717: 93:<Ahref="onclick="javascript:OpenProgress('Processing');submitSelection('SBCUIDFindProcessServlet','sbcuid','<%=sbcuidList.getSBCUID()%>','<%=strTargetUrlWindow%>');window.close();returnfalse;"><%=sbcuidList.getSBCUID()%></A></TD>
Line 33734: 86:<%inti=0;%><jobs:iteratecollectionName="<%=com.sbc.jobs.util.JOBSCommonUtils.SBCUID_SEARCH_RESULT_LIST%>"
Line 33738: 90:comparator="<%=com.sbc.jobs.util.application.ApplicationUtil.EMPLOYEE_COMPARATOR%>">
Line 33741: 93:<Ahref="onclick="javascript:OpenProgress('Processing');submitSelection('SBCUIDFindProcessServlet','sbcuid','<%=sbcuidList.getSBCUID()%>','<%=strTargetUrlWindow%>');window.close();returnfalse;"><%=sbcuidList.getSBCUID()%></A></TD>
Line 33741: 93:<Ahref="onclick="javascript:OpenProgress('Processing');submitSelection('SBCUIDFindProcessServlet','sbcuid','<%=sbcuidList.getSBCUID()%>','<%=strTargetUrlWindow%>');window.close();returnfalse;"><%=sbcuidList.getSBCUID()%></A></TD>
Line 33741: 93:<Ahref="onclick="javascript:OpenProgress('Processing');submitSelection('SBCUIDFindProcessServlet','sbcuid','<%=sbcuidList.getSBCUID()%>','<%=strTargetUrlWindow%>');window.close();returnfalse;"><%=sbcuidList.getSBCUID()%></A></TD>
Line 33759: 86:<%inti=0;%><jobs:iteratecollectionName="<%=com.sbc.jobs.util.JOBSCommonUtils.SBCUID_SEARCH_RESULT_LIST%>"
Line 33763: 90:comparator="<%=com.sbc.jobs.util.application.ApplicationUtil.EMPLOYEE_COMPARATOR%>">
Line 33766: 93:<Ahref="onclick="javascript:OpenProgress('Processing');submitSelection('SBCUIDFindProcessServlet','sbcuid','<%=sbcuidList.getSBCUID()%>','<%=strTargetUrlWindow%>');window.close();returnfalse;"><%=sbcuidList.getSBCUID()%></A></TD>
Line 33766: 93:<Ahref="onclick="javascript:OpenProgress('Processing');submitSelection('SBCUIDFindProcessServlet','sbcuid','<%=sbcuidList.getSBCUID()%>','<%=strTargetUrlWindow%>');window.close();returnfalse;"><%=sbcuidList.getSBCUID()%></A></TD>
Line 33766: 93:<Ahref="onclick="javascript:OpenProgress('Processing');submitSelection('SBCUIDFindProcessServlet','sbcuid','<%=sbcuidList.getSBCUID()%>','<%=strTargetUrlWindow%>');window.close();returnfalse;"><%=sbcuidList.getSBCUID()%></A></TD>
Line 33777: 20:<scripttype="text/javascript"src="<%=request.getContextPath()%>/scripts/spin.js"></script>
Line 33778: 21:<scripttype="text/javascript"src="<%=request.getContextPath()%>/scripts/jquery.js"></script>
Line 33779: 22:<scripttype="text/javascript"src="<%=request.getContextPath()%>/scripts/jqdomwindow.js"></script>
Line 33780: 23:<scripttype="text/javascript"src="<%=request.getContextPath()%>/scripts/menu.js"></script>
Line 33781: 24:<scripttype="text/javascript"src="<%=request.getContextPath()%>/scripts/NMICmenu.js"></script>
Line 33783: 26:<SCRIPTskill="JavaScript"src="<%=request.getContextPath()%>/scripts/qualifications.js"></SCRIPT>
Line 33785: 28:<linktype="text/css"rel="stylesheet"href="<%=request.getContextPath()%>/style/styleEmployee.css"/>
Line 33795: 38:checkedBoxesArray=newArray(<%=session.getAttribute("ESS_checkedBoxes")%>);
Line 33821: 206:<TD><%=ftrList.getFtrid()%></TD>
Line 33822: 207:<TD><%=ftrList.getJobtitle()%>&nbsp;</TD>
Line 33823: 208:<TD><%=ftrList.getWorklocation()%></TD>
Line 33824: 209:<TD><%=ftrList.getSubmissionDateStr()%></TD>
Line 33825: 210:<TD><%=ftrList.getStatus()%></TD>
Line 33826: 211:<TD><%=ftrList.getStatusReason()%></TD>
Line 33846: 206:<TD><%=ftrList.getFtrid()%></TD>
Line 33847: 207:<TD><%=ftrList.getJobtitle()%>&nbsp;</TD>
Line 33848: 208:<TD><%=ftrList.getWorklocation()%></TD>
Line 33849: 209:<TD><%=ftrList.getSubmissionDateStr()%></TD>
Line 33850: 210:<TD><%=ftrList.getStatus()%></TD>
Line 33851: 211:<TD><%=ftrList.getStatusReason()%></TD>
Line 33852: 212:<TD><%=ftrList.getLastChgddateStr()%></TD>
Line 33871: 206:<TD><%=ftrList.getFtrid()%></TD>
Line 33872: 207:<TD><%=ftrList.getJobtitle()%>&nbsp;</TD>
Line 33873: 208:<TD><%=ftrList.getWorklocation()%></TD>
Line 33874: 209:<TD><%=ftrList.getSubmissionDateStr()%></TD>
Line 33875: 210:<TD><%=ftrList.getStatus()%></TD>
Line 33876: 211:<TD><%=ftrList.getStatusReason()%></TD>
Line 33877: 212:<TD><%=ftrList.getLastChgddateStr()%></TD>
Line 33895: 206:<TD><%=ftrList.getFtrid()%></TD>
Line 33896: 207:<TD><%=ftrList.getJobtitle()%>&nbsp;</TD>
Line 33897: 208:<TD><%=ftrList.getWorklocation()%></TD>
Line 33898: 209:<TD><%=ftrList.getSubmissionDateStr()%></TD>
Line 33899: 210:<TD><%=ftrList.getStatus()%></TD>
Line 33900: 211:<TD><%=ftrList.getStatusReason()%></TD>
Line 33901: 212:<TD><%=ftrList.getLastChgddateStr()%></TD>
Line 33920: 206:<TD><%=ftrList.getFtrid()%></TD>
Line 33921: 207:<TD><%=ftrList.getJobtitle()%>&nbsp;</TD>
Line 33922: 208:<TD><%=ftrList.getWorklocation()%></TD>
Line 33923: 209:<TD><%=ftrList.getSubmissionDateStr()%></TD>
Line 33924: 210:<TD><%=ftrList.getStatus()%></TD>
Line 33925: 211:<TD><%=ftrList.getStatusReason()%></TD>
Line 33926: 212:<TD><%=ftrList.getLastChgddateStr()%></TD>
Line 33935: 25:<TD><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefMaintSortingServlet?sortField=<%=JobBriefUtil.JOBBRIEF_TEXT_SEQUENCE_NUM_SORTFIELD%>">Seq</A></TD>
Line 33935: 25:<TD><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefMaintSortingServlet?sortField=<%=JobBriefUtil.JOBBRIEF_TEXT_SEQUENCE_NUM_SORTFIELD%>">Seq</A></TD>
Line 33936: 26:<TD><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefMaintSortingServlet?sortField=<%=JobBriefUtil.JOBBRIEF_TEXT_TYPE_SORTFIELD%>">TextType</A></TD>
Line 33936: 26:<TD><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefMaintSortingServlet?sortField=<%=JobBriefUtil.JOBBRIEF_TEXT_TYPE_SORTFIELD%>">TextType</A></TD>
Line 33937: 27:<TD><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefMaintSortingServlet?sortField=<%=JobBriefUtil.JOBBRIEF_TEXT_EFFECTIVE_DATE_SORTFIELD%>">EffectiveDate</A></TD>
Line 33937: 27:<TD><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefMaintSortingServlet?sortField=<%=JobBriefUtil.JOBBRIEF_TEXT_EFFECTIVE_DATE_SORTFIELD%>">EffectiveDate</A></TD>
Line 33938: 28:<TD><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefMaintSortingServlet?sortField=<%=JobBriefUtil.JOBBRIEF_TEXT_INACTIVE_DATE_SORTFIELD%>">InactiveDate</A></TD>
Line 33938: 28:<TD><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefMaintSortingServlet?sortField=<%=JobBriefUtil.JOBBRIEF_TEXT_INACTIVE_DATE_SORTFIELD%>">InactiveDate</A></TD>
Line 33939: 29:<TD><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefMaintSortingServlet?sortField=<%=JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD%>">JobBriefText</A></TD>
Line 33939: 29:<TD><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefMaintSortingServlet?sortField=<%=JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD%>">JobBriefText</A></TD>
Line 33947: 37:comparator="<%=JobBriefUtil.JOBBRIEF_TEXT_COMPARATOR%>">
Line 33948: 38:<TRid='<%=(i%2==0?"IFRAMEBODY":"DOCBODY")%>'>
Line 33949: 39:<TDalign="center"valign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_SEQUENCE_NUM_SORTFIELD)?"CLASS=COLCOLOR":")%>><%=jobBriefText.getJobBriefTextType().getSequenceNumber()%></TD></a>
Line 33949: 39:<TDalign="center"valign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_SEQUENCE_NUM_SORTFIELD)?"CLASS=COLCOLOR":")%>><%=jobBriefText.getJobBriefTextType().getSequenceNumber()%></TD></a>
Line 33951: 41:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TYPE_SORTFIELD)?"CLASS=COLCOLOR":")%>><ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefTextMaintLoadServlet?jobBriefTextID=<%=jobBriefText.getJobBriefTextID()%>"target="bodyFrame"><%=JobsUtilServlet.formatStringForDisplay(jobBriefText.getJobBriefTextType().getName())%></TD></a>
Line 33951: 41:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TYPE_SORTFIELD)?"CLASS=COLCOLOR":")%>><ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefTextMaintLoadServlet?jobBriefTextID=<%=jobBriefText.getJobBriefTextID()%>"target="bodyFrame"><%=JobsUtilServlet.formatStringForDisplay(jobBriefText.getJobBriefTextType().getName())%></TD></a>
Line 33951: 41:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TYPE_SORTFIELD)?"CLASS=COLCOLOR":")%>><ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefTextMaintLoadServlet?jobBriefTextID=<%=jobBriefText.getJobBriefTextID()%>"target="bodyFrame"><%=JobsUtilServlet.formatStringForDisplay(jobBriefText.getJobBriefTextType().getName())%></TD></a>
Line 33951: 41:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TYPE_SORTFIELD)?"CLASS=COLCOLOR":")%>><ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefTextMaintLoadServlet?jobBriefTextID=<%=jobBriefText.getJobBriefTextID()%>"target="bodyFrame"><%=JobsUtilServlet.formatStringForDisplay(jobBriefText.getJobBriefTextType().getName())%></TD></a>
Line 33953: 43:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TYPE_SORTFIELD)?"CLASS=COLCOLOR":")%>><%=JobsUtilServlet.formatStringForDisplay(jobBriefText.getJobBriefTextType().getName())%></TD>
Line 33953: 43:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TYPE_SORTFIELD)?"CLASS=COLCOLOR":")%>><%=JobsUtilServlet.formatStringForDisplay(jobBriefText.getJobBriefTextType().getName())%></TD>
Line 33955: 45:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_EFFECTIVE_DATE_SORTFIELD)?"CLASS=COLCOLOR":")%>><%=JobsUtilServlet.formatDateForDisplay(jobBriefText.getEffectiveDate())%></TD>
Line 33955: 45:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_EFFECTIVE_DATE_SORTFIELD)?"CLASS=COLCOLOR":")%>><%=JobsUtilServlet.formatDateForDisplay(jobBriefText.getEffectiveDate())%></TD>
Line 33956: 46:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_INACTIVE_DATE_SORTFIELD)?"CLASS=COLCOLOR":")%>><%=JobsUtilServlet.formatDateForDisplay(jobBriefText.getInactiveDate())%></TD>
Line 33956: 46:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_INACTIVE_DATE_SORTFIELD)?"CLASS=COLCOLOR":")%>><%=JobsUtilServlet.formatDateForDisplay(jobBriefText.getInactiveDate())%></TD>
Line 33959: 25:<TD><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefMaintSortingServlet?sortField=<%=JobBriefUtil.JOBBRIEF_TEXT_SEQUENCE_NUM_SORTFIELD%>">Seq</A></TD>
Line 33959: 25:<TD><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefMaintSortingServlet?sortField=<%=JobBriefUtil.JOBBRIEF_TEXT_SEQUENCE_NUM_SORTFIELD%>">Seq</A></TD>
Line 33960: 26:<TD><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefMaintSortingServlet?sortField=<%=JobBriefUtil.JOBBRIEF_TEXT_TYPE_SORTFIELD%>">TextType</A></TD>
Line 33960: 26:<TD><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefMaintSortingServlet?sortField=<%=JobBriefUtil.JOBBRIEF_TEXT_TYPE_SORTFIELD%>">TextType</A></TD>
Line 33961: 27:<TD><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefMaintSortingServlet?sortField=<%=JobBriefUtil.JOBBRIEF_TEXT_EFFECTIVE_DATE_SORTFIELD%>">EffectiveDate</A></TD>
Line 33961: 27:<TD><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefMaintSortingServlet?sortField=<%=JobBriefUtil.JOBBRIEF_TEXT_EFFECTIVE_DATE_SORTFIELD%>">EffectiveDate</A></TD>
Line 33962: 28:<TD><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefMaintSortingServlet?sortField=<%=JobBriefUtil.JOBBRIEF_TEXT_INACTIVE_DATE_SORTFIELD%>">InactiveDate</A></TD>
Line 33962: 28:<TD><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefMaintSortingServlet?sortField=<%=JobBriefUtil.JOBBRIEF_TEXT_INACTIVE_DATE_SORTFIELD%>">InactiveDate</A></TD>
Line 33963: 29:<TD><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefMaintSortingServlet?sortField=<%=JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD%>">JobBriefText</A></TD>
Line 33963: 29:<TD><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefMaintSortingServlet?sortField=<%=JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD%>">JobBriefText</A></TD>
Line 33971: 37:comparator="<%=JobBriefUtil.JOBBRIEF_TEXT_COMPARATOR%>">
Line 33972: 38:<TRid='<%=(i%2==0?"IFRAMEBODY":"DOCBODY")%>'>
Line 33973: 39:<TDalign="center"valign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_SEQUENCE_NUM_SORTFIELD)?"CLASS=COLCOLOR":")%>><%=jobBriefText.getJobBriefTextType().getSequenceNumber()%></TD></a>
Line 33973: 39:<TDalign="center"valign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_SEQUENCE_NUM_SORTFIELD)?"CLASS=COLCOLOR":")%>><%=jobBriefText.getJobBriefTextType().getSequenceNumber()%></TD></a>
Line 33975: 41:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TYPE_SORTFIELD)?"CLASS=COLCOLOR":")%>><ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefTextMaintLoadServlet?jobBriefTextID=<%=jobBriefText.getJobBriefTextID()%>"target="bodyFrame"><%=JobsUtilServlet.formatStringForDisplay(jobBriefText.getJobBriefTextType().getName())%></TD></a>
Line 33975: 41:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TYPE_SORTFIELD)?"CLASS=COLCOLOR":")%>><ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefTextMaintLoadServlet?jobBriefTextID=<%=jobBriefText.getJobBriefTextID()%>"target="bodyFrame"><%=JobsUtilServlet.formatStringForDisplay(jobBriefText.getJobBriefTextType().getName())%></TD></a>
Line 33975: 41:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TYPE_SORTFIELD)?"CLASS=COLCOLOR":")%>><ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefTextMaintLoadServlet?jobBriefTextID=<%=jobBriefText.getJobBriefTextID()%>"target="bodyFrame"><%=JobsUtilServlet.formatStringForDisplay(jobBriefText.getJobBriefTextType().getName())%></TD></a>
Line 33975: 41:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TYPE_SORTFIELD)?"CLASS=COLCOLOR":")%>><ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefTextMaintLoadServlet?jobBriefTextID=<%=jobBriefText.getJobBriefTextID()%>"target="bodyFrame"><%=JobsUtilServlet.formatStringForDisplay(jobBriefText.getJobBriefTextType().getName())%></TD></a>
Line 33977: 43:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TYPE_SORTFIELD)?"CLASS=COLCOLOR":")%>><%=JobsUtilServlet.formatStringForDisplay(jobBriefText.getJobBriefTextType().getName())%></TD>
Line 33977: 43:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TYPE_SORTFIELD)?"CLASS=COLCOLOR":")%>><%=JobsUtilServlet.formatStringForDisplay(jobBriefText.getJobBriefTextType().getName())%></TD>
Line 33979: 45:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_EFFECTIVE_DATE_SORTFIELD)?"CLASS=COLCOLOR":")%>><%=JobsUtilServlet.formatDateForDisplay(jobBriefText.getEffectiveDate())%></TD>
Line 33979: 45:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_EFFECTIVE_DATE_SORTFIELD)?"CLASS=COLCOLOR":")%>><%=JobsUtilServlet.formatDateForDisplay(jobBriefText.getEffectiveDate())%></TD>
Line 33980: 46:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_INACTIVE_DATE_SORTFIELD)?"CLASS=COLCOLOR":")%>><%=JobsUtilServlet.formatDateForDisplay(jobBriefText.getInactiveDate())%></TD>
Line 33980: 46:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_INACTIVE_DATE_SORTFIELD)?"CLASS=COLCOLOR":")%>><%=JobsUtilServlet.formatDateForDisplay(jobBriefText.getInactiveDate())%></TD>
Line 33981: 47:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD)?"CLASS=COLCOLOR":")%>><PREID="<%=(i%2==0?"IFRAMEBODY":"DOCBODY")%>"><%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD)?"<DIVCLASS=COLCOLOR>":")%><%=JobsUtilServlet.formatStringForDisplay(jobBriefText.getLongText())%><%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD)?"</DIV>":")%></PRE></TD>
Line 33981: 47:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD)?"CLASS=COLCOLOR":")%>><PREID="<%=(i%2==0?"IFRAMEBODY":"DOCBODY")%>"><%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD)?"<DIVCLASS=COLCOLOR>":")%><%=JobsUtilServlet.formatStringForDisplay(jobBriefText.getLongText())%><%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD)?"</DIV>":")%></PRE></TD>
Line 33981: 47:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD)?"CLASS=COLCOLOR":")%>><PREID="<%=(i%2==0?"IFRAMEBODY":"DOCBODY")%>"><%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD)?"<DIVCLASS=COLCOLOR>":")%><%=JobsUtilServlet.formatStringForDisplay(jobBriefText.getLongText())%><%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD)?"</DIV>":")%></PRE></TD>
Line 33981: 47:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD)?"CLASS=COLCOLOR":")%>><PREID="<%=(i%2==0?"IFRAMEBODY":"DOCBODY")%>"><%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD)?"<DIVCLASS=COLCOLOR>":")%><%=JobsUtilServlet.formatStringForDisplay(jobBriefText.getLongText())%><%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD)?"</DIV>":")%></PRE></TD>
Line 33981: 47:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD)?"CLASS=COLCOLOR":")%>><PREID="<%=(i%2==0?"IFRAMEBODY":"DOCBODY")%>"><%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD)?"<DIVCLASS=COLCOLOR>":")%><%=JobsUtilServlet.formatStringForDisplay(jobBriefText.getLongText())%><%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD)?"</DIV>":")%></PRE></TD>
Line 33984: "28:<TD><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefMaintSortingServlet?sortField=<%=JobBriefUtil.JOBBRIEF_TEXT_INACTIVE_DATE_SORTFIELD%>">InactiveDate</A></TD>
Line 33984: "28:<TD><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefMaintSortingServlet?sortField=<%=JobBriefUtil.JOBBRIEF_TEXT_INACTIVE_DATE_SORTFIELD%>">InactiveDate</A></TD>
Line 33985: 29:<TD><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefMaintSortingServlet?sortField=<%=JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD%>">JobBriefText</A></TD>
Line 33985: 29:<TD><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefMaintSortingServlet?sortField=<%=JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD%>">JobBriefText</A></TD>
Line 33993: 37:comparator="<%=JobBriefUtil.JOBBRIEF_TEXT_COMPARATOR%>">
Line 33994: 38:<TRid='<%=(i%2==0?"IFRAMEBODY":"DOCBODY")%>'>
Line 33995: 39:<TDalign="center"valign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_SEQUENCE_NUM_SORTFIELD)?"CLASS=COLCOLOR":")%>><%=jobBriefText.getJobBriefTextType().getSequenceNumber()%></TD></a>
Line 33995: 39:<TDalign="center"valign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_SEQUENCE_NUM_SORTFIELD)?"CLASS=COLCOLOR":")%>><%=jobBriefText.getJobBriefTextType().getSequenceNumber()%></TD></a>
Line 33997: 41:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TYPE_SORTFIELD)?"CLASS=COLCOLOR":")%>><ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefTextMaintLoadServlet?jobBriefTextID=<%=jobBriefText.getJobBriefTextID()%>"target="bodyFrame"><%=JobsUtilServlet.formatStringForDisplay(jobBriefText.getJobBriefTextType().getName())%></TD></a>
Line 33997: 41:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TYPE_SORTFIELD)?"CLASS=COLCOLOR":")%>><ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefTextMaintLoadServlet?jobBriefTextID=<%=jobBriefText.getJobBriefTextID()%>"target="bodyFrame"><%=JobsUtilServlet.formatStringForDisplay(jobBriefText.getJobBriefTextType().getName())%></TD></a>
Line 33997: 41:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TYPE_SORTFIELD)?"CLASS=COLCOLOR":")%>><ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefTextMaintLoadServlet?jobBriefTextID=<%=jobBriefText.getJobBriefTextID()%>"target="bodyFrame"><%=JobsUtilServlet.formatStringForDisplay(jobBriefText.getJobBriefTextType().getName())%></TD></a>
Line 33997: 41:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TYPE_SORTFIELD)?"CLASS=COLCOLOR":")%>><ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefTextMaintLoadServlet?jobBriefTextID=<%=jobBriefText.getJobBriefTextID()%>"target="bodyFrame"><%=JobsUtilServlet.formatStringForDisplay(jobBriefText.getJobBriefTextType().getName())%></TD></a>
Line 33999: 43:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TYPE_SORTFIELD)?"CLASS=COLCOLOR":")%>><%=JobsUtilServlet.formatStringForDisplay(jobBriefText.getJobBriefTextType().getName())%></TD>
Line 33999: 43:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TYPE_SORTFIELD)?"CLASS=COLCOLOR":")%>><%=JobsUtilServlet.formatStringForDisplay(jobBriefText.getJobBriefTextType().getName())%></TD>
Line 34001: 45:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_EFFECTIVE_DATE_SORTFIELD)?"CLASS=COLCOLOR":")%>><%=JobsUtilServlet.formatDateForDisplay(jobBriefText.getEffectiveDate())%></TD>
Line 34001: 45:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_EFFECTIVE_DATE_SORTFIELD)?"CLASS=COLCOLOR":")%>><%=JobsUtilServlet.formatDateForDisplay(jobBriefText.getEffectiveDate())%></TD>
Line 34002: 46:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_INACTIVE_DATE_SORTFIELD)?"CLASS=COLCOLOR":")%>><%=JobsUtilServlet.formatDateForDisplay(jobBriefText.getInactiveDate())%></TD>
Line 34002: 46:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_INACTIVE_DATE_SORTFIELD)?"CLASS=COLCOLOR":")%>><%=JobsUtilServlet.formatDateForDisplay(jobBriefText.getInactiveDate())%></TD>
Line 34003: 47:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD)?"CLASS=COLCOLOR":")%>><PREID="<%=(i%2==0?"IFRAMEBODY":"DOCBODY")%>"><%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD)?"<DIVCLASS=COLCOLOR>":")%><%=JobsUtilServlet.formatStringForDisplay(jobBriefText.getLongText())%><%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD)?"</DIV>":")%></PRE></TD>
Line 34003: 47:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD)?"CLASS=COLCOLOR":")%>><PREID="<%=(i%2==0?"IFRAMEBODY":"DOCBODY")%>"><%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD)?"<DIVCLASS=COLCOLOR>":")%><%=JobsUtilServlet.formatStringForDisplay(jobBriefText.getLongText())%><%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD)?"</DIV>":")%></PRE></TD>
Line 34003: 47:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD)?"CLASS=COLCOLOR":")%>><PREID="<%=(i%2==0?"IFRAMEBODY":"DOCBODY")%>"><%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD)?"<DIVCLASS=COLCOLOR>":")%><%=JobsUtilServlet.formatStringForDisplay(jobBriefText.getLongText())%><%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD)?"</DIV>":")%></PRE></TD>
Line 34003: 47:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD)?"CLASS=COLCOLOR":")%>><PREID="<%=(i%2==0?"IFRAMEBODY":"DOCBODY")%>"><%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD)?"<DIVCLASS=COLCOLOR>":")%><%=JobsUtilServlet.formatStringForDisplay(jobBriefText.getLongText())%><%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD)?"</DIV>":")%></PRE></TD>
Line 34003: 47:<TDvalign="top"<%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD)?"CLASS=COLCOLOR":")%>><PREID="<%=(i%2==0?"IFRAMEBODY":"DOCBODY")%>"><%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD)?"<DIVCLASS=COLCOLOR>":")%><%=JobsUtilServlet.formatStringForDisplay(jobBriefText.getLongText())%><%=(sortcolumn.equals(JobBriefUtil.JOBBRIEF_TEXT_TEXT_SORTFIELD)?"</DIV>":")%></PRE></TD>
Line 34029: 25:<tdcolspan="2"><jobs:JobBriefShowIframeHeadersearchType="<%=String.valueOf(JOBBRIEF_SEARCH_RESULTS_MEMENTO.getSearchType())%>"searchCriteria="<%=JOBBRIEF_SEARCH_RESULTS_MEMENTO.getCriteria()%>"/></td>
Line 34029: 25:<tdcolspan="2"><jobs:JobBriefShowIframeHeadersearchType="<%=String.valueOf(JOBBRIEF_SEARCH_RESULTS_MEMENTO.getSearchType())%>"searchCriteria="<%=JOBBRIEF_SEARCH_RESULTS_MEMENTO.getCriteria()%>"/></td>
Line 34031: 27:<jobs:conditionshow="<%=JobBriefUtil.AIT_LABOR_SITE!=null%>">
Line 34032: 28:<AHREF="<%=JobBriefUtil.AIT_LABOR_SITE%>"target="top"><%=JobBriefUtil.AIT_LABOR_SITE_LINK_NAME%></A>
Line 34032: 28:<AHREF="<%=JobBriefUtil.AIT_LABOR_SITE%>"target="top"><%=JobBriefUtil.AIT_LABOR_SITE_LINK_NAME%></A>
Line 34052: 25:<tdcolspan="2"><jobs:JobBriefShowIframeHeadersearchType="<%=String.valueOf(JOBBRIEF_SEARCH_RESULTS_MEMENTO.getSearchType())%>"searchCriteria="<%=JOBBRIEF_SEARCH_RESULTS_MEMENTO.getCriteria()%>"/></td>
Line 34052: 25:<tdcolspan="2"><jobs:JobBriefShowIframeHeadersearchType="<%=String.valueOf(JOBBRIEF_SEARCH_RESULTS_MEMENTO.getSearchType())%>"searchCriteria="<%=JOBBRIEF_SEARCH_RESULTS_MEMENTO.getCriteria()%>"/></td>
Line 34054: 27:<jobs:conditionshow="<%=JobBriefUtil.AIT_LABOR_SITE!=null%>">
Line 34055: 28:<AHREF="<%=JobBriefUtil.AIT_LABOR_SITE%>"target="top"><%=JobBriefUtil.AIT_LABOR_SITE_LINK_NAME%></A>
Line 34055: 28:<AHREF="<%=JobBriefUtil.AIT_LABOR_SITE%>"target="top"><%=JobBriefUtil.AIT_LABOR_SITE_LINK_NAME%></A>
Line 34078: 25:<tdcolspan="2"><jobs:JobBriefShowIframeHeadersearchType="<%=String.valueOf(JOBBRIEF_SEARCH_RESULTS_MEMENTO.getSearchType())%>"searchCriteria="<%=JOBBRIEF_SEARCH_RESULTS_MEMENTO.getCriteria()%>"/></td>
Line 34078: 25:<tdcolspan="2"><jobs:JobBriefShowIframeHeadersearchType="<%=String.valueOf(JOBBRIEF_SEARCH_RESULTS_MEMENTO.getSearchType())%>"searchCriteria="<%=JOBBRIEF_SEARCH_RESULTS_MEMENTO.getCriteria()%>"/></td>
Line 34080: 27:<jobs:conditionshow="<%=JobBriefUtil.AIT_LABOR_SITE!=null%>">
Line 34081: 28:<AHREF="<%=JobBriefUtil.AIT_LABOR_SITE%>"target="top"><%=JobBriefUtil.AIT_LABOR_SITE_LINK_NAME%></A>
Line 34081: 28:<AHREF="<%=JobBriefUtil.AIT_LABOR_SITE%>"target="top"><%=JobBriefUtil.AIT_LABOR_SITE_LINK_NAME%></A>
Line 34088: "34:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.AIT_REGIONID%>&sortField=jobTitleName">JobTitleName</A></td>
Line 34088: "34:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.AIT_REGIONID%>&sortField=jobTitleName">JobTitleName</A></td>
Line 34089: 35:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.AIT_REGIONID%>&sortField=TOA">TOA</A></td>
Line 34089: 35:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.AIT_REGIONID%>&sortField=TOA">TOA</A></td>
Line 34097: 43:comparator="<%=JobBriefUtil.JOBBRIEF_COMPARATOR%>">
Line 34099: 45:<td><inputtype="radio"name="jobTitleID"value="<%=jobbrief.getJobTitle().getJobTitleID()%>">
Line 34107: 53:<td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenProgress('Searching');OpenScrollablePopup('<%=targetUrl%>');"><%=jobbrief.getJobTitle().getDescription()%></a></td>
Line 34107: 53:<td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenProgress('Searching');OpenScrollablePopup('<%=targetUrl%>');"><%=jobbrief.getJobTitle().getDescription()%></a></td>
Line 34107: 53:<td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenProgress('Searching');OpenScrollablePopup('<%=targetUrl%>');"><%=jobbrief.getJobTitle().getDescription()%></a></td>
Line 34108: 54:<td<%=(sortcolumn.equals("TOA")?"CLASS=COLCOLOR":")%>>
Line 34109: 55:<jobs:conditionshow="<%=jobbrief.getJobTitleLaborUnion().getToaMonths()!=0%>">
Line 34110: 56:<%=jobbrief.getJobTitleLaborUnion().getToaMonths()%>months
Line 34133: 24:<tdcolspan="2"nowrap><jobs:JobBriefShowIframeHeadersearchType="<%=String.valueOf(JOBBRIEF_SEARCH_RESULTS_MEMENTO.getSearchType())%>"searchCriteria="<%=JOBBRIEF_SEARCH_RESULTS_MEMENTO.getCriteria()%>"/></td>
Line 34133: 24:<tdcolspan="2"nowrap><jobs:JobBriefShowIframeHeadersearchType="<%=String.valueOf(JOBBRIEF_SEARCH_RESULTS_MEMENTO.getSearchType())%>"searchCriteria="<%=JOBBRIEF_SEARCH_RESULTS_MEMENTO.getCriteria()%>"/></td>
Line 34135: 26:<jobs:conditionshow="<%=JobBriefUtil.DGA_LABOR_SITE!=null%>">
Line 34136: 27:<AHREF="<%=JobBriefUtil.DGA_LABOR_SITE%>"target="top">SBCDGARegionNon-ManagementStaffingWebSite</a>
Line 34140: "36:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.DGA_REGIONID%>&sortField=minimumPay">MinimumPay</A></td>
Line 34140: "36:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.DGA_REGIONID%>&sortField=minimumPay">MinimumPay</A></td>
Line 34141: 37:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.DGA_REGIONID%>&sortField=maximumPay">MaximumPay</A></td>
Line 34141: 37:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.DGA_REGIONID%>&sortField=maximumPay">MaximumPay</A></td>
Line 34142: 38:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.DGA_REGIONID%>&sortField=TNTTNL">TNT/TNL</A></td>
Line 34142: 38:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.DGA_REGIONID%>&sortField=TNTTNL">TNT/TNL</A></td>
Line 34150: 46:comparator="<%=JobBriefUtil.JOBBRIEF_COMPARATOR%>">
Line 34152: 48:<td><inputtype="radio"name="jobTitleID"value="<%=jobbrief.getJobTitle().getJobTitleID()%>">
Line 34159: 55:<td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenProgress('Searching');OpenScrollablePopup('<%=targetUrl%>')"><%=jobbrief.getJobTitle().getDescription()%></a></td>
Line 34159: 55:<td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenProgress('Searching');OpenScrollablePopup('<%=targetUrl%>')"><%=jobbrief.getJobTitle().getDescription()%></a></td>
Line 34159: 55:<td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenProgress('Searching');OpenScrollablePopup('<%=targetUrl%>')"><%=jobbrief.getJobTitle().getDescription()%></a></td>
Line 34160: 56:<td<%=(sortcolumn.equals("wageScheduleCode")?"CLASS=COLCOLOR":")%>><%=jobbrief.getPayScaleArea().getPayScaleAreaName()%>
Line 34160: 56:<td<%=(sortcolumn.equals("wageScheduleCode")?"CLASS=COLCOLOR":")%>><%=jobbrief.getPayScaleArea().getPayScaleAreaName()%>
Line 34166: "37:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.DGA_REGIONID%>&sortField=maximumPay">MaximumPay</A></td>
Line 34166: "37:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.DGA_REGIONID%>&sortField=maximumPay">MaximumPay</A></td>
Line 34167: 38:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.DGA_REGIONID%>&sortField=TNTTNL">TNT/TNL</A></td>
Line 34167: 38:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.DGA_REGIONID%>&sortField=TNTTNL">TNT/TNL</A></td>
Line 34175: 46:comparator="<%=JobBriefUtil.JOBBRIEF_COMPARATOR%>">
Line 34177: 48:<td><inputtype="radio"name="jobTitleID"value="<%=jobbrief.getJobTitle().getJobTitleID()%>">
Line 34184: 55:<td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenProgress('Searching');OpenScrollablePopup('<%=targetUrl%>')"><%=jobbrief.getJobTitle().getDescription()%></a></td>
Line 34184: 55:<td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenProgress('Searching');OpenScrollablePopup('<%=targetUrl%>')"><%=jobbrief.getJobTitle().getDescription()%></a></td>
Line 34184: 55:<td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenProgress('Searching');OpenScrollablePopup('<%=targetUrl%>')"><%=jobbrief.getJobTitle().getDescription()%></a></td>
Line 34185: 56:<td<%=(sortcolumn.equals("wageScheduleCode")?"CLASS=COLCOLOR":")%>><%=jobbrief.getPayScaleArea().getPayScaleAreaName()%>
Line 34185: 56:<td<%=(sortcolumn.equals("wageScheduleCode")?"CLASS=COLCOLOR":")%>><%=jobbrief.getPayScaleArea().getPayScaleAreaName()%>
Line 34211: 25:<tdcolspan="3"><jobs:JobBriefShowIframeHeadersearchType="<%=String.valueOf(JOBBRIEF_SEARCH_RESULTS_MEMENTO.getSearchType())%>"searchCriteria="<%=JOBBRIEF_SEARCH_RESULTS_MEMENTO.getCriteria()%>"/></td>
Line 34211: 25:<tdcolspan="3"><jobs:JobBriefShowIframeHeadersearchType="<%=String.valueOf(JOBBRIEF_SEARCH_RESULTS_MEMENTO.getSearchType())%>"searchCriteria="<%=JOBBRIEF_SEARCH_RESULTS_MEMENTO.getCriteria()%>"/></td>
Line 34213: 27:<jobs:conditionshow="<%=JobBriefUtil.PAC_LABOR_SITE!=null%>">
Line 34214: 28:<AHREF="<%=JobBriefUtil.PAC_LABOR_SITE%>"target="top">PACLaborWebsite</a>
Line 34218: "36:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.PAC_REGIONID%>&sortField=wageScheduleCode">WageSchedule</A></td>
Line 34218: "36:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.PAC_REGIONID%>&sortField=wageScheduleCode">WageSchedule</A></td>
Line 34219: 37:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.PAC_REGIONID%>&sortField=TNTTNL">TNT/TNL</A></td>
Line 34219: 37:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.PAC_REGIONID%>&sortField=TNTTNL">TNT/TNL</A></td>
Line 34227: 45:comparator="<%=JobBriefUtil.JOBBRIEF_COMPARATOR%>">
Line 34229: 47:<td><inputtype="radio"name="jobTitleID"value="<%=jobbrief.getJobTitle().getJobTitleID()%>">
Line 34237: 55:<td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('<%=targetUrl%>')"><%=jobbrief.getJobTitle().getDescription()%></a></td><td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('\JOBS\<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefViewDetailsServlet"><%=jobbrief.getJobTitle().getDescription()%></a></td>
Line 34237: 55:<td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('<%=targetUrl%>')"><%=jobbrief.getJobTitle().getDescription()%></a></td><td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('\JOBS\<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefViewDetailsServlet"><%=jobbrief.getJobTitle().getDescription()%></a></td>
Line 34237: 55:<td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('<%=targetUrl%>')"><%=jobbrief.getJobTitle().getDescription()%></a></td><td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('\JOBS\<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefViewDetailsServlet"><%=jobbrief.getJobTitle().getDescription()%></a></td>
Line 34237: 55:<td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('<%=targetUrl%>')"><%=jobbrief.getJobTitle().getDescription()%></a></td><td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('\JOBS\<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefViewDetailsServlet"><%=jobbrief.getJobTitle().getDescription()%></a></td>
Line 34237: 55:<td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('<%=targetUrl%>')"><%=jobbrief.getJobTitle().getDescription()%></a></td><td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('\JOBS\<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefViewDetailsServlet"><%=jobbrief.getJobTitle().getDescription()%></a></td>
Line 34237: 55:<td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('<%=targetUrl%>')"><%=jobbrief.getJobTitle().getDescription()%></a></td><td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('\JOBS\<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefViewDetailsServlet"><%=jobbrief.getJobTitle().getDescription()%></a></td>
Line 34238: 56:<td<%=(sortcolumn.equals("wageScheduleCode")?"CLASS=COLCOLOR":")%>><%=jobbrief.getPayScaleArea().getPayScaleArea()%></td>
Line 34238: 56:<td<%=(sortcolumn.equals("wageScheduleCode")?"CLASS=COLCOLOR":")%>><%=jobbrief.getPayScaleArea().getPayScaleArea()%></td>
Line 34239: 57:<td<%=(sortcolumn.equals("TNTTNL")?"CLASS=COLCOLOR":")%>><%=jobbrief.getJobTitleLaborUnion().getTntMonths()%>/<%=jobbrief.getJobTitleLaborUnion().getTnlMonths()%>months</td>
Line 34239: 57:<td<%=(sortcolumn.equals("TNTTNL")?"CLASS=COLCOLOR":")%>><%=jobbrief.getJobTitleLaborUnion().getTntMonths()%>/<%=jobbrief.getJobTitleLaborUnion().getTnlMonths()%>months</td>
Line 34239: 57:<td<%=(sortcolumn.equals("TNTTNL")?"CLASS=COLCOLOR":")%>><%=jobbrief.getJobTitleLaborUnion().getTntMonths()%>/<%=jobbrief.getJobTitleLaborUnion().getTnlMonths()%>months</td>
Line 34244: "36:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.PAC_REGIONID%>&sortField=wageScheduleCode">WageSchedule</A></td>
Line 34244: "36:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.PAC_REGIONID%>&sortField=wageScheduleCode">WageSchedule</A></td>
Line 34245: 37:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.PAC_REGIONID%>&sortField=TNTTNL">TNT/TNL</A></td>
Line 34245: 37:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.PAC_REGIONID%>&sortField=TNTTNL">TNT/TNL</A></td>
Line 34253: 45:comparator="<%=JobBriefUtil.JOBBRIEF_COMPARATOR%>">
Line 34255: 47:<td><inputtype="radio"name="jobTitleID"value="<%=jobbrief.getJobTitle().getJobTitleID()%>">
Line 34263: 55:<td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('<%=targetUrl%>')"><%=jobbrief.getJobTitle().getDescription()%></a></td><td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('\JOBS\<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefViewDetailsServlet"><%=jobbrief.getJobTitle().getDescription()%></a></td>
Line 34263: 55:<td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('<%=targetUrl%>')"><%=jobbrief.getJobTitle().getDescription()%></a></td><td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('\JOBS\<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefViewDetailsServlet"><%=jobbrief.getJobTitle().getDescription()%></a></td>
Line 34263: 55:<td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('<%=targetUrl%>')"><%=jobbrief.getJobTitle().getDescription()%></a></td><td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('\JOBS\<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefViewDetailsServlet"><%=jobbrief.getJobTitle().getDescription()%></a></td>
Line 34263: 55:<td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('<%=targetUrl%>')"><%=jobbrief.getJobTitle().getDescription()%></a></td><td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('\JOBS\<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefViewDetailsServlet"><%=jobbrief.getJobTitle().getDescription()%></a></td>
Line 34263: 55:<td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('<%=targetUrl%>')"><%=jobbrief.getJobTitle().getDescription()%></a></td><td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('\JOBS\<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefViewDetailsServlet"><%=jobbrief.getJobTitle().getDescription()%></a></td>
Line 34263: 55:<td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('<%=targetUrl%>')"><%=jobbrief.getJobTitle().getDescription()%></a></td><td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('\JOBS\<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefViewDetailsServlet"><%=jobbrief.getJobTitle().getDescription()%></a></td>
Line 34264: 56:<td<%=(sortcolumn.equals("wageScheduleCode")?"CLASS=COLCOLOR":")%>><%=jobbrief.getPayScaleArea().getPayScaleArea()%></td>
Line 34264: 56:<td<%=(sortcolumn.equals("wageScheduleCode")?"CLASS=COLCOLOR":")%>><%=jobbrief.getPayScaleArea().getPayScaleArea()%></td>
Line 34265: 57:<td<%=(sortcolumn.equals("TNTTNL")?"CLASS=COLCOLOR":")%>><%=jobbrief.getJobTitleLaborUnion().getTntMonths()%>/<%=jobbrief.getJobTitleLaborUnion().getTnlMonths()%>months</td>
Line 34265: 57:<td<%=(sortcolumn.equals("TNTTNL")?"CLASS=COLCOLOR":")%>><%=jobbrief.getJobTitleLaborUnion().getTntMonths()%>/<%=jobbrief.getJobTitleLaborUnion().getTnlMonths()%>months</td>
Line 34265: 57:<td<%=(sortcolumn.equals("TNTTNL")?"CLASS=COLCOLOR":")%>><%=jobbrief.getJobTitleLaborUnion().getTntMonths()%>/<%=jobbrief.getJobTitleLaborUnion().getTnlMonths()%>months</td>
Line 34270: "37:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.PAC_REGIONID%>&sortField=TNTTNL">TNT/TNL</A></td>
Line 34270: "37:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.PAC_REGIONID%>&sortField=TNTTNL">TNT/TNL</A></td>
Line 34278: 45:comparator="<%=JobBriefUtil.JOBBRIEF_COMPARATOR%>">
Line 34280: 47:<td><inputtype="radio"name="jobTitleID"value="<%=jobbrief.getJobTitle().getJobTitleID()%>">
Line 34288: 55:<td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('<%=targetUrl%>')"><%=jobbrief.getJobTitle().getDescription()%></a></td><td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('\JOBS\<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefViewDetailsServlet"><%=jobbrief.getJobTitle().getDescription()%></a></td>
Line 34288: 55:<td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('<%=targetUrl%>')"><%=jobbrief.getJobTitle().getDescription()%></a></td><td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('\JOBS\<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefViewDetailsServlet"><%=jobbrief.getJobTitle().getDescription()%></a></td>
Line 34288: 55:<td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('<%=targetUrl%>')"><%=jobbrief.getJobTitle().getDescription()%></a></td><td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('\JOBS\<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefViewDetailsServlet"><%=jobbrief.getJobTitle().getDescription()%></a></td>
Line 34288: 55:<td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('<%=targetUrl%>')"><%=jobbrief.getJobTitle().getDescription()%></a></td><td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('\JOBS\<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefViewDetailsServlet"><%=jobbrief.getJobTitle().getDescription()%></a></td>
Line 34288: 55:<td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('<%=targetUrl%>')"><%=jobbrief.getJobTitle().getDescription()%></a></td><td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('\JOBS\<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefViewDetailsServlet"><%=jobbrief.getJobTitle().getDescription()%></a></td>
Line 34288: 55:<td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('<%=targetUrl%>')"><%=jobbrief.getJobTitle().getDescription()%></a></td><td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenScrollablePopup('\JOBS\<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefViewDetailsServlet"><%=jobbrief.getJobTitle().getDescription()%></a></td>
Line 34289: 56:<td<%=(sortcolumn.equals("wageScheduleCode")?"CLASS=COLCOLOR":")%>><%=jobbrief.getPayScaleArea().getPayScaleArea()%></td>
Line 34289: 56:<td<%=(sortcolumn.equals("wageScheduleCode")?"CLASS=COLCOLOR":")%>><%=jobbrief.getPayScaleArea().getPayScaleArea()%></td>
Line 34290: 57:<td<%=(sortcolumn.equals("TNTTNL")?"CLASS=COLCOLOR":")%>><%=jobbrief.getJobTitleLaborUnion().getTntMonths()%>/<%=jobbrief.getJobTitleLaborUnion().getTnlMonths()%>months</td>
Line 34290: 57:<td<%=(sortcolumn.equals("TNTTNL")?"CLASS=COLCOLOR":")%>><%=jobbrief.getJobTitleLaborUnion().getTntMonths()%>/<%=jobbrief.getJobTitleLaborUnion().getTnlMonths()%>months</td>
Line 34290: 57:<td<%=(sortcolumn.equals("TNTTNL")?"CLASS=COLCOLOR":")%>><%=jobbrief.getJobTitleLaborUnion().getTntMonths()%>/<%=jobbrief.getJobTitleLaborUnion().getTnlMonths()%>months</td>
Line 34315: 25:<tdcolspan="8"><jobs:JobBriefShowIframeHeadersearchType="<%=String.valueOf(JOBBRIEF_SEARCH_RESULTS_MEMENTO.getSearchType())%>"searchCriteria="<%=JOBBRIEF_SEARCH_RESULTS_MEMENTO.getCriteria()%>"regionID="<%=JobBriefUtil.SNET_REGIONID%>"/></td>
Line 34315: 25:<tdcolspan="8"><jobs:JobBriefShowIframeHeadersearchType="<%=String.valueOf(JOBBRIEF_SEARCH_RESULTS_MEMENTO.getSearchType())%>"searchCriteria="<%=JOBBRIEF_SEARCH_RESULTS_MEMENTO.getCriteria()%>"regionID="<%=JobBriefUtil.SNET_REGIONID%>"/></td>
Line 34315: 25:<tdcolspan="8"><jobs:JobBriefShowIframeHeadersearchType="<%=String.valueOf(JOBBRIEF_SEARCH_RESULTS_MEMENTO.getSearchType())%>"searchCriteria="<%=JOBBRIEF_SEARCH_RESULTS_MEMENTO.getCriteria()%>"regionID="<%=JobBriefUtil.SNET_REGIONID%>"/></td>
Line 34317: 27:<jobs:conditionshow="<%=JobBriefUtil.SNET_LABOR_SITE!=null%>">
Line 34318: 28:<AHREF="<%=JobBriefUtil.SNET_LABOR_SITE%>"target="top">SNETLaborWebsite</a>
Line 34322: "40:<jobs:conditionshow="<%=searchType!=JobBriefUtil.JOBBRIEF_JOBFAMILYCODE%>">
Line 34323: 41:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.SNET_REGIONID%>&sortField=jobFamily">JobFamily</A></td>
Line 34323: 41:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.SNET_REGIONID%>&sortField=jobFamily">JobFamily</A></td>
Line 34325: 43:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.SNET_REGIONID%>&sortField=wageScheduleCode">SalaryGrade</A></td>
Line 34325: 43:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.SNET_REGIONID%>&sortField=wageScheduleCode">SalaryGrade</A></td>
Line 34326: 44:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.SNET_REGIONID%>&sortField=minimumPay">MinimumPay</A></td>
Line 34326: 44:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.SNET_REGIONID%>&sortField=minimumPay">MinimumPay</A></td>
Line 34327: 45:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.SNET_REGIONID%>&sortField=maximumPay">MaximumPay</A></td>
Line 34327: 45:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.SNET_REGIONID%>&sortField=maximumPay">MaximumPay</A></td>
Line 34328: 46:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.SNET_REGIONID%>&sortField=TOA">Residency</A></td>
Line 34328: 46:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.SNET_REGIONID%>&sortField=TOA">Residency</A></td>
Line 34329: 47:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.SNET_REGIONID%>&sortField=deptOrBureau">DeptorBureauselect</A></td>
Line 34329: 47:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.SNET_REGIONID%>&sortField=deptOrBureau">DeptorBureauselect</A></td>
Line 34330: 48:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.SNET_REGIONID%>&sortField=lastChgdDate">LastChangedDate</A></td>
Line 34330: 48:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.SNET_REGIONID%>&sortField=lastChgdDate">LastChangedDate</A></td>
Line 34338: 56:comparator="<%=JobBriefUtil.JOBBRIEF_COMPARATOR%>">
Line 34340: 58:<td><inputtype="radio"name="jobTitleID"value="<%=jobbrief.getJobTitle().getJobTitleID()%>">
Line 34341: 59:<td<%=(sortcolumn.equals("jobTitleCode")?"CLASS=COLCOLOR":")%>><%=jobbrief.getJobTitle().getJobTitleCode()%></td>
Line 34341: 59:<td<%=(sortcolumn.equals("jobTitleCode")?"CLASS=COLCOLOR":")%>><%=jobbrief.getJobTitle().getJobTitleCode()%></td>
Line 34348: "48:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.SNET_REGIONID%>&sortField=lastChgdDate">LastChangedDate</A></td>
Line 34348: "48:<td><Ahref="/jobs70/<%=JobBriefUtil.JOBBRIEF_SERVLET_INVOKER%>JobBriefSortingServlet?regionID=<%=JobBriefUtil.SNET_REGIONID%>&sortField=lastChgdDate">LastChangedDate</A></td>
Line 34356: 56:comparator="<%=JobBriefUtil.JOBBRIEF_COMPARATOR%>">
Line 34358: 58:<td><inputtype="radio"name="jobTitleID"value="<%=jobbrief.getJobTitle().getJobTitleID()%>">
Line 34359: 59:<td<%=(sortcolumn.equals("jobTitleCode")?"CLASS=COLCOLOR":")%>><%=jobbrief.getJobTitle().getJobTitleCode()%></td>
Line 34359: 59:<td<%=(sortcolumn.equals("jobTitleCode")?"CLASS=COLCOLOR":")%>><%=jobbrief.getJobTitle().getJobTitleCode()%></td>
Line 34367: 67:<td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenProgress('Searching');OpenScrollablePopup('<%=targetUrl%>')"><%=jobbrief.getJobTitle().getDescription()%></a></td>
Line 34367: 67:<td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenProgress('Searching');OpenScrollablePopup('<%=targetUrl%>')"><%=jobbrief.getJobTitle().getDescription()%></a></td>
Line 34367: 67:<td<%=(sortcolumn.equals("jobTitleName")?"CLASS=COLCOLOR":")%>><ahref="javascript:OpenProgress('Searching');OpenScrollablePopup('<%=targetUrl%>')"><%=jobbrief.getJobTitle().getDescription()%></a></td>
Line 34368: 68:<jobs:conditionshow="<%=searchType!=JobBriefUtil.JOBBRIEF_JOBFAMILYCODE%>">
Line 34369: 69:<td<%=(sortcolumn.equals("jobFamily")?"CLASS=COLCOLOR":")%>><%=jobbrief.getJobTitle().getJobFamily().getDescription()%></td>
Line 34369: 69:<td<%=(sortcolumn.equals("jobFamily")?"CLASS=COLCOLOR":")%>><%=jobbrief.getJobTitle().getJobFamily().getDescription()%></td>
Line 34371: 71:<td<%=(sortcolumn.equals("wageScheduleCode")?"CLASS=COLCOLOR":")%>><%=jobbrief.getPayScaleArea().getPayScaleAreaName()%></td>
Line 34371: 71:<td<%=(sortcolumn.equals("wageScheduleCode")?"CLASS=COLCOLOR":")%>><%=jobbrief.getPayScaleArea().getPayScaleAreaName()%></td>
Line 34372: 72:<td<%=(sortcolumn.equals("minimumPay")?"CLASS=COLCOLOR":")%>>$<%=jobbrief.getMinPayScale().getWeeklyWage()%></td>
Line 34372: 72:<td<%=(sortcolumn.equals("minimumPay")?"CLASS=COLCOLOR":")%>>$<%=jobbrief.getMinPayScale().getWeeklyWage()%></td>
Line 34380: 56:comparator="<%=JobBriefUtil.JOBBRIEF_COMPARATOR%>">
c= DriverManager.getConnection( "jdbc:odbc:abc","root","root");
s=c.createStatement();
rs= s.executeQuery("select * from exam");
}catch(Exception e) { System.out.println(e); }
b1= new Button("Submit");
b2= new Button("Start");
b1.addActionListener(this);
b2.addActionListener(this);
t1= new TextArea(100,100);
g= new CheckboxGroup();
c1= new Checkbox("Option1",g, true);
c2= new Checkbox("Option2",g, false);
c3= new Checkbox("Option3",g, false);
add(t1);
add(c1);
add(c2);
add(c3);
add(b1);
add(b2);

setLayout( new GridLayout(4,4));
addWindowListener(this);
setVisible(true);
setSize(400,400);
setLocation(0,0);
}



}


 