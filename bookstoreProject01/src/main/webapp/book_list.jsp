<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="com.bk.models.Account"%>
<%@page import="com.bk.models.Book"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Add to Cart</title>
</head>
<body>

<% // Scriptlet
	
		
	
	List<Book> bookList =  (List<Book>)session.getAttribute("bList"); // takes the key and display the value, getAttribute always returns
	
	%>
	

	 
	 <h1 class="col-12 mb-5  ms-5"> Available Book </h1>

		<table class="table table-borderless">
  <thead>
    <tr>
      <th scope="col">Title</th>
      <th scope="col">Author</th>
      <th scope="col">Price</th>
    </tr>
  </thead>
  <tbody>
    <tr>		
		<%
			for(Book b : bookList){
		
		%>
				
				 	
				 <td class="table-primary">  <%=b.getTitle() %> </td>
				
				 <td class="table-primary"> <%=b.getAuthor() %> </td>
				 
				 <td class="table-primary"> <%=b.getPrice() %> £ </td>
				 
				 
				 <td>
						<a class="btn btn-primary btn-sm" href="add-to-cart?id=<%=b.getBook_id()%>">Add to Cart</a>
							
					
					</td>
				
				
		</tr>
	</tbody>
		
		<%
			}
		%>
	
	
	
	</table>
	
	
	
</body>
</html>