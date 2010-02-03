/**
 * Copyright 2008-2010 Digital Enterprise Research Institute (DERI)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.deri.any23.source;

import java.io.IOException;

/**
 * A factory that creates local copies of {@link DocumentSource}s.
 * The copies are usually identical in content, but stored
 * locally, and hence it is faster to access them repeatedly.
 *
 * @author Richard Cyganiak (richard@cyganiak.de)
 */
public interface LocalCopyFactory {
    DocumentSource createLocalCopy(DocumentSource in) throws IOException;
}
