/*
 * 2007-2016 [PagSeguro Internet Ltda.]
 * 
 * NOTICE OF LICENSE
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Copyright: 2007-2016 PagSeguro Internet Ltda.
 * Licence: http://www.apache.org/licenses/LICENSE-2.0
 */

package br.com.uol.pagseguro.api.common.domain.converter;

import br.com.uol.pagseguro.api.common.domain.Parameter;
import br.com.uol.pagseguro.api.utils.AbstractJsonConverter;
import br.com.uol.pagseguro.api.utils.RequestJson;

/**
 * Converter for parameter. Used in json version of the application
 * Used to convert attributes of parameter in request json.
 *
 * @author PagSeguro Internet Ltda.
 */
public class ParameterJsonConverter extends AbstractJsonConverter<Iterable<? extends Parameter>> {

  /**
   * Convert attributes of parameter in request json
   *
   * @param requestJson Request Map used to pass params to api
   * @param parameters The interface of parameters
   * @see RequestJson
   * @see Parameter
   * @see AbstractJsonConverter#convert(Object)
   */
  @Override
  protected void convert(RequestJson requestJson, Iterable<? extends Parameter> parameters) {
    for (Parameter parameter : parameters) {
      requestJson.putString(parameter.getName(), parameter.getValue());
    }
  }
}
