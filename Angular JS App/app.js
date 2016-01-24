/// <reference path="Scripts/angular.js" />

var eHealthApp = angular.module('eHealthApp', ['pouchdb']).value('Owner','Lord-Mallam Nugwan');
eHealthApp.factory('db', function (pouchdb) {
    
    return pouchdb.create('eHealthdb');
});


eHealthApp.controller("maincontroller", ["$scope","db", function ($scope, db) {
    var eHealthDB = db;
    $scope.Calladdtodb = function(name,surname,age,occupation,hobbies){
        db.put({ _id: Date.now().toString(), name: name, surname: surname, age: age, occupation: occupation, hobbies: hobbies });
        $scope.name = null;
        $scope.surname = null;
        $scope.age = null;
        $scope.occupation = null;
        $scope.hobbies = null;
    };
    
    //db.destroy('eHealthdb');
}]);
    

