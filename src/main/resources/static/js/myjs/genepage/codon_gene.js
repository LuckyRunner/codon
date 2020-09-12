$(function () {
    var gene = window.location.href.split("?")[1];

    $.ajax({
        url: '/compodynamics/codonusage/genepage?'+ gene,
        type: 'GET',
        dataType: 'json',
        cache: false,
        success: succFunction //成功执行方法
    });

    function succFunction(data) {
        var fun_arry = data["codonUsage"];
        var chart = Highcharts.chart('codon_gene_bar', {
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
                    {'color':'#D28EFF','y':fun_arry[0].observedAaa,'z':'Lys'},
                    {'color':'#D28EFF','y':fun_arry[0].observedAag,'z':'Lys'},
                    {'color':'#cbda99','y':fun_arry[0].observedAat,'z':'Asn'},
                    {'color':'#cbda99','y':fun_arry[0].observedAac,'z':'Asn'},
                    {'color':'#000000','y':fun_arry[0].observedTaa,'z':'Ter'},
                    {'color':'#000000','y':fun_arry[0].observedTag,'z':'Ter'},
                    {'color':'#000000','y':fun_arry[0].observedTga,'z':'Ter'},
                    {'color':'#009FCC','y':fun_arry[0].observedTat,'z':'Tyr'},
                    {'color':'#009FCC','y':fun_arry[0].observedTac,'z':'Tyr'},
                    {'color':'#FFBB66','y':fun_arry[0].observedAtg,'z':'Met'},
                    {'color':'#f2ca94','y':fun_arry[0].observedAta,'z':'Ile'},
                    {'color':'#f2ca94','y':fun_arry[0].observedAtt,'z':'Ile'},
                    {'color':'#f2ca94','y':fun_arry[0].observedAtc,'z':'Ile'},
                    {'color':'#4c918e','y':fun_arry[0].observedTta,'z':'Leu'},
                    {'color':'#4c918e','y':fun_arry[0].observedTtg,'z':'Leu'},
                    {'color':'#dfa6cf','y':fun_arry[0].observedTtt,'z':'Phe'},
                    {'color':'#dfa6cf','y':fun_arry[0].observedTtc,'z':'Phe'},
                    {'color':'#cbda99','y':fun_arry[0].observedGaa,'z':'Glu'},
                    {'color':'#cbda99','y':fun_arry[0].observedGag,'z':'Glu'},
                    {'color':'#9d89cb','y':fun_arry[0].observedGat,'z':'Asp'},
                    {'color':'#9d89cb','y':fun_arry[0].observedGac,'z':'Asp'},
                    {'color':'#FFA488','y':fun_arry[0].observedCaa,'z':'Gln'},
                    {'color':'#FFA488','y':fun_arry[0].observedCag,'z':'Gln'},
                    {'color':'#868686','y':fun_arry[0].observedCat,'z':'His'},
                    {'color':'#868686','y':fun_arry[0].observedCac,'z':'His'},
                    {'color':'#00AAAA','y':fun_arry[0].observedGta,'z':'Val'},
                    {'color':'#00AAAA','y':fun_arry[0].observedGtg,'z':'Val'},
                    {'color':'#00AAAA','y':fun_arry[0].observedGtt,'z':'Val'},
                    {'color':'#00AAAA','y':fun_arry[0].observedGtc,'z':'Val'},
                    {'color':'#CEFFCE','y':fun_arry[0].observedCta,'z':'Leu'},
                    {'color':'#CEFFCE','y':fun_arry[0].observedCtg,'z':'Leu'},
                    {'color':'#CEFFCE','y':fun_arry[0].observedCtt,'z':'Leu'},
                    {'color':'#CEFFCE','y':fun_arry[0].observedCtc,'z':'Leu'},
                    {'color':'#FF9D6F','y':fun_arry[0].observedAga,'z':'Arg'},
                    {'color':'#FF9D6F','y':fun_arry[0].observedAgg,'z':'Arg'},
                    {'color':'#AD5A5A','y':fun_arry[0].observedAgt,'z':'Ser'},
                    {'color':'#AD5A5A','y':fun_arry[0].observedAgc,'z':'Ser'},
                    {'color':'#5151A2','y':fun_arry[0].observedTgg,'z':'Trp'},
                    {'color':'#74d1e5','y':fun_arry[0].observedTgt,'z':'Cys'},
                    {'color':'#74d1e5','y':fun_arry[0].observedTgc,'z':'Cys'},
                    {'color':'#AFAF61','y':fun_arry[0].observedAca,'z':'Thr'},
                    {'color':'#AFAF61','y':fun_arry[0].observedAcg,'z':'Thr'},
                    {'color':'#AFAF61','y':fun_arry[0].observedAct,'z':'Thr'},
                    {'color':'#AFAF61','y':fun_arry[0].observedAcc,'z':'Thr'},
                    {'color':'#AD5A5A','y':fun_arry[0].observedTca,'z':'Ser'},
                    {'color':'#AD5A5A','y':fun_arry[0].observedTcg,'z':'Ser'},
                    {'color':'#AD5A5A','y':fun_arry[0].observedTct,'z':'Ser'},
                    {'color':'#AD5A5A','y':fun_arry[0].observedTcc,'z':'Ser'},
                    {'color':'#448b6e','y':fun_arry[0].observedGga,'z':'Gly'},
                    {'color':'#448b6e','y':fun_arry[0].observedGgg,'z':'Gly'},
                    {'color':'#448b6e','y':fun_arry[0].observedGgt,'z':'Gly'},
                    {'color':'#448b6e','y':fun_arry[0].observedGgc,'z':'Gly'},
                    {'color':'#FF8888','y':fun_arry[0].observedCga,'z':'Arg'},
                    {'color':'#FF8888','y':fun_arry[0].observedCgg,'z':'Arg'},
                    {'color':'#FF8888','y':fun_arry[0].observedCgt,'z':'Arg'},
                    {'color':'#FF8888','y':fun_arry[0].observedCgc,'z':'Arg'},
                    {'color':'#94f2cd','y':fun_arry[0].observedGca,'z':'Ala'},
                    {'color':'#94f2cd','y':fun_arry[0].observedGcg,'z':'Ala'},
                    {'color':'#94f2cd','y':fun_arry[0].observedGct,'z':'Ala'},
                    {'color':'#94f2cd','y':fun_arry[0].observedGcc,'z':'Ala'},
                    {'color':'#808a71','y':fun_arry[0].observedCca,'z':'Pro'},
                    {'color':'#808a71','y':fun_arry[0].observedCcg,'z':'Pro'},
                    {'color':'#808a71','y':fun_arry[0].observedCct,'z':'Pro'},
                    {'color':'#808a71','y':fun_arry[0].observedCcc,'z':'Pro'}
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

        var chart1 = Highcharts.chart('exp_heat_bar', {
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
                    {'x':0,'y':0,'value': fun_arry[0].observedAcg,'z':'Thr','name':'ACG'},
                    {'x':0,'y':1,'value': fun_arry[0].observedAca,'z':'Thr','name':'ACA'},
                    {'x':0,'y':2,'value': fun_arry[0].observedAgg,'z':'Arg','name':'AGG'},
                    {'x':0,'y':3,'value': fun_arry[0].observedAga,'z':'Arg','name':'AGA'},
                    {'x':0,'y':4,'value': fun_arry[0].observedAtg,'z':'Met i','name':'ATG'},
                    {'x':0,'y':5,'value': fun_arry[0].observedAta,'z':'Ile','name':'ATA'},
                    {'x':0,'y':6,'value': fun_arry[0].observedAag,'z':'Lys','name':'AAG'},
                    {'x':0,'y':7,'value': fun_arry[0].observedAaa,'z':'Lys','name':'AAA'},
                    {'x':1,'y':0,'value': fun_arry[0].observedAcc,'z':'Thr','name':'ACC'},
                    {'x':1,'y':1,'value': fun_arry[0].observedAct,'z':'Thr','name':'ACT'},
                    {'x':1,'y':2,'value': fun_arry[0].observedAgc,'z':'Ser','name':'AGC'},
                    {'x':1,'y':3,'value': fun_arry[0].observedAgt,'z':'Ser','name':'AGT'},
                    {'x':1,'y':4,'value': fun_arry[0].observedAtc,'z':'Ile','name':'ATC'},
                    {'x':1,'y':5,'value': fun_arry[0].observedAtt,'z':'Ile','name':'ATT'},
                    {'x':1,'y':6,'value': fun_arry[0].observedAac,'z':'Asn','name':'AAC'},
                    {'x':1,'y':7,'value': fun_arry[0].observedAat,'z':'Asn','name':'AAT'},
                    {'x':2,'y':0,'value': fun_arry[0].observedTcg,'z':'Ser','name':'TCG'},
                    {'x':2,'y':1,'value': fun_arry[0].observedTca,'z':'Ser','name':'TCA'},
                    {'x':2,'y':2,'value': fun_arry[0].observedTgg,'z':'Trp','name':'TGG'},
                    {'x':2,'y':3,'value': fun_arry[0].observedTga,'z':'Ter','name':'TGA'},
                    {'x':2,'y':4,'value': fun_arry[0].observedTtg,'z':'Leu i','name':'TTG'},
                    {'x':2,'y':5,'value': fun_arry[0].observedTta,'z':'Leu','name':'TTA'},
                    {'x':2,'y':6,'value': fun_arry[0].observedTag,'z':'Ter','name':'TAG'},
                    {'x':2,'y':7,'value': fun_arry[0].observedTaa,'z':'Ter','name':'TAA'},
                    {'x':3,'y':0,'value': fun_arry[0].observedTcc,'z':'Ser','name':'TCC'},
                    {'x':3,'y':1,'value': fun_arry[0].observedTct,'z':'Ser','name':'TCT'},
                    {'x':3,'y':2,'value': fun_arry[0].observedTgc,'z':'Cys','name':'TGC'},
                    {'x':3,'y':3,'value': fun_arry[0].observedTgt,'z':'Cys','name':'TGT'},
                    {'x':3,'y':4,'value': fun_arry[0].observedTtc,'z':'Phe','name':'TTC'},
                    {'x':3,'y':5,'value': fun_arry[0].observedTtt,'z':'Phe','name':'TTT'},
                    {'x':3,'y':6,'value': fun_arry[0].observedTac,'z':'Tyr','name':'TAC'},
                    {'x':3,'y':7,'value': fun_arry[0].observedTat,'z':'Tyr','name':'TAT'},
                    {'x':4,'y':0,'value': fun_arry[0].observedGcg,'z':'Ala','name':'GCG'},
                    {'x':4,'y':1,'value': fun_arry[0].observedGca,'z':'Ala','name':'GCA'},
                    {'x':4,'y':2,'value': fun_arry[0].observedGgg,'z':'Gly','name':'GGG'},
                    {'x':4,'y':3,'value': fun_arry[0].observedGga,'z':'Gly','name':'GGA'},
                    {'x':4,'y':4,'value': fun_arry[0].observedGtg,'z':'Val','name':'GTG'},
                    {'x':4,'y':5,'value': fun_arry[0].observedGta,'z':'Val','name':'GTA'},
                    {'x':4,'y':6,'value': fun_arry[0].observedGag,'z':'Glu','name':'GAG'},
                    {'x':4,'y':7,'value': fun_arry[0].observedGaa,'z':'Glu','name':'GAA'},
                    {'x':5,'y':0,'value': fun_arry[0].observedGcc,'z':'Ala','name':'GCC'},
                    {'x':5,'y':1,'value': fun_arry[0].observedGct,'z':'Ala','name':'GCT'},
                    {'x':5,'y':2,'value': fun_arry[0].observedGgc,'z':'Gly','name':'GGC'},
                    {'x':5,'y':3,'value': fun_arry[0].observedGgt,'z':'Gly','name':'GGT'},
                    {'x':5,'y':4,'value': fun_arry[0].observedGtc,'z':'Val','name':'GTC'},
                    {'x':5,'y':5,'value': fun_arry[0].observedGtt,'z':'Val','name':'GTT'},
                    {'x':5,'y':6,'value': fun_arry[0].observedGac,'z':'Asp','name':'GAC'},
                    {'x':5,'y':7,'value': fun_arry[0].observedGat,'z':'Asp','name':'GAT'},
                    {'x':6,'y':0,'value': fun_arry[0].observedCcg,'z':'Pro','name':'CCG'},
                    {'x':6,'y':1,'value': fun_arry[0].observedCca,'z':'Pro','name':'CCA'},
                    {'x':6,'y':2,'value': fun_arry[0].observedCgg,'z':'Arg','name':'CGG'},
                    {'x':6,'y':3,'value': fun_arry[0].observedCga,'z':'Arg','name':'CGA'},
                    {'x':6,'y':4,'value': fun_arry[0].observedCtg,'z':'Leu i','name':'CTG'},
                    {'x':6,'y':5,'value': fun_arry[0].observedCta,'z':'Leu','name':'CTA'},
                    {'x':6,'y':6,'value': fun_arry[0].observedCag,'z':'Gln','name':'CAG'},
                    {'x':6,'y':7,'value': fun_arry[0].observedCaa,'z':'Gln','name':'CAA'},
                    {'x':7,'y':0,'value': fun_arry[0].observedCcc,'z':'Pro','name':'CCC'},
                    {'x':7,'y':1,'value': fun_arry[0].observedCct,'z':'Pro','name':'CCT'},
                    {'x':7,'y':2,'value': fun_arry[0].observedCgc,'z':'Arg','name':'CGC'},
                    {'x':7,'y':3,'value': fun_arry[0].observedCgt,'z':'Arg','name':'CGT'},
                    {'x':7,'y':4,'value': fun_arry[0].observedCtc,'z':'Leu','name':'CTC'},
                    {'x':7,'y':5,'value': fun_arry[0].observedCtt,'z':'Leu','name':'CTT'},
                    {'x':7,'y':6,'value': fun_arry[0].observedCac,'z':'His','name':'CAC'},
                    {'x':7,'y':7,'value': fun_arry[0].observedCat,'z':'His','name':'CAT'}
                ],
                dataLabels: {
                    enabled: true,
                    color: '#000000',
                    format: '{point.value:.3f}',
                }
            }]
        });
    }
});
