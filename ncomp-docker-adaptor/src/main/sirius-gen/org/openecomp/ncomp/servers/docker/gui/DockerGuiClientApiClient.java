
/*-
 * ============LICENSE_START==========================================
 * OPENECOMP - DCAE
 * ===================================================================
 * Copyright (c) 2017 AT&T Intellectual Property. All rights reserved.
 * ===================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END============================================
 */
	
// Autogenerated
// Do not edit. No need to extend this class.
package org.openecomp.ncomp.servers.docker.gui;

import org.openecomp.ncomp.sirius.manager.AbstractClient;
import org.openecomp.ncomp.sirius.manager.HighAvailabilityClient;
import org.openecomp.ncomp.sirius.manager.GenericHttpClient;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiClientApiImpl;
import org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage;


import org.openecomp.ncomp.servers.docker.DockerDockerAdaptor; 



 
@SuppressWarnings("unchecked")
public class DockerGuiClientApiClient extends GuiClientApiImpl {
	public static final Logger logger = Logger.getLogger(DockerGuiClientApiClient.class);
	public AbstractClient client;

	public DockerGuiClientApiClient(String file, String name) {
		DockerDockerAdaptor.ecoreSetup(); 
		client = new GenericHttpClient(file,name);
		client.add("/gui", this);
	}

	public DockerGuiClientApiClient(String file, String name1, String name2) {
		HighAvailabilityClient client1 = new HighAvailabilityClient(file,name1,name2);
		client = client1.all; // requests should be forwarded to all.
		client.add("/gui", this);
	}
	
	public DockerGuiClientApiClient(AbstractClient c) {
		client = c;
		client.add("/resources", this);
	}



	@Override
	public org.openecomp.ncomp.gwt.siriusportal.model.GuiTree getTree() {
		EClass c = ModelPackage.eINSTANCE.getGuiClientApi(); //foo
		return (org.openecomp.ncomp.gwt.siriusportal.model.GuiTree) client.operationPath("/gui", c, "getTree", null);
	}

	@Override
	public org.openecomp.ncomp.gwt.siriusportal.model.GuiObject getObject(java.lang.String path) {
		EClass c = ModelPackage.eINSTANCE.getGuiClientApi(); //foo
		return (org.openecomp.ncomp.gwt.siriusportal.model.GuiObject) client.operationPath("/gui", c, "getObject", null, path);
	}

	@Override
	public org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie getTimeSerie(java.lang.String path, java.lang.String start, java.lang.String end, java.lang.String duration) {
		EClass c = ModelPackage.eINSTANCE.getGuiClientApi(); //foo
		return (org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie) client.operationPath("/gui", c, "getTimeSerie", null, path,start,end,duration);
	}

	@Override
	public org.openecomp.ncomp.gwt.siriusportal.model.GuiTable getTable(java.lang.String path, java.lang.String start, java.lang.String end) {
		EClass c = ModelPackage.eINSTANCE.getGuiClientApi(); //foo
		return (org.openecomp.ncomp.gwt.siriusportal.model.GuiTable) client.operationPath("/gui", c, "getTable", null, path,start,end);
	}

	@Override
	public org.openecomp.ncomp.gwt.siriusportal.model.GuiHtml getHtml(java.lang.String path, java.lang.String start, java.lang.String end) {
		EClass c = ModelPackage.eINSTANCE.getGuiClientApi(); //foo
		return (org.openecomp.ncomp.gwt.siriusportal.model.GuiHtml) client.operationPath("/gui", c, "getHtml", null, path,start,end);
	}

	@Override
	public org.openecomp.ncomp.sirius.manager.graph.GuiGraph getGraph(java.lang.String path, java.lang.String start, java.lang.String end) {
		EClass c = ModelPackage.eINSTANCE.getGuiClientApi(); //foo
		return (org.openecomp.ncomp.sirius.manager.graph.GuiGraph) client.operationPath("/gui", c, "getGraph", null, path,start,end);
	}

}
