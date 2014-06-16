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

package ims.clinical.vo;

/**
 * Linked to clinical.RACPPastMedicalHistory business object (ID: 1072100075).
 */
public class RACPPastMedicalHistoryVo extends ims.clinical.vo.RACPPastMedicalHistoryRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public RACPPastMedicalHistoryVo()
	{
	}
	public RACPPastMedicalHistoryVo(Integer id, int version)
	{
		super(id, version);
	}
	public RACPPastMedicalHistoryVo(ims.clinical.vo.beans.RACPPastMedicalHistoryVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.pmhflag = bean.getPMHFlag();
		this.relevantdiagnosis = ims.core.vo.lookups.RACPRelevantDiagnosisListCollection.buildFromBeanCollection(bean.getRelevantDiagnosis());
		this.pmhnotes = bean.getPMHNotes();
		this.vsbp = bean.getVSBP() == null ? null : bean.getVSBP().buildVo();
		this.vspulse = bean.getVSPulse() == null ? null : bean.getVSPulse().buildVo();
		this.heightweight = bean.getHeightWeight() == null ? null : bean.getHeightWeight().buildVo();
		this.examnotes = bean.getExamNotes();
		this.ecgfindings = ims.core.vo.lookups.ECGFindingsCollection.buildFromBeanCollection(bean.getECGFindings());
		this.ecgnotes = bean.getECGNotes();
		this.examfindings = ims.core.vo.lookups.AuscultationFindingCollection.buildFromBeanCollection(bean.getExamFindings());
		this.carecontext = bean.getCareContext() == null ? null : new ims.core.admin.vo.CareContextRefVo(new Integer(bean.getCareContext().getId()), bean.getCareContext().getVersion());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.beans.RACPPastMedicalHistoryVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.pmhflag = bean.getPMHFlag();
		this.relevantdiagnosis = ims.core.vo.lookups.RACPRelevantDiagnosisListCollection.buildFromBeanCollection(bean.getRelevantDiagnosis());
		this.pmhnotes = bean.getPMHNotes();
		this.vsbp = bean.getVSBP() == null ? null : bean.getVSBP().buildVo(map);
		this.vspulse = bean.getVSPulse() == null ? null : bean.getVSPulse().buildVo(map);
		this.heightweight = bean.getHeightWeight() == null ? null : bean.getHeightWeight().buildVo(map);
		this.examnotes = bean.getExamNotes();
		this.ecgfindings = ims.core.vo.lookups.ECGFindingsCollection.buildFromBeanCollection(bean.getECGFindings());
		this.ecgnotes = bean.getECGNotes();
		this.examfindings = ims.core.vo.lookups.AuscultationFindingCollection.buildFromBeanCollection(bean.getExamFindings());
		this.carecontext = bean.getCareContext() == null ? null : new ims.core.admin.vo.CareContextRefVo(new Integer(bean.getCareContext().getId()), bean.getCareContext().getVersion());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.beans.RACPPastMedicalHistoryVoBean bean = null;
		if(map != null)
			bean = (ims.clinical.vo.beans.RACPPastMedicalHistoryVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.clinical.vo.beans.RACPPastMedicalHistoryVoBean();
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
		if(fieldName.equals("PMHFLAG"))
			return getPMHFlag();
		if(fieldName.equals("RELEVANTDIAGNOSIS"))
			return getRelevantDiagnosis();
		if(fieldName.equals("PMHNOTES"))
			return getPMHNotes();
		if(fieldName.equals("VSBP"))
			return getVSBP();
		if(fieldName.equals("VSPULSE"))
			return getVSPulse();
		if(fieldName.equals("HEIGHTWEIGHT"))
			return getHeightWeight();
		if(fieldName.equals("EXAMNOTES"))
			return getExamNotes();
		if(fieldName.equals("ECGFINDINGS"))
			return getECGFindings();
		if(fieldName.equals("ECGNOTES"))
			return getECGNotes();
		if(fieldName.equals("EXAMFINDINGS"))
			return getExamFindings();
		if(fieldName.equals("CARECONTEXT"))
			return getCareContext();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getPMHFlagIsNotNull()
	{
		return this.pmhflag != null;
	}
	public Boolean getPMHFlag()
	{
		return this.pmhflag;
	}
	public void setPMHFlag(Boolean value)
	{
		this.isValidated = false;
		this.pmhflag = value;
	}
	public boolean getRelevantDiagnosisIsNotNull()
	{
		return this.relevantdiagnosis != null;
	}
	public ims.core.vo.lookups.RACPRelevantDiagnosisListCollection getRelevantDiagnosis()
	{
		return this.relevantdiagnosis;
	}
	public void setRelevantDiagnosis(ims.core.vo.lookups.RACPRelevantDiagnosisListCollection value)
	{
		this.isValidated = false;
		this.relevantdiagnosis = value;
	}
	public boolean getPMHNotesIsNotNull()
	{
		return this.pmhnotes != null;
	}
	public String getPMHNotes()
	{
		return this.pmhnotes;
	}
	public static int getPMHNotesMaxLength()
	{
		return 255;
	}
	public void setPMHNotes(String value)
	{
		this.isValidated = false;
		this.pmhnotes = value;
	}
	public boolean getVSBPIsNotNull()
	{
		return this.vsbp != null;
	}
	public ims.core.vo.VSBloodPressure getVSBP()
	{
		return this.vsbp;
	}
	public void setVSBP(ims.core.vo.VSBloodPressure value)
	{
		this.isValidated = false;
		this.vsbp = value;
	}
	public boolean getVSPulseIsNotNull()
	{
		return this.vspulse != null;
	}
	public ims.core.vo.VSPulse getVSPulse()
	{
		return this.vspulse;
	}
	public void setVSPulse(ims.core.vo.VSPulse value)
	{
		this.isValidated = false;
		this.vspulse = value;
	}
	public boolean getHeightWeightIsNotNull()
	{
		return this.heightweight != null;
	}
	public ims.core.vo.VSMetrics getHeightWeight()
	{
		return this.heightweight;
	}
	public void setHeightWeight(ims.core.vo.VSMetrics value)
	{
		this.isValidated = false;
		this.heightweight = value;
	}
	public boolean getExamNotesIsNotNull()
	{
		return this.examnotes != null;
	}
	public String getExamNotes()
	{
		return this.examnotes;
	}
	public static int getExamNotesMaxLength()
	{
		return 1500;
	}
	public void setExamNotes(String value)
	{
		this.isValidated = false;
		this.examnotes = value;
	}
	public boolean getECGFindingsIsNotNull()
	{
		return this.ecgfindings != null;
	}
	public ims.core.vo.lookups.ECGFindingsCollection getECGFindings()
	{
		return this.ecgfindings;
	}
	public void setECGFindings(ims.core.vo.lookups.ECGFindingsCollection value)
	{
		this.isValidated = false;
		this.ecgfindings = value;
	}
	public boolean getECGNotesIsNotNull()
	{
		return this.ecgnotes != null;
	}
	public String getECGNotes()
	{
		return this.ecgnotes;
	}
	public static int getECGNotesMaxLength()
	{
		return 255;
	}
	public void setECGNotes(String value)
	{
		this.isValidated = false;
		this.ecgnotes = value;
	}
	public boolean getExamFindingsIsNotNull()
	{
		return this.examfindings != null;
	}
	public ims.core.vo.lookups.AuscultationFindingCollection getExamFindings()
	{
		return this.examfindings;
	}
	public void setExamFindings(ims.core.vo.lookups.AuscultationFindingCollection value)
	{
		this.isValidated = false;
		this.examfindings = value;
	}
	public boolean getCareContextIsNotNull()
	{
		return this.carecontext != null;
	}
	public ims.core.admin.vo.CareContextRefVo getCareContext()
	{
		return this.carecontext;
	}
	public void setCareContext(ims.core.admin.vo.CareContextRefVo value)
	{
		this.isValidated = false;
		this.carecontext = value;
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
		if(this.vsbp != null)
		{
			if(!this.vsbp.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.vspulse != null)
		{
			if(!this.vspulse.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.heightweight != null)
		{
			if(!this.heightweight.isValidated())
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
		if(this.pmhnotes != null)
			if(this.pmhnotes.length() > 255)
				listOfErrors.add("The length of the field [pmhnotes] in the value object [ims.clinical.vo.RACPPastMedicalHistoryVo] is too big. It should be less or equal to 255");
		if(this.vsbp != null)
		{
			String[] listOfOtherErrors = this.vsbp.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.vspulse != null)
		{
			String[] listOfOtherErrors = this.vspulse.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.heightweight != null)
		{
			String[] listOfOtherErrors = this.heightweight.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.examnotes != null)
			if(this.examnotes.length() > 1500)
				listOfErrors.add("The length of the field [examnotes] in the value object [ims.clinical.vo.RACPPastMedicalHistoryVo] is too big. It should be less or equal to 1500");
		if(this.ecgnotes != null)
			if(this.ecgnotes.length() > 255)
				listOfErrors.add("The length of the field [ecgnotes] in the value object [ims.clinical.vo.RACPPastMedicalHistoryVo] is too big. It should be less or equal to 255");
		if(this.carecontext == null)
			listOfErrors.add("CareContext is mandatory");
		if(this.countFieldsWithValue() < 2)
		{
			listOfErrors.add("A minimum of 2 data fields must be entered");
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
	
		RACPPastMedicalHistoryVo clone = new RACPPastMedicalHistoryVo(this.id, this.version);
		
		clone.pmhflag = this.pmhflag;
		if(this.relevantdiagnosis == null)
			clone.relevantdiagnosis = null;
		else
			clone.relevantdiagnosis = (ims.core.vo.lookups.RACPRelevantDiagnosisListCollection)this.relevantdiagnosis.clone();
		clone.pmhnotes = this.pmhnotes;
		if(this.vsbp == null)
			clone.vsbp = null;
		else
			clone.vsbp = (ims.core.vo.VSBloodPressure)this.vsbp.clone();
		if(this.vspulse == null)
			clone.vspulse = null;
		else
			clone.vspulse = (ims.core.vo.VSPulse)this.vspulse.clone();
		if(this.heightweight == null)
			clone.heightweight = null;
		else
			clone.heightweight = (ims.core.vo.VSMetrics)this.heightweight.clone();
		clone.examnotes = this.examnotes;
		if(this.ecgfindings == null)
			clone.ecgfindings = null;
		else
			clone.ecgfindings = (ims.core.vo.lookups.ECGFindingsCollection)this.ecgfindings.clone();
		clone.ecgnotes = this.ecgnotes;
		if(this.examfindings == null)
			clone.examfindings = null;
		else
			clone.examfindings = (ims.core.vo.lookups.AuscultationFindingCollection)this.examfindings.clone();
		clone.carecontext = this.carecontext;
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
		if (!(RACPPastMedicalHistoryVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A RACPPastMedicalHistoryVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((RACPPastMedicalHistoryVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((RACPPastMedicalHistoryVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.pmhflag != null)
			count++;
		if(this.relevantdiagnosis != null)
			count++;
		if(this.pmhnotes != null)
			count++;
		if(this.vsbp != null)
			count++;
		if(this.vspulse != null)
			count++;
		if(this.heightweight != null)
			count++;
		if(this.examnotes != null)
			count++;
		if(this.ecgfindings != null)
			count++;
		if(this.ecgnotes != null)
			count++;
		if(this.examfindings != null)
			count++;
		if(this.carecontext != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 11;
	}
	protected Boolean pmhflag;
	protected ims.core.vo.lookups.RACPRelevantDiagnosisListCollection relevantdiagnosis;
	protected String pmhnotes;
	protected ims.core.vo.VSBloodPressure vsbp;
	protected ims.core.vo.VSPulse vspulse;
	protected ims.core.vo.VSMetrics heightweight;
	protected String examnotes;
	protected ims.core.vo.lookups.ECGFindingsCollection ecgfindings;
	protected String ecgnotes;
	protected ims.core.vo.lookups.AuscultationFindingCollection examfindings;
	protected ims.core.admin.vo.CareContextRefVo carecontext;
	private boolean isValidated = false;
	private boolean isBusy = false;
}