$(document).ready(function () {

    initMap();
     
});

const cartels = [
    {
        position: {lat:206597,lng:-1033496},
        map: map,
    },
    {
        position: {lat:325149,lng:-1170382},     
        map: map,
    },
    {
        position: {lat:196058,lng:-990365},
        map: map,
    }
];

function addMarker(props){

    var marker = new google.maps.Marker({

        position: props.position,
        map: props.map
    })
} 

function initMap(){

    var options = {
        zoom: 6,
        center:{lat:23.6345,lng:-102.5528}
    }

    var map = new google.maps.Map(document.getElementById('map'), options);
}

