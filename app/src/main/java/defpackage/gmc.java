package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import com.google.android.apps.camera.backup.cNHl.ibINv;
import com.google.ar.core.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gmc extends kro {
    private static final sgv g = sgv.g("gmc");
    public final lti a;
    public final Activity b;
    public boolean c;
    public nan d;
    public final imi e;
    public final ocq f;
    private final owq h;
    private final owf i;
    private final owf j;
    private final out k;
    private final owf l;
    private final owf m;
    private final owf n;
    private final owf o;
    private int p;
    private krj q;
    private final hbj r;

    public gmc(hbj hbjVar, lti ltiVar, owf owfVar, glu gluVar, imi imiVar, ocq ocqVar, out outVar, Activity activity, owf owfVar2) {
        this.r = hbjVar;
        this.a = ltiVar;
        this.i = owfVar;
        this.j = gluVar.b;
        this.e = imiVar;
        this.f = ocqVar;
        this.k = outVar;
        this.b = activity;
        this.o = owfVar2;
        this.l = ltiVar.b;
        this.m = ltiVar.c;
        this.n = ltiVar.d;
        owq owqVar = ltiVar.a;
        ltu ltuVar = ltu.PHONE;
        this.h = new krp(owqVar, ltuVar, ltuVar, ksa.MIC_INPUT_PHONE, ltu.EXT_WIRED, ksa.MIC_INPUT_EXT_WIRED, ltu.EXT_BLUETOOTH, ksa.MIC_INPUT_EXT_BLUETOOTH);
    }

    @Override // defpackage.krz
    public final int a() {
        return R.string.mic_input_options_desc;
    }

    @Override // defpackage.kro
    public final int d(ksa ksaVar) {
        switch (ksaVar.ordinal()) {
            case 24:
                return R.drawable.quantum_gm_ic_mic_white_24;
            case 25:
                return R.drawable.gm_filled_mic_external_on_white_24;
            case 26:
                return R.drawable.gm_filled_bluetooth_connected_white_24;
            default:
                throw new IllegalArgumentException("Invalid option: ".concat(String.valueOf(String.valueOf(ksaVar))));
        }
    }

    @Override // defpackage.kro, defpackage.krz
    public final kry dZ() {
        if (((nkw) this.o.dL()).equals(nkw.VIDEO)) {
            gzi gziVar = gym.a;
        }
        return kry.DEFAULT;
    }

    @Override // defpackage.krz
    public final int e() {
        return R.string.mic_input_desc;
    }

    @Override // defpackage.kro, defpackage.krz
    public final int eI() {
        return R.string.mic_input_ext_bluetooth_connecting;
    }

    @Override // defpackage.kro, defpackage.krz
    public final void ec(krj krjVar) {
        this.q = krjVar;
        fun funVar = new fun(this, krjVar, 2);
        sxo sxoVar = sxo.a;
        paq paqVarDK = this.l.dK(funVar, sxoVar);
        our ourVar = krjVar.L;
        ourVar.d(paqVarDK);
        ourVar.d(this.m.dK(new fun(this, krjVar, 3), sxoVar));
        ourVar.d(this.n.dK(new fun(this, krjVar, 4), sxoVar));
        ourVar.d(this.j.dK(new fnb(krjVar, 6), sxoVar));
        ourVar.d(this.i.dK(new fun(this, krjVar, 5), sxoVar));
        ourVar.d(this.a.a.dK(new gwm(this, 1), sxoVar));
        ourVar.d(this.o.dK(new gma(), sxoVar));
    }

    @Override // defpackage.kro, defpackage.krz
    public final void ed(kqy kqyVar, boolean z) throws Resources.NotFoundException {
        owq owqVar = this.h;
        owqVar.dL();
        String strD = this.a.d(lth.EXT_BLUETOOTH);
        if (z) {
            if (ksa.MIC_INPUT_EXT_WIRED.equals(owqVar.dL())) {
                kqyVar.l(false, strD);
                kqyVar.g(true, R.drawable.gm_filled_mic_external_on_white_24, R.string.mic_input_ext_wired_acc_desc, "MicInput", null);
                return;
            } else if (ksa.MIC_INPUT_EXT_BLUETOOTH.equals(owqVar.dL())) {
                kqyVar.g(false, R.drawable.gm_filled_mic_external_on_white_24, R.string.mic_input_ext_wired_acc_desc, "MicInput", null);
                kqyVar.l(true, strD);
                return;
            }
        }
        kqyVar.l(false, strD);
        kqyVar.g(false, R.drawable.gm_filled_mic_external_on_white_24, R.string.mic_input_ext_wired_acc_desc, "MicInput", null);
    }

    @Override // defpackage.krz
    public final krs h() {
        return krs.MICROPHONE;
    }

    @Override // defpackage.krz
    public final owq j() {
        return this.h;
    }

    public final void m() {
        if (this.d != null) {
            return;
        }
        out.a();
        nao naoVar = new nao();
        naoVar.h = this.b;
        naoVar.a = false;
        naoVar.b = 5000;
        naoVar.e = "";
        this.d = naoVar.a();
    }

    @Override // defpackage.krz
    public final void n(krj krjVar) {
        krjVar.g(new gmb(this));
    }

    @Override // defpackage.kro, defpackage.krz
    public final boolean o(krj krjVar) {
        return !this.c;
    }

    @Override // defpackage.krz
    public final boolean p(krj krjVar) {
        return (((Boolean) ((ovx) this.l).d).booleanValue() || ((Boolean) ((ovx) this.m).d).booleanValue()) && z(krjVar);
    }

    final void q() {
        nan nanVar = this.d;
        if (nanVar != null) {
            this.e.f(nanVar);
        }
    }

    @Override // defpackage.kro, defpackage.krz
    public final String r(ksa ksaVar, Resources resources) {
        switch (ksaVar.ordinal()) {
            case 24:
                return resources.getString(R.string.mic_input_phone_acc_desc);
            case 25:
                return resources.getString(R.string.mic_input_ext_wired_acc_desc);
            case 26:
                return this.a.d(lth.EXT_BLUETOOTH);
            default:
                throw new IllegalArgumentException("Invalid option: ".concat(String.valueOf(String.valueOf(ksaVar))));
        }
    }

    @Override // defpackage.kro, defpackage.krz
    public final String s(ksa ksaVar, Resources resources) {
        switch (ksaVar.ordinal()) {
            case 24:
                return resources.getString(R.string.mic_input_phone_desc);
            case 25:
                return resources.getString(R.string.mic_input_ext_wired_desc);
            case 26:
                return this.a.d(lth.EXT_BLUETOOTH);
            default:
                throw new IllegalArgumentException("Invalid option: ".concat(String.valueOf(String.valueOf(ksaVar))));
        }
    }

    public final void u(krj krjVar) {
        int i = p(krjVar) ? ((sex) l()).c : 0;
        if (i > this.p) {
            if (((Boolean) this.i.dL()).booleanValue()) {
                Object obj = ((ovx) this.l).d;
                this.a.d(lth.EXT_BLUETOOTH);
            } else {
                ovx ovxVar = (ovx) this.l;
                Object obj2 = ovxVar.d;
                this.a.d(lth.EXT_BLUETOOTH);
                boolean zBooleanValue = ((Boolean) ovxVar.d).booleanValue();
                boolean zBooleanValue2 = ((Boolean) ((ovx) this.m).d).booleanValue();
                synchronized (this) {
                    q();
                    int i2 = 1;
                    if (!zBooleanValue) {
                        if (zBooleanValue2) {
                            zBooleanValue2 = true;
                        }
                    }
                    this.k.c(new glz(this, zBooleanValue, zBooleanValue2, i2));
                }
            }
        }
        this.p = i;
    }

    @Override // defpackage.kro, defpackage.ksb
    public final boolean v(krs krsVar, ksa ksaVar, boolean z) {
        if (!z && Objects.equals(ksaVar, ksa.MIC_INPUT_EXT_BLUETOOTH) && !((Boolean) ((ovx) this.n).d).booleanValue()) {
            this.c = true;
            krj krjVar = this.q;
            krjVar.getClass();
            krjVar.m(false, krs.MICROPHONE);
        }
        return false;
    }

    public final void y(krj krjVar) {
        owf owfVar = this.i;
        if (((Boolean) owfVar.dL()).booleanValue()) {
            return;
        }
        owq owqVar = this.h;
        boolean z = true;
        int i = 0;
        boolean z2 = ksa.MIC_INPUT_EXT_WIRED.equals(owqVar.dL()) && !((Boolean) ((ovx) this.l).d).booleanValue();
        ksa ksaVar = ksa.MIC_INPUT_EXT_BLUETOOTH;
        boolean z3 = ksaVar.equals(owqVar.dL()) && !((Boolean) ((ovx) this.m).d).booleanValue();
        boolean z4 = (!ksaVar.equals(owqVar.dL()) || this.c || ((Boolean) ((ovx) this.n).d).booleanValue()) ? false : true;
        if (!z2 && !z3) {
            if (!z4) {
                return;
            } else {
                z4 = true;
            }
        }
        ((sgt) g.c().M(977)).v("validateMicInputProperty: fallback from %s", owqVar.dL());
        owqVar.a(ksa.MIC_INPUT_PHONE);
        if (z(krjVar)) {
            boolean z5 = z3 || z4;
            if (!((Boolean) owfVar.dL()).booleanValue()) {
                synchronized (this) {
                    q();
                    if (z2) {
                        z = z5;
                    }
                    this.k.c(new glz(this, z2, z, i));
                }
            }
            krjVar.m(false, krs.MICROPHONE);
        }
    }

    public final boolean z(krj krjVar) {
        nkw nkwVarD = krjVar.d();
        if (nkwVarD == nkw.AMBER || nkwVarD == nkw.SLOW_MOTION || nkwVarD == nkw.VIDEO_INTENT || nkwVarD == nkw.VIDEO_NIGHT_SIGHT) {
            return true;
        }
        return nkwVarD == nkw.VIDEO && !((Boolean) ((ovx) this.j).d).booleanValue();
    }

    @Override // defpackage.krz
    public final sbp l() {
        ovx ovxVar = (ovx) this.l;
        if (((Boolean) ovxVar.d).booleanValue() && ((Boolean) ((ovx) this.m).d).booleanValue()) {
            return sbp.n(ksa.MIC_INPUT_PHONE, ksa.MIC_INPUT_EXT_WIRED, ksa.MIC_INPUT_EXT_BLUETOOTH);
        }
        if (((Boolean) ovxVar.d).booleanValue()) {
            return sbp.m(ksa.MIC_INPUT_PHONE, ksa.MIC_INPUT_EXT_WIRED);
        }
        if (((Boolean) ((ovx) this.m).d).booleanValue()) {
            return sbp.m(ksa.MIC_INPUT_PHONE, ksa.MIC_INPUT_EXT_BLUETOOTH);
        }
        ((sgt) g.c().M(960)).s(ibINv.MnqPkAAwzRTqVJx);
        int i = sbp.d;
        return sex.a;
    }
}
