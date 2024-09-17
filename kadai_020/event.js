const Btn = document.getElementById('btn');
const showText = document.getElementById('text');

Btn.addEventListener('click', () => {
    showText.textContent = 'ボタンをクリックしました';
});