const path = (name) => {
    return  "http://" + window.location.host + "/Internship-Program-2020/template/" + name + ".html";
};

export const student = function (dataSet, elemnt, name, imageUrl) {
    $.ajax({
        url: path('student.element'),
        type: 'get',
        dataType: 'html',
        async: true,
        success: function (data) {
            var raw = data;
            raw = raw.replace('${name}', name);
            raw = raw.replace('${imageUrl}', imageUrl);
            raw = raw.replace('${link}', dataSet.get(name));
            $(elemnt).append(raw);
        }
    });
};
