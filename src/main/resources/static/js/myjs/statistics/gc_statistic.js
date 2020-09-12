var chart = Highcharts.chart('genome_num_bar', {
    chart: {
        type: 'column'
    },
    title: {
        text: 'Genome Number'
    },
    xAxis: {
        categories : ['Archaea','Bacteria','Fungi','Plant','Protozoa','Invertebrate','Mammal','Vertebrate','Viral'],
        title: {
            text: ''
        }
    },
    yAxis: {
        min: 0,
        title: {
            text: 'number'
        }
    },
    legend: {
        enabled: false
    },
    tooltip: {
        pointFormat: 'Percentage: <b>{point.y}</b>'
    },
    series: [{
        name: 'Protein',
        data: [
            {'color':'#ADADAD','y':495},
            {'color':'#ff7575','y':23640},
            {'color':'#BF0060','y':320},
            {'color':'#750075','y':211},
            {'color':'#CEFFCE','y':124},
            {'color':'#CECEFF','y':88},
            {'color':'#003D79','y':137},
            {'color':'#009393','y':199},
            {'color':'#019858','y':9371}
        ],
        colorByPoint: true,
        dataLabels: {
            enabled: true,
            rotation: -90,
            color: '#F0F0F0',
            align: 'right',
            format: '{point.y}', // :.1f 为保留 1 位小数
            y: 10
        }
    }]
});

$.ajax({
    url: '/compodynamics/statistic/gc_list?term=invertebrate',
    type: 'GET',
    dataType: 'json',
    cache: false,
    error: erryFunction,
    success: invertebrateFunction
});
function erryFunction() {
    alert("error");
}
function invertebrateFunction(data) {
    var gc1List = data["gc1List"];
    var gc2List = data["gc2List"];
    var gc3List = data["gc3List"];

    var chart = Highcharts.chart('invertebrate_gc', {
        chart: {
            type: 'scatter',
            zoomType: 'xy'
        },
        title: {
            text: 'Invertebrate GC1/2/3 Composition'
        },
        xAxis: {
            title: {
                enabled: true,
                text: 'GC Composition'
            },
            startOnTick: true,
            endOnTick: true,
            showLastLabel: true
        },
        yAxis: {
            title: {
                text: 'GC1/2/3 Composition'
            }
        },
        legend: {
            layout: 'vertical',
            align: 'left',
            verticalAlign: 'top',
            x: 100,
            y: 70,
            floating: true,
            backgroundColor: (Highcharts.theme && Highcharts.theme.legendBackgroundColor) || '#FFFFFF',
            borderWidth: 1
        },
        plotOptions: {
            scatter: {
                marker: {
                    radius: 5,
                    states: {
                        hover: {
                            enabled: true,
                            lineColor: 'rgb(100,100,100)'
                        }
                    }
                },
                states: {
                    hover: {
                        marker: {
                            enabled: false
                        }
                    }
                },
                tooltip: {
                    headerFormat: '<b>{series.name}</b><br>',
                    pointFormat: 'gc:{point.x:.3f} , {series.name}:{point.y:.3f}'
                }
            }
        },
        series: [{
            name: 'gc1',
            color: 'rgba(223, 83, 83, .5)',
            data: gc1List
        }, {
            name: 'gc2',
            color: 'rgba(119, 152, 191, .5)',
            data: gc2List
        },{
            name: 'gc3',
            color: 'rgba(83, 223, 83, .5)',
            data: gc3List
        }]
    });
}

