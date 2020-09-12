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