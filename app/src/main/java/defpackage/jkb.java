package defpackage;

import j$.util.Optional;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jkb implements nja {
    public final /* synthetic */ jjx a;
    private final /* synthetic */ int b;

    public /* synthetic */ jkb(jjx jjxVar, int i) {
        this.b = i;
        this.a = jjxVar;
    }

    @Override // defpackage.nja
    public final void a(float f, boolean z, niz nizVar) {
        int i = this.b;
        Float fValueOf = Float.valueOf(0.5f);
        switch (i) {
            case 0:
                if (z) {
                    jkd jkdVar = (jkd) this.a;
                    jkdVar.n.b(true);
                    jkdVar.h.a(true);
                    Float fValueOf2 = Float.valueOf(f);
                    jkdVar.g.a(fValueOf2);
                    owq owqVar = jkdVar.f;
                    ovx ovxVar = (ovx) owqVar;
                    if (((Float) ovxVar.d).floatValue() == -1.0f) {
                        owqVar.a(Float.valueOf(jkdVar.l));
                    }
                    owq owqVar2 = jkdVar.k;
                    jjp jjpVar = (jjp) owqVar2.dL();
                    jjpVar.b = Optional.of(fValueOf2);
                    jjpVar.e = Optional.of((Float) ovxVar.d);
                    owqVar2.a(jjpVar);
                    jkdVar.p.C(nizVar, 8, f);
                    break;
                }
                break;
            case 1:
                if (z) {
                    jka jkaVar = (jka) this.a;
                    jkaVar.d.h(true);
                    float fI = jka.i(f);
                    owq owqVar3 = jkaVar.e;
                    jjp jjpVar2 = (jjp) owqVar3.dL();
                    jjpVar2.j = Optional.of(Float.valueOf(fI));
                    owqVar3.a(jjpVar2);
                    jkaVar.j();
                    jkaVar.h.C(nizVar, 11, fI);
                    break;
                }
                break;
            case 2:
                jjx jjxVar = this.a;
                nhz nhzVar = jjxVar.a;
                if (nhzVar != null) {
                    jkg jkgVar = (jkg) jjxVar;
                    int i2 = jkgVar.o;
                    float f2 = (r2 - i2) * f;
                    float f3 = i2;
                    nhzVar.e(String.valueOf(ukj.x(ukc.m(f2 + f3, f3, jkgVar.p))));
                }
                if (z) {
                    jkg jkgVar2 = (jkg) jjxVar;
                    jkgVar2.s.b(true);
                    jkgVar2.n.a(true);
                    owq owqVar4 = jkgVar2.l;
                    Float fValueOf3 = Float.valueOf(f);
                    owqVar4.a(fValueOf3);
                    owq owqVar5 = jkgVar2.m;
                    ovx ovxVar2 = (ovx) owqVar5;
                    if (ujp.d((Float) ovxVar2.d, -1.0f)) {
                        owqVar5.a(fValueOf);
                    }
                    owq owqVar6 = jkgVar2.e;
                    jjp jjpVar3 = (jjp) owqVar6.dL();
                    jjpVar3.d = Optional.of(fValueOf3);
                    jjpVar3.c = Optional.of(ovxVar2.d);
                    owqVar6.a(jjpVar3);
                    jkgVar2.u.C(nizVar, 16, f);
                    break;
                }
                break;
            case 3:
                jjx jjxVar2 = this.a;
                nhz nhzVar2 = jjxVar2.a;
                if (nhzVar2 != null) {
                    String str = String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(ukc.m((8.0f * f) - 4.0f, -4.0f, 4.0f))}, 1));
                    str.getClass();
                    nhzVar2.e(str);
                }
                if (z) {
                    jki jkiVar = (jki) jjxVar2;
                    jkiVar.m.b(true);
                    jkiVar.k.a(true);
                    owq owqVar7 = jkiVar.i;
                    Float fValueOf4 = Float.valueOf(f);
                    owqVar7.a(fValueOf4);
                    owq owqVar8 = jkiVar.j;
                    ovx ovxVar3 = (ovx) owqVar8;
                    if (ujp.d((Float) ovxVar3.d, -1.0f)) {
                        owqVar8.a(fValueOf);
                    }
                    owq owqVar9 = jkiVar.d;
                    jjp jjpVar4 = (jjp) owqVar9.dL();
                    jjpVar4.c = Optional.of(fValueOf4);
                    jjpVar4.d = Optional.of(ovxVar3.d);
                    owqVar9.a(jjpVar4);
                    jkiVar.o.C(nizVar, 15, f);
                    break;
                }
                break;
            case 4:
                if (z) {
                    jkj jkjVar = (jkj) this.a;
                    jkjVar.l.b(true);
                    jkjVar.f.a(true);
                    int iRound = Math.round(jkjVar.i() * f) + ((laj) jkjVar.h.dL()).b;
                    owq owqVar10 = jkjVar.g;
                    if (((Integer) ((ovx) owqVar10).d).intValue() != iRound) {
                        owqVar10.a(Integer.valueOf(iRound));
                    }
                    owq owqVar11 = jkjVar.i;
                    jjp jjpVar5 = (jjp) owqVar11.dL();
                    jjpVar5.i = Optional.of(Integer.valueOf(iRound));
                    owqVar11.a(jjpVar5);
                    jkjVar.m.C(nizVar, 10, iRound);
                    break;
                }
                break;
            case 5:
                if (z) {
                    jkl jklVar = (jkl) this.a;
                    jklVar.r.b(true);
                    jklVar.k.a(true);
                    Float fValueOf5 = Float.valueOf(f);
                    jklVar.i.a(fValueOf5);
                    owq owqVar12 = jklVar.j;
                    ovx ovxVar4 = (ovx) owqVar12;
                    if (((Float) ovxVar4.d).floatValue() == -1.0f) {
                        owqVar12.a(Float.valueOf(jklVar.o));
                    }
                    owq owqVar13 = jklVar.h;
                    jjp jjpVar6 = (jjp) owqVar13.dL();
                    jjpVar6.e = Optional.of(fValueOf5);
                    jjpVar6.b = Optional.of((Float) ovxVar4.d);
                    owqVar13.a(jjpVar6);
                    jklVar.t.C(nizVar, 3, f);
                    break;
                }
                break;
            case 6:
                if (z) {
                    jkm jkmVar = (jkm) this.a;
                    qqq qqqVar = jkmVar.p;
                    qqqVar.y(1);
                    float f4 = (f + f) - 1.0f;
                    qqqVar.z(f4);
                    owq owqVar14 = jkmVar.d;
                    jjp jjpVar7 = (jjp) owqVar14.dL();
                    jjpVar7.h = Optional.of(Float.valueOf(f4));
                    owqVar14.a(jjpVar7);
                    jkmVar.n.C(nizVar, 4, f4);
                    jkmVar.i(true);
                    if (nizVar == niz.c) {
                        jkmVar.k = true;
                        break;
                    }
                }
                break;
            case 7:
                jjx jjxVar3 = this.a;
                ljj ljjVar = (ljj) jjxVar3;
                int iK = ljjVar.k(f);
                nhz nhzVar3 = jjxVar3.a;
                nhzVar3.getClass();
                nhzVar3.e(String.format(Locale.US, "%d", Integer.valueOf(iK)));
                if (z) {
                    ljjVar.d.b(false);
                    ljjVar.l = true;
                    ljjVar.m(iK);
                    ljjVar.p.C(nizVar, 7, iK);
                    break;
                }
                break;
            default:
                lkn lknVar = (lkn) this.a;
                long jK = lknVar.k(f);
                lknVar.i.e(qpt.bQ(jK));
                if (z) {
                    lknVar.d.b(false);
                    lknVar.m(jK);
                    lknVar.o.C(nizVar, 5, jK);
                    break;
                }
                break;
        }
    }

    public jkb(jjx jjxVar, int i, byte[] bArr) {
        this.b = i;
        this.a = jjxVar;
    }
}
