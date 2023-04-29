<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleEmployeeCreationServiceProxyid" scope="session" class="com.exercise.ws.EmployeeCreationServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleEmployeeCreationServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleEmployeeCreationServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleEmployeeCreationServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.exercise.ws.EmployeeCreationService getEmployeeCreationService10mtemp = sampleEmployeeCreationServiceProxyid.getEmployeeCreationService();
if(getEmployeeCreationService10mtemp == null){
%>
<%=getEmployeeCreationService10mtemp %>
<%
}else{
        if(getEmployeeCreationService10mtemp!= null){
        String tempreturnp11 = getEmployeeCreationService10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String id_1id=  request.getParameter("id34");
        int id_1idTemp  = Integer.parseInt(id_1id);
        String name_2id=  request.getParameter("name36");
            java.lang.String name_2idTemp = null;
        if(!name_2id.equals("")){
         name_2idTemp  = name_2id;
        }
        String surname_3id=  request.getParameter("surname38");
            java.lang.String surname_3idTemp = null;
        if(!surname_3id.equals("")){
         surname_3idTemp  = surname_3id;
        }
        String email_4id=  request.getParameter("email40");
            java.lang.String email_4idTemp = null;
        if(!email_4id.equals("")){
         email_4idTemp  = email_4id;
        }
        String telephone_5id=  request.getParameter("telephone42");
        int telephone_5idTemp  = Integer.parseInt(telephone_5id);
        String department_6id=  request.getParameter("department44");
            java.lang.String department_6idTemp = null;
        if(!department_6id.equals("")){
         department_6idTemp  = department_6id;
        }
        com.exercise.ws.Employee creationEmployee13mtemp = sampleEmployeeCreationServiceProxyid.creationEmployee(id_1idTemp,name_2idTemp,surname_3idTemp,email_4idTemp,telephone_5idTemp,department_6idTemp);
if(creationEmployee13mtemp == null){
%>
<%=creationEmployee13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">telephone:</TD>
<TD>
<%
if(creationEmployee13mtemp != null){
%>
<%=creationEmployee13mtemp.getTelephone()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">name:</TD>
<TD>
<%
if(creationEmployee13mtemp != null){
java.lang.String typename18 = creationEmployee13mtemp.getName();
        String tempResultname18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename18));
        %>
        <%= tempResultname18 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">email:</TD>
<TD>
<%
if(creationEmployee13mtemp != null){
java.lang.String typeemail20 = creationEmployee13mtemp.getEmail();
        String tempResultemail20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeemail20));
        %>
        <%= tempResultemail20 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">department:</TD>
<TD>
<%
if(creationEmployee13mtemp != null){
java.lang.String typedepartment22 = creationEmployee13mtemp.getDepartment();
        String tempResultdepartment22 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedepartment22));
        %>
        <%= tempResultdepartment22 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">agenda:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">mapProperty:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">surname:</TD>
<TD>
<%
if(creationEmployee13mtemp != null){
java.lang.String typesurname30 = creationEmployee13mtemp.getSurname();
        String tempResultsurname30 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesurname30));
        %>
        <%= tempResultsurname30 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(creationEmployee13mtemp != null){
%>
<%=creationEmployee13mtemp.getId()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 46:
        gotMethod = true;
        String id_7id=  request.getParameter("id49");
        int id_7idTemp  = Integer.parseInt(id_7id);
        String stringDate_8id=  request.getParameter("stringDate51");
            java.lang.String stringDate_8idTemp = null;
        if(!stringDate_8id.equals("")){
         stringDate_8idTemp  = stringDate_8id;
        }
        String text_9id=  request.getParameter("text53");
            java.lang.String text_9idTemp = null;
        if(!text_9id.equals("")){
         text_9idTemp  = text_9id;
        }
        java.lang.String updateAgenda46mtemp = sampleEmployeeCreationServiceProxyid.updateAgenda(id_7idTemp,stringDate_8idTemp,text_9idTemp);
if(updateAgenda46mtemp == null){
%>
<%=updateAgenda46mtemp %>
<%
}else{
        String tempResultreturnp47 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(updateAgenda46mtemp));
        %>
        <%= tempResultreturnp47 %>
        <%
}
break;
case 55:
        gotMethod = true;
        java.lang.String viewEmployees55mtemp = sampleEmployeeCreationServiceProxyid.viewEmployees();
