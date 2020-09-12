//lncRNA的功能数据请求
$(function () {
    var transid = window.location.href.split("=")[1];
    $.ajax({
        url: '/compodynamics/codpot/genomepage?term=' + transid,
        type: 'GET',
        dataType: 'json',
        cache: false,
        error: erryFunction,  //错误执行方法
        success: successFunction //成功执行方法
    });

    function erryFunction() {
        alert("error");
    }

    function successFunction(data) {
        var fun_arry = data["codingPotentialG"].slice(0,1);;
        $('#codingProG_table').DataTable({
            searching: false,
            paging: false,
            info: false,
            ordering: false,
            data: fun_arry,
            columns: [
                {"data": "fickettScore",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "cpc2CodingProbability",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "cpc2Label",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "lgcCodingProbability",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "lgcLabel",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "codingInBoth",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }}
            ]
        });
    }

    $.ajax({
        url: '/compodynamics/codpot/codingpic?term='+ transid,
        type: 'GET',
        dataType: 'json',
        cache: false,
        error: erryFunction,
        success: succFunction
    });
    function erryFunction() {
        alert("error");
    }
    function succFunction(data) {
        var syn_arry = data["codingPics"];

        var chart = Highcharts.chart('coding_box_bar', {
            chart: {
                type: 'boxplot'
            },
            title: {
                text: 'Box-Plot'
            },
            legend: {
                enabled: false
            },
            xAxis: {
                categories : ['FickettScore','Cpc2CodingProbability','LgcCodingProbability'],
                title: {
                    text: ''
                }
            },
            yAxis: {
                title: {
                    text: 'Frequency'
                }
            },
            tooltip: {
                pointFormat: '<span style="color:{point.color}">\u25CF</span> <b> {series.name}</b><br/>' +
                    'max: {point.high:.3f}<br/>' +
                    'Q2\t: {point.q3:.3f}<br/>' +
                    'median: {point.median:.3f}<br/>' +
                    'Q1\t: {point.q1:.3f}<br/>' +
                    'min: {point.low:.3f}<br/>'
            },
            series: [{
                name: 'Frequency',
                data: [
                    [syn_arry[0].trueminFickettScore , syn_arry[0].q25FickettScore , syn_arry[0].q50FickettScore , syn_arry[0].q75FickettScore , syn_arry[0].maxFickettScore ],
                    [syn_arry[0].trueminCpc2CodingProbability , syn_arry[0].q25Cpc2CodingProbability , syn_arry[0].q50Cpc2CodingProbability , syn_arry[0].q75Cpc2CodingProbability , syn_arry[0].maxCpc2CodingProbability ],
                    [syn_arry[0].trueminLgcCodingProbability , syn_arry[0].q25LgcCodingProbability , syn_arry[0].q50LgcCodingProbability , syn_arry[0].q75LgcCodingProbability , syn_arry[0].maxLgcCodingProbability ]
                ],
                tooltip: {
                    headerFormat: '<em> Lable： {point.key}</em><br/>'
                }
            }]
        });
    }



});
