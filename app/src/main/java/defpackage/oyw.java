package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import j$.util.Objects;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oyw {
    public long a;
    public final Object b;

    public oyw(aii aiiVar, long j) {
        this.b = aiiVar;
        this.a = j;
    }

    public final long a(long j) {
        return j - this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Deque] */
    public final void b(long j) {
        ?? r0 = this.b;
        seo seoVar = (seo) r0.removeLast();
        long j2 = j;
        r0.add(seo.e((Long) seoVar.h(), Long.valueOf(j2)));
        this.a += j2 - ((Long) seoVar.h()).longValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Deque] */
    public final void c(long j) {
        this.b.add(seo.c(Long.valueOf(j)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Deque] */
    public final boolean d(long j) {
        while (true) {
            ?? r0 = this.b;
            if (r0.isEmpty()) {
                return false;
            }
            seo seoVar = (seo) r0.peek();
            seoVar.getClass();
            if (seoVar.a(Long.valueOf(j))) {
                return true;
            }
            if (seoVar.k() && ((Long) seoVar.h()).longValue() > j) {
                return false;
            }
            seoVar.toString();
            r0.poll();
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public final CaptureRequest e(CameraDevice cameraDevice, int i, Surface... surfaceArr) throws CameraAccessException {
        if (cameraDevice == null) {
            throw new NullPointerException("Tried to create request using null CameraDevice");
        }
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i);
        for (CaptureRequest.Key key : this.b.keySet()) {
            Object objF = f(key);
            if (objF != null) {
                builderCreateCaptureRequest.set(key, objF);
            }
        }
        Surface surface = surfaceArr[0];
        if (surface == null) {
            throw new NullPointerException("Tried to add null Surface as request target");
        }
        builderCreateCaptureRequest.addTarget(surface);
        return builderCreateCaptureRequest.build();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    public final Object f(CaptureRequest.Key key) {
        if (key != null) {
            return this.b.get(key);
        }
        throw new NullPointerException("Received a null key");
    }

    public final boolean g(CaptureRequest.Key key, Object obj) {
        return Objects.equals(f(key), obj);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final void h(CaptureRequest.Key key, Object obj) {
        if (key == null) {
            throw new NullPointerException("Received a null key");
        }
        Object objF = f(key);
        ?? r1 = this.b;
        if (r1.containsKey(key) && Objects.equals(obj, objF)) {
            return;
        }
        r1.put(key, obj);
        this.a++;
    }

    public final float i(long j) {
        return Float.intBitsToFloat((int) (this.b == aii.b ? j >> 32 : j & 4294967295L));
    }

    public final long j(bpv bpvVar, float f) {
        long jE = a.E(this.a, a.ac(bpvVar.c, bpvVar.g));
        this.a = jE;
        Object obj = this.b;
        if ((obj == null ? bkf.a(jE) : Math.abs(i(jE))) < f) {
            return 9205357640488583168L;
        }
        if (obj == null) {
            float fA = bkf.a(this.a);
            return a.ac(this.a, bkf.b((4294967295L & Float.floatToRawIntBits(Float.intBitsToFloat((int) (r3 & 4294967295L)) / fA)) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (r3 >> 32)) / fA) << 32), f));
        }
        float fI = i(this.a) - (Math.signum(i(this.a)) * f);
        long j = this.a;
        aii aiiVar = aii.b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (obj == aiiVar ? j & 4294967295L : j >> 32));
        if (obj == aiiVar) {
            return (Float.floatToRawIntBits(fI) << 32) | (4294967295L & Float.floatToRawIntBits(fIntBitsToFloat));
        }
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(fI));
    }

    public final void k() {
        this.a = 0L;
    }

    public oyw(byte[] bArr) {
        this.b = new HashMap();
        this.a = 0L;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public oyw(oyw oywVar) {
        if (oywVar != null) {
            this.b = new HashMap((Map) oywVar.b);
            this.a = oywVar.a;
            return;
        }
        throw new NullPointerException("Tried to copy null Camera2RequestSettingsSet");
    }

    public oyw() {
        this.b = new ArrayDeque();
    }
}
