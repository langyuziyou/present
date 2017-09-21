// 100000.00转换成100,000.00
function fmoney(s) {
    if (!(s)) {
		return 0.00;
    }
    s = parseFloat((s + "").replace(/[^\d\.-]/g, "")).toFixed(2) + "";
    var c = s.split(".")[0].split("").reverse();
    var e = s.split(".")[1];
    var t = "";
    for (i = 0; i < c.length; i++) {
	t += c[i] + ((i + 1) % 3 == 0 && (i + 1) != c.length ? "," : "");
    }
    return t.split("").reverse().join("") + "." + e;
}
// 100,000,000.00转换成100000000.00
function rmoney(s) {
    return parseFloat(s.replace(/[^\d\.-]/g, ""));
}
function fnum(s) {
    if (!(s)) {
		return 0;
    }
    s = parseFloat((s + "").replace(/[^\d\.-]/g, "")).toFixed(2) + "";
    var c = s.split(".")[0].split("").reverse();
    var t = "";
    for (i = 0; i < c.length; i++) {
    	t += c[i] + ((i + 1) % 3 == 0 && (i + 1) != c.length ? "," : "");
    }
    return t.split("").reverse().join("");
}
function rnum(s) {
    return parseFloat(s.replace(/[^\d\.-]/g, ""));
}

$(function(){
	layui.use('element', function() {
		var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块
	
		//监听导航点击
		element.on('nav(demo)', function(elem) {
			layer.msg(elem.text());
		});
	});
})
