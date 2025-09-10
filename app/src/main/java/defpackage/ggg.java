package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.LruCache;
import com.google.android.libraries.vision.opengl.Texture;
import com.google.googlex.gcam.DirtyLensHistory;
import com.google.googlex.gcam.FloatDeque;
import com.google.googlex.gcam.GcamModuleJNI;
import j$.util.Optional;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggg {
    public final Object a;

    public ggg() {
        this.a = new int[2];
    }

    public static final void c() {
        gzi gziVar = gyi.a;
    }

    private final synchronized lnl v(lnl lnlVar, long j) {
        long j2;
        j2 = lnlVar.o;
        return new lnl(lnlVar.b, lnlVar.c + j, lnlVar.d, lnlVar.e, lnlVar.f, lnlVar.h, lnlVar.i, lnlVar.k, lnlVar.l, lnlVar.m, lnlVar.n, j2 + j, lnlVar.p, lnlVar.q, lnlVar.r, lnlVar.s, lnlVar.u, lnlVar.v, lnlVar.t, lnlVar.w, lnlVar.x);
    }

    public final int a(int i) {
        return ((int[]) this.a)[i - 1];
    }

    public final void b(int i) {
        int[] iArr = (int[]) this.a;
        int i2 = i - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    public final void d() {
        DirtyLensHistory dirtyLensHistory = (DirtyLensHistory) this.a;
        GcamModuleJNI.DirtyLensHistory_Reset(dirtyLensHistory.a, dirtyLensHistory);
    }

    public final ffp e() {
        DirtyLensHistory dirtyLensHistory = (DirtyLensHistory) this.a;
        long jDirtyLensHistory_raw_score_history__get = GcamModuleJNI.DirtyLensHistory_raw_score_history__get(dirtyLensHistory.a, dirtyLensHistory);
        return new ffp(jDirtyLensHistory_raw_score_history__get == 0 ? null : new FloatDeque(jDirtyLensHistory_raw_score_history__get, false));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void f(iri iriVar, irj irjVar) {
        List arrayList;
        ?? r1 = this.a;
        if (r1.containsKey(iriVar)) {
            arrayList = (List) r1.get(iriVar);
            arrayList.getClass();
            arrayList.add(irjVar);
        } else {
            arrayList = new ArrayList();
            arrayList.add(irjVar);
        }
        r1.put(iriVar, arrayList);
    }

    public final void g(float[] fArr) {
        iln ilnVar = (iln) this.a;
        float[] fArr2 = ilnVar.e;
        System.arraycopy(fArr, 0, fArr2, 0, 16);
        GLES20.glClear(16384);
        Texture texture = ilnVar.c;
        if (texture == null) {
            return;
        }
        if (ilnVar.f == null) {
            ilnVar.f = new rft("attribute vec2 vertexAttrib;attribute vec2 texCoordAttrib;varying vec2 texCoord;uniform mat4 vertexTransform;uniform mat4 textureTransform;void main() {  texCoord = (textureTransform * vec4(texCoordAttrib, 0., 1.)).xy;  gl_Position = vertexTransform * vec4(vertexAttrib, 0., 1.);}", texture.getType() == 36197 ? "#extension GL_OES_EGL_image_external : require \nprecision mediump float;uniform samplerExternalOES texture;varying vec2 texCoord;void main() {  gl_FragColor = texture2D(texture, texCoord);}" : "precision mediump float;uniform sampler2D texture;varying vec2 texCoord;void main() {  gl_FragColor = texture2D(texture, texCoord);}");
            ilnVar.g = ilnVar.f.a("texture");
            ilnVar.h = ilnVar.f.a("vertexTransform");
            ilnVar.i = ilnVar.f.a("textureTransform");
            ilnVar.j = ilnVar.f.e("vertexAttrib");
            ilnVar.k = ilnVar.f.e("texCoordAttrib");
        }
        ilnVar.f.b();
        ilnVar.j.f();
        rfv rfvVar = ilnVar.j;
        FloatBuffer floatBuffer = iln.a;
        rfvVar.g(floatBuffer, 2);
        ilnVar.k.f();
        ilnVar.k.g(iln.b, 2);
        ilnVar.g.d(ilnVar.c);
        ilnVar.h.b(ilnVar.d);
        ilnVar.i.b(fArr2);
        GLES20.glDrawArrays(5, 0, floatBuffer.capacity() / 2);
        ilnVar.k.e();
        ilnVar.j.e();
        ilnVar.f.d();
        ilnVar.c.unbind();
    }

    public final int h() {
        return ((AtomicInteger) this.a).get();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final synchronized float i(nmt nmtVar, float f) {
        float f2;
        float f3;
        boolean z = true;
        a.I(f >= 0.0f);
        Float fValueOf = Float.valueOf(f);
        ?? r1 = this.a;
        r1.put(nmtVar, fValueOf);
        f2 = 0.0f;
        f3 = 0.0f;
        for (Map.Entry entry : r1.entrySet()) {
            nmt nmtVar2 = (nmt) entry.getKey();
            float fFloatValue = ((Float) entry.getValue()).floatValue();
            float f4 = nmtVar2.a;
            f3 += fFloatValue * f4;
            f2 += f4;
        }
        if (f2 <= 0.0f) {
            z = false;
        }
        rnt.M(z, "No progress to calculate");
        return f3 / f2;
    }

    public final void j() {
        ((Optional) this.a).ifPresent(new lig(11));
    }

    public final void k() {
        ((Optional) this.a).ifPresent(new lig(10));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, mcq] */
    public final boolean l() {
        return this.a.k() == 2;
    }

    public final boolean m() {
        return ((AtomicInteger) this.a).get() == 3;
    }

    public final boolean n() {
        return ((AtomicInteger) this.a).get() == 2;
    }

    public final boolean o() {
        return ((AtomicInteger) this.a).get() == 1;
    }

    public final void p(int... iArr) {
        boolean z = false;
        for (int i = 0; i < 2; i++) {
            int i2 = iArr[i];
            int i3 = i2 - 1;
            int i4 = ((AtomicInteger) this.a).get();
            if (i2 == 0) {
                throw null;
            }
            z |= true ^ (i4 != i3);
        }
        rnt.M(z, "Invalid session state: " + ((AtomicInteger) this.a).get());
    }

    public final void q(int i) {
        ((AtomicInteger) this.a).set(i - 1);
    }

    public final void r(int i, int i2) {
        if (((AtomicInteger) this.a).getAndSet(i2 - 1) != i - 1) {
            throw new IllegalStateException();
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, jrg] */
    public final synchronized float s(lnl lnlVar) {
        long j = lnlVar.d;
        if (j <= 0) {
            return 1.0f;
        }
        long j2 = j >> 1;
        float f = j;
        return (float) Math.exp((this.a.a(v(lnlVar, -j2), v(lnlVar, j2)) / f) * (-0.05f) * f);
    }

    public final void t(ggg gggVar) {
        if (gggVar != null) {
            Object obj = this.a;
            ((mfq) obj).b.remove(gggVar.a);
        }
    }

    public final void u(ggg gggVar, Bitmap bitmap, int i) {
        LruCache lruCache = ((mfq) this.a).b;
        lruCache.size();
        bitmap.getWidth();
        bitmap.getHeight();
        if (bitmap.getAllocationByteCount() > 20971520) {
            ((sgt) mfq.a.c().M(4748)).H("Bitmap[%d x %d] is too large to fit into the cache: limit=%d but actual=%d", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), 20971520, Integer.valueOf(bitmap.getAllocationByteCount()));
        } else {
            lruCache.put(gggVar.a, new tym(bitmap, i, new pas(bitmap.getWidth(), bitmap.getHeight())));
        }
    }

    public ggg(Object obj) {
        this.a = obj;
    }

    public ggg(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public ggg(char[] cArr, byte[] bArr, byte[] bArr2) {
        this.a = new nmu(15);
    }

    public ggg(jrg jrgVar) {
        jrgVar.getClass();
        this.a = jrgVar;
    }

    public ggg(mbj mbjVar) {
        mbjVar.getClass();
        this.a = mbjVar;
    }

    public ggg(byte[] bArr) {
        this.a = new DirtyLensHistory();
    }

    public ggg(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new ovx(false);
    }

    public ggg(ttn ttnVar) {
        long j = ttnVar.j;
        ttl ttlVar = ttnVar.c;
        int i = (int) (ttlVar == null ? ttl.a : ttlVar).c;
        ttl ttlVar2 = ttnVar.c;
        Rect rect = new Rect(i, (int) (ttlVar2 == null ? ttl.a : ttlVar2).d, (int) (ttlVar2 == null ? ttl.a : ttlVar2).e, (int) (ttlVar2 == null ? ttl.a : ttlVar2).f);
        this.a = rect;
        rect.height();
        rect.width();
        Math.abs(ttnVar.g / 180.0f);
        Math.abs(ttnVar.h / 180.0f);
        Math.max(Math.abs(ttnVar.f / 180.0f), Math.max(Math.abs(ttnVar.g / 180.0f), Math.abs(ttnVar.h / 180.0f)));
    }

    public ggg(char[] cArr, byte[] bArr) {
        this.a = new HashMap();
    }

    public ggg(ByteBuffer byteBuffer) {
        this.a = byteBuffer.duplicate();
    }

    public ggg(byte[] bArr, byte[] bArr2) {
        this.a = new AtomicBoolean(false);
    }

    public ggg(Texture texture, int i) {
        iln ilnVar = new iln();
        this.a = ilnVar;
        ilnVar.c = texture;
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.rotateM(fArr, 0, i, 0.0f, 0.0f, 1.0f);
        System.arraycopy(fArr, 0, ilnVar.d, 0, 16);
    }

    public ggg(byte[] bArr, byte[] bArr2, char[] cArr) {
        TreeMap treeMap = new TreeMap();
        a.I(treeMap.size() <= 9000);
        this.a = new sfu(new pal(treeMap), null);
    }

    public ggg(char[] cArr) {
        this.a = new EnumMap(iri.class);
    }

    public ggg(char[] cArr, char[] cArr2) {
        this.a = new AtomicInteger(0);
    }

    public ggg(uem uemVar) {
        uemVar.getClass();
        this.a = uemVar;
    }

    public ggg(byte[] bArr, char[] cArr) {
        this.a = new HashMap();
    }

    public ggg(short[] sArr) {
        this.a = new AtomicInteger(0);
    }
}
