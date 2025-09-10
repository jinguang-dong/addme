package j$.time.temporal;

import j$.time.Duration;

/* loaded from: classes3.dex */
public interface TemporalUnit {
    long between(Temporal temporal, Temporal temporal2);

    Duration getDuration();

    Temporal h(Temporal temporal, long j);

    boolean isDurationEstimated();
}
