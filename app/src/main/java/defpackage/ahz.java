package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import androidx.wear.ambient.AmbientDelegate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ahz implements uiq {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ ahz(Context context, bbo bboVar, bbf bbfVar, azr azrVar, int i) {
        this.e = i;
        this.b = context;
        this.a = bboVar;
        this.c = bbfVar;
        this.d = azrVar;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.Object, und] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r3v3, types: [aim, java.lang.Object] */
    @Override // defpackage.uiq
    public final Object a(Object obj) {
        int i = this.e;
        if (i == 0) {
            abx abxVar = (abx) obj;
            float fFloatValue = ((Number) abxVar.a()).floatValue();
            ujx ujxVar = (ujx) this.a;
            float f = fFloatValue - ujxVar.a;
            if (!e.t(f)) {
                if (!e.t(f - ((aih) this.b).g((rnu) this.d, f))) {
                    abxVar.b();
                    return ufg.a;
                }
                ujxVar.a += f;
            }
            if (((Boolean) this.c.a(Float.valueOf(ujxVar.a))).booleanValue()) {
                abxVar.b();
            }
            return ufg.a;
        }
        if (i == 1) {
            abx abxVar2 = (abx) obj;
            float fFloatValue2 = ((Number) abxVar2.a()).floatValue();
            ujx ujxVar2 = (ujx) this.c;
            float f2 = fFloatValue2 - ujxVar2.a;
            float fA = this.d.a(f2);
            ujxVar2.a = ((Number) abxVar2.a()).floatValue();
            ((ujx) this.a).a = ((Number) abxVar2.g.b.a(abxVar2.d)).floatValue();
            if (Math.abs(f2 - fA) > 0.5f) {
                abxVar2.b();
            }
            ((apg) this.b).a++;
            return ufg.a;
        }
        byte[] bArr = null;
        if (i == 2) {
            tdy tdyVar = new tdy(this.d, this.b, this.a, (byte[]) null);
            Object obj2 = this.c;
            ((AmbientDelegate) obj2).a = tdyVar;
            return new dmu(obj2, 0);
        }
        if (i != 3) {
            bpv bpvVar = (bpv) obj;
            ukc.C(this.a, null, 0, new msv((ujx) this.c, bpvVar, (bqk) this.b, (uhb) null, 0), 3);
            ((bqo) this.d).c(bpvVar.b, bpvVar.c);
            return ufg.a;
        }
        drq drqVar = new drq(new aet(this.a, this.c, 13, bArr), new dlc(this.d, 12));
        boolean z = drqVar.a;
        Object obj3 = this.b;
        if (!z) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_TICK");
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            ((Context) obj3).registerReceiver(drqVar, intentFilter);
            drqVar.a = true;
        }
        return new dna(drqVar, (Context) obj3, 3);
    }

    public /* synthetic */ ahz(AmbientDelegate ambientDelegate, tdy tdyVar, hls hlsVar, dnf dnfVar, int i) {
        this.e = i;
        this.c = ambientDelegate;
        this.d = tdyVar;
        this.b = hlsVar;
        this.a = dnfVar;
    }

    public /* synthetic */ ahz(ujx ujxVar, aih aihVar, rnu rnuVar, uiq uiqVar, int i) {
        this.e = i;
        this.a = ujxVar;
        this.b = aihVar;
        this.d = rnuVar;
        this.c = uiqVar;
    }

    public /* synthetic */ ahz(ujx ujxVar, aim aimVar, ujx ujxVar2, apg apgVar, int i) {
        this.e = i;
        this.c = ujxVar;
        this.d = aimVar;
        this.a = ujxVar2;
        this.b = apgVar;
    }

    public /* synthetic */ ahz(und undVar, bqo bqoVar, ujx ujxVar, bqk bqkVar, int i) {
        this.e = i;
        this.a = undVar;
        this.d = bqoVar;
        this.c = ujxVar;
        this.b = bqkVar;
    }
}
