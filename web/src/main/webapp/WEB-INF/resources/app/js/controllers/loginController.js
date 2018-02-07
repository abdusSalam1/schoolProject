(function (app) {
    function loginController(loginService, $q, $scope, $rootScope) {
        var self = this;
        $rootScope.isLoginPage        = true;
        $rootScope.isMainPage         = false;
        $scope.credentials = {email: '', password: ''};

       self.authenticateUser = function (credentials) {
           loginService.authenticateUser(credentials).then(function (res) {
               console.log(res);
           });
       };

    }
    app.controller("loginController", ['loginService', '$q', '$scope', '$rootScope', loginController]);
}(smsApp));