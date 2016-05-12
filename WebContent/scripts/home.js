/*$(document).ready(function(){
     Get iframe src attribute value i.e. YouTube video url
    and store it in a variable 
    var url = $("#cartoonVideo").attr('src');
    
     Assign empty url value to the iframe src attribute when
    modal hide, which stop the video playing 
    $("#myModal").on('hide.bs.modal', function(){
        $("#cartoonVideo").attr('src', '');
    });
    
     Assign the initially stored url back to the iframe src
    attribute when modal is displayed again 
    $("#myModal").on('show.bs.modal', function(){
        $("#cartoonVideo").attr('src', url);
    });
});*/

function Login()
{
var email= document.getElementById("email").value;
var password =document.getElementById("password").value;
console.log(window.location.href);
$.get("../rest/user?username="+email+"&password="+password, function(result){
	if(result.id==0){
		$('#loginMsg').html("Invalid Username or Password. Please try again");
		return;
	}
	if(email=='admin')
		window.location.href="../views/report.html";
	else		
	window.location.href="../views/homeTab.html";
});



/*$.get({
		url: "./rest/employees/2",
		timeout: '120000',
		cache: false,
		success: function(result){
			console.log("success12354");
			console.log(result);
		}
});

$.ajax({
		url:"./rest/user?username="+email+"&password="+password, 
		timeout: '120000',
		cache: false,
		sucess: function(result){
			console.log("check valiate user");
			console.log(result);
		}
});*/
/*$.ajax({
	type: "GET", 
	dataType: "json", 
	url: "http://localhost:8080/EmployeeDirectoryJAXRS/rest/employees/2",
	error: function(data){
		console.log("error");
		console.log(data)
	},
	success: function(data){
		console.log("success");
	alert(data.toString());
	console.log(data)
	}
	});*/
}

function logout(){
	$.post("../rest/user/logout",
	function (data){
	window.location.href="../views/home.html";
	})
}

function pop(obj){
		
		$.getJSON("../rest/training/auth",
				function (data) {
				    var tr;
				    tr = $('<tr/>');
			        tr.append("<td><B>Training Name</B></td>");
			        tr.append("<td><b>Description</b></td>");
			        tr.append("<td><b>Status</b> </td>");
			       /* tr.append("<td><b>Assessment</b> </td>");*/
			        $('#table1').append(tr);
			        //data = $.parseJSON(data);
			        data.training .sort(function(a, b){
			        	return ((a['categoryName']  == b['categoryName']) ? 0 : ((a['categoryName']>    b['categoryName']) ? 1 : -1 ));

			        });
			        $(data.training ).each(function(i, obj) {
			        	  tr = $('<tr/>');
					        tr.append("<td><a href='www.splunk.com'>" + this.trainingName +  ":"+this.categoryName+"</a></td>");
					        tr.append("<td>" + this.trainingDesc + "</td>");
							if(this.trainingStatus == "C"){
					        tr.append("<td>" + 'Complete' + "</td>");
							} else 
								tr.append("<td>" + 'Pending' + "</td>");
					        /*tr.append("<td><a href='www.splunk.com' value='www.splunk.com'>Assessment</a></td>");*/
						       
					        $('#table1').append(tr);
			        })
				});

}

function pop2(obj){	
	$.getJSON("../jsons/status.json",
			function (data) {
			    var tr;
			    tr = $('<tr/>');
		        tr.append("<td><B>User Name</B></td>");
		        tr.append("<td></B>Training Name</B></td>");
		        tr.append("<td><b>Description</b> </td>");
		        tr.append("<td><b>Status</b> </td>");
		        tr.append("<td><b>Assessment</b> </td>");
		        $('#table1').append(tr);
			    for (var i = 0; i < data.length; i++) {
			        tr = $('<tr/>');
			        tr.append("<td><a href='#'>" + data[i].firstName +" "+ data[i].lastName+ "</a></td>");
			        tr.append("<td>" + data[i].trainingName + "</td>");
			        tr.append("<td>" + data[i].trainingDesc + "</td>");
			        tr.append("<td>" + 'Pending' + "</td>");
			        tr.append("<td><a href='http://www.splunk.com'>Assessment</a></td>");
				       
			        $('#table1').append(tr);
			    }
			});
}
	function validateRegister(){
		var fname= document.getElementById("fname").value;
		var lname= document.getElementById("lname").value;
		var email= document.getElementById("email").value;
		var clevel= document.getElementById("cLevel").value;
		var sname= document.getElementById("sname").value;
		var password= document.getElementById("password").value;
		$.get("../rest/user/register?fname="+fname+"&lname="+lname+"&email="+email+"&clevel="+clevel+"&sname="+sname+"&password="+password, function(result){
			if(result.id==0){
				$('#loginMsg').html("User already exist. Please try again");
				return;
			}
				
			window.location.href="../views/home.html";
		});
	}
	
	
	function status(){	
		$.getJSON("../jsons/trainingStatus.json",
				function (data) {
				   //data goes here
				});

	}
	
	function trainingWindow(){
		window.open("www.splunk.com");
	}
	
	function exitButton(){
		
		if (window.confirm("Do you really want to leave?")) { 
			  window.open("registerTab.html", "Thanks for Visiting!");
			}
	}
