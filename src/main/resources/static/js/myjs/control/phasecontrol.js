var _phaseTable;
var _phaseGTable;

$(function () {
    var _phaseColumns =[
        {"data": "taxonomy",
            render: function(value,row,index){
                return "<a href='/compodynamics/phase?taxonomy_gene=" + value + "' >" + value.replace(value[0],value[0].toUpperCase()) + "</a>"
            }
        },
        {"data": "organism",
            render: function(value,row,index){
                return "<a href='/compodynamics/phase?organism_gene=" + value + "' >" + value + "</a>"
            }},
        {"data": "assemblyAccession",
            render: function(value,row,index){
                return "<a href='/compodynamics/phase?assemblyAccession_gene=" + value + "' >" + value + "</a>"
            }},
        {"data": "geneId",
            render: function(value,row,index){
                return "<a href='/compodynamics/phase?gene_id=" + value + "' >" + value + "</a>"
            }},
        {"data": "proteinId",
            render: function (value, type, row) {
                return '<a href="/compodynamics/genepage?gene='+row["cdsIndex"]+'&genome='+row["speciseIndex"]+'" target="_blank">' +
                    '<span class="label label-success">' + value + '</span></a>'
            }},
        {"data": "llr",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "coreScore"},
        {"data": "papaProp",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "papaFi",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "aaLength"},
        {"data": "disorderPercent",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "disorder30aaNum"},
        {"data": "disorder30aaLoc"},
        {"data": "disorder50aaNum"},
        {"data": "disorder50aaLoc"},
        {"data": "disorderSegmentNum"},
        {"data": "disorderSegmentLen"},
        {"data": "psCore"}
    ];

    var _phaseGColumns =[
        {"data": "taxonomy",
            render: function(value,row,index){
                return "<a href='/compodynamics/phase?taxonomy_geno=" + value + "' >" + value.replace(value[0],value[0].toUpperCase()) + "</a>"
            }
        },
        {"data": "organism",
            render: function(value,row,index){
                return "<a href='/compodynamics/phase?organism_geno=" + value + "' >" + value + "</a>"
            }},
        {"data": "assemblyAccession",
            render: function (value, type, row) {
                return '<a href="/compodynamics/geneomepage?term='+row["speciseIndex"]+'" target="_blank"><span class="label label-success">' + value + '</span></a>'
            }},
        {"data": "cdsCount"},
        {"data": "llr",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "coreScore"},
        {"data": "papaProp",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "papaFi",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "aaLength"},
        {"data": "disorderPercent",
            render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "disorder30aaNum"},
        {"data": "disorder50aaNum"},
        {"data": "disorderSegmentNum"},
        {"data": "psCore"},
        {"data": "psCore",
            render: function (value, type, row) {
                return '<a name="box_phase"  data-phasepicid='+row["speciseIndex"]+ '><i class="fa fa-plus"></i></a>'
            }}
    ];

    _phaseTable = Phaseapp.initPhaseTables("/compodynamics/phase/genes", _phaseColumns);
    _phaseGTable = Phaseapp.initPhaseGTables("/compodynamics/phase/genomes", _phaseGColumns);
});

function phaseSearch() {

    var taxonomy = $("#phaseTax_select2").val();
    var organism = $("#phaseOrg_select2").val();
    var assemblyAccession = $("#phaseAss_select2").val();
    var geneId = $("#phaseGen_select2").val();
    var proteinId = $("#phasePro_select2").val();

    var param = {
        "taxonomy": taxonomy,
        "organism": organism,
        "assemblyAccession": assemblyAccession,
        "geneId": geneId,
        "proteinId": proteinId
    };

    _phaseTable.settings()[0].ajax.data = param;
    _phaseTable.ajax.reload();

    _phaseGTable.settings()[0].ajax.data = param;
    _phaseGTable.ajax.reload();
}