$.ajax({
    url: '/compodynamics/statistic/gc_list?term=vertebrate_mammalian',
    type: 'GET',
    dataType: 'json',
    cache: false,
    error: erryFunction,
    success: vertebrate_mammalianFunction
});
function vertebrate_mammalianFunction(data) {
    var gc1List = data["gc1List"];
    var gc2List = data["gc2List"];
    var gc3List = data["gc3List"];

    var chart = Highcharts.chart('vertebrate_mammalian_gc', {
        chart: {
            type: 'scatter',
            zoomType: 'xy'
        },
        title: {
            text: 'Vertebrate Mammalian GC1/2/3 Composition'
        },
        xAxis: {
            title: {
                enabled: true,
                text: 'GC Composition'
            },
            startOnTick: true,
            endOnTick: true,
            showLastLabel: true
        },
        yAxis: {
            title: {
                text: 'GC1/2/3 Composition'
            }
        },
        legend: {
            layout: 'vertical',
            align: 'left',
            verticalAlign: 'top',
            x: 100,
            y: 70,
            floating: true,
            backgroundColor: (Highcharts.theme && Highcharts.theme.legendBackgroundColor) || '#FFFFFF',
            borderWidth: 1
        },
        plotOptions: {
            scatter: {
                marker: {
                    radius: 5,
                    states: {
                        hover: {
                            enabled: true,
                            lineColor: 'rgb(100,100,100)'
                        }
                    }
                },
                states: {
                    hover: {
                        marker: {
                            enabled: false
                        }
                    }
                },
                tooltip: {
                    headerFormat: '<b>{series.name}</b><br>',
                    pointFormat: 'gc:{point.x:.3f} , {series.name}:{point.y:.3f}'
                }
            }
        },
        series: [{
            name: 'gc1',
            color: 'rgba(223, 83, 83, .5)',
            data: gc1List
        }, {
            name: 'gc2',
            color: 'rgba(119, 152, 191, .5)',
            data: gc2List
        },{
            name: 'gc3',
            color: 'rgba(83, 223, 83, .5)',
            data: gc3List
        }]
    });
}

$.ajax({
    url: '/compodynamics/statistic/gc_list?term=plant',
    type: 'GET',
    dataType: 'json',
    cache: false,
    error: erryFunction,
    success: plantFunction
});
function plantFunction(data) {
    var gc1List = data["gc1List"];
    var gc2List = data["gc2List"];
    var gc3List = data["gc3List"];

    var chart = Highcharts.chart('plant_gc', {
        chart: {
            type: 'scatter',
            zoomType: 'xy'
        },
        title: {
            text: 'Plant GC1/2/3 Composition'
        },
        xAxis: {
            title: {
                enabled: true,
                text: 'GC Composition'
            },
            startOnTick: true,
            endOnTick: true,
            showLastLabel: true
        },
        yAxis: {
            title: {
                text: 'GC1/2/3 Composition'
            }
        },
        legend: {
            layout: 'vertical',
            align: 'left',
            verticalAlign: 'top',
            x: 100,
            y: 70,
            floating: true,
            backgroundColor: (Highcharts.theme && Highcharts.theme.legendBackgroundColor) || '#FFFFFF',
            borderWidth: 1
        },
        plotOptions: {
            scatter: {
                marker: {
                    radius: 5,
                    states: {
                        hover: {
                            enabled: true,
                            lineColor: 'rgb(100,100,100)'
                        }
                    }
                },
                states: {
                    hover: {
                        marker: {
                            enabled: false
                        }
                    }
                },
                tooltip: {
                    headerFormat: '<b>{series.name}</b><br>',
                    pointFormat: 'gc:{point.x:.3f} , {series.name}:{point.y:.3f}'
                }
            }
        },
        series: [{
            name: 'gc1',
            color: 'rgba(223, 83, 83, .5)',
            data: gc1List
        }, {
            name: 'gc2',
            color: 'rgba(119, 152, 191, .5)',
            data: gc2List
        },{
            name: 'gc3',
            color: 'rgba(83, 223, 83, .5)',
            data: gc3List
        }]
    });

}

