<template>
	<view class="body">
		<view class="header">
			<view class="background"></view>

			<view class="message_box"></view>
			<view class="profile">
				<image class="" src="../../static/My/touxiang.png" mode=""></image>
				<text>{{ name }}</text>
			</view>
			<view class="messages">
				<view @click="dianji" class="message">
					<view class="text">{{ WeekOfRanking }}</view>
					<view class="ranking">周排行</view>
				</view>
				<view @click="dianji" class="message1">
					<view class="text">{{ Monthranking }}</view>
					<view class="ranking">月排行</view>
				</view>
				<view @click="dianji" class="message2">
					<view class="text">{{ integral }}</view>
					<view class="ranking">积分</view>
				</view>
			</view>
		</view>
		<view class="concent">
			<view @click="dianji4" class="concent_box">
				<view class="concent_image"><image src="../../static/My/gerenzhongxin.png" mode=""></image></view>
				<view class="personal">个人中心</view>
				<view class="more"><image src="../../static/My/jiankuohao.png" mode=""></image></view>
			</view>
			<view @click="dianji2" class="concent_box1">
				<view class="concent_image"><image src="../../static/My/yijian.png" mode=""></image></view>
				<view class="personal">意见反馈</view>
				<view class="more"><image src="../../static/My/jiankuohao.png" mode=""></image></view>
			</view>
			<view @click="dianji3" class="concent_box2">
				<view class="concent_image"><image src="../../static/My/shezhi.png" mode=""></image></view>
				<view class="personal">系统设置</view>
				<view class="more"><image src="../../static/My/jiankuohao.png" mode=""></image></view>
			</view>
		</view>
	</view>
</template>

<script>
export default {
	data() {
		return {
			name: '园宝养的猪',
			WeekOfRanking: 1,
			integral: 0,
			Monthranking: 1
		};
	},
	onShow() {
		var login = this.checkLogin('../login/login', '1');
		if (login == null) {
			uni.showToast({
				title: '登录不成功'
			});
			return false;
		}
	},
	methods: {
		dianji4() {
			uni.navigateTo({
				url:'../mycenter/mycenter'
			})
		},
		dianji3(){
			uni.navigateTo({
				url:'../setting/setting'
			})
		},
		dianji2(){
			uni.navigateTo({
				url:'../feedback/feedback'
			})
		},
		dianji(){
			uni.showToast({
				title:'此功能未开放'
			})
		}
		
	}
};
</script>

<style>
.background {
	width: 100%;
	height: 300upx;
	background-color: green;
}
.message_box {
	width: 90%;
	height: 350upx;
	border-radius: 10px;
	background-color: white;
	text-align: center;
	margin: auto;
	margin-top: -170upx;
	box-shadow: 7upx 7upx 5upx #f0f0f0;
	z-index: -2;
}
.profile {
	width: 30%;
	height: 200upx;
	border-radius: 50%;
	/* 	background-color: #007AFF; */
	margin: auto;
	/* padding-top: -60upx; */
	margin-top: -450upx;
	z-index: 9;
}
.profile image {
	border-radius: 50%;
	width: 100%;
	height: 200upx;
}
.profile text {
	width: 100%;

	text-align: center;
	padding-left: 25upx;
}
.messages {
	width: 90%;
	height: 190upx;
	margin: auto;

	margin-top: 60upx;
	display: flex;
}
.message {
	width: 33.5%;
	height: 190upx;
}
.text {
	width: 100%;
	height: 60upx;
	text-align: center;
	line-height: 150upx;
	font-size: 60upx;
	font-weight: bold;
}
.ranking {
	width: 100%;
	height: 60upx;
	text-align: center;
	line-height: 150upx;
	font-size: 40upx;
	font-weight: 500;
}
.message1 {
	width: 33.5%;
	height: 190upx;
}
.message2 {
	width: 33.5%;
	height: 190upx;
}
.concent {
	width: 100%;
	height: 360upx;
	background-color: #f0f0f0;
}
.concent_box {
	width: 100%;
	height: 100upx;
	background-color: white;
	display: flex;
	margin-top: 20upx;
}
.concent_box1 {
	width: 100%;
	height: 100upx;
	background-color: white;
	display: flex;
	margin-top: 20upx;
}
.concent_box2 {
	width: 100%;
	height: 100upx;
	background-color: white;
	display: flex;
	margin-top: 20upx;
}
.concent_image image {
	width: 80upx;
	height: 80upx;
	padding-left: 20upx;
}
.personal {
	width: 90%;
	height: 80upx;
	line-height: 80upx;
	text-indent: 30upx;
}
.more image {
	width: 50upx;
	height: 50upx;
	padding-top: 20upx;
	padding-right: 10upx;
}
</style>
