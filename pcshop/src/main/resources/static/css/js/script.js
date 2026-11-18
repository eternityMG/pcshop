// Функция для проверки, виден ли элемент
function isElementInViewport(el) {
    const rect = el.getBoundingClientRect();
    return (
        rect.top <= (window.innerHeight || document.documentElement.clientHeight) * 0.8 &&
        rect.bottom >= 0
    );
}

// Функция для проверки направления скролла
let lastScrollTop = 0;
let scrollDirection = 'down';

// Функция обработки скролла
function handleScroll() {
    const reveals = document.querySelectorAll('.reveal');
    const currentScroll = window.pageYOffset || document.documentElement.scrollTop;

    if (currentScroll > lastScrollTop) {
        scrollDirection = 'down';
    } else {
        scrollDirection = 'up';
    }
    lastScrollTop = currentScroll <= 0 ? 0 : currentScroll;

    reveals.forEach(reveal => {
        if (isElementInViewport(reveal)) {
            reveal.classList.add('active');
        } else {
            reveal.classList.remove('active');
        }
    });
}

// Добавляем классы reveal
document.addEventListener('DOMContentLoaded', function() {
    const hero = document.querySelector('.hero');
    if (hero) hero.classList.add('reveal', 'from-bottom');

    document.querySelectorAll('h1, h2').forEach(el => {
        el.classList.add('reveal', 'from-left');
    });

    document.querySelectorAll('.product-card').forEach((el, index) => {
        el.classList.add('reveal', 'from-bottom');
        el.classList.add(`delay-${(index % 6) + 1}`);
    });

    document.querySelectorAll('.faq-item').forEach((el, index) => {
        el.classList.add('reveal', 'from-right');
        el.classList.add(`delay-${(index % 6) + 1}`);
    });

    document.querySelectorAll('.feature').forEach((el, index) => {
        el.classList.add('reveal', 'from-bottom');
        el.classList.add(`delay-${(index % 4) + 1}`);
    });

    const filters = document.querySelector('.filters');
    if (filters) filters.classList.add('reveal', 'from-top');

    const searchFaq = document.querySelector('.search-faq');
    if (searchFaq) searchFaq.classList.add('reveal', 'from-left');

    const contactSection = document.querySelector('.contact-section');
    if (contactSection) contactSection.classList.add('reveal', 'from-bottom');

    document.querySelectorAll('.contact-chip').forEach((el, index) => {
        el.classList.add('reveal', 'from-right');
        el.classList.add(`delay-${(index % 3) + 1}`);
    });

    handleScroll();
});

window.addEventListener('scroll', handleScroll);
window.addEventListener('resize', handleScroll);