package defpackage;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class toy {
    public static final toy a = new toy(null);
    final trl b = new trl();
    public boolean c;
    public boolean d;

    private toy() {
    }

    public static int a(Ctry ctry, int i, Object obj) {
        int iZ = tos.Z(i);
        if (ctry == Ctry.GROUP) {
            tpx.d((tqr) obj);
            iZ += iZ;
        }
        trz trzVar = trz.a;
        int iAd = 4;
        switch (ctry.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                iAd = 8;
                return iZ + iAd;
            case 1:
                ((Float) obj).floatValue();
                return iZ + iAd;
            case 2:
                iAd = tos.ad(((Long) obj).longValue());
                return iZ + iAd;
            case 3:
                iAd = tos.ad(((Long) obj).longValue());
                return iZ + iAd;
            case 4:
                iAd = tos.L(((Integer) obj).intValue());
                return iZ + iAd;
            case 5:
                ((Long) obj).longValue();
                iAd = 8;
                return iZ + iAd;
            case 6:
                ((Integer) obj).intValue();
                return iZ + iAd;
            case 7:
                ((Boolean) obj).booleanValue();
                iAd = 1;
                return iZ + iAd;
            case 8:
                iAd = obj instanceof toj ? tos.H((toj) obj) : tos.Y((String) obj);
                return iZ + iAd;
            case 9:
                iAd = ((tqr) obj).l();
                return iZ + iAd;
            case 10:
                iAd = obj instanceof tqd ? tos.O((tqd) obj) : tos.Q((tqr) obj);
                return iZ + iAd;
            case 11:
                iAd = obj instanceof toj ? tos.H((toj) obj) : tos.P(((byte[]) obj).length);
                return iZ + iAd;
            case 12:
                iAd = tos.ab(((Integer) obj).intValue());
                return iZ + iAd;
            case 13:
                iAd = obj instanceof tpk ? tos.L(((tpk) obj).a()) : tos.L(((Integer) obj).intValue());
                return iZ + iAd;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((Integer) obj).intValue();
                return iZ + iAd;
            case 15:
                ((Long) obj).longValue();
                iAd = 8;
                return iZ + iAd;
            case 16:
                iAd = tos.U(((Integer) obj).intValue());
                return iZ + iAd;
            case 17:
                iAd = tos.W(((Long) obj).longValue());
                return iZ + iAd;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static void g(tos tosVar, Ctry ctry, int i, Object obj) {
        if (ctry == Ctry.GROUP) {
            tqr tqrVar = (tqr) obj;
            tpx.d(tqrVar);
            tosVar.A(i, 3);
            tosVar.an(tqrVar);
            tosVar.A(i, 4);
            return;
        }
        tosVar.A(i, ctry.t);
        trz trzVar = trz.a;
        switch (ctry.ordinal()) {
            case 0:
                tosVar.ak(((Double) obj).doubleValue());
                break;
            case 1:
                tosVar.am(((Float) obj).floatValue());
                break;
            case 2:
                tosVar.E(((Long) obj).longValue());
                break;
            case 3:
                tosVar.E(((Long) obj).longValue());
                break;
            case 4:
                tosVar.t(((Integer) obj).intValue());
                break;
            case 5:
                tosVar.r(((Long) obj).longValue());
                break;
            case 6:
                tosVar.p(((Integer) obj).intValue());
                break;
            case 7:
                tosVar.j(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof toj)) {
                    tosVar.z((String) obj);
                    break;
                } else {
                    tosVar.n((toj) obj);
                    break;
                }
            case 9:
                tosVar.an((tqr) obj);
                break;
            case 10:
                tosVar.v((tqr) obj);
                break;
            case 11:
                if (!(obj instanceof toj)) {
                    byte[] bArr = (byte[]) obj;
                    tosVar.F(bArr, bArr.length);
                    break;
                } else {
                    tosVar.n((toj) obj);
                    break;
                }
            case 12:
                tosVar.C(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof tpk)) {
                    tosVar.t(((Integer) obj).intValue());
                    break;
                } else {
                    tosVar.t(((tpk) obj).a());
                    break;
                }
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                tosVar.p(((Integer) obj).intValue());
                break;
            case 15:
                tosVar.r(((Long) obj).longValue());
                break;
            case 16:
                tosVar.ap(((Integer) obj).intValue());
                break;
            case 17:
                tosVar.ar(((Long) obj).longValue());
                break;
        }
    }

    public static int j(tpg tpgVar, Object obj) {
        return a(tpgVar.b, tpgVar.a, obj);
    }

    private static Object n(Object obj) {
        if (obj instanceof tqw) {
            return ((tqw) obj).c();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private static boolean o(Map.Entry entry) {
        if (((tpg) entry.getKey()).a() != trz.MESSAGE) {
            return true;
        }
        Object value = entry.getValue();
        if (value instanceof tqs) {
            return ((tqs) value).p();
        }
        if (value instanceof tqd) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public final int b(Map.Entry entry) {
        int iAa;
        int iZ;
        tpg tpgVar = (tpg) entry.getKey();
        Object value = entry.getValue();
        if (tpgVar.a() != trz.MESSAGE) {
            return j(tpgVar, value);
        }
        if (value instanceof tqd) {
            int i = ((tpg) entry.getKey()).a;
            int iZ2 = tos.Z(1);
            iAa = iZ2 + iZ2 + tos.aa(2, i);
            iZ = tos.N(3, (tqd) value);
        } else {
            int i2 = ((tpg) entry.getKey()).a;
            int iZ3 = tos.Z(1);
            iAa = iZ3 + iZ3 + tos.aa(2, i2);
            iZ = tos.Z(3) + tos.Q((tqr) value);
        }
        return iAa + iZ;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final toy clone() {
        toy toyVar = new toy();
        trl trlVar = this.b;
        int i = trlVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            tri triVar = (tri) trlVar.d(i2);
            toyVar.l((tpg) triVar.a, triVar.b);
        }
        for (Map.Entry entry : trlVar.a()) {
            toyVar.l((tpg) entry.getKey(), entry.getValue());
        }
        toyVar.d = this.d;
        return toyVar;
    }

    public final Iterator d() {
        return h() ? Collections.emptyIterator() : this.d ? new tqc(this.b.entrySet().iterator()) : this.b.entrySet().iterator();
    }

    public final void e() {
        if (this.c) {
            return;
        }
        trl trlVar = this.b;
        int i = trlVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((tri) trlVar.d(i2)).b;
            if (obj instanceof tph) {
                ((tph) obj).y();
            }
        }
        Iterator it = trlVar.a().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof tph) {
                ((tph) value).y();
            }
        }
        if (!trlVar.d) {
            for (int i3 = 0; i3 < trlVar.b; i3++) {
            }
            Iterator it2 = trlVar.a().iterator();
            while (it2.hasNext()) {
            }
        }
        if (!trlVar.d) {
            trlVar.c = trlVar.c.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(trlVar.c);
            trlVar.e = trlVar.e.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(trlVar.e);
            trlVar.d = true;
        }
        this.c = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof toy) {
            return this.b.equals(((toy) obj).b);
        }
        return false;
    }

    public final void f(Map.Entry entry) {
        tpg tpgVar = (tpg) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof tqd;
        if (tpgVar.a() != trz.MESSAGE) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.b.put(tpgVar, n(value));
            return;
        }
        Object objK = k(tpgVar);
        if (objK == null) {
            this.b.put(tpgVar, n(value));
            if (z) {
                this.d = true;
                return;
            }
            return;
        }
        if (z) {
            throw null;
        }
        if (objK instanceof tqw) {
            throw new UnsupportedOperationException();
        }
        tqq tqqVarEf = ((tqr) objK).ef();
        ((tpc) tqqVarEf).r((tph) ((tqr) value));
        this.b.put(tpgVar, tqqVarEf.l());
    }

    final boolean h() {
        return this.b.isEmpty();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final boolean i() {
        trl trlVar = this.b;
        int i = trlVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (!o(trlVar.d(i2))) {
                return false;
            }
        }
        Iterator it = trlVar.a().iterator();
        while (it.hasNext()) {
            if (!o((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Object k(tpg tpgVar) {
        Object obj = this.b.get(tpgVar);
        if (!(obj instanceof tqd)) {
            return obj;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        if ((r4 instanceof defpackage.tpk) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (r1 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if ((r4 instanceof defpackage.tqd) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(defpackage.tpg r3, java.lang.Object r4) {
        /*
            r2 = this;
            defpackage.tpx.b(r4)
            try r0 = defpackage.Ctry.DOUBLE
            trz r0 = defpackage.trz.a
            try r0 = r3.b
            trz r0 = r0.s
            int r1 = r0.ordinal()
            switch(r1) {
                case 0: goto L3d;
                case 1: goto L3a;
                case 2: goto L37;
                case 3: goto L34;
                case 4: goto L31;
                case 5: goto L2e;
                case 6: goto L25;
                case 7: goto L1c;
                case 8: goto L13;
                default: goto L12;
            }
        L12:
            goto L4e
        L13:
            boolean r1 = r4 instanceof defpackage.tqr
            if (r1 != 0) goto L41
            boolean r1 = r4 instanceof defpackage.tqd
            if (r1 == 0) goto L4e
            goto L41
        L1c:
            boolean r1 = r4 instanceof java.lang.Integer
            if (r1 != 0) goto L41
            boolean r1 = r4 instanceof defpackage.tpk
            if (r1 == 0) goto L4e
            goto L41
        L25:
            boolean r1 = r4 instanceof defpackage.toj
            if (r1 != 0) goto L41
            boolean r1 = r4 instanceof byte[]
            if (r1 == 0) goto L4e
            goto L41
        L2e:
            boolean r1 = r4 instanceof java.lang.String
            goto L3f
        L31:
            boolean r1 = r4 instanceof java.lang.Boolean
            goto L3f
        L34:
            boolean r1 = r4 instanceof java.lang.Double
            goto L3f
        L37:
            boolean r1 = r4 instanceof java.lang.Float
            goto L3f
        L3a:
            boolean r1 = r4 instanceof java.lang.Long
            goto L3f
        L3d:
            boolean r1 = r4 instanceof java.lang.Integer
        L3f:
            if (r1 == 0) goto L4e
        L41:
            boolean r0 = r4 instanceof defpackage.tqd
            if (r0 == 0) goto L48
            r0 = 1
            r2.d = r0
        L48:
            trl r2 = r2.b
            r2.put(r3, r4)
            return
        L4e:
            int r2 = r3.a
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r0, r4}
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            r3.<init>(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.toy.l(tpg, java.lang.Object):void");
    }

    public final boolean m(tpg tpgVar) {
        return this.b.get(tpgVar) != null;
    }

    private toy(byte[] bArr) {
        e();
        e();
    }
}
