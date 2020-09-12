$(function () {
    $('#all_search').select2({
        minimumInputLength: 1,
        ajax: {
            url: '/compodynamics/all_list',
            data: function (params) {
                var query = {
                    term: params.term
                };
                return query;
            },
            cache: false
        },
        templateResult: formatState
    });

    $('#all_search').on('select2:select', function (e) {

        var term = $("#all_search").val();

        if (term.split("|")[1] == "Taxonomy") {
            $(location).attr('href', '/compodynamics/browse?taxonomy_geno='+ term.split("|")[0]);
        }
        if (term.split("|")[1] == "Organism") {
            $(location).attr('href', '/compodynamics/browse?organism_geno='+ term.split("|")[0]);
        }
        if (term.split("|")[1] == "AssemblyAccession") {
            $(location).attr('href', '/compodynamics/browse?assemblyAccession_gene='+ term.split("|")[0]);
        }
        if (term.split("|")[1] == "GeneId") {
            $(location).attr('href', '/compodynamics/browse?geneid_gene='+ term.split("|")[0]);
        }
        if (term.split("|")[1] == "GeneName") {
            $(location).attr('href', '/compodynamics/browse?gene_name='+ term.split("|")[0]);
        }
        if (term.split("|")[1] == "ProteinId") {
            $(location).attr('href', '/compodynamics/browse?protein_gene='+ term.split("|")[0]);
        }
        if (term.split("|")[1] == "ProteinName") {
            $(location).attr('href', '/compodynamics/browse?protein_name='+ term.split("|")[0]);
        }
    });
});

function formatState (state) {
    var $state = $("<span>" + state.text.split("|")[0]+"</span><span style='float: right'><kbd>" + state.text.split("|")[1]+"</kbd></span>");
    return $state;
}

String.prototype.replaceAll = function (FindText, RepText) {
    regExp = new RegExp(FindText, "g");
    return this.replace(regExp, RepText);
};


