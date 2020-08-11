import 'https://code.jquery.com/jquery-3.5.1.min.js';
import {getData as getData} from "./app/load.js";

$(document).ready(function () {
    getData("#Students");
});