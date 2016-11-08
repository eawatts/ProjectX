
	//piechart
	$(document).ready(function(){
		
		var products = [];
		var axis = ['Name','Stock'];
		
		products.push(axis);
		
		$('#hidden-content .row').each(function(){
			var prodname = $(this).find('.name').text().trim();
			var prodstock = parseInt($(this).find('.stock').text().trim());
			var newProduct = [prodname,prodstock];
			products.push(newProduct);
		});
		
		products.forEach(function(x){
			console.log(JSON.stringify(x));
		});
		
		google.charts.load('current', {'packages':['corechart']});
	    google.charts.setOnLoadCallback(drawChart);
	    
	  	function drawChart() {
			var data = google.visualization.arrayToDataTable(products);
			var options = {
	          title: 'Stock Levels' , backgroundColor: '#f9fbf2'
	         
			};
			
			var chart = new google.visualization.PieChart(document.getElementById('piechart'));
			chart.draw(data, options);
		
			
        }
	  	
	  //barchart
	    var products2 = []
		var axis2 = ['Name','Stock', 'LowLimit'];	
		products2.push(axis2);
		
		$('#hidden-content2 .row').each(function(){
			var prodname2 = $(this).find('.name').text().trim();
			var prodstock2 = parseInt($(this).find('.cstock').text().trim());
			var prodlowlimit2 = parseInt($(this).find('.lowLimit').text().trim());
			var newProduct2 = [prodname2,prodstock2,prodlowlimit2];
			products2.push(newProduct2);
		});
		
		products2.forEach(function(y){
			console.log(JSON.stringify(y));
		});
		
		google.charts.load('current', {packages: ['corechart', 'bar']});
		google.charts.setOnLoadCallback(drawMultSeries);
		
		function drawMultSeries() {
		    var data2 = google.visualization.arrayToDataTable(products2);
			var options2 = {
		        title: 'Top 25 Low Stock Products Against their low limits',
		        chartArea: {width: '50%'},
		        hAxis: {title: 'Stock Level',minValue: 0},
		        vAxis: {title: 'Product'}
		      };
			
			var chart2 = new google.visualization.BarChart(document.getElementById('chart_div'));
		    chart2.draw(data2, options2);
		} 	
	 	
		//Area Chart
		var products3 = []
		var axis3 = ['Name','Stock', 'LowLimit'];	
		
		products3.push(axis3);
		
		$('#hidden-content3 .row').each(function(){
			var prodname3 = $(this).find('.name').text().trim();
			var prodstock3 = parseInt($(this).find('.cstock').text().trim());
			var prodlowlimit3 = parseInt($(this).find('.lowLimit').text().trim());
			var newProduct3 = [prodname3,prodstock3,prodlowlimit3];
			products3.push(newProduct3);	
		});
		
		products3.forEach(function(y){
			console.log(JSON.stringify(y));
		});
		
	    google.charts.load('current', {'packages':['corechart']});
	    google.charts.setOnLoadCallback(drawChart1);
	     
	    function drawChart1() {
            var data3 = google.visualization.arrayToDataTable(products3);
	        var options3 = {
		                 title: 'Stock Against Low Limit',
		                 hAxis: {title: 'Product',  titleTextStyle: {color: '#333'}},
		                 vAxis: {minValue: 0}
		               };
		    var chart3 = new google.visualization.AreaChart(document.getElementById('chart_div1'));
		    chart3.draw(data3, options3);
        }
	    
		//Bubble
    	var products4 = []
	 	var axis4 = ['Name','Stock', 'Price', 'LowLimit'];	
	 
		products4.push(axis4);
		
	 	$('#hidden-content4 .row').each(function(){
	 		var prodname4 = $(this).find('.name').text().trim();
	 		var prodstock4 = parseInt($(this).find('.cstock').text().trim());
	 		var prodprice4 = parseInt($(this).find('.price').text().trim());
	 		var prodlowlimit4 = parseInt($(this).find('.lowLimit').text().trim());
	 		var newProduct4 = [prodname4,prodstock4, prodprice4, prodlowlimit4];
	 		products4.push(newProduct4);	
	 	});
	 	
	 	products4.forEach(function(y){
	 		console.log(JSON.stringify(y));
	 	});
	 	
		google.charts.load('current', {'packages':['corechart']});
		google.charts.setOnLoadCallback(drawSeriesChart);
		     
	    function drawSeriesChart() {
	     	var data4 = google.visualization.arrayToDataTable(products4);
	     	var options4 = {
	     	        title: 'Correlation between Stock and Price',
	     	        hAxis: {title: 'Stcok',minValue: 0,maxValue:350},
	     	        vAxis: {title: 'Price',minValue: 0,maxValue:25},
	     	        bubble: {textStyle: {fontSize: 11}}
	     	      };
		    var chart4 = new google.visualization.BubbleChart(document.getElementById('series_chart_div'));
		    chart4.draw(data4, options4);
	    }

	});