package defpackage;

import android.media.MediaFormat;
import com.google.android.apps.camera.moments.FastMomentsHdrImpl;
import com.google.ar.core.R;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsp implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final tzx f;
    private final tzx g;
    private final tzx h;
    private final tzx i;
    private final tzx j;
    private final tzx k;
    private final /* synthetic */ int l;

    public gsp(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, int i) {
        this.l = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
        this.g = tzxVar7;
        this.h = tzxVar8;
        this.i = tzxVar9;
        this.j = tzxVar10;
        this.k = tzxVar11;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.l) {
            case 0:
                gqc gqcVar = (gqc) this.a.a();
                pbs pbsVar = (pbs) this.b.a();
                lyu lyuVar = (lyu) this.c.a();
                hbj hbjVar = (hbj) this.d.a();
                return new gso(gqcVar, pbsVar, lyuVar, hbjVar, (cxb) this.f.a(), ((gpz) this.g).a(), (qqq) this.h.a(), (gsz) this.i.a(), ((imm) this.j).b(), (syu) this.k.a());
            case 1:
                ejt ejtVar = (ejt) this.a.a();
                tzx tzxVar = this.h;
                tzx tzxVar2 = this.i;
                Object objA = this.j.a();
                return new ffk(ejtVar, (ffm) objA, ((ffn) tzxVar2).a(), (ezh) tzxVar.a(), ((hoa) this.d).b(), (mdy) this.c.a(), (hbj) this.k.a(), (fqg) this.e.a(), ((pab) this.f).a(), (luj) this.g.a(), (owf) this.b.a());
            case 2:
                return new hgm(hmp.b(), (pas) this.j.a(), (nms) this.g.a(), (hpa) this.d.a(), ((kiv) this.f).a(), (plc) this.i.a(), (hbj) this.k.a(), (fgn) this.h.a(), (pnq) this.a.a(), (pbn) this.b.a(), (sbv) this.e.a(), (owf) this.c.a());
            case 3:
                lgp lgpVar = (lgp) this.d.a();
                return new iel(lgpVar, (Executor) this.a.a(), (ovx) this.e.a(), (pbn) this.b.a(), (tdi) this.i.a(), (UnaryOperator) this.c.a(), this.j, (hbj) this.k.a(), (luj) this.g.a(), ((imm) this.h).b());
            case 4:
                hbj hbjVar2 = (hbj) this.k.a();
                jkl jklVar = (jkl) this.g.a();
                jkd jkdVar = (jkd) this.f.a();
                jkj jkjVar = (jkj) this.j.a();
                sbp sbpVar = (sbp) this.d.a();
                Optional optional = (Optional) this.h.a();
                sbp sbpVar2 = (sbp) this.c.a();
                jju jjuVar = (jju) this.i.a();
                int i = sbp.d;
                sbk sbkVar = new sbk();
                sbkVar.h(jjuVar);
                optional.ifPresent(new gok(sbkVar, 7));
                sbkVar.j(sbpVar2);
                gzi gziVar = gyv.a;
                jjr jjrVarA = jju.a();
                jjrVarA.h(jjt.BRIGHTNESS);
                jjs jjsVar = jjs.DUAL_EXPOSURE;
                jjrVarA.g(jjsVar);
                jjrVarA.i(R.drawable.gs_brightness_7_vd_theme_24);
                jjrVarA.e(R.string.manual_brightness);
                jjrVarA.c(R.id.brightness_controls);
                jjrVarA.d(jkdVar);
                jjr jjrVarA2 = jju.a();
                jjrVarA2.h(jjt.SHADOWS);
                jjrVarA2.g(jjsVar);
                jjrVarA2.i(R.drawable.gs_ev_shadow_fill1_vd_24);
                jjrVarA2.e(R.string.manual_shadows);
                jjrVarA2.c(R.id.shadows_controls);
                jjrVarA2.d(jklVar);
                sbkVar.i(jjrVarA.a(), jjrVarA2.a());
                jjr jjrVarA3 = jju.a();
                jjrVarA3.h(jjt.EXPOSURE);
                jjrVarA3.g(jjs.SINGLE_EXPOSURE);
                jjrVarA3.i(R.drawable.gs_brightness_6_vd_theme_24);
                jjrVarA3.e(R.string.manual_exposure);
                jjrVarA3.c(R.id.exposure_controls);
                jjrVarA3.d(jkjVar);
                sbkVar.h(jjrVarA3.a());
                if (hbjVar2.p(haz.a)) {
                    tzx tzxVar3 = this.b;
                    jjr jjrVarA4 = jju.a();
                    jjrVarA4.h(jjt.WHITEBALANCE);
                    jjrVarA4.g(jjs.WHITEBALANCE);
                    jjrVarA4.i(R.drawable.gs_thermostat_vd_theme_24);
                    jjrVarA4.e(R.string.manual_white_balance);
                    jjrVarA4.c(R.id.whitebalance_controls);
                    jjrVarA4.d((jjv) tzxVar3.a());
                    sbkVar.h(jjrVarA4.a());
                }
                sbkVar.j(sbpVar);
                sbp sbpVarG = sbkVar.g();
                sbpVarG.getClass();
                return sbpVarG;
            case 5:
                return new jkg((qrh) this.e.a(), (jkh) this.f.a(), (lae) this.c.a(), (owq) this.d.a(), (out) this.k.a(), (owf) this.g.a(), (jjw) this.i.a(), ((ixw) this.h).a(), (mdy) this.b.a(), (mwq) this.a.a(), (hbj) this.j.a());
            case 6:
                Executor executor = (Executor) this.f.a();
                pfu pfuVar = (pfu) this.a.a();
                tzx tzxVar4 = this.i;
                kgw kgwVarA = ((kiu) this.h).a();
                mhq mhqVar = (mhq) tzxVar4.a();
                tzx tzxVar5 = this.d;
                return new jmv(executor, pfuVar, kgwVarA, mhqVar, ((mia) this.g).b(), (owq) tzxVar5.a(), ((kiv) this.e).a(), ((kvz) this.k).a(), (AtomicBoolean) this.c.a(), (pbn) this.b.a(), (hbj) this.j.a());
            default:
                return new jys((ree) this.f.a(), (FastMomentsHdrImpl) this.e.a(), ((pba) this.k).a(), (hbj) this.a.a(), ((jzp) this.g).a(), (MediaFormat) this.b.a(), (MediaFormat) this.i.a(), ((Long) this.d.a()).longValue(), (lat) this.j.a(), (rwc) ((tzu) this.h).a, ((gad) this.c).b());
        }
    }

    public gsp(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, int i, byte[] bArr) {
        this.l = i;
        this.a = tzxVar;
        this.j = tzxVar2;
        this.i = tzxVar3;
        this.h = tzxVar4;
        this.d = tzxVar5;
        this.c = tzxVar6;
        this.k = tzxVar7;
        this.e = tzxVar8;
        this.f = tzxVar9;
        this.g = tzxVar10;
        this.b = tzxVar11;
    }

    public gsp(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, int i, char[] cArr) {
        this.l = i;
        this.j = tzxVar;
        this.g = tzxVar2;
        this.d = tzxVar3;
        this.f = tzxVar4;
        this.i = tzxVar5;
        this.k = tzxVar6;
        this.h = tzxVar7;
        this.a = tzxVar8;
        this.b = tzxVar9;
        this.e = tzxVar10;
        this.c = tzxVar11;
    }

    public gsp(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, int i, float[] fArr) {
        this.l = i;
        this.f = tzxVar;
        this.a = tzxVar2;
        this.h = tzxVar3;
        this.i = tzxVar4;
        this.g = tzxVar5;
        this.d = tzxVar6;
        this.e = tzxVar7;
        this.k = tzxVar8;
        this.c = tzxVar9;
        this.b = tzxVar10;
        this.j = tzxVar11;
    }

    public gsp(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, int i, int[] iArr) {
        this.l = i;
        this.k = tzxVar;
        this.b = tzxVar2;
        this.g = tzxVar3;
        this.f = tzxVar4;
        this.j = tzxVar5;
        this.a = tzxVar6;
        this.e = tzxVar7;
        this.d = tzxVar8;
        this.h = tzxVar9;
        this.c = tzxVar10;
        this.i = tzxVar11;
    }

    public gsp(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, int i, short[] sArr) {
        this.l = i;
        this.d = tzxVar;
        this.f = tzxVar2;
        this.a = tzxVar3;
        this.e = tzxVar4;
        this.b = tzxVar5;
        this.i = tzxVar6;
        this.c = tzxVar7;
        this.j = tzxVar8;
        this.k = tzxVar9;
        this.g = tzxVar10;
        this.h = tzxVar11;
    }

    public gsp(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, int i, boolean[] zArr) {
        this.l = i;
        this.e = tzxVar;
        this.f = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.k = tzxVar5;
        this.g = tzxVar6;
        this.i = tzxVar7;
        this.h = tzxVar8;
        this.b = tzxVar9;
        this.a = tzxVar10;
        this.j = tzxVar11;
    }

    public gsp(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, int i, byte[][] bArr) {
        this.l = i;
        this.f = tzxVar;
        this.e = tzxVar2;
        this.k = tzxVar3;
        this.a = tzxVar4;
        this.g = tzxVar5;
        this.b = tzxVar6;
        this.i = tzxVar7;
        this.d = tzxVar8;
        this.j = tzxVar9;
        this.h = tzxVar10;
        this.c = tzxVar11;
    }
}
