/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.fusesource.ide.zk.core.widgets.grid;

import java.util.EventListener;

/**
 * Interface that receives {@link GridCompositeEvent}.
 * 
 * @author Mark Masse
 */
public interface IGridCompositeEventListener extends EventListener {

    /**
     * Indicates that the {@link GridComposite} has been modified in some way and should be validated.
     * 
     * @param event The {@link GridCompositeEvent}.
     */
    public void modified(GridCompositeEvent event);

}
