package com.tutorialwing.introslidertutorial;

import android.app.Application;

/**
 * Created by Rajeevkumar on 25/04/17.
 */

public class IntroApp extends Application {

	@Override
	public void onCreate() {
		super.onCreate();

		Globals.init(this);
	}
}
