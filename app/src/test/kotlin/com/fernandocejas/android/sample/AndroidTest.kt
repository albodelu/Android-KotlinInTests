/**
 * Copyright (C) 2017 Fernando Cejas Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fernandocejas.android.sample

import android.app.Application
import android.content.Context
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.RuntimeEnvironment
import org.robolectric.annotation.Config
import java.io.File

/**
 * Base class for Robolectric data layer tests.
 * Inherit from this class to create a test.
 */
@RunWith(RobolectricTestRunner::class)
@Config(constants = BuildConfig::class, application = AndroidTest.ApplicationStub::class, sdk = intArrayOf(21))
abstract class AndroidTest {

    fun context(): Context {
        return RuntimeEnvironment.application
    }

    fun cacheDir(): File {
        return RuntimeEnvironment.application.cacheDir
    }

    internal class ApplicationStub : Application()
}