/*
 * Copyright (c) 2010 Two Ten Consulting Limited, New Zealand 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package test.concordion.ext.storyboard;

import org.concordion.api.extension.ConcordionExtension;
import org.concordion.api.extension.ConcordionExtensionFactory;
import org.concordion.ext.ScreenshotExtension;
import org.concordion.ext.ScreenshotTaker;
import org.concordion.ext.StoryboardExtension;

public class DummyStoryboardFactory implements ConcordionExtensionFactory {
    private static StoryboardExtension storyboard = null;
    private static ScreenshotTaker screenshotTaker = null;
    private static boolean addCardOnFailure = true;
    
    public static void prepareWithScreenShot() {
    	screenshotTaker = new DummyScreenshotTaker();
    }
    public static void prepareWithoutScreenShot() {
    	screenshotTaker = null;
	}
    
    public static void setAddCardOnFailure(final boolean value) {
    	addCardOnFailure = value;
	}    
    
    @Override
    public ConcordionExtension createExtension() {    	
    	storyboard = new StoryboardExtension();
    	storyboard.setScreenshotTaker(screenshotTaker);
    	storyboard.setAddCardOnFailure(addCardOnFailure);
        return storyboard;
    }
    
    public static StoryboardExtension getStoryboard() {
    	return storyboard;
    }
}