
var passWord = /^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{8,14}$/;
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

function password() {
	var input2 = document.getElementById("input2");
	var div1_form1_p5 = document.getElementById("div1_form1_p5");
	
	if (input2.value == "" || input2.value == null) {
		div1_form1_p5.innerHTML = "密码不能为空";
		div1_form1_p5.style.color = "red";
		return false;
	} else if (!passWord.test(input2.value)) {
		div1_form1_p5.innerHTML = "密码是由8-14个数字和字符组成的";
		div1_form1_p5.style.color = "red";
		return false;
	} else {
		div1_form1_p5.innerHTML = "&nbsp;";
		return true;
	}
}

function myform() {
	if (phone() && password()) {
		return true;
	} else {
		alert("账号或密码不对");
		return false;
	}
}
