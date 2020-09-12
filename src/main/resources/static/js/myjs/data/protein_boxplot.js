$(document).on("click", "a[name='box_protein']", function () {

    $("#nuc_protein").remove();
    $("a[name='hide_box_protein']").html("<span class=\"fa fa-plus\"></span>");
    $("a[name='hide_box_protein']").attr("name","box_protein");
    $(this).html("<span class=\"fa fa-minus\"></span>");
    $(this).attr("name","hide_box_protein");

    var l = $(this).parent().parent().children().length;
    var a = '<tr id="nuc_protein">' + '<td colspan="'+l+'"><div id="protein_box_bar" style="height: 400px"></div></td>'+'</tr>';
    $(this).parent().parent().after(a);

    $.ajax({
        url: '/compodynamics/proteinfeature/proteinpic?term='+ $(this).data("proteinid"),
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
        var syn_arry = data["proteinPics"];

        var chart = Highcharts.chart('protein_box_bar', {
            chart: {
                type: 'boxplot'
            },
            title: {
                text: 'Box-Plot'
            },
            legend: {
                enabled: false
            },
            xAxis: {
                categories : ['MW','SA','RV','kdHydrophobicity','wwHydrophobicity','hhHydrophobicity','Positive','Negative','Neutral','Alpha','Beta'],
                title: {
                    text: ''
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
                    'mean: {point.median:.3f}<br/>' +
                    'Q1\t: {point.q1:.3f}<br/>' +
                    'min: {point.low:.3f}<br/>'
            },
            series: [{
                name: 'Frequency',
                data: [
                    [syn_arry[0].trueminMw,               syn_arry[0].q25Mw,               syn_arry[0].q50Mw,               syn_arry[0].q75Mw,               syn_arry[0].truemaxMw,             ],
                    [syn_arry[0].trueminSa,               syn_arry[0].q25Sa,               syn_arry[0].q50Sa,               syn_arry[0].q75Sa,               syn_arry[0].truemaxSa,             ],
                    [syn_arry[0].trueminRv,               syn_arry[0].q25Rv,               syn_arry[0].q50Rv,               syn_arry[0].q75Rv,               syn_arry[0].truemaxRv,             ],
                    [syn_arry[0].trueminKdhydrophobicity, syn_arry[0].q25Kdhydrophobicity, syn_arry[0].q50Kdhydrophobicity, syn_arry[0].q75Kdhydrophobicity, syn_arry[0].truemaxKdhydrophobicity],
                    [syn_arry[0].trueminWwhydrophobicity, syn_arry[0].q25Wwhydrophobicity, syn_arry[0].q50Wwhydrophobicity, syn_arry[0].q75Wwhydrophobicity, syn_arry[0].truemaxWwhydrophobicity],
                    [syn_arry[0].trueminHhhydrophobicity, syn_arry[0].q25Hhhydrophobicity, syn_arry[0].q50Hhhydrophobicity, syn_arry[0].q75Hhhydrophobicity, syn_arry[0].truemaxHhhydrophobicity],
                    [syn_arry[0].trueminPositive,         syn_arry[0].q25Positive,         syn_arry[0].q50Positive,         syn_arry[0].q75Positive,         syn_arry[0].truemaxPositive,       ],
                    [syn_arry[0].trueminNegative,         syn_arry[0].q25Negative,         syn_arry[0].q50Negative,         syn_arry[0].q75Negative,         syn_arry[0].truemaxNegative,       ],
                    [syn_arry[0].trueminNeutral,          syn_arry[0].q25Neutral,          syn_arry[0].q50Neutral,          syn_arry[0].q75Neutral,          syn_arry[0].truemaxNeutral,        ],
                    [syn_arry[0].trueminAlpha,            syn_arry[0].q25Alpha,            syn_arry[0].q50Alpha,            syn_arry[0].q75Alpha,            syn_arry[0].truemaxAlpha,          ],
                    [syn_arry[0].trueminBeta,             syn_arry[0].q25Beta,             syn_arry[0].q50Beta,             syn_arry[0].q75Beta,             syn_arry[0].truemaxBeta,           ]
                ],
                tooltip: {
                    headerFormat: '<em> Lable： {point.key}</em><br/>'
                }
            }]
        });
    }
});

$(document).on("click", "a[name='hide_box_protein']", function () {
    $("#nuc_protein").remove();
    $(this).html("<span class=\"fa fa-plus\"></span>");
    $(this).attr("name","box_protein");
});








