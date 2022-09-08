package conab.morto.com;

import java.util.List;

import org.hibernate.query.NativeQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MortoRepository extends JpaRepository<Morto,Integer>  {
    
    @Query(value="Select * from mytable m where m.conteudo ilike %?1%", nativeQuery = true)
    List<Morto> findByConteudo(String conteudo);
    
}
