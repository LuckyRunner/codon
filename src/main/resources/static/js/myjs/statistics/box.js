var chart = Highcharts.chart('cds_box', {
    chart: {
        type: 'boxplot'
    },
    title: {
        text: 'Distribution of CDS Count within Classes'
    },
    legend: {
        enabled: false
    },
    xAxis: {
        categories : ['archaea','bacteria','fungi','invertebrate','plant','protozoa','vertebrate_mammalian','vertebrate_other','viral'],
        title: {
            text: ''
        }
    },
    yAxis: {
        title: {
            text: 'CDS Number'
        }
    },
    tooltip: {
        pointFormat: '<span style="color:{point.color}">\u25CF</span> <b> {series.name}</b><br/>' +
            'max: {point.high:.2f}<br/>' +
            'Q2\t: {point.q3:.2f}<br/>' +
            'median: {point.median:.2f}<br/>' +
            'Q1\t: {point.q1:.2f}<br/>' +
            'min: {point.low:.2f}<br/>'
    },
    series: [{
        name: 'Taxonomy',
        data: [
            [971, 2025.5, 2832, 3631, 5152],
            [138, 2638, 3851, 4810, 8068],
            [1820, 6750, 10063.5, 12176.75, 20316.875],
            [10519.5, 19501.5, 22737, 25489.5, 34471.5],
            [6199.5, 32688.75, 40341, 50348.25, 76837.5],
            [3066, 5387.25, 8103.5, 12207.75, 22438.5],
            [23419, 36734, 43203, 53320, 78199],
            [14891, 27909.5, 37909, 44604.5, 69647],
            [1, 2, 6, 58, 142]
        ],
        tooltip: {
            headerFormat: '<em>Taxonomy： {point.key}</em><br/>'
        }
    }]
});

var chart = Highcharts.chart('cdc_box', {
    chart: {
        type: 'boxplot'
    },
    title: {
        text: 'Distribution of CDC within Classes'
    },
    legend: {
        enabled: false
    },
    xAxis: {
        categories : ['archaea','bacteria','fungi','invertebrate','plant','protozoa','vertebrate_mammalian','vertebrate_other','viral'],
        title: {
            text: ''
        }
    },
    yAxis: {
        title: {
            text: 'CDC'
        }
    },
    tooltip: {
        pointFormat: '<span style="color:{point.color}">\u25CF</span> <b> {series.name}</b><br/>' +
            'max: {point.high:.2f}<br/>' +
            'Q2\t: {point.q3:.2f}<br/>' +
            'median: {point.median:.2f}<br/>' +
            'Q1\t: {point.q1:.2f}<br/>' +
            'min: {point.low:.2f}<br/>'
    },
    series: [{
        name: 'Taxonomy',
        data: [
            [0.0936722, 0.114176, 0.124652, 0.144775, 0.1906735],
            [0.0684508125, 0.129504375, 0.1506805, 0.17020675, 0.2312603125],
            [0.09251385, 0.10435325, 0.11179875, 0.11942025, 0.14202075],
            [0.0883151, 0.095895025, 0.105098, 0.122463, 0.149584],
            [0.1067220625, 0.11410675, 0.116607, 0.119029875, 0.1264145625],
            [0.0616689, 0.0913736625, 0.1081085, 0.125494625, 0.17667606875],
            [0.11057825, 0.117647, 0.119903, 0.1223595, 0.128523],
            [0.102202875, 0.1147395, 0.119215, 0.12309725, 0.135199],
            [0.0320371, 0.10022075, 0.136823, 0.16787625, 0.2693595]
        ],
        tooltip: {
            headerFormat: '<em>Taxonomy： {point.key}</em><br/>'
        }
    }]
});

var chart = Highcharts.chart('enc_box', {
    chart: {
        type: 'boxplot'
    },
    title: {
        text: 'Distribution of ENC within Classes'
    },
    legend: {
        enabled: false
    },
    xAxis: {
        categories : ['archaea','bacteria','fungi','invertebrate','plant','protozoa','vertebrate_mammalian','vertebrate_other','viral'],
        title: {
            text: ''
        }
    },
    yAxis: {
        title: {
            text: 'ENC'
        }
    },
    tooltip: {
        pointFormat: '<span style="color:{point.color}">\u25CF</span> <b> {series.name}</b><br/>' +
            'max: {point.high:.2f}<br/>' +
            'Q2\t: {point.q3:.2f}<br/>' +
            'median: {point.median:.2f}<br/>' +
            'Q1\t: {point.q1:.2f}<br/>' +
            'min: {point.low:.2f}<br/>'
    },
    series: [{
        name: 'Taxonomy',
        data: [
            [30.57, 35.8, 40.74, 46.35, 54.94],
            [26.845, 37.23, 43.54, 47.48, 57],
            [42.19, 50.1925, 53.54, 55.5275, 58.285],
            [41.5325, 49.22, 52.26, 54.345, 58.77],
            [48.82125,  51.45, 52.345, 53.2025, 55.83125],
            [28.35, 39.965, 48.36, 52.6375, 57.6],
            [48.835, 49.84, 50.2, 50.51, 51.515],
            [48.02875, 50.65, 51.74, 52.3975, 54.07],
            [31.06625, 44.63, 49.74, 53.6725, 61]
        ],
        tooltip: {
            headerFormat: '<em>Taxonomy： {point.key}</em><br/>'
        }
    }]
});




var chart = Highcharts.chart('gc_box', {
    chart: {
        type: 'boxplot'
    },
    title: {
        text: 'Distribution of GC within Classes'
    },
    legend: {
        enabled: false
    },
    xAxis: {
        categories : ['archaea','bacteria','fungi','invertebrate','plant','protozoa','vertebrate_mammalian','vertebrate_other','viral'],
        title: {
            text: ''
        }
    },
    yAxis: {
        title: {
            text: 'CDC'
        }
    },
    tooltip: {
        pointFormat: '<span style="color:{point.color}">\u25CF</span> <b> {series.name}</b><br/>' +
            'max: {point.high:.2f}<br/>' +
            'Q2\t: {point.q3:.2f}<br/>' +
            'median: {point.median:.2f}<br/>' +
            'Q1\t: {point.q1:.2f}<br/>' +
            'min: {point.low:.2f}<br/>'
    },
    series: [{
        name: 'Taxonomy',
        data: [
            [0.277927674125959, 0.418679057644231, 0.557149606673945, 0.650389189380373, 0.700006951156173],
            [0.132774588971809, 0.402117273680451, 0.519687841330364, 0.635482409038588, 0.768430894220598],
            [0.388364292233119, 0.489660353948776, 0.530296304122925, 0.557191061759214, 0.658487123474871],
            [0.320647935301393, 0.430401166097485, 0.461047673246256, 0.503569986628212, 0.613323217424303],
            [0.39731819798531,  0.432266554894089, 0.443676798215932, 0.475823299797073, 0.541158417151548],
            [0.211918818772179, 0.323048807943302, 0.46239584336374, 0.575755596178227, 0.708391558932846],
            [0.495511480568464, 0.516071283320441, 0.522237157279494, 0.529777818488426, 0.550337621240403],
            [0.456483363624484, 0.486068593384822, 0.504885913933015, 0.533135488431127, 0.603735831000584],
            [0.23996153632198, 0.405445041096876, 0.454763027333988, 0.515767377613472, 0.681250882388367]
        ],
        tooltip: {
            headerFormat: '<em>Taxonomy： {point.key}</em><br/>'
        }
    }]
});

