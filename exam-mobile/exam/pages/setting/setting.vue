<template>
	<view class="body">
		<view class="header">
			<view class="message">
				<view class="messages">消息推送</view>
				<view class="switch"><switch color="#4CD964" checked="true" @change="change" /></view>
			</view>
			<view class="message1">
				<view class="messages">清除缓存</view>
			</view>
			<view class="message2">
				<view class="messages">关于在线考试系统</view>
			</view>
			<view class="message3">
				<view class="messages">检查更新</view>
				<view class="versions">当前版本：{{versions}}</view>
			</view>
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
				versions:'1.0.9'
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
			},
			change(){
				console.log("我改变了")
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
	}
</script>

<style>
*{
	padding: 0;
	margin: 0;
}
.header{
	width: 100%;
	height:500upx;

}
.message{
	display: flex;
	width: 100%;
	height: 130upx;

}
.message1{
	display: flex;
	width: 100%;
	height: 130upx;

}
.message2{
	display: flex;
	width: 100%;
	height: 130upx;

}
.message3{
	display: flex;
	width: 100%;
	height: 130upx;

}
.messages{
	width: 80%;
	height: 130upx;
	line-height: 130upx;
	text-indent: 30upx;
}
.switch{
	width: 20%;
	height: 130upx;
	padding-top: 30upx;
}
.versions{
	width: 60%;
	height: 130upx;
	line-height: 130upx;
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
