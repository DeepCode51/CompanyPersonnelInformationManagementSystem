KindEditor.ready(function(K) {
	var editor = K.editor({
		uploadJson : './mgr/uploadImg',
		allowFileManager : false
	});
	K('img.empl-photo-image').click(function() {
		editor.loadPlugin('image', function() {
			editor.plugin.imageDialog({
				showRemote : false,
				clickFn : function(url, title, width, height, border, align) {
					editor.hideDialog(); // 隐藏弹窗
					console.log(url);
					$('img.empl-photo-image').attr('src', "."+url);
				}
			});
		});
	});
});
