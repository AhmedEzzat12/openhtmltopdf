/*
 * {{{ header & license
 * Copyright (c) 2004 Joshua Marinacci
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.	See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 * }}}
 */
package org.xhtmlrenderer.forms;

import javax.swing.JPasswordField;
import javax.swing.JTextField;


/**
 * Description of the Class
 *
 * @author   empty
 */
public class InputPassword extends InputText {

    /** Constructor for the InputPassword object */
    public InputPassword() { }

    /**
     * Description of the Method
     *
     * @return   Returns
     */
    protected JTextField _createComponent() {
        return new JPasswordField();
    }
    /*
     * public JComponent createComponent(Context c, Element elem) {
     * JPasswordField comp = new JPasswordField();
     * commonPrep(comp,elem);
     * if(elem.hasAttribute("value")) {
     * comp.setText(elem.getAttribute("value"));
     * }
     * if(elem.hasAttribute("size")) {
     * comp.setColumns(Integer.parseInt(elem.getAttribute("size")));
     * } else {
     * comp.setColumns(15);
     * }
     * if(elem.hasAttribute("readonly") &&
     * elem.getAttribute("readonly").equals("readonly")) {
     * comp.setEditable(false);
     * }
     * return comp;
     * }
     */
}

/*
 * $Id$
 *
 * $Log$
 * Revision 1.3  2004/10/23 13:40:28  pdoubleya
 * Re-formatted using JavaStyle tool.
 * Cleaned imports to resolve wildcards except for common packages (java.io, java.util, etc).
 * Added CVS log comments at bottom.
 *
 *
 */

