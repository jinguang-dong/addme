package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class juf implements pau {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ juf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, pbr] */
    @Override // defpackage.pau
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                jug jugVar = (jug) this.a;
                jugVar.c.a(Boolean.valueOf(jugVar.a((muj) jugVar.a.dL(), ((Integer) obj).intValue())));
                return;
            case 1:
                long jLongValue = ((Long) obj).longValue();
                int i = (int) jLongValue;
                if (jLongValue != i) {
                    throw new ArithmeticException();
                }
                this.a.c(i);
                return;
            case 2:
                ((jxa) this.a).A.sendEmptyMessage(105);
                return;
            case 3:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj2 = this.a;
                if (zBooleanValue) {
                    ((jxi) obj2).f.a(obj2);
                    return;
                } else {
                    ((jxi) obj2).f.h(obj2);
                    return;
                }
            case 4:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                Object obj3 = this.a;
                if (zBooleanValue2) {
                    ((jxp) obj3).l.b();
                    return;
                } else {
                    ((jxp) obj3).l.a();
                    return;
                }
            case 5:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                Object obj4 = this.a;
                if (zBooleanValue3) {
                    ((jxp) obj4).r.a(obj4);
                    return;
                } else {
                    ((jxp) obj4).r.h(obj4);
                    return;
                }
            case 6:
                ((fyd) this.a).i(((Boolean) obj).booleanValue());
                return;
            case 7:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                Object obj5 = this.a;
                if (!zBooleanValue4) {
                    ((kai) obj5).k = false;
                    return;
                }
                kai kaiVar = (kai) obj5;
                kaiVar.k = true;
                kaiVar.n.post(new jxr(obj5, 9));
                return;
            case 8:
                out.a();
                ((fck) this.a).a = (nkw) obj;
                return;
            case 9:
                ((keb) this.a).c();
                return;
            case 10:
                ((keb) this.a).c();
                return;
            case 11:
                ((keb) this.a).c();
                return;
            case 12:
                nkw nkwVar = (nkw) obj;
                krj krjVar = (krj) this.a;
                if (krjVar.K != nkw.UNINITIALIZED && krjVar.K != nkwVar) {
                    krjVar.m(true, null);
                }
                krjVar.K = nkwVar;
                return;
            case 13:
                ((krj) this.a).n(((Boolean) obj).booleanValue());
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                krn krnVar = (krn) this.a;
                ksa ksaVar = (ksa) ((sew) krnVar.i).c.get((ltw) obj);
                if (ksaVar != null) {
                    krnVar.j.l(ksaVar);
                    return;
                }
                return;
            case 15:
                ((krn) this.a).f(true);
                return;
            case 16:
                ((krj) this.a).m(false, krs.IMAGE_ASPECT_RATIO);
                return;
            case 17:
                ((krj) this.a).m(false, krs.IMAGE_ASPECT_RATIO);
                return;
            case 18:
                ((krj) this.a).m(false, krs.IMAGE_ASPECT_RATIO_IMMERSIVE);
                return;
            case 19:
                ((krj) this.a).m(false, krs.IMAGE_ASPECT_RATIO_IMMERSIVE);
                return;
            default:
                ((krj) this.a).m(false, krs.VIDEO_ASPECT_RATIO);
                return;
        }
    }
}
