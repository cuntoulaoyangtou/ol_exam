const token = "exam-token";
//设置Cookie expires单位分钟
function setCookie(c_name, value, expires) {
    var exdate = new Date();
    exdate.setTime(exdate.getTime() + expires * 60*1000);   //时间单位毫秒
    document.cookie = c_name + "=" + escape(value) + ";expires=" + exdate.toGMTString() + ";path=/";
}
// 读取cookie
function getCookie(c_name) {
    if (document.cookie.length > 0)     {
        c_start = document.cookie.indexOf(c_name + "=")
        if (c_start != -1){
            c_start = c_start + c_name.length + 1
            c_end = document.cookie.indexOf(";", c_start)
            if (c_end == -1)
                c_end = document.cookie.length
            return unescape(document.cookie.substring(c_start, c_end))
        }
    }
    return ""
}
// 检查cookie
function checkCookie(c_name) {
    var username = getCookie(c_name);
    if (username != null && username != "")
    { return true; }
    else
    { return false;  }
}
// 清除cookie
function clearCookie(name) {
    setCookie(name, "", -1);
}


//退出登录
function logout() {
    $.get("/api/user/logout",{token:getCookie(token)},function (data) {
        if (data.code == "SUCCESS") {
            //设置cokie
            clearCookie(token);
            //跳转首页
            console.log(data);
            location.href = "/";
        } else {
            Notiflix.Notify.Failure(data.message);
        }
    })
}
