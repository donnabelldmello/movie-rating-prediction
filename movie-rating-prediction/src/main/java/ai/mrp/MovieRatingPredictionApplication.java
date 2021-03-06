/*
 * Copyright 2016 the original author or authors.
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

package ai.mrp;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ai.mrp.inf.ClassificationEngine;

/**
 * The Movie Rating Predication app bootstrap.
 *
 * @author Donnabell Dmello <ddmello@usc.edu>
 * @author Venil Noronha <vnoronha@usc.edu>
 */
@SpringBootApplication
public class MovieRatingPredictionApplication implements DisposableBean {

	@Autowired
	private ClassificationEngine engine;

	@Override
	public void destroy() throws Exception {
		engine.stop();
	}

	public static void main(String[] args) {
		SpringApplication.run(MovieRatingPredictionApplication.class, args);
	}

}
