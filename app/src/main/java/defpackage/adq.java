package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class adq implements uif {
    private final /* synthetic */ int a;

    public /* synthetic */ adq(int i) {
        this.a = i;
    }

    @Override // defpackage.uif
    public final Object a() {
        byte[] bArr = null;
        switch (this.a) {
            case 0:
                int i = ads.a;
                bhg bhgVar = new bhg(new add(2));
                bhgVar.a();
                return bhgVar;
            case 1:
                return og.b();
            case 2:
                return afc.a;
            case 3:
                return new afw(bko.j(4284900966L), byi.aJ(0.0f, 3));
            case 4:
                ana anaVar = anm.a;
                return new ank(0, 0);
            case 5:
            case 6:
                return null;
            case 7:
                return arq.a;
            case 8:
                return Float.valueOf(1.0f);
            case 9:
                long j = asw.a;
                return true;
            case 10:
                ava avaVar = atc.a;
                return new atb(bkv.f);
            case 11:
                return auz.a;
            case 12:
                long j2 = axi.a;
                long j3 = axi.t;
                return new avp(j3, axi.j, axi.u, axi.k, axi.e, axi.w, axi.l, axi.x, axi.m, axi.H, axi.p, axi.I, axi.q, axi.a, axi.g, axi.y, axi.n, axi.G, axi.o, j3, axi.f, axi.d, axi.b, axi.h, axi.c, axi.i, axi.r, axi.s, axi.v, axi.z, axi.F, axi.A, axi.B, axi.C, axi.D, axi.E);
            case 13:
                return true;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new cht(48.0f);
            case 15:
                return a.af();
            case 16:
                return new awg(0);
            case 17:
                ayp aypVar = awl.a;
                return new awj(bkv.f);
            case 18:
                return new awo(bArr);
            case 19:
                return axo.a;
            default:
                return new awu(bArr);
        }
    }
}