$.ajax({
    url: '/compodynamics/statistic/gc_list?term=fungi',
    type: 'GET',
    dataType: 'json',
    cache: false,
    error: erryFunction,
    success: fungiFunction
});
function fungiFunction(data) {
    var gc1List = data["gc1List"];
    var gc2List = data["gc2List"];
    var gc3List = data["gc3List"];

    var chart = Highcharts.chart('fungi_gc', {
        chart: {
            type: 'scatter',
            zoomType: 'xy'
        },
        title: {
            text: 'Fungi GC1/2/3 Composition'
        },
        xAxis: {
            title: {
                enabled: true,
                text: 'GC Composition'
            },
            startOnTick: true,
            endOnTick: true,
            showLastLabel: true
        },
        yAxis: {
            title: {
                text: 'GC1/2/3 Composition'
            }
        },
        legend: {
            layout: 'vertical',
            align: 'left',
            verticalAlign: 'top',
            x: 100,
            y: 70,
            floating: true,
            backgroundColor: (Highcharts.theme && Highcharts.theme.legendBackgroundColor) || '#FFFFFF',
            borderWidth: 1
        },
        plotOptions: {
            scatter: {
                marker: {
                    radius: 5,
                    states: {
                        hover: {
                            enabled: true,
                            lineColor: 'rgb(100,100,100)'
                        }
                    }
                },
                states: {
                    hover: {
                        marker: {
                            enabled: false
                        }
                    }
                },
                tooltip: {
                    headerFormat: '<b>{series.name}</b><br>',
                    pointFormat: 'gc:{point.x:.3f} , {series.name}:{point.y:.3f}'
                }
            }
        },
        series: [{
            name: 'gc1',
            color: 'rgba(223, 83, 83, .5)',
            data: gc1List
        }, {
            name: 'gc2',
            color: 'rgba(119, 152, 191, .5)',
            data: gc2List
        },{
            name: 'gc3',
            color: 'rgba(83, 223, 83, .5)',
            data: gc3List
        }]
    });

}

$.ajax({
    url: '/compodynamics/statistic/gc_list?term=vertebrate_other',
    type: 'GET',
    dataType: 'json',
    cache: false,
    error: erryFunction,
    success: vertebrate_otherFunction
});
function vertebrate_otherFunction(data) {
    var gc1List = data["gc1List"];
    var gc2List = data["gc2List"];
    var gc3List = data["gc3List"];

    var chart = Highcharts.chart('vertebrate_other_gc', {
        chart: {
            type: 'scatter',
            zoomType: 'xy'
        },
        title: {
            text: 'Vertebrate Other GC1/2/3 Composition'
        },
        xAxis: {
            title: {
                enabled: true,
                text: 'GC Composition'
            },
            startOnTick: true,
            endOnTick: true,
            showLastLabel: true
        },
        yAxis: {
            title: {
                text: 'GC1/2/3 Composition'
            }
        },
        legend: {
            layout: 'vertical',
            align: 'left',
            verticalAlign: 'top',
            x: 100,
            y: 70,
            floating: true,
            backgroundColor: (Highcharts.theme && Highcharts.theme.legendBackgroundColor) || '#FFFFFF',
            borderWidth: 1
        },
        plotOptions: {
            scatter: {
                marker: {
                    radius: 5,
                    states: {
                        hover: {
                            enabled: true,
                            lineColor: 'rgb(100,100,100)'
                        }
                    }
                },
                states: {
                    hover: {
                        marker: {
                            enabled: false
                        }
                    }
                },
                tooltip: {
                    headerFormat: '<b>{series.name}</b><br>',
                    pointFormat: 'gc:{point.x:.3f} , {series.name}:{point.y:.3f}'
                }
            }
        },
        series: [{
            name: 'gc1',
            color: 'rgba(223, 83, 83, .5)',
            data: gc1List
        }, {
            name: 'gc2',
            color: 'rgba(119, 152, 191, .5)',
            data: gc2List
        },{
            name: 'gc3',
            color: 'rgba(83, 223, 83, .5)',
            data: gc3List
        }]
    });
}

