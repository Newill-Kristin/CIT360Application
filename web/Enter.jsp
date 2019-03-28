<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="css/contact.css">
</head>
<body>

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
        <input type="submit" value="Submit" class="submitReg">
        <input type="reset" value="Reset" class="submitReg">
    </form>
</div>

<input class="startReg" type="button" onclick="window.location='index.jsp';" value="Return to Main Menu">

</body>
</html>