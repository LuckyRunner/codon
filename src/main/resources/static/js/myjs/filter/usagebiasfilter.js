showFilter = function () {

    $("#showF").show();
    $("#hideF").hide();
    $("#bias_filters").show(500);
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
    $("#bias_filters").hide(500);

    $("#result").removeClass("col-md-9");
    $("#result").addClass("col-md-12")

    $(document).on("click", "a[name='hide_map']", function () {
        $("#map_view").remove();
        $(this).html("<span class=\"fa fa-plus\"></span>");
        $(this).attr("name","view_map");
    });

    $.fn.dataTable.tables({visible: true, api: true}).columns.adjust();
    // 监听屏幕大小改变
    $(window).resize(function () {
        $.fn.dataTable.tables({visible: true, api: true}).columns.adjust();
    })

};


$('#reset').on('click', function() {

    $('#useb_gen_tax').val("").trigger("change");
    $("#useb_gen_org").val("").trigger("change");
    $("#useb_gen_ass").val("").trigger("change");
    $("#useb_gen_genid").val("").trigger("change");
    $("#useb_gen_proid").val("").trigger("change");

});


$('#useb_geno_tax').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/usagebias/genometax',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#useb_geno_org').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/usagebias/genomeorg',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#useb_geno_ass').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/usagebias/genomeass',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#useb_gen_tax').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/usagebias/genetax',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#useb_gen_org').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/usagebias/geneorg',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});
$('#useb_gen_ass').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/usagebias/geneass',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#useb_gen_genid').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/usagebias/geneid',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});

$('#useb_gen_proid').select2({
    minimumInputLength: 1,
    ajax: {
        url: '/compodynamics/usagebias/proteinid',
        data: function (params) {
            var query = {
                term: params.term
            };
            return query;
        },
        cache: false
    }
});
