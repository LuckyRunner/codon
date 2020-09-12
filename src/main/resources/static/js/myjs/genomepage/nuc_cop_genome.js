//lncRNA的功能数据请求
$(function () {
    var transid = window.location.href.split("=")[1];
    $.ajax({
        url: '/compodynamics/nucleotidecop/genomepage?term=' + transid,
        type: 'GET',
        dataType: 'json',
        cache: false,
        error: erryFunction,  //错误执行方法
        success: succFunction //成功执行方法
    });

    function erryFunction() {
        alert("error");
    }

    function succFunction(data) {
        var nucleotide_arry = data["nucleotideCopG"].slice(0,1);
        $('#nuccomG_table').DataTable({
            searching: false,
            paging: false,
            info: false,
            ordering: false,
            scrollX: false,
            AutoWidth: true,
            data: nucleotide_arry,
            columns: [
                {"data": "gc",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "ag",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "gc1",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "ag1",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "gc2",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "ag2",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "gc3",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "ag3",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }}
            ]
        });
    }

    $.ajax({
        url: '/compodynamics/nucleotidecop/nucleotidepic?term='+ transid,
        type: 'GET',
        dataType: 'json',
        cache: false,
        error: erryFunction,
        success: successFunction
    });
    function erryFunction() {
        alert("error");
    }
    function successFunction(data) {
        var fun_arry = data["nucleotidePics"];

        var chart = Highcharts.chart('nuc_box_bar', {
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
                categories : ['GC','AG','GC1','AG1','GC2','AG2','GC3','AG3'],
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
                    [fun_arry[0].trueminGc , fun_arry[0].q25Gc , fun_arry[0].q50Gc , fun_arry[0].q75Gc , fun_arry[0].truemaxGc ],
                    [fun_arry[0].trueminAg , fun_arry[0].q25Ag , fun_arry[0].q50Ag , fun_arry[0].q75Ag , fun_arry[0].truemaxAg ],
                    [fun_arry[0].trueminGc1, fun_arry[0].q25Gc1, fun_arry[0].q50Gc1, fun_arry[0].q75Gc1, fun_arry[0].truemaxGc1],
                    [fun_arry[0].trueminAg1, fun_arry[0].q25Ag1, fun_arry[0].q50Ag1, fun_arry[0].q75Ag1, fun_arry[0].truemaxAg1],
                    [fun_arry[0].trueminGc2, fun_arry[0].q25Gc2, fun_arry[0].q50Gc2, fun_arry[0].q75Gc2, fun_arry[0].truemaxGc2],
                    [fun_arry[0].trueminAg2, fun_arry[0].q25Ag2, fun_arry[0].q50Ag2, fun_arry[0].q75Ag2, fun_arry[0].truemaxAg2],
                    [fun_arry[0].trueminGc3, fun_arry[0].q25Gc3, fun_arry[0].q50Gc3, fun_arry[0].q75Gc3, fun_arry[0].truemaxGc3],
                    [fun_arry[0].trueminAg3, fun_arry[0].q25Ag3, fun_arry[0].q50Ag3, fun_arry[0].q75Ag3, fun_arry[0].truemaxAg3]
                ],
                tooltip: {
                    headerFormat: '<em> Lable： {point.key}</em><br/>'
                }
            }]
        });
    }
});
