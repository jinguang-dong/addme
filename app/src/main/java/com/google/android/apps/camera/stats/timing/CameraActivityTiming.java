package com.google.android.apps.camera.stats.timing;

import defpackage.mec;
import defpackage.mej;
import defpackage.mev;
import defpackage.mew;
import defpackage.mex;
import defpackage.nkw;
import defpackage.pbn;
import defpackage.pbp;
import defpackage.pqm;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CameraActivityTiming extends mex {
    public static final mew a;
    public static final mew b;
    public final mec c;
    public final pbn d;
    public pbp e;
    public pbp f;
    public pbp g;
    public pbp h;
    public int i;
    private nkw q;

    static {
        mev mevVarA = mew.a();
        mevVarA.b(false);
        a = mevVarA.a();
        b = j;
    }

    public CameraActivityTiming(long j, pqm pqmVar, mec mecVar, pbn pbnVar) {
        super(pqmVar, j, mej.values());
        this.h = pbp.a;
        this.q = nkw.UNINITIALIZED;
        this.c = mecVar;
        this.d = pbnVar;
        this.e = pbnVar.a("FirstPreviewFrame");
        this.g = pbnVar.a("ShutterButtonEnabled");
        this.f = pbnVar.a("FirstFrameReceived");
    }

    public final synchronized nkw a() {
        return this.q;
    }

    @Override // defpackage.mex
    public final void c() {
        super.c();
        this.i = 0;
    }

    public final synchronized void d(nkw nkwVar) {
        this.q = nkwVar;
    }

    public final boolean e() {
        for (mej mejVar : mej.values()) {
            if (mejVar.x && !n(mejVar)) {
                return false;
            }
        }
        return true;
    }

    public final boolean f() {
        return this.i != 0;
    }

    public long getActivityInitializeStartNs() {
        return i(mej.ACTIVITY_INITIALIZE_START);
    }

    public long getActivityInitializedNs() {
        return i(mej.ACTIVITY_INITIALIZED);
    }

    public long getActivityOnCreateEndNs() {
        return i(mej.ACTIVITY_ONCREATE_END);
    }

    public long getActivityOnCreateStartNs() {
        return i(mej.ACTIVITY_ONCREATE_START);
    }

    public long getActivityOnResumeEndNs() {
        return i(mej.j);
    }

    public long getActivityOnResumeStartNs() {
        return i(mej.ACTIVITY_ONRESUME_START);
    }

    public long getActivityOnStartStartNs() {
        return i(mej.ACTIVITY_ONSTART_START);
    }

    public long getFirstPreviewFrameReceivedNs() {
        return i(mej.ACTIVITY_FIRST_PREVIEW_FRAME_RECEIVED);
    }

    public long getFirstPreviewFrameRenderedNs() {
        return i(mej.ACTIVITY_FIRST_PREVIEW_FRAME_RENDERED);
    }

    public long getFirstVfePreviewFrameRenderedNs() {
        return i(mej.ACTIVITY_FIRST_PREVIEW_FRAME_VFE_RENDERED);
    }

    public long getPermissionStartupTaskTimeEndNs() {
        return i(mej.PERMISSIONS_STARTUP_TASK_END);
    }

    public long getPermissionStartupTaskTimeStartNs() {
        return i(mej.PERMISSIONS_STARTUP_TASK_START);
    }

    public long getShutterButtonFirstDrawnNs() {
        return i(mej.ACTIVITY_SHUTTER_BUTTON_DRAWN);
    }

    public long getShutterButtonFirstEnabledNs() {
        return i(mej.ACTIVITY_SHUTTER_BUTTON_ENABLED);
    }

    public long getUiWireEndNs() {
        return i(mej.ACTIVITY_UI_WIRE_END);
    }

    public long getUiWireStartNs() {
        return i(mej.ACTIVITY_UI_WIRE_START);
    }

    public long getWaitForCameraDevicesTaskTimeEndNs() {
        return i(mej.WAIT_FOR_CAMERA_DEVICES_TASK_END);
    }

    public long getWaitForCameraDevicesTaskTimeStartNs() {
        return i(mej.WAIT_FOR_CAMERA_DEVICES_TASK_START);
    }

    public void recordActivityOnCreateStart(long j) {
        m(mej.ACTIVITY_ONCREATE_START, j, a);
    }
}
