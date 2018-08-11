/*
 * Asset Share Commons
 *
 * Copyright (C) 2017 Adobe
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.adobe.aem.commons.assetshare.components.details.impl;

import com.adobe.aem.commons.assetshare.components.details.EmptyTextComponent;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Optional;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

public abstract class AbstractEmptyTextComponent implements EmptyTextComponent {
    @ValueMapValue
    @Optional
    @Default(values = "")
    protected String emptyText;

    @Override
    public boolean hasEmptyText() {
        return StringUtils.isNotBlank(emptyText);
    }
}