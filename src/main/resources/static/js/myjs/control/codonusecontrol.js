var _codonuseTable;
var _codonuseGTable;

$(function () {

    var _codonuseColumns =[
        {"data": "taxonomy",
            render: function(value,row,index){
                return "<a href='/compodynamics/codonusage?taxonomy_gene=" + value + "' >" + value.replace(value[0],value[0].toUpperCase()) + "</a>"
            }
        },
        {"data": "organism",
            render: function(value,row,index){
                return "<a href='/compodynamics/codonusage?organism_gene=" + value + "' >" + value + "</a>"
            }},
        {"data": "assemblyAccession",
            render: function(value,row,index){
                return "<a href='/compodynamics/codonusage?assemblyAccession_gene=" + value + "' >" + value + "</a>"
            }},
        {"data": "geneId",
            render: function(value,row,index){
                return "<a href='/compodynamics/codonusage?gene_id=" + value + "' >" + value + "</a>"
            }},
        {"data": "proteinId",
            render: function (value, type, row) {
                return '<a href="/compodynamics/genepage?gene='+row["cdsIndex"]+'&genome='+row["speciseIndex"]+'" target="_blank">' +
                    '<span class="label label-success">' + value + '</span></a>'
            }},
        {"data": "observedAaa",
            render: function (value, type, row) {
                return '<a name="view_map"'+
                    ' data-aaa=' + row["observedAaa"] +
                    ' data-aag=' + row["observedAag"] +
                    ' data-aat=' + row["observedAat"] +
                    ' data-aac=' + row["observedAac"] +
                    ' data-taa=' + row["observedTaa"] +
                    ' data-tag=' + row["observedTag"] +
                    ' data-tat=' + row["observedTat"] +
                    ' data-tac=' + row["observedTac"] +
                    ' data-ata=' + row["observedAta"] +
                    ' data-atg=' + row["observedAtg"] +
                    ' data-att=' + row["observedAtt"] +
                    ' data-atc=' + row["observedAtc"] +
                    ' data-tta=' + row["observedTta"] +
                    ' data-ttg=' + row["observedTtg"] +
                    ' data-ttt=' + row["observedTtt"] +
                    ' data-ttc=' + row["observedTtc"] +
                    ' data-gaa=' + row["observedGaa"] +
                    ' data-gag=' + row["observedGag"] +
                    ' data-gat=' + row["observedGat"] +
                    ' data-gac=' + row["observedGac"] +
                    ' data-caa=' + row["observedCaa"] +
                    ' data-cag=' + row["observedCag"] +
                    ' data-cat=' + row["observedCat"] +
                    ' data-cac=' + row["observedCac"] +
                    ' data-gta=' + row["observedGta"] +
                    ' data-gtg=' + row["observedGtg"] +
                    ' data-gtt=' + row["observedGtt"] +
                    ' data-gtc=' + row["observedGtc"] +
                    ' data-cta=' + row["observedCta"] +
                    ' data-ctg=' + row["observedCtg"] +
                    ' data-ctt=' + row["observedCtt"] +
                    ' data-ctc=' + row["observedCtc"] +
                    ' data-aga=' + row["observedAga"] +
                    ' data-agg=' + row["observedAgg"] +
                    ' data-agt=' + row["observedAgt"] +
                    ' data-agc=' + row["observedAgc"] +
                    ' data-tga=' + row["observedTga"] +
                    ' data-tgg=' + row["observedTgg"] +
                    ' data-tgt=' + row["observedTgt"] +
                    ' data-tgc=' + row["observedTgc"] +
                    ' data-aca=' + row["observedAca"] +
                    ' data-acg=' + row["observedAcg"] +
                    ' data-act=' + row["observedAct"] +
                    ' data-acc=' + row["observedAcc"] +
                    ' data-tca=' + row["observedTca"] +
                    ' data-tcg=' + row["observedTcg"] +
                    ' data-tct=' + row["observedTct"] +
                    ' data-tcc=' + row["observedTcc"] +
                    ' data-gga=' + row["observedGga"] +
                    ' data-ggg=' + row["observedGgg"] +
                    ' data-ggt=' + row["observedGgt"] +
                    ' data-ggc=' + row["observedGgc"] +
                    ' data-cga=' + row["observedCga"] +
                    ' data-cgg=' + row["observedCgg"] +
                    ' data-cgt=' + row["observedCgt"] +
                    ' data-cgc=' + row["observedCgc"] +
                    ' data-gca=' + row["observedGca"] +
                    ' data-gcg=' + row["observedGcg"] +
                    ' data-gct=' + row["observedGct"] +
                    ' data-gcc=' + row["observedGcc"] +
                    ' data-cca=' + row["observedCca"] +
                    ' data-ccg=' + row["observedCcg"] +
                    ' data-cct=' + row["observedCct"] +
                    ' data-ccc=' + row["observedCcc"] +
                    '><i class="fa fa-plus"></i></a>'
            }
        },
        {"data": "observedAaa",
            render: function (value, type, row) {
                return '<a name="view_heat_map"'+
                    ' data-aaa=' + row["observedAaa"] +
                    ' data-aag=' + row["observedAag"] +
                    ' data-aat=' + row["observedAat"] +
                    ' data-aac=' + row["observedAac"] +
                    ' data-taa=' + row["observedTaa"] +
                    ' data-tag=' + row["observedTag"] +
                    ' data-tat=' + row["observedTat"] +
                    ' data-tac=' + row["observedTac"] +
                    ' data-ata=' + row["observedAta"] +
                    ' data-atg=' + row["observedAtg"] +
                    ' data-att=' + row["observedAtt"] +
                    ' data-atc=' + row["observedAtc"] +
                    ' data-tta=' + row["observedTta"] +
                    ' data-ttg=' + row["observedTtg"] +
                    ' data-ttt=' + row["observedTtt"] +
                    ' data-ttc=' + row["observedTtc"] +
                    ' data-gaa=' + row["observedGaa"] +
                    ' data-gag=' + row["observedGag"] +
                    ' data-gat=' + row["observedGat"] +
                    ' data-gac=' + row["observedGac"] +
                    ' data-caa=' + row["observedCaa"] +
                    ' data-cag=' + row["observedCag"] +
                    ' data-cat=' + row["observedCat"] +
                    ' data-cac=' + row["observedCac"] +
                    ' data-gta=' + row["observedGta"] +
                    ' data-gtg=' + row["observedGtg"] +
                    ' data-gtt=' + row["observedGtt"] +
                    ' data-gtc=' + row["observedGtc"] +
                    ' data-cta=' + row["observedCta"] +
                    ' data-ctg=' + row["observedCtg"] +
                    ' data-ctt=' + row["observedCtt"] +
                    ' data-ctc=' + row["observedCtc"] +
                    ' data-aga=' + row["observedAga"] +
                    ' data-agg=' + row["observedAgg"] +
                    ' data-agt=' + row["observedAgt"] +
                    ' data-agc=' + row["observedAgc"] +
                    ' data-tga=' + row["observedTga"] +
                    ' data-tgg=' + row["observedTgg"] +
                    ' data-tgt=' + row["observedTgt"] +
                    ' data-tgc=' + row["observedTgc"] +
                    ' data-aca=' + row["observedAca"] +
                    ' data-acg=' + row["observedAcg"] +
                    ' data-act=' + row["observedAct"] +
                    ' data-acc=' + row["observedAcc"] +
                    ' data-tca=' + row["observedTca"] +
                    ' data-tcg=' + row["observedTcg"] +
                    ' data-tct=' + row["observedTct"] +
                    ' data-tcc=' + row["observedTcc"] +
                    ' data-gga=' + row["observedGga"] +
                    ' data-ggg=' + row["observedGgg"] +
                    ' data-ggt=' + row["observedGgt"] +
                    ' data-ggc=' + row["observedGgc"] +
                    ' data-cga=' + row["observedCga"] +
                    ' data-cgg=' + row["observedCgg"] +
                    ' data-cgt=' + row["observedCgt"] +
                    ' data-cgc=' + row["observedCgc"] +
                    ' data-gca=' + row["observedGca"] +
                    ' data-gcg=' + row["observedGcg"] +
                    ' data-gct=' + row["observedGct"] +
                    ' data-gcc=' + row["observedGcc"] +
                    ' data-cca=' + row["observedCca"] +
                    ' data-ccg=' + row["observedCcg"] +
                    ' data-cct=' + row["observedCct"] +
                    ' data-ccc=' + row["observedCcc"] +
                    '><i class="fa fa-plus"></i></a>'
            }
        }

    ];
    var _codonuseGColumns =[
        {"data": "taxonomy",
            render: function(value,row,index){
                return "<a href='/compodynamics/codonusage?taxonomy_geno=" + value + "' >" + value.replace(value[0],value[0].toUpperCase()) + "</a>"
            }
        },
        {"data": "organism",
            render: function(value,row,index){
                return "<a href='/compodynamics/codonusage?organism_geno=" + value + "' >" + value + "</a>"
            }},
        {"data": "assemblyAccession",
            render: function (value, type, row) {
                return '<a href="/compodynamics/geneomepage?term='+row["speciseIndex"]+'" target="_blank">' +
                    '<span class="label label-success">' + value + '</span></a>'
            }},
        {"data": "cdsCount"},
        {"data": "observedAaa",
            render: function (value, type, row) {
                return '<a name="view_map"' +
                    ' data-aaa=' + row["observedAaa"] +
                    ' data-aag=' + row["observedAag"] +
                    ' data-aat=' + row["observedAat"] +
                    ' data-aac=' + row["observedAac"] +
                    ' data-taa=' + row["observedTaa"] +
                    ' data-tag=' + row["observedTag"] +
                    ' data-tat=' + row["observedTat"] +
                    ' data-tac=' + row["observedTac"] +
                    ' data-ata=' + row["observedAta"] +
                    ' data-atg=' + row["observedAtg"] +
                    ' data-att=' + row["observedAtt"] +
                    ' data-atc=' + row["observedAtc"] +
                    ' data-tta=' + row["observedTta"] +
                    ' data-ttg=' + row["observedTtg"] +
                    ' data-ttt=' + row["observedTtt"] +
                    ' data-ttc=' + row["observedTtc"] +
                    ' data-gaa=' + row["observedGaa"] +
                    ' data-gag=' + row["observedGag"] +
                    ' data-gat=' + row["observedGat"] +
                    ' data-gac=' + row["observedGac"] +
                    ' data-caa=' + row["observedCaa"] +
                    ' data-cag=' + row["observedCag"] +
                    ' data-cat=' + row["observedCat"] +
                    ' data-cac=' + row["observedCac"] +
                    ' data-gta=' + row["observedGta"] +
                    ' data-gtg=' + row["observedGtg"] +
                    ' data-gtt=' + row["observedGtt"] +
                    ' data-gtc=' + row["observedGtc"] +
                    ' data-cta=' + row["observedCta"] +
                    ' data-ctg=' + row["observedCtg"] +
                    ' data-ctt=' + row["observedCtt"] +
                    ' data-ctc=' + row["observedCtc"] +
                    ' data-aga=' + row["observedAga"] +
                    ' data-agg=' + row["observedAgg"] +
                    ' data-agt=' + row["observedAgt"] +
                    ' data-agc=' + row["observedAgc"] +
                    ' data-tga=' + row["observedTga"] +
                    ' data-tgg=' + row["observedTgg"] +
                    ' data-tgt=' + row["observedTgt"] +
                    ' data-tgc=' + row["observedTgc"] +
                    ' data-aca=' + row["observedAca"] +
                    ' data-acg=' + row["observedAcg"] +
                    ' data-act=' + row["observedAct"] +
                    ' data-acc=' + row["observedAcc"] +
                    ' data-tca=' + row["observedTca"] +
                    ' data-tcg=' + row["observedTcg"] +
                    ' data-tct=' + row["observedTct"] +
                    ' data-tcc=' + row["observedTcc"] +
                    ' data-gga=' + row["observedGga"] +
                    ' data-ggg=' + row["observedGgg"] +
                    ' data-ggt=' + row["observedGgt"] +
                    ' data-ggc=' + row["observedGgc"] +
                    ' data-cga=' + row["observedCga"] +
                    ' data-cgg=' + row["observedCgg"] +
                    ' data-cgt=' + row["observedCgt"] +
                    ' data-cgc=' + row["observedCgc"] +
                    ' data-gca=' + row["observedGca"] +
                    ' data-gcg=' + row["observedGcg"] +
                    ' data-gct=' + row["observedGct"] +
                    ' data-gcc=' + row["observedGcc"] +
                    ' data-cca=' + row["observedCca"] +
                    ' data-ccg=' + row["observedCcg"] +
                    ' data-cct=' + row["observedCct"] +
                    ' data-ccc=' + row["observedCcc"] +
                    '><i class="fa fa-plus"></i></a>'
            }
        },
        {
            "data": "observedAaa",
            render: function (value, type, row) {
                return '<a name="view_heat_map"' +
                    ' data-aaa=' + row["observedAaa"] +
                    ' data-aag=' + row["observedAag"] +
                    ' data-aat=' + row["observedAat"] +
                    ' data-aac=' + row["observedAac"] +
                    ' data-taa=' + row["observedTaa"] +
                    ' data-tag=' + row["observedTag"] +
                    ' data-tat=' + row["observedTat"] +
                    ' data-tac=' + row["observedTac"] +
                    ' data-ata=' + row["observedAta"] +
                    ' data-atg=' + row["observedAtg"] +
                    ' data-att=' + row["observedAtt"] +
                    ' data-atc=' + row["observedAtc"] +
                    ' data-tta=' + row["observedTta"] +
                    ' data-ttg=' + row["observedTtg"] +
                    ' data-ttt=' + row["observedTtt"] +
                    ' data-ttc=' + row["observedTtc"] +
                    ' data-gaa=' + row["observedGaa"] +
                    ' data-gag=' + row["observedGag"] +
                    ' data-gat=' + row["observedGat"] +
                    ' data-gac=' + row["observedGac"] +
                    ' data-caa=' + row["observedCaa"] +
                    ' data-cag=' + row["observedCag"] +
                    ' data-cat=' + row["observedCat"] +
                    ' data-cac=' + row["observedCac"] +
                    ' data-gta=' + row["observedGta"] +
                    ' data-gtg=' + row["observedGtg"] +
                    ' data-gtt=' + row["observedGtt"] +
                    ' data-gtc=' + row["observedGtc"] +
                    ' data-cta=' + row["observedCta"] +
                    ' data-ctg=' + row["observedCtg"] +
                    ' data-ctt=' + row["observedCtt"] +
                    ' data-ctc=' + row["observedCtc"] +
                    ' data-aga=' + row["observedAga"] +
                    ' data-agg=' + row["observedAgg"] +
                    ' data-agt=' + row["observedAgt"] +
                    ' data-agc=' + row["observedAgc"] +
                    ' data-tga=' + row["observedTga"] +
                    ' data-tgg=' + row["observedTgg"] +
                    ' data-tgt=' + row["observedTgt"] +
                    ' data-tgc=' + row["observedTgc"] +
                    ' data-aca=' + row["observedAca"] +
                    ' data-acg=' + row["observedAcg"] +
                    ' data-act=' + row["observedAct"] +
                    ' data-acc=' + row["observedAcc"] +
                    ' data-tca=' + row["observedTca"] +
                    ' data-tcg=' + row["observedTcg"] +
                    ' data-tct=' + row["observedTct"] +
                    ' data-tcc=' + row["observedTcc"] +
                    ' data-gga=' + row["observedGga"] +
                    ' data-ggg=' + row["observedGgg"] +
                    ' data-ggt=' + row["observedGgt"] +
                    ' data-ggc=' + row["observedGgc"] +
                    ' data-cga=' + row["observedCga"] +
                    ' data-cgg=' + row["observedCgg"] +
                    ' data-cgt=' + row["observedCgt"] +
                    ' data-cgc=' + row["observedCgc"] +
                    ' data-gca=' + row["observedGca"] +
                    ' data-gcg=' + row["observedGcg"] +
                    ' data-gct=' + row["observedGct"] +
                    ' data-gcc=' + row["observedGcc"] +
                    ' data-cca=' + row["observedCca"] +
                    ' data-ccg=' + row["observedCcg"] +
                    ' data-cct=' + row["observedCct"] +
                    ' data-ccc=' + row["observedCcc"] +
                    '><i class="fa fa-plus"></i></a>'
            }
        },
        {"data": "observedAsn",
            render: function (value, type, row) {
                return '<a name="box_codon"  data-codonpicid='+row["speciseIndex"]+ '><i class="fa fa-plus"></i></a>'
            }}
    ];
    _codonuseTable = Codonuseapp.initCodonuseTables("/compodynamics/codonusage/genes", _codonuseColumns);
    _codonuseGTable = Codonuseapp.initCodonuseGTables("/compodynamics/codonusage/genomes", _codonuseGColumns);
});


