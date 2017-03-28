package com.thoughtworks.gauge.settings;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import org.jetbrains.annotations.Nullable;

import static com.intellij.openapi.components.RoamingType.DISABLED;

@State(
        name = "GaugeConfiguration",
        storages = {
                @Storage(id = "other", file = "GaugeConfig.xml", roamingType = DISABLED),
        }
)
public class GaugeSettingsService implements PersistentStateComponent<GaugeSettingsModel> {
    private GaugeSettingsModel state = new GaugeSettingsModel();

    @Nullable
    @Override
    public GaugeSettingsModel getState() {
        return state;
    }

    @Override
    public void loadState(GaugeSettingsModel state) {
        this.state = state;
    }

    public static GaugeSettingsModel getSettings() {
        GaugeSettingsService service = getService();
        return service.getState();
    }

    public static GaugeSettingsService getService() {
        return ApplicationManager.getApplication().getComponent(GaugeSettingsService.class);
    }
}
