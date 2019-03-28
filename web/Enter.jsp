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
<div class="form-field">
    <form action="EnterContact" method="POST">
    <fieldset class="persInfo">
        <legend><span>Contact Information</span></legend>
        <label class="twoUp"> <span>First Name: </span>
            <input name="firstName" type="text" placeholder="First Name" pattern="[a-zA-Z -._']{3,99}" required> </label>
        <label class="twoUp"> <span>Last Name: </span>
            <input name="lastName" type="text" placeholder="Last Name" pattern="[a-zA-Z -._']{3,99}" required> </label>
        <label class="oneUp"> <span>Address: </span>
            <input name="add1" type="text" placeholder="Address"> </label>
        <label class="threeUp"> <span>City: </span>
            <input name="city" type="text" placeholder="City" pattern="[a-zA-Z -._']{1,99}" required> </label>
        <label class="threeUp"> <span>State: </span>
            <input name="state" type="text" placeholder="State" pattern="[a-zA-Z -._']{1,99}" required> </label>
        <label class="threeUp"> <span>Zip Code: </span>
            <input name="zip" type="number" placeholder="ZipCode" required> </label>
        <label class="twoUp"> <span>Phone: </span>
            <input name="tele" type="tel" placeholder="1230001234" pattern="[0-9]{10}" required> </label>
        <label class="twoUp"> <span>Email: </span>
            <input name="email" type="email" placeholder="email@email.com" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" required> </label>
    </fieldset>
        <div class="cbutton">
            <td><input type="submit" value="Submit" class="submitReg"></td>
            <td><input type="reset" value="Reset" class="submitReg"></td>
        </div>
    </form>
</div>
<div class="cbutton"><input class="startReg" type="button" onclick="window.location='index.jsp';" value="Return to Main Menu"></div>
</main>
</body>
</html>