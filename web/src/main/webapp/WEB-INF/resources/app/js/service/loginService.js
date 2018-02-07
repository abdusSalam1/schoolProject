/**
 * Created by umars on 12/9/2017.
 */
(function (app) {
    function loginService($communicationService) {

        this.authenticateUser = function (credentials) {
            return $communicationService.post('/login' , credentials);
        };
    }
    app.service("loginService", ["$communicationService", loginService]);
})
    (smsApp);
