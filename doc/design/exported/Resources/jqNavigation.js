var last = "#app_map_page";
$(document).ready(function () {
//	$('body').layout({ applyDefaultStyles: true, minSize:140 });
	$(".thumb")
		.click(function() {
			var aux = "#" + $(this).attr('id') + "_page";
			$(last).hide(null);
			$('html, body').scrollTop(0);
			$(aux).show(null);
			last = aux;
		})
		.css('cursor', 'pointer');
	$(".map-link")
		.click(function() {
			var aux = "#" + $(this).attr('obj') + "_page";
			$(last).hide(null);
			$('html, body').scrollTop(0);
			$(aux).show(null);
			last = aux;
		})
		.css('cursor', 'pointer');
	$(".Page").hide();
	$(last).show();
});
