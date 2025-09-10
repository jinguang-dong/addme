package com.google.android.apps.camera.facemetadata.conversions;

import android.graphics.Point;
import android.graphics.Rect;
import defpackage.hky;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class FaceToBeautify {
    public static hky a(Rect rect) {
        hky hkyVar = new hky();
        hkyVar.a = rect;
        return hkyVar;
    }

    public abstract Rect bounds();

    public abstract Float confidence();

    public abstract float[] faceAttributes();

    public abstract Integer index();

    public abstract Point leftEarTragion();

    public abstract Point leftEye();

    public abstract Point mouthCenter();

    public abstract Point noseTip();

    public abstract Float panAngleDegrees();

    public abstract Point rightEarTragion();

    public abstract Point rightEye();
}
