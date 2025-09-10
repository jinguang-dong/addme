package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fia implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final tzx f;
    private final tzx g;
    private final tzx h;
    private final /* synthetic */ int i;

    public fia(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i) {
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
    public final /* synthetic */ Object a() {
        int i = this.i;
        if (i == 0) {
            fja fjaVar = (fja) this.a.a();
            fib fibVar = (fib) this.b.a();
            return new frf(new jqk((owq) this.c.a(), (our) this.e.a(), fjaVar, (ggg) this.d.a(), fibVar, (hbj) this.h.a(), (rwc) this.f.a(), (pfu) this.g.a(), 1), "AllInStartupTask", 0);
        }
        if (i == 1) {
            return new fby(((pba) this.h).a(), (our) this.d.a(), ((kiu) this.a).a(), (hwt) this.e.a(), (owq) this.c.a(), (owq) this.b.a(), (mdy) this.f.a(), (owf) this.g.a());
        }
        if (i == 2) {
            fja fjaVar2 = (fja) this.b.a();
            tzx tzxVar = this.h;
            return new fig(fjaVar2, ((hzm) this.d).a(), ((hxw) this.a).a(), (iso) tzxVar.a(), (owq) this.c.a(), ((iik) this.g).a(), (owf) this.e.a(), (swb) this.f.a());
        }
        if (i == 3) {
            return new fxd((jod) this.a.a(), (fxe) this.c.a(), (gav) this.h.a(), (jod) this.f.a(), (fyc) this.e.a(), (gkf) this.d.a(), (hkk) this.g.a(), ((frl) this.b).b());
        }
        if (i == 4) {
            tzx tzxVar2 = this.a;
            return new gkq(((ggd) this.d).a(), ((fef) this.g).a(), ((ggb) this.c).a(), (lnt) tzxVar2.a(), (lob) this.f.a(), (nms) this.e.a(), (our) this.h.a(), ((ggi) this.b).a());
        }
        if (i == 5) {
            hbj hbjVar = (hbj) this.d.a();
            Executor executor = (Executor) this.a.a();
            our ourVar = (our) this.c.a();
            ovx ovxVar = (ovx) this.b.a();
            owf owfVar = (owf) this.h.a();
            owf owfVar2 = (owf) this.e.a();
            jwk jwkVar = (jwk) this.g.a();
            owf owfVar3 = (owf) this.f.a();
            hbjVar.getClass();
            executor.getClass();
            ourVar.getClass();
            ovxVar.getClass();
            owfVar.getClass();
            owfVar2.getClass();
            jwkVar.getClass();
            owfVar3.getClass();
            ourVar.d(owfVar.dK(new hdg(ovxVar, 7), executor));
            Set setAW = ske.aW(qpt.cm(CaptureRequest.LENS_FOCUS_DISTANCE, owl.h(owfVar2, new fhy(16))));
            CaptureRequest.Key key = jwkVar.a;
            if (key != null) {
                owf owfVarCm = qpt.cm(key, owb.a(owl.h(owfVar3, new fhy(17))));
                owfVarCm.getClass();
                setAW.add(owfVarCm);
            }
            return setAW;
        }
        hbj hbjVar2 = (hbj) this.a.a();
        pfu pfuVar = (pfu) this.b.a();
        Map map = (Map) this.e.a();
        rwc rwcVar = (rwc) this.h.a();
        rwc rwcVar2 = (rwc) this.g.a();
        rwc rwcVar3 = (rwc) this.f.a();
        rwc rwcVar4 = (rwc) this.c.a();
        lcz lczVar = lcz.RAW_WIDE;
        peo peoVar = (peo) map.get(lczVar);
        lcz lczVar2 = lcz.RAW_WIDE_RM;
        peo peoVar2 = (peo) map.get(lczVar2);
        peo peoVar3 = (peo) map.get(lcz.RAW_TELE);
        if (!hbjVar2.p(hak.w) || peoVar == null || peoVar3 == null) {
            return sfc.a;
        }
        sbr sbrVar = new sbr();
        if (!hbjVar2.p(gzs.ai)) {
            rwcVar3 = rvk.a;
        }
        rwc rwcVar5 = rwcVar3;
        tzz tzzVar = (tzz) this.d;
        rwc rwcVarI = jsv.i(pfuVar, peoVar, peoVar3, rwcVar5, rwcVar, rwcVar4, tzzVar.a());
        if (rwcVarI.h()) {
            sbrVar.f(lczVar, rwcVarI.c());
        }
        rwc rwcVarI2 = jsv.i(pfuVar, peoVar2, peoVar3, rwcVar5, rwcVar2, rwcVar4, tzzVar.a());
        if (rwcVarI2.h()) {
            sbrVar.f(lczVar2, rwcVarI2.c());
        }
        return sbrVar.b();
    }

    public fia(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, byte[] bArr) {
        this.i = i;
        this.h = tzxVar;
        this.d = tzxVar2;
        this.a = tzxVar3;
        this.e = tzxVar4;
        this.c = tzxVar5;
        this.b = tzxVar6;
        this.f = tzxVar7;
        this.g = tzxVar8;
    }

    public fia(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, char[] cArr) {
        this.i = i;
        this.b = tzxVar;
        this.d = tzxVar2;
        this.a = tzxVar3;
        this.h = tzxVar4;
        this.c = tzxVar5;
        this.g = tzxVar6;
        this.e = tzxVar7;
        this.f = tzxVar8;
    }

    public fia(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, float[] fArr) {
        this.i = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.e = tzxVar3;
        this.h = tzxVar4;
        this.g = tzxVar5;
        this.f = tzxVar6;
        this.c = tzxVar7;
        this.d = tzxVar8;
    }

    public fia(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, int[] iArr) {
        this.i = i;
        this.d = tzxVar;
        this.g = tzxVar2;
        this.c = tzxVar3;
        this.a = tzxVar4;
        this.f = tzxVar5;
        this.e = tzxVar6;
        this.h = tzxVar7;
        this.b = tzxVar8;
    }

    public fia(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, short[] sArr) {
        this.i = i;
        this.a = tzxVar;
        this.c = tzxVar2;
        this.h = tzxVar3;
        this.f = tzxVar4;
        this.e = tzxVar5;
        this.d = tzxVar6;
        this.g = tzxVar7;
        this.b = tzxVar8;
    }

    public fia(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, boolean[] zArr) {
        this.i = i;
        this.d = tzxVar;
        this.a = tzxVar2;
        this.c = tzxVar3;
        this.b = tzxVar4;
        this.h = tzxVar5;
        this.e = tzxVar6;
        this.g = tzxVar7;
        this.f = tzxVar8;
    }
}
