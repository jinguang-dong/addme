package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.apps.camera.bottombar.BottomBar;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButtonProgressOverlay;
import java.security.SecureRandom;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgk implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final tzx f;
    private final tzx g;
    private final tzx h;
    private final /* synthetic */ int i;

    public mgk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i) {
        this.i = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
        this.g = tzxVar7;
        this.h = tzxVar8;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() throws PackageManager.NameNotFoundException {
        switch (this.i) {
            case 0:
                tzx tzxVar = this.b;
                return new mgj(((imm) this.a).b(), (owq) tzxVar.a(), (lqc) this.c.a(), ((mgd) this.d).a(), (mdy) this.e.a(), (out) this.f.a(), ((iyb) this.g).a(), (hbj) this.h.a());
            case 1:
                tzx tzxVar2 = this.b;
                tzx tzxVar3 = this.g;
                hbc hbcVarB = hmp.b();
                Context contextB = ((imm) tzxVar3).b();
                Executor executor = (Executor) tzxVar2.a();
                tzx tzxVar4 = this.e;
                PackageInfo packageInfoA = ((nmz) this.d).a();
                return new mdy(jje.a(), contextB, new SecureRandom().nextLong(), TimeZone.getDefault().getID(), Build.DISPLAY, executor, hbcVarB, ActivityManager.isRunningInTestHarness(), this.a, (hgu) tzxVar4.a(), (lat) this.h.a(), packageInfoA.versionName, ((hef) this.f).b().booleanValue(), (hbj) this.c.a());
            case 2:
                pmg pmgVar = (pmg) this.a.a();
                mhq mhqVar = (mhq) this.c.a();
                Executor executor2 = (Executor) this.f.a();
                tzx tzxVar5 = this.b;
                mhp mhpVarB = ((mia) this.d).b();
                Executor executor3 = (Executor) tzxVar5.a();
                Executor executor4 = (Executor) this.g.a();
                return new mls(pmgVar, mhqVar, executor2, mhpVarB, executor3, executor4, (pbn) this.e.a());
            case 3:
                return new moi((Consumer) this.b.a(), (hbw) this.a.a(), ((hoa) this.f).b(), (luj) this.d.a(), (out) this.c.a(), (hbj) this.h.a(), ((ixw) this.g).a(), (mof) this.e.a());
            case 4:
                ngw ngwVarA = ((ngx) this.a).a();
                rwc rwcVarB = ((jaf) this.f).b();
                nks nksVar = (nks) this.e.a();
                out outVar = (out) this.b.a();
                tzx tzxVar6 = this.c;
                tzx tzxVar7 = this.g;
                tzj tzjVarB = tzs.b(tzxVar6);
                ocq ocqVarA = ((mmm) tzxVar7).a();
                pbn pbnVar = (pbn) this.d.a();
                ShutterButton shutterButton = ((BottomBar) ngwVarA.f).n;
                rnt.x(shutterButton);
                gzi gziVar = gzo.a;
                return new ndn(shutterButton, outVar, rwcVarB, (ShutterButtonProgressOverlay) ngwVarA.m, nksVar, tzjVarB, ocqVarA, pbnVar);
            case 5:
                return new mqe((mbj) this.a.a(), (fvu) this.h.a(), (ndj) this.e.a(), (mts) this.c.a(), (mzz) this.d.a(), (krj) this.f.a(), (mwq) this.g.a(), (mmk) this.b.a());
            case 6:
                tzx tzxVar8 = this.d;
                Context contextB2 = ((imm) this.b).b();
                myl mylVar = (myl) tzxVar8.a();
                tzx tzxVar9 = this.e;
                return new myi(contextB2, mylVar, this.a, ((fry) this.c).b(), (pbn) tzxVar9.a(), ((ixv) this.g).a(), (moc) this.h.a(), (out) this.f.a());
            case 7:
                ktx ktxVar = (ktx) this.b.a();
                tzx tzxVar10 = this.e;
                ngw ngwVarA2 = ((ngx) this.a).a();
                pbn pbnVar2 = (pbn) tzxVar10.a();
                owf owfVar = (owf) this.c.a();
                tzx tzxVar11 = this.d;
                fdq fdqVarA = ((ixw) this.g).a();
                return new ngk(ktxVar, (MainActivityLayout) ngwVarA2.c, pbnVar2, (ocq) ((tzu) this.f).a, owfVar, (nmw) tzxVar11.a(), (hbj) this.h.a(), fdqVarA);
            case 8:
                tzx tzxVar12 = this.f;
                tzx tzxVar13 = this.c;
                tzx tzxVar14 = this.e;
                final Context contextB3 = ((imm) this.h).b();
                final rwc rwcVarB2 = ((fkh) tzxVar14).b();
                final tzj tzjVarB2 = tzs.b(tzxVar13);
                final lpd lpdVar = (lpd) tzxVar12.a();
                final luj lujVar = (luj) this.d.a();
                final imi imiVar = (imi) this.b.a();
                tzx tzxVar15 = this.a;
                final fdq fdqVarA2 = ((ixw) this.g).a();
                final owf owfVar2 = (owf) tzxVar15.a();
                return (rwcVarB2.h() && ((owd) rwcVarB2.c()).a()) ? new nkm() { // from class: nlz
                    @Override // defpackage.nkm
                    public final void a() {
                        owq owqVarA = lujVar.a(luf.aY);
                        fdq fdqVar = fdqVarA2;
                        our ourVarJ = fdqVar.j();
                        owf owfVar3 = owfVar2;
                        owf owfVarA = owl.a(owqVarA, owfVar3);
                        lpd lpdVar2 = lpdVar;
                        imi imiVar2 = imiVar;
                        tzj tzjVar = tzjVarB2;
                        Context context = contextB3;
                        rwc rwcVar = rwcVarB2;
                        ourVarJ.d(owfVarA.dK(new kzv(lpdVar2, imiVar2, tzjVar, context, rwcVar, 2), sxo.a));
                        nma nmaVar = new nma(owqVarA, owfVar3, imiVar2, tzjVar, context, rwcVar);
                        lpdVar2.a(nmaVar);
                        fdqVar.j().d(new ktu(lpdVar2, nmaVar, 16, (byte[]) null));
                    }
                } : nkm.r;
            case 9:
                tzx tzxVar16 = this.e;
                tzx tzxVar17 = this.d;
                tzx tzxVar18 = this.c;
                tzx tzxVar19 = this.a;
                tzx tzxVar20 = this.g;
                return new pgx(this.b, this.f, this.h, tzxVar20, tzxVar19, tzxVar18, tzxVar17, tzxVar16);
            case 10:
                tzx tzxVar21 = this.e;
                return new qrh(((pba) this.b).a(), (pbn) tzxVar21.a(), (pqn) this.d.a(), ((phl) this.f).a(), (pnp) this.g.a(), ((pfm) this.a).b(), (pmg) this.c.a());
            default:
                tzx tzxVar22 = this.b;
                pkr pkrVarA = ((pks) this.c).a();
                qrh qrhVar = (qrh) tzxVar22.a();
                our ourVar = (our) this.e.a();
                pnp pnpVar = (pnp) this.g.a();
                tzx tzxVar23 = this.d;
                return new pik(pkrVarA, qrhVar, ourVar, pnpVar, ((pba) this.f).a(), ((pab) this.a).a(), ((pfn) this.h).a(), ((pii) tzxVar23).a());
        }
    }

    public mgk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, byte[] bArr) {
        this.i = i;
        this.a = tzxVar;
        this.g = tzxVar2;
        this.b = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
        this.h = tzxVar6;
        this.f = tzxVar7;
        this.c = tzxVar8;
    }

    public mgk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, char[] cArr) {
        this.i = i;
        this.a = tzxVar;
        this.c = tzxVar2;
        this.f = tzxVar3;
        this.d = tzxVar4;
        this.b = tzxVar5;
        this.g = tzxVar6;
        this.h = tzxVar7;
        this.e = tzxVar8;
    }

    public mgk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, float[] fArr) {
        this.i = i;
        this.b = tzxVar;
        this.d = tzxVar2;
        this.a = tzxVar3;
        this.c = tzxVar4;
        this.e = tzxVar5;
        this.g = tzxVar6;
        this.h = tzxVar7;
        this.f = tzxVar8;
    }

    public mgk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, int[] iArr) {
        this.i = i;
        this.a = tzxVar;
        this.h = tzxVar2;
        this.f = tzxVar3;
        this.e = tzxVar4;
        this.b = tzxVar5;
        this.c = tzxVar6;
        this.g = tzxVar7;
        this.d = tzxVar8;
    }

    public mgk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, short[] sArr) {
        this.i = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.f = tzxVar3;
        this.d = tzxVar4;
        this.c = tzxVar5;
        this.h = tzxVar6;
        this.g = tzxVar7;
        this.e = tzxVar8;
    }

    public mgk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, boolean[] zArr) {
        this.i = i;
        this.a = tzxVar;
        this.h = tzxVar2;
        this.e = tzxVar3;
        this.c = tzxVar4;
        this.d = tzxVar5;
        this.f = tzxVar6;
        this.g = tzxVar7;
        this.b = tzxVar8;
    }

    public mgk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, byte[][] bArr) {
        this.i = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.e = tzxVar3;
        this.f = tzxVar4;
        this.c = tzxVar5;
        this.g = tzxVar6;
        this.d = tzxVar7;
        this.h = tzxVar8;
    }

    public mgk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, char[][] cArr) {
        this.i = i;
        this.h = tzxVar;
        this.e = tzxVar2;
        this.c = tzxVar3;
        this.f = tzxVar4;
        this.d = tzxVar5;
        this.b = tzxVar6;
        this.g = tzxVar7;
        this.a = tzxVar8;
    }

    public mgk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, int[][] iArr) {
        this.i = i;
        this.h = tzxVar;
        this.b = tzxVar2;
        this.e = tzxVar3;
        this.d = tzxVar4;
        this.f = tzxVar5;
        this.g = tzxVar6;
        this.a = tzxVar7;
        this.c = tzxVar8;
    }

    public mgk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, short[][] sArr) {
        this.i = i;
        this.b = tzxVar;
        this.f = tzxVar2;
        this.h = tzxVar3;
        this.g = tzxVar4;
        this.a = tzxVar5;
        this.c = tzxVar6;
        this.d = tzxVar7;
        this.e = tzxVar8;
    }

    public mgk(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, boolean[][] zArr) {
        this.i = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.e = tzxVar3;
        this.g = tzxVar4;
        this.f = tzxVar5;
        this.a = tzxVar6;
        this.h = tzxVar7;
        this.d = tzxVar8;
    }
}
