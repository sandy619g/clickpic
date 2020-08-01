
package com.click.model;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.gson.Gson;
import com.sun.istack.NotNull;

@Entity
@Table(name = "album")
public class DefaultAlbum
{
	public static final String	ALL		= "ALL";
	public static final String	SCHOOL	= "SCHOOL";

	@Id
	private String				id;

	@Column(name = "name")
	@NotNull
	private String				name;

	@Column(name = "created_by")
	@NotNull
	private int					createdBy;

	@Column(name = "created_by_name")
	@NotNull
	private String				createdByName;

	@Column(name = "created_by_email")
	private String				createdByEmail;

	@Column(name = "role_id")
	@NotNull
	private int					roleId;

	@Column(name = "phone_number")
	@NotNull
	private long				phoneNumber;

	@Column(name = "created_on")
	@NotNull
	private long				createdOn;

	@Column(name = "created_on_date")
	@NotNull
	private Date				createdOnDate;

	@Column(name = "school_id")
	private int					schoolId;

	@Column(name = "school_name")
	private String				schoolName;

	// All or School or groups
	@Column(name = "shared_with")
	private String				sharedWith;

	@Column(name = "album_pic_id")
	private int					picId;

	@Column(name = "album_pic_name")
	private String				picName;

	@Column(name = "album_pic_url")
	private String				albumPicURL;

	@Column(name = "is_deleted")
	private boolean				isDeleted;

	@Column(name = "image_count")
	private int					imageCount;

	@Column(name = "modified_on")
	private long				modifiedOn;

	@Column(name = "modified_on_date")
	private Date				modifiedOnDate;

	public DefaultAlbum()
	{
		this.id = UUID.randomUUID().toString();
		this.createdOnDate = new Date();
		this.createdOn = createdOnDate.getTime();
	}

	public DefaultAlbum(String name, int createdBy, String createdByName, long phoneNumber, String sharedWith)
	{
		this.id = UUID.randomUUID().toString();
		this.createdOnDate = new Date();
		this.createdOn = createdOnDate.getTime();
		this.name = name;
		this.createdBy = createdBy;
		this.createdByName = createdByName;
		this.phoneNumber = phoneNumber;
		this.sharedWith = sharedWith;
	}

	public String getId()
	{
		return id;
	}

	private void setId(String id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getCreatedBy()
	{
		return createdBy;
	}

	public void setCreatedBy(int createdBy)
	{
		this.createdBy = createdBy;
	}

	public String getCreatedByName()
	{
		return createdByName;
	}

	public void setCreatedByName(String createdByName)
	{
		this.createdByName = createdByName;
	}

	public String getCreatedByEmail()
	{
		return createdByEmail;
	}

	public void setCreatedByEmail(String createdByEmail)
	{
		this.createdByEmail = createdByEmail;
	}

	public long getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	public long getCreatedOn()
	{
		return createdOn;
	}

	public void setCreatedOn(long createdOn)
	{
		this.createdOn = createdOn;
	}

	public Date getCreatedOnDate()
	{
		return createdOnDate;
	}

	public void setCreatedOnDate(Date createdOnDate)
	{
		this.createdOnDate = createdOnDate;
	}

	public int getSchoolId()
	{
		return schoolId;
	}

	public void setSchoolId(int schoolId)
	{
		this.schoolId = schoolId;
	}

	public String getSchoolName()
	{
		return schoolName;
	}

	public void setSchoolName(String schoolName)
	{
		this.schoolName = schoolName;
	}

	public String getSharedWith()
	{
		return sharedWith;
	}

	public void setSharedWith(String sharedWith)
	{
		this.sharedWith = sharedWith;
	}

	public int getPicId()
	{
		return picId;
	}

	public void setPicId(int picId)
	{
		this.picId = picId;
	}

	public String getPicName()
	{
		return picName;
	}

	public void setPicName(String picName)
	{
		this.picName = picName;
	}

	public String getAlbumPicURL()
	{
		return this.albumPicURL;
	}

	public void setAlbumPicURL(String albumPicURL)
	{
		this.albumPicURL = albumPicURL;
	}

	public boolean isDeleted()
	{
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted)
	{
		this.isDeleted = isDeleted;
	}

	public int getImageCount()
	{
		return imageCount;
	}

	public void setImageCount(int imageCount)
	{
		this.imageCount = imageCount;
	}

	public Date getModifiedOnDate()
	{
		return modifiedOnDate;
	}

	public void setModifiedOnDate(Date modifiedOnDate)
	{
		this.modifiedOnDate = modifiedOnDate;
	}

	public int getRoleId()
	{
		return roleId;
	}

	public void setRoleId(int roleId)
	{
		this.roleId = roleId;
	}

	public long getModifiedOn()
	{
		return modifiedOn;
	}

	public void setModifiedOn(long modifiedOn)
	{
		this.modifiedOn = modifiedOn;
	}

	public void setBothModified(long modifiedOn)
	{
		this.modifiedOn = modifiedOn;
		this.modifiedOnDate = new Date(modifiedOn);
	}

	@Override
	public String toString()
	{
		//		return "ID: " + id + "  , name: " + name;
		return new Gson().toJson(this);
	}

}