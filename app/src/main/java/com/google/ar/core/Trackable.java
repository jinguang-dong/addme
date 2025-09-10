package com.google.ar.core;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface Trackable {
    Anchor createAnchor(Pose pose);

    Collection getAnchors();

    TrackingState getTrackingState();
}
