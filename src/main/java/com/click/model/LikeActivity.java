package com.click.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "like_activity")
public class LikeActivity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int		id	;

	@Column(name = "IMAGE_ID")
	private int	imageId;
	
	@Column(name = "CREATED_BY")
	private int	createdBy;
	
	@Column(name = "CREATED_BY_NAME")
	@NotNull
	private String	createdByName	= "";
	
	@Column(name = "ALBUM_ID")
	@NotNull
	private String	albumId	= "";

	@Column(name = "SCHOOL_ID")
	private int		schoolId		= -1;
	
	@Column(name = "SCHOOL_NAME")
	private String	schoolName	= "";
	
	@Column(name = "CREATED_ON")
	@NotNull
	private long	createdOn;

	@Column(name = "CREATED_ON_DATE")
	@NotNull
	private Date	createdOnDate;
	
	@Column(name = "MODIFIED_ON")
	@NotNull
	private long	modifiedOn;

	@Column(name = "MODIFIED_ON_DATE")
	@NotNull
	private Date	modifiedOnDate;
	
	@Column(name = "LIKED_BY")
	@NotNull
	private int		likedBy;

	@Column(name = "LIKED_BY_NAME")
	@NotNull
	private String	likedByName	= "";
	
	@Column(name = "IS_DELETED")
	private Boolean	isDeleted		= false;
	
	@Column(name = "IS_ACTIVE")
	private Boolean	isActive		= false;
	
	public LikeActivity()
	{

	}

	public LikeActivity(int imageId)
	{
		this.imageId = imageId;
		this.modifiedOnDate = this.createdOnDate = new Date();
		this.modifiedOn = this.createdOn = System.currentTimeMillis();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getImageId() {
		return imageId;
	}

	public void setImageId(int imageId) {
		this.imageId = imageId;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedByName() {
		return createdByName;
	}

	public void setCreatedByName(String createdByName) {
		this.createdByName = createdByName;
	}

	public String getAlbumId() {
		return albumId;
	}

	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public long getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(long createdOn) {
		this.createdOn = createdOn;
	}

	public Date getCreatedOnDate() {
		return createdOnDate;
	}

	public void setCreatedOnDate(Date createdOnDate) {
		this.createdOnDate = createdOnDate;
	}

	public long getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(long modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public Date getModifiedOnDate() {
		return modifiedOnDate;
	}

	public void setModifiedOnDate(Date modifiedOnDate) {
		this.modifiedOnDate = modifiedOnDate;
	}

	public int getLikedBy() {
		return likedBy;
	}

	public void setLikedBy(int likedBy) {
		this.likedBy = likedBy;
	}

	public String getLikedByName() {
		return likedByName;
	}

	public void setLikedByName(String likedByName) {
		this.likedByName = likedByName;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
}
