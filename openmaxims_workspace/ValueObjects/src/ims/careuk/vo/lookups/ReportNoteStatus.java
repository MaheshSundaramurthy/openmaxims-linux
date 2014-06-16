//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
//#                                                                           #
//#  This program is free software: you can redistribute it and/or modify     #
//#  it under the terms of the GNU Affero General Public License as           #
//#  published by the Free Software Foundation, either version 3 of the       #
//#  License, or (at your option) any later version.                          # 
//#                                                                           #
//#  This program is distributed in the hope that it will be useful,          #
//#  but WITHOUT ANY WARRANTY; without even the implied warranty of           #
//#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            #
//#  GNU Affero General Public License for more details.                      #
//#                                                                           #
//#  You should have received a copy of the GNU Affero General Public License #
//#  along with this program.  If not, see <http://www.gnu.org/licenses/>.    #
//#                                                                           #
//#############################################################################
//#EOH
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.careuk.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class ReportNoteStatus extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public ReportNoteStatus()
	{
		super();
	}
	public ReportNoteStatus(int id)
	{
		super(id, "", true);
	}
	public ReportNoteStatus(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public ReportNoteStatus(int id, String text, boolean active, ReportNoteStatus parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public ReportNoteStatus(int id, String text, boolean active, ReportNoteStatus parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public ReportNoteStatus(int id, String text, boolean active, ReportNoteStatus parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static ReportNoteStatus buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new ReportNoteStatus(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (ReportNoteStatus)super.getParentInstance();
	}
	public ReportNoteStatus getParent()
	{
		return (ReportNoteStatus)super.getParentInstance();
	}
	public void setParent(ReportNoteStatus parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		ReportNoteStatus[] typedChildren = new ReportNoteStatus[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (ReportNoteStatus)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof ReportNoteStatus)
		{
			super.addChild((ReportNoteStatus)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof ReportNoteStatus)
		{
			super.removeChild((ReportNoteStatus)child);
		}
		return super.getChildInstances().size();
	}
	public Image getExpandedImage()
	{
		return super.getImage();
	}
	public Image getCollapsedImage()
	{
		return super.getImage();
	}
	public static ims.framework.IItemCollection getNegativeInstancesAsIItemCollection()
	{
		ReportNoteStatusCollection result = new ReportNoteStatusCollection();
		result.add(DRAFT);
		result.add(ACTIVE);
		result.add(PREVIEW);
		return result;
	}
	public static ReportNoteStatus[] getNegativeInstances()
	{
		ReportNoteStatus[] instances = new ReportNoteStatus[3];
		instances[0] = DRAFT;
		instances[1] = ACTIVE;
		instances[2] = PREVIEW;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[3];
		negativeInstances[0] = "DRAFT";
		negativeInstances[1] = "ACTIVE";
		negativeInstances[2] = "PREVIEW";
		return negativeInstances;
	}
	public static ReportNoteStatus getNegativeInstance(String name)
	{
		if(name == null)
			return null;
		String[] negativeInstances = getNegativeInstanceNames();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].equals(name))
				return getNegativeInstances()[i];
		}
		return null;
	}
	public static ReportNoteStatus getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		ReportNoteStatus[] negativeInstances = getNegativeInstances();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].getID() == id)
				return negativeInstances[i];
		}
		return null;
	}
	public int getTypeId()
	{
		return TYPE_ID;
	}
	public static final int TYPE_ID = 1341024;
	public static final ReportNoteStatus DRAFT = new ReportNoteStatus(-1860, "Draft", true, null, null, Color.Default);
	public static final ReportNoteStatus ACTIVE = new ReportNoteStatus(-1861, "Active", true, null, null, Color.Default);
	public static final ReportNoteStatus PREVIEW = new ReportNoteStatus(-1862, "Preview", true, null, null, Color.Default);
}