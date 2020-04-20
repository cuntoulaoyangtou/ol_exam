<template>
	<view class="body">
		<view class="header">
			<view class="container">
			        <view class="retroaction">问题与反馈</view>
			         <view class="text">
						 <textarea placeholder="请详细描述你的问题和意见..." auto-height="true"></textarea>
					 </view>
			    </view>
			<view class="photo">
				<view class="retroaction">图片(选填,提供问题的截图,照片大小10M一下)</view>
			    
			</view>	
		</view>
		
	</view>
</template>

<script>
	export default {
		data() {
			return {
	placeholder: '开始输入...'
			}
		},
		methods: {
		bindTextAreaBlur: function (e) {
		            console.log(e.detail.value)
		        }
		}
	}
</script>

<style>
.body{
	padding:0;
	margin: 0;
	
}
.retroaction{
	width: 100%;
	height: 50upx;
	color: #8F8F94;
	font-size: 28upx;
	text-indent: 35upx;
	line-height: 50upx;
}
.text{
	width: 100%;
	height: 200upx;
	margin-top: 10upx;
	padding-left: 60upx;
}
</style>
