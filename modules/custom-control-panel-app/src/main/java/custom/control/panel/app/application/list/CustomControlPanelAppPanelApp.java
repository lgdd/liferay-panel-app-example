package custom.control.panel.app.application.list;

import custom.control.panel.app.constants.CustomControlPanelAppPanelCategoryKeys;
import custom.control.panel.app.constants.CustomControlPanelAppPortletKeys;

import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.portal.kernel.model.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author lgd
 */
@Component(
	immediate = true,
	property = {
		"panel.app.order:Integer=100",
		"panel.category.key=" + CustomControlPanelAppPanelCategoryKeys.CONTROL_PANEL_CATEGORY
	},
	service = PanelApp.class
)
public class CustomControlPanelAppPanelApp extends BasePanelApp {

	@Override
	public String getPortletId() {
		return CustomControlPanelAppPortletKeys.CUSTOMCONTROLPANELAPP;
	}

	@Override
	@Reference(
		target = "(javax.portlet.name=" + CustomControlPanelAppPortletKeys.CUSTOMCONTROLPANELAPP + ")",
		unbind = "-"
	)
	public void setPortlet(Portlet portlet) {
		super.setPortlet(portlet);
	}

}