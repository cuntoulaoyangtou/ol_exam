<template>
	<view class="body">
		<view class="profile_box">
			<view class="profile_text">头像</view>
			<view class="image"><image src="../../static/My/touxiang.png" mode=""></image></view>
		</view>
		<view class="profile_box1">
			<view class="profile_text1">学号</view>
			<view class="profile_text1">0428180324</view>
		</view>
		<view class="profile_box1">
			<view class="profile_text1">积分</view>
			<view class="profile_text1">0</view>
		</view>
		<view class="profile_box1">
			<view class="profile_text1">用户名</view>
			<view class="profile_text1">园宝养的猪</view>
		</view>
		<view class="profile_box1">
			<view class="profile_text1">姓名</view>
			<view class="profile_text1">王龙达</view>
		</view>
		<view class="profile_box1">
			<view class="profile_text1">电话</view>
			<view class="profile_text1">15236229501</view>
		</view>
		<view class="profile_box1">
			<view class="profile_text1">班级</view>
			<view class="profile_text1">高软3班</view>
		</view>
		<view class="button">
			<button @click="dianji" type="default">退出登录</button>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				
			}
		},
		methods: {
			dianji(){
				var com =  confirm("确定要退出登录吗?");
				if(com){
					location.reload();
					uni.setStorage({
						key:'username',
						data:''
					});
					uni.setStorage({
						key:'password',
						data:''
					});
					uni.setStorage({
						key:'SUID',
						data:''
					});
				}else{
					console.log("我不退出了");
				}
			}
		}
	}
</script>

<style>
*{
	padding: 0;
	margin: 0;
}
.profile_box{
	width: 100%;
	height: 150upx;
	margin: auto;
border-bottom: 1upx solid #C8C7CC;
display: flex;
}
.profile_box1{
	width: 100%;
		height: 100upx;
		margin: auto;
	border-bottom: 1upx solid #C8C7CC;
	display: flex;
}
.profile_text{
	width: 70%;
	height: 150upx;
color: #000000;
	line-height: 150upx;
	text-indent: 15upx;
	font-size: 35upx;
	
}
.profile_text1{
	margin: auto;
	width: 70%;
	height: 150upx;
color: #000000;
	line-height: 100upx;
	text-indent: 15upx;
	font-size: 35upx;
	
}
.image{
	width: 30%;
	height: 150upx;
}
.image image{
	border-radius: 50%;
	width: 80%;
	height: 150upx;
}
.button{
	width: 80%;
	height: 90upx;
	margin: auto;
	margin-top: 70upx;
}
.button button{
	width: 90%;
	height: 90upx;
	
		margin: auto;
		background-color: #4CD964;
	border-radius: 10upx;
}
</style>
