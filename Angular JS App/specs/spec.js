
/* global describe, it, expect, inject, runs */

(function () {
    /// <reference path="Scripts/jasmine-2.4.1/jasmine.js" />

    'use strict'

    describe("App: eHealth Angular-PouchDB", function () {
        beforeEach(function(){
            module('eHealthApp');
            
        });


        it("exists", function () {
            expect(true).toBe(true);
        });
        it("is right developer", inject(function (Owner) {
            expect(Owner).toBe('Lord-Mallam Nugwan');
        }));

        

    });


    describe("PouchDB Test", function () {

        var test;
        beforeEach(function () {
            module('eHealthApp');

        });

        

        function recreate(name, callback) {
            var db = new PouchDB(name);
            db.destroy().then(function () {
                db = new PouchDB(name);
                callback(db);
            })
        }

        function dbtestOne(person, $rootScope) {

            recreate('eHealtTest', function (db) {
                db.put(person).then(function () {
                    db.get(person._id).then(function (result) {
                        var retrieved = result;
                        db.destroy();
                        return retrieved;
                    }).catch(function (error) {
                        alert(error);
                    });
                    $rootScope.$digest();
                }).catch(function (error) {
                    alert(error);
                });
            });
        }



        it('Store new person to db and retrive by ID', inject(function (pouchdb, $rootScope) {

            
            var returnedName;
            var person = {
                _id: Date.now().toString(),
                name: 'Lord-Mallam',
                surname: 'Nugwan',
                age: '29',
                occupation: 'Developer',
                hobbies: 'Reading'
            };
                
            var result = dbtestOne(person, $rootScope);

            expect(result).not.toBeNull();
            
            
                
        }));




    });

}());