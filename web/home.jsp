<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="s1" uri="/struts-dojo-tags"%>
<s1:head debug="true"/>

<html>
    <head>
        <link href="style.css" rel="stylesheet">
    </head>
    <style>
        
    </style>
    <body><div style="position: relative"> 
        <table width="100%">
            <tr align="left">
                <td><img src="Images/rentlogo.png" width="290px" height="210px"></td>
            </tr>
        </table>
         <%@include file="top.jsp"%>
        <br>
   
        <s:form action="signupaction.action">  
        <table align="center" cellspacing="20" class="backtheme">
            <tr align="center" bgcolor="whitesmoke" style="font-size:20px; font-family:berlin sans fb">
                
                <td colspan="2">USER SIGN UP</td>
            </tr>
            
            <tr>
                <td><s:textfield label="User Name" name="username"/></td>  
            </tr>
            
            <tr>
                <td><s:textfield label="Mail Id" name="email"/></td>
            </tr>
            
            <tr>
                <td><s:password label="Password" name="password"/></td>
            </tr>
             
            <tr>
                <td><s:textarea label="Address" name="address"/></td>
            </tr>
            
            <tr>
                <td><s:textfield label="Contact number" name="contact"/></td>
            </tr>
            <tr align="center">
                
                <td><s:submit label="signup"/>
                    <s:reset value="clear"/></td>
                
            </tr>
        </s:form>    
        </table></div></div>
        </body>
</html>