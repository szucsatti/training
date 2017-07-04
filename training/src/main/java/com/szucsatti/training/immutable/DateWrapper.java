package com.szucsatti.training.immutable;

import java.util.Date;

public final class DateWrapper {

	private final Date date;
	
	private DateWrapper(Date date) {
		super();
		this.date = date;
	}

	public Date getDate() {
		return new Date(date.getTime());
	}

	public long getTime(){
		return getDate().getTime();
	}
	
	public static final DateWrapper getDateWrapper(final Date date){
		if(date != null){
			return new DateWrapper(date);
		}
		return null;
	}
	
}
