<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="css/contact.css">
</head>
<body>
<header>
    <!---So the header happens -->
</header>
<nav>
    <div id="top">
        <ul class="topnav" id="topnav1">
            <li><a href="index.jsp">Main Menu</a></li>
            <li><a href="View.jsp">View All Contacts</a></li>
            <li><a href="Enter.jsp">Add a New Contact</a></li>
            <li class="dropdown"> <a href="javascript:void(0)" class="dropbtn">Search for a Contact</a>
                <div class="dropdown-content">
                    <a href="SearchFN.jsp">by First Name</a>
                    <a href="SearchLN.jsp">by Last Name</a>
                    <a href="SearchZIP.jsp">by Zip Code</a>
                    <a href="SearchTEL.jsp">by Telephone</a>
                    <a href="SearchEM.jsp">by Email</a>
                </div>
            </li>
            <li class="dropdown"> <a href="javascript:void(0)" class="dropbtn">Modify a Contact</a>
                <div class="dropdown-content">
                    <a href="ModifyFN.jsp">First Name</a>
                    <a href="ModifyLN.jsp">Last Name</a>
                    <a href="ModifyADD.jsp">Address</a>
                    <a href="ModifyCITY.jsp">City</a>
                    <a href="ModifySTATE.jsp">State</a>
                    <a href="ModifyZIP.jsp">Zip Code</a>
                    <a href="ModifyTEL.jsp">Telephone</a>
                    <a href="ModifyEM.jsp">Email</a>
                </div>
            </li>
            <li><a href="Remove.jsp">Remove a Contact</a></li>
        </ul>
    </div>
</nav>
<main>
    <div class="container">
Search by TEL
    </div>
<input class="startReg" type="button" onclick="window.location='index.jsp';" value="Return to Main Menu">
</main>
</body>
</html>