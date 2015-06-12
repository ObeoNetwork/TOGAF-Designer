package org.obeonetwork.dsl.togaf.smartdesigner;

import org.obeonetwork.dsl.smartdesigner.GraphicalElement;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Actor;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Assumption;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.BusinessService;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Capability;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Constraint;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Contract;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Control;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.DataEntity;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Driver;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Event;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Function;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Gap;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Goal;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.InformationSystemService;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Location;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalApplicationComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalDataComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.LogicalTechnologyComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Measure;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Objective;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalApplicationComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalDataComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PhysicalTechnologyComponent;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.PlatformService;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Principle;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Product;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Role;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ServiceQuality;
import org.obeonetwork.dsl.togaf.contentfwk.contentfwk.WorkPackage;

public class Color {

	private static final int BACKGROUND_RED_APPLICATION = 240;
	private static final int BACKGROUND_GREEN_APPLICATION = 245;
	private static final int BACKGROUND_BLUE_APPLICATION = 255;
	private static final int FOREGROUND_RED_APPLICATION = 240;
	private static final int FOREGROUND_GREEN_APPLICATION = 245;
	private static final int FOREGROUND_BLUE_APPLICATION = 255;
	private static final int LABEL_RED_APPLICATION = 0;
	private static final int LABEL_GREEN_APPLICATION = 0;
	private static final int LABEL_BLUE_APPLICATION = 0;
	private static final int BORDER_RED_APPLICATION = 222;
	private static final int BORDER_GREEN_APPLICATION = 234;
	private static final int BORDER_BLUE_APPLICATION = 255;

	private static final int BACKGROUND_RED_BUSINESS = 255;
	private static final int BACKGROUND_GREEN_BUSINESS = 252;
	private static final int BACKGROUND_BLUE_BUSINESS = 230;
	private static final int FOREGROUND_RED_BUSINESS = 255;
	private static final int FOREGROUND_GREEN_BUSINESS = 252;
	private static final int FOREGROUND_BLUE_BUSINESS = 230;
	private static final int LABEL_RED_BUSINESS = 0;
	private static final int LABEL_GREEN_BUSINESS = 0;
	private static final int LABEL_BLUE_BUSINESS = 0;
	private static final int BORDER_RED_BUSINESS = 255;
	private static final int BORDER_GREEN_BUSINESS = 246;
	private static final int BORDER_BLUE_BUSINESS = 191;

	private static final int BACKGROUND_RED_DATA = 240;
	private static final int BACKGROUND_GREEN_DATA = 245;
	private static final int BACKGROUND_BLUE_DATA = 255;
	private static final int FOREGROUND_RED_DATA = 240;
	private static final int FOREGROUND_GREEN_DATA = 245;
	private static final int FOREGROUND_BLUE_DATA = 255;
	private static final int LABEL_RED_DATA = 0;
	private static final int LABEL_GREEN_DATA = 0;
	private static final int LABEL_BLUE_DATA = 0;
	private static final int BORDER_RED_DATA = 222;
	private static final int BORDER_GREEN_DATA = 234;
	private static final int BORDER_BLUE_DATA = 255;

	private static final int BACKGROUND_RED_TECHNOLOGY = 240;
	private static final int BACKGROUND_GREEN_TECHNOLOGY = 250;
	private static final int BACKGROUND_BLUE_TECHNOLOGY = 240;
	private static final int FOREGROUND_RED_TECHNOLOGY = 240;
	private static final int FOREGROUND_GREEN_TECHNOLOGY = 250;
	private static final int FOREGROUND_BLUE_TECHNOLOGY = 240;
	private static final int LABEL_RED_TECHNOLOGY = 0;
	private static final int LABEL_GREEN_TECHNOLOGY = 0;
	private static final int LABEL_BLUE_TECHNOLOGY = 0;
	private static final int BORDER_RED_TECHNOLOGY = 222;
	private static final int BORDER_GREEN_TECHNOLOGY = 241;
	private static final int BORDER_BLUE_TECHNOLOGY = 221;

	private static final int BACKGROUND_RED_STRATEGIC = 243;
	private static final int BACKGROUND_GREEN_STRATEGIC = 240;
	private static final int BACKGROUND_BLUE_STRATEGIC = 254;
	private static final int FOREGROUND_RED_STRATEGIC = 243;
	private static final int FOREGROUND_GREEN_STRATEGIC = 240;
	private static final int FOREGROUND_BLUE_STRATEGIC = 254;
	private static final int LABEL_RED_STRATEGIC = 0;
	private static final int LABEL_GREEN_STRATEGIC = 0;
	private static final int LABEL_BLUE_STRATEGIC = 0;
	private static final int BORDER_RED_STRATEGIC = 222;
	private static final int BORDER_GREEN_STRATEGIC = 217;
	private static final int BORDER_BLUE_STRATEGIC = 253;

