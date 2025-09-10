package defpackage;

import android.view.View;
import androidx.wear.ambient.AmbientDelegate;
import androidx.wear.ambient.AmbientMode;
import com.android.settingslib.widget.BannerMessagePreferenceGroup;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dlz implements uiq {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ dlz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [bfx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [azr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v10, types: [dnf, java.lang.Object] */
    @Override // defpackage.uiq
    public final Object a(Object obj) {
        float f;
        long j;
        dmy dmyVar;
        dmy dmyVar2;
        dmj dmjVar;
        dmy dmyVar3;
        float f2;
        abr abrVar;
        int i = this.b;
        gpa gpaVar = null;
        String strD = null;
        gow gowVar = null;
        Float fValueOf = Float.valueOf(0.0f);
        switch (i) {
            case 0:
                dmx dmxVar = (dmx) obj;
                Object obj2 = this.a;
                bgj bgjVarA = bay.A();
                uiq uiqVarI = bgjVarA != null ? bgjVarA.i() : null;
                bgj bgjVarB = bay.B(bgjVarA);
                try {
                    int iF = ((dme) obj2).f();
                    for (int i2 = 0; i2 < 2; i2++) {
                        int i3 = iF + i2;
                        AmbientDelegate ambientDelegate = dmxVar.b;
                        long j2 = dmz.a;
                        Object obj3 = ambientDelegate.a;
                        if (obj3 != null) {
                            dmxVar.a.add(new dnd((tdy) obj3, i3, j2, (dne) ambientDelegate.b));
                        }
                    }
                    return ufg.a;
                } finally {
                }
            case 1:
                ?? r0 = this.a;
                btd btdVar = (btd) obj;
                int size = r0.size();
                for (int i4 = 0; i4 < size; i4++) {
                    dlr dlrVar = (dlr) r0.get(i4);
                    bte bteVar = dlrVar.b;
                    if (bteVar != null) {
                        int i5 = dlrVar.f;
                        int iA = i5 + dlrVar.p.a(bteVar.a, (cho.b(dlrVar.c) - dlrVar.g) - i5, dlrVar.i);
                        long j3 = dlrVar.d;
                        Object objA = dlrVar.j.a();
                        long j4 = (j3 & 4294967295L) | (iA << 32);
                        if (objA == null) {
                            btd.y(btdVar, bteVar, j4, null, 6);
                        } else {
                            dml dmlVar = (dml) objA;
                            long jD = chy.d(j4, dmlVar.a());
                            bmz bmzVar = dmlVar.f;
                            if (bmzVar != null) {
                                btdVar.x(bteVar, jD, bmzVar);
                            } else {
                                btd.y(btdVar, bteVar, jD, null, 6);
                            }
                            dmlVar.e = jD;
                        }
                    }
                }
                return ufg.a;
            case 2:
                float f3 = -((Float) obj).floatValue();
                Object obj4 = this.a;
                if ((f3 >= 0.0f || ((dme) obj4).d()) && (f3 <= 0.0f || ((dme) obj4).c())) {
                    dme dmeVar = (dme) obj4;
                    float f4 = dmeVar.b + f3;
                    dmeVar.b = f4;
                    if (Math.abs(f4) > 0.5f) {
                        float f5 = dmeVar.b;
                        dmeVar.j.a();
                        bvm bvmVar = dmeVar.m;
                        if (bvmVar != null) {
                            bvmVar.B();
                        }
                        float f6 = f5 - dmeVar.b;
                        dlq dlqVar = (dlq) dmeVar.a.a();
                        if (dmeVar.g) {
                            dkn dknVar = dmeVar.k;
                            AmbientMode.AmbientController ambientController = dmeVar.n;
                            List list = dlqVar.d;
                            if (!list.isEmpty()) {
                                boolean z = f6 < 0.0f;
                                int i6 = z ? ((dlr) ske.bF(list)).a + 1 : ((dlr) ske.bB(list)).a - 1;
                                if (i6 >= 0 && i6 < dlqVar.e) {
                                    if (i6 != dknVar.a) {
                                        if (dknVar.c != z && (dmyVar3 = dknVar.b) != null) {
                                            dmyVar3.a();
                                        }
                                        dknVar.c = z;
                                        dknVar.a = i6;
                                        Object obj5 = ambientController.a;
                                        bgj bgjVarA2 = bay.A();
                                        uiq uiqVarI2 = bgjVarA2 != null ? bgjVarA2.i() : null;
                                        bgj bgjVarB2 = bay.B(bgjVarA2);
                                        try {
                                            j = 4294967295L;
                                            long j5 = ((dlq) ((dme) obj5).a.a()).g;
                                            bay.E(bgjVarA2, bgjVarB2, uiqVarI2);
                                            AmbientDelegate ambientDelegate2 = ((dme) ambientController.a).o;
                                            Object obj6 = ambientDelegate2.a;
                                            if (obj6 != null) {
                                                tdy tdyVar = (tdy) obj6;
                                                dnd dndVar = new dnd(tdyVar, i6, j5, (dne) ambientDelegate2.b);
                                                tdyVar.b.d(dndVar);
                                                dmjVar = dndVar;
                                            } else {
                                                dmjVar = dmj.a;
                                            }
                                            dknVar.b = dmjVar;
                                        } finally {
                                        }
                                    } else {
                                        j = 4294967295L;
                                    }
                                    if (z) {
                                        dlr dlrVar2 = (dlr) ske.bF(list);
                                        if ((((dlrVar2.d + dlrVar2.o) + dlqVar.f) - ((int) (dlqVar.c() & j))) - dlqVar.j < (-f6) && (dmyVar2 = dknVar.b) != null) {
                                            dmyVar2.b();
                                        }
                                    } else if (dlqVar.i - ((dlr) ske.bB(list)).d < f6 && (dmyVar = dknVar.b) != null) {
                                        dmyVar.b();
                                    }
                                }
                            }
                        }
                    }
                    if (Math.abs(dmeVar.b) > 0.5f) {
                        f3 -= dmeVar.b;
                        dmeVar.b = 0.0f;
                    }
                    f = f3;
                } else {
                    f = 0.0f;
                }
                return Float.valueOf(-f);
            case 3:
                return new dmu(this.a, 1);
            case 4:
                ?? r02 = this.a;
                return Boolean.valueOf(r02 != 0 ? r02.e(obj) : true);
            case 5:
                bxd bxdVar = (bxd) obj;
                bxdVar.getClass();
                AmbientDelegate ambientDelegate3 = ((dni) bxdVar).a;
                uka ukaVar = (uka) this.a;
                List listBn = (List) ukaVar.a;
                if (listBn != null) {
                    listBn.add(ambientDelegate3);
                } else {
                    listBn = ske.bn(ambientDelegate3);
                }
                ukaVar.a = listBn;
                return bxc.b;
            case 6:
                cbw.j((cbn) obj, new ccm((String) this.a));
                return ufg.a;
            case 7:
                blm blmVar = (blm) obj;
                kwp kwpVar = (kwp) this.a;
                blmVar.s(((bbb) kwpVar.b).e());
                blmVar.t(((bbb) kwpVar.b).e());
                return ufg.a;
            case 8:
                return a.y((bte) this.a, (btd) obj);
            case 9:
                blm blmVar2 = (blm) obj;
                bkg bkgVar = (bkg) this.a;
                blmVar2.y(bkgVar.b);
                blmVar2.z(bkgVar.c);
                return ufg.a;
            case 10:
                ((blm) obj).l(((bbb) this.a).e());
                return ufg.a;
            case 11:
                return Boolean.valueOf(((dqj) obj).a == this.a);
            case 12:
                Float f7 = (Float) obj;
                float fFloatValue = f7.floatValue();
                ?? r03 = this.a;
                if (!ujp.d(dqn.a(r03), fFloatValue)) {
                    r03.b(f7);
                }
                return ufg.a;
            case 13:
                Object obj7 = this.a;
                blm blmVar3 = (blm) obj;
                dqs dqsVar = (dqs) obj7;
                float fA = dqsVar.a.a();
                uev uevVar = !dqsVar.a.c() ? new uev(fValueOf, Float.valueOf(1.0f)) : (Float.isNaN(fA) || fA > chp.O(blmVar3, 36.0f)) ? new uev(Float.valueOf(1.0f), fValueOf) : new uev(Float.valueOf(ukc.m(fA / chp.O(blmVar3, 36.0f), 0.0f, 1.0f)), Float.valueOf(1.0f));
                ujx ujxVar = new ujx();
                ujxVar.a = ((Number) uevVar.a).floatValue();
                float fFloatValue2 = ((Number) uevVar.b).floatValue();
                int i7 = ((dqq) dqsVar.b.a()).a;
                if (a.p(i7, 2) || (fFloatValue2 != 0.0f && ujxVar.a <= 0.55f)) {
                    z = false;
                }
                if (z) {
                    ujxVar.a = 0.0f;
                    fFloatValue2 = 1.0f;
                }
                abr abrVar2 = dqsVar.d;
                if (fFloatValue2 == ((Number) abrVar2.c()).floatValue()) {
                    f2 = 0.0f;
                } else if (fFloatValue2 == 0.0f) {
                    f2 = 0.0f;
                    ukc.C(((bij) obj7).C(), null, 0, new crd(dqsVar, (uhb) null, 13), 3);
                } else {
                    f2 = 0.0f;
                    ukc.C(((bij) obj7).C(), null, 0, new dqr(abrVar2, fFloatValue2, (uhb) null, 0), 3);
                }
                float f8 = ujxVar.a;
                abr abrVar3 = dqsVar.c;
                if (f8 == ((Number) abrVar3.c()).floatValue()) {
                    abrVar = abrVar3;
                } else if (!(ujxVar.a == f2 || ((Number) abrVar3.c()).floatValue() == f2 || a.p(((dqq) dqsVar.b.a()).a, 0)) || (z && !a.p(i7, 0))) {
                    ukc.C(((bij) obj7).C(), null, 0, new crq(dqsVar, ujxVar, (uhb) null, 5), 3);
                    abrVar = abrVar3;
                } else {
                    abrVar = abrVar3;
                    ukc.C(((bij) obj7).C(), null, 0, new dqr(abrVar, ujxVar.a, null, 2, null), 3);
                }
                float fX = chp.x(1.0f, 0.5f, ((Number) abrVar.d()).floatValue());
                float fO = chp.O(blmVar3, 24.0f) * ((Number) abrVar.d()).floatValue();
                blmVar3.l(((Number) abrVar2.d()).floatValue() * fX);
                blmVar3.s(fX);
                blmVar3.t(fX);
                blmVar3.z(-fO);
                blmVar3.x(byi.Y(f2));
                return ufg.a;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                cbn cbnVar = (cbn) obj;
                int i8 = dsq.a;
                cbw.d(cbnVar, (String) this.a);
                cbw.g(cbnVar, 5);
                return ufg.a;
            case 15:
                ((View) obj).getClass();
                ((BannerMessagePreferenceGroup) this.a).af();
                return ufg.a;
            case 16:
                fmf fmfVar = (fmf) obj;
                fmfVar.getClass();
                return Boolean.valueOf(a.ao(fmfVar.b, this.a));
            case 17:
                fmf fmfVar2 = (fmf) obj;
                fmfVar2.getClass();
                return Boolean.valueOf(a.ao(fmfVar2.b, this.a));
            case 18:
                ddw ddwVarA = ((ddo) obj).a("SELECT * FROM FatalErrorCounts WHERE cameraId = ?");
                Object obj8 = this.a;
                try {
                    if (obj8 == null) {
                        ddwVarA.f(1);
                    } else {
                        ddwVarA.g(1, (String) obj8);
                    }
                    int iW = cgh.w(ddwVarA, "cameraId");
                    int iW2 = cgh.w(ddwVarA, "failuresBeforeRebootDuringOpen");
                    int iW3 = cgh.w(ddwVarA, "failuresAfterRebootDuringOpen");
                    int iW4 = cgh.w(ddwVarA, "failuresBeforeRebootDuringSession");
                    int iW5 = cgh.w(ddwVarA, "failuresAfterRebootDuringSession");
                    int iW6 = cgh.w(ddwVarA, "lastFatalErrorTimestamp");
                    int iW7 = cgh.w(ddwVarA, "rebootCount");
                    if (ddwVarA.j()) {
                        if (!ddwVarA.i(iW)) {
                            strD = ddwVarA.d(iW);
                        }
                        gow gowVar2 = new gow(strD);
                        gowVar2.b = (int) ddwVarA.b(iW2);
                        gowVar2.c = (int) ddwVarA.b(iW3);
                        gowVar2.d = (int) ddwVarA.b(iW4);
                        gowVar2.e = (int) ddwVarA.b(iW5);
                        gowVar2.f = ddwVarA.b(iW6);
                        gowVar2.g = (int) ddwVarA.b(iW7);
                        gowVar = gowVar2;
                    }
                    return gowVar;
                } finally {
                }
            case 19:
                ddw ddwVarA2 = ((ddo) obj).a("SELECT * FROM HardwareHelpDialogCounts WHERE reason = ?");
                try {
                    ddwVarA2.e(1, ((gpf) this.a).ordinal());
                    int iW8 = cgh.w(ddwVarA2, "reason");
                    int iW9 = cgh.w(ddwVarA2, "impressionsBeforeReboot");
                    int iW10 = cgh.w(ddwVarA2, "impressionsAfterReboot");
                    int iW11 = cgh.w(ddwVarA2, "rebootCount");
                    if (ddwVarA2.j()) {
                        gpaVar = new gpa(gpf.values()[(int) ddwVarA2.b(iW8)]);
                        gpaVar.b = (int) ddwVarA2.b(iW9);
                        gpaVar.c = (int) ddwVarA2.b(iW10);
                        gpaVar.d = (int) ddwVarA2.b(iW11);
                    }
                    return gpaVar;
                } finally {
                }
            default:
                cbn cbnVar2 = (cbn) obj;
                cbnVar2.getClass();
                cbw.d(cbnVar2, (String) this.a);
                return ufg.a;
        }
    }
}
