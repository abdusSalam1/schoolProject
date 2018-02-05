(function (app) {
    function loginController( $q, $scope, $rootScope) {
        var self = this;
        $rootScope.isLoginPage        = true;
        $rootScope.isLightLoginPage   = false;
        $rootScope.isLockscreenPage   = false;
        $rootScope.isMainPage         = false;
        $scope.credentials = {email: '', password: ''};


    }
    app.controller("loginController", [ '$q', '$scope', '$rootScope', loginController]);
}(smsApp));