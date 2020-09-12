var _nuccomTable;
var _nuccomGTable;

$(function () {

    var _nuccomColumns =[
        {"data": "taxonomy",
            render: function(value,row,index){
                return "<a href='/compodynamics/nucleotidecop?taxonomy_gene=" + value + "' >" + value.replace(value[0],value[0].toUpperCase()) + "</a>"
            }
        },
        {"data": "organism",
            render: function(value,row,index){
                return "<a href='/compodynamics/nucleotidecop?organism_gene=" + value + "' >" + value + "</a>"
            }},
        {"data": "assemblyAccession",
            render: function(value,row,index){
                return "<a href='/compodynamics/nucleotidecop?assemblyAccession_gene=" + value + "' >" + value + "</a>"
            }},
        {"data": "geneId",
            render: function(value,row,index){
                return "<a href='/compodynamics/nucleotidecop?gene_id=" + value + "' >" + value + "</a>"
            }},
        {"data": "proteinId",
            render: function (value, type, row) {
                return '<a href="/compodynamics/genepage?gene='+row["cdsIndex"]+'&genome='+row["speciseIndex"]+'" target="_blank">' +
                    '<span class="label label-success">' + value + '</span></a>'
            }},
        {"data": "length"},
        {"data": "gc",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "ag",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "gc1",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "ag1",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "gc2",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "ag2",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "gc3",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "ag3",
            render: function(value,row,index){
                return value.toPrecision(3);
            }}

    ];

    var _nuccomGColumns =[
        {"data": "taxonomy",
            render: function(value,row,index){
                return "<a href='/compodynamics/nucleotidecop?taxonomy_geno=" + value + "' >" + value.replace(value[0],value[0].toUpperCase()) + "</a>"
            }
        },
        {"data": "organism",
            render: function(value,row,index){
                return "<a href='/compodynamics/nucleotidecop?organism_geno=" + value + "' >" + value + "</a>"
            }},
        {"data": "assemblyAccession",
            render: function (value, type, row) {
                return '<a href="/compodynamics/geneomepage?term='+row["speciseIndex"]+'" target="_blank">' +
                    '<span class="label label-success">' + value + '</span></a>'
            }},
        {"data": "cdsCount"},
        {"data": "gc",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "ag",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "gc1",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "ag1",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "gc2",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "ag2",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "gc3",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "ag3",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "ag3",
            render: function (value, type, row) {
                return '<a name="box_nuc_cop"  data-nuccop='+row["speciseIndex"]+ '><i class="fa fa-plus"></i></a>'
            }}
    ];

    _nuccomTable = Nuccopapp.initNuccomTables("/compodynamics/nucleotidecop/genes", _nuccomColumns);
    _nuccomGTable = Nuccopapp.initNuccomGTables("/compodynamics/nucleotidecop/genomes", _nuccomGColumns);
});
