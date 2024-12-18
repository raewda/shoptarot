 let theme = false;

    const toggleTheme = () => {
        theme = !theme;
        document.getElementById("header").classList.toggle('header_dark');
    };

    document.getElementById('bubutton').addEventListener('click', toggleTheme);