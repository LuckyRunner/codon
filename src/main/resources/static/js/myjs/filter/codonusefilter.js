showFilter = function () {

    $("#showF").show();
    $("#hideF").hide();
    $("#codon_filters").show(500);
    $("#result").removeClass("col-md-12");
    $("#result").addClass("col-md-9")
    $('a[data-toggle="tab"]').on('shown.bs.tab', function (e) {
        //当切换tab时，强制重新计算列宽
        $.fn.dataTable.tables( {visible: true, api: true} ).columns.adjust();
    } );

    $.fn.dataTable.tables({visible: true, api: true}).columns.adjust();
    // 监听屏幕大小改变
    $(window).resize(function () {
        $.fn.dataTable.tables({visible: true, api: true}).columns.adjust();
    })

};

hideFilter = function () {

    $("#showF").hide();
    $("#hideF").show();
    $("#codon_filters").hide(500);

    $("#result").removeClass("col-md-9");
    $("#result").addClass("col-md-12")

    $(document).on("click", "a[name='hide_map']", function () {
        $("#map_view").remove();
        $(this).html("<span class=\"fa fa-plus\"></span>");
        $(this).attr("name","view_map");
    });

    $('a[data-toggle="tab"]').on('shown.bs.tab', function (e) {
        //当切换tab时，强制重新计算列宽
        $.fn.dataTable.tables( {visible: true, api: true} ).columns.adjust();
    } );

    $.fn.dataTable.tables({visible: true, api: true}).columns.adjust();
    // 监听屏幕大小改变
    $(window).resize(function () {
        $.fn.dataTable.tables({visible: true, api: true}).columns.adjust();
    })

};


$('#reset').on('click', function() {

    $('#codu_gen_tax').val("").trigger("change");
    $("#codu_gen_org").val("").trigger("change");
    $("#codu_gen_ass").val("").trigger("change");
    $("#codu_gen_geneid").val("").trigger("change");
    $("#codu_gen_proid").val("").trigger("change");

});


$('#codu_geno_tax').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/codonusage/genometax',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#codu_geno_org').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/codonusage/genomeorg',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#codu_geno_ass').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/codonusage/genomeass',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#codu_gen_tax').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/codonusage/genetax',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#codu_gen_org').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/codonusage/geneorg',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});


$('#codu_gen_ass').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/codonusage/geneass',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#codu_gen_geneid').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/codonusage/geneid',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#codu_gen_proid').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/codonusage/proteinid',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});
