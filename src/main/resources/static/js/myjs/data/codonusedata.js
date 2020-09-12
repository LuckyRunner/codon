$(document).on("click", "a[name='view_map']", function () {
    $.fn.dataTable.tables({visible: true, api: true}).columns.adjust();
    // 监听屏幕大小改变
    $(window).resize(function () {
        $.fn.dataTable.tables({visible: true, api: true}).columns.adjust();
    })

    $("#map_view").remove();
    $("a[name='hide_map']").html("<span class=\"fa fa-plus\"></span>");
    $("a[name='hide_map']").attr("name","view_map");
    $(this).html("<span class=\"fa fa-minus\"></span>");
    $(this).attr("name","hide_map");

    var l = $(this).parent().parent().children().length;
    var a = '<tr id="map_view">' + '<td colspan="'+l+'"><div id="exp_bar" style="height: 400px"></div></td>'+'</tr>';

    $(this).parent().parent().after(a);

    var chart = Highcharts.chart('exp_bar', {
        chart: {
            type: 'column'
        },
        title: {
            text: 'Codon-Usage-Histogram'
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
            data: [
                {'color':'#D28EFF','y':$(this).data("aaa"),'z':'Lys'},
                {'color':'#D28EFF','y':$(this).data("aag"),'z':'Lys'},
                {'color':'#cbda99','y':$(this).data("aat"),'z':'Asn'},
                {'color':'#cbda99','y':$(this).data("aac"),'z':'Asn'},
                {'color':'#000000','y':$(this).data("taa"),'z':'Ter'},
                {'color':'#000000','y':$(this).data("tag"),'z':'Ter'},
                {'color':'#000000','y':$(this).data("tga"),'z':'Ter'},
                {'color':'#009FCC','y':$(this).data("tat"),'z':'Tyr'},
                {'color':'#009FCC','y':$(this).data("tac"),'z':'Tyr'},
                {'color':'#FFBB66','y':$(this).data("atg"),'z':'Met'},
                {'color':'#f2ca94','y':$(this).data("ata"),'z':'Ile'},
                {'color':'#f2ca94','y':$(this).data("att"),'z':'Ile'},
                {'color':'#f2ca94','y':$(this).data("atc"),'z':'Ile'},
                {'color':'#4c918e','y':$(this).data("tta"),'z':'Leu'},
                {'color':'#4c918e','y':$(this).data("ttg"),'z':'Leu'},
                {'color':'#dfa6cf','y':$(this).data("ttt"),'z':'Phe'},
                {'color':'#dfa6cf','y':$(this).data("ttc"),'z':'Phe'},
                {'color':'#cbda99','y':$(this).data("gaa"),'z':'Glu'},
                {'color':'#cbda99','y':$(this).data("gag"),'z':'Glu'},
                {'color':'#9d89cb','y':$(this).data("gat"),'z':'Asp'},
                {'color':'#9d89cb','y':$(this).data("gac"),'z':'Asp'},
                {'color':'#FFA488','y':$(this).data("caa"),'z':'Gln'},
                {'color':'#FFA488','y':$(this).data("cag"),'z':'Gln'},
                {'color':'#868686','y':$(this).data("cat"),'z':'His'},
                {'color':'#868686','y':$(this).data("cac"),'z':'His'},
                {'color':'#00AAAA','y':$(this).data("gta"),'z':'Val'},
                {'color':'#00AAAA','y':$(this).data("gtg"),'z':'Val'},
                {'color':'#00AAAA','y':$(this).data("gtt"),'z':'Val'},
                {'color':'#00AAAA','y':$(this).data("gtc"),'z':'Val'},
                {'color':'#CEFFCE','y':$(this).data("cta"),'z':'Leu'},
                {'color':'#CEFFCE','y':$(this).data("ctg"),'z':'Leu'},
                {'color':'#CEFFCE','y':$(this).data("ctt"),'z':'Leu'},
                {'color':'#CEFFCE','y':$(this).data("ctc"),'z':'Leu'},
                {'color':'#FF9D6F','y':$(this).data("aga"),'z':'Arg'},
                {'color':'#FF9D6F','y':$(this).data("agg"),'z':'Arg'},
                {'color':'#AD5A5A','y':$(this).data("agt"),'z':'Ser'},
                {'color':'#AD5A5A','y':$(this).data("agc"),'z':'Ser'},
                {'color':'#5151A2','y':$(this).data("tgg"),'z':'Trp'},
                {'color':'#74d1e5','y':$(this).data("tgt"),'z':'Cys'},
                {'color':'#74d1e5','y':$(this).data("tgc"),'z':'Cys'},
                {'color':'#AFAF61','y':$(this).data("aca"),'z':'Thr'},
                {'color':'#AFAF61','y':$(this).data("acg"),'z':'Thr'},
                {'color':'#AFAF61','y':$(this).data("act"),'z':'Thr'},
                {'color':'#AFAF61','y':$(this).data("acc"),'z':'Thr'},
                {'color':'#AD5A5A','y':$(this).data("tca"),'z':'Ser'},
                {'color':'#AD5A5A','y':$(this).data("tcg"),'z':'Ser'},
                {'color':'#AD5A5A','y':$(this).data("tct"),'z':'Ser'},
                {'color':'#AD5A5A','y':$(this).data("tcc"),'z':'Ser'},
                {'color':'#448b6e','y':$(this).data("gga"),'z':'Gly'},
                {'color':'#448b6e','y':$(this).data("ggg"),'z':'Gly'},
                {'color':'#448b6e','y':$(this).data("ggt"),'z':'Gly'},
                {'color':'#448b6e','y':$(this).data("ggc"),'z':'Gly'},
                {'color':'#FF8888','y':$(this).data("cga"),'z':'Arg'},
                {'color':'#FF8888','y':$(this).data("cgg"),'z':'Arg'},
                {'color':'#FF8888','y':$(this).data("cgt"),'z':'Arg'},
                {'color':'#FF8888','y':$(this).data("cgc"),'z':'Arg'},
                {'color':'#94f2cd','y':$(this).data("gca"),'z':'Ala'},
                {'color':'#94f2cd','y':$(this).data("gcg"),'z':'Ala'},
                {'color':'#94f2cd','y':$(this).data("gct"),'z':'Ala'},
                {'color':'#94f2cd','y':$(this).data("gcc"),'z':'Ala'},
                {'color':'#808a71','y':$(this).data("cca"),'z':'Pro'},
                {'color':'#808a71','y':$(this).data("ccg"),'z':'Pro'},
                {'color':'#808a71','y':$(this).data("cct"),'z':'Pro'},
                {'color':'#808a71','y':$(this).data("ccc"),'z':'Pro'}
            ],
            dataLabels: {
                enabled: true,
                rotation: -90,
                color: '#FFFFFF',
                align: 'right',
                format: '{point.y:.3f}', // :.1f 为保留 1 位小数
                y: 10
            },
            tooltip: {
                pointFormat: 'amino acid: <b>{point.z}</b><br>' +
                    'codon percentage： <b>{point.y:.3f}</b><br>'
            },
        }]
    });

});

$(document).on("click", "a[name='hide_map']", function () {
    $("#map_view").remove();
    $(this).html("<span class=\"fa fa-plus\"></span>");
    $(this).attr("name","view_map");
});
