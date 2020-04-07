import Vue from 'vue'
import App from './App'

Vue.config.productionTip = false

App.mpType = 'app'

const app = new Vue({
    ...App
})
app.$mount()
Vue.prototype.checkLogin = function(backpage, backtype){
	var SUID  = uni.getStorageSync('SUID');
	var SUNAME = uni.getStorageSync('username');
	var SUPASSWORD = uni.getStorageSync('password');
	console.log("id"+SUID);
	console.log("name"+SUNAME);
	console.log("password"+SUPASSWORD);
	if(SUID == '' || SUNAME == '' || SUPASSWORD == ''){
		uni.redirectTo({url:'../login/login?backpage='+backpage+'&backtype='+backtype});
		return false;
	}
	return [SUID, SUNAME, SUPASSWORD];
}