	public int getBackgroundRedColor(GraphicalElement ge) {
		if (isBusinessElement(ge)) {
			return BACKGROUND_RED_BUSINESS;
		} else if (isApplicationElement(ge)) {
			return BACKGROUND_RED_APPLICATION;
		} else if (isDataElement(ge)) {
			return BACKGROUND_RED_DATA;
		} else if (isTechnologyElement(ge)) {
			return BACKGROUND_RED_TECHNOLOGY;
		} else if (isStrategicElement(ge)) {
			return BACKGROUND_RED_STRATEGIC;
		}
		return 255;
	}

	public int getBackgroundBlueColor(GraphicalElement ge) {
		if (isBusinessElement(ge)) {
			return BACKGROUND_BLUE_BUSINESS;
		} else if (isApplicationElement(ge)) {
			return BACKGROUND_BLUE_APPLICATION;
		} else if (isDataElement(ge)) {
			return BACKGROUND_BLUE_DATA;
		} else if (isTechnologyElement(ge)) {
			return BACKGROUND_BLUE_TECHNOLOGY;
		} else if (isStrategicElement(ge)) {
			return BACKGROUND_BLUE_STRATEGIC;
		}
		return 0;
	}

	public int getBackgroundGreenColor(GraphicalElement ge) {
		if (isBusinessElement(ge)) {
			return BACKGROUND_GREEN_BUSINESS;
		} else if (isApplicationElement(ge)) {
			return BACKGROUND_GREEN_APPLICATION;
		} else if (isDataElement(ge)) {
			return BACKGROUND_GREEN_DATA;
		} else if (isTechnologyElement(ge)) {
			return BACKGROUND_GREEN_TECHNOLOGY;
		} else if (isStrategicElement(ge)) {
			return BACKGROUND_GREEN_STRATEGIC;
		}
		return 0;
	}

	public int getForegroundRedColor(GraphicalElement ge) {
		if (isBusinessElement(ge)) {
			return FOREGROUND_RED_BUSINESS;
		} else if (isApplicationElement(ge)) {
			return FOREGROUND_RED_APPLICATION;
		} else if (isDataElement(ge)) {
			return FOREGROUND_RED_DATA;
		} else if (isTechnologyElement(ge)) {
			return FOREGROUND_RED_TECHNOLOGY;
		} else if (isStrategicElement(ge)) {
			return FOREGROUND_RED_STRATEGIC;
		}
		return 0;
	}

	public int getForegroundBlueColor(GraphicalElement ge) {
		if (isBusinessElement(ge)) {
			return FOREGROUND_BLUE_BUSINESS;
		} else if (isApplicationElement(ge)) {
			return FOREGROUND_BLUE_APPLICATION;
		} else if (isDataElement(ge)) {
			return FOREGROUND_BLUE_DATA;
		} else if (isTechnologyElement(ge)) {
			return FOREGROUND_BLUE_TECHNOLOGY;
		} else if (isStrategicElement(ge)) {
			return FOREGROUND_BLUE_STRATEGIC;
		}
		return 0;
	}

	public int getForegroundGreenColor(GraphicalElement ge) {
		if (isBusinessElement(ge)) {
			return FOREGROUND_GREEN_BUSINESS;
		} else if (isApplicationElement(ge)) {
			return FOREGROUND_GREEN_APPLICATION;
		} else if (isDataElement(ge)) {
			return FOREGROUND_GREEN_DATA;
		} else if (isTechnologyElement(ge)) {
			return FOREGROUND_GREEN_TECHNOLOGY;
		} else if (isStrategicElement(ge)) {
			return FOREGROUND_GREEN_STRATEGIC;
		}
		return 0;
	}

	public int getLabelRedColor(GraphicalElement ge) {
		if (isBusinessElement(ge)) {
			return LABEL_RED_BUSINESS;
		} else if (isApplicationElement(ge)) {
			return LABEL_RED_APPLICATION;
		} else if (isDataElement(ge)) {
			return LABEL_RED_DATA;
		} else if (isTechnologyElement(ge)) {
			return LABEL_RED_TECHNOLOGY;
		} else if (isStrategicElement(ge)) {
			return LABEL_RED_STRATEGIC;
		}
		return 0;
	}

	public int getLabelBlueColor(GraphicalElement ge) {
		if (isBusinessElement(ge)) {
			return LABEL_BLUE_BUSINESS;
		} else if (isApplicationElement(ge)) {
			return LABEL_BLUE_APPLICATION;
		} else if (isDataElement(ge)) {
			return LABEL_BLUE_DATA;
		} else if (isTechnologyElement(ge)) {
			return LABEL_BLUE_TECHNOLOGY;
		} else if (isStrategicElement(ge)) {
			return LABEL_BLUE_STRATEGIC;
		}
		return 0;
	}

	public int getLabelGreenColor(GraphicalElement ge) {
		if (isBusinessElement(ge)) {
			return LABEL_GREEN_BUSINESS;
		} else if (isApplicationElement(ge)) {
			return LABEL_GREEN_APPLICATION;
		} else if (isDataElement(ge)) {
			return LABEL_GREEN_DATA;
		} else if (isTechnologyElement(ge)) {
			return LABEL_GREEN_TECHNOLOGY;
		} else if (isStrategicElement(ge)) {
			return LABEL_GREEN_STRATEGIC;
		}
		return 0;
	}

