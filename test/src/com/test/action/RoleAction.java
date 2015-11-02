package com.test.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.test.entity.Role;
import com.test.service.RoleService;

@Controller("role")
@Scope("prototype")
public class RoleAction implements ModelDriven<Role> {
	@Resource
	private RoleService roleService;
	
	private Role model = new Role();

	public Role getModel() {
		return model;
	}

	public String list() {
		List<Role> roleList = roleService.finAll();
		ActionContext.getContext().put("roleList", roleList);
		return "list";
	}

	public String addUI() {
		return "saveUI";
	}

	public String add() {
		roleService.add(model);
		return "toList";
	}

	public String delete() {
		roleService.delete(model.getId());
		return "toList";
	}

	public String editUI() {
		Role role = roleService.findById(model.getId());
		ActionContext.getContext().getValueStack().push(role);
		return "saveUI";
	}

	public String edit() {
		roleService.update(model);
		return "toList";
	}
}
