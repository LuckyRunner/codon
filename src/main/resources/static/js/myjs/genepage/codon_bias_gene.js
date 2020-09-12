$(function () {
    var gene = window.location.href.split("?")[1];
    $.ajax({
        url: '/compodynamics/usagebias/genepage?'+ gene,
        type: 'GET',
        dataType: 'json',
        cache: false,
        success: succFunction //成功执行方法
    });
    function succFunction(data) {
        var fun_arry = data["codonRscu"];
        $('#usagebias_table').append(
            "<tr><th style='width:50%'>CDC:</th><td> "+fun_arry[0].cdc.toPrecision(3)+"</td></tr>"
        );
        $('#usagebias_table1').append(
            "<tr><th>ENC:</th><td> "+fun_arry[0].enc.toPrecision(5)+"</td></tr>"
        );
        var chart = Highcharts.chart('exp_gene_bias', {
            chart: {
                type: 'column'
            },
            title: {
                text: 'RSCU-Histogram'
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
                    text: 'RSCU'
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
                    {'color':'#D28EFF','y':fun_arry[0].rscuAaa,'z':'Lys'},
                    {'color':'#D28EFF','y':fun_arry[0].rscuAag,'z':'Lys'},
                    {'color':'#cbda99','y':fun_arry[0].rscuAat,'z':'Asn'},
                    {'color':'#cbda99','y':fun_arry[0].rscuAac,'z':'Asn'},
                    {'color':'#000000','y':fun_arry[0].rscuTaa,'z':'Ter'},
                    {'color':'#000000','y':fun_arry[0].rscuTag,'z':'Ter'},
                    {'color':'#000000','y':fun_arry[0].rscuTga,'z':'Ter'},
                    {'color':'#009FCC','y':fun_arry[0].rscuTat,'z':'Tyr'},
                    {'color':'#009FCC','y':fun_arry[0].rscuTac,'z':'Tyr'},
                    {'color':'#FFBB66','y':fun_arry[0].rscuAtg,'z':'Met'},
                    {'color':'#f2ca94','y':fun_arry[0].rscuAta,'z':'Ile'},
                    {'color':'#f2ca94','y':fun_arry[0].rscuAtt,'z':'Ile'},
                    {'color':'#f2ca94','y':fun_arry[0].rscuAtc,'z':'Ile'},
                    {'color':'#4c918e','y':fun_arry[0].rscuTta,'z':'Leu'},
                    {'color':'#4c918e','y':fun_arry[0].rscuTtg,'z':'Leu'},
                    {'color':'#dfa6cf','y':fun_arry[0].rscuTtt,'z':'Phe'},
                    {'color':'#dfa6cf','y':fun_arry[0].rscuTtc,'z':'Phe'},
                    {'color':'#cbda99','y':fun_arry[0].rscuGaa,'z':'Glu'},
                    {'color':'#cbda99','y':fun_arry[0].rscuGag,'z':'Glu'},
                    {'color':'#9d89cb','y':fun_arry[0].rscuGat,'z':'Asp'},
                    {'color':'#9d89cb','y':fun_arry[0].rscuGac,'z':'Asp'},
                    {'color':'#FFA488','y':fun_arry[0].rscuCaa,'z':'Gln'},
                    {'color':'#FFA488','y':fun_arry[0].rscuCag,'z':'Gln'},
                    {'color':'#868686','y':fun_arry[0].rscuCat,'z':'His'},
                    {'color':'#868686','y':fun_arry[0].rscuCac,'z':'His'},
                    {'color':'#00AAAA','y':fun_arry[0].rscuGta,'z':'Val'},
                    {'color':'#00AAAA','y':fun_arry[0].rscuGtg,'z':'Val'},
                    {'color':'#00AAAA','y':fun_arry[0].rscuGtt,'z':'Val'},
                    {'color':'#00AAAA','y':fun_arry[0].rscuGtc,'z':'Val'},
                    {'color':'#CEFFCE','y':fun_arry[0].rscuCta,'z':'Leu'},
                    {'color':'#CEFFCE','y':fun_arry[0].rscuCtg,'z':'Leu'},
                    {'color':'#CEFFCE','y':fun_arry[0].rscuCtt,'z':'Leu'},
                    {'color':'#CEFFCE','y':fun_arry[0].rscuCtc,'z':'Leu'},
                    {'color':'#FF9D6F','y':fun_arry[0].rscuAga,'z':'Arg'},
                    {'color':'#FF9D6F','y':fun_arry[0].rscuAgg,'z':'Arg'},
                    {'color':'#AD5A5A','y':fun_arry[0].rscuAgt,'z':'Ser'},
                    {'color':'#AD5A5A','y':fun_arry[0].rscuAgc,'z':'Ser'},
                    {'color':'#5151A2','y':fun_arry[0].rscuTgg,'z':'Trp'},
                    {'color':'#74d1e5','y':fun_arry[0].rscuTgt,'z':'Cys'},
                    {'color':'#74d1e5','y':fun_arry[0].rscuTgc,'z':'Cys'},
                    {'color':'#AFAF61','y':fun_arry[0].rscuAca,'z':'Thr'},
                    {'color':'#AFAF61','y':fun_arry[0].rscuAcg,'z':'Thr'},
                    {'color':'#AFAF61','y':fun_arry[0].rscuAct,'z':'Thr'},
                    {'color':'#AFAF61','y':fun_arry[0].rscuAcc,'z':'Thr'},
                    {'color':'#AD5A5A','y':fun_arry[0].rscuTca,'z':'Ser'},
                    {'color':'#AD5A5A','y':fun_arry[0].rscuTcg,'z':'Ser'},
                    {'color':'#AD5A5A','y':fun_arry[0].rscuTct,'z':'Ser'},
                    {'color':'#AD5A5A','y':fun_arry[0].rscuTcc,'z':'Ser'},
                    {'color':'#448b6e','y':fun_arry[0].rscuGga,'z':'Gly'},
                    {'color':'#448b6e','y':fun_arry[0].rscuGgg,'z':'Gly'},
                    {'color':'#448b6e','y':fun_arry[0].rscuGgt,'z':'Gly'},
                    {'color':'#448b6e','y':fun_arry[0].rscuGgc,'z':'Gly'},
                    {'color':'#FF8888','y':fun_arry[0].rscuCga,'z':'Arg'},
                    {'color':'#FF8888','y':fun_arry[0].rscuCgg,'z':'Arg'},
                    {'color':'#FF8888','y':fun_arry[0].rscuCgt,'z':'Arg'},
                    {'color':'#FF8888','y':fun_arry[0].rscuCgc,'z':'Arg'},
                    {'color':'#94f2cd','y':fun_arry[0].rscuGca,'z':'Ala'},
                    {'color':'#94f2cd','y':fun_arry[0].rscuGcg,'z':'Ala'},
                    {'color':'#94f2cd','y':fun_arry[0].rscuGct,'z':'Ala'},
                    {'color':'#94f2cd','y':fun_arry[0].rscuGcc,'z':'Ala'},
                    {'color':'#808a71','y':fun_arry[0].rscuCca,'z':'Pro'},
                    {'color':'#808a71','y':fun_arry[0].rscuCcg,'z':'Pro'},
                    {'color':'#808a71','y':fun_arry[0].rscuCct,'z':'Pro'},
                    {'color':'#808a71','y':fun_arry[0].rscuCcc,'z':'Pro'}
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

        var chart1 = Highcharts.chart('usage_bias_heat_bar', {
            chart: {
                type: 'heatmap',
                marginTop: 40,
                marginBottom: 80,
                plotBorderWidth: 1
            },
            title: {
                text: 'RSCU-Heatmap'
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
                    {'x':0,'y':0,'value': fun_arry[0].rscuAcg,'z':'Thr','name':'ACG'},
                    {'x':0,'y':1,'value': fun_arry[0].rscuAca,'z':'Thr','name':'ACA'},
                    {'x':0,'y':2,'value': fun_arry[0].rscuAgg,'z':'Arg','name':'AGG'},
                    {'x':0,'y':3,'value': fun_arry[0].rscuAga,'z':'Arg','name':'AGA'},
                    {'x':0,'y':4,'value': fun_arry[0].rscuAtg,'z':'Met i','name':'ATG'},
                    {'x':0,'y':5,'value': fun_arry[0].rscuAta,'z':'Ile','name':'ATA'},
                    {'x':0,'y':6,'value': fun_arry[0].rscuAag,'z':'Lys','name':'AAG'},
                    {'x':0,'y':7,'value': fun_arry[0].rscuAaa,'z':'Lys','name':'AAA'},
                    {'x':1,'y':0,'value': fun_arry[0].rscuAcc,'z':'Thr','name':'ACC'},
                    {'x':1,'y':1,'value': fun_arry[0].rscuAct,'z':'Thr','name':'ACT'},
                    {'x':1,'y':2,'value': fun_arry[0].rscuAgc,'z':'Ser','name':'AGC'},
                    {'x':1,'y':3,'value': fun_arry[0].rscuAgt,'z':'Ser','name':'AGT'},
                    {'x':1,'y':4,'value': fun_arry[0].rscuAtc,'z':'Ile','name':'ATC'},
                    {'x':1,'y':5,'value': fun_arry[0].rscuAtt,'z':'Ile','name':'ATT'},
                    {'x':1,'y':6,'value': fun_arry[0].rscuAac,'z':'Asn','name':'AAC'},
                    {'x':1,'y':7,'value': fun_arry[0].rscuAat,'z':'Asn','name':'AAT'},
                    {'x':2,'y':0,'value': fun_arry[0].rscuTcg,'z':'Ser','name':'TCG'},
                    {'x':2,'y':1,'value': fun_arry[0].rscuTca,'z':'Ser','name':'TCA'},
                    {'x':2,'y':2,'value': fun_arry[0].rscuTgg,'z':'Trp','name':'TGG'},
                    {'x':2,'y':3,'value': fun_arry[0].rscuTga,'z':'Ter','name':'TGA'},
                    {'x':2,'y':4,'value': fun_arry[0].rscuTtg,'z':'Leu i','name':'TTG'},
                    {'x':2,'y':5,'value': fun_arry[0].rscuTta,'z':'Leu','name':'TTA'},
                    {'x':2,'y':6,'value': fun_arry[0].rscuTag,'z':'Ter','name':'TAG'},
                    {'x':2,'y':7,'value': fun_arry[0].rscuTaa,'z':'Ter','name':'TAA'},
                    {'x':3,'y':0,'value': fun_arry[0].rscuTcc,'z':'Ser','name':'TCC'},
                    {'x':3,'y':1,'value': fun_arry[0].rscuTct,'z':'Ser','name':'TCT'},
                    {'x':3,'y':2,'value': fun_arry[0].rscuTgc,'z':'Cys','name':'TGC'},
                    {'x':3,'y':3,'value': fun_arry[0].rscuTgt,'z':'Cys','name':'TGT'},
                    {'x':3,'y':4,'value': fun_arry[0].rscuTtc,'z':'Phe','name':'TTC'},
                    {'x':3,'y':5,'value': fun_arry[0].rscuTtt,'z':'Phe','name':'TTT'},
                    {'x':3,'y':6,'value': fun_arry[0].rscuTac,'z':'Tyr','name':'TAC'},
                    {'x':3,'y':7,'value': fun_arry[0].rscuTat,'z':'Tyr','name':'TAT'},
                    {'x':4,'y':0,'value': fun_arry[0].rscuGcg,'z':'Ala','name':'GCG'},
                    {'x':4,'y':1,'value': fun_arry[0].rscuGca,'z':'Ala','name':'GCA'},
                    {'x':4,'y':2,'value': fun_arry[0].rscuGgg,'z':'Gly','name':'GGG'},
                    {'x':4,'y':3,'value': fun_arry[0].rscuGga,'z':'Gly','name':'GGA'},
                    {'x':4,'y':4,'value': fun_arry[0].rscuGtg,'z':'Val','name':'GTG'},
                    {'x':4,'y':5,'value': fun_arry[0].rscuGta,'z':'Val','name':'GTA'},
                    {'x':4,'y':6,'value': fun_arry[0].rscuGag,'z':'Glu','name':'GAG'},
                    {'x':4,'y':7,'value': fun_arry[0].rscuGaa,'z':'Glu','name':'GAA'},
                    {'x':5,'y':0,'value': fun_arry[0].rscuGcc,'z':'Ala','name':'GCC'},
                    {'x':5,'y':1,'value': fun_arry[0].rscuGct,'z':'Ala','name':'GCT'},
                    {'x':5,'y':2,'value': fun_arry[0].rscuGgc,'z':'Gly','name':'GGC'},
                    {'x':5,'y':3,'value': fun_arry[0].rscuGgt,'z':'Gly','name':'GGT'},
                    {'x':5,'y':4,'value': fun_arry[0].rscuGtc,'z':'Val','name':'GTC'},
                    {'x':5,'y':5,'value': fun_arry[0].rscuGtt,'z':'Val','name':'GTT'},
                    {'x':5,'y':6,'value': fun_arry[0].rscuGac,'z':'Asp','name':'GAC'},
                    {'x':5,'y':7,'value': fun_arry[0].rscuGat,'z':'Asp','name':'GAT'},
                    {'x':6,'y':0,'value': fun_arry[0].rscuCcg,'z':'Pro','name':'CCG'},
                    {'x':6,'y':1,'value': fun_arry[0].rscuCca,'z':'Pro','name':'CCA'},
                    {'x':6,'y':2,'value': fun_arry[0].rscuCgg,'z':'Arg','name':'CGG'},
                    {'x':6,'y':3,'value': fun_arry[0].rscuCga,'z':'Arg','name':'CGA'},
                    {'x':6,'y':4,'value': fun_arry[0].rscuCtg,'z':'Leu i','name':'CTG'},
                    {'x':6,'y':5,'value': fun_arry[0].rscuCta,'z':'Leu','name':'CTA'},
                    {'x':6,'y':6,'value': fun_arry[0].rscuCag,'z':'Gln','name':'CAG'},
                    {'x':6,'y':7,'value': fun_arry[0].rscuCaa,'z':'Gln','name':'CAA'},
                    {'x':7,'y':0,'value': fun_arry[0].rscuCcc,'z':'Pro','name':'CCC'},
                    {'x':7,'y':1,'value': fun_arry[0].rscuCct,'z':'Pro','name':'CCT'},
                    {'x':7,'y':2,'value': fun_arry[0].rscuCgc,'z':'Arg','name':'CGC'},
                    {'x':7,'y':3,'value': fun_arry[0].rscuCgt,'z':'Arg','name':'CGT'},
                    {'x':7,'y':4,'value': fun_arry[0].rscuCtc,'z':'Leu','name':'CTC'},
                    {'x':7,'y':5,'value': fun_arry[0].rscuCtt,'z':'Leu','name':'CTT'},
                    {'x':7,'y':6,'value': fun_arry[0].rscuCac,'z':'His','name':'CAC'},
                    {'x':7,'y':7,'value': fun_arry[0].rscuCat,'z':'His','name':'CAT'}
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
