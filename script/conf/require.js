var prefix = "script/";
var subfix = ".js";
var classPath = "/Internship-Program-2020/template/";

function include(file) {
    var script = document.createElement('script');
    script.src = prefix + file + subfix;
    script.type = 'text/javascript';
    script.defer = true;
    document.getElementsByTagName('head').item(0).appendChild(script);
}

function path(name) {
    return  "http://" + window.location.host + classPath + name + ".html";
}