if(viewEmployees55mtemp == null){
%>
<%=viewEmployees55mtemp %>
<%
}else{
        String tempResultreturnp56 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(viewEmployees55mtemp));
        %>
        <%= tempResultreturnp56 %>
        <%
}
break;
case 58:
        gotMethod = true;
        String id_10id=  request.getParameter("id61");
        int id_10idTemp  = Integer.parseInt(id_10id);
        String stringDate_11id=  request.getParameter("stringDate63");
            java.lang.String stringDate_11idTemp = null;
        if(!stringDate_11id.equals("")){
         stringDate_11idTemp  = stringDate_11id;
        }
        String text_12id=  request.getParameter("text65");
            java.lang.String text_12idTemp = null;
        if(!text_12id.equals("")){
         text_12idTemp  = text_12id;
        }
        java.lang.String setAgenda58mtemp = sampleEmployeeCreationServiceProxyid.setAgenda(id_10idTemp,stringDate_11idTemp,text_12idTemp);
if(setAgenda58mtemp == null){
%>
<%=setAgenda58mtemp %>
<%
}else{
        String tempResultreturnp59 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(setAgenda58mtemp));
        %>
        <%= tempResultreturnp59 %>
        <%
}
break;
case 67:
        gotMethod = true;
        String name_13id=  request.getParameter("name70");
            java.lang.String name_13idTemp = null;
        if(!name_13id.equals("")){
         name_13idTemp  = name_13id;
        }
        String surname_14id=  request.getParameter("surname72");
            java.lang.String surname_14idTemp = null;
        if(!surname_14id.equals("")){
         surname_14idTemp  = surname_14id;
        }
        String email_15id=  request.getParameter("email74");
            java.lang.String email_15idTemp = null;
        if(!email_15id.equals("")){
         email_15idTemp  = email_15id;
        }
        String department_16id=  request.getParameter("department76");
            java.lang.String department_16idTemp = null;
        if(!department_16id.equals("")){
         department_16idTemp  = department_16id;
        }
        java.lang.String searchEmployees67mtemp = sampleEmployeeCreationServiceProxyid.searchEmployees(name_13idTemp,surname_14idTemp,email_15idTemp,department_16idTemp);
if(searchEmployees67mtemp == null){
%>
<%=searchEmployees67mtemp %>
<%
}else{
        String tempResultreturnp68 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(searchEmployees67mtemp));
        %>
        <%= tempResultreturnp68 %>
        <%
}
break;
case 78:
        gotMethod = true;
        String id_17id=  request.getParameter("id81");
        int id_17idTemp  = Integer.parseInt(id_17id);
        String stringDate_18id=  request.getParameter("stringDate83");
            java.lang.String stringDate_18idTemp = null;
        if(!stringDate_18id.equals("")){
         stringDate_18idTemp  = stringDate_18id;
        }
        java.lang.String deleteAgenda78mtemp = sampleEmployeeCreationServiceProxyid.deleteAgenda(id_17idTemp,stringDate_18idTemp);
if(deleteAgenda78mtemp == null){
%>
<%=deleteAgenda78mtemp %>
<%
}else{
        String tempResultreturnp79 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteAgenda78mtemp));
        %>
        <%= tempResultreturnp79 %>
        <%
}
break;
case 85:
        gotMethod = true;
        String id_19id=  request.getParameter("id88");
        int id_19idTemp  = Integer.parseInt(id_19id);
        java.lang.String viewAgenda85mtemp = sampleEmployeeCreationServiceProxyid.viewAgenda(id_19idTemp);
if(viewAgenda85mtemp == null){
%>
<%=viewAgenda85mtemp %>
<%
}else{
        String tempResultreturnp86 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(viewAgenda85mtemp));
        %>
        <%= tempResultreturnp86 %>
        <%
}
break;
case 90:
        gotMethod = true;
        String id_20id=  request.getParameter("id93");
        int id_20idTemp  = Integer.parseInt(id_20id);
        String stringDate_21id=  request.getParameter("stringDate95");
            java.lang.String stringDate_21idTemp = null;
        if(!stringDate_21id.equals("")){
         stringDate_21idTemp  = stringDate_21id;
        }
        java.lang.String viewAgendaByDate90mtemp = sampleEmployeeCreationServiceProxyid.viewAgendaByDate(id_20idTemp,stringDate_21idTemp);
if(viewAgendaByDate90mtemp == null){
%>
<%=viewAgendaByDate90mtemp %>
<%
}else{
        String tempResultreturnp91 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(viewAgendaByDate90mtemp));
        %>
        <%= tempResultreturnp91 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>