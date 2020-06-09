var soap = require('soap');
var url = 'http://localhost:8080/ws/countries.wsdl';
soap.createClient(url, function(err, client) {
    client.getCountry({ name: "Spain" }, function(err, result) {
        if(err) return console.log(err);
        console.log(result.country);
    });
});