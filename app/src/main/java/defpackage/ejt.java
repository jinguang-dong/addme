package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.hardware.camera2.CaptureResult;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejt {
    public final Object a;

    public ejt(Context context) {
        this.a = new oge(context);
    }

    public static final syu n(Collection collection) {
        return swz.i(ske.I(collection), new hth(3), sxo.a);
    }

    public static final spz r(thx thxVar) {
        tpc tpcVarM = spz.a.m();
        int i = thxVar.b;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        spz spzVar = (spz) tphVar;
        spzVar.b |= 1;
        spzVar.c = i;
        int i2 = thxVar.c;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        spz spzVar2 = (spz) tphVar2;
        spzVar2.b |= 2;
        spzVar2.d = i2;
        int i3 = thxVar.d;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        tph tphVar3 = tpcVarM.b;
        spz spzVar3 = (spz) tphVar3;
        spzVar3.b |= 4;
        spzVar3.e = i3;
        int i4 = thxVar.e;
        if (!tphVar3.C()) {
            tpcVarM.o();
        }
        tph tphVar4 = tpcVarM.b;
        spz spzVar4 = (spz) tphVar4;
        spzVar4.b |= 8;
        spzVar4.f = i4;
        int i5 = thxVar.f;
        if (!tphVar4.C()) {
            tpcVarM.o();
        }
        tph tphVar5 = tpcVarM.b;
        spz spzVar5 = (spz) tphVar5;
        spzVar5.b |= 16;
        spzVar5.g = i5;
        int i6 = thxVar.g;
        if (!tphVar5.C()) {
            tpcVarM.o();
        }
        spz spzVar6 = (spz) tpcVarM.b;
        spzVar6.b |= 32;
        spzVar6.h = i6;
        return (spz) tpcVarM.l();
    }

    public final void a() {
        float f = ((PointF) this.a).x;
    }

    public final void b() {
        float f = ((PointF) this.a).y;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [eqp, java.lang.Object] */
    public final synchronized eqp c(Class cls) {
        ?? r0 = this.a;
        int size = r0.size();
        for (int i = 0; i < size; i++) {
            jod jodVar = (jod) r0.get(i);
            if (((Class) jodVar.b).isAssignableFrom(cls)) {
                return jodVar.a;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    public final synchronized void d(Class cls, eqp eqpVar) {
        this.a.add(new jod(cls, eqpVar, (char[]) null));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final synchronized List e() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final synchronized void f(eqc eqcVar) {
        this.a.add(eqcVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [eqa, java.lang.Object] */
    public final synchronized eqa g(Class cls) {
        for (jod jodVar : this.a) {
            if (((Class) jodVar.b).isAssignableFrom(cls)) {
                return jodVar.a;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    public final synchronized void h(Class cls, eqa eqaVar) {
        this.a.add(new jod(cls, eqaVar, (char[]) null));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [eyn, java.lang.Object] */
    public final synchronized eyn i(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return eyo.a;
        }
        for (tdy tdyVar : this.a) {
            if (tdyVar.c(cls, cls2)) {
                return tdyVar.c;
            }
        }
        throw new IllegalArgumentException(mn.j(cls2, cls, "No transcoder registered to transcode from ", " to "));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final synchronized List j(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (tdy tdyVar : this.a) {
            if (tdyVar.c(cls, cls2)) {
                Object obj = tdyVar.a;
                if (!arrayList.contains(obj)) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    public final synchronized void k(Class cls, Class cls2, eyn eynVar) {
        this.a.add(new tdy(cls, cls2, eynVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue] */
    public final synchronized epx l(ByteBuffer byteBuffer) {
        epx epxVar;
        epxVar = (epx) this.a.poll();
        if (epxVar == null) {
            epxVar = new epx();
        }
        epxVar.b = null;
        Arrays.fill(epxVar.a, (byte) 0);
        epxVar.c = new epw();
        epxVar.d = 0;
        epxVar.b = byteBuffer.asReadOnlyBuffer();
        epxVar.b.position(0);
        epxVar.b.order(ByteOrder.LITTLE_ENDIAN);
        return epxVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    public final synchronized void m(epx epxVar) {
        epxVar.b = null;
        epxVar.c = null;
        this.a.offer(epxVar);
    }

    public final boolean o(CaptureResult.Key key, Object obj) {
        return p(key, obj);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    @SafeVarargs
    public final boolean p(CaptureResult.Key key, Object... objArr) {
        a.I(objArr.length > 0);
        HashSet hashSet = new HashSet(Arrays.asList(objArr));
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(((poe) it.next()).a(key))) {
                return false;
            }
        }
        return true;
    }

    public final ssb q() {
        return (ssb) ((tpc) this.a).l();
    }

    public final hbp s(kko kkoVar) {
        return new hbp((kgw) this.a, new ejt(kkoVar, (byte[]) null), kkoVar);
    }

    public final ejt t() {
        return new ejt(((kko) this.a).b, (byte[]) null);
    }

    public final ejt u() {
        return new ejt(((kko) this.a).c, (byte[]) null);
    }

    public ejt(Object obj) {
        this.a = obj;
    }

    public ejt(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public ejt() {
        this.a = new HashMap();
    }

    public ejt(long j) {
        this.a = new eve(j);
    }

    public ejt(pbb pbbVar) {
        this.a = pbbVar.a("TuningDataLogger");
    }

    public ejt(byte[] bArr) {
        this.a = new ArrayDeque();
    }

    public ejt(char[] cArr) {
        this.a = new HashMap();
    }

    public ejt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        char[] cArr = fax.a;
        this.a = new ArrayDeque(0);
    }

    public ejt(char[] cArr, byte[] bArr, byte[] bArr2) {
        this.a = new ArrayList();
    }

    public ejt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new HashMap();
    }

    public ejt(char[] cArr, byte[] bArr) {
        this.a = new ArrayList();
    }

    public ejt(byte[] bArr, char[] cArr) {
        this.a = new ArrayList();
    }

    public ejt(short[] sArr) {
        this.a = new ArrayList();
    }

    public ejt(hbj hbjVar) {
        if (hbjVar.p(gyg.h)) {
            ffe ffeVar = new ffe();
            ffeVar.b(0.0f);
            ffeVar.c(0.49f);
            ffeVar.d(-10.0f);
            this.a = ffeVar.a();
            return;
        }
        if (hbjVar.p(gyg.i)) {
            ffe ffeVar2 = new ffe();
            ffeVar2.b(0.5f);
            ffeVar2.c(0.51f);
            ffeVar2.d(-11.0f);
            this.a = ffeVar2.a();
            return;
        }
        ffe ffeVar3 = new ffe();
        ffeVar3.b(0.5f);
        ffeVar3.c(0.29f);
        ffeVar3.d(-17.0f);
        this.a = ffeVar3.a();
    }

    public ejt(int[] iArr) {
        this.a = ssb.a.m();
    }
}
