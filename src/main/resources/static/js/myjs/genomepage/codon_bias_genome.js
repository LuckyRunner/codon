//lncRNA的功能数据请求
$(function () {
    var transid = window.location.href.split("=")[1];
    $.ajax({
        url: '/compodynamics/usagebias/genomepage?term=' + transid,
        type: 'GET',
        dataType: 'json',
        cache: false,
        error: erryFunction,  //错误执行方法
        success: successFunction //成功执行方法
    });
    function successFunction(data) {
        var fun_arry = data["codonRscuG"];

        $('#usagebiasG_table').append(
            "<tr><th style='width:50%'>CDC:</th><td> "+fun_arry[0].cdc.toPrecision(3)+"</td></tr>"

        );
        $('#usagebiasG_table1').append(
          "<tr><th>ENC:</th><td> "+fun_arry[0].enc.toPrecision(5)+"</td></tr>"
        );
        var chart = Highcharts.chart('codon_bias_genome_bar', {
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

    $.ajax({
        url: '/compodynamics/usagebias/biaspic?term='+ transid,
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
        var fun_arry1 = data["codonBiasPics"];

        var chart = Highcharts.chart('bias_box_bar', {
            chart: {
                type: 'boxplot'
            },
            title: {
                text: 'RSCU-Box-Plot'
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
                    text: 'RSCU'
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
                name: 'RSCU',
                data: [
                    [fun_arry1[0].trueminRscuAaa, fun_arry1[0].x25qRscuAaa, fun_arry1[0].x50qRscuAaa, fun_arry1[0].x75qRscuAaa, fun_arry1[0].truemaxRscuAaa],
                    [fun_arry1[0].trueminRscuAag, fun_arry1[0].x25qRscuAag, fun_arry1[0].x50qRscuAag, fun_arry1[0].x75qRscuAag, fun_arry1[0].truemaxRscuAag],
                    [fun_arry1[0].trueminRscuAat, fun_arry1[0].x25qRscuAat, fun_arry1[0].x50qRscuAat, fun_arry1[0].x75qRscuAat, fun_arry1[0].truemaxRscuAat],
                    [fun_arry1[0].trueminRscuAac, fun_arry1[0].x25qRscuAac, fun_arry1[0].x50qRscuAac, fun_arry1[0].x75qRscuAac, fun_arry1[0].truemaxRscuAac],
                    [fun_arry1[0].trueminRscuTaa, fun_arry1[0].x25qRscuTaa, fun_arry1[0].x50qRscuTaa, fun_arry1[0].x75qRscuTaa, fun_arry1[0].truemaxRscuTaa],
                    [fun_arry1[0].trueminRscuTag, fun_arry1[0].x25qRscuTag, fun_arry1[0].x50qRscuTag, fun_arry1[0].x75qRscuTag, fun_arry1[0].truemaxRscuTag],
                    [fun_arry1[0].trueminRscuTga, fun_arry1[0].x25qRscuTga, fun_arry1[0].x50qRscuTga, fun_arry1[0].x75qRscuTga, fun_arry1[0].truemaxRscuTga],
                    [fun_arry1[0].trueminRscuTat, fun_arry1[0].x25qRscuTat, fun_arry1[0].x50qRscuTat, fun_arry1[0].x75qRscuTat, fun_arry1[0].truemaxRscuTat],
                    [fun_arry1[0].trueminRscuTac, fun_arry1[0].x25qRscuTac, fun_arry1[0].x50qRscuTac, fun_arry1[0].x75qRscuTac, fun_arry1[0].truemaxRscuTac],
                    [fun_arry1[0].trueminRscuAtg, fun_arry1[0].x25qRscuAtg, fun_arry1[0].x50qRscuAtg, fun_arry1[0].x75qRscuAtg, fun_arry1[0].truemaxRscuAtg],
                    [fun_arry1[0].trueminRscuAta, fun_arry1[0].x25qRscuAta, fun_arry1[0].x50qRscuAta, fun_arry1[0].x75qRscuAta, fun_arry1[0].truemaxRscuAta],
                    [fun_arry1[0].trueminRscuAtt, fun_arry1[0].x25qRscuAtt, fun_arry1[0].x50qRscuAtt, fun_arry1[0].x75qRscuAtt, fun_arry1[0].truemaxRscuAtt],
                    [fun_arry1[0].trueminRscuAtc, fun_arry1[0].x25qRscuAtc, fun_arry1[0].x50qRscuAtc, fun_arry1[0].x75qRscuAtc, fun_arry1[0].truemaxRscuAtc],
                    [fun_arry1[0].trueminRscuTta, fun_arry1[0].x25qRscuTta, fun_arry1[0].x50qRscuTta, fun_arry1[0].x75qRscuTta, fun_arry1[0].truemaxRscuTta],
                    [fun_arry1[0].trueminRscuTtg, fun_arry1[0].x25qRscuTtg, fun_arry1[0].x50qRscuTtg, fun_arry1[0].x75qRscuTtg, fun_arry1[0].truemaxRscuTtg],
                    [fun_arry1[0].trueminRscuTtt, fun_arry1[0].x25qRscuTtt, fun_arry1[0].x50qRscuTtt, fun_arry1[0].x75qRscuTtt, fun_arry1[0].truemaxRscuTtt],
                    [fun_arry1[0].trueminRscuTtc, fun_arry1[0].x25qRscuTtc, fun_arry1[0].x50qRscuTtc, fun_arry1[0].x75qRscuTtc, fun_arry1[0].truemaxRscuTtc],
                    [fun_arry1[0].trueminRscuGaa, fun_arry1[0].x25qRscuGaa, fun_arry1[0].x50qRscuGaa, fun_arry1[0].x75qRscuGaa, fun_arry1[0].truemaxRscuGaa],
                    [fun_arry1[0].trueminRscuGag, fun_arry1[0].x25qRscuGag, fun_arry1[0].x50qRscuGag, fun_arry1[0].x75qRscuGag, fun_arry1[0].truemaxRscuGag],
                    [fun_arry1[0].trueminRscuGat, fun_arry1[0].x25qRscuGat, fun_arry1[0].x50qRscuGat, fun_arry1[0].x75qRscuGat, fun_arry1[0].truemaxRscuGat],
                    [fun_arry1[0].trueminRscuGac, fun_arry1[0].x25qRscuGac, fun_arry1[0].x50qRscuGac, fun_arry1[0].x75qRscuGac, fun_arry1[0].truemaxRscuGac],
                    [fun_arry1[0].trueminRscuCaa, fun_arry1[0].x25qRscuCaa, fun_arry1[0].x50qRscuCaa, fun_arry1[0].x75qRscuCaa, fun_arry1[0].truemaxRscuCaa],
                    [fun_arry1[0].trueminRscuCag, fun_arry1[0].x25qRscuCag, fun_arry1[0].x50qRscuCag, fun_arry1[0].x75qRscuCag, fun_arry1[0].truemaxRscuCag],
                    [fun_arry1[0].trueminRscuCat, fun_arry1[0].x25qRscuCat, fun_arry1[0].x50qRscuCat, fun_arry1[0].x75qRscuCat, fun_arry1[0].truemaxRscuCat],
                    [fun_arry1[0].trueminRscuCac, fun_arry1[0].x25qRscuCac, fun_arry1[0].x50qRscuCac, fun_arry1[0].x75qRscuCac, fun_arry1[0].truemaxRscuCac],
                    [fun_arry1[0].trueminRscuGta, fun_arry1[0].x25qRscuGta, fun_arry1[0].x50qRscuGta, fun_arry1[0].x75qRscuGta, fun_arry1[0].truemaxRscuGta],
                    [fun_arry1[0].trueminRscuGtg, fun_arry1[0].x25qRscuGtg, fun_arry1[0].x50qRscuGtg, fun_arry1[0].x75qRscuGtg, fun_arry1[0].truemaxRscuGtg],
                    [fun_arry1[0].trueminRscuGtt, fun_arry1[0].x25qRscuGtt, fun_arry1[0].x50qRscuGtt, fun_arry1[0].x75qRscuGtt, fun_arry1[0].truemaxRscuGtt],
                    [fun_arry1[0].trueminRscuGtc, fun_arry1[0].x25qRscuGtc, fun_arry1[0].x50qRscuGtc, fun_arry1[0].x75qRscuGtc, fun_arry1[0].truemaxRscuGtc],
                    [fun_arry1[0].trueminRscuCta, fun_arry1[0].x25qRscuCta, fun_arry1[0].x50qRscuCta, fun_arry1[0].x75qRscuCta, fun_arry1[0].truemaxRscuCta],
                    [fun_arry1[0].trueminRscuCtg, fun_arry1[0].x25qRscuCtg, fun_arry1[0].x50qRscuCtg, fun_arry1[0].x75qRscuCtg, fun_arry1[0].truemaxRscuCtg],
                    [fun_arry1[0].trueminRscuCtt, fun_arry1[0].x25qRscuCtt, fun_arry1[0].x50qRscuCtt, fun_arry1[0].x75qRscuCtt, fun_arry1[0].truemaxRscuCtt],
                    [fun_arry1[0].trueminRscuCtc, fun_arry1[0].x25qRscuCtc, fun_arry1[0].x50qRscuCtc, fun_arry1[0].x75qRscuCtc, fun_arry1[0].truemaxRscuCtc],
                    [fun_arry1[0].trueminRscuAga, fun_arry1[0].x25qRscuAga, fun_arry1[0].x50qRscuAga, fun_arry1[0].x75qRscuAga, fun_arry1[0].truemaxRscuAga],
                    [fun_arry1[0].trueminRscuAgg, fun_arry1[0].x25qRscuAgg, fun_arry1[0].x50qRscuAgg, fun_arry1[0].x75qRscuAgg, fun_arry1[0].truemaxRscuAgg],
                    [fun_arry1[0].trueminRscuAgt, fun_arry1[0].x25qRscuAgt, fun_arry1[0].x50qRscuAgt, fun_arry1[0].x75qRscuAgt, fun_arry1[0].truemaxRscuAgt],
                    [fun_arry1[0].trueminRscuAgc, fun_arry1[0].x25qRscuAgc, fun_arry1[0].x50qRscuAgc, fun_arry1[0].x75qRscuAgc, fun_arry1[0].truemaxRscuAgc],
                    [fun_arry1[0].trueminRscuTgg, fun_arry1[0].x25qRscuTgg, fun_arry1[0].x50qRscuTgg, fun_arry1[0].x75qRscuTgg, fun_arry1[0].truemaxRscuTgg],
                    [fun_arry1[0].trueminRscuTgt, fun_arry1[0].x25qRscuTgt, fun_arry1[0].x50qRscuTgt, fun_arry1[0].x75qRscuTgt, fun_arry1[0].truemaxRscuTgt],
                    [fun_arry1[0].trueminRscuTgc, fun_arry1[0].x25qRscuTgc, fun_arry1[0].x50qRscuTgc, fun_arry1[0].x75qRscuTgc, fun_arry1[0].truemaxRscuTgc],
                    [fun_arry1[0].trueminRscuAca, fun_arry1[0].x25qRscuAca, fun_arry1[0].x50qRscuAca, fun_arry1[0].x75qRscuAca, fun_arry1[0].truemaxRscuAca],
                    [fun_arry1[0].trueminRscuAcg, fun_arry1[0].x25qRscuAcg, fun_arry1[0].x50qRscuAcg, fun_arry1[0].x75qRscuAcg, fun_arry1[0].truemaxRscuAcg],
                    [fun_arry1[0].trueminRscuAct, fun_arry1[0].x25qRscuAct, fun_arry1[0].x50qRscuAct, fun_arry1[0].x75qRscuAct, fun_arry1[0].truemaxRscuAct],
                    [fun_arry1[0].trueminRscuAcc, fun_arry1[0].x25qRscuAcc, fun_arry1[0].x50qRscuAcc, fun_arry1[0].x75qRscuAcc, fun_arry1[0].truemaxRscuAcc],
                    [fun_arry1[0].trueminRscuTca, fun_arry1[0].x25qRscuTca, fun_arry1[0].x50qRscuTca, fun_arry1[0].x75qRscuTca, fun_arry1[0].truemaxRscuTca],
                    [fun_arry1[0].trueminRscuTcg, fun_arry1[0].x25qRscuTcg, fun_arry1[0].x50qRscuTcg, fun_arry1[0].x75qRscuTcg, fun_arry1[0].truemaxRscuTcg],
                    [fun_arry1[0].trueminRscuTct, fun_arry1[0].x25qRscuTct, fun_arry1[0].x50qRscuTct, fun_arry1[0].x75qRscuTct, fun_arry1[0].truemaxRscuTct],
                    [fun_arry1[0].trueminRscuTcc, fun_arry1[0].x25qRscuTcc, fun_arry1[0].x50qRscuTcc, fun_arry1[0].x75qRscuTcc, fun_arry1[0].truemaxRscuTcc],
                    [fun_arry1[0].trueminRscuGga, fun_arry1[0].x25qRscuGga, fun_arry1[0].x50qRscuGga, fun_arry1[0].x75qRscuGga, fun_arry1[0].truemaxRscuGga],
                    [fun_arry1[0].trueminRscuGgg, fun_arry1[0].x25qRscuGgg, fun_arry1[0].x50qRscuGgg, fun_arry1[0].x75qRscuGgg, fun_arry1[0].truemaxRscuGgg],
                    [fun_arry1[0].trueminRscuGgt, fun_arry1[0].x25qRscuGgt, fun_arry1[0].x50qRscuGgt, fun_arry1[0].x75qRscuGgt, fun_arry1[0].truemaxRscuGgt],
                    [fun_arry1[0].trueminRscuGgc, fun_arry1[0].x25qRscuGgc, fun_arry1[0].x50qRscuGgc, fun_arry1[0].x75qRscuGgc, fun_arry1[0].truemaxRscuGgc],
                    [fun_arry1[0].trueminRscuCga, fun_arry1[0].x25qRscuCga, fun_arry1[0].x50qRscuCga, fun_arry1[0].x75qRscuCga, fun_arry1[0].truemaxRscuCga],
                    [fun_arry1[0].trueminRscuCgg, fun_arry1[0].x25qRscuCgg, fun_arry1[0].x50qRscuCgg, fun_arry1[0].x75qRscuCgg, fun_arry1[0].truemaxRscuCgg],
                    [fun_arry1[0].trueminRscuCgt, fun_arry1[0].x25qRscuCgt, fun_arry1[0].x50qRscuCgt, fun_arry1[0].x75qRscuCgt, fun_arry1[0].truemaxRscuCgt],
                    [fun_arry1[0].trueminRscuCgc, fun_arry1[0].x25qRscuCgc, fun_arry1[0].x50qRscuCgc, fun_arry1[0].x75qRscuCgc, fun_arry1[0].truemaxRscuCgc],
                    [fun_arry1[0].trueminRscuGca, fun_arry1[0].x25qRscuGca, fun_arry1[0].x50qRscuGca, fun_arry1[0].x75qRscuGca, fun_arry1[0].truemaxRscuGca],
                    [fun_arry1[0].trueminRscuGcg, fun_arry1[0].x25qRscuGcg, fun_arry1[0].x50qRscuGcg, fun_arry1[0].x75qRscuGcg, fun_arry1[0].truemaxRscuGcg],
                    [fun_arry1[0].trueminRscuGct, fun_arry1[0].x25qRscuGct, fun_arry1[0].x50qRscuGct, fun_arry1[0].x75qRscuGct, fun_arry1[0].truemaxRscuGct],
                    [fun_arry1[0].trueminRscuGcc, fun_arry1[0].x25qRscuGcc, fun_arry1[0].x50qRscuGcc, fun_arry1[0].x75qRscuGcc, fun_arry1[0].truemaxRscuGcc],
                    [fun_arry1[0].trueminRscuCca, fun_arry1[0].x25qRscuCca, fun_arry1[0].x50qRscuCca, fun_arry1[0].x75qRscuCca, fun_arry1[0].truemaxRscuCca],
                    [fun_arry1[0].trueminRscuCcg, fun_arry1[0].x25qRscuCcg, fun_arry1[0].x50qRscuCcg, fun_arry1[0].x75qRscuCcg, fun_arry1[0].truemaxRscuCcg],
                    [fun_arry1[0].trueminRscuCct, fun_arry1[0].x25qRscuCct, fun_arry1[0].x50qRscuCct, fun_arry1[0].x75qRscuCct, fun_arry1[0].truemaxRscuCct],
                    [fun_arry1[0].trueminRscuCcc, fun_arry1[0].x25qRscuCcc, fun_arry1[0].x50qRscuCcc, fun_arry1[0].x75qRscuCcc, fun_arry1[0].truemaxRscuCcc]
                ],
                tooltip: {
                    headerFormat: '<em>Lable： {point.key}</em><br/>'
                }
            }]
        });
    }



});

