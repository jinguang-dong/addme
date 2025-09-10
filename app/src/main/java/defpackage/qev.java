package defpackage;

import android.graphics.Typeface;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qev {
    public final int a;
    public final Object b;

    public qev(int i, apk apkVar) {
        this.a = i;
        this.b = apkVar;
    }

    public final void a(pvc pvcVar) {
        if (this.a - 1 != 0) {
            c(1113, pvcVar);
        } else {
            c(1008, pvcVar);
        }
    }

    public final void b(pvc pvcVar) {
        if (this.a - 1 != 0) {
            c(1111, pvcVar);
        } else {
            c(1072, pvcVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qbq] */
    public final void c(int i, pvc pvcVar) {
        this.b.m(i, pvcVar.d, pvcVar.f, pvcVar.s, pvcVar.t);
    }

    public qev(int i, ByteBuffer byteBuffer) {
        this.a = i;
        this.b = byteBuffer;
    }

    public qev(int i, byte[] bArr) {
        this.b = null;
        this.a = i;
    }

    public qev(Typeface typeface) {
        this.b = typeface;
        this.a = 0;
    }

    public qev(Object obj, int i) {
        this.b = obj;
        this.a = i;
    }

    public qev(int i) {
        this.a = i;
        this.b = new ConcurrentLinkedQueue();
    }

    public qev(rwc rwcVar) {
        this(rwcVar, 0);
    }

    public qev(odj odjVar, int i) {
        ojl.ay(odjVar);
        this.b = odjVar;
        this.a = i;
    }
}
