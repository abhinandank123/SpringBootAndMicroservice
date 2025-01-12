package in.ashokit.rest;

import java.text.CollationElementIterator;
import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.model.Book;

@RestController
public class BookRestController {
	
	HashOperations<String, Integer, Book>opsFoHash=null;
	
	@Autowired
	public BookRestController(RedisTemplate<String, Book> redisTemplate) {
		this.opsFoHash=redisTemplate.opsForHash();
		
	}
	@PostMapping("/book")
	public ResponseEntity<String> addBook(@RequestBody Book book){
		
		opsFoHash.put("books", book.getBookId(), book);
		
		return new ResponseEntity<>("Book Saved",HttpStatus.CREATED);
		
	}
	@GetMapping("/book/{bookId}")
	public ResponseEntity<String> getBook(@PathVariable("bookId") Integer bookId){
		
		Book book=opsFoHash.get("books", bookId);
		
		return new ResponseEntity<>("Book Saved",HttpStatus.OK);
		
	}
	@GetMapping("/book")
	public ResponseEntity<Collection<Book>> getAllBook(){
		
		Map<Integer, Book> entries=opsFoHash.entries("books");
		Collection<Book>values=entries.values();
		
		return new ResponseEntity<>(values,HttpStatus.OK);
		
	}

}
