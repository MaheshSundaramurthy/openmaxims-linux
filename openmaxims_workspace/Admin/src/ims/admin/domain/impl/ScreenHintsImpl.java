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
// This code was generated by Rory Fitzpatrick using IMS Development Environment (version 1.80 build 3951.16815)
// Copyright (C) 1995-2010 IMS MAXIMS. All rights reserved.

package ims.admin.domain.impl;

import ims.admin.domain.base.impl.BaseScreenHintsImpl;
import ims.core.generic.domain.objects.ScreenHint;
import ims.core.vo.domain.ScreenHintVoAssembler;
import ims.domain.DomainFactory;
import ims.framework.exceptions.CodingRuntimeException;

public class ScreenHintsImpl extends BaseScreenHintsImpl
{

	private static final long serialVersionUID = 1L;

	/**
	* listClinicalNote
	*/
	public ims.core.vo.ScreenHintVoCollection listScreenHints()
	{
		return ScreenHintVoAssembler.createScreenHintVoCollectionFromScreenHint(getDomainFactory().find(" from ScreenHint ")).sort();
	}

	/**
	* getClinicalNote
	*/
	public ims.core.vo.ScreenHintVo getScreenHint(ims.core.generic.vo.ScreenHintRefVo hintRefVo)
	{
		if(hintRefVo == null)
			throw new CodingRuntimeException("hintRefVo is null");
		
		DomainFactory factory = getDomainFactory();
		return ScreenHintVoAssembler.create((ScreenHint)factory.getDomainObject(ScreenHint.class, hintRefVo.getID_ScreenHint()));
	}

	public ims.core.vo.ScreenHintVo saveHint(ims.core.vo.ScreenHintVo hintVo) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException
	{
		if(hintVo == null)
			throw new CodingRuntimeException("hintVo is null");
		
		if(!hintVo.isValidated())
			throw new CodingRuntimeException("hintVo Value Object has not been validated");

		DomainFactory factory = getDomainFactory();
		ScreenHint doHint = ScreenHintVoAssembler.extractScreenHint(factory, hintVo);

		factory.save(doHint);
		return ScreenHintVoAssembler.create(doHint);
	}
}
