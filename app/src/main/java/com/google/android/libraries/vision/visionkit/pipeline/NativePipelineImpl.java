package com.google.android.libraries.vision.visionkit.pipeline;

import android.util.Log;
import com.google.android.apps.camera.ui.zoomlock.Gx.nWEkBGOQPWQp;
import defpackage.rge;
import defpackage.rgr;
import defpackage.rgt;
import defpackage.rgw;
import defpackage.tow;
import defpackage.tph;
import defpackage.tpz;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NativePipelineImpl implements rgr {
    private tow a;
    private rgt b;
    private rgt c;

    public NativePipelineImpl(rgt rgtVar, rgt rgtVar2, tow towVar) {
        this.b = rgtVar;
        this.c = rgtVar2;
        this.a = towVar;
    }

    @Override // defpackage.rgr
    public final void a() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    @Override // defpackage.rgr
    public native void close(long j, long j2, long j3, long j4, long j5);

    public void closeFileDescriptor(int i) {
        Log.w("VKP", "closeFileDescriptor called but is not available for this pipeline. Ignoring call.");
    }

    @Override // defpackage.rgr
    public native boolean disableSubpipeline(long j, String str);

    @Override // defpackage.rgr
    public native boolean enableSubpipeline(long j, String str);

    @Override // defpackage.rgr
    public native long initialize(byte[] bArr, long j, long j2, long j3, long j4, long j5);

    @Override // defpackage.rgr
    public native long initializeFrameBufferReleaseCallback(long j);

    @Override // defpackage.rgr
    public native long initializeFrameManager();

    @Override // defpackage.rgr
    public native long initializeIsolationCallback();

    @Override // defpackage.rgr
    public native long initializeResultsCallback();

    public void onReleaseAtTimestampUs(long j) {
        this.b.a(j);
    }

    public void onResult(byte[] bArr) {
        try {
            tph tphVarQ = tph.q(rgw.a, bArr, 0, bArr.length, this.a);
            tph.D(tphVarQ);
            this.c.b((rgw) tphVarQ);
        } catch (tpz e) {
            rge rgeVar = rge.a;
            Object[] objArr = new Object[0];
            if (rgeVar.d(6)) {
                Log.e(rgeVar.b, rgeVar.a("Error in result from JNI layer", objArr), e);
            }
        }
    }

    @Override // defpackage.rgr
    public native boolean receiveYuvFrame(long j, long j2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6);

    @Override // defpackage.rgr
    public native void resetSchedulingOptimizerOptions(long j, byte[] bArr);

    @Override // defpackage.rgr
    public native void start(long j);

    @Override // defpackage.rgr
    public native boolean stop(long j);

    @Override // defpackage.rgr
    public native void waitUntilIdle(long j);

    public NativePipelineImpl(rgt rgtVar, rgt rgtVar2, tow towVar, byte[] bArr) {
        this(rgtVar, rgtVar2, towVar);
        System.loadLibrary("camerapipeline");
    }

    public int openFileDescriptor(String str) {
        Log.w(nWEkBGOQPWQp.JxNdFOaJbYj, "openFileDescriptor called but is not available for this pipeline. Ignoring call.");
        return -1;
    }
}
