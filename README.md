# javaEEintro

### Add 2 Numbers

1. Set up a Java EE development environment with an Apache Tomcat server and an IDE such as Eclipse or IntelliJ IDEA.
2. Create a new Java servlet project in your IDE.
3. Create a new servlet class, for example, "AddNumbersServlet".
4. Override the `service()` method in the servlet class. This method will handle the post request from the client browser.
5. In the `service()` method, extract the two numbers from the request parameters.
6. Perform the addition operation on the two numbers.
7. Store the result in a variable.
8. Write the result back to the client browser using the response object.
9. Map the servlet to a specific URL in the web.xml file.
10. Create an HTML form in a client-side web page that allows the user to enter two numbers.
11. Use JavaScript or jQuery to make an HTTP post request to the servlet with the two numbers as parameters.
12. Handle the response from the servlet, which should be the result of the addition operation.
13. Display the result to the user in the client-side web page.

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

### Req Dispatcher vs Redirect, for calling a servlet from another servlet 
Regarding the difference between the Request Dispatcher and Redirect methods for calling a servlet from another servlet, Request Dispatcher is used to forward the request to another resource within the same application, while Redirect is used to redirect the request to a different resource, either within the same application or on a different server.