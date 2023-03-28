// https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&current_weather=true&hourly=temperature_2m,relativehumidity_2m,windspeed_10m

const box = document.getElementById("weather-box");
const weathercodeElement = document.getElementById("weather-code");
const cityElement = document.getElementById("city");
const temperatureElement = document.getElementById("temperature");
const windElement = document.getElementById("wind");


function getWeatherByCode(code) {
  switch (code) {
    case 0:
      return "Clear sky";
    case 1:
    case 2:
    case 3:
      return "Mainly clear, partly cloudy, and overcast";
    case 42, 48:
      return "Fog and depositing rime fog";
    default:
      return "-";
  }
}

async function f() {
  const response = await fetch("https://get.geojs.io/v1/ip/geo.json");
  const obj = await response.json();
  const { city, latitude, longitude } = obj; // с помощью деструктуризации разобрали объет и сохранили информацию в переменные 
  // console.log(obj);  // посмотрели объект, узнали имена полей 
  console.log(city + " " + latitude + " " + longitude);
  const weatherResponse = await fetch(
    `https://api.open-meteo.com/v1/forecast?latitude=${latitude}&longitude=${longitude}&current_weather=true&hourly=temperature_2m,relativehumidity_2m,windspeed_10m`
  );
  const weatherObj = await weatherResponse.json();
  // console.log(weatherObj.current_weather);  // 
  const { temperature, windspeed, weathercode } = weatherObj.current_weather;
  console.log(temperature + " " + windspeed + " " + weathercode);
  cityElement.innerText = city;
  temperatureElement.innerText = temperature + "°";
  weathercodeElement.innerText = getWeatherByCode(weathercode);
  windElement.innerText = windspeed;
}
f();