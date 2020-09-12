$(document).on("click", "a[name='box_bias']", function () {

    $("#bias_box").remove();
    $("a[name='hide_box_bias']").html("<span class=\"fa fa-plus\"></span>");
    $("a[name='hide_box_bias']").attr("name","box_bias");
    $(this).html("<span class=\"fa fa-minus\"></span>");
    $(this).attr("name","hide_box_bias");

    var l = $(this).parent().parent().children().length;
    var a = '<tr id="bias_box">' + '<td colspan="'+l+'"><div id="box_bar" style="height: 400px"></div></td>'+'</tr>';
    $(this).parent().parent().after(a);

    $.ajax({
        url: '/compodynamics/usagebias/biaspic?term='+ $(this).data("biaspicid"),
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
        var fun_arry = data["codonBiasPics"];

        var chart = Highcharts.chart('box_bar', {
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
                categories : [
                    'AAA','AAG','AAT','AAC','TAA','TAG','TGA','TAT','TAC','ATA','ATG','ATT','ATC',
                    'TTA','TTG','TTT','TTC','GAA','GAG','GAT','GAC','CAA','CAG','CAT','CAC',
                    'GTA','GTG','GTT','GTC','CTA','CTG','CTT','CTC','AGA','AGG','AGT','AGC',
                    'TGG','TGT','TGC','ACA','ACG','ACT','ACC','TCA','TCG','TCT','TCC',
                    'GGA','GGG','GGT','GGC','CGA','CGG','CGT','CGC','GCA','GCG','GCT','GCC',
                    'CCA','CCG','CCT','CCC'],
                labels: {
                    rotation: -45  // 设置轴标签旋转角度
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
                    [fun_arry[0].trueminRscuAaa, fun_arry[0].x25qRscuAaa, fun_arry[0].x50qRscuAaa, fun_arry[0].x75qRscuAaa, fun_arry[0].truemaxRscuAaa],
                    [fun_arry[0].trueminRscuAag, fun_arry[0].x25qRscuAag, fun_arry[0].x50qRscuAag, fun_arry[0].x75qRscuAag, fun_arry[0].truemaxRscuAag],
                    [fun_arry[0].trueminRscuAat, fun_arry[0].x25qRscuAat, fun_arry[0].x50qRscuAat, fun_arry[0].x75qRscuAat, fun_arry[0].truemaxRscuAat],
                    [fun_arry[0].trueminRscuAac, fun_arry[0].x25qRscuAac, fun_arry[0].x50qRscuAac, fun_arry[0].x75qRscuAac, fun_arry[0].truemaxRscuAac],
                    [fun_arry[0].trueminRscuTaa, fun_arry[0].x25qRscuTaa, fun_arry[0].x50qRscuTaa, fun_arry[0].x75qRscuTaa, fun_arry[0].truemaxRscuTaa],
                    [fun_arry[0].trueminRscuTag, fun_arry[0].x25qRscuTag, fun_arry[0].x50qRscuTag, fun_arry[0].x75qRscuTag, fun_arry[0].truemaxRscuTag],
                    [fun_arry[0].trueminRscuTga, fun_arry[0].x25qRscuTga, fun_arry[0].x50qRscuTga, fun_arry[0].x75qRscuTga, fun_arry[0].truemaxRscuTga],
                    [fun_arry[0].trueminRscuTat, fun_arry[0].x25qRscuTat, fun_arry[0].x50qRscuTat, fun_arry[0].x75qRscuTat, fun_arry[0].truemaxRscuTat],
                    [fun_arry[0].trueminRscuTac, fun_arry[0].x25qRscuTac, fun_arry[0].x50qRscuTac, fun_arry[0].x75qRscuTac, fun_arry[0].truemaxRscuTac],
                    [fun_arry[0].trueminRscuAtg, fun_arry[0].x25qRscuAtg, fun_arry[0].x50qRscuAtg, fun_arry[0].x75qRscuAtg, fun_arry[0].truemaxRscuAtg],
                    [fun_arry[0].trueminRscuAta, fun_arry[0].x25qRscuAta, fun_arry[0].x50qRscuAta, fun_arry[0].x75qRscuAta, fun_arry[0].truemaxRscuAta],
                    [fun_arry[0].trueminRscuAtt, fun_arry[0].x25qRscuAtt, fun_arry[0].x50qRscuAtt, fun_arry[0].x75qRscuAtt, fun_arry[0].truemaxRscuAtt],
                    [fun_arry[0].trueminRscuAtc, fun_arry[0].x25qRscuAtc, fun_arry[0].x50qRscuAtc, fun_arry[0].x75qRscuAtc, fun_arry[0].truemaxRscuAtc],
                    [fun_arry[0].trueminRscuTta, fun_arry[0].x25qRscuTta, fun_arry[0].x50qRscuTta, fun_arry[0].x75qRscuTta, fun_arry[0].truemaxRscuTta],
                    [fun_arry[0].trueminRscuTtg, fun_arry[0].x25qRscuTtg, fun_arry[0].x50qRscuTtg, fun_arry[0].x75qRscuTtg, fun_arry[0].truemaxRscuTtg],
                    [fun_arry[0].trueminRscuTtt, fun_arry[0].x25qRscuTtt, fun_arry[0].x50qRscuTtt, fun_arry[0].x75qRscuTtt, fun_arry[0].truemaxRscuTtt],
                    [fun_arry[0].trueminRscuTtc, fun_arry[0].x25qRscuTtc, fun_arry[0].x50qRscuTtc, fun_arry[0].x75qRscuTtc, fun_arry[0].truemaxRscuTtc],
                    [fun_arry[0].trueminRscuGaa, fun_arry[0].x25qRscuGaa, fun_arry[0].x50qRscuGaa, fun_arry[0].x75qRscuGaa, fun_arry[0].truemaxRscuGaa],
                    [fun_arry[0].trueminRscuGag, fun_arry[0].x25qRscuGag, fun_arry[0].x50qRscuGag, fun_arry[0].x75qRscuGag, fun_arry[0].truemaxRscuGag],
                    [fun_arry[0].trueminRscuGat, fun_arry[0].x25qRscuGat, fun_arry[0].x50qRscuGat, fun_arry[0].x75qRscuGat, fun_arry[0].truemaxRscuGat],
                    [fun_arry[0].trueminRscuGac, fun_arry[0].x25qRscuGac, fun_arry[0].x50qRscuGac, fun_arry[0].x75qRscuGac, fun_arry[0].truemaxRscuGac],
                    [fun_arry[0].trueminRscuCaa, fun_arry[0].x25qRscuCaa, fun_arry[0].x50qRscuCaa, fun_arry[0].x75qRscuCaa, fun_arry[0].truemaxRscuCaa],
                    [fun_arry[0].trueminRscuCag, fun_arry[0].x25qRscuCag, fun_arry[0].x50qRscuCag, fun_arry[0].x75qRscuCag, fun_arry[0].truemaxRscuCag],
                    [fun_arry[0].trueminRscuCat, fun_arry[0].x25qRscuCat, fun_arry[0].x50qRscuCat, fun_arry[0].x75qRscuCat, fun_arry[0].truemaxRscuCat],
                    [fun_arry[0].trueminRscuCac, fun_arry[0].x25qRscuCac, fun_arry[0].x50qRscuCac, fun_arry[0].x75qRscuCac, fun_arry[0].truemaxRscuCac],
                    [fun_arry[0].trueminRscuGta, fun_arry[0].x25qRscuGta, fun_arry[0].x50qRscuGta, fun_arry[0].x75qRscuGta, fun_arry[0].truemaxRscuGta],
                    [fun_arry[0].trueminRscuGtg, fun_arry[0].x25qRscuGtg, fun_arry[0].x50qRscuGtg, fun_arry[0].x75qRscuGtg, fun_arry[0].truemaxRscuGtg],
                    [fun_arry[0].trueminRscuGtt, fun_arry[0].x25qRscuGtt, fun_arry[0].x50qRscuGtt, fun_arry[0].x75qRscuGtt, fun_arry[0].truemaxRscuGtt],
                    [fun_arry[0].trueminRscuGtc, fun_arry[0].x25qRscuGtc, fun_arry[0].x50qRscuGtc, fun_arry[0].x75qRscuGtc, fun_arry[0].truemaxRscuGtc],
                    [fun_arry[0].trueminRscuCta, fun_arry[0].x25qRscuCta, fun_arry[0].x50qRscuCta, fun_arry[0].x75qRscuCta, fun_arry[0].truemaxRscuCta],
                    [fun_arry[0].trueminRscuCtg, fun_arry[0].x25qRscuCtg, fun_arry[0].x50qRscuCtg, fun_arry[0].x75qRscuCtg, fun_arry[0].truemaxRscuCtg],
                    [fun_arry[0].trueminRscuCtt, fun_arry[0].x25qRscuCtt, fun_arry[0].x50qRscuCtt, fun_arry[0].x75qRscuCtt, fun_arry[0].truemaxRscuCtt],
                    [fun_arry[0].trueminRscuCtc, fun_arry[0].x25qRscuCtc, fun_arry[0].x50qRscuCtc, fun_arry[0].x75qRscuCtc, fun_arry[0].truemaxRscuCtc],
                    [fun_arry[0].trueminRscuAga, fun_arry[0].x25qRscuAga, fun_arry[0].x50qRscuAga, fun_arry[0].x75qRscuAga, fun_arry[0].truemaxRscuAga],
                    [fun_arry[0].trueminRscuAgg, fun_arry[0].x25qRscuAgg, fun_arry[0].x50qRscuAgg, fun_arry[0].x75qRscuAgg, fun_arry[0].truemaxRscuAgg],
                    [fun_arry[0].trueminRscuAgt, fun_arry[0].x25qRscuAgt, fun_arry[0].x50qRscuAgt, fun_arry[0].x75qRscuAgt, fun_arry[0].truemaxRscuAgt],
                    [fun_arry[0].trueminRscuAgc, fun_arry[0].x25qRscuAgc, fun_arry[0].x50qRscuAgc, fun_arry[0].x75qRscuAgc, fun_arry[0].truemaxRscuAgc],
                    [fun_arry[0].trueminRscuTgg, fun_arry[0].x25qRscuTgg, fun_arry[0].x50qRscuTgg, fun_arry[0].x75qRscuTgg, fun_arry[0].truemaxRscuTgg],
                    [fun_arry[0].trueminRscuTgt, fun_arry[0].x25qRscuTgt, fun_arry[0].x50qRscuTgt, fun_arry[0].x75qRscuTgt, fun_arry[0].truemaxRscuTgt],
                    [fun_arry[0].trueminRscuTgc, fun_arry[0].x25qRscuTgc, fun_arry[0].x50qRscuTgc, fun_arry[0].x75qRscuTgc, fun_arry[0].truemaxRscuTgc],
                    [fun_arry[0].trueminRscuAca, fun_arry[0].x25qRscuAca, fun_arry[0].x50qRscuAca, fun_arry[0].x75qRscuAca, fun_arry[0].truemaxRscuAca],
                    [fun_arry[0].trueminRscuAcg, fun_arry[0].x25qRscuAcg, fun_arry[0].x50qRscuAcg, fun_arry[0].x75qRscuAcg, fun_arry[0].truemaxRscuAcg],
                    [fun_arry[0].trueminRscuAct, fun_arry[0].x25qRscuAct, fun_arry[0].x50qRscuAct, fun_arry[0].x75qRscuAct, fun_arry[0].truemaxRscuAct],
                    [fun_arry[0].trueminRscuAcc, fun_arry[0].x25qRscuAcc, fun_arry[0].x50qRscuAcc, fun_arry[0].x75qRscuAcc, fun_arry[0].truemaxRscuAcc],
                    [fun_arry[0].trueminRscuTca, fun_arry[0].x25qRscuTca, fun_arry[0].x50qRscuTca, fun_arry[0].x75qRscuTca, fun_arry[0].truemaxRscuTca],
                    [fun_arry[0].trueminRscuTcg, fun_arry[0].x25qRscuTcg, fun_arry[0].x50qRscuTcg, fun_arry[0].x75qRscuTcg, fun_arry[0].truemaxRscuTcg],
                    [fun_arry[0].trueminRscuTct, fun_arry[0].x25qRscuTct, fun_arry[0].x50qRscuTct, fun_arry[0].x75qRscuTct, fun_arry[0].truemaxRscuTct],
                    [fun_arry[0].trueminRscuTcc, fun_arry[0].x25qRscuTcc, fun_arry[0].x50qRscuTcc, fun_arry[0].x75qRscuTcc, fun_arry[0].truemaxRscuTcc],
                    [fun_arry[0].trueminRscuGga, fun_arry[0].x25qRscuGga, fun_arry[0].x50qRscuGga, fun_arry[0].x75qRscuGga, fun_arry[0].truemaxRscuGga],
                    [fun_arry[0].trueminRscuGgg, fun_arry[0].x25qRscuGgg, fun_arry[0].x50qRscuGgg, fun_arry[0].x75qRscuGgg, fun_arry[0].truemaxRscuGgg],
                    [fun_arry[0].trueminRscuGgt, fun_arry[0].x25qRscuGgt, fun_arry[0].x50qRscuGgt, fun_arry[0].x75qRscuGgt, fun_arry[0].truemaxRscuGgt],
                    [fun_arry[0].trueminRscuGgc, fun_arry[0].x25qRscuGgc, fun_arry[0].x50qRscuGgc, fun_arry[0].x75qRscuGgc, fun_arry[0].truemaxRscuGgc],
                    [fun_arry[0].trueminRscuCga, fun_arry[0].x25qRscuCga, fun_arry[0].x50qRscuCga, fun_arry[0].x75qRscuCga, fun_arry[0].truemaxRscuCga],
                    [fun_arry[0].trueminRscuCgg, fun_arry[0].x25qRscuCgg, fun_arry[0].x50qRscuCgg, fun_arry[0].x75qRscuCgg, fun_arry[0].truemaxRscuCgg],
                    [fun_arry[0].trueminRscuCgt, fun_arry[0].x25qRscuCgt, fun_arry[0].x50qRscuCgt, fun_arry[0].x75qRscuCgt, fun_arry[0].truemaxRscuCgt],
                    [fun_arry[0].trueminRscuCgc, fun_arry[0].x25qRscuCgc, fun_arry[0].x50qRscuCgc, fun_arry[0].x75qRscuCgc, fun_arry[0].truemaxRscuCgc],
                    [fun_arry[0].trueminRscuGca, fun_arry[0].x25qRscuGca, fun_arry[0].x50qRscuGca, fun_arry[0].x75qRscuGca, fun_arry[0].truemaxRscuGca],
                    [fun_arry[0].trueminRscuGcg, fun_arry[0].x25qRscuGcg, fun_arry[0].x50qRscuGcg, fun_arry[0].x75qRscuGcg, fun_arry[0].truemaxRscuGcg],
                    [fun_arry[0].trueminRscuGct, fun_arry[0].x25qRscuGct, fun_arry[0].x50qRscuGct, fun_arry[0].x75qRscuGct, fun_arry[0].truemaxRscuGct],
                    [fun_arry[0].trueminRscuGcc, fun_arry[0].x25qRscuGcc, fun_arry[0].x50qRscuGcc, fun_arry[0].x75qRscuGcc, fun_arry[0].truemaxRscuGcc],
                    [fun_arry[0].trueminRscuCca, fun_arry[0].x25qRscuCca, fun_arry[0].x50qRscuCca, fun_arry[0].x75qRscuCca, fun_arry[0].truemaxRscuCca],
                    [fun_arry[0].trueminRscuCcg, fun_arry[0].x25qRscuCcg, fun_arry[0].x50qRscuCcg, fun_arry[0].x75qRscuCcg, fun_arry[0].truemaxRscuCcg],
                    [fun_arry[0].trueminRscuCct, fun_arry[0].x25qRscuCct, fun_arry[0].x50qRscuCct, fun_arry[0].x75qRscuCct, fun_arry[0].truemaxRscuCct],
                    [fun_arry[0].trueminRscuCcc, fun_arry[0].x25qRscuCcc, fun_arry[0].x50qRscuCcc, fun_arry[0].x75qRscuCcc, fun_arry[0].truemaxRscuCcc]
                ],
                tooltip: {
                    headerFormat: '<em>Lable： {point.key}</em><br/>'
                }
            }]
        });
    }
});

$(document).on("click", "a[name='hide_box_bias']", function () {
    $("#bias_box").remove();
    $(this).html("<span class=\"fa fa-plus\"></span>");
    $(this).attr("name","box_bias");
});








