package defpackage;

import j$.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mia implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;

    public mia(tzx tzxVar, int i) {
        this.b = i;
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.b) {
        }
        return b();
    }

    public final mhp b() {
        switch (this.b) {
            case 0:
                mhp mhpVar = mhp.HEAT_CRITICAL;
                mhpVar.getClass();
                mhp mhpVar2 = (mhp) Map.EL.getOrDefault(mhq.b, ((hbj) this.a.a()).a(hav.v).get(), mhpVar);
                mhpVar2.getClass();
                return mhpVar2;
            case 1:
                mhp mhpVar3 = mhp.HEAT_SEVERE;
                mhpVar3.getClass();
                mhp mhpVar4 = (mhp) Map.EL.getOrDefault(mhq.b, ((hbj) this.a.a()).a(hav.n).get(), mhpVar3);
                mhpVar4.getClass();
                return mhpVar4;
            case 2:
                mhp mhpVar5 = mhp.HEAT_SEVERE;
                mhpVar5.getClass();
                mhp mhpVar6 = (mhp) Map.EL.getOrDefault(mhq.b, ((hbj) this.a.a()).a(hav.u).get(), mhpVar5);
                mhpVar6.getClass();
                return mhpVar6;
            case 3:
                mhp mhpVar7 = mhp.HEAT_MODERATE;
                mhpVar7.getClass();
                mhp mhpVar8 = (mhp) Map.EL.getOrDefault(mhq.b, ((hbj) this.a.a()).a(hav.k).get(), mhpVar7);
                mhpVar8.getClass();
                return mhpVar8;
            case 4:
                mhp mhpVar9 = mhp.HEAT_SEVERE;
                mhpVar9.getClass();
                mhp mhpVar10 = (mhp) Map.EL.getOrDefault(mhq.b, ((hbj) this.a.a()).a(hav.a).get(), mhpVar9);
                mhpVar10.getClass();
                return mhpVar10;
            case 5:
                mhp mhpVar11 = mhp.HEAT_MODERATE;
                mhpVar11.getClass();
                mhp mhpVar12 = (mhp) Map.EL.getOrDefault(mhq.b, ((hbj) this.a.a()).a(hav.l).get(), mhpVar11);
                mhpVar12.getClass();
                return mhpVar12;
            case 6:
                mhp mhpVar13 = mhp.HEAT_SEVERE;
                mhpVar13.getClass();
                mhp mhpVar14 = (mhp) Map.EL.getOrDefault(mhq.b, ((hbj) this.a.a()).a(hav.b).get(), mhpVar13);
                mhpVar14.getClass();
                return mhpVar14;
            case 7:
                mhp mhpVar15 = mhz.a;
                mhpVar15.getClass();
                mhp mhpVar16 = (mhp) Map.EL.getOrDefault(mhq.b, qpt.bv((hbj) this.a.a()), mhpVar15);
                mhpVar16.getClass();
                return mhpVar16;
            case 8:
                mhp mhpVar17 = mhp.HEAT_MODERATE;
                mhpVar17.getClass();
                mhp mhpVar18 = (mhp) Map.EL.getOrDefault(mhq.b, ((hbj) this.a.a()).a(hav.c).get(), mhpVar17);
                mhpVar18.getClass();
                return mhpVar18;
            case 9:
                mhp mhpVar19 = mhp.HEAT_SEVERE;
                mhpVar19.getClass();
                mhp mhpVar20 = (mhp) Map.EL.getOrDefault(mhq.b, ((hbj) this.a.a()).a(hav.w).get(), mhpVar19);
                mhpVar20.getClass();
                return mhpVar20;
            case 10:
                mhp mhpVar21 = mhz.a;
                mhpVar21.getClass();
                mhp mhpVar22 = (mhp) Map.EL.getOrDefault(mhq.b, qpt.bv((hbj) this.a.a()), mhpVar21);
                mhpVar22.getClass();
                return mhpVar22;
            case 11:
                mhp mhpVar23 = mhp.HEAT_SEVERE;
                mhpVar23.getClass();
                mhp mhpVar24 = (mhp) Map.EL.getOrDefault(mhq.b, ((hbj) this.a.a()).a(hav.t).get(), mhpVar23);
                mhpVar24.getClass();
                return mhpVar24;
            case 12:
                mhp mhpVar25 = mhp.HEAT_SHUTDOWN;
                mhpVar25.getClass();
                mhp mhpVar26 = (mhp) Map.EL.getOrDefault(mhq.b, ((hbj) this.a.a()).a(hav.x).get(), mhpVar25);
                mhpVar26.getClass();
                return mhpVar26;
            case 13:
                mhp mhpVar27 = mhp.HEAT_CRITICAL;
                mhpVar27.getClass();
                mhp mhpVar28 = (mhp) Map.EL.getOrDefault(mhq.b, ((hbj) this.a.a()).a(hav.d).get(), mhpVar27);
                mhpVar28.getClass();
                return mhpVar28;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                mhp mhpVar29 = mhp.HEAT_SEVERE;
                mhpVar29.getClass();
                mhp mhpVar30 = (mhp) Map.EL.getOrDefault(mhq.b, ((hbj) this.a.a()).a(hav.e).get(), mhpVar29);
                mhpVar30.getClass();
                return mhpVar30;
            case 15:
                mhp mhpVar31 = mhp.HEAT_CRITICAL;
                mhpVar31.getClass();
                mhp mhpVar32 = (mhp) Map.EL.getOrDefault(mhq.b, ((hbj) this.a.a()).a(hav.f).get(), mhpVar31);
                mhpVar32.getClass();
                return mhpVar32;
            case 16:
                mhp mhpVar33 = mhp.HEAT_SEVERE;
                mhpVar33.getClass();
                mhp mhpVar34 = (mhp) Map.EL.getOrDefault(mhq.b, ((hbj) this.a.a()).a(hav.s).get(), mhpVar33);
                mhpVar34.getClass();
                return mhpVar34;
            case 17:
                mhp mhpVar35 = mhp.HEAT_SEVERE;
                mhpVar35.getClass();
                mhp mhpVar36 = (mhp) Map.EL.getOrDefault(mhq.b, ((hbj) this.a.a()).a(hav.g).get(), mhpVar35);
                mhpVar36.getClass();
                return mhpVar36;
            case 18:
                mhp mhpVar37 = mhp.HEAT_SEVERE;
                mhpVar37.getClass();
                mhp mhpVar38 = (mhp) Map.EL.getOrDefault(mhq.b, ((hbj) this.a.a()).a(hav.i).get(), mhpVar37);
                mhpVar38.getClass();
                return mhpVar38;
            default:
                mhp mhpVar39 = mhz.a;
                mhpVar39.getClass();
                mhp mhpVar40 = (mhp) Map.EL.getOrDefault(mhq.b, qpt.bv((hbj) this.a.a()), mhpVar39);
                mhpVar40.getClass();
                return mhpVar40;
        }
    }
}
