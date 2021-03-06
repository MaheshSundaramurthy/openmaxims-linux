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

package ims.core.vo.beans;

public class VSPulseBean extends ims.vo.ValueObjectBean
{
	public VSPulseBean()
	{
	}
	public VSPulseBean(ims.core.vo.VSPulse vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.pulserateradial = vo.getPulseRateRadial();
		this.pulserateapex = vo.getPulseRateApex();
		this.isirregular = vo.getIsIrregular();
		this.pulserhythm = vo.getPulseRhythm() == null ? null : (ims.vo.LookupInstanceBean)vo.getPulseRhythm().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.VSPulse vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.pulserateradial = vo.getPulseRateRadial();
		this.pulserateapex = vo.getPulseRateApex();
		this.isirregular = vo.getIsIrregular();
		this.pulserhythm = vo.getPulseRhythm() == null ? null : (ims.vo.LookupInstanceBean)vo.getPulseRhythm().getBean();
	}

	public ims.core.vo.VSPulse buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.VSPulse buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.VSPulse vo = null;
		if(map != null)
			vo = (ims.core.vo.VSPulse)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.VSPulse();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer value)
	{
		this.id = value;
	}
	public int getVersion()
	{
		return this.version;
	}
	public void setVersion(int value)
	{
		this.version = value;
	}
	public Integer getPulseRateRadial()
	{
		return this.pulserateradial;
	}
	public void setPulseRateRadial(Integer value)
	{
		this.pulserateradial = value;
	}
	public Integer getPulseRateApex()
	{
		return this.pulserateapex;
	}
	public void setPulseRateApex(Integer value)
	{
		this.pulserateapex = value;
	}
	public Boolean getIsIrregular()
	{
		return this.isirregular;
	}
	public void setIsIrregular(Boolean value)
	{
		this.isirregular = value;
	}
	public ims.vo.LookupInstanceBean getPulseRhythm()
	{
		return this.pulserhythm;
	}
	public void setPulseRhythm(ims.vo.LookupInstanceBean value)
	{
		this.pulserhythm = value;
	}

	private Integer id;
	private int version;
	private Integer pulserateradial;
	private Integer pulserateapex;
	private Boolean isirregular;
	private ims.vo.LookupInstanceBean pulserhythm;
}
