<html>
<head>
<title>CRAZY SHUTTLERS</title>
<h1>ACTIVITY TRACKER SUBMISSION</h1>
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
  <p>AMOUNT ADDITION</p>
</div>

<div class="insert">
<div>
<form action="AmountSubmission" modelAttribute="amountdata" method="POST">

<!-- <form action="/Amountadd" method="GET"> -->

<div class="Core">
  
 <div>
	<label for="PLAYERNAME">PLAYERNAME</label>
    <select id="Playername" name="Playername">
	  <option value="EMPTY"></option>
      <option value="1-Shiv">SHIV</option>
      <option value="2-Adhi">ADHI</option>
      <option value="3-Tejas">TEJAS</option>
      <option value="4-Sriram">SRIRAM</option>
      <option value="5-Sharf">SHARF</option>
      <option value="6-Partha">PARTHA</option>
      <option value="7-Arvind">ARVIND</option>
	  <option value="8-Dinesh">DINESH</option>
	  <option value="9-Asim">ASIM</option>
	  <option value="10-Amit">AMIT</option>
    </select>
        <br></br>
  </div>

  

  <div>
    <label for="number">BALANCE AMOUNT</label>
    <input type="number" id="Amt" name="amount" step="any"  >
        <br></br>
  </div>

  <div>
    <label for="msg">COMMENTS</label>
    <input type="text" id="Comments" name="Comments" maxlength="10">
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
