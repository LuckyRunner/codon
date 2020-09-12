package com.ngdc.compodynamics.service.searchAll;

import com.ngdc.compodynamics.dao.GeneBasicInfoMapper;
import com.ngdc.compodynamics.dao.SpeciseInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.stream.Collectors;

@Service
public class SearchAllService {

    @Autowired
    private GeneBasicInfoMapper geneBasicInfoMapper;

    @Autowired
    private SpeciseInfoMapper speciseInfoMapper;

    public List<String> searchAll(String term) throws ExecutionException, InterruptedException {


        Callable list1 = ()->{return speciseInfoMapper.findAssemblyAccession(term);};
        Callable list2 = ()->{return speciseInfoMapper.findTaxonomy(term);};
        Callable list3 = ()->{return speciseInfoMapper.findOrganism(term);};
        Callable list4 = ()->{return geneBasicInfoMapper.findGeneId(term);};
        Callable list5 = ()->{return geneBasicInfoMapper.findProteinId(term);};
        Callable list6 = ()->{return geneBasicInfoMapper.findGeneName(term);};
        Callable list7 = ()->{return geneBasicInfoMapper.findProteinName(term);};

        FutureTask<List> f1 = new FutureTask<List>(list1);
        FutureTask<List> f2 = new FutureTask<List>(list2);
        FutureTask<List> f3 = new FutureTask<List>(list3);
        FutureTask<List> f4 = new FutureTask<List>(list4);
        FutureTask<List> f5 = new FutureTask<List>(list5);
        FutureTask<List> f6 = new FutureTask<List>(list6);
        FutureTask<List> f7 = new FutureTask<List>(list7);

        new Thread(f1).start();
        new Thread(f2).start();
        new Thread(f3).start();
        new Thread(f4).start();
        new Thread(f5).start();
        new Thread(f6).start();
        new Thread(f7).start();

//        List<String> result1 = speciseInfoMapper.findAssemblyAccession(term);
//
//        List<String> result2 = speciseInfoMapper.findTaxonomy(term);
//
//        List<String> result3 = speciseInfoMapper.findOrganism(term);
//
//        List<String> result4 = geneBasicInfoMapper.findGeneId(term);
//
//        List<String> result5 = geneBasicInfoMapper.findProteinId(term);
//
//        List<String> result6 = geneBasicInfoMapper.findGeneName(term);
//
//        List<String> result7 = geneBasicInfoMapper.findProteinName(term);
//
//


        List<String> result1 = (List<String>) f1.get().stream().map(e -> e+"|AssemblyAccession").collect(Collectors.toList());
        List<String> result2 = (List<String>) f2.get().stream().map(e -> e+"|Taxonomy").collect(Collectors.toList());
        List<String> result3 = (List<String>) f3.get().stream().map(e -> e+"|Organism").collect(Collectors.toList());
        List<String> result4 = (List<String>) f4.get().stream().map(e -> e+"|GeneId").collect(Collectors.toList());
        List<String> result5 = (List<String>) f5.get().stream().map(e -> e+"|ProteinId").collect(Collectors.toList());
        List<String> result6 = (List<String>) f6.get().stream().map(e -> e+"|GeneName").collect(Collectors.toList());
        List<String> result7 = (List<String>) f7.get().stream().map(e -> e+"|ProteinName").collect(Collectors.toList());


        for(int i = 0; i < result1.size();i++) {
            System.out.println(result1.get(i));
        }
        for(int i = 0; i < result2.size();i++) {
            System.out.println(result2.get(i));
        }
        for(int i = 0; i < result3.size();i++) {
            System.out.println(result3.get(i));
        }


        List result = new ArrayList();
        result.addAll(result1);
        result.addAll(result2);
        result.addAll(result3);
        result.addAll(result4);
        result.addAll(result5);
        result.addAll(result6);
        result.addAll(result7);
        Collections.sort(result);

        System.out.println(result);
        return result;
    }




}
