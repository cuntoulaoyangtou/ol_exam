# ol_exam
在线考试系统

[在线API接口](https://console.apipost.cn/doc/49516?du_id=0#358403)

<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<title>在线考试系统接口文档-ApiPost</title>
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="keywords" content="接口文档,ApiPost">
<meta name="description" content="本文档由可直接生成文档的API调试、管理工具ApiPost生成">
<!--自适应声明部分-->
<meta name="applicable-device" content="pc" />
<link rel="shortcut icon" href="https://console.apipost.cn/favicon.ico">
<link rel="stylesheet" type="text/css" href="https://img.cdn.apipost.cn/statics/bootstrap.css">
<link rel="stylesheet" type="text/css" href="https://img.cdn.apipost.cn/statics/build-in/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="https://img.cdn.apipost.cn/statics/build-in/bootstrap/css/document.css?v=2152">
<link rel="stylesheet" type="text/css" href="https://img.cdn.apipost.cn/statics/build-in/bootstrap/css/markdown.css?v=1326">
<link rel="stylesheet" type="text/css" href="https://img.cdn.apipost.cn/statics/build-in/nprogress-0.2.0/nprogress.css">
<link rel="stylesheet" type="text/css" href="https://console.apipost.cn/doc/statics/css/doc.css">
<script type="text/javascript" src="https://img.cdn.apipost.cn/statics/build-in/jquery/jquery.min.js"></script>
<script type="text/javascript" src="https://img.cdn.apipost.cn/statics/build-in/clipboard.js-master/clipboard.min.js"></script>
<script type="text/javascript" src="https://img.cdn.apipost.cn/statics/build-in/nprogress-0.2.0/nprogress.js"></script>
<script type="text/javascript" src="https://img.cdn.apipost.cn/statics/build-in/bootstrap/js/bootstrap.js"></script>
<script language="javascript">
	$(function(){
		let _clipboard = new ClipboardJS('.api-test-send-btn');

        _clipboard.on('success', function(e) {
            e.clearSelection();
        });

        _clipboard.on('error', function(e) {
            console.log(e);
        });

        $(document).on('click', '.api-test-send-btn', function(){
        	let _href = $(this).attr('data-href');
        	window.open(_href);
        });

		let _left_menus = [{"parent_id":"0","folder_id":"60870","name":"admin","item":[{"parent_id":"60870","folder_id":"60869","name":"\u89d2\u8272","item":[{"apiid":"349784","name":"\u5206\u9875\u67e5\u8be2\u89d2\u8272\u6a21\u7cca\u67e5\u8be2","sort":"0","folder_id":"60869"},{"apiid":"349783","name":"\u67e5\u8be2\u89d2\u8272","sort":"0","folder_id":"60869"},{"apiid":"349782","name":"\u5220\u9664\u89d2\u8272","sort":"0","folder_id":"60869"},{"apiid":"349781","name":"\u4fee\u6539\u89d2\u8272","sort":"0","folder_id":"60869"},{"apiid":"349780","name":"\u6dfb\u52a0\u89d2\u8272","sort":"0","folder_id":"60869"}]},{"parent_id":"60870","folder_id":"60872","name":"\u4e13\u4e1a","item":[{"apiid":"349785","name":"\u5206\u9875\u67e5\u8be2\u4e13\u4e1a\u6a21\u7cca\u67e5\u8be2","sort":"0","folder_id":"60872"},{"apiid":"349789","name":"\u67e5\u8be2\u4e13\u4e1a","sort":"1","folder_id":"60872"},{"apiid":"349788","name":"\u5220\u9664\u4e13\u4e1a","sort":"2","folder_id":"60872"},{"apiid":"349787","name":"\u4fee\u6539\u4e13\u4e1a","sort":"3","folder_id":"60872"},{"apiid":"349786","name":"\u6dfb\u52a0\u4e13\u4e1a","sort":"4","folder_id":"60872"}]},{"parent_id":"60870","folder_id":"60873","name":"\u7528\u6237","item":[{"apiid":"358403","name":"\u5728\u7ebf\u7528\u6237","sort":"0","folder_id":"60873"},{"apiid":"349793","name":"\u5206\u9875\u67e5\u8be2\u7528\u6237\u6a21\u7cca\u67e5\u8be2","sort":"0","folder_id":"60873"},{"apiid":"349800","name":"\u5220\u9664\u7528\u6237","sort":"1","folder_id":"60873"},{"apiid":"349798","name":"\u4fee\u6539\u7528\u6237","sort":"2","folder_id":"60873"},{"apiid":"349796","name":"\u6dfb\u52a0\u7528\u6237","sort":"3","folder_id":"60873"}]},{"parent_id":"60870","folder_id":"60864","name":"\u5b66\u6821","item":[{"apiid":"347896","name":"\u5206\u9875\u67e5\u8be2\u5b66\u6821\u6a21\u7cca\u67e5\u8be2","sort":"0","folder_id":"60864"},{"apiid":"347895","name":"\u67e5\u8be2\u5b66\u6821","sort":"0","folder_id":"60864"},{"apiid":"347892","name":"\u5220\u9664\u5b66\u6821","sort":"0","folder_id":"60864"},{"apiid":"347888","name":"\u4fee\u6539\u5b66\u6821","sort":"0","folder_id":"60864"},{"apiid":"347887","name":"\u6dfb\u52a0\u5b66\u6821","sort":"0","folder_id":"60864"}]},{"parent_id":"60870","folder_id":"60866","name":"\u5e74\u7ea7","item":[{"apiid":"349771","name":"\u5206\u9875\u67e5\u8be2\u5e74\u7ea7\u6a21\u7cca\u67e5\u8be2\u6839\u636e\u5b66\u6821ID\u67e5\u8be2","sort":"0","folder_id":"60866"},{"apiid":"349772","name":"\u67e5\u8be2\u5e74\u7ea7","sort":"1","folder_id":"60866"},{"apiid":"349770","name":"\u5220\u9664\u5e74\u7ea7","sort":"2","folder_id":"60866"},{"apiid":"349769","name":"\u4fee\u6539\u5e74\u7ea7","sort":"3","folder_id":"60866"},{"apiid":"349434","name":"\u6dfb\u52a0\u5e74\u7ea7","sort":"4","folder_id":"60866"}]},{"parent_id":"60870","folder_id":"60868","name":"\u73ed\u7ea7","item":[{"apiid":"349777","name":"\u5206\u9875\u67e5\u8be2\u73ed\u7ea7\u6a21\u7cca\u67e5\u8be2\u6839\u636e\u5b66\u6821ID\u6216\u5e74\u7ea7ID\u6216\u4e13\u4e1aID\u67e5\u8be2","sort":"0","folder_id":"60868"},{"apiid":"349776","name":"\u67e5\u8be2\u73ed\u7ea7","sort":"0","folder_id":"60868"},{"apiid":"349775","name":"\u5220\u9664\u73ed\u7ea7","sort":"0","folder_id":"60868"},{"apiid":"349774","name":"\u4fee\u6539\u73ed\u7ea7","sort":"0","folder_id":"60868"},{"apiid":"349773","name":"\u6dfb\u52a0\u73ed\u7ea7","sort":"0","folder_id":"60868"}]},{"parent_id":"60870","folder_id":"63994","name":"\u73ed\u7ea7\u7ba1\u7406"},{"parent_id":"60870","folder_id":"63953","name":"\u8bfe\u7a0b","item":[{"apiid":"371551","name":"\u5206\u9875\u67e5\u8be2\u8bfe\u7a0b\u6a21\u7cca\u67e5\u8be2\u6839\u636e\u4e13\u4e1aID\u67e5\u8be2","sort":"0","folder_id":"63953"},{"apiid":"371528","name":"\u67e5\u8be2\u8bfe\u7a0b","sort":"0","folder_id":"63953"},{"apiid":"371523","name":"\u5220\u9664\u8bfe\u7a0b","sort":"0","folder_id":"63953"},{"apiid":"371518","name":"\u4fee\u6539\u8bfe\u7a0b","sort":"0","folder_id":"63953"},{"apiid":"371492","name":"\u6dfb\u52a0\u8bfe\u7a0b","sort":"0","folder_id":"63953"}]},{"parent_id":"60870","folder_id":"63968","name":"\u7ae0\u8282","item":[{"apiid":"371684","name":"\u5206\u9875\u6a21\u7cca\u67e5\u8be2\u8ddf\u8bfe\u7a0bID\u67e5\u8be2\u7ae0\u8282","sort":"0","folder_id":"63968"},{"apiid":"371652","name":"\u67e5\u8be2\u7ae0\u8282","sort":"0","folder_id":"63968"},{"apiid":"371650","name":"\u5220\u9664\u7ae0\u8282","sort":"0","folder_id":"63968"},{"apiid":"371644","name":"\u4fee\u6539\u7ae0\u8282","sort":"0","folder_id":"63968"},{"apiid":"371617","name":"\u6dfb\u52a0\u7ae0\u8282","sort":"0","folder_id":"63968"}]}]},{"parent_id":"0","folder_id":"60871","name":"api","item":[{"parent_id":"60871","folder_id":"60865","name":"\u7528\u6237","item":[{"apiid":"358316","name":"\u9000\u51fa\u767b\u5f55","sort":"0","folder_id":"60865"},{"apiid":"349792","name":"\u83b7\u53d6\u7528\u6237","sort":"0","folder_id":"60865"},{"apiid":"349790","name":"\u7528\u6237\u767b\u5f55","sort":"0","folder_id":"60865"},{"apiid":"349763","name":"\u7528\u6237\u6ce8\u518c","sort":"0","folder_id":"60865"}]},{"parent_id":"60871","folder_id":"60880","name":"\u5b66\u6821","item":[{"apiid":"349864","name":"\u67e5\u8be2\u6240\u6709\u5b66\u6821","sort":"0","folder_id":"60880"}]},{"parent_id":"60871","folder_id":"60892","name":"\u5e74\u7ea7","item":[{"apiid":"349938","name":"\u67e5\u8be2\u6240\u6709\u5e74\u7ea7","sort":"0","folder_id":"60892"},{"apiid":"349946","name":"\u67e5\u8be2\u5e74\u7ea7","sort":"1","folder_id":"60892"}]},{"parent_id":"60871","folder_id":"60894","name":"\u73ed\u7ea7","item":[{"apiid":"349989","name":"\u67e5\u8be2\u6240\u6709\u73ed\u7ea7","sort":"0","folder_id":"60894"},{"apiid":"349982","name":"\u67e5\u8be2\u73ed\u7ea7","sort":"0","folder_id":"60894"}]},{"parent_id":"60871","folder_id":"63964","name":"\u8bfe\u7a0b","item":[{"apiid":"371601","name":"\u6839\u636e\u4e13\u4e1aID\u67e5\u8be2\u8bfe\u7a0b","sort":"0","folder_id":"63964"}]},{"parent_id":"60871","folder_id":"63989","name":"\u7ae0\u8282","item":[{"apiid":"371759","name":"\u6839\u636e\u8bfe\u7a0bID\u67e5\u8be2\u7ae0\u8282","sort":"0","folder_id":"63989"}]}]}];
		let _init_apiid = 371759;

		if(window.location.hash){
			let _hash_apiid = parseInt(window.location.hash.substr(1));
			_init_apiid = _hash_apiid ? _hash_apiid : _init_apiid;
		}

		//收缩文档页面左侧菜单
        let _is_pull = 0;
        $('.document-pull-left').click(function(){
            _is_pull = !_is_pull;

            if(_is_pull){
                $(".book-summary").css("left","-300px");
                $(".book-body").css("left","0");
            }else{
                $(".book-summary").css("left","0");
                $(".book-body").css("left","300px");
            }
        });

        //文档上一页
        $('.navigation-prev').click(function(){
        	// let _length = $('.load-api-btn').length;
        	let _index = Math.max($('.load-api-btn').index($('.load-api-btn.active')) - 1, 0);
        	let _apiid = parseInt($('.load-api-btn').eq(_index).attr('data-id'));

        	_load_document(_apiid);
        });

        //文档下一页
        $('.navigation-next').click(function(){
        	let _length = $('.load-api-btn').length;
        	let _index = Math.min($('.load-api-btn').index($('.load-api-btn.active')) + 1, _length - 1);
        	let _apiid = parseInt($('.load-api-btn').eq(_index).attr('data-id'));

        	_load_document(_apiid);
        });

		//分享文档地址
        $(".export-document-link-btn").click(function() {
            $(this).attr('data-clipboard-text', 'https://console.apipost.cn/doc/49516?du_id=0');
            let _clipboard = new ClipboardJS('.export-document-link-btn');
            _clipboard.on('success', function(e) {
                alert('文档地址复制成功，您可以转发给您的小伙伴啦~');
                e.clearSelection();
                return true;
            });

            _clipboard.on('error', function(e) {
                alert('复制失败，请重试');
                return false;
            });
        });

		//加载左侧菜单
		_load_menu();
		$('.api-search-word').on('input change', function(){
			_load_menu();
		});

		$('.document-summary').on('click', '.load-api-btn', function(){
			let _this = this;
			let _apiid = parseInt($(_this).attr('data-id'));
			_load_document(_apiid);
		}).on('click', 'a[data-type="category"]', function(){
			$(this).next('.articles').toggle();

			if($(this).children('.fa').eq(0).hasClass('fa-folder-open-o')){
				$(this).children('.fa').eq(0).addClass('fa-folder-o').removeClass('fa-folder-open-o');
			}else{
				$(this).children('.fa').eq(0).addClass('fa-folder-open-o').removeClass('fa-folder-o');
			}
		}).on('click', '.load-sub-btn', function () {
            let _this = this;
            let _folder_id = parseInt($(_this).attr('data-id'));
            $('.sub-folder-' + _folder_id).toggle();
            if($(_this).children('.fa').eq(0).hasClass('fa-folder-open-o')){
                $(_this).children('.fa').eq(0).addClass('fa-folder-o').removeClass('fa-folder-open-o');
            }else{
                $(_this).children('.fa').eq(0).addClass('fa-folder-open-o').removeClass('fa-folder-o');
            }
        });

		//加载右侧文档
		_load_document(_init_apiid);

		//私有函数
		//加载右侧文档函数
		function _load_document(_apiid){
			NProgress.start();
			$('.chapter').removeClass('active');
			$('.chapter[data-id="'+_apiid+'"]').addClass('active');
			$('.page-wrapper').addClass('hide');
			$('.page-wrapper[tabindex="'+_apiid+'"]').removeClass('hide');
			$('.load-api-btn').removeClass('active');
			$('.load-api-btn[data-id="'+_apiid+'"]').addClass('active');

			//隐藏空的元素
			$('.document-block-div').each(function(){
				let _this = this;
				let _length = $(_this).find('tbody').eq(0).children().length;
				// console.log(_length);
				if(!_length){
					$(_this).hide();
				}
			});

			window.location.hash='#' + _apiid;
			NProgress.done();
		}

		//加载左侧菜单函数
        function _load_menu(){
        	let _keyword = $.trim($('.api-search-word').val());

        	//左侧渲染
	        $('.document-summary').empty();
	        for(let _x in _left_menus){
	            if(_left_menus[_x].item.length > 0){
                    let _html = '<li class="chapter">';
                    _html += '   <a href="javascript:;" class="' + (parseInt(_left_menus[_x].folder_id) == -1 ? 'default-folder':'') + '" data-type="category" data-id="' + _left_menus[_x].folder_id + '"><i class="fa fa-folder-open-o" aria-hidden="true"></i><strong>' + _left_menus[_x].name + '</strong></a>';
                    _html += '   <ul class="articles">';

                    for(let _l in _left_menus[_x].item){
                        if(!_left_menus[_x].item[_l].hasOwnProperty('apiid')){
                            let _sub_api_html = '';
                            for(let _s in _left_menus[_x].item[_l].item){
                                if(_left_menus[_x].item[_l].item[_s].name.indexOf(_keyword) > -1 || _left_menus[_x].item[_l].item[_s].url.indexOf(_keyword) > -1 || _keyword == '') {
                                    _sub_api_html += '<li class="chapter text-indent-2 ' + (parseInt(_left_menus[_x].item[_l].item[_s].apiid) == _init_apiid ? 'active' : '') + '" data-id="' + _left_menus[_x].item[_l].item[_s].apiid + '"><a class="load-api-btn" href="#' + _left_menus[_x].item[_l].item[_s].apiid + '" data-type="api" data-id="' + _left_menus[_x].item[_l].item[_s].apiid + '"><i class="fa fa-file-text-o" aria-hidden="true"></i>' + _left_menus[_x].item[_l].item[_s].name + ' </a> </li>';
                                }
                            }

                            if(_sub_api_html != ''){
                                _html += '<li class="chapter" data-id="' + _left_menus[_x].item[_l].folder_id + '"><a class="load-sub-btn" href="javascript:;" data-type="api" data-id="' + _left_menus[_x].item[_l].folder_id + '"><i class="fa fa-folder-open-o" aria-hidden="true"></i>' + _left_menus[_x].item[_l].name + ' </a> </li>';
                                _html += '<ul class="sub-folder-' + _left_menus[_x].item[_l].folder_id + '">';
                                _html += _sub_api_html;
                                _html += '</ul>';
                            }
                        }else{
                            if(_left_menus[_x].item[_l].name.indexOf(_keyword) > -1 || _left_menus[_x].item[_l].url.indexOf(_keyword) > -1 || _keyword == ''){
                                _html += '<li class="chapter ' + (parseInt(_left_menus[_x].item[_l].apiid) == _init_apiid ? 'active':'') + '" data-id="' + _left_menus[_x].item[_l].apiid + '"><a class="load-api-btn" href="#' + _left_menus[_x].item[_l].apiid + '" data-type="api" data-id="' + _left_menus[_x].item[_l].apiid + '"><i class="fa fa-file-text-o" aria-hidden="true"></i>' + _left_menus[_x].item[_l].name + ' </a> </li>';
                            }
                        }
                    }
                    _html += '   </ul>';
                    _html += '</li>';

                    $('.document-summary').append(_html);
                }
	        }
        }
	});
</script>
<style type="text/css">
	/*common.css*/
	*{-webkit-box-sizing:border-box;-moz-box-sizing:border-box;box-sizing:border-box;-webkit-overflow-scrolling:touch;-webkit-tap-highlight-color:transparent;-webkit-text-size-adjust:none;-webkit-touch-callout:none;-webkit-font-smoothing:antialiased;font-family:..., "PingFangSC-Regular", "sans-serif", "Hiragino Sans GB", "Microsoft YaHei","WenQuanYi Micro Hei", sans-serif;font-size: .9rem!important ;  outline: none!important;}
	html{outline: none!important;}
	body{background:#f5f7fa}
	a{text-decoration: none}
	a:hover{text-decoration: none}
	img{border:0;}
	a:focus,button:focus{box-shadow: none!important;}
	table,td,th{table-layout:fixed;word-break:break-all; vertical-align: top}

	/*共用按钮*/
	/*橙色*/
	.btn-orange{ background-color: #ff5722!important; border-color: #ff5722!important;color:#fff;}
	.btn-orange:hover{background-color: #f76b40!important;color:#fff;}

	/*灰色*/
	.btn-gray{background-color: #e9ecef!important;color: #6c757d!important;}
	.btn-gray:hover{background-color: #dee2e6!important;color: #6c757d!important;}
    .load-api-btn{position: relative}
    .load-api-btn .api-modify-tips{width: 6px;height: 6px;border-radius: 50%;padding: 0!important;background: #dc3545!important;position: absolute!important;left: 25px;top: 8px;display: none}
    .load-api-btn:hover{color:#dc3545!important;}
    .api-name-class:hover{text-decoration: none}
    .api-name-class .btn-gray{margin-left: 15px;padding: 3px 8px;display: inline-block;}
    .api-name-class .btn-gray:hover{text-decoration: none!important;}
    /*.text-indent-2{text-indent: 1em}*/
    .request_raw_body_desc_textarea{width: 100%; border: 0; height: auto}
	/*弹窗*/
	.modal.show .modal-dialog{top:180px!important;}
	.modal-title{font-size: 1.05rem!important}
	.modal-header {display: -ms-flexbox;display: flex;-ms-flex-align: start;align-items: flex-start;-ms-flex-pack: justify;justify-content: space-between;background-color: #353644;padding: 10px 20px;color: #fff;border-top-left-radius: 0!important;border-top-right-radius: 0!important;}
	button.close{font-size: 18px!important; color: #fff!important}
	.modal-mm{max-width: 370px}
	.modal-body .alert-warning {width: 100%;}
	/*图标 /*/
    .markdown-section blockquote{padding: 10px 15px;background: #f7f7f7;}
	.fa{margin-right:8px}

    /*默认文件夹默认隐藏*/
    .default-folder{visibility: hidden;margin-top: -38px;}
    .chapter:hover .default-folder{visibility: visible;margin-top: 0px;}
    .hidden-value{display: none;}
</style>
</head>
<body>
<div class="book">
  	<div class="book-summary">
    	<div id="book-search-input" role="search">
      		<input type="text" class="api-search-word" placeholder="输入关键词搜索文档">
      	</div>
    	<nav>
      		<ul class="summary document-summary"></ul>
    	</nav>
  	</div>
  	<div class="book-body">
    	<div class="no-apis"></div>
    	<div class="body-inner">
	      	<div class="book-header">
		        <div class="dropdown">
		          	<a class="btn pull-left document-pull-left" href="javascript:;">&nbsp;
		            	<i class="fa fa-align-justify"></i></a>
		          	<a class="btn" href="https://console.apipost.cn/doc/createHtml/49516?du_id=0" target="_blank">
		            	<i class="fa fa-html5" aria-hidden="true"></i>导出HTMl</a>
		            	<!-- <a class="dropdown-item export-md-btn" href="javascript:;"><i class="fa fa-file-code-o" aria-hidden="true"></i>导出MD</a> -->
		            <a class="btn export-btn" href="https://console.apipost.cn/doc/createMD/49516?du_id=0" target="_blank">
		            	<i class="fa fa-file-code-o" aria-hidden="true"></i>导出MarkDown</a>
		          	<a class="btn export-btn" href="https://console.apipost.cn/doc/createDocx/49516?du_id=0" target="_blank">
		            	<i class="fa fa-file-word-o" aria-hidden="true"></i>导出Doc</a>
		            <a class="btn export-btn" href="https://console.apipost.cn/doc/createPdf/49516?du_id=0" target="_blank">
		            	<i class="fa fa-file-pdf-o" aria-hidden="true"></i>导出Pdf</a>
		          	<a class="btn export-document-link-btn" href="javascript:;">
		            	<i class="fa fa-external-link" aria-hidden="true"></i>复制文档地址</a>
		        </div>
		        <h1><!-- 在线考试系统接口文档 --></h1>
	    	</div>
	    	                        	    	<div class="page-wrapper hide" tabindex="371759" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>根据课程ID查询章节 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=371759" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;371759&quot;,&quot;name&quot;:&quot;根据课程ID查询章节&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/api\/chapter\/getchaptersbycumid?cum_id=3&quot;,&quot;method&quot;:&quot;GET&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;0&quot;,&quot;request_query_ischecked&quot;:&quot;1&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;0&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[{&quot;description&quot;:&quot;&quot;,&quot;indent&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;key&quot;:&quot;cum_id&quot;,&quot;not_null&quot;:&quot;0&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;value&quot;:&quot;3&quot;}],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;pageNo&quot;,&quot;value&quot;:&quot;1&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;pageSize&quot;,&quot;value&quot;:&quot;2&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;cum_name&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;0&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;m_id&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;0&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/api/chapter/getchaptersbycumid?cum_id=3</code>
                        	            		<h4>请求方式</h4>
	            		<code>GET</code>
                                                                        	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>pageNo</th>
			                  			<td>1</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>pageSize</th>
			                  			<td>2</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>cum_name</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>m_id</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            			            		<div class="document-block-div request_query-div">
		            		<h4>请求Query参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>cum_id</th>
			                  			<td>3</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": [
        {
            "ec_id": 1,
            "ec_name": "初始java",
            "ec_priority": null,
            "cum_id": 3
        },
        {
            "ec_id": 2,
            "ec_name": "变量与数据类型",
            "ec_priority": null,
            "cum_id": 3
        }
    ]
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "MyBatis异常",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="371684" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>分页模糊查询跟课程ID查询章节 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=371684" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;371684&quot;,&quot;name&quot;:&quot;分页模糊查询跟课程ID查询章节&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/chapter\/getchapters&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJhOGJiMDgwOC1iYzBkLTRiYzItODc2YS1lN2E4ZDcyYWMwNzkiLCJpYXQiOjE1ODI3ODU0ODcsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiYXZhdGFyXCI6XCJcIixcImNfaWRcIjoxMSxcImludGVncmFsXCI6MCxcInBhc3N3b3JkXCI6XCJcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjYsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyNzg5MDg3fQ.TWrQ25b59xWr97-ao4pj9GUYkUQLMitxNPzgo1sRRDE&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;pageNo&quot;,&quot;value&quot;:&quot;1&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;pageSize&quot;,&quot;value&quot;:&quot;2&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;ec_name&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;cum_id&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/chapter/getchapters</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJhOGJiMDgwOC1iYzBkLTRiYzItODc2YS1lN2E4ZDcyYWMwNzkiLCJpYXQiOjE1ODI3ODU0ODcsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiYXZhdGFyXCI6XCJcIixcImNfaWRcIjoxMSxcImludGVncmFsXCI6MCxcInBhc3N3b3JkXCI6XCJcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjYsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyNzg5MDg3fQ.TWrQ25b59xWr97-ao4pj9GUYkUQLMitxNPzgo1sRRDE</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>pageNo</th>
			                  			<td>1</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>pageSize</th>
			                  			<td>2</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>ec_name</th>
			                  			<td>-</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>cum_id</th>
			                  			<td>-</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": {
        "total": 2,
        "list": [
            {
                "ec_id": 1,
                "ec_name": "初始java",
                "ec_priority": null,
                "cum_id": 3
            },
            {
                "ec_id": 2,
                "ec_name": "变量与数据类型",
                "ec_priority": null,
                "cum_id": 3
            }
        ],
        "pageNum": 1,
        "pageSize": 2,
        "size": 2,
        "startRow": 1,
        "endRow": 2,
        "pages": 1,
        "prePage": 0,
        "nextPage": 0,
        "isFirstPage": true,
        "isLastPage": true,
        "hasPreviousPage": false,
        "hasNextPage": false,
        "navigatePages": 8,
        "navigatepageNums": [
            1
        ],
        "navigateFirstPage": 1,
        "navigateLastPage": 1
    }
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "未知异常",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="371652" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>查询章节 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=371652" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;371652&quot;,&quot;name&quot;:&quot;查询章节&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/chapter\/getchapter&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJhOGJiMDgwOC1iYzBkLTRiYzItODc2YS1lN2E4ZDcyYWMwNzkiLCJpYXQiOjE1ODI3ODU0ODcsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiYXZhdGFyXCI6XCJcIixcImNfaWRcIjoxMSxcImludGVncmFsXCI6MCxcInBhc3N3b3JkXCI6XCJcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjYsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyNzg5MDg3fQ.TWrQ25b59xWr97-ao4pj9GUYkUQLMitxNPzgo1sRRDE&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;ec_id&quot;,&quot;value&quot;:&quot;2&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/chapter/getchapter</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJhOGJiMDgwOC1iYzBkLTRiYzItODc2YS1lN2E4ZDcyYWMwNzkiLCJpYXQiOjE1ODI3ODU0ODcsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiYXZhdGFyXCI6XCJcIixcImNfaWRcIjoxMSxcImludGVncmFsXCI6MCxcInBhc3N3b3JkXCI6XCJcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjYsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyNzg5MDg3fQ.TWrQ25b59xWr97-ao4pj9GUYkUQLMitxNPzgo1sRRDE</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>ec_id</th>
			                  			<td>2</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": {
        "ec_id": 2,
        "ec_name": "变量与数据类型",
        "ec_priority": null,
        "cum_id": 3
    }
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "未知异常",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="371650" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>删除章节 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=371650" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;371650&quot;,&quot;name&quot;:&quot;删除章节&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/chapter\/del&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJhOGJiMDgwOC1iYzBkLTRiYzItODc2YS1lN2E4ZDcyYWMwNzkiLCJpYXQiOjE1ODI3ODU0ODcsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiYXZhdGFyXCI6XCJcIixcImNfaWRcIjoxMSxcImludGVncmFsXCI6MCxcInBhc3N3b3JkXCI6XCJcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjYsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyNzg5MDg3fQ.TWrQ25b59xWr97-ao4pj9GUYkUQLMitxNPzgo1sRRDE&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;ec_id&quot;,&quot;value&quot;:&quot;3&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/chapter/del</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJhOGJiMDgwOC1iYzBkLTRiYzItODc2YS1lN2E4ZDcyYWMwNzkiLCJpYXQiOjE1ODI3ODU0ODcsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiYXZhdGFyXCI6XCJcIixcImNfaWRcIjoxMSxcImludGVncmFsXCI6MCxcInBhc3N3b3JkXCI6XCJcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjYsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyNzg5MDg3fQ.TWrQ25b59xWr97-ao4pj9GUYkUQLMitxNPzgo1sRRDE</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>ec_id</th>
			                  			<td>3</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": 3
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "未知异常",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="371644" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>修改章节 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=371644" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;371644&quot;,&quot;name&quot;:&quot;修改章节&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/chapter\/update&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJhOGJiMDgwOC1iYzBkLTRiYzItODc2YS1lN2E4ZDcyYWMwNzkiLCJpYXQiOjE1ODI3ODU0ODcsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiYXZhdGFyXCI6XCJcIixcImNfaWRcIjoxMSxcImludGVncmFsXCI6MCxcInBhc3N3b3JkXCI6XCJcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjYsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyNzg5MDg3fQ.TWrQ25b59xWr97-ao4pj9GUYkUQLMitxNPzgo1sRRDE&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;ec_id&quot;,&quot;value&quot;:&quot;3&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;ec_name&quot;,&quot;value&quot;:&quot;运算符&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;cum_id&quot;,&quot;value&quot;:&quot;3&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;ec_priority&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/chapter/update</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJhOGJiMDgwOC1iYzBkLTRiYzItODc2YS1lN2E4ZDcyYWMwNzkiLCJpYXQiOjE1ODI3ODU0ODcsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiYXZhdGFyXCI6XCJcIixcImNfaWRcIjoxMSxcImludGVncmFsXCI6MCxcInBhc3N3b3JkXCI6XCJcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjYsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyNzg5MDg3fQ.TWrQ25b59xWr97-ao4pj9GUYkUQLMitxNPzgo1sRRDE</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>ec_id</th>
			                  			<td>3</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>ec_name</th>
			                  			<td>运算符</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>cum_id</th>
			                  			<td>3</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>ec_priority</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": {
        "ec_id": 3,
        "ec_name": "运算符",
        "ec_priority": null,
        "cum_id": 3
    }
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "未知异常",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="371617" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>添加章节 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=371617" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;371617&quot;,&quot;name&quot;:&quot;添加章节&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/chapter\/add&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJhOGJiMDgwOC1iYzBkLTRiYzItODc2YS1lN2E4ZDcyYWMwNzkiLCJpYXQiOjE1ODI3ODU0ODcsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiYXZhdGFyXCI6XCJcIixcImNfaWRcIjoxMSxcImludGVncmFsXCI6MCxcInBhc3N3b3JkXCI6XCJcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjYsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyNzg5MDg3fQ.TWrQ25b59xWr97-ao4pj9GUYkUQLMitxNPzgo1sRRDE&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;ec_name&quot;,&quot;value&quot;:&quot;变量与数据类型&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;cum_id&quot;,&quot;value&quot;:&quot;3&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;ec_priority&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/chapter/add</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJhOGJiMDgwOC1iYzBkLTRiYzItODc2YS1lN2E4ZDcyYWMwNzkiLCJpYXQiOjE1ODI3ODU0ODcsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiYXZhdGFyXCI6XCJcIixcImNfaWRcIjoxMSxcImludGVncmFsXCI6MCxcInBhc3N3b3JkXCI6XCJcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjYsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyNzg5MDg3fQ.TWrQ25b59xWr97-ao4pj9GUYkUQLMitxNPzgo1sRRDE</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>ec_name</th>
			                  			<td>变量与数据类型</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>cum_id</th>
			                  			<td>3</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>ec_priority</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": {
        "ec_id": 2,
        "ec_name": "变量与数据类型",
        "ec_priority": null,
        "cum_id": 3
    }
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "未知异常",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="371601" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>根据专业ID查询课程 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=371601" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;371601&quot;,&quot;name&quot;:&quot;根据专业ID查询课程&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/api\/curriculum\/getcurriculumsbymid?m_id=2&quot;,&quot;method&quot;:&quot;GET&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;0&quot;,&quot;request_query_ischecked&quot;:&quot;1&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;0&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[{&quot;description&quot;:&quot;&quot;,&quot;indent&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;key&quot;:&quot;m_id&quot;,&quot;not_null&quot;:&quot;0&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;value&quot;:&quot;2&quot;}],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;pageNo&quot;,&quot;value&quot;:&quot;1&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;pageSize&quot;,&quot;value&quot;:&quot;2&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;cum_name&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;0&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;m_id&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;0&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/api/curriculum/getcurriculumsbymid?m_id=2</code>
                        	            		<h4>请求方式</h4>
	            		<code>GET</code>
                                                                        	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>pageNo</th>
			                  			<td>1</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>pageSize</th>
			                  			<td>2</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>cum_name</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>m_id</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            			            		<div class="document-block-div request_query-div">
		            		<h4>请求Query参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>m_id</th>
			                  			<td>2</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": [
        {
            "cum_id": 1,
            "cum_name": "计算机基础",
            "cum_priority": null,
            "m_id": 2,
            "chapters": []
        },
        {
            "cum_id": 3,
            "cum_name": "Java基础",
            "cum_priority": null,
            "m_id": 2,
            "chapters": [
                {
                    "ec_id": 1,
                    "ec_name": "初始java",
                    "ec_priority": null,
                    "cum_id": 3
                },
                {
                    "ec_id": 2,
                    "ec_name": "变量与数据类型",
                    "ec_priority": null,
                    "cum_id": 3
                },
                {
                    "ec_id": 3,
                    "ec_name": "变量与数据类型",
                    "ec_priority": null,
                    "cum_id": 3
                }
            ]
        }
    ]
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "MyBatis异常",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="371551" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>分页查询课程模糊查询根据专业ID查询 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=371551" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;371551&quot;,&quot;name&quot;:&quot;分页查询课程模糊查询根据专业ID查询&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/curriculum\/getcurriculums&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIxYzRmYzI0Zi1mMDQ2LTQ1MWYtYTk1NC05MzRmNDYyMzMxNDQiLCJpYXQiOjE1ODI3ODY1MzUsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiYXZhdGFyXCI6XCJcIixcImNfaWRcIjoxMSxcImludGVncmFsXCI6MCxcInBhc3N3b3JkXCI6XCJcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjYsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyNzkwMTM1fQ.C8F9casjfRCPytLgReK8j1dodqYS7-AoFX2spgIcQoo&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;0&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;pageNo&quot;,&quot;value&quot;:&quot;1&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;pageSize&quot;,&quot;value&quot;:&quot;2&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;cum_name&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;0&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;m_id&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;0&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/curriculum/getcurriculums</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIxYzRmYzI0Zi1mMDQ2LTQ1MWYtYTk1NC05MzRmNDYyMzMxNDQiLCJpYXQiOjE1ODI3ODY1MzUsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiYXZhdGFyXCI6XCJcIixcImNfaWRcIjoxMSxcImludGVncmFsXCI6MCxcInBhc3N3b3JkXCI6XCJcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjYsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyNzkwMTM1fQ.C8F9casjfRCPytLgReK8j1dodqYS7-AoFX2spgIcQoo</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>pageNo</th>
			                  			<td>1</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>pageSize</th>
			                  			<td>2</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>cum_name</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>m_id</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": {
        "total": 2,
        "list": [
            {
                "cum_id": 1,
                "cum_name": "计算机基础",
                "cum_priority": null,
                "m_id": 2
            },
            {
                "cum_id": 3,
                "cum_name": "Java基础",
                "cum_priority": null,
                "m_id": 2
            }
        ],
        "pageNum": 1,
        "pageSize": 2,
        "size": 2,
        "startRow": 1,
        "endRow": 2,
        "pages": 1,
        "prePage": 0,
        "nextPage": 0,
        "isFirstPage": true,
        "isLastPage": true,
        "hasPreviousPage": false,
        "hasNextPage": false,
        "navigatePages": 8,
        "navigatepageNums": [
            1
        ],
        "navigateFirstPage": 1,
        "navigateLastPage": 1
    }
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "查询失败",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="371528" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>查询课程 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=371528" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;371528&quot;,&quot;name&quot;:&quot;查询课程&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/curriculum\/getcurriculum&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJhOGJiMDgwOC1iYzBkLTRiYzItODc2YS1lN2E4ZDcyYWMwNzkiLCJpYXQiOjE1ODI3ODU0ODcsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiYXZhdGFyXCI6XCJcIixcImNfaWRcIjoxMSxcImludGVncmFsXCI6MCxcInBhc3N3b3JkXCI6XCJcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjYsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyNzg5MDg3fQ.TWrQ25b59xWr97-ao4pj9GUYkUQLMitxNPzgo1sRRDE&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;0&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;cum_id&quot;,&quot;value&quot;:&quot;3&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;0&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/curriculum/getcurriculum</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJhOGJiMDgwOC1iYzBkLTRiYzItODc2YS1lN2E4ZDcyYWMwNzkiLCJpYXQiOjE1ODI3ODU0ODcsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiYXZhdGFyXCI6XCJcIixcImNfaWRcIjoxMSxcImludGVncmFsXCI6MCxcInBhc3N3b3JkXCI6XCJcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjYsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyNzg5MDg3fQ.TWrQ25b59xWr97-ao4pj9GUYkUQLMitxNPzgo1sRRDE</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>cum_id</th>
			                  			<td>3</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": {
        "cum_id": 3,
        "cum_name": "Java基础",
        "cum_priority": null,
        "m_id": 2
    }
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="371523" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>删除课程 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=371523" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;371523&quot;,&quot;name&quot;:&quot;删除课程&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/curriculum\/del&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJhOGJiMDgwOC1iYzBkLTRiYzItODc2YS1lN2E4ZDcyYWMwNzkiLCJpYXQiOjE1ODI3ODU0ODcsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiYXZhdGFyXCI6XCJcIixcImNfaWRcIjoxMSxcImludGVncmFsXCI6MCxcInBhc3N3b3JkXCI6XCJcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjYsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyNzg5MDg3fQ.TWrQ25b59xWr97-ao4pj9GUYkUQLMitxNPzgo1sRRDE&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;0&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;cum_id&quot;,&quot;value&quot;:&quot;4&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/curriculum/del</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJhOGJiMDgwOC1iYzBkLTRiYzItODc2YS1lN2E4ZDcyYWMwNzkiLCJpYXQiOjE1ODI3ODU0ODcsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiYXZhdGFyXCI6XCJcIixcImNfaWRcIjoxMSxcImludGVncmFsXCI6MCxcInBhc3N3b3JkXCI6XCJcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjYsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyNzg5MDg3fQ.TWrQ25b59xWr97-ao4pj9GUYkUQLMitxNPzgo1sRRDE</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>cum_id</th>
			                  			<td>4</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": 4
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "删除失败",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="371518" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>修改课程 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=371518" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;371518&quot;,&quot;name&quot;:&quot;修改课程&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/curriculum\/update&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJhOGJiMDgwOC1iYzBkLTRiYzItODc2YS1lN2E4ZDcyYWMwNzkiLCJpYXQiOjE1ODI3ODU0ODcsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiYXZhdGFyXCI6XCJcIixcImNfaWRcIjoxMSxcImludGVncmFsXCI6MCxcInBhc3N3b3JkXCI6XCJcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjYsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyNzg5MDg3fQ.TWrQ25b59xWr97-ao4pj9GUYkUQLMitxNPzgo1sRRDE&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;0&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;cum_id&quot;,&quot;value&quot;:&quot;4&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;cum_name&quot;,&quot;value&quot;:&quot;Java高级&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;m_id&quot;,&quot;value&quot;:&quot;2&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;cum_priority&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/curriculum/update</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJhOGJiMDgwOC1iYzBkLTRiYzItODc2YS1lN2E4ZDcyYWMwNzkiLCJpYXQiOjE1ODI3ODU0ODcsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiYXZhdGFyXCI6XCJcIixcImNfaWRcIjoxMSxcImludGVncmFsXCI6MCxcInBhc3N3b3JkXCI6XCJcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjYsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyNzg5MDg3fQ.TWrQ25b59xWr97-ao4pj9GUYkUQLMitxNPzgo1sRRDE</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>cum_id</th>
			                  			<td>4</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>cum_name</th>
			                  			<td>Java高级</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>m_id</th>
			                  			<td>2</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>cum_priority</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": {
        "cum_id": 4,
        "cum_name": "Java高级",
        "cum_priority": null,
        "m_id": 2
    }
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "SQL外键约束异常",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="371492" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>添加课程 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=371492" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;371492&quot;,&quot;name&quot;:&quot;添加课程&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/curriculum\/add&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJhOGJiMDgwOC1iYzBkLTRiYzItODc2YS1lN2E4ZDcyYWMwNzkiLCJpYXQiOjE1ODI3ODU0ODcsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiYXZhdGFyXCI6XCJcIixcImNfaWRcIjoxMSxcImludGVncmFsXCI6MCxcInBhc3N3b3JkXCI6XCJcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjYsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyNzg5MDg3fQ.TWrQ25b59xWr97-ao4pj9GUYkUQLMitxNPzgo1sRRDE&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;0&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;cum_name&quot;,&quot;value&quot;:&quot;Java基础&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;m_id&quot;,&quot;value&quot;:&quot;2&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;cum_priority&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/curriculum/add</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJhOGJiMDgwOC1iYzBkLTRiYzItODc2YS1lN2E4ZDcyYWMwNzkiLCJpYXQiOjE1ODI3ODU0ODcsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiYXZhdGFyXCI6XCJcIixcImNfaWRcIjoxMSxcImludGVncmFsXCI6MCxcInBhc3N3b3JkXCI6XCJcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjYsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyNzg5MDg3fQ.TWrQ25b59xWr97-ao4pj9GUYkUQLMitxNPzgo1sRRDE</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>cum_name</th>
			                  			<td>Java基础</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>m_id</th>
			                  			<td>2</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>cum_priority</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": {
        "cum_id": 1,
        "cum_name": "计算机基础",
        "cum_priority": null,
        "m_id": 2
    }
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "SQL外键约束异常",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="358403" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>在线用户 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=358403" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;358403&quot;,&quot;name&quot;:&quot;在线用户&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/user\/olusers&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlYWU4NDUxMC1kZDNkLTRiNWEtYjE4ZC0zZmQzZGU2MGNlOTciLCJpYXQiOjE1ODIxMjQwNzYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJpbnRlZ3JhbFwiOjAsXCJwYXNzd29yZFwiOlwiXCIsXCJwaG9uZVwiOlwiMTg1NjcxOTI3MTJcIixcInJfaWRcIjoxLFwicmVhbF9uYW1lXCI6XCLmnajnm7xcIixcInVfaWRcIjoxLFwidXNlcm5hbWVcIjpcIuadkeWktOiAgeadqOWktFwifSIsImV4cCI6MTU4MjEyNzY3Nn0.Wg2cUa0UX7HbSWQKIoTCSk_EPuQBTirx8mGqbZ34YAk&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;0&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;c_id&quot;,&quot;value&quot;:&quot;1&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;0&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;r_id&quot;,&quot;value&quot;:&quot;2&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;m_id&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;0&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;s_id&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;0&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/user/olusers</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlYWU4NDUxMC1kZDNkLTRiNWEtYjE4ZC0zZmQzZGU2MGNlOTciLCJpYXQiOjE1ODIxMjQwNzYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJpbnRlZ3JhbFwiOjAsXCJwYXNzd29yZFwiOlwiXCIsXCJwaG9uZVwiOlwiMTg1NjcxOTI3MTJcIixcInJfaWRcIjoxLFwicmVhbF9uYW1lXCI6XCLmnajnm7xcIixcInVfaWRcIjoxLFwidXNlcm5hbWVcIjpcIuadkeWktOiAgeadqOWktFwifSIsImV4cCI6MTU4MjEyNzY3Nn0.Wg2cUa0UX7HbSWQKIoTCSk_EPuQBTirx8mGqbZ34YAk</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>c_id</th>
			                  			<td>1</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>r_id</th>
			                  			<td>2</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>m_id</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>s_id</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
	"code": "SUCCESS",
	"message": "SUCCESS",
	"data": [
		"{"c_id":5,"integral":0,"password":"","phone":"18567192712","r_id":1,"real_name":"杨盼","u_id":1,"username":"村头老杨头"}",
		"{"c_id":5,"integral":0,"password":"","phone":"18567192712","r_id":1,"real_name":"杨盼","u_id":1,"username":"村头老杨头"}"
	]
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="358316" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>退出登录 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=358316" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;358316&quot;,&quot;name&quot;:&quot;退出登录&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/api\/user\/logout?token=eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZjExOWJmMi03NGE3LTRiNjItYjJhYi05NDhkYTlhMDM2OGYiLCJpYXQiOjE1ODIxMTk3MjMsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJpbnRlZ3JhbFwiOjAsXCJwYXNzd29yZFwiOlwiXCIsXCJwaG9uZVwiOlwiMTg1NjcxOTI3MTJcIixcInJfaWRcIjoxLFwicmVhbF9uYW1lXCI6XCLmnajnm7xcIixcInVfaWRcIjoxLFwidXNlcm5hbWVcIjpcIuadkeWktOiAgeadqOWktFwifSIsImV4cCI6MTU4MjEyMzMyM30._RPSDHSuGXgN4NkSfl3b0y_vRaBbVCon2XzbstoNGuY&quot;,&quot;method&quot;:&quot;GET&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;1&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZjExOWJmMi03NGE3LTRiNjItYjJhYi05NDhkYTlhMDM2OGYiLCJpYXQiOjE1ODIxMTk3MjMsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJpbnRlZ3JhbFwiOjAsXCJwYXNzd29yZFwiOlwiXCIsXCJwaG9uZVwiOlwiMTg1NjcxOTI3MTJcIixcInJfaWRcIjoxLFwicmVhbF9uYW1lXCI6XCLmnajnm7xcIixcInVfaWRcIjoxLFwidXNlcm5hbWVcIjpcIuadkeWktOiAgeadqOWktFwifSIsImV4cCI6MTU4MjEyMzMyM30._RPSDHSuGXgN4NkSfl3b0y_vRaBbVCon2XzbstoNGuY&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;0&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;username&quot;,&quot;value&quot;:&quot;平顶山&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;s_longitude&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;s_latitude&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/api/user/logout?token=eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZjExOWJmMi03NGE3LTRiNjItYjJhYi05NDhkYTlhMDM2OGYiLCJpYXQiOjE1ODIxMTk3MjMsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJpbnRlZ3JhbFwiOjAsXCJwYXNzd29yZFwiOlwiXCIsXCJwaG9uZVwiOlwiMTg1NjcxOTI3MTJcIixcInJfaWRcIjoxLFwicmVhbF9uYW1lXCI6XCLmnajnm7xcIixcInVfaWRcIjoxLFwidXNlcm5hbWVcIjpcIuadkeWktOiAgeadqOWktFwifSIsImV4cCI6MTU4MjEyMzMyM30._RPSDHSuGXgN4NkSfl3b0y_vRaBbVCon2XzbstoNGuY</code>
                        	            		<h4>请求方式</h4>
	            		<code>GET</code>
                                                                        	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>username</th>
			                  			<td>平顶山</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>s_longitude</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>s_latitude</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            			            		<div class="document-block-div request_query-div">
		            		<h4>请求Query参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZjExOWJmMi03NGE3LTRiNjItYjJhYi05NDhkYTlhMDM2OGYiLCJpYXQiOjE1ODIxMTk3MjMsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJpbnRlZ3JhbFwiOjAsXCJwYXNzd29yZFwiOlwiXCIsXCJwaG9uZVwiOlwiMTg1NjcxOTI3MTJcIixcInJfaWRcIjoxLFwicmVhbF9uYW1lXCI6XCLmnajnm7xcIixcInVfaWRcIjoxLFwidXNlcm5hbWVcIjpcIuadkeWktOiAgeadqOWktFwifSIsImV4cCI6MTU4MjEyMzMyM30._RPSDHSuGXgN4NkSfl3b0y_vRaBbVCon2XzbstoNGuY</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": "退出登录"
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "未知异常",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="349989" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>查询所有班级 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=349989" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;349989&quot;,&quot;name&quot;:&quot;查询所有班级&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/api\/clazz\/getclazzs&quot;,&quot;method&quot;:&quot;GET&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;1&quot;,&quot;request_header_ischecked&quot;:&quot;0&quot;,&quot;request_query_ischecked&quot;:&quot;1&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[],&quot;request_query&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;pageNo&quot;,&quot;value&quot;:&quot;1&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;0&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;pageSize&quot;,&quot;value&quot;:&quot;20&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;0&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;c_name&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;0&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;g_id&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;0&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;s_id&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;0&quot;}],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;0&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/api/clazz/getclazzs</code>
                        	            		<h4>请求方式</h4>
	            		<code>GET</code>
                                                                        	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            			            		<div class="document-block-div request_query-div">
		            		<h4>请求Query参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>pageNo</th>
			                  			<td>1</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>pageSize</th>
			                  			<td>20</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>c_name</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>g_id</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>s_id</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": {
        "total": 1,
        "list": [
            {
                "c_id": 5,
                "c_name": "开发2班",
                "c_priority": null,
                "g_id": 2,
                "grade": null,
                "m_id": null,
                "major": null
            }
        ],
        "pageNum": 1,
        "pageSize": 20,
        "size": 1,
        "startRow": 1,
        "endRow": 1,
        "pages": 1,
        "prePage": 0,
        "nextPage": 0,
        "isFirstPage": true,
        "isLastPage": true,
        "hasPreviousPage": false,
        "hasNextPage": false,
        "navigatePages": 8,
        "navigatepageNums": [
            1
        ],
        "navigateFirstPage": 1,
        "navigateLastPage": 1
    }
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="349982" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>查询班级 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=349982" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;349982&quot;,&quot;name&quot;:&quot;查询班级&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/api\/clazz\/getclazz?c_id=5&quot;,&quot;method&quot;:&quot;GET&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;1&quot;,&quot;request_header_ischecked&quot;:&quot;0&quot;,&quot;request_query_ischecked&quot;:&quot;1&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[],&quot;request_query&quot;:[{&quot;description&quot;:&quot;&quot;,&quot;indent&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;key&quot;:&quot;c_id&quot;,&quot;not_null&quot;:&quot;0&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;value&quot;:&quot;5&quot;}],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;0&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/api/clazz/getclazz?c_id=5</code>
                        	            		<h4>请求方式</h4>
	            		<code>GET</code>
                                                                        	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            			            		<div class="document-block-div request_query-div">
		            		<h4>请求Query参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>c_id</th>
			                  			<td>5</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": {
        "c_id": 5,
        "c_name": "开发2班",
        "c_priority": null,
        "g_id": 2,
        "grade": null,
        "m_id": null,
        "major": null
    }
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "没有班级数据",
    "data": "c_id:2"
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="349938" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>查询所有年级 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=349938" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;349938&quot;,&quot;name&quot;:&quot;查询所有年级&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/api\/grade\/getgrades?pageNo=1&pageSize=20&g_name=&s_id=&quot;,&quot;method&quot;:&quot;GET&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;1&quot;,&quot;request_header_ischecked&quot;:&quot;0&quot;,&quot;request_query_ischecked&quot;:&quot;1&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[],&quot;request_query&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;pageNo&quot;,&quot;value&quot;:&quot;1&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;pageSize&quot;,&quot;value&quot;:&quot;20&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;g_name&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;s_id&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;0&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/api/grade/getgrades?pageNo=1&amp;pageSize=20&amp;g_name=&amp;s_id=</code>
                        	            		<h4>请求方式</h4>
	            		<code>GET</code>
                                                                        	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            			            		<div class="document-block-div request_query-div">
		            		<h4>请求Query参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>pageNo</th>
			                  			<td>1</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>pageSize</th>
			                  			<td>20</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>g_name</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>s_id</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": {
        "total": 2,
        "list": [
            {
                "g_id": 2,
                "g_name": "平顶山",
                "g_priority": null,
                "s_id": null,
                "shool": null,
                "clazzes": null
            },
            {
                "g_id": 3,
                "g_name": "2019级",
                "g_priority": null,
                "s_id": 2,
                "shool": null,
                "clazzes": null
            }
        ],
        "pageNum": 1,
        "pageSize": 20,
        "size": 2,
        "startRow": 1,
        "endRow": 2,
        "pages": 1,
        "prePage": 0,
        "nextPage": 0,
        "isFirstPage": true,
        "isLastPage": true,
        "hasPreviousPage": false,
        "hasNextPage": false,
        "navigatePages": 8,
        "navigatepageNums": [
            1
        ],
        "navigateFirstPage": 1,
        "navigateLastPage": 1
    }
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="349864" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>查询所有学校 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=349864" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;349864&quot;,&quot;name&quot;:&quot;查询所有学校&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/api\/shool\/getshools?pageNo=1&pageSize=20&s_name=校&quot;,&quot;method&quot;:&quot;GET&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;1&quot;,&quot;request_header_ischecked&quot;:&quot;0&quot;,&quot;request_query_ischecked&quot;:&quot;1&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[],&quot;request_query&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;pageNo&quot;,&quot;value&quot;:&quot;1&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;pageSize&quot;,&quot;value&quot;:&quot;20&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;s_name&quot;,&quot;value&quot;:&quot;校&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;0&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/api/shool/getshools?pageNo=1&amp;pageSize=20&amp;s_name=校</code>
                        	            		<h4>请求方式</h4>
	            		<code>GET</code>
                                                                        	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            			            		<div class="document-block-div request_query-div">
		            		<h4>请求Query参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>pageNo</th>
			                  			<td>1</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>pageSize</th>
			                  			<td>20</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>s_name</th>
			                  			<td>校</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": {
        "total": 2,
        "list": [
            {
                "s_id": 2,
                "s_name": "平顶山校区",
                "s_longitude": "",
                "s_latitude": "",
                "grades": null
            },
            {
                "s_id": 3,
                "s_name": "平顶山",
                "s_longitude": "",
                "s_latitude": "",
                "grades": null
            }
        ],
        "pageNum": 1,
        "pageSize": 50,
        "size": 2,
        "startRow": 1,
        "endRow": 2,
        "pages": 1,
        "prePage": 0,
        "nextPage": 0,
        "isFirstPage": true,
        "isLastPage": true,
        "hasPreviousPage": false,
        "hasNextPage": false,
        "navigatePages": 8,
        "navigatepageNums": [
            1
        ],
        "navigateFirstPage": 1,
        "navigateLastPage": 1
    }
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="349793" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>分页查询用户模糊查询 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=349793" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;349793&quot;,&quot;name&quot;:&quot;分页查询用户模糊查询&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/user\/getusers&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZjExOWJmMi03NGE3LTRiNjItYjJhYi05NDhkYTlhMDM2OGYiLCJpYXQiOjE1ODIxMjAwNDQsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJpbnRlZ3JhbFwiOjAsXCJwYXNzd29yZFwiOlwiXCIsXCJwaG9uZVwiOlwiMTg1NjcxOTI3MTJcIixcInJfaWRcIjoxLFwicmVhbF9uYW1lXCI6XCLmnajnm7xcIixcInVfaWRcIjoxLFwidXNlcm5hbWVcIjpcIuadkeWktOiAgeadqOWktFwifSIsImV4cCI6MTU4MjEyMzY0NH0.XFK7YyynIGS2Rn6StKKnQ0IQyD1F8GKg8ZrwYTKjhOI&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;0&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;0&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;pageNo&quot;,&quot;value&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;pageSize&quot;,&quot;value&quot;:&quot;2&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;real_name&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;phone&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;c_id&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;r_id&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;s_id&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;g_id&quot;,&quot;value&quot;:&quot;2&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;m_id&quot;,&quot;value&quot;:&quot;1&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;0&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/user/getusers</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZjExOWJmMi03NGE3LTRiNjItYjJhYi05NDhkYTlhMDM2OGYiLCJpYXQiOjE1ODIxMjAwNDQsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJpbnRlZ3JhbFwiOjAsXCJwYXNzd29yZFwiOlwiXCIsXCJwaG9uZVwiOlwiMTg1NjcxOTI3MTJcIixcInJfaWRcIjoxLFwicmVhbF9uYW1lXCI6XCLmnajnm7xcIixcInVfaWRcIjoxLFwidXNlcm5hbWVcIjpcIuadkeWktOiAgeadqOWktFwifSIsImV4cCI6MTU4MjEyMzY0NH0.XFK7YyynIGS2Rn6StKKnQ0IQyD1F8GKg8ZrwYTKjhOI</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>pageNo</th>
			                  			<td>1</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>pageSize</th>
			                  			<td>2</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>real_name</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>phone</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>c_id</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>r_id</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>s_id</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>g_id</th>
			                  			<td>2</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>m_id</th>
			                  			<td>1</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": {
        "total": 3,
        "list": [
            {
                "u_id": 1,
                "username": "村头老杨头",
                "phone": "18567192712",
                "password": "25d55ad283aa400af464c76d713c07ad",
                "real_name": "杨盼",
                "avatar": null,
                "integral": 0,
                "c_id": 5,
                "clazz": null,
                "r_id": 1,
                "role": null
            },
            {
                "u_id": 5,
                "username": "村头老",
                "phone": "18567878724",
                "password": "25d55ad283aa400af464c76d713c07ad",
                "real_name": "test",
                "avatar": null,
                "integral": 0,
                "c_id": 5,
                "clazz": null,
                "r_id": 1,
                "role": null
            }
        ],
        "pageNum": 1,
        "pageSize": 2,
        "size": 2,
        "startRow": 1,
        "endRow": 2,
        "pages": 2,
        "prePage": 0,
        "nextPage": 2,
        "isFirstPage": true,
        "isLastPage": false,
        "hasPreviousPage": false,
        "hasNextPage": true,
        "navigatePages": 8,
        "navigatepageNums": [
            1,
            2
        ],
        "navigateFirstPage": 1,
        "navigateLastPage": 2
    }
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "查询失败",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="349792" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>获取用户 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=349792" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;349792&quot;,&quot;name&quot;:&quot;获取用户&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/api\/user\/getuserinfo?token=eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZjExOWJmMi03NGE3LTRiNjItYjJhYi05NDhkYTlhMDM2OGYiLCJpYXQiOjE1ODIxMTk3MjMsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJpbnRlZ3JhbFwiOjAsXCJwYXNzd29yZFwiOlwiXCIsXCJwaG9uZVwiOlwiMTg1NjcxOTI3MTJcIixcInJfaWRcIjoxLFwicmVhbF9uYW1lXCI6XCLmnajnm7xcIixcInVfaWRcIjoxLFwidXNlcm5hbWVcIjpcIuadkeWktOiAgeadqOWktFwifSIsImV4cCI6MTU4MjEyMzMyM30._RPSDHSuGXgN4NkSfl3b0y_vRaBbVCon2XzbstoNGuY&quot;,&quot;method&quot;:&quot;GET&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;1&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZjExOWJmMi03NGE3LTRiNjItYjJhYi05NDhkYTlhMDM2OGYiLCJpYXQiOjE1ODIxMTk3MjMsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJpbnRlZ3JhbFwiOjAsXCJwYXNzd29yZFwiOlwiXCIsXCJwaG9uZVwiOlwiMTg1NjcxOTI3MTJcIixcInJfaWRcIjoxLFwicmVhbF9uYW1lXCI6XCLmnajnm7xcIixcInVfaWRcIjoxLFwidXNlcm5hbWVcIjpcIuadkeWktOiAgeadqOWktFwifSIsImV4cCI6MTU4MjEyMzMyM30._RPSDHSuGXgN4NkSfl3b0y_vRaBbVCon2XzbstoNGuY&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;username&quot;,&quot;value&quot;:&quot;平顶山&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;s_longitude&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;s_latitude&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/api/user/getuserinfo?token=eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZjExOWJmMi03NGE3LTRiNjItYjJhYi05NDhkYTlhMDM2OGYiLCJpYXQiOjE1ODIxMTk3MjMsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJpbnRlZ3JhbFwiOjAsXCJwYXNzd29yZFwiOlwiXCIsXCJwaG9uZVwiOlwiMTg1NjcxOTI3MTJcIixcInJfaWRcIjoxLFwicmVhbF9uYW1lXCI6XCLmnajnm7xcIixcInVfaWRcIjoxLFwidXNlcm5hbWVcIjpcIuadkeWktOiAgeadqOWktFwifSIsImV4cCI6MTU4MjEyMzMyM30._RPSDHSuGXgN4NkSfl3b0y_vRaBbVCon2XzbstoNGuY</code>
                        	            		<h4>请求方式</h4>
	            		<code>GET</code>
                                                                        	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>username</th>
			                  			<td>平顶山</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>s_longitude</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>s_latitude</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            			            		<div class="document-block-div request_query-div">
		            		<h4>请求Query参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZjExOWJmMi03NGE3LTRiNjItYjJhYi05NDhkYTlhMDM2OGYiLCJpYXQiOjE1ODIxMTk3MjMsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJpbnRlZ3JhbFwiOjAsXCJwYXNzd29yZFwiOlwiXCIsXCJwaG9uZVwiOlwiMTg1NjcxOTI3MTJcIixcInJfaWRcIjoxLFwicmVhbF9uYW1lXCI6XCLmnajnm7xcIixcInVfaWRcIjoxLFwidXNlcm5hbWVcIjpcIuadkeWktOiAgeadqOWktFwifSIsImV4cCI6MTU4MjEyMzMyM30._RPSDHSuGXgN4NkSfl3b0y_vRaBbVCon2XzbstoNGuY</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": {
        "u_id": 1,
        "username": "村头老杨头",
        "phone": "18567192712",
        "password": "",
        "real_name": "杨盼",
        "avatar": null,
        "integral": 0,
        "c_id": 5,
        "clazz": null,
        "r_id": 1,
        "role": null
    }
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "用户名或手机号不符合要求",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="349790" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>用户登录 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=349790" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;349790&quot;,&quot;name&quot;:&quot;用户登录&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/api\/user\/login?phone=18567192712&password=25d55ad283aa400af464c76d713c07ad&quot;,&quot;method&quot;:&quot;GET&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;0&quot;,&quot;request_query_ischecked&quot;:&quot;1&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;0&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[{&quot;description&quot;:&quot;&quot;,&quot;indent&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;key&quot;:&quot;phone&quot;,&quot;not_null&quot;:&quot;0&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;value&quot;:&quot;18567192712&quot;},{&quot;description&quot;:&quot;&quot;,&quot;indent&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;key&quot;:&quot;password&quot;,&quot;not_null&quot;:&quot;0&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;value&quot;:&quot;25d55ad283aa400af464c76d713c07ad&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;username&quot;,&quot;value&quot;:&quot;村头老杨头&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;0&quot;}],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;username&quot;,&quot;value&quot;:&quot;平顶山&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;s_longitude&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;s_latitude&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/api/user/login?phone=18567192712&amp;password=25d55ad283aa400af464c76d713c07ad</code>
                        	            		<h4>请求方式</h4>
	            		<code>GET</code>
                                                                        	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>username</th>
			                  			<td>平顶山</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>s_longitude</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>s_latitude</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            			            		<div class="document-block-div request_query-div">
		            		<h4>请求Query参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>phone</th>
			                  			<td>18567192712</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>password</th>
			                  			<td>25d55ad283aa400af464c76d713c07ad</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>username</th>
			                  			<td>村头老杨头</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI2YmFjYzhmYS0yYzI0LTQzMjUtOWQ5Ni05YjQ2N2RiYjZhZmUiLCJpYXQiOjE1ODIwNzE2MDUsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDc1MjA1fQ.py_-gaOjl1FrtK9d_Uc1TAaj823Q0fFfQ1fl1oxDYvA"
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "用户名或手机号不符合要求",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="349785" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>分页查询专业模糊查询 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=349785" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;349785&quot;,&quot;name&quot;:&quot;分页查询专业模糊查询&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/major\/getmajors&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[{&quot;auth_type&quot;:&quot;key_value&quot;,&quot;kv_key&quot;:&quot;token&quot;,&quot;kv_value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0&quot;}],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;pageNo&quot;,&quot;value&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;pageSize&quot;,&quot;value&quot;:&quot;2&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;m_name&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/major/getmajors</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>pageNo</th>
			                  			<td>1</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>pageSize</th>
			                  			<td>2</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>m_name</th>
			                  			<td>-</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": {
        "total": 7,
        "list": [
            {
                "r_id": 1,
                "r_name": "学员",
                "r_comment": "student"
            },
            {
                "r_id": 2,
                "r_name": "组长",
                "r_comment": "groupLeader "
            }
        ],
        "pageNum": 1,
        "pageSize": 2,
        "size": 2,
        "startRow": 1,
        "endRow": 2,
        "pages": 4,
        "prePage": 0,
        "nextPage": 2,
        "isFirstPage": true,
        "isLastPage": false,
        "hasPreviousPage": false,
        "hasNextPage": true,
        "navigatePages": 8,
        "navigatepageNums": [
            1,
            2,
            3,
            4
        ],
        "navigateFirstPage": 1,
        "navigateLastPage": 4
    }
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "查询失败",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="349784" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>分页查询角色模糊查询 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=349784" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;349784&quot;,&quot;name&quot;:&quot;分页查询角色模糊查询&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/role\/getroles&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;pageNo&quot;,&quot;value&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;pageSize&quot;,&quot;value&quot;:&quot;2&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;s_name&quot;,&quot;value&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/role/getroles</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>pageNo</th>
			                  			<td>1</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>pageSize</th>
			                  			<td>2</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>s_name</th>
			                  			<td>-</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": {
        "total": 7,
        "list": [
            {
                "r_id": 1,
                "r_name": "学员",
                "r_comment": "student"
            },
            {
                "r_id": 2,
                "r_name": "组长",
                "r_comment": "groupLeader "
            }
        ],
        "pageNum": 1,
        "pageSize": 2,
        "size": 2,
        "startRow": 1,
        "endRow": 2,
        "pages": 4,
        "prePage": 0,
        "nextPage": 2,
        "isFirstPage": true,
        "isLastPage": false,
        "hasPreviousPage": false,
        "hasNextPage": true,
        "navigatePages": 8,
        "navigatepageNums": [
            1,
            2,
            3,
            4
        ],
        "navigateFirstPage": 1,
        "navigateLastPage": 4
    }
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "查询失败",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="349783" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>查询角色 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=349783" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;349783&quot;,&quot;name&quot;:&quot;查询角色&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/role\/getrole&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;r_id&quot;,&quot;value&quot;:&quot;7&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/role/getrole</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>r_id</th>
			                  			<td>7</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": {
        "r_id": 7,
        "r_name": "主管",
        "r_comment": "managers"
    }
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "查询失败",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="349782" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>删除角色 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=349782" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;349782&quot;,&quot;name&quot;:&quot;删除角色&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/role\/del&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;r_id&quot;,&quot;value&quot;:&quot;8&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/role/del</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>r_id</th>
			                  			<td>8</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": 8
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "删除失败",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="349781" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>修改角色 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=349781" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;349781&quot;,&quot;name&quot;:&quot;修改角色&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/role\/update&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;r_id&quot;,&quot;value&quot;:&quot;8&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;r_name&quot;,&quot;value&quot;:&quot;admin&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;r_comment&quot;,&quot;value&quot;:&quot;2&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;g_priority&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/role/update</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>r_id</th>
			                  			<td>8</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>r_name</th>
			                  			<td>admin</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>r_comment</th>
			                  			<td>2</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>g_priority</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": 8
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "修改失败",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="349780" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>添加角色 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=349780" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;349780&quot;,&quot;name&quot;:&quot;添加角色&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/role\/add&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;r_name&quot;,&quot;value&quot;:&quot;admin&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;r_comment&quot;,&quot;value&quot;:&quot;2&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;g_priority&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/role/add</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>r_name</th>
			                  			<td>admin</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>r_comment</th>
			                  			<td>2</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>g_priority</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": 8
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "添加失败",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="349777" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>分页查询班级模糊查询根据学校ID或年级ID或专业ID查询 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=349777" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;349777&quot;,&quot;name&quot;:&quot;分页查询班级模糊查询根据学校ID或年级ID或专业ID查询&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/clazz\/getclazzs&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;pageNo&quot;,&quot;value&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;pageSize&quot;,&quot;value&quot;:&quot;2&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;c_name&quot;,&quot;value&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;s_id&quot;,&quot;value&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;g_id&quot;,&quot;value&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;m_id&quot;,&quot;value&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/clazz/getclazzs</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>pageNo</th>
			                  			<td>1</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>pageSize</th>
			                  			<td>2</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>c_name</th>
			                  			<td>-</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>s_id</th>
			                  			<td>-</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>g_id</th>
			                  			<td>-</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>m_id</th>
			                  			<td>-</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": {
        "total": 1,
        "list": [
            {
                "c_id": 5,
                "c_name": "开发2班",
                "c_priority": null,
                "g_id": 2,
                "grade": null
            }
        ],
        "pageNum": 1,
        "pageSize": 2,
        "size": 1,
        "startRow": 1,
        "endRow": 1,
        "pages": 1,
        "prePage": 0,
        "nextPage": 0,
        "isFirstPage": true,
        "isLastPage": true,
        "hasPreviousPage": false,
        "hasNextPage": false,
        "navigatePages": 8,
        "navigatepageNums": [
            1
        ],
        "navigateFirstPage": 1,
        "navigateLastPage": 1
    }
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "查询失败",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="349776" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>查询班级 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=349776" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;349776&quot;,&quot;name&quot;:&quot;查询班级&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/clazz\/getclazz&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;c_id&quot;,&quot;value&quot;:&quot;5&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/clazz/getclazz</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>c_id</th>
			                  			<td>5</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": {
        "c_id": 5,
        "c_name": "开发2班",
        "c_priority": null,
        "g_id": 2,
        "grade": null
    }
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "查询失败",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="349775" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>删除班级 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=349775" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;349775&quot;,&quot;name&quot;:&quot;删除班级&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/clazz\/del&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;c_id&quot;,&quot;value&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/clazz/del</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>c_id</th>
			                  			<td>1</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": 1
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "删除失败",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="349774" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>修改班级 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=349774" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;349774&quot;,&quot;name&quot;:&quot;修改班级&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/clazz\/update&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;c_id&quot;,&quot;value&quot;:&quot;1&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;c_name&quot;,&quot;value&quot;:&quot;开发3班&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;g_id&quot;,&quot;value&quot;:&quot;2&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;g_priority&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/clazz/update</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>c_id</th>
			                  			<td>1</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>c_name</th>
			                  			<td>开发3班</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>g_id</th>
			                  			<td>2</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>g_priority</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": 2
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "修改失败",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="349773" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>添加班级 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=349773" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;349773&quot;,&quot;name&quot;:&quot;添加班级&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/clazz\/add&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;c_name&quot;,&quot;value&quot;:&quot;开发2班&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;g_id&quot;,&quot;value&quot;:&quot;2&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;c_priority&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/clazz/add</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>c_name</th>
			                  			<td>开发2班</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>g_id</th>
			                  			<td>2</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>c_priority</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": 2
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "添加失败",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="349771" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>分页查询年级模糊查询根据学校ID查询 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=349771" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;349771&quot;,&quot;name&quot;:&quot;分页查询年级模糊查询根据学校ID查询&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/grade\/getgrades&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;0&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;pageNo&quot;,&quot;value&quot;:&quot;1&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;pageSize&quot;,&quot;value&quot;:&quot;2&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;g_name&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;0&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;s_id&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;0&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/grade/getgrades</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>pageNo</th>
			                  			<td>1</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>pageSize</th>
			                  			<td>2</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>g_name</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>s_id</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": {
        "total": 2,
        "list": [
            {
                "g_id": 2,
                "g_name": "平顶山",
                "g_priority": null,
                "s_id": null,
                "shool": null
            },
            {
                "g_id": 3,
                "g_name": "2019级",
                "g_priority": null,
                "s_id": 2,
                "shool": null
            }
        ],
        "pageNum": 1,
        "pageSize": 2,
        "size": 2,
        "startRow": 1,
        "endRow": 2,
        "pages": 1,
        "prePage": 0,
        "nextPage": 0,
        "isFirstPage": true,
        "isLastPage": true,
        "hasPreviousPage": false,
        "hasNextPage": false,
        "navigatePages": 8,
        "navigatepageNums": [
            1
        ],
        "navigateFirstPage": 1,
        "navigateLastPage": 1
    }
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "查询失败",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="349763" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>用户注册 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=349763" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;349763&quot;,&quot;name&quot;:&quot;用户注册&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/api\/user\/register?username=村头老杨头&phone=18567192712&password=25d55ad283aa400af464c76d713c07ad&real_name=杨盼&c_id=5&r_id=1&avatar=&quot;,&quot;method&quot;:&quot;GET&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;0&quot;,&quot;request_query_ischecked&quot;:&quot;1&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;0&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;username&quot;,&quot;value&quot;:&quot;村头老杨头&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;phone&quot;,&quot;value&quot;:&quot;18567192712&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;password&quot;,&quot;value&quot;:&quot;25d55ad283aa400af464c76d713c07ad&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;real_name&quot;,&quot;value&quot;:&quot;杨盼&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;c_id&quot;,&quot;value&quot;:&quot;5&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;r_id&quot;,&quot;value&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;avatar&quot;,&quot;value&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;username&quot;,&quot;value&quot;:&quot;平顶山&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;s_longitude&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;s_latitude&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/api/user/register?username=村头老杨头&amp;phone=18567192712&amp;password=25d55ad283aa400af464c76d713c07ad&amp;real_name=杨盼&amp;c_id=5&amp;r_id=1&amp;avatar=</code>
                        	            		<h4>请求方式</h4>
	            		<code>GET</code>
                                                                        	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>username</th>
			                  			<td>平顶山</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>s_longitude</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>s_latitude</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            			            		<div class="document-block-div request_query-div">
		            		<h4>请求Query参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>username</th>
			                  			<td>村头老杨头</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>phone</th>
			                  			<td>18567192712</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>password</th>
			                  			<td>25d55ad283aa400af464c76d713c07ad</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>real_name</th>
			                  			<td>杨盼</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>c_id</th>
			                  			<td>5</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>r_id</th>
			                  			<td>1</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>avatar</th>
			                  			<td>-</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": 1
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "用户名或手机号不符合要求",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="347896" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>分页查询学校模糊查询 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=347896" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;347896&quot;,&quot;name&quot;:&quot;分页查询学校模糊查询&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/shool\/getshools&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;pageNo&quot;,&quot;value&quot;:&quot;1&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;pageSize&quot;,&quot;value&quot;:&quot;3&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;s_name&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/shool/getshools</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>pageNo</th>
			                  			<td>1</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>pageSize</th>
			                  			<td>3</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>s_name</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": {
        "total": 2,
        "list": [
            {
                "s_id": 2,
                "s_name": "平顶山校区",
                "s_longitude": "",
                "s_latitude": ""
            },
            {
                "s_id": 3,
                "s_name": "平顶山",
                "s_longitude": "",
                "s_latitude": ""
            }
        ],
        "pageNum": 1,
        "pageSize": 3,
        "size": 2,
        "startRow": 1,
        "endRow": 2,
        "pages": 1,
        "prePage": 0,
        "nextPage": 0,
        "isFirstPage": true,
        "isLastPage": true,
        "hasPreviousPage": false,
        "hasNextPage": false,
        "navigatePages": 8,
        "navigatepageNums": [
            1
        ],
        "navigateFirstPage": 1,
        "navigateLastPage": 1
    }
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "查询失败",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="347895" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>查询学校 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=347895" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;347895&quot;,&quot;name&quot;:&quot;查询学校&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/shool\/getshool&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;s_id&quot;,&quot;value&quot;:&quot;1&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/shool/getshool</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>s_id</th>
			                  			<td>1</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": {
        "s_id": 2,
        "s_name": "平顶山校区",
        "s_longitude": "",
        "s_latitude": ""
    }
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "查询失败",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="347892" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>删除学校 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=347892" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;347892&quot;,&quot;name&quot;:&quot;删除学校&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/shool\/del&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;s_id&quot;,&quot;value&quot;:&quot;1&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/shool/del</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>s_id</th>
			                  			<td>1</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
	"code": "SUCCESS",
	"message": "SUCCESS",
	"data": 1
}

