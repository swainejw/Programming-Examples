// switching logos
const logos = ["images/leafs.png", "images/habs.png","images/sens.png"];
let currentLogo = 0;

function changeLogo() {

    currentLogo++;

    if (currentLogo >= logos.length) {
        currentLogo = 0;
    }

    document.getElementById("logo").src = logos[currentLogo];
}

// changing colours

const colors = ["red", "blue", "green", "yellow"];
let current = 0;

function changeColor() {
    document.body.style.backgroundColor = colors[current];

    current++;

    if (current >= colors.length) {
        current = 0;
    }
}

// changing background image

const images = ["images/tileBrick2.png", "images/tileBrick3.png", "images/tileBrick1.png"];
let x = 0;

function changeBGImage() {
    document.body.style.backgroundImage = "url('" + images[x] + "')";

    x++;
    if (x >= images.length) {
        x = 0;
    }
}
    
// rolling dice

function rollDice() {

    let number = Math.floor(Math.random() * 6) + 1;

    document.getElementById("result").innerHTML =
       "You rolled a " + number;
}

// random phrase chooser

const phrases = [
    "Bru",
    "Bro is cooked",
    "That's cap",
    "No cap",
    "You're chopped",
    "That's crazy work",
    "It's giving...",
    "Bro thinks he's him",
    "Who let bro cook?",
    "Let him cook",
    "It's not that deep",
    "Be so for real",
    "Ain't no way",
    "Say less",
    "My guy",
    "Touch grass",
    "Skill issue",
    "L + ratio",
    "You fell off",
    "Bro really thought he ate",
    "That's actually wild",
    "I'm dead",
    "I'm weak",
    "Bro is NOT him",
    "We're cooked",
    "That's tuff",
    "Unc is yapping",
    "What are we doing, gang?",
    "Bro sold",
    "Absolutely diabolical",
    "W aura",
    "L aura"
];

const button = document.getElementById("phraseButton");
const display = document.getElementById("phraseDisplay");

function pickPhrase() {

    // Choose a random number
    let randomNumber = Math.floor(Math.random() * phrases.length);

    // Get the phrase at that position
    let randomPhrase = phrases[randomNumber];

    // Display the phrase
    display.textContent = randomPhrase;
};

// No numbers in name field of contact

const nameInput = document.getElementById("name");

if (nameInput) {

    nameInput.addEventListener("input", function() {

        // Get the name that was typed
        let name = nameInput.value;

        // Check each character
        for (let i = 0; i < name.length; i++) {

            // Check if the character is a number
            if (name[i] >= "0" && name[i] <= "9") {

                alert("Please don't enter numbers in the name field.");

                // Remove the number
                name = name.substring(0, i) + name.substring(i + 1);

                // Put the corrected name back into the textbox
                nameInput.value = name;

                break;
            }
        }
    });
}