package in.harshita.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.harshita.entity.Book;
import in.harshita.repository.BookRepository;

@Controller
public class BookController {
	@Autowired
	private BookRepository repo;
	
	@GetMapping("/book")
	public ModelAndView getBookId(@RequestParam("id") Integer id) {
		System.out.println("Id is ::"+id);
		ModelAndView mav = new ModelAndView();
		Optional<Book> findId = repo.findById(id);
		if(findId.isPresent()) {
			Book bookObj = findId.get();
			System.out.println(bookObj);
			mav.addObject("book",bookObj);
			}
		mav.setViewName("index");
		
		return mav;		
	}

}
