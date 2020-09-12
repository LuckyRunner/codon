$(document).on("click", "a[name='box_nuc_cop_syn']", function () {

    $("#nuc_cop_syn_box").remove();
    $("a[name='hide_box_nuc_cop_syn']").html("<span class=\"fa fa-plus\"></span>");
    $("a[name='hide_box_nuc_cop_syn']").attr("name","box_nuc_cop_syn");
    $(this).html("<span class=\"fa fa-minus\"></span>");
    $(this).attr("name","hide_box_nuc_cop_syn");

    var l = $(this).parent().parent().children().length;
    var a = '<tr id="nuc_cop_syn_box">' + '<td colspan="'+l+'"><div id="syn_box_bar" style="height: 400px"></div></td>'+'</tr>';
    $(this).parent().parent().after(a);

    $.ajax({
        url: '/compodynamics/synnuccop/sunopic?term='+ $(this).data("synnuccop"),
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

$(document).on("click", "a[name='hide_box_nuc_cop_syn']", function () {
    $("#nuc_cop_syn_box").remove();
    $(this).html("<span class=\"fa fa-plus\"></span>");
    $(this).attr("name","box_nuc_cop_syn");
});








