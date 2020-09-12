$(function () {
    nucjunp()
});

String.prototype.replaceAll = function (FindText, RepText) {
    regExp = new RegExp(FindText, "g");
    return this.replace(regExp, RepText);
};

function nucjunp() {

    a = decodeURI(window.location.href);

    if (a.search("taxonomy_geno=") != -1) {
        var reg = /taxonomy_geno=(.*)$/ig;
        var b = reg.exec(a);
        var newOption = new Option(b[1], b[1], true, true);
        $('#nuccom_gen_tax').append(newOption).trigger('change');
        return null;
    }
    if (a.search("organism_geno=") != -1) {
        var reg = /organism_geno=(.*)$/ig;
        var b = reg.exec(a);
        var newOption = new Option(b[1], b[1], true, true);
        $('#nuccom_gen_org').append(newOption).trigger('change');
        return null;
    }

    if (a.search("taxonomy_gene=") != -1) {
        var reg = /taxonomy_gene=(.*)$/ig;
        var b = reg.exec(a);
        var newOption = new Option(b[1], b[1], true, true);
        $('#li_gene a').tab('show');
        $('#nuccom_gen_tax').append(newOption).trigger('change');
        return null;
    }
    if (a.search("organism_gene=") != -1) {
        var reg = /organism_gene=(.*)$/ig;
        var b = reg.exec(a);
        var newOption = new Option(b[1], b[1], true, true);
        $('#li_gene a').tab('show');
        $('#nuccom_gen_org').append(newOption).trigger('change');
        return null;
    }
    if (a.search("assemblyAccession_gene=") != -1) {
        var reg = /assemblyAccession_gene=(.*)$/ig;
        var b = reg.exec(a);
        var newOption = new Option(b[1], b[1], true, true);
        $('#li_gene a').tab('show');
        $('#nuccom_gen_ass').append(newOption).trigger('change');
        return null;
    }
    if (a.search("gene_id=") != -1) {
        var reg = /gene_id=(.*)$/ig;
        var b = reg.exec(a);
        var newOption = new Option(b[1], b[1], true, true);
        $('#li_gene a').tab('show');
        $('#nuccom_gen_geneid').append(newOption).trigger('change');
        return null;
    }

}

$('#browseTabs a').click(function (e) {
    e.preventDefault();
    $(this).tab('show')
});
