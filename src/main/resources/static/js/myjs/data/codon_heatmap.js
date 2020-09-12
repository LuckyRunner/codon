$(document).on("click", "a[name='view_heat_map']", function () {
    // 监听屏幕大小改变
    $.fn.dataTable.tables({visible: true, api: true}).columns.adjust();
    $(window).resize(function () {
        $.fn.dataTable.tables({visible: true, api: true}).columns.adjust();
    })

    $("#heat_map_view").remove();
    $("a[name='hide_heat_map']").html("<span class=\"fa fa-plus\"></span>");
    $("a[name='hide_heat_map']").attr("name","view_heat_map");
    $(this).html("<span class=\"fa fa-minus\"></span>");
    $(this).attr("name","hide_heat_map");
    var l = $(this).parent().parent().children().length;
    var a = '<tr id="heat_map_view">' + '<td colspan="'+l+'"><div id="exp_heat_bar" style="height: 400px"></div></td>'+'</tr>';
    $(this).parent().parent().after(a);

    var chart = Highcharts.chart('exp_heat_bar', {
        chart: {
            type: 'heatmap',
            marginTop: 40,
            marginBottom: 80,
            plotBorderWidth: 1
        },
        title: {
            text: 'Codon-Usage-Heatmap'
        },
        xAxis: {
            categories: ['A','A','T','T','G','G','C','C']
        },
        yAxis: {
            categories: ['C','C','G','G','T','T','A','A'],
            title: null
        },
        colorAxis: {
            min: 0,
            minColor: '#FFFFFF',
            maxColor: Highcharts.getOptions().colors[0]
        },
        legend: {
            align: 'right',
            layout: 'vertical',
            margin: 0,
            verticalAlign: 'top',
            y: 25,
            symbolHeight: 280
        },
        tooltip: {
            formatter: function () {
                return 'codon: ' + this.point.name + '<br>' +
                    'amino acid:' + this.point.z + '<br>'+
                    'frequency: ' + this.point.value.toPrecision(3);
            }
        },
        series: [{
            name: '',
            borderWidth: 1,
            data: [
                {'x':0,'y':0,'value': $(this).data("acg"),'z':'Thr',  'name':'ACG'},
                {'x':0,'y':1,'value': $(this).data("aca"),'z':'Thr',  'name':'ACA'},
                {'x':0,'y':2,'value': $(this).data("agg"),'z':'Arg',  'name':'AGG'},
                {'x':0,'y':3,'value': $(this).data("aga"),'z':'Arg',  'name':'AGA'},
                {'x':0,'y':4,'value': $(this).data("atg"),'z':'Met i','name':'ATG'},
                {'x':0,'y':5,'value': $(this).data("ata"),'z':'Ile',  'name':'ATA'},
                {'x':0,'y':6,'value': $(this).data("aag"),'z':'Lys',  'name':'AAG'},
                {'x':0,'y':7,'value': $(this).data("aaa"),'z':'Lys',  'name':'AAA'},
                {'x':1,'y':0,'value': $(this).data("acc"),'z':'Thr',  'name':'ACC'},
                {'x':1,'y':1,'value': $(this).data("act"),'z':'Thr',  'name':'ACT'},
                {'x':1,'y':2,'value': $(this).data("agc"),'z':'Ser',  'name':'AGC'},
                {'x':1,'y':3,'value': $(this).data("agt"),'z':'Ser',  'name':'AGT'},
                {'x':1,'y':4,'value': $(this).data("atc"),'z':'Ile',  'name':'ATC'},
                {'x':1,'y':5,'value': $(this).data("att"),'z':'Ile',  'name':'ATT'},
                {'x':1,'y':6,'value': $(this).data("aac"),'z':'Asn',  'name':'AAC'},
                {'x':1,'y':7,'value': $(this).data("aat"),'z':'Asn',  'name':'AAT'},
                {'x':2,'y':0,'value': $(this).data("tcg"),'z':'Ser',  'name':'TCG'},
                {'x':2,'y':1,'value': $(this).data("tca"),'z':'Ser',  'name':'TCA'},
                {'x':2,'y':2,'value': $(this).data("tgg"),'z':'Trp',  'name':'TGG'},
                {'x':2,'y':3,'value': $(this).data("tga"),'z':'Ter',  'name':'TGA'},
                {'x':2,'y':4,'value': $(this).data("ttg"),'z':'Leu i','name':'TTG'},
                {'x':2,'y':5,'value': $(this).data("tta"),'z':'Leu',  'name':'TTA'},
                {'x':2,'y':6,'value': $(this).data("tag"),'z':'Ter',  'name':'TAG'},
                {'x':2,'y':7,'value': $(this).data("taa"),'z':'Ter',  'name':'TAA'},
                {'x':3,'y':0,'value': $(this).data("tcc"),'z':'Ser',  'name':'TCC'},
                {'x':3,'y':1,'value': $(this).data("tct"),'z':'Ser',  'name':'TCT'},
                {'x':3,'y':2,'value': $(this).data("tgc"),'z':'Cys',  'name':'TGC'},
                {'x':3,'y':3,'value': $(this).data("tgt"),'z':'Cys',  'name':'TGT'},
                {'x':3,'y':4,'value': $(this).data("ttc"),'z':'Phe',  'name':'TTC'},
                {'x':3,'y':5,'value': $(this).data("ttt"),'z':'Phe',  'name':'TTT'},
                {'x':3,'y':6,'value': $(this).data("tac"),'z':'Tyr',  'name':'TAC'},
                {'x':3,'y':7,'value': $(this).data("tat"),'z':'Tyr',  'name':'TAT'},
                {'x':4,'y':0,'value': $(this).data("gcg"),'z':'Ala',  'name':'GCG'},
                {'x':4,'y':1,'value': $(this).data("gca"),'z':'Ala',  'name':'GCA'},
                {'x':4,'y':2,'value': $(this).data("ggg"),'z':'Gly',  'name':'GGG'},
                {'x':4,'y':3,'value': $(this).data("gga"),'z':'Gly',  'name':'GGA'},
                {'x':4,'y':4,'value': $(this).data("gtg"),'z':'Val',  'name':'GTG'},
                {'x':4,'y':5,'value': $(this).data("gta"),'z':'Val',  'name':'GTA'},
                {'x':4,'y':6,'value': $(this).data("gag"),'z':'Glu',  'name':'GAG'},
                {'x':4,'y':7,'value': $(this).data("gaa"),'z':'Glu',  'name':'GAA'},
                {'x':5,'y':0,'value': $(this).data("gcc"),'z':'Ala',  'name':'GCC'},
                {'x':5,'y':1,'value': $(this).data("gct"),'z':'Ala',  'name':'GCT'},
                {'x':5,'y':2,'value': $(this).data("ggc"),'z':'Gly',  'name':'GGC'},
                {'x':5,'y':3,'value': $(this).data("ggt"),'z':'Gly',  'name':'GGT'},
                {'x':5,'y':4,'value': $(this).data("gtc"),'z':'Val',  'name':'GTC'},
                {'x':5,'y':5,'value': $(this).data("gtt"),'z':'Val',  'name':'GTT'},
                {'x':5,'y':6,'value': $(this).data("gac"),'z':'Asp',  'name':'GAC'},
                {'x':5,'y':7,'value': $(this).data("gat"),'z':'Asp',  'name':'GAT'},
                {'x':6,'y':0,'value': $(this).data("ccg"),'z':'Pro',  'name':'CCG'},
                {'x':6,'y':1,'value': $(this).data("cca"),'z':'Pro',  'name':'CCA'},
                {'x':6,'y':2,'value': $(this).data("cgg"),'z':'Arg',  'name':'CGG'},
                {'x':6,'y':3,'value': $(this).data("cga"),'z':'Arg',  'name':'CGA'},
                {'x':6,'y':4,'value': $(this).data("ctg"),'z':'Leu i','name':'CTG'},
                {'x':6,'y':5,'value': $(this).data("cta"),'z':'Leu',  'name':'CTA'},
                {'x':6,'y':6,'value': $(this).data("cag"),'z':'Gln',  'name':'CAG'},
                {'x':6,'y':7,'value': $(this).data("caa"),'z':'Gln',  'name':'CAA'},
                {'x':7,'y':0,'value': $(this).data("ccc"),'z':'Pro',  'name':'CCC'},
                {'x':7,'y':1,'value': $(this).data("cct"),'z':'Pro',  'name':'CCT'},
                {'x':7,'y':2,'value': $(this).data("cgc"),'z':'Arg',  'name':'CGC'},
                {'x':7,'y':3,'value': $(this).data("cgt"),'z':'Arg',  'name':'CGT'},
                {'x':7,'y':4,'value': $(this).data("ctc"),'z':'Leu',  'name':'CTC'},
                {'x':7,'y':5,'value': $(this).data("ctt"),'z':'Leu',  'name':'CTT'},
                {'x':7,'y':6,'value': $(this).data("cac"),'z':'His',  'name':'CAC'},
                {'x':7,'y':7,'value': $(this).data("cat"),'z':'His',  'name':'CAT'}
            ],
            dataLabels: {
                enabled: true,
                color: '#000000',
                format: '{point.value:.3f}',
            }
        }]
    });

});

$(document).on("click", "a[name='hide_heat_map']", function () {
    $("#heat_map_view").remove();
    $(this).html("<span class=\"fa fa-plus\"></span>");
    $(this).attr("name","view_heat_map");
});


