var exec = require('cordova/exec');

module.exports.add = function (arg0, success, error) {
    exec(success, error, 'GreatdayAtt', 'add', [arg0]);
};

module.exports.test = function (arg0, success, error) {
    exec(success, error, 'GreatdayAtt', 'test', [arg0])
}
