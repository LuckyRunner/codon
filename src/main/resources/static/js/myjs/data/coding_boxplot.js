$(document).on("click", "a[name='box_coding']", function () {

    $("#nuc_coding").remove();
    $("a[name='hide_box_coding']").html("<span class=\"fa fa-plus\"></span>");
    $("a[name='hide_box_coding']").attr("name","box_coding");
    $(this).html("<span class=\"fa fa-minus\"></span>");
    $(this).attr("name","hide_box_coding");

    var l = $(this).parent().parent().children().length;
    var a = '<tr id="nuc_coding">' + '<td colspan="'+l+'"><div id="coding_box_bar" style="height: 400px"></div></td>'+'</tr>';
    $(this).parent().parent().after(a);

    $.ajax({
        url: '/compodynamics/codpot/codingpic?term='+ $(this).data("codingpicid"),
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

$(document).on("click", "a[name='hide_box_coding']", function () {
    $("#nuc_coding").remove();
    $(this).html("<span class=\"fa fa-plus\"></span>");
    $(this).attr("name","box_coding");
});








