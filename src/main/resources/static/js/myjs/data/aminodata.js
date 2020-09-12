$(document).on("click", "a[name='view_amino']", function () {

    $("#amino_view").remove();
    $("a[name='hide_amino']").html("<span class=\"fa fa-plus\"></span>");
    $("a[name='hide_amino']").attr("name","view_amino");
    $(this).html("<span class=\"fa fa-minus\"></span>");
    $(this).attr("name","hide_amino");

    var l = $(this).parent().parent().children().length;
    var a = '<tr id="amino_view">' + '<td colspan="'+l+'"><div id="exp_bar" style="height: 400px"></div></td>'+'</tr>';
    $(this).parent().parent().after(a);
    var chart = Highcharts.chart('exp_bar', {
        chart: {
            type: 'column'
        },
        title: {
            text: 'Amino-Acids-Usage-Histogram'
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
                {'color':'#94f2cd','y':$(this).data("ala")},
                {'color':'#74d1e5','y':$(this).data("cys")},
                {'color':'#9d89cb','y':$(this).data("asp")},
                {'color':'#cbda99','y':$(this).data("glu")},
                {'color':'#dfa6cf','y':$(this).data("phe")},
                {'color':'#448b6e','y':$(this).data("gly")},
                {'color':'#868686','y':$(this).data("his")},
                {'color':'#f2ca94','y':$(this).data("ile")},
                {'color':'#D28EFF','y':$(this).data("lys")},
                {'color':'#4c918e','y':$(this).data("leu")},
                {'color':'#FFBB66','y':$(this).data("met")},
                {'color':'#cbda99','y':$(this).data("asn")},
                {'color':'#808a71','y':$(this).data("pro")},
                {'color':'#FFA488','y':$(this).data("gln")},
                {'color':'#FF8888','y':$(this).data("arg")},
                {'color':'#AD5A5A','y':$(this).data("ser")},
                {'color':'#AFAF61','y':$(this).data("thr")},
                {'color':'#00AAAA','y':$(this).data("val")},
                {'color':'#5151A2','y':$(this).data("trp")},
                {'color':'#009FCC','y':$(this).data("tyr")}
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

});

$(document).on("click", "a[name='hide_amino']", function () {
    $("#amino_view").remove();
    $(this).html("<span class=\"fa fa-plus\"></span>");
    $(this).attr("name","view_amino");
});
