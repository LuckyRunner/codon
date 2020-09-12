//lncRNA的功能数据请求
$(function () {
    var transid = window.location.href.split("=")[1];
    $.ajax({
        url: '/compodynamics/amino/genomepage?term='+ transid,
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
        var fun_arry = data["aminoAcidsUsageG"];
        var chart = Highcharts.chart('amino_genome_bar', {
            chart: {
                type: 'column'
            },
            title: {
                text: 'Amino-acids-usage'
            },
            xAxis: {
                categories : ['Ala','Cys','Asp','Glu','Phe','Gly','His','Ile','Lys','Leu',
                    'Met','Asn','Pro','Gln','Arg','Ser','Thr','Val','Trp','Tyr'],
                title: {
                    text: ''
                }
            },
            yAxis: {
                min: 0,
                title: {
                    text: 'Frequency'
                }
            },
            legend: {
                enabled: false
            },
            tooltip: {
                pointFormat: 'Percentage: <b>{point.y:.3f}</b>'
            },
            series: [{
                name: 'Protein',
                data: [
                    {'color':'#94f2cd','y':fun_arry[0].observedAla},
                    {'color':'#74d1e5','y':fun_arry[0].observedCys},
                    {'color':'#9d89cb','y':fun_arry[0].observedAsp},
                    {'color':'#cbda99','y':fun_arry[0].observedGlu},
                    {'color':'#dfa6cf','y':fun_arry[0].observedPhe},
                    {'color':'#448b6e','y':fun_arry[0].observedGly},
                    {'color':'#868686','y':fun_arry[0].observedHis},
                    {'color':'#f2ca94','y':fun_arry[0].observedIle},
                    {'color':'#D28EFF','y':fun_arry[0].observedLys},
                    {'color':'#4c918e','y':fun_arry[0].observedLeu},
                    {'color':'#FFBB66','y':fun_arry[0].observedMet},
                    {'color':'#cbda99','y':fun_arry[0].observedAsn},
                    {'color':'#808a71','y':fun_arry[0].observedPro},
                    {'color':'#FFA488','y':fun_arry[0].observedGln},
                    {'color':'#FF8888','y':fun_arry[0].observedArg},
                    {'color':'#AD5A5A','y':fun_arry[0].observedSer},
                    {'color':'#AFAF61','y':fun_arry[0].observedThr},
                    {'color':'#00AAAA','y':fun_arry[0].observedVal},
                    {'color':'#5151A2','y':fun_arry[0].observedTrp},
                    {'color':'#009FCC','y':fun_arry[0].observedTyr}
                ],
                colorByPoint: true,
                dataLabels: {
                    enabled: true,
                    rotation: -90,
                    color: '#F0F0F0',
                    align: 'right',
                    format: '{point.y:.3f}', // :.1f 为保留 1 位小数
                    y: 10
                }
            }]
        });
    }

    $.ajax({
        url: '/compodynamics/amino/aminopic?term='+ transid,
        type: 'GET',
        dataType: 'json',
        cache: false,
        error: erryFunction,
        success: successFunction
    });
    function successFunction(data) {
        var fun_arry = data["aminoPics"];
        var chart = Highcharts.chart('amino_box_bar', {
            chart: {
                type: 'boxplot'
            },
            title: {
                text: 'Amino-Acids-Usage-BoxPlot'
            },
            legend: {
                enabled: false
            },
            xAxis: {
                categories : ['Ala','Cys','Asp','Glu','Phe','Gly','His','Ile','Lys','Leu',
                    'Met','Asn','Pro','Gln','Arg','Ser','Thr','Val','Trp','Tyr'],
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
                    [fun_arry[0].trueminObservedAla, fun_arry[0].q25ObservedAla, fun_arry[0].q50ObservedAla, fun_arry[0].q75ObservedAla, fun_arry[0].truemaxObservedAla],
                    [fun_arry[0].trueminObservedCys, fun_arry[0].q25ObservedCys, fun_arry[0].q50ObservedCys, fun_arry[0].q75ObservedCys, fun_arry[0].truemaxObservedCys],
                    [fun_arry[0].trueminObservedAsp, fun_arry[0].q25ObservedAsp, fun_arry[0].q50ObservedAsp, fun_arry[0].q75ObservedAsp, fun_arry[0].truemaxObservedAsp],
                    [fun_arry[0].trueminObservedGlu, fun_arry[0].q25ObservedGlu, fun_arry[0].q50ObservedGlu, fun_arry[0].q75ObservedGlu, fun_arry[0].truemaxObservedGlu],
                    [fun_arry[0].trueminObservedPhe, fun_arry[0].q25ObservedPhe, fun_arry[0].q50ObservedPhe, fun_arry[0].q75ObservedPhe, fun_arry[0].truemaxObservedPhe],
                    [fun_arry[0].trueminObservedGly, fun_arry[0].q25ObservedGly, fun_arry[0].q50ObservedGly, fun_arry[0].q75ObservedGly, fun_arry[0].truemaxObservedGly],
                    [fun_arry[0].trueminObservedHis, fun_arry[0].q25ObservedHis, fun_arry[0].q50ObservedHis, fun_arry[0].q75ObservedHis, fun_arry[0].truemaxObservedHis],
                    [fun_arry[0].trueminObservedIle, fun_arry[0].q25ObservedIle, fun_arry[0].q50ObservedIle, fun_arry[0].q75ObservedIle, fun_arry[0].truemaxObservedIle],
                    [fun_arry[0].trueminObservedLys, fun_arry[0].q25ObservedLys, fun_arry[0].q50ObservedLys, fun_arry[0].q75ObservedLys, fun_arry[0].truemaxObservedLys],
                    [fun_arry[0].trueminObservedLeu, fun_arry[0].q25ObservedLeu, fun_arry[0].q50ObservedLeu, fun_arry[0].q75ObservedLeu, fun_arry[0].truemaxObservedLeu],
                    [fun_arry[0].trueminObservedMet, fun_arry[0].q25ObservedMet, fun_arry[0].q50ObservedMet, fun_arry[0].q75ObservedMet, fun_arry[0].truemaxObservedMet],
                    [fun_arry[0].trueminObservedAsn, fun_arry[0].q25ObservedAsn, fun_arry[0].q50ObservedAsn, fun_arry[0].q75ObservedAsn, fun_arry[0].truemaxObservedAsn],
                    [fun_arry[0].trueminObservedPro, fun_arry[0].q25ObservedPro, fun_arry[0].q50ObservedPro, fun_arry[0].q75ObservedPro, fun_arry[0].truemaxObservedPro],
                    [fun_arry[0].trueminObservedGln, fun_arry[0].q25ObservedGln, fun_arry[0].q50ObservedGln, fun_arry[0].q75ObservedGln, fun_arry[0].truemaxObservedGln],
                    [fun_arry[0].trueminObservedArg, fun_arry[0].q25ObservedArg, fun_arry[0].q50ObservedArg, fun_arry[0].q75ObservedArg, fun_arry[0].truemaxObservedArg],
                    [fun_arry[0].trueminObservedSer, fun_arry[0].q25ObservedSer, fun_arry[0].q50ObservedSer, fun_arry[0].q75ObservedSer, fun_arry[0].truemaxObservedSer],
                    [fun_arry[0].trueminObservedThr, fun_arry[0].q25ObservedThr, fun_arry[0].q50ObservedThr, fun_arry[0].q75ObservedThr, fun_arry[0].truemaxObservedThr],
                    [fun_arry[0].trueminObservedVal, fun_arry[0].q25ObservedVal, fun_arry[0].q50ObservedVal, fun_arry[0].q75ObservedVal, fun_arry[0].truemaxObservedVal],
                    [fun_arry[0].trueminObservedTrp, fun_arry[0].q25ObservedTrp, fun_arry[0].q50ObservedTrp, fun_arry[0].q75ObservedTrp, fun_arry[0].truemaxObservedTrp],
                    [fun_arry[0].trueminObservedTyr, fun_arry[0].q25ObservedTyr, fun_arry[0].q50ObservedTyr, fun_arry[0].q75ObservedTyr, fun_arry[0].truemaxObservedTyr]
                ],
                tooltip: {
                    headerFormat: '<em>Amino-Acid： {point.key}</em><br/>'
                }
            }]
        });
    }





});
