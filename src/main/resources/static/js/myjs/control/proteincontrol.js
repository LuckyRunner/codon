var _proteinTable;
var _proteinGTable;

$(function () {
    var _proteinColumns =[
        {"data": "taxonomy",
            render: function(value,row,index){
                return "<a href='/compodynamics/proteinfeature?taxonomy_gene=" + value + "' >" + value.replace(value[0],value[0].toUpperCase()) + "</a>"
            }
        },
        {"data": "organism",
            render: function(value,row,index){
                return "<a href='/compodynamics/proteinfeature?organism_gene=" + value + "' >" + value + "</a>"
            }},
        {"data": "assemblyAccession",
            render: function(value,row,index){
                return "<a href='/compodynamics/proteinfeature?assemblyAccession_gene=" + value + "' >" + value + "</a>"
            }},
        {"data": "geneId",
            render: function(value,row,index){
                return "<a href='/compodynamics/proteinfeature?gene_id=" + value + "' >" + value + "</a>"
            }},
        {"data": "proteinId",
            render: function (value, type, row) {
                return '<a href="/compodynamics/genepage?gene='+row["cdsIndex"]+'&genome='+row["speciseIndex"]+'" target="_blank">' +
                    '<span class="label label-success">' + value + '</span></a>'
            }},
        {"data": "mw",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "sa",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "rv",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "kdhydrophobicity",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "wwhydrophobicity",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "hhhydrophobicity",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "positive",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "negative",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "neutral",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "alpha",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "beta",
            render: function(value,row,index){
                return value.toPrecision(3);
            }}

    ];
    var _proteinGColumns =[
        {"data": "taxonomy",
            render: function(value,row,index){
                return "<a href='/compodynamics/proteinfeature?taxonomy_geno=" + value + "' >" + value.replace(value[0],value[0].toUpperCase()) + "</a>"
            }
        },
        {"data": "organism",
            render: function(value,row,index){
                return "<a href='/compodynamics/proteinfeature?organism_geno=" + value + "' >" + value + "</a>"
            }},
        {"data": "assemblyAccession",
            render: function (value, type, row) {
                return '<a href="/compodynamics/geneomepage?term='+row["speciseIndex"]+'" target="_blank">' +
                    '<span class="label label-success">' + value + '</span></a>'
            }},
        {"data": "cdsCount"},
        {"data": "mw",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "sa",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "rv",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "kdhydrophobicity",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "wwhydrophobicity",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "hhhydrophobicity",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "positive",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "negative",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "neutral",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "alpha",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "beta",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "codingInBoth",
            render: function (value, type, row) {
                return '<a name="box_protein"  data-proteinid='+row["speciseIndex"]+ '><i class="fa fa-plus"></i></a>'
            }}

    ];

    _proteinTable = Proteinapp.initProteinTables("/compodynamics/proteinfeature/genes", _proteinColumns);
    _proteinGTable = Proteinapp.initProteinGTables("/compodynamics/proteinfeature/genomes", _proteinGColumns);

});


