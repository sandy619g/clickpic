
package com.click.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.click.util.MemoriesUtils;
import com.google.gson.Gson;
import com.sun.istack.NotNull;

@Entity
@Table(name = "image")
public class Image
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int		id				= -1;

	@Column(name = "NAME")
	private String	name			= null;

	@Column(name = "ALBUM_ID")
	private String	albumId			= null;

	@Column(name = "SCHOOL_ID")
	private int		schoolId		= -1;

	@Column(name = "SHARED_WITH")
	private String	sharedWith		= null;

	@Column(name = "TAGS")
	private String	tags			= null;

	@Column(name = "HEIGHT")
	private int		height			= 0;

	@Column(name = "WIDTH")
	private int		width			= 0;

	@Column(name = "STORAGE_KEY")
	private String	storageKey		= null;

	@Column(name = "CREATED_ON")
	@NotNull
	private long	createdOn;

	@Column(name = "CREATED_ON_DATE")
	@NotNull
	private Date	createdOnDate;

	@Column(name = "IS_DELETED")
	private Boolean	isDeleted		= false;

	private String	thumbnailURL;

	@Column(name = "created_by")
	@NotNull
	private int		createdBy;

	@Column(name = "created_by_name")
	@NotNull
	private String	createdByName	= "";

	@Column(name = "created_by_email")
	private String	createdByEmail;

	@Column(name = "MODIFIED_ON")
	private long	modifiedOn;

	@Column(name = "MODIFIED_ON_DATE")
	private Date	modifiedOnDate;

	@Column(name = "LIKE_COUNT")
	private int likeCount = 0;

	@Column(name = "REPORT_COUNT")
	private int reportCount = 0;

	@Column(name = "school_name")
	private String schoolName = "";
	
	@Column(name = "album_name")
	private String albumName = "";

	@Column(name = "SPAM_DELETED")
	private Boolean spamDeleted = false;

	@Transient
	private Boolean likedByMe = false;
	
	@Transient
	private Boolean reportedByMe = false;

	public Image()
	{

	}
	
	public Image(String name)
	{
		this.name = name;
		this.modifiedOnDate = this.createdOnDate = new Date();
		this.modifiedOn = this.createdOn = System.currentTimeMillis();
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
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

	public String getAlbumId()
	{
		return albumId;
	}

	public void setAlbumId(String albumId)
	{
		this.albumId = albumId;
	}

	public int getSchoolId()
	{
		return schoolId;
	}

	public void setSchoolId(int schoolId)
	{
		this.schoolId = schoolId;
	}

	public String getSharedWith()
	{
		return sharedWith;
	}

	public void setSharedWith(String sharedWith)
	{
		this.sharedWith = sharedWith;
	}

	public String getTags()
	{
		return tags;
	}

	public void setTags(String tags)
	{
		this.tags = tags;
	}

	public String getStorageKey()
	{
		return storageKey;
	}

	public void setStorageKey(String storageKey)
	{
		this.storageKey = storageKey;
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

	public Boolean getIsDeleted()
	{
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted)
	{
		this.isDeleted = isDeleted;
	}

	public int getHeight()
	{
		return height;
	}

	public void setHeight(int height)
	{
		this.height = height;
	}

	public int getWidth()
	{
		return width;
	}

	public void setWidth(int width)
	{
		this.width = width;
	}

	public String getThumbnailURL()
	{
		return MemoriesUtils.getThumbnailUrl(this);
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

	public long getModifiedOn()
	{
		return modifiedOn;
	}

	public void setModifiedOn(long modifiedOn)
	{
		this.modifiedOn = modifiedOn;
	}

	public Date getModifiedOnDate()
	{
		return modifiedOnDate;
	}

	public void setModifiedOnDate(Date modifiedOnDate)
	{
		this.modifiedOnDate = modifiedOnDate;
	}

	public void setBothModified(long modifiedOn)
	{
		this.modifiedOn = modifiedOn;
		this.modifiedOnDate = new Date(modifiedOn);
	}

	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	public int getReportCount() {
		return reportCount;
	}

	public void setReportCount(int reportCount) {
		this.reportCount = reportCount;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public Boolean getSpamDeleted() {
		return spamDeleted;
	}

	public void setSpamDeleted(Boolean spamDeleted) {
		this.spamDeleted = spamDeleted;
	}

	public Boolean getLikedByMe() {
		return likedByMe;
	}

	public void setLikedByMe(Boolean likedByMe) {
		this.likedByMe = likedByMe;
	}

	public Boolean getReportedByMe() {
		return reportedByMe;
	}

	public void setReportedByMe(Boolean reportedByMe) {
		this.reportedByMe = reportedByMe;
	}	
	
	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	@Override
	public String toString()
	{
		/* return "Image [id=" + id + ", name=" + name + ", albumId=" + albumId + ", schoolId=" + schoolId + ", sharedWith=" + sharedWith + ", tags=" + tags + ", storageKey=" + storageKey + ", createdOn=" + createdOn + ", createdOnDate=" + createdOnDate
				+ ", isDeleted=" + isDeleted + "]"; */
		return new Gson().toJson(this);
	}
}
