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
package org.concordion.ext;

/**
 * Indicates that a screenshot is unavailable. 
 */
public class ScreenshotUnavailableException extends RuntimeException {

    private static final long serialVersionUID = -2304421629991811815L;

    public ScreenshotUnavailableException() {
    }

    public ScreenshotUnavailableException(String message) {
        super(message);
    }
    
    public ScreenshotUnavailableException(Throwable ex) {
        super(ex);
    }
}
