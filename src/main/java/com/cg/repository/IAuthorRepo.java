package com.cg.repository;

import com.cg.dto.AuthorRoyaltyDTO;
import com.cg.dto.BestSellingBookDTO;
import com.cg.entity.Authors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAuthorRepo extends JpaRepository<Authors, String> {

    //queries
    @Query(value = """
    SELECT 
        a.au_id AS authorId,
        CONCAT(a.au_fname, ' ', a.au_lname) AS authorName,
        t.title_id AS titleId,
        t.title AS titleName,
        SUM(s.qty) AS totalSales,
        SUM(s.qty * t.price) AS revenue
    FROM authors a
    JOIN titleauthor ta ON a.au_id = ta.au_id
    JOIN titles t ON ta.title_id = t.title_id
    JOIN sales s ON t.title_id = s.title_id
    GROUP BY a.au_id, t.title_id
    ORDER BY revenue DESC
""", nativeQuery = true)
    List<Object[]> findBestSellingBooksRaw();


    @Query("""
SELECT new com.cg.dto.AuthorRoyaltyDTO(
    a.auId,
    CONCAT(a.firstName, ' ', a.lastName),
    t.titleId,
    t.title,
    MIN(r.royalty),
    MAX(r.royalty)
)
FROM Authors a
JOIN a.titleAuthors ta
JOIN ta.title t
JOIN t.royschedList r
GROUP BY a.auId, a.firstName, a.lastName, t.titleId, t.title
""")
    List<AuthorRoyaltyDTO> findAuthorsWithRoyaltyRange();
}
