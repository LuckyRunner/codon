//lncRNA的功能数据请求
$(function () {
    var transid = window.location.href.split("=")[1];
    $.ajax({
        url: '/compodynamics/phase/genomepage?term=' + transid,
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
        var fun_arry = data["phaseSeperationGS"].slice(0,1);;
        $('#phaseG_table').DataTable({
            searching: false,
            paging: false,
            info: false,
            ordering: false,
            scrollX: false,
            AutoWidth: false,
            data: fun_arry,
            columns: [
                {"data": "llr",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "coreScore"},
                {"data": "papaProp",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "papaFi",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "aaLength"},
                {"data": "disorderPercent",
                    render: function(value,row,index){
                        return value.toPrecision(3);
                    }},
                {"data": "disorder30aaNum"},
                {"data": "disorder50aaNum"},
                {"data": "disorderSegmentNum"},
                {"data": "psCore"}
            ]
        });
    }
    $.ajax({
        url: '/compodynamics/phase/phasepic?term='+ transid,
        type: 'GET',
        dataType: 'json',
        cache: false,
        error: erryFunction,
        success: succFunction
    });
    function succFunction(data) {
        var syn_arry = data["phasePics"];

        var chart = Highcharts.chart('phase_box_bar', {
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
                categories : ['LLR','Core-Score','PAPA-Prop','PAPA-Fi','AA-Length','DisorderPercent','Disorder30aaNum',
                    'Disorder50aaNum','DisorderSegmentNum','PS-Core'],
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
                    'mean: {point.median:.3f}<br/>' +
                    'Q1\t: {point.q1:.3f}<br/>' +
                    'min: {point.low:.3f}<br/>'
            },
            series: [{
                name: 'Frequency',
                data: [
                    [syn_arry[0].llrTruemin,                syn_arry[0].llrQ25,                 syn_arry[0].llrQ50,                 syn_arry[0].llrQ75,                 syn_arry[0].llrTruemax,                ],
                    [syn_arry[0].coreScoreTruemin,          syn_arry[0].coreScoreQ25,           syn_arry[0].coreScoreQ50,           syn_arry[0].coreScoreQ75,           syn_arry[0].coreScoreTruemax,          ],
                    [syn_arry[0].papaPropTruemin,           syn_arry[0].papaPropQ25,            syn_arry[0].papaPropQ50,            syn_arry[0].papaPropQ75,            syn_arry[0].papaPropTruemax,           ],
                    [syn_arry[0].papaFiTruemin,             syn_arry[0].papaFiQ25,              syn_arry[0].papaFiQ50,              syn_arry[0].papaFiQ75,              syn_arry[0].papaFiTruemax,             ],
                    [syn_arry[0].aaLengthTruemin,           syn_arry[0].aaLengthQ25,            syn_arry[0].aaLengthQ50,            syn_arry[0].aaLengthQ75,            syn_arry[0].aaLengthTruemax,           ],
                    [syn_arry[0].disorderPercentTruemin,    syn_arry[0].disorderPercentQ25,     syn_arry[0].disorderPercentQ50,     syn_arry[0].disorderPercentQ75,     syn_arry[0].disorderPercentTruemax,    ],
                    [syn_arry[0].disorder30aaNumTruemin,    syn_arry[0].disorder30aaNumQ25,     syn_arry[0].disorder30aaNumQ50,     syn_arry[0].disorder30aaNumQ75,     syn_arry[0].disorder30aaNumTruemax,    ],
                    [syn_arry[0].disorder50aaNumTruemin,    syn_arry[0].disorder50aaNumQ25,     syn_arry[0].disorder50aaNumQ50,     syn_arry[0].disorder50aaNumQ75,     syn_arry[0].disorder50aaNumTruemax,    ],
                    [syn_arry[0].disorderSegmentNumTruemin, syn_arry[0].disorderSegmentNumQ25,  syn_arry[0].disorderSegmentNumQ50,  syn_arry[0].disorderSegmentNumQ75,  syn_arry[0].disorderSegmentNumTruemax, ],
                    [syn_arry[0].psCoreTruemin,             syn_arry[0].psCoreQ25,              syn_arry[0].psCoreQ50,              syn_arry[0].psCoreQ75,              syn_arry[0].psCoreTruemax,             ]
                ],
                tooltip: {
                    headerFormat: '<em> Lable： {point.key}</em><br/>'
                }
            }]
        });
    }



});
