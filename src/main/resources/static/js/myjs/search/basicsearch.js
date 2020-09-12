$(function () {
    basicjunp()
});

function formatState (state) {
    var $state = $("<span>" + state.text.split("|")[0]+"</span><span style='float: right'><kbd>" + state.text.split("|")[1]+"</kbd></span>");
    return $state;
}

String.prototype.replaceAll = function (FindText, RepText) {
    regExp = new RegExp(FindText, "g");
    return this.replace(regExp, RepText);
};

function basicjunp() {

    a = decodeURI(window.location.href);

    if (a.search("taxonomy_geno=") != -1) {
        var reg = /taxonomy_geno=(.*)$/ig;
        var b = reg.exec(a);
        var newOption = new Option(b[1], b[1], true, true);
        $('#browse_tax_gen').append(newOption).trigger('change');
        return null;
    }

    if (a.search("organism_geno=") != -1) {
        var reg = /organism_geno=(.*)$/ig;
        var b = reg.exec(a);
        var newOption = new Option(b[1], b[1], true, true);
        $('#browse_org_gen').append(newOption).trigger('change');
        return null;
    }

    if (a.search("taxonomy_gene=") != -1) {
        var reg = /taxonomy_gene=(.*)$/ig;
        var b = reg.exec(a);
        var newOption = new Option(b[1], b[1], true, true);
        $('#li_gene a').tab('show');
        $('#browse_tax_gen').append(newOption).trigger('change');
        return null;
    }
    if (a.search("organism_gene=") != -1) {
        var reg = /organism_gene=(.*)$/ig;
        var b = reg.exec(a);
        var newOption = new Option(b[1], b[1], true, true);
        $('#li_gene a').tab('show');
        $('#browse_org_gen').append(newOption).trigger('change');
        return null;
    }
    if (a.search("assemblyAccession_gene=") != -1) {
        var reg = /assemblyAccession_gene=(.*)$/ig;
        var b = reg.exec(a);
        var newOption = new Option(b[1], b[1], true, true);
        $('#li_gene a').tab('show');
        $('#browse_ass_gen').append(newOption).trigger('change');
        return null;
    }

    if (a.search("gene_id=") != -1) {
        var reg = /gene_id=(.*)$/ig;
        var b = reg.exec(a);
        var newOption = new Option(b[1], b[1], true, true);
        $('#li_gene a').tab('show');
        $('#browse_geni_gen').append(newOption).trigger('change');
        return null;
    }

    if (a.search("gene_name=") != -1) {
        var reg = /gene_name=(.*)$/ig;
        var b = reg.exec(a);
        var newOption = new Option(b[1], b[1], true, true);
        $('#li_gene a').tab('show');
        $('#browse_genn_gen').append(newOption).trigger('change');

        return null;
    }

    if (a.search("protein_name=") != -1) {
        var reg = /protein_name=(.*)$/ig;
        var b = reg.exec(a);
        var newOption = new Option(b[1], b[1], true, true);
        $('#li_gene a').tab('show');
        $('#browse_prn_gen').append(newOption).trigger('change');
        return null;
    }
    if (a.search("quality=") != -1) {
        var reg = /quality=(.*)$/ig;
        var b = reg.exec(a);
        var newOption = new Option(b[1], b[1], true, true);
        $('#li_gene a').tab('show');
        $('#browse_quality_gen').append(newOption).trigger('change');
        return null;
    }
    if (a.search("protein_id=") != -1) {
        var reg = /protein_id=(.*)$/ig;
        var b = reg.exec(a);
        var newOption = new Option(b[1], b[1], true, true);
        $('#li_gene a').tab('show');
        $('#browse_proi_gen').append(newOption).trigger('change');
        return null;
    }
}

$('#browseTabs a').click(function (e) {
    e.preventDefault();
    $(this).tab('show')
});
