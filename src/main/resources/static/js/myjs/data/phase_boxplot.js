$(document).on("click", "a[name='box_phase']", function () {

    $("#phase_box").remove();
    $("a[name='hide_box_phase']").html("<span class=\"fa fa-plus\"></span>");
    $("a[name='hide_box_phase']").attr("name","box_phase");
    $(this).html("<span class=\"fa fa-minus\"></span>");
    $(this).attr("name","hide_box_phase");

    var l = $(this).parent().parent().children().length;
    var a = '<tr id="phase_box">' + '<td colspan="'+l+'"><div id="phase_box_bar" style="height: 400px"></div></td>'+'</tr>';
    $(this).parent().parent().after(a);

    $.ajax({
        url: '/compodynamics/phase/phasepic?term='+ $(this).data("phasepicid"),
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
        var fun_arry = data["phasePics"];

        var chart = Highcharts.chart('phase_box_bar', {
            chart: {
                type: 'boxplot'
            },
            title: {
                text: 'Box Plot'
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
                    'median: {point.median:.3f}<br/>' +
                    'Q1\t: {point.q1:.3f}<br/>' +
                    'min: {point.low:.3f}<br/>'
            },
            series: [{
                name: 'Frequency',
                data: [
                    [fun_arry[0].llrTruemin,                fun_arry[0].llrQ25,                 fun_arry[0].llrQ50,                 fun_arry[0].llrQ75,                 fun_arry[0].llrTruemax,                ],
                    [fun_arry[0].coreScoreTruemin,          fun_arry[0].coreScoreQ25,           fun_arry[0].coreScoreQ50,           fun_arry[0].coreScoreQ75,           fun_arry[0].coreScoreTruemax,          ],
                    [fun_arry[0].papaPropTruemin,           fun_arry[0].papaPropQ25,            fun_arry[0].papaPropQ50,            fun_arry[0].papaPropQ75,            fun_arry[0].papaPropTruemax,           ],
                    [fun_arry[0].papaFiTruemin,             fun_arry[0].papaFiQ25,              fun_arry[0].papaFiQ50,              fun_arry[0].papaFiQ75,              fun_arry[0].papaFiTruemax,             ],
                    [fun_arry[0].aaLengthTruemin,           fun_arry[0].aaLengthQ25,            fun_arry[0].aaLengthQ50,            fun_arry[0].aaLengthQ75,            fun_arry[0].aaLengthTruemax,           ],
                    [fun_arry[0].disorderPercentTruemin,    fun_arry[0].disorderPercentQ25,     fun_arry[0].disorderPercentQ50,     fun_arry[0].disorderPercentQ75,     fun_arry[0].disorderPercentTruemax,    ],
                    [fun_arry[0].disorder30aaNumTruemin,    fun_arry[0].disorder30aaNumQ25,     fun_arry[0].disorder30aaNumQ50,     fun_arry[0].disorder30aaNumQ75,     fun_arry[0].disorder30aaNumTruemax,    ],
                    [fun_arry[0].disorder50aaNumTruemin,    fun_arry[0].disorder50aaNumQ25,     fun_arry[0].disorder50aaNumQ50,     fun_arry[0].disorder50aaNumQ75,     fun_arry[0].disorder50aaNumTruemax,    ],
                    [fun_arry[0].disorderSegmentNumTruemin, fun_arry[0].disorderSegmentNumQ25,  fun_arry[0].disorderSegmentNumQ50,  fun_arry[0].disorderSegmentNumQ75,  fun_arry[0].disorderSegmentNumTruemax, ],
                    [fun_arry[0].psCoreTruemin,             fun_arry[0].psCoreQ25,              fun_arry[0].psCoreQ50,              fun_arry[0].psCoreQ75,              fun_arry[0].psCoreTruemax,             ]
                ],
                tooltip: {
                    headerFormat: '<em>Amino-Acid： {point.key}</em><br/>'
                }
            }]
        });
    }
});

$(document).on("click", "a[name='hide_box_phase']", function () {
    $("#phase_box").remove();
    $(this).html("<span class=\"fa fa-plus\"></span>");
    $(this).attr("name","box_phase");
});








