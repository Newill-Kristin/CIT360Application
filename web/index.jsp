<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Simple Contact Application for CIT360</title>
    <meta name="description" content="Simple Contact Application for CIT360">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="css/contact.css">

</head>
<body>
<header>
    <!---So the header happens -->
</header>
<main>
    <h1>Main Menu</h1>
    <button class="accordion"><a href="View.jsp">View All Contacts</a></button>
    <div class="panel">
    </div>
    <button class="accordion"><a href="Enter.jsp">Add a New Contact</a></button>
    <div class="panel">
    </div>
    <button class="accordion">Search for a Contact</button>
    <div class="panel" align="center">
        <input class="submitReg" type="button" onclick="window.location='SearchFN.jsp';" value="by First Name">
        <input class="submitReg" type="button" onclick="window.location='SearchLN.jsp';" value="by Last Name">
        <input class="submitReg" type="button" onclick="window.location='SearchZIP.jsp';" value="by Zip Code">
        <input class="submitReg" type="button" onclick="window.location='SearchTEL.jsp';" value="by Telephone">
        <input class="submitReg" type="button" onclick="window.location='SearchEM.jsp';" value="by Email">
    </div>
    <button class="accordion">Modify a Contact</button>
    <div class="panel" align="center">
        <input class="submitReg" type="button" onclick="window.location='ModifyFN.jsp';" value="First Name">
        <input class="submitReg" type="button" onclick="window.location='ModifyLN.jsp';" value="Last Name">
        <input class="submitReg" type="button" onclick="window.location='ModifyADD.jsp';" value="Address">
        <input class="submitReg" type="button" onclick="window.location='ModifyCITY.jsp';" value="City">
        <input class="submitReg" type="button" onclick="window.location='ModifySTATE.jsp';" value="State">
        <input class="submitReg" type="button" onclick="window.location='ModifyZIP.jsp';" value="Zip Code">
        <input class="submitReg" type="button" onclick="window.location='ModifyTEL.jsp';" value="Telephone">
        <input class="submitReg" type="button" onclick="window.location='ModifyEM.jsp';" value="Email">
    </div>
    <button class="accordion"><a href="Remove.jsp">Remove a Contact</a></button>
    <div class="panel">
    </div>
    <br><br>
</main>

<footer>
    <ul class="foot row" id="foot1">
        <li class="copy" style = "float: left">&copy; 2019 KNewill</li>
        <li class="company">CIT360 Application Project</li>
        <li class="footRef" style = "float: right"></li>
    </ul>
</footer>





</body>

<script>
    var acc = document.getElementsByClassName("accordion");
    var i;

    for (i = 0; i < acc.length; i++) {
        acc[i].onclick = function() {
            this.classList.toggle("active");
            var panel = this.nextElementSibling;
            if (panel.style.maxHeight){
                panel.style.maxHeight = null;
            } else {
                panel.style.maxHeight = panel.scrollHeight + "px";
            }
        }
    }
</script>

</html>