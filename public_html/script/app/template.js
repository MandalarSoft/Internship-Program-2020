var student = function (elemnt, name, imageUrl) {
    $.get(path('student.element'), function (data) {
        var raw = data;
        raw = raw.replace('${name}', name);
        raw = raw.replace('${imageUrl}', imageUrl);
        raw = raw.replace('${link}', dataSet.get(name));
        $(elemnt).append(raw);
    });
};