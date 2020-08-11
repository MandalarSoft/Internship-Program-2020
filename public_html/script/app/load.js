var sourceUrl = "https://slack.com/api/users.list";
var token = 'xoxp-1261160819365-1262533222802-1297992002276-5571a875746d469e9346eb7694d12b83';
var request = sourceUrl + "?token=" + token;

var getData = function (element) {
    $.get(request, function (data) {
        for (i = 0; i < data.members.length; i++) {
            var menber = data.members[i];
            if (!menber.is_bot && !menber.is_admin) {
                if (data.members[i].real_name === 'Slackbot')
                    continue;
                student(element, menber.real_name, menber.profile.image_512);
            }
        }
    });
};