package com.scarabERP.ERP.starim.items;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.scarabERP.ERP.common.QueryVO;

@RestController
@RequestMapping("/erp/items")
public class ItemsController {

	@Autowired
	ItemsDAO dao;
	
	@GetMapping("/list.json")
	public List<ItemsVO> listPage(QueryVO vo) {
		return dao.list(vo);
	}
	
	
	@PostMapping
	public void insert(@RequestBody ItemsVO vo) {
		dao.insert(vo);
	}
	
	@DeleteMapping("/{items_id}")
	public void delete(@PathVariable("items_id") String items_id) {
		dao.delete(items_id);
	}
	
	@GetMapping("/{items_id}")
	public ItemsVO read(@PathVariable("items_id") String items_id) {
		return dao.read(items_id);
	}
	
	@PutMapping
	public void update(@RequestBody ItemsVO vo) {
		dao.update(vo);
	}
	
	@PostMapping("/update1")
	public void update1(ItemsVO vo,  MultipartHttpServletRequest multi)throws Exception{
		MultipartFile file= multi.getFile("byte");
		if(!file.isEmpty()) {
			System.out.println("file.........."+ file.getOriginalFilename());
			//파일업로드
			String filePath = "/Scarab ERP/Scarab-ERP-front/public/images/items/";
			String fileName = vo.getItems_id() + ".jpg";
			File oldFile = new File(filePath + fileName);
			if(oldFile.exists()) {
				oldFile.delete();
			}else {
				//이미지업로드한걸로 업데이트
				ItemsVO item = new ItemsVO();
				vo.setItems_id(item.getItems_id());
				vo.setItems_photo("/display?file=" + filePath + fileName);
				dao.updatePhoto(item);
			}
			file.transferTo(new File("c:" + filePath + fileName));
		}
		
		System.out.println(vo.toString());
		dao.update(vo);
	}
	
	@PostMapping("/update/image/{items_id}")
	public void updateImage(@PathVariable("items_id") String items_id, MultipartHttpServletRequest multi) throws IllegalStateException, IOException {
		//파일업로드
		MultipartFile file = multi.getFile("byte");
		String filePath = "/Scarab ERP/Scarab-ERP-front/public/images/items/";
		String fileName = items_id + ".jpg";
		File oldFile = new File(filePath + fileName);
		if(oldFile.exists()) {
			oldFile.delete();
		}else {
			//이미지업로드한걸로 업데이트
			ItemsVO vo = new ItemsVO();
			vo.setItems_id(items_id);
			vo.setItems_photo("/display?file=" + filePath + fileName);
			dao.updatePhoto(vo);
		}
		file.transferTo(new File("c:" + filePath + fileName));
	}
	
	
	@PostMapping("/1")
	public void insert1(ItemsVO vo,  MultipartHttpServletRequest multi)throws Exception{
		
		MultipartFile file= multi.getFile("byte");
		if(file.isEmpty()) {
			System.out.println("file.........."+ file.getOriginalFilename());
			//파일업로드
			String filePath = "/Scarab ERP/Scarab-ERP-front/public/images/items/";
			String fileName = vo.getItems_id() + ".jpg";
				//이미지업로드한걸로 업데이트
				ItemsVO item = new ItemsVO();
				vo.setItems_photo("/display?file=" + filePath + fileName);
				dao.insert(item);
			file.transferTo(new File("c:" + filePath + fileName));
		}
	}

	
	
	
}
