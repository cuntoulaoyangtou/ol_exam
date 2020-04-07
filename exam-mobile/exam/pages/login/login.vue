<template>
	<view class="body">
		<view class="image">
			<image src="../../static/My/touxiang.png" mode=""></image>
			<view class="form">
				<form @submit="formSubmit" @reset="formReset">
					<view class="account">
						<view class="account_s">账号:</view>
						<input type="number" placeholder="请输入账号" class="text" v-model="UserTmp.username" />
					</view>
					<view class="account1">
						<view class="account_s">密码:</view>
						<input type="password" placeholder="请输入密码" class="text" v-model="UserTmp.password" />
					</view>
					<view class="button">
						<button class="button1" size="mini" form-type="submit">登录</button>
						<button class="button2" size="mini" form-type="reset">重置</button>
					</view>
				</form>
			</view>
		</view>
	</view>
</template>

<script>
export default {
	data() {
		return {
			UserTmp:{
				username:"",
				password:""
			}
		};
	},
	methods: {
		formSubmit:function(){
	       console.log(this.UserTmp)
		   uni.switchTab({
		   	url:'../index/index',
			
			
		   })
		   uni.setStorage({
		   	key:'username',
		   	data:this.UserTmp.username
		   }),
		   uni.setStorage({
		   	key:'password',
		   	data:this.UserTmp.password
		   }),
		   uni.setStorage({
		   	key:'SUID',
		   	data:1
		   })
		}
	}
};
</script>

<style>
* {
	padding: 0;
	margin: 0;
}
.body {
	width: 100%;
	height: 1500upx;
	background-color: #007aff;
}
.image {
	width: 100%;
	height: 300upx;
}
.image image {
	width: 40%;
	height: 300upx;
	border-radius: 50%;
	margin-top: 150upx;
	margin-left: 250upx;
}

.button {
	width: 100%;
	height: 70upx;
	padding-top: 50upx;
	margin: auto;
}
.button1 {
	margin-left: 190upx;
	width: 30%;
	height: 70upx;
	margin-top: 60upx;
	padding-top: 11upx;
}
.button2 {
	margin-left: 50upx;
padding-top: 11upx;
	width: 30%;
	height: 70upx;
}
.form {
	width: 100%;
	height: 200upx;
	margin-top: 60upx;
}
.text {
	width: 70%;
	height: 80upx;
	margin: auto;
	background-color: white;
	border-radius: 15upx;
}
.account {
	display: flex;
}
.account1 {
	display: flex;
	padding-top: 40upx;
}
.account_s {
	height: 80upx;
	width: 20%;
	text-indent: 60upx;
	line-height: 80upx;
}
</style>
