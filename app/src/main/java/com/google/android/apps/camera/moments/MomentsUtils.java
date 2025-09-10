package com.google.android.apps.camera.moments;

import android.hardware.HardwareBuffer;
import defpackage.jyl;
import defpackage.kav;
import defpackage.lnr;
import defpackage.pdk;
import defpackage.syu;
import defpackage.szh;
import java.nio.ByteBuffer;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MomentsUtils {
    public static syu a(pdk pdkVar) {
        szh szhVar = new szh();
        pdkVar.j(new kav(szhVar));
        return szhVar;
    }

    public static native HardwareBuffer allocateHardwareBuffer(int i, int i2, int i3, int i4, long j);

    public static boolean b(jyl jylVar, lnr lnrVar, Collection collection) {
        if (!jylVar.f().h() && !jylVar.e().h()) {
            return false;
        }
        if (collection.size() <= 0) {
            return true;
        }
        if (jylVar.f().h()) {
            jylVar.f().c();
        }
        return jylVar.a() >= 0.0f && lnrVar.a(jylVar.d(), collection, true).a > 0.07f;
    }

    public static boolean c(jyl jylVar, float f, lnr lnrVar, Collection collection) {
        if (collection.size() < 2) {
            return true;
        }
        if (jylVar.f().h()) {
            jylVar.f().c();
        }
        return jylVar.a() - f >= -0.02f && lnrVar.a(jylVar.d(), collection, false).a > 0.07f;
    }

    public static native long yuv2hwyuv(int i, int i2, ByteBuffer byteBuffer, int i3, int i4, ByteBuffer byteBuffer2, int i5, int i6, ByteBuffer byteBuffer3, int i7, int i8, HardwareBuffer hardwareBuffer);
}