$.ajax({
    url: '/compodynamics/statistic/gc_list?term=protozoa',
    type: 'GET',
    dataType: 'json',
    cache: false,
    error: erryFunction,
    success: protozoaFunction
});
function protozoaFunction(data) {
    var gc1List = data["gc1List"];
    var gc2List = data["gc2List"];
    var gc3List = data["gc3List"];

    var chart = Highcharts.chart('protozoa_gc', {
        chart: {
            type: 'scatter',
            zoomType: 'xy'
        },
        title: {
            text: 'Protozoa GC1/2/3 Composition'
        },
        xAxis: {
            title: {
                enabled: true,
                text: 'GC Composition'
            },
            startOnTick: true,
            endOnTick: true,
            showLastLabel: true
        },
        yAxis: {
            title: {
                text: 'GC1/2/3 Composition'
            }
        },
        legend: {
            layout: 'vertical',
            align: 'left',
            verticalAlign: 'top',
            x: 100,
            y: 70,
            floating: true,
            backgroundColor: (Highcharts.theme && Highcharts.theme.legendBackgroundColor) || '#FFFFFF',
            borderWidth: 1
        },
        plotOptions: {
            scatter: {
                marker: {
                    radius: 5,
                    states: {
                        hover: {
                            enabled: true,
                            lineColor: 'rgb(100,100,100)'
                        }
                    }
                },
                states: {
                    hover: {
                        marker: {
                            enabled: false
                        }
                    }
                },
                tooltip: {
                    headerFormat: '<b>{series.name}</b><br>',
                    pointFormat: 'gc:{point.x:.3f} , {series.name}:{point.y:.3f}'
                }
            }
        },
        series: [{
            name: 'gc1',
            color: 'rgba(223, 83, 83, .5)',
            data: gc1List
        }, {
            name: 'gc2',
            color: 'rgba(119, 152, 191, .5)',
            data: gc2List
        },{
            name: 'gc3',
            color: 'rgba(83, 223, 83, .5)',
            data: gc3List
        }]
    });

}

$.ajax({
    url: '/compodynamics/statistic/gc_list?term=bacteria',
    type: 'GET',
    dataType: 'json',
    cache: false,
    error: erryFunction,
    success: bacteriaFunction
});
function bacteriaFunction(data) {
    var gc1List = data["gc1List"];
    var gc2List = data["gc2List"];
    var gc3List = data["gc3List"];

    var chart = Highcharts.chart('bacteria_gc', {
        chart: {
            type: 'scatter',
            zoomType: 'xy'
        },
        title: {
            text: 'Bacteria GC1/2/3 Composition'
        },
        xAxis: {
            title: {
                enabled: true,
                text: 'GC Composition'
            },
            startOnTick: true,
            endOnTick: true,
            showLastLabel: true
        },
        yAxis: {
            title: {
                text: 'GC1/2/3 Composition'
            }
        },
        legend: {
            layout: 'vertical',
            align: 'left',
            verticalAlign: 'top',
            x: 100,
            y: 70,
            floating: true,
            backgroundColor: (Highcharts.theme && Highcharts.theme.legendBackgroundColor) || '#FFFFFF',
            borderWidth: 1
        },
        plotOptions: {
            scatter: {
                marker: {
                    radius: 5,
                    states: {
                        hover: {
                            enabled: true,
                            lineColor: 'rgb(100,100,100)'
                        }
                    }
                },
                states: {
                    hover: {
                        marker: {
                            enabled: false
                        }
                    }
                },
                tooltip: {
                    headerFormat: '<b>{series.name}</b><br>',
                    pointFormat: 'gc:{point.x:.3f} , {series.name}:{point.y:.3f}'
                }
            }
        },
        series: [{
            name: 'gc1',
            color: 'rgba(223, 83, 83, .5)',
            data: gc1List
        }, {
            name: 'gc2',
            color: 'rgba(119, 152, 191, .5)',
            data: gc2List
        },{
            name: 'gc3',
            color: 'rgba(83, 223, 83, .5)',
            data: gc3List
        }]
    });

}

