<template>
	<view class="body">
		<view class="header">
			<view class="test">
				<view class="title">
				  正式考试
				</view>
				<view class="tests">
					<view @click="dianji" class="tests1">
						<image src="../../static/question/ceshi.png" mode=""></image>
					<view class="test1_text">日测</view>
					</view>
					<view @click="dianji" class="tests2">
						<image src="../../static/question/ceshi.png" mode=""></image>
					<view class="test1_text">周测</view>
					</view>
					<view @click="dianji" class="tests3">
						<image src="../../static/question/ceshi.png" mode=""></image>
					<view class="test1_text">内测</view>
					</view>
				</view>
			</view>
			<view class="test1">
				<view class="title">
				  随机练习
				</view>
				<view class="tests">
					<view @click="dianji" class="tests1">
						<image src="../../static/question/ceshi.png" mode=""></image>
					<view class="test1_text">每日练习</view>
					</view>
					<view @click="dianji" class="tests2">
						<image src="../../static/question/ceshi.png" mode=""></image>
					<view class="test1_text">每周练习</view>
					</view>
					<view @click="dianji" class="tests3">
						<image src="../../static/question/ceshi.png" mode=""></image>
					<view class="test1_text">内部练习</view>
					</view>
				</view>
			</view>
			<view class="test2">
				<view class="title">
				  其他
				</view>
				<view @click="dianji" class="tests">
					<view class="tests1">
						<image src="../../static/question/ceshi.png" mode=""></image>
					<view class="test1_text">考试成绩</view>
					</view>
					<view @click="dianji" class="tests2">
						<image src="../../static/question/ceshi.png" mode=""></image>
					<view class="test1_text">收藏夹</view>
					</view>
					<view  @click="dianji" class="tests3">
						<image src="../../static/question/ceshi.png" mode=""></image>
					<view class="test1_text">错题本</view>
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
				
			}
		},
		onShow() {
		 var login = this.checkLogin('../login/login','1');
		 if(login==null){
			 uni.showToast({
			 	title:'登录不成功',	
			 })
			 return false;
		 }
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
*{
	margin: 0;
	padding: 0;
}
.test{
	width: 100%;
	height: 200upx;

}
.test1{
	width: 100%;
	height: 200upx;
	
	margin-top: 20upx;
}
.test2{
	width: 100%;
	height: 200upx;

		margin-top: 20upx;
}
.title{
	width: 100%;
	height: 36upx;
	font-size: 30upx;
	text-indent: 20upx;
	border-left: 9upx solid red;
	background-color: white;
	margin-top: 20upx;
}
.tests{
	width: 100%;
	height: 164upx;
	display: flex;
}
.tests1{
	width: 30%;
	height: 165upx;
	background-color: white;
	padding-left: 30upx;
}
.tests1 image{
	width: 40%;
	height: 70upx;
    padding-left: 70upx;
	padding-top: 40upx;
}
.tests2{
	width: 30%;
	height: 165upx;
	background-color: white;
	padding-left: 20upx;
}
.tests2 image{
	width: 40%;
	height: 70upx;
    padding-left: 70upx;
	padding-top: 40upx;
}
.tests3{
	width: 30%;
	height: 165upx;
	background-color: white;
	padding-left:20upx;
}
.tests3 image{
	width: 40%;
	height: 70upx;
    padding-left: 70upx;
	padding-top: 40upx;
}
.test1_text{
	text-align: center;
}
</style>
