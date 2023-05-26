<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

<section class="vh-100" style="background-color: #eee;">
  <div class="container h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-lg-12 col-xl-11">
        <div class="card text-black" style="border-radius: 25px;">
          <div class="card-body p-md-5">
            <div class="row justify-content-center">
              <div class="col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1">

                <p class=" text-success text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4">Login Successful</p>
                <p class= "text-center h2 mb-5 mx-1 mx-md-4 mt-4"> Welcome <%= session.getAttribute("name") %> </p>
                
                
                  <p class= "text-center h3 mb-5 mx-1 mx-md-4 mt-4"> View Your Account Details </p>


	
			<table class="table table-borderless">
  <thead>
    <tr>
      <th scope="col">Name</th>
      <th scope="col">Last Name</th>
      <th scope="col">Email</th>
       <th scope="col">Password</th>
    </tr>
  </thead>
  <tbody>
    <tr>			 	
				 <td class="table-primary">  <%=session.getAttribute("name") %> </td>
				 
				  <td class="table-primary"> <%=session.getAttribute("lname") %> </td>
				
				 <td class="table-primary"> <%=session.getAttribute("email") %> </td>
				 
				 <td class="table-primary"> <%=session.getAttribute("password") %> £ </td>
				 
				 
				 <td>
						<a class="btn btn-primary btn-sm" href="book_list.jsp">View Books</a>
							
					
					</td>
				
				
		</tr>
	</tbody>
		
		
	
	
	
	</table>
	


           

              </div>
            </div>
          </div>
		</div>
	</div>
</div>
</div>
</div>

</body>
</html>