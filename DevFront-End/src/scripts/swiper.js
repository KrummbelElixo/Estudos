const swiper = new Swiper('.swiper', {
    direction: 'horizontal',
    loop: true,
    effect: 'cards',

    pagination: {
        el: '.swiper-pagination',
    },

    navigation: {
        nextEl: '.swiper-button-next',
        prevEl: '.swiper-button-prev'
    },

    autoplay: {
        delay: 4500,
    },
});