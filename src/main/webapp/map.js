var map = L.map('map').setView([8.7139,77.7567],13);

L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png',{
}).addTo(map);

var marker = L.marker([8.7139,77.7567]).addTo(map);

function updateLocation(){

fetch("getLocation")
.then(res=>res.json())
.then(data=>{

marker.setLatLng([data.lat,data.lon]);

});

}

setInterval(updateLocation,5000);