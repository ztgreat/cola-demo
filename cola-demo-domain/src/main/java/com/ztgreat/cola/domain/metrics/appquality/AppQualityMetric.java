package com.ztgreat.cola.domain.metrics.appquality;

import com.ztgreat.cola.domain.metrics.MainMetric;
import com.ztgreat.cola.domain.metrics.MainMetricType;
import com.ztgreat.cola.domain.metrics.devquality.BugMetric;
import com.ztgreat.cola.domain.user.UserProfile;

public class AppQualityMetric extends MainMetric {

    private AppMetric appMetric;

    public AppQualityMetric(UserProfile metricOwner){
        this.metricOwner = metricOwner;
        metricOwner.setAppQualityMetric(this);
        this.metricMainType = MainMetricType.APP_QUALITY;
    }

    @Override
    public double getWeight() {
        return metricOwner.getWeight().getAppQualityWeight();
    }
}
