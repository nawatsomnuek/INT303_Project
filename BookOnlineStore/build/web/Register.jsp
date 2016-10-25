<%-- 
    Document   : Register
    Created on : Oct 17, 2016, 12:36:01 AM
    Author     : nawatsomnuek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>::.BookOnlineStore.::</title>
        <!-- CSS -->
        <link rel="stylesheet" href="css/Login.css">
    </head>
    <body>
        <div class="container">
            <div class="row">

                <!-- Mixins-->
                <!-- Pen Title-->
                <div class="pen-title">
                    <h1 style="color: red; font-weight: bold">Book Store</h1>
                </div>
                <div class="container">
                    <div class="card"></div>
                    <div class="card">
                        <h1 class="title">Login</h1>
                        <form action="LoginCustomer" method="post">
                            <div class="input-container">
                                <input type="text" id="Email" name="email" required="required"/>
                                <label for="Email">Email</label>
                                <div class="bar"></div>
                            </div>
                            <div class="input-container">
                                <input type="password" id="Password" name="password" required="required"/>
                                <label for="Password">Password</label>
                                <div class="bar"></div>
                            </div>
                            <div class="input-container">
                                <input type="password" id="Repeat Password" required="required"/>
                                <label for="Repeat Password">Repeat Password</label>
                                <div class="bar"></div>
                            </div>
                            <div class="button-container">
                                <button><span>Go</span></button>
                            </div>
                            <div class="footer"><a href="#">Forgot your password?</a></div>
                            <div class="footer1" style="font-weight: 500">If you're not member please <a href="#"><span style="color: red; font-weight: bolder">Register</span></a></div>
                        </form>
                    </div>
                    <div class="card alt">
                        <div class="toggle"></div>
                        <h1 class="title">Register
                            <div class="close"></div>
                        </h1>
                        <form>
                            <div class="input-container">
                                <input type="text" id="Email" required="required"/>
                                <label for="Email">Email</label>
                                <div class="bar"></div>
                            </div>
                            <div class="input-container">
                                <input type="password" id="Password" required="required"/>
                                <label for="Password">Password</label>
                                <div class="bar"></div>
                            </div>
                            <div class="input-container">
                                <input type="password" id="Repeat Password" required="required"/>
                                <label for="Repeat Password">Repeat Password</label>
                                <div class="bar"></div>
                            </div>
                            <div class="button-container">
                                <button><span>Next</span></button>
                            </div>
                        </form>
                    </div>
                    <!-- Portfolio--><a id="portfolio" href="http://pkshopy.com/farooqshad/" title="View my portfolio!"><i class="fa fa-link"></i></a>
                </div>
            </div>
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
            <script type="text/javascript" src="js/Login.js"></script>
    </body>
</html>