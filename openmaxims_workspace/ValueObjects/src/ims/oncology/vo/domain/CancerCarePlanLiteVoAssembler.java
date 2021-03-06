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
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.oncology.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Billy Mahon
 */
public class CancerCarePlanLiteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.oncology.vo.CancerCarePlanLiteVo copy(ims.oncology.vo.CancerCarePlanLiteVo valueObjectDest, ims.oncology.vo.CancerCarePlanLiteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CancerCarePlan(valueObjectSrc.getID_CancerCarePlan());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// CarePlanDate
		valueObjectDest.setCarePlanDate(valueObjectSrc.getCarePlanDate());
		// ConsultantInCharge
		valueObjectDest.setConsultantInCharge(valueObjectSrc.getConsultantInCharge());
		// CarePlanIntent
		valueObjectDest.setCarePlanIntent(valueObjectSrc.getCarePlanIntent());
		// RecurrenceIndicator
		valueObjectDest.setRecurrenceIndicator(valueObjectSrc.getRecurrenceIndicator());
		// IsCurrent
		valueObjectDest.setIsCurrent(valueObjectSrc.getIsCurrent());
		// mdtMeeting
		valueObjectDest.setMdtMeeting(valueObjectSrc.getMdtMeeting());
		// EpisodeOfCare
		valueObjectDest.setEpisodeOfCare(valueObjectSrc.getEpisodeOfCare());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCancerCarePlanLiteVoCollectionFromCancerCarePlan(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.CancerCarePlan objects.
	 */
	public static ims.oncology.vo.CancerCarePlanLiteVoCollection createCancerCarePlanLiteVoCollectionFromCancerCarePlan(java.util.Set domainObjectSet)	
	{
		return createCancerCarePlanLiteVoCollectionFromCancerCarePlan(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.CancerCarePlan objects.
	 */
	public static ims.oncology.vo.CancerCarePlanLiteVoCollection createCancerCarePlanLiteVoCollectionFromCancerCarePlan(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.oncology.vo.CancerCarePlanLiteVoCollection voList = new ims.oncology.vo.CancerCarePlanLiteVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.oncology.domain.objects.CancerCarePlan domainObject = (ims.oncology.domain.objects.CancerCarePlan) iterator.next();
			ims.oncology.vo.CancerCarePlanLiteVo vo = create(map, domainObject);
			
			if (vo != null)
				voList.add(vo);
				
			if (domainObject != null)
			{				
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param domainObjectList - List of ims.oncology.domain.objects.CancerCarePlan objects.
	 */
	public static ims.oncology.vo.CancerCarePlanLiteVoCollection createCancerCarePlanLiteVoCollectionFromCancerCarePlan(java.util.List domainObjectList) 
	{
		return createCancerCarePlanLiteVoCollectionFromCancerCarePlan(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.domain.objects.CancerCarePlan objects.
	 */
	public static ims.oncology.vo.CancerCarePlanLiteVoCollection createCancerCarePlanLiteVoCollectionFromCancerCarePlan(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.oncology.vo.CancerCarePlanLiteVoCollection voList = new ims.oncology.vo.CancerCarePlanLiteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.domain.objects.CancerCarePlan domainObject = (ims.oncology.domain.objects.CancerCarePlan) domainObjectList.get(i);
			ims.oncology.vo.CancerCarePlanLiteVo vo = create(map, domainObject);

			if (vo != null)
				voList.add(vo);
			
			if (domainObject != null)
			{
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ims.oncology.domain.objects.CancerCarePlan set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractCancerCarePlanSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CancerCarePlanLiteVoCollection voCollection) 
	 {
	 	return extractCancerCarePlanSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCancerCarePlanSet(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CancerCarePlanLiteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.CancerCarePlanLiteVo vo = voCollection.get(i);
			ims.oncology.domain.objects.CancerCarePlan domainObject = CancerCarePlanLiteVoAssembler.extractCancerCarePlan(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}
			
			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainObjectSet.contains(domainObject)) domainObjectSet.add(domainObject);
			newSet.add(domainObject);			
		}
		java.util.Set removedSet = new java.util.HashSet();
		java.util.Iterator iter = domainObjectSet.iterator();
		//Find out which objects need to be removed
		while (iter.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet.contains(o))
			{
				removedSet.add(o);
			}
		}
		iter = removedSet.iterator();
		//Remove the unwanted objects
		while (iter.hasNext())
		{
			domainObjectSet.remove(iter.next());
		}
		return domainObjectSet;	 
	 }


	/**
	 * Create the ims.oncology.domain.objects.CancerCarePlan list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractCancerCarePlanList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CancerCarePlanLiteVoCollection voCollection) 
	 {
	 	return extractCancerCarePlanList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCancerCarePlanList(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CancerCarePlanLiteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.oncology.vo.CancerCarePlanLiteVo vo = voCollection.get(i);
			ims.oncology.domain.objects.CancerCarePlan domainObject = CancerCarePlanLiteVoAssembler.extractCancerCarePlan(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}

			int domIdx = domainObjectList.indexOf(domainObject);
			if (domIdx == -1)
			{
				domainObjectList.add(i, domainObject);
			}
			else if (i != domIdx && i < domainObjectList.size())
			{
				Object tmp = domainObjectList.get(i);
				domainObjectList.set(i, domainObjectList.get(domIdx));
				domainObjectList.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1=domainObjectList.size();
		while (i1 > size)
		{
			domainObjectList.remove(i1-1);
			i1=domainObjectList.size();
		}
		return domainObjectList;	 
	 }

 

	/**
	 * Create the ValueObject from the ims.oncology.domain.objects.CancerCarePlan object.
	 * @param domainObject ims.oncology.domain.objects.CancerCarePlan
	 */
	 public static ims.oncology.vo.CancerCarePlanLiteVo create(ims.oncology.domain.objects.CancerCarePlan domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.oncology.domain.objects.CancerCarePlan object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.oncology.vo.CancerCarePlanLiteVo create(DomainObjectMap map, ims.oncology.domain.objects.CancerCarePlan domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.oncology.vo.CancerCarePlanLiteVo valueObject = (ims.oncology.vo.CancerCarePlanLiteVo) map.getValueObject(domainObject, ims.oncology.vo.CancerCarePlanLiteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.oncology.vo.CancerCarePlanLiteVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.domain.objects.CancerCarePlan
	 */
	 public static ims.oncology.vo.CancerCarePlanLiteVo insert(ims.oncology.vo.CancerCarePlanLiteVo valueObject, ims.oncology.domain.objects.CancerCarePlan domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
		DomainObjectMap map = new DomainObjectMap();
		return insert(map, valueObject, domainObject);
	 }
	 
	/**
	 * Update the ValueObject with the Domain Object.
	 * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.domain.objects.CancerCarePlan
	 */
	 public static ims.oncology.vo.CancerCarePlanLiteVo insert(DomainObjectMap map, ims.oncology.vo.CancerCarePlanLiteVo valueObject, ims.oncology.domain.objects.CancerCarePlan domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_CancerCarePlan(domainObject.getId());
		valueObject.setIsRIE(domainObject.getIsRIE());
		
		// If this is a recordedInError record, and the domainObject
		// value isIncludeRecord has not been set, then we return null and
		// not the value object
		if (valueObject.getIsRIE() != null && valueObject.getIsRIE().booleanValue() == true && !domainObject.isIncludeRecord())
			return null;
			
		// If this is not a recordedInError record, and the domainObject
		// value isIncludeRecord has been set, then we return null and
		// not the value object
		if ((valueObject.getIsRIE() == null || valueObject.getIsRIE().booleanValue() == false) && domainObject.isIncludeRecord())
			return null;
			
		// ClinicalContact
		valueObject.setClinicalContact(ims.core.vo.domain.ClinicalContactShortVoAssembler.create(map, domainObject.getClinicalContact()) );
		// CareContext
		valueObject.setCareContext(ims.core.vo.domain.CareContextShortVoAssembler.create(map, domainObject.getCareContext()) );
		// CarePlanDate
		java.util.Date CarePlanDate = domainObject.getCarePlanDate();
		if ( null != CarePlanDate ) 
		{
			valueObject.setCarePlanDate(new ims.framework.utils.Date(CarePlanDate) );
		}
		// ConsultantInCharge
		valueObject.setConsultantInCharge(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getConsultantInCharge()) );
		// CarePlanIntent
		ims.domain.lookups.LookupInstance instance5 = domainObject.getCarePlanIntent();
		if ( null != instance5 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance5.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance5.getImage().getImageId(), instance5.getImage().getImagePath());
			}
			color = instance5.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.CarePlanIntent voLookup5 = new ims.oncology.vo.lookups.CarePlanIntent(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.oncology.vo.lookups.CarePlanIntent parentVoLookup5 = voLookup5;
			ims.domain.lookups.LookupInstance parent5 = instance5.getParent();
			while (parent5 != null)
			{
				if (parent5.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent5.getImage().getImageId(), parent5.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent5.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup5.setParent(new ims.oncology.vo.lookups.CarePlanIntent(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setCarePlanIntent(voLookup5);
		}
				// RecurrenceIndicator
		ims.domain.lookups.LookupInstance instance6 = domainObject.getRecurrenceIndicator();
		if ( null != instance6 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance6.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance6.getImage().getImageId(), instance6.getImage().getImagePath());
			}
			color = instance6.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.RecurrenceIndicator voLookup6 = new ims.oncology.vo.lookups.RecurrenceIndicator(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.oncology.vo.lookups.RecurrenceIndicator parentVoLookup6 = voLookup6;
			ims.domain.lookups.LookupInstance parent6 = instance6.getParent();
			while (parent6 != null)
			{
				if (parent6.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent6.getImage().getImageId(), parent6.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent6.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup6.setParent(new ims.oncology.vo.lookups.RecurrenceIndicator(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setRecurrenceIndicator(voLookup6);
		}
				// IsCurrent
		valueObject.setIsCurrent( domainObject.isIsCurrent() );
		// mdtMeeting
		valueObject.setMdtMeeting(ims.oncology.vo.domain.CancerMDTMeetingVoAssembler.create(map, domainObject.getMdtMeeting()) );
		// EpisodeOfCare
		if (domainObject.getEpisodeOfCare() != null)
		{
			if(domainObject.getEpisodeOfCare() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getEpisodeOfCare();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setEpisodeOfCare(new ims.core.admin.vo.EpisodeOfCareRefVo(id, -1));				
			}
			else
			{
				valueObject.setEpisodeOfCare(new ims.core.admin.vo.EpisodeOfCareRefVo(domainObject.getEpisodeOfCare().getId(), domainObject.getEpisodeOfCare().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.domain.objects.CancerCarePlan extractCancerCarePlan(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CancerCarePlanLiteVo valueObject) 
	{
		return 	extractCancerCarePlan(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.domain.objects.CancerCarePlan extractCancerCarePlan(ims.domain.ILightweightDomainFactory domainFactory, ims.oncology.vo.CancerCarePlanLiteVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_CancerCarePlan();
		ims.oncology.domain.objects.CancerCarePlan domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.oncology.domain.objects.CancerCarePlan)domMap.get(valueObject);
			}
			// ims.oncology.vo.CancerCarePlanLiteVo ID_CancerCarePlan field is unknown
			domainObject = new ims.oncology.domain.objects.CancerCarePlan();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_CancerCarePlan());
			if (domMap.get(key) != null)
			{
				return (ims.oncology.domain.objects.CancerCarePlan)domMap.get(key);
			}
			domainObject = (ims.oncology.domain.objects.CancerCarePlan) domainFactory.getDomainObject(ims.oncology.domain.objects.CancerCarePlan.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_CancerCarePlan());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.ClinicalContact value1 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value1 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.CareContext value2 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value2 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else
			{
				value2 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value2);
		java.util.Date value3 = null;
		ims.framework.utils.Date date3 = valueObject.getCarePlanDate();		
		if ( date3 != null ) 
		{
			value3 = date3.getDate();
		}
		domainObject.setCarePlanDate(value3);
		domainObject.setConsultantInCharge(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getConsultantInCharge(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getCarePlanIntent() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getCarePlanIntent().getID());
		}
		domainObject.setCarePlanIntent(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getRecurrenceIndicator() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getRecurrenceIndicator().getID());
		}
		domainObject.setRecurrenceIndicator(value6);
		domainObject.setIsCurrent(valueObject.getIsCurrent());
		domainObject.setMdtMeeting(ims.oncology.vo.domain.CancerMDTMeetingVoAssembler.extractCancerMDTMeeting(domainFactory, valueObject.getMdtMeeting(), domMap));
		ims.core.admin.domain.objects.EpisodeOfCare value9 = null;
		if ( null != valueObject.getEpisodeOfCare() ) 
		{
			if (valueObject.getEpisodeOfCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisodeOfCare()) != null)
				{
					value9 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisodeOfCare());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value9 = domainObject.getEpisodeOfCare();	
			}
			else
			{
				value9 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisodeOfCare().getBoId());
			}
		}
		domainObject.setEpisodeOfCare(value9);

		return domainObject;
	}

}
