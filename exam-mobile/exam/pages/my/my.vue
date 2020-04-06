<template>
	<view class="body">
		<view class="header">
			<view class="background">
			
		</view>
		
		<view class="message_box">
			
			</view>
			<view class="profile">
					<image class="" src="../../static/My/touxiang.png" mode=""></image>
					<text>{{name}}</text>
				</view>
				<view class="messages">
					<view class="message">
						<view class="text">
							{{WeekOfRanking}}
						</view>
						<view class="ranking">周排行</view>
					</view>
					<view class="message1">
						<view class="text">
							{{Monthranking}}
						</view>
						<view class="ranking">月排行</view>
					</view>
					<view class="message2">
						<view class="text">
							{{integral}}
						</view>
						<view class="ranking">积分</view>
					</view>
				</view>
				
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				name:'园宝样的猪',
				WeekOfRanking:1,
				integral:0,
				Monthranking:1
			}
		},
		methods: {
			
		}
	}
</script>

<style>

.background{
	width: 100%;
	height: 300upx;
	background-color: green;
}
.message_box{
	width: 90%;
	height: 350upx;
	border-radius: 10px;
		background-color: white;
		text-align: center;
		margin: auto;
		margin-top: -170upx;
		box-shadow: 7upx 7upx 5upx #F0F0F0;
		z-index: -2;
}
.profile{
	width: 30%;
	height: 200upx;
	border-radius: 50%;
/* 	background-color: #007AFF; */
	margin: auto;
	/* padding-top: -60upx; */
	margin-top: -450upx;
	z-index: 9;
}
.profile image{
	border-radius: 50%;
	width: 100%;
	height: 200upx;
}
.profile text{
	width: 100%;
	
	text-align: center;
	padding-left: 25upx;
}
.messages{
	width: 90%;
	height: 190upx;
	margin: auto;
	
	margin-top: 60upx;
	display: flex;
}
.message{
	width: 33.5%;
	height: 190upx;

	
}
.text{
	width: 100%;
	height: 60upx;
	text-align: center;
	line-height: 150upx;
	font-size: 60upx;
	font-weight: bold;
	
}
.ranking{
	width: 100%;
	height: 60upx;
	text-align: center;
	line-height: 150upx;
	font-size: 40upx;
	font-weight: 500;
}
.message1{
	width: 33.5%;
	height: 190upx;

	
}
.message2{
	width: 33.5%;
	height: 190upx;

	
}
</style>
