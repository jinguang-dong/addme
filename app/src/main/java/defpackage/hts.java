package defpackage;

import android.media.MediaCodec;
import android.view.View;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class hts implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public hts(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, int i2) {
        this.f = i2;
        this.a = i;
        this.e = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
        this.d = arrayList4;
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, mzu] */
    /* JADX WARN: Type inference failed for: r12v24, types: [java.lang.Object, mzx] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, poj] */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        Integer num;
        int i2 = this.f;
        if (i2 == 0) {
            htv htvVar = (htv) this.b;
            hui huiVar = htvVar.f;
            int i3 = this.a;
            Object obj = this.e;
            if (huiVar == null || i3 != (i = huiVar.f)) {
                ((sgt) htv.a.c().M(1561)).t("Session changed. Ignoring preview response for sessionId=%d", i3);
                ((our) obj).close();
                return;
            }
            ?? r7 = this.c;
            float[] fArr = ((hms) ((rwg) htvVar.b).a).c(r7.d()).a;
            if (fArr.length != 3) {
                ((sgt) htv.a.c().M(1562)).t("Invalid pose data for preview frame of sessionId=%d", i);
                return;
            }
            huc hucVar = htvVar.m;
            if (hucVar != null) {
                Object obj2 = this.d;
                r7.getClass();
                ukc.C(coj.e(hucVar.j), hucVar.k, 0, new hub(hucVar, huiVar, r7, ((hui) obj2).g.b, (our) obj, fArr, null), 2);
                return;
            }
            return;
        }
        if (i2 == 1) {
            for (int i4 = 0; i4 < this.a; i4++) {
                View view = (View) ((ArrayList) this.e).get(i4);
                String str = (String) ((ArrayList) this.b).get(i4);
                int[] iArr = con.a;
                cog.j(view, str);
                cog.j((View) ((ArrayList) this.c).get(i4), (String) ((ArrayList) this.d).get(i4));
            }
            return;
        }
        if (i2 == 2) {
            try {
                hashCode();
                Object obj3 = this.e;
                Object obj4 = this.b;
                if (!((String) obj3).equals(((kzl) obj4).d)) {
                    ((sgt) kzl.a.c().M(3841)).s("Out of date task, skipping.");
                    Thread.currentThread().getId();
                    ((kzl) obj4).b.writeLock().unlock();
                    return;
                }
                pdv pdvVar = (pdv) this.c.get(obj3);
                Stream map = Collection.EL.stream(pdvVar.d()).map(new kwj(8));
                int i5 = sbp.d;
                map.collect(ryv.a);
                Object obj5 = this.d;
                int i6 = this.a;
                ((kzl) obj4).e = ((pfu) obj5).c(pdvVar, i6);
                ((kzl) obj4).e.n(i6);
                ((kzl) obj4).e.l(((kzl) obj4).g);
                rnu rnuVar = ((kzl) obj4).h;
                if (rnuVar != null) {
                    ((kzl) obj4).e.q(rnuVar);
                }
                return;
            } finally {
                Thread.currentThread().getId();
                ((kzl) this.b).b.writeLock().unlock();
            }
        }
        if (i2 == 3) {
            int i7 = this.a;
            mzy mzyVar = (mzy) this.e;
            if (i7 != mzyVar.u) {
                return;
            }
            ?? r0 = this.b;
            Object obj6 = this.c;
            ?? r12 = this.d;
            mzyVar.d.start();
            r12.i();
            int i8 = mzyVar.F;
            if (i8 == 1 || i8 != 2) {
                r0.a((nkw) obj6);
                return;
            } else {
                mzyVar.F = 3;
                r0.a((nkw) obj6);
                return;
            }
        }
        Object obj7 = this.d;
        Object obj8 = this.b;
        Object obj9 = this.c;
        int i9 = this.a;
        Object obj10 = this.e;
        try {
            synchronized (((qei) obj10).e) {
                num = (Integer) ((qei) obj10).f.get(Integer.valueOf(i9));
                if (num == null) {
                    throw new IllegalArgumentException(a.bv(i9, "Unknown track id: "));
                }
            }
            ((qei) obj10).b.i(num.intValue(), (ByteBuffer) obj9, (MediaCodec.BufferInfo) obj8);
            if (obj7 != null) {
                ((pmk) obj7).close();
            }
        } finally {
        }
    }

    public /* synthetic */ hts(htv htvVar, int i, poj pojVar, hui huiVar, our ourVar, int i2) {
        this.f = i2;
        this.b = htvVar;
        this.a = i;
        this.c = pojVar;
        this.d = huiVar;
        this.e = ourVar;
    }

    public hts(kzl kzlVar, String str, Map map, pfu pfuVar, int i, int i2) {
        this.f = i2;
        this.e = str;
        this.c = map;
        this.d = pfuVar;
        this.a = i;
        this.b = kzlVar;
    }

    public /* synthetic */ hts(mzy mzyVar, int i, mzx mzxVar, nkw nkwVar, mzu mzuVar, int i2) {
        this.f = i2;
        this.e = mzyVar;
        this.a = i;
        this.d = mzxVar;
        this.c = nkwVar;
        this.b = mzuVar;
    }

    public /* synthetic */ hts(qei qeiVar, int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, pmk pmkVar, int i2) {
        this.f = i2;
        this.e = qeiVar;
        this.a = i;
        this.c = byteBuffer;
        this.b = bufferInfo;
        this.d = pmkVar;
    }
}
