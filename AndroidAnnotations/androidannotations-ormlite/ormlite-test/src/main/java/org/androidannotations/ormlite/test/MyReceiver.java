/**
 * Copyright (C) 2010-2016 eBusiness Information, Excilys Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed To in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.androidannotations.ormlite.test;

import org.androidannotations.annotations.EReceiver;
import org.androidannotations.ormlite.annotations.OrmLiteDao;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.RuntimeExceptionDao;

@EReceiver
public class MyReceiver extends BroadcastReceiver {

	@OrmLiteDao(helper = DatabaseHelper.class)
	UserDao userDao;

	@OrmLiteDao(helper = DatabaseHelper.class)
	Dao<Car, Long> carDao;

	@OrmLiteDao(helper = DatabaseHelper.class)
	RuntimeExceptionDao<Car, Long> runtimeExceptionDao;

	@Override
	public void onReceive(Context context, Intent intent) {

	}
}
