var _synnuccomTable;
var _synnuccomGTable;

$(function () {

    var _synnuccomColumns =[
        {"data": "taxonomy",
            render: function(value,row,index){
                return "<a href='/compodynamics/synnuccop?taxonomy_gene=" + value + "' >" + value.replace(value[0],value[0].toUpperCase()) + "</a>"
            }
        },
        {"data": "organism",
            render: function(value,row,index){
                return "<a href='/compodynamics/synnuccop?organism_gene=" + value + "' >" + value + "</a>"
            }},
        {"data": "assemblyAccession",
            render: function(value,row,index){
                return "<a href='/compodynamics/synnuccop?assemblyAccession_gene=" + value + "' >" + value + "</a>"
            }},
        {"data": "geneId",
            render: function(value,row,index){
                return "<a href='/compodynamics/synnuccop?gene_id=" + value + "' >" + value + "</a>"
            }},
        {"data": "proteinId",
            render: function (value, type, row) {
                return '<a href="/compodynamics/genepage?gene='+row["cdsIndex"]+'&genome='+row["speciseIndex"]+'" target="_blank">' +
                    '<span class="label label-success">' + value + '</span></a>'
            }},
        {"data": "t3s", render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "c3s", render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "a3s", render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "g3s", render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "gc3s", render: function(value,row,index){
                return value.toPrecision(3);
            }}

    ];

    var _synnuccomGColumns =[
        {"data": "taxonomy",
            render: function(value,row,index){
                return "<a href='/compodynamics/synnuccop?taxonomy_geno=" + value + "' >" + value.replace(value[0],value[0].toUpperCase()) + "</a>"
            }
        },
        {"data": "organism",
            render: function(value,row,index){
                return "<a href='/compodynamics/synnuccop?organism_geno=" + value + "' >" + value + "</a>"
            }},
        {"data": "assemblyAccession",
            render: function (value, type, row) {
                return '<a href="/compodynamics/geneomepage?term='+row["speciseIndex"]+'" target="_blank">' +
                    '<span class="label label-success">' + value + '</span></a>'
            }},
        {"data": "cdsCount"},
        {"data": "t3s", render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "c3s", render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "a3s", render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "g3s", render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "gc3s", render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "gc3s",
            render: function (value, type, row) {
                return '<a name="box_nuc_cop_syn"  data-synnuccop='+row["speciseIndex"]+ '><i class="fa fa-plus"></i></a>'
            }}
    ];

    _synnuccomTable = Synnuccopapp.initSynTables("/compodynamics/synnuccop/genes", _synnuccomColumns);
    _synnuccomGTable = Synnuccopapp.initSynGTables("/compodynamics/synnuccop/genomes", _synnuccomGColumns);
});

