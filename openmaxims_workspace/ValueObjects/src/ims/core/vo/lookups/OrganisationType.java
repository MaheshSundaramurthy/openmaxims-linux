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

package ims.core.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class OrganisationType extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public OrganisationType()
	{
		super();
	}
	public OrganisationType(int id)
	{
		super(id, "", true);
	}
	public OrganisationType(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public OrganisationType(int id, String text, boolean active, OrganisationType parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public OrganisationType(int id, String text, boolean active, OrganisationType parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public OrganisationType(int id, String text, boolean active, OrganisationType parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static OrganisationType buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new OrganisationType(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (OrganisationType)super.getParentInstance();
	}
	public OrganisationType getParent()
	{
		return (OrganisationType)super.getParentInstance();
	}
	public void setParent(OrganisationType parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		OrganisationType[] typedChildren = new OrganisationType[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (OrganisationType)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof OrganisationType)
		{
			super.addChild((OrganisationType)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof OrganisationType)
		{
			super.removeChild((OrganisationType)child);
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
		OrganisationTypeCollection result = new OrganisationTypeCollection();
		result.add(GPP);
		result.add(HOSPITAL);
		result.add(SUPPLIER);
		result.add(UNKNOWN_TYPE);
		result.add(PRISON);
		result.add(NHS_TRUST_ACUTE);
		result.add(LHO);
		result.add(NHS_PCT);
		return result;
	}
	public static OrganisationType[] getNegativeInstances()
	{
		OrganisationType[] instances = new OrganisationType[8];
		instances[0] = GPP;
		instances[1] = HOSPITAL;
		instances[2] = SUPPLIER;
		instances[3] = UNKNOWN_TYPE;
		instances[4] = PRISON;
		instances[5] = NHS_TRUST_ACUTE;
		instances[6] = LHO;
		instances[7] = NHS_PCT;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[8];
		negativeInstances[0] = "GPP";
		negativeInstances[1] = "HOSPITAL";
		negativeInstances[2] = "SUPPLIER";
		negativeInstances[3] = "UNKNOWN_TYPE";
		negativeInstances[4] = "PRISON";
		negativeInstances[5] = "NHS_TRUST_ACUTE";
		negativeInstances[6] = "LHO";
		negativeInstances[7] = "NHS_PCT";
		return negativeInstances;
	}
	public static OrganisationType getNegativeInstance(String name)
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
	public static OrganisationType getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		OrganisationType[] negativeInstances = getNegativeInstances();
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
	public static final int TYPE_ID = 1021067;
	public static final OrganisationType GPP = new OrganisationType(-82, "GP Practice", true, null, null, Color.Black);
	public static final OrganisationType HOSPITAL = new OrganisationType(-318, "Hospital", true, null, null, Color.Blue);
	public static final OrganisationType SUPPLIER = new OrganisationType(-416, "Supplier", true, null, null, Color.Default);
	public static final OrganisationType UNKNOWN_TYPE = new OrganisationType(-485, "Unknown Type", true, null, null, Color.Default);
	public static final OrganisationType PRISON = new OrganisationType(-627, "Prison", true, null, null, Color.Default);
	public static final OrganisationType NHS_TRUST_ACUTE = new OrganisationType(-1088, "NHS Trust (Acute)", true, null, null, Color.Default);
	public static final OrganisationType LHO = new OrganisationType(-1439, "LHO", true, null, null, Color.Default);
	public static final OrganisationType NHS_PCT = new OrganisationType(-1539, "NHS Clinical Commissioning Group", true, null, null, Color.Default);
}