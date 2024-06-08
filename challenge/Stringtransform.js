const prompt = require('prompt-sync')();

function main() {
    let strng = prompt('Enter any string: ');
    let reversedStr = '';

    try {
        if (strng.length % 3 === 0 && strng.length % 5 === 0) {
            console.log('The ASCII codes of your string are:');
            for (let i = 0; i < strng.length; i++) {
                let asciiCode = strng.charCodeAt(i);
                process.stdout.write(asciiCode + ' ');
            }
            reversedStr = strng.split('').reverse().join('');
            console.log('\nThe reversed string is: ' + reversedStr);
        } else if (strng.length % 3 === 0) {
            reversedStr = strng.split('').reverse().join('');
            console.log('The reversed string is: ' + reversedStr);
        } else if (strng.length % 5 === 0) {
            console.log('The ASCII codes of your string are:');
            for (let i = 0; i < strng.length; i++) {
                let asciiCode = strng.charCodeAt(i);
                process.stdout.write(asciiCode + ' ');
            }
            console.log(); // For newline after ASCII codes
        } else {
            console.log('String which does not meet any conditions: ' + strng);
        }
    } catch (e) {
        console.log('The code failed.');
    }
}

main();
