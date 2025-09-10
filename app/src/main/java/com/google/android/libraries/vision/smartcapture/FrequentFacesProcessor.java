package com.google.android.libraries.vision.smartcapture;

import android.util.Log;
import com.google.android.apps.camera.focusindicator.CIAk.YyLACfm;
import defpackage.rkf;
import defpackage.tow;
import defpackage.tph;
import defpackage.tpz;
import defpackage.tup;
import defpackage.tuw;
import defpackage.tvm;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class FrequentFacesProcessor implements Closeable {
    private final tow a;
    private long b;

    static {
        rkf.f();
    }

    public FrequentFacesProcessor(tvm tvmVar) {
        this.b = nativeCreate(tvmVar.h());
        tow towVarB = tow.b();
        this.a = towVarB;
        towVarB.d(tuw.j);
    }

    private static native void nativeClose(long j);

    private static native byte[] nativeComputeFamiliarFaces(long j, ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4, ByteBuffer byteBuffer3, int i5, int i6, int i7, int i8, byte[] bArr);

    private static native long nativeCreate(byte[] bArr);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        long j = this.b;
        if (j == 0) {
            return;
        }
        nativeClose(j);
        this.b = 0L;
    }

    public final synchronized tup a(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4, ByteBuffer byteBuffer3, int i5, int i6, int i7, int i8, tup tupVar) {
        tup tupVar2;
        long j = this.b;
        if (j == 0) {
            Log.w("FREQUENT_FACES_PROCESSOR", "Processor is closed");
            return tupVar;
        }
        byte[] bArrNativeComputeFamiliarFaces = nativeComputeFamiliarFaces(j, byteBuffer, i, i2, byteBuffer2, i3, i4, byteBuffer3, i5, i6, i7, i8, tupVar.h());
        if (bArrNativeComputeFamiliarFaces == null) {
            Log.e("FREQUENT_FACES_PROCESSOR", "output metadata bytes is null");
            return tupVar;
        }
        try {
            tph tphVarQ = tph.q(tup.a, bArrNativeComputeFamiliarFaces, 0, bArrNativeComputeFamiliarFaces.length, this.a);
            tph.D(tphVarQ);
            tupVar2 = (tup) tphVarQ;
        } catch (tpz e) {
            Log.e("FREQUENT_FACES_PROCESSOR", YyLACfm.Hsqw, e);
            tupVar2 = tupVar;
        }
        return tupVar2;
    }
}
