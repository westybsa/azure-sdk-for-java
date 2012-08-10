/**
 * Copyright 2011 Microsoft Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.microsoft.windowsazure.services.media.implementation;

import java.net.URI;
import java.net.URISyntaxException;

import javax.ws.rs.core.UriBuilder;

public class ResourceLocationManager {
    private URI baseURI;

    public ResourceLocationManager(String baseUri) throws URISyntaxException {
        this.baseURI = new URI(baseUri);
    }

    public URI getBaseURI() {
        return baseURI;
    }

    public URI getRedirectedURI(URI originalURI) {
        return UriBuilder.fromUri(baseURI).path(originalURI.getPath()).build();
    }

    public void setRedirectedURI(String newURI) throws URISyntaxException {
        baseURI = new URI(newURI);
    }
}
