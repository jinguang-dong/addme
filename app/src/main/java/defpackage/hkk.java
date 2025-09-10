package defpackage;

import android.content.Context;
import android.content.UriMatcher;
import android.os.Bundle;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.SpatialGainMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hkk {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public hkk() {
        this((byte[]) null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void a(String str, Object obj) {
        str.getClass();
        this.e.put(str, obj);
        utl utlVar = (utl) this.c.get(str);
        if (utlVar != null) {
            utlVar.e(obj);
        }
        utl utlVar2 = (utl) this.d.get(str);
        if (utlVar2 != null) {
            utlVar2.e(obj);
        }
    }

    public final int b() {
        return ((ulz) this.e).b - ((ulz) this.b).b;
    }

    public final uwp c(uwp uwpVar) {
        if (b() == 127) {
            return uwpVar;
        }
        if (uwpVar.h) {
            ((ulz) this.d).b();
        }
        ulz ulzVar = (ulz) this.e;
        int i = 127 & ulzVar.b;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.c;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, uwpVar);
                ulzVar.b();
                return null;
            }
            Thread.yield();
        }
    }

    public final uwp d() {
        uwp uwpVar;
        while (true) {
            Object obj = this.b;
            Object obj2 = this.e;
            ulz ulzVar = (ulz) obj;
            int i = ulzVar.b;
            if (i - ((ulz) obj2).b == 0) {
                return null;
            }
            int i2 = i & 127;
            if (ulzVar.c(i, i + 1) && (uwpVar = (uwp) ((AtomicReferenceArray) this.c).getAndSet(i2, null)) != null) {
                if (uwpVar.h) {
                    ((ulz) this.d).a();
                    boolean z = unf.a;
                }
                return uwpVar;
            }
        }
    }

    public final uwp e(int i, boolean z) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.c;
        int i2 = i & 127;
        uwp uwpVar = (uwp) atomicReferenceArray.get(i2);
        if (uwpVar != null && uwpVar.h == z) {
            while (!atomicReferenceArray.compareAndSet(i2, uwpVar, null)) {
                if (atomicReferenceArray.get(i2) != uwpVar) {
                }
            }
            if (z) {
                ((ulz) this.d).a();
            }
            return uwpVar;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, owq] */
    public final mgc f(mgn mgnVar) {
        float f;
        long j = true != "full".equals(this.c.dL()) ? 2000000L : 3500000L;
        luj lujVar = (luj) this.b;
        if (((Integer) lujVar.b(luf.aO)).intValue() != 0) {
            j += 4300000;
        }
        if (((Boolean) this.d.dL()).booleanValue()) {
            j += 13000000;
        }
        long j2 = mgnVar.b;
        if (((owx) this.a).dL() == lty.RES_1080P) {
            ltt lttVar = (ltt) ((pmv) this.e).b.dL();
            f = 22.0f;
            if (lttVar != ltt.FPS_AUTO && lttVar != ltt.FPS_30) {
                f = 33.0f;
            }
        } else {
            f = ((ltt) ((pmv) this.e).a.dL()) == ltt.FPS_60 ? 72.0f : 48.0f;
        }
        if (((Boolean) lujVar.b(luf.Q)).booleanValue()) {
            f *= 0.9f;
        }
        int i = (int) (j2 / j);
        int i2 = (int) ((j2 / ((int) ((f * 1000000.0f) / 8.0f))) / 60);
        return new mgc(i, i2, i < 50, i2 < 6);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, uem] */
    public final lsc g(String str, fse fseVar, lsw lswVar, rwc rwcVar, boolean z) {
        ?? r0 = this.b;
        Object objA = this.e.a();
        ida idaVar = (ida) r0.a();
        idaVar.getClass();
        owf owfVar = (owf) this.d.a();
        owfVar.getClass();
        llm llmVar = (llm) this.c.a();
        llmVar.getClass();
        owf owfVarB = ((ihb) this.a).b();
        str.getClass();
        return new lsc((lrm) objA, idaVar, owfVar, llmVar, owfVarB, str, fseVar, lswVar, rwcVar, z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized jrx h(final long j, ltd ltdVar) {
        jrx jrxVar;
        ?? r0 = this.e;
        Long lValueOf = Long.valueOf(j);
        rnt.M(!r0.containsKey(lValueOf), "Current session exists; didn't clear last one?");
        rnt.M(((rwc) this.a).h(), "Trying to create a tone map session with no microvideo API");
        jrxVar = new jrx(this, ltdVar, new paq() { // from class: jrw
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
            @Override // defpackage.paq, java.lang.AutoCloseable
            public final void close() {
                ?? r02 = this.b.e;
                Long lValueOf2 = Long.valueOf(j);
                rnt.L(r02.containsKey(lValueOf2));
                r02.remove(lValueOf2);
            }
        });
        r0.put(lValueOf, jrxVar);
        return jrxVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, pbn] */
    public final tht i(pdk pdkVar) {
        ?? r0 = this.e;
        r0.f("createHdrPlusFrame");
        try {
            poe poeVarD = pdkVar.d();
            FrameMetadata frameMetadata = new FrameMetadata();
            SpatialGainMap spatialGainMap = new SpatialGainMap();
            lau lauVarA = ((lat) this.d).a(pdkVar);
            poj pojVarP = lauVarA.p();
            if (pojVarP != null && pojVarP.c() > 0 && pojVarP.b() > 0) {
                RawWriteView rawWriteViewB = ((tgp) this.b).b(pojVarP);
                if (poeVarD != null) {
                    frameMetadata = ((hzs) this.c.a()).g(poeVarD, lauVarA.l().d(), true);
                    if (frameMetadata.d() <= 0) {
                        pojVarP.close();
                    } else {
                        spatialGainMap = ((tgq) this.a).u(poeVarD);
                    }
                }
                return new tht(rawWriteViewB, frameMetadata, spatialGainMap, new ivi(pojVarP, 10));
            }
            if (pojVarP != null) {
                pojVarP.close();
            }
            pdkVar.close();
            r0.g();
            return null;
        } finally {
            pdkVar.close();
            this.e.g();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ues] */
    public final dtr j() {
        return (dtr) this.b.a();
    }

    public final urk k(dto dtoVar) {
        return new urq(j().a(), dtoVar, 1);
    }

    public hkk(Context context, eap eapVar, eaj eajVar, eap eapVar2, eap eapVar3) {
        this.b = context;
        this.d = eapVar;
        this.c = eajVar;
        this.a = eapVar2;
        this.e = eapVar3;
    }

    public hkk(UriMatcher uriMatcher, hqi hqiVar, hqi hqiVar2, hqi hqiVar3, hqi hqiVar4) {
        this.b = uriMatcher;
        this.a = hqiVar;
        this.e = hqiVar2;
        this.c = hqiVar3;
        this.d = hqiVar4;
    }

    public hkk(eie eieVar, eif eifVar, eif eifVar2, eif eifVar3, eif eifVar4) {
        this.d = eieVar;
        this.a = eifVar;
        this.c = eifVar2;
        this.b = eifVar3;
        this.e = eifVar4;
    }

    public hkk(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    public hkk(owq owqVar, owq owqVar2, luw luwVar, pmv pmvVar, luj lujVar) {
        this.d = owqVar;
        this.c = owqVar2;
        this.a = luwVar;
        this.e = pmvVar;
        this.b = lujVar;
    }

    public hkk(poj pojVar, ltr ltrVar, poe poeVar, rwc rwcVar, rwc rwcVar2) {
        this.a = pojVar;
        this.d = ltrVar;
        this.b = poeVar;
        this.c = rwcVar;
        this.e = rwcVar2;
    }

    public hkk(tzj tzjVar, lat latVar, tgp tgpVar, tgq tgqVar, pbn pbnVar) {
        this.c = tzjVar;
        this.d = latVar;
        this.b = tgpVar;
        this.a = tgqVar;
        this.e = pbnVar;
    }

    public hkk(dx dxVar, out outVar) {
        outVar.getClass();
        this.d = dxVar;
        this.e = outVar;
        this.b = new uez(new drg(5));
        this.c = new iqe(k(dto.a), 0);
        this.a = new iqe(k(dto.b), 2);
    }

    public hkk(Map map) {
        this.e = new LinkedHashMap(map);
        this.a = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.b = new des() { // from class: cxv
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Map] */
            @Override // defpackage.des
            public final Bundle a() {
                uev[] uevVarArr;
                hkk hkkVar = this.a;
                for (Map.Entry entry : ske.bg(hkkVar.d).entrySet()) {
                    hkkVar.a((String) entry.getKey(), ((utl) entry.getValue()).c());
                }
                for (Map.Entry entry2 : ske.bg(hkkVar.a).entrySet()) {
                    hkkVar.a((String) entry2.getKey(), ((des) entry2.getValue()).a());
                }
                ?? r5 = hkkVar.e;
                if (r5.isEmpty()) {
                    uevVarArr = new uev[0];
                } else {
                    ArrayList arrayList = new ArrayList(r5.size());
                    for (Map.Entry entry3 : r5.entrySet()) {
                        arrayList.add(new uev((String) entry3.getKey(), entry3.getValue()));
                    }
                    uevVarArr = (uev[]) arrayList.toArray(new uev[0]);
                }
                return coe.g((uev[]) Arrays.copyOf(uevVarArr, uevVarArr.length));
            }
        };
    }

    public hkk(rwc rwcVar, ejt ejtVar, joc jocVar, iso isoVar) {
        this.e = new HashMap();
        this.a = rwcVar;
        this.d = isoVar;
        this.b = ejtVar;
        this.c = jocVar;
    }

    public hkk(uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4, uem uemVar5) {
        uemVar.getClass();
        this.e = uemVar;
        uemVar2.getClass();
        this.a = uemVar2;
        uemVar3.getClass();
        this.d = uemVar3;
        uemVar4.getClass();
        this.b = uemVar4;
        uemVar5.getClass();
        this.c = uemVar5;
    }

    public hkk(char[] cArr) {
        this.c = new AtomicReferenceArray(128);
        umc umcVar = umc.a;
        this.a = new umb(null, umcVar);
        this.e = new ulz(0, umcVar);
        this.b = new ulz(0, umcVar);
        this.d = new ulz(0, umcVar);
    }

    public hkk(uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4, uem uemVar5, byte[] bArr, byte[] bArr2) {
        uemVar.getClass();
        this.e = uemVar;
        uemVar2.getClass();
        this.a = uemVar2;
        uemVar3.getClass();
        this.b = uemVar3;
        uemVar4.getClass();
        this.c = uemVar4;
        uemVar5.getClass();
        this.d = uemVar5;
    }

    public /* synthetic */ hkk(byte[] bArr) {
        this(ufx.a);
    }

    public hkk(uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4, uem uemVar5, byte[] bArr) {
        uemVar.getClass();
        this.e = uemVar;
        uemVar2.getClass();
        this.b = uemVar2;
        uemVar3.getClass();
        this.d = uemVar3;
        uemVar4.getClass();
        this.c = uemVar4;
        uemVar5.getClass();
        this.a = uemVar5;
    }
}