$.ajax({
    url: '/compodynamics/statistic/gc_list?term=archaea',
    type: 'GET',
    dataType: 'json',
    cache: false,
    error: erryFunction,
    success: archaeaFunction
});
function archaeaFunction(data) {
    var gc1List = data["gc1List"];
    var gc2List = data["gc2List"];
    var gc3List = data["gc3List"];

    var chart = Highcharts.chart('archaea_gc', {
        chart: {
            type: 'scatter',
            zoomType: 'xy'
        },
        title: {
            text: 'Archaea GC1/2/3 Composition'
        },
        xAxis: {
            title: {
                enabled: true,
                text: 'GC Composition'
            },
            startOnTick: true,
            endOnTick: true,
            showLastLabel: true
        },
        yAxis: {
            title: {
                text: 'GC1/2/3 Composition'
            }
        },
        legend: {
            layout: 'vertical',
            align: 'left',
            verticalAlign: 'top',
            x: 100,
            y: 70,
            floating: true,
            backgroundColor: (Highcharts.theme && Highcharts.theme.legendBackgroundColor) || '#FFFFFF',
            borderWidth: 1
        },
        plotOptions: {
            scatter: {
                marker: {
                    radius: 5,
                    states: {
                        hover: {
                            enabled: true,
                            lineColor: 'rgb(100,100,100)'
                        }
                    }
                },
                states: {
                    hover: {
                        marker: {
                            enabled: false
                        }
                    }
                },
                tooltip: {
                    headerFormat: '<b>{series.name}</b><br>',
                    pointFormat: 'gc:{point.x:.3f} , {series.name}:{point.y:.3f}'
                }
            }
        },
        series: [{
            name: 'gc1',
            color: 'rgba(223, 83, 83, .5)',
            data: gc1List
        }, {
            name: 'gc2',
            color: 'rgba(119, 152, 191, .5)',
            data: gc2List
        },{
            name: 'gc3',
            color: 'rgba(83, 223, 83, .5)',
            data: gc3List
        }]
    });

}

$.ajax({
    url: '/compodynamics/statistic/gc_list?term=viral',
    type: 'GET',
    dataType: 'json',
    cache: false,
    error: erryFunction,
    success: viralFunction
});
function viralFunction(data) {
    var gc1List = data["gc1List"];
    var gc2List = data["gc2List"];
    var gc3List = data["gc3List"];

    var chart = Highcharts.chart('viral_gc', {
        chart: {
            type: 'scatter',
            zoomType: 'xy'
        },
        title: {
            text: 'Viral GC1/2/3 Composition'
        },
        xAxis: {
            title: {
                enabled: true,
                text: 'GC Composition'
            },
            startOnTick: true,
            endOnTick: true,
            showLastLabel: true
        },
        yAxis: {
            title: {
                text: 'GC1/2/3 Composition'
            }
        },
        legend: {
            layout: 'vertical',
            align: 'left',
            verticalAlign: 'top',
            x: 100,
            y: 70,
            floating: true,
            backgroundColor: (Highcharts.theme && Highcharts.theme.legendBackgroundColor) || '#FFFFFF',
            borderWidth: 1
        },
        plotOptions: {
            scatter: {
                marker: {
                    radius: 5,
                    states: {
                        hover: {
                            enabled: true,
                            lineColor: 'rgb(100,100,100)'
                        }
                    }
                },
                states: {
                    hover: {
                        marker: {
                            enabled: false
                        }
                    }
                },
                tooltip: {
                    headerFormat: '<b>{series.name}</b><br>',
                    pointFormat: 'gc:{point.x:.3f} , {series.name}:{point.y:.3f}'
                }
            }
        },
        series: [{
            name: 'gc1',
            color: 'rgba(223, 83, 83, .5)',
            data: gc1List
        }, {
            name: 'gc2',
            color: 'rgba(119, 152, 191, .5)',
            data: gc2List
        },{
            name: 'gc3',
            color: 'rgba(83, 223, 83, .5)',
            data: gc3List
        }]
    });

}

