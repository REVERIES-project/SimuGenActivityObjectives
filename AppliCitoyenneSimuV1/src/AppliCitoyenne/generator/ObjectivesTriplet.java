package AppliCitoyenne.generator;

import AppliCitoyenne.simuV1.AppDesc;
import AppliCitoyenne.simuV1.GameObjective;
import AppliCitoyenne.simuV1.InventoryObjective;
import AppliCitoyenne.simuV1.LearningObjective;

public class ObjectivesTriplet implements Comparable {

	private LearningObjective lObj;
	private InventoryObjective iObj;
	private GameObjective gObj;
	
	public ObjectivesTriplet() {
		super();
	}
	
	public ObjectivesTriplet(InventoryObjective iObj, LearningObjective lObj, GameObjective gObj) {
		super();
		this.lObj = lObj;
		this.iObj = iObj;
		this.gObj = gObj;
	}

	public LearningObjective getlObj() {
		return lObj;
	}

	public InventoryObjective getiObj() {
		return iObj;
	}

	public GameObjective getgObj() {
		return gObj;
	}

	public void setlObj(LearningObjective lObj) {
		this.lObj = lObj;
	}

	public void setiObj(InventoryObjective iObj) {
		this.iObj = iObj;
	}

	public void setgObj(GameObjective gObj) {
		this.gObj = gObj;
	}

	public boolean compliant(AppDesc root) {
//		if ((!gObj.equals(root.getObjective().getGameobjective().get(0))) && (!gObj.equals(root.getObjective().getGameobjective().get(1))))
//			if (lObj.equals(root.getObjective().getLearningobjective().get(5)))
//					return false;
		return true;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gObj == null) ? 0 : gObj.hashCode());
		result = prime * result + ((iObj == null) ? 0 : iObj.hashCode());
		result = prime * result + ((lObj == null) ? 0 : lObj.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof ObjectivesTriplet))
			return false;
		ObjectivesTriplet other = (ObjectivesTriplet) obj;
		if (gObj == null) {
			if (other.gObj != null)
				return false;
		} else if (!gObj.equals(other.gObj))
			return false;
		if (iObj == null) {
			if (other.iObj != null)
				return false;
		} else if (!iObj.equals(other.iObj))
			return false;
		if (lObj == null) {
			if (other.lObj != null)
				return false;
		} else if (!lObj.equals(other.lObj))
			return false;
		return true;
	}

	@Override
	public int compareTo(Object o) {
		if (this.equals(o))
			return 0;
		else
			return 1;
	}
	
	

	
}
