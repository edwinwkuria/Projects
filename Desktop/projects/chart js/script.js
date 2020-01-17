/*This is graph/........*/
var numberOfVotes = new Array(50, 70, 60, 30, 57, 73, 99);
var numberOfCountries = new Array(20, 40, 35, 20, 14, 52, 43);
var ctx = document.getElementById('myChart');
var myChart = new Chart(ctx, {
    type: 'bar',
    data: {
        labels: ['green', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange', 'Red'],
        datasets: [{
            label: '# of Votes',
			data: numberOfVotes,
			backgroundColor: 'rgba(254, 99, 132, 0.2)'},{
			label: '# of counties',
			data: numberOfCountries,
			type: 'line',
            backgroundColor: [
                /*'rgba(254, 99, 132, 0.2)',*/
                'rgba(54, 162, 235, 0.2)',
                'rgba(255, 206, 86, 0.2)',
                'rgba(75, 192, 192, 0.2)',
                'rgba(153, 102, 255, 0.2)',
                'rgba(255, 159, 64, 0.2)'
            ],
            borderColor: [
                'rgba(255, 99, 132, 1)',
                'rgba(54, 162, 235, 1)',
                'rgba(255, 206, 86, 1)',
                'rgba(75, 192, 192, 1)',
                'rgba(153, 102, 255, 1)',
                'rgba(255, 159, 64, 1)'
            ],
            borderWidth: 1, 
			barThickness: 10
        }]
    },
    options: {
		animation: {
            duration: 1000 // general animation time
        },
		title: {
            display: true,
            text: 'Custom Chart Title'
        },
        scales: {
            yAxes: [{
				stacked: true ,
                ticks: {
                    beginAtZero: true
                }
            }]
        }
    }
});


/* .......................Line graph Options ..............*/
var ctx = document.getElementById('lineChart');
var lineChart = new Chart (ctx, {
	type: 'line',
	data: {
	labels: ['2000','2005','2010','2015','2020'],
	datasets:[{
		label: 'Scholar numbers',
		data: [ 5, 145, 1567, 3876, 5768, 7345]
	}]
	}
});
	





























