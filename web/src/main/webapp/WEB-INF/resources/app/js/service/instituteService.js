/**
 * Created by umars on 12/9/2017.
 */
(function (app) {
    function instituteService($communicationService) {

        this.getParentGroups = function (qamodels) {
            return $communicationService.get('/institutions/interest-test' , qamodels);
        };
    }
    app.service("instituteService", ["$communicationService", instituteService]);
})
    (app);
