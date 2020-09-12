var _usagebiasTable;
var _usagebiasGTable;

$(function () {

    var _usagebiasColumns =[
        {"data": "taxonomy",
            render: function(value,row,index){
                return "<a href='/compodynamics/usagebias?taxonomy_gene=" + value + "' >" + value.replace(value[0],value[0].toUpperCase()) + "</a>"
            }
        },
        {"data": "organism",
            render: function(value,row,index){
                return "<a href='/compodynamics/usagebias?organism_gene=" + value + "' >" + value + "</a>"
            }},
        {"data": "assemblyAccession",
            render: function(value,row,index){
                return "<a href='/compodynamics/usagebias?assemblyAccession_gene=" + value + "' >" + value + "</a>"
            }},
        {"data": "geneId",
            render: function(value,row,index){
                return "<a href='/compodynamics/usagebias?gene_id=" + value + "' >" + value + "</a>"
            }},
        {"data": "proteinId",
            render: function (value, type, row) {
                return '<a href="/compodynamics/genepage?gene='+row["cdsIndex"]+'&genome='+row["speciseIndex"]+'" target="_blank">' +
                    '<span class="label label-success">' + value + '</span></a>'
            }},
        {"data": "cdc", render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "enc", render: function(value,row,index){
                return value.toPrecision(5);
            }},
        {"data": "rscuAaa",
            render: function (value, type, row) {
                return '<a name="view_map" id="observed"' +
                    ' data-aaa=' + row["rscuAaa"] +
                    ' data-aag=' + row["rscuAag"] +
                    ' data-aat=' + row["rscuAat"] +
                    ' data-aac=' + row["rscuAac"] +
                    ' data-taa=' + row["rscuTaa"] +
                    ' data-tag=' + row["rscuTag"] +
                    ' data-tat=' + row["rscuTat"] +
                    ' data-tac=' + row["rscuTac"] +
                    ' data-ata=' + row["rscuAta"] +
                    ' data-atg=' + row["rscuAtg"] +
                    ' data-att=' + row["rscuAtt"] +
                    ' data-atc=' + row["rscuAtc"] +
                    ' data-tta=' + row["rscuTta"] +
                    ' data-ttg=' + row["rscuTtg"] +
                    ' data-ttt=' + row["rscuTtt"] +
                    ' data-ttc=' + row["rscuTtc"] +
                    ' data-gaa=' + row["rscuGaa"] +
                    ' data-gag=' + row["rscuGag"] +
                    ' data-gat=' + row["rscuGat"] +
                    ' data-gac=' + row["rscuGac"] +
                    ' data-caa=' + row["rscuCaa"] +
                    ' data-cag=' + row["rscuCag"] +
                    ' data-cat=' + row["rscuCat"] +
                    ' data-cac=' + row["rscuCac"] +
                    ' data-gta=' + row["rscuGta"] +
                    ' data-gtg=' + row["rscuGtg"] +
                    ' data-gtt=' + row["rscuGtt"] +
                    ' data-gtc=' + row["rscuGtc"] +
                    ' data-cta=' + row["rscuCta"] +
                    ' data-ctg=' + row["rscuCtg"] +
                    ' data-ctt=' + row["rscuCtt"] +
                    ' data-ctc=' + row["rscuCtc"] +
                    ' data-aga=' + row["rscuAga"] +
                    ' data-agg=' + row["rscuAgg"] +
                    ' data-agt=' + row["rscuAgt"] +
                    ' data-agc=' + row["rscuAgc"] +
                    ' data-tga=' + row["rscuTga"] +
                    ' data-tgg=' + row["rscuTgg"] +
                    ' data-tgt=' + row["rscuTgt"] +
                    ' data-tgc=' + row["rscuTgc"] +
                    ' data-aca=' + row["rscuAca"] +
                    ' data-acg=' + row["rscuAcg"] +
                    ' data-act=' + row["rscuAct"] +
                    ' data-acc=' + row["rscuAcc"] +
                    ' data-tca=' + row["rscuTca"] +
                    ' data-tcg=' + row["rscuTcg"] +
                    ' data-tct=' + row["rscuTct"] +
                    ' data-tcc=' + row["rscuTcc"] +
                    ' data-gga=' + row["rscuGga"] +
                    ' data-ggg=' + row["rscuGgg"] +
                    ' data-ggt=' + row["rscuGgt"] +
                    ' data-ggc=' + row["rscuGgc"] +
                    ' data-cga=' + row["rscuCga"] +
                    ' data-cgg=' + row["rscuCgg"] +
                    ' data-cgt=' + row["rscuCgt"] +
                    ' data-cgc=' + row["rscuCgc"] +
                    ' data-gca=' + row["rscuGca"] +
                    ' data-gcg=' + row["rscuGcg"] +
                    ' data-gct=' + row["rscuGct"] +
                    ' data-gcc=' + row["rscuGcc"] +
                    ' data-cca=' + row["rscuCca"] +
                    ' data-ccg=' + row["rscuCcg"] +
                    ' data-cct=' + row["rscuCct"] +
                    ' data-ccc=' + row["rscuCcc"] +
                    '><i class="fa fa-plus"></i></a>'
            }
        },
        {"data": "rscuAaa",
            render: function (value, type, row) {
                return '<a name="view_heat_map"' +
                    ' data-aaa=' + row["rscuAaa"] +
                    ' data-aag=' + row["rscuAag"] +
                    ' data-aat=' + row["rscuAat"] +
                    ' data-aac=' + row["rscuAac"] +
                    ' data-taa=' + row["rscuTaa"] +
                    ' data-tag=' + row["rscuTag"] +
                    ' data-tat=' + row["rscuTat"] +
                    ' data-tac=' + row["rscuTac"] +
                    ' data-ata=' + row["rscuAta"] +
                    ' data-atg=' + row["rscuAtg"] +
                    ' data-att=' + row["rscuAtt"] +
                    ' data-atc=' + row["rscuAtc"] +
                    ' data-tta=' + row["rscuTta"] +
                    ' data-ttg=' + row["rscuTtg"] +
                    ' data-ttt=' + row["rscuTtt"] +
                    ' data-ttc=' + row["rscuTtc"] +
                    ' data-gaa=' + row["rscuGaa"] +
                    ' data-gag=' + row["rscuGag"] +
                    ' data-gat=' + row["rscuGat"] +
                    ' data-gac=' + row["rscuGac"] +
                    ' data-caa=' + row["rscuCaa"] +
                    ' data-cag=' + row["rscuCag"] +
                    ' data-cat=' + row["rscuCat"] +
                    ' data-cac=' + row["rscuCac"] +
                    ' data-gta=' + row["rscuGta"] +
                    ' data-gtg=' + row["rscuGtg"] +
                    ' data-gtt=' + row["rscuGtt"] +
                    ' data-gtc=' + row["rscuGtc"] +
                    ' data-cta=' + row["rscuCta"] +
                    ' data-ctg=' + row["rscuCtg"] +
                    ' data-ctt=' + row["rscuCtt"] +
                    ' data-ctc=' + row["rscuCtc"] +
                    ' data-aga=' + row["rscuAga"] +
                    ' data-agg=' + row["rscuAgg"] +
                    ' data-agt=' + row["rscuAgt"] +
                    ' data-agc=' + row["rscuAgc"] +
                    ' data-tga=' + row["rscuTga"] +
                    ' data-tgg=' + row["rscuTgg"] +
                    ' data-tgt=' + row["rscuTgt"] +
                    ' data-tgc=' + row["rscuTgc"] +
                    ' data-aca=' + row["rscuAca"] +
                    ' data-acg=' + row["rscuAcg"] +
                    ' data-act=' + row["rscuAct"] +
                    ' data-acc=' + row["rscuAcc"] +
                    ' data-tca=' + row["rscuTca"] +
                    ' data-tcg=' + row["rscuTcg"] +
                    ' data-tct=' + row["rscuTct"] +
                    ' data-tcc=' + row["rscuTcc"] +
                    ' data-gga=' + row["rscuGga"] +
                    ' data-ggg=' + row["rscuGgg"] +
                    ' data-ggt=' + row["rscuGgt"] +
                    ' data-ggc=' + row["rscuGgc"] +
                    ' data-cga=' + row["rscuCga"] +
                    ' data-cgg=' + row["rscuCgg"] +
                    ' data-cgt=' + row["rscuCgt"] +
                    ' data-cgc=' + row["rscuCgc"] +
                    ' data-gca=' + row["rscuGca"] +
                    ' data-gcg=' + row["rscuGcg"] +
                    ' data-gct=' + row["rscuGct"] +
                    ' data-gcc=' + row["rscuGcc"] +
                    ' data-cca=' + row["rscuCca"] +
                    ' data-ccg=' + row["rscuCcg"] +
                    ' data-cct=' + row["rscuCct"] +
                    ' data-ccc=' + row["rscuCcc"] +
                    '><i class="fa fa-plus"></i></a>'
            }
        }
    ];

    var _usagebiasGColumns =[
        {"data": "taxonomy",
            render: function(value,row,index){
                return "<a href='/compodynamics/usagebias?taxonomy_geno=" + value + "' >" + value.replace(value[0],value[0].toUpperCase()) + "</a>"
            }
        },
        {"data": "organism",
            render: function(value,row,index){
                return "<a href='/compodynamics/usagebias?organism_geno=" + value + "' >" + value + "</a>"
            }},
        {"data": "assemblyAccession",
            render: function (value, type, row) {
                return '<a href="/compodynamics/geneomepage?term='+row["speciseIndex"]+'" target="_blank">' +
                    '<span class="label label-success">' + value + '</span></a>'
            }},
        {"data": "cdsCount"},
        {"data": "cdc", render: function(value,row,index){
                return value.toPrecision(3);
            }},
        {"data": "enc", render: function(value,row,index){
                return value.toPrecision(5);
            }},
        {"data": "rscuAaa",
            render: function (value, type, row) {
                return '<a name="view_map"' +
                    ' data-aaa=' + row["rscuAaa"] +
                    ' data-aag=' + row["rscuAag"] +
                    ' data-aat=' + row["rscuAat"] +
                    ' data-aac=' + row["rscuAac"] +
                    ' data-taa=' + row["rscuTaa"] +
                    ' data-tag=' + row["rscuTag"] +
                    ' data-tat=' + row["rscuTat"] +
                    ' data-tac=' + row["rscuTac"] +
                    ' data-ata=' + row["rscuAta"] +
                    ' data-atg=' + row["rscuAtg"] +
                    ' data-att=' + row["rscuAtt"] +
                    ' data-atc=' + row["rscuAtc"] +
                    ' data-tta=' + row["rscuTta"] +
                    ' data-ttg=' + row["rscuTtg"] +
                    ' data-ttt=' + row["rscuTtt"] +
                    ' data-ttc=' + row["rscuTtc"] +
                    ' data-gaa=' + row["rscuGaa"] +
                    ' data-gag=' + row["rscuGag"] +
                    ' data-gat=' + row["rscuGat"] +
                    ' data-gac=' + row["rscuGac"] +
                    ' data-caa=' + row["rscuCaa"] +
                    ' data-cag=' + row["rscuCag"] +
                    ' data-cat=' + row["rscuCat"] +
                    ' data-cac=' + row["rscuCac"] +
                    ' data-gta=' + row["rscuGta"] +
                    ' data-gtg=' + row["rscuGtg"] +
                    ' data-gtt=' + row["rscuGtt"] +
                    ' data-gtc=' + row["rscuGtc"] +
                    ' data-cta=' + row["rscuCta"] +
                    ' data-ctg=' + row["rscuCtg"] +
                    ' data-ctt=' + row["rscuCtt"] +
                    ' data-ctc=' + row["rscuCtc"] +
                    ' data-aga=' + row["rscuAga"] +
                    ' data-agg=' + row["rscuAgg"] +
                    ' data-agt=' + row["rscuAgt"] +
                    ' data-agc=' + row["rscuAgc"] +
                    ' data-tga=' + row["rscuTga"] +
                    ' data-tgg=' + row["rscuTgg"] +
                    ' data-tgt=' + row["rscuTgt"] +
                    ' data-tgc=' + row["rscuTgc"] +
                    ' data-aca=' + row["rscuAca"] +
                    ' data-acg=' + row["rscuAcg"] +
                    ' data-act=' + row["rscuAct"] +
                    ' data-acc=' + row["rscuAcc"] +
                    ' data-tca=' + row["rscuTca"] +
                    ' data-tcg=' + row["rscuTcg"] +
                    ' data-tct=' + row["rscuTct"] +
                    ' data-tcc=' + row["rscuTcc"] +
                    ' data-gga=' + row["rscuGga"] +
                    ' data-ggg=' + row["rscuGgg"] +
                    ' data-ggt=' + row["rscuGgt"] +
                    ' data-ggc=' + row["rscuGgc"] +
                    ' data-cga=' + row["rscuCga"] +
                    ' data-cgg=' + row["rscuCgg"] +
                    ' data-cgt=' + row["rscuCgt"] +
                    ' data-cgc=' + row["rscuCgc"] +
                    ' data-gca=' + row["rscuGca"] +
                    ' data-gcg=' + row["rscuGcg"] +
                    ' data-gct=' + row["rscuGct"] +
                    ' data-gcc=' + row["rscuGcc"] +
                    ' data-cca=' + row["rscuCca"] +
                    ' data-ccg=' + row["rscuCcg"] +
                    ' data-cct=' + row["rscuCct"] +
                    ' data-ccc=' + row["rscuCcc"] +
                    '><i class="fa fa-plus"></i></a>'
            }
        },
        {"data": "rscuAaa",
            render: function (value, type, row) {
                return '<a name="view_heat_map"' +
                    ' data-aaa=' + row["rscuAaa"] +
                    ' data-aag=' + row["rscuAag"] +
                    ' data-aat=' + row["rscuAat"] +
                    ' data-aac=' + row["rscuAac"] +
                    ' data-taa=' + row["rscuTaa"] +
                    ' data-tag=' + row["rscuTag"] +
                    ' data-tat=' + row["rscuTat"] +
                    ' data-tac=' + row["rscuTac"] +
                    ' data-ata=' + row["rscuAta"] +
                    ' data-atg=' + row["rscuAtg"] +
                    ' data-att=' + row["rscuAtt"] +
                    ' data-atc=' + row["rscuAtc"] +
                    ' data-tta=' + row["rscuTta"] +
                    ' data-ttg=' + row["rscuTtg"] +
                    ' data-ttt=' + row["rscuTtt"] +
                    ' data-ttc=' + row["rscuTtc"] +
                    ' data-gaa=' + row["rscuGaa"] +
                    ' data-gag=' + row["rscuGag"] +
                    ' data-gat=' + row["rscuGat"] +
                    ' data-gac=' + row["rscuGac"] +
                    ' data-caa=' + row["rscuCaa"] +
                    ' data-cag=' + row["rscuCag"] +
                    ' data-cat=' + row["rscuCat"] +
                    ' data-cac=' + row["rscuCac"] +
                    ' data-gta=' + row["rscuGta"] +
                    ' data-gtg=' + row["rscuGtg"] +
                    ' data-gtt=' + row["rscuGtt"] +
                    ' data-gtc=' + row["rscuGtc"] +
                    ' data-cta=' + row["rscuCta"] +
                    ' data-ctg=' + row["rscuCtg"] +
                    ' data-ctt=' + row["rscuCtt"] +
                    ' data-ctc=' + row["rscuCtc"] +
                    ' data-aga=' + row["rscuAga"] +
                    ' data-agg=' + row["rscuAgg"] +
                    ' data-agt=' + row["rscuAgt"] +
                    ' data-agc=' + row["rscuAgc"] +
                    ' data-tga=' + row["rscuTga"] +
                    ' data-tgg=' + row["rscuTgg"] +
                    ' data-tgt=' + row["rscuTgt"] +
                    ' data-tgc=' + row["rscuTgc"] +
                    ' data-aca=' + row["rscuAca"] +
                    ' data-acg=' + row["rscuAcg"] +
                    ' data-act=' + row["rscuAct"] +
                    ' data-acc=' + row["rscuAcc"] +
                    ' data-tca=' + row["rscuTca"] +
                    ' data-tcg=' + row["rscuTcg"] +
                    ' data-tct=' + row["rscuTct"] +
                    ' data-tcc=' + row["rscuTcc"] +
                    ' data-gga=' + row["rscuGga"] +
                    ' data-ggg=' + row["rscuGgg"] +
                    ' data-ggt=' + row["rscuGgt"] +
                    ' data-ggc=' + row["rscuGgc"] +
                    ' data-cga=' + row["rscuCga"] +
                    ' data-cgg=' + row["rscuCgg"] +
                    ' data-cgt=' + row["rscuCgt"] +
                    ' data-cgc=' + row["rscuCgc"] +
                    ' data-gca=' + row["rscuGca"] +
                    ' data-gcg=' + row["rscuGcg"] +
                    ' data-gct=' + row["rscuGct"] +
                    ' data-gcc=' + row["rscuGcc"] +
                    ' data-cca=' + row["rscuCca"] +
                    ' data-ccg=' + row["rscuCcg"] +
                    ' data-cct=' + row["rscuCct"] +
                    ' data-ccc=' + row["rscuCcc"] +
                    '><i class="fa fa-plus"></i></a>'
            }
        },
        {"data": "rscuTcg",
            render: function (value, type, row) {
                return '<a name="box_bias"  data-biaspicid='+row["speciseIndex"]+ '><i class="fa fa-plus"></i></a>'
            }}
    ];

    _usagebiasTable = Usagebiasapp.initUsagebiasTables("/compodynamics/usagebias/genes", _usagebiasColumns);
    _usagebiasGTable = Usagebiasapp.initUsagebiasGTables("/compodynamics/usagebias/genomes", _usagebiasGColumns);
});
