$(function () {
    var gene = window.location.href.split("?")[1];
    $.ajax({
        url: '/compodynamics/browse/genepage?'+ gene,
        type: 'GET',
        dataType: 'json',
        cache: false,
        success: succFunction //成功执行方法
    });

    function succFunction(data) {
        var data_arry = data["geneBasicInfo"];

        $("#gene_table1").append(
            "<tr><th style='width:50%'>Taxonomy:</th><td>"+ data_arry[0].taxonomy.replace(data_arry[0].taxonomy[0],data_arry[0].taxonomy[0].toUpperCase()) +"</td></tr>\n" +
            "<tr><th>Organism:</th><td>"+ data_arry[0].organism +"</td></tr>\n"+
            "<tr><th>Assembly-Accession:</th><td>"+ data_arry[0].assemblyAccession +"</td></tr>\n"
        );
        $('#gene_table2').append(
            "<tr><th style='width:50%'>Gene-Id:</th><td><a href='https://www.ncbi.nlm.nih.gov/nuccore/"+data_arry[0].geneId+
            "' target='_blank'><span class='label label-success'>" + data_arry[0].geneId + "</span></a></td></tr>\n" +
            "<tr><th>Gene-Name:</th><td>"+  data_arry[0].geneName +"</td></tr>\n" +
            "<tr><th>Protein-Id:</th><td><a href='https://www.ncbi.nlm.nih.gov/protein/"+data_arry[0].proteinId.split('_')[0]+"_"+data_arry[0].proteinId.split('_')[1]+
            "' target='_blank'><span class='label label-success'>" + data_arry[0].proteinId + "</span></a></td></tr>"
        );
        $('#gene_table3').append(
            "<tr><th style='width:50%'>Protein-Name:</th><td> "+data_arry[0].proteinName+"</td></tr>" +
            "<tr><th>Low-Quality:</th><td> "+data_arry[0].lowQuality+"</td></tr>"+
            "<tr><th>Location:</th><td>"+  data_arry[0].location +"</td></tr>"
        );
    }
});
