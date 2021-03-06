/* ========================================================================
 * PlantUML : a free UML diagram generator
 * ========================================================================
 *
 * (C) Copyright 2009-2017, Arnaud Roques
 *
 * Project Info:  http://plantuml.com
 * 
 * This file is part of PlantUML.
 *
 * PlantUML is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PlantUML distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public
 * License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 *
 *
 * Original Author:  Arnaud Roques
 * 
 *
 */
package net.sourceforge.plantuml.cucadiagram;

import net.sourceforge.plantuml.cucadiagram.dot.Neighborhood;
import net.sourceforge.plantuml.graphic.USymbol;
import net.sourceforge.plantuml.skin.VisibilityModifier;
import net.sourceforge.plantuml.svek.IEntityImage;

public interface ILeaf extends IEntity {

	public EntityPosition getEntityPosition();

	public void setContainer(IGroup container);

	public boolean isTop();

	public void setTop(boolean top);

	public boolean hasNearDecoration();

	public void setNearDecoration(boolean nearDecoration);

	public int getXposition();

	public void setXposition(int pos);

	public IEntityImage getSvekImage();

	public String getGeneric();

	public void muteToType(LeafType newType, USymbol newSymbol);

	public void setGeneric(String generic);

	public void setSvekImage(IEntityImage svekImage);

	public void setNeighborhood(Neighborhood neighborhood);

	public Neighborhood getNeighborhood();

	public boolean hasPort();

	public void setHasPort(boolean hasPort);

	public void setVisibilityModifier(VisibilityModifier visibility);

	public VisibilityModifier getVisibilityModifier();

}
