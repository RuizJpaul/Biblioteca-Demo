const ctx = document.getElementById('barrasHorizontales').getContext('2d');
const barrasHorizontales = new Chart(ctx, {
    type: 'bar',
    data: {
    labels: ['Historia', 'Derecho', 'Medicina', 'Ingenieria', 'Filosfia'],
    datasets: [{
        label: '',
        data: [5, 9, 4, 7, 3],
        backgroundColor: 'rgba(54, 162, 235, 0.6)',
        borderColor: 'rgba(54, 162, 235, 1)',
        borderWidth: 1
    }]
    },
    options: {
    indexAxis: 'y', // ← esto convierte el gráfico en horizontal
    scales: {
        x: {
        beginAtZero: true
        }
    },
    plugins: {
        legend: {
        display: true
        },
        title: {
        display: true,
        text: 'Categorias'
        }
    }
    }
});

const ctx2 = document.getElementById('torta').getContext('2d');
const miTorta = new Chart(ctx2, {
    type: 'pie',
    data: {
    labels: ['La sangre manda', 'Jorge Luis Borges: Una invitacion a su lectura', 'Tradiciones peruana', 'Paco yunque'],
    datasets: [{
        label: 'Libros',
        data: [12, 19, 3, 5],
        backgroundColor: [
        'rgba(255, 99, 132, 0.6)',
        'rgba(54, 162, 235, 0.6)',
        'rgba(255, 206, 86, 0.6)',
        'rgba(75, 192, 192, 0.6)'
        ],
        borderColor: [
        'rgba(255, 255, 255, 1)'
        ],
        borderWidth: 2
    }]
    },
    options: {
    responsive: true,
    plugins: {
        legend: {
        position: 'bottom',
        },
        title: {
        display: true,
        text: 'Libros mas leidos'
        }
    }
    }
});