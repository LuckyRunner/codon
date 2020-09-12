$(document).on("click", "a[name='box_nuc_cop']", function () {

    $("#nuc_cop_box").remove();
    $("a[name='hide_box_nuc_cop']").html("<span class=\"fa fa-plus\"></span>");
    $("a[name='hide_box_nuc_cop']").attr("name","box_nuc_cop");
    $(this).html("<span class=\"fa fa-minus\"></span>");
    $(this).attr("name","hide_box_nuc_cop");

    var l = $(this).parent().parent().children().length;
    var a = '<tr id="nuc_cop_box">' + '<td colspan="'+l+'"><div id="box_bar" style="height: 400px"></div></td>'+'</tr>';
    $(this).parent().parent().after(a);

    $.ajax({
        url: '/compodynamics/nucleotidecop/nucleotidepic?term='+ $(this).data("nuccop"),
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
        var fun_arry = data["nucleotidePics"];

        var chart = Highcharts.chart('box_bar', {
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

$(document).on("click", "a[name='hide_box_nuc_cop']", function () {
    $("#nuc_cop_box").remove();
    $(this).html("<span class=\"fa fa-plus\"></span>");
    $(this).attr("name","box_nuc_cop");
});








