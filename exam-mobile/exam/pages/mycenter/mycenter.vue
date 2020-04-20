<template>
	<view class="body">
		<view class="profile_box">
			<view class="profile_text">头像</view>
			<view class="image"><image src="../../static/My/touxiang.png" mode=""></image></view>
		</view>
		<view class="profile_box1">
			<view class="profile_text1">学号</view>
			<view class="profile_text1">{{ fputs }}</view>
		</view>
		<view class="profile_box1">
			<view class="profile_text1">积分</view>
			<view class="profile_text1">{{ integral }}</view>
		</view>
		<view class="profile_box1">
			<view class="profile_text1">用户名</view>
			<view @click="Modify" class="profile_text1">{{ username }}</view>
		</view>
		<view class="profile_box1">
			<view class="profile_text1">姓名</view>
			<view class="profile_text1">{{ name }}</view>
		</view>
		<view class="profile_box1">
			<view class="profile_text1">电话</view>
			<view class="profile_text1">{{ phone }}</view>
		</view>
		<view class="profile_box1">
			<view class="profile_text1">班级</view>
			<view class="profile_text1">{{ grade }}</view>
		</view>
		<view class="button"><button @click="dianji" type="default">退出登录</button></view>
	</view>
</template>

<script>
export default {
	data() {
		return {
			fputs: '0428180324',
			integral: 0,
			username: '园宝养的猪',
			name: '皇帝',
			phone: '17568215212',
			grade: '高软3班',
			num:0
		};
	},
	methods: {
		
	Modify() {
		// let mima = prompt("请输入密码");
		// var prompt = prompt("请修改你的用户名");
		
		

		
		if(this.num>=3){
			alert('你今天已经修改了3次了');
			return;
		}else{
			var num = 0;
			var  cc = prompt("请修改你的用户名");
			if(cc!=null){
				this.username = cc;
				this.num = this.num+1;
				console.log('num'+this.num)
			}
		}
		
		
	},
		dianji() {
			var com = confirm('确定要退出登录吗?');
			if (com) {
				location.reload();
				uni.setStorage({
					key: 'username',
					data: ''
				});
				uni.setStorage({
					key: 'password',
					data: ''
				});
				uni.setStorage({
					key: 'SUID',
					data: ''
				});
			} else {
				console.log('我不退出了');
			}
		}
		
	},
	onShow() {
		var login = this.checkLogin('../login/login', '1');
		if (login == null) {
			uni.showToast({
				title: '登录不成功'
			});
			return false;
		}
	}
};
</script>

<style>
* {
	padding: 0;
	margin: 0;
}
.profile_box {
	width: 100%;
	height: 150upx;
	margin: auto;
	border-bottom: 1upx solid #c8c7cc;
	display: flex;
}
.profile_box1 {
	width: 100%;
	height: 100upx;
	margin: auto;
	border-bottom: 1upx solid #c8c7cc;
	display: flex;
}
.profile_text {
	width: 70%;
	height: 150upx;
	color: #000000;
	line-height: 150upx;
	text-indent: 15upx;
	font-size: 35upx;
}
.profile_text1 {
	margin: auto;
	width: 70%;
	height: 150upx;
	color: #000000;
	line-height: 100upx;
	text-indent: 15upx;
	font-size: 35upx;
}
.image {
	width: 30%;
	height: 150upx;
}
.image image {
	border-radius: 50%;
	width: 80%;
	height: 150upx;
}
.button {
	width: 80%;
	height: 90upx;
	margin: auto;
	margin-top: 70upx;
}
.button button {
	width: 90%;
	height: 90upx;
	line-height: 90upx;
	margin: auto;
	background-color: #4cd964;
	border-radius: 10upx;
}
</style>
