
fetch('/libros/genero') // URL del endpoint
.then(res => res.json())
.then(data => {
    const labels = Object.keys(data);     // Ej: ['Historia', 'Derecho', ...]
    const values = Object.values(data);   // Ej: [5, 9, 4, 7, 3]

    const ctx = document.getElementById('barrasHorizontales').getContext('2d');
    new Chart(ctx, {
    type: 'bar',
    data: {
        labels: labels,
        datasets: [{
        label: 'Cantidad de libros por género',
        data: values,
        backgroundColor: 'rgb(161, 161, 161)',
        // borderColor: 'rgba(54, 162, 235, 1)',
        borderWidth: 1
        }]
    },
    options: {
        indexAxis: 'y',
        scales: {
        y: {
            ticks: {
            color: 'rgb(161, 161, 161)', // ← aquí cambias el color del texto del eje Y (etiquetas)
            font: {
                // size: 14,
                // weight: 'bold'
            }
            }
        },
        x: { 
            beginAtZero: true,
            ticks: {
            color: 'rgb(161, 161, 161)', // ← aquí cambias el color del texto del eje Y (etiquetas)
            font: {
                // size: 14,
                // weight: 'bold'
            }
            }
        }
        },
        plugins: {
        legend: { display: false },
        title: { display: true, text: 'Libros por género', color: 'rgb(161, 161, 161)' }
        }
    }
    });
});