//删除  id</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "删除失败",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="347888" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>修改学校 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=347888" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;347888&quot;,&quot;name&quot;:&quot;修改学校&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/shool\/update&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;s_id&quot;,&quot;value&quot;:&quot;1&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;s_name&quot;,&quot;value&quot;:&quot;平顶山&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;s_longitude&quot;,&quot;value&quot;:&quot;123&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;0&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;s_latitude&quot;,&quot;value&quot;:&quot;123&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;0&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/shool/update</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>s_id</th>
			                  			<td>1</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>s_name</th>
			                  			<td>平顶山</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>s_longitude</th>
			                  			<td>123</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>s_latitude</th>
			                  			<td>123</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
	"code": "SUCCESS",
	"message": "SUCCESS",
	"data": 1
}

//返回 修改的id</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="347887" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>添加学校 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=347887" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;347887&quot;,&quot;name&quot;:&quot;添加学校&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/shool\/add&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;s_name&quot;,&quot;value&quot;:&quot;平顶山&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;s_longitude&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;s_latitude&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/shool/add</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>s_name</th>
			                  			<td>平顶山</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>s_longitude</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>s_latitude</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
	"code": "SUCCESS",
	"message": "SUCCESS",
	"data": 1
}
//返回data 学校id</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="349946" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>查询年级 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=349946" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;349946&quot;,&quot;name&quot;:&quot;查询年级&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/api\/grade\/getgrade?g_id=2&quot;,&quot;method&quot;:&quot;GET&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;1&quot;,&quot;request_header_ischecked&quot;:&quot;0&quot;,&quot;request_query_ischecked&quot;:&quot;1&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[],&quot;request_query&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;g_id&quot;,&quot;value&quot;:&quot;2&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;0&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/api/grade/getgrade?g_id=2</code>
                        	            		<h4>请求方式</h4>
	            		<code>GET</code>
                                                                        	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            			            		<div class="document-block-div request_query-div">
		            		<h4>请求Query参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>g_id</th>
			                  			<td>2</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": {
        "g_id": 2,
        "g_name": "平顶山",
        "g_priority": null,
        "s_id": null,
        "shool": null,
        "clazzes": null
    }
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="349800" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>删除用户 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=349800" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;349800&quot;,&quot;name&quot;:&quot;删除用户&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/user\/del&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIxMjlkNzllMS01MjEyLTQyNzQtOTZlMC05NWQ5ZjQzYmQ3NWUiLCJpYXQiOjE1ODIwNjc0ODgsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDcxMDg4fQ.dFrCKaNXiMEdQCvkeYwnEmRF0-HGc2n3F6T7y0uKZss&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;u_id&quot;,&quot;value&quot;:&quot;3&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/user/del</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIxMjlkNzllMS01MjEyLTQyNzQtOTZlMC05NWQ5ZjQzYmQ3NWUiLCJpYXQiOjE1ODIwNjc0ODgsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDcxMDg4fQ.dFrCKaNXiMEdQCvkeYwnEmRF0-HGc2n3F6T7y0uKZss</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>u_id</th>
			                  			<td>3</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": 3
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "删除失败",
    "data": 3
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="349789" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>查询专业 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=349789" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;349789&quot;,&quot;name&quot;:&quot;查询专业&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/major\/getmajor&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;m_id&quot;,&quot;value&quot;:&quot;3&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/major/getmajor</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>m_id</th>
			                  			<td>3</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": {
        "m_id": 2,
        "m_name": "网销",
        "m_intro": "介绍",
        "m_priority": null
    }
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "查询失败",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="349772" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>查询年级 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=349772" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;349772&quot;,&quot;name&quot;:&quot;查询年级&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/grade\/getgrade&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;g_id&quot;,&quot;value&quot;:&quot;2&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/grade/getgrade</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>g_id</th>
			                  			<td>2</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": {
        "g_id": 2,
        "g_name": "平顶山",
        "g_priority": null,
        "s_id": null,
        "shool": null
    }
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "查询失败",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="349798" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>修改用户 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=349798" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;349798&quot;,&quot;name&quot;:&quot;修改用户&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/user\/update&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZjExOWJmMi03NGE3LTRiNjItYjJhYi05NDhkYTlhMDM2OGYiLCJpYXQiOjE1ODIxMjAwNDQsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJpbnRlZ3JhbFwiOjAsXCJwYXNzd29yZFwiOlwiXCIsXCJwaG9uZVwiOlwiMTg1NjcxOTI3MTJcIixcInJfaWRcIjoxLFwicmVhbF9uYW1lXCI6XCLmnajnm7xcIixcInVfaWRcIjoxLFwidXNlcm5hbWVcIjpcIuadkeWktOiAgeadqOWktFwifSIsImV4cCI6MTU4MjEyMzY0NH0.XFK7YyynIGS2Rn6StKKnQ0IQyD1F8GKg8ZrwYTKjhOI&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;0&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;u_id&quot;,&quot;value&quot;:&quot;3&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;username&quot;,&quot;value&quot;:&quot;村头老0&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;phone&quot;,&quot;value&quot;:&quot;18567878727&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;password&quot;,&quot;value&quot;:&quot;25d55ad283aa400af464c76d713c07ad&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;real_name&quot;,&quot;value&quot;:&quot;test&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;c_id&quot;,&quot;value&quot;:&quot;5&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;r_id&quot;,&quot;value&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;avatar&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/user/update</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZjExOWJmMi03NGE3LTRiNjItYjJhYi05NDhkYTlhMDM2OGYiLCJpYXQiOjE1ODIxMjAwNDQsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJpbnRlZ3JhbFwiOjAsXCJwYXNzd29yZFwiOlwiXCIsXCJwaG9uZVwiOlwiMTg1NjcxOTI3MTJcIixcInJfaWRcIjoxLFwicmVhbF9uYW1lXCI6XCLmnajnm7xcIixcInVfaWRcIjoxLFwidXNlcm5hbWVcIjpcIuadkeWktOiAgeadqOWktFwifSIsImV4cCI6MTU4MjEyMzY0NH0.XFK7YyynIGS2Rn6StKKnQ0IQyD1F8GKg8ZrwYTKjhOI</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>u_id</th>
			                  			<td>3</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>username</th>
			                  			<td>村头老0</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>phone</th>
			                  			<td>18567878727</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>password</th>
			                  			<td>25d55ad283aa400af464c76d713c07ad</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>real_name</th>
			                  			<td>test</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>c_id</th>
			                  			<td>5</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>r_id</th>
			                  			<td>1</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>avatar</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": {
        "u_id": 3,
        "username": "村头老0",
        "phone": "18567878727",
        "password": "25d55ad283aa400af464c76d713c07ad",
        "real_name": "test",
        "c_id": 5,
        "clazz": null,
        "r_id": 1,
        "role": null
    }
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "用户名或手机号已存在",
    "data": {
        "u_id": 3,
        "username": "村头老7",
        "phone": "18567878727",
        "password": "25d55ad283aa400af464c76d713c07ad",
        "real_name": "test",
        "c_id": 5,
        "clazz": null,
        "r_id": 1,
        "role": null
    }
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="349788" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>删除专业 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=349788" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;349788&quot;,&quot;name&quot;:&quot;删除专业&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/major\/del&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;m_id&quot;,&quot;value&quot;:&quot;3&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/major/del</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>m_id</th>
			                  			<td>3</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": 3
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "删除失败",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="349770" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>删除年级 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=349770" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;349770&quot;,&quot;name&quot;:&quot;删除年级&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/grade\/del&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;g_id&quot;,&quot;value&quot;:&quot;1&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/grade/del</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>g_id</th>
			                  			<td>1</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": 1
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "删除失败",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="349796" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>添加用户 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=349796" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;349796&quot;,&quot;name&quot;:&quot;添加用户&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/user\/add&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI2YmFjYzhmYS0yYzI0LTQzMjUtOWQ5Ni05YjQ2N2RiYjZhZmUiLCJpYXQiOjE1ODIwNzE2MDUsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDc1MjA1fQ.py_-gaOjl1FrtK9d_Uc1TAaj823Q0fFfQ1fl1oxDYvA&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;0&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;username&quot;,&quot;value&quot;:&quot;村头老7&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;phone&quot;,&quot;value&quot;:&quot;18567878727&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;password&quot;,&quot;value&quot;:&quot;25d55ad283aa400af464c76d713c07ad&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;real_name&quot;,&quot;value&quot;:&quot;test&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;c_id&quot;,&quot;value&quot;:&quot;1&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;r_id&quot;,&quot;value&quot;:&quot;1&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;avatar&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/user/add</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI2YmFjYzhmYS0yYzI0LTQzMjUtOWQ5Ni05YjQ2N2RiYjZhZmUiLCJpYXQiOjE1ODIwNzE2MDUsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDc1MjA1fQ.py_-gaOjl1FrtK9d_Uc1TAaj823Q0fFfQ1fl1oxDYvA</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>username</th>
			                  			<td>村头老7</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>phone</th>
			                  			<td>18567878727</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>password</th>
			                  			<td>25d55ad283aa400af464c76d713c07ad</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>real_name</th>
			                  			<td>test</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>c_id</th>
			                  			<td>1</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>r_id</th>
			                  			<td>1</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>avatar</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": {
        "u_id": 5,
        "username": "村头老",
        "phone": "18567878724",
        "password": "25d55ad283aa400af464c76d713c07ad",
        "real_name": "test",
        "c_id": 5,
        "clazz": null,
        "r_id": 1,
        "role": null
    }
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "角色ID或班级ID错误",
    "data": {
        "u_id": null,
        "username": "村头老7",
        "phone": "18567878727",
        "password": "25d55ad283aa400af464c76d713c07ad",
        "real_name": "test",
        "c_id": 1,
        "clazz": null,
        "r_id": 1,
        "role": null
    }
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="349787" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>修改专业 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=349787" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;349787&quot;,&quot;name&quot;:&quot;修改专业&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/major\/update&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;m_id&quot;,&quot;value&quot;:&quot;3&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;m_name&quot;,&quot;value&quot;:&quot;测试&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;m_intro&quot;,&quot;value&quot;:&quot;介绍&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;m_priority&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/major/update</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>m_id</th>
			                  			<td>3</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>m_name</th>
			                  			<td>测试</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>m_intro</th>
			                  			<td>介绍</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>m_priority</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": 3
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "修改失败",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="349769" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>修改年级 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=349769" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;349769&quot;,&quot;name&quot;:&quot;修改年级&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/grade\/update&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;g_id&quot;,&quot;value&quot;:&quot;1&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;g_name&quot;,&quot;value&quot;:&quot;2017级&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;s_id&quot;,&quot;value&quot;:&quot;2&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;g_priority&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/grade/update</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>g_id</th>
			                  			<td>1</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>g_name</th>
			                  			<td>2017级</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>s_id</th>
			                  			<td>2</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>g_priority</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": 1
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "修改失败",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="349786" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>添加专业 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=349786" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;349786&quot;,&quot;name&quot;:&quot;添加专业&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/major\/add&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;m_name&quot;,&quot;value&quot;:&quot;测试&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;m_intro&quot;,&quot;value&quot;:&quot;介绍&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;m_priority&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/major/add</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>application/x-www-form-urlencoded</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>m_name</th>
			                  			<td>测试</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>m_intro</th>
			                  			<td>介绍</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>m_priority</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": 1
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "添加失败",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      	                        	    	<div class="page-wrapper hide" tabindex="349434" role="main">
	        	<div class="page-inner">
	          		<section class="markdown-section">
	            		<h1 class="api-name-class"><i class="fa fa-link" aria-hidden="true"></i>添加年级 <button  type="button" data-href="https://www.apipost.cn/client.php?project_id=49516&apiid=349434" class="btn btn-gray api-test-send-btn"  data-clipboard-text="{&quot;apiid&quot;:&quot;349434&quot;,&quot;name&quot;:&quot;添加年级&quot;,&quot;url&quot;:&quot;http:\/\/127.0.0.1:8081\/admin\/grade\/add&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;mark&quot;:&quot;developing&quot;,&quot;request_type&quot;:&quot;2&quot;,&quot;request_header_ischecked&quot;:&quot;1&quot;,&quot;request_query_ischecked&quot;:&quot;0&quot;,&quot;request_body_ischecked&quot;:&quot;1&quot;,&quot;auth&quot;:[],&quot;request_header&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;token&quot;,&quot;value&quot;:&quot;eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_query&quot;:[],&quot;request_body&quot;:[{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;g_name&quot;,&quot;value&quot;:&quot;2019级&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;s_id&quot;,&quot;value&quot;:&quot;2&quot;,&quot;not_null&quot;:&quot;&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;},{&quot;indent&quot;:&quot;0&quot;,&quot;key&quot;:&quot;g_priority&quot;,&quot;value&quot;:&quot;&quot;,&quot;not_null&quot;:&quot;1&quot;,&quot;placeholder&quot;:&quot;参数值&quot;,&quot;type&quot;:&quot;Text&quot;,&quot;description&quot;:&quot;&quot;,&quot;isencode&quot;:&quot;0&quot;,&quot;is_para_checked&quot;:&quot;1&quot;}],&quot;request_raw_body&quot;:&quot;&quot;}"><i class="fa fa-paper-plane-o" aria-hidden="true"></i>接口测试</button> </h1>
	            		                        	            		<h4>接口URL</h4>
	            		<code>http://127.0.0.1:8081/admin/grade/add</code>
                        	            		<h4>请求方式</h4>
	            		<code>POST</code>
                                                                            <h4>请求 Content-Type</h4>
                            <code>Array</code>
                                                	            		<!-- 开始 request_all_header -->
	            		
	            		<!-- 开始 request_header -->
	            			            		<div class="document-block-div request_header-div">
		            		<h4>请求自定义Header</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>token</th>
			                  			<td>eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJlZmJkMzkyZS1iMjBlLTQ1YzQtODRkNi1lMTY1ODUwNjUzNDIiLCJpYXQiOjE1ODIwNjA5MDYsImlzcyI6ImN0bHl0Iiwic3ViIjoie1wiY19pZFwiOjUsXCJwYXNzd29yZFwiOlwiMjVkNTVhZDI4M2FhNDAwYWY0NjRjNzZkNzEzYzA3YWRcIixcInBob25lXCI6XCIxODU2NzE5MjcxMlwiLFwicl9pZFwiOjEsXCJyZWFsX25hbWVcIjpcIuadqOebvFwiLFwidV9pZFwiOjEsXCJ1c2VybmFtZVwiOlwi5p2R5aS06ICB5p2o5aS0XCJ9IiwiZXhwIjoxNTgyMDY0NTA2fQ.yoxZtvF7Lwqp9lBeR2ZmBwYn68riYDWAeDlEChKDrG0</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 request_body -->
                        	            			            			            		<div class="document-block-div request_body-div">
		            		<h4>请求Body参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
                                        <th style="width: 30%">示例值</th>
                                        <th style="width: 7%">必填</th>
			                  			<th style="width:35%">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th>g_name</th>
			                  			<td>2019级</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>s_id</th>
			                  			<td>2</td>
                                        <td>必填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th>g_priority</th>
			                  			<td>-</td>
                                        <td>选填</td>
			                  			<td>-</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            								                        
						<!-- 开始 request_Query -->
	            		
	            		<!-- 开始 response_header -->
	            		
	            		<!-- 开始 response_cookie -->
	            		
	            		<!-- 开始 response_body -->
	            			            		<div class="document-block-div response_body-div">
		            		<h4>响应参数</h4>
		            		<table>
		              			<thead>
		                			<tr>
			                  			<th style="width: 28%">参数</th>
			                  			<th  style="width: 72%"colspan="2">参数描述</th>
			                  		</tr>
		              			</thead>
		              			<tbody>
		              						              						              				<tr>
			                  			<th style="text-indent: 0em">timestamp</th>
			                  			<td colspan="2">2020-02-17T17:32:47.730+0000</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">status</th>
			                  			<td colspan="2">-</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">error</th>
			                  			<td colspan="2">Internal Server Error</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">message</th>
			                  			<td colspan="2">nested exception is org.apache.ibatis.exceptions.PersistenceException: <br />
