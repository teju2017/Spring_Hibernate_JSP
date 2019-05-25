<html>
<head>
<title>CRAZY SHUTTLERS</title>
<h1>PLAYER ADDITION</h1>
<!-- <img src="ubs-logo.png" alt="UBS Logo" height=150 width=150> -->
     <!--- <script type="text/javascript"
           src="html5Forms.js-master/shared/js/modernizr.com/Modernizr-2.5.3.forms.js">
     </script> -->

     <script src="js/jquery-3.2.0.js"></script>
     <script src="js/jquery-ui.js"></script>
     <link href="js/jquery-ui.css" rel="stylesheet">

      <script>
	      $(document).ready(function ()   
		   {  $("#constdt").datepicker({ minDate:0,dateFormat:'yy-mm-dd'});
		      $("#plconenddt").datepicker({ minDate:0,dateFormat:'yy-mm-dd'});
	              $("#pl_con_on_dt").datepicker({ minDate:0,dateFormat:'yy-mm-dd'});
		      $("#pl_con_end_dt").datepicker({ minDate:0,dateFormat:'yy-mm-dd'});
		      $("#planrel").datepicker({ minDate:0,dateFormat:'yy-mm-dd'});
		      $("#actrel").datepicker({ minDate:0,dateFormat:'yy-mm-dd'});
		      $("#conenddt").datepicker({ minDate:0,dateFormat:'yy-mm-dd'});
		   });
     </script>


     <script type="text/javascript"
             data-webforms2-support="date"
             data-lang="en"
             src="html5Forms.js-master/shared/js/html5Forms.js" > 
     </script>
	

	 
</head>

<style>
h1 {
    text-align: center;
    color: black;
    font-family:Arial;
    background-color: powderblue;
}
</style>

<style>
input[type=number], select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type=text], select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type=date], select {
    width: 100%;
    padding: 12px 20px;
    margin: 10px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type=submit] {
    width: 100%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 1px 0;
    border: none;
    border-radius: 2px;
    cursor: pointer;
        text-align:center;
}

input[type=submit]:hover {
    background-color: #45a049;
}

div {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
}

  .center {
    text-align: center;
    border: 1.5px solid green;

   .Core {
            width: 10em;
            margin-right: 1em;
            padding:40px;
            height:425px;
            text-align:left
         }
        }

.Section2 {
    text-align: center;
    border:  1.5px solid green;

   .Core2 {
          padding:40px;
          height: 680px;
          width: 10em;
          text-align:left;
          margin-right: 1em;
         }

       }

.Section3{
    text-align: center;
    border:  1.5px solid green;

  .Core3 {
          padding:40px;
          height: 1000px;
          width: 10em;
          text-align:left;
          margin-right: 1em;
         }

}

.Section4{
    text-align: center;
    border:  1.5px solid green;

        .Core4 {
      padding:40px;
          height: 90px;
          width: 10em;
          text-align:left;
          margin-right: 1em;
         }



</style>




<div class="center">
  <p><strong>PLAYER ADDITION PAGE</strong></p>
</div>

<div class="insert">
<div>
<!-- <form action="/Playeraddition" method="GET"> -->

<form action="Playeraddition" modelAttribute="playeradd" method="POST">
<div class="Core">
  
  
  <div>
	<label for="PLAYERID">PLAYERID</label>
     <input type="text" id="Playerid" name="Playerid" maxlength="100">
        <br></br>
  </div>
  

  <div>
	<label for="PLAYERNAME">PLAYERNAME</label>
     <input type="text" id="Playername" name="Playername" maxlength="100">
        <br></br>
  </div>


  <div>
    <label for="msg">COMMENTS</label>
    <input type="text" id="Comments" name="Comments" maxlength="100">
        <br></br>
  </div>
  
   

</style>
<input type="submit" value="SUBMIT" align="middle">
</form>
</div>

<div class="back">
<div>
<form action="getIndex" method="POST">
   <input type="submit" value="GO TO HOME" align="middle">
</form>
</div>
