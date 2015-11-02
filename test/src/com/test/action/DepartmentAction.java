package com.test.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.test.entity.Department;
import com.test.service.DepartmentService;

@Controller("department")
@Scope("prototype")
public class DepartmentAction implements ModelDriven<Department> {
	@Resource
	private DepartmentService departmentService;
	
	
	private Department model = new Department();

	
	
	public Department getModel() {
		return model;
	}

	/**
	 * 列表
	 * 
	 * @return
	 */
	public String list() {
		List<Department> departmentList = departmentService.findAll();
		ActionContext.getContext().put("departmentList", departmentList);
		return "list";
	}

	/**
	 * 添加页面
	 * 
	 * @return
	 */
	public String addUI() {
		return "saveUI";
	}

	/**
	 * 添加
	 * 
	 * @return
	 */
	public String add() {
		departmentService.save(model);
		return "toList";
	}

	/**
	 * 修改页面
	 * 
	 * @return
	 */
	public String editUI() {
		Department department = departmentService.findById(model.getId());
		ActionContext.getContext().getValueStack().push(department);
		return "saveUI";
	}

	/**
	 * 修改
	 * 
	 * @return
	 */
	public String edit() {
		departmentService.update(model);
		return "toList";
	}

	/**
	 * 删除
	 * 
	 * @return
	 */
	public String delete() {
		departmentService.delete(model.getId());
		return "toList";
	}
}
