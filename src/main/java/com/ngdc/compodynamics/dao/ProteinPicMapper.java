package com.ngdc.compodynamics.dao;
import com.ngdc.compodynamics.model.ProteinPic;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;
import java.util.List;
@org.apache.ibatis.annotations.Mapper
public interface ProteinPicMapper extends Mapper<ProteinPic> {
    @Select("select * from protein_pic t where t.specise_index = #{speciseIndex}  limit 0,10 ")
    List<ProteinPic> findBySpeciesIndex(Integer speciseIndex);
}
