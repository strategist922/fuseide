/*******************************************************************************
 * Copyright (c) 2013 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/

package org.fusesource.ide.fabric.views.logs;

import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.swt.graphics.Image;

public class LogLevelImageProvider extends ColumnLabelProvider {

	@Override
	public Image getImage(Object element) {
		LogEventBean le = LogEventBean.toLogEventBean(element);
		if (le != null) {
			return le.getLevelImage();
		}
		return super.getImage(element);
	}

	@Override
	public String getText(Object element) {
		LogEventBean le = LogEventBean.toLogEventBean(element);
		if (le != null) {
			return le.getLevel();
		}
		return super.getText(element);
	}

	@Override
	public String getToolTipText(Object element) {
		LogEventBean le = LogEventBean.toLogEventBean(element);
		if (le != null) {
			return le.getMessage();
		}
		return super.getToolTipText(element);
	}



}
