package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.ui.modeswitcher.ModeSwitcher;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nme implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final tzx f;
    private final tzx g;
    private final /* synthetic */ int h;

    public nme(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i) {
        this.h = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
        this.g = tzxVar7;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        Object sfmVar;
        int i = this.h;
        if (i == 0) {
            hbj hbjVar = (hbj) this.a.a();
            final AmbientMode.AmbientController ambientController = (AmbientMode.AmbientController) this.b.a();
            final boolean zBooleanValue = ((hef) this.e).b().booleanValue();
            final boolean zBooleanValue2 = ((hef) this.f).b().booleanValue();
            if (hbjVar.p(gzo.bo)) {
                final tzx tzxVar = this.g;
                final tzx tzxVar2 = this.d;
                final tzx tzxVar3 = this.c;
                sfmVar = new sfm(new mcw() { // from class: nmd
                    @Override // java.lang.Runnable
                    public final void run() throws PackageManager.NameNotFoundException {
                        nmg nmgVar = (nmg) tzxVar3.a();
                        int i2 = true == nmgVar.e ? 12 : 1;
                        lzi lziVarA = lzj.a();
                        lziVarA.a = "InAppUpdate";
                        lziVarA.c(scn.I(nkw.PHOTO, nkw.PORTRAIT, nkw.NIGHT_SIGHT));
                        lziVarA.b(scn.H(pka.BACK, pka.FRONT));
                        lziVarA.d(false);
                        lziVarA.e(false);
                        lziVarA.e = i2;
                        ambientController.b(nmgVar, lziVarA.a());
                        nmi nmiVarA = ((nmj) tzxVar2).a();
                        luj lujVar = nmiVarA.e;
                        lut lutVar = luf.ax;
                        long jLongValue = ((Long) lujVar.b(lutVar)).longValue();
                        long longVersionCode = nmiVarA.c.getLongVersionCode();
                        if (jLongValue != 0) {
                            luj lujVar2 = nmiVarA.f;
                            lujVar2.c(lutVar);
                            lujVar2.c(luf.aB);
                            lujVar2.c(luf.aC);
                            nmiVarA.g.B(5, longVersionCode, jLongValue, 0, 0);
                        }
                        lut lutVar2 = luf.ay;
                        if (longVersionCode != ((Long) lujVar.b(lutVar2)).longValue()) {
                            luj lujVar3 = nmiVarA.f;
                            lujVar3.d(luf.aA, 0);
                            lujVar3.d(lutVar2, Long.valueOf(longVersionCode));
                        }
                        boolean z = zBooleanValue;
                        ((nmm) nmiVarA.a.a()).c = (nmh) nmiVarA.b.a();
                        ins.g(nmiVarA.d, nmiVarA.h, nmiVarA);
                        if (z && zBooleanValue2) {
                            nmc nmcVar = (nmc) tzxVar.a();
                            ins.g(nmcVar.a, nmcVar.e, nmcVar);
                        }
                    }
                });
            } else {
                sfmVar = sfd.a;
            }
            sfmVar.getClass();
            return sfmVar;
        }
        if (i == 1) {
            tzx tzxVar4 = this.d;
            tzx tzxVar5 = this.b;
            fdq fdqVarA = ((ixw) this.g).a();
            Map mapA = ((tzv) tzxVar5).a();
            boolean zBooleanValue3 = ((hef) tzxVar4).b().booleanValue();
            ModeSwitcher modeSwitcher = (ModeSwitcher) this.e.a();
            return new qqq(fdqVarA, mapA, zBooleanValue3, modeSwitcher);
        }
        if (i == 2) {
            pfr pfrVar = (pfr) this.c.a();
            tzx tzxVar6 = this.e;
            tzx tzxVar7 = this.g;
            pdt pdtVarA = ((pfn) this.a).a();
            pjp pjpVarA = ((pab) tzxVar7).a();
            lat latVar = (lat) tzxVar6.a();
            pmj pmjVar = (pmj) this.d.a();
            return new pfi(pfrVar, pdtVarA, pjpVarA, latVar, pmjVar);
        }
        if (i == 3) {
            pmv pmvVar = (pmv) this.d.a();
            our ourVar = (our) this.a.a();
            tzx tzxVar8 = this.c;
            tzx tzxVar9 = this.g;
            return new pgq(pmvVar, ourVar, ((pgp) this.e).a(), this.f, ((pfm) tzxVar9).b(), (pit) tzxVar8.a(), (pbn) this.b.a());
        }
        if (i == 4) {
            qoa qoaVar = (qoa) this.f.a();
            rwc rwcVar = (rwc) ((tzu) this.g).a;
            tzx tzxVar10 = this.c;
            tzx tzxVar11 = this.e;
            return new rcg(qoaVar, rwcVar, this.d, this.b, tzxVar11, tzxVar10);
        }
        if (i != 5) {
            tzx tzxVar12 = this.d;
            tzx tzxVar13 = this.a;
            return new qut(((qqr) this.f).a(), ((imm) tzxVar13).b(), (qoz) tzxVar12.a(), (Executor) this.c.a(), tzs.b(this.g), ((qvk) this.e).a(), this.b);
        }
        tzx tzxVar14 = this.d;
        tzx tzxVar15 = this.g;
        qqq qqqVarB = ((qqr) this.f).a();
        Context contextB = ((imm) tzxVar15).b();
        syx syxVar = (syx) tzxVar14.a();
        tzx tzxVar16 = this.a;
        tzj tzjVarB = tzs.b(this.c);
        return new qrb(qqqVarB, contextB, syxVar, tzjVarB, this.e, this.b);
    }

    public nme(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, byte[] bArr) {
        this.h = i;
        this.g = tzxVar;
        this.b = tzxVar2;
        this.d = tzxVar3;
        this.c = tzxVar4;
        this.e = tzxVar5;
        this.a = tzxVar6;
        this.f = tzxVar7;
    }

    public nme(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, char[] cArr) {
        this.h = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.g = tzxVar3;
        this.e = tzxVar4;
        this.d = tzxVar5;
        this.b = tzxVar6;
        this.f = tzxVar7;
    }

    public nme(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, float[] fArr) {
        this.h = i;
        this.f = tzxVar;
        this.a = tzxVar2;
        this.d = tzxVar3;
        this.c = tzxVar4;
        this.g = tzxVar5;
        this.e = tzxVar6;
        this.b = tzxVar7;
    }

    public nme(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, int[] iArr) {
        this.h = i;
        this.f = tzxVar;
        this.g = tzxVar2;
        this.a = tzxVar3;
        this.d = tzxVar4;
        this.b = tzxVar5;
        this.e = tzxVar6;
        this.c = tzxVar7;
    }

    public nme(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, short[] sArr) {
        this.h = i;
        this.d = tzxVar;
        this.a = tzxVar2;
        this.e = tzxVar3;
        this.f = tzxVar4;
        this.g = tzxVar5;
        this.c = tzxVar6;
        this.b = tzxVar7;
    }

    public nme(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, boolean[] zArr) {
        this.h = i;
        this.f = tzxVar;
        this.g = tzxVar2;
        this.d = tzxVar3;
        this.c = tzxVar4;
        this.e = tzxVar5;
        this.a = tzxVar6;
        this.b = tzxVar7;
    }
}
