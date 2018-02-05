(function (app) {
    function loginController( $q, $scope, $rootScope) {
        var self = this;
        $rootScope.isLoginPage        = true;
        $rootScope.isMainPage         = false;
        $scope.credentials = {email: '', password: ''};

    }
    app.controller("loginController", [ '$q', '$scope', '$rootScope', loginController]);
}(smsApp));