var _speciesTable;
var _geneTable;

$(function () {
    var _speciesColumns =[
        {"data": "taxid"},
        {"data": "taxonomy",
            render: function(value,row,index){
                return "<a href='/compodynamics/browse?taxonomy_geno=" + value + "' >" + value.replace(value[0],value[0].toUpperCase()) + "</a>"
                // return "<a href='#' onclick='speciesA(this.value)' >" + value.replace(value[0],value[0].toUpperCase()) + "</a>"
            }},
        {"data": "organism",
            render: function(value,row,index){
                return "<a href='/compodynamics/browse?organism_geno=" + value + "' >" + value + "</a>"
            }},
        {"data": "assemblyAccession",
            render: function (value, type, row) {
                return '<a href="/compodynamics/geneomepage?term='+row["speciseIndex"]+'" target="_blank">' +
                    '<span class="label label-success">' + value + '</span></a>'
            }},
        {"data": "bioproject"},
        {"data": "biosample"},
        {"data": "refseqCategory"},
        {"data": "versionStatus"},
        {"data": "assemblyLevel"},
        {"data": "geneticCode"}

    ];

    var _geneColumns =[
        {"data": "taxonomy",
            render: function(value,row,index){
                return "<a href='/compodynamics/browse?taxonomy_gene=" + value + "' >" + value.replace(value[0],value[0].toUpperCase()) + "</a>"
            }
        },
        {"data": "organism",
            render: function(value,row,index){
                return "<a href='/compodynamics/browse?organism_gene=" + value + "' >" + value + "</a>"
            }},
        {"data": "assemblyAccession",
            render: function (value, type, row) {
                return '<a href="/compodynamics/browse?assemblyAccession_gene='+row["assemblyAccession"]+'">' + value + '</a>'
            }},
        {"data": "geneId",
            render: function (value, type, row) {
                return '<a href="/compodynamics/browse?gene_id='+row["geneId"]+'">' + value + '</a>'
            }},
        {"data": "geneName",
            render: function (value, type, row) {
                return '<a href="/compodynamics/browse?gene_name='+row["geneName"]+'">' + value + '</a>'
            }},
        {"data": "proteinId",
            render: function (value, type, row) {
                return '<a href="/compodynamics/genepage?gene='+row["geneIndex"]+'&genome='+row["fileIndex"]+'" target="_blank">' +
                    '<span class="label label-success">' + value + '</span></a>'
            }},
        {"data": "proteinName",
            render: function (value, type, row) {
                return '<a href="/compodynamics/browse?protein_name='+row["proteinName"]+'">' + value + '</a>'
            }},
        {"data": "lowQuality",
            render: function (value, type, row) {
                return '<a href="/compodynamics/browse?quality='+row["lowQuality"]+'">' + value + '</a>'
            }}
    ];

    _speciesTable = Browseapp.initSpeciesTables("/compodynamics/browse/genomes", _speciesColumns);
    _geneTable = Browseapp.initGeneTables("/compodynamics/browse/genes", _geneColumns);
});


