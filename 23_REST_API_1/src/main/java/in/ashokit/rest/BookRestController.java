package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Book;

@RestController
public class BookRestController {
	
	@GetMapping("/book/{id}")
	public Book getBook(@PathVariable ("id")Integer id) {
		Book book=new Book(id,"Java",2500.00);
		return book;
	}

}
