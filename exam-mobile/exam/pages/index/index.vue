<template>
	<view class="content">
		<view class="header">
			<view class="image">
				<image src="http://p3.qhimgs0.com/sdm/280_200_60/t01f2edf080eb6f3b83.jpg" mode=""></image>
			</view>
			<view class="titleBar">
				<view class="ranking size"><image src="../../static/titleBar/排名%20(1).png" mode=""></image><view class="fontSize">日测排名</view></view>
				<view class="weekly size"><image src="../../static/titleBar/排名.png" mode=""></image><view class="fontSize">周测排名</view></view>
				<view class="course size"><image src="../../static/titleBar/课程.png" mode=""></image><view class="fontSize">视频课程</view></view>
				<view class="Questions size"><image src="../../static/titleBar/题库管理.png" mode=""></image><view class="fontSize">试卷题库</view></view>
			</view>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				title: 'Hello'
			}
		},
		onLoad() {

		},
		methods: {

		}
	}
</script>

<style>
	.content {
		display: flex;
		flex-direction: column;
		align-items: center;
		justify-content: center;
	}
   .header{
	   width: 100%;
	  height: 400upx;
	   background-color: #4CD964;
	   z-index: -2;
   }
   .image image{
	  width: 100%;
	  height: 400upx; 
	  z-index: -1;
   }
   .titleBar {
	   width:90%;height: 200upx;
	   background-color: white;
	   border-radius: 15upx;
	   border: 5upx solid gray;
	   display: flex;
	   margin-top: -90upx;
	   z-index: 0;
	   margin-left: 35upx;
   }
   .size image{
	   width: 90%;
	   height: 130upx;
   }
   .fontSize{
	   font-size: 30upx;
   }
   .ranking{
	   padding-left: 10upx;
   }
   .weekly {
	   padding-left: 60upx;
   }
   .course{
	 padding-left: 33px;  
   }
   .Questions{
	   padding-left: 45upx;
   }

	.text-area {
		display: flex;
		justify-content: center;
	}

	.title {
		font-size: 36rpx;
		color: #8f8f94;
	}
</style>
