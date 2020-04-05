<template>
	<view class="body">
		<view class="header">
			<view class="image">
				<image src="http://p3.qhimgs0.com/sdm/280_200_60/t01f2edf080eb6f3b83.jpg" mode=""></image>
			</view>
			<view class="titleBar">
				<view @click="dianji" class="ranking size"><image src="../../static/titleBar/排名%20(1).png" mode=""></image><view class="fontSize">日测排名</view></view>
				<view @click="dianji" class="weekly size"><image src="../../static/titleBar/排名.png" mode=""></image><view class="fontSize">周测排名</view></view>
				<view @click="dianji" class="course size"><image src="../../static/titleBar/课程.png" mode=""></image><view class="fontSize">视频课程</view></view>
				<view @click="dianji" class="Questions size"><image src="../../static/titleBar/题库管理.png" mode=""></image><view class="fontSize">试卷题库</view></view>
			</view>
			<view class="concent">
				<view class="inform">
					<view class="trumpet"><image src="../../static/index/喇叭.png" mode=""></image></view>
					<view class="title-area">
						<text class="title">{{title}}</text>
					</view>
					<view class="text-area">
						<text class="text">点击查看更多 ></text>
					</view>
					
				</view>
			</view>
		</view>
		
	</view>
</template>

<script>
	export default {
		data() {
			return {
				title: '暂时未有通知'
			}
		},
		onLoad() {

		},
		methods: {
          dianji(){
			  uni.showToast({
			  	title:'此功能未开放',
			    duration:1000
			  })
		  }
		}
	}
</script>

<style>
	.body {
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
	   height: 70%;
   }
   .fontSize{
	   font-size: 30upx;
   }
   .ranking{
	   /* padding-left: 10upx; */
	   padding-left: 5%;
   }
   .weekly {
	   /* padding-left: 60upx; */
	   padding-left: 6%;
   }
   .course{
	 /* padding-left: 33px;  */
	 padding-left: 6%;
   }
   .Questions{
	   /* padding-left: 45upx; */
	   padding-left: 6%;
   }

	/* .text-area {
		display: flex;
		justify-content: center;
	} */

	.title {
		font-size: 36rpx;
		color: #8f8f94;
	}
	.inform{
		width: 100%;
		height:5% ;
		
		display: flex;
	}
	.trumpet image{
		width: 50upx;
		height: 50upx;
	}
	.concent{
		margin-top: 15upx;
		margin-left: 0upx;
		border-bottom: 3upx solid gray;
	}
	.title-area{
		width: 80%;
		height:5%;
		/* background-color: #4CD964; */
		display: flex;
		
	}
	.text-area{
		width: 50%;
		display: flex;
		
	}
	.title{
		color: #DD524D;
	}
	.text{
		color: #808080;
	}
</style>
