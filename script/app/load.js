import {student as student} from "./template.js";
import {dataSet as dataSet} from './data.js';

let sourceUrl = "https://slack.com/api/users.list";
let token = 'xoxp-1261160819365-1262533222802-1295266838707-9be6230a34436999cc1b471c4827a6a4';
let request = sourceUrl + "?token=" + token;

export const getData = function (element) {
    $.get(request, function (data) {
        for (var i = 0; i < data.members.length; i++) {
            var menber = data.members[i];
            if (!menber.is_bot && !menber.is_admin) {
                if (data.members[i].real_name === 'Slackbot')
                    continue;
                student(dataSet(), element, menber.real_name, menber.profile.image_512);
            }
        }
    });
};
