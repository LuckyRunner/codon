$(function () {
    var gene = window.location.href.split("?")[1];
    $.ajax({
        url: '/compodynamics/amino/genepage?'+ gene,
        type: 'GET',
        dataType: 'json',
        cache: false,
        success: succFunction //成功执行方法
    });

    function succFunction(data) {
        var fun_arry = data["aminoAcidsUsage"];
        var chart = Highcharts.chart('amino_gene_bar', {
            chart: {
                type: 'column'
            },
            title: {
                text: 'Amino-acids-usage'
            },
            xAxis: {
                categories : ['Ala','Cys','Asp','Glu','Phe','Gly','His','Ile','Lys','Leu',
                    'Met','Asn','Pro','Gln','Arg','Ser','Thr','Val','Trp','Tyr'],
                labels: {
                    rotation: -45  // 设置轴标签旋转角度
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
});
$(document).on("click", "a[name='view_amino_gene']", function () {
    $("#amino_gene_view").remove();
    $("a[name='hide_amino_gene']").html("<span class=\"fa fa-plus\"></span>");
    $("a[name='hide_amino_gene']").attr("name","view_amino_gene");
    $(this).html("<span class=\"fa fa-minus\"></span>");
    $(this).attr("name","hide_amino_gene");

    var l = $(this).parent().parent().children().length;
    var a = '<tr id="amino_gene_view">' + '<td colspan="'+l+'"><div id="amino_gene_bar" style="width: 100%;height: 400px"></div></td>'+'</tr>';

    $(this).parent().parent().after(a);

    var chart = Highcharts.chart('amino_gene_bar', {
        chart: {
            type: 'column'
        },
        title: {
            text: 'Amino-Acids-Usage'
        },
        xAxis: {
            type: 'category',
            labels: {
                rotation: -45  // 设置轴标签旋转角度
            }
        },
        yAxis: {
            min: 0,
            title: {
                text: 'Percentage (100%)'
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
                ['Ala', $(this).data("ala")],
                ['Cys', $(this).data("cys")],
                ['Asp', $(this).data("asp")],
                ['Glu', $(this).data("glu")],
                ['Phe', $(this).data("phe")],
                ['Gly', $(this).data("gly")],
                ['His', $(this).data("his")],
                ['Ile', $(this).data("ile")],
                ['Lys', $(this).data("lys")],
                ['Leu', $(this).data("leu")],
                ['Met', $(this).data("met")],
                ['Asn', $(this).data("asn")],
                ['Pro', $(this).data("pro")],
                ['Gln', $(this).data("gln")],
                ['Arg', $(this).data("arg")],
                ['Ser', $(this).data("ser")],
                ['Thr', $(this).data("thr")],
                ['Val', $(this).data("val")],
                ['Trp', $(this).data("trp")],
                ['Tyr', $(this).data("tyr")]
            ],
            dataLabels: {
                enabled: true,
                rotation: -90,
                color: '#FFFFFF',
                align: 'right',
                format: '{point.y:.3f}', // :.1f 为保留 1 位小数
                y: 10
            }
        }]
    });

});

$(document).on("click", "a[name='hide_amino_gene']", function () {
    $("#amino_gene_view").remove();
    $(this).html("<span class=\"fa fa-plus\"></span>");
    $(this).attr("name","view_amino_gene");
});
