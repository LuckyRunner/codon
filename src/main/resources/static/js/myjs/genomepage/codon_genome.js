//lncRNA的功能数据请求
$(function () {
    var transid = window.location.href.split("=")[1];
    $.ajax({
        url: '/compodynamics/codonusage/genomepage?term=' + transid,
        type: 'GET',
        dataType: 'json',
        cache: false,
        error: erryFunction,  //错误执行方法
        success: succFunction //成功执行方法
    });

    function erryFunction() {
        alert("error");
    }

    function succFunction(data) {
        var fun_arry = data["codonUsageG"];
        var chart = Highcharts.chart('codon_genome_bar', {
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
    $.ajax({
        url: '/compodynamics/codonusage/codonpic?term='+ transid,
        type: 'GET',
        dataType: 'json',
        cache: false,
        error: erryFunction,
        success: successFunction
    });
    function successFunction(data) {
        var fun_arry = data["codonPics"];

        var chart = Highcharts.chart('codon_box_bar', {
            chart: {
                type: 'boxplot'
            },
            title: {
                text: 'Codon-Usage-Box-Plot'
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
                    [fun_arry[0].trueminObservedAta, fun_arry[0].q25ObservedAta, fun_arry[0].q50ObservedAta, fun_arry[0].q75ObservedAta, fun_arry[0].truemaxObservedAta],
                    [fun_arry[0].trueminObservedAtg, fun_arry[0].q25ObservedAtg, fun_arry[0].q50ObservedAtg, fun_arry[0].q75ObservedAtg, fun_arry[0].truemaxObservedAtg],
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

