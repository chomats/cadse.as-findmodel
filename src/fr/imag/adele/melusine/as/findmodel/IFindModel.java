/* 
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package fr.imag.adele.melusine.as.findmodel;



/**

*/
public interface IFindModel {

	/**
	    @generated
	*/
	String AS_ID = "AS.Melusine.FindModel";

	/** The Constant MODEL_PREFIX. */
	public static final String MODEL_PREFIX = "Model.";
	
	
	/**
	 * find the list of the model for the domain domainName.
	 * 
	 * @param domainName
	 *            the name of the domain
	 * @param qualifiedModelName
	 *            the qualified model name
	 * 
	 * @return the list
	 * 
	 * @exception IllegalArgumentException(domainName+"
	 *                Model not found")
	 */
	public ModelEntry findQualifiedModel(String domainName, String qualifiedModelName);
	
	
	/**
	 * find the list of the model for the domain domainName.
	 * 
	 * @param domainName
	 *            the name of the domain
	 * 
	 * @return the list
	 * 
	 * @exception IllegalArgumentException(domainName+"
	 *                Model not found")
	 */
	public ModelEntry[] findModelEntries(String domainName);
	
	
	/**
	 * find the list of the model for the domain domainName.
	 * 
	 * @param domainName
	 *            the name of the domain
	 * 
	 * @return the list
	 * 
	 * @exception IllegalArgumentException(domainName+"
	 *                Model not found")
	 */
	public ModelEntry[] findModelEntries(String domainName, CheckModel check);
	

	/**
	 * find the list of the model for the domain domainName.
	 * 
	 * @param domainName
	 *            the name of the domain
	 * 
	 * @return An entry of model.
	 * 
	 * @exception IllegalArgumentException(domainName+"
	 *                Model not found")
	 * @exception IllegalArgumentException(domainName+"
	 *                has more one model")
	 */
	public ModelEntry findModelEntry(String domainName) ;

	
	
}
