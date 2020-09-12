$(function () {
    var species = window.location.href.split("=")[1];
    var cds_count = null;
    $.ajax({
        url: '/compodynamics/amino/genomepage?term='+ species,
        type: 'GET',
        dataType: 'json',
        cache: false,
        success: function (data) {
            cds_count = data["aminoAcidsUsageG"][0].cdsCount;
            $.ajax({
                url: '/compodynamics/browse/genomepage?term=' + species,
                type: 'GET',
                dataType: 'json',
                cache: false,
                error: erryFunction,  //错误执行方法
                success: succFunction //成功执行方法
            });
        }
    });


    function erryFunction() {
        alert("no data available");
    }
    function succFunction(data) {
        var data_arry = data["speciseInfo"];
        var taxonomies = null;
        if(data_arry.length>1){
            taxonomies = data_arry[0].taxonomy.replace(data_arry[0].taxonomy[0],data_arry[0].taxonomy[0].toUpperCase()) +" / " +
                data_arry[1].taxonomy.replace(data_arry[1].taxonomy[0],data_arry[1].taxonomy[0].toUpperCase())
        }
        else {
            taxonomies = data_arry[0].taxonomy.replace(data_arry[0].taxonomy[0],data_arry[0].taxonomy[0].toUpperCase())
        }
        $("#species_table1").append(
            "<tr><th style='width:50%'>Taxonomy:</th><td>"+ taxonomies +"</td></tr>\n" +
            "<tr><th>Tax-Id:</th><td>"+ data_arry[0].taxid +"</td></tr>\n" +
            "<tr><th>Organism:</th><td>"+ data_arry[0].organism +"</td></tr>\n"+
            "<tr><th>Assembly-Accession:</th><td>"+  data_arry[0].assemblyAccession +"</td></tr>"
        );
        $('#species_table2').append(
            "<tr><th style='width:50%'>Bioproject:</th><td>"+  data_arry[0].bioproject +"</td></tr>\n" +
            "<tr><th>Biosample:</th><td>"+  data_arry[0].biosample +"</td></tr>\n" +
            "<tr><th>Refseq-Category:</th><td>"+  data_arry[0].refseqCategory +"</td></tr>"+
            "<tr><th>CDS-Count:</th><td>"+ cds_count +"</td></tr>"
        );
        $('#species_table3').append(
            "<tr><th style='width:50%'>Version-Status:</th><td> "+data_arry[0].versionStatus+"</td></tr>" +
            "<tr><th>Assembly-Level:</th><td> "+data_arry[0].assemblyLevel+"</td></tr>" +
            "<tr><th>Genetic-Code:</th><td> "+data_arry[0].geneticCode+"</td></tr>"
        );
    }
});
