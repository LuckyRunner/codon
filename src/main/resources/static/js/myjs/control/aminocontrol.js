var _aminoTable;
var _aminoGTable;

$(function () {
    var _aminoColumns =[
        {"data": "taxonomy",
            render: function(value,row,index){
                return "<a href='/compodynamics/amino?taxonomy_gene=" + value + "' >" + value.replace(value[0],value[0].toUpperCase()) + "</a>"
            }
        },
        {"data": "organism",
            render: function(value,row,index){
                return "<a href='/compodynamics/amino?organism_gene=" + value + "' >" + value + "</a>"
            }},
        {"data": "assemblyAccession",
            render: function(value,row,index){
                return "<a href='/compodynamics/amino?assemblyAccession_gene=" + value + "' >" + value + "</a>"
            }},
        {"data": "geneId",
            render: function(value,row,index){
                return "<a href='/compodynamics/amino?gene_id=" + value + "' >" + value + "</a>"
            }},
        {"data": "proteinId",
            render: function (value, type, row) {
                return '<a href="/compodynamics/genepage?gene='+row["cdsIndex"]+'&genome='+row["speciseIndex"]+'" target="_blank">' +
                    '<span class="label label-success">' + value + '</span></a>'
            }},
        {"data": "observedAla",
            render: function (value, type, row) {
                return '<a name="view_amino" id="observed"'+
                    ' data-ala='+row["observedAla"]+
                    ' data-cys='+row["observedCys"]+
                    ' data-asp='+row["observedAsp"]+
                    ' data-glu='+row["observedGlu"]+
                    ' data-phe='+row["observedPhe"]+
                    ' data-gly='+row["observedGly"]+
                    ' data-his='+row["observedHis"]+
                    ' data-ile='+row["observedIle"]+
                    ' data-lys='+row["observedLys"]+
                    ' data-leu='+row["observedLeu"]+
                    ' data-met='+row["observedMet"]+
                    ' data-asn='+row["observedAsn"]+
                    ' data-pro='+row["observedPro"]+
                    ' data-gln='+row["observedGln"]+
                    ' data-arg='+row["observedArg"]+
                    ' data-ser='+row["observedSer"]+
                    ' data-thr='+row["observedThr"]+
                    ' data-val='+row["observedVal"]+
                    ' data-trp='+row["observedTrp"]+
                    ' data-tyr='+row["observedTyr"]+
                    '><i class="fa fa-plus"></i></a>'
            }
        }
    ];

    var _aminoGColumns =[
        {"data": "taxonomy",
            render: function(value,row,index){
                return "<a href='/compodynamics/amino?taxonomy_geno=" + value + "' >" + value.replace(value[0],value[0].toUpperCase()) + "</a>"
            }
        },
        {"data": "organism",
            render: function(value,row,index){
                return "<a href='/compodynamics/amino?organism_geno=" + value + "' >" + value + "</a>"
            }},
        {"data": "assemblyAccession",
            render: function (value, type, row) {
                return '<a href="/compodynamics/geneomepage?term='+row["speciesIndex"]+'" target="_blank"><span class="label label-success">' + value + '</span></a>'
            }},
        {"data": "cdsCount"},
        {"data": "observedAla",
            render: function (value, type, row) {
                return '<a name="view_amino" id="observed"'+
                    ' data-ala='+row["observedAla"]+
                    ' data-cys='+row["observedCys"]+
                    ' data-asp='+row["observedAsp"]+
                    ' data-glu='+row["observedGlu"]+
                    ' data-phe='+row["observedPhe"]+
                    ' data-gly='+row["observedGly"]+
                    ' data-his='+row["observedHis"]+
                    ' data-ile='+row["observedIle"]+
                    ' data-lys='+row["observedLys"]+
                    ' data-leu='+row["observedLeu"]+
                    ' data-met='+row["observedMet"]+
                    ' data-asn='+row["observedAsn"]+
                    ' data-pro='+row["observedPro"]+
                    ' data-gln='+row["observedGln"]+
                    ' data-arg='+row["observedArg"]+
                    ' data-ser='+row["observedSer"]+
                    ' data-thr='+row["observedThr"]+
                    ' data-val='+row["observedVal"]+
                    ' data-trp='+row["observedTrp"]+
                    ' data-tyr='+row["observedTyr"]+
                    '><i class="fa fa-plus"></i></a>'
            }
        },
        {"data": "observedAsn",
            render: function (value, type, row) {
                return '<a name="box_amino"  data-aminopicid='+row["speciesIndex"]+ '><i class="fa fa-plus"></i></a>'
            }}
    ];

    _aminoTable = Aminoapp.initMinoTables("/compodynamics/amino/genes", _aminoColumns);
    _aminoGTable = Aminoapp.initMinoGTables("/compodynamics/amino/genomes", _aminoGColumns);
});

function aminoSearch() {

    var taxonomy = $("#aminoTax1_select2").val();
    var organism = $("#aminoOrg1_select2").val();
    var assemblyAccession = $("#aminoAss1_select2").val();
    var geneId = $("#aminoGen1_select2").val();
    var proteinId = $("#aminoPro1_select2").val();

    var param = {
        "taxonomy": taxonomy,
        "organism": organism,
        "assemblyAccession": assemblyAccession,
        "geneId": geneId,
        "proteinId": proteinId
    };

    _aminoTable.settings()[0].ajax.data = param;
    _aminoTable.ajax.reload();

    _aminoGTable.settings()[0].ajax.data = param;
    _aminoGTable.ajax.reload();
}
