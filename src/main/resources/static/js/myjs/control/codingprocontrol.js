var _codingproTable;
var _codingproGTable;

$(function () {
    var _codonuseColumns =[
        {"data": "taxonomy",
            render: function(value,row,index){
                return "<a href='/compodynamics/codpot?taxonomy_gene=" + value + "' >" + value.replace(value[0],value[0].toUpperCase()) + "</a>"
            }
        },
        {"data": "organism",
            render: function(value,row,index){
                return "<a href='/compodynamics/codpot?organism_gene=" + value + "' >" + value + "</a>"
            }},
        {"data": "assemblyAccession",
            render: function(value,row,index){
                return "<a href='/compodynamics/codpot?assemblyAccession_gene=" + value + "' >" + value + "</a>"
            }},
        {"data": "geneId",
            render: function(value,row,index){
                return "<a href='/compodynamics/codpot?gene_id=" + value + "' >" + value + "</a>"
            }},
        {"data": "proteinId",
            render: function (value, type, row) {
                return '<a href="/compodynamics/genepage?gene='+row["cdsIndex"]+'&genome='+row["speciseIndex"]+'" target="_blank">' +
                    '<span class="label label-success">' + value + '</span></a>'
            }},
        {"data": "fickettScore", render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "cpc2CodingProbability", render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "cpc2Label", render: function(value,row,index){
                return value.replace(value[0],value[0].toUpperCase());
            }},
        {"data": "lgcCodingProbability", render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "lgcLabel"}
    ];

    var _codonuseGColumns =[
        {"data": "taxonomy",
            render: function(value,row,index){
                return "<a href='/compodynamics/codpot?taxonomy_geno=" + value + "' >" + value.replace(value[0],value[0].toUpperCase()) + "</a>"
            }
        },
        {"data": "organism",
            render: function(value,row,index){
                return "<a href='/compodynamics/codpot?organism_geno=" + value + "' >" + value + "</a>"
            }},
        {"data": "cdsCount"},
        {"data": "assemblyAccession",
            render: function (value, type, row) {
                return '<a href="/compodynamics/geneomepage?term='+row["speciseIndex"]+'" target="_blank">' +
                    '<span class="label label-success">' + value + '</span></a>'
            }},
        {"data": "fickettScore", render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "cpc2CodingProbability", render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "cpc2Label",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "lgcCodingProbability", render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "lgcLabel",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "codingInBoth",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "codingInBoth",
            render: function (value, type, row) {
                return '<a name="box_coding"  data-codingpicid='+row["speciseIndex"]+ '><i class="fa fa-plus"></i></a>'
            }}
    ];

    _codingproTable = Codingproapp.initCodingproTables("/compodynamics/codpot/genes", _codonuseColumns);
    _codingproGTable = Codingproapp.initCodingproGTables("/compodynamics/codpot/genomes", _codonuseGColumns);
});

