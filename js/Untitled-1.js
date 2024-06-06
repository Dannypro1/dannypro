//javascript code for image gallery
document.querySelectorAll('.gallery-item').forEach(item => {
    item.addEventListener('mouseover', () => {
        console.log(`Hovered over: ${item.querySelector('h2').innerText}`);
    });
});