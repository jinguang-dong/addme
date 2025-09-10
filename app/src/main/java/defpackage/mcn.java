package defpackage;

import com.google.ar.core.R;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mcn extends kro {
    public final krs a;
    public final mck b;
    public final luj c;
    private final owf d;
    private final boolean e;
    private final boolean f;
    private final owq g;
    private final luw h;
    private final glu i;
    private final Executor j;
    private final AtomicBoolean k = new AtomicBoolean(false);
    private final owf l;
    private final hbj m;
    private final mwq n;

    public mcn(hbj hbjVar, owf owfVar, mck mckVar, boolean z, boolean z2, lup lupVar, ltv ltvVar, luj lujVar, luw luwVar, glu gluVar, Executor executor, mwq mwqVar, owf owfVar2) {
        this.m = hbjVar;
        this.d = owfVar;
        this.b = mckVar;
        this.e = z;
        this.f = z2;
        this.c = lujVar;
        this.h = luwVar;
        this.i = gluVar;
        this.j = executor;
        this.n = mwqVar;
        this.l = owfVar2;
        this.a = z2 ? krs.COCKTAIL_PARTY_BACK : krs.COCKTAIL_PARTY_FRONT;
        this.g = new krp(lupVar, ltvVar, ltv.ON, ksa.COCKTAIL_PARTY_ON, ltv.OFF, ksa.COCKTAIL_PARTY_OFF);
    }

    @Override // defpackage.krz
    public final int a() {
        return R.string.speech_enhance_content_desc;
    }

    @Override // defpackage.kro
    protected final int b(ksa ksaVar) {
        int iOrdinal = ksaVar.ordinal();
        if (iOrdinal == 48) {
            return R.string.speech_enhance_on_desc;
        }
        if (iOrdinal != 49) {
            return 0;
        }
        return R.string.speech_enhance_off_desc;
    }

    @Override // defpackage.kro
    public final int d(ksa ksaVar) {
        int iOrdinal = ksaVar.ordinal();
        if (iOrdinal == 48) {
            return R.drawable.gm_filled_record_voice_over_white_24;
        }
        if (iOrdinal != 49) {
            return 0;
        }
        return R.drawable.gm_filled_voice_over_off_white_24;
    }

    @Override // defpackage.kro, defpackage.krz
    public final kry dZ() {
        if (((nkw) this.d.dL()).equals(nkw.VIDEO)) {
            gzi gziVar = gym.a;
        }
        return kry.DEFAULT;
    }

    @Override // defpackage.krz
    public final int e() {
        return R.string.speech_enhance_label;
    }

    @Override // defpackage.kro, defpackage.krz
    public final int eI() {
        return R.string.options_menu_disabled;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // defpackage.kro, defpackage.krz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ed(defpackage.kqy r9, boolean r10) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            if (r10 == 0) goto L14
            owq r10 = r8.g
            ksa r2 = defpackage.ksa.COCKTAIL_PARTY_ON
            java.lang.Object r10 = r10.dL()
            boolean r10 = r2.equals(r10)
            if (r10 == 0) goto L14
            r3 = r0
            goto L15
        L14:
            r3 = r1
        L15:
            boolean r8 = r8.f
            if (r8 == 0) goto L1c
            krs r10 = defpackage.krs.COCKTAIL_PARTY_BACK
            goto L1e
        L1c:
            krs r10 = defpackage.krs.COCKTAIL_PARTY_FRONT
        L1e:
            r7 = r10
            if (r0 == r8) goto L24
            java.lang.String r8 = "SpeechEnhanceFront"
            goto L26
        L24:
            java.lang.String r8 = "SpeechEnhanceBack"
        L26:
            r6 = r8
            r4 = 2131231370(0x7f08028a, float:1.807882E38)
            r5 = 2132018951(0x7f140707, float:1.9676223E38)
            r2 = r9
            r2.g(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mcn.ed(kqy, boolean):void");
    }

    @Override // defpackage.kro
    protected final int f(ksa ksaVar) {
        int iOrdinal = ksaVar.ordinal();
        if (iOrdinal == 48) {
            return R.string.speech_enhance_on;
        }
        if (iOrdinal != 49) {
            return 0;
        }
        return R.string.speech_enhance_off;
    }

    @Override // defpackage.krz
    public final krs h() {
        return this.a;
    }

    @Override // defpackage.kro, defpackage.krz
    public final ksd i() {
        return new gmf(this, 5);
    }

    @Override // defpackage.krz
    public final owq j() {
        return this.g;
    }

    @Override // defpackage.krz
    public final sbp l() {
        return sbp.m(ksa.COCKTAIL_PARTY_OFF, ksa.COCKTAIL_PARTY_ON);
    }

    @Override // defpackage.krz
    public final void n(krj krjVar) {
        ktd ktdVar = new ktd(this, krjVar, 7);
        sxo sxoVar = sxo.a;
        paq paqVarDK = this.h.dK(ktdVar, sxoVar);
        our ourVar = krjVar.L;
        ourVar.d(paqVarDK);
        glu gluVar = this.i;
        ourVar.d(gluVar.a.dK(new ktd(this, krjVar, 8), sxoVar));
        ourVar.d(gluVar.b.dK(new ktd(this, krjVar, 9), sxoVar));
        ourVar.d(owb.a(gluVar.d).dK(new ktd(this, krjVar, 10), sxoVar));
    }

    @Override // defpackage.kro, defpackage.krz
    public final boolean o(krj krjVar) {
        oxj oxjVar;
        oxh oxhVar;
        glu gluVar = this.i;
        boolean zBooleanValue = ((Boolean) ((ovx) gluVar.d).d).booleanValue();
        lty ltyVar = !zBooleanValue ? lty.RES_1080P : (lty) this.h.dL();
        ksa ksaVar = !zBooleanValue ? ksa.FPS_30 : (ksa) ((ovx) gluVar.a).d;
        mwq mwqVar = this.n;
        boolean zS = krjVar.s();
        boolean zBooleanValue2 = ((Boolean) this.l.dL()).booleanValue();
        nkw nkwVarD = krjVar.d();
        pka pkaVar = zS ? pka.FRONT : pka.BACK;
        int iOrdinal = ltyVar.ordinal();
        if (iOrdinal == 0) {
            oxjVar = oxj.RES_1080P;
        } else if (iOrdinal == 1) {
            oxjVar = oxj.RES_2160P;
        } else {
            if (iOrdinal != 2) {
                throw new RuntimeException(null, null);
            }
            oxjVar = oxj.RES_4320P;
        }
        oxj oxjVar2 = oxjVar;
        switch (ksaVar.ordinal()) {
            case 27:
                oxhVar = oxh.FPS_AUTO;
                break;
            case 28:
                oxhVar = oxh.FPS_24;
                break;
            case 29:
                oxhVar = oxh.FPS_30;
                break;
            case 30:
                oxhVar = oxh.FPS_60;
                break;
            default:
                throw new IllegalArgumentException("Unsupported menu option");
        }
        return mwqVar.c(pkaVar, oxjVar2, oxhVar, zBooleanValue2, nkwVarD);
    }

    @Override // defpackage.krz
    public final boolean p(krj krjVar) {
        boolean z = this.e && (krjVar.d() == nkw.VIDEO || krjVar.d() == nkw.VIDEO_NIGHT_SIGHT) && (krjVar.s() ^ this.f) && !((Boolean) ((ovx) this.i.b).d).booleanValue();
        if (!z || !this.k.compareAndSet(false, true) || ((Boolean) this.c.b(luf.Z)).booleanValue()) {
            return z;
        }
        owq owqVar = this.g;
        krjVar.L.d(owqVar.dK(new ktd(this, (ksa) owqVar.dL(), 6), this.j));
        return true;
    }
}
