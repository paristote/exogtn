/**
 * Copyright (C) 2009 eXo Platform SAS.
 * 
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 * 
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.exoplatform.portal.config.security.nav;

import org.exoplatform.portal.config.model.PageNavigation;
import org.exoplatform.portal.config.security.AbstractTestUserACL;

/**
 * @author <a href="mailto:julien.viet@exoplatform.com">Julien Viet</a>
 * @version $Revision$
 */
public class TestUserNavACL extends AbstractTestUserACL
{

   public void testNav()
   {

      PageNavigation nav = new PageNavigation();
      nav.setOwnerType("user");
      nav.setOwnerId("user");

      assertTrue(root.hasEditPermission(nav));
      assertFalse(administrator.hasEditPermission(nav));
      assertFalse(manager.hasEditPermission(nav));
      assertTrue(user.hasEditPermission(nav));
      assertFalse(guest.hasEditPermission(nav));
   }
}
