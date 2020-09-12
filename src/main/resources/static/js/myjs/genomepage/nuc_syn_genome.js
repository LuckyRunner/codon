//lncRNA的功能数据请求
$(function () {
    var transid = window.location.href.split("=")[1];
    $.ajax({
        url: '/compodynamics/synnuccop/genomepage?term=' + transid,
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
        var fun_arry = data["nucleotideCopSynoG"].slice(0,1);;
        $('#synnuccomG_table').DataTable({
            searching: false,
            paging: false,
            info: false,
            ordering: false,
            scrollX: false,
            AutoWidth: true,
            data: fun_arry,
            columns: [
                {"data": "t3s",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "c3s",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "a3s",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "g3s",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "gc3s",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }}
            ]
        });
    }

    $.ajax({
        url: '/compodynamics/synnuccop/sunopic?term='+transid,
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
        var syn_arry = data["nucleotideSynoPics"];

        var chart = Highcharts.chart('syn_box_bar', {
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
                categories : ['T3s','C3s','A3s','G3s','GC3s'],
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
                    [syn_arry[0].trueminT3s , syn_arry[0].x25qT3s , syn_arry[0].x50qT3s , syn_arry[0].x75qT3s , syn_arry[0].truemaxT3s ],
                    [syn_arry[0].trueminC3s , syn_arry[0].x25qC3s , syn_arry[0].x50qC3s , syn_arry[0].x75qC3s , syn_arry[0].truemaxC3s ],
                    [syn_arry[0].trueminA3s , syn_arry[0].x25qA3s , syn_arry[0].x50qA3s , syn_arry[0].x75qA3s , syn_arry[0].truemaxA3s ],
                    [syn_arry[0].trueminG3s , syn_arry[0].x25qG3s , syn_arry[0].x50qG3s , syn_arry[0].x75qG3s , syn_arry[0].truemaxG3s ],
                    [syn_arry[0].trueminGc3s, syn_arry[0].x25qGc3s, syn_arry[0].x50qGc3s, syn_arry[0].x75qGc3s, syn_arry[0].truemaxGc3s]
                ],
                tooltip: {
                    headerFormat: '<em> Lable： {point.key}</em><br/>'
                }
            }]
        });
    }

});
