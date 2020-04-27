
var passWord = /^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{8,14}$/;
var verifyRule=/^[0-9]{6}$/;
var phoneRule = /^[0-9]{11}$/;

function phone() {
	var input1 = document.getElementById("input1");
	var div1_form1_p3 = document.getElementById("div1_form1_p3");
	
	if (input1.value == "" || input1.value == null) {
		div1_form1_p3.innerHTML = "账号不能为空";
		div1_form1_p3.style.color = "red";
		return false;
	} else if (!phoneRule.test(input1.value)) {
		div1_form1_p3.innerHTML = "账号格式不对";
		div1_form1_p3.style.color = "red";
		return false;
	} else {
		div1_form1_p3.innerHTML = "&nbsp;";
		return true;
	}
}

function verify() {
	var input2 = document.getElementById("input2");
	var div1_form1_p4 = document.getElementById("div1_form1_p4");
	
	if (input2.value == "" || input2.value == null) {
		div1_form1_p4.innerHTML = "验证码不能为空";
		div1_form1_p4.style.color = "red";
		return false;
	} else if (!verifyRule.test(input2.value)) {
		div1_form1_p4.innerHTML = "验证码格式不对";
		div1_form1_p4.style.color = "red";
		return false;
	} else {
		div1_form1_p4.innerHTML = "&nbsp;";
		return true;
	}
}
var input3;
function password() {
	var div1_form1_p6 = document.getElementById("div1_form1_p6");
	input3 = document.getElementById("input3");
	
	if (input3.value == "" || input3.value == null) {
		div1_form1_p6.innerHTML = "密码不能为空";
		div1_form1_p6.style.color = "red";
		return false;
	} else if (!passWord.test(input3.value)) {
		div1_form1_p6.innerHTML = "密码是由8-14个数字和字符组成的";
		div1_form1_p6.style.color = "red";
		return false;
	} else {
		div1_form1_p6.innerHTML = "&nbsp;";
		return true;
	}
}

function password2(){
	var input4 = document.getElementById("input4");
	var div1_form1_p8 = document.getElementById("div1_form1_p8");
	
	if (input4.value == "" || input4.value == null) {
		div1_form1_p8.innerHTML = "密码不能为空";
		div1_form1_p8.style.color = "red";
		return false;
	} else if (!passWord.test(input3.value)) {
		div1_form1_p8.innerHTML = "密码是由8-14个数字和字符组成的";
		div1_form1_p8.style.color = "red";
		return false;
	} else if (input3.value!=input4.value) {
		div1_form1_p8.innerHTML = "密码不相同";
		div1_form1_p8.style.color = "red";
		return false;
	} else {
		div1_form1_p8.innerHTML = "&nbsp;";
		return true;
	}
}
function myform() {
	if (phone()&&verify() && password()&&password2()) {
		return true;
	} else {
		alert("信息不完整");
		return false;
	}
}
