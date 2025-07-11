fetch('/libros/genero')
  .then(res => res.json())
  .then(data => {
    const labels = Object.keys(data);
    const values = Object.values(data);
    const maxValue = Math.max(...values);

    // Escalamos el ancho dinámicamente según la cantidad máxima de libros
    const minCanvasWidth = Math.max(500, maxValue * 50); // 50px por libro (ajustable)
    const canvasContainer = document.getElementById('barrasHorizontales').parentElement;

    // Aseguramos que el contenedor tenga al menos ese ancho
    canvasContainer.style.minWidth = `${minCanvasWidth}px`;

    // Creamos el gráfico como antes
    const ctx = document.getElementById('barrasHorizontales').getContext('2d');
    new Chart(ctx, {
      type: 'bar',
      data: {
        labels: labels,
        datasets: [{
          label: 'Cantidad de libros por género',
          data: values,
          backgroundColor: 'rgb(161, 161, 161)',
          borderWidth: 1
        }]
      },
      options: {
        indexAxis: 'y',
        responsive: true,
        maintainAspectRatio: false,
        scales: {
          x: {
            beginAtZero: true,
            max: maxValue < 15 ? 15 : maxValue + 2, // límite dinámico
            ticks: {
              stepSize: 1,
              color: 'rgb(161, 161, 161)'
            }
          },
          y: {
            ticks: {
              color: 'rgb(161, 161, 161)'
            }
          }
        },
        plugins: {
          legend: { display: false },
          title: {
            display: true,
            text: 'Libros por género',
            color: 'rgb(161, 161, 161)'
          }
        }
      }
    });
  });