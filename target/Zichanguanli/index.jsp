<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
成功
<a href="<%=request.getContextPath()%>/baofei/query">baofei模块返回json格式数据</a>
<form action="<%=request.getContextPath()%>/employee/add" method="post">
        <table>
         <tr>
         <td>姓名：</td>
         <td><input  type="text"  name="emp_name"  value=""/></td>
         <td>性别：</td>
         <td><input  type="text"  name="emp_sex"  value=""/></td>
         <td>电话：</td>
         <td><input  type="text"  name="emp_phone"  value=""/></td>
         <td>部门：</td>
         <td><input  type="text"  name="emp_bumen"  value=""/></td>
         </tr>
         
          <tr>
           <td colspan="2">
             <input  type="submit"  value="保存"  />
           </td>
          </tr>
        
        </table>
     
     
     </form>
</body>
</html>