let weight = 70;
let height_cm = 175;
let height_m = height_cm / 100;

function calculateBMI(weight, height) {
    return weight / (height * height);
}

let bmi = calculateBMI(weight, height_m);

console.log("体重: " + weight + " kg");
console.log("身長: " + height_cm + " cm");
console.log("BMI: " + bmi.toFixed(2)); 
