$(document).on("click", "a[name='box_codon']", function () {

    $("#codon_box").remove();
    $("a[name='hide_box_codon']").html("<span class=\"fa fa-plus\"></span>");
    $("a[name='hide_box_codon']").attr("name","box_codon");
    $(this).html("<span class=\"fa fa-minus\"></span>");
    $(this).attr("name","hide_box_codon");

    var l = $(this).parent().parent().children().length;
    var a = '<tr id="codon_box">' + '<td colspan="'+l+'"><div id="box_bar" style="height: 400px"></div></td>'+'</tr>';
    $(this).parent().parent().after(a);

    $.ajax({
        url: '/compodynamics/codonusage/codonpic?term='+ $(this).data("codonpicid"),
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
        var fun_arry = data["codonPics"];

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
                    [fun_arry[0].trueminObservedAaa, fun_arry[0].q25ObservedAaa, fun_arry[0].q50ObservedAaa, fun_arry[0].q75ObservedAaa, fun_arry[0].truemaxObservedAaa],
                    [fun_arry[0].trueminObservedAag, fun_arry[0].q25ObservedAag, fun_arry[0].q50ObservedAag, fun_arry[0].q75ObservedAag, fun_arry[0].truemaxObservedAag],
                    [fun_arry[0].trueminObservedAat, fun_arry[0].q25ObservedAat, fun_arry[0].q50ObservedAat, fun_arry[0].q75ObservedAat, fun_arry[0].truemaxObservedAat],
                    [fun_arry[0].trueminObservedAac, fun_arry[0].q25ObservedAac, fun_arry[0].q50ObservedAac, fun_arry[0].q75ObservedAac, fun_arry[0].truemaxObservedAac],
                    [fun_arry[0].trueminObservedTaa, fun_arry[0].q25ObservedTaa, fun_arry[0].q50ObservedTaa, fun_arry[0].q75ObservedTaa, fun_arry[0].truemaxObservedTaa],
                    [fun_arry[0].trueminObservedTag, fun_arry[0].q25ObservedTag, fun_arry[0].q50ObservedTag, fun_arry[0].q75ObservedTag, fun_arry[0].truemaxObservedTag],
                    [fun_arry[0].trueminObservedTga, fun_arry[0].q25ObservedTga, fun_arry[0].q50ObservedTga, fun_arry[0].q75ObservedTga, fun_arry[0].truemaxObservedTga],
                    [fun_arry[0].trueminObservedTat, fun_arry[0].q25ObservedTat, fun_arry[0].q50ObservedTat, fun_arry[0].q75ObservedTat, fun_arry[0].truemaxObservedTat],
                    [fun_arry[0].trueminObservedTac, fun_arry[0].q25ObservedTac, fun_arry[0].q50ObservedTac, fun_arry[0].q75ObservedTac, fun_arry[0].truemaxObservedTac],
                    [fun_arry[0].trueminObservedAtg, fun_arry[0].q25ObservedAtg, fun_arry[0].q50ObservedAtg, fun_arry[0].q75ObservedAtg, fun_arry[0].truemaxObservedAtg],
                    [fun_arry[0].trueminObservedAta, fun_arry[0].q25ObservedAta, fun_arry[0].q50ObservedAta, fun_arry[0].q75ObservedAta, fun_arry[0].truemaxObservedAta],
                    [fun_arry[0].trueminObservedAtt, fun_arry[0].q25ObservedAtt, fun_arry[0].q50ObservedAtt, fun_arry[0].q75ObservedAtt, fun_arry[0].truemaxObservedAtt],
                    [fun_arry[0].trueminObservedAtc, fun_arry[0].q25ObservedAtc, fun_arry[0].q50ObservedAtc, fun_arry[0].q75ObservedAtc, fun_arry[0].truemaxObservedAtc],
                    [fun_arry[0].trueminObservedTta, fun_arry[0].q25ObservedTta, fun_arry[0].q50ObservedTta, fun_arry[0].q75ObservedTta, fun_arry[0].truemaxObservedTta],
                    [fun_arry[0].trueminObservedTtg, fun_arry[0].q25ObservedTtg, fun_arry[0].q50ObservedTtg, fun_arry[0].q75ObservedTtg, fun_arry[0].truemaxObservedTtg],
                    [fun_arry[0].trueminObservedTtt, fun_arry[0].q25ObservedTtt, fun_arry[0].q50ObservedTtt, fun_arry[0].q75ObservedTtt, fun_arry[0].truemaxObservedTtt],
                    [fun_arry[0].trueminObservedTtc, fun_arry[0].q25ObservedTtc, fun_arry[0].q50ObservedTtc, fun_arry[0].q75ObservedTtc, fun_arry[0].truemaxObservedTtc],
                    [fun_arry[0].trueminObservedGaa, fun_arry[0].q25ObservedGaa, fun_arry[0].q50ObservedGaa, fun_arry[0].q75ObservedGaa, fun_arry[0].truemaxObservedGaa],
                    [fun_arry[0].trueminObservedGag, fun_arry[0].q25ObservedGag, fun_arry[0].q50ObservedGag, fun_arry[0].q75ObservedGag, fun_arry[0].truemaxObservedGag],
                    [fun_arry[0].trueminObservedGat, fun_arry[0].q25ObservedGat, fun_arry[0].q50ObservedGat, fun_arry[0].q75ObservedGat, fun_arry[0].truemaxObservedGat],
                    [fun_arry[0].trueminObservedGac, fun_arry[0].q25ObservedGac, fun_arry[0].q50ObservedGac, fun_arry[0].q75ObservedGac, fun_arry[0].truemaxObservedGac],
                    [fun_arry[0].trueminObservedCaa, fun_arry[0].q25ObservedCaa, fun_arry[0].q50ObservedCaa, fun_arry[0].q75ObservedCaa, fun_arry[0].truemaxObservedCaa],
                    [fun_arry[0].trueminObservedCag, fun_arry[0].q25ObservedCag, fun_arry[0].q50ObservedCag, fun_arry[0].q75ObservedCag, fun_arry[0].truemaxObservedCag],
                    [fun_arry[0].trueminObservedCat, fun_arry[0].q25ObservedCat, fun_arry[0].q50ObservedCat, fun_arry[0].q75ObservedCat, fun_arry[0].truemaxObservedCat],
                    [fun_arry[0].trueminObservedCac, fun_arry[0].q25ObservedCac, fun_arry[0].q50ObservedCac, fun_arry[0].q75ObservedCac, fun_arry[0].truemaxObservedCac],
                    [fun_arry[0].trueminObservedGta, fun_arry[0].q25ObservedGta, fun_arry[0].q50ObservedGta, fun_arry[0].q75ObservedGta, fun_arry[0].truemaxObservedGta],
                    [fun_arry[0].trueminObservedGtg, fun_arry[0].q25ObservedGtg, fun_arry[0].q50ObservedGtg, fun_arry[0].q75ObservedGtg, fun_arry[0].truemaxObservedGtg],
                    [fun_arry[0].trueminObservedGtt, fun_arry[0].q25ObservedGtt, fun_arry[0].q50ObservedGtt, fun_arry[0].q75ObservedGtt, fun_arry[0].truemaxObservedGtt],
                    [fun_arry[0].trueminObservedGtc, fun_arry[0].q25ObservedGtc, fun_arry[0].q50ObservedGtc, fun_arry[0].q75ObservedGtc, fun_arry[0].truemaxObservedGtc],
                    [fun_arry[0].trueminObservedCta, fun_arry[0].q25ObservedCta, fun_arry[0].q50ObservedCta, fun_arry[0].q75ObservedCta, fun_arry[0].truemaxObservedCta],
                    [fun_arry[0].trueminObservedCtg, fun_arry[0].q25ObservedCtg, fun_arry[0].q50ObservedCtg, fun_arry[0].q75ObservedCtg, fun_arry[0].truemaxObservedCtg],
                    [fun_arry[0].trueminObservedCtt, fun_arry[0].q25ObservedCtt, fun_arry[0].q50ObservedCtt, fun_arry[0].q75ObservedCtt, fun_arry[0].truemaxObservedCtt],
                    [fun_arry[0].trueminObservedCtc, fun_arry[0].q25ObservedCtc, fun_arry[0].q50ObservedCtc, fun_arry[0].q75ObservedCtc, fun_arry[0].truemaxObservedCtc],
                    [fun_arry[0].trueminObservedAga, fun_arry[0].q25ObservedAga, fun_arry[0].q50ObservedAga, fun_arry[0].q75ObservedAga, fun_arry[0].truemaxObservedAga],
                    [fun_arry[0].trueminObservedAgg, fun_arry[0].q25ObservedAgg, fun_arry[0].q50ObservedAgg, fun_arry[0].q75ObservedAgg, fun_arry[0].truemaxObservedAgg],
                    [fun_arry[0].trueminObservedAgt, fun_arry[0].q25ObservedAgt, fun_arry[0].q50ObservedAgt, fun_arry[0].q75ObservedAgt, fun_arry[0].truemaxObservedAgt],
                    [fun_arry[0].trueminObservedAgc, fun_arry[0].q25ObservedAgc, fun_arry[0].q50ObservedAgc, fun_arry[0].q75ObservedAgc, fun_arry[0].truemaxObservedAgc],
                    [fun_arry[0].trueminObservedTgg, fun_arry[0].q25ObservedTgg, fun_arry[0].q50ObservedTgg, fun_arry[0].q75ObservedTgg, fun_arry[0].truemaxObservedTgg],
                    [fun_arry[0].trueminObservedTgt, fun_arry[0].q25ObservedTgt, fun_arry[0].q50ObservedTgt, fun_arry[0].q75ObservedTgt, fun_arry[0].truemaxObservedTgt],
                    [fun_arry[0].trueminObservedTgc, fun_arry[0].q25ObservedTgc, fun_arry[0].q50ObservedTgc, fun_arry[0].q75ObservedTgc, fun_arry[0].truemaxObservedTgc],
                    [fun_arry[0].trueminObservedAca, fun_arry[0].q25ObservedAca, fun_arry[0].q50ObservedAca, fun_arry[0].q75ObservedAca, fun_arry[0].truemaxObservedAca],
                    [fun_arry[0].trueminObservedAcg, fun_arry[0].q25ObservedAcg, fun_arry[0].q50ObservedAcg, fun_arry[0].q75ObservedAcg, fun_arry[0].truemaxObservedAcg],
                    [fun_arry[0].trueminObservedAct, fun_arry[0].q25ObservedAct, fun_arry[0].q50ObservedAct, fun_arry[0].q75ObservedAct, fun_arry[0].truemaxObservedAct],
                    [fun_arry[0].trueminObservedAcc, fun_arry[0].q25ObservedAcc, fun_arry[0].q50ObservedAcc, fun_arry[0].q75ObservedAcc, fun_arry[0].truemaxObservedAcc],
                    [fun_arry[0].trueminObservedTca, fun_arry[0].q25ObservedTca, fun_arry[0].q50ObservedTca, fun_arry[0].q75ObservedTca, fun_arry[0].truemaxObservedTca],
                    [fun_arry[0].trueminObservedTcg, fun_arry[0].q25ObservedTcg, fun_arry[0].q50ObservedTcg, fun_arry[0].q75ObservedTcg, fun_arry[0].truemaxObservedTcg],
                    [fun_arry[0].trueminObservedTct, fun_arry[0].q25ObservedTct, fun_arry[0].q50ObservedTct, fun_arry[0].q75ObservedTct, fun_arry[0].truemaxObservedTct],
                    [fun_arry[0].trueminObservedTcc, fun_arry[0].q25ObservedTcc, fun_arry[0].q50ObservedTcc, fun_arry[0].q75ObservedTcc, fun_arry[0].truemaxObservedTcc],
                    [fun_arry[0].trueminObservedGga, fun_arry[0].q25ObservedGga, fun_arry[0].q50ObservedGga, fun_arry[0].q75ObservedGga, fun_arry[0].truemaxObservedGga],
                    [fun_arry[0].trueminObservedGgg, fun_arry[0].q25ObservedGgg, fun_arry[0].q50ObservedGgg, fun_arry[0].q75ObservedGgg, fun_arry[0].truemaxObservedGgg],
                    [fun_arry[0].trueminObservedGgt, fun_arry[0].q25ObservedGgt, fun_arry[0].q50ObservedGgt, fun_arry[0].q75ObservedGgt, fun_arry[0].truemaxObservedGgt],
                    [fun_arry[0].trueminObservedGgc, fun_arry[0].q25ObservedGgc, fun_arry[0].q50ObservedGgc, fun_arry[0].q75ObservedGgc, fun_arry[0].truemaxObservedGgc],
                    [fun_arry[0].trueminObservedCga, fun_arry[0].q25ObservedCga, fun_arry[0].q50ObservedCga, fun_arry[0].q75ObservedCga, fun_arry[0].truemaxObservedCga],
                    [fun_arry[0].trueminObservedCgg, fun_arry[0].q25ObservedCgg, fun_arry[0].q50ObservedCgg, fun_arry[0].q75ObservedCgg, fun_arry[0].truemaxObservedCgg],
                    [fun_arry[0].trueminObservedCgt, fun_arry[0].q25ObservedCgt, fun_arry[0].q50ObservedCgt, fun_arry[0].q75ObservedCgt, fun_arry[0].truemaxObservedCgt],
                    [fun_arry[0].trueminObservedCgc, fun_arry[0].q25ObservedCgc, fun_arry[0].q50ObservedCgc, fun_arry[0].q75ObservedCgc, fun_arry[0].truemaxObservedCgc],
                    [fun_arry[0].trueminObservedGca, fun_arry[0].q25ObservedGca, fun_arry[0].q50ObservedGca, fun_arry[0].q75ObservedGca, fun_arry[0].truemaxObservedGca],
                    [fun_arry[0].trueminObservedGcg, fun_arry[0].q25ObservedGcg, fun_arry[0].q50ObservedGcg, fun_arry[0].q75ObservedGcg, fun_arry[0].truemaxObservedGcg],
                    [fun_arry[0].trueminObservedGct, fun_arry[0].q25ObservedGct, fun_arry[0].q50ObservedGct, fun_arry[0].q75ObservedGct, fun_arry[0].truemaxObservedGct],
                    [fun_arry[0].trueminObservedGcc, fun_arry[0].q25ObservedGcc, fun_arry[0].q50ObservedGcc, fun_arry[0].q75ObservedGcc, fun_arry[0].truemaxObservedGcc],
                    [fun_arry[0].trueminObservedCca, fun_arry[0].q25ObservedCca, fun_arry[0].q50ObservedCca, fun_arry[0].q75ObservedCca, fun_arry[0].truemaxObservedCca],
                    [fun_arry[0].trueminObservedCcg, fun_arry[0].q25ObservedCcg, fun_arry[0].q50ObservedCcg, fun_arry[0].q75ObservedCcg, fun_arry[0].truemaxObservedCcg],
                    [fun_arry[0].trueminObservedCct, fun_arry[0].q25ObservedCct, fun_arry[0].q50ObservedCct, fun_arry[0].q75ObservedCct, fun_arry[0].truemaxObservedCct],
                    [fun_arry[0].trueminObservedCcc, fun_arry[0].q25ObservedCcc, fun_arry[0].q50ObservedCcc, fun_arry[0].q75ObservedCcc, fun_arry[0].truemaxObservedCcc]
                ],
                tooltip: {
                    headerFormat: '<em>Lable： {point.key}</em><br/>'
                }
            }]
        });
    }
});

$(document).on("click", "a[name='hide_box_codon']", function () {
    $("#codon_box").remove();
    $(this).html("<span class=\"fa fa-plus\"></span>");
    $(this).attr("name","box_codon");
});








