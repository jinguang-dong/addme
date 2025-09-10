package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.google.ar.core.R;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mnj implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final tzx f;
    private final /* synthetic */ int g;

    public mnj(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i) {
        this.g = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.g) {
            case 0:
                return new mni((out) this.a.a(), (Activity) this.b.a(), (jgt) this.c.a(), (mdy) this.d.a(), (hbj) this.e.a(), (owf) this.f.a());
            case 1:
                return new mlm((owq) this.f.a(), (owq) this.e.a(), (owq) this.c.a(), (imi) this.b.a(), (krj) this.a.a(), (mdy) this.d.a());
            case 2:
                return new mns((hbj) this.b.a(), (owf) this.c.a(), (jho) this.d.a(), (owf) this.a.a(), (owf) this.f.a(), (owf) this.e.a());
            case 3:
                return new moy((out) this.a.a(), (qrh) this.c.a(), (mwq) this.b.a(), (hie) this.f.a(), (rwc) this.d.a(), (owq) this.e.a());
            case 4:
                tzx tzxVar = this.b;
                return new mue(((imn) this.c).a(), (mua) tzxVar.a(), (luj) this.d.a(), (hbj) this.f.a(), ((mxx) this.a).a(), (owf) this.e.a());
            case 5:
                tzx tzxVar2 = this.d;
                nas nasVar = new nas(((imm) this.f).b(), ((lxh) this.b).b(), (luk) tzxVar2.a(), (imi) this.e.a(), (Executor) this.a.a(), ((ixw) this.c).a());
                nao naoVar = new nao();
                Context context = nasVar.c;
                naoVar.h = context;
                naoVar.e = context.getResources().getString(R.string.af_ae_lock);
                naoVar.a = true;
                naoVar.j = 2;
                nasVar.g = naoVar.a();
                naoVar.e = context.getResources().getString(R.string.update_camera_to_use_lens);
                naoVar.a = false;
                naoVar.j = 8;
                naoVar.a();
                naoVar.e = context.getResources().getString(R.string.thermal_flash_disabled_chip_text);
                naoVar.a = false;
                naoVar.j = 12;
                nasVar.h = naoVar.a();
                naoVar.e = context.getResources().getString(R.string.thermal_ev_controls_limited_chip_text);
                naoVar.a = false;
                naoVar.b = 4000;
                naoVar.j = 12;
                nasVar.i = naoVar.a();
                return nasVar;
            case 6:
                tzx tzxVar3 = this.a;
                Context contextB = ((imm) this.f).b();
                out outVar = (out) tzxVar3.a();
                tzx tzxVar4 = this.d;
                return new nmc(contextB, outVar, ((ixv) this.c).a(), ((ixw) this.b).a(), (imi) tzxVar4.a(), this.e);
            case 7:
                tzx tzxVar5 = this.c;
                tzx tzxVar6 = this.f;
                return new ozy(((ozw) this.b).a(), ((pjq) tzxVar6).a(), (pnp) tzxVar5.a(), (pnq) this.e.a(), ((pba) this.a).a(), (pbn) this.d.a());
            case 8:
                tzx tzxVar7 = this.a;
                tzx tzxVar8 = this.d;
                tzx tzxVar9 = this.e;
                tzx tzxVar10 = this.f;
                return new rcg(this.c, this.b, tzxVar10, tzxVar9, tzxVar8, tzxVar7, null);
            case 9:
                return new rcg((lat) this.c.a(), (pmg) this.e.a(), (rcg) this.a.a(), ((pba) this.f).a(), (pbn) this.d.a());
            case 10:
                return new rqi((ppz) this.e.a(), (qaq) this.b.a(), (qqq) this.f.a(), ((mfx) this.a).a(), (Executor) this.c.a(), (pbn) this.d.a());
            case 11:
                tzx tzxVar11 = this.d;
                tzx tzxVar12 = this.b;
                return new rcg((rcg) tzxVar11.a(), (syx) tzxVar12.a(), (Random) this.a.a(), this.c, this.f, this.e);
            case 12:
                qoz qozVar = (qoz) this.e.a();
                syx syxVar = (syx) this.f.a();
                Executor executor = (Executor) this.b.a();
                tzx tzxVar13 = this.a;
                tzj tzjVarB = tzs.b(this.c);
                tzs.b(tzxVar13);
                return new qtp(qozVar, syxVar, executor, tzjVarB);
            case 13:
                qoz qozVar2 = (qoz) this.e.a();
                tzx tzxVar14 = this.a;
                tzx tzxVar15 = this.c;
                tzx tzxVar16 = this.f;
                return new quk(qozVar2, this.d, this.b, tzxVar16, tzxVar15, tzs.b(tzxVar14));
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                tzx tzxVar17 = this.c;
                qqq qqqVarB = ((qqr) this.f).a();
                tzx tzxVar18 = this.b;
                tzj tzjVarB2 = tzs.b(this.d);
                tzs.b(tzxVar18);
                return new quz(qqqVarB, tzjVarB2, this.a, ((qvm) this.e).a());
            case 15:
                tzx tzxVar19 = this.a;
                tzx tzxVar20 = this.b;
                tzx tzxVar21 = this.f;
                tzx tzxVar22 = this.d;
                return new rcg(this.c, this.e, tzxVar22, tzxVar21, tzxVar20, tzxVar19);
            default:
                Object obj = ((tzu) this.c).a;
                final Context contextB2 = ((imm) this.f).b();
                final Set set = (Set) obj;
                final rwc rwcVar = (rwc) ((tzu) this.d).a;
                Object obj2 = ((tzu) this.e).a;
                final sjp sjpVarA = ((rbd) this.a).a();
                final rwc rwcVar2 = (rwc) obj2;
                final tzx tzxVar23 = this.b;
                return new rbm() { // from class: rbh
                    @Override // defpackage.rbm
                    public final void a() {
                        Set set2 = set;
                        sjp sjpVar = sjpVarA;
                        rwc rwcVar3 = rwcVar2;
                        if (!set2.isEmpty() || sjpVar.a() || ((Boolean) rwcVar3.e(false)).booleanValue()) {
                            uem uemVar = tzxVar23;
                            rwc rwcVar4 = rwcVar;
                            Application application = (Application) contextB2;
                            Application.ActivityLifecycleCallbacks rbiVar = new rbi(application, rwcVar4, set2, sjpVar, rwcVar3, uemVar);
                            if (rwcVar4.h()) {
                                rbiVar = (Application.ActivityLifecycleCallbacks) ((rvu) rwcVar4.c()).apply(rbiVar);
                            }
                            application.registerActivityLifecycleCallbacks(rbiVar);
                        }
                    }
                };
        }
    }

    public mnj(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, byte[] bArr) {
        this.g = i;
        this.f = tzxVar;
        this.e = tzxVar2;
        this.c = tzxVar3;
        this.b = tzxVar4;
        this.a = tzxVar5;
        this.d = tzxVar6;
    }

    public mnj(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, char[] cArr) {
        this.g = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.d = tzxVar3;
        this.a = tzxVar4;
        this.f = tzxVar5;
        this.e = tzxVar6;
    }

    public mnj(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, float[] fArr) {
        this.g = i;
        this.f = tzxVar;
        this.a = tzxVar2;
        this.c = tzxVar3;
        this.b = tzxVar4;
        this.d = tzxVar5;
        this.e = tzxVar6;
    }

    public mnj(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, int[] iArr) {
        this.g = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.d = tzxVar3;
        this.f = tzxVar4;
        this.a = tzxVar5;
        this.e = tzxVar6;
    }

    public mnj(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, short[] sArr) {
        this.g = i;
        this.a = tzxVar;
        this.c = tzxVar2;
        this.b = tzxVar3;
        this.f = tzxVar4;
        this.d = tzxVar5;
        this.e = tzxVar6;
    }

    public mnj(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, boolean[] zArr) {
        this.g = i;
        this.f = tzxVar;
        this.b = tzxVar2;
        this.d = tzxVar3;
        this.e = tzxVar4;
        this.a = tzxVar5;
        this.c = tzxVar6;
    }

    public mnj(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, byte[][] bArr) {
        this.g = i;
        this.b = tzxVar;
        this.f = tzxVar2;
        this.c = tzxVar3;
        this.e = tzxVar4;
        this.a = tzxVar5;
        this.d = tzxVar6;
    }

    public mnj(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, char[][] cArr) {
        this.g = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.f = tzxVar3;
        this.e = tzxVar4;
        this.d = tzxVar5;
        this.a = tzxVar6;
    }

    public mnj(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, float[][] fArr) {
        this.g = i;
        this.e = tzxVar;
        this.f = tzxVar2;
        this.b = tzxVar3;
        this.c = tzxVar4;
        this.a = tzxVar5;
        this.d = tzxVar6;
    }

    public mnj(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, int[][] iArr) {
        this.g = i;
        this.e = tzxVar;
        this.b = tzxVar2;
        this.f = tzxVar3;
        this.a = tzxVar4;
        this.c = tzxVar5;
        this.d = tzxVar6;
    }

    public mnj(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, short[][] sArr) {
        this.g = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.e = tzxVar3;
        this.a = tzxVar4;
        this.f = tzxVar5;
        this.d = tzxVar6;
    }

    public mnj(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, boolean[][] zArr) {
        this.g = i;
        this.d = tzxVar;
        this.b = tzxVar2;
        this.a = tzxVar3;
        this.c = tzxVar4;
        this.f = tzxVar5;
        this.e = tzxVar6;
    }

    public mnj(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, byte[][][] bArr) {
        this.g = i;
        this.e = tzxVar;
        this.d = tzxVar2;
        this.b = tzxVar3;
        this.f = tzxVar4;
        this.c = tzxVar5;
        this.a = tzxVar6;
    }

    public mnj(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, char[][][] cArr) {
        this.g = i;
        this.f = tzxVar;
        this.c = tzxVar2;
        this.d = tzxVar3;
        this.b = tzxVar4;
        this.a = tzxVar5;
        this.e = tzxVar6;
    }

    public mnj(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, int[][][] iArr) {
        this.g = i;
        this.f = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.a = tzxVar5;
        this.e = tzxVar6;
    }

    public mnj(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, int i, short[][][] sArr) {
        this.g = i;
        this.c = tzxVar;
        this.e = tzxVar2;
        this.d = tzxVar3;
        this.f = tzxVar4;
        this.b = tzxVar5;
        this.a = tzxVar6;
    }
}
