$(document).ready(function () {


     
});

function initMap(){

    var options = {
        zoom: 6,
        center:{lat:23.6100,lng:-102.5528}
    }

    var map = new google.maps.Map(document.getElementById('map'), options);
   
    var marker = new google.maps.Marker({

        position: {lat:20.6597,lng:-103.3496},
        map: map
    });

    var marker = new google.maps.Marker({

        position: {lat:24.2669,lng:-98.8363},
        map: map
    });

    var marker = new google.maps.Marker({

        position: {lat:19.6058,lng:-99.0365},
        map: map
    });
};


