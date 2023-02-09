# Java Enterprise Edition Introduction

### Add 2 Numbers

1. Set up a Java EE development environment with an Apache Tomcat server and an IDE such as Eclipse.
2. Create a new servlet class, for example, "AddNumbersServlet".
3. Override the `service()` method in the servlet class. This method will handle the post request from the client browser.
4. In the `service()` method, extract the two numbers from the request parameters.
5. Perform the addition operation on the two numbers.
6. Store the result in a variable.
7. Write the result back to the client browser using the response object.
8. Map the servlet to a specific URL in the web.xml file.
9. Create an HTML form in a client-side web page that allows the user to enter two numbers.
10. Use JavaScript or jQuery to make an HTTP post request to the servlet with the two numbers as parameters.
11. Handle the response from the servlet, which should be the result of the addition operation.
12. Display the result to the user in the client-side web page.

### web.xml file

web.xml, also known as the Deployment Descriptor, is a configuration file for Java Servlet-based applications.
It provides information about the web application to the application server, including the mapping of servlets, JSP files, and static resources.

web.xml file used, to map the servlet to a URL pattern in the web.xml file. This allows you to access the servlet through a specific URL instead of having to hardcode the servlet class name in the client-side code. To map the servlet in web.xml, you need to specify the servlet name, servlet class, and URL pattern in the following format:

The web.xml file is used to:

-Define the context root and welcome page of the application.
-Map servlets to URL patterns.
-Set security constraints and authentication methods.
-Configure error pages and welcome files.
-Specify initialization parameters for servlets and JSP files.

### Get and Post Method
- GET and POST methods in HTTP, which are used to send requests from a client (such as a web browser) to a server.

- HTTP GET method is the default method for sending data from the client to the server. The data sent using this method is visible in the URL and can be easily accessed by anyone who has access to the URL. It is not suitable for sending sensitive data such as passwords or login credentials.

- The service method is a generic method in Java servlets that can handle multiple HTTP request methods, such as GET, POST, PUT, and DELETE. The doPost method is specifically for handling HTTP POST requests.

- the HTTP POST method is used to send data to the server in a secure manner, as the data is not visible in the URL. To handle only POST method requests, the doPost() method can be used instead of the service() method in a servlet.
To enforce the handling of only POST method requests, the doPost() method should be used instead of the service() method.

- The doPost method can be used instead of the service method to enforce that only POST method requests will be handled.

### Req Dispatcher vs Redirect
-Request Dispatcher is used to forward the request to another resource within the same application. 
-Redirect is used to redirect the request to a different resource, either within the same application or on a different server.

### Calling a Servlet from another Servlet and sharing data using Request Dispatcher
1. Create a new servlet for calculating the square.
2. using Request Dispatcher forward a request from one Servlet to another Servlet. (from add to sq in our example)
3. Session management can be used to share data between servlets
4. Another way to send data is by adding data to the request object, which is being forwarded from one servlet to another. 
5. This approach is not recommended for sharing large amounts of data, as the data is stored in memory and can quickly consume server resources.
6. ALso add a new mapping to the web.xml file.

### Servlet Request and Response

-The `request` object holds the data sent from the client to the server in the form of HTTP request parameters, headers, and other information. 

-The `response` object is used to send a response from the server to the client, which can be in the form of text, JSON, video, or other formats.

-In a servlet, the `request` and `response` objects are typically passed as arguments to the `service` method, and are created by the servlet container (such as Apache Tomcat). 

-You do not need to create the objects yourself, but you can access and modify the values in the objects as needed for your application.

### Servlet Request Forwarding

-When a client sends a request to a servlet `S1`, it is accompanied by request and response objects `req1` and `res1`. 

-Instead of sending a response directly to the client, `S1` can use a `RequestDispatcher` to forward the request to another servlet `S2` along with the same `req1` and `res1` objects. 

-`S2` will then send the response back to the client using `res1`. 
The client is unaware of which servlet actually sent the response.

-If you want the client to be aware that the request has been redirected, you can use the `sendRedirect` method instead of a `RequestDispatcher`. 

-In the case of a `RequestDispatcher`, the request is simply forwarded, while in the case of `sendRedirect`, 
the client is informed and instructed to access `S2`.

### HttpSession

-Session is a mechanism used in web applications to store information about a user's session on a website.
-This information is stored on the server and is associated with a unique session ID. 
-This ID is sent to the client as a cookie, and the client uses it to send the session ID back to the server with each subsequent request. 
-This allows the server to associate the incoming request with a specific session, and to retrieve the session data for that user. 
-This allows the server to maintain state across multiple requests, which is useful for tracking user preferences, keeping track of a shopping cart, or managing user authentication. 
-The session data is stored on the server and is typically stored in memory, but it can also be stored in a database or other persistent storage mechanism.