### Error updating database.  Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam<br />
### Cause: java.lang.RuntimeException: Driver org.h2.Driver claims to not accept jdbcUrl, jdbc:mysql://127.0.0.1:3306/ol_exam</td>
			                  		</tr>
			                  				              						              						              				<tr>
			                  			<th style="text-indent: 0em">path</th>
			                  			<td colspan="2">/admin/shool/add</td>
			                  		</tr>
			                  				              						              			</tbody>
		            		</table>
		            	</div>
	            		
	            		<!-- 开始 response_body_text_ishide -->
	            			            		<h4>成功响应示例</h4>
	            		<pre><code>{
    "code": "SUCCESS",
    "message": "SUCCESS",
    "data": 3
}</code></pre>
	            		
	            		<!-- 开始 response_body_error_text -->
	            			            		<h4>失败响应示例</h4>
	            		<pre><code>{
    "code": "FAIL",
    "message": "请填写学校ID",
    "data": null
}</code></pre>
	            			          		</section>
	        	</div>
	      	</div>
            	      		      	<footer>
	      		本文档由<a href="https://www.apipost.cn/?fr=doc" target="_blank">APIPOST接口调试与管理工具</a>生成
	      	</footer>
	    </div>
	    <a href="javascript:;" class="navigation navigation-prev">
	      	<i class="fa fa-angle-left" aria-hidden="true"></i>
	    </a>
	    <a href="javascript:;" class="navigation navigation-next" style="margin-right: 17px;">
	      	<i class="fa fa-angle-right" aria-hidden="true"></i>
	    </a>
	</div>
</div>
<!-- 百度统计 -->
<script>
	var _hmt = _hmt || [];
	(function() {
	  var hm = document.createElement("script");
	  hm.src = "https://hm.baidu.com/hm.js?a046ce178828e393614822a297b8d296";
	  var s = document.getElementsByTagName("script")[0];
	  s.parentNode.insertBefore(hm, s);
	})();
</script>
<span style="display: none;"><script type="text/javascript" src="https://s23.cnzz.com/z_stat.php?id=1276797738&web_id=1276797738"></script></span>
</body>
</html>
