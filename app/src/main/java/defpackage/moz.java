package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class moz implements mdg {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ moz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, ndj] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r7v40, types: [java.lang.Object, ndj] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, nfc] */
    @Override // defpackage.mdg
    public final paq a() {
        int i = 5;
        int i2 = 2;
        int i3 = 15;
        byte[] bArr = null;
        int i4 = 0;
        switch (this.b) {
            case 0:
                return this.a.d();
            case 1:
                this.a.run();
                return new fgp(15);
            case 2:
                Object obj = this.a;
                ((itl) obj).k(1);
                return new iew(obj, i2);
            case 3:
                Object obj2 = this.a;
                ((fvu) obj2).m(true);
                return new ffy(obj2, i);
            case 4:
                Object obj3 = this.a;
                ((hyf) obj3).b();
                return new hye(obj3, 0);
            case 5:
                return this.a.a();
            case 6:
                return ((mte) this.a).c();
            case 7:
                Object obj4 = this.a;
                ((hjb) ((mpe) obj4).b.e.a()).g();
                return new khc(obj4, 14);
            case 8:
                Object obj5 = this.a;
                ((mpe) obj5).b.k.a(true);
                return new mpc(obj5, i4, bArr);
            case 9:
                Object obj6 = this.a;
                luu luuVar = luf.E;
                mpf mpfVar = ((mpe) obj6).b;
                owq owqVarA = mpfVar.m.a(luuVar);
                String str = (String) ((ovx) owqVarA).d;
                nkw nkwVar = (nkw) mpfVar.i.dL();
                if (!mpfVar.h.i() || !"torch".equals(str) || (!nkw.SLOW_MOTION.equals(nkwVar) && !nkw.VIDEO.equals(nkwVar) && !nkw.AMBER.equals(nkwVar))) {
                    return new fgp(18);
                }
                owqVarA.a("off");
                return new khc(owqVarA, i3);
            case 10:
                return ((itl) this.a).a();
            case 11:
                Object obj7 = this.a;
                return ((mpf) obj7).n.d(imk.FIRST_RUN_TOAST);
            case 12:
                Object obj8 = this.a;
                ((mts) obj8).d(false);
                return new mpc(obj8, i2, bArr);
            case 13:
                Object obj9 = this.a;
                ((qqq) obj9).m(false);
                return new mpc(obj9, i, bArr);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return this.a.c();
            default:
                return ((qqq) this.a).i();
        }
    }
}
