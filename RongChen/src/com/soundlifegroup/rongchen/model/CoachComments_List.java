package com.soundlifegroup.rongchen.model;

import java.util.List;

public class CoachComments_List {

	private int count;
	private String next;
	private String previous;
	public List<CoachComments> results;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public String getPrevious() {
		return previous;
	}

	public void setPrevious(String previous) {
		this.previous = previous;
	}

	public List<CoachComments> getResults() {
		return results;
	}

	public void setResults(List<CoachComments> results) {
		this.results = results;
	}

	public class CoachComments {
		private String url;
		private String id;
		private String content;
		private String star;
		private String coach;
		private String user;
		private String userAvatar;
		private String userName;
		private String coachAvatar;
		private String coachName;
		private String createDate;

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getStar() {
			return star;
		}

		public void setStar(String star) {
			this.star = star;
		}

		public String getCoach() {
			return coach;
		}

		public void setCoach(String coach) {
			this.coach = coach;
		}

		public String getUser() {
			return user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public String getUserAvatar() {
			return userAvatar;
		}

		public void setUserAvatar(String userAvatar) {
			this.userAvatar = userAvatar;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getCoachAvatar() {
			return coachAvatar;
		}

		public void setCoachAvatar(String coachAvatar) {
			this.coachAvatar = coachAvatar;
		}

		public String getCoachName() {
			return coachName;
		}

		public void setCoachName(String coachName) {
			this.coachName = coachName;
		}

		public String getCreateDate() {
			return createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}
	}

}