	public int getBorderRedColor(GraphicalElement ge) {
		if (isBusinessElement(ge)) {
			return BORDER_RED_BUSINESS;
		} else if (isApplicationElement(ge)) {
			return BORDER_RED_APPLICATION;
		} else if (isDataElement(ge)) {
			return BORDER_RED_DATA;
		} else if (isTechnologyElement(ge)) {
			return BORDER_RED_TECHNOLOGY;
		} else if (isStrategicElement(ge)) {
			return BORDER_RED_STRATEGIC;
		}
		return 0;
	}

	public int getBorderBlueColor(GraphicalElement ge) {
		if (isBusinessElement(ge)) {
			return BORDER_BLUE_BUSINESS;
		} else if (isApplicationElement(ge)) {
			return BORDER_BLUE_APPLICATION;
		} else if (isDataElement(ge)) {
			return BORDER_BLUE_DATA;
		} else if (isTechnologyElement(ge)) {
			return BORDER_BLUE_TECHNOLOGY;
		} else if (isStrategicElement(ge)) {
			return BORDER_BLUE_STRATEGIC;
		}
		return 0;
	}

	public int getBorderGreenColor(GraphicalElement ge) {
		if (isBusinessElement(ge)) {
			return BORDER_GREEN_BUSINESS;
		} else if (isApplicationElement(ge)) {
			return BORDER_GREEN_APPLICATION;
		} else if (isDataElement(ge)) {
			return BORDER_GREEN_DATA;
		} else if (isTechnologyElement(ge)) {
			return BORDER_GREEN_TECHNOLOGY;
		} else if (isStrategicElement(ge)) {
			return BORDER_GREEN_STRATEGIC;
		}
		return 0;
	}

	private boolean isBusinessElement(GraphicalElement ge) {
		if (ge.getSemanticElement() instanceof BusinessService) {
			return true;
		} else if (ge.getSemanticElement() instanceof org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process) {
			return true;
		} else if (ge.getSemanticElement() instanceof Driver) {
			return true;
		} else if (ge.getSemanticElement() instanceof Goal) {
			return true;
		} else if (ge.getSemanticElement() instanceof Objective) {
			return true;
		} else if (ge.getSemanticElement() instanceof OrganizationUnit) {
			return true;
		} else if (ge.getSemanticElement() instanceof Actor) {
			return true;
		} else if (ge.getSemanticElement() instanceof Role) {
			return true;
		} else if (ge.getSemanticElement() instanceof Function) {
			return true;
		} else if (ge.getSemanticElement() instanceof Control) {
			return true;
		} else if (ge.getSemanticElement() instanceof Event) {
			return true;
		} else if (ge.getSemanticElement() instanceof Location) {
			return true;
		} else if (ge.getSemanticElement() instanceof Product) {
			return true;
		} else if (ge.getSemanticElement() instanceof Contract) {
			return true;
		} else if (ge.getSemanticElement() instanceof Measure) {
			return true;
		} else if (ge.getSemanticElement() instanceof ServiceQuality) {
			return true;
		}
		return false;
	}

	private boolean isApplicationElement(GraphicalElement ge) {
		if (ge.getSemanticElement() instanceof LogicalApplicationComponent) {
			return true;
		} else if (ge.getSemanticElement() instanceof InformationSystemService) {
			return true;
		} else if (ge.getSemanticElement() instanceof PhysicalApplicationComponent) {
			return true;
		}
		return false;
	}

	private boolean isDataElement(GraphicalElement ge) {
		if (ge.getSemanticElement() instanceof DataEntity) {
			return true;
		} else if (ge.getSemanticElement() instanceof LogicalDataComponent) {
			return true;
		} else if (ge.getSemanticElement() instanceof PhysicalDataComponent) {
			return true;
		}
		return false;
	}

	private boolean isTechnologyElement(GraphicalElement ge) {
		if (ge.getSemanticElement() instanceof PlatformService) {
			return true;
		} else if (ge.getSemanticElement() instanceof LogicalTechnologyComponent) {
			return true;
		} else if (ge.getSemanticElement() instanceof PhysicalTechnologyComponent) {
			return true;
		}
		return false;
	}

	private boolean isStrategicElement(GraphicalElement ge) {
		if (ge.getSemanticElement() instanceof Principle) {
			return true;
		} else if (ge.getSemanticElement() instanceof Capability) {
			return true;
		} else if (ge.getSemanticElement() instanceof Constraint) {
			return true;
		} else if (ge.getSemanticElement() instanceof Assumption) {
			return true;
		} else if (ge.getSemanticElement() instanceof Gap) {
			return true;
		} else if (ge.getSemanticElement() instanceof WorkPackage) {
			return true;
		}
		return false;
	}

}
