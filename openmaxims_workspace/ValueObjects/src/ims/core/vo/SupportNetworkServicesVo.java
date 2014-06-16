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

package ims.core.vo;

/**
 * Linked to core.clinical.SupportNetworkServices business object (ID: 1003100011).
 */
public class SupportNetworkServicesVo extends ims.core.clinical.vo.SupportNetworkServicesRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public SupportNetworkServicesVo()
	{
	}
	public SupportNetworkServicesVo(Integer id, int version)
	{
		super(id, version);
	}
	public SupportNetworkServicesVo(ims.core.vo.beans.SupportNetworkServicesVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.locationservice = bean.getLocationService() == null ? null : bean.getLocationService().buildVo();
		this.frequencyofservice = bean.getFrequencyOfService();
		this.comments = bean.getComments();
		this.iscurrentlyactive = bean.getIsCurrentlyActive();
		this.sysinfo = bean.getSysInfo() == null ? null : bean.getSysInfo().buildSystemInformation();
		this.suppliedservice = bean.getSuppliedService() == null ? null : bean.getSuppliedService().buildVo();
		this.service = bean.getService() == null ? null : bean.getService().buildVo();
		this.authoringinfo = bean.getAuthoringInfo() == null ? null : bean.getAuthoringInfo().buildVo();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.SupportNetworkServicesVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.locationservice = bean.getLocationService() == null ? null : bean.getLocationService().buildVo(map);
		this.frequencyofservice = bean.getFrequencyOfService();
		this.comments = bean.getComments();
		this.iscurrentlyactive = bean.getIsCurrentlyActive();
		this.sysinfo = bean.getSysInfo() == null ? null : bean.getSysInfo().buildSystemInformation();
		this.suppliedservice = bean.getSuppliedService() == null ? null : bean.getSuppliedService().buildVo(map);
		this.service = bean.getService() == null ? null : bean.getService().buildVo(map);
		this.authoringinfo = bean.getAuthoringInfo() == null ? null : bean.getAuthoringInfo().buildVo(map);
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.SupportNetworkServicesVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.SupportNetworkServicesVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.SupportNetworkServicesVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public Object getFieldValueByFieldName(String fieldName)
	{
		if(fieldName == null)
			throw new ims.framework.exceptions.CodingRuntimeException("Invalid field name");
		fieldName = fieldName.toUpperCase();
		if(fieldName.equals("LOCATIONSERVICE"))
			return getLocationService();
		if(fieldName.equals("FREQUENCYOFSERVICE"))
			return getFrequencyOfService();
		if(fieldName.equals("COMMENTS"))
			return getComments();
		if(fieldName.equals("ISCURRENTLYACTIVE"))
			return getIsCurrentlyActive();
		if(fieldName.equals("SYSINFO"))
			return getSysInfo();
		if(fieldName.equals("SUPPLIEDSERVICE"))
			return getSuppliedService();
		if(fieldName.equals("SERVICE"))
			return getService();
		if(fieldName.equals("AUTHORINGINFO"))
			return getAuthoringInfo();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getLocationServiceIsNotNull()
	{
		return this.locationservice != null;
	}
	public ims.core.vo.LocationServiceVo getLocationService()
	{
		return this.locationservice;
	}
	public void setLocationService(ims.core.vo.LocationServiceVo value)
	{
		this.isValidated = false;
		this.locationservice = value;
	}
	public boolean getFrequencyOfServiceIsNotNull()
	{
		return this.frequencyofservice != null;
	}
	public String getFrequencyOfService()
	{
		return this.frequencyofservice;
	}
	public static int getFrequencyOfServiceMaxLength()
	{
		return 255;
	}
	public void setFrequencyOfService(String value)
	{
		this.isValidated = false;
		this.frequencyofservice = value;
	}
	public boolean getCommentsIsNotNull()
	{
		return this.comments != null;
	}
	public String getComments()
	{
		return this.comments;
	}
	public static int getCommentsMaxLength()
	{
		return 255;
	}
	public void setComments(String value)
	{
		this.isValidated = false;
		this.comments = value;
	}
	public boolean getIsCurrentlyActiveIsNotNull()
	{
		return this.iscurrentlyactive != null;
	}
	public Boolean getIsCurrentlyActive()
	{
		return this.iscurrentlyactive;
	}
	public void setIsCurrentlyActive(Boolean value)
	{
		this.isValidated = false;
		this.iscurrentlyactive = value;
	}
	public boolean getSysInfoIsNotNull()
	{
		return this.sysinfo != null;
	}
	public ims.vo.SystemInformation getSysInfo()
	{
		return this.sysinfo;
	}
	public void setSysInfo(ims.vo.SystemInformation value)
	{
		this.isValidated = false;
		this.sysinfo = value;
	}
	public boolean getSuppliedServiceIsNotNull()
	{
		return this.suppliedservice != null;
	}
	public ims.core.vo.SuppNetworkServiceProfessionDetailVo getSuppliedService()
	{
		return this.suppliedservice;
	}
	public void setSuppliedService(ims.core.vo.SuppNetworkServiceProfessionDetailVo value)
	{
		this.isValidated = false;
		this.suppliedservice = value;
	}
	public boolean getServiceIsNotNull()
	{
		return this.service != null;
	}
	public ims.core.vo.ServiceLiteVo getService()
	{
		return this.service;
	}
	public void setService(ims.core.vo.ServiceLiteVo value)
	{
		this.isValidated = false;
		this.service = value;
	}
	public boolean getAuthoringInfoIsNotNull()
	{
		return this.authoringinfo != null;
	}
	public ims.core.vo.AuthoringInformationVo getAuthoringInfo()
	{
		return this.authoringinfo;
	}
	public void setAuthoringInfo(ims.core.vo.AuthoringInformationVo value)
	{
		this.isValidated = false;
		this.authoringinfo = value;
	}
	public boolean isValidated()
	{
		if(this.isBusy)
			return true;
		this.isBusy = true;
	
		if(!this.isValidated)
		{
			this.isBusy = false;
			return false;
		}
		if(this.locationservice != null)
		{
			if(!this.locationservice.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.suppliedservice != null)
		{
			if(!this.suppliedservice.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.service != null)
		{
			if(!this.service.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.authoringinfo != null)
		{
			if(!this.authoringinfo.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		this.isBusy = false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(this.isBusy)
			return null;
		this.isBusy = true;
	
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		if(this.locationservice != null)
		{
			String[] listOfOtherErrors = this.locationservice.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.frequencyofservice != null)
			if(this.frequencyofservice.length() > 255)
				listOfErrors.add("The length of the field [frequencyofservice] in the value object [ims.core.vo.SupportNetworkServicesVo] is too big. It should be less or equal to 255");
		if(this.comments != null)
			if(this.comments.length() > 255)
				listOfErrors.add("The length of the field [comments] in the value object [ims.core.vo.SupportNetworkServicesVo] is too big. It should be less or equal to 255");
		if(this.suppliedservice != null)
		{
			String[] listOfOtherErrors = this.suppliedservice.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.service != null)
		{
			String[] listOfOtherErrors = this.service.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.authoringinfo == null)
			listOfErrors.add("Authoring HCP and Date/Time are mandatory");
		if(this.authoringinfo != null)
		{
			String[] listOfOtherErrors = this.authoringinfo.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
		{
			this.isBusy = false;
			this.isValidated = true;
			return null;
		}
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		this.isBusy = false;
		this.isValidated = false;
		return result;
	}
	public void clearIDAndVersion()
	{
		this.id = null;
		this.version = 0;
	}
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		SupportNetworkServicesVo clone = new SupportNetworkServicesVo(this.id, this.version);
		
		if(this.locationservice == null)
			clone.locationservice = null;
		else
			clone.locationservice = (ims.core.vo.LocationServiceVo)this.locationservice.clone();
		clone.frequencyofservice = this.frequencyofservice;
		clone.comments = this.comments;
		clone.iscurrentlyactive = this.iscurrentlyactive;
		if(this.sysinfo == null)
			clone.sysinfo = null;
		else
			clone.sysinfo = (ims.vo.SystemInformation)this.sysinfo.clone();
		if(this.suppliedservice == null)
			clone.suppliedservice = null;
		else
			clone.suppliedservice = (ims.core.vo.SuppNetworkServiceProfessionDetailVo)this.suppliedservice.clone();
		if(this.service == null)
			clone.service = null;
		else
			clone.service = (ims.core.vo.ServiceLiteVo)this.service.clone();
		if(this.authoringinfo == null)
			clone.authoringinfo = null;
		else
			clone.authoringinfo = (ims.core.vo.AuthoringInformationVo)this.authoringinfo.clone();
		clone.isValidated = this.isValidated;
		
		this.isBusy = false;
		return clone;
	}
	public int compareTo(Object obj)
	{
		return compareTo(obj, true);
	}
	public int compareTo(Object obj, boolean caseInsensitive)
	{
		if (obj == null)
		{
			return -1;
		}
		if(caseInsensitive); // this is to avoid eclipse warning only.
		if (!(SupportNetworkServicesVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A SupportNetworkServicesVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		SupportNetworkServicesVo compareObj = (SupportNetworkServicesVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getSysInfo() == null && compareObj.getSysInfo() != null)
				return -1;
			if(this.getSysInfo() != null && compareObj.getSysInfo() == null)
				return 1;
			if(this.getSysInfo() != null && compareObj.getSysInfo() != null)
				retVal = this.getSysInfo().compareTo(compareObj.getSysInfo());
		}
		return retVal;
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.locationservice != null)
			count++;
		if(this.frequencyofservice != null)
			count++;
		if(this.comments != null)
			count++;
		if(this.iscurrentlyactive != null)
			count++;
		if(this.sysinfo != null)
			count++;
		if(this.suppliedservice != null)
			count++;
		if(this.service != null)
			count++;
		if(this.authoringinfo != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 8;
	}
	protected ims.core.vo.LocationServiceVo locationservice;
	protected String frequencyofservice;
	protected String comments;
	protected Boolean iscurrentlyactive;
	protected ims.vo.SystemInformation sysinfo;
	protected ims.core.vo.SuppNetworkServiceProfessionDetailVo suppliedservice;
	protected ims.core.vo.ServiceLiteVo service;
	protected ims.core.vo.AuthoringInformationVo authoringinfo;
	private boolean isValidated = false;
	private boolean isBusy = false;
}