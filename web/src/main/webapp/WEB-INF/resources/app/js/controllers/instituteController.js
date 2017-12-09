/**
 * Created by umars on 12/9/2017.
 */
(function (app) {
    function instituteController(instituteService, $q, $scope) {
var self = this;
self.answer ="";
        $scope.showform = true;
        $scope.showtable = false;
        $scope.aaa ="aaa";

self.getInstitutes = function () {
    $scope.showform = false;
    $scope.showtable = true;
    $scope.aaa = "gg";

};
    }
app.controller("instituteController", ['instituteService', '$q', '$scope', instituteController]);
}(app));
