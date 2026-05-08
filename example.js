// Selecting the elements from the DOM
const button = document.getElementById('colorBtn');
const body = document.body;

// Function to generate a random hex color
function getRandomColor() {
    const letters = '0123456789ABCDEF';
    let color = '#';
    for (let i = 0; i < 6; i++) {
        color += letters[Math.floor(Math.random() * 16)];
    }
    return color;
}

// Adding an Event Listener to the button
button.addEventListener('click', () => {
    const newColor = getRandomColor();
    body.style.backgroundColor = newColor;
    console.log("Color changed to: " + newColor);
});
let name = 'damon';
let num = '60';
let totalPrice ="4"
console.log(num);
let price1 = "45";
let price2 = "34";
let total = price1 + price2;
console.log(